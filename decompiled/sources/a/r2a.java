package a;

import android.os.Looper;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r2a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29720a = new Object();
    public final cyu b = new cyu((byte) 5);
    public final hy40 c = new hy40();
    public b0a d;
    public r0a e;
    public p15 f;
    public boolean g;
    public final LinkedHashMap h;

    public r2a() {
        r0a r0aVar = r0a.c;
        this.e = r0aVar;
        this.h = new LinkedHashMap();
        c(r0aVar, null);
    }

    public final void a(b0a b0aVar, rev revVar) {
        nev nevVar = nev.c;
        nev nevVar2 = nev.b;
        if (b0aVar != this.d) {
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "Ignored stale transition " + revVar + " for " + b0aVar);
                return;
            }
            return;
        }
        r0a r0aVar = this.e;
        r0aVar.getClass();
        revVar.getClass();
        int iOrdinal = r0aVar.ordinal();
        r0a r0aVar2 = r0a.g;
        r0a r0aVar3 = r0a.f;
        q2a q2aVar = null;
        if (iOrdinal != 2) {
            r0a r0aVar4 = r0a.d;
            r0a r0aVar5 = r0a.c;
            if (iOrdinal != 3) {
                oev oevVar = oev.b;
                r0a r0aVar6 = r0a.e;
                if (iOrdinal != 4) {
                    pev pevVar = pev.b;
                    if (iOrdinal != 5) {
                        if (iOrdinal == 6) {
                            if (revVar.equals(pevVar)) {
                                q2aVar = new q2a(r0aVar6);
                            } else if (revVar.equals(oevVar)) {
                                q2aVar = new q2a(r0aVar5);
                            } else if (revVar instanceof mev) {
                                int i = ((mev) revVar).b;
                                q2aVar = j47.z0(i) ? new q2a(r0aVar4, j47.F0(i)) : new q2a(r0aVar5, j47.F0(i));
                            }
                        }
                    } else if (revVar.equals(nevVar2)) {
                        q2aVar = new q2a(r0aVar2);
                    } else if (revVar instanceof mev) {
                        mev mevVar = (mev) revVar;
                        int i2 = mevVar.b;
                        if (mevVar.c) {
                            q2aVar = new q2a(r0aVar3, j47.F0(i2));
                        } else {
                            q2aVar = j47.z0(i2) ? new q2a(r0aVar4, j47.F0(i2)) : new q2a(r0aVar6, j47.F0(i2));
                        }
                    } else if (revVar.equals(pevVar)) {
                        q2aVar = new q2a(r0aVar6);
                    } else if (revVar.equals(oevVar)) {
                        q2aVar = new q2a(r0aVar5);
                    }
                } else if (revVar.equals(oevVar)) {
                    q2aVar = new q2a(r0aVar5);
                } else if (revVar.equals(nevVar)) {
                    q2aVar = new q2a(r0aVar3);
                } else if (revVar instanceof mev) {
                    q2aVar = new q2a(r0aVar6, j47.F0(((mev) revVar).b));
                }
            } else if (revVar.equals(nevVar)) {
                q2aVar = new q2a(r0aVar3);
            } else if (revVar.equals(nevVar2)) {
                q2aVar = new q2a(r0aVar2);
            } else if (revVar instanceof mev) {
                int i3 = ((mev) revVar).b;
                q2aVar = j47.z0(i3) ? new q2a(r0aVar4, j47.F0(i3)) : new q2a(r0aVar5, j47.F0(i3));
            }
        } else if (revVar.equals(nevVar)) {
            q2aVar = new q2a(r0aVar3);
        } else if (revVar.equals(nevVar2)) {
            q2aVar = new q2a(r0aVar2);
        }
        if (q2aVar == null) {
            if (l8x.j0()) {
                Log.w("CXCP", "Impermissible state transition: current camera internal state: " + this.e + ", received graph state: " + revVar);
                return;
            }
            return;
        }
        this.e = q2aVar.f27991a;
        this.f = q2aVar.b;
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "Updated current camera internal state to " + q2aVar);
        }
        c(this.e, this.f);
    }

    public final void b(b0a b0aVar, rev revVar) {
        revVar.getClass();
        synchronized (this.f29720a) {
            if (this.g) {
                if (l8x.j0()) {
                    Log.w("CXCP", "Ignoring graph state update " + revVar + " on removed camera.");
                }
                return;
            }
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", b0aVar + " state updated to " + revVar);
            }
            a(b0aVar, revVar);
        }
    }

    public final void c(r0a r0aVar, p15 p15Var) {
        List<Map.Entry> listL0;
        ((hy40) this.b.f5196a).i(new yh00(r0aVar));
        r0aVar.getClass();
        int iOrdinal = r0aVar.ordinal();
        int i = 5;
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                i = 1;
            } else if (iOrdinal == 4) {
                i = 4;
            } else if (iOrdinal == 5) {
                i = 2;
            } else {
                if (iOrdinal != 6) {
                    e9d0.i(r0aVar, "Unexpected CameraInternal state: ");
                    return;
                }
                i = 3;
            }
        }
        o15 o15Var = new o15(i, p15Var);
        hy40 hy40Var = this.c;
        hy40Var.getClass();
        if (Intrinsics.d(Looper.myLooper(), Looper.getMainLooper())) {
            hy40Var.l(o15Var);
        } else {
            hy40Var.i(o15Var);
        }
        synchronized (this.f29720a) {
            listL0 = CollectionsKt.L0(this.h.entrySet());
        }
        for (Map.Entry entry : listL0) {
            ((Executor) entry.getValue()).execute(new fy2((sbe) entry.getKey(), o15Var, (byte) 19));
        }
    }
}
