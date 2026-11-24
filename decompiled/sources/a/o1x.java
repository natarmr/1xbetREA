package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o1x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24504a;
    public final Object b;
    public final uto0 c;
    public final n1x d;
    public final String e;
    public final Map f;
    public final String g;
    public final yzp h;
    public final CoroutineContext i;
    public final CoroutineContext j;
    public final CoroutineContext k;
    public final vi9 l;
    public final vi9 m;
    public final vi9 n;
    public final Function1 o;
    public final Function1 p;
    public final Function1 q;
    public final s7k0 r;
    public final j1h0 s;
    public final asb0 t;
    public final luo u;
    public final m1x v;
    public final l1x w;

    public o1x(Context context, Object obj, uto0 uto0Var, n1x n1xVar, String str, Map map, String str2, yzp yzpVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, vi9 vi9Var, vi9 vi9Var2, vi9 vi9Var3, Function1 function1, Function1 function2, Function1 function3, s7k0 s7k0Var, j1h0 j1h0Var, asb0 asb0Var, luo luoVar, m1x m1xVar, l1x l1xVar) {
        this.f24504a = context;
        this.b = obj;
        this.c = uto0Var;
        this.d = n1xVar;
        this.e = str;
        this.f = map;
        this.g = str2;
        this.h = yzpVar;
        this.i = coroutineContext;
        this.j = coroutineContext2;
        this.k = coroutineContext3;
        this.l = vi9Var;
        this.m = vi9Var2;
        this.n = vi9Var3;
        this.o = function1;
        this.p = function2;
        this.q = function3;
        this.r = s7k0Var;
        this.s = j1h0Var;
        this.t = asb0Var;
        this.u = luoVar;
        this.v = m1xVar;
        this.w = l1xVar;
    }

    public static k1x a(o1x o1xVar) {
        Context context = o1xVar.f24504a;
        o1xVar.getClass();
        return new k1x(o1xVar, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1x)) {
            return false;
        }
        o1x o1xVar = (o1x) obj;
        return Intrinsics.d(this.f24504a, o1xVar.f24504a) && this.b.equals(o1xVar.b) && Intrinsics.d(this.c, o1xVar.c) && Intrinsics.d(this.d, o1xVar.d) && Intrinsics.d(this.e, o1xVar.e) && this.f.equals(o1xVar.f) && Intrinsics.d(this.g, o1xVar.g) && Intrinsics.d(this.h, o1xVar.h) && Intrinsics.d(this.i, o1xVar.i) && Intrinsics.d(this.j, o1xVar.j) && Intrinsics.d(this.k, o1xVar.k) && this.l == o1xVar.l && this.m == o1xVar.m && this.n == o1xVar.n && Intrinsics.d(this.o, o1xVar.o) && Intrinsics.d(this.p, o1xVar.p) && Intrinsics.d(this.q, o1xVar.q) && Intrinsics.d(this.r, o1xVar.r) && this.s == o1xVar.s && this.t == o1xVar.t && this.u.equals(o1xVar.u) && this.v.equals(o1xVar.v) && Intrinsics.d(this.w, o1xVar.w);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f24504a.hashCode() * 31)) * 31;
        uto0 uto0Var = this.c;
        int iHashCode2 = (iHashCode + (uto0Var == null ? 0 : uto0Var.hashCode())) * 31;
        n1x n1xVar = this.d;
        int iHashCode3 = (iHashCode2 + (n1xVar == null ? 0 : n1xVar.hashCode())) * 31;
        String str = this.e;
        int iF = ohs0.f(this.f, (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.g;
        return this.w.hashCode() + ((this.v.hashCode() + ohs0.f(this.u.f20682a, (this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((iF + (str2 != null ? str2.hashCode() : 0)) * 31)) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.f24504a + ", data=" + this.b + ", target=" + this.c + ", listener=" + this.d + ", memoryCacheKey=" + this.e + ", memoryCacheKeyExtras=" + this.f + ", diskCacheKey=" + this.g + ", fileSystem=" + this.h + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.i + ", fetcherCoroutineContext=" + this.j + ", decoderCoroutineContext=" + this.k + ", memoryCachePolicy=" + this.l + ", diskCachePolicy=" + this.m + ", networkCachePolicy=" + this.n + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.o + ", errorFactory=" + this.p + ", fallbackFactory=" + this.q + ", sizeResolver=" + this.r + ", scale=" + this.s + ", precision=" + this.t + ", extras=" + this.u + ", defined=" + this.v + ", defaults=" + this.w + Separators.RPAREN;
    }
}
