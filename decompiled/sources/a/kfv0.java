package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.wild_free_bet.impl.presentation.navigation.WildFreeBetScreens$SelectGameScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class kfv0 extends i3t0 {
    public static final /* synthetic */ int t = 0;
    public final mne o;
    public final owp0 p;
    public final lbu q;
    public final i1w0 r;
    public bby s;

    /* JADX WARN: Illegal instructions before constructor call */
    public kfv0(mne mneVar, xsu xsuVar, owp0 owp0Var, lbu lbuVar, ctf0 ctf0Var, i1w0 i1w0Var) {
        ctf0Var.getClass();
        i1w0Var.getClass();
        byte b = 4;
        super(null, new y9v0((byte) 4), new uwu0(ctf0Var, b), cvm0.p(mneVar.c, mneVar.f22085a), null);
        this.o = mneVar;
        this.p = owp0Var;
        this.q = lbuVar;
        this.r = i1w0Var;
        sac.T(new fnq(new va(((pfv0) ((ikt0) xsuVar.f41434a).f14945a).f26923a, (byte) 25), new b6o0(this, (yje) null, b), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), foe.h);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        dfv0 dfv0Var = (dfv0) obj;
        dfv0Var.getClass();
        super.x(dfv0Var);
        if (dfv0Var instanceof zev0) {
            bby bbyVar = this.s;
            yje yjeVar = null;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            this.s = sac.V(jiu0.a(this), jfv0.f16448a, null, this.o.b, new k6s0(this, yjeVar, (byte) 25), 10);
            return;
        }
        if (dfv0Var instanceof yev0) {
            E();
            return;
        }
        if (!(dfv0Var instanceof afv0)) {
            boolean z = dfv0Var instanceof bfv0;
            owp0 owp0Var = this.p;
            if (z) {
                wim wimVar = ((bfv0) dfv0Var).f2524a;
                if (wimVar.b instanceof ajm) {
                    return;
                }
                ((pfv0) ((ikt0) owp0Var.b).f14945a).f26923a.g(Long.valueOf(wimVar.f39221a));
                return;
            }
            if (!(dfv0Var instanceof cfv0)) {
                t9f.b();
                return;
            }
            pbv pbvVar = ((hfv0) D()).f12989a;
            if (pbvVar != null) {
                ((pfv0) ((ikt0) owp0Var.b).f14945a).f26923a.g(Long.valueOf(pbvVar.f26728a));
                return;
            }
            return;
        }
        i1w0 i1w0Var = this.r;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        FragmentScreen wildFreeBetScreens$SelectGameScreen = new WildFreeBetScreens$SelectGameScreen();
        if (wildFreeBetScreens$SelectGameScreen instanceof DialogScreen) {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) wildFreeBetScreens$SelectGameScreen)));
        } else {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(wildFreeBetScreens$SelectGameScreen)));
        }
        ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
