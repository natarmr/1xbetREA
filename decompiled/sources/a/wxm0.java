package a;

import org.xplatform.cyber.game.core.betting.presentation.sub_games_filter.SubGamesFilterBottomSheetParams;

/* JADX INFO: loaded from: classes4.dex */
public final class wxm0 extends i3t0 {
    public static final /* synthetic */ int q = 0;
    public final sbu o;
    public bby p;

    /* JADX WARN: Illegal instructions before constructor call */
    public wxm0(SubGamesFilterBottomSheetParams subGamesFilterBottomSheetParams, sbu sbuVar, g2v g2vVar, ctf0 ctf0Var, mne mneVar) {
        ctf0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        super(new jfm0(subGamesFilterBottomSheetParams, (byte) 5), cvm0.p(rwjVar, rwjVar), new o20(g2vVar, ctf0Var, (byte) 27), (yzn0) null);
        this.o = sbuVar;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        exm0 exm0Var = (exm0) obj;
        exm0Var.getClass();
        super.x(exm0Var);
        yje yjeVar = null;
        if (exm0Var instanceof cxm0) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, txm0.a((txm0) value, null, null, ((cxm0) exm0Var).f5128a, 3)));
            return;
        }
        if (exm0Var instanceof dxm0) {
            G(new rxm0(((dxm0) exm0Var).f6854a));
            return;
        }
        if (exm0Var.equals(zwm0.f45113a)) {
            E();
            return;
        }
        if (exm0Var.equals(axm0.f1630a)) {
            bby bbyVar = this.p;
            if (bbyVar != null) {
                bbyVar.cancel(null);
                return;
            }
            return;
        }
        if (!exm0Var.equals(bxm0.f3381a)) {
            t9f.b();
            return;
        }
        bby bbyVar2 = this.p;
        if (bbyVar2 != null) {
            bbyVar2.cancel(null);
        }
        this.p = i3t0.K(this, null, null, new hhb0(this, yjeVar, (byte) 17), 3);
    }
}
