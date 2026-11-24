package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m680 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21257a;
    public final /* synthetic */ String b;
    public final /* synthetic */ j43 c;

    public /* synthetic */ m680(String str, j43 j43Var, int i, byte b) {
        this.f21257a = b;
        this.b = str;
        this.c = j43Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f21257a;
        j43 j43Var = this.c;
        String str = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                gfx.i(str, j43Var, fetVar, x8x.L(1));
                break;
            case 1:
                tfx.h(str, j43Var, fetVar, x8x.L(1));
                break;
            case 2:
                uvw.g(str, j43Var, fetVar, x8x.L(1));
                break;
            default:
                ufx.j(str, j43Var, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
