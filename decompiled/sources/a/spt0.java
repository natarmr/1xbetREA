package a;

import android.util.Log;
import android.view.Surface;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class spt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tpt0 f32601a;
    public final m1a b;
    public final r4x c;
    public final zii0 d;
    public final Object e;
    public kzj f;
    public final LinkedHashMap g;
    public LinkedHashMap h;
    public odd i;

    public spt0(tpt0 tpt0Var, m1a m1aVar, r4x r4xVar, zii0 zii0Var) {
        tpt0Var.getClass();
        zii0Var.getClass();
        this.f32601a = tpt0Var;
        this.b = m1aVar;
        this.c = r4xVar;
        this.d = zii0Var;
        this.e = new Object();
        this.g = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(spt0 spt0Var, zje zjeVar) {
        qpt0 qpt0Var;
        if (zjeVar instanceof qpt0) {
            qpt0Var = (qpt0) zjeVar;
            int i = qpt0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                qpt0Var.k = i - Integer.MIN_VALUE;
            } else {
                qpt0Var = new qpt0(spt0Var, zjeVar);
            }
        } else {
            qpt0Var = new qpt0(spt0Var, zjeVar);
        }
        Object obj = qpt0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = qpt0Var.k;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    z1x.P(obj);
                    return obj;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            synchronized (spt0Var.e) {
                kzj kzjVar = spt0Var.f;
                if (kzjVar == null || spt0Var.i != null) {
                    return Boolean.FALSE;
                }
                qpt0Var.k = 1;
                Object objQ = kzjVar.q(qpt0Var);
                return objQ == wneVar ? wneVar : objQ;
            }
        } catch (CancellationException unused) {
            if (l8x.j0()) {
                Log.w("CXCP", "Surface setup was cancelled");
            }
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, zje zjeVar, List list) {
        rpt0 rpt0Var;
        if (zjeVar instanceof rpt0) {
            rpt0Var = (rpt0) zjeVar;
            int i = rpt0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                rpt0Var.k = i - Integer.MIN_VALUE;
            } else {
                rpt0Var = new rpt0(this, zjeVar);
            }
        } else {
            rpt0Var = new rpt0(this, zjeVar);
        }
        Object objU = rpt0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = rpt0Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objU);
            k6s0 k6s0Var = new k6s0(list, yjeVar, (byte) 12);
            rpt0Var.k = 1;
            objU = msm0.u(j, k6s0Var, rpt0Var);
            if (objU == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objU);
        }
        List list2 = (List) objU;
        return list2 == null ? iun.f15405a : list2;
    }

    public final void c(Surface surface) {
        hzj hzjVar;
        surface.getClass();
        synchronized (this.e) {
            try {
                LinkedHashMap linkedHashMap = this.h;
                if (linkedHashMap != null && (hzjVar = (hzj) linkedHashMap.get(surface)) != null && !this.g.containsKey(surface)) {
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "SurfaceActive " + hzjVar + " in " + this);
                    }
                    this.g.put(surface, hzjVar);
                    try {
                        hzjVar.d();
                    } catch (gzj e) {
                        if (l8x.j0()) {
                            Log.w("CXCP", "Error when " + surface + " going to increase the use count.", e);
                        }
                        this.d.a(e.f12181a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        Set setKeySet;
        j3a j3aVarA = this.b.a();
        j3aVarA.getClass();
        synchronized (j3aVarA.f15821a) {
            try {
                j3aVarA.c.add(this);
                LinkedHashMap linkedHashMap = j3aVarA.b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Number) entry.getValue()).intValue() > 0) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                setKeySet = linkedHashMap2.keySet();
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            c((Surface) it.next());
        }
    }

    public final void e() {
        synchronized (this.e) {
            try {
                if (this.g.isEmpty() && this.h == null) {
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", this + " remove surface listener");
                    }
                    j3a j3aVarA = this.b.a();
                    j3aVarA.getClass();
                    synchronized (j3aVarA.f15821a) {
                        j3aVarA.c.remove(this);
                    }
                    odd oddVar = this.i;
                    if (oddVar != null) {
                        oddVar.N(Unit.f46060a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
