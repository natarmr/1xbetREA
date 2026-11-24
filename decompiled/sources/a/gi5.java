package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gi5 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11328a;
    public final /* synthetic */ ii5 b;

    public /* synthetic */ gi5(ii5 ii5Var, byte b) {
        this.f11328a = b;
        this.b = ii5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f11328a;
        ii5 ii5Var = this.b;
        switch (b) {
            case 0:
                return ii5.G0(ii5Var);
            case 1:
                gfk0 gfk0Var = ii5.O1;
                return new fk5(new b33((Object) ii5Var, (byte) 21), new gi5(ii5Var, (byte) 2));
            default:
                gfk0 gfk0Var2 = ii5.O1;
                ii5Var.J0().F(ii5Var.I0().C().d);
                return Unit.f46060a;
        }
    }
}
