package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yol implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42992a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ bpl c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ yol(mm40 mm40Var, bpl bplVar, Function0 function0, int i, byte b) {
        this.f42992a = b;
        this.b = mm40Var;
        this.c = bplVar;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f42992a;
        Function0 function0 = this.d;
        bpl bplVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                qzb.m(mm40Var, bplVar, function0, fetVar, x8x.L(7));
                break;
            case 1:
                wzb.o(mm40Var, bplVar, function0, fetVar, x8x.L(7));
                break;
            case 2:
                e3c.e(mm40Var, bplVar, function0, fetVar, x8x.L(7));
                break;
            default:
                cjx.p(mm40Var, bplVar, function0, fetVar, x8x.L(7));
                break;
        }
        return Unit.f46060a;
    }
}
