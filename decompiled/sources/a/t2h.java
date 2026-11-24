package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class t2h extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public kmq j;
    public byte k;
    public /* synthetic */ Object l;
    public final /* synthetic */ o3c m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t2h(o3c o3cVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = o3cVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                t2h t2hVar = new t2h(this.m, yjeVar, (byte) 0);
                t2hVar.l = obj;
                return t2hVar;
            default:
                t2h t2hVar2 = new t2h(this.m, yjeVar, (byte) 1);
                t2hVar2.l = obj;
                return t2hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((t2h) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r0.a(r10, r9) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b5, code lost:
    
        if (r0.a(r1, r9) == r6) goto L46;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.i
            a.o3c r1 = r9.m
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = 2
            r5 = 0
            switch(r0) {
                case 0: goto L4d;
                default: goto Lc;
            }
        Lc:
            java.lang.Object r0 = r9.l
            a.kmq r0 = (a.kmq) r0
            a.wne r6 = a.wne.f39444a
            byte r7 = r9.k
            if (r7 == 0) goto L28
            if (r7 == r3) goto L22
            if (r7 != r4) goto L1e
            a.z1x.P(r10)
            goto L4a
        L1e:
            a.jf4.n(r2)
            goto L4c
        L22:
            a.kmq r0 = r9.j
            a.z1x.P(r10)
            goto L3c
        L28:
            a.z1x.P(r10)
            java.lang.Object r10 = r1.i
            a.j3c r10 = (a.j3c) r10
            r9.l = r5
            r9.j = r0
            r9.k = r3
            java.lang.Object r10 = r10.c(r9)
            if (r10 != r6) goto L3c
            goto L48
        L3c:
            r9.l = r5
            r9.j = r5
            r9.k = r4
            java.lang.Object r9 = r0.a(r10, r9)
            if (r9 != r6) goto L4a
        L48:
            r5 = r6
            goto L4c
        L4a:
            kotlin.Unit r5 = kotlin.Unit.f46060a
        L4c:
            return r5
        L4d:
            java.lang.Object r0 = r9.l
            a.kmq r0 = (a.kmq) r0
            a.wne r6 = a.wne.f39444a
            byte r7 = r9.k
            r8 = 0
            if (r7 == 0) goto L6c
            if (r7 == r3) goto L64
            if (r7 != r4) goto L60
            a.z1x.P(r10)
            goto Lb9
        L60:
            a.jf4.n(r2)
            goto Lbb
        L64:
            a.kmq r0 = r9.j
            a.z1x.P(r10)     // Catch: java.lang.Throwable -> L6a
            goto L82
        L6a:
            r10 = move-exception
            goto L9a
        L6c:
            a.z1x.P(r10)
            a.e0g0 r10 = a.j0g0.b     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r10 = r1.c     // Catch: java.lang.Throwable -> L6a
            a.rou r10 = (a.rou) r10     // Catch: java.lang.Throwable -> L6a
            r9.l = r5     // Catch: java.lang.Throwable -> L6a
            r9.j = r0     // Catch: java.lang.Throwable -> L6a
            r9.k = r3     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r10 = r10.a(r8, r9)     // Catch: java.lang.Throwable -> L6a
            if (r10 != r6) goto L82
            goto Lb7
        L82:
            a.m2c0 r10 = (a.m2c0) r10     // Catch: java.lang.Throwable -> L6a
            java.lang.String r10 = r10.c     // Catch: java.lang.Throwable -> L6a
            java.lang.Integer r10 = kotlin.text.StringsKt.toIntOrNull(r10)     // Catch: java.lang.Throwable -> L6a
            if (r10 == 0) goto L91
            int r10 = r10.intValue()     // Catch: java.lang.Throwable -> L6a
            goto L92
        L91:
            r10 = r8
        L92:
            java.lang.Integer r1 = new java.lang.Integer     // Catch: java.lang.Throwable -> L6a
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L6a
            a.e0g0 r10 = a.j0g0.b     // Catch: java.lang.Throwable -> L6a
            goto La1
        L9a:
            a.e0g0 r1 = a.j0g0.b
            a.g0g0 r1 = new a.g0g0
            r1.<init>(r10)
        La1:
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r8)
            boolean r2 = r1 instanceof a.g0g0
            if (r2 == 0) goto Lab
            r1 = r10
        Lab:
            r9.l = r5
            r9.j = r5
            r9.k = r4
            java.lang.Object r9 = r0.a(r1, r9)
            if (r9 != r6) goto Lb9
        Lb7:
            r5 = r6
            goto Lbb
        Lb9:
            kotlin.Unit r5 = kotlin.Unit.f46060a
        Lbb:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.t2h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
