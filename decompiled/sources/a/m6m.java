package a;

import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final class m6m implements n4d {
    public static final m6m b = new m6m(0);
    public static final m6m c = new m6m(1);
    public static final m6m d = new m6m(2);
    public static final m6m e = new m6m(3);
    public static final m6m f = new m6m(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21277a;

    public /* synthetic */ m6m(byte b2) {
        this.f21277a = b2;
    }

    @Override // a.n4d
    public final long a() {
        switch (this.f21277a) {
            case 0:
                pz40 pz40Var = s6t0.f31722a;
                return StaticColors.INSTANCE.m123getWhite0d7_KjU();
            case 1:
                pz40 pz40Var2 = s6t0.f31722a;
                return s6t0.b().f33626a.getSecondary();
            case 2:
                pz40 pz40Var3 = s6t0.f31722a;
                return s6t0.b().f33626a.getTextPrimary();
            case 3:
                pz40 pz40Var4 = s6t0.f31722a;
                return s6t0.b().f33626a.getSecondary();
            default:
                return StaticColors.INSTANCE.m123getWhite0d7_KjU();
        }
    }
}
