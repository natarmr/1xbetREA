package a;

import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class mys0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22618a;
    public final qgd b;

    public /* synthetic */ mys0(qgd qgdVar, byte b) {
        this.f22618a = b;
        this.b = qgdVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f22618a;
        qgd qgdVar = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                g45 g45Var = (g45) qgdVar.b;
                qlc qlcVarK = ydx.K((h950) g45Var.b, iIntValue);
                boolean z = qlcVarK.c;
                f6i f6iVar = (f6i) g45Var.f10647a;
                if (!z) {
                    return obb.W((ym40) f6iVar.f, qlcVarK);
                }
                nlc nlcVar = (nlc) f6iVar.d;
                Set set = nlc.c;
                return nlcVar.a(qlcVarK, null);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                g45 g45Var2 = (g45) qgdVar.b;
                qlc qlcVarK2 = ydx.K((h950) g45Var2.b, iIntValue2);
                if (qlcVarK2.c) {
                    return null;
                }
                ym40 ym40Var = (ym40) ((f6i) g45Var2.f10647a).f;
                ym40Var.getClass();
                foc focVarW = obb.W(ym40Var, qlcVarK2);
                if (focVarW instanceof tfk) {
                    return (tfk) focVarW;
                }
                return null;
            default:
                a4d0 a4d0Var = (a4d0) obj;
                a4d0Var.getClass();
                return m8x.c0(a4d0Var, (roi0) ((g45) qgdVar.b).d);
        }
    }
}
