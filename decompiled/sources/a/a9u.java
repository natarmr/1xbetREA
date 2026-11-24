package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class a9u extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public long j;
    public int k;
    public boolean l;
    public byte m;
    public Object n;
    public Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9u(ali aliVar, boolean z, int i, List list, jvn jvnVar, long j, yje yjeVar) {
        super(2, yjeVar);
        this.n = aliVar;
        this.l = z;
        this.k = i;
        this.o = list;
        this.p = jvnVar;
        this.j = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                return new a9u((ali) this.n, this.l, this.k, (List) this.o, (jvn) obj2, this.j, yjeVar);
            default:
                return new a9u((qg20) obj2, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((a9u) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((a9u) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:44:0x010c  */
    /* JADX WARN: Code duplicated, block: B:45:0x010f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Code duplicated, block: B:55:0x013f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0146  */
    /* JADX WARN: Code duplicated, block: B:59:0x0154  */
    /* JADX WARN: Code duplicated, block: B:60:0x0157  */
    /* JADX WARN: Code duplicated, block: B:63:0x0165  */
    /* JADX WARN: Code duplicated, block: B:64:0x016b  */
    /* JADX WARN: Code duplicated, block: B:67:0x017a  */
    /* JADX WARN: Code duplicated, block: B:68:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0181  */
    /* JADX WARN: Code duplicated, block: B:71:0x0184  */
    /* JADX WARN: Code duplicated, block: B:74:0x0192  */
    /* JADX WARN: Code duplicated, block: B:77:0x0199  */
    /* JADX WARN: Code duplicated, block: B:79:0x019d  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ee A[LOOP:0: B:53:0x0136->B:89:0x01ee, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0258, code lost:
    
        if (r0 == r13) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0295, code lost:
    
        if (r0 == r13) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ea, code lost:
    
        if (r4.k0(r7, r44, r2) == r6) goto L88;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r45) {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a9u.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9u(qg20 qg20Var, yje yjeVar) {
        super(2, yjeVar);
        this.p = qg20Var;
    }
}
