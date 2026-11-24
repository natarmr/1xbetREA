package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zhe implements gie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44389a;

    public zhe(List list) {
        list.getClass();
        this.f44389a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zhe) && Intrinsics.d(this.f44389a, ((zhe) obj).f44389a);
    }

    public final int hashCode() {
        return this.f44389a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f44389a, "Success(items=", Separators.RPAREN);
    }
}
