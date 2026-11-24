package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k98 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17902a;

    public k98(List list) {
        list.getClass();
        this.f17902a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k98) && Intrinsics.d(this.f17902a, ((k98) obj).f17902a);
    }

    public final int hashCode() {
        return this.f17902a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f17902a, "BlockResultModel(items=", Separators.RPAREN);
    }
}
