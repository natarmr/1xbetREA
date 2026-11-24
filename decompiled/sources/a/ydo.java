package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ydo implements aeo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42448a;
    public final String b;

    public ydo(String str, String str2) {
        str2.getClass();
        this.f42448a = str;
        this.b = str2;
    }

    @Override // a.aeo
    public final String a() {
        return this.f42448a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydo)) {
            return false;
        }
        ydo ydoVar = (ydo) obj;
        return this.f42448a.equals(ydoVar.f42448a) && Intrinsics.d(this.b, ydoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42448a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("EventInfoLabelUiModel(eventKey=", this.f42448a, ", label=", this.b, Separators.RPAREN);
    }
}
