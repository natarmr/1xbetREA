package a;

/* JADX INFO: loaded from: classes5.dex */
public enum yfw implements sgf0 {
    DEFAULT(""),
    HALLOWEEN("halloween"),
    NEW_YEAR("newYear"),
    BLACK_FRIDAY("blackFriday"),
    CHINESE_NEW_YEAR("chineseNewYear"),
    HOLI("holi");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42560a;

    yfw(String str) {
        this.f42560a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "holidayEvent";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f42560a;
    }
}
