package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class fx40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hz40 f10291a;

    public /* synthetic */ fx40(hz40 hz40Var) {
        this.f10291a = hz40Var;
    }

    public static final void a(hz40 hz40Var, Object obj, Object obj2) {
        int iF = hz40Var.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : hz40Var.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof vy40) {
                vy40 vy40Var = (vy40) obj3;
                vy40Var.a(obj2);
                obj2 = vy40Var;
            } else {
                Object[] objArr = w960.f38764a;
                vy40 vy40Var2 = new vy40(2);
                vy40Var2.a(obj3);
                vy40Var2.a(obj2);
                obj2 = vy40Var2;
            }
        }
        if (!z) {
            hz40Var.c[iF] = obj2;
            return;
        }
        int i = ~iF;
        hz40Var.b[i] = obj;
        hz40Var.c[i] = obj2;
    }

    public static final Object b(hz40 hz40Var, ju40 ju40Var) {
        Object objG = hz40Var.g(ju40Var);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof vy40)) {
            hz40Var.l(ju40Var);
            return objG;
        }
        vy40 vy40Var = (vy40) objG;
        if (vy40Var.i()) {
            v4i0.o("List is empty.");
            return null;
        }
        int i = vy40Var.b - 1;
        Object objG2 = vy40Var.g(i);
        vy40Var.l(i);
        objG2.getClass();
        if (vy40Var.i()) {
            hz40Var.l(ju40Var);
        }
        if (vy40Var.b == 1) {
            hz40Var.n(ju40Var, vy40Var.f());
        }
        return objG2;
    }

    public static final void c(hz40 hz40Var, ju40 ju40Var, Function1 function1) {
        Object objG = hz40Var.g(ju40Var);
        if (objG != null) {
            if (!(objG instanceof vy40)) {
                if (((Boolean) function1.invoke(objG)).booleanValue()) {
                    hz40Var.l(ju40Var);
                    return;
                }
                return;
            }
            vy40 vy40Var = (vy40) objG;
            int i = vy40Var.b;
            Object[] objArr = vy40Var.f38232a;
            int i2 = 0;
            IntRange intRangeO = l1e0.o(0, i);
            int i3 = intRangeO.f46068a;
            int i4 = intRangeO.b;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (((Boolean) function1.invoke(objArr[i3])).booleanValue()) {
                        i2++;
                    }
                    if (i3 == i4) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            qx3.l(i - i2, i, null, objArr);
            vy40Var.b -= i2;
            if (vy40Var.i()) {
                hz40Var.l(ju40Var);
            }
            if (vy40Var.b == 1) {
                hz40Var.n(ju40Var, vy40Var.f());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005e A[LOOP:0: B:9:0x001c->B:22:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[EDGE_INSN: B:25:0x0061->B:23:0x0061 BREAK  A[LOOP:0: B:9:0x001c->B:22:0x005e], SYNTHETIC] */
    public static final vy40 d(hz40 hz40Var) {
        if (hz40Var.i()) {
            vy40 vy40Var = w960.b;
            vy40Var.getClass();
            return vy40Var;
        }
        vy40 vy40Var2 = new vy40();
        Object[] objArr = hz40Var.c;
        long[] jArr = hz40Var.f13891a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof vy40) {
                                vy40Var2.b((vy40) obj);
                            } else {
                                obj.getClass();
                                vy40Var2.a(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return vy40Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fx40) {
            return this.f10291a.equals(((fx40) obj).f10291a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10291a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f10291a + Separators.RPAREN;
    }
}
