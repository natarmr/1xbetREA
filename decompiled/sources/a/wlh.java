package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wlh extends xlh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39353a;
    public final List b;

    public wlh(String str, List list) {
        list.getClass();
        this.f39353a = str;
        this.b = list;
    }

    @Override // a.xlh
    public final String a() {
        return this.f39353a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlh)) {
            return false;
        }
        wlh wlhVar = (wlh) obj;
        return this.f39353a.equals(wlhVar.f39353a) && Intrinsics.d(this.b, wlhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f39353a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("CyberTournamentBracketStageSwissModel(name=", this.f39353a, ", brackets=", this.b, Separators.RPAREN);
    }
}
