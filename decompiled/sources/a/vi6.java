package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vi6 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37462a;
    public final /* synthetic */ i3t0 b;

    public /* synthetic */ vi6(i3t0 i3t0Var, byte b) {
        this.f37462a = b;
        this.b = i3t0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f37462a;
        i3t0 i3t0Var = this.b;
        switch (b) {
            case 0:
                qi6 qi6Var = (qi6) obj;
                qi6Var.getClass();
                i3t0Var.x(qi6Var);
                return Unit.f46060a;
            case 1:
                g130 g130Var = (g130) obj;
                g130Var.getClass();
                i3t0Var.x(new a6b(g130Var));
                return Unit.f46060a;
            case 2:
                d6b d6bVar = (d6b) obj;
                d6bVar.getClass();
                i3t0Var.x(d6bVar);
                return Unit.f46060a;
            case 3:
                ((lwk) obj).getClass();
                i3t0Var.x(cig.f4412a);
                return new ty2(i3t0Var, (byte) 10);
            case 4:
                i3t0Var.x(new m6h(((Long) obj).longValue()));
                return Unit.f46060a;
            case 5:
                uid uidVar = (uid) obj;
                uidVar.getClass();
                i3t0Var.x(new obh(uidVar));
                return Unit.f46060a;
            case 6:
                yhw yhwVar = (yhw) obj;
                yhwVar.getClass();
                i3t0Var.x(yhwVar);
                return Unit.f46060a;
            case 7:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                i3t0Var.x(new ehw(bemVar));
                return Unit.f46060a;
            case 8:
                i3t0Var.x((thv) obj);
                return Unit.f46060a;
            case 9:
                az20 az20Var = (az20) obj;
                az20Var.getClass();
                i3t0Var.x(az20Var);
                return Unit.f46060a;
            case 10:
                g130 g130Var2 = (g130) obj;
                g130Var2.getClass();
                i3t0Var.x(new l6a0(g130Var2));
                return Unit.f46060a;
            case 11:
                wgl0 wgl0Var = (wgl0) obj;
                wgl0Var.getClass();
                if (wgl0Var instanceof vgl0) {
                    i3t0Var.x(new rcn(new y030(((vgl0) wgl0Var).f37387a)));
                }
                return Unit.f46060a;
            case 12:
                q7f0 q7f0Var = (q7f0) obj;
                q7f0Var.getClass();
                i3t0Var.x(new t7f0(q7f0Var));
                return Unit.f46060a;
            case 13:
                prk0 prk0Var = (prk0) obj;
                prk0Var.getClass();
                i3t0Var.x(prk0Var);
                return Unit.f46060a;
            default:
                prk0 prk0Var2 = (prk0) obj;
                prk0Var2.getClass();
                i3t0Var.x(prk0Var2);
                return Unit.f46060a;
        }
    }
}
