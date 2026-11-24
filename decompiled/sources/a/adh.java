package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class adh implements cdh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f678a;
    public final String b;

    public adh(String str, String str2) {
        str2.getClass();
        this.f678a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adh)) {
            return false;
        }
        adh adhVar = (adh) obj;
        return this.f678a.equals(adhVar.f678a) && Intrinsics.d(this.b, adhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f678a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("SecondTeam(teamImage=", this.f678a, ", teamName=", this.b, Separators.RPAREN);
    }
}
