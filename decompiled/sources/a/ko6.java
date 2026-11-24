package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ko6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ po6 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ko6(po6 po6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = po6Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        po6 po6Var = this.j;
        switch (b) {
            case 0:
                return new ko6(po6Var, yjeVar, (byte) 0);
            case 1:
                return new ko6(po6Var, yjeVar, (byte) 1);
            case 2:
                return new ko6(po6Var, yjeVar, (byte) 2);
            default:
                return new ko6(po6Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((ko6) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        boolean z = false;
        po6 po6Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ol60 ol60Var = po6Var.V;
                boolean z2 = po6Var.J.c(j820.e) != ua20.MEDIUM_NO_GAME_INFO;
                if (!po6Var.u.j() && ((sff0) po6Var.K.getValue()).l.g) {
                    z = true;
                }
                ol60Var.f(new zu7(z2, z));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                po6Var.V.f(bv7.f3266a);
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                po6Var.V.f(av7.f1512a);
                break;
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                po6Var.L = !po6Var.L;
                ArrayList arrayListA = po6Var.f.a();
                ArrayList arrayListL = o050.L(arrayListA, arrayListA, po6Var.r.f37705a.a(), po6Var.n.d(), false, po6Var.B);
                if (arrayListL.isEmpty() && po6Var.N) {
                    z = true;
                }
                p7m0 p7m0Var = po6Var.R;
                yv7 yv7Var = new yv7(CollectionsKt.q0(po6Var.x(), arrayListL), z);
                p7m0Var.getClass();
                p7m0Var.o(null, yv7Var);
                break;
        }
        return Unit.f46060a;
    }
}
