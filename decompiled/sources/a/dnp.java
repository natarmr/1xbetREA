package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class dnp extends bnn0 implements xdr {
    public byte i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ nnp l;
    public final /* synthetic */ List m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    public kmq p;
    public zmb q;
    public nnp r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnp(yje yjeVar, nnp nnpVar, List list, boolean z, boolean z2) {
        super(3, yjeVar);
        this.l = nnpVar;
        this.m = list;
        this.n = z;
        this.o = z2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        dnp dnpVar = new dnp((yje) obj3, this.l, this.m, this.n, this.o);
        dnpVar.j = (kmq) obj;
        dnpVar.k = obj2;
        return dnpVar.invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c1, code lost:
    
        if (r0 == r1) goto L26;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            r20 = this;
            r0 = r20
            a.wne r1 = a.wne.f39444a
            byte r2 = r0.i
            a.nnp r5 = r0.l
            r9 = 2
            r3 = 1
            r10 = 0
            if (r2 == 0) goto L2b
            if (r2 == r3) goto L1c
            if (r2 != r9) goto L16
            a.z1x.P(r21)
            goto Lc4
        L16:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r10
        L1c:
            a.nnp r2 = r0.r
            a.zmb r3 = r0.q
            a.kmq r4 = r0.p
            a.z1x.P(r21)
            r7 = r3
            r3 = r2
            r2 = r21
        L29:
            r11 = r4
            goto L6c
        L2b:
            a.z1x.P(r21)
            a.kmq r4 = r0.j
            java.lang.Object r2 = r0.k
            r14 = r2
            a.zmb r14 = (a.zmb) r14
            a.tzi r12 = r5.p
            org.xplatform.feed.linelive.presentation.feeds.child.champs.models.FeedsChampsItemsScreenParams r2 = r5.T
            a.j700 r13 = r2.b
            java.util.List r6 = r2.f46665a
            java.util.Set r7 = r2.c
            boolean r2 = r2.e
            r0.j = r10
            r0.k = r10
            r0.p = r4
            r0.q = r14
            r0.r = r5
            r0.i = r3
            java.lang.Object r3 = r12.f
            a.mne r3 = (a.mne) r3
            a.dvj r3 = r3.b
            a.c43 r11 = new a.c43
            r19 = 0
            java.util.List r15 = r0.m
            r18 = r2
            r16 = r6
            r17 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r2 = a.qjj.d0(r3, r11, r0)
            if (r2 != r1) goto L69
            goto Lc3
        L69:
            r3 = r5
            r7 = r14
            goto L29
        L6c:
            a.gmq r2 = (a.gmq) r2
            a.cnp r4 = new a.cnp
            boolean r6 = r0.n
            r4.<init>(r5, r6, r10)
            a.fnq r6 = new a.fnq
            r6.<init>(r2, r4)
            int r2 = a.nnp.a0
            r3.getClass()
            a.a1g r2 = new a.a1g
            r4 = 17
            r2.<init>(r6, r3, r4)
            a.ic1 r3 = new a.ic1
            java.util.List r6 = r0.m
            r8 = 0
            boolean r4 = r0.o
            r3.<init>(r4, r5, r6, r7, r8)
            r0.j = r10
            r0.k = r10
            r0.p = r10
            r0.q = r10
            r0.r = r10
            r0.i = r9
            a.f7k.J(r11)
            a.vnq r4 = new a.vnq
            r4.<init>(r11, r3, r9)
            a.kie0 r3 = new a.kie0
            r3.<init>()
            a.xj9 r5 = new a.xj9
            r5.<init>(r4, r3)
            java.lang.Object r0 = r2.c(r5, r0)
            if (r0 != r1) goto Lb5
            goto Lb7
        Lb5:
            kotlin.Unit r0 = kotlin.Unit.f46060a
        Lb7:
            if (r0 != r1) goto Lba
            goto Lbc
        Lba:
            kotlin.Unit r0 = kotlin.Unit.f46060a
        Lbc:
            if (r0 != r1) goto Lbf
            goto Lc1
        Lbf:
            kotlin.Unit r0 = kotlin.Unit.f46060a
        Lc1:
            if (r0 != r1) goto Lc4
        Lc3:
            return r1
        Lc4:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dnp.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
