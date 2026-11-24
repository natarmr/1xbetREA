package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ge50 implements oe50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11136a;

    public ge50(List list) {
        list.getClass();
        this.f11136a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ge50) && Intrinsics.d(this.f11136a, ((ge50) obj).f11136a);
    }

    public final int hashCode() {
        return this.f11136a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f11136a, "NewChain(screens=", Separators.RPAREN);
    }
}
