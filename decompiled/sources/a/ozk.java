package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.domino.presentation.views.DominoHandView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ozk implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26103a;
    public final /* synthetic */ szk b;
    public final /* synthetic */ n0l c;

    public /* synthetic */ ozk(szk szkVar, n0l n0lVar, byte b) {
        this.f26103a = b;
        this.b = szkVar;
        this.c = n0lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f26103a;
        n0l n0lVar = this.c;
        szk szkVar = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = szk.Q1;
                l0l l0lVarJ0 = szkVar.J0();
                n0lVar.getClass();
                ly5 ly5Var = new ly5(n0lVar.i, n0lVar.e, false, n0lVar.q, n0lVar.s, l0lVarJ0.k.a().f4905a.f3145a, n0lVar.p);
                sac.V(jiu0.a(l0lVarJ0), c0l.f3530a, null, l0lVarJ0.c.f22085a, new b1f((Object) l0lVarJ0, (Object) ly5Var, (yje) null, (byte) 29), 10);
                l0lVarJ0.B(uzk.f36539a);
                break;
            case 1:
                iiy[] iiyVarArr2 = szk.Q1;
                ((DominoHandView) szkVar.I0().b.h).b(n0lVar.l);
                szkVar.L0(n0lVar);
                szkVar.P1 = n0lVar;
                break;
            default:
                iiy[] iiyVarArr3 = szk.Q1;
                ((DominoHandView) szkVar.I0().b.h).b(n0lVar.l);
                szkVar.L0(n0lVar);
                szkVar.G0(n0lVar);
                szkVar.P1 = n0lVar;
                break;
        }
        return Unit.f46060a;
    }
}
