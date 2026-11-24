package a;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class gta implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11870a;
    public final /* synthetic */ cgk0 b;
    public final /* synthetic */ cgk0 c;
    public final /* synthetic */ xcz d;
    public final /* synthetic */ cgk0 e;

    public /* synthetic */ gta(cgk0 cgk0Var, cgk0 cgk0Var2, xcz xczVar, cgk0 cgk0Var3, byte b) {
        this.f11870a = b;
        this.b = cgk0Var;
        this.c = cgk0Var2;
        this.d = xczVar;
        this.e = cgk0Var3;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f11870a;
        xcz xczVar = this.d;
        cgk0 cgk0Var = this.b;
        cgk0 cgk0Var2 = this.e;
        cgk0 cgk0Var3 = this.c;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                if (num != null) {
                    if (cgk0Var.l() - num.intValue() > 0) {
                        ncz nczVar = (ncz) CollectionsKt.W(0, xczVar.j().l);
                        cgk0Var3.m(nczVar != null ? nczVar.f23317a : -1);
                        ncz nczVar2 = (ncz) CollectionsKt.W(1, xczVar.j().l);
                        cgk0Var2.m(nczVar2 != null ? nczVar2.f23317a : -1);
                    } else if (cgk0Var.l() - num.intValue() < 0) {
                        ncz nczVar3 = (ncz) CollectionsKt.W(1, xczVar.j().l);
                        cgk0Var3.m(nczVar3 != null ? nczVar3.f23317a : -1);
                        ncz nczVar4 = (ncz) CollectionsKt.W(0, xczVar.j().l);
                        cgk0Var2.m(nczVar4 != null ? nczVar4.f23317a : -1);
                    } else {
                        cgk0Var3.m(-1);
                        cgk0Var2.m(-1);
                    }
                    cgk0Var.m(num.intValue());
                }
                break;
            default:
                Integer num2 = (Integer) obj;
                if (num2 != null) {
                    if (cgk0Var.l() - num2.intValue() > 0) {
                        ncz nczVar5 = (ncz) CollectionsKt.W(0, xczVar.j().l);
                        cgk0Var3.m(nczVar5 != null ? nczVar5.f23317a : -1);
                        ncz nczVar6 = (ncz) CollectionsKt.W(1, xczVar.j().l);
                        cgk0Var2.m(nczVar6 != null ? nczVar6.f23317a : -1);
                    } else if (cgk0Var.l() - num2.intValue() < 0) {
                        ncz nczVar7 = (ncz) CollectionsKt.W(1, xczVar.j().l);
                        cgk0Var3.m(nczVar7 != null ? nczVar7.f23317a : -1);
                        ncz nczVar8 = (ncz) CollectionsKt.W(0, xczVar.j().l);
                        cgk0Var2.m(nczVar8 != null ? nczVar8.f23317a : -1);
                    } else {
                        cgk0Var3.m(-1);
                        cgk0Var2.m(-1);
                    }
                    cgk0Var.m(num2.intValue());
                }
                break;
        }
        return Unit.f46060a;
    }
}
