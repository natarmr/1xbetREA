package a;

import kotlin.text.StringsKt;
import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;

/* JADX INFO: loaded from: classes4.dex */
public final class kvc0 extends d06 {
    public final pru A;
    public double B;
    public boolean C;
    public final p7m0 D;
    public final p7m0 E;
    public final w5z r;
    public final mne s;
    public final mii0 t;
    public final vyt u;
    public final nou v;
    public final mrt w;
    public final m1e x;
    public final ctf0 y;
    public final zr1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvc0(w5z w5zVar, mne mneVar, x4u x4uVar, mii0 mii0Var, vyt vytVar, nou nouVar, mrt mrtVar, m1e m1eVar, ctf0 ctf0Var, zr1 zr1Var, pru pruVar, r9u r9uVar, m1u m1uVar, v6q v6qVar, ahu ahuVar, FinBetInfoModel finBetInfoModel, zlt0 zlt0Var, nw20 nw20Var, duj dujVar, ilt0 ilt0Var, trm0 trm0Var) {
        super(finBetInfoModel, zlt0Var, nw20Var, ilt0Var, trm0Var, ahuVar, dujVar, mii0Var, zr1Var, v6qVar, mneVar, r9uVar, m1uVar);
        m1eVar.getClass();
        ctf0Var.getClass();
        r9uVar.getClass();
        this.r = w5zVar;
        this.s = mneVar;
        this.t = mii0Var;
        this.u = vytVar;
        this.v = nouVar;
        this.w = mrtVar;
        this.x = m1eVar;
        this.y = ctf0Var;
        this.z = zr1Var;
        this.A = pruVar;
        this.D = q7m0.a(new gvc0(""));
        this.E = q7m0.a(Boolean.FALSE);
        yje yjeVar = null;
        slb.U(new dnq(new fnq(this.b.k ? x4uVar.a(wbq.f38891a) : x4uVar.a(wbq.b), new s9c0(this, yjeVar, (byte) 6), (byte) 4), new jgb0((Object) this, yjeVar, (byte) 4), (byte) 1), jiu0.a(this));
        byte b = 25;
        sac.V(jiu0.a(this), new ppb0(this, b), null, mneVar.b, new o690(this, yjeVar, b), 10);
        x();
    }

    @Override // a.d06
    public final void B(boolean z) {
        this.C = z;
        D(((ivc0) this.D.getValue()).f15440a);
    }

    public final void C(String str, boolean z) {
        sac.V(jiu0.a(this), new prc0(1, this, kvc0.class, "onMakeBetError", "onMakeBetError(Ljava/lang/Throwable;)V", 0, (byte) 1), null, this.s.b, new jvc0(this, str, z, null), 10);
    }

    public final void D(String str) {
        boolean zW = StringsKt.W(str);
        p7m0 p7m0Var = this.D;
        if (zW || this.b.f46646a <= 0 || !this.C) {
            gvc0 gvc0Var = new gvc0(str);
            p7m0Var.getClass();
            p7m0Var.o(null, gvc0Var);
        } else {
            hvc0 hvc0Var = new hvc0(str);
            p7m0Var.getClass();
            p7m0Var.o(null, hvc0Var);
        }
    }
}
