package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fhv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9561a;

    public fhv(List list) {
        list.getClass();
        this.f9561a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fhv) && Intrinsics.d(this.f9561a, ((fhv) obj).f9561a);
    }

    public final int hashCode() {
        return this.f9561a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f9561a, "FilterListContent(filterList=", Separators.RPAREN);
    }
}
