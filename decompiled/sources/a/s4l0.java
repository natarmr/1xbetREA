package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s4l0 implements c5l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f31613a;

    public s4l0(List list) {
        list.getClass();
        this.f31613a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s4l0) && Intrinsics.d(this.f31613a, ((s4l0) obj).f31613a);
    }

    public final int hashCode() {
        return this.f31613a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f31613a, "UpdateTopEventList(items=", Separators.RPAREN);
    }
}
