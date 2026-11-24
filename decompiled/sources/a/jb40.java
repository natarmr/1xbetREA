package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.impl.meta_heroes.presentation.dialog.MetaHeroesRoleModelParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jb40 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16222a;
    public final /* synthetic */ lb40 b;

    public /* synthetic */ jb40(lb40 lb40Var, byte b) {
        this.f16222a = b;
        this.b = lb40Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f16222a;
        lb40 lb40Var = this.b;
        switch (b) {
            case 0:
                xb40 xb40Var = (xb40) obj;
                htz htzVar = lb40.P1;
                xb40Var.getClass();
                lb40Var.G0().x(new za40(xb40Var));
                break;
            case 1:
                bb40 bb40Var = (bb40) obj;
                htz htzVar2 = lb40.P1;
                bb40Var.getClass();
                lb40Var.G0().x(bb40Var);
                break;
            default:
                pc40 pc40Var = (pc40) obj;
                htz htzVar3 = lb40.P1;
                pc40Var.getClass();
                String name = kc40.class.getName();
                if (lb40Var.C().J(name) == null) {
                    uuz uuzVar = kc40.l2;
                    MetaHeroesRoleModelParams metaHeroesRoleModelParams = pc40Var.f26740a;
                    uuzVar.getClass();
                    kc40 kc40Var = new kc40();
                    kc40Var.k2.J(kc40Var, kc40.m2[0], metaHeroesRoleModelParams);
                    kc40Var.H0(lb40Var.C(), name);
                }
                lb40Var.G0().x(ra40.f30116a);
                break;
        }
        return Unit.f46060a;
    }
}
