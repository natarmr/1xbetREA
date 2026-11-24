package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class gnk0 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ int[] f11593a;
    public /* synthetic */ Object[] b;
    public /* synthetic */ int c;

    public gnk0(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f11593a = new int[i5];
        this.b = new Object[i5];
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gnk0 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        gnk0 gnk0Var = (gnk0) objClone;
        gnk0Var.f11593a = (int[]) this.f11593a.clone();
        gnk0Var.b = (Object[]) this.b.clone();
        return gnk0Var;
    }

    public final int b(int i) {
        if (i >= this.c || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f11593a[i];
    }

    public final void c(int i, Object obj) {
        int iX = jd8.X(this.c, i, this.f11593a);
        if (iX >= 0) {
            this.b[iX] = obj;
            return;
        }
        int i2 = ~iX;
        int i3 = this.c;
        if (i2 < i3) {
            Object[] objArr = this.b;
            if (objArr[i2] == j2e.a0) {
                this.f11593a[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f11593a.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            this.f11593a = Arrays.copyOf(this.f11593a, i7);
            this.b = Arrays.copyOf(this.b, i7);
        }
        int i8 = this.c;
        if (i8 - i2 != 0) {
            int[] iArr = this.f11593a;
            int i9 = i2 + 1;
            qx3.d(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.b;
            qx3.e(i9, i2, this.c, objArr2, objArr2);
        }
        this.f11593a[i2] = i;
        this.b[i2] = obj;
        this.c++;
    }

    public final Object d(int i) {
        if (i >= this.c || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.b[i];
    }

    public final String toString() {
        int i = this.c;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(b(i3));
            sb.append('=');
            Object objD = d(i3);
            if (objD != this) {
                sb.append(objD);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
