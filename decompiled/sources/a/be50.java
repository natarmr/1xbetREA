package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class be50 implements oe50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2431a;

    public be50(List list) {
        list.getClass();
        this.f2431a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof be50) && Intrinsics.d(this.f2431a, ((be50) obj).f2431a);
    }

    public final int hashCode() {
        return this.f2431a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f2431a, "DispatchOnSuccess(entries=", Separators.RPAREN);
    }
}
