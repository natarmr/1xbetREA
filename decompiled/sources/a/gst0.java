package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class gst0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rrt0 f11847a;
    public final knf0 b;
    public final vwb0 c;

    public gst0(rrt0 rrt0Var, knf0 knf0Var, vwb0 vwb0Var) {
        rrt0Var.getClass();
        knf0Var.getClass();
        vwb0Var.getClass();
        this.f11847a = rrt0Var;
        this.b = knf0Var;
        this.c = vwb0Var;
    }

    public final boolean a() {
        Object g0g0Var;
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = this.f11847a.a();
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return !(g0g0Var instanceof g0g0);
    }

    public final void b() {
        rrt0 rrt0Var = this.f11847a;
        rrt0Var.e = null;
        vwb0 vwb0Var = rrt0Var.f31002a;
        vwb0Var.i("user_json_v_2");
        vwb0Var.e("user_was_log", true);
        rrt0Var.b(false);
        this.c.g("last_balance_id", 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v13, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final List c() {
        Object g0g0Var;
        rrt0 rrt0Var = this.f11847a;
        rrt0Var.getClass();
        try {
            e0g0 e0g0Var = j0g0.b;
            String strC = rrt0Var.f31002a.c("SHOWN_AUTH_REMINDER_NOTIFICATIONS", "");
            if (strC.length() == 0) {
                g0g0Var = iun.f15405a;
            } else {
                yby ybyVarH = ncy.h(rrt0Var.b.e(strC));
                ArrayList<edy> arrayList = new ArrayList(r3d.q(ybyVarH, 10));
                Iterator it = ybyVarH.iterator();
                while (it.hasNext()) {
                    arrayList.add(ncy.i((mcy) it.next()));
                }
                g0g0Var = new ArrayList(r3d.q(arrayList, 10));
                for (edy edyVar : arrayList) {
                    mcy mcyVar = (mcy) edyVar.get("AUTH_REMINDER_VALUE");
                    boolean zE = false;
                    int iF = mcyVar != null ? ncy.f(ncy.j(mcyVar)) : 0;
                    mcy mcyVar2 = (mcy) edyVar.get("AUTH_REMINDER_SHOWN");
                    if (mcyVar2 != null) {
                        zE = ncy.e(ncy.j(mcyVar2));
                    }
                    g0g0Var.add(new mn4(iF, zE));
                }
            }
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        Object obj = g0g0Var;
        if (thA != null) {
            thA.printStackTrace();
            obj = iun.f15405a;
        }
        return (List) obj;
    }

    public final boolean d(boolean z) {
        krt0 krt0VarA = this.f11847a.a();
        return z ? krt0VarA.c : krt0VarA.b;
    }

    public final long e() {
        Object g0g0Var;
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = Long.valueOf(this.f11847a.a().f18785a);
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = 0L;
        }
        return ((Number) g0g0Var).longValue();
    }

    public final boolean f() {
        krt0 krt0VarA = this.f11847a.a();
        return krt0VarA.c || krt0VarA.b;
    }

    public final void g(mn4 mn4Var) {
        List listC = c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            if (((mn4) obj).f22070a != mn4Var.f22070a) {
                arrayList.add(obj);
            }
        }
        ArrayList<mn4> arrayListR0 = CollectionsKt.r0(arrayList, mn4Var);
        rrt0 rrt0Var = this.f11847a;
        rrt0Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (mn4 mn4Var2 : arrayListR0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            jdy jdyVarB = ncy.b(Integer.valueOf(mn4Var2.f22070a));
            jdyVarB.getClass();
            jdy jdyVarA = ncy.a(Boolean.valueOf(mn4Var2.b));
            jdyVarA.getClass();
            arrayList2.add(new edy(linkedHashMap));
        }
        rrt0Var.f31002a.h("SHOWN_AUTH_REMINDER_NOTIFICATIONS", new yby(arrayList2).toString());
    }

    public final void h(boolean z, boolean z2) {
        k(krt0.a(this.f11847a.a(), z, z2, 0.0d, 9));
    }

    public final void i() {
        k(krt0.a(this.f11847a.a(), false, false, 0.0d, 13));
    }

    public final void j() {
        k(krt0.a(this.f11847a.a(), false, false, 0.0d, 11));
    }

    public final void k(krt0 krt0Var) {
        rrt0 rrt0Var = this.f11847a;
        rrt0Var.getClass();
        rrt0Var.e = krt0Var;
        vwb0 vwb0Var = rrt0Var.f31002a;
        vby vbyVar = rrt0Var.b;
        vbyVar.getClass();
        vwb0Var.h("user_json_v_2", vbyVar.d(krt0.Companion.serializer(), krt0Var));
    }
}
