package a;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rr implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30956a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rr(Object obj, long j, long j2, Object obj2, byte b) {
        this.f30956a = b;
        this.d = obj;
        this.b = j;
        this.c = j2;
        this.e = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f30956a;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                xvs xvsVar = (xvs) obj;
                m0o0 m0o0Var = (m0o0) ((xr) obj2).f41344a;
                xvsVar.getClass();
                k8p k8pVar = new k8p(this.b, this.c, 0L, "", "", 0L, xvsVar);
                abp abpVar = m0o0Var.b;
                abpVar.getClass();
                p7m0 p7m0Var = abpVar.b;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, new iap(CollectionsKt.r0(abp.e((kap) value), k8pVar))));
                break;
            default:
                c810 c810Var = (c810) obj2;
                c810Var.Q0().f402a = false;
                c810Var.Q0().b = this.b;
                c810Var.Q0().c = this.c;
                Function1 function1E = ((ru90) obj).f31116a.e();
                if (function1E != null) {
                    function1E.invoke(c810Var.Q0());
                }
                break;
        }
        return Unit.f46060a;
    }
}
