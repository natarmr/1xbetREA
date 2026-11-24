package a;

import android.gov.nist.core.Separators;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l1x {
    public static final l1x o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yzp f19280a;
    public final CoroutineContext b;
    public final CoroutineContext c;
    public final CoroutineContext d;
    public final vi9 e;
    public final vi9 f;
    public final vi9 g;
    public final Function1 h;
    public final Function1 i;
    public final Function1 j;
    public final s7k0 k;
    public final j1h0 l;
    public final asb0 m;
    public final luo n;

    static {
        pnk0 pnk0Var = pnk0.q;
        ggy ggyVar = yzp.f43526a;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f46065a;
        rwj rwjVar = tvk.f34603a;
        dvj dvjVar = dvj.c;
        vi9 vi9Var = vi9.c;
        o = new l1x(ggyVar, gVar, dvjVar, dvjVar, vi9Var, vi9Var, vi9Var, pnk0Var, pnk0Var, pnk0Var, s7k0.f31754a, j1h0.b, asb0.f1383a, luo.b);
    }

    public l1x(yzp yzpVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, vi9 vi9Var, vi9 vi9Var2, vi9 vi9Var3, Function1 function1, Function1 function2, Function1 function3, s7k0 s7k0Var, j1h0 j1h0Var, asb0 asb0Var, luo luoVar) {
        this.f19280a = yzpVar;
        this.b = coroutineContext;
        this.c = coroutineContext2;
        this.d = coroutineContext3;
        this.e = vi9Var;
        this.f = vi9Var2;
        this.g = vi9Var3;
        this.h = function1;
        this.i = function2;
        this.j = function3;
        this.k = s7k0Var;
        this.l = j1h0Var;
        this.m = asb0Var;
        this.n = luoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1x)) {
            return false;
        }
        l1x l1xVar = (l1x) obj;
        return Intrinsics.d(this.f19280a, l1xVar.f19280a) && Intrinsics.d(this.b, l1xVar.b) && Intrinsics.d(this.c, l1xVar.c) && Intrinsics.d(this.d, l1xVar.d) && this.e == l1xVar.e && this.f == l1xVar.f && this.g == l1xVar.g && Intrinsics.d(this.h, l1xVar.h) && Intrinsics.d(this.i, l1xVar.i) && Intrinsics.d(this.j, l1xVar.j) && Intrinsics.d(this.k, l1xVar.k) && this.l == l1xVar.l && this.m == l1xVar.m && Intrinsics.d(this.n, l1xVar.n);
    }

    public final int hashCode() {
        return this.n.f20682a.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f19280a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.f19280a + ", interceptorCoroutineContext=" + this.b + ", fetcherCoroutineContext=" + this.c + ", decoderCoroutineContext=" + this.d + ", memoryCachePolicy=" + this.e + ", diskCachePolicy=" + this.f + ", networkCachePolicy=" + this.g + ", placeholderFactory=" + this.h + ", errorFactory=" + this.i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.k + ", scale=" + this.l + ", precision=" + this.m + ", extras=" + this.n + Separators.RPAREN;
    }
}
