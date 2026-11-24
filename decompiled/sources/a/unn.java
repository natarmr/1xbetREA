package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class unn extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wnn k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ unn(wnn wnnVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = wnnVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        wnn wnnVar = this.k;
        switch (b) {
            case 0:
                unn unnVar = new unn(wnnVar, yjeVar, (byte) 0);
                unnVar.j = obj;
                return unnVar;
            default:
                unn unnVar2 = new unn(wnnVar, yjeVar, (byte) 1);
                unnVar2.j = obj;
                return unnVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((unn) create((q4f) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((unn) create((en7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        wnn wnnVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                q4f q4fVar = (q4f) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ag3 ag3Var = wnnVar.x;
                float fR = lgb.R(q4fVar);
                ocl oclVar = wnnVar.E;
                String str = ((vqc) oclVar.f25032a).d().f36579a;
                ag3Var.getClass();
                str.getClass();
                ag3Var.f809a.a("coupon_edit_change_type", xp20.f(new Pair("coupon_id", str), new Pair("bet_type", Float.valueOf(fR))));
                ik4 ik4Var = wnnVar.y;
                String str2 = ((vqc) oclVar.f25032a).d().f36579a;
                float fR2 = lgb.R(q4fVar);
                ik4Var.getClass();
                str2.getClass();
                ik4Var.f14907a.a(tx3.l0(new k1p[]{new j1p(str2, (byte) 0), new h1p(fR2, (byte) 0)}), 3220L);
                p7m0 p7m0Var = wnnVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, inn.a((inn) value, q4fVar, false, null, null, null, null, false, false, null, 0L, false, 32766)));
                break;
            default:
                en7 en7Var = (en7) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = wnn.g0;
                p7m0 p7m0Var2 = wnnVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, inn.a((inn) value2, null, false, null, null, null, null, false, false, en7Var, 0L, false, 30719)));
                break;
        }
        return Unit.f46060a;
    }
}
