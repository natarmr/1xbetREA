package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rrk0 implements trk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30989a;

    public rrk0(List list) {
        list.getClass();
        this.f30989a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rrk0) && Intrinsics.d(this.f30989a, ((rrk0) obj).f30989a);
    }

    public final int hashCode() {
        return this.f30989a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f30989a, "Line(timeStartList=", Separators.RPAREN);
    }
}
