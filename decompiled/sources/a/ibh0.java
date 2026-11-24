package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ibh0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14487a;
    public final /* synthetic */ lbh0 b;

    public /* synthetic */ ibh0(lbh0 lbh0Var, byte b) {
        this.f14487a = b;
        this.b = lbh0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f14487a;
        lbh0 lbh0Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(lbh0Var.n);
            default:
                nqq nqqVar = lbh0Var.u1;
                if (!nqqVar.f20279a.n) {
                    return null;
                }
                iqq iqqVarE1 = nqqVar.e1();
                if (!iqqVarE1.a()) {
                    return null;
                }
                if (iqqVarE1.b()) {
                    return nqqVar.c1(null);
                }
                nqq nqqVarH = ((ypq) vcc.a0(nqqVar).getFocusOwner()).h();
                if (nqqVarH != null) {
                    return nqqVarH.c1(vcc.Y(nqqVar));
                }
                return null;
        }
    }
}
