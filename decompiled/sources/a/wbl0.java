package a;

import com.huawei.hms.api.ConnectionResult;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class wbl0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wbl0(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object l(ywv0 ywv0Var, yje yjeVar) {
        rwv0 rwv0Var;
        if (yjeVar instanceof rwv0) {
            rwv0Var = (rwv0) yjeVar;
            int i = rwv0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                rwv0Var.j = i - Integer.MIN_VALUE;
            } else {
                rwv0Var = new rwv0(yjeVar);
            }
        } else {
            rwv0Var = new rwv0(yjeVar);
        }
        Object obj = rwv0Var.i;
        Object obj2 = wne.f39444a;
        int i2 = rwv0Var.j;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                rwv0Var.j = 1;
                if (ywv0Var.a(rwv0Var) == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
        } catch (CancellationException unused) {
            zvw.O(rwv0Var.getContext());
        }
        return Unit.f46060a;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new wbl0((ncl0) this.k, (u3z) obj2, yjeVar, (byte) 0);
            case 1:
                return new wbl0((vsl0) obj2, yjeVar, (byte) 1);
            case 2:
                return new wbl0((vsl0) this.k, (String) obj2, yjeVar, (byte) 2);
            case 3:
                return new wbl0((bvn0) obj2, yjeVar, (byte) 3);
            case 4:
                return new wbl0((zyn0) this.k, (bpn0) obj2, yjeVar, (byte) 4);
            case 5:
                wbl0 wbl0Var = new wbl0((zyn0) obj2, yjeVar, (byte) 5);
                wbl0Var.k = obj;
                return wbl0Var;
            case 6:
                return new wbl0((xk80) this.k, (xno0) obj2, yjeVar, (byte) 6);
            case 7:
                return new wbl0((xk80) this.k, (yno0) obj2, yjeVar, (byte) 7);
            case 8:
                return new wbl0((bby) this.k, (hub0) obj2, yjeVar, (byte) 8);
            case 9:
                return new wbl0((ofr0) obj2, yjeVar, (byte) 9);
            case 10:
                return new wbl0((ofr0) obj2, yjeVar, (byte) 10);
            case 11:
                return new wbl0((njr0) obj2, yjeVar, (byte) 11);
            case 12:
                return new wbl0((t33) this.k, (o6s0) obj2, yjeVar, (byte) 12);
            case 13:
                wbl0 wbl0Var2 = new wbl0((jrs0) obj2, yjeVar, (byte) 13);
                wbl0Var2.k = obj;
                return wbl0Var2;
            case 14:
                return new wbl0((wyk) this.k, (hzb0) obj2, yjeVar, (byte) 14);
            case 15:
                return new wbl0((xqt0) this.k, (vne) obj2, yjeVar, (byte) 15);
            case 16:
                return new wbl0((abu0) obj2, yjeVar, (byte) 16);
            case 17:
                wbl0 wbl0Var3 = new wbl0((s9g) obj2, yjeVar, (byte) 17);
                wbl0Var3.k = obj;
                return wbl0Var3;
            case 18:
                return new wbl0((vkr0) this.k, (l7m0) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new wbl0((mwv0) this.k, (ywv0) obj2, yjeVar, (byte) 19);
            case 20:
                return new wbl0((n2w0) this.k, (String) obj2, yjeVar, (byte) 20);
            default:
                return new wbl0((x7w0) obj2, yjeVar, (byte) 21);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((wbl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((wbl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((wbl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((wbl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((wbl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((wbl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((wbl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((wbl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((wbl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((wbl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((wbl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((wbl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((wbl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((wbl0) create((fhs0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((wbl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((wbl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((wbl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((wbl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((wbl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((wbl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            case 20:
                return ((wbl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return new wbl0((x7w0) this.l, (yje) obj2, (byte) 21).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0244  */
    /* JADX WARN: Code duplicated, block: B:124:0x0255  */
    /* JADX WARN: Code duplicated, block: B:145:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:148:0x0308  */
    /* JADX WARN: Code duplicated, block: B:257:0x051f  */
    /* JADX WARN: Code duplicated, block: B:258:0x0525  */
    /* JADX WARN: Code duplicated, block: B:277:0x0587  */
    /* JADX WARN: Code duplicated, block: B:278:0x058d  */
    /* JADX WARN: Code duplicated, block: B:411:0x0830 A[PHI: r4 r5
  0x0830: PHI (r4v21 java.util.List) = (r4v20 java.util.List), (r4v31 java.util.List) binds: [B:409:0x082c, B:399:0x07f1] A[DONT_GENERATE, DONT_INLINE]
  0x0830: PHI (r5v11 java.lang.Object) = (r5v10 java.lang.Object), (r5v19 java.lang.Object) binds: [B:409:0x082c, B:399:0x07f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:413:0x084e  */
    /* JADX WARN: Code duplicated, block: B:416:0x0860  */
    /* JADX WARN: Code duplicated, block: B:419:0x086a  */
    /* JADX WARN: Code duplicated, block: B:423:0x0878  */
    /* JADX WARN: Code duplicated, block: B:491:0x0a57  */
    /* JADX WARN: Code duplicated, block: B:494:0x0a5c  */
    /* JADX WARN: Code duplicated, block: B:528:0x0875 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:529:? A[LOOP:5: B:417:0x0864->B:529:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e6, code lost:
    
        if (((a.s9g) r11).invoke(r0, r34) == r1) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0230, code lost:
    
        if (a.qcc.P(r9, r34) == r2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0304, code lost:
    
        if (r0.l(r34) == r4) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0368, code lost:
    
        if (r11.e.m(r34, r1) == r0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03bd, code lost:
    
        if (r1 == r0) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03ff, code lost:
    
        if (r0.f(r34, r4) == r1) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (r0 == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0453, code lost:
    
        if (r1 == r0) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x04b1, code lost:
    
        if (r1 == r0) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x04df, code lost:
    
        if (r1 == r0) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x05ca, code lost:
    
        if (((a.hub0) r11).c(r34) == r0) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x060f, code lost:
    
        if (r0.v(r1, 0.0f, r34) == r3) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0618, code lost:
    
        if (a.xk80.g(r0, r1, null, r34, 6) == r3) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x065d, code lost:
    
        if (r0.v(r1, 0.0f, r34) == r3) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0666, code lost:
    
        if (a.xk80.g(r0, r1, null, r34, 6) == r3) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x06ae, code lost:
    
        if (a.slb.N(r0, r34) == r1) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0732, code lost:
    
        if (a.qcc.P(r7, r34) == r2) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fa, code lost:
    
        if (a.qjj.d0(r2, r3, r34) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x08e9, code lost:
    
        if (r0 == r3) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x09b7, code lost:
    
        if (r0 == r3) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0a5e, code lost:
    
        if (r1 == r0) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0ad7, code lost:
    
        if (a.slb.N(r1, r34) == r9) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0144, code lost:
    
        if (r1.f37082a.c(r2, r34) == r0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a4, code lost:
    
        if (r0.invoke(r34) == r3) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 2828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wbl0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wbl0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
    }
}
