package a;

import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40388a;
    public final /* synthetic */ r040 b;

    public /* synthetic */ x7(r040 r040Var, byte b) {
        this.f40388a = b;
        this.b = r040Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f40388a) {
            case 0:
                if (((Integer) obj).intValue() % 2 == 0) {
                    return iun.f15405a;
                }
                iz30 iz30Var = iz30.b;
                m0x m0xVar = new m0x(R.drawable.ic_glyph_language, null, 6);
                pz40 pz40Var = s6t0.f31722a;
                j0m j0mVar = new j0m("", m0xVar, StaticColors.INSTANCE.m121getTransparent0d7_KjU(), R.drawable.ic_glyph_language, (i0m) null, 34);
                r040 r040Var = r040.VIRTUAL;
                r040 r040Var2 = this.b;
                return kotlin.collections.a.c(new jy30(iz30Var, r040Var2, false, new ry30(iz30Var), null, new c0m(j0mVar, (r040Var2 == r040Var || r040Var2 == r040.SINGLE_VIRTUAL) ? yzl.f43518a : new a0m("", s6t0.b().f33626a.getTextPrimary()), null, false, null, 60)));
            default:
                if (((Integer) obj).intValue() % 2 == 0) {
                    return iun.f15405a;
                }
                iz30 iz30Var2 = iz30.b;
                m0x m0xVar2 = new m0x(R.drawable.ic_glyph_language, null, 6);
                pz40 pz40Var2 = s6t0.f31722a;
                return kotlin.collections.a.c(new jy30(iz30Var2, this.b, false, new ry30(iz30Var2), null, new c0m(new j0m("", m0xVar2, StaticColors.INSTANCE.m121getTransparent0d7_KjU(), R.drawable.ic_glyph_language, (i0m) null, 34), null, null, false, null, 62)));
        }
    }
}
