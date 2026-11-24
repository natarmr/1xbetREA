package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cfw implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4283a;
    public final /* synthetic */ ctf0 b;
    public final /* synthetic */ svu c;

    public /* synthetic */ cfw(ctf0 ctf0Var, svu svuVar, byte b) {
        this.f4283a = b;
        this.b = ctf0Var;
        this.c = svuVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f4283a;
        svu svuVar = this.c;
        ctf0 ctf0Var = this.b;
        switch (b) {
            case 0:
                lew lewVar = (lew) obj;
                lewVar.getClass();
                return new bfw(lewVar, ctf0Var, svuVar.l());
            default:
                tzh0 tzh0Var = (tzh0) obj;
                tzh0Var.getClass();
                return new hdn(tzh0Var, ctf0Var, svuVar.l());
        }
    }
}
