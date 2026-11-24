package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class lby extends zzf0 implements Function2 {
    public u460 j;
    public gac k;
    public int l;
    public int m;
    public byte n;
    public /* synthetic */ Object o;
    public final /* synthetic */ pby p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lby(yje yjeVar, pby pbyVar) {
        super(2, yjeVar);
        this.p = pbyVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        lby lbyVar = new lby(yjeVar, this.p);
        lbyVar.o = obj;
        return lbyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((lby) create((fgi0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0061 -> B:25:0x0079). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.o
            a.fgi0 r0 = (a.fgi0) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r7.n
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L27
            if (r2 == r4) goto L23
            if (r2 != r3) goto L1d
            int r2 = r7.m
            int r4 = r7.l
            a.gac r5 = r7.k
            a.u460 r6 = r7.j
            a.z1x.P(r8)
            goto L79
        L1d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r5
        L23:
            a.z1x.P(r8)
            goto L7e
        L27:
            a.z1x.P(r8)
            a.pby r8 = r7.p
            java.lang.Object r8 = r8.H()
            boolean r2 = r8 instanceof a.gac
            if (r2 == 0) goto L40
            a.gac r8 = (a.gac) r8
            a.jac r8 = r8.e
            r7.o = r5
            r7.n = r4
            r0.a(r7, r8)
            return r1
        L40:
            boolean r2 = r8 instanceof a.u4x
            if (r2 == 0) goto L7e
            a.u4x r8 = (a.u4x) r8
            a.u460 r8 = r8.c()
            if (r8 == 0) goto L7e
            java.lang.Object r2 = r8.g()
            r2.getClass()
            a.hu00 r2 = (a.hu00) r2
            r4 = 0
            r6 = r8
            r5 = r2
            r2 = r4
        L59:
            boolean r8 = r5.equals(r6)
            if (r8 != 0) goto L7e
            boolean r8 = r5 instanceof a.gac
            if (r8 == 0) goto L79
            a.gac r5 = (a.gac) r5
            a.jac r8 = r5.e
            r7.o = r0
            r7.j = r6
            r7.k = r5
            r7.l = r4
            r7.m = r2
            r7.n = r3
            r0.a(r7, r8)
            a.wne r7 = a.wne.f39444a
            return r1
        L79:
            a.hu00 r5 = r5.h()
            goto L59
        L7e:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lby.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
