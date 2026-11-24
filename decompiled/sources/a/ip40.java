package a;

import android.javax.sip.message.Response;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ip40 extends i3t0 {
    public static final /* synthetic */ int u = 0;
    public final bqi0 o;
    public final ctf0 p;
    public final i1w0 q;
    public final duj r;
    public final mne s;
    public bby t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip40(vzg0 vzg0Var, bqi0 bqi0Var, ivt ivtVar, ctf0 ctf0Var, i1w0 i1w0Var, duj dujVar, mne mneVar, int i, ocl oclVar) {
        Object g0g0Var;
        Object value;
        Object value2;
        Object next;
        super(vzg0Var, new dx2(i, (byte) 25), new cz(ctf0Var, oclVar, (byte) 21), cvm0.p(mneVar.c, mneVar.f22085a));
        bqi0Var.getClass();
        ivtVar.getClass();
        ctf0Var.getClass();
        this.o = bqi0Var;
        this.p = ctf0Var;
        this.q = i1w0Var;
        this.r = dujVar;
        this.s = mneVar;
        xrz xrzVar = ((gp40) D()).f11666a;
        xrzVar.getClass();
        try {
            e0g0 e0g0Var = j0g0.b;
            Iterator it = ivtVar.f15460a.c.f7160a.f10434a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((pcq) next).b.equals(xrzVar));
            g0g0Var = (pcq) next;
            if (g0g0Var == null) {
                throw new NoSuchElementException();
            }
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        e0g0 e0g0Var3 = j0g0.b;
        if (!(g0g0Var instanceof g0g0)) {
            pcq pcqVar = (pcq) g0g0Var;
            List list = pcqVar.q;
            Iterator it2 = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                }
                v85 v85Var = (v85) it2.next();
                sl slVar = pcqVar.r;
                if (slVar != null && v85Var.f36965a == slVar.f32374a) {
                    break;
                } else {
                    i2++;
                }
            }
            Integer numValueOf = i2 >= 0 ? Integer.valueOf(i2) : null;
            if (pcqVar.e || !list.isEmpty()) {
                H(new ba30(numValueOf, pcqVar, (byte) 12));
            } else {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value2 = p7m0Var.getValue();
                    value2.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value2, gp40.a((gp40) value2, null, false, null, 0, 0, 0L, false, Response.REQUEST_PENDING)));
            }
        }
        if (j0g0.a(g0g0Var) != null) {
            p7m0 p7m0Var2 = this.i.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var2.m(value, gp40.a((gp40) value, null, false, null, 0, 0, 0L, false, Response.REQUEST_PENDING)));
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        long j;
        List list;
        String strA;
        CharSequence charSequenceSubSequence;
        uo40 uo40Var = (uo40) obj;
        uo40Var.getClass();
        super.x(uo40Var);
        boolean z = false;
        v85 v85Var = null;
        v85Var = null;
        if (uo40Var instanceof so40) {
            String str = ((so40) uo40Var).f32527a;
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            String string = sb.toString();
            int length2 = string.length();
            int i2 = 0;
            while (true) {
                strA = "";
                if (i2 >= length2) {
                    charSequenceSubSequence = "";
                    break;
                } else {
                    if (string.charAt(i2) != '0') {
                        charSequenceSubSequence = string.subSequence(i2, string.length());
                        break;
                    }
                    i2++;
                }
            }
            Long lT0 = StringsKt.t0(charSequenceSubSequence.toString());
            long jLongValue = lT0 != null ? lT0.longValue() : 0L;
            if (jLongValue <= 999999999) {
                pcq pcqVar = ((gp40) D()).b;
                Long lValueOf = pcqVar != null ? Long.valueOf(pcqVar.m) : null;
                pcq pcqVar2 = ((gp40) D()).b;
                Long lValueOf2 = pcqVar2 != null ? Long.valueOf(pcqVar2.o) : null;
                ctf0 ctf0Var = this.p;
                if (lValueOf2 != null && lValueOf2.longValue() > 0 && jLongValue == lValueOf2.longValue()) {
                    strA = ctf0Var.b.a(R.string.limits_pending_match_new_limit, Arrays.copyOf(new Object[0], 0));
                } else if (lValueOf != null && jLongValue == lValueOf.longValue()) {
                    strA = ctf0Var.b.a(R.string.limits_current_match_new_limit, Arrays.copyOf(new Object[0], 0));
                }
                H(new bs0(jLongValue, strA));
                return;
            }
            return;
        }
        if (uo40Var instanceof ro40) {
            int i3 = ((ro40) uo40Var).f30819a;
            pcq pcqVar3 = ((gp40) D()).b;
            if (pcqVar3 != null && (list = pcqVar3.q) != null) {
                v85Var = (v85) CollectionsKt.W(i3, list);
            }
            if (v85Var == null) {
                return;
            }
            H(new u49((byte) 19, i3, z));
            return;
        }
        boolean zEquals = uo40Var.equals(no40.f23852a);
        p0w0 p0w0Var = p0w0.f26173a;
        i1w0 i1w0Var = this.q;
        if (zEquals) {
            bby bbyVar = this.t;
            if (bbyVar != null && bbyVar.isActive()) {
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
            if (uo40Var.equals(po40.f27314a)) {
                G(dp40.f6444a);
                return;
            }
            if (uo40Var.equals(oo40.f25575a)) {
                pcq pcqVar4 = ((gp40) D()).b;
                if (pcqVar4 == null) {
                    return;
                }
                if (((gp40) D()).g >= 0) {
                    v85 v85Var2 = (v85) CollectionsKt.W(((gp40) D()).g, pcqVar4.q);
                    if (v85Var2 == null) {
                        return;
                    } else {
                        j = v85Var2.f36965a;
                    }
                } else {
                    j = ((gp40) D()).h;
                }
                this.t = sac.V(jiu0.a(this), new bw20((Object) this, (Object) pcqVar4, (byte) 28), new np30(this, (byte) 13), this.s.b, new qe5((Object) this, j, (Object) pcqVar4, (yje) null, (byte) 7), 8);
                return;
            }
            if (uo40Var.equals(qo40.f29055a)) {
                if (!((gp40) D()).i) {
                    return;
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
            } else {
                if (!uo40Var.equals(to40.f34265a)) {
                    if (uo40Var.equals(mo40.f22118a)) {
                        E();
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
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
