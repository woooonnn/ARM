var chart;
            var chartData = [
                {
                    "score": 5,
                    "total": 10000,              
                },
                {
                    "score": 4,
                    "total": 5000,
                  
                },
                {
                    "score": 3,
                    "total": 2000,
                   
                },
                {
                    "score": 2,
                    "total": 500,
                   
                },
                {
                    "score": 1,
                    "total": 100,                
                }
            ];
            AmCharts.ready(function () {
                // SERIAL CHART
                chart = new AmCharts.AmSerialChart();
                chart.dataProvider = chartData;
                chart.categoryField = "score";
                chart.startDuration = 1;
                chart.plotAreaBorderColor = "#DADADA";
                chart.plotAreaBorderAlpha = 1;
                // this single line makes the chart a bar chart
                chart.rotate = true;

                // AXES
                // Category
                var categoryAxis = chart.categoryAxis;
                categoryAxis.gridPosition = "start";
                categoryAxis.gridAlpha = 0.1;
                categoryAxis.axisAlpha = 0;

                // Value
                var valueAxis = new AmCharts.ValueAxis();
                valueAxis.axisAlpha = 0;
                valueAxis.gridAlpha = 0.1;
                valueAxis.position = "top";
                chart.addValueAxis(valueAxis);

                // GRAPHS
                // first graph
                var graph1 = new AmCharts.AmGraph();
                graph1.type = "column";
                graph1.title = "Total";
                graph1.valueField = "total";
                graph1.balloonText = "Total:[[value]]";
                graph1.lineAlpha = 0;
                graph1.fillColors = "#ADD981";
                graph1.fillAlphas = 1;
                chart.addGraph(graph1);
                chart.creditsPosition = "top-right";
                chart.write("todayscore");
});