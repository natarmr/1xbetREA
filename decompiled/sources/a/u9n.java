package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u9n implements w9n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0x f35292a;
    public final o0x b;
    public final Integer c;
    public final p9n d;
    public final p9n e;
    public final y9n f;

    public u9n(o0x o0xVar, o0x o0xVar2, Integer num, p9n p9nVar, p9n p9nVar2, y9n y9nVar) {
        this.f35292a = o0xVar;
        this.b = o0xVar2;
        this.c = num;
        this.d = p9nVar;
        this.e = p9nVar2;
        this.f = y9nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9n)) {
            return false;
        }
        u9n u9nVar = (u9n) obj;
        return Intrinsics.d(this.f35292a, u9nVar.f35292a) && Intrinsics.d(this.b, u9nVar.b) && Intrinsics.d(this.c, u9nVar.c) && this.d == u9nVar.d && this.e == u9nVar.e && Intrinsics.d(this.f, u9nVar.f);
    }

    public final int hashCode() {
        int iD = w6x.d(this.b, this.f35292a.hashCode() * 31, 31);
        Integer num = this.c;
        int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
        p9n p9nVar = this.d;
        int iHashCode2 = (iHashCode + (p9nVar == null ? 0 : p9nVar.hashCode())) * 31;
        p9n p9nVar2 = this.e;
        int iHashCode3 = (iHashCode2 + (p9nVar2 == null ? 0 : p9nVar2.hashCode())) * 31;
        y9n y9nVar = this.f;
        return iHashCode3 + (y9nVar != null ? y9nVar.hashCode() : 0);
    }

    @Override // a.w9n
    public final o0x r() {
        return this.f35292a;
    }

    @Override // a.w9n
    public final Integer s() {
        return this.c;
    }

    public final String toString() {
        return "Default(imageLink=" + this.f35292a + ", fallbackImageLink=" + this.b + ", placeholderRes=" + this.c + ", firstTag=" + this.d + ", secondTag=" + this.e + ", winningModel=" + this.f + Separators.RPAREN;
    }

    @Override // a.w9n
    public final o0x w() {
        return this.b;
    }

    @Override // a.w9n
    public final p9n x() {
        return this.d;
    }

    @Override // a.w9n
    public final p9n y() {
        return this.e;
    }

    @Override // a.w9n
    public final y9n z() {
        return this.f;
    }
}
