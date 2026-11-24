package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class of4 extends zzf0 implements Function2 {
    public final /* synthetic */ byte j;
    public byte k;
    public /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ of4(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.j = b;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.j) {
            case 0:
                of4 of4Var = new of4(2, yjeVar, (byte) 0);
                of4Var.l = obj;
                return of4Var;
            default:
                of4 of4Var2 = new of4(2, yjeVar, (byte) 1);
                of4Var2.l = obj;
                return of4Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        inn0 inn0Var = (inn0) obj;
        yje yjeVar = (yje) obj2;
        switch (this.j) {
            case 0:
                break;
        }
        return ((of4) create(inn0Var, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r9 == r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r9 == r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
    
        if (a.tto0.i(r0, a.xoa0.b, r8) == r6) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0046). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.j
            r1 = 0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = 2
            r5 = 0
            switch(r0) {
                case 0: goto L81;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r0 = r8.l
            a.inn0 r0 = (a.inn0) r0
            a.wne r6 = a.wne.f39444a
            byte r7 = r8.k
            if (r7 == 0) goto L25
            if (r7 == r3) goto L21
            if (r7 != r4) goto L1d
            a.z1x.P(r9)
            goto L46
        L1d:
            a.jf4.n(r2)
            goto L80
        L21:
            a.z1x.P(r9)
            goto L33
        L25:
            a.z1x.P(r9)
            r8.l = r0
            r8.k = r3
            java.lang.Object r9 = a.tto0.b(r0, r1, r8, r4)
            if (r9 != r6) goto L33
            goto L44
        L33:
            a.dpa0 r9 = (a.dpa0) r9
            r9.a()
        L38:
            r8.l = r0
            r8.k = r4
            a.xoa0 r9 = a.xoa0.b
            java.lang.Object r9 = r0.a(r9, r8)
            if (r9 != r6) goto L46
        L44:
            r5 = r6
            goto L80
        L46:
            a.woa0 r9 = (a.woa0) r9
            java.util.List r1 = r9.f39485a
            java.util.Iterator r1 = r1.iterator()
        L4e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r1.next()
            a.dpa0 r2 = (a.dpa0) r2
            r2.a()
            goto L4e
        L5e:
            java.util.List r9 = r9.f39485a
            if (r9 == 0) goto L69
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L69
            goto L7e
        L69:
            java.util.Iterator r9 = r9.iterator()
        L6d:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L7e
            java.lang.Object r1 = r9.next()
            a.dpa0 r1 = (a.dpa0) r1
            boolean r1 = r1.d
            if (r1 == 0) goto L6d
            goto L38
        L7e:
            kotlin.Unit r5 = kotlin.Unit.f46060a
        L80:
            return r5
        L81:
            java.lang.Object r0 = r8.l
            a.inn0 r0 = (a.inn0) r0
            a.wne r6 = a.wne.f39444a
            byte r7 = r8.k
            if (r7 == 0) goto L9b
            if (r7 == r3) goto L97
            if (r7 != r4) goto L93
            a.z1x.P(r9)
            goto Lba
        L93:
            a.jf4.n(r2)
            goto Lbc
        L97:
            a.z1x.P(r9)
            goto Laa
        L9b:
            a.z1x.P(r9)
            r8.l = r0
            r8.k = r3
            r9 = 3
            java.lang.Object r9 = a.tto0.b(r0, r1, r8, r9)
            if (r9 != r6) goto Laa
            goto Lb8
        Laa:
            r8.l = r5
            r8.k = r4
            a.bk9 r9 = a.tto0.f34518a
            a.xoa0 r9 = a.xoa0.b
            java.lang.Object r8 = a.tto0.i(r0, r9, r8)
            if (r8 != r6) goto Lba
        Lb8:
            r5 = r6
            goto Lbc
        Lba:
            kotlin.Unit r5 = kotlin.Unit.f46060a
        Lbc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.of4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
