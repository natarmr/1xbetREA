package a;

import android.gov.nist.core.Separators;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jeb0 implements keb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16366a;
    public final i4 b;
    public final String c;
    public final o0x d;
    public final e900 e;
    public final boolean f;
    public final String g;

    public jeb0(String str, i4 i4Var, String str2, m0x m0xVar, e900 e900Var, boolean z) {
        str.getClass();
        i4Var.getClass();
        str2.getClass();
        this.f16366a = str;
        this.b = i4Var;
        this.c = str2;
        this.d = m0xVar;
        this.e = e900Var;
        this.f = z;
        this.g = z ? "WebGamesTopGamesCollectionShimmer".concat(str) : "WebGamesTopGamesCollection".concat(str);
    }

    @Override // a.keb0
    public final String B() {
        return this.f16366a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jeb0)) {
            return false;
        }
        jeb0 jeb0Var = (jeb0) obj;
        return Intrinsics.d(this.f16366a, jeb0Var.f16366a) && Intrinsics.d(this.b, jeb0Var.b) && Intrinsics.d(this.c, jeb0Var.c) && Intrinsics.d(this.d, jeb0Var.d) && Intrinsics.d(this.e, jeb0Var.e) && this.f == jeb0Var.f;
    }

    @Override // a.oeb0
    public final String getKey() {
        return this.g;
    }

    public final int hashCode() {
        int iB = ua80.b(f140.c(this.b, this.f16366a.hashCode() * 31, 31), 31, this.c);
        o0x o0xVar = this.d;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((iB + (o0xVar == null ? 0 : o0xVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "WebGamesTopGamesCollection(categoryId=" + this.f16366a + ", games=" + this.b + ", title=" + this.c + ", bgPicture=" + this.d + ", bgColor=" + this.e + ", isLoading=" + this.f + Separators.RPAREN;
    }

    public jeb0(String str) {
        this(str, lak0.c, "", null, yk5.k(new Pair[0], 0L, 0L, 14), true);
    }
}
