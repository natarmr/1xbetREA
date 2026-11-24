package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zbn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44123a;
    public final a4x b;
    public final wul c;

    public zbn(String str, a4x a4xVar, wul wulVar) {
        str.getClass();
        a4xVar.getClass();
        this.f44123a = str;
        this.b = a4xVar;
        this.c = wulVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbn)) {
            return false;
        }
        zbn zbnVar = (zbn) obj;
        return Intrinsics.d(this.f44123a, zbnVar.f44123a) && Intrinsics.d(this.b, zbnVar.b) && this.c.equals(zbnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cs0.b(this.b, this.f44123a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbU = kng0.u("DuelBuilderUiState(title=", this.f44123a, ", items=", this.b, ", confirmButton=");
        sbU.append(this.c);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
