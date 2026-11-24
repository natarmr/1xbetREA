package a;

/* JADX INFO: loaded from: classes6.dex */
public final class bll0 implements cll0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bll0 f2800a = new bll0();
    public static final float b;
    public static final float c;

    static {
        zcl zclVar = qmk.f28987a;
        b = 96.0f;
        c = 20.0f;
    }

    @Override // a.cll0
    public final float a() {
        return b;
    }

    @Override // a.cll0
    public final float b() {
        return c;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bll0);
    }

    public final int hashCode() {
        return 1662806262;
    }

    public final String toString() {
        return "SmallCardNoTeamLogo";
    }
}
