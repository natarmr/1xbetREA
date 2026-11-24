package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class cl70 extends uf70 {
    public final fq d;
    public final lzt e;
    public final vcu f;
    public final mne g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl70(i1w0 i1w0Var, qa60 qa60Var, xcc xccVar, fq fqVar, lzt lztVar, vcu vcuVar, mne mneVar) {
        super(qa60Var, xccVar);
        i1w0Var.getClass();
        qa60Var.getClass();
        xccVar.getClass();
        fqVar.getClass();
        lztVar.getClass();
        vcuVar.getClass();
        this.d = fqVar;
        this.e = lztVar;
        this.f = vcuVar;
        this.g = mneVar;
    }

    @Override // a.uf70
    public final void w(zy5 zy5Var) {
        zy5Var.getClass();
        boolean z = zy5Var instanceof ry5;
        p7m0 p7m0Var = this.c;
        if (z) {
            ((tf70) p7m0Var.getValue()).getClass();
            y(new tf70(false, R.string.bet));
        } else if ((zy5Var instanceof uy5) || (zy5Var instanceof yy5)) {
            y(tf70.a((tf70) p7m0Var.getValue(), false, 1));
        } else {
            super.w(zy5Var);
        }
    }

    @Override // a.uf70
    public final void x() {
        if (this.e.a()) {
            boolean zA = this.f.a().a();
            mne mneVar = this.g;
            if (zA) {
                sac.V(jiu0.a(this), bl70.f2781a, null, mneVar.f22085a, new wk70(this, nle.f23721a, null, (byte) 1), 10);
            } else {
                sac.V(jiu0.a(this), bl70.f2781a, null, mneVar.f22085a, new wk70(this, fle.f9733a, null, (byte) 1), 10);
            }
        }
    }
}
