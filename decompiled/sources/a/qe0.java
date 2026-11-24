package a;

/* JADX INFO: loaded from: classes5.dex */
public enum qe0 implements sgf0 {
    LARGE_ICON("largeIcon"),
    /* JADX INFO: Fake field, exist only in values array */
    INDICATOR("indicator"),
    /* JADX INFO: Fake field, exist only in values array */
    SMALL_ICON("smallIcon"),
    /* JADX INFO: Fake field, exist only in values array */
    PICTURE("picture"),
    /* JADX INFO: Fake field, exist only in values array */
    COMPACT("compact");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28557a;

    qe0(String str) {
        this.f28557a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "aggregatorCashbackStatusCardStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f28557a;
    }
}
