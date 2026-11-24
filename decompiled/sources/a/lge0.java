package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class lge0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jge0 f20005a;
    public final t33 b;
    public final t33 c;
    public final t33 d;
    public final float e;

    public lge0(jge0 jge0Var, jge0 jge0Var2, float f, float f2) {
        jge0Var.getClass();
        jge0Var2.getClass();
        this.f20005a = jge0Var2;
        this.b = new t33(new ne60(jge0Var.g()), hp4.o, null, 12);
        this.c = new t33(new h7k0(jge0Var.f()), hp4.n, null, 12);
        this.d = new t33(new ycl(f), hp4.l, null, 12);
        this.e = f2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        kge0 kge0Var;
        if (zjeVar instanceof kge0) {
            kge0Var = (kge0) zjeVar;
            int i = kge0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kge0Var.k = i - Integer.MIN_VALUE;
            } else {
                kge0Var = new kge0(this, zjeVar);
            }
        } else {
            kge0Var = new kge0(this, zjeVar);
        }
        Object obj = kge0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = kge0Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            s9c0 s9c0Var = new s9c0(this, yjeVar, (byte) 26);
            kge0Var.k = 1;
            if (d5c.J(kge0Var, s9c0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
