package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uv2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36326a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ ugd d;

    public /* synthetic */ uv2(pz40 pz40Var, ugd ugdVar, ugd ugdVar2, byte b) {
        this.f36326a = b;
        this.b = pz40Var;
        this.c = ugdVar;
        this.d = ugdVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f36326a;
        ugd ugdVar = this.d;
        ugd ugdVar2 = this.c;
        pz40 pz40Var = this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    kc5.K(pz40Var, ugdVar2, ugdVar, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j47.I(pz40Var, ugdVar2, ugdVar, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
