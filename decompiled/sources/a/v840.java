package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v840 implements z840 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f36964a;

    public v840(List list) {
        list.getClass();
        this.f36964a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v840) && Intrinsics.d(this.f36964a, ((v840) obj).f36964a);
    }

    public final int hashCode() {
        return this.f36964a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f36964a, "OpenMessageBottomSheet(messages=", Separators.RPAREN);
    }
}
