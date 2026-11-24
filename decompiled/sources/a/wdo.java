package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wdo implements aeo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38983a;
    public final String b;
    public final String c;

    public wdo(String str, String str2, String str3) {
        str2.getClass();
        this.f38983a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // a.aeo
    public final String a() {
        return this.f38983a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdo)) {
            return false;
        }
        wdo wdoVar = (wdo) obj;
        return this.f38983a.equals(wdoVar.f38983a) && Intrinsics.d(this.b, wdoVar.b) && this.c.equals(wdoVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f38983a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("EventInfoBlockUiModel(eventKey=", this.f38983a, ", label=", this.b, ", description="), this.c, Separators.RPAREN);
    }
}
