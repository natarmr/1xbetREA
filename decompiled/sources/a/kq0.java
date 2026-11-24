package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class kq0 implements rq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18698a;
    public final zo0 b;
    public final String c;
    public final fyl d;
    public final vxl e;

    public kq0(String str, zo0 zo0Var, String str2, fyl fylVar, vxl vxlVar) {
        str.getClass();
        str2.getClass();
        this.f18698a = str;
        this.b = zo0Var;
        this.c = str2;
        this.d = fylVar;
        this.e = vxlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq0)) {
            return false;
        }
        kq0 kq0Var = (kq0) obj;
        return Intrinsics.d(this.f18698a, kq0Var.f18698a) && this.b.equals(kq0Var.b) && Intrinsics.d(this.c, kq0Var.c) && this.d.equals(kq0Var.d) && this.e == kq0Var.e;
    }

    @Override // a.rq0
    public final String getId() {
        return this.f18698a;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ua80.b((this.b.hashCode() + (this.f18698a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "Chips(id=" + this.f18698a + ", position=" + this.b + ", categoryId=" + this.c + ", dsChipUiModel=" + this.d + ", dsChipStyle=" + this.e + Separators.RPAREN;
    }
}
