package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29542a;
    public final boolean b;

    public qym0(List list, boolean z) {
        list.getClass();
        this.f29542a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qym0)) {
            return false;
        }
        qym0 qym0Var = (qym0) obj;
        return Intrinsics.d(this.f29542a, qym0Var.f29542a) && this.b == qym0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f29542a.hashCode() * 31);
    }

    public final String toString() {
        return "SubGamesUiModel(subGames=" + this.f29542a + ", isFilterEnable=" + this.b + Separators.RPAREN;
    }
}
