package a;

/* JADX INFO: loaded from: classes5.dex */
public enum n2o implements sgf0 {
    DEFAULT("defaultStyle"),
    EVENT_FOCUS("eventFocus"),
    HEADER_FOCUS("headerFocus"),
    /* JADX INFO: Fake field, exist only in values array */
    ICON_FOCUS("iconFocus");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22811a;

    n2o(String str) {
        this.f22811a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "esportsDisciplineScreenStyles";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f22811a;
    }
}
