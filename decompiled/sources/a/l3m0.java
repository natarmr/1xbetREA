package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l3m0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19364a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ b110 c;

    public /* synthetic */ l3m0(mm40 mm40Var, b110 b110Var) {
        this.b = mm40Var;
        this.c = b110Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19364a;
        b110 b110Var = this.c;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nnw0.g(this.b, null, false, u1c.M(-1337280326, new un6(b110Var, (byte) 3), fetVar), fetVar, 3072, 6);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                r3m0.h(this.b, b110Var, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ l3m0(mm40 mm40Var, b110 b110Var, int i) {
        this.b = mm40Var;
        this.c = b110Var;
    }
}
