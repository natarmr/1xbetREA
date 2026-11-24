package a;

import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cx implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5100a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ cx(String str, mm40 mm40Var, int i) {
        this.f5100a = (byte) 20;
        this.c = str;
        this.b = mm40Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f5100a;
        int i = this.d;
        String str = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                hmw0.e(i, x8x.L(1), fetVar, mm40Var, str);
                break;
            case 1:
                fre0.J(i, x8x.L(1), fetVar, mm40Var, str);
                break;
            case 2:
                aad.b(x8x.L(i | 1), fetVar, mm40Var, str);
                break;
            case 3:
                d18.h(x8x.L(i | 1), fetVar, mm40Var, str);
                break;
            case 4:
                unh0.U(x8x.L(i | 1), fetVar, mm40Var, str);
                break;
            case 5:
                uc9.g(x8x.L(i | 1), fetVar, mm40Var, str);
                break;
            case 6:
                uzb.h(x8x.L(i | 1), fetVar, mm40Var, str);
                break;
            case 7:
                vcc.c(x8x.L(i | 1), fetVar, mm40Var, str);
                break;
            case 8:
                vcc.c(x8x.L(i | 1), fetVar, mm40Var, str);
                break;
            case 9:
                hic.f(x8x.L(i | 1), fetVar, mm40Var, str);
                break;
            case 10:
                f7k.i(x8x.L(i | 1), fetVar, mm40Var, str);
                break;
            case 11:
                fbc.J(x8x.L(i | 1), fetVar, mm40Var, str);
                break;
            case 12:
                sj3.F(x8x.L(i | 1), fetVar, mm40Var, str);
                break;
            case 13:
                nkb.p(x8x.L(i | 1), fetVar, mm40Var, str);
                break;
            case 14:
                ibc.s(x8x.L(i | 1), fetVar, mm40Var, str);
                break;
            case 15:
                vzb.o(x8x.L(i | 1), fetVar, mm40Var, str);
                break;
            case 16:
                v3c.J(i, x8x.L(1), fetVar, mm40Var, str);
                break;
            case 17:
                wdx.e(x8x.L(i | 1), fetVar, mm40Var, str);
                break;
            case 18:
                cfx0.c(i, x8x.L(7), fetVar, mm40Var, str);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wdx.k(x8x.L(i | 1), fetVar, mm40Var, str);
                break;
            case 20:
                rsm0.g(x8x.L(i | 1), fetVar, mm40Var, str);
                break;
            case 21:
                iym0.e(x8x.L(i | 1), fetVar, mm40Var, str);
                break;
            case 22:
                hxm0.i(x8x.L(i | 1), fetVar, mm40Var, str);
                break;
            case 23:
                wgm0.e(i, x8x.L(1), fetVar, mm40Var, str);
                break;
            default:
                k5n0.n(x8x.L(i | 1), fetVar, mm40Var, str);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ cx(mm40 mm40Var, String str, int i, byte b) {
        this.f5100a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = i;
    }

    public /* synthetic */ cx(mm40 mm40Var, String str, int i, int i2, byte b) {
        this.f5100a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = i;
    }

    public /* synthetic */ cx(mm40 mm40Var, int i, String str, int i2) {
        this.f5100a = (byte) 0;
        this.b = mm40Var;
        this.d = i;
        this.c = str;
    }
}
