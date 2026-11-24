package a;

/* JADX INFO: loaded from: classes3.dex */
public final class jnk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ts4 f16817a;
    public final rou b;

    public /* synthetic */ jnk(ts4 ts4Var, rou rouVar) {
        this.f16817a = ts4Var;
        this.b = rouVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(zje zjeVar, ynb0 ynb0Var, String str) {
        fte0 fte0Var;
        ts4 ts4Var;
        if (zjeVar instanceof fte0) {
            fte0Var = (fte0) zjeVar;
            int i = fte0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                fte0Var.n = i - Integer.MIN_VALUE;
            } else {
                fte0Var = new fte0(this, zjeVar);
            }
        } else {
            fte0Var = new fte0(this, zjeVar);
        }
        Object obj = fte0Var.l;
        wne wneVar = wne.f39444a;
        int i2 = fte0Var.n;
        if (i2 == 0) {
            z1x.P(obj);
            fte0Var.i = ynb0Var;
            fte0Var.j = str;
            ts4 ts4Var2 = this.f16817a;
            fte0Var.k = ts4Var2;
            fte0Var.n = 1;
            Object objA = this.b.a(false, fte0Var);
            if (objA != wneVar) {
                obj = objA;
                ts4Var = ts4Var2;
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
        ts4Var = fte0Var.k;
        str = fte0Var.j;
        ynb0Var = fte0Var.i;
        z1x.P(obj);
        String strValueOf = String.valueOf(((m2c0) obj).S);
        fte0Var.i = null;
        fte0Var.j = null;
        fte0Var.k = null;
        fte0Var.n = 2;
        Object objI = ts4Var.i(ynb0Var, strValueOf, str, fte0Var);
        return objI == wneVar ? wneVar : objI;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r8.q(r10, r9, r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r9, a.zje r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof a.ink
            if (r0 == 0) goto L13
            r0 = r10
            a.ink r0 = (a.ink) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.ink r0 = new a.ink
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r10)
            goto L66
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r3
        L31:
            a.ts4 r8 = r0.j
            java.lang.String r9 = r0.i
            a.z1x.P(r10)
            goto L51
        L39:
            a.z1x.P(r10)
            r0.i = r9
            a.ts4 r10 = r8.f16817a
            r0.j = r10
            r0.m = r5
            a.rou r8 = r8.b
            r2 = 0
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 != r1) goto L4e
            goto L65
        L4e:
            r7 = r10
            r10 = r8
            r8 = r7
        L51:
            a.m2c0 r10 = (a.m2c0) r10
            long r5 = r10.S
            java.lang.String r10 = java.lang.String.valueOf(r5)
            r0.i = r3
            r0.j = r3
            r0.m = r4
            java.lang.Object r8 = r8.q(r10, r9, r0)
            if (r8 != r1) goto L66
        L65:
            return r1
        L66:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jnk.b(java.lang.String, a.zje):java.lang.Object");
    }
}
