package a;

import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l51 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19434a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ l51(dqh0 dqh0Var, Function0 function0, mm40 mm40Var, int i) {
        this.f19434a = (byte) 15;
        this.d = dqh0Var;
        this.e = function0;
        this.b = mm40Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19434a;
        byte b2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ntr.s((mm40) obj3, (a0i) obj5, (Function0) obj4, (fet) obj, x8x.L(b2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                jd8.d((mm40) obj3, (vr1) obj5, (Function2) obj4, (fet) obj, x8x.L(1), this.c);
                break;
            case 2:
                ((Integer) obj2).getClass();
                v3c.A((Function0) obj4, (Function0) obj3, (clz) obj5, (fet) obj, x8x.L(1), this.c);
                break;
            case 3:
                ((Integer) obj2).getClass();
                rje.b((mm40) obj3, (oje) obj5, (Function1) obj4, (fet) obj, x8x.L(1), this.c);
                break;
            case 4:
                ((Integer) obj2).getClass();
                ozb.k((mm40) obj3, (h0g) obj5, (hh80) obj4, (fet) obj, x8x.L(b2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                gkb.G((mm40) obj3, (String) obj5, this.c, (lh80) obj4, (fet) obj, iL);
                break;
            case 6:
                ((Integer) obj2).getClass();
                xkb.i((mm40) obj3, (smh) obj5, (Function0) obj4, (fet) obj, x8x.L(b2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                dtb.o((nz30) obj5, (Function1) obj4, (mm40) obj3, (fet) obj, x8x.L(1), this.c);
                break;
            case 8:
                ((Integer) obj2).getClass();
                ckb.x((mm40) obj3, (tdp) obj5, (Function1) obj4, (fet) obj, x8x.L(b2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                gfx.b((mm40) obj3, (jvy) obj5, (Function2) obj4, (fet) obj, x8x.L(b2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                l7x.q((mm40) obj3, (pz40) obj5, (Function0) obj4, (fet) obj, x8x.L(1), this.c);
                break;
            case 11:
                ((Integer) obj2).getClass();
                l7x.p((mm40) obj3, (mfm) obj5, (nfm) obj4, (fet) obj, x8x.L(b2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                xvw.g((mm40) obj3, (die0) obj5, (d280) obj4, (fet) obj, x8x.L(b2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(b2 | 1);
                jar0.b(iL2, (in5) obj5, (ijl) obj3, (fet) obj, (Function1) obj4);
                break;
            case 14:
                ((Integer) obj2).getClass();
                fww.l((mm40) obj3, (xdr) obj5, (ugd) obj4, (fet) obj, x8x.L(385), this.c);
                break;
            case 15:
                ((Integer) obj2).getClass();
                l8x.K((dqh0) obj5, (Function0) obj4, (mm40) obj3, (fet) obj, x8x.L(b2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                h8x.j((mm40) obj3, (zgl0) obj5, (Function0) obj4, (fet) obj, x8x.L(b2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                aem0.f((mm40) obj3, (xgn0) obj5, (y9q0) obj4, (fet) obj, x8x.L(b2 | 1));
                break;
            case 18:
                fet fetVar = (fet) obj;
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                byte b3 = this.c;
                dgp0.a(iL3, b3, fetVar, (mm40) obj3, (y9q0) obj4, (String) obj5);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(b2 | 1);
                qim0.b(iL4, (fet) obj, (mm40) obj3, (String) obj5, (String) obj4);
                break;
            default:
                fet fetVar2 = (fet) obj;
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(1);
                byte b4 = this.c;
                msm0.g(iL5, b4, fetVar2, (mm40) obj3, (Integer) obj5, (String) obj4);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ l51(mm40 mm40Var, String str, int i, lh80 lh80Var, int i2) {
        this.f19434a = (byte) 5;
        this.b = mm40Var;
        this.d = str;
        this.c = i;
        this.e = lh80Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ l51(mm40 mm40Var, Object obj, Object obj2, int i, int i2, byte b) {
        this.f19434a = b;
        this.b = mm40Var;
        this.d = obj;
        this.e = obj2;
        this.c = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ l51(Object obj, Object obj2, mm40 mm40Var, int i, int i2, byte b) {
        this.f19434a = b;
        this.d = obj;
        this.e = obj2;
        this.b = mm40Var;
        this.c = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ l51(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.f19434a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ l51(Function0 function0, Function0 function1, clz clzVar, int i, int i2) {
        this.f19434a = (byte) 2;
        this.e = function0;
        this.b = function1;
        this.d = clzVar;
        this.c = i2;
    }
}
