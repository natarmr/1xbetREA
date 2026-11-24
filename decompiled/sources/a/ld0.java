package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ld0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19824a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ mdm c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ ld0(mm40 mm40Var, mdm mdmVar, Function1 function1, int i, byte b) {
        this.f19824a = b;
        this.b = mm40Var;
        this.c = mdmVar;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19824a;
        Function1 function1 = this.d;
        mdm mdmVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                p8a.c(mm40Var, mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 1:
                xbc.q(mm40Var, mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 2:
                gq80.w(mm40Var, mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 3:
                jiq0.A(mm40Var, mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 4:
                aad.m(mm40Var, mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 5:
                hew0.i(mm40Var, mdmVar, function1, fetVar, x8x.L(1));
                break;
            case 6:
                m0x0.q(mm40Var, mdmVar, function1, fetVar, x8x.L(1));
                break;
            default:
                wha0.q(mm40Var, mdmVar, function1, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
