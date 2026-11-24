package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gpq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11696a;

    public gpq0(List list) {
        list.getClass();
        this.f11696a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gpq0) && Intrinsics.d(this.f11696a, ((gpq0) obj).f11696a);
    }

    public final int hashCode() {
        return this.f11696a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f11696a, "TirageCategoryResultModel(categoriesResponseList=", Separators.RPAREN);
    }
}
