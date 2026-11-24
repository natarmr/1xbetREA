package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class qa6 extends zzf0 implements Function2 {
    public xoa0 j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ vne m;
    public final /* synthetic */ bxq0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa6(vne vneVar, bxq0 bxq0Var, yje yjeVar) {
        super(2, yjeVar);
        this.m = vneVar;
        this.n = bxq0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        qa6 qa6Var = new qa6(this.m, this.n, yjeVar);
        qa6Var.l = obj;
        return qa6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((qa6) create((inn0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        return wne.f39444a;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:12:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            a.wne r0 = a.wne.f39444a
            boolean r1 = r8.k
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 != r3) goto L14
            a.xoa0 r1 = r8.j
            java.lang.Object r4 = r8.l
            a.inn0 r4 = (a.inn0) r4
            a.z1x.P(r9)
            goto L31
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r2
        L1a:
            a.z1x.P(r9)
            java.lang.Object r9 = r8.l
            a.inn0 r9 = (a.inn0) r9
            a.xoa0 r1 = a.xoa0.b
            r4 = r9
        L24:
            r8.l = r4
            r8.j = r1
            r8.k = r3
            java.lang.Object r9 = r4.a(r1, r8)
            if (r9 != r0) goto L31
            return r0
        L31:
            a.woa0 r9 = (a.woa0) r9
            java.util.List r5 = r9.f39485a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            a.dpa0 r5 = (a.dpa0) r5
            int r5 = r5.i
            r6 = 2
            if (r5 != r6) goto L24
            int r9 = r9.f
            r5 = 4
            a.bxq0 r7 = r8.n
            if (r9 != r5) goto L54
            a.la6 r9 = new a.la6
            r9.<init>(r7, r2, r6)
            r5 = 3
            a.vne r6 = r8.m
            a.qjj.W(r6, r2, r2, r9, r5)
            goto L24
        L54:
            r5 = 5
            if (r9 != r5) goto L24
            r7.a()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qa6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
