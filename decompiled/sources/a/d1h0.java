package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class d1h0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5308a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ zz40 f;
    public final /* synthetic */ Function2 g;

    /* JADX WARN: Multi-variable type inference failed */
    public d1h0(int i, Function2 function2, ugd ugdVar, Function2 function3, Function2 function4, zz40 zz40Var, Function2 function5) {
        this.f5308a = i;
        this.b = function2;
        this.c = ugdVar;
        this.d = function3;
        this.e = function4;
        this.f = zz40Var;
        this.g = function5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            m8x.z(this.f5308a, this.b, this.c, this.d, this.e, this.f, this.g, fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
