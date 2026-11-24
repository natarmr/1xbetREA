package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class uy20 implements az20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36469a;

    public final boolean equals(Object obj) {
        if (obj instanceof uy20) {
            return this.f36469a == ((uy20) obj).f36469a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f36469a);
    }

    public final String toString() {
        return axq.h(this.f36469a, "CategoryClick(categoryId=", Separators.RPAREN);
    }
}
