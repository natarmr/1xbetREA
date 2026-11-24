package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class q6n0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kmq f28208a;
    public final Function2 b;

    public q6n0(kmq kmqVar, Function2 function2) {
        this.f28208a = kmqVar;
        this.b = function2;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        return this.f28208a.a(obj, yjeVar);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        if (((a.q6n0) r4).b(r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(a.zje r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof a.p6n0
            if (r0 == 0) goto L13
            r0 = r9
            a.p6n0 r0 = (a.p6n0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.p6n0 r0 = new a.p6n0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            a.kmq r4 = r8.f28208a
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3b
            if (r2 == r6) goto L33
            if (r2 != r5) goto L2d
            a.z1x.P(r9)
            goto L69
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r3
        L33:
            a.qsg0 r8 = r0.i
            a.z1x.P(r9)     // Catch: java.lang.Throwable -> L39
            goto L55
        L39:
            r9 = move-exception
            goto L73
        L3b:
            a.z1x.P(r9)
            a.qsg0 r9 = new a.qsg0
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            r9.<init>(r4, r2)
            kotlin.jvm.functions.Function2 r8 = r8.b     // Catch: java.lang.Throwable -> L6f
            r0.i = r9     // Catch: java.lang.Throwable -> L6f
            r0.l = r6     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r8 = r8.invoke(r9, r0)     // Catch: java.lang.Throwable -> L6f
            if (r8 != r1) goto L54
            goto L68
        L54:
            r8 = r9
        L55:
            r8.releaseIntercepted()
            boolean r8 = r4 instanceof a.q6n0
            if (r8 == 0) goto L6c
            a.q6n0 r4 = (a.q6n0) r4
            r0.i = r3
            r0.l = r5
            java.lang.Object r8 = r4.b(r0)
            if (r8 != r1) goto L69
        L68:
            return r1
        L69:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        L6c:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        L6f:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L73:
            r8.releaseIntercepted()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q6n0.b(a.zje):java.lang.Object");
    }
}
