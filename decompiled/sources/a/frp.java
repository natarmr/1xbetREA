package a;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class frp {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pak0 f10029a = pak0.f();
    public boolean b;

    static {
        new frp(0);
    }

    public frp(int i) {
        a();
        a();
    }

    public static void b(syc sycVar, fov0 fov0Var, int i, Object obj) {
        if (fov0Var == fov0.d) {
            sycVar.B(i, 3);
            ((a4) obj).b(sycVar);
            sycVar.B(i, 4);
        }
        sycVar.B(i, fov0Var.b);
        switch (fov0Var.ordinal()) {
            case 0:
                sycVar.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                sycVar.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                sycVar.F(((Long) obj).longValue());
                break;
            case 3:
                sycVar.F(((Long) obj).longValue());
                break;
            case 4:
                sycVar.w(((Integer) obj).intValue());
                break;
            case 5:
                sycVar.u(((Long) obj).longValue());
                break;
            case 6:
                sycVar.s(((Integer) obj).intValue());
                break;
            case 7:
                sycVar.m(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof mg9)) {
                    sycVar.A((String) obj);
                } else {
                    sycVar.q((mg9) obj);
                }
                break;
            case 9:
                ((a4) obj).b(sycVar);
                break;
            case 10:
                a4 a4Var = (a4) obj;
                sycVar.D(((mjt) a4Var).a(null));
                a4Var.b(sycVar);
                break;
            case 11:
                if (!(obj instanceof mg9)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    sycVar.D(length);
                    sycVar.n(bArr, 0, length);
                } else {
                    sycVar.q((mg9) obj);
                }
                break;
            case 12:
                sycVar.D(((Integer) obj).intValue());
                break;
            case 13:
                sycVar.w(((Integer) obj).intValue());
                break;
            case 14:
                sycVar.s(((Integer) obj).intValue());
                break;
            case 15:
                sycVar.u(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                sycVar.D((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                sycVar.F((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        pak0 pak0Var = this.f10029a;
        int size = pak0Var.f26659a.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entryC = pak0Var.c(i);
            if (entryC.getValue() instanceof mjt) {
                mjt mjtVar = (mjt) entryC.getValue();
                mjtVar.getClass();
                c5d0 c5d0Var = c5d0.c;
                c5d0Var.getClass();
                c5d0Var.a(mjtVar.getClass()).b(mjtVar);
                mjtVar.h();
            }
        }
        if (!pak0Var.c) {
            if (pak0Var.f26659a.size() > 0) {
                pak0Var.c(0).getKey().getClass();
                hny.b();
                return;
            } else {
                Iterator it = pak0Var.d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    hny.b();
                    return;
                }
            }
        }
        if (!pak0Var.c) {
            pak0Var.b = pak0Var.b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(pak0Var.b);
            pak0Var.e = pak0Var.e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(pak0Var.e);
            pak0Var.c = true;
        }
        this.b = true;
    }

    public final Object clone() {
        frp frpVar = new frp();
        pak0 pak0Var = this.f10029a;
        if (pak0Var.f26659a.size() > 0) {
            Map.Entry entryC = pak0Var.c(0);
            if (entryC.getKey() != null) {
                hny.b();
                return null;
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = pak0Var.d().iterator();
        if (!it.hasNext()) {
            return frpVar;
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
        if (obj instanceof frp) {
            return this.f10029a.equals(((frp) obj).f10029a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10029a.hashCode();
    }

    public frp() {
    }
}
