package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fyv implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10378a;
    public final /* synthetic */ jyv b;

    public /* synthetic */ fyv(jyv jyvVar, byte b) {
        this.f10378a = b;
        this.b = jyvVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f10378a;
        jyv jyvVar = this.b;
        switch (b) {
            case 0:
                gst gstVar = jyv.R1;
                i1w0 i1w0Var = jyvVar.H0().f;
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
                fiu0 fiu0Var = jyvVar.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                gst gstVar2 = jyv.R1;
                return new eyv(new vft(1, jyvVar.H0(), vyv.class, "onItemClicked", "onItemClicked(Lorg/xplatform/bethistory/filter/presentation/model/AggregatorHistoryFilterItemUiModel;)V", 0, (byte) 17));
            default:
                gst gstVar3 = jyv.R1;
                return new eyv(new vft(1, jyvVar.H0(), vyv.class, "onItemClicked", "onItemClicked(Lorg/xplatform/bethistory/filter/presentation/model/AggregatorHistoryFilterItemUiModel;)V", 0, (byte) 16));
        }
    }
}
