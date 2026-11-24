package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class vf30 extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ wf30 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ long l;
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf30(wf30 wf30Var, boolean z, long j, int i, String str, yje yjeVar) {
        super(2, yjeVar);
        this.j = wf30Var;
        this.k = z;
        this.l = j;
        this.m = i;
        this.n = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new vf30(this.j, this.k, this.l, this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vf30) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0171  */
    /* JADX WARN: Code duplicated, block: B:103:0x0178  */
    /* JADX WARN: Code duplicated, block: B:105:0x017c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0181  */
    /* JADX WARN: Code duplicated, block: B:108:0x0185  */
    /* JADX WARN: Code duplicated, block: B:109:0x0188  */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01ca, code lost:
    
        if (r0 == r10) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if (r0 == r10) goto L123;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.ArrayList] */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vf30.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
