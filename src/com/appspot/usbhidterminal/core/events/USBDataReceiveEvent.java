package com.appspot.usbhidterminal.core.events;

public class USBDataReceiveEvent {
    private final String data;
    private final int bytesCount;
    private final byte[] bytesReceived;

    public USBDataReceiveEvent(String data, int bytesCount, byte[] bytesReceived) {
        this.data = data;
        this.bytesCount = bytesCount;
        this.bytesReceived = bytesReceived;
    }

    public String getData() {
        return data;
    }

    public int getBytesCount() {
        return bytesCount;
    }

    public byte[] getBytesReceived() {
        return bytesReceived;
    }
}