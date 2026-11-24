package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class go10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zpu f11609a;
    public final btt0 b;
    public final j5t c;
    public Long d;
    public Double e;

    public go10(zpu zpuVar, btt0 btt0Var, j5t j5tVar) {
        this.f11609a = zpuVar;
        this.b = btt0Var;
        this.c = j5tVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, zje zjeVar) {
        do10 do10Var;
        if (zjeVar instanceof do10) {
            do10Var = (do10) zjeVar;
            int i = do10Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                do10Var.k = i - Integer.MIN_VALUE;
            } else {
                do10Var = new do10(this, zjeVar);
            }
        } else {
            do10Var = new do10(this, zjeVar);
        }
        Object objB = do10Var.i;
        wne wneVar = wne.f39444a;
        int i2 = do10Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            String strA = this.b.a();
            do10Var.k = 1;
            objB = ((mk10) ((rx00) this.f11609a.c).invoke()).b(strA, "application/vnd.xenvelop+json", do10Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        return atm0.r((bav0) ((dx5) objB).a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    public final Object b(zje zjeVar) {
        eo10 eo10Var;
        ?? arrayList;
        if (zjeVar instanceof eo10) {
            eo10Var = (eo10) zjeVar;
            int i = eo10Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                eo10Var.k = i - Integer.MIN_VALUE;
            } else {
                eo10Var = new eo10(this, zjeVar);
            }
        } else {
            eo10Var = new eo10(this, zjeVar);
        }
        Object objA = eo10Var.i;
        wne wneVar = wne.f39444a;
        int i2 = eo10Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            String strA = this.b.a();
            eo10Var.k = 1;
            objA = ((mk10) ((rx00) this.f11609a.c).invoke()).a(strA, "application/vnd.xenvelop+json", eo10Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        vxk0 vxk0Var = (vxk0) ((dx5) objA).a();
        Integer num = vxk0Var.b;
        int iIntValue = num != null ? num.intValue() : 0;
        Long l = vxk0Var.f38203a;
        long jLongValue = l != null ? l.longValue() : Long.MAX_VALUE;
        List<ayb0> list = vxk0Var.c;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (ayb0 ayb0Var : list) {
                s9v0 s9v0Var = ayb0Var.f1664a;
                if (s9v0Var == null) {
                    jf4.k(null);
                    return null;
                }
                csr csrVarW = zsm0.w(s9v0Var);
                Integer num2 = ayb0Var.b;
                arrayList.add(new ywb0(csrVarW, num2 != null ? num2.intValue() : 0));
            }
        } else {
            arrayList = iun.f15405a;
        }
        return new sxk0(iIntValue, jLongValue, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j, zje zjeVar, boolean z) {
        fo10 fo10Var;
        if (zjeVar instanceof fo10) {
            fo10Var = (fo10) zjeVar;
            int i = fo10Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fo10Var.k = i - Integer.MIN_VALUE;
            } else {
                fo10Var = new fo10(this, zjeVar);
            }
        } else {
            fo10Var = new fo10(this, zjeVar);
        }
        Object objC = fo10Var.i;
        wne wneVar = wne.f39444a;
        int i2 = fo10Var.k;
        if (i2 == 0) {
            z1x.P(objC);
            String strA = this.b.a();
            fo10Var.k = 1;
            objC = ((mk10) ((rx00) this.f11609a.c).invoke()).c(strA, "application/vnd.xenvelop+json", new jzk0(z, j), fo10Var);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        return atm0.r((bav0) ((dx5) objC).a());
    }
}
