package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wi90 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39204a;
    public final /* synthetic */ aj90 b;

    public /* synthetic */ wi90(aj90 aj90Var, byte b) {
        this.f39204a = b;
        this.b = aj90Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39204a;
        final byte b2 = 0;
        aj90 aj90Var = this.b;
        switch (b) {
            case 0:
                fl70 fl70Var = aj90.S1;
                i1w0 i1w0Var = aj90Var.H0().p;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 1:
                fiu0 fiu0Var = aj90Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                fl70 fl70Var2 = aj90.S1;
                final xj80 xj80Var = new xj80(1, aj90Var.H0(), kk90.class, "onItemClicked", "onItemClicked(Lorg/xplatform/personal/impl/presentation/personal/ui_model/PersonalDataItemType;)V", 0, (byte) 29);
                ti90 ti90Var = new ti90();
                final byte b3 = 1;
                gbn gbnVar = new gbn(new ch90((byte) 21), new iv60(3, (byte) 6), new Function1() { // from class: a.qi90
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b4 = b3;
                        xj80 xj80Var2 = xj80Var;
                        cp cpVar = (cp) obj;
                        switch (b4) {
                            case 0:
                                cpVar.getClass();
                                cpVar.t(new ri90(cpVar, xj80Var2, (byte) 0));
                                break;
                            default:
                                cpVar.getClass();
                                cpVar.t(new ri90(cpVar, xj80Var2, (byte) 2));
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, xk60.i);
                dp dpVar = ti90Var.d;
                dpVar.b(gbnVar);
                dpVar.b(new gbn(new ch90((byte) 22), new iv60(3, (byte) 7), new ev80((byte) 24), xk60.j));
                dpVar.b(new gbn(new ch90((byte) 20), new iv60(3, (byte) 5), new Function1() { // from class: a.qi90
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b4 = b2;
                        xj80 xj80Var2 = xj80Var;
                        cp cpVar = (cp) obj;
                        switch (b4) {
                            case 0:
                                cpVar.getClass();
                                cpVar.t(new ri90(cpVar, xj80Var2, (byte) 0));
                                break;
                            default:
                                cpVar.getClass();
                                cpVar.t(new ri90(cpVar, xj80Var2, (byte) 2));
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, xk60.h));
                dpVar.b(new gbn(new ch90((byte) 23), new iv60(3, (byte) 8), new ev80((byte) 25), xk60.k));
                return ti90Var;
        }
    }
}
