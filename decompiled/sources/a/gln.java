package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gln implements iln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b9x f11500a;
    public final String b;

    public gln(b9x b9xVar, String str) {
        str.getClass();
        this.f11500a = b9xVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gln)) {
            return false;
        }
        gln glnVar = (gln) obj;
        return this.f11500a.equals(glnVar.f11500a) && Intrinsics.d(this.b, glnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11500a.hashCode() * 31);
    }

    public final String toString() {
        return "InfoLabel(infoLabelIconUiModel=" + this.f11500a + ", labelText=" + this.b + Separators.RPAREN;
    }
}
