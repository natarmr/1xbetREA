package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40563a;
    public final abm b;
    public final abm c;

    public xam(String str, abm abmVar, abm abmVar2) {
        zam zamVar = zam.f44076a;
        str.getClass();
        this.f40563a = str;
        this.b = abmVar;
        this.c = abmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xam)) {
            return false;
        }
        xam xamVar = (xam) obj;
        if (!Intrinsics.d(this.f40563a, xamVar.f40563a)) {
            return false;
        }
        zam zamVar = zam.f44076a;
        return this.b.equals(xamVar.b) && this.c.equals(xamVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((zam.f44076a.hashCode() + (this.f40563a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DsCyberTeamLineupInfoComparableUiModel(label=" + this.f40563a + ", type=" + zam.f44076a + ", firstValue=" + this.b + ", secondValue=" + this.c + Separators.RPAREN;
    }
}
