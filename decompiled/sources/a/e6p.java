package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e6p implements f6p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7296a;

    public e6p(List list) {
        list.getClass();
        this.f7296a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e6p) && Intrinsics.d(this.f7296a, ((e6p) obj).f7296a);
    }

    public final int hashCode() {
        return this.f7296a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f7296a, "Loading(items=", Separators.RPAREN);
    }
}
