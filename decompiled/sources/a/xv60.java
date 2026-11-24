package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xv60 implements zv60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41543a;

    public xv60(int i) {
        this.f41543a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xv60) && this.f41543a == ((xv60) obj).f41543a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41543a);
    }

    public final String toString() {
        return ua80.e(this.f41543a, "CategoryClick(categoryId=", Separators.RPAREN);
    }
}
