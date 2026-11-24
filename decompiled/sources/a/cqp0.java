package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cqp0 implements fqp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4807a;

    public cqp0(List list) {
        list.getClass();
        this.f4807a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cqp0) && Intrinsics.d(this.f4807a, ((cqp0) obj).f4807a);
    }

    public final int hashCode() {
        return this.f4807a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f4807a, "Favorites(items=", Separators.RPAREN);
    }
}
