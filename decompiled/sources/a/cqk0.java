package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cqk0 extends dqk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4798a;

    public cqk0(Object obj) {
        obj.getClass();
        this.f4798a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cqk0) && Intrinsics.d(this.f4798a, ((cqk0) obj).f4798a);
    }

    public final int hashCode() {
        return this.f4798a.hashCode();
    }

    public final String toString() {
        return f140.k(this.f4798a, "Success(data=", Separators.RPAREN);
    }
}
