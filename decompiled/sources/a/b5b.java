package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b5b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1994a;
    public final /* synthetic */ g5b b;

    public /* synthetic */ b5b(g5b g5bVar, byte b) {
        this.f1994a = b;
        this.b = g5bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f1994a;
        g5b g5bVar = this.b;
        switch (b) {
            case 0:
                gl5 gl5Var = g5b.c2;
                ((lwk) obj).getClass();
                g5b g5bVar2 = this.b;
                o2t.e(g5bVar2.F(), g5bVar2, new b5b(g5bVar2, (byte) 3), new a5b(g5bVar2, (byte) 14), null, 18);
                return new ty2(g5bVar2, (byte) 6);
            case 1:
                uid uidVar = (uid) obj;
                gl5 gl5Var2 = g5b.c2;
                uidVar.getClass();
                g5bVar.T0().x(new sf2(uidVar));
                g5bVar.W0().x(new jm2(uidVar));
                return Unit.f46060a;
            case 2:
                dn60 dn60Var = (dn60) obj;
                gl5 gl5Var3 = g5b.c2;
                dn60Var.getClass();
                g5bVar.X0().x(new j2t(dn60Var));
                return Unit.f46060a;
            case 3:
                long jLongValue = ((Long) obj).longValue();
                gl5 gl5Var4 = g5b.c2;
                g5bVar.X0().x(g2t.f10577a);
                g5bVar.W0().x(new dm2(jLongValue));
                return Unit.f46060a;
            case 4:
                dn60 dn60Var2 = (dn60) obj;
                gl5 gl5Var5 = g5b.c2;
                dn60Var2.getClass();
                g5bVar.X0().x(new j2t(dn60Var2));
                return Unit.f46060a;
            default:
                on60 on60Var = (on60) obj;
                gl5 gl5Var6 = g5b.c2;
                on60Var.getClass();
                g5bVar.X0().x(new f2t(on60Var));
                return Unit.f46060a;
        }
    }
}
