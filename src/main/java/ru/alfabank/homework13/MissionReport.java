package ru.alfabank.homework13;

public class MissionReport {
    private String missionName;
    private int capturedAliens;
    private int squadSize;

    public MissionReport(String missionName, int capturedAliens, int squadSize) {
        this.missionName = missionName;
        this.capturedAliens = capturedAliens;
        this.squadSize = squadSize;
    }

    @Override
    public String toString() {
        return "Отчёт командованию: \n" +
                "- Миссия = '" + missionName + '\'' + "\n" +
                "- Поймано пришельцев = " + capturedAliens + "\n" +
                "- Размер отряда = " + squadSize;
    }
}
