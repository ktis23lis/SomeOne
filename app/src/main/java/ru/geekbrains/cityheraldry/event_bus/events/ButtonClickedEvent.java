package ru.geekbrains.cityheraldry.event_bus.events;

public class ButtonClickedEvent {
    public int count = 0;

    public ButtonClickedEvent(int count) {
        this.count = count;
    }
}
