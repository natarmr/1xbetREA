package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fph implements hph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9929a;
    public final String b;
    public final int c;

    public fph(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f9929a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fph)) {
            return false;
        }
        fph fphVar = (fph) obj;
        return Intrinsics.d(this.f9929a, fphVar.f9929a) && Intrinsics.d(this.b, fphVar.b) && this.c == fphVar.c;
    }

    @Override // a.hph
    public final String getTitle() {
        return this.f9929a;
    }

    @Override // a.hph
    public final String getValue() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f9929a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, b1j.n("Colored(title=", this.f9929a, ", value=", this.b, ", progress="));
    }
}
