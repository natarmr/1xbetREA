package a;

import java.io.File;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class eoj0 extends i3t0 {
    public static final /* synthetic */ int D = 0;
    public bby A;
    public bby B;
    public bby C;
    public final ieu o;
    public final e1u p;
    public final ugf0 q;
    public final bwl r;
    public final nek s;
    public final aqt t;
    public final mne u;
    public final String v;
    public final File w;
    public final i1w0 x;
    public final duj y;
    public final ctf0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public eoj0(ieu ieuVar, e1u e1uVar, ugf0 ugf0Var, bwl bwlVar, nek nekVar, aqt aqtVar, m1e m1eVar, mne mneVar, String str, File file, i1w0 i1w0Var, duj dujVar, ctf0 ctf0Var, ocl oclVar) {
        aqtVar.getClass();
        m1eVar.getClass();
        str.getClass();
        file.getClass();
        i1w0Var.getClass();
        ctf0Var.getClass();
        g090 g090VarP = cvm0.p(mneVar.c, mneVar.f22085a);
        super(new hwi0((byte) 11), g090VarP, new gpb0(ctf0Var, oclVar, (byte) 11), (yzn0) null);
        this.o = ieuVar;
        this.p = e1uVar;
        this.q = ugf0Var;
        this.r = bwlVar;
        this.s = nekVar;
        this.t = aqtVar;
        this.u = mneVar;
        this.v = str;
        this.w = file;
        this.x = i1w0Var;
        this.y = dujVar;
        this.z = ctf0Var;
        M();
        i3t0.L(this, new fnq(new qaf0(m1eVar.a(), (byte) 4), new tmg0(this, null, (byte) 12), (byte) 4), null, new uki0(1, this, eoj0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 27), 1);
    }

    public final void M() {
        Object value;
        bby bbyVar = this.A;
        if (bbyVar != null) {
            v3c.N(bbyVar);
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, rnj0.a((rnj0) value, null, true, false, false, 9)));
        this.A = I(this.u.b, new rai0(this, (byte) 14), new aoj0(this, null, (byte) 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        if (r2 == r4) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(kotlin.jvm.functions.Function1 r19, a.zje r20) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.eoj0.N(kotlin.jvm.functions.Function1, a.zje):java.lang.Object");
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        mmj0 mmj0Var = (mmj0) obj;
        mmj0Var.getClass();
        super.x(mmj0Var);
        if (!mmj0Var.equals(imj0.f15029a)) {
            if (mmj0Var.equals(kmj0.f18542a)) {
                G(mnj0.f22092a);
                return;
            }
            boolean zEquals = mmj0Var.equals(lmj0.f20298a);
            byte b = 1;
            yje yjeVar = null;
            mne mneVar = this.u;
            if (zEquals) {
                bby bbyVar = this.C;
                if (bbyVar == null || !bbyVar.isActive()) {
                    this.C = I(mneVar.b, new uki0(1, this, eoj0.class, "onShareCouponError", "onShareCouponError(Ljava/lang/Throwable;)V", 0, (byte) 26), new aoj0(this, yjeVar, (byte) 4));
                    return;
                }
                return;
            }
            if (mmj0Var.equals(jmj0.f16769a)) {
                M();
                return;
            }
            if (mmj0Var.equals(hmj0.f13310a)) {
                bby bbyVar2 = this.B;
                if (bbyVar2 == null || !bbyVar2.isActive()) {
                    this.B = I(mneVar.b, new uki0(1, this, eoj0.class, "onSaveCouponError", "onSaveCouponError(Ljava/lang/Throwable;)V", 0, (byte) 25), new aoj0(this, yjeVar, (byte) 2));
                    return;
                }
                return;
            }
            if (!mmj0Var.equals(emj0.f8049a)) {
                if (mmj0Var instanceof gmj0) {
                    G(new pnj0(this.z.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0)), ""));
                    return;
                } else if (mmj0Var.equals(fmj0.f9785a)) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            if (((rnj0) D()).b || ((rnj0) D()).d) {
                return;
            }
            I(mneVar.c, new uki0(1, this, eoj0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 24), new aoj0(this, yjeVar, b));
            return;
        }
        i1w0 i1w0Var = this.x;
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
