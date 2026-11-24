package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l1b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19242a;
    public final /* synthetic */ h2b b;

    public /* synthetic */ l1b(h2b h2bVar, byte b) {
        this.f19242a = b;
        this.b = h2bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f19242a;
        h2b h2bVar = this.b;
        switch (b) {
            case 0:
                h2bVar.c.q(new bb50(false), true);
                i1w0 i1w0Var = h2bVar.b;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (pawVar.hasNext()) {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                    break;
                }
                break;
            default:
                h2bVar.U.f(v1b.f36622a);
                break;
        }
        return Unit.f46060a;
    }
}
