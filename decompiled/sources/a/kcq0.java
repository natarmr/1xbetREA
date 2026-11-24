package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kcq0 {
    public static final /* synthetic */ long b = defpackage.a.f0a.objectFieldOffset(kcq0.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public heo[] f18073a;

    public final void a(heo heoVar) {
        heoVar.d((ieo) this);
        heo[] heoVarArr = this.f18073a;
        if (heoVarArr == null) {
            heoVarArr = new heo[4];
            this.f18073a = heoVarArr;
        } else if (b() >= heoVarArr.length) {
            heoVarArr = (heo[]) Arrays.copyOf(heoVarArr, b() * 2);
            this.f18073a = heoVarArr;
        }
        int iB = b();
        defpackage.a.f0a.putIntVolatile(this, b, iB + 1);
        heoVarArr[iB] = heoVar;
        heoVar.b = iB;
        d(iB);
    }

    public final int b() {
        return defpackage.a.f0a.getIntVolatile(this, b);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x0077 A[LOOP:0: B:9:0x003c->B:21:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007c A[EDGE_INSN: B:24:0x007c->B:22:0x007c BREAK  A[LOOP:0: B:9:0x003c->B:21:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007c A[EDGE_INSN: B:25:0x007c->B:22:0x007c BREAK  A[LOOP:0: B:9:0x003c->B:21:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final heo c(int i) {
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.f18073a;
        objArr2.getClass();
        defpackage.a.f0a.putIntVolatile(this, b, b() - 1);
        if (i < b()) {
            e(i, b());
            int i5 = (i - 1) / 2;
            if (i > 0) {
                heo heoVar = objArr2[i];
                heoVar.getClass();
                Object obj2 = objArr2[i5];
                obj2.getClass();
                if (heoVar.compareTo(obj2) < 0) {
                    e(i, i5);
                    d(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= b()) {
                            break;
                        }
                        objArr = this.f18073a;
                        objArr.getClass();
                        i4 = i2 + 2;
                        if (i4 < b()) {
                            comparable3 = objArr[i4];
                            comparable3.getClass();
                            obj = objArr[i3];
                            obj.getClass();
                            if (comparable3.compareTo(obj) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        comparable = objArr[i];
                        comparable.getClass();
                        comparable2 = objArr[i4];
                        comparable2.getClass();
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        e(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= b()) {
                        break;
                        break;
                    }
                    objArr = this.f18073a;
                    objArr.getClass();
                    i4 = i2 + 2;
                    if (i4 < b()) {
                        comparable3 = objArr[i4];
                        comparable3.getClass();
                        obj = objArr[i3];
                        obj.getClass();
                        if (comparable3.compareTo(obj) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    comparable = objArr[i];
                    comparable.getClass();
                    comparable2 = objArr[i4];
                    comparable2.getClass();
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    e(i, i4);
                    i = i4;
                }
            }
        }
        heo heoVar2 = objArr2[b()];
        heoVar2.getClass();
        heoVar2.d(null);
        heoVar2.b = -1;
        objArr2[b()] = null;
        return heoVar2;
    }

    public final void d(int i) {
        while (i > 0) {
            heo[] heoVarArr = this.f18073a;
            heoVarArr.getClass();
            int i2 = (i - 1) / 2;
            heo heoVar = heoVarArr[i2];
            heoVar.getClass();
            heo heoVar2 = heoVarArr[i];
            heoVar2.getClass();
            if (heoVar.compareTo(heoVar2) <= 0) {
                return;
            }
            e(i, i2);
            i = i2;
        }
    }

    public final void e(int i, int i2) {
        heo[] heoVarArr = this.f18073a;
        heoVarArr.getClass();
        heo heoVar = heoVarArr[i2];
        heoVar.getClass();
        heo heoVar2 = heoVarArr[i];
        heoVar2.getClass();
        heoVarArr[i] = heoVar;
        heoVarArr[i2] = heoVar2;
        heoVar.b = i;
        heoVar2.b = i2;
    }
}
