package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nv60 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24176a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ clo c;
    public final /* synthetic */ ugd d;
    public final /* synthetic */ ugd e;

    public /* synthetic */ nv60(mm40 mm40Var, clo cloVar, ugd ugdVar, ugd ugdVar2, int i, byte b) {
        this.f24176a = b;
        this.b = mm40Var;
        this.c = cloVar;
        this.d = ugdVar;
        this.e = ugdVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24176a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(3457);
                piz.m(this.b, this.c, this.d, this.e, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(3457);
                q0x.p(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
