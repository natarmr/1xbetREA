package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a0l implements b0l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30a;

    public a0l(List list) {
        list.getClass();
        this.f30a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0l) && Intrinsics.d(this.f30a, ((a0l) obj).f30a);
    }

    public final int hashCode() {
        return this.f30a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f30a, "ShowOpponentBones(opponentBones=", Separators.RPAREN);
    }
}
