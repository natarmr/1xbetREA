package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fbd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9251a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ m3w c;

    public /* synthetic */ fbd(mm40 mm40Var, m3w m3wVar, int i, byte b) {
        this.f9251a = b;
        this.b = mm40Var;
        this.c = m3wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f9251a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ahb.c(this.b, this.c, fetVar, x8x.L(1));
                break;
            default:
                xdx.c(this.b, this.c, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
