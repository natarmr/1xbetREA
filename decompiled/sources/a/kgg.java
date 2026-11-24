package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kgg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18237a;
    public final wul b;
    public final wul c;

    public kgg(boolean z, wul wulVar, wul wulVar2) {
        this.f18237a = z;
        this.b = wulVar;
        this.c = wulVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgg)) {
            return false;
        }
        kgg kggVar = (kgg) obj;
        return this.f18237a == kggVar.f18237a && this.b.equals(kggVar.b) && this.c.equals(kggVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + i8i.a(this.b, Boolean.hashCode(this.f18237a) * 31, 31);
    }

    public final String toString() {
        return "CyberChampsContentMultiSelectUiModel(isMultiselectEnabled=" + this.f18237a + ", confirmButton=" + this.b + ", cancelButton=" + this.c + Separators.RPAREN;
    }
}
