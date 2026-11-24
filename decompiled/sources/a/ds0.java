package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ds0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public Object j;
    public Object k;
    public long l;
    public long m;
    public byte n;
    public boolean o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds0(qgd qgdVar, long j, long j2, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.p = qgdVar;
        this.l = j;
        this.m = j2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                return new ds0(this.o, (gs0) obj2, yjeVar, (byte) 0);
            case 1:
                return new ds0(this.o, (gs0) obj2, yjeVar, (byte) 1);
            case 2:
                return new ds0(this.o, (gs0) obj2, yjeVar, (byte) 2);
            default:
                ds0 ds0Var = new ds0((qgd) obj2, this.l, this.m, yjeVar);
                ds0Var.k = obj;
                return ds0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ds0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ds0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ds0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ds0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020b  */
    /* JADX WARN: Code duplicated, block: B:101:0x0212  */
    /* JADX WARN: Code duplicated, block: B:134:0x02be  */
    /* JADX WARN: Code duplicated, block: B:137:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:141:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:145:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:148:0x031b  */
    /* JADX WARN: Code duplicated, block: B:154:0x032e  */
    /* JADX WARN: Code duplicated, block: B:155:0x0331  */
    /* JADX WARN: Code duplicated, block: B:157:0x0334  */
    /* JADX WARN: Code duplicated, block: B:161:0x0345  */
    /* JADX WARN: Code duplicated, block: B:167:0x035b  */
    /* JADX WARN: Code duplicated, block: B:173:0x036e  */
    /* JADX WARN: Code duplicated, block: B:176:0x037f  */
    /* JADX WARN: Code duplicated, block: B:182:0x039e  */
    /* JADX WARN: Code duplicated, block: B:185:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:191:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:192:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:194:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:198:0x03fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:199:0x0400  */
    /* JADX WARN: Code duplicated, block: B:200:0x0407  */
    /* JADX WARN: Code duplicated, block: B:211:0x043a  */
    /* JADX WARN: Code duplicated, block: B:243:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:246:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:251:0x050b  */
    /* JADX WARN: Code duplicated, block: B:257:0x052f A[LOOP:14: B:255:0x0529->B:257:0x052f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:265:0x0561  */
    /* JADX WARN: Code duplicated, block: B:288:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:? A[LOOP:1: B:87:0x01d1->B:293:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0329 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x034d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x033f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x0369 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x0387 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x0379 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x03cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x03c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x0518 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x0505 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0159  */
    /* JADX WARN: Code duplicated, block: B:56:0x016c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0183  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:98:0x0203  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a1, code lost:
    
        if (a.slb.Q(r0, r3, r25) == r2) goto L21;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ds0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ds0(boolean z, gs0 gs0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.o = z;
        this.p = gs0Var;
    }
}
