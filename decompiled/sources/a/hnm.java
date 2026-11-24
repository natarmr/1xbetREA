package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hnm implements jnm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmm f13358a;
    public final knm b;
    public final anm c;

    public hnm(zmm zmmVar, knm knmVar, anm anmVar) {
        this.f13358a = zmmVar;
        this.b = knmVar;
        this.c = anmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnm)) {
            return false;
        }
        hnm hnmVar = (hnm) obj;
        return this.f13358a.equals(hnmVar.f13358a) && this.b.equals(hnmVar.b) && Intrinsics.d(this.c, hnmVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f13358a.hashCode() * 31)) * 31;
        anm anmVar = this.c;
        return iHashCode + (anmVar == null ? 0 : anmVar.f1162a.hashCode());
    }

    public final String toString() {
        return "Basic(countryModel=" + this.f13358a + ", numberModel=" + this.b + ", error=" + this.c + Separators.RPAREN;
    }
}
