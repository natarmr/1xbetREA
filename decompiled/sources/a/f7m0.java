package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class f7m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0l0 f9065a;
    public boolean b = true;
    public final HashMap c;
    public final HashMap d;
    public final HashMap e;
    public final k3e f;
    public int g;
    public final ArrayList h;
    public final ArrayList i;
    public boolean j;
    public final w6k k;
    public long l;

    public f7m0(w6k w6kVar) {
        HashMap map = new HashMap();
        this.c = map;
        this.d = new HashMap();
        this.e = new HashMap();
        k3e k3eVar = new k3e(this);
        this.f = k3eVar;
        this.g = 0;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = true;
        k3eVar.f17612a = 0;
        map.put(0, k3eVar);
        this.k = w6kVar;
        this.l = r4e.b(0, 0, 0, 0, 15);
        k6z k6zVar = k6z.f17794a;
        this.f9065a = new b0l0(this, (byte) 3);
    }

    public final void a(l4e l4eVar) {
        HashMap map;
        hvv hvvVar;
        jvv jvvVarS;
        jvv jvvVarS2;
        l4eVar.u0.clear();
        k3e k3eVar = this.f;
        k3eVar.d0.a(l4eVar, 0);
        k3eVar.e0.a(l4eVar, 1);
        HashMap map2 = this.d;
        Iterator it = map2.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = this.c;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            jvv jvvVarS3 = ((hvv) map2.get(next)).s();
            if (jvvVarS3 != null) {
                vme0 vme0VarC = (vme0) map.get(next);
                if (vme0VarC == null) {
                    vme0VarC = c(next);
                }
                vme0VarC.b(jvvVarS3);
            }
        }
        for (Object obj : map.keySet()) {
            vme0 vme0Var = (vme0) map.get(obj);
            if (vme0Var != k3eVar && (vme0Var.c() instanceof hvv) && (jvvVarS2 = ((hvv) vme0Var.c()).s()) != null) {
                vme0 vme0VarC2 = (vme0) map.get(obj);
                if (vme0VarC2 == null) {
                    vme0VarC2 = c(obj);
                }
                vme0VarC2.b(jvvVarS2);
            }
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            vme0 vme0Var2 = (vme0) map.get(it2.next());
            if (vme0Var2 != k3eVar) {
                k4e k4eVarA = vme0Var2.a();
                k4eVarA.k0 = vme0Var2.getKey().toString();
                k4eVarA.V = null;
                if (vme0Var2.c() instanceof siv) {
                    vme0Var2.apply();
                }
                l4eVar.W(k4eVarA);
            } else {
                vme0Var2.b(l4eVar);
            }
        }
        Iterator it3 = map2.keySet().iterator();
        while (it3.hasNext()) {
            hvv hvvVar2 = (hvv) map2.get(it3.next());
            if (hvvVar2.s() != null) {
                Iterator it4 = hvvVar2.n0.iterator();
                while (it4.hasNext()) {
                    hvvVar2.s().W(((vme0) map.get(it4.next())).a());
                }
                hvvVar2.apply();
            } else {
                hvvVar2.apply();
            }
        }
        Iterator it5 = map.keySet().iterator();
        while (it5.hasNext()) {
            vme0 vme0Var3 = (vme0) map.get(it5.next());
            if (vme0Var3 != k3eVar && (vme0Var3.c() instanceof hvv) && (jvvVarS = (hvvVar = (hvv) vme0Var3.c()).s()) != null) {
                for (Object obj2 : hvvVar.n0) {
                    vme0 vme0Var4 = (vme0) map.get(obj2);
                    if (vme0Var4 != null) {
                        jvvVarS.W(vme0Var4.a());
                    } else if (obj2 instanceof vme0) {
                        jvvVarS.W(((vme0) obj2).a());
                    } else {
                        System.out.println("couldn't find reference for " + obj2);
                    }
                }
                vme0Var3.apply();
            }
        }
        for (Object obj3 : map.keySet()) {
            vme0 vme0Var5 = (vme0) map.get(obj3);
            vme0Var5.apply();
            k4e k4eVarA2 = vme0Var5.a();
            if (k4eVarA2 != null && obj3 != null) {
                k4eVarA2.k = obj3.toString();
            }
        }
    }

    public final void b(Object obj) {
        this.h.add(obj);
        this.j = true;
    }

    public final k3e c(Object obj) {
        HashMap map = this.c;
        vme0 vme0Var = (vme0) map.get(obj);
        Object obj2 = vme0Var;
        if (vme0Var == null) {
            k3e k3eVar = new k3e(this);
            map.put(obj, k3eVar);
            k3eVar.f17612a = obj;
            obj2 = k3eVar;
        }
        if (obj2 instanceof k3e) {
            return (k3e) obj2;
        }
        return null;
    }

    public final int d(Float f) {
        return Math.round(f.floatValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final siv e(int i, String str) {
        k3e k3eVarC = c(str);
        vuo vuoVar = k3eVarC.c;
        if (vuoVar == null || !(vuoVar instanceof siv)) {
            siv sivVar = new siv(this);
            sivVar.b = i;
            sivVar.g = str;
            k3eVarC.c = sivVar;
            k3eVarC.b(sivVar.a());
        }
        return (siv) k3eVarC.c;
    }

    public final hvv f(int i) {
        hvv zkwVar;
        StringBuilder sb = new StringBuilder("__HELPER_KEY_");
        int i2 = this.g;
        this.g = i2 + 1;
        String strJ = rz4.j(i2, "__", sb);
        HashMap map = this.d;
        hvv hvvVar = (hvv) map.get(strJ);
        hvv hvvVar2 = hvvVar;
        if (hvvVar == null) {
            int i3 = 4;
            byte b = 1;
            switch (hne.E(i)) {
                case 0:
                    zkwVar = new zkw(this, 1);
                    break;
                case 1:
                    zkwVar = new hcu0(this, 2);
                    break;
                case 2:
                    t12 t12Var = new t12(this, i3, (byte) 0);
                    t12Var.p0 = 0.5f;
                    zkwVar = t12Var;
                    break;
                case 3:
                    t12 t12Var2 = new t12(this, i3, b);
                    t12Var2.p0 = 0.5f;
                    zkwVar = t12Var2;
                    break;
                case 4:
                    zkwVar = new av5(this, 5);
                    break;
                case 5:
                default:
                    zkwVar = new hvv(this, i);
                    break;
                case 6:
                case 7:
                    zkwVar = new zoq(this, i);
                    break;
                case 8:
                case 9:
                case 10:
                    zkwVar = new sgv(this, i);
                    break;
            }
            zkwVar.f17612a = strJ;
            map.put(strJ, zkwVar);
            hvvVar2 = zkwVar;
        }
        return hvvVar2;
    }

    public final void g() {
        HashMap map = this.c;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            ((vme0) map.get(it.next())).a().E();
        }
        map.clear();
        map.put(0, this.f);
        this.d.clear();
        this.e.clear();
        this.h.clear();
        this.j = true;
    }
}
