package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r9n implements s9n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0x f30091a;
    public final o0x b;
    public final boolean c;
    public final Integer d;
    public final boolean e;
    public final p9n f;
    public final p9n g;
    public final y9n h;

    public r9n(o0x o0xVar, o0x o0xVar2, boolean z, Integer num, boolean z2, y9n y9nVar, int i) {
        p9n p9nVar = p9n.NEW;
        p9n p9nVar2 = p9n.FREE;
        num = (i & 8) != 0 ? null : num;
        z2 = (i & 16) != 0 ? true : z2;
        p9nVar = (i & 32) != 0 ? null : p9nVar;
        p9nVar2 = (i & 64) != 0 ? null : p9nVar2;
        y9nVar = (i & 128) != 0 ? null : y9nVar;
        this.f30091a = o0xVar;
        this.b = o0xVar2;
        this.c = z;
        this.d = num;
        this.e = z2;
        this.f = p9nVar;
        this.g = p9nVar2;
        this.h = y9nVar;
    }

    @Override // a.s9n
    public final boolean A() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9n)) {
            return false;
        }
        r9n r9nVar = (r9n) obj;
        return this.f30091a.equals(r9nVar.f30091a) && this.b.equals(r9nVar.b) && this.c == r9nVar.c && Intrinsics.d(this.d, r9nVar.d) && this.e == r9nVar.e && this.f == r9nVar.f && this.g == r9nVar.g && Intrinsics.d(this.h, r9nVar.h);
    }

    public final int hashCode() {
        int iE = brm0.e(w6x.d(this.b, this.f30091a.hashCode() * 31, 31), 31, this.c);
        Integer num = this.d;
        int iE2 = brm0.e((iE + (num == null ? 0 : num.hashCode())) * 31, 31, this.e);
        p9n p9nVar = this.f;
        int iHashCode = (iE2 + (p9nVar == null ? 0 : p9nVar.hashCode())) * 31;
        p9n p9nVar2 = this.g;
        int iHashCode2 = (iHashCode + (p9nVar2 == null ? 0 : p9nVar2.hashCode())) * 31;
        y9n y9nVar = this.h;
        return iHashCode2 + (y9nVar != null ? y9nVar.hashCode() : 0);
    }

    @Override // a.s9n
    public final o0x r() {
        return this.f30091a;
    }

    @Override // a.s9n
    public final Integer s() {
        return this.d;
    }

    public final String toString() {
        return "Overlay(imageLink=" + this.f30091a + ", fallbackImageLink=" + this.b + ", checked=" + this.c + ", placeholderRes=" + this.d + ", enableCheckBox=" + this.e + ", firstTag=" + this.f + ", secondTag=" + this.g + ", winningModel=" + this.h + Separators.RPAREN;
    }

    @Override // a.s9n
    public final boolean v() {
        return this.c;
    }

    @Override // a.s9n
    public final o0x w() {
        return this.b;
    }

    @Override // a.s9n
    public final p9n x() {
        return this.f;
    }

    @Override // a.s9n
    public final p9n y() {
        return this.g;
    }

    @Override // a.s9n
    public final y9n z() {
        return this.h;
    }
}
