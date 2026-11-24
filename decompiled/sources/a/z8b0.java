package a;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class z8b0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8b0(nfm0 nfm0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 24;
        tcm0[] tcm0VarArr = tcm0.f33725a;
        this.k = nfm0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        if (r15 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c7, code lost:
    
        if (r15 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z8b0.l(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:106:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x008c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3 A[LOOP:1: B:27:0x009d->B:29:0x00a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd A[LOOP:2: B:36:0x00c7->B:38:0x00cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00db  */
    /* JADX WARN: Code duplicated, block: B:41:0x00de  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7 A[LOOP:3: B:45:0x00f1->B:47:0x00f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0105  */
    /* JADX WARN: Code duplicated, block: B:50:0x0108  */
    /* JADX WARN: Code duplicated, block: B:53:0x010e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0121 A[LOOP:4: B:54:0x011b->B:56:0x0121, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x012f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0132  */
    /* JADX WARN: Code duplicated, block: B:63:0x015c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0164 A[LOOP:5: B:61:0x0156->B:65:0x0164, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x01ac A[LOOP:6: B:69:0x01a4->B:71:0x01ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x01e3 A[LOOP:7: B:73:0x01dd->B:75:0x01e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x021a A[LOOP:8: B:77:0x0214->B:79:0x021a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x0260  */
    /* JADX WARN: Code duplicated, block: B:86:0x0265  */
    /* JADX WARN: Code duplicated, block: B:90:0x026c  */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0267, code lost:
    
        if (r5 == r2) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0291, code lost:
    
        if (r0 == r2) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v12, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r25v1, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z8b0.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r0.z(r6) == r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r0.z(r6) == r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.k
            a.mkn0 r0 = (a.mkn0) r0
            a.ol60 r1 = r0.z
            a.wne r2 = a.wne.f39444a
            byte r3 = r6.j
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L1e
            if (r3 == r5) goto L1a
            if (r3 != r4) goto L13
            goto L1a
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            r6 = 0
            return r6
        L1a:
            a.z1x.P(r7)
            goto L5f
        L1e:
            a.z1x.P(r7)
            a.r9u r7 = r0.u
            a.ygp r3 = a.ygp.p1
            r7.getClass()
            a.j1q0 r7 = r7.f30104a
            boolean r7 = r7.a(r3)
            if (r7 == 0) goto L39
            r6.j = r5
            java.lang.Object r6 = r0.z(r6)
            if (r6 != r2) goto L5f
            goto L5b
        L39:
            boolean r7 = r0.x()
            a.ckn0 r3 = a.ckn0.f4516a
            if (r7 == 0) goto L45
            r1.f(r3)
            goto L5f
        L45:
            boolean r7 = r0.y()
            if (r7 == 0) goto L5c
            a.sff0 r7 = r0.w()
            boolean r7 = r7.C
            if (r7 == 0) goto L5c
            r6.j = r4
            java.lang.Object r6 = r0.z(r6)
            if (r6 != r2) goto L5f
        L5b:
            return r2
        L5c:
            r1.f(r3)
        L5f:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z8b0.o(java.lang.Object):java.lang.Object");
    }

    private final Object r(Object obj) {
        jnn0 jnn0Var = (jnn0) this.k;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        if (b == 0) {
            z1x.P(obj);
            PointerInputEventHandler pointerInputEventHandler = jnn0Var.q;
            this.j = (byte) 2;
            if (pointerInputEventHandler.invoke(jnn0Var, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (b != 1 && b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r1.Z(r22) == r4) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z8b0.s(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r6.c(r2, r5) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.k
            a.q4p0 r0 = (a.q4p0) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r5.j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L14
            a.z1x.P(r6)
            goto L42
        L14:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L1b:
            a.z1x.P(r6)
            goto L2d
        L1f:
            a.z1x.P(r6)
            a.yzn0 r6 = r0.x
            r5.j = r4
            java.lang.Object r6 = r6.l(r5)
            if (r6 != r1) goto L2d
            goto L41
        L2d:
            a.n4u r6 = r0.s
            a.a1t r6 = r6.b()
            a.o4p0 r2 = new a.o4p0
            r4 = 0
            r2.<init>(r0, r4)
            r5.j = r3
            java.lang.Object r5 = r6.c(r2, r5)
            if (r5 != r1) goto L42
        L41:
            return r1
        L42:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z8b0.t(java.lang.Object):java.lang.Object");
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new z8b0((g9b0) obj2, yjeVar, (byte) 0);
            case 1:
                return new z8b0((lpb0) obj2, yjeVar, (byte) 1);
            case 2:
                return new z8b0((org.xplatform.feature.promo_aggregator.impl.presentation.compose.b) obj2, yjeVar, (byte) 2);
            case 3:
                return new z8b0((dtc0) obj2, yjeVar, (byte) 3);
            case 4:
                return new z8b0((c9d0) obj2, yjeVar, (byte) 4);
            case 5:
                return new z8b0((udd0) obj2, yjeVar, (byte) 5);
            case 6:
                return new z8b0((hxd0) obj2, yjeVar, (byte) 6);
            case 7:
                return new z8b0((nde0) obj2, yjeVar, (byte) 7);
            case 8:
                return new z8b0((k1f0) obj2, yjeVar, (byte) 8);
            case 9:
                return new z8b0((psf0) obj2, yjeVar, (byte) 9);
            case 10:
                return new z8b0((nyf0) obj2, yjeVar, (byte) 10);
            case 11:
                return new z8b0((dxg0) obj2, yjeVar, (byte) 11);
            case 12:
                return new z8b0((w6h0) obj2, yjeVar, (byte) 12);
            case 13:
                return new z8b0((cai0) obj2, yjeVar, (byte) 13);
            case 14:
                return new z8b0((jai0) obj2, yjeVar, (byte) 14);
            case 15:
                return new z8b0((imi0) obj2, yjeVar, (byte) 15);
            case 16:
                return new z8b0((swi0) obj2, yjeVar, (byte) 16);
            case 17:
                return new z8b0((t1j0) obj2, yjeVar, (byte) 17);
            case 18:
                return new z8b0((qbj0) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new z8b0((ofj0) obj2, yjeVar, (byte) 19);
            case 20:
                return new z8b0((yxj0) obj2, yjeVar, (byte) 20);
            case 21:
                return new z8b0((k6k0) obj2, yjeVar, (byte) 21);
            case 22:
                return new z8b0((fdk0) obj2, yjeVar, (byte) 22);
            case 23:
                return new z8b0((tpk0) obj2, yjeVar, (byte) 23);
            case 24:
                tcm0[] tcm0VarArr = tcm0.f33725a;
                return new z8b0((nfm0) obj2, yjeVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new z8b0((mkn0) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new z8b0((jnn0) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new z8b0((zyn0) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new z8b0((q4p0) obj2, yjeVar, (byte) 28);
            default:
                return new z8b0((ouu) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                break;
        }
        return ((z8b0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:276:0x0549  */
    /* JADX WARN: Code duplicated, block: B:372:0x0767  */
    /* JADX WARN: Code duplicated, block: B:373:0x076a  */
    /* JADX WARN: Code duplicated, block: B:376:0x077e A[PHI: r1
  0x077e: PHI (r1v62 java.lang.Object) = (r1v61 java.lang.Object), (r1v68 java.lang.Object) binds: [B:374:0x077b, B:359:0x0726] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:378:0x0786  */
    /* JADX WARN: Code duplicated, block: B:385:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:531:0x0a87  */
    /* JADX WARN: Code duplicated, block: B:572:0x0b62  */
    /* JADX WARN: Code duplicated, block: B:576:0x0b90  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b6, code lost:
    
        if (r1 == r0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x022a, code lost:
    
        if (r1 == r0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x029e, code lost:
    
        if (r1 == r0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x030d, code lost:
    
        if (r1 == r0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (kotlin.Unit.f46060a == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x035a, code lost:
    
        if (a.qcc.O(3500, r36) == r0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03c6, code lost:
    
        if (a.qcc.O(3500, r36) == r0) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0437, code lost:
    
        if (a.qcc.O(3500, r36) == r0) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x04f5, code lost:
    
        if (r0.f(r2, r36) == r1) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0551, code lost:
    
        if (r8.S(r36) == r0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0599, code lost:
    
        if (r8.x(r1, r36) == r0) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x06b5, code lost:
    
        if (r8.h(r36) == r2) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x06fe, code lost:
    
        if (r8.h(r36) == r0) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x078c, code lost:
    
        if (a.qcc.O(3500, r36) == r0) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x086a, code lost:
    
        if (r1 == r0) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
    
        if (r2.a(r1, r36) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x08a3, code lost:
    
        if (r2.a("", r36) == r0) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x08cf, code lost:
    
        if (r8.c1(r36) == r0) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x08d9, code lost:
    
        if (r8.d1(r36) == r0) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:
    
        if (r2.a(r1, r36) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0943, code lost:
    
        if (r3 == r2) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x09d3, code lost:
    
        if (a.slb.O(r1, r2, r36) == r0) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00de, code lost:
    
        if (r2.a(r1, r36) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0aeb, code lost:
    
        if (r0 == r10) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0b6a, code lost:
    
        if (r2 == r1) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0118, code lost:
    
        if (r1.a(r36) == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0156, code lost:
    
        if (r8.G(r2, r36) == r1) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.String] */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z8b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8b0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }
}
