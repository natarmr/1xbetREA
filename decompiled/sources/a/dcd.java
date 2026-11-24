package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dcd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5845a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ e900 c;
    public final /* synthetic */ int d;

    public /* synthetic */ dcd(boolean z, e900 e900Var, int i, byte b) {
        this.f5845a = b;
        this.b = z;
        this.c = e900Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f5845a;
        int i = this.d;
        e900 e900Var = this.c;
        boolean z = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                xkb.u(x8x.L(i | 1), fetVar, e900Var, z);
                break;
            default:
                pzw.e(x8x.L(i | 1), fetVar, e900Var, z);
                break;
        }
        return Unit.f46060a;
    }
}
