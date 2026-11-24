package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v6u0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36893a;
    public final /* synthetic */ y6u0 b;

    public /* synthetic */ v6u0(y6u0 y6u0Var, byte b) {
        this.f36893a = b;
        this.b = y6u0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f36893a;
        y6u0 y6u0Var = this.b;
        switch (b) {
            case 0:
                bzs0 bzs0Var = y6u0.R1;
                i1w0 i1w0Var = ((g7u0) y6u0Var.O1.getValue()).g;
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
                tyi tyiVar = y6u0Var.M1;
                if (tyiVar != null) {
                    return new q0h0(tyiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                bzs0 bzs0Var2 = y6u0.R1;
                las0 las0Var = new las0(1, (g7u0) y6u0Var.O1.getValue(), g7u0.class, "onVenueClick", "onVenueClick(Lorg/xplatform/special_event/impl/venues/presentation/adapters/VenueUiModel;)V", 0, (byte) 16);
                s6u0 s6u0Var = new s6u0();
                s6u0Var.d.b(new gbn(new b4u0((byte) 5), new d8q0(3, (byte) 19), new npt0(las0Var, (byte) 3), pfo0.B));
                return s6u0Var;
        }
    }
}
