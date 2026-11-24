package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cqv0 implements dqv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4815a;

    public cqv0(List list) {
        this.f4815a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cqv0) && Intrinsics.d(this.f4815a, ((cqv0) obj).f4815a);
    }

    public final int hashCode() {
        Object obj = this.f4815a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return f140.k(this.f4815a, "Success(data=", Separators.RPAREN);
    }
}
