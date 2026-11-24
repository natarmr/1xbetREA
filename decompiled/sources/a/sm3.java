package a;

/* JADX INFO: loaded from: classes2.dex */
public enum sm3 implements sgf0 {
    /* JADX INFO: Fake field, exist only in values array */
    BOTTOM_SHEET("bottomSheet"),
    FLOATING_BUTTONS("floatingButtons"),
    /* JADX INFO: Fake field, exist only in values array */
    FLOATING_BUTTONS_AND_TITLE("floatingButtonsAndTitle");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32426a;

    sm3(String str) {
        this.f32426a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "updateScreenStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f32426a;
    }
}
