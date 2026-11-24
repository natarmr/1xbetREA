package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a7u0 extends d7u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f392a;

    public a7u0(List list) {
        list.getClass();
        this.f392a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a7u0) && Intrinsics.d(this.f392a, ((a7u0) obj).f392a);
    }

    public final int hashCode() {
        return this.f392a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f392a, "Content(items=", Separators.RPAREN);
    }
}
