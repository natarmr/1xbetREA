package a;

import kotlin.jvm.functions.Function2;
import org.xplatform.make_bet.impl.presentation.model.AutoMaxUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lm20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20276a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ double d;
    public final /* synthetic */ double e;

    public /* synthetic */ lm20(gx4 gx4Var, double d, boolean z, double d2) {
        this.f20276a = (byte) 3;
        this.b = gx4Var;
        this.d = d;
        this.c = z;
        this.e = d2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20276a;
        czc0 czc0VarA = null;
        boolean z = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                jdc0 jdc0Var = (jdc0) obj3;
                sg20 sg20Var = (sg20) obj2;
                ifc0 ifc0Var = sg20Var.f;
                return sg20.a(sg20Var, null, null, null, null, ifc0.a(ifc0Var, azc0.a(ifc0Var.f14680a, androidx.compose.runtime.e.e(jdc0Var.f16322a), true, 46), plc0.a(sg20Var.f.c, jdc0Var.b, jdc0Var.c, jdc0Var.d, this.d, this.e, false, (jdc0Var.e == 0 || z) ? false : true, true, 32), false, true, false, false, 106), false, false, false, 0, 2015);
            case 1:
                jdc0 jdc0Var2 = (jdc0) obj3;
                b820 b820Var = (b820) obj2;
                czc0 czc0Var = b820Var.e;
                if (czc0Var != null) {
                    czc0VarA = czc0.a(czc0Var, tyc0.a(czc0Var.f5218a, androidx.compose.runtime.e.e(jdc0Var2.f16322a), true, false, 46), qlc0.a(b820Var.e.c, jdc0Var2.b, jdc0Var2.c, jdc0Var2.d, this.d, this.e, false, (jdc0Var2.e == 0 || z) ? false : true, true, 32), false, true, 10);
                }
                return b820.a(b820Var, null, null, null, null, czc0VarA, null, null, false, false, false, false, false, 8175);
            case 2:
                jdc0 jdc0Var3 = (jdc0) obj3;
                a820 a820Var = (a820) obj2;
                dzc0 dzc0Var = a820Var.f;
                syc0 syc0VarA = syc0.a(dzc0Var.f6938a, androidx.compose.runtime.e.e(jdc0Var3.f16322a), true, false, 46);
                double d = jdc0Var3.b;
                String str = jdc0Var3.c;
                String str2 = jdc0Var3.d;
                boolean z2 = (jdc0Var3.e == 0 || z) ? false : true;
                str.getClass();
                str2.getClass();
                return a820.a(a820Var, null, null, null, null, dzc0.a(dzc0Var, syc0VarA, new olc0(d, str, str2, this.d, this.e, !z, z2, true), false, true, false, 42), null, null, false, null, 0.0f, false, null, 0, false, false, false, 262111);
            default:
                gx4 gx4Var = (gx4) obj3;
                b820 b820Var2 = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var2.getClass();
                dx6 dx6Var = gx4Var.c;
                return b820.a(b820Var2, null, null, null, null, null, gx4.a(gx4Var, null, null, dx6.a(dx6Var, null, vw6.a(dx6Var.b, this.d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, new AutoMaxUiModel(this.e, z), false, false, false, false, 65278), 1), null, null, 27), null, false, false, false, false, false, 8159);
        }
    }

    public /* synthetic */ lm20(jdc0 jdc0Var, boolean z, double d, double d2, byte b) {
        this.f20276a = b;
        this.b = jdc0Var;
        this.c = z;
        this.d = d;
        this.e = d2;
    }
}
