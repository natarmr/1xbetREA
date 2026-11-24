package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o4t0 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24657a;

    public o4t0(List list) {
        list.getClass();
        this.f24657a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4t0) && Intrinsics.d(this.f24657a, ((o4t0) obj).f24657a);
    }

    public final int hashCode() {
        return this.f24657a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f24657a, "UfcModel(rounds=", Separators.RPAREN);
    }
}
