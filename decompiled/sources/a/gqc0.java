package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gqc0 implements mqc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11726a;

    public gqc0(boolean z) {
        this.f11726a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gqc0) && this.f11726a == ((gqc0) obj).f11726a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11726a);
    }

    public final String toString() {
        return defpackage.c.d("ChangePromoPointsAmount(increase=", Separators.RPAREN, this.f11726a);
    }
}
