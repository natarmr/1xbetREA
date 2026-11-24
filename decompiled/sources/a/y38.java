package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class y38 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41939a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public y38(mie0 mie0Var, kmq kmqVar, String[] strArr, int[] iArr) {
        this.f41939a = (byte) 11;
        this.c = mie0Var;
        this.b = kmqVar;
        this.d = strArr;
        this.e = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX WARN: Code duplicated, block: B:123:0x021a  */
    /* JADX WARN: Code duplicated, block: B:148:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:174:0x035d  */
    /* JADX WARN: Code duplicated, block: B:249:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:270:0x051a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0193  */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x029b, code lost:
    
        if (r1.a(r8, r3) == r2) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0340, code lost:
    
        if (r1.a(r8, r3) == r2) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
    
        if (r1.a(r0, r10) == r2) goto L43;
     */
    @Override // a.kmq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r24, a.yje r25) {
        /*
            Method dump skipped, instruction units count: 1538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y38.a(java.lang.Object, a.yje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public Object b(gmq gmqVar, yje yjeVar) {
        otb otbVar;
        gbi0 gbi0Var = (gbi0) this.c;
        if (yjeVar instanceof otb) {
            otbVar = (otb) yjeVar;
            int i = otbVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                otbVar.l = i - Integer.MIN_VALUE;
            } else {
                otbVar = new otb(this, yjeVar);
            }
        } else {
            otbVar = new otb(this, yjeVar);
        }
        Object obj = otbVar.j;
        wne wneVar = wne.f39444a;
        int i2 = otbVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            bby bbyVar = (bby) this.b;
            if (bbyVar != null && !bbyVar.isActive()) {
                throw bbyVar.getCancellationException();
            }
            otbVar.i = gmqVar;
            otbVar.l = 1;
            if (gbi0Var.b(otbVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gmqVar = otbVar.i;
            z1x.P(obj);
        }
        qjj.W((hzb0) this.d, null, null, new yxa((Object) gmqVar, this.e, (Object) gbi0Var, (yje) null, (byte) 28), 3);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r4.a(r2, r5) == r6) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
    
        if (r4.a(r2, r5) == r6) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(int[] r18, a.yje r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.Object r3 = r0.d
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.lang.Object r4 = r0.b
            a.kmq r4 = (a.kmq) r4
            boolean r5 = r2 instanceof a.yqs0
            if (r5 == 0) goto L21
            r5 = r2
            a.yqs0 r5 = (a.yqs0) r5
            int r6 = r5.m
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L21
            int r6 = r6 - r7
            r5.m = r6
            goto L26
        L21:
            a.yqs0 r5 = new a.yqs0
            r5.<init>(r0, r2)
        L26:
            java.lang.Object r2 = r5.k
            a.wne r6 = a.wne.f39444a
            int r7 = r5.m
            r8 = 0
            r9 = 2
            r10 = 1
            if (r7 == 0) goto L49
            if (r7 == r10) goto L3c
            if (r7 != r9) goto L36
            goto L3c
        L36:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r8
        L3c:
            int[] r0 = r5.j
            a.y38 r1 = r5.i
            a.z1x.P(r2)
            r16 = r1
            r1 = r0
            r0 = r16
            goto Lad
        L49:
            a.z1x.P(r2)
            java.lang.Object r2 = r0.c
            a.mie0 r2 = (a.mie0) r2
            java.lang.Object r7 = r2.f21842a
            if (r7 != 0) goto L65
            java.util.Set r2 = a.tx3.l0(r3)
            r5.i = r0
            r5.j = r1
            r5.m = r10
            java.lang.Object r2 = r4.a(r2, r5)
            if (r2 != r6) goto Lad
            goto Lac
        L65:
            java.lang.Object r7 = r0.e
            int[] r7 = (int[]) r7
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            int r11 = r3.length
            r12 = 0
            r13 = r12
        L71:
            if (r12 >= r11) goto L96
            r14 = r3[r12]
            int r15 = r13 + 1
            r19 = r8
            java.lang.Object r8 = r2.f21842a
            if (r8 == 0) goto L90
            int[] r8 = (int[]) r8
            r13 = r7[r13]
            r8 = r8[r13]
            r13 = r1[r13]
            if (r8 == r13) goto L8a
            r10.add(r14)
        L8a:
            int r12 = r12 + 1
            r8 = r19
            r13 = r15
            goto L71
        L90:
            java.lang.String r0 = "Required value was null."
            a.jf4.n(r0)
            return r19
        L96:
            boolean r2 = r10.isEmpty()
            if (r2 != 0) goto Lad
            java.util.Set r2 = kotlin.collections.CollectionsKt.P0(r10)
            r5.i = r0
            r5.j = r1
            r5.m = r9
            java.lang.Object r2 = r4.a(r2, r5)
            if (r2 != r6) goto Lad
        Lac:
            return r6
        Lad:
            java.lang.Object r0 = r0.c
            a.mie0 r0 = (a.mie0) r0
            r0.f21842a = r1
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y38.c(int[], a.yje):java.lang.Object");
    }

    public y38(mie0 mie0Var, vne vneVar, utb utbVar, kmq kmqVar) {
        this.f41939a = (byte) 2;
        this.c = mie0Var;
        this.d = vneVar;
        this.e = utbVar;
        this.b = kmqVar;
    }

    public /* synthetic */ y38(byte b, kmq kmqVar, hie0 hie0Var, lie0 lie0Var, Object obj) {
        this.f41939a = b;
        this.b = kmqVar;
        this.e = lie0Var;
        this.c = hie0Var;
        this.d = obj;
    }

    public /* synthetic */ y38(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f41939a = b;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.b = obj;
    }
}
