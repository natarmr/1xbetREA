package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gg8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11242a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ mdm c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ gg8(mm40 mm40Var, mdm mdmVar, Function0 function0, int i, byte b) {
        this.f11242a = b;
        this.b = mm40Var;
        this.c = mdmVar;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f11242a;
        Function0 function0 = this.d;
        mdm mdmVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                bsr0.g(mm40Var, mdmVar, function0, fetVar, x8x.L(1));
                break;
            case 1:
                dwi0.g(mm40Var, mdmVar, function0, fetVar, x8x.L(1));
                break;
            case 2:
                eeq.v(mm40Var, mdmVar, function0, fetVar, x8x.L(1));
                break;
            case 3:
                lv00.u(mm40Var, mdmVar, function0, fetVar, x8x.L(1));
                break;
            case 4:
                i120.w(mm40Var, mdmVar, function0, fetVar, x8x.L(1));
                break;
            case 5:
                o050.m(mm40Var, mdmVar, function0, fetVar, x8x.L(1));
                break;
            case 6:
                y860.E(mm40Var, mdmVar, function0, fetVar, x8x.L(1));
                break;
            case 7:
                ju70.q(mm40Var, mdmVar, function0, fetVar, x8x.L(1));
                break;
            case 8:
                gq80.u(mm40Var, mdmVar, function0, fetVar, x8x.L(1));
                break;
            case 9:
                jar0.m(mm40Var, mdmVar, function0, fetVar, x8x.L(1));
                break;
            case 10:
                bsr0.A(mm40Var, mdmVar, function0, fetVar, x8x.L(1));
                break;
            case 11:
                rsr0.o(mm40Var, mdmVar, function0, fetVar, x8x.L(1));
                break;
            case 12:
                tke.F(mm40Var, mdmVar, function0, fetVar, x8x.L(1));
                break;
            case 13:
                piz.b(mm40Var, mdmVar, function0, fetVar, x8x.L(1));
                break;
            case 14:
                ycm0.g(mm40Var, mdmVar, function0, fetVar, x8x.L(1));
                break;
            default:
                o2e.V(mm40Var, mdmVar, function0, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
