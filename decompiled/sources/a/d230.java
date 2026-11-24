package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d230 implements m230 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5338a;
    public final Map b;

    public d230(long j, Map map) {
        map.getClass();
        this.f5338a = j;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d230)) {
            return false;
        }
        d230 d230Var = (d230) obj;
        return this.f5338a == d230Var.f5338a && Intrinsics.d(this.b, d230Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f5338a) * 31);
    }

    public final String toString() {
        return "OnCategorySubGamesExpandedChanged(categoryId=" + this.f5338a + ", expandedSubGames=" + this.b + Separators.RPAREN;
    }
}
