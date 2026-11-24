package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ew90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8511a;
    public final int b;

    public ew90(boolean z) {
        this.f8511a = z;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew90)) {
            return false;
        }
        ew90 ew90Var = (ew90) obj;
        return this.f8511a == ew90Var.f8511a && this.b == ew90Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.f8511a) * 31);
    }

    public final String toString() {
        return ua80.k("PlatformParagraphStyle(includeFontPadding=", this.f8511a, ", emojiSupportMatch=", etn.a(this.b), Separators.RPAREN);
    }

    public ew90(int i, boolean z) {
        this.f8511a = z;
        this.b = i;
    }
}
