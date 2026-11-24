package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ezn extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8679a;
    public final /* synthetic */ pzn b;
    public final /* synthetic */ alo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ezn(pzn pznVar, alo aloVar, byte b) {
        super(1);
        this.f8679a = b;
        this.b = pznVar;
        this.c = aloVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cfq cfqVar;
        cfq cfqVar2;
        cfq cfqVar3;
        cfq cfqVar4;
        byte b = this.f8679a;
        alo aloVar = this.c;
        pzn pznVar = this.b;
        switch (b) {
            case 0:
                ams0 ams0Var = (ams0) obj;
                azn aznVar = azn.f1725a;
                azn aznVar2 = azn.b;
                if (ams0Var.e(aznVar, aznVar2)) {
                    fwo fwoVar = pznVar.f27854a.f16780a;
                    return (fwoVar == null || (cfqVar2 = fwoVar.b) == null) ? kzn.b : cfqVar2;
                }
                if (!ams0Var.e(aznVar2, azn.c)) {
                    return kzn.b;
                }
                fwo fwoVar2 = aloVar.f1078a.f16780a;
                return (fwoVar2 == null || (cfqVar = fwoVar2.b) == null) ? kzn.b : cfqVar;
            default:
                ams0 ams0Var2 = (ams0) obj;
                azn aznVar3 = azn.f1725a;
                azn aznVar4 = azn.b;
                if (ams0Var2.e(aznVar3, aznVar4)) {
                    k1h0 k1h0Var = pznVar.f27854a.d;
                    return (k1h0Var == null || (cfqVar4 = k1h0Var.c) == null) ? kzn.b : cfqVar4;
                }
                if (!ams0Var2.e(aznVar4, azn.c)) {
                    return kzn.b;
                }
                k1h0 k1h0Var2 = aloVar.f1078a.d;
                return (k1h0Var2 == null || (cfqVar3 = k1h0Var2.c) == null) ? kzn.b : cfqVar3;
        }
    }
}
