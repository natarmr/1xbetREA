package a;

import android.text.format.DateFormat;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class emv0 extends i3t0 {
    public static final /* synthetic */ int A = 0;
    public final fhj o;
    public final bzu p;
    public final String q;
    public final long r;
    public final i1w0 s;
    public final duj t;
    public final ieu u;
    public final do20 v;
    public final mne w;
    public final cge0 x;
    public final c4m0 y;
    public bby z;

    public emv0(qzt qztVar, fhj fhjVar, bzu bzuVar, wyu wyuVar, String str, long j, i1w0 i1w0Var, duj dujVar, m1e m1eVar, zqu zquVar, ieu ieuVar, do20 do20Var, ocl oclVar, mne mneVar, uyu uyuVar, pru pruVar, cge0 cge0Var, r9u r9uVar) {
        wyuVar.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        b29 b29Var = new b29(fhjVar, str, j, wyuVar, qztVar, pruVar);
        xuh xuhVar = new xuh(oclVar, r9uVar, (byte) 14);
        rwj rwjVar = mneVar.f22085a;
        super(null, b29Var, xuhVar, cvm0.p(rwjVar, rwjVar), null);
        this.o = fhjVar;
        this.p = bzuVar;
        this.q = str;
        this.r = j;
        this.s = i1w0Var;
        this.t = dujVar;
        this.u = ieuVar;
        this.v = do20Var;
        this.w = mneVar;
        this.x = cge0Var;
        nfm0 nfm0Var = zquVar.f44824a;
        nfm0Var.getClass();
        ddm0 ddm0Var = nfm0Var.c;
        ddm0Var.getClass();
        yje yjeVar = null;
        sac.T(new fnq(dtb.U(new zj2(vtb.M(ddm0Var.c), ddm0Var, str, (byte) 20), 1), new n7t0(this, yjeVar, (byte) 18), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new k5r0(2, this, emv0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 22));
        sac.T(new fnq(uyuVar.f36509a.h(), new bmv0(this, yjeVar, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), rwjVar), cmv0.h);
        c4m0 c4m0Var = this.y;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.y = sac.T(new fnq(m1eVar.b(), new k6s0(this, yjeVar, (byte) 27), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new bmv0(this, yjeVar, (byte) 0));
        }
        M();
    }

    public final void M() {
        Object value;
        bby bbyVar = this.z;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, vlv0.a((vlv0) value, null, true, false, false, null, null, null, null, null, null, 16271)));
            this.z = sac.V(jiu0.a(this), new amv0(this, (byte) 0), null, this.w.b, new xj1((diu0) this, (yje) null, (byte) 24), 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(xqj0 xqj0Var, zje zjeVar) {
        dmv0 dmv0Var;
        Object value;
        if (zjeVar instanceof dmv0) {
            dmv0Var = (dmv0) zjeVar;
            int i = dmv0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                dmv0Var.l = i - Integer.MIN_VALUE;
            } else {
                dmv0Var = new dmv0(this, zjeVar);
            }
        } else {
            dmv0Var = new dmv0(this, zjeVar);
        }
        Object objF = dmv0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = dmv0Var.l;
        if (i2 == 0) {
            z1x.P(objF);
            dmv0Var.i = xqj0Var;
            dmv0Var.l = 1;
            objF = this.u.f(this.r, dmv0Var);
            if (objF == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xqj0Var = dmv0Var.i;
            z1x.P(objF);
        }
        String str = ((ril0) objF).b;
        String strK = pzb.K(xqj0Var.c, new znq0(xqj0Var.b), DateFormat.is24HourFormat(((nfm0) this.v.f6397a).e.f33916a));
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, vlv0.a((vlv0) value, null, false, false, false, null, null, str, xqj0Var.o, strK, null, 9215)));
        return Unit.f46060a;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        rlv0 rlv0Var = (rlv0) obj;
        rlv0Var.getClass();
        super.x(rlv0Var);
        boolean zEquals = rlv0Var.equals(olv0.f25476a);
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
            if (!(rlv0Var instanceof plv0)) {
                if (rlv0Var.equals(qlv0.f28953a)) {
                    M();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            wkv0 wkv0Var = ((plv0) rlv0Var).f27203a;
            if (wkv0Var.equals(vkv0.b)) {
                return;
            }
            if (!wkv0Var.equals(ukv0.b)) {
                if (wkv0Var.equals(tkv0.b)) {
                    i1w0Var.d(new amv0(this, (byte) 1));
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            String str = ((vlv0) D()).i;
            this.x.getClass();
            FragmentScreen fragmentScreenG = cge0.g(str, this.r, false);
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            if (fragmentScreenG instanceof DialogScreen) {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenG)));
            } else {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenG)));
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
