package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mql implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22230a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ sql c;
    public final /* synthetic */ sql d;

    public /* synthetic */ mql(mm40 mm40Var, sql sqlVar, sql sqlVar2, int i, byte b) {
        this.f22230a = b;
        this.b = mm40Var;
        this.c = sqlVar;
        this.d = sqlVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22230a;
        sql sqlVar = this.d;
        sql sqlVar2 = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ahy.a(mm40Var, sqlVar2, sqlVar, fetVar, x8x.L(1));
                break;
            case 1:
                lv00.d(mm40Var, sqlVar2, sqlVar, fetVar, x8x.L(1));
                break;
            default:
                j120.c(mm40Var, sqlVar2, sqlVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
