package a;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class drp {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nak0 f6573a = new nak0(16);
    public boolean b;

    static {
        new drp(0);
    }

    public drp(int i) {
        a();
        a();
    }

    public static void b(qyc qycVar, dov0 dov0Var, int i, Object obj) {
        if (dov0Var == dov0.e) {
            qycVar.m(i, 3);
            ((y3) obj).h(qycVar);
            qycVar.m(i, 4);
        }
        qycVar.m(i, dov0Var.b);
        switch (dov0Var.ordinal()) {
            case 0:
                qycVar.j(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                qycVar.i(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                qycVar.o(((Long) obj).longValue());
                break;
            case 3:
                qycVar.o(((Long) obj).longValue());
                break;
            case 4:
                qycVar.k(((Integer) obj).intValue());
                break;
            case 5:
                qycVar.j(((Long) obj).longValue());
                break;
            case 6:
                qycVar.i(((Integer) obj).intValue());
                break;
            case 7:
                qycVar.f(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof lg9)) {
                    qycVar.l((String) obj);
                } else {
                    qycVar.h((lg9) obj);
                }
                break;
            case 9:
                ((y3) obj).h(qycVar);
                break;
            case 10:
                y3 y3Var = (y3) obj;
                qycVar.n(((kjt) y3Var).g(null));
                y3Var.h(qycVar);
                break;
            case 11:
                if (!(obj instanceof lg9)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    qycVar.n(length);
                    qycVar.g(bArr, 0, length);
                } else {
                    qycVar.h((lg9) obj);
                }
                break;
            case 12:
                qycVar.n(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof ts3)) {
                    qycVar.k(((Integer) obj).intValue());
                } else {
                    qycVar.k(((ts3) obj).f34442a);
                }
                break;
            case 14:
                qycVar.i(((Integer) obj).intValue());
                break;
            case 15:
                qycVar.j(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                qycVar.n((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                qycVar.o((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        nak0 nak0Var;
        if (this.b) {
            return;
        }
        int i = 0;
        while (true) {
            nak0Var = this.f6573a;
            if (i >= nak0Var.b.size()) {
                break;
            }
            Map.Entry entryC = nak0Var.c(i);
            if (entryC.getValue() instanceof kjt) {
                kjt kjtVar = (kjt) entryC.getValue();
                kjtVar.getClass();
                b5d0 b5d0Var = b5d0.c;
                b5d0Var.getClass();
                b5d0Var.a(kjtVar.getClass()).b(kjtVar);
                kjtVar.n();
            }
            i++;
        }
        if (!nak0Var.d) {
            if (nak0Var.b.size() > 0) {
                nak0Var.c(0).getKey().getClass();
                hny.b();
                return;
            } else {
                Iterator it = nak0Var.d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    hny.b();
                    return;
                }
            }
        }
        if (!nak0Var.d) {
            nak0Var.c = nak0Var.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(nak0Var.c);
            nak0Var.f = nak0Var.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(nak0Var.f);
            nak0Var.d = true;
        }
        this.b = true;
    }

    public final Object clone() {
        drp drpVar = new drp();
        nak0 nak0Var = this.f6573a;
        if (nak0Var.b.size() > 0) {
            Map.Entry entryC = nak0Var.c(0);
            if (entryC.getKey() != null) {
                hny.b();
                return null;
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = nak0Var.d().iterator();
        if (!it.hasNext()) {
            return drpVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            hny.b();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof drp) {
            return this.f6573a.equals(((drp) obj).f6573a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6573a.hashCode();
    }

    public drp() {
    }
}
