package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class uz6 extends xz6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f36522a;

    public uz6(List list) {
        list.getClass();
        this.f36522a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uz6) && Intrinsics.d(this.f36522a, ((uz6) obj).f36522a);
    }

    public final int hashCode() {
        return this.f36522a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f36522a, "UpdateBalances(info=", Separators.RPAREN);
    }
}
