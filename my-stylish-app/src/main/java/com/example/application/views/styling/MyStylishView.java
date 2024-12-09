package com.example.application.views.styling;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@Menu(order = 1, icon = LineAwesomeIconUrl.BRUSH_SOLID)
@PageTitle("Styling in Vaadin")
@Route("styling")
@RouteAlias("")
public class MyStylishView extends VerticalLayout {

    public MyStylishView() {
        var blackButton = new Button("black");
        blackButton.addThemeVariants(ButtonVariant.LUMO_CONTRAST,
                ButtonVariant.LUMO_PRIMARY);
        add(blackButton);

        var redButton = new Button("red");
        redButton.addClassNames(
                LumoUtility.Background.ERROR,
                LumoUtility.TextColor.PRIMARY_CONTRAST);
        add(redButton);

        var orangeButton = new Button("orange");
        orangeButton.addClassNames("orange-button");
        add(orangeButton);

        var blueButton = new Button("blue");
        blueButton.addClassNames("blue-button");
        add(blueButton);

        var purpleButton = new Button("purple");
        purpleButton.setPrefixComponent(VaadinIcon.BELL.create());
        purpleButton.setSuffixComponent(VaadinIcon.BELL.create());
        purpleButton.addClassNames("purple-button");
        add(purpleButton);

        var greenButton = new Button("green");
        greenButton.getElement().getStyle()
                .set("background-color", "green")
                .set("color", "white") ;
        add(greenButton);

        addClassNames("my-stylish-view");
        setSizeFull();
    }
}
