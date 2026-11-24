package a;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.wallet.impl.presentation.dialogs.bonusaccountaction.models.BonusAccountUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class t0v0 extends bnn0 implements Function1 {
    public final /* synthetic */ u0v0 i;
    public final /* synthetic */ BonusAccountUiModel j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0v0(u0v0 u0v0Var, BonusAccountUiModel bonusAccountUiModel, yje yjeVar) {
        super(1, yjeVar);
        this.i = u0v0Var;
        this.j = bonusAccountUiModel;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new t0v0(this.i, this.j, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((t0v0) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        u0v0 u0v0Var = this.i;
        jyg0 jyg0Var = u0v0Var.F;
        i1w0 i1w0Var = u0v0Var.u;
        ot otVar = u0v0Var.E;
        ql5 ql5Var = ((j0v0) u0v0Var.D()).i;
        if (ql5Var != null) {
            long j = ql5Var.f28916a;
            BonusAccountUiModel bonusAccountUiModel = this.j;
            if (bonusAccountUiModel instanceof BonusAccountUiModel.Games) {
                bm5 bm5Var = bm5.d;
                otVar.a(bm5Var, ql5Var);
                jyg0Var.getClass();
                jyg0Var.f17359a.z(bm5Var, j);
                i1w0Var.d(new o0v0(u0v0Var, (byte) 1));
                k0w0 k0w0Var = new k0w0(i1w0Var);
                k0w0Var.h(oct.f(u0v0Var.p, 0L, null, 0, null, null, 27));
                ListIterator listIteratorO = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        break;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
            } else {
                if (!bonusAccountUiModel.equals(BonusAccountUiModel.Slots.f47316a)) {
                    t9f.b();
                    return null;
                }
                bm5 bm5Var2 = bm5.e;
                otVar.a(bm5Var2, ql5Var);
                jyg0Var.getClass();
                jyg0Var.f17359a.z(bm5Var2, j);
                i1w0Var.d(new o0v0(u0v0Var, (byte) 2));
                k0w0 k0w0Var2 = new k0w0(i1w0Var);
                k0w0Var2.h(u0v0Var.q.q(new hr1(0L, 3)));
                ListIterator listIteratorO2 = b1j.o(i1w0Var, k0w0Var2.f17489a, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorO2;
                    if (!pawVar2.hasNext()) {
                        break;
                    }
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
        return Unit.f46060a;
    }
}
