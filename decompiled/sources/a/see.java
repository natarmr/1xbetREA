package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class see extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public byte j;
    public int k;
    public int l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public see(n0w n0wVar, n4u n4uVar, int i, int i2, yje yjeVar) {
        super(2, yjeVar);
        this.m = n0wVar;
        this.n = n4uVar;
        this.k = i;
        this.l = i2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return new see((a4x) this.m, this.k, (xcz) obj2, this.l, yjeVar);
            case 1:
                return new see((n0w) this.m, (n4u) obj2, this.k, this.l, yjeVar);
            case 2:
                return new see((vsl0) obj2, yjeVar);
            default:
                return new see((wfq0) obj2, this.k, this.l, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((see) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((see) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((see) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((see) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:128:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:40:0x0100 A[LOOP:6: B:38:0x00fa->B:40:0x0100, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0112  */
    /* JADX WARN: Code duplicated, block: B:44:0x0114  */
    /* JADX WARN: Code duplicated, block: B:48:0x012c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0142  */
    /* JADX WARN: Code duplicated, block: B:54:0x0159  */
    /* JADX WARN: Code duplicated, block: B:55:0x015b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0173  */
    /* JADX WARN: Code duplicated, block: B:66:0x0195 A[LOOP:2: B:64:0x018f->B:66:0x0195, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x01c9 A[LOOP:3: B:68:0x01c3->B:70:0x01c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x0227 A[LOOP:5: B:78:0x0200->B:81:0x0227, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x022c  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0279, code lost:
    
        if (r0 == r8) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02d2, code lost:
    
        if (r3.l(r1, r2, r22) == r8) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0268, code lost:
    
        if (r0 == r8) goto L101;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.see.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public see(a4x a4xVar, int i, xcz xczVar, int i2, yje yjeVar) {
        super(2, yjeVar);
        this.m = a4xVar;
        this.k = i;
        this.n = xczVar;
        this.l = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public see(vsl0 vsl0Var, yje yjeVar) {
        super(2, yjeVar);
        this.n = vsl0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public see(wfq0 wfq0Var, int i, int i2, yje yjeVar) {
        super(2, yjeVar);
        this.n = wfq0Var;
        this.k = i;
        this.l = i2;
    }
}
