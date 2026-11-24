package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wcm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38931a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ucm c;
    public final /* synthetic */ xdr d;
    public final /* synthetic */ int e;

    public /* synthetic */ wcm(mm40 mm40Var, ucm ucmVar, xdr xdrVar, int i, byte b) {
        this.f38931a = b;
        this.b = mm40Var;
        this.c = ucmVar;
        this.d = xdrVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f38931a;
        int i = this.e;
        xdr xdrVar = this.d;
        ucm ucmVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                fre0.z(mm40Var, ucmVar, xdrVar, fetVar, x8x.L(i | 1));
                break;
            default:
                fre0.y(mm40Var, ucmVar, xdrVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
