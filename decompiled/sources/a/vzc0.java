package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public enum vzc0 implements sgf0, Serializable {
    CLASSIC("classic"),
    /* JADX INFO: Fake field, exist only in values array */
    CARDS("cards"),
    /* JADX INFO: Fake field, exist only in values array */
    BIG_BANNER("bigBanner"),
    /* JADX INFO: Fake field, exist only in values array */
    ROWS("rows"),
    /* JADX INFO: Fake field, exist only in values array */
    CHIPS_CATEGORIES("chipsCategories");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38291a;

    vzc0(String str) {
        this.f38291a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "promotionsScreenStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f38291a;
    }
}
