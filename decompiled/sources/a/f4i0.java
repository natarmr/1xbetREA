package a;

import java.util.Calendar;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes5.dex */
public final class f4i0 extends i3t0 {
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        long j;
        long j2;
        Long l;
        String str;
        SimpleDate simpleDateG0;
        u1i0 u1i0Var = (u1i0) obj;
        u1i0Var.getClass();
        boolean zEquals = u1i0Var.equals(s1i0.f31457a);
        z1i0 z1i0Var = z1i0.f43622a;
        if (zEquals) {
            G(z1i0Var);
            return;
        }
        if (u1i0Var instanceof r1i0) {
            Calendar calendar = Calendar.getInstance();
            Long l2 = ((l2i0) D()).c;
            if (l2 != null) {
                long jLongValue = l2.longValue();
                calendar.getClass();
                simpleDateG0 = bsr0.g0(jLongValue, calendar);
            } else {
                simpleDateG0 = null;
            }
            SimpleDate simpleDate = ((r1i0) u1i0Var).f29682a;
            if (simpleDate.equals(simpleDateG0)) {
                G(z1i0Var);
                return;
            } else {
                G(new a2i0(new h2i0(simpleDate.f47286a, simpleDate.b - 1, simpleDate.c)));
                return;
            }
        }
        if (u1i0Var.equals(q1i0.f27955a)) {
            E();
            return;
        }
        if (!(u1i0Var instanceof t1i0)) {
            t9f.b();
            return;
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            l2i0 l2i0Var = (l2i0) value;
            this.f.getClass();
            j = l2i0Var.f19310a;
            j2 = l2i0Var.b;
            l = l2i0Var.c;
            str = l2i0Var.d;
            str.getClass();
        } while (!p7m0Var.m(value, new l2i0(j, j2, l, str, true)));
    }
}
