package a;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class c9n extends bnn0 implements Function2 {
    public rhv0 i;
    public float j;
    public int k;
    public int l;
    public long m;
    public byte n;
    public /* synthetic */ Object o;
    public final /* synthetic */ Context p;
    public final /* synthetic */ d9n q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9n(Context context, d9n d9nVar, yje yjeVar) {
        super(2, yjeVar);
        this.p = context;
        this.q = d9nVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        c9n c9nVar = new c9n(this.p, this.q, yjeVar);
        c9nVar.o = obj;
        return c9nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c9n) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x0184 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014f, code lost:
    
        if (r8.f(r22, r6) == r9) goto L59;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0152 -> B:53:0x0157). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0181 -> B:7:0x0026). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.c9n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
