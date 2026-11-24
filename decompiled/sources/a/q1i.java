package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q1i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27954a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ o4i c;

    public /* synthetic */ q1i(mm40 mm40Var, o4i o4iVar, int i, byte b) {
        this.f27954a = b;
        this.b = mm40Var;
        this.c = o4iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27954a;
        o4i o4iVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                vzb.t(mm40Var, o4iVar, fetVar, x8x.L(1));
                break;
            default:
                vzb.u(mm40Var, o4iVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
