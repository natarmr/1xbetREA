package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jvr implements lvr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17218a;

    public jvr(List list) {
        list.getClass();
        this.f17218a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jvr) && Intrinsics.d(this.f17218a, ((jvr) obj).f17218a);
    }

    public final int hashCode() {
        return this.f17218a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f17218a, "Results(value=", Separators.RPAREN);
    }
}
