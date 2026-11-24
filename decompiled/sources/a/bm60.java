package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bm60 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2824a;
    public final /* synthetic */ dm60 b;

    public /* synthetic */ bm60(dm60 dm60Var, byte b) {
        this.f2824a = b;
        this.b = dm60Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f2824a;
        dm60 dm60Var = this.b;
        switch (b) {
            case 0:
                wsz wszVar = dm60.P1;
                ComponentCallbacks2 application = dm60Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(em60.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof em60)) {
                        ze3Var = null;
                    }
                    em60 em60Var = (em60) ze3Var;
                    if (em60Var != null) {
                        i1w0 i1w0VarF = a4n0.f(dm60Var);
                        i1w0VarF.getClass();
                        fvt0 fvt0Var = em60Var.f8033a;
                        bw60 bw60Var = em60Var.b;
                        m1e m1eVar = em60Var.c;
                        mne mneVar = em60Var.d;
                        duj dujVar = em60Var.e;
                        ctf0 ctf0Var = em60Var.f;
                        b4j b4jVar = em60Var.g;
                        g2v g2vVar = em60Var.h;
                        x20 x20Var = em60Var.i;
                        tnc0 tnc0Var = em60Var.j;
                        l570 l570Var = em60Var.k;
                        o3c o3cVar = em60Var.l;
                        lbu lbuVar = em60Var.m;
                        ls lsVar = em60Var.n;
                        yoc yocVar = em60Var.o;
                        wtt wttVar = em60Var.p;
                        us00 us00Var = em60Var.q;
                        bw60Var.getClass();
                        m1eVar.getClass();
                        ctf0Var.getClass();
                        tnc0Var.getClass();
                        return new mmi(bw60Var, fvt0Var, i1w0VarF, m1eVar, mneVar, dujVar, ctf0Var, b4jVar, g2vVar, x20Var, tnc0Var, l570Var, o3cVar, lbuVar, lsVar, yocVar, wttVar, us00Var);
                    }
                }
                jf4.n(b1j.i(em60.class, "Cannot create dependency "));
                return null;
            case 1:
                wsz wszVar2 = dm60.P1;
                fiu0 fiu0Var = dm60Var.N1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                wsz wszVar3 = dm60.P1;
                dm60Var.G0().x(ue8.f35512a);
                return Unit.f46060a;
            default:
                wsz wszVar4 = dm60.P1;
                dm60Var.G0().x(qe8.f28570a);
                return Unit.f46060a;
        }
    }
}
