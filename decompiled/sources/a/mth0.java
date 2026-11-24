package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class mth0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22371a;
    public final /* synthetic */ gwg0 b;
    public final /* synthetic */ cp c;

    public /* synthetic */ mth0(gwg0 gwg0Var, cp cpVar, byte b) {
        this.f22371a = b;
        this.b = gwg0Var;
        this.c = cpVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22371a;
        cp cpVar = this.c;
        gwg0 gwg0Var = this.b;
        switch (b) {
            case 0:
                ((Boolean) obj2).getClass();
                gwg0Var.invoke(cpVar.u());
                break;
            default:
                ((Boolean) obj2).getClass();
                gwg0Var.invoke(cpVar.u());
                break;
        }
        return Unit.f46060a;
    }
}
