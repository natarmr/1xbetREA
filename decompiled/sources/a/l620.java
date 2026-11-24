package a;

import android.view.View;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l620 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19486a;
    public final /* synthetic */ a720 b;

    public /* synthetic */ l620(a720 a720Var, byte b) {
        this.f19486a = b;
        this.b = a720Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f19486a;
        byte b2 = 0;
        yje yjeVar = null;
        a720 a720Var = this.b;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                xuz xuzVar = a720.x2;
                mn20 mn20VarY0 = a720Var.Y0();
                x20 x20Var = mn20VarY0.G;
                String strJ = q8x.J(mn20VarY0.h);
                m0k0 m0k0Var = mn20VarY0.b;
                long j = m0k0Var.B;
                long j2 = m0k0Var.f20959a;
                mii0 mii0Var = mn20VarY0.F;
                if (j == 0) {
                    mii0Var.R(strJ, j2, zBooleanValue);
                    x20Var.r(strJ, (int) j2, zBooleanValue);
                } else {
                    mii0Var.S(zBooleanValue, strJ, j2, j);
                    x20Var.q((int) j2, (int) m0k0Var.B, strJ, zBooleanValue);
                }
                sac.V(jiu0.a(mn20VarY0), new r520((byte) 26), null, mn20VarY0.i.b, new ys8((Object) mn20VarY0, zBooleanValue, yjeVar, (byte) 20), 10);
                return Unit.f46060a;
            case 1:
                ((Boolean) obj).getClass();
                xuz xuzVar2 = a720.x2;
                mn20 mn20VarY1 = a720Var.Y0();
                sac.V(jiu0.a(mn20VarY1), new r520((byte) 25), null, mn20VarY1.i.b, new mt00((Object) mn20VarY1, yjeVar, (byte) 16), 10);
                return Unit.f46060a;
            case 2:
                xuz xuzVar3 = a720.x2;
                ((View) obj).getClass();
                p7m0 p7m0Var = ((ya20) a720Var.m2.getValue()).b;
                Boolean bool = Boolean.TRUE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                mn20 mn20VarY2 = a720Var.Y0();
                ((kt2) mn20VarY2.F.b).c("bet_place_settings");
                mn20VarY2.G.f40143a.a(xun.f41520a, 3174L);
                mn20VarY2.e.d(new km00(mn20VarY2, (byte) 22));
                return Unit.f46060a;
            case 3:
                xuz xuzVar4 = a720.x2;
                ((View) obj).getClass();
                i1w0 i1w0Var = a720Var.Y0().e;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 4:
                xuz xuzVar5 = a720.x2;
                ((View) obj).getClass();
                i1w0 i1w0Var2 = a720Var.Y0().e;
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                ListIterator listIteratorP2 = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, o0w0.f24450a)), i1w0Var2, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP2;
                    if (!pawVar2.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var2.a((oe50) pawVar2.next());
                }
                break;
            default:
                xuz xuzVar6 = a720.x2;
                ((View) obj).getClass();
                mn20 mn20VarY3 = a720Var.Y0();
                sac.V(jiu0.a(mn20VarY3), hl20.f13236a, null, mn20VarY3.i.f22085a, new il20(mn20VarY3, yjeVar, b2), 10);
                ol60 ol60Var = mn20VarY3.Y;
                Unit unit = Unit.f46060a;
                ol60Var.f(unit);
                return unit;
        }
    }
}
