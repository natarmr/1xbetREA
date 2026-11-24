package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rd00 implements td00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30267a;

    public rd00(List list) {
        list.getClass();
        this.f30267a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rd00) && Intrinsics.d(this.f30267a, ((rd00) obj).f30267a);
    }

    public final int hashCode() {
        return this.f30267a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f30267a, "Loading(uiItems=", Separators.RPAREN);
    }
}
