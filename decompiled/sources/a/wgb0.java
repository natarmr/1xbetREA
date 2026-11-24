package a;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class wgb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7d0 f39107a;
    public final vby b;
    public final CopyOnWriteArrayList c;
    public final k050 d;

    public wgb0(vby vbyVar, q7d0 q7d0Var) {
        List listB;
        q7d0Var.getClass();
        vbyVar.getClass();
        this.f39107a = q7d0Var;
        this.b = vbyVar;
        String string = q7d0Var.a().getString("DYNAMIC_TOP_CONTENT_TYPE_LIST", "");
        String str = string != null ? string : "";
        if (str.length() > 0) {
            try {
                lhb0[] lhb0VarArrValues = lhb0.values();
                lhb0VarArrValues.getClass();
                listB = (List) vbyVar.b(new zw3(new g0o("org.xplatform.popular.domain.personalization.config.model.PopularPersonalizationTopContentType", (Enum[]) lhb0VarArrValues), (byte) 0), str);
            } catch (Exception unused) {
                listB = b();
            }
        } else {
            listB = b();
        }
        this.c = new CopyOnWriteArrayList(listB);
        this.d = new k050();
    }

    public static List b() {
        return q3d.j(lhb0.f20047a, lhb0.b, lhb0.c, lhb0.d, lhb0.e, lhb0.f, lhb0.g, lhb0.h, lhb0.j, lhb0.k, lhb0.l, lhb0.m, lhb0.i, lhb0.n, lhb0.o, lhb0.p, lhb0.q, lhb0.r, lhb0.s, lhb0.t);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z, zje zjeVar) {
        tgb0 tgb0Var;
        k050 k050Var;
        if (zjeVar instanceof tgb0) {
            tgb0Var = (tgb0) zjeVar;
            int i = tgb0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                tgb0Var.m = i - Integer.MIN_VALUE;
            } else {
                tgb0Var = new tgb0(this, zjeVar);
            }
        } else {
            tgb0Var = new tgb0(this, zjeVar);
        }
        Object obj = tgb0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = tgb0Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = this.d;
            tgb0Var.j = k050Var2;
            tgb0Var.i = z;
            tgb0Var.m = 1;
            if (k050Var2.d(tgb0Var) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = tgb0Var.i;
            k050Var = tgb0Var.j;
            z1x.P(obj);
        }
        try {
            Object objB = z ? this.c : b();
            k050Var.c(null);
            return objB;
        } catch (Throwable th) {
            k050Var.c(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(zje zjeVar) {
        ugb0 ugb0Var;
        k050 k050Var;
        if (zjeVar instanceof ugb0) {
            ugb0Var = (ugb0) zjeVar;
            int i = ugb0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ugb0Var.l = i - Integer.MIN_VALUE;
            } else {
                ugb0Var = new ugb0(this, zjeVar);
            }
        } else {
            ugb0Var = new ugb0(this, zjeVar);
        }
        Object obj = ugb0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = ugb0Var.l;
        boolean z = true;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = this.d;
            ugb0Var.i = k050Var2;
            ugb0Var.l = 1;
            if (k050Var2.d(ugb0Var) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = ugb0Var.i;
            z1x.P(obj);
        }
        try {
            String strC = q7d0.c(this.f39107a, "DYNAMIC_TOP_CONTENT_TYPE_LIST");
            if (strC == null) {
                strC = "";
            }
            if (strC.length() != 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object d(ArrayList arrayList, zje zjeVar) {
        vgb0 vgb0Var;
        k050 k050Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        if (zjeVar instanceof vgb0) {
            vgb0Var = (vgb0) zjeVar;
            int i = vgb0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                vgb0Var.m = i - Integer.MIN_VALUE;
            } else {
                vgb0Var = new vgb0(this, zjeVar);
            }
        } else {
            vgb0Var = new vgb0(this, zjeVar);
        }
        Object obj = vgb0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = vgb0Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            vgb0Var.i = arrayList;
            k050Var = this.d;
            vgb0Var.j = k050Var;
            vgb0Var.m = 1;
            if (k050Var.d(vgb0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050 k050Var2 = vgb0Var.j;
            ArrayList arrayList2 = vgb0Var.i;
            z1x.P(obj);
            k050Var = k050Var2;
            arrayList = arrayList2;
        }
        try {
            if (arrayList.isEmpty()) {
                return Unit.f46060a;
            }
            copyOnWriteArrayList.clear();
            copyOnWriteArrayList.addAll(arrayList);
            q7d0 q7d0Var = this.f39107a;
            vby vbyVar = this.b;
            vbyVar.getClass();
            lhb0[] lhb0VarArrValues = lhb0.values();
            lhb0VarArrValues.getClass();
            q7d0Var.g("DYNAMIC_TOP_CONTENT_TYPE_LIST", vbyVar.d(new zw3(new g0o("org.xplatform.popular.domain.personalization.config.model.PopularPersonalizationTopContentType", (Enum[]) lhb0VarArrValues), (byte) 0), arrayList));
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }
}
