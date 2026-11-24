package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a3s implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f188a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ ugd e;
    public final /* synthetic */ ugd f;
    public final /* synthetic */ int g;

    public /* synthetic */ a3s(mm40 mm40Var, pz40 pz40Var, Function0 function0, ugd ugdVar, ugd ugdVar2, int i, byte b) {
        this.f188a = b;
        this.b = mm40Var;
        this.c = pz40Var;
        this.d = function0;
        this.e = ugdVar;
        this.f = ugdVar2;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f188a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                wvb.z(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                dyb.y(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
