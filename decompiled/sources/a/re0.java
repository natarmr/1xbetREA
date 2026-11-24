package a;

/* JADX INFO: loaded from: classes5.dex */
public enum re0 implements sgf0 {
    ACCENT_ARROW("accentArrow"),
    /* JADX INFO: Fake field, exist only in values array */
    ACCENT_ICON("accentIcon"),
    /* JADX INFO: Fake field, exist only in values array */
    ACCENT_BUTTON("accentButton"),
    /* JADX INFO: Fake field, exist only in values array */
    ACCENT_AMOUNT("accentAmount");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30311a;

    re0(String str) {
        this.f30311a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "aggregatorCashbackSummCardStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f30311a;
    }
}
