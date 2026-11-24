package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8694a = 1;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ f0(Function0 function0, boolean z) {
        this.b = function0;
        this.c = z;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        long primary;
        byte b = this.f8694a;
        boolean z = this.c;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                yhg0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(yhg0Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    if (z) {
                        fetVar.e0(-1330171873);
                        primary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                    } else {
                        fetVar.e0(-1330170819);
                        primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                    }
                    fetVar.r(false);
                    pz40 pz40VarF = androidx.compose.runtime.e.f(new y3d(primary), fetVar);
                    mm40 mm40VarA = yhg0Var.a(1.0f, jm40.b, true);
                    zcl zclVar = qmk.f28987a;
                    v8q0.a(xsm0.s(R.string.full_description, fetVar), s5x0.N(mm40VarA, 12.0f, 0.0f, 0.0f, 0.0f, 14), ((y3d) pz40VarF.getValue()).f41946a, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 0, 131064);
                    ay3.b(z, function0, fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            default:
                mm40 mm40Var = (mm40) obj;
                fet fetVar2 = (fet) obj2;
                ((Integer) obj3).getClass();
                fetVar2.e0(-196777734);
                long j = ((s9q0) fetVar2.k(t9q0.f33580a)).f31859a;
                boolean zF = fetVar2.f(j) | fetVar2.g(function0) | fetVar2.h(z);
                Object objP = fetVar2.P();
                if (zF || objP == ukd.f35823a) {
                    objP = new sl1(j, function0, z);
                    fetVar2.o0(objP);
                }
                mm40 mm40VarL = rq8.L(mm40Var, (Function1) objP);
                fetVar2.r(false);
                return mm40VarL;
        }
    }

    public /* synthetic */ f0(boolean z, Function0 function0) {
        this.c = z;
        this.b = function0;
    }
}
