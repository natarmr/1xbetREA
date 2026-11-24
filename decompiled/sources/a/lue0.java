package a;

import org.xplatform.registration.bonus.api.BonusSelectionScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final class lue0 extends i3t0 {
    public static final /* synthetic */ int r = 0;
    public final ytt o;
    public final duj p;
    public final bby q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lue0(BonusSelectionScreenParams bonusSelectionScreenParams, ctf0 ctf0Var, ytt yttVar, mne mneVar, duj dujVar) {
        super(null, new tie0(bonusSelectionScreenParams, (byte) 11), new iv80(ctf0Var, (byte) 18), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        this.o = yttVar;
        this.p = dujVar;
        bby bbyVar = this.q;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.q = sac.V(jiu0.a(this), new eme0(this, (byte) 6), null, mneVar.b, new coc0(this, null, (byte) 17), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        tg8 tg8Var = (tg8) obj;
        tg8Var.getClass();
        if (tg8Var instanceof sg8) {
            G(new ug8(((sg8) tg8Var).f32148a));
        } else if (tg8Var.equals(rg8.f30420a)) {
            E();
        } else {
            t9f.b();
        }
    }
}
