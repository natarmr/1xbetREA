package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class g7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7d0 f10809a;
    public final vby b;
    public boolean c;
    public jzj e;
    public p070 f;
    public long d = System.currentTimeMillis();
    public final p7m0 g = q7m0.a(xun.f41520a);

    public g7d(vby vbyVar, q7d0 q7d0Var) {
        this.f10809a = q7d0Var;
        this.b = vbyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(kzj kzjVar, zje zjeVar) {
        e7d e7dVar;
        g7d g7dVar;
        if (zjeVar instanceof e7d) {
            e7dVar = (e7d) zjeVar;
            int i = e7dVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                e7dVar.l = i - Integer.MIN_VALUE;
            } else {
                e7dVar = new e7d(this, zjeVar);
            }
        } else {
            e7dVar = new e7d(this, zjeVar);
        }
        Object objQ = e7dVar.j;
        Object obj = wne.f39444a;
        int i2 = e7dVar.l;
        try {
            if (i2 == 0) {
                z1x.P(objQ);
                this.c = true;
                this.e = kzjVar;
                e7dVar.i = this;
                e7dVar.l = 1;
                objQ = kzjVar.q(e7dVar);
                if (objQ == obj) {
                    return obj;
                }
                g7dVar = this;
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g7dVar = e7dVar.i;
                z1x.P(objQ);
            }
            g7dVar.e((d7d) objQ);
            this.c = false;
            this.e = null;
            return Unit.f46060a;
        } catch (Throwable th) {
            this.c = false;
            this.e = null;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zje zjeVar) {
        f7d f7dVar;
        if (zjeVar instanceof f7d) {
            f7dVar = (f7d) zjeVar;
            int i = f7dVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                f7dVar.k = i - Integer.MIN_VALUE;
            } else {
                f7dVar = new f7d(this, zjeVar);
            }
        } else {
            f7dVar = new f7d(this, zjeVar);
        }
        Object objAwait = f7dVar.i;
        wne wneVar = wne.f39444a;
        int i2 = f7dVar.k;
        if (i2 == 0) {
            z1x.P(objAwait);
            jzj jzjVar = this.e;
            if (jzjVar != null) {
                f7dVar.k = 1;
                objAwait = jzjVar.await(f7dVar);
                if (objAwait == wneVar) {
                    return wneVar;
                }
            }
            jf4.n("Deferred is not initialized");
            return null;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objAwait);
        d7d d7dVar = (d7d) objAwait;
        if (d7dVar != null) {
            return d7dVar;
        }
        jf4.n("Deferred is not initialized");
        return null;
    }

    public final d7d c() {
        String string = this.f10809a.a().getString("ALL_GAMES_INFO_KEY", "");
        String str = string != null ? string : "";
        if (str.length() > 0) {
            try {
                return (d7d) this.b.b(d7d.Companion.serializer(), str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public final Object d(zje zjeVar) {
        jzj jzjVar = this.e;
        if (jzjVar == null || !jzjVar.isActive()) {
            return c();
        }
        d7d d7dVarC = c();
        if (d7dVarC != null) {
            return d7dVarC;
        }
        jzj jzjVar2 = this.e;
        if (jzjVar2 == null) {
            return null;
        }
        Object objAwait = jzjVar2.await(zjeVar);
        return objAwait == wne.f39444a ? objAwait : (d7d) objAwait;
    }

    public final void e(d7d d7dVar) {
        q7d0 q7d0Var = this.f10809a;
        if (d7dVar == null) {
            q7d0Var.h("ALL_GAMES_INFO_KEY");
        } else {
            q7d0Var.g("ALL_GAMES_INFO_KEY", this.b.d(d7d.Companion.serializer(), d7dVar));
        }
    }

    public final void f(List list) {
        p7m0 p7m0Var;
        Object value;
        Set set;
        vpv0 vpv0Var;
        long j;
        p070 p070Var;
        p070 p070Var2;
        p070 p070Var3;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            no60 no60Var = (no60) it.next();
            do {
                p7m0Var = this.g;
                value = p7m0Var.getValue();
                set = (Set) value;
                vpv0Var = no60Var.b;
                j = no60Var.f23855a;
            } while (!p7m0Var.m(value, vpv0Var == vpv0.c ? eui0.h(set, Long.valueOf(j)) : eui0.e(set, Long.valueOf(j))));
            d7d d7dVarC = c();
            d7d d7dVarA = null;
            List list2 = (d7dVarC == null || (p070Var3 = d7dVarC.f5589a) == null) ? null : p070Var3.f26136a;
            if (list2 != null && !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                        break;
                    } else if (((pbv) it2.next()).f26728a == j) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i != -1) {
                    vpv0 vpv0Var2 = no60Var.b;
                    pbv pbvVar = (pbv) list2.get(i);
                    ArrayList arrayList = new ArrayList(CollectionsKt.m0(list2, pbvVar));
                    arrayList.add(i, pbv.a(pbvVar, null, vpv0Var2 == vpv0.b, vpv0Var2 != vpv0.c, 163839));
                    d7d d7dVarC2 = c();
                    if (d7dVarC2 != null) {
                        d7d d7dVarC3 = c();
                        if (d7dVarC3 == null || (p070Var2 = d7dVarC3.f5589a) == null) {
                            iun iunVar = iun.f15405a;
                            p070Var = new p070(iunVar, iunVar);
                        } else {
                            p070Var = p070.a(p070Var2, sj3.y0(arrayList));
                        }
                        d7dVarA = d7d.a(d7dVarC2, p070Var);
                    }
                    e(d7dVarA);
                }
            }
        }
    }
}
