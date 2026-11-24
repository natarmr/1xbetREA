package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lvf implements mvf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20712a;

    public lvf(List list) {
        list.getClass();
        this.f20712a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lvf) && Intrinsics.d(this.f20712a, ((lvf) obj).f20712a);
    }

    public final int hashCode() {
        return this.f20712a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f20712a, "InsertRequired(items=", Separators.RPAREN);
    }
}
