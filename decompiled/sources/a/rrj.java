package a;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rrj implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30986a;
    public final /* synthetic */ m7h0 b;

    public /* synthetic */ rrj(m7h0 m7h0Var, byte b) {
        this.f30986a = b;
        this.b = m7h0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f30986a;
        m7h0 m7h0Var = this.b;
        switch (b) {
            case 0:
                i1w0 i1w0Var = (i1w0) obj;
                i1w0Var.getClass();
                if (m7h0Var != null) {
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    if (m7h0Var instanceof DialogScreen) {
                        copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) m7h0Var)));
                    } else {
                        copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(m7h0Var)));
                    }
                    ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                }
                return Unit.f46060a;
            default:
                lf50 lf50Var = (lf50) obj;
                lf50Var.getClass();
                m7h0Var.getClass();
                wul0 wul0VarW = qxw.w(lf50Var, m7h0Var);
                List list = lf50Var.f19938a;
                re50 re50Var = lf50Var.b;
                if (re50Var != null) {
                    return re50Var.c.isEmpty() ? lf50.a(lf50Var, null, re50.d(re50Var, wul0VarW, null, 5), null, 5) : lf50.a(lf50Var, null, re50.d(re50Var, null, CollectionsKt.r0(CollectionsKt.P(1, re50Var.c), wul0VarW), 3), null, 5);
                }
                ve50 ve50Var = (ve50) CollectionsKt.f0(list);
                if (ve50Var == null) {
                    return lf50Var;
                }
                if (ve50Var instanceof se50) {
                    Object objF0 = CollectionsKt.f0(list);
                    if (!(objF0 instanceof se50)) {
                        objF0 = null;
                    }
                    se50 se50Var = (se50) objF0;
                    if (se50Var == null) {
                        return lf50Var;
                    }
                    List list2 = se50Var.b;
                    return lf50.a(lf50Var, CollectionsKt.r0(CollectionsKt.P(1, list), list2.isEmpty() ? se50.d(se50Var, wul0VarW, null, 2) : se50.d(se50Var, null, CollectionsKt.r0(CollectionsKt.P(1, list2), wul0VarW), 1)), null, null, 6);
                }
                if (!(ve50Var instanceof ue50)) {
                    return lf50Var;
                }
                Object objF1 = CollectionsKt.f0(list);
                if (!(objF1 instanceof ue50)) {
                    objF1 = null;
                }
                if (((ue50) objF1) == null) {
                    return lf50Var;
                }
                return lf50.a(lf50Var, CollectionsKt.r0(CollectionsKt.P(1, list), new ue50(wul0VarW)), null, null, 6);
        }
    }
}
