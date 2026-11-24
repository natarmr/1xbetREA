package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.statistic.player.impl.player.player_menu.presentation.screen.PlayerMainScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class ume0 extends i3t0 {
    public static final /* synthetic */ int t = 0;
    public final zqu o;
    public final String p;
    public final long q;
    public final i1w0 r;
    public final duj s;

    public ume0(ctf0 ctf0Var, zqu zquVar, String str, long j, i1w0 i1w0Var, duj dujVar, ocl oclVar, mne mneVar) {
        ctf0Var.getClass();
        o6e0 o6e0Var = new o6e0((byte) 21);
        gpb0 gpb0Var = new gpb0(oclVar, ctf0Var, (byte) 5);
        rwj rwjVar = mneVar.f22085a;
        super(null, o6e0Var, gpb0Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = zquVar;
        this.p = str;
        this.q = j;
        this.r = i1w0Var;
        this.s = dujVar;
        sac.V(jiu0.a(this), new eme0(this, (byte) 1), null, mneVar.b, new coc0(this, null, (byte) 13), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        jme0 jme0Var = (jme0) obj;
        jme0Var.getClass();
        super.x(jme0Var);
        boolean z = jme0Var instanceof hme0;
        i1w0 i1w0Var = this.r;
        if (z) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (!(jme0Var instanceof ime0)) {
                t9f.b();
                return;
            }
            FragmentScreen playerMainScreen = new PlayerMainScreen(((ime0) jme0Var).f15021a, this.q, this.p, oaa0.b);
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            if (playerMainScreen instanceof DialogScreen) {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) playerMainScreen)));
            } else {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(playerMainScreen)));
            }
            ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorO;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
