package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35729a;
    public final List b;

    public uih(String str, List list) {
        list.getClass();
        this.f35729a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uih)) {
            return false;
        }
        uih uihVar = (uih) obj;
        return this.f35729a.equals(uihVar.f35729a) && Intrinsics.d(this.b, uihVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35729a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("CyberTournamentBracketCategoryGroupModel(name=", this.f35729a, ", rounds=", this.b, Separators.RPAREN);
    }
}
