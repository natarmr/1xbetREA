package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i4b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14139a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ rs20 c;

    public /* synthetic */ i4b(Function1 function1, rs20 rs20Var, byte b) {
        this.f14139a = b;
        this.b = function1;
        this.c = rs20Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f14139a;
        rs20 rs20Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                fxb.D(ivb0.b, new i4b(function1, rs20Var, (byte) 1)).a();
                break;
            default:
                function1.invoke(new uy20(rs20Var.a()));
                break;
        }
        return Unit.f46060a;
    }
}
