package a;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class k700 extends bnn0 implements Function2 {
    public List i;
    public byte j;
    public final /* synthetic */ w5z k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ j700 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Set o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k700(w5z w5zVar, boolean z, j700 j700Var, int i, Set set, yje yjeVar) {
        super(2, yjeVar);
        this.k = w5zVar;
        this.l = z;
        this.m = j700Var;
        this.n = i;
        this.o = set;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new k700(this.k, this.l, this.m, this.n, this.o, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k700) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00dd, code lost:
    
        if (r0 == r3) goto L27;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.k700.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
