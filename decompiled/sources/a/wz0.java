package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class wz0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public boolean k;
    public boolean l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz0(boolean z, boolean z2, r2w r2wVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        this.k = z;
        this.l = z2;
        this.m = r2wVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                return new wz0(this.k, (a01) obj2, this.l, yjeVar, (byte) 0);
            case 1:
                return new wz0(this.k, (zu3) obj2, this.l, yjeVar, (byte) 1);
            case 2:
                return new wz0(this.k, (ccp) obj2, this.l, yjeVar, (byte) 2);
            case 3:
                wz0 wz0Var = new wz0(yjeVar, (wdu) obj2, this.l);
                wz0Var.k = ((Boolean) obj).booleanValue();
                return wz0Var;
            case 4:
                return new wz0(this.k, this.l, (r2w) obj2, yjeVar);
            case 5:
                return new wz0((diu0) obj2, yjeVar, (byte) 5);
            case 6:
                return new wz0((diu0) obj2, yjeVar, (byte) 6);
            case 7:
                return new wz0((diu0) obj2, yjeVar, (byte) 7);
            default:
                return new wz0((diu0) obj2, yjeVar, (byte) 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((wz0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((wz0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((wz0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((wz0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((wz0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((wz0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((wz0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((wz0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wz0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0380  */
    /* JADX WARN: Code duplicated, block: B:200:0x0403  */
    /* JADX WARN: Code duplicated, block: B:203:0x0408  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:68:0x018d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0202  */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x024b, code lost:
    
        if (a.qcc.O(1000, r32) == r11) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x029e, code lost:
    
        if (r0.F(r32) == r11) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02a7, code lost:
    
        if (r0.x(r32) == r11) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02b8, code lost:
    
        if (r0.y(r32) == r11) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0308, code lost:
    
        if (r0 == r10) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x031e, code lost:
    
        if (r0 == r10) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0388, code lost:
    
        if (r1.l(r32) == r0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03c2, code lost:
    
        if (r0.a(false, r32) == r10) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03d5, code lost:
    
        if (r0.a(false, r32) == r10) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x040a, code lost:
    
        if (r0 == r10) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x04b4, code lost:
    
        if (r1 == r10) goto L237;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 1328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wz0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wz0(diu0 diu0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = diu0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wz0(boolean z, diu0 diu0Var, boolean z2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = z;
        this.m = diu0Var;
        this.l = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz0(yje yjeVar, wdu wduVar, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.m = wduVar;
        this.l = z;
    }
}
