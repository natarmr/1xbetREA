package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ce50 implements oe50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4196a;

    public ce50(List list) {
        list.getClass();
        this.f4196a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ce50) && Intrinsics.d(this.f4196a, ((ce50) obj).f4196a);
    }

    public final int hashCode() {
        return this.f4196a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f4196a, "DispatchPostAuth(commands=", Separators.RPAREN);
    }
}
