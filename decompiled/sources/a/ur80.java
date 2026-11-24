package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ur80 implements wr80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f36152a;

    public ur80(List list) {
        list.getClass();
        this.f36152a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ur80) && Intrinsics.d(this.f36152a, ((ur80) obj).f36152a);
    }

    public final int hashCode() {
        return this.f36152a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f36152a, "Content(filters=", Separators.RPAREN);
    }
}
