package a;

import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.search.api.models.GlobalSearchContainerSettings;

/* JADX INFO: loaded from: classes5.dex */
public final class u8v extends i3t0 {
    public static final /* synthetic */ int x = 0;
    public final vzg0 o;
    public final String p;
    public final i1w0 q;
    public final ouu r;
    public final s31 s;
    public final cyu t;
    public final GlobalSearchContainerSettings u;
    public final x4u v;
    public final ilp0 w;

    public u8v(vzg0 vzg0Var, String str, pru pruVar, lbu lbuVar, ctf0 ctf0Var, i1w0 i1w0Var, ouu ouuVar, s31 s31Var, cyu cyuVar, mne mneVar, GlobalSearchContainerSettings globalSearchContainerSettings, x4u x4uVar, ilp0 ilp0Var) {
        ctf0Var.getClass();
        ng0 ng0Var = new ng0((Object) vzg0Var, (Object) globalSearchContainerSettings, (Object) pruVar, (Object) lbuVar, ctf0Var, (byte) 10);
        bcn bcnVar = new bcn(ctf0Var, (byte) 19);
        rwj rwjVar = mneVar.f22085a;
        super(null, ng0Var, bcnVar, cvm0.p(rwjVar, rwjVar), null);
        this.o = vzg0Var;
        this.p = str;
        this.q = i1w0Var;
        this.r = ouuVar;
        this.s = s31Var;
        this.t = cyuVar;
        this.u = globalSearchContainerSettings;
        this.v = x4uVar;
        this.w = ilp0Var;
        ilp0Var.d(((r8v) D()).f30047a);
        sac.V(jiu0.a(this), t8v.f33531a, null, mneVar.f22085a, new gkr(this, null, (byte) 18), 10);
    }

    @Override // a.diu0
    public final void v() {
        LinkedHashMap linkedHashMap = m8v.f21387a;
        String str = this.p;
        str.getClass();
        m8v.f21387a.remove(str);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        e8v e8vVar = (e8v) obj;
        e8vVar.getClass();
        super.x(e8vVar);
        if (e8vVar instanceof w7v) {
            E();
            return;
        }
        if (!e8vVar.equals(z7v.f43938a)) {
            boolean z = e8vVar instanceof b8v;
            ilp0 ilp0Var = this.w;
            vzg0 vzg0Var = this.o;
            if (z) {
                String str = ((b8v) e8vVar).f2177a;
                vzg0Var.e("SAVED_QUERY_STATE_HANDLE_KEY", str);
                ilp0Var.d(str);
                return;
            }
            if (e8vVar.equals(a8v.f446a)) {
                G(p8v.f26578a);
                return;
            }
            boolean z2 = e8vVar instanceof c8v;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (z2) {
                bfo0 bfo0Var = ((c8v) e8vVar).f3934a;
                if (((r8v) D()).c != bfo0Var) {
                    vzg0Var.e("SAVED_QUERY_STATE_HANDLE_KEY", "");
                    ilp0Var.d("");
                    bfo0 bfo0Var2 = ((r8v) D()).c;
                    wgh0 wgh0VarR0 = n6x.r0(bfo0Var2);
                    s31 s31Var = this.s;
                    s31Var.getClass();
                    i8i.D("screen", wgh0VarR0.f39117a, s31Var.f31532a, "search_call");
                    this.t.C(n6x.r0(bfo0Var2).f39117a);
                }
                vzg0Var.e("SAVED_SELECTED_TAB_HANDLE_KEY", bfo0Var);
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value3 = p7m0Var.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value3, r8v.a((r8v) value3, null, bfo0Var, 27)));
                return;
            }
            if (e8vVar instanceof y7v) {
                vzg0Var.e("SEARCH_FOCUSED_KEY", Boolean.valueOf(((r8v) D()).e));
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, r8v.a((r8v) value2, null, null, 15)));
                return;
            }
            if (!e8vVar.equals(x7v.f40433a)) {
                if (!e8vVar.equals(d8v.f5670a)) {
                    t9f.b();
                    return;
                } else {
                    this.r.q(new bb50(false), false);
                    return;
                }
            }
            vzg0Var.e("SEARCH_FOCUSED_KEY", Boolean.FALSE);
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value = p7m0Var3.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value, r8v.a((r8v) value, null, null, 15)));
            G(o8v.f24852a);
            return;
        }
        i1w0 i1w0Var = this.q;
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
    }
}
