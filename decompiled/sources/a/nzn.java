package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class nzn extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24382a;
    public final /* synthetic */ ozn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nzn(ozn oznVar, byte b) {
        super(1);
        this.f24382a = b;
        this.b = oznVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cfq cfqVar;
        cfq cfqVar2;
        byte b = this.f24382a;
        ozn oznVar = this.b;
        switch (b) {
            case 0:
                ams0 ams0Var = (ams0) obj;
                azn aznVar = azn.f1725a;
                azn aznVar2 = azn.b;
                Object obj2 = null;
                if (ams0Var.e(aznVar, aznVar2)) {
                    isb isbVar = oznVar.t.f27854a.c;
                    if (isbVar != null) {
                        obj2 = isbVar.c;
                    }
                } else if (ams0Var.e(aznVar2, azn.c)) {
                    isb isbVar2 = oznVar.u.f1078a.c;
                    if (isbVar2 != null) {
                        obj2 = isbVar2.c;
                    }
                } else {
                    obj2 = kzn.e;
                }
                return obj2 == null ? kzn.e : obj2;
            default:
                ams0 ams0Var2 = (ams0) obj;
                azn aznVar3 = azn.f1725a;
                azn aznVar4 = azn.b;
                if (ams0Var2.e(aznVar3, aznVar4)) {
                    e8k0 e8k0Var = oznVar.t.f27854a.b;
                    return (e8k0Var == null || (cfqVar2 = e8k0Var.b) == null) ? kzn.d : cfqVar2;
                }
                if (!ams0Var2.e(aznVar4, azn.c)) {
                    return kzn.d;
                }
                e8k0 e8k0Var2 = oznVar.u.f1078a.b;
                return (e8k0Var2 == null || (cfqVar = e8k0Var2.b) == null) ? kzn.d : cfqVar;
        }
    }
}
