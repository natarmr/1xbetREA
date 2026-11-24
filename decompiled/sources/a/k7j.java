package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k7j implements m7j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17823a;

    public k7j(List list) {
        list.getClass();
        this.f17823a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k7j) && Intrinsics.d(this.f17823a, ((k7j) obj).f17823a);
    }

    public final int hashCode() {
        return this.f17823a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f17823a, "OnDataLoaded(days=", Separators.RPAREN);
    }
}
