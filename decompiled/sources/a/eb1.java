package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class eb1 implements wb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7496a;

    public eb1(List list) {
        list.getClass();
        this.f7496a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eb1) && Intrinsics.d(this.f7496a, ((eb1) obj).f7496a);
    }

    public final int hashCode() {
        return this.f7496a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f7496a, "RestoreLimitedListeners(limitedListeners=", Separators.RPAREN);
    }
}
