package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u13 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34883a = 2;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ u13(int i, int i2, long j, mm40 mm40Var, String str, Function0 function0) {
        this.b = mm40Var;
        this.e = str;
        this.d = j;
        this.f = function0;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f34883a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                wgu0 wgu0Var = (wgu0) obj4;
                ye60 ye60Var = (ye60) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    obc.d(bmd.t.a(wgu0Var), u1c.M(1260045569, new w13(this.d, this.c, this.b, ye60Var), fetVar), fetVar, 56);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                o0x o0xVar = (o0x) obj4;
                pm80 pm80Var = (pm80) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    boolean z = o0xVar instanceof m0x;
                    tg40 tg40Var = tg40.b;
                    mm40 mm40Var = this.b;
                    boolean z2 = this.c;
                    long j = this.d;
                    if (z) {
                        fetVar2.e0(-681124262);
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarN = o7k0.n(mm40Var, 20.0f);
                        ykw ykwVar = rlx.f30719a;
                        mm40 mm40VarE = mm40VarN.e(tg40Var);
                        pm80 pm80VarF = a8k0.F(((m0x) o0xVar).f20977a, 0, fetVar2);
                        if (!z2) {
                            j = y3d.g;
                        }
                        dww.c(pm80VarF, null, mm40VarE, j, fetVar2, 56, 0);
                        fetVar2.r(false);
                    } else {
                        if (!(o0xVar instanceof n0x) && !(o0xVar instanceof l0x)) {
                            throw b1j.f(-1684541223, fetVar2, false);
                        }
                        fetVar2.e0(-680666578);
                        zcl zclVar2 = qmk.f28987a;
                        mm40 mm40VarN2 = o7k0.n(mm40Var, 20.0f);
                        ykw ykwVar2 = rlx.f30719a;
                        k7x.b(o0xVar.a(), null, mm40VarN2.e(tg40Var), null, pm80Var, null, null, null, null, null, null, z2 ? new m78(j, 5) : null, fetVar2, 32816, 0, 28648);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                boolean z3 = this.c;
                km10.e(iL, z3 ? 1 : 0, this.d, (fet) obj, this.b, (String) obj4, (Function0) obj3);
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                jiq0.m(this.b, (String) obj4, this.c, (String) obj3, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ u13(o0x o0xVar, mm40 mm40Var, boolean z, long j, pm80 pm80Var) {
        this.e = o0xVar;
        this.b = mm40Var;
        this.c = z;
        this.d = j;
        this.f = pm80Var;
    }

    public /* synthetic */ u13(mm40 mm40Var, String str, boolean z, String str2, long j, int i) {
        this.b = mm40Var;
        this.e = str;
        this.c = z;
        this.f = str2;
        this.d = j;
    }

    public /* synthetic */ u13(wgu0 wgu0Var, long j, boolean z, mm40 mm40Var, ye60 ye60Var) {
        this.e = wgu0Var;
        this.d = j;
        this.c = z;
        this.b = mm40Var;
        this.f = ye60Var;
    }
}
