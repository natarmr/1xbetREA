package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class opp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f25654a;
    public final List b;
    public final Set c;

    public opp0(btk0 btk0Var, List list, Set set) {
        btk0Var.getClass();
        list.getClass();
        set.getClass();
        this.f25654a = btk0Var;
        this.b = list;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opp0)) {
            return false;
        }
        opp0 opp0Var = (opp0) obj;
        return Intrinsics.d(this.f25654a, opp0Var.f25654a) && Intrinsics.d(this.b, opp0Var.b) && Intrinsics.d(this.c, opp0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f25654a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "TeamsHistoryGamesStateModel(contentStatus=" + this.f25654a + ", content=" + this.b + ", expandGamesHistoryIds=" + this.c + Separators.RPAREN;
    }
}
