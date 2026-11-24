package a;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uod0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36009a;
    public final /* synthetic */ float b;
    public final /* synthetic */ epd0 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ uod0(float f, epd0 epd0Var, Function1 function1, byte b) {
        this.f36009a = b;
        this.b = f;
        this.c = epd0Var;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f36009a;
        Function1 function1 = this.d;
        epd0 epd0Var = this.c;
        float f = this.b;
        c5n0 c5n0Var = (c5n0) obj;
        p4e p4eVar = (p4e) obj2;
        switch (b) {
            case 0:
                c5n0Var.getClass();
                pu90 pu90VarS = (epd0Var.f == null || c5n0Var.T(f) <= p4e.i(p4eVar.f26347a)) ? ((pj30) CollectionsKt.U(c5n0Var.k("row", new ugd(1594245539, true, new vod0((byte) 2, epd0Var, function1))))).S(p4eVar.f26347a) : ((pj30) CollectionsKt.U(c5n0Var.k("column", new ugd(2002244026, true, new vod0((byte) 3, epd0Var, function1))))).S(p4eVar.f26347a);
                return vj30.x(c5n0Var, pu90VarS.f27604a, pu90VarS.b, new cam(pu90VarS, (byte) 25));
            default:
                c5n0Var.getClass();
                pu90 pu90VarS2 = (epd0Var.f == null || c5n0Var.T(f) <= p4e.i(p4eVar.f26347a)) ? ((pj30) CollectionsKt.U(c5n0Var.k("row", new ugd(-1584529257, true, new vod0((byte) 4, epd0Var, function1))))).S(p4eVar.f26347a) : ((pj30) CollectionsKt.U(c5n0Var.k("column", new ugd(-185211168, true, new vod0((byte) 5, epd0Var, function1))))).S(p4eVar.f26347a);
                return vj30.x(c5n0Var, pu90VarS2.f27604a, pu90VarS2.b, new cam(pu90VarS2, (byte) 26));
        }
    }
}
