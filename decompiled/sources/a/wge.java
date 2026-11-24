package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wge implements iie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39112a;

    public wge(List list) {
        list.getClass();
        this.f39112a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wge) && Intrinsics.d(this.f39112a, ((wge) obj).f39112a);
    }

    public final int hashCode() {
        return this.f39112a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f39112a, "Content(providersList=", Separators.RPAREN);
    }
}
