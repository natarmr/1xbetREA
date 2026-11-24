package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qmn implements rmn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28992a;

    public qmn(String str) {
        this.f28992a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qmn) && Intrinsics.d(this.f28992a, ((qmn) obj).f28992a);
    }

    public final int hashCode() {
        Object obj = this.f28992a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return f140.k(this.f28992a, "Value(value=", Separators.RPAREN);
    }
}
