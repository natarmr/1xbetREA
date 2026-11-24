package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ulh extends xlh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35871a;
    public final List b;

    public ulh(String str, List list) {
        list.getClass();
        this.f35871a = str;
        this.b = list;
    }

    @Override // a.xlh
    public final String a() {
        return this.f35871a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ulh)) {
            return false;
        }
        ulh ulhVar = (ulh) obj;
        return this.f35871a.equals(ulhVar.f35871a) && Intrinsics.d(this.b, ulhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35871a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("CyberTournamentBracketStageGroupModel(name=", this.f35871a, ", brackets=", this.b, Separators.RPAREN);
    }
}
