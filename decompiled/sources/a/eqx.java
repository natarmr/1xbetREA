package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class eqx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3c0 f8256a;

    public eqx(b3c0 b3c0Var, byte b) {
        b3c0Var.getClass();
        switch (b) {
            case 1:
                this.f8256a = b3c0Var;
                break;
            case 2:
                this.f8256a = b3c0Var;
                break;
            case 3:
                this.f8256a = b3c0Var;
                break;
            default:
                this.f8256a = b3c0Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object a(zje zjeVar) {
        u2c0 u2c0Var;
        Object objD;
        if (zjeVar instanceof u2c0) {
            u2c0Var = (u2c0) zjeVar;
            int i = u2c0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                u2c0Var.k = i - Integer.MIN_VALUE;
            } else {
                u2c0Var = new u2c0(this, zjeVar);
            }
        } else {
            u2c0Var = new u2c0(this, zjeVar);
        }
        u2c0 u2c0Var2 = u2c0Var;
        Object obj = u2c0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = u2c0Var2.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            uen uenVar = wen.b;
            long jW0 = ibc.w0(2L, bfn.SECONDS);
            List listC = kotlin.collections.a.c(oqt0.class);
            c670 c670Var = new c670(this, yjeVar, (byte) 22);
            u2c0Var2.k = 1;
            objD = j0x.D(10, jW0, u2c0Var2, "ProfileInteractor.getProfile", listC, c670Var);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objD = ((j0g0) obj).f15681a;
        }
        z1x.P(objD);
        return objD;
    }

    public void b() {
        x2c0 x2c0Var = this.f8256a.b;
        m2c0 m2c0VarA = x2c0Var.a();
        if (m2c0VarA == null) {
            return;
        }
        x2c0Var.f40159a.o(null, m2c0.a(m2c0VarA, null, 0, false, -1, 253));
    }
}
