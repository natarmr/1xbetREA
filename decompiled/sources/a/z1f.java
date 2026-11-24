package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z1f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43615a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ p2f c;
    public final /* synthetic */ pkk0 d;

    public /* synthetic */ z1f(p2f p2fVar, pkk0 pkk0Var, Function1 function1) {
        this.c = p2fVar;
        this.d = pkk0Var;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f43615a;
        t1f t1fVar = t1f.f33164a;
        pkk0 pkk0Var = this.d;
        p2f p2fVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                ((jly) obj).getClass();
                if (p2fVar.f26247a.length() == 0 && pkk0Var != null) {
                    ((r3k) pkk0Var).a();
                }
                function1.invoke(t1fVar);
                break;
            default:
                jtl jtlVar = (jtl) obj;
                jtlVar.getClass();
                if (Intrinsics.d(jtlVar, rk.t)) {
                    function1.invoke(w1f.f38395a);
                } else if (Intrinsics.d(jtlVar, rk.s)) {
                    if (p2fVar.i.f22376a.size() == 1 && pkk0Var != null) {
                        ((r3k) pkk0Var).a();
                    }
                    function1.invoke(t1fVar);
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ z1f(Function1 function1, p2f p2fVar, pkk0 pkk0Var) {
        this.b = function1;
        this.c = p2fVar;
        this.d = pkk0Var;
    }
}
