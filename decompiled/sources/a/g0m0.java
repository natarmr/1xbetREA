package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g0m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10467a;

    public g0m0(List list) {
        list.getClass();
        this.f10467a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0m0) && Intrinsics.d(this.f10467a, ((g0m0) obj).f10467a);
    }

    public final int hashCode() {
        return this.f10467a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f10467a, "StageNetBottomStateModel(items=", Separators.RPAREN);
    }
}
