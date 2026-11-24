package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o6n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24745a;
    public final /* synthetic */ e2d b;

    public /* synthetic */ o6n(e2d e2dVar, byte b) {
        this.f24745a = b;
        this.b = e2dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yjj0 yjj0VarC;
        l7m0 l7m0Var;
        byte b = this.f24745a;
        e2d e2dVar = this.b;
        switch (b) {
            case 0:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.b(1.0f - e2dVar.f7077a.a());
                break;
            case 1:
                uag0 uag0Var2 = (uag0) obj;
                uag0Var2.getClass();
                uag0Var2.b(e2dVar.f7077a.a());
                break;
            case 2:
                uag0 uag0Var3 = (uag0) obj;
                uag0Var3.getClass();
                uag0Var3.b(1.0f - e2dVar.f7077a.a());
                break;
            case 3:
                float fFloatValue = ((Float) obj).floatValue();
                oyq0 oyq0Var = e2dVar.f7077a;
                oyq0Var.c(oyq0Var.c.l() + fFloatValue);
                break;
            case 4:
                uag0 uag0Var4 = (uag0) obj;
                uag0Var4.getClass();
                uag0Var4.g(true);
                if (e2dVar == null || (l7m0Var = (l7m0) e2dVar.f.getValue()) == null || ((Boolean) l7m0Var.getValue()).booleanValue()) {
                    yjj0VarC = jd8.n;
                } else {
                    zcl zclVar = qmk.f28987a;
                    yjj0VarC = vgg0.c(0.0f, 0.0f, 0.0f, 16.0f, 7);
                }
                uag0Var4.D(yjj0VarC);
                break;
            default:
                uag0 uag0Var5 = (uag0) obj;
                uag0Var5.getClass();
                zcl zclVar2 = qmk.f28987a;
                float fA = (1.0f - e2dVar.f7077a.a()) * 24.0f;
                uag0Var5.D(vgg0.c(fA, fA, 0.0f, 0.0f, 12));
                uag0Var5.g(true);
                break;
        }
        return Unit.f46060a;
    }
}
