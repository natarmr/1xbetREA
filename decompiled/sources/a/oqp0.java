package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class oqp0 implements qqp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25700a;

    public oqp0(List list) {
        list.getClass();
        this.f25700a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oqp0) && Intrinsics.d(this.f25700a, ((oqp0) obj).f25700a);
    }

    public final int hashCode() {
        return this.f25700a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f25700a, "Success(teams=", Separators.RPAREN);
    }
}
