package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class po90 extends zzf0 implements Function2 {
    public final /* synthetic */ byte j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Function1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ po90(Function1 function1, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.j = b;
        this.m = function1;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.j) {
            case 0:
                po90 po90Var = new po90(this.m, yjeVar, (byte) 0);
                po90Var.l = obj;
                return po90Var;
            default:
                po90 po90Var2 = new po90(this.m, yjeVar, (byte) 1);
                po90Var2.l = obj;
                return po90Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        inn0 inn0Var = (inn0) obj;
        yje yjeVar = (yje) obj2;
        switch (this.j) {
            case 0:
                return ((po90) create(inn0Var, yjeVar)).invokeSuspend(Unit.f46060a);
            default:
                ((po90) create(inn0Var, yjeVar)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0031 -> B:14:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:12:0x0033
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            byte r0 = r7.j
            kotlin.jvm.functions.Function1 r1 = r7.m
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L41;
                default: goto Lb;
            }
        Lb:
            a.wne r0 = a.wne.f39444a
            boolean r5 = r7.k
            if (r5 == 0) goto L1f
            if (r5 != r3) goto L1b
            java.lang.Object r2 = r7.l
            a.inn0 r2 = (a.inn0) r2
            a.z1x.P(r8)
            goto L35
        L1b:
            a.jf4.n(r2)
            goto L34
        L1f:
            a.z1x.P(r8)
            java.lang.Object r8 = r7.l
            a.inn0 r8 = (a.inn0) r8
            r2 = r8
        L27:
            a.xoa0 r8 = a.xoa0.f41207a
            r7.l = r2
            r7.k = r3
            java.lang.Object r8 = r2.a(r8, r7)
            if (r8 != r0) goto L35
            r4 = r0
        L34:
            return r4
        L35:
            a.woa0 r8 = (a.woa0) r8
            android.view.MotionEvent r8 = r8.a()
            if (r8 == 0) goto L27
            r1.invoke(r8)
            goto L27
        L41:
            java.lang.Object r0 = r7.l
            a.inn0 r0 = (a.inn0) r0
            a.wne r5 = a.wne.f39444a
            boolean r6 = r7.k
            if (r6 == 0) goto L55
            if (r6 != r3) goto L51
            a.z1x.P(r8)
            goto L66
        L51:
            a.jf4.n(r2)
            goto L6d
        L55:
            a.z1x.P(r8)
            r7.l = r4
            r7.k = r3
            r8 = 0
            r2 = 2
            java.lang.Object r7 = a.tto0.b(r0, r8, r7, r2)
            if (r7 != r5) goto L66
            r4 = r5
            goto L6d
        L66:
            a.fo90 r7 = a.fo90.f9872a
            r1.invoke(r7)
            kotlin.Unit r4 = kotlin.Unit.f46060a
        L6d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.po90.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
