package a;

/* JADX INFO: loaded from: classes5.dex */
public enum g5h implements sgf0 {
    DEFAULT("defaultStyle"),
    EVENT_FOCUS("eventFocus"),
    HEADER_FOCUS("headerFocus");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10717a;

    g5h(String str) {
        this.f10717a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "esportsMainScreenStyles";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f10717a;
    }
}
