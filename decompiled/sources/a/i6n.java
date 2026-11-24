package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i6n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14249a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i6n(int i, a4x a4xVar, zhr0 zhr0Var, int i2) {
        this.f14249a = (byte) 3;
        this.b = i;
        this.e = a4xVar;
        this.c = zhr0Var;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f14249a;
        int i = this.d;
        int i2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                j6n.q((fro0) obj4, (mm40) obj3, this.b, this.d, (fet) obj, iL);
                break;
            case 1:
                fet fetVar = (fet) obj;
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                dj8.n(i2, iL2, fetVar, (mm40) obj3, (List) obj4);
                break;
            case 2:
                ((Integer) obj2).getClass();
                hfm0.n((fop0) obj4, i2, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                nia0.X(i2, (a4x) obj4, (zhr0) obj3, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ i6n(byte b, int i, int i2, Object obj, Object obj2) {
        this.f14249a = b;
        this.e = obj;
        this.b = i;
        this.c = obj2;
        this.d = i2;
    }

    public /* synthetic */ i6n(fro0 fro0Var, mm40 mm40Var, int i, int i2, int i3) {
        this.f14249a = (byte) 0;
        this.e = fro0Var;
        this.c = mm40Var;
        this.b = i;
        this.d = i2;
    }
}
