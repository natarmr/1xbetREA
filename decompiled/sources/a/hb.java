package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hb implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12748a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ vhj0 c;

    public /* synthetic */ hb(vhj0 vhj0Var, Function1 function1, int i) {
        this.c = vhj0Var;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f12748a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                wb.z(x8x.L(1), fetVar, this.c, this.b);
                break;
            default:
                dwi0.i(x8x.L(1), fetVar, this.c, this.b);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ hb(Function1 function1, vhj0 vhj0Var, int i) {
        this.b = function1;
        this.c = vhj0Var;
    }
}
