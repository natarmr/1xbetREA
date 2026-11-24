package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qrk0 implements trk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29215a;

    public qrk0(List list) {
        list.getClass();
        this.f29215a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qrk0) && Intrinsics.d(this.f29215a, ((qrk0) obj).f29215a);
    }

    public final int hashCode() {
        return this.f29215a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f29215a, "History(timeStartList=", Separators.RPAREN);
    }
}
