package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class js30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17031a;

    public js30(List list) {
        list.getClass();
        this.f17031a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof js30) && Intrinsics.d(this.f17031a, ((js30) obj).f17031a);
    }

    public final int hashCode() {
        return this.f17031a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f17031a, "SportCellState(cells=", Separators.RPAREN);
    }
}
