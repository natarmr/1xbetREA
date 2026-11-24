package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class w71 implements t81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38649a;

    public w71(List list) {
        list.getClass();
        this.f38649a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w71) && Intrinsics.d(this.f38649a, ((w71) obj).f38649a);
    }

    public final int hashCode() {
        return this.f38649a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f38649a, "RestoreLimitedListeners(limitedListeners=", Separators.RPAREN);
    }
}
