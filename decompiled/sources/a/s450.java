package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class s450 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31590a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ tf40 c;

    public /* synthetic */ s450(Function1 function1, tf40 tf40Var, byte b) {
        this.f31590a = b;
        this.b = function1;
        this.c = tf40Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f31590a;
        tf40 tf40Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                st0 st0Var = (st0) obj;
                st0Var.getClass();
                long j = st0Var.f32750a;
                mtr mtrVar = st0Var.d;
                function1.invoke(new z350(j, mtrVar != null ? mtrVar.b : false, ((hf40) tf40Var).f12955a));
                break;
            default:
                st0 st0Var2 = (st0) obj;
                st0Var2.getClass();
                function1.invoke(new a450(st0Var2.f32750a, ((hf40) tf40Var).f12955a));
                break;
        }
        return Unit.f46060a;
    }
}
