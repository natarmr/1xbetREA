package a;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gl60 extends i3t0 {
    public static final /* synthetic */ int z = 0;
    public final mne o;
    public final onv p;
    public final rdd q;
    public final ahu r;
    public final r990 s;
    public final rqt t;
    public final i1w0 u;
    public final ih5 v;
    public final ix0 w;
    public final l7k x;
    public final ih5 y;

    public gl60(vzg0 vzg0Var, mne mneVar, ggu gguVar, onv onvVar, rdd rddVar, eke0 eke0Var, ctf0 ctf0Var, ahu ahuVar, r990 r990Var, rqt rqtVar, i1w0 i1w0Var, ih5 ih5Var, ix0 ix0Var, l7k l7kVar, ih5 ih5Var2) {
        ctf0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(rwjVar, rwjVar);
        th50 th50Var = new th50((byte) 23);
        byte b = 22;
        v510 v510Var = new v510(ctf0Var, b);
        yje yjeVar = null;
        super(th50Var, g090VarP, v510Var, (yzn0) null);
        this.o = mneVar;
        this.p = onvVar;
        this.q = rddVar;
        this.r = ahuVar;
        this.s = r990Var;
        this.t = rqtVar;
        this.u = i1w0Var;
        this.v = ih5Var;
        this.w = ix0Var;
        this.x = l7kVar;
        this.y = ih5Var2;
        tj60 tj60Var = (tj60) gguVar.f11269a.f24171a;
        sac.T(new fnq(new p6d(tj60Var.b, tj60Var.c, new qos(3, yjeVar, b), (byte) 1), new nf60(this, yjeVar, (byte) 6), (byte) 4), d5c.S(jiu0.a(this), rwjVar), foe.h);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        tk60 tk60Var;
        vh60 vh60Var = (vh60) obj;
        vh60Var.getClass();
        super.x(vh60Var);
        if (!(vh60Var instanceof uh60)) {
            if (vh60Var.equals(th60.f33948a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        av9 av9Var = ((uh60) vh60Var).f35662a;
        boolean z2 = av9Var instanceof xu9;
        ih5 ih5Var = this.v;
        rdd rddVar = this.q;
        ix0 ix0Var = this.w;
        if (z2) {
            sh60 sh60Var = ((xu9) av9Var).f41498a;
            xkb0 xkb0Var = ((sk60) D()).f32332a;
            if (xkb0Var != null) {
                skb0 skb0VarB = xkb0Var.b();
                int iIntValue = Integer.valueOf(skb0VarB.f32338a).intValue();
                if (skb0VarB.equals(CollectionsKt.f0(sh60Var.f32197a))) {
                    ih5Var.i(iIntValue, "finish");
                    ix0Var.k(iIntValue, "finish");
                } else {
                    ih5Var.i(iIntValue, "skip");
                    ix0Var.k(iIntValue, "skip");
                }
            }
            rddVar.a(sh60Var);
            return;
        }
        yje yjeVar = null;
        if (!(av9Var instanceof yu9)) {
            if (!(av9Var instanceof zu9)) {
                t9f.b();
                return;
            } else {
                sac.V(jiu0.a(this), null, null, this.o.f22085a, new w620((Object) this, yjeVar, (byte) 28), 11);
                rddVar.a(((zu9) av9Var).f44999a);
                return;
            }
        }
        skb0 skb0Var = ((yu9) av9Var).b;
        skb0 skb0Var2 = skb0Var != null ? skb0Var : null;
        Integer numValueOf = skb0Var2 != null ? Integer.valueOf(skb0Var2.f32338a) : null;
        if (numValueOf != null) {
            int iIntValue2 = numValueOf.intValue();
            ih5Var.i(iIntValue2, "next");
            ix0Var.k(iIntValue2, "next");
        }
        onv onvVar = this.p;
        onvVar.getClass();
        skb0Var.getClass();
        tj60 tj60Var = (tj60) ((nv20) onvVar.f25567a).f24171a;
        tj60Var.getClass();
        p7m0 p7m0Var = tj60Var.b;
        do {
            value = p7m0Var.getValue();
            tk60Var = (tk60) value;
            tk60 rk60Var = qk60.f28870a;
            if (!Intrinsics.d(tk60Var, rk60Var)) {
                if (!(tk60Var instanceof rk60)) {
                    t9f.b();
                    return;
                }
                rk60 rk60Var2 = (rk60) tk60Var;
                sh60 sh60Var2 = rk60Var2.f30634a;
                if (Intrinsics.d(rk60Var2.b, skb0Var)) {
                    List list = sh60Var2.f32197a;
                    int iIndexOf = list.indexOf(skb0Var) + 1;
                    if (iIndexOf >= list.size()) {
                        tj60Var.c.n(null);
                        tj60Var.f34036a.d("KEY_ONBOARDING_COMPLETED_" + sh60Var2.name(), true);
                    } else {
                        rk60Var = new rk60(sh60Var2, (skb0) list.get(iIndexOf));
                    }
                    tk60Var = rk60Var;
                }
            }
        } while (!p7m0Var.m(value, tk60Var));
    }
}
