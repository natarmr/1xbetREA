package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ma6 extends zzf0 implements Function2 {
    public final /* synthetic */ byte j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ma6(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.j = b;
        this.m = obj;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.j;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                ma6 ma6Var = new ma6((xoa0) obj2, yjeVar, (byte) 0);
                ma6Var.l = obj;
                return ma6Var;
            case 1:
                ma6 ma6Var2 = new ma6((ep90) obj2, yjeVar, (byte) 1);
                ma6Var2.l = obj;
                return ma6Var2;
            default:
                ma6 ma6Var3 = new ma6((ome) obj2, yjeVar, (byte) 2);
                ma6Var3.l = obj;
                return ma6Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        inn0 inn0Var = (inn0) obj;
        yje yjeVar = (yje) obj2;
        switch (this.j) {
            case 0:
                return ((ma6) create(inn0Var, yjeVar)).invokeSuspend(Unit.f46060a);
            case 1:
                ((ma6) create(inn0Var, yjeVar)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            default:
                ((ma6) create(inn0Var, yjeVar)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0031 -> B:14:0x0035). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0068 -> B:25:0x006c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:15:0x0047
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            byte r0 = r7.j
            java.lang.Object r1 = r7.m
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            switch(r0) {
                case 0: goto L8b;
                case 1: goto L47;
                default: goto Lb;
            }
        Lb:
            a.wne r0 = a.wne.f39444a
            boolean r5 = r7.k
            if (r5 == 0) goto L1f
            if (r5 != r4) goto L1b
            java.lang.Object r2 = r7.l
            a.inn0 r2 = (a.inn0) r2
            a.z1x.P(r8)
            goto L35
        L1b:
            a.jf4.n(r3)
            goto L34
        L1f:
            a.z1x.P(r8)
            java.lang.Object r8 = r7.l
            a.inn0 r8 = (a.inn0) r8
            r2 = r8
        L27:
            a.xoa0 r8 = a.xoa0.f41207a
            r7.l = r2
            r7.k = r4
            java.lang.Object r8 = r2.a(r8, r7)
            if (r8 != r0) goto L35
            r2 = r0
        L34:
            return r2
        L35:
            a.woa0 r8 = (a.woa0) r8
            r3 = r1
            a.ome r3 = (a.ome) r3
            boolean r8 = a.e5i0.a(r8)
            r8 = r8 ^ r4
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r3.invoke(r8)
            goto L27
        L47:
            java.lang.Object r0 = r7.l
            a.inn0 r0 = (a.inn0) r0
            a.wne r5 = a.wne.f39444a
            boolean r6 = r7.k
            if (r6 == 0) goto L5b
            if (r6 != r4) goto L57
            a.z1x.P(r8)
            goto L6c
        L57:
            a.jf4.n(r3)
            goto L6b
        L5b:
            a.z1x.P(r8)
        L5e:
            r7.l = r0
            r7.k = r4
            a.xoa0 r8 = a.xoa0.b
            java.lang.Object r8 = r0.a(r8, r7)
            if (r8 != r5) goto L6c
            r2 = r5
        L6b:
            return r2
        L6c:
            a.woa0 r8 = (a.woa0) r8
            java.util.List r8 = r8.f39485a
            java.lang.Object r8 = kotlin.collections.CollectionsKt.firstOrNull(r8)
            a.dpa0 r8 = (a.dpa0) r8
            if (r8 == 0) goto L5e
            boolean r8 = r8.d
            if (r8 != r4) goto L5e
            r8 = r1
            a.ep90 r8 = (a.ep90) r8
            a.jh70 r2 = a.ep90.c2
            a.k3t0 r8 = r8.K0()
            a.sn90 r2 = a.sn90.f32482a
            r8.x(r2)
            goto L5e
        L8b:
            a.wne r0 = a.wne.f39444a
            boolean r5 = r7.k
            if (r5 == 0) goto L9c
            if (r5 != r4) goto L97
            a.z1x.P(r8)
            goto Lae
        L97:
            a.jf4.n(r3)
            r8 = r2
            goto Lae
        L9c:
            a.z1x.P(r8)
            java.lang.Object r8 = r7.l
            a.inn0 r8 = (a.inn0) r8
            a.xoa0 r1 = (a.xoa0) r1
            r7.k = r4
            java.lang.Object r8 = a.tto0.i(r8, r1, r7)
            if (r8 != r0) goto Lae
            r8 = r0
        Lae:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ma6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
