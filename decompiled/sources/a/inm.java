package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class inm implements jnm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zmm f15080a;
    public final knm b;
    public final anm c;

    public inm(zmm zmmVar, knm knmVar, anm anmVar) {
        this.f15080a = zmmVar;
        this.b = knmVar;
        this.c = anmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inm)) {
            return false;
        }
        inm inmVar = (inm) obj;
        return this.f15080a.equals(inmVar.f15080a) && this.b.equals(inmVar.b) && Intrinsics.d(this.c, inmVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f15080a.hashCode() * 31)) * 31;
        anm anmVar = this.c;
        return iHashCode + (anmVar == null ? 0 : anmVar.f1162a.hashCode());
    }

    public final String toString() {
        return "Filled(countryModel=" + this.f15080a + ", numberModel=" + this.b + ", error=" + this.c + Separators.RPAREN;
    }
}
