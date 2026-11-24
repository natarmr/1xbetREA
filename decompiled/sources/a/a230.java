package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a230 implements m230 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f105a;

    public a230(List list) {
        list.getClass();
        this.f105a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a230) && Intrinsics.d(this.f105a, ((a230) obj).f105a);
    }

    public final int hashCode() {
        return this.f105a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f105a, "OnCategoriesLoaded(categories=", Separators.RPAREN);
    }
}
