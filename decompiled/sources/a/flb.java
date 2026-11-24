package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class flb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9729a;
    public final hcm b;
    public final String c;
    public final int d;

    public flb(String str, hcm hcmVar, String str2, int i) {
        str.getClass();
        this.f9729a = str;
        this.b = hcmVar;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flb)) {
            return false;
        }
        flb flbVar = (flb) obj;
        return Intrinsics.d(this.f9729a, flbVar.f9729a) && this.b.equals(flbVar.b) && this.c.equals(flbVar.c) && this.d == flbVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ua80.b((this.b.hashCode() + (this.f9729a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChampionshipToolbarUiModel(title=");
        sb.append(this.f9729a);
        sb.append(", topInfo=");
        sb.append(this.b);
        sb.append(", backgroundImage=");
        return brm0.j(this.d, this.c, ", placeholder=", Separators.RPAREN, sb);
    }
}
