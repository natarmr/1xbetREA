package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hak0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12728a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ mdm c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ hak0(mm40 mm40Var, mdm mdmVar, Function1 function1, int i, byte b) {
        this.f12728a = b;
        this.b = mm40Var;
        this.c = mdmVar;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f12728a;
        int i = this.e;
        Function1 function1 = this.d;
        mdm mdmVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                kc5.a0(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 1:
                jd8.y(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 2:
                j47.V(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 3:
                ahy.P(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 4:
                lv00.C(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 5:
                i120.x(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 6:
                xf0.k(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 7:
                qem0.a(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 8:
                hhm0.c(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 9:
                ju70.s(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 10:
                ohm0.a(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
            default:
                xia0.v(mm40Var, mdmVar, function1, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
