package a;

import com.huawei.hms.api.ConnectionResult;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nur0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24159a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nur0(mm40 mm40Var, xk80 xk80Var, int i, int i2) {
        this.f24159a = (byte) 20;
        this.c = mm40Var;
        this.d = xk80Var;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24159a;
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                nyq0 nyq0Var = (nyq0) obj4;
                c5n0 c5n0Var = (c5n0) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    iym0.g(null, nyq0Var, u1c.M(-882329921, new nb50(c5n0Var, i, (byte) 25), fetVar), fetVar, 384);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                aem0.j((mm40) obj4, (aor0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                cem0.j((mm40) obj4, (brq0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                rsm0.e((byr0) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ccq0.Q((d4s0) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                jiq0.f0((g6s0) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                bsr0.Q((g7s0) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                jpm0.h((mm40) obj4, (ths0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                jpm0.a((mm40) obj4, (rhs0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                ((oms0) obj4).a(obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ewm0.l((mm40) obj4, (sss0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                afn0.b((mm40) obj4, (kws0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                aem0.l((mm40) obj4, (a480) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                ghm0.c((mm40) obj4, (exs0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                qim0.h((mm40) obj4, (o580) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                iom0.a((p4u0) obj4, (Map) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                jd8.q((y9u0) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 17:
                ((Integer) obj2).intValue();
                j2e.B((stu0) obj4, (rah0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                qsm0.p((mm40) obj4, (d6v0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                u4n0.c((mm40) obj4, (zdv0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                j5n0.b((mm40) obj4, (xk80) obj3, i, (fet) obj, x8x.L(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ahy.W((mm40) obj4, (fgv0) obj3, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ nur0(Object obj, Object obj2, int i, byte b) {
        this.f24159a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
