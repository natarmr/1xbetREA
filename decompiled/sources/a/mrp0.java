package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mrp0 implements prp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22285a;

    public mrp0(List list) {
        list.getClass();
        this.f22285a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mrp0) && Intrinsics.d(this.f22285a, ((mrp0) obj).f22285a);
    }

    public final int hashCode() {
        return this.f22285a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f22285a, "Data(items=", Separators.RPAREN);
    }
}
