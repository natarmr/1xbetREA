package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zph implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44759a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ a4x c;
    public final /* synthetic */ int d;

    public /* synthetic */ zph(mm40 mm40Var, a4x a4xVar, int i, byte b) {
        this.f44759a = b;
        this.b = mm40Var;
        this.c = a4xVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f44759a;
        int i = this.d;
        a4x a4xVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                tdc.c(x8x.L(i | 1), fetVar, a4xVar, mm40Var);
                break;
            case 1:
                xkb.m(x8x.L(i | 1), fetVar, a4xVar, mm40Var);
                break;
            case 2:
                ieb.J(x8x.L(i | 1), fetVar, a4xVar, mm40Var);
                break;
            case 3:
                jeb.s(x8x.L(i | 1), fetVar, a4xVar, mm40Var);
                break;
            case 4:
                jeb.F(x8x.L(i | 1), fetVar, a4xVar, mm40Var);
                break;
            case 5:
                bfb.r(x8x.L(i | 1), fetVar, a4xVar, mm40Var);
                break;
            case 6:
                bfb.y(x8x.L(i | 1), fetVar, a4xVar, mm40Var);
                break;
            case 7:
                lgb.l(x8x.L(i | 1), fetVar, a4xVar, mm40Var);
                break;
            case 8:
                lgb.y(x8x.L(i | 1), fetVar, a4xVar, mm40Var);
                break;
            case 9:
                qzb.k(x8x.L(i | 1), fetVar, a4xVar, mm40Var);
                break;
            case 10:
                zjb.q(x8x.L(i | 1), fetVar, a4xVar, mm40Var);
                break;
            case 11:
                ulb.o(x8x.L(i | 1), fetVar, a4xVar, mm40Var);
                break;
            case 12:
                kpb.m(x8x.L(i | 1), fetVar, a4xVar, mm40Var);
                break;
            case 13:
                d7x.q(x8x.L(i | 1), fetVar, a4xVar, mm40Var);
                break;
            case 14:
                jpm0.d(x8x.L(i | 1), fetVar, a4xVar, mm40Var);
                break;
            default:
                aad.z(x8x.L(i | 1), fetVar, a4xVar, mm40Var);
                break;
        }
        return Unit.f46060a;
    }
}
