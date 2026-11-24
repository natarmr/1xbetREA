package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class og0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25192a;
    public final /* synthetic */ ctf0 b;
    public final /* synthetic */ pru c;

    public /* synthetic */ og0(byte b, pru pruVar, ctf0 ctf0Var) {
        this.f25192a = b;
        this.b = ctf0Var;
        this.c = pruVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f25192a;
        pru pruVar = this.c;
        ctf0 ctf0Var = this.b;
        switch (b) {
            case 0:
                hg0 hg0Var = (hg0) obj;
                hg0Var.getClass();
                return new jg0(hg0Var, ctf0Var, pruVar.a());
            case 1:
                c820 c820Var = (c820) obj;
                c820Var.getClass();
                int iOrdinal = c820Var.l.ordinal();
                if (iOrdinal != 2) {
                    return iOrdinal != 3 ? new fp30(c820Var, ctf0Var, pruVar.a().g.x) : new z19(c820Var, ctf0Var, pruVar.a().g.x);
                }
                return new eh00(c820Var, ctf0Var, pruVar.a().g.x);
            case 2:
                z2s z2sVar = (z2s) obj;
                z2sVar.getClass();
                return new wnr(z2sVar, ctf0Var, pruVar.a().g.x);
            case 3:
                r7s r7sVar = (r7s) obj;
                r7sVar.getClass();
                return new a8s(r7sVar, ctf0Var, pruVar.a().g.x);
            default:
                njs njsVar = (njs) obj;
                njsVar.getClass();
                return new rjs(njsVar, ctf0Var, pruVar.a().g.x);
        }
    }
}
