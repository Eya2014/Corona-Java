package Services;

import classs.Pays;
import connection.Connexion;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class ServicePays {
    private static DefaultTableModel model = new DefaultTableModel(new Object[][]{}, new String[]{"pays", "total cas", "nvl cas", "total deces", "nvl deces", "total recup", "nvl recup", "total test", "nvl test", "cas actives", "cas critique"});
    public static DefaultTableModel model1 = new DefaultTableModel(new String[]{"pays"}, 0);

    public final ChartPanel total_cas_d_p(String d1,String d2,String ppp) {
        DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
        ChartPanel CP = null;
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
           
            ResultSet rs = st.executeQuery("select total_cas,DATE_UPDATE,nompays from PAYS where DATE_UPDATE between '"+d1+"' and '"+d2+"' and nompays in("+ppp+") order by DATE_UPDATE");
            while (rs.next()) {
                line_chart_dataset.addValue(rs.getInt(1), rs.getString(3), rs.getDate(2));
            }

            JFreeChart lineChartObject = ChartFactory.createLineChart(
                    "Nombre total de cas", "Date",
                    "Cas totaux de coronavirus",
                    line_chart_dataset, PlotOrientation.VERTICAL,
                    true, true, false);
            CP = new ChartPanel(lineChartObject) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };

            return CP;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CP;
    }

    public final ChartPanel nouvels_cas_d_p(String d1,String d2,String ppp) {
        DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
        ChartPanel CP = null;
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select nvl_cas,DATE_UPDATE,nompays from PAYS where DATE_UPDATE between '"+d1+"' and '"+d2+"' and nompays in("+ppp+") order by DATE_UPDATE");
            while (rs.next()) {
                line_chart_dataset.addValue(rs.getInt(1), rs.getString(3), rs.getDate(2));
            }

            JFreeChart lineChartObject = ChartFactory.createLineChart(
                    "Nombre de nouvels cas", "Date",
                    "Cas totaux de coronavirus",
                    line_chart_dataset, PlotOrientation.VERTICAL,
                    true, true, false);
            CP = new ChartPanel(lineChartObject) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };

            return CP;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CP;
    }

    public final ChartPanel total_deces_d_p(String d1,String d2,String ppp) {
        DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
        ChartPanel CP = null;
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select total_deces,DATE_UPDATE,nompays from PAYS where DATE_UPDATE between '"+d1+"' and '"+d2+"' and nompays in("+ppp+") order by DATE_UPDATE");
            while (rs.next()) {
                line_chart_dataset.addValue(rs.getInt(1), rs.getString(3), rs.getDate(2));
            }

            JFreeChart lineChartObject = ChartFactory.createLineChart(
                    "Nombre total de Décès par Date", "Date",
                    "total Décès",
                    line_chart_dataset, PlotOrientation.VERTICAL,
                    true, true, false);
            CP = new ChartPanel(lineChartObject) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };

            return CP;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CP;
    }

    public final ChartPanel nouvel_deces_d_p(String d1,String d2,String ppp) {
        DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
        ChartPanel CP = null;
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select nvl_deces,DATE_UPDATE,nompays from PAYS where DATE_UPDATE between '"+d1+"' and '"+d2+"' and nompays in("+ppp+") order by DATE_UPDATE");
            while (rs.next()) {
                line_chart_dataset.addValue(rs.getInt(1), rs.getString(3), rs.getDate(2));
            }

            JFreeChart lineChartObject = ChartFactory.createLineChart(
                    "Nombre de noveaux Décès par Date", "Date",
                    "noveaux Décès",
                    line_chart_dataset, PlotOrientation.VERTICAL,
                    true, true, false);
            CP = new ChartPanel(lineChartObject) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };

            return CP;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CP;
    }

    public final ChartPanel total_recup_d_p(String d1,String d2,String ppp) {
        DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
        ChartPanel CP = null;
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select total_recupere,DATE_UPDATE,nompays from PAYS where DATE_UPDATE between '"+d1+"' and '"+d2+"' and nompays in("+ppp+") order by DATE_UPDATE");
            while (rs.next()) {
                line_chart_dataset.addValue(rs.getInt(1), rs.getString(3), rs.getDate(2));
            }

            JFreeChart lineChartObject = ChartFactory.createLineChart(
                    "Nombre total de cas recupere", "Date",
                    "total recupere",
                    line_chart_dataset, PlotOrientation.VERTICAL,
                    true, true, false);
            CP = new ChartPanel(lineChartObject) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };

            return CP;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CP;
    }

    public final ChartPanel nouvels_recup_d_p(String d1,String d2,String ppp) {
        DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
        ChartPanel CP = null;
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select nvl_recupere,DATE_UPDATE,nompays from PAYS where DATE_UPDATE between '"+d1+"' and '"+d2+"' and nompays in("+ppp+") order by DATE_UPDATE");
            while (rs.next()) {
                line_chart_dataset.addValue(rs.getInt(1), rs.getString(3), rs.getDate(2));
            }

            JFreeChart lineChartObject = ChartFactory.createLineChart(
                    "Nombre de nouvels cas recupere", "Date",
                    "cas recupere",
                    line_chart_dataset, PlotOrientation.VERTICAL,
                    true, true, false);
            CP = new ChartPanel(lineChartObject) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };

            return CP;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CP;
    }

    public final ChartPanel total_test_d_p(String d1,String d2,String ppp) {
        DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
        ChartPanel CP = null;
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select total_test,DATE_UPDATE,nompays from PAYS where DATE_UPDATE between '"+d1+"' and '"+d2+"' and nompays in("+ppp+") order by DATE_UPDATE");
            while (rs.next()) {
                line_chart_dataset.addValue(rs.getInt(1), rs.getString(3), rs.getDate(2));
            }

            JFreeChart lineChartObject = ChartFactory.createLineChart(
                    "Nombre total test Date", "Date",
                    "total test",
                    line_chart_dataset, PlotOrientation.VERTICAL,
                    true, true, false);
            CP = new ChartPanel(lineChartObject) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };

            return CP;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CP;
    }

    public final ChartPanel nouvel_test_d_p(String d1,String d2,String ppp) {
        DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
        ChartPanel CP = null;
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select nvl_test,DATE_UPDATE,nompays from PAYS where DATE_UPDATE between '"+d1+"' and '"+d2+"' and nompays in("+ppp+") order by DATE_UPDATE");
            while (rs.next()) {
                line_chart_dataset.addValue(rs.getInt(1), rs.getString(3), rs.getDate(2));
            }

            JFreeChart lineChartObject = ChartFactory.createLineChart(
                    "Nombre de noveaux test par Date", "Date",
                    "noveaux test",
                    line_chart_dataset, PlotOrientation.VERTICAL,
                    true, true, false);
            CP = new ChartPanel(lineChartObject) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };

            return CP;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CP;
    }
    
    

    public ChartPanel total_cas_d(String d1,String d2) {
        ChartPanel chartPanel = null;
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select sum(nvl_cas),DATE_UPDATE from PAYS group by DATE_UPDATE having  DATE_UPDATE between '"+d1+"' and '"+d2+"' order by DATE_UPDATE");
            while (rs.next()) {
                dataset.addValue(rs.getInt(1), "Nombre de nouvels cas par date", rs.getDate(2));
            }
            JFreeChart barChart = ChartFactory.createBarChart(
                    "nouvels cas affectées",
                    "",
                    "Nombre de personnes",
                    dataset,
                    PlotOrientation.VERTICAL,
                    true, true, false);

            chartPanel = new ChartPanel(barChart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;

    }

    public ChartPanel nouvels_cas_d(String d1,String d2) {
        ChartPanel chartPanel = null;
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select sum(total_cas),DATE_UPDATE from PAYS group by DATE_UPDATE  having  DATE_UPDATE between '"+d1+"' and '"+d2+"' order by DATE_UPDATE");
            while (rs.next()) {
                dataset.addValue(rs.getInt(1), "Nombre de nouvels cas par date", rs.getDate(2));
            }
            JFreeChart barChart = ChartFactory.createBarChart(
                    "nouvels cas affectées",
                    "",
                    "Nombre de personnes",
                    dataset,
                    PlotOrientation.VERTICAL,
                    true, true, false);

            chartPanel = new ChartPanel(barChart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;

    }

    public ChartPanel total_deces_d(String d1,String d2) {
        ChartPanel chartPanel = null;
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select sum(total_deces),DATE_UPDATE from PAYS group by DATE_UPDATE  having  DATE_UPDATE between '"+d1+"' and '"+d2+"' order by DATE_UPDATE");
            while (rs.next()) {
                dataset.addValue(rs.getInt(1), "décès par date", rs.getDate(2));
            }
            JFreeChart barChart = ChartFactory.createBarChart(
                    "Nombre total de cas Décedes",
                    "",
                    "",
                    dataset,
                    PlotOrientation.VERTICAL,
                    true, true, false);

            chartPanel = new ChartPanel(barChart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;

    }

    public ChartPanel nouvel_deces_d(String d1,String d2) {
        ChartPanel chartPanel = null;
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select sum(nvl_deces),DATE_UPDATE from PAYS group by DATE_UPDATE  having  DATE_UPDATE between '"+d1+"' and '"+d2+"' order by DATE_UPDATE");
            while (rs.next()) {
                dataset.addValue(rs.getInt(1), "décès par date", rs.getDate(2));
            }
            JFreeChart barChart = ChartFactory.createBarChart(
                    "Nombre de nouveaux cas Décedes",
                    "",
                    "",
                    dataset,
                    PlotOrientation.VERTICAL,
                    true, true, false);

            chartPanel = new ChartPanel(barChart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;

    }

    public ChartPanel total_recup_d(String d1,String d2) {
        ChartPanel chartPanel = null;
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select sum(total_recupere),DATE_UPDATE from PAYS group by DATE_UPDATE  having  DATE_UPDATE between '"+d1+"' and '"+d2+"' order by DATE_UPDATE");
            while (rs.next()) {
                dataset.addValue(rs.getInt(1), "Nombre de total cas recupere par date", rs.getDate(2));
            }
            JFreeChart barChart = ChartFactory.createBarChart(
                    "total cas recupere",
                    "",
                    "Nombre de personnes",
                    dataset,
                    PlotOrientation.VERTICAL,
                    true, true, false);

            chartPanel = new ChartPanel(barChart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;

    }

    public ChartPanel nouvels_recup_d(String d1,String d2) {
        ChartPanel chartPanel = null;
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select sum(nvl_recupere),DATE_UPDATE from PAYS group by DATE_UPDATE  having  DATE_UPDATE between '"+d1+"' and '"+d2+"' order by DATE_UPDATE");
            while (rs.next()) {
                dataset.addValue(rs.getInt(1), "Nombre de nouvels cas recupere par date", rs.getDate(2));
            }
            JFreeChart barChart = ChartFactory.createBarChart(
                    "nouvels cas recupere",
                    "",
                    "Nombre de personnes",
                    dataset,
                    PlotOrientation.VERTICAL,
                    true, true, false);

            chartPanel = new ChartPanel(barChart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;

    }

    public ChartPanel total_test_d(String d1,String d2) {
        ChartPanel chartPanel = null;
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select sum(total_test),nompays from PAYS group by nompays");
            while (rs.next()) {
                dataset.addValue(rs.getInt(1), "test par date", rs.getDate(2));
            }
            JFreeChart barChart = ChartFactory.createBarChart(
                    "Nombre total de test effectuées",
                    "",
                    "",
                    dataset,
                    PlotOrientation.VERTICAL,
                    true, true, false);

            chartPanel = new ChartPanel(barChart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;

    }

    public ChartPanel nouvel_test_d(String d1,String d2) {
        ChartPanel chartPanel = null;
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select sum(nvl_test),DATE_UPDATE from PAYS group by DATE_UPDATE  having  DATE_UPDATE between '"+d1+"' and '"+d2+"' order by DATE_UPDATE");
            while (rs.next()) {
                dataset.addValue(rs.getInt(1), "test par date", rs.getDate(2));
            }
            JFreeChart barChart = ChartFactory.createBarChart(
                    "Nombre de nouveaux test effectuées",
                    "",
                    "",
                    dataset,
                    PlotOrientation.VERTICAL,
                    true, true, false);

            chartPanel = new ChartPanel(barChart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;

    }

    
    
    
    
    public ChartPanel total_cas_p(String ppp) {
        ChartPanel chartPanel = null;
        JFreeChart chart = null;
        DefaultPieDataset dataset = new DefaultPieDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select sum(total_cas),nompays from PAYS group by nompays  having nompays in ("+ppp+")");
            while (rs.next()) {
                dataset.setValue(rs.getString(2) + " : " + rs.getInt(1), rs.getInt(1));
            }

            chart = ChartFactory.createPieChart3D(
                    "Répartition des cas par pays", // chart title                   
                    dataset, // data 
                    true, // include legend                   
                    true,
                    false);

            final PiePlot3D plot = (PiePlot3D) chart.getPlot();
            plot.setStartAngle(270);
            plot.setForegroundAlpha(0.60f);
            plot.setInteriorGap(0.02);

            chartPanel = new ChartPanel(chart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;
    }

    public ChartPanel total_deces_p(String ppp) {
        ChartPanel chartPanel = null;
        JFreeChart chart = null;
        DefaultPieDataset dataset = new DefaultPieDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select sum(total_deces),nompays from PAYS group by nompays  having nompays in ("+ppp+")");
            while (rs.next()) {
                dataset.setValue(rs.getString(2) + " : " + rs.getInt(1), rs.getInt(1));
            }

            chart = ChartFactory.createPieChart3D(
                    "Total Déces Répartition par pays", // chart title                   
                    dataset, // data 
                    true, // include legend                   
                    true,
                    false);

            final PiePlot3D plot = (PiePlot3D) chart.getPlot();
            plot.setStartAngle(270);
            plot.setForegroundAlpha(0.60f);
            plot.setInteriorGap(0.02);

            chartPanel = new ChartPanel(chart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;
    }

    public ChartPanel total_recup_p(String ppp) {
        ChartPanel chartPanel = null;
        JFreeChart chart = null;
        DefaultPieDataset dataset = new DefaultPieDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select sum(total_recupere),nompays from PAYS group by nompays  having nompays in ("+ppp+")");
            while (rs.next()) {
                dataset.setValue(rs.getString(2) + " : " + rs.getInt(1), rs.getInt(1));
            }

            chart = ChartFactory.createPieChart3D(
                    "Répartition des cas recupere", // chart title                   
                    dataset, // data 
                    true, // include legend                   
                    true,
                    false);

            final PiePlot3D plot = (PiePlot3D) chart.getPlot();
            plot.setStartAngle(270);
            plot.setForegroundAlpha(0.60f);
            plot.setInteriorGap(0.02);

            chartPanel = new ChartPanel(chart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;
    }

    public ChartPanel total_test_p(String ppp) {
        ChartPanel chartPanel = null;
        JFreeChart chart = null;
        DefaultPieDataset dataset = new DefaultPieDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select sum(total_test),nompays from PAYS group by nompays  having nompays in ("+ppp+")");
            while (rs.next()) {
                dataset.setValue(rs.getString(2) + " : " + rs.getInt(1), rs.getInt(1));
            }

            chart = ChartFactory.createPieChart3D(
                    "Total test par pays", // chart title                   
                    dataset, // data 
                    true, // include legend                   
                    true,
                    false);

            final PiePlot3D plot = (PiePlot3D) chart.getPlot();
            plot.setStartAngle(270);
            plot.setForegroundAlpha(0.60f);
            plot.setInteriorGap(0.02);

            chartPanel = new ChartPanel(chart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;
    }
    
    public ChartPanel nouvels_cas_p(String ppp) {
        ChartPanel chartPanel = null;
        JFreeChart chart = null;
        DefaultPieDataset dataset = new DefaultPieDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select nvl_cas,nompays from PAYS where date_update = (select max(date_update) from PAYS ) and nompays in ("+ppp+")");
            while (rs.next()) {
                dataset.setValue(rs.getString(2) + " : " + rs.getInt(1), rs.getInt(1));
            }

            chart = ChartFactory.createPieChart3D(
                    "Répartition des cas", // chart title                   
                    dataset, // data 
                    true, // include legend                   
                    true,
                    false);

            final PiePlot3D plot = (PiePlot3D) chart.getPlot();
            plot.setStartAngle(270);
            plot.setForegroundAlpha(0.60f);
            plot.setInteriorGap(0.02);

            chartPanel = new ChartPanel(chart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;
    }
  
    public ChartPanel nouvel_deces_p(String ppp) {
        ChartPanel chartPanel = null;
        JFreeChart chart = null;
        DefaultPieDataset dataset = new DefaultPieDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select nvl_deces,nompays from PAYS where date_update = (select max(date_update) from PAYS ) and nompays in ("+ppp+")");
            while (rs.next()) {
                dataset.setValue(rs.getString(2) + " : " + rs.getInt(1), rs.getInt(1));
            }

            chart = ChartFactory.createPieChart3D(
                    "Nouveaux Déces Répartities par pays", // chart title                   
                    dataset, // data 
                    true, // include legend                   
                    true,
                    false);

            final PiePlot3D plot = (PiePlot3D) chart.getPlot();
            plot.setStartAngle(270);
            plot.setForegroundAlpha(0.60f);
            plot.setInteriorGap(0.02);

            chartPanel = new ChartPanel(chart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;
    }

    public ChartPanel nouvels_recup_p(String ppp) {
        ChartPanel chartPanel = null;
        JFreeChart chart = null;
        DefaultPieDataset dataset = new DefaultPieDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select nvl_recupere,nompays from PAYS where date_update = (select max(date_update) from PAYS ) and nompays in ("+ppp+")");
            while (rs.next()) {
                dataset.setValue(rs.getString(2) + " : " + rs.getInt(1), rs.getInt(1));
            }

            chart = ChartFactory.createPieChart3D(
                    "Répartition des cas recupere", // chart title                   
                    dataset, // data 
                    true, // include legend                   
                    true,
                    false);

            final PiePlot3D plot = (PiePlot3D) chart.getPlot();
            plot.setStartAngle(270);
            plot.setForegroundAlpha(0.60f);
            plot.setInteriorGap(0.02);

            chartPanel = new ChartPanel(chart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;
    }

    public ChartPanel nouvel_test_p(String ppp) {
        ChartPanel chartPanel = null;
        JFreeChart chart = null;
        DefaultPieDataset dataset = new DefaultPieDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select nvl_test,nompays from PAYS where date_update = (select max(date_update) from PAYS ) and nompays in ("+ppp+")");
            while (rs.next()) {
                dataset.setValue(rs.getString(2) + " : " + rs.getInt(1), rs.getInt(1));
            }

            chart = ChartFactory.createPieChart3D(
                    "Nouveaux test Réparties par pays", // chart title                   
                    dataset, // data 
                    true, // include legend                   
                    true,
                    false);

            final PiePlot3D plot = (PiePlot3D) chart.getPlot();
            plot.setStartAngle(270);
            plot.setForegroundAlpha(0.60f);
            plot.setInteriorGap(0.02);

            chartPanel = new ChartPanel(chart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;
    }
    
    
    

    private static final long serialVersionUID = 1L;

    public ChartPanel cas_Acrives(String d1,String d2,String ppp) {
        ChartPanel chartPanel = null;
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select total_cas-total_deces-total_recupere,DATE_UPDATE,nompays from PAYS where DATE_UPDATE between '"+d1+"' and '"+d2+"' and nompays in("+ppp+") order by DATE_UPDATE");
            while (rs.next()) {
                if (rs.getInt(1) > 0) {
                    dataset.addValue(rs.getInt(1), rs.getString(3), rs.getDate(2));
                }
            }
            JFreeChart chart = ChartFactory.createAreaChart(
                    "L'evolution des cas Actives dans le monde par date ",
                    "Date",
                    "Nombre de cas Actives",
                    dataset);

            chartPanel = new ChartPanel(chart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;

    }

    public ChartPanel cas_critiques(String ppp) {
        ChartPanel chartPanel = null;
        JFreeChart chart = null;
        DefaultPieDataset dataset = new DefaultPieDataset();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select sum(nvl_critique),nompays from PAYS where nompays in("+ppp+") GROUP BY  nompays");
            while (rs.next()) {
                dataset.setValue(rs.getString(2) + " : " + rs.getInt(1), rs.getInt(1));
            }

            chart = ChartFactory.createPieChart3D(
                    "Cas critiques  par pays", // chart title                   
                    dataset, // data 
                    true, // include legend                   
                    true,
                    false);

            final PiePlot3D plot = (PiePlot3D) chart.getPlot();
            plot.setStartAngle(270);
            plot.setForegroundAlpha(0.60f);
            plot.setInteriorGap(0.02);

            chartPanel = new ChartPanel(chart) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };
            return chartPanel;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chartPanel;
    }

    public DefaultTableModel mon_model() {
        model.getDataVector().clear();

        String[] data = new String[11];
        try { 
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select nompays,total_cas,nvl_cas,total_deces,nvl_deces,total_recupere,nvl_recupere ,total_test,nvl_test,"
                    + "total_cas-total_recupere-total_deces,nvl_critique from PAYS where date_update =(select max(date_update)from pays)");
            while (rs.next()) {
                data[0] = rs.getString(1);
                data[1] = String.valueOf(rs.getInt(2));
                data[2] = String.valueOf(rs.getInt(3));
                data[3] = String.valueOf(rs.getInt(4));
                data[4] = String.valueOf(rs.getInt(5));
                data[5] = String.valueOf(rs.getInt(6));
                data[6] = String.valueOf(rs.getInt(7));
                data[7] = String.valueOf(rs.getInt(8));
                data[8] = String.valueOf(rs.getInt(9));
                if (rs.getInt(10) >= 0) {
                    data[9] = String.valueOf(rs.getInt(10));
                } else {
                    data[9] = String.valueOf(10);
                }
                data[10] = String.valueOf(rs.getInt(11));

                model.addRow(data);
            }
            return model;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model;
    }

    public DefaultTableModel mon_model_triée(String colone, String asc) {
        model.getDataVector().clear();

        String[] data = new String[11];
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select nompays,total_cas,nvl_cas,total_deces,nvl_deces,total_recupere,nvl_recupere ,total_test,nvl_test,\n"
                    + "total_cas-total_recupere-total_deces,nvl_critique from PAYS where date_update =(select max(date_update)from pays) order by " + colone + " " + asc);
            while (rs.next()) {
                data[0] = rs.getString(1);
                data[1] = String.valueOf(rs.getInt(2));
                data[2] = String.valueOf(rs.getInt(3));
                data[3] = String.valueOf(rs.getInt(4));
                data[4] = String.valueOf(rs.getInt(5));
                data[5] = String.valueOf(rs.getInt(6));
                data[6] = String.valueOf(rs.getInt(7));
                data[7] = String.valueOf(rs.getInt(8));
                data[8] = String.valueOf(rs.getInt(9));
                if (rs.getInt(10) >= 0) {
                    data[9] = String.valueOf(rs.getInt(10));
                } else {
                    data[9] = String.valueOf(10);
                }
                data[10] = String.valueOf(rs.getInt(11));

                model.addRow(data);
            }
            return model;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model;

    }

    public String dernier_MA() {
        String dt = "";
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select max(date_update)from pays");
            while (rs.next()) {
                dt = String.valueOf(rs.getDate(1));
            }
            return dt;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dt;
    }

    public DefaultTableModel lstpays(String pay) {

        Object[] data = new Object[1];
       
                data[0] = pay;
              
                model1.addRow(data);

        return model1;
    }

    public List<String> lstpayscombo() {

        model1.getDataVector().clear();
        List<String> list = new ArrayList<String>();
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select distinct nompays from pays order by nompays asc");
            while (rs.next()) {
                list.add(rs.getString(1));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ChartPanel pays(String ppp) {
        DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
        ChartPanel CP = null;
        try {
            Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
           
            ResultSet rs = st.executeQuery("select total_cas,total_deces,total_recupere,nompays,date_update from pays where nompays = '"+ppp+"' order by date_update");
            while (rs.next()) {
                line_chart_dataset.addValue(rs.getInt(1), "total_cas" , rs.getDate(5));
                line_chart_dataset.addValue(rs.getInt(2), "total_deces", rs.getDate(5));
                line_chart_dataset.addValue(rs.getInt(3), "total_recupere", rs.getDate(5));
            }
            Connexion con1 = new Connexion();
            Statement st1 = con1.getCn().createStatement();
            ResultSet rs1 = st1.executeQuery("select total_cas,total_deces,total_recupere,nompays,date_update from pays where nompays = '"+ppp+"' order by date_update");
rs1.next();
            JFreeChart lineChartObject = ChartFactory.createLineChart(
                    "Les courbes dans : "+rs1.getString(4), "Date",
                    "Cas totaux de coronavirus",
                    line_chart_dataset, PlotOrientation.VERTICAL,
                    true, true, false);
            CP = new ChartPanel(lineChartObject) {
                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(1020, 410);
                }
            };

            return CP;
        } catch (SQLException ex) {
            Logger.getLogger(ServicePays.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CP;
    }
    
        Connexion con = new Connexion();
        
    public boolean create (Pays P) throws ParseException {  
         
        try{
             String s=P.getDateU();
             System.out.println(s);
             DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
             //Date date =df.parse(s);
            
             //(NOMPAYS,ID_PAYS,DATE_UPDATE,TOTAL_CAS,NVL_CAS,TOTAL_DECES,NVL_DECES,TOTAL_RECUPERE,NVL_RECUPERE,TOTAL_TEST,NVL_TEST,NVL_CRITIQUE,NOM_GOUVERNORAT)
             String req ="insert into Pays"
                     +" values('"
                     +P.getNomP()+"',PAYS_SEQ.nextval,'"
                     +P.getDateU()+"',"
                     +P.getTcas()+","
                     +P.getNvcas()+","
                     +P.getTdeces()+","
                     +P.getNvdeces()+","
                     +P.getTrecup()+","
                     +P.getNvrecup()+","
                     +P.getTtest()+","
                     +P.getNvtest()+","
                     +P.getNvcritique()+",'"
                     +P.getContinent()+"')"
                     ;
              System.err.println(req);
             Statement st= con.getCn().createStatement();
           if (st.executeUpdate(req) == 1) {
                return true;
                
            }
        } catch (SQLException ex) {
           
            System.out.println("Erreur SQL  "+ex);
        }
        return false ;
    }
    
    public boolean updateP (Pays p) {
     try{
             
             //(NOMPAYS,ID_PAYS,DATE_UPDATE,TOTAL_CAS,NVL_CAS,TOTAL_DECES,NVL_DECES,TOTAL_RECUPERE,NVL_RECUPERE,TOTAL_TEST,NVL_TEST,NVL_CRITIQUE,NOM_GOUVERNORAT)
             String req ="update Pays set TOTAL_CAS="+p.getTcas()
                     +",NVL_CAS="+p.getNvcas()
                     +",TOTAL_DECES="+p.getTdeces()
                     +",NVL_DECES="+p.getNvdeces()
                     +",TOTAL_RECUPERE="+p.getTrecup()+""
                     + ",NVL_RECUPERE="+p.getNvrecup()
                     +",TOTAL_TEST="+p.getTtest()
                     +",NVL_TEST="+p.getNvtest()
                     +",NVL_CRITIQUE="+p.getNvcritique()
                   
                     +"where ID_PAYS= "+p.getIdP()+" And NOMPAYS='"+p.getNomP()+"' And DATE_UPDATE='"+p.getDateU()+"'";
              
             Statement st= con.getCn().createStatement();
           if (st.executeUpdate(req) == 1) {
                return true;
                
            }
        } catch (SQLException ex) {
           
            System.out.println("Erreur SQL  "+ex);
        }
        return false ;
    }
    
    public boolean delete(int id , String nom ,String date) {
        try {
            String req = "delete from PAYS where ID_PAYS=" +id +" And NOMPAYS= '"+nom +"' And DATE_UPDATE = '"+date+"'";
               System.err.println(req);
            Statement st = Connexion. getCn().createStatement();
            if (st.executeUpdate(req) == 1) {
                return true;
                
            }
       } catch (SQLException ex) {
            System.out.println("Erreur SQL  "+ex);
        }
        return false;
    }
     
    public Pays findById(int id, String nom, String date) {
        try {
            String req = "select * from Pays where ID_Pays=" +id +" And NOMPAYS= '"+nom +"' And DATE_UPDATE = '"+date+"'";

            Statement st = Connexion. getCn().createStatement();
           DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            ResultSet rs = st.executeQuery(req);
            if (rs.next()) {
                return new Pays(
                		rs.getString("NOMPAYS"), 
                		rs.getInt("ID_PAYS"), 
                		(String)df.format(rs.getDate("DATE_UPDATE")),
                		rs.getInt("TOTAL_CAS"),
                                rs.getInt("NVL_CAS"),
                		rs.getInt("TOTAL_DECES"),
                                rs.getInt("NVL_DECES"),
                                rs.getInt("TOTAL_RECUPERE"),
                                rs.getInt("NVL_RECUPERE"),
                                rs.getInt("TOTAL_TEST"),
                                rs.getInt("NVL_TEST"),
                                rs.getInt("NVL_CRITIQUE"),
                                rs.getString("CONTINENT")
                               
                );
            }
            else 
            	return null;
        } catch (SQLException ex) {
            System.out.println("Erreur SQL"+ex);
        }
        return null;
    }
    
    public ArrayList<Pays> findAll() {
            ArrayList<Pays> electeurs = new ArrayList<>();
       
        
        try {
            String req = "select * from PAYS";
            Statement st = Connexion. getCn().createStatement();
            ResultSet rs = st.executeQuery(req);
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            while (rs.next()) {
                electeurs.add(new Pays(
                		rs.getString("NOMPAYS"), 
                		rs.getInt("ID_PAYS"), 
                		(String)df.format(rs.getDate("DATE_UPDATE")),
                		rs.getInt("TOTAL_CAS"),
                                rs.getInt("NVL_CAS"),
                		rs.getInt("TOTAL_DECES"),
                                rs.getInt("NVL_DECES"),
                                rs.getInt("TOTAL_RECUPERE"),
                                rs.getInt("NVL_RECUPERE"),
                                rs.getInt("TOTAL_TEST"),
                                rs.getInt("NVL_TEST"),
                                rs.getInt("NVL_CRITIQUE"),
                                 rs.getString("CONTINENT")
                                
                		));
            }
            //df.format(rs.getDate
 
        } catch (SQLException ex) {
            System.out.println("Erreur SQL"+ex);
        }
        return electeurs;
    }
    
    public Pays findAllDay(String nom) {
            Pays Day=null ;
       
        
        try {
            String req = "select * from Pays where( (NOMPAYS,DATE_UPDATE)in( select NOMPAYS,max(DATE_UPDATE) from PAYS group by nompays))and NOMPAYS='"+nom+"'";
            Statement st = Connexion. getCn().createStatement();
            ResultSet rs = st.executeQuery(req);
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            if (rs.next()) {
                Day=(new Pays(
                		rs.getString("NOMPAYS"), 
                		rs.getInt("ID_PAYS"), 
                		(String)df.format(rs.getDate("DATE_UPDATE")),
                		rs.getInt("TOTAL_CAS"),
                                rs.getInt("NVL_CAS"),
                		rs.getInt("TOTAL_DECES"),
                                rs.getInt("NVL_DECES"),
                                rs.getInt("TOTAL_RECUPERE"),
                                rs.getInt("NVL_RECUPERE"),
                                rs.getInt("TOTAL_TEST"),
                                rs.getInt("NVL_TEST"),
                                rs.getInt("NVL_CRITIQUE"),
                                rs.getString("CONTINENT")
                                
                		));
            }
            else{
            Day=new Pays(nom,0,"",0,0,0,0,0,0,0,0,0,"");
            }
            //df.format(rs.getDate
 
        } catch (SQLException ex) {
            System.out.println("Erreur SQL"+ex);
        }
        return Day;
    }
}

