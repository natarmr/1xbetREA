package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ywm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43376a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ zyp c;

    public /* synthetic */ ywm(mm40 mm40Var, zyp zypVar, int i, byte b) {
        this.f43376a = b;
        this.b = mm40Var;
        this.c = zypVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f43376a;
        zyp zypVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                fbc.F(mm40Var, zypVar, fetVar, x8x.L(1));
                break;
            case 1:
                kbc.D(mm40Var, zypVar, fetVar, x8x.L(1));
                break;
            case 2:
                mbc.E(mm40Var, zypVar, fetVar, x8x.L(1));
                break;
            case 3:
                obc.B(mm40Var, zypVar, fetVar, x8x.L(1));
                break;
            default:
                qbc.z(mm40Var, zypVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
