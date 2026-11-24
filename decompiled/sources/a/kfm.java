package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kfm implements mfm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18202a;
    public final sfm b;
    public final String c;

    public kfm(String str, sfm sfmVar, String str2) {
        str.getClass();
        this.f18202a = str;
        this.b = sfmVar;
        this.c = str2;
    }

    @Override // a.mfm
    public final dgm a() {
        return this.b;
    }

    @Override // a.mfm
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfm)) {
            return false;
        }
        kfm kfmVar = (kfm) obj;
        return Intrinsics.d(this.f18202a, kfmVar.f18202a) && this.b.equals(kfmVar.b) && this.c.equals(kfmVar.c);
    }

    @Override // a.mfm
    public final String getHeader() {
        return this.f18202a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + brm0.e(this.f18202a.hashCode() * 31, 31, false)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(header=");
        sb.append(this.f18202a);
        sb.append(", isPopular=false, style=");
        sb.append(this.b);
        sb.append(", additionalLabel=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
