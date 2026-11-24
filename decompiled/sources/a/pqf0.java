package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class pqf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final drf0 f27414a;
    public final ztt b;
    public final do00 c;

    public pqf0(drf0 drf0Var, ztt zttVar, do00 do00Var) {
        this.f27414a = drf0Var;
        this.b = zttVar;
        this.c = do00Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(double d, String str, zje zjeVar) {
        oqf0 oqf0Var;
        drf0 drf0Var;
        String str2;
        if (zjeVar instanceof oqf0) {
            oqf0Var = (oqf0) zjeVar;
            int i = oqf0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                oqf0Var.n = i - Integer.MIN_VALUE;
            } else {
                oqf0Var = new oqf0(this, zjeVar);
            }
        } else {
            oqf0Var = new oqf0(this, zjeVar);
        }
        oqf0 oqf0Var2 = oqf0Var;
        Object obj = oqf0Var2.l;
        wne wneVar = wne.f39444a;
        int i2 = oqf0Var2.n;
        if (i2 == 0) {
            z1x.P(obj);
            oqf0Var2.j = str;
            drf0 drf0Var2 = this.f27414a;
            oqf0Var2.k = drf0Var2;
            oqf0Var2.i = d;
            oqf0Var2.n = 1;
            do00 do00Var = this.c;
            ql5 ql5Var = do00Var.f6395a.f26724a.q;
            Serializable serializableB = ql5Var == null ? ((g45) do00Var.b.b).y().b(bm5.d, oqf0Var2) : ql5Var;
            if (serializableB != wneVar) {
                Serializable serializable = serializableB;
                drf0Var = drf0Var2;
                obj = serializable;
                str2 = str;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d = oqf0Var2.i;
        drf0 drf0Var3 = oqf0Var2.k;
        String str3 = oqf0Var2.j;
        z1x.P(obj);
        str2 = str3;
        drf0Var = drf0Var3;
        String str4 = ((ql5) obj).f;
        csr csrVarA = this.b.a();
        oqf0Var2.j = null;
        oqf0Var2.k = null;
        oqf0Var2.i = d;
        oqf0Var2.n = 2;
        Object objB = drf0Var.b(str4, d, str2, csrVarA, oqf0Var2);
        return objB == wneVar ? wneVar : objB;
    }
}
