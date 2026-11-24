package a;

/* JADX INFO: loaded from: classes5.dex */
public enum lj0 implements sgf0 {
    TRANSPARENCY("transparency"),
    /* JADX INFO: Fake field, exist only in values array */
    PROGRESS_LINE("progressLine"),
    /* JADX INFO: Fake field, exist only in values array */
    PROGRESS_CIRCLE("progressCircle"),
    /* JADX INFO: Fake field, exist only in values array */
    STATIC_BACKGROUND("staticBackground"),
    /* JADX INFO: Fake field, exist only in values array */
    DYNAMIC_BACKGROUND("dynamicBackground");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20131a;

    lj0(String str) {
        this.f20131a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "aggregatorCurrentCashbackCardStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f20131a;
    }
}
