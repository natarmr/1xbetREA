package a;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class nkt extends vw5 {
    public final ieu d;
    public final jw20 e;
    public final mne f;
    public final kh3 g;
    public final gsd h;
    public final p7m0 i;
    public Function1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nkt(o8f o8fVar, ieu ieuVar, jw20 jw20Var, mne mneVar, duj dujVar) {
        super(o8fVar, mneVar, dujVar);
        o8fVar.getClass();
        this.d = ieuVar;
        this.e = jw20Var;
        this.f = mneVar;
        this.g = kh3.CONFIG;
        this.h = gsd.GEO;
        this.i = q7m0.a(i8d.f14333a);
    }

    @Override // a.vw5
    public final void a(sje sjeVar) {
        sjeVar.getClass();
        this.i.o(null, i8d.b);
        sac.V(sjeVar, new f3s(this, sjeVar, (byte) 15), null, this.f.c, new gkr(this, null, (byte) 10), 10);
    }

    @Override // a.vw5
    public final kh3 b() {
        return this.g;
    }

    @Override // a.vw5
    public final p7m0 c() {
        return this.i;
    }

    @Override // a.vw5
    public final List d() {
        return null;
    }

    @Override // a.vw5
    public final fnf0 e() {
        return this.h;
    }
}
