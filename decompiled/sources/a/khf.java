package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class khf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18288a;

    public khf(List list) {
        list.getClass();
        this.f18288a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof khf) && Intrinsics.d(this.f18288a, ((khf) obj).f18288a);
    }

    public final int hashCode() {
        return this.f18288a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f18288a, "CrystalRoundsStateModel(rounds=", Separators.RPAREN);
    }
}
