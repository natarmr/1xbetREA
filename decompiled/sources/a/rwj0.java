package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;
import org.xplatform.feature.fin_bet.impl.makebet.presentation.make_bet.ui_model.StepInputUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class rwj0 extends bnn0 implements Function2 {
    public double i;
    public double j;
    public double k;
    public ql5 l;
    public yh7 m;
    public byte n;
    public final /* synthetic */ yxj0 o;
    public final /* synthetic */ boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwj0(yxj0 yxj0Var, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.o = yxj0Var;
        this.p = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new rwj0(this.o, this.p, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((rwj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objK;
        double d;
        double d2;
        yxj0 yxj0Var;
        wne wneVar;
        double d3;
        Object objR;
        rwj0 rwj0Var;
        ql5 ql5Var;
        wne wneVar2;
        yxj0 yxj0Var2;
        ql5 ql5Var2;
        yh7 yh7Var;
        yxj0 yxj0Var3 = this.o;
        p7m0 p7m0Var = yxj0Var3.a0;
        ctf0 ctf0Var = yxj0Var3.D;
        FinBetInfoModel finBetInfoModel = yxj0Var3.b;
        wne wneVar3 = wne.f39444a;
        byte b = this.n;
        if (b != 0) {
            if (b == 1) {
                z1x.P(obj);
                objK = obj;
            } else if (b == 2) {
                double d4 = this.k;
                double d5 = this.j;
                double d6 = this.i;
                ql5 ql5Var3 = this.l;
                z1x.P(obj);
                yxj0Var = yxj0Var3;
                d3 = d4;
                d2 = d5;
                objR = obj;
                rwj0Var = this;
                ql5Var = ql5Var3;
                wneVar = wneVar3;
                d = d6;
                yh7 yh7Var2 = (yh7) objR;
                long j = ql5Var.f28916a;
                String str = ql5Var.f;
                double d7 = yh7Var2.e;
                String str2 = yh7Var2.d;
                String strValueOf = String.valueOf(yh7Var2.b);
                pn40 pn40Var = pn40.f27267a;
                String strP = pn40.p(ql5Var.f, yh7Var2.e * yh7Var2.c);
                String strF = ctf0Var.f(R.string.history_possible_win, new Object[0]);
                yxj0 yxj0Var4 = yxj0Var;
                wneVar2 = wneVar;
                yxj0Var2 = yxj0Var4;
                ql5Var2 = ql5Var;
                yh7Var = yh7Var2;
                yxj0Var2.A(false, strValueOf, j, str, d7, str2, strP, strF, yxj0Var4.J.c().f24244a);
                rwj0Var.l = null;
                rwj0Var.m = yh7Var;
                rwj0Var.i = d;
                rwj0Var.j = d2;
                rwj0Var.k = d3;
                rwj0Var.n = (byte) 3;
                if (yxj0Var2.z(yh7Var, ql5Var2, rwj0Var) == wneVar2) {
                    return wneVar2;
                }
            } else {
                if (b != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yh7 yh7Var3 = this.m;
                z1x.P(obj);
                yh7Var = yh7Var3;
                yxj0Var2 = yxj0Var3;
                finBetInfoModel = finBetInfoModel;
            }
            long j2 = yh7Var.b;
            String strC = finBetInfoModel.e.C();
            yxj0Var2.t.Q(strC, "", String.valueOf(j2), false);
            yxj0Var2.L.y(strC, j2, false);
            return Unit.f46060a;
        }
        z1x.P(obj);
        gmq gmqVarB = yxj0Var3.N.b();
        this.n = (byte) 1;
        objK = ntb.K(gmqVarB, this);
        if (objK == wneVar3) {
            return wneVar3;
        }
        if (!((Boolean) objK).booleanValue()) {
            yxj0Var3.p.f(new p0o(new xdk0(pek0.f26859a, ctf0Var.f(R.string.no_connection_title_with_hyphen, new Object[0]), ctf0Var.f(R.string.no_connection_description, new Object[0]), null, null, null, 120)));
            return Unit.f46060a;
        }
        yxj0Var3.o.f(i520.f14173a);
        d = ((StepInputUiModel) yxj0Var3.X.getValue()).f46647a;
        ql5 ql5VarD = yxj0Var3.D();
        if (ql5VarD == null) {
            return Unit.f46060a;
        }
        double d8 = ((n0d) p7m0Var.getValue()).f22694a;
        double d9 = ((n0d) p7m0Var.getValue()).b;
        w5z w5zVar = yxj0Var3.B;
        long j3 = ql5VarD.f28916a;
        boolean z = finBetInfoModel.k;
        r9u r9uVar = yxj0Var3.R;
        ygp ygpVar = ygp.Z;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        long jA = j1q0Var.f15748a.d(ygpVar) ? finBetInfoModel.m : yxj0Var3.C.a();
        long j4 = finBetInfoModel.h;
        int i = finBetInfoModel.f46646a;
        Double d10 = new Double(d8);
        if (d10.doubleValue() == 0.0d) {
            d10 = null;
        }
        double dDoubleValue = d10 != null ? d10.doubleValue() : finBetInfoModel.i;
        Double d11 = new Double(d8);
        if (d11.doubleValue() == 0.0d) {
            d11 = null;
        }
        double dDoubleValue2 = d11 != null ? d11.doubleValue() : finBetInfoModel.j;
        Double d12 = new Double(d9);
        if (d12.doubleValue() == 0.0d) {
            d12 = null;
        }
        double dDoubleValue3 = d12 != null ? d12.doubleValue() : finBetInfoModel.f;
        ezc ezcVarA = yxj0Var3.I.a();
        byte b2 = yxj0Var3.O.a().I1.f26017a;
        this.l = ql5VarD;
        this.i = d;
        this.j = d8;
        this.k = d9;
        this.n = (byte) 2;
        d2 = d8;
        yxj0Var = yxj0Var3;
        wneVar = wneVar3;
        d3 = d9;
        objR = w5zVar.R(j4, dDoubleValue3, dDoubleValue, dDoubleValue2, z, i, jA, d, "", j3, this.p, false, ezcVarA, false, b2, this);
        rwj0Var = this;
        if (objR == wneVar) {
            return wneVar;
        }
        ql5Var = ql5VarD;
        yh7 yh7Var4 = (yh7) objR;
        long j5 = ql5Var.f28916a;
        String str3 = ql5Var.f;
        double d13 = yh7Var4.e;
        String str4 = yh7Var4.d;
        String strValueOf2 = String.valueOf(yh7Var4.b);
        pn40 pn40Var2 = pn40.f27267a;
        String strP2 = pn40.p(ql5Var.f, yh7Var4.e * yh7Var4.c);
        String strF2 = ctf0Var.f(R.string.history_possible_win, new Object[0]);
        yxj0 yxj0Var5 = yxj0Var;
        wneVar2 = wneVar;
        yxj0Var2 = yxj0Var5;
        ql5Var2 = ql5Var;
        yh7Var = yh7Var4;
        yxj0Var2.A(false, strValueOf2, j5, str3, d13, str4, strP2, strF2, yxj0Var5.J.c().f24244a);
        rwj0Var.l = null;
        rwj0Var.m = yh7Var;
        rwj0Var.i = d;
        rwj0Var.j = d2;
        rwj0Var.k = d3;
        rwj0Var.n = (byte) 3;
        if (yxj0Var2.z(yh7Var, ql5Var2, rwj0Var) == wneVar2) {
            return wneVar2;
        }
        long j6 = yh7Var.b;
        String strC2 = finBetInfoModel.e.C();
        yxj0Var2.t.Q(strC2, "", String.valueOf(j6), false);
        yxj0Var2.L.y(strC2, j6, false);
        return Unit.f46060a;
    }
}
