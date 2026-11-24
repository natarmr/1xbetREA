package a;

/* JADX INFO: loaded from: classes5.dex */
public final class kdh extends vdh {
    public static final kdh e = new kdh("broadcast", false);
    public static final kdh f = new kdh("live_statistics", false);
    public static final kdh g = new kdh("market", true);
    public static final kdh h = new kdh("past_statistics", false);
    public final String c;
    public final boolean d;

    public kdh(String str, boolean z) {
        super(str, z);
        this.c = str;
        this.d = z;
    }

    @Override // a.vdh
    public final String a() {
        return this.c;
    }

    @Override // a.vdh
    public final boolean b() {
        return this.d;
    }
}
