package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class qc3 extends eiu0 implements lc3 {
    public final rc3 c;
    public final fxu d;
    public final oeg0 e;
    public final p7m0 f;
    public final p7m0 g;

    public qc3(rc3 rc3Var, svu svuVar, fxu fxuVar, oeg0 oeg0Var) {
        oeg0Var.getClass();
        this.c = rc3Var;
        this.d = fxuVar;
        this.e = oeg0Var;
        this.f = q7m0.a(new mc3(rc3Var.f30220a == CyberGamesPage.Virtual.INSTANCE.f46556a, false));
        this.g = q7m0.a(new kc3("", svuVar.l() ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder, new jc3("")));
    }

    @Override // a.lc3
    public final void a() {
        i1w0 i1w0VarC = this.e.c();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarC, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarC.a((oe50) pawVar.next());
            }
        }
    }

    @Override // a.lc3
    public final void f() {
        qjj.W(jiu0.a(s()), null, null, new pc3(this, null, (byte) 0), 3);
    }

    @Override // a.eiu0
    public final void u(diu0 diu0Var, vzg0 vzg0Var) {
        vzg0Var.getClass();
        this.f7878a = diu0Var;
        this.b = vzg0Var;
        qjj.W(jiu0.a(diu0Var), null, null, new pc3(this, null, (byte) 1), 3);
    }
}
