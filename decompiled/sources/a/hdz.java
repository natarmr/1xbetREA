package a;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class hdz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gmq f12895a;
    public final CoroutineContext b;
    public final d04 c;
    public final pz40 d;
    public final pz40 e;

    public hdz(gmq gmqVar) {
        this.f12895a = gmqVar;
        CoroutineContext coroutineContext = n6t0.f23011a;
        this.b = coroutineContext;
        d04 d04Var = new d04(this, coroutineContext, gmqVar instanceof noj0 ? (fl80) CollectionsKt.firstOrNull(((noj0) gmqVar).d()) : null);
        this.c = d04Var;
        this.d = androidx.compose.runtime.e.e(d04Var.d());
        h7d h7dVar = (h7d) d04Var.k.f40549a.getValue();
        if (h7dVar == null) {
            dp00 dp00Var = kdz.f18128a;
            h7dVar = new h7d(dp00Var.f6438a, dp00Var.b, dp00Var.c, dp00Var, null);
        }
        this.e = androidx.compose.runtime.e.e(h7dVar);
    }

    public final Object a(bnn0 bnn0Var) {
        Object objC = this.c.k.f40549a.c(new uap(new v6w(this, (byte) 28), (byte) 12), bnn0Var);
        wne wneVar = wne.f39444a;
        if (objC != wneVar) {
            objC = Unit.f46060a;
        }
        return objC == wneVar ? objC : Unit.f46060a;
    }

    public final Object b(int i) {
        this.c.a(i);
        return d().get(i);
    }

    public final int c() {
        return d().b();
    }

    public final txx d() {
        return (txx) ((hgk0) this.d).getValue();
    }

    public final h7d e() {
        return (h7d) ((hgk0) this.e).getValue();
    }
}
