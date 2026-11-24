package a;

import org.xplatform.registration_default.impl.presentation.registration_bonus.models.RegistrationBonusDefaultScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final class gue0 extends i3t0 {
    public static final /* synthetic */ int r = 0;
    public final ytt o;
    public final duj p;
    public final bby q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gue0(RegistrationBonusDefaultScreenParams registrationBonusDefaultScreenParams, ctf0 ctf0Var, ytt yttVar, mne mneVar, duj dujVar) {
        super(null, new tie0(registrationBonusDefaultScreenParams, (byte) 9), new iv80(ctf0Var, (byte) 17), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        this.o = yttVar;
        this.p = dujVar;
        bby bbyVar = this.q;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.q = sac.V(jiu0.a(this), new eme0(this, (byte) 5), null, mneVar.b, new coc0(this, null, (byte) 16), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        kg8 kg8Var = (kg8) obj;
        kg8Var.getClass();
        if (kg8Var instanceof jg8) {
            jg8 jg8Var = (jg8) kg8Var;
            G(new lg8(jg8Var.f16469a, jg8Var.b));
        } else if (kg8Var.equals(ig8.f14724a)) {
            E();
        } else {
            t9f.b();
        }
    }
}
