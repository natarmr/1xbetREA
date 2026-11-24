package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33001a;
    public final wui0 b;

    public sy(String str, wui0 wui0Var) {
        d4d d4dVar = d4d.PRIMARY;
        d4d d4dVar2 = d4d.PRIMARY;
        str.getClass();
        this.f33001a = str;
        this.b = wui0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy)) {
            return false;
        }
        sy syVar = (sy) obj;
        if (!Intrinsics.d(this.f33001a, syVar.f33001a) || this.b != syVar.b) {
            return false;
        }
        d4d d4dVar = d4d.PRIMARY;
        d4d d4dVar2 = d4d.PRIMARY;
        return true;
    }

    public final int hashCode() {
        return d4d.BACKGROUND.hashCode() + dw9.b(d4d.SECONDARY, rw2.c(this.b, this.f33001a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "AdditionalInfoUiModel(text=" + this.f33001a + ", position=" + this.b + ", iconColor=" + d4d.SECONDARY + ", backgroundColor=" + d4d.BACKGROUND + Separators.RPAREN;
    }
}
