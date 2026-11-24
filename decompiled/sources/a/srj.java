package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class srj implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32678a;
    public final /* synthetic */ FragmentScreen b;

    public /* synthetic */ srj(FragmentScreen fragmentScreen, byte b) {
        this.f32678a = b;
        this.b = fragmentScreen;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f32678a;
        FragmentScreen fragmentScreen = this.b;
        switch (b) {
            case 0:
                i1w0 i1w0Var = (i1w0) obj;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                if (fragmentScreen instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen)));
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
            case 1:
                i1w0 i1w0Var2 = (i1w0) obj;
                k0w0 k0w0VarI = cs0.i(i1w0Var2, i1w0Var2);
                c8d c8dVar = (c8d) k0w0VarI.h(fragmentScreen).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                ListIterator listIteratorO2 = b1j.o(i1w0Var2, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorO2;
                    if (!pawVar2.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var2.a((oe50) pawVar2.next());
                }
                break;
            default:
                lf50 lf50Var = (lf50) obj;
                lf50Var.getClass();
                re50 re50Var = lf50Var.b;
                Collection collectionR0 = lf50Var.f19938a;
                if (re50Var != null) {
                    collectionR0 = CollectionsKt.r0(collectionR0, re50Var);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = collectionR0.iterator();
                while (it.hasNext()) {
                    w3d.u(arrayList, ((ve50) it.next()).b());
                }
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.d(((wul0) it2.next()).a().getF45455a(), fragmentScreen.getF45455a())) {
                            return qxw.u(lf50Var, fragmentScreen);
                        }
                    }
                }
                return qxw.N(lf50Var, fragmentScreen);
        }
    }
}
