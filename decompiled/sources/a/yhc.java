package a;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class yhc extends i3t0 {
    public static final /* synthetic */ int t = 0;
    public final rqi0 o;
    public final i1w0 p;
    public final duj q;
    public final l810 r;
    public bby s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhc(mne mneVar, tju tjuVar, rqi0 rqi0Var, i1w0 i1w0Var, duj dujVar, l810 l810Var) {
        Object next;
        super(null, new zxb((byte) 15), new e6c((byte) 10), cvm0.p(mneVar.c, mneVar.f22085a), null);
        tjuVar.getClass();
        rqi0Var.getClass();
        this.o = rqi0Var;
        this.p = i1w0Var;
        this.q = dujVar;
        this.r = l810Var;
        List list = (List) dvz.f6769a.b;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((qn40) next).b != l810Var);
            qn40 qn40Var = (qn40) next;
            if (qn40Var != null) {
                List list2 = qn40Var.p;
                boolean z = true;
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (((x85) it2.next()).f40447a == qn40Var.l) {
                            z = false;
                            break;
                        }
                    }
                }
                H(new jv1((Object) qn40Var, z, (byte) 2));
                return;
            }
        }
        jf4.k(null);
        throw null;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        whc whcVar;
        Long lT0;
        jhc jhcVar = (jhc) obj;
        jhcVar.getClass();
        if (jhcVar instanceof fhc) {
            String str = ((fhc) jhcVar).f9533a;
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            if (Intrinsics.d(((whc) D()).d, sb.toString())) {
                return;
            }
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                whcVar = (whc) value;
                this.f.getClass();
                lT0 = StringsKt.t0(str);
            } while (!p7m0Var.m(value, whc.a(whcVar, lT0 != null ? lT0.longValue() : -1L, str, null, false, 243)));
            return;
        }
        byte b = 5;
        if (jhcVar instanceof ghc) {
            H(new a21(b, ((ghc) jhcVar).f11290a));
            return;
        }
        if (jhcVar.equals(dhc.f6084a)) {
            H(new sfc((byte) 3));
            return;
        }
        yje yjeVar = null;
        if (jhcVar.equals(ihc.f14773a)) {
            i3t0.K(this, null, null, new pn(this, null, (byte) 18), 3);
            return;
        }
        boolean zEquals = jhcVar.equals(bhc.f2598a);
        p0w0 p0w0Var = p0w0.f26173a;
        i1w0 i1w0Var = this.p;
        if (zEquals) {
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
            if (jhcVar.equals(ahc.f867a)) {
                E();
                return;
            }
            if (jhcVar.equals(chc.f4352a)) {
                bby bbyVar = this.s;
                if (bbyVar == null || !bbyVar.isActive()) {
                    this.s = i3t0.K(this, null, new lya(this, (byte) 16), new bu(this, yjeVar, b), 1);
                    return;
                }
                return;
            }
            if (jhcVar.equals(hhc.f13055a)) {
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
            } else {
                if (!jhcVar.equals(ehc.f7800a)) {
                    t9f.b();
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
                ListIterator listIteratorP3 = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ3, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorP3;
                    if (!pawVar3.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar3.next());
                    }
                }
            }
        }
    }
}
