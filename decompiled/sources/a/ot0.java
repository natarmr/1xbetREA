package a;

/* JADX INFO: loaded from: classes5.dex */
public enum ot0 implements sgf0 {
    BACKGROUND_L("backgroundL"),
    BACKGROUND_S("backgroundS"),
    GRADIENT("gradient"),
    TRANSPARENCY("transparency"),
    HORIZONTAL_BACKGROUND("horizontalBackground");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25807a;

    ot0(String str) {
        this.f25807a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "aggregatorGameCardCollectionStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f25807a;
    }
}
