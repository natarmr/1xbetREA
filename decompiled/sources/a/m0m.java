package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m0m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20962a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ope c;
    public final /* synthetic */ mm40 d;
    public final /* synthetic */ int e;

    public /* synthetic */ m0m(ope opeVar, int i, mm40 mm40Var, int i2) {
        this.f20962a = (byte) 2;
        this.c = opeVar;
        this.b = i;
        this.d = mm40Var;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20962a;
        int i = this.e;
        mm40 mm40Var = this.d;
        int i2 = this.b;
        ope opeVar = this.c;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                tdc.C(i2, x8x.L(i | 1), opeVar, fetVar, mm40Var);
                break;
            case 1:
                tdc.x(i2, x8x.L(i | 1), opeVar, fetVar, mm40Var);
                break;
            default:
                l8x.i(i2, x8x.L(i | 1), opeVar, fetVar, mm40Var);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ m0m(int i, ope opeVar, mm40 mm40Var, int i2, byte b) {
        this.f20962a = b;
        this.b = i;
        this.c = opeVar;
        this.d = mm40Var;
        this.e = i2;
    }
}
