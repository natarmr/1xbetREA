package a;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class kf7 extends i3t0 {
    public static final /* synthetic */ int v = 0;
    public final vzg0 o;
    public final jni0 p;
    public final ctf0 q;
    public final i1w0 r;
    public final duj s;
    public final mne t;
    public bby u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf7(vzg0 vzg0Var, int i, jni0 jni0Var, jvt jvtVar, ctf0 ctf0Var, i1w0 i1w0Var, duj dujVar, mne mneVar, ocl oclVar) {
        Object value;
        Object value2;
        super(vzg0Var, new dx2(i, (byte) 3), new cz(ctf0Var, oclVar, (byte) 5), cvm0.p(mneVar.c, mneVar.f22085a));
        jni0Var.getClass();
        jvtVar.getClass();
        ctf0Var.getClass();
        this.o = vzg0Var;
        this.p = jni0Var;
        this.q = ctf0Var;
        this.r = i1w0Var;
        this.s = dujVar;
        this.t = mneVar;
        Object objA = jvtVar.a(((hf7) D()).f12959a);
        e0g0 e0g0Var = j0g0.b;
        if (!(objA instanceof g0g0)) {
            qcq qcqVar = (qcq) objA;
            String str = (String) vzg0Var.a("TEXT_FIELD_ERROR");
            String str2 = str == null ? "" : str;
            Long l = (Long) vzg0Var.a("BET_LIMIT_VALUE_KEY");
            long jLongValue = l != null ? l.longValue() : 0L;
            Long l2 = (Long) vzg0Var.a("BET_PERIOD_VALUE_KEY");
            long jLongValue2 = l2 != null ? l2.longValue() : 0L;
            if (qcqVar.e) {
                H(new jf7(qcqVar, jLongValue, jLongValue2, str2));
            } else {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value2 = p7m0Var.getValue();
                    value2.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value2, hf7.a((hf7) value2, null, null, false, null, 11)));
            }
        }
        if (j0g0.a(objA) != null) {
            p7m0 p7m0Var2 = this.i.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var2.m(value, hf7.a((hf7) value, null, null, false, null, 11)));
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        hf7 hf7Var;
        Object value2;
        hf7 hf7Var2;
        ve7 ve7Var = (ve7) obj;
        ve7Var.getClass();
        super.x(ve7Var);
        boolean z = ve7Var instanceof te7;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        vzg0 vzg0Var = this.o;
        if (z) {
            String str = ((te7) ve7Var).f33804a;
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
            if (jLongValue <= 999999999) {
                long j = ((hf7) D()).b.e;
                ctf0 ctf0Var = this.q;
                String strA = (jLongValue != j || ((hf7) D()).b.e <= 0) ? (jLongValue != ((hf7) D()).b.d || ((hf7) D()).b.d <= 0) ? "" : ctf0Var.b.a(R.string.limits_current_match_new_limit, Arrays.copyOf(new Object[0], 0)) : ctf0Var.b.a(R.string.limits_pending_match_new_limit, Arrays.copyOf(new Object[0], 0));
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value2 = p7m0Var.getValue();
                    value2.getClass();
                    hf7Var2 = (hf7) value2;
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value2, hf7.a(hf7Var2, null, af7.a(hf7Var2.b, jLongValue, 0L, 123), false, strA, 21)));
                vzg0Var.e("BET_LIMIT_VALUE_KEY", Long.valueOf(jLongValue));
                vzg0Var.e("TEXT_FIELD_ERROR", strA);
                return;
            }
            return;
        }
        if (ve7Var instanceof pe7) {
            String str2 = ((pe7) ve7Var).f26837a;
            StringBuilder sb2 = new StringBuilder();
            int length2 = str2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                char cCharAt2 = str2.charAt(i2);
                if (Character.isDigit(cCharAt2)) {
                    sb2.append(cCharAt2);
                }
            }
            Long lT1 = StringsKt.t0(StringsKt.y0(sb2.toString(), '0'));
            long jLongValue2 = lT1 != null ? lT1.longValue() : 0L;
            if (jLongValue2 <= 999999999) {
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    hf7Var = (hf7) value;
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value, hf7.a(hf7Var, null, af7.a(hf7Var.b, 0L, jLongValue2, 95), false, null, 29)));
                vzg0Var.e("BET_PERIOD_VALUE_KEY", Long.valueOf(jLongValue2));
                return;
            }
            return;
        }
        boolean zEquals = ve7Var.equals(oe7.f25110a);
        p0w0 p0w0Var = p0w0.f26173a;
        i1w0 i1w0Var = this.r;
        if (zEquals) {
            bby bbyVar = this.u;
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
            if (ve7Var.equals(re7.f30320a)) {
                G(ef7.f7708a);
                return;
            }
            if (ve7Var.equals(qe7.f28568a)) {
                this.u = sac.V(jiu0.a(this), new os5(this, (byte) 23), new zo4(this, (byte) 24), this.t.b, new ya(this, null, (byte) 9), 8);
                return;
            }
            if (!ve7Var.equals(se7.f32063a) && !ve7Var.equals(ue7.f35510a)) {
                if (ve7Var.equals(ne7.f23371a)) {
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
