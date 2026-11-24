package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class pw70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oeg0 f27698a;
    public final ytt b;

    public pw70(oeg0 oeg0Var, jdk0 jdk0Var, ytt yttVar) {
        oeg0Var.getClass();
        this.f27698a = oeg0Var;
        this.b = yttVar;
    }

    public static /* synthetic */ Object b(pw70 pw70Var, mlr mlrVar, String str, int i, boolean z, boolean z2, yje yjeVar, int i2) {
        boolean z3 = (i2 & 16) == 0;
        if ((i2 & 32) != 0) {
            z = false;
        }
        return pw70Var.a(mlrVar, str, i, z3, z, (i2 & 64) != 0 ? true : z2, yjeVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(mlr mlrVar, String str, int i, boolean z, boolean z2, boolean z3, yje yjeVar) {
        ow70 ow70Var;
        mlr mlrVar2;
        String str2;
        int i2;
        boolean z4;
        boolean z5;
        boolean z6;
        if (yjeVar instanceof ow70) {
            ow70Var = (ow70) yjeVar;
            int i3 = ow70Var.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ow70Var.q = i3 - Integer.MIN_VALUE;
            } else {
                ow70Var = new ow70(this, yjeVar);
            }
        } else {
            ow70Var = new ow70(this, yjeVar);
        }
        Object obj = ow70Var.o;
        wne wneVar = wne.f39444a;
        int i4 = ow70Var.q;
        if (i4 == 0) {
            z1x.P(obj);
            aue0 aue0Var = aue0.d;
            ow70Var.i = mlrVar;
            ow70Var.j = str;
            ow70Var.k = i;
            ow70Var.l = z;
            ow70Var.m = z2;
            ow70Var.n = z3;
            ow70Var.q = 1;
            if (this.b.a(aue0Var, ow70Var) == wneVar) {
                return wneVar;
            }
            mlrVar2 = mlrVar;
            str2 = str;
            i2 = i;
            z4 = z;
            z5 = z2;
            z6 = z3;
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z7 = ow70Var.n;
            boolean z8 = ow70Var.m;
            boolean z9 = ow70Var.l;
            int i5 = ow70Var.k;
            String str3 = ow70Var.j;
            mlrVar2 = ow70Var.i;
            z1x.P(obj);
            z6 = z7;
            z5 = z8;
            z4 = z9;
            i2 = i5;
            str2 = str3;
        }
        this.f27698a.c().d(new bt8(jdk0.f(mlrVar2.f22006a, mlrVar2.f, mlrVar2.c, mlrVar2.l, mlrVar2.b, mlrVar2.m, true, i2, mlrVar2.n, z4, z5, str2, z6), z4, z5, mlrVar2));
        return Unit.f46060a;
    }
}
