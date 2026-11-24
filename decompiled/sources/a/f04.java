package a;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class f04 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dtb f8701a;
    public final fvt0 b;
    public final CoroutineContext c;
    public final CoroutineContext d;
    public int f;
    public final d04 h;
    public final AtomicInteger i;
    public final gmq j;
    public final vae0 k;
    public final AtomicReference l;
    public final CopyOnWriteArrayList m;
    public final b33 n;
    public final n0o0 o;
    public final mfr p;
    public final p7m0 e = q7m0.a(Boolean.FALSE);
    public final AtomicReference g = new AtomicReference(null);

    public f04(dtb dtbVar, fvt0 fvt0Var, CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        this.f8701a = dtbVar;
        this.b = fvt0Var;
        this.c = coroutineContext;
        this.d = coroutineContext2;
        d04 d04Var = new d04(this, coroutineContext);
        this.h = d04Var;
        this.i = new AtomicInteger(0);
        vsg0 vsg0Var = new vsg0(new tg3(ulb.D(new i89(d04Var.k, (byte) 22), -1), (yje) null, this));
        rwj rwjVar = tvk.f34603a;
        this.j = ulb.L(vsg0Var, ys10.f43147a);
        this.k = vtb.M(d04Var.l);
        this.l = new AtomicReference(null);
        this.m = new CopyOnWriteArrayList();
        this.n = new b33((Object) this, (byte) 10);
        this.o = maz.b(new a04((byte) 0));
        this.p = new mfr(this);
    }
}
