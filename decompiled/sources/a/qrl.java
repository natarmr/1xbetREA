package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qrl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29216a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ rrl c;
    public final /* synthetic */ wrl d;
    public final /* synthetic */ int e;

    public /* synthetic */ qrl(mm40 mm40Var, rrl rrlVar, wrl wrlVar, int i, byte b) {
        this.f29216a = b;
        this.b = mm40Var;
        this.c = rrlVar;
        this.d = wrlVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29216a;
        int i = this.e;
        wrl wrlVar = this.d;
        rrl rrlVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                jcb.j(mm40Var, rrlVar, wrlVar, fetVar, x8x.L(i | 1));
                break;
            case 1:
                rcb.v(mm40Var, rrlVar, wrlVar, fetVar, x8x.L(i | 1));
                break;
            default:
                o050.s(mm40Var, rrlVar, wrlVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
