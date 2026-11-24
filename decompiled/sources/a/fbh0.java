package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class fbh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dbh0 f9258a = new dbh0();
    public static final cbh0 b = new cbh0();
    public static final yk80 c = new yk80((byte) 1);

    public static mm40 a(mm40 mm40Var, bch0 bch0Var, ma80 ma80Var, boolean z, qkq qkqVar, int i) {
        if ((i & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            qkqVar = null;
        }
        return b(mm40Var, bch0Var, ma80Var, true, z2, qkqVar, null, 128);
    }

    public static mm40 b(mm40 mm40Var, bch0 bch0Var, ma80 ma80Var, boolean z, boolean z2, qkq qkqVar, gy40 gy40Var, int i) {
        if ((i & 32) != 0) {
            qkqVar = null;
        }
        return mm40Var.e(new bbh0(bch0Var, ma80Var, z, z2, qkqVar, gy40Var));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(sch0 sch0Var, long j, zje zjeVar) {
        ebh0 ebh0Var;
        jie0 jie0Var;
        sch0 sch0Var2;
        if (zjeVar instanceof ebh0) {
            ebh0Var = (ebh0) zjeVar;
            int i = ebh0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ebh0Var.l = i - Integer.MIN_VALUE;
            } else {
                ebh0Var = new ebh0(zjeVar);
            }
        } else {
            ebh0Var = new ebh0(zjeVar);
        }
        Object obj = ebh0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = ebh0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            jie0Var = new jie0();
            c050 c050Var = c050.f3507a;
            fl3 fl3Var = new fl3(sch0Var, j, jie0Var, (yje) null);
            ebh0Var.i = sch0Var;
            ebh0Var.j = jie0Var;
            ebh0Var.l = 1;
            if (sch0Var.g(c050Var, fl3Var, ebh0Var) == wneVar) {
                return wneVar;
            }
            sch0Var2 = sch0Var;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jie0 jie0Var2 = ebh0Var.j;
            sch0 sch0Var3 = ebh0Var.i;
            z1x.P(obj);
            jie0Var = jie0Var2;
            sch0Var2 = sch0Var3;
        }
        return new ne60(sch0Var2.i(jie0Var.f16571a));
    }
}
