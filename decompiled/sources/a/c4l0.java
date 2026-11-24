package a;

/* JADX INFO: loaded from: classes4.dex */
public enum c4l0 implements sgf0 {
    RECTANGLE_S("rectangleS"),
    /* JADX INFO: Fake field, exist only in values array */
    CIRCLE_WITH_HEADER("rectangleSWithHeader"),
    /* JADX INFO: Fake field, exist only in values array */
    RECTANGLE_M("rectangleM"),
    /* JADX INFO: Fake field, exist only in values array */
    RECTANGLE_L("rectangleL"),
    /* JADX INFO: Fake field, exist only in values array */
    CIRCLE_WITH_LABEL("circleWithLabel");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3731a;

    c4l0(String str) {
        this.f3731a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "sportCollectionStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f3731a;
    }
}
