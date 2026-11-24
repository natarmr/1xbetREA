package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yym implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43474a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ bzm c;

    public /* synthetic */ yym(mm40 mm40Var, bzm bzmVar, int i, byte b) {
        this.f43474a = b;
        this.b = mm40Var;
        this.c = bzmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f43474a;
        bzm bzmVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                sj3.C(mm40Var, bzmVar, fetVar, x8x.L(1));
                break;
            default:
                kpb.p(mm40Var, bzmVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
