package a;

/* JADX INFO: loaded from: classes5.dex */
public enum zvh0 implements sgf0 {
    CONTROL_WITH_DIVIDERS("controlWithDividers"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTROL_WITH_BACKGROUND("controlWithBackground"),
    /* JADX INFO: Fake field, exist only in values array */
    LIGHT_WITH_BACKGROUND("lightWithBackground"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTROL_WITH_OUTLINE("controlWithOutline");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45057a;

    zvh0(String str) {
        this.f45057a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "segmentControlStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f45057a;
    }
}
