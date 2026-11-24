package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o3w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24606a;

    public o3w0(List list) {
        list.getClass();
        this.f24606a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o3w0) && Intrinsics.d(this.f24606a, ((o3w0) obj).f24606a);
    }

    public final int hashCode() {
        return this.f24606a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f24606a, "ZoneConfigModel(configs=", Separators.RPAREN);
    }
}
