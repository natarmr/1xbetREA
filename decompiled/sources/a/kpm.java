package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kpm implements mpm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rpm f18683a;
    public final ipm b;
    public final j83 c;

    public kpm(rpm rpmVar, ipm ipmVar, j83 j83Var) {
        ipmVar.getClass();
        this.f18683a = rpmVar;
        this.b = ipmVar;
        this.c = j83Var;
    }

    @Override // a.mpm
    public final rpm a() {
        return this.f18683a;
    }

    @Override // a.mpm
    public final ipm b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpm)) {
            return false;
        }
        kpm kpmVar = (kpm) obj;
        return this.f18683a.equals(kpmVar.f18683a) && Intrinsics.d(this.b, kpmVar.b) && this.c.equals(kpmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f18683a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Score(style=" + this.f18683a + ", colorStyle=" + this.b + ", score=" + ((Object) this.c) + Separators.RPAREN;
    }
}
