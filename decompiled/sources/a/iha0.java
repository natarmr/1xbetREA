package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.statistic.tennis.impl.player_menu.presentation.screen.PlayersStatisticScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class iha0 extends i3t0 {
    public static final /* synthetic */ int t = 0;
    public final String o;
    public final n4u p;
    public final clc q;
    public final i1w0 r;
    public final duj s;

    public iha0(String str, n4u n4uVar, clc clcVar, i1w0 i1w0Var, m1e m1eVar, mne mneVar, ocl oclVar, duj dujVar) {
        str.getClass();
        i1w0Var.getClass();
        m1eVar.getClass();
        raa0 raa0Var = new raa0((byte) 18);
        yar yarVar = new yar(oclVar, (byte) 8);
        vs10 vs10Var = mneVar.c;
        dvj dvjVar = mneVar.b;
        super(null, raa0Var, yarVar, cvm0.p(vs10Var, dvjVar), null);
        this.o = str;
        this.p = n4uVar;
        this.q = clcVar;
        this.r = i1w0Var;
        this.s = dujVar;
        J(new fnq(m1eVar.b(), new c670(this, null, (byte) 14), (byte) 4), dvjVar, new yi90(1, this, iha0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 22));
        M();
    }

    public final void M() {
        i3t0.K(this, null, new yi90(1, this, iha0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 21), new epp(this, null, (byte) 24), 1);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        yga0 yga0Var = (yga0) obj;
        yga0Var.getClass();
        super.x(yga0Var);
        boolean z = yga0Var instanceof wga0;
        i1w0 i1w0Var = this.r;
        if (z) {
            ((bca0) ((w5z) this.q.b).c).f2347a = null;
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
            if (!(yga0Var instanceof xga0)) {
                if (yga0Var.equals(vga0.f37373a)) {
                    M();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            String str = ((xga0) yga0Var).f40828a;
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            FragmentScreen playersStatisticScreen = new PlayersStatisticScreen(str, true);
            if (playersStatisticScreen instanceof DialogScreen) {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) playersStatisticScreen)));
            } else {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(playersStatisticScreen)));
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
