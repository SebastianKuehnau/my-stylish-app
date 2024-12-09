package com.example.application.views.example;

import com.example.application.components.StylishComponent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("Playground View to try out things")
@Menu(order = 2, icon = LineAwesomeIconUrl.BASEBALL_BALL_SOLID)
@Route("playground")
public class PlaygroundView extends VerticalLayout {

    public PlaygroundView() {

        var stylishComp = new StylishComponent();
        add(stylishComp);

        var button = new Button("Example Button");
        button.addClassNames("blue-button");
        add(button);
    }
}

