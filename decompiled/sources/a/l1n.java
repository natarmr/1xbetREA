package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l1n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19262a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ h1n d;
    public final /* synthetic */ int e;

    public /* synthetic */ l1n(mm40 mm40Var, boolean z, h1n h1nVar, int i, byte b) {
        this.f19262a = b;
        this.b = mm40Var;
        this.c = z;
        this.d = h1nVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19262a;
        int i = this.e;
        h1n h1nVar = this.d;
        boolean z = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                n4c.r(mm40Var, z, h1nVar, fetVar, x8x.L(i | 1));
                break;
            default:
                n4c.D(mm40Var, z, h1nVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
