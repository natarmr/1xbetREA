package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g6v0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10787a;
    public final /* synthetic */ l6v0 b;

    public /* synthetic */ g6v0(l6v0 l6v0Var, byte b) {
        this.f10787a = b;
        this.b = l6v0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f10787a;
        l6v0 l6v0Var = this.b;
        switch (b) {
            case 0:
                sxs0 sxs0Var = l6v0.P1;
                i1w0 i1w0VarF = a4n0.f(l6v0Var);
                mzi mziVar = l6v0Var.M1;
                if (mziVar != null) {
                    return new ry3(i1w0VarF, mziVar);
                }
                Intrinsics.h("weeklyRewardViewModelFactory");
                throw null;
            case 1:
                sxs0 sxs0Var2 = l6v0.P1;
                l6v0Var.H0().x();
                return Unit.f46060a;
            default:
                sxs0 sxs0Var3 = l6v0.P1;
                d7v0 d7v0VarH0 = l6v0Var.H0();
                long jA = s470.LUCKY_WHEEL.a();
                sac.V(jiu0.a(d7v0VarH0), new q6v0(d7v0VarH0, (byte) 1), null, d7v0VarH0.e.b, new wn10(d7v0VarH0, jA, null, (byte) 24), 10);
                i1w0 i1w0Var = d7v0VarH0.b;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                FragmentScreen fragmentScreenE = d7v0VarH0.d.f35560a.e();
                if (fragmentScreenE instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenE)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenE)));
                }
                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
        }
    }
}
