package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class hsb0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13573a;
    public final String b;
    public final String c;

    public /* synthetic */ hsb0(String str, String str2, byte b) {
        this.f13573a = b;
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f13573a;
        String str = this.c;
        String str2 = this.b;
        euj0 euj0Var = (euj0) obj;
        switch (b) {
            case 0:
                euj0Var.getClass();
                iay iayVar = jsb0.b;
                euj0Var.a(str2, iayVar);
                iay iayVar2 = jsb0.f17044a;
                euj0Var.a(str, iayVar, iayVar, iayVar2, iayVar2);
                euj0Var.c(str2, iayVar2);
                break;
            case 1:
                euj0Var.getClass();
                iay iayVar3 = jsb0.b;
                euj0Var.a(str2, iayVar3);
                euj0Var.a(str, iayVar3, iayVar3, iayVar3);
                euj0Var.c(str2, iayVar3);
                break;
            case 2:
                euj0Var.getClass();
                iay iayVar4 = jsb0.b;
                euj0Var.a(str2, iayVar4);
                iay iayVar5 = jsb0.c;
                iay iayVar6 = jsb0.f17044a;
                euj0Var.a(str, iayVar4, iayVar4, iayVar5, iayVar6);
                euj0Var.c(str2, iayVar6);
                break;
            case 3:
                euj0Var.getClass();
                iay iayVar7 = jsb0.b;
                euj0Var.a(str2, iayVar7);
                iay iayVar8 = jsb0.c;
                euj0Var.a(str2, iayVar8);
                iay iayVar9 = jsb0.f17044a;
                euj0Var.a(str, iayVar7, iayVar8, iayVar8, iayVar9);
                euj0Var.c(str2, iayVar9);
                break;
            case 4:
                euj0Var.getClass();
                iay iayVar10 = jsb0.c;
                euj0Var.a(str2, iayVar10);
                euj0Var.c(str, jsb0.b, iayVar10);
                nag0 nag0Var = nag0.f23190a;
                break;
            default:
                euj0Var.getClass();
                euj0Var.a(str2, jsb0.f17044a);
                euj0Var.c(str, jsb0.b, jsb0.c);
                nag0 nag0Var2 = nag0.f23190a;
                break;
        }
        return Unit.f46060a;
    }
}
