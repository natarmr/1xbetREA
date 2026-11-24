package a;

import com.huawei.hms.api.ConnectionResult;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class n1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public long j;
    public byte k;
    public Object l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(z4q0 z4q0Var, long j, d5q0 d5q0Var, y4q0 y4q0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 21;
        this.l = z4q0Var;
        this.j = j;
        this.m = d5q0Var;
        this.n = y4q0Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r12 == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r12) throws java.io.UnsupportedEncodingException {
        /*
            r11 = this;
            java.lang.Object r0 = r11.n
            a.db90 r0 = (a.db90) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r11.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L2d
            if (r2 == r4) goto L25
            if (r2 != r3) goto L1e
            java.lang.Object r1 = r11.m
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r11.l
            a.k790 r2 = (a.k790) r2
            a.z1x.P(r12)
            r4 = r1
        L1c:
            r3 = r2
            goto L7d
        L1e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            r11 = 0
            return r11
        L25:
            java.lang.Object r2 = r11.l
            a.k790 r2 = (a.k790) r2
            a.z1x.P(r12)
            goto L4b
        L2d:
            a.z1x.P(r12)
            a.k790 r2 = r0.o
            java.lang.String r12 = r2.c
            long r5 = r11.j
            int r7 = r12.length()
            if (r7 != 0) goto L4d
            a.w5z r12 = r0.s
            boolean r7 = r2.f17810a
            r11.l = r2
            r11.k = r4
            java.lang.Object r12 = r12.T(r5, r11, r7)
            if (r12 != r1) goto L4b
            goto L79
        L4b:
            java.lang.String r12 = (java.lang.String) r12
        L4d:
            int r4 = r12.length()
            if (r4 != 0) goto L5b
            int r11 = a.db90.M
            a.ba90 r11 = a.ba90.f2248a
            r0.G(r11)
            goto La3
        L5b:
            a.e1u r4 = r0.t
            a.ctf0 r5 = r0.E
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            a.lsm0 r5 = r5.b
            java.lang.String r8 = "://open"
            r9 = 2131953296(0x7f130690, float:1.9543059E38)
            java.lang.String r5 = a.w6x.r(r7, r6, r5, r9, r8)
            r11.l = r2
            r11.m = r12
            r11.k = r3
            java.lang.Object r3 = r4.c(r5, r11)
            if (r3 != r1) goto L7a
        L79:
            return r1
        L7a:
            r4 = r12
            r12 = r3
            goto L1c
        L7d:
            r5 = r12
            java.util.Map r5 = (java.util.Map) r5
            long r6 = r11.j
            int r11 = a.db90.M
            a.ocj r11 = r0.i
            a.p7m0 r11 = r11.f25029a
        L88:
            java.lang.Object r12 = r11.getValue()
            r12.getClass()
            r0 = r12
            a.ka90 r0 = (a.ka90) r0
            boolean r8 = r3.f17810a
            java.lang.String r9 = r3.c
            a.fa90 r1 = new a.fa90
            r2 = 1
            r10 = 1
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10)
            boolean r12 = r11.m(r12, r1)
            if (r12 == 0) goto L88
        La3:
            kotlin.Unit r11 = kotlin.Unit.f46060a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n1.l(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r7.a(r1, r6) == r0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r7) {
        /*
            r6 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r6.k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            a.z1x.P(r7)
            goto L47
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            r6 = 0
            return r6
        L17:
            a.z1x.P(r7)
            goto L36
        L1b:
            a.z1x.P(r7)
            java.lang.Object r7 = r6.l
            a.z4q0 r7 = (a.z4q0) r7
            a.e7q0 r7 = r7.q
            if (r7 == 0) goto L36
            long r4 = r6.j
            a.ne60 r1 = new a.ne60
            r1.<init>(r4)
            r6.k = r3
            java.lang.Object r7 = r7.invoke(r1, r6)
            if (r7 != r0) goto L36
            goto L46
        L36:
            java.lang.Object r7 = r6.m
            a.d5q0 r7 = (a.d5q0) r7
            java.lang.Object r1 = r6.n
            a.y4q0 r1 = (a.y4q0) r1
            r6.k = r2
            java.lang.Object r6 = r7.a(r1, r6)
            if (r6 != r0) goto L47
        L46:
            return r0
        L47:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n1.m(java.lang.Object):java.lang.Object");
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return new n1(this.m, this.j, obj2, yjeVar, (byte) 0);
            case 1:
                return new n1((byte) 1, yjeVar, (Serializable) obj2, this.l, this.m);
            case 2:
                return new n1((byte) 2, yjeVar, (Serializable) obj2, this.l, this.m);
            case 3:
                return new n1((byte) 3, yjeVar, (Serializable) obj2, this.l, this.m);
            case 4:
                n1 n1Var = new n1(this.m, obj2, this.j, yjeVar, (byte) 4);
                n1Var.l = obj;
                return n1Var;
            case 5:
                n1 n1Var2 = new n1(this.m, this.j, obj2, yjeVar, (byte) 5);
                n1Var2.l = obj;
                return n1Var2;
            case 6:
                n1 n1Var3 = new n1(this.m, obj2, yjeVar, (byte) 6);
                n1Var3.l = obj;
                return n1Var3;
            case 7:
                n1 n1Var4 = new n1((p23) obj2, yjeVar, (byte) 7);
                n1Var4.m = obj;
                return n1Var4;
            case 8:
                n1 n1Var5 = new n1(obj2, this.j, yjeVar, (byte) 8);
                n1Var5.m = obj;
                return n1Var5;
            case 9:
                n1 n1Var6 = new n1(obj2, this.j, yjeVar, (byte) 9);
                n1Var6.m = obj;
                return n1Var6;
            case 10:
                n1 n1Var7 = new n1(obj2, this.j, yjeVar, (byte) 10);
                n1Var7.m = obj;
                return n1Var7;
            case 11:
                n1 n1Var8 = new n1(obj2, this.j, yjeVar, (byte) 11);
                n1Var8.m = obj;
                return n1Var8;
            case 12:
                n1 n1Var9 = new n1(obj2, this.j, yjeVar, (byte) 12);
                n1Var9.m = obj;
                return n1Var9;
            case 13:
                return new n1(this.m, obj2, this.j, yjeVar, (byte) 13);
            case 14:
                n1 n1Var10 = new n1(obj2, this.j, yjeVar, (byte) 14);
                n1Var10.m = obj;
                return n1Var10;
            case 15:
                return new n1(this.m, obj2, this.j, yjeVar, (byte) 15);
            case 16:
                n1 n1Var11 = new n1(obj2, this.j, yjeVar, (byte) 16);
                n1Var11.m = obj;
                return n1Var11;
            case 17:
                return new n1(this.m, obj2, this.j, yjeVar, (byte) 17);
            case 18:
                return new n1((be10) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new n1(this.m, obj2, yjeVar, (byte) 19);
            case 20:
                return new n1(obj2, this.j, yjeVar, (byte) 20);
            case 21:
                return new n1((z4q0) this.l, this.j, (d5q0) this.m, (y4q0) obj2, yjeVar);
            default:
                return new n1(this.m, this.j, obj2, yjeVar, (byte) 22);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((n1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((n1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((n1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((n1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((n1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((n1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((n1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((n1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((n1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((n1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((n1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((n1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((n1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((n1) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((n1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((n1) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((n1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((n1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((n1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((n1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((n1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((n1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((n1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:370:0x0788  */
    /* JADX WARN: Code duplicated, block: B:374:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:426:0x08be  */
    /* JADX WARN: Code duplicated, block: B:428:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:430:0x08ee  */
    /* JADX WARN: Code duplicated, block: B:449:0x097d  */
    /* JADX WARN: Code duplicated, block: B:450:0x09a9  */
    /* JADX WARN: Code duplicated, block: B:473:0x0a24  */
    /* JADX WARN: Code duplicated, block: B:474:0x0a27  */
    /* JADX WARN: Code duplicated, block: B:477:0x0a2c  */
    /* JADX WARN: Code duplicated, block: B:486:0x0a4b  */
    /* JADX WARN: Code duplicated, block: B:490:0x0a71  */
    /* JADX WARN: Code duplicated, block: B:494:0x0a98 A[LOOP:3: B:492:0x0a8f->B:494:0x0a98, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:531:0x0aa2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:580:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:321:0x06a5 -> B:311:0x0673). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:346:0x071c -> B:348:0x071f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:378:0x07c0 -> B:368:0x077b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 2864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(byte b, yje yjeVar, Serializable serializable, Object obj, Object obj2) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
        this.n = serializable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(Object obj, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.n = obj;
        this.j = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(Object obj, long j, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.j = j;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(Object obj, Object obj2, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.n = obj2;
        this.j = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.n = obj2;
    }
}
