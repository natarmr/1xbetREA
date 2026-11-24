package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class da6 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5732a;
    public final /* synthetic */ e9q0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ da6(e9q0 e9q0Var, Function1 function1, byte b) {
        this.f5732a = b;
        this.b = e9q0Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f5732a;
        Function1 function1 = this.c;
        e9q0 e9q0Var = this.b;
        switch (b) {
            case 0:
                a9q0 a9q0Var = (a9q0) obj;
                if (e9q0Var != null) {
                    ((hgk0) e9q0Var.f7435a).setValue(a9q0Var);
                }
                if (function1 != null) {
                    function1.invoke(a9q0Var);
                }
                return Unit.f46060a;
            default:
                e9q0Var.c.add(function1);
                return new pr0(e9q0Var, function1, (byte) 22);
        }
    }
}
