package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hzo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13916a;
    public final String b;

    public hzo(String str, String str2) {
        str.getClass();
        this.f13916a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzo)) {
            return false;
        }
        hzo hzoVar = (hzo) obj;
        return Intrinsics.d(this.f13916a, hzoVar.f13916a) && this.b.equals(hzoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13916a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("FastGameModel(frameUrl=", this.f13916a, ", message=", this.b, Separators.RPAREN);
    }
}
