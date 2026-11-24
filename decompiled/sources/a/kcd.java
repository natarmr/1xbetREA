package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kcd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18052a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ o3w c;

    public /* synthetic */ kcd(mm40 mm40Var, o3w o3wVar, int i, byte b) {
        this.f18052a = b;
        this.b = mm40Var;
        this.c = o3wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f18052a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                tlb.c(this.b, this.c, fetVar, x8x.L(1));
                break;
            default:
                zsm0.b(this.b, this.c, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
