package a;

import org.xplatform.mailing.api.presentation.models.TelegramBonusCodeParams;

/* JADX INFO: loaded from: classes3.dex */
public final class xup0 extends i3t0 {
    public final d8c o;

    public xup0(vzg0 vzg0Var, ctf0 ctf0Var, d8c d8cVar, rpt rptVar, mne mneVar, TelegramBonusCodeParams telegramBonusCodeParams) {
        ctf0Var.getClass();
        nxo0 nxo0Var = new nxo0(telegramBonusCodeParams, (byte) 24);
        itn0 itn0Var = new itn0(ctf0Var, rptVar, (byte) 27);
        rwj rwjVar = mneVar.f22085a;
        super(null, nxo0Var, itn0Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = d8cVar;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        nup0 nup0Var = (nup0) obj;
        nup0Var.getClass();
        super.x(nup0Var);
        if (nup0Var instanceof mup0) {
            mup0 mup0Var = (mup0) nup0Var;
            if (mup0Var.equals(kup0.f18922a)) {
                G(pup0.f27628a);
                return;
            } else if (!mup0Var.equals(lup0.f20684a)) {
                t9f.b();
                return;
            } else {
                G(new qup0(((tup0) D()).f34562a));
                G(new rup0(((tup0) D()).b));
                return;
            }
        }
        if (nup0Var.equals(hup0.f13693a)) {
            E();
        } else if (nup0Var.equals(iup0.f15408a)) {
            sac.V(jiu0.a(this), vup0.f38060a, null, null, new wup0(this, null, (byte) 0), 14);
        } else {
            if (nup0Var.equals(jup0.f17168a)) {
                return;
            }
            t9f.b();
        }
    }
}
