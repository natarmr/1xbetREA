package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zfp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44311a;
    public final boolean b;
    public final z9p c;

    public zfp(long j, boolean z, z9p z9pVar) {
        this.f44311a = j;
        this.b = z;
        this.c = z9pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfp)) {
            return false;
        }
        zfp zfpVar = (zfp) obj;
        return this.f44311a == zfpVar.f44311a && this.b == zfpVar.b && this.c == zfpVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Long.hashCode(this.f44311a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f44311a, "FavouriteIconUiModel(id=", ", isFavourite=", this.b);
        sbR.append(", favoriteIconPos=");
        sbR.append(this.c);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
