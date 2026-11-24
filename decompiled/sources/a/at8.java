package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class at8 extends zzf0 implements Function2 {
    public dpa0 j;
    public int k;
    public float l;
    public byte m;
    public /* synthetic */ Object n;
    public final /* synthetic */ vb8 o;
    public final /* synthetic */ float p;
    public final /* synthetic */ d38 q;
    public final /* synthetic */ j6u0 r;
    public final /* synthetic */ xs8 s;
    public final /* synthetic */ igm t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at8(vb8 vb8Var, float f, d38 d38Var, j6u0 j6u0Var, xs8 xs8Var, igm igmVar, yje yjeVar) {
        super(2, yjeVar);
        this.o = vb8Var;
        this.p = f;
        this.q = d38Var;
        this.r = j6u0Var;
        this.s = xs8Var;
        this.t = igmVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        at8 at8Var = new at8(this.o, this.p, this.q, this.r, this.s, this.t, yjeVar);
        at8Var.n = obj;
        return at8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((at8) create((inn0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x018d  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r3 == r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        if (r14 == r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0135, code lost:
    
        if (r6 == r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0137, code lost:
    
        return r2;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0064 -> B:19:0x0068). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0135 -> B:50:0x0138). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.at8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
