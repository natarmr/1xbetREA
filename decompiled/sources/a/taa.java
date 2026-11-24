package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class taa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33604a;
    public final raa b;

    public taa(String str, raa raaVar) {
        str.getClass();
        this.f33604a = str;
        this.b = raaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof taa)) {
            return false;
        }
        taa taaVar = (taa) obj;
        return Intrinsics.d(this.f33604a, taaVar.f33604a) && this.b == taaVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33604a.hashCode() * 31);
    }

    public final String toString() {
        return "ZoneModel(value=" + this.f33604a + ", status=" + this.b + Separators.RPAREN;
    }
}
