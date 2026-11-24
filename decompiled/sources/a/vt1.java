package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vt1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37980a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ cv1 c;
    public final /* synthetic */ xcz d;
    public final /* synthetic */ d9z e;
    public final /* synthetic */ xcz f;
    public final /* synthetic */ xcz g;
    public final /* synthetic */ Function1 h;

    public /* synthetic */ vt1(mm40 mm40Var, cv1 cv1Var, xcz xczVar, d9z d9zVar, xcz xczVar2, xcz xczVar3, Function1 function1, int i, byte b) {
        this.f37980a = b;
        this.b = mm40Var;
        this.c = cv1Var;
        this.d = xczVar;
        this.e = d9zVar;
        this.f = xczVar2;
        this.g = xczVar3;
        this.h = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37980a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(7);
                zgc.d(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(7);
                o2e.h(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, iL2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(7);
                x8f.d(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, iL3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(7);
                qjj.c(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, iL4);
                break;
        }
        return Unit.f46060a;
    }
}
