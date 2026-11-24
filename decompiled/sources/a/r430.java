package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r430 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29817a;
    public final /* synthetic */ w430 b;

    public /* synthetic */ r430(w430 w430Var, byte b) {
        this.f29817a = b;
        this.b = w430Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f29817a;
        w430 w430Var = this.b;
        switch (b) {
            case 0:
                g130 g130Var = (g130) obj;
                u430 u430Var = w430.Y1;
                g130Var.getClass();
                w430Var.G0().x(new jy20(g130Var));
                break;
            case 1:
                wgl0 wgl0Var = (wgl0) obj;
                u430 u430Var2 = w430.Y1;
                wgl0Var.getClass();
                if (wgl0Var instanceof vgl0) {
                    w430Var.G0().x(new jy20(new y030(((vgl0) wgl0Var).f37387a)));
                }
                break;
            default:
                xgl0 xgl0Var = (xgl0) obj;
                u430 u430Var3 = w430.Y1;
                xgl0Var.getClass();
                w430Var.G0().x(new jy20(new z030(xgl0Var)));
                break;
        }
        return Unit.f46060a;
    }
}
