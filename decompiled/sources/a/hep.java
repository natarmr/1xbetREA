package a;

import android.content.ComponentCallbacks2;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.favorites.impl.presentation.category.FavoriteCategoryUiState;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hep implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12934a;
    public final /* synthetic */ org.xplatform.favorites.impl.presentation.category.e b;

    public /* synthetic */ hep(org.xplatform.favorites.impl.presentation.category.e eVar, byte b) {
        this.f12934a = b;
        this.b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        wgh0 wgh0Var;
        byte b = this.f12934a;
        org.xplatform.favorites.impl.presentation.category.e eVar = this.b;
        switch (b) {
            case 0:
                sek sekVar = org.xplatform.favorites.impl.presentation.category.e.V1;
                ComponentCallbacks2 application = eVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(jep.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof jep)) {
                        ze3Var = null;
                    }
                    jep jepVar = (jep) ze3Var;
                    if (jepVar != null) {
                        return jepVar.a((FavoriteCategoryUiState) eVar.L1.n(eVar, org.xplatform.favorites.impl.presentation.category.e.W1[0]), a4n0.f(eVar));
                    }
                }
                jf4.n(b1j.i(jep.class, "Cannot create dependency "));
                return null;
            case 1:
                rgi rgiVar = eVar.N1;
                if (rgiVar != null) {
                    return new q0h0(rgiVar);
                }
                Intrinsics.h("favoriteCategoryViewModelFactory");
                throw null;
            case 2:
                sek sekVar2 = org.xplatform.favorites.impl.presentation.category.e.V1;
                org.xplatform.favorites.impl.presentation.category.f fVarH0 = eVar.H0();
                org.xplatform.favorites.impl.presentation.category.e.X1.getClass();
                int iOrdinal = org.xplatform.favorites.impl.presentation.category.b.a(fVarH0.u).ordinal();
                if (iOrdinal == 0) {
                    wgh0Var = wgh0.FAVORITES_TEAM;
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                    wgh0Var = wgh0.FAVORITES_CHAMP;
                }
                fVarH0.q.g(wgh0Var);
                fVarH0.r.C(wgh0Var.f39117a);
                return Unit.f46060a;
            default:
                sek sekVar3 = org.xplatform.favorites.impl.presentation.category.e.V1;
                i1w0 i1w0Var = eVar.H0().c;
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
        }
    }
}
