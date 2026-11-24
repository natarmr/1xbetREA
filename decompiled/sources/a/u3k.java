package a;

import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes.dex */
public final class u3k implements n4d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35001a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u3k(Object obj, byte b) {
        this.f35001a = b;
        this.b = obj;
    }

    @Override // a.n4d
    public final long a() {
        byte b = this.f35001a;
        Object obj = this.b;
        switch (b) {
            case 0:
                v3k v3kVar = (v3k) obj;
                long j = ((ncg0) v3kVar.t.b).c;
                if (j != 16) {
                    return j;
                }
                icg0 icg0Var = (icg0) mbc.R(v3kVar, lcg0.f19798a);
                if (icg0Var != null) {
                    long j2 = icg0Var.f14536a;
                    if (j2 != 16) {
                        return j2;
                    }
                }
                return ((y3d) mbc.R(v3kVar, yde.f42431a)).f41946a;
            case 1:
                return ((m3w) obj).c;
            case 2:
                return ((ncg0) obj).c;
            default:
                if (((s8l0) obj).d) {
                    pz40 pz40Var = s6t0.f31722a;
                    return StaticColors.INSTANCE.m123getWhite0d7_KjU();
                }
                pz40 pz40Var2 = s6t0.f31722a;
                return s6t0.b().f33626a.getTextPrimary();
        }
    }
}
