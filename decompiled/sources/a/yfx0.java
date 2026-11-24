package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class yfx0 extends wgm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f42561a;
    public int b;

    @Override // a.wgm0
    public final vgx0 A(int i) {
        if (i < this.b) {
            return (vgx0) this.f42561a[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // a.wgm0
    public final Object B(int i) {
        if (i < this.b) {
            return this.f42561a[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // a.wgm0
    public final Object C(vgx0 vgx0Var) {
        int iE = E(vgx0Var);
        if (iE == -1) {
            return null;
        }
        return vgx0Var.b.cast(this.f42561a[iE + iE + 1]);
    }

    public final void D(vgx0 vgx0Var, Object obj) {
        int iE;
        if (!vgx0Var.c && (iE = E(vgx0Var)) != -1) {
            this.f42561a[iE + iE + 1] = obj;
            return;
        }
        int i = this.b + 1;
        Object[] objArrCopyOf = this.f42561a;
        int length = objArrCopyOf.length;
        if (i + i > length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, length + length);
            this.f42561a = objArrCopyOf;
        }
        int i2 = this.b;
        int i3 = i2 + i2;
        objArrCopyOf[i3] = vgx0Var;
        objArrCopyOf[i3 + 1] = obj;
        this.b = i2 + 1;
    }

    public final int E(vgx0 vgx0Var) {
        for (int i = 0; i < this.b; i++) {
            if (this.f42561a[i + i].equals(vgx0Var)) {
                return i;
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '");
            sb.append(A(i));
            sb.append("': ");
            sb.append(B(i));
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // a.wgm0
    public final int y() {
        return this.b;
    }
}
