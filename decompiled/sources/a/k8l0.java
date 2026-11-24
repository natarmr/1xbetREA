package a;

/* JADX INFO: loaded from: classes5.dex */
public enum k8l0 implements sgf0 {
    None("none"),
    /* JADX INFO: Fake field, exist only in values array */
    RectangleL("rectangleL"),
    /* JADX INFO: Fake field, exist only in values array */
    RectangleM("rectangleM"),
    /* JADX INFO: Fake field, exist only in values array */
    Square("square");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17879a;

    k8l0(String str) {
        this.f17879a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "sportFeedPopularStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f17879a;
    }
}
