package a;

import android.text.TextUtils;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class wdc extends i3t0 {
    public static final /* synthetic */ int w = 0;
    public final wrz o;
    public final mne p;
    public final duj q;
    public final i1w0 r;
    public final biu s;
    public final m8c t;
    public final tyg0 u;
    public final usi0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wdc(wrz wrzVar, mne mneVar, ctf0 ctf0Var, duj dujVar, i1w0 i1w0Var, biu biuVar, m8c m8cVar, tyg0 tyg0Var, usi0 usi0Var) {
        super(null, new zxb((byte) 9), new h6c(ctf0Var, wrzVar, (byte) 4), cvm0.p(mneVar.c, mneVar.b), null);
        ctf0Var.getClass();
        biuVar.getClass();
        m8cVar.getClass();
        tyg0Var.getClass();
        usi0Var.getClass();
        this.o = wrzVar;
        this.p = mneVar;
        this.q = dujVar;
        this.r = i1w0Var;
        this.s = biuVar;
        this.t = m8cVar;
        this.u = tyg0Var;
        this.v = usi0Var;
        i3t0.K(this, null, new udc(this, (byte) 2), new pn(this, null, (byte) 17), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        x95 x95Var;
        long j;
        CharSequence charSequenceSubSequence;
        fdc fdcVar = (fdc) obj;
        fdcVar.getClass();
        boolean zEquals = fdcVar.equals(zcc.f44158a);
        int i = 0;
        Object[] objArr = 0;
        p0w0 p0w0Var = p0w0.f26173a;
        i1w0 i1w0Var = this.r;
        if (!zEquals) {
            boolean z = fdcVar instanceof ddc;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            yje yjeVar = null;
            mne mneVar = this.p;
            if (z) {
                String str = ((ddc) fdcVar).f5889a;
                int length = str.length();
                while (true) {
                    if (i >= length) {
                        charSequenceSubSequence = "";
                        break;
                    } else {
                        if (str.charAt(i) != '0') {
                            charSequenceSubSequence = str.subSequence(i, str.length());
                            break;
                        }
                        i++;
                    }
                }
                String string = charSequenceSubSequence.toString();
                if (string.length() > 9 || !TextUtils.isDigitsOnly(string)) {
                    return;
                }
                Double dI = kotlin.text.b.i(string);
                double dDoubleValue = dI != null ? dI.doubleValue() : 0.0d;
                p7m0 p7m0Var = ocjVar.f25029a;
                while (true) {
                    Object value2 = p7m0Var.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                    double d = dDoubleValue;
                    if (p7m0Var.m(value2, rdc.a((rdc) value2, null, d, null, null, false, 0.0d, null, false, null, 509))) {
                        sac.V(jiu0.a(this), new udc(this, (byte) 1), null, mneVar.b, new vdc((Object) this, d, yjeVar, (byte) 0), 10);
                        return;
                    }
                    dDoubleValue = d;
                }
            } else {
                if (fdcVar instanceof cdc) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                        x95Var = ((cdc) fdcVar).f4155a;
                        j = x95Var.f40493a;
                    } while (!p7m0Var2.m(value, rdc.a((rdc) value, null, j, null, null, false, 0.0d, null, false, new z85(j, x95Var.b, x95Var.c), 253)));
                    return;
                }
                if (fdcVar.equals(bdc.f2392a)) {
                    g8i0 g8i0Var = g8i0.f10866a;
                    wrz wrzVar = this.o;
                    if (wrzVar == g8i0Var) {
                        G(odc.f25068a);
                        return;
                    }
                    double d2 = ((rdc) D()).b;
                    tyg0 tyg0Var = this.u;
                    tyg0Var.getClass();
                    wrzVar.getClass();
                    ((ConcurrentHashMap) tyg0Var.f34754a.b.b).put(wrzVar, Double.valueOf(d2));
                    i1w0Var.getClass();
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayList, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (!pawVar.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else {
                    if (fdcVar.equals(ycc.f42378a)) {
                        E();
                        return;
                    }
                    if (!fdcVar.equals(edc.f7609a)) {
                        if (fdcVar.equals(adc.f671a)) {
                            sac.V(jiu0.a(this), new udc(this, objArr == true ? 1 : 0), new h8a(this, (byte) 14), mneVar.b, new ya(this, yjeVar, (byte) 16), 8);
                            return;
                        } else {
                            t9f.b();
                            return;
                        }
                    }
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ, 0);
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
        } else {
            if (((rdc) D()).h) {
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            ListIterator listIteratorP3 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ2, 0);
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
