package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class d5i0 extends zzf0 implements Function2 {
    public final /* synthetic */ byte j = 0;
    public long k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5i0(long j, lie0 lie0Var, yje yjeVar) {
        super(2, yjeVar);
        this.k = j;
        this.n = lie0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.j;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                d5i0 d5i0Var = new d5i0(this.k, (lie0) obj2, yjeVar);
                d5i0Var.m = obj;
                return d5i0Var;
            default:
                d5i0 d5i0Var2 = new d5i0((dpa0) obj2, yjeVar);
                d5i0Var2.m = obj;
                return d5i0Var2;
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
        return ((d5i0) create(inn0Var, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0043 -> B:13:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:12:0x0045
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.j
            java.lang.Object r1 = r8.n
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            switch(r0) {
                case 0: goto L51;
                default: goto Lb;
            }
        Lb:
            a.wne r0 = a.wne.f39444a
            boolean r5 = r8.l
            if (r5 == 0) goto L21
            if (r5 != r4) goto L1d
            long r1 = r8.k
            java.lang.Object r3 = r8.m
            a.inn0 r3 = (a.inn0) r3
            a.z1x.P(r9)
            goto L47
        L1d:
            a.jf4.n(r3)
            goto L50
        L21:
            a.z1x.P(r9)
            java.lang.Object r9 = r8.m
            a.inn0 r9 = (a.inn0) r9
            a.dpa0 r1 = (a.dpa0) r1
            long r1 = r1.b
            a.wgu0 r3 = r9.e()
            long r5 = r3.b()
            long r5 = r5 + r1
            r3 = r9
            r1 = r5
        L37:
            r8.m = r3
            r8.k = r1
            r8.l = r4
            r9 = 0
            r5 = 3
            java.lang.Object r9 = a.tto0.b(r3, r9, r8, r5)
            if (r9 != r0) goto L47
            r2 = r0
            goto L50
        L47:
            a.dpa0 r9 = (a.dpa0) r9
            long r5 = r9.b
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 < 0) goto L37
            r2 = r9
        L50:
            return r2
        L51:
            a.lie0 r1 = (a.lie0) r1
            a.wne r0 = a.wne.f39444a
            boolean r5 = r8.l
            if (r5 == 0) goto L67
            if (r5 != r4) goto L63
            java.lang.Object r8 = r8.m
            a.inn0 r8 = (a.inn0) r8
            a.z1x.P(r9)
            goto L85
        L63:
            a.jf4.n(r3)
            goto Lb7
        L67:
            a.z1x.P(r9)
            java.lang.Object r9 = r8.m
            a.inn0 r9 = (a.inn0) r9
            long r2 = r8.k
            a.uph0 r5 = new a.uph0
            r6 = 6
            r5.<init>(r1, r6)
            r8.m = r9
            r8.l = r4
            java.lang.Object r8 = a.bel.c(r9, r2, r5, r8)
            if (r8 != r0) goto L82
            r2 = r0
            goto Lb7
        L82:
            r7 = r9
            r9 = r8
            r8 = r7
        L85:
            a.dpa0 r9 = (a.dpa0) r9
            if (r9 == 0) goto L9d
            long r0 = r1.f20100a
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 == 0) goto L9d
            a.acl r2 = a.acl.b
            goto Lb7
        L9d:
            a.jnn0 r8 = r8.f
            a.woa0 r8 = r8.s
            java.util.List r8 = r8.f39485a
            java.lang.Object r8 = kotlin.collections.CollectionsKt.U(r8)
            a.dpa0 r8 = (a.dpa0) r8
            boolean r9 = a.x2x.L(r8)
            if (r9 == 0) goto Lb5
            r8.a()
            a.acl r2 = a.acl.f633a
            goto Lb7
        Lb5:
            a.acl r2 = a.acl.d
        Lb7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d5i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5i0(dpa0 dpa0Var, yje yjeVar) {
        super(2, yjeVar);
        this.n = dpa0Var;
    }
}
