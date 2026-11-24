package a;

/* JADX INFO: loaded from: classes5.dex */
public enum oxk0 implements sgf0 {
    DEFAULT(0, ""),
    DEFAULT_OPTIONBET(1, "defaultAndOptionBet"),
    DEFAULT_EACHWAY(2, "defaultAndEachWay"),
    DEFAULT_OPTIONBET_EACHWAY(3, "defaultAndOpAndEw");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f26017a;
    public final String b;

    /* JADX WARN: Multi-variable type inference failed */
    oxk0(int i, String str) {
        this.f26017a = i;
        this.b = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "supportedSpecialType";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.b;
    }
}
