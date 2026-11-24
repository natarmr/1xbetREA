package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tml0 implements zml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34199a;
    public final vum b;
    public final vum c;
    public final a2m d;
    public final String e;
    public final mum f;

    public tml0(String str, vum vumVar, vum vumVar2, a2m a2mVar, String str2, mum mumVar) {
        str.getClass();
        this.f34199a = str;
        this.b = vumVar;
        this.c = vumVar2;
        this.d = a2mVar;
        this.e = str2;
        this.f = mumVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tml0)) {
            return false;
        }
        tml0 tml0Var = (tml0) obj;
        return Intrinsics.d(this.f34199a, tml0Var.f34199a) && this.b.equals(tml0Var.b) && this.c.equals(tml0Var.c) && this.d.equals(tml0Var.d) && Intrinsics.d(this.e, tml0Var.e) && this.f.equals(tml0Var.f);
    }

    public final int hashCode() {
        int iA = rz4.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f34199a.hashCode() * 31)) * 31)) * 31, 31);
        String str = this.e;
        return this.f.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "Cyber(tagLive=" + this.f34199a + ", teamOneModel=" + this.b + ", teamTwoModel=" + this.c + ", scoreModel=" + this.d + ", infoLabel=" + this.e + ", options=" + this.f + Separators.RPAREN;
    }
}
