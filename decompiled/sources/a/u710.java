package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u710 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f35162a;
    public /* synthetic */ long[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public u710(int i) {
        if (i == 0) {
            this.b = jd8.i;
            this.c = jd8.j;
            return;
        }
        int i2 = i * 8;
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
        }
        int i5 = i2 / 8;
        this.b = new long[i5];
        this.c = new Object[i5];
    }

    public final void a() {
        int i = this.d;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.f35162a = false;
    }

    public final Object b(long j) {
        Object obj;
        int iY = jd8.Y(this.b, this.d, j);
        if (iY < 0 || (obj = this.c[iY]) == epv0.k) {
            return null;
        }
        return obj;
    }

    public final int c(long j) {
        if (this.f35162a) {
            int i = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != epv0.k) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f35162a = false;
            this.d = i2;
        }
        return jd8.Y(this.b, this.d, j);
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        u710 u710Var = (u710) objClone;
        u710Var.b = (long[]) this.b.clone();
        u710Var.c = (Object[]) this.c.clone();
        return u710Var;
    }

    public final boolean d() {
        return h() == 0;
    }

    public final long e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.d)) {
            jf4.o(twn.m(i, "Expected index to be within 0..size()-1, but was "));
            return 0L;
        }
        if (this.f35162a) {
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != epv0.k) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f35162a = false;
            this.d = i3;
        }
        return this.b[i];
    }

    public final void f(Object obj, long j) {
        Object obj2 = epv0.k;
        int iY = jd8.Y(this.b, this.d, j);
        if (iY >= 0) {
            this.c[iY] = obj;
            return;
        }
        int i = ~iY;
        int i2 = this.d;
        if (i < i2) {
            Object[] objArr = this.c;
            if (objArr[i] == obj2) {
                this.b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f35162a) {
            long[] jArr = this.b;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f35162a = false;
                this.d = i3;
                i = ~jd8.Y(this.b, i3, j);
            }
        }
        int i5 = this.d;
        if (i5 >= this.b.length) {
            int i6 = (i5 + 1) * 8;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 8;
            this.b = Arrays.copyOf(this.b, i9);
            this.c = Arrays.copyOf(this.c, i9);
        }
        int i10 = this.d;
        if (i10 - i != 0) {
            long[] jArr2 = this.b;
            int i11 = i + 1;
            qx3.g(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.c;
            qx3.e(i11, i, this.d, objArr3, objArr3);
        }
        this.b[i] = j;
        this.c[i] = obj;
        this.d++;
    }

    public final void g(long j) {
        int iY = jd8.Y(this.b, this.d, j);
        if (iY >= 0) {
            Object[] objArr = this.c;
            Object obj = objArr[iY];
            Object obj2 = epv0.k;
            if (obj != obj2) {
                objArr[iY] = obj2;
                this.f35162a = true;
            }
        }
    }

    public final int h() {
        if (this.f35162a) {
            int i = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != epv0.k) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f35162a = false;
            this.d = i2;
        }
        return this.d;
    }

    public final Object i(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.d)) {
            jf4.o(twn.m(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        if (this.f35162a) {
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != epv0.k) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f35162a = false;
            this.d = i3;
        }
        return this.c[i];
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(e(i2));
            sb.append('=');
            Object objI = i(i2);
            if (objI != sb) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ u710(Object obj) {
        this(10);
    }
}
