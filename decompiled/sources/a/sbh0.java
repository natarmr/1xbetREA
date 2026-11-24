package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sbh0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31934a;
    public final /* synthetic */ ugd b;
    public final /* synthetic */ int c;
    public final /* synthetic */ pz40 d;

    public /* synthetic */ sbh0(ugd ugdVar, int i, pz40 pz40Var, byte b) {
        this.f31934a = b;
        this.b = ugdVar;
        this.c = i;
        this.d = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31934a;
        pz40 pz40Var = this.d;
        int i = this.c;
        ugd ugdVar = this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ugdVar.j(Integer.valueOf(i), pz40Var, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ugdVar.j(Integer.valueOf(i), pz40Var, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ugdVar.j(Integer.valueOf(i), pz40Var, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
