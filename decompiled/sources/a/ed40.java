package a;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ed40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cd40[] f7600a;
    public final long b;

    public ed40(List list) {
        this((cd40[]) list.toArray(new cd40[0]));
    }

    public final ed40 a(cd40... cd40VarArr) {
        if (cd40VarArr.length == 0) {
            return this;
        }
        String str = vtt0.f38024a;
        cd40[] cd40VarArr2 = this.f7600a;
        Object[] objArrCopyOf = Arrays.copyOf(cd40VarArr2, cd40VarArr2.length + cd40VarArr.length);
        System.arraycopy(cd40VarArr, 0, objArrCopyOf, cd40VarArr2.length, cd40VarArr.length);
        return new ed40(this.b, (cd40[]) objArrCopyOf);
    }

    public final ed40 b(ed40 ed40Var) {
        return ed40Var == null ? this : a(ed40Var.f7600a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ed40.class == obj.getClass()) {
            ed40 ed40Var = (ed40) obj;
            if (Arrays.equals(this.f7600a, ed40Var.f7600a) && this.b == ed40Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Arrays.hashCode(this.f7600a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f7600a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public ed40(long j, cd40... cd40VarArr) {
        this.b = j;
        this.f7600a = cd40VarArr;
    }

    public ed40(cd40... cd40VarArr) {
        this(-9223372036854775807L, cd40VarArr);
    }
}
