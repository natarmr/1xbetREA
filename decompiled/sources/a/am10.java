package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class am10 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1089a;
    public final /* synthetic */ fm10 b;

    public /* synthetic */ am10(fm10 fm10Var, byte b) {
        this.f1089a = b;
        this.b = fm10Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        byte b = this.f1089a;
        yje yjeVar = null;
        fm10 fm10Var = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = fm10.S1;
                ((View) obj).getClass();
                fm10Var.H0().E();
                return Unit.f46060a;
            case 1:
                iiy[] iiyVarArr2 = fm10.S1;
                ((View) obj).getClass();
                fm10Var.H0().E();
                return Unit.f46060a;
            case 2:
                iiy[] iiyVarArr3 = fm10.S1;
                ((View) obj).getClass();
                bo10 bo10VarH0 = fm10Var.H0();
                if (bo10VarH0.N) {
                    p7m0 p7m0Var = bo10VarH0.x;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, rxk0.a((rxk0) value)));
                    p7m0 p7m0Var2 = bo10VarH0.w;
                    do {
                        value2 = p7m0Var2.getValue();
                        c8h0 c8h0Var = c8h0.f3914a;
                    } while (!p7m0Var2.m(value2, gzk0.a((gzk0) value2)));
                    p7m0 p7m0Var3 = bo10VarH0.C;
                    Boolean bool = Boolean.FALSE;
                    p7m0Var3.getClass();
                    p7m0Var3.o(null, bool);
                    bo10VarH0.o.f16351a.a(xun.f41520a, 3014L);
                    bo10VarH0.p.f13566a.c("games_promos_lucky_wheel");
                    sac.V(jiu0.a(bo10VarH0), new qn10(bo10VarH0, (byte) 3), null, bo10VarH0.d.b, new vn10(bo10VarH0, yjeVar, (byte) 0), 10);
                }
                return Unit.f46060a;
            case 3:
                iiy[] iiyVarArr4 = fm10.S1;
                ((View) obj).getClass();
                bo10 bo10VarH1 = fm10Var.H0();
                bo10VarH1.z();
                bo10VarH1.A(c8h0.f3914a, true);
                return Unit.f46060a;
            case 4:
                iiy[] iiyVarArr5 = fm10.S1;
                ((View) obj).getClass();
                mj8 mj8Var = fm10Var.M1;
                if (mj8Var == null) {
                    Intrinsics.h("bonusesInfoScreenFactory");
                    throw null;
                }
                r9u r9uVar = mj8Var.f21883a;
                ygp ygpVar = ygp.s;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                (j1q0Var.f15748a.d(ygpVar) ? new wi8() : new jj8()).H0(fm10Var.C(), "LuckyWheelGameFragmentOld.BONUSES_INFO_DIALOG_TAG");
                return Unit.f46060a;
            case 5:
                iiy[] iiyVarArr6 = fm10.S1;
                ((View) obj).getClass();
                bo10 bo10VarH2 = fm10Var.H0();
                csr csrVar = bo10VarH2.J;
                if (csrVar != null) {
                    bsr bsrVar = csrVar.f4905a;
                    if (bsrVar.f3145a.b()) {
                        bo10VarH2.F.f(rn10.f30766a);
                    } else {
                        long j = bsrVar.b;
                        bo10VarH2.M = ko10.c;
                        bo10VarH2.L = csr.e;
                        bo10VarH2.z();
                        bo10VarH2.A(c8h0.f3914a, true);
                        sac.V(jiu0.a(bo10VarH2), new pf10(1, bo10VarH2, bo10.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 13), null, bo10VarH2.d.f22085a, new ir((Object) bo10VarH2, j, (Object) csrVar, (yje) null, (byte) 21), 10);
                    }
                }
                return Unit.f46060a;
            case 6:
                iiy[] iiyVarArr7 = fm10.S1;
                ((View) obj).getClass();
                bo10 bo10VarH3 = fm10Var.H0();
                bo10VarH3.y();
                bo10VarH3.A(c8h0.f3914a, true);
                return Unit.f46060a;
            default:
                float fFloatValue = ((Float) obj).floatValue();
                iiy[] iiyVarArr8 = fm10.S1;
                bo10 bo10VarH4 = fm10Var.H0();
                sac.V(jiu0.a(bo10VarH4), new pf10(1, bo10VarH4, bo10.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 11), null, bo10VarH4.d.b, new qu2((Object) bo10VarH4, fFloatValue, yjeVar, (byte) 5), 10);
                return Unit.f46060a;
        }
    }
}
