package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class sji0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public byte j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public final /* synthetic */ Object q;
    public Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sji0(uji0 uji0Var, pji0 pji0Var, yje yjeVar) {
        super(2, yjeVar);
        this.m = uji0Var;
        this.q = pji0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.q;
        switch (b) {
            case 0:
                return new sji0((uji0) this.m, (pji0) obj2, yjeVar);
            default:
                sji0 sji0Var = new sji0((zyn0) obj2, (bpn0) this.r, yjeVar);
                sji0Var.p = obj;
                return sji0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((sji0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0256  */
    /* JADX WARN: Code duplicated, block: B:103:0x025a  */
    /* JADX WARN: Code duplicated, block: B:107:0x029c  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b4 A[PHI: r0 r1 r3 r12 r13 r18 r41
  0x02b4: PHI (r0v61 java.lang.Object) = (r0v52 java.lang.Object), (r0v52 java.lang.Object), (r0v71 java.lang.Object) binds: [B:111:0x02b7, B:108:0x02b0, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]
  0x02b4: PHI (r1v41 a.kka) = (r1v37 a.kka), (r1v37 a.kka), (r1v44 a.kka) binds: [B:111:0x02b7, B:108:0x02b0, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]
  0x02b4: PHI (r3v19 a.bpn0) = (r3v9 a.bpn0), (r3v14 a.bpn0), (r3v20 a.bpn0) binds: [B:111:0x02b7, B:108:0x02b0, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]
  0x02b4: PHI (r12v23 a.wne) = (r12v20 a.wne), (r12v20 a.wne), (r12v24 a.wne) binds: [B:111:0x02b7, B:108:0x02b0, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]
  0x02b4: PHI (r13v23 a.ocj) = (r13v20 a.ocj), (r13v20 a.ocj), (r13v24 a.ocj) binds: [B:111:0x02b7, B:108:0x02b0, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]
  0x02b4: PHI (r18v18 a.p7m0) = (r18v15 a.p7m0), (r18v15 a.p7m0), (r18v19 a.p7m0) binds: [B:111:0x02b7, B:108:0x02b0, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]
  0x02b4: PHI (r41v23 a.oyg0) = (r41v20 a.oyg0), (r41v20 a.oyg0), (r41v24 a.oyg0) binds: [B:111:0x02b7, B:108:0x02b0, B:9:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:120:0x0330  */
    /* JADX WARN: Code duplicated, block: B:123:0x033e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0341  */
    /* JADX WARN: Code duplicated, block: B:126:0x034d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0353  */
    /* JADX WARN: Code duplicated, block: B:157:0x0427  */
    /* JADX WARN: Code duplicated, block: B:160:0x045c  */
    /* JADX WARN: Code duplicated, block: B:161:0x045f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0467  */
    /* JADX WARN: Code duplicated, block: B:164:0x046a  */
    /* JADX WARN: Code duplicated, block: B:167:0x0476  */
    /* JADX WARN: Code duplicated, block: B:168:0x0479  */
    /* JADX WARN: Code duplicated, block: B:170:0x0481  */
    /* JADX WARN: Code duplicated, block: B:171:0x0484  */
    /* JADX WARN: Code duplicated, block: B:183:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:37:0x010b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0123  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:96:0x023e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0242  */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x037d, code lost:
    
        if (r1 == r12) goto L130;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) {
        /*
            Method dump skipped, instruction units count: 1228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.sji0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sji0(zyn0 zyn0Var, bpn0 bpn0Var, yje yjeVar) {
        super(2, yjeVar);
        this.q = zyn0Var;
        this.r = bpn0Var;
    }
}
