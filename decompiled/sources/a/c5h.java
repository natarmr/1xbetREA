package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.presentation.CyberMainDisciplinesParams;

/* JADX INFO: loaded from: classes4.dex */
public final class c5h extends w46 {
    public final CyberMainDisciplinesParams b;
    public final lbu c;
    public final hzg d;
    public final pru e;
    public final hvt f;
    public final poq0 g;
    public final s31 h;
    public final ih5 i;
    public final m1e j;
    public final duj k;
    public final rpt l;
    public final mne m;
    public final cyu n;
    public final zr1 o;
    public final ctf0 p;
    public final p7m0 q;
    public final ol60 r;
    public final n0o0 s;
    public final p7m0 t;
    public bby u;
    public bby v;

    public c5h(CyberMainDisciplinesParams cyberMainDisciplinesParams, lbu lbuVar, hzg hzgVar, pru pruVar, hvt hvtVar, poq0 poq0Var, s31 s31Var, ih5 ih5Var, m1e m1eVar, duj dujVar, rpt rptVar, mne mneVar, cyu cyuVar, zr1 zr1Var, ctf0 ctf0Var) {
        int i;
        m1eVar.getClass();
        ctf0Var.getClass();
        this.b = cyberMainDisciplinesParams;
        this.c = lbuVar;
        this.d = hzgVar;
        this.e = pruVar;
        this.f = hvtVar;
        this.g = poq0Var;
        this.h = s31Var;
        this.i = ih5Var;
        this.j = m1eVar;
        this.k = dujVar;
        this.l = rptVar;
        this.m = mneVar;
        this.n = cyuVar;
        this.o = zr1Var;
        this.p = ctf0Var;
        byte b = 0;
        lsm0 lsm0Var = ctf0Var.b;
        boolean z = cyberMainDisciplinesParams instanceof CyberMainDisciplinesParams.Disciplines;
        this.q = q7m0.a(new l120(lsm0Var.a(R.string.cyber_sport, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.search, Arrays.copyOf(new Object[0], 0)), "", false, false, z, true, (((CyberMainDisciplinesParams.Disciplines) cyberMainDisciplinesParams).f46560a instanceof CyberGamesPage.Real) && !z));
        this.r = new ol60(3);
        n0o0 n0o0VarB = maz.b(new e8g(this, (byte) 15));
        this.s = n0o0VarB;
        List list = (List) n0o0VarB.getValue();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (true) {
            yje yjeVar = null;
            if (!it.hasNext()) {
                int iIndexOf = ((List) this.s.getValue()).indexOf(((CyberMainDisciplinesParams.Disciplines) this.b).f46560a);
                this.t = q7m0.a(new rz10(arrayList, ucx.X(this.e.a()), iIndexOf == -1 ? 0 : iIndexOf));
                slb.U(new fnq(this.j.b(), new a5h(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), this.m.b));
                return;
            }
            CyberGamesPage cyberGamesPage = (CyberGamesPage) it.next();
            ctf0 ctf0Var2 = this.p;
            if (cyberGamesPage != null) {
                if (cyberGamesPage instanceof CyberGamesPage.Real) {
                    i = R.string.cyber_games_page_real;
                } else if (cyberGamesPage instanceof CyberGamesPage.Virtual) {
                    i = R.string.cyber_games_page_virtual;
                } else if (cyberGamesPage instanceof CyberGamesPage.OneXCyber) {
                    i = R.string.cyber_games_page_onex_cyber;
                }
                arrayList.add(new qz10(ctf0Var2.b.a(i, Arrays.copyOf(new Object[0], 0)), cyberGamesPage));
            }
            t9f.b();
            throw null;
        }
    }

    public final void w() {
        bby bbyVar = this.v;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.v = sac.V(jiu0.a(this), new x6f(1, this.k, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, this.m.b, new a5h(this, yjeVar, (byte) 1), 10);
    }
}
