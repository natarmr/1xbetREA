package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uch implements cdh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35428a;
    public final String b;

    public uch(String str, String str2) {
        str2.getClass();
        this.f35428a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uch)) {
            return false;
        }
        uch uchVar = (uch) obj;
        return this.f35428a.equals(uchVar.f35428a) && Intrinsics.d(this.b, uchVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35428a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("FirstTeam(teamImage=", this.f35428a, ", teamName=", this.b, Separators.RPAREN);
    }
}
