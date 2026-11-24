package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zbu implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kmq f44134a;
    public final /* synthetic */ mie0 b;
    public final /* synthetic */ hie0 c;
    public final /* synthetic */ v7i d;
    public final /* synthetic */ List e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;

    public zbu(kmq kmqVar, mie0 mie0Var, hie0 hie0Var, v7i v7iVar, List list, boolean z, boolean z2, boolean z3) {
        this.f44134a = kmqVar;
        this.b = mie0Var;
        this.c = hie0Var;
        this.d = v7iVar;
        this.e = list;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        if (r3.a(r0, r11) == r2) goto L27;
     */
    @Override // a.kmq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r17, a.yje r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof a.ybu
            if (r2 == 0) goto L18
            r2 = r1
            a.ybu r2 = (a.ybu) r2
            int r3 = r2.j
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.j = r3
        L16:
            r11 = r2
            goto L1e
        L18:
            a.ybu r2 = new a.ybu
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r11.i
            a.wne r2 = a.wne.f39444a
            int r3 = r11.j
            a.hie0 r12 = r0.c
            a.mie0 r13 = r0.b
            r14 = 2
            r4 = 1
            r15 = 0
            if (r3 == 0) goto L43
            if (r3 == r4) goto L3b
            if (r3 != r14) goto L35
            a.z1x.P(r1)
            goto L8e
        L35:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r15
        L3b:
            a.mie0 r0 = r11.m
            a.kmq r3 = r11.k
            a.z1x.P(r1)
            goto L6c
        L43:
            a.z1x.P(r1)
            r5 = r17
            a.z9s r5 = (a.z9s) r5
            boolean r6 = r12.f13108a
            a.kmq r1 = r0.f44134a
            if (r6 == 0) goto L6f
            java.util.List r7 = r5.f
            r11.k = r1
            r11.m = r13
            r11.j = r4
            a.v7i r3 = r0.d
            java.util.List r4 = r0.e
            boolean r8 = r0.f
            boolean r9 = r0.g
            boolean r10 = r0.h
            java.lang.Object r0 = r3.c(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r0 != r2) goto L69
            goto L8d
        L69:
            r3 = r1
            r1 = r0
            r0 = r13
        L6c:
            java.util.List r1 = (java.util.List) r1
            goto L7a
        L6f:
            java.lang.Object r0 = r13.f21842a
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r0 = a.uzb.M0(r0, r5)
            r3 = r1
            r1 = r0
            r0 = r13
        L7a:
            r0.f21842a = r1
            r0 = 0
            r12.f13108a = r0
            java.lang.Object r0 = r13.f21842a
            r11.k = r15
            r11.m = r15
            r11.j = r14
            java.lang.Object r0 = r3.a(r0, r11)
            if (r0 != r2) goto L8e
        L8d:
            return r2
        L8e:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zbu.a(java.lang.Object, a.yje):java.lang.Object");
    }
}
