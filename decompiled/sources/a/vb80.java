package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vb80 implements ac80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37129a;

    public vb80(List list) {
        list.getClass();
        this.f37129a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vb80) && Intrinsics.d(this.f37129a, ((vb80) obj).f37129a);
    }

    public final int hashCode() {
        return this.f37129a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f37129a, "ShowClearFavoritesGroups(selectedItems=", Separators.RPAREN);
    }
}
