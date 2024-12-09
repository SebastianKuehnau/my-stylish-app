package com.example.application.components;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.theme.lumo.LumoUtility;

@CssImport("./styles/stylish-component.css")
public class StylishComponent extends Composite<Div> {

    public StylishComponent() {
        addClassName("stylish-component");

        Span label = new Span("My External Component");
        label.addClassNames(
                LumoUtility.TextColor.TERTIARY,
                LumoUtility.FontWeight.EXTRABOLD,
                LumoUtility.FontSize.SMALL);

        var textField = new TextField("Name:");
        var button = new Button("say hello");

        HorizontalLayout formLayout = new HorizontalLayout(textField, button);
        formLayout.setAlignItems(FlexComponent.Alignment.BASELINE);

        var rootLayout = new VerticalLayout(label, formLayout);
        rootLayout.setAlignItems(FlexComponent.Alignment.CENTER);
        rootLayout.setSpacing(false);

        getContent().add(rootLayout);
    }
}