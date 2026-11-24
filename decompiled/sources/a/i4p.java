package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.favorites.impl.presentation.category.FavoriteCategoryUiState;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i4p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14157a;
    public final /* synthetic */ m4p b;

    public /* synthetic */ i4p(m4p m4pVar, byte b) {
        this.f14157a = b;
        this.b = m4pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f14157a;
        m4p m4pVar = this.b;
        switch (b) {
            case 0:
                bek bekVar = m4p.S1;
                ComponentCallbacks2 application = m4pVar.n0().getApplication();
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
                        return jepVar.a((FavoriteCategoryUiState) m4pVar.L1.n(m4pVar, m4p.U1[0]), a4n0.f(m4pVar));
                    }
                }
                jf4.n(b1j.i(jep.class, "Cannot create dependency "));
                return null;
            case 1:
                sgi sgiVar = m4pVar.O1;
                if (sgiVar != null) {
                    return new q0h0(sgiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                bek bekVar2 = m4p.S1;
                m4pVar.G0().x(r3p.f29799a);
                return Unit.f46060a;
            case 3:
                bek bekVar3 = m4p.S1;
                m4pVar.G0().x(n3p.f22861a);
                return Unit.f46060a;
            default:
                bek bekVar4 = m4p.S1;
                m4pVar.G0().x(l3p.f19369a);
                return Unit.f46060a;
        }
    }
}
