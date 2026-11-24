package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ghx implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11319a;
    public final /* synthetic */ lhx b;

    public /* synthetic */ ghx(lhx lhxVar, byte b) {
        this.f11319a = b;
        this.b = lhxVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f11319a;
        lhx lhxVar = this.b;
        switch (b) {
            case 0:
                g130 g130Var = (g130) obj;
                ihx ihxVar = lhx.Y1;
                g130Var.getClass();
                lhxVar.G0().x(new bhx(g130Var));
                break;
            case 1:
                wgl0 wgl0Var = (wgl0) obj;
                ihx ihxVar2 = lhx.Y1;
                wgl0Var.getClass();
                if (wgl0Var instanceof vgl0) {
                    lhxVar.G0().x(new bhx(new y030(((vgl0) wgl0Var).f37387a)));
                }
                break;
            default:
                xgl0 xgl0Var = (xgl0) obj;
                ihx ihxVar3 = lhx.Y1;
                xgl0Var.getClass();
                lhxVar.G0().x(new bhx(new z030(xgl0Var)));
                break;
        }
        return Unit.f46060a;
    }
}
