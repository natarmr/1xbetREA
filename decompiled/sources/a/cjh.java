package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cjh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4461a;
    public final List b;

    public cjh(String str, List list) {
        list.getClass();
        this.f4461a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjh)) {
            return false;
        }
        cjh cjhVar = (cjh) obj;
        return this.f4461a.equals(cjhVar.f4461a) && Intrinsics.d(this.b, cjhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4461a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("CyberTournamentBracketCategorySwissModel(name=", this.f4461a, ", rounds=", this.b, Separators.RPAREN);
    }
}
