package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jmo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16775a;
    public final String b;

    public jmo(int i, String str) {
        this.f16775a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmo)) {
            return false;
        }
        jmo jmoVar = (jmo) obj;
        return this.f16775a == jmoVar.f16775a && this.b.equals(jmoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f16775a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f16775a, "ExpandButtonUiModel(iconArrow=", ", btnText=", this.b, Separators.RPAREN);
    }
}
