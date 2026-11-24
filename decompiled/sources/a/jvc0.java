package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;

/* JADX INFO: loaded from: classes4.dex */
public final class jvc0 extends bnn0 implements Function2 {
    public yh7 i;
    public kvc0 j;
    public String k;
    public boolean l;
    public byte m;
    public final /* synthetic */ kvc0 n;
    public final /* synthetic */ String o;
    public final /* synthetic */ boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvc0(kvc0 kvc0Var, String str, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.n = kvc0Var;
        this.o = str;
        this.p = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new jvc0(this.n, this.o, this.p, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jvc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0199  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objK;
        wne wneVar;
        FinBetInfoModel finBetInfoModel;
        Object objR;
        String str;
        jvc0 jvc0Var;
        yh7 yh7Var;
        String strValueOf;
        Object objA;
        yh7 yh7Var2;
        String str2;
        kvc0 kvc0Var;
        boolean z;
        kvc0 kvc0Var2 = this.n;
        ctf0 ctf0Var = kvc0Var2.y;
        FinBetInfoModel finBetInfoModel2 = kvc0Var2.b;
        wne wneVar2 = wne.f39444a;
        byte b = this.m;
        String str3 = this.o;
        if (b != 0) {
            if (b == 1) {
                z1x.P(obj);
                objK = obj;
            } else if (b == 2) {
                z1x.P(obj);
                jvc0Var = this;
                finBetInfoModel = finBetInfoModel2;
                wneVar = wneVar2;
                str = str3;
                objR = obj;
                yh7Var = (yh7) objR;
                long j = yh7Var.b;
                String strC = finBetInfoModel.e.C();
                kvc0Var2.t.Q(strC, str, String.valueOf(j), false);
                zr1 zr1Var = kvc0Var2.z;
                zr1Var.getClass();
                zr1Var.f44833a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j), new j1p(strC, (byte) 0), new j1p(String.valueOf(false), (byte) 1), new j1p(str, (byte) 2)}), 3354L);
                strValueOf = String.valueOf(yh7Var.b);
                nou nouVar = kvc0Var2.v;
                jvc0Var.i = yh7Var;
                jvc0Var.j = kvc0Var2;
                jvc0Var.k = strValueOf;
                jvc0Var.l = true;
                jvc0Var.m = (byte) 3;
                objA = nouVar.a(tl5.c, jvc0Var);
                if (objA == wneVar) {
                    return wneVar;
                }
                yh7Var2 = yh7Var;
                str2 = strValueOf;
                kvc0Var = kvc0Var2;
                z = true;
            } else {
                if (b != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z2 = this.l;
                String str4 = this.k;
                kvc0 kvc0Var3 = this.j;
                yh7Var2 = this.i;
                z1x.P(obj);
                str2 = str4;
                kvc0Var = kvc0Var3;
                z = z2;
                objA = obj;
            }
            kvc0Var.A(z, str2, ((ql5) objA).f28916a, "", 0.0d, yh7Var2.d, "", "", false);
            return Unit.f46060a;
        }
        z1x.P(obj);
        gmq gmqVarB = kvc0Var2.x.b();
        this.m = (byte) 1;
        objK = ntb.K(gmqVarB, this);
        if (objK == wneVar2) {
            return wneVar2;
        }
        if (!((Boolean) objK).booleanValue()) {
            kvc0Var2.p.f(new p0o(new xdk0(pek0.f26859a, ctf0Var.f(R.string.no_connection_title_with_hyphen, new Object[0]), ctf0Var.f(R.string.no_connection_description, new Object[0]), null, null, null, 120)));
            return Unit.f46060a;
        }
        kvc0Var2.o.f(i520.f14173a);
        w5z w5zVar = kvc0Var2.r;
        long j2 = finBetInfoModel2.h;
        double d = finBetInfoModel2.f;
        Double d2 = new Double(kvc0Var2.B);
        if (d2.doubleValue() == 0.0d) {
            d2 = null;
        }
        double dDoubleValue = d2 != null ? d2.doubleValue() : finBetInfoModel2.i;
        Double d3 = new Double(kvc0Var2.B);
        Double d4 = d3.doubleValue() == 0.0d ? null : d3;
        double dDoubleValue2 = d4 != null ? d4.doubleValue() : finBetInfoModel2.j;
        double d5 = dDoubleValue;
        boolean z3 = finBetInfoModel2.k;
        double d6 = dDoubleValue2;
        int i = finBetInfoModel2.f46646a;
        long j3 = finBetInfoModel2.m;
        ezc ezcVarA = kvc0Var2.u.a();
        byte b2 = kvc0Var2.A.a().I1.f26017a;
        this.m = (byte) 2;
        wneVar = wneVar2;
        finBetInfoModel = finBetInfoModel2;
        objR = w5zVar.R(j2, d, d5, d6, z3, i, j3, 0.0d, str3, 0L, this.p, true, ezcVarA, false, b2, this);
        str = str3;
        jvc0Var = this;
        if (objR == wneVar) {
            return wneVar;
        }
        yh7Var = (yh7) objR;
        long j4 = yh7Var.b;
        String strC2 = finBetInfoModel.e.C();
        kvc0Var2.t.Q(strC2, str, String.valueOf(j4), false);
        zr1 zr1Var2 = kvc0Var2.z;
        zr1Var2.getClass();
        zr1Var2.f44833a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j4), new j1p(strC2, (byte) 0), new j1p(String.valueOf(false), (byte) 1), new j1p(str, (byte) 2)}), 3354L);
        strValueOf = String.valueOf(yh7Var.b);
        nou nouVar2 = kvc0Var2.v;
        jvc0Var.i = yh7Var;
        jvc0Var.j = kvc0Var2;
        jvc0Var.k = strValueOf;
        jvc0Var.l = true;
        jvc0Var.m = (byte) 3;
        objA = nouVar2.a(tl5.c, jvc0Var);
        if (objA == wneVar) {
            return wneVar;
        }
        yh7Var2 = yh7Var;
        str2 = strValueOf;
        kvc0Var = kvc0Var2;
        z = true;
        kvc0Var.A(z, str2, ((ql5) objA).f28916a, "", 0.0d, yh7Var2.d, "", "", false);
        return Unit.f46060a;
    }
}
