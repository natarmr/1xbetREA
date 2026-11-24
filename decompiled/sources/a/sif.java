package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class sif {
    public static final rif Companion = new rif();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32260a;
    public final String b;

    public /* synthetic */ sif(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f32260a = null;
        } else {
            this.f32260a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sif)) {
            return false;
        }
        sif sifVar = (sif) obj;
        return Intrinsics.d(this.f32260a, sifVar.f32260a) && Intrinsics.d(this.b, sifVar.b);
    }

    public final int hashCode() {
        String str = this.f32260a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("Cs2CompositionCountryResponse(title=", this.f32260a, ", image=", this.b, Separators.RPAREN);
    }
}
