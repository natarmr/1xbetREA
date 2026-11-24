package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42690a;
    public final List b;

    public yih(String str, List list) {
        list.getClass();
        this.f42690a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yih)) {
            return false;
        }
        yih yihVar = (yih) obj;
        return this.f42690a.equals(yihVar.f42690a) && Intrinsics.d(this.b, yihVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42690a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("CyberTournamentBracketCategoryPlayoffModel(name=", this.f42690a, ", rounds=", this.b, Separators.RPAREN);
    }
}
