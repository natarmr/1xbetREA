package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class dpl0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6474a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ dpl0(Function1 function1, byte b) {
        this.f6474a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f6474a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                function1.invoke(new pol0(ebc.n0(bemVar)));
                break;
            case 1:
                bem bemVar2 = (bem) obj;
                bemVar2.getClass();
                function1.invoke(new pol0(ebc.n0(bemVar2)));
                break;
            case 2:
                bem bemVar3 = (bem) obj;
                bemVar3.getClass();
                function1.invoke(new z5r0(bemVar3));
                break;
            case 3:
                bem bemVar4 = (bem) obj;
                bemVar4.getClass();
                function1.invoke(new z5r0(bemVar4));
                break;
            case 4:
                wy30 wy30Var = (wy30) obj;
                wy30Var.getClass();
                function1.invoke(new pu30(wy30Var));
                break;
            case 5:
                o37 o37Var = (o37) obj;
                o37Var.getClass();
                if (o37Var instanceof e27) {
                    String str = ((e27) o37Var).f7071a;
                    str.getClass();
                    function1.invoke(new ui7(str));
                } else if (o37Var instanceof f27) {
                    String str2 = ((f27) o37Var).f8798a;
                    str2.getClass();
                    function1.invoke(new yi7(str2));
                } else if (o37Var instanceof h27) {
                    String str3 = ((h27) o37Var).f12318a;
                    str3.getClass();
                    function1.invoke(new zi7(str3));
                } else if (o37Var instanceof g27) {
                    String str4 = ((g27) o37Var).f10549a;
                    str4.getClass();
                    function1.invoke(new hj7(str4));
                } else if (o37Var instanceof r27) {
                    function1.invoke(ri7.f30526a);
                } else if (o37Var instanceof t27) {
                    t27 t27Var = (t27) o37Var;
                    function1.invoke(new vi7(t27Var.f33202a, t27Var.b));
                }
                break;
            case 6:
                wy30 wy30Var2 = (wy30) obj;
                wy30Var2.getClass();
                function1.invoke(new pu30(wy30Var2));
                break;
            case 7:
                bem bemVar5 = (bem) obj;
                bemVar5.getClass();
                function1.invoke(new vyo0(bemVar5));
                break;
            case 8:
                bem bemVar6 = (bem) obj;
                bemVar6.getClass();
                function1.invoke(new vyo0(bemVar6));
                break;
            case 9:
                function1.invoke(new k8p0(((Number) obj).longValue()));
                break;
            case 10:
                chq0 chq0Var = (chq0) obj;
                chq0Var.getClass();
                function1.invoke(chq0Var);
                break;
            case 11:
                bem bemVar7 = (bem) obj;
                bemVar7.getClass();
                function1.invoke(new zjb0(bemVar7));
                break;
            case 12:
                bem bemVar8 = (bem) obj;
                bemVar8.getClass();
                function1.invoke(new zjb0(bemVar8));
                break;
            case 13:
                j6z j6zVar = (j6z) obj;
                j6zVar.getClass();
                function1.invoke(new ekb0(new tkb0(uzb.E0(j6zVar, 0.0f, (15 & 2) != 0 ? 0.0f : 0.0f, 0.0f, (15 & 8) != 0 ? 0.0f : 0.0f, 16))));
                break;
            default:
                function1.invoke(new j8u0(((Number) obj).intValue()));
                break;
        }
        return Unit.f46060a;
    }
}
