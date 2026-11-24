package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mr80 implements pr80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22257a;

    public mr80(List list) {
        list.getClass();
        this.f22257a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mr80) && Intrinsics.d(this.f22257a, ((mr80) obj).f22257a);
    }

    public final int hashCode() {
        return this.f22257a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f22257a, "Content(banners=", Separators.RPAREN);
    }
}
