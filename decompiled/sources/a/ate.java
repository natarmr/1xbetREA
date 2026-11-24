package a;

/* JADX INFO: loaded from: classes5.dex */
public enum ate implements sgf0 {
    OFFSET("offset"),
    /* JADX INFO: Fake field, exist only in values array */
    LINE("line"),
    /* JADX INFO: Fake field, exist only in values array */
    DASH("dashed");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1428a;

    ate(String str) {
        this.f1428a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "cardSeparatorStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f1428a;
    }
}
