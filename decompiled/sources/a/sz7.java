package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sz7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33057a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ l7m0 c;

    public /* synthetic */ sz7(l7m0 l7m0Var, l7m0 l7m0Var2, byte b) {
        this.f33057a = b;
        this.b = l7m0Var;
        this.c = l7m0Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f33057a;
        l7m0 l7m0Var = this.c;
        l7m0 l7m0Var2 = this.b;
        switch (b) {
            case 0:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.b((1.0f - ((Number) l7m0Var.getValue()).floatValue()) * (1.0f - ((Number) l7m0Var2.getValue()).floatValue()));
                break;
            case 1:
                uag0 uag0Var2 = (uag0) obj;
                uag0Var2.getClass();
                uag0Var2.b((1.0f - ((Number) l7m0Var.getValue()).floatValue()) * ((Number) l7m0Var2.getValue()).floatValue());
                break;
            default:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                float fW0 = fhlVar.w0(yom.d);
                fhl.E(fhlVar, ((y3d) l7m0Var2.getValue()).f41946a, fhlVar.w0(yom.c / 2.0f) - (fW0 / 2.0f), 0L, 0.0f, new vtm0(fW0, 0.0f, 0, 0, null, 30), 108);
                float f = ((ycl) l7m0Var.getValue()).f42389a;
                zcl zclVar = qmk.f28987a;
                if (ycl.a(f, 0.0f) > 0) {
                    fhl.E(fhlVar, ((y3d) l7m0Var2.getValue()).f41946a, fhlVar.w0(((ycl) l7m0Var.getValue()).f42389a), 0L, 0.0f, l0q.f19214a, 108);
                }
                break;
        }
        return Unit.f46060a;
    }
}
