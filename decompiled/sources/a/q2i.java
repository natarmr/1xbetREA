package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q2i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27998a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ s3i c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ q2i(mm40 mm40Var, s3i s3iVar, Function1 function1, int i, byte b) {
        this.f27998a = b;
        this.b = mm40Var;
        this.c = s3iVar;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27998a;
        int i = this.e;
        Function1 function1 = this.d;
        s3i s3iVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                sac.f(mm40Var, s3iVar, function1, fetVar, x8x.L(i | 1));
                break;
            case 1:
                ebc.g(mm40Var, s3iVar, function1, fetVar, x8x.L(i | 1));
                break;
            default:
                fbc.a(mm40Var, s3iVar, function1, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
