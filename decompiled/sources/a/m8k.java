package a;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class m8k extends i3t0 {
    public static final /* synthetic */ int w = 0;
    public final vzg0 o;
    public final toi0 p;
    public final yoi0 q;
    public final ctf0 r;
    public final i1w0 s;
    public final duj t;
    public final mne u;
    public bby v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8k(vzg0 vzg0Var, int i, toi0 toi0Var, yoi0 yoi0Var, jvt jvtVar, ctf0 ctf0Var, i1w0 i1w0Var, duj dujVar, mne mneVar, ocl oclVar) {
        Object value;
        super(vzg0Var, new dx2(i, (byte) 9), new cz(ctf0Var, oclVar, (byte) 12), cvm0.p(mneVar.c, mneVar.f22085a));
        toi0Var.getClass();
        yoi0Var.getClass();
        jvtVar.getClass();
        ctf0Var.getClass();
        this.o = vzg0Var;
        this.p = toi0Var;
        this.q = yoi0Var;
        this.r = ctf0Var;
        this.s = i1w0Var;
        this.t = dujVar;
        this.u = mneVar;
        Object objA = jvtVar.a(((k8k) D()).f17876a);
        e0g0 e0g0Var = j0g0.b;
        if (!(objA instanceof g0g0)) {
            qcq qcqVar = (qcq) objA;
            String str = (String) vzg0Var.a("TEXT_FIELD_ERROR");
            str = str == null ? "" : str;
            Long l = (Long) vzg0Var.a("DEPOSIT_LIMIT_VALUE_KEY");
            long jLongValue = l != null ? l.longValue() : 0L;
            p7m0 p7m0Var = this.i.f25029a;
            while (true) {
                Object value2 = p7m0Var.getValue();
                value2.getClass();
                this.f.getClass();
                xrz xrzVar = qcqVar.b;
                boolean z = qcqVar.e;
                long j = (long) qcqVar.m;
                long j2 = (long) qcqVar.o;
                String str2 = qcqVar.c;
                str2.getClass();
                String str3 = str;
                if (p7m0Var.m(value2, k8k.a((k8k) value2, xrzVar, new d8k(jLongValue, j, j2, str2, z), false, str3, 20))) {
                    break;
                } else {
                    str = str3;
                }
            }
        }
        if (j0g0.a(objA) != null) {
            p7m0 p7m0Var2 = this.i.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var2.m(value, k8k.a((k8k) value, null, null, false, null, 11)));
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        String strA;
        z7k z7kVar = (z7k) obj;
        z7kVar.getClass();
        super.x(z7kVar);
        if (z7kVar instanceof x7k) {
            String str = ((x7k) z7kVar).f40417a;
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            Long lT0 = StringsKt.t0(StringsKt.y0(sb.toString(), '0'));
            long jLongValue = lT0 != null ? lT0.longValue() : 0L;
            if (jLongValue > 999999999) {
                return;
            }
            d8k d8kVar = ((k8k) D()).b;
            long j = d8kVar.d;
            ctf0 ctf0Var = this.r;
            if (jLongValue != j || j <= 0) {
                long j2 = d8kVar.c;
                strA = (jLongValue != j2 || j2 <= 0) ? "" : ctf0Var.b.a(R.string.limits_current_match_new_limit, Arrays.copyOf(new Object[0], 0));
            } else {
                strA = ctf0Var.b.a(R.string.limits_pending_match_new_limit, Arrays.copyOf(new Object[0], 0));
            }
            p7m0 p7m0Var = this.i.f25029a;
            while (true) {
                Object value = p7m0Var.getValue();
                value.getClass();
                k8k k8kVar = (k8k) value;
                this.f.getClass();
                d8k d8kVar2 = k8kVar.b;
                boolean z = d8kVar2.f5653a;
                long j3 = d8kVar2.c;
                long j4 = d8kVar2.d;
                String str2 = d8kVar2.e;
                str2.getClass();
                d8k d8kVar3 = new d8k(jLongValue, j3, j4, str2, z);
                String str3 = strA;
                if (p7m0Var.m(value, k8k.a(k8kVar, null, d8kVar3, false, str3, 21))) {
                    Long lValueOf = Long.valueOf(jLongValue);
                    vzg0 vzg0Var = this.o;
                    vzg0Var.e("DEPOSIT_LIMIT_VALUE_KEY", lValueOf);
                    vzg0Var.e("TEXT_FIELD_ERROR", str3);
                    return;
                }
                strA = str3;
            }
        } else {
            boolean zEquals = z7kVar.equals(t7k.f33471a);
            p0w0 p0w0Var = p0w0.f26173a;
            i1w0 i1w0Var = this.s;
            if (zEquals) {
                bby bbyVar = this.v;
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
                if (z7kVar.equals(v7k.f36929a)) {
                    G(h8k.f12629a);
                    return;
                }
                if (z7kVar.equals(u7k.f35187a)) {
                    bby bbyVar2 = this.v;
                    if (bbyVar2 == null || !bbyVar2.isActive()) {
                        this.v = sac.V(jiu0.a(this), new e3j(this, (byte) 10), new ucj(this, (byte) 9), this.u.b, new ya(this, null, (byte) 25), 8);
                        return;
                    }
                    return;
                }
                if (!z7kVar.equals(w7k.f38677a) && !z7kVar.equals(y7k.f42155a)) {
                    if (z7kVar.equals(s7k.f31753a)) {
                        E();
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
