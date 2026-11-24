package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tv2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34578a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ vhv0 c;

    public /* synthetic */ tv2(pz40 pz40Var, vhv0 vhv0Var, byte b) {
        this.f34578a = b;
        this.b = pz40Var;
        this.c = vhv0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f34578a;
        vhv0 vhv0Var = this.c;
        pz40 pz40Var = this.b;
        vhv0 vhv0Var2 = (vhv0) obj;
        switch (b) {
            case 0:
                vhv0Var2.getClass();
                pz40Var.setValue(new ujo(vhv0Var, vhv0Var2));
                break;
            case 1:
                vhv0Var2.getClass();
                pz40Var.setValue(new ujo(vhv0Var, vhv0Var2));
                break;
            default:
                vhv0Var2.getClass();
                pz40Var.setValue(new ujo(vhv0Var, vhv0Var2));
                break;
        }
        return Unit.f46060a;
    }
}
