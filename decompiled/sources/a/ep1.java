package a;

/* JADX INFO: loaded from: classes5.dex */
public enum ep1 implements sgf0 {
    AGGREGATOR("aggregator"),
    /* JADX INFO: Fake field, exist only in values array */
    VIRTUAL("virtual");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8163a;

    ep1(String str) {
        this.f8163a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "sectionAggregatorMode";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f8163a;
    }
}
