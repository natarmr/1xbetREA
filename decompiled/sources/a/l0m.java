package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l0m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19209a;
    public final /* synthetic */ tpe b;
    public final /* synthetic */ ope c;
    public final /* synthetic */ mm40 d;
    public final /* synthetic */ int e;

    public /* synthetic */ l0m(tpe tpeVar, ope opeVar, mm40 mm40Var, int i, byte b) {
        this.f19209a = b;
        this.b = tpeVar;
        this.c = opeVar;
        this.d = mm40Var;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19209a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                tdc.a(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
            default:
                tdc.A(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
        }
        return Unit.f46060a;
    }
}
