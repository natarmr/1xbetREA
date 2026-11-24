package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class k06 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ouu f17448a = new ouu();
    public final x860 b;
    public final Function2 c;

    public k06(x860 x860Var, Function2 function2) {
        this.b = x860Var;
        this.c = function2;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r8.N(r10, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        r8 = r10;
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
    
        if (r8.g(r10, r0) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(a.k06 r8, boolean r9, a.zje r10) {
        /*
            boolean r0 = r10 instanceof a.j06
            if (r0 == 0) goto L13
            r0 = r10
            a.j06 r0 = (a.j06) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            a.j06 r0 = new a.j06
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.m
            a.wne r1 = a.wne.f39444a
            int r2 = r0.o
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            goto L31
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r6
        L31:
            java.util.List r8 = r0.k
            a.xe60 r9 = r0.j
            a.z1x.P(r10)
            goto La7
        L3a:
            boolean r9 = r0.l
            a.xe60 r8 = r0.j
            a.k06 r2 = r0.i
            a.z1x.P(r10)
            r7 = r8
            r8 = r2
            goto L7a
        L46:
            a.z1x.P(r10)
            a.ouu r10 = r8.f17448a
            java.lang.Object r10 = r10.d
            a.p7m0 r10 = (a.p7m0) r10
            java.lang.Object r10 = r10.getValue()
            java.util.List r10 = (java.util.List) r10
            a.x860 r2 = r8.b
            if (r9 == 0) goto L5b
            a.iun r10 = a.iun.f15405a
        L5b:
            r10.getClass()
            a.xe60 r7 = new a.xe60
            int r2 = r2.f40449a
            int r10 = r10.size()
            r7.<init>(r2, r10)
            kotlin.jvm.functions.Function2 r10 = r8.c
            r0.i = r8
            r0.j = r7
            r0.l = r9
            r0.o = r5
            java.lang.Object r10 = r10.invoke(r7, r0)
            if (r10 != r1) goto L7a
            goto La6
        L7a:
            java.util.List r10 = (java.util.List) r10
            if (r9 == 0) goto L94
            a.ouu r8 = r8.f17448a
            r0.i = r6
            r0.j = r7
            r0.k = r10
            r0.l = r9
            r0.o = r4
            java.lang.Object r8 = r8.N(r10, r0)
            if (r8 != r1) goto L91
            goto La6
        L91:
            r8 = r10
            r9 = r7
            goto La7
        L94:
            a.ouu r8 = r8.f17448a
            r0.i = r6
            r0.j = r7
            r0.k = r10
            r0.l = r9
            r0.o = r3
            java.lang.Object r8 = r8.g(r10, r0)
            if (r8 != r1) goto L91
        La6:
            return r1
        La7:
            int r8 = r8.size()
            int r9 = r9.f40729a
            if (r8 >= r9) goto Lb0
            goto Lb1
        Lb0:
            r5 = 0
        Lb1:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.k06.a(a.k06, boolean, a.zje):java.lang.Object");
    }
}
