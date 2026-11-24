package a;

import org.xplatform.secret.impl.KeysImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class zf3 implements zjh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f44283a;
    public final knf0 b;
    public final z8w0 c;
    public final mmy d;
    public final n0o0 e = maz.b(new a13(this, 9));

    public zf3(us00 us00Var, knf0 knf0Var, z8w0 z8w0Var, mmy mmyVar) {
        this.f44283a = us00Var;
        this.b = knf0Var;
        this.c = z8w0Var;
        this.d = mmyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        yf3 yf3Var;
        z8w0 z8w0Var;
        if (zjeVar instanceof yf3) {
            yf3Var = (yf3) zjeVar;
            int i = yf3Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                yf3Var.l = i - Integer.MIN_VALUE;
            } else {
                yf3Var = new yf3(this, zjeVar);
            }
        } else {
            yf3Var = new yf3(this, zjeVar);
        }
        Object obj = yf3Var.j;
        wne wneVar = wne.f39444a;
        int i2 = yf3Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            z8w0 z8w0Var2 = this.c;
            yf3Var.i = z8w0Var2;
            yf3Var.l = 1;
            Object objE = ((KeysImpl) this.d).e(yf3Var);
            if (objE != wneVar) {
                obj = objE;
                z8w0Var = z8w0Var2;
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
        z8w0Var = yf3Var.i;
        z1x.P(obj);
        yf3Var.i = null;
        yf3Var.l = 2;
        Object objD = z8w0Var.d(yf3Var, (String) obj, false);
        return objD == wneVar ? wneVar : objD;
    }
}
