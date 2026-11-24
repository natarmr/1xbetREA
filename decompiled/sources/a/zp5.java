package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zp5 implements bq5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44743a;

    public zp5(List list) {
        list.getClass();
        this.f44743a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zp5) && Intrinsics.d(this.f44743a, ((zp5) obj).f44743a);
    }

    public final int hashCode() {
        return this.f44743a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f44743a, "Items(value=", Separators.RPAREN);
    }
}
