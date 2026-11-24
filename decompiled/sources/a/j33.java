package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class j33 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 2;
    public byte j;
    public boolean k;
    public /* synthetic */ long l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j33(long j, j7g j7gVar, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.l = j;
        this.m = j7gVar;
        this.k = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                return new j33(this.k, (k33) obj2, this.l, yjeVar);
            case 1:
                return new j33((g85) obj2, this.k, this.l, yjeVar);
            case 2:
                return new j33(this.l, (j7g) obj2, this.k, yjeVar);
            case 3:
                j33 j33Var = new j33((on20) obj2, yjeVar);
                j33Var.l = ((Number) obj).longValue();
                return j33Var;
            default:
                return new j33((rv80) obj2, this.l, this.k, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((j33) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((j33) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((j33) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((j33) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((j33) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0251  */
    /* JADX WARN: Code duplicated, block: B:128:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:? A[LOOP:1: B:27:0x00c7->B:129:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x008b  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00df  */
    /* JADX WARN: Code duplicated, block: B:95:0x0239  */
    /* JADX WARN: Code duplicated, block: B:96:0x023c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0240  */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x025b, code lost:
    
        if (r1.I(r0, 0, "", r20) == r10) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x029a, code lost:
    
        if (r0 == r9) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02af, code lost:
    
        if (r0 == r9) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:?, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b8, code lost:
    
        if (r0.N0(r7, r2, r20, r5) == r12) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0109, code lost:
    
        if (r0.I(r8, r2, r1, r20) == r12) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0154, code lost:
    
        if (r5.Q0(r6, r20) == r9) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ae, code lost:
    
        if (kotlin.Unit.f46060a == r1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01de, code lost:
    
        if (kotlin.Unit.f46060a == r1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x024e, code lost:
    
        if (r1.N0(0, r2, r20, "") == r10) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j33.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j33(g85 g85Var, boolean z, long j, yje yjeVar) {
        super(2, yjeVar);
        this.m = g85Var;
        this.k = z;
        this.l = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j33(on20 on20Var, yje yjeVar) {
        super(2, yjeVar);
        this.m = on20Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j33(rv80 rv80Var, long j, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.m = rv80Var;
        this.l = j;
        this.k = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j33(boolean z, k33 k33Var, long j, yje yjeVar) {
        super(2, yjeVar);
        this.k = z;
        this.m = k33Var;
        this.l = j;
    }
}
