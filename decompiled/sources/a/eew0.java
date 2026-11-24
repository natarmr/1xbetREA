package a;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class eew0 {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ggw0 f7694a = new ggw0();
    public boolean b;

    static {
        new eew0(0);
    }

    public eew0(int i) {
        a();
        a();
    }

    public static void b(aew0 aew0Var, ugw0 ugw0Var, int i, Object obj) {
        if (ugw0Var == ugw0.d) {
            aew0Var.d(i, 3);
            ((mew0) ((jdw0) obj)).d(aew0Var);
            aew0Var.d(i, 4);
            return;
        }
        aew0Var.d(i, ugw0Var.b);
        vgw0 vgw0Var = vgw0.f37403a;
        switch (ugw0Var.ordinal()) {
            case 0:
                aew0Var.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                aew0Var.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                aew0Var.t(((Long) obj).longValue());
                break;
            case 3:
                aew0Var.t(((Long) obj).longValue());
                break;
            case 4:
                aew0Var.q(((Integer) obj).intValue());
                break;
            case 5:
                aew0Var.u(((Long) obj).longValue());
                break;
            case 6:
                aew0Var.s(((Integer) obj).intValue());
                break;
            case 7:
                aew0Var.p(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof qdw0)) {
                    aew0Var.v((String) obj);
                } else {
                    aew0Var.m((qdw0) obj);
                }
                break;
            case 9:
                ((mew0) ((jdw0) obj)).d(aew0Var);
                break;
            case 10:
                aew0Var.o((jdw0) obj);
                break;
            case 11:
                if (!(obj instanceof qdw0)) {
                    byte[] bArr = (byte[]) obj;
                    aew0Var.n(bArr, bArr.length);
                } else {
                    aew0Var.m((qdw0) obj);
                }
                break;
            case 12:
                aew0Var.r(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof pew0)) {
                    aew0Var.q(((Integer) obj).intValue());
                } else {
                    aew0Var.q(((pew0) obj).zza());
                }
                break;
            case 14:
                aew0Var.s(((Integer) obj).intValue());
                break;
            case 15:
                aew0Var.u(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                aew0Var.r((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                aew0Var.t((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        ggw0 ggw0Var = this.f7694a;
        int i = ggw0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ggw0Var.a(i2).b;
            if (obj instanceof mew0) {
                mew0 mew0Var = (mew0) obj;
                agw0.c.a(mew0Var.getClass()).h(mew0Var);
                mew0Var.f();
            }
        }
        Iterator it = ggw0Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof mew0) {
                mew0 mew0Var2 = (mew0) value;
                agw0.c.a(mew0Var2.getClass()).h(mew0Var2);
                mew0Var2.f();
            }
        }
        if (!ggw0Var.d) {
            if (ggw0Var.b > 0) {
                ggw0Var.a(0).f13033a.getClass();
                hny.b();
                return;
            } else {
                Iterator it2 = ggw0Var.b().iterator();
                if (it2.hasNext()) {
                    ((Map.Entry) it2.next()).getKey().getClass();
                    hny.b();
                    return;
                }
            }
        }
        if (!ggw0Var.d) {
            ggw0Var.c = ggw0Var.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ggw0Var.c);
            ggw0Var.f = ggw0Var.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ggw0Var.f);
            ggw0Var.d = true;
        }
        this.b = true;
    }

    public final Object clone() {
        eew0 eew0Var = new eew0();
        ggw0 ggw0Var = this.f7694a;
        if (ggw0Var.b > 0) {
            ggw0Var.a(0).f13033a.getClass();
            hny.b();
            return null;
        }
        Iterator it = ggw0Var.b().iterator();
        if (!it.hasNext()) {
            return eew0Var;
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
        if (obj instanceof eew0) {
            return this.f7694a.equals(((eew0) obj).f7694a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7694a.hashCode();
    }

    public eew0() {
    }
}
