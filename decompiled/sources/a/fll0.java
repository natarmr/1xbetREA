package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fll0 implements jll0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9744a;

    public fll0(List list) {
        list.getClass();
        this.f9744a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fll0) && Intrinsics.d(this.f9744a, ((fll0) obj).f9744a);
    }

    public final int hashCode() {
        return this.f9744a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f9744a, "UpdateContent(content=", Separators.RPAREN);
    }
}
