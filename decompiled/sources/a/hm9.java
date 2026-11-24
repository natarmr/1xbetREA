package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hm9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13295a;
    public final List b;

    public hm9(String str, List list) {
        list.getClass();
        this.f13295a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm9)) {
            return false;
        }
        hm9 hm9Var = (hm9) obj;
        return this.f13295a.equals(hm9Var.f13295a) && Intrinsics.d(this.b, hm9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13295a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("CalendarTournamentCategoryPlayoffModel(name=", this.f13295a, ", rounds=", this.b, Separators.RPAREN);
    }
}
