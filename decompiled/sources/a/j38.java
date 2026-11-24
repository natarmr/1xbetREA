package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class j38 implements l38 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15817a;

    public j38(int i) {
        this.f15817a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j38) && this.f15817a == ((j38) obj).f15817a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15817a);
    }

    @Override // a.l38
    public final int p() {
        return this.f15817a;
    }

    public final String toString() {
        return ua80.e(this.f15817a, "BindPhoneForChangeNotActivationPhone(confirmTypeAlias=", Separators.RPAREN);
    }
}
