package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s59 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31644a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ xdr d;
    public final /* synthetic */ xdr e;
    public final /* synthetic */ xdr f;

    public /* synthetic */ s59(mm40 mm40Var, Function0 function0, xdr xdrVar, xdr xdrVar2, xdr xdrVar3, int i, byte b) {
        this.f31644a = b;
        this.b = mm40Var;
        this.c = function0;
        this.d = xdrVar;
        this.e = xdrVar2;
        this.f = xdrVar3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31644a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(7);
                wb.h(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(7);
                cy2.d(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
