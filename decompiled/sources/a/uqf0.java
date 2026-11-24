package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class uqf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final drf0 f36117a;
    public final do00 b;

    public uqf0(drf0 drf0Var, do00 do00Var) {
        this.f36117a = drf0Var;
        this.b = do00Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(int i, Integer num, String str, zje zjeVar) {
        tqf0 tqf0Var;
        drf0 drf0Var;
        if (zjeVar instanceof tqf0) {
            tqf0Var = (tqf0) zjeVar;
            int i2 = tqf0Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tqf0Var.o = i2 - Integer.MIN_VALUE;
            } else {
                tqf0Var = new tqf0(this, zjeVar);
            }
        } else {
            tqf0Var = new tqf0(this, zjeVar);
        }
        tqf0 tqf0Var2 = tqf0Var;
        Object obj = tqf0Var2.m;
        wne wneVar = wne.f39444a;
        int i3 = tqf0Var2.o;
        if (i3 == 0) {
            z1x.P(obj);
            tqf0Var2.j = num;
            tqf0Var2.k = str;
            drf0 drf0Var2 = this.f36117a;
            tqf0Var2.l = drf0Var2;
            tqf0Var2.i = i;
            tqf0Var2.o = 1;
            do00 do00Var = this.b;
            ql5 ql5Var = do00Var.f6395a.f26724a.q;
            Serializable serializableB = ql5Var == null ? ((g45) do00Var.b.b).y().b(bm5.d, tqf0Var2) : ql5Var;
            if (serializableB != wneVar) {
                drf0Var = drf0Var2;
                obj = serializableB;
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = tqf0Var2.i;
        drf0 drf0Var3 = tqf0Var2.l;
        str = tqf0Var2.k;
        num = tqf0Var2.j;
        z1x.P(obj);
        drf0Var = drf0Var3;
        int i4 = i;
        String str2 = str;
        String str3 = ((ql5) obj).f;
        tqf0Var2.j = null;
        tqf0Var2.k = null;
        tqf0Var2.l = null;
        tqf0Var2.i = i4;
        tqf0Var2.o = 2;
        Object objC = drf0Var.c(str3, i4, num, str2, tqf0Var2);
        return objC == wneVar ? wneVar : objC;
    }
}
