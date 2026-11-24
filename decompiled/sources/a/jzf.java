package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class jzf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dzf f17409a;
    public final ozf b;

    public jzf(dzf dzfVar, ozf ozfVar, byte b) {
        switch (b) {
            case 1:
                this.f17409a = dzfVar;
                this.b = ozfVar;
                break;
            default:
                dzfVar.getClass();
                ozfVar.getClass();
                this.f17409a = dzfVar;
                this.b = ozfVar;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(zje zjeVar) {
        ezf ezfVar;
        if (zjeVar instanceof ezf) {
            ezfVar = (ezf) zjeVar;
            int i = ezfVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ezfVar.k = i - Integer.MIN_VALUE;
            } else {
                ezfVar = new ezf(this, zjeVar);
            }
        } else {
            ezfVar = new ezf(this, zjeVar);
        }
        Object objC = ezfVar.i;
        Object obj = wne.f39444a;
        int i2 = ezfVar.k;
        dzf dzfVar = this.f17409a;
        byte b = 1;
        if (i2 == 0) {
            z1x.P(objC);
            if (dzfVar.b.length() == 0) {
                ezfVar.k = 1;
                objC = c(ezfVar);
                if (objC == obj) {
                    return obj;
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objC);
        String str = ((vf) objC).f37309a;
        dzfVar.getClass();
        if (!str.equals(dzfVar.b) && str.length() != 0) {
            dzfVar.b = str;
            dzfVar.c = new czf(dzfVar, b);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r9 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r10, java.lang.String r11, a.zje r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof a.fzf
            if (r0 == 0) goto L13
            r0 = r12
            a.fzf r0 = (a.fzf) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.fzf r0 = new a.fzf
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r12)
            goto L7b
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r3
        L31:
            java.lang.String r11 = r0.j
            java.lang.String r10 = r0.i
            a.z1x.P(r12)
            goto L49
        L39:
            a.z1x.P(r12)
            r0.i = r10
            r0.j = r11
            r0.m = r5
            java.lang.Object r12 = r9.a(r0)
            if (r12 != r1) goto L49
            goto L7a
        L49:
            a.tyf r12 = new a.tyf
            long r5 = java.lang.System.currentTimeMillis()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            r12.<init>(r10, r11, r5)
            r0.i = r3
            r0.j = r3
            r0.m = r4
            a.dzf r9 = r9.f17409a
            kotlin.jvm.functions.Function0 r10 = r9.c
            java.lang.Object r10 = r10.invoke()
            a.nzf r10 = (a.nzf) r10
            java.lang.String r9 = r9.a()
            a.lwf r11 = new a.lwf
            r2 = 0
            r11.<init>(r2)
            java.lang.Object r9 = r10.b(r9, r12, r11, r0)
            if (r9 != r1) goto L76
            goto L78
        L76:
            kotlin.Unit r9 = kotlin.Unit.f46060a
        L78:
            if (r9 != r1) goto L7b
        L7a:
            return r1
        L7b:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jzf.b(java.lang.String, java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public Object c(zje zjeVar) {
        gzf gzfVar;
        if (zjeVar instanceof gzf) {
            gzfVar = (gzf) zjeVar;
            int i = gzfVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gzfVar.k = i - Integer.MIN_VALUE;
            } else {
                gzfVar = new gzf(this, zjeVar);
            }
        } else {
            gzfVar = new gzf(this, zjeVar);
        }
        Object objA = gzfVar.i;
        wne wneVar = wne.f39444a;
        int i2 = gzfVar.k;
        Object[] objArr = 0;
        if (i2 == 0) {
            z1x.P(objA);
            gzfVar.k = 1;
            dzf dzfVar = this.f17409a;
            objA = ((nzf) dzfVar.c.invoke()).a(dzfVar.a(), new lwf(objArr == true ? 1 : 0), gzfVar);
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
        yf yfVar = (yf) objA;
        yfVar.getClass();
        String str = yfVar.f42516a;
        if (str == null) {
            str = "";
        }
        String str2 = yfVar.b;
        String str3 = str2 != null ? str2 : "";
        Integer num = yfVar.c;
        return new vf(num != null ? num.intValue() : 0, str, str3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        if (r9 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b5, code lost:
    
        if (r9 == r0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(a.pzf r10, a.zje r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof a.hzf
            if (r0 == 0) goto L14
            r0 = r11
            a.hzf r0 = (a.hzf) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.l = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            a.hzf r0 = new a.hzf
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.j
            a.wne r0 = a.wne.f39444a
            int r1 = r6.l
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L41
            if (r1 == r5) goto L3b
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            a.z1x.P(r11)
            goto Lb8
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r2
        L37:
            a.z1x.P(r11)
            goto L89
        L3b:
            a.pzf r10 = r6.i
            a.z1x.P(r11)
            goto L4f
        L41:
            a.z1x.P(r11)
            r6.i = r10
            r6.l = r5
            java.lang.Object r11 = r9.a(r6)
            if (r11 != r0) goto L4f
            goto Lb7
        L4f:
            boolean r11 = r10.d
            java.lang.String r1 = r10.b
            long r7 = r10.f27841a
            r5 = 0
            a.dzf r9 = r9.f17409a
            if (r11 == 0) goto L8c
            r11 = r4
            a.yyf r4 = new a.yyf
            boolean r10 = r10.c
            r4.<init>(r1, r10)
            r6.i = r2
            r6.l = r11
            kotlin.jvm.functions.Function0 r10 = r9.c
            java.lang.Object r10 = r10.invoke()
            r1 = r10
            a.nzf r1 = (a.nzf) r1
            java.lang.String r2 = r9.a()
            java.lang.String r3 = java.lang.String.valueOf(r7)
            r10 = r5
            a.lwf r5 = new a.lwf
            r5.<init>(r10)
            java.lang.Object r9 = r1.e(r2, r3, r4, r5, r6)
            if (r9 != r0) goto L84
            goto L86
        L84:
            kotlin.Unit r9 = kotlin.Unit.f46060a
        L86:
            if (r9 != r0) goto L89
            goto Lb7
        L89:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        L8c:
            r10 = r5
            a.mzf r4 = new a.mzf
            r4.<init>(r1)
            r6.i = r2
            r6.l = r3
            kotlin.jvm.functions.Function0 r11 = r9.c
            java.lang.Object r11 = r11.invoke()
            r1 = r11
            a.nzf r1 = (a.nzf) r1
            java.lang.String r2 = r9.a()
            java.lang.String r3 = java.lang.String.valueOf(r7)
            a.lwf r5 = new a.lwf
            r5.<init>(r10)
            java.lang.Object r9 = r1.c(r2, r3, r4, r5, r6)
            if (r9 != r0) goto Lb3
            goto Lb5
        Lb3:
            kotlin.Unit r9 = kotlin.Unit.f46060a
        Lb5:
            if (r9 != r0) goto Lb8
        Lb7:
            return r0
        Lb8:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jzf.d(a.pzf, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        if (r11 == r0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(long r12, a.zje r14, java.lang.String r15) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof a.izf
            if (r0 == 0) goto L14
            r0 = r14
            a.izf r0 = (a.izf) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.m = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            a.izf r0 = new a.izf
            r0.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.k
            a.wne r0 = a.wne.f39444a
            int r1 = r6.m
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            a.z1x.P(r14)
            goto L8c
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            return r2
        L33:
            long r12 = r6.j
            java.lang.String r15 = r6.i
            a.z1x.P(r14)
            goto L4b
        L3b:
            a.z1x.P(r14)
            r6.i = r15
            r6.j = r12
            r6.m = r4
            java.lang.Object r14 = r11.a(r6)
            if (r14 != r0) goto L4b
            goto L8b
        L4b:
            a.qyf r4 = new a.qyf
            a.nyf r14 = new a.nyf
            long r7 = java.lang.System.currentTimeMillis()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r7)
            r14.<init>(r15, r1)
            r4.<init>(r14)
            r6.i = r2
            r6.j = r12
            r6.m = r3
            a.dzf r11 = r11.f17409a
            kotlin.jvm.functions.Function0 r14 = r11.c
            java.lang.Object r14 = r14.invoke()
            r1 = r14
            a.nzf r1 = (a.nzf) r1
            java.lang.String r2 = r11.a()
            java.lang.String r3 = java.lang.String.valueOf(r12)
            a.lwf r5 = new a.lwf
            r11 = 0
            r5.<init>(r11)
            java.lang.Object r11 = r1.d(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L87
            goto L89
        L87:
            kotlin.Unit r11 = kotlin.Unit.f46060a
        L89:
            if (r11 != r0) goto L8c
        L8b:
            return r0
        L8c:
            kotlin.Unit r11 = kotlin.Unit.f46060a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jzf.e(long, a.zje, java.lang.String):java.lang.Object");
    }
}
