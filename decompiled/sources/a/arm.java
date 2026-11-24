package a;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class arm extends bnn0 implements Function2 {
    public rhv0 i;
    public float j;
    public long k;
    public int l;
    public byte m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Context o;
    public final /* synthetic */ brm p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arm(Context context, brm brmVar, yje yjeVar) {
        super(2, yjeVar);
        this.o = context;
        this.p = brmVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        arm armVar = new arm(this.o, this.p, yjeVar);
        armVar.n = obj;
        return armVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((arm) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009b  */
    /* JADX WARN: Code duplicated, block: B:64:0x014f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012d, code lost:
    
        if (r8.f(r16, r4) == r9) goto L56;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x012d -> B:8:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x014d -> B:50:0x0130). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.arm.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
