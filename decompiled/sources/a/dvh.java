package a;

import android.text.format.DateFormat;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import org.xplatform.statistic.cycling.impl.cycling_results.presentation.CyclingResultsTableFragmentScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class dvh extends i3t0 {
    public static final /* synthetic */ int z = 0;
    public final fhj o;
    public final cmt p;
    public final String q;
    public final long r;
    public final i1w0 s;
    public final duj t;
    public final ieu u;
    public final do20 v;
    public final cge0 w;
    public final mne x;
    public final c4m0 y;

    public dvh(ctf0 ctf0Var, qzt qztVar, fhj fhjVar, cmt cmtVar, wyu wyuVar, String str, long j, i1w0 i1w0Var, duj dujVar, m1e m1eVar, zqu zquVar, ieu ieuVar, do20 do20Var, ocl oclVar, cge0 cge0Var, mne mneVar, uyu uyuVar, pru pruVar, r9u r9uVar) {
        ctf0Var.getClass();
        wyuVar.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        wuh wuhVar = new wuh(j, qztVar, ctf0Var, fhjVar, str, wyuVar, pruVar);
        byte b = 0;
        xuh xuhVar = new xuh(oclVar, r9uVar, b);
        rwj rwjVar = mneVar.f22085a;
        super(null, wuhVar, xuhVar, cvm0.p(rwjVar, rwjVar), null);
        this.o = fhjVar;
        this.p = cmtVar;
        this.q = str;
        this.r = j;
        this.s = i1w0Var;
        this.t = dujVar;
        this.u = ieuVar;
        this.v = do20Var;
        this.w = cge0Var;
        this.x = mneVar;
        nfm0 nfm0Var = zquVar.f44824a;
        nfm0Var.getClass();
        ddm0 ddm0Var = nfm0Var.c;
        ddm0Var.getClass();
        yje yjeVar = null;
        this.y = sac.T(new fnq(dtb.U(new zj2(vtb.M(ddm0Var.c), ddm0Var, str, (byte) 20), 1), new b1f((Object) this, yjeVar, (byte) 12), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new d7e(2, this, dvh.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 20));
        sac.T(new fnq(uyuVar.f36509a.h(), new avh(this, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), rwjVar), bvh.h);
        sac.T(new fnq(m1eVar.b(), new igb((Object) this, yjeVar, (byte) 26), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new avh(this, yjeVar, b));
    }

    public final void M() {
        Object value;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, ruh.a((ruh) value, null, true, false, false, null, null, null, null, null, null, 8135)));
        sac.V(jiu0.a(this), new yuh(this, (byte) 1), null, this.x.b, new lv((diu0) this, (yje) null, (byte) 4), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(xqj0 xqj0Var, zje zjeVar) {
        cvh cvhVar;
        Object value;
        if (zjeVar instanceof cvh) {
            cvhVar = (cvh) zjeVar;
            int i = cvhVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                cvhVar.l = i - Integer.MIN_VALUE;
            } else {
                cvhVar = new cvh(this, zjeVar);
            }
        } else {
            cvhVar = new cvh(this, zjeVar);
        }
        Object objF = cvhVar.j;
        wne wneVar = wne.f39444a;
        int i2 = cvhVar.l;
        if (i2 == 0) {
            z1x.P(objF);
            cvhVar.i = xqj0Var;
            cvhVar.l = 1;
            objF = this.u.f(this.r, cvhVar);
            if (objF == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xqj0Var = cvhVar.i;
            z1x.P(objF);
        }
        String str = ((ril0) objF).b;
        String strK = pzb.K(xqj0Var.c, new znq0(xqj0Var.b), DateFormat.is24HourFormat(((nfm0) this.v.f6397a).e.f33916a));
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, ruh.a((ruh) value, null, false, false, false, null, null, str, xqj0Var.o, strK, null, 4607)));
        return Unit.f46060a;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        juh juhVar = (juh) obj;
        juhVar.getClass();
        super.x(juhVar);
        boolean zEquals = juhVar.equals(guh.f11928a);
        byte b = 0;
        i1w0 i1w0Var = this.s;
        if (zEquals) {
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
            if (!(juhVar instanceof huh)) {
                if (juhVar.equals(iuh.f15395a)) {
                    M();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            lvh lvhVar = ((huh) juhVar).f13679a;
            if (lvhVar instanceof jvh) {
                i1w0Var.d(new yuh(this, b));
                return;
            }
            if (!(lvhVar instanceof ivh)) {
                if (lvhVar instanceof kvh) {
                    return;
                }
                t9f.b();
            } else {
                k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                k0w0VarI.h(new CyclingResultsTableFragmentScreen(((ruh) D()).i));
                ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
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
}
