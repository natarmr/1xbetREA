package a;

import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class v1t0 extends bnn0 implements Function2 {
    public Throwable i;
    public byte j;
    public final /* synthetic */ o0x k;
    public final /* synthetic */ Context l;
    public final /* synthetic */ w6k m;
    public final /* synthetic */ float n;
    public final /* synthetic */ LinkedHashMap o;
    public final /* synthetic */ int p;
    public final /* synthetic */ kie0 q;
    public final /* synthetic */ a4x r;
    public final /* synthetic */ pz40 s;
    public final /* synthetic */ pz40 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1t0(o0x o0xVar, Context context, w6k w6kVar, float f, LinkedHashMap linkedHashMap, int i, kie0 kie0Var, a4x a4xVar, pz40 pz40Var, pz40 pz40Var2, yje yjeVar) {
        super(2, yjeVar);
        this.k = o0xVar;
        this.l = context;
        this.m = w6kVar;
        this.n = f;
        this.o = linkedHashMap;
        this.p = i;
        this.q = kie0Var;
        this.r = a4xVar;
        this.s = pz40Var;
        this.t = pz40Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new v1t0(this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v1t0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f4, code lost:
    
        if (a.qjj.d0(r0, r5, r16) == r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0114, code lost:
    
        if (a.qjj.d0(r0, r5, r16) == r3) goto L61;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.v1t0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
