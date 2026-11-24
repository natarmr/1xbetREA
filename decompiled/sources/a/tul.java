package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tul implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34556a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ oe9 e;

    public /* synthetic */ tul(mm40 mm40Var, String str, int i, oe9 oe9Var, int i2, byte b) {
        this.f34556a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = i;
        this.e = oe9Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f34556a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                qzb.D(this.d, iL, this.e, (fet) obj, this.b, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                qzb.C(this.d, iL2, this.e, (fet) obj, this.b, this.c);
                break;
        }
        return Unit.f46060a;
    }
}
