package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jy2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f17338a;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ jy2(int i) {
        this.f17338a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jy2) {
            return this.f17338a == ((jy2) obj).f17338a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17338a);
    }

    public final String toString() {
        return ua80.e(this.f17338a, "AndroidContentDataType(androidAutofillType=", Separators.RPAREN);
    }
}
