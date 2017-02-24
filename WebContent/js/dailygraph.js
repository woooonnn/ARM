            var dailychart;
            var dailyData = [
                {
                    "year": "2017.1.1",
                    "1": 100,
                    "2": 120,
                    "3": 152,
                    "4": 657,
                    "5": 1200,
                },
                {
                    "year": "2017.1.2",
                    "1": 57,
                    "2": 681,
                    "3": 785,
                    "4": 1111,
                    "5": 2000,
                },
                {
                    "year": "2017.1.3",
                    "1": 101,
                    "2": 2152,
                    "3": 1256,
                    "4": 5475,
                    "5": 1000,
                },
                {
                    "year": "2017.1.4",
                    "1": 1527,
                    "2": 1574,
                    "3": 1001,
                    "4": 2325,
                    "5": 1575,
                }
            ];

            AmCharts.ready(function () {
                // SERIAL CHART
                dailychart = new AmCharts.AmSerialChart();
                dailychart.dataProvider = dailyData;
                dailychart.categoryField = "year";
                dailychart.plotAreaBorderAlpha = 0.2;

                // AXES
                // category
                var categoryAxis = chart.categoryAxis;
                categoryAxis.gridAlpha = 0.1;
                categoryAxis.axisAlpha = 0;
                categoryAxis.gridPosition = "start";

                // value
                var valueAxis = new AmCharts.ValueAxis();
                valueAxis.stackType = "regular";
                valueAxis.gridAlpha = 0.1;
                valueAxis.axisAlpha = 0;
                dailychart.addValueAxis(valueAxis);

                // GRAPHS
                // first graph
                var graph = new AmCharts.AmGraph();
                graph.title = "1";
                graph.labelText = "[[value]]";
                graph.valueField = "1";
                graph.type = "column";
                graph.lineAlpha = 0;
                graph.fillAlphas = 1;
                graph.lineColor = "#C72C95";
                graph.balloonText = "<span style='color:#555555;'>[[category]]</span><br><span style='font-size:14px'>[[title]]:<b>[[value]]</b></span>";
                dailychart.addGraph(graph);

                // second graph
                graph = new AmCharts.AmGraph();
                graph.title = "2";
                graph.labelText = "[[value]]";
                graph.valueField = "2";
                graph.type = "column";
                graph.lineAlpha = 0;
                graph.fillAlphas = 1;
                graph.lineColor = "#D8E0BD";
                graph.balloonText = "<span style='color:#555555;'>[[category]]</span><br><span style='font-size:14px'>[[title]]:<b>[[value]]</b></span>";
                dailychart.addGraph(graph);

                // third graph
                graph = new AmCharts.AmGraph();
                graph.title = "3";
                graph.labelText = "[[value]]";
                graph.valueField = "3";
                graph.type = "column";
                graph.lineAlpha = 0;
                graph.fillAlphas = 1;
                graph.lineColor = "#B3DBD4";
                graph.balloonText = "<span style='color:#555555;'>[[category]]</span><br><span style='font-size:14px'>[[title]]:<b>[[value]]</b></span>";
                dailychart.addGraph(graph);

                // fourth graph
                graph = new AmCharts.AmGraph();
                graph.title = "4";
                graph.labelText = "[[value]]";
                graph.valueField = "4";
                graph.type = "column";
                graph.lineAlpha = 0;
                graph.fillAlphas = 1;
                graph.lineColor = "#69A55C";
                graph.balloonText = "<span style='color:#555555;'>[[category]]</span><br><span style='font-size:14px'>[[title]]:<b>[[value]]</b></span>";
                dailychart.addGraph(graph);

                // fifth graph
                graph = new AmCharts.AmGraph();
                graph.title = "5";
                graph.labelText = "[[value]]";
                graph.valueField = "5";
                graph.type = "column";
                graph.lineAlpha = 0;
                graph.fillAlphas = 1;
                graph.lineColor = "#B5B8D3";
                graph.balloonText = "<span style='color:#555555;'>[[category]]</span><br><span style='font-size:14px'>[[title]]:<b>[[value]]</b></span>";
                dailychart.addGraph(graph);
                
                var legend = new AmCharts.AmLegend();
                legend.borderAlpha = 0.2;
                legend.horizontalGap = 10;
                dailychart.addLegend(legend);
                // WRITE
                dailychart.write("dailyscore");
            });


