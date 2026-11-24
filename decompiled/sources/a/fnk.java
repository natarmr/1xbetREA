package a;

/* JADX INFO: loaded from: classes3.dex */
public final class fnk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ts4 f9840a;
    public final rou b;

    public /* synthetic */ fnk(ts4 ts4Var, rou rouVar) {
        this.f9840a = ts4Var;
        this.b = rouVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r8.p(r9, r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(a.zje r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof a.enk
            if (r0 == 0) goto L13
            r0 = r9
            a.enk r0 = (a.enk) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.enk r0 = new a.enk
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r9)
            goto L60
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r3
        L31:
            a.ts4 r8 = r0.i
            a.z1x.P(r9)
            goto L4d
        L37:
            a.z1x.P(r9)
            a.ts4 r9 = r8.f9840a
            r0.i = r9
            r0.l = r5
            a.rou r8 = r8.b
            r2 = 0
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 != r1) goto L4a
            goto L5f
        L4a:
            r7 = r9
            r9 = r8
            r8 = r7
        L4d:
            a.m2c0 r9 = (a.m2c0) r9
            long r5 = r9.S
            java.lang.String r9 = java.lang.String.valueOf(r5)
            r0.i = r3
            r0.l = r4
            java.lang.Object r8 = r8.p(r9, r0)
            if (r8 != r1) goto L60
        L5f:
            return r1
        L60:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fnk.a(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object b(boolean z, ynb0 ynb0Var, String str, zje zjeVar) {
        xf40 xf40Var;
        ts4 ts4Var;
        boolean z2;
        if (zjeVar instanceof xf40) {
            xf40Var = (xf40) zjeVar;
            int i = xf40Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                xf40Var.p = i - Integer.MIN_VALUE;
            } else {
                xf40Var = new xf40(this, zjeVar);
            }
        } else {
            xf40Var = new xf40(this, zjeVar);
        }
        xf40 xf40Var2 = xf40Var;
        Object obj = xf40Var2.n;
        wne wneVar = wne.f39444a;
        int i2 = xf40Var2.p;
        if (i2 == 0) {
            z1x.P(obj);
            xf40Var2.k = ynb0Var;
            xf40Var2.l = str;
            ts4 ts4Var2 = this.f9840a;
            xf40Var2.m = ts4Var2;
            xf40Var2.i = z;
            xf40Var2.j = z;
            xf40Var2.p = 1;
            Object objA = this.b.a(false, xf40Var2);
            if (objA != wneVar) {
                ts4Var = ts4Var2;
                obj = objA;
                z2 = z;
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
        z = xf40Var2.j;
        z2 = xf40Var2.i;
        ts4 ts4Var3 = xf40Var2.m;
        str = xf40Var2.l;
        ynb0 ynb0Var2 = xf40Var2.k;
        z1x.P(obj);
        ts4Var = ts4Var3;
        ynb0Var = ynb0Var2;
        String str2 = str;
        String strValueOf = String.valueOf(((m2c0) obj).S);
        xf40Var2.k = null;
        xf40Var2.l = null;
        xf40Var2.m = null;
        xf40Var2.i = z2;
        xf40Var2.p = 2;
        Object objF = ts4Var.f(z, strValueOf, ynb0Var, str2, xf40Var2);
        return objF == wneVar ? wneVar : objF;
    }
}
