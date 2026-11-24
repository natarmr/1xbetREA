package a;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class nai0 implements abi0, Iterable, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hz40 f23193a;
    public Map b;
    public boolean c;
    public boolean d;

    public nai0() {
        long[] jArr = u1h0.f34903a;
        this.f23193a = new hz40();
    }

    @Override // a.abi0
    public final void b(zai0 zai0Var, Object obj) {
        boolean z = obj instanceof m6;
        hz40 hz40Var = this.f23193a;
        if (z && hz40Var.c(zai0Var)) {
            Object objG = hz40Var.g(zai0Var);
            objG.getClass();
            m6 m6Var = (m6) objG;
            m6 m6Var2 = (m6) obj;
            String str = m6Var2.f21241a;
            if (str == null) {
                str = m6Var.f21241a;
            }
            wdr wdrVar = m6Var2.b;
            if (wdrVar == null) {
                wdrVar = m6Var.b;
            }
            hz40Var.n(zai0Var, new m6(str, wdrVar));
        } else {
            hz40Var.n(zai0Var, obj);
        }
        zai0Var.getClass();
    }

    public final Object c(zai0 zai0Var) {
        Object objG = this.f23193a.g(zai0Var);
        if (objG != null) {
            return objG;
        }
        udk.d(zai0Var, " - consider getOrElse or getOrNull", "Key not present: ");
        return null;
    }

    public final void e(nai0 nai0Var) {
        hz40 hz40Var = nai0Var.f23193a;
        Object[] objArr = hz40Var.b;
        Object[] objArr2 = hz40Var.c;
        long[] jArr = hz40Var.f13891a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        zai0 zai0Var = (zai0) obj;
                        hz40 hz40Var2 = this.f23193a;
                        Object objG = hz40Var2.g(zai0Var);
                        zai0Var.getClass();
                        Object objInvoke = zai0Var.b.invoke(objG, obj2);
                        if (objInvoke != null) {
                            hz40Var2.n(zai0Var, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nai0)) {
            return false;
        }
        nai0 nai0Var = (nai0) obj;
        return this.f23193a.equals(nai0Var.f23193a) && this.c == nai0Var.c && this.d == nai0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(this.f23193a.hashCode() * 31, 31, this.c);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.b;
        if (map == null) {
            hz40 hz40Var = this.f23193a;
            qp20 qp20Var = hz40Var.f;
            if (qp20Var == null) {
                qp20Var = new qp20(hz40Var);
                hz40Var.f = qp20Var;
            }
            map = qp20Var;
            this.b = map;
        }
        return map.entrySet().iterator();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.c) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.d) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        hz40 hz40Var = this.f23193a;
        Object[] objArr = hz40Var.b;
        Object[] objArr2 = hz40Var.c;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((zai0) obj).f44070a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
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
        return yyw.a0(this) + "{ " + ((Object) sb) + " }";
    }
}
