package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class zvu extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public boolean j;
    public boolean k;
    public int l;
    public byte m;
    public List n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvu(a6u a6uVar, int i, Integer num, jvn jvnVar, boolean z, boolean z2, yje yjeVar) {
        super(2, yjeVar);
        this.o = a6uVar;
        this.l = i;
        this.p = num;
        this.q = jvnVar;
        this.j = z;
        this.k = z2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        switch (b) {
            case 0:
                return new zvu((a6u) obj4, this.l, (Integer) obj3, (jvn) obj2, this.j, this.k, yjeVar);
            default:
                return new zvu(this.n, (t33) obj4, (t33) obj3, (pz40) obj2, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((zvu) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((zvu) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x014b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0152  */
    /* JADX WARN: Code duplicated, block: B:63:0x0162  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        if (a.d5c.J(r25, r4) == r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        r1 = r0;
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        if (r1.f(r25, r7) == r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e0, code lost:
    
        if (a.t33.a((a.t33) r9, r4, r6, null, null, r25, 12) == r11) goto L38;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zvu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvu(List list, t33 t33Var, t33 t33Var2, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.n = list;
        this.o = t33Var;
        this.p = t33Var2;
        this.q = pz40Var;
    }
}
