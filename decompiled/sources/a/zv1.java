package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zv1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45033a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ vv1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ zv1(mm40 mm40Var, int i, vv1 vv1Var, int i2, byte b) {
        this.f45033a = b;
        this.b = mm40Var;
        this.c = i;
        this.d = vv1Var;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f45033a;
        int i = this.e;
        vv1 vv1Var = this.d;
        int i2 = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                mrv.j(mm40Var, i2, vv1Var, fetVar, x8x.L(i | 1));
                break;
            default:
                knx.e(mm40Var, i2, vv1Var, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
