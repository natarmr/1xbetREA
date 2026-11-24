package a;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class d430 extends i3t0 {
    public static final List v = q3d.j(new q7k0(urv.SIZE_1, sw20.SIZE_1, i0d.SIZE_1), new q7k0(urv.SIZE_3, sw20.SIZE_3, i0d.SIZE_3), new q7k0(urv.SIZE_5, sw20.SIZE_5, i0d.SIZE_5));
    public final i1w0 o;
    public final mne p;
    public final zru q;
    public final art r;
    public final zru s;
    public final h03 t;
    public final lhf0 u;

    public d430(i1w0 i1w0Var, mne mneVar, ctf0 ctf0Var, zru zruVar, art artVar, zru zruVar2, h03 h03Var, lhf0 lhf0Var, r9u r9uVar, pru pruVar) {
        ctf0Var.getClass();
        r9uVar.getClass();
        g090 g090VarP = cvm0.p(mneVar.c, mneVar.f22085a);
        oj6 oj6Var = new oj6(pruVar, artVar, r9uVar);
        v510 v510Var = new v510(ctf0Var, artVar);
        yje yjeVar = null;
        super(oj6Var, g090VarP, v510Var, (yzn0) null);
        this.o = i1w0Var;
        this.p = mneVar;
        this.q = zruVar;
        this.r = artVar;
        this.s = zruVar2;
        this.t = h03Var;
        this.u = lhf0Var;
        dvj dvjVar = mneVar.b;
        i3t0.K(this, dvjVar, null, new c430(this, yjeVar, (byte) 1), 2);
        i3t0.K(this, dvjVar, null, new c430(this, yjeVar, (byte) 0), 2);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        y330 y330Var;
        Object value2;
        y330 y330Var2;
        Object value3;
        y330 y330Var3;
        Object value4;
        y330 y330Var4;
        Object value5;
        y330 y330Var5;
        Object value6;
        p330 p330Var = (p330) obj;
        p330Var.getClass();
        boolean zEquals = p330Var.equals(d330.f5383a);
        yje yjeVar = null;
        mne mneVar = this.p;
        if (zEquals) {
            i3t0.K(this, mneVar.b, null, new hr(this, yjeVar, (byte) 20), 2);
            return;
        }
        boolean zEquals2 = p330Var.equals(m330.f21094a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (zEquals2) {
            t730 t730VarN = ufx.N(((y330) D()).b);
            this.r.getClass();
            aw20 aw20VarD = art.d(t730VarN);
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value6 = p7m0Var.getValue();
                value6.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value6, y330.a((y330) value6, false, aw20VarD, null, null, 123)));
            return;
        }
        if (p330Var.equals(n330.f22831a)) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value5 = p7m0Var2.getValue();
                value5.getClass();
                y330Var5 = (y330) value5;
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value5, y330.a(y330Var5, !y330Var5.f41932a, null, null, null, 126)));
            return;
        }
        if (p330Var.equals(c330.f3654a)) {
            E();
            return;
        }
        boolean zEquals3 = p330Var.equals(e330.f7116a);
        p0w0 p0w0Var = p0w0.f26173a;
        i1w0 i1w0Var = this.o;
        if (zEquals3) {
            if (!((y330) D()).c.equals(((y330) D()).d)) {
                G(x330.f40197a);
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (p330Var instanceof j330) {
                qy20 qy20Var = (qy20) CollectionsKt.W(((j330) p330Var).f15812a, qy20.e);
                if (qy20Var == null) {
                    return;
                }
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value4 = p7m0Var3.getValue();
                    value4.getClass();
                    y330Var4 = (y330) value4;
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value4, y330.a(y330Var4, false, aw20.a(y330Var4.c, null, null, null, null, qy20Var, null, 47), null, null, 123)));
                return;
            }
            if (p330Var instanceof o330) {
                q7k0 q7k0Var = (q7k0) CollectionsKt.W(((o330) p330Var).f24563a, v);
                if (q7k0Var == null) {
                    return;
                }
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var4.getValue();
                    value3.getClass();
                    y330Var3 = (y330) value3;
                    oyg0Var.getClass();
                } while (!p7m0Var4.m(value3, y330.a(y330Var3, false, aw20.a(y330Var3.c, q7k0Var.f28254a, q7k0Var.b, q7k0Var.c, null, null, null, 56), null, null, 123)));
                return;
            }
            if (p330Var instanceof g330) {
                s4d s4dVar = (s4d) CollectionsKt.W(((g330) p330Var).f10593a, s4d.g);
                if (s4dVar == null) {
                    return;
                }
                p7m0 p7m0Var5 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var5.getValue();
                    value2.getClass();
                    y330Var2 = (y330) value2;
                    oyg0Var.getClass();
                } while (!p7m0Var5.m(value2, y330.a(y330Var2, false, aw20.a(y330Var2.c, null, null, null, s4dVar, null, null, 55), null, null, 123)));
                return;
            }
            if (p330Var instanceof k330) {
                urv urvVar = (urv) CollectionsKt.W((int) (((k330) p330Var).f17600a / 25.0f), urv.h);
                if (urvVar == null) {
                    return;
                }
                p7m0 p7m0Var6 = ocjVar.f25029a;
                while (true) {
                    Object value7 = p7m0Var6.getValue();
                    value7.getClass();
                    y330 y330Var6 = (y330) value7;
                    oyg0Var.getClass();
                    urv urvVar2 = urvVar;
                    if (p7m0Var6.m(value7, y330.a(y330Var6, false, aw20.a(y330Var6.c, urvVar, null, null, null, null, null, 62), null, null, 123))) {
                        return;
                    } else {
                        urvVar = urvVar2;
                    }
                }
            } else if (p330Var instanceof l330) {
                sw20 sw20Var = (sw20) CollectionsKt.W((int) (((l330) p330Var).f19340a / 25.0f), sw20.g);
                if (sw20Var == null) {
                    return;
                }
                p7m0 p7m0Var7 = ocjVar.f25029a;
                while (true) {
                    Object value8 = p7m0Var7.getValue();
                    value8.getClass();
                    y330 y330Var7 = (y330) value8;
                    oyg0Var.getClass();
                    sw20 sw20Var2 = sw20Var;
                    if (p7m0Var7.m(value8, y330.a(y330Var7, false, aw20.a(y330Var7.c, null, sw20Var, null, null, null, null, 61), null, null, 123))) {
                        return;
                    } else {
                        sw20Var = sw20Var2;
                    }
                }
            } else {
                if (p330Var instanceof f330) {
                    i0d i0dVar = (i0d) CollectionsKt.W((int) (((f330) p330Var).f8842a / 25.0f), i0d.h);
                    if (i0dVar == null) {
                        return;
                    }
                    p7m0 p7m0Var8 = ocjVar.f25029a;
                    do {
                        value = p7m0Var8.getValue();
                        value.getClass();
                        y330Var = (y330) value;
                        oyg0Var.getClass();
                    } while (!p7m0Var8.m(value, y330.a(y330Var, false, aw20.a(y330Var.c, null, null, i0dVar, null, null, null, 59), null, null, 123)));
                    return;
                }
                if (!p330Var.equals(h330.f12366a)) {
                    if (p330Var.equals(i330.f14079a)) {
                        i3t0.K(this, mneVar.b, null, new bu(this, yjeVar, (byte) 12), 2);
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP2;
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
