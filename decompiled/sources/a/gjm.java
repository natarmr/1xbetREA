package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gjm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11405a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ qjm c;
    public final /* synthetic */ int d;

    public /* synthetic */ gjm(mm40 mm40Var, qjm qjmVar, int i, byte b) {
        this.f11405a = b;
        this.b = mm40Var;
        this.c = qjmVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f11405a;
        int i = this.d;
        qjm qjmVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                xkb.y(mm40Var, qjmVar, fetVar, x8x.L(i | 1));
                break;
            default:
                slb.E(mm40Var, qjmVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
