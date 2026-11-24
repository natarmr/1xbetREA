package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dlw implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6301a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dlw(int i, hbz hbzVar, Object obj) {
        this.f6301a = (byte) 8;
        this.b = hbzVar;
        this.c = i;
        this.d = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f6301a;
        int i = this.c;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ebc.E((mm40) obj4, (v3n) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                kbc.w((mm40) obj4, (xmw) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                vbc.H((drw) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                b34.D((hrw) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                piz.c((mm40) obj4, (pd5) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                c3x.b((mm40) obj4, (eoh) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                b5x.d((eoh) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((j8z) obj4).e(i, obj3, (fet) obj, x8x.L(1));
                break;
            case 8:
                hbz hbzVar = (hbz) obj4;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    hbzVar.e(i, obj3, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((icz) obj4).e(i, obj3, (fet) obj, x8x.L(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((ydz) obj4).e(i, obj3, (fet) obj, x8x.L(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ohq0.P((ppj0) obj4, (ugd) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                x1x.o(jm40.b, (p820) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                q5x.f((wnq0) obj3, (mm40) obj4, (fet) obj, x8x.L(i | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                i4w0.y((mm40) obj4, (qd5) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ((mj8) obj4).a((udl0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                k9x.a((mm40) obj4, (l3w) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                p7x.e((mm40) obj4, (nr90) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                m8x.w((mm40) obj4, (j43) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                x9x.n((mm40) obj4, (ii40) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                bdx.l((mm40) obj4, (si40) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                xdx.e((mm40) obj4, (wj40) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                g8x.k((mm40) obj4, (k580) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 23:
                ((Integer) obj2).intValue();
                wdx.i((xk80) obj4, (Function0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                tfx.g((mm40) obj4, (r180) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                vvw.c((mm40) obj4, (z380) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                xvw.f((mm40) obj4, (m580) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).intValue();
                jiq0.g((zva) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).intValue();
                jar0.H((tx60) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                cwr0.G((cc70) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ dlw(eoh eohVar, Function1 function1, int i) {
        this.f6301a = (byte) 6;
        this.b = eohVar;
        this.d = function1;
        this.c = i;
    }

    public /* synthetic */ dlw(drw drwVar, Function1 function1, int i) {
        this.f6301a = (byte) 2;
        this.b = drwVar;
        this.d = function1;
        this.c = i;
    }

    public /* synthetic */ dlw(hrw hrwVar, Function1 function1, int i) {
        this.f6301a = (byte) 3;
        this.b = hrwVar;
        this.d = function1;
        this.c = i;
    }

    public /* synthetic */ dlw(hbz hbzVar, int i, Object obj, int i2, byte b) {
        this.f6301a = b;
        this.b = hbzVar;
        this.c = i;
        this.d = obj;
    }

    public /* synthetic */ dlw(p820 p820Var, Function1 function1, int i) {
        this.f6301a = (byte) 12;
        this.b = p820Var;
        this.d = function1;
        this.c = i;
    }

    public /* synthetic */ dlw(wnq0 wnq0Var, mm40 mm40Var, int i) {
        this.f6301a = (byte) 13;
        this.d = wnq0Var;
        this.b = mm40Var;
        this.c = i;
    }

    public /* synthetic */ dlw(Object obj, Object obj2, int i, byte b) {
        this.f6301a = b;
        this.b = obj;
        this.d = obj2;
        this.c = i;
    }
}
