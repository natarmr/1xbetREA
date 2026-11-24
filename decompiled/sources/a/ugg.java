package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ugg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35623a;
    public final /* synthetic */ vgg b;

    public /* synthetic */ ugg(vgg vggVar, byte b) {
        this.f35623a = b;
        this.b = vggVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f35623a;
        vgg vggVar = this.b;
        switch (b) {
            case 0:
                hhq0 hhq0Var = (hhq0) obj;
                qud qudVar = vgg.Q1;
                hhq0Var.getClass();
                ((aig) vggVar.O1.getValue()).x(new qhg(hhq0Var));
                return Unit.f46060a;
            default:
                vhg vhgVar = (vhg) obj;
                qud qudVar2 = vgg.Q1;
                vhgVar.getClass();
                if (vhgVar.equals(thg.f33960a)) {
                    j120.Y(vggVar);
                } else {
                    if (!(vhgVar instanceof uhg)) {
                        t9f.b();
                        return null;
                    }
                    j120.P(vggVar, new kk0(vggVar, djg.class.getName(), ((uhg) vhgVar).f35676a));
                }
                ((aig) vggVar.O1.getValue()).x(ehg.f7807a);
                return Unit.f46060a;
        }
    }
}
