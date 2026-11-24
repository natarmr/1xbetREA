package a;

import android.gov.nist.core.Separators;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m1x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f21030a;
    public final CoroutineContext b;
    public final CoroutineContext c;
    public final vi9 d;
    public final vi9 e;
    public final vi9 f;
    public final Function1 g;
    public final Function1 h;
    public final s7k0 i;
    public final j1h0 j;
    public final asb0 k;

    public m1x(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, vi9 vi9Var, vi9 vi9Var2, vi9 vi9Var3, Function1 function1, Function1 function2, s7k0 s7k0Var, j1h0 j1h0Var, asb0 asb0Var) {
        this.f21030a = coroutineContext;
        this.b = coroutineContext2;
        this.c = coroutineContext3;
        this.d = vi9Var;
        this.e = vi9Var2;
        this.f = vi9Var3;
        this.g = function1;
        this.h = function2;
        this.i = s7k0Var;
        this.j = j1h0Var;
        this.k = asb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1x)) {
            return false;
        }
        m1x m1xVar = (m1x) obj;
        return Intrinsics.d(this.f21030a, m1xVar.f21030a) && Intrinsics.d(this.b, m1xVar.b) && Intrinsics.d(this.c, m1xVar.c) && this.d == m1xVar.d && this.e == m1xVar.e && this.f == m1xVar.f && this.g.equals(m1xVar.g) && this.h.equals(m1xVar.h) && Intrinsics.d(this.i, m1xVar.i) && this.j == m1xVar.j && this.k == m1xVar.k;
    }

    public final int hashCode() {
        CoroutineContext coroutineContext = this.f21030a;
        int iHashCode = (coroutineContext == null ? 0 : coroutineContext.hashCode()) * 31;
        CoroutineContext coroutineContext2 = this.b;
        int iHashCode2 = (iHashCode + (coroutineContext2 == null ? 0 : coroutineContext2.hashCode())) * 31;
        CoroutineContext coroutineContext3 = this.c;
        int iHashCode3 = (iHashCode2 + (coroutineContext3 == null ? 0 : coroutineContext3.hashCode())) * 31;
        vi9 vi9Var = this.d;
        int iHashCode4 = (iHashCode3 + (vi9Var == null ? 0 : vi9Var.hashCode())) * 31;
        vi9 vi9Var2 = this.e;
        int iHashCode5 = (iHashCode4 + (vi9Var2 == null ? 0 : vi9Var2.hashCode())) * 31;
        vi9 vi9Var3 = this.f;
        int iHashCode6 = (pnk0.q.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((iHashCode5 + (vi9Var3 == null ? 0 : vi9Var3.hashCode())) * 31)) * 31)) * 31)) * 31;
        s7k0 s7k0Var = this.i;
        int iHashCode7 = (iHashCode6 + (s7k0Var == null ? 0 : s7k0Var.hashCode())) * 31;
        j1h0 j1h0Var = this.j;
        int iHashCode8 = (iHashCode7 + (j1h0Var == null ? 0 : j1h0Var.hashCode())) * 31;
        asb0 asb0Var = this.k;
        return iHashCode8 + (asb0Var != null ? asb0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.f21030a + ", fetcherCoroutineContext=" + this.b + ", decoderCoroutineContext=" + this.c + ", memoryCachePolicy=" + this.d + ", diskCachePolicy=" + this.e + ", networkCachePolicy=" + this.f + ", placeholderFactory=" + this.g + ", errorFactory=" + this.h + ", fallbackFactory=" + pnk0.q + ", sizeResolver=" + this.i + ", scale=" + this.j + ", precision=" + this.k + Separators.RPAREN;
    }
}
