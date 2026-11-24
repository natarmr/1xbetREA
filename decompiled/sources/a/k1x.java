package a;

import android.content.Context;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k1x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17551a;
    public l1x b;
    public Object c;
    public uto0 d;
    public n1x e;
    public String f;
    public boolean g;
    public Map h;
    public String i;
    public CoroutineContext j;
    public CoroutineContext k;
    public CoroutineContext l;
    public vi9 m;
    public vi9 n;
    public vi9 o;
    public Function1 p;
    public Function1 q;
    public s7k0 r;
    public j1h0 s;
    public asb0 t;
    public Object u;

    public k1x(o1x o1xVar, Context context) {
        this.f17551a = context;
        this.b = o1xVar.w;
        this.c = o1xVar.b;
        this.d = o1xVar.c;
        this.e = o1xVar.d;
        this.f = o1xVar.e;
        this.h = o1xVar.f;
        this.i = o1xVar.g;
        m1x m1xVar = o1xVar.v;
        this.j = m1xVar.f21030a;
        this.k = m1xVar.b;
        this.l = m1xVar.c;
        this.m = m1xVar.d;
        this.n = m1xVar.e;
        this.o = m1xVar.f;
        this.p = m1xVar.g;
        this.q = m1xVar.h;
        this.r = m1xVar.i;
        this.s = m1xVar.j;
        this.t = m1xVar.k;
        this.u = o1xVar.u;
    }

    public final o1x a() {
        Map mapF0;
        luo luoVar;
        Object obj = this.c;
        if (obj == null) {
            obj = i860.f14324a;
        }
        Object obj2 = obj;
        uto0 uto0Var = this.d;
        n1x n1xVar = this.e;
        String str = this.f;
        Map map = this.h;
        if (Intrinsics.d(map, Boolean.valueOf(this.g))) {
            map.getClass();
            mapF0 = aac.f0(zys0.c(map));
        } else {
            if (!(map instanceof Map)) {
                throw new AssertionError();
            }
            mapF0 = map;
        }
        Map map2 = mapF0;
        map2.getClass();
        String str2 = this.i;
        l1x l1xVar = this.b;
        yzp yzpVar = l1xVar.f19280a;
        vi9 vi9Var = this.m;
        if (vi9Var == null) {
            vi9Var = l1xVar.e;
        }
        vi9 vi9Var2 = vi9Var;
        vi9 vi9Var3 = this.n;
        if (vi9Var3 == null) {
            vi9Var3 = l1xVar.f;
        }
        vi9 vi9Var4 = vi9Var3;
        vi9 vi9Var5 = this.o;
        if (vi9Var5 == null) {
            vi9Var5 = l1xVar.g;
        }
        vi9 vi9Var6 = vi9Var5;
        CoroutineContext coroutineContext = this.j;
        if (coroutineContext == null) {
            coroutineContext = l1xVar.b;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        CoroutineContext coroutineContext3 = this.k;
        if (coroutineContext3 == null) {
            coroutineContext3 = l1xVar.c;
        }
        CoroutineContext coroutineContext4 = coroutineContext3;
        CoroutineContext coroutineContext5 = this.l;
        if (coroutineContext5 == null) {
            coroutineContext5 = l1xVar.d;
        }
        CoroutineContext coroutineContext6 = coroutineContext5;
        Function1 function1 = this.p;
        Function1 function2 = this.q;
        pnk0 pnk0Var = pnk0.q;
        s7k0 s7k0Var = this.r;
        if (s7k0Var == null) {
            s7k0Var = l1xVar.k;
        }
        s7k0 s7k0Var2 = s7k0Var;
        j1h0 j1h0Var = this.s;
        if (j1h0Var == null) {
            j1h0Var = l1xVar.l;
        }
        j1h0 j1h0Var2 = j1h0Var;
        asb0 asb0Var = this.t;
        if (asb0Var == null) {
            asb0Var = l1xVar.m;
        }
        asb0 asb0Var2 = asb0Var;
        Object obj3 = this.u;
        if (obj3 instanceof juo) {
            luoVar = new luo(aac.f0(((juo) obj3).f17165a));
        } else {
            if (!(obj3 instanceof luo)) {
                throw new AssertionError();
            }
            luoVar = (luo) obj3;
        }
        return new o1x(this.f17551a, obj2, uto0Var, n1xVar, str, map2, str2, yzpVar, coroutineContext2, coroutineContext4, coroutineContext6, vi9Var2, vi9Var4, vi9Var6, function1, function2, pnk0Var, s7k0Var2, j1h0Var2, asb0Var2, luoVar, new m1x(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t), this.b);
    }

    public final juo b() {
        Object obj = this.u;
        if (obj instanceof juo) {
            return (juo) obj;
        }
        if (!(obj instanceof luo)) {
            throw new AssertionError();
        }
        juo juoVar = new juo((luo) obj);
        this.u = juoVar;
        return juoVar;
    }

    public final void c(int i) {
        this.r = new nbe0(q7x.r(i, i));
    }

    public final void d(int i, int i2) {
        this.r = new nbe0(q7x.r(i, i2));
    }

    public k1x(Context context) {
        this.f17551a = context;
        this.b = l1x.o;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.h = lunVar;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        pnk0 pnk0Var = pnk0.q;
        this.p = pnk0Var;
        this.q = pnk0Var;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = luo.b;
    }
}
