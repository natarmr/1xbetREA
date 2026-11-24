package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class du80 implements gu80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6689a;

    public du80(List list) {
        list.getClass();
        this.f6689a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof du80) && Intrinsics.d(this.f6689a, ((du80) obj).f6689a);
    }

    public final int hashCode() {
        return this.f6689a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f6689a, "Content(banners=", Separators.RPAREN);
    }
}
