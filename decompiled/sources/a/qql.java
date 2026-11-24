package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qql implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29172a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ sql c;

    public /* synthetic */ qql(mm40 mm40Var, sql sqlVar, int i, byte b) {
        this.f29172a = b;
        this.b = mm40Var;
        this.c = sqlVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29172a;
        sql sqlVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                xbc.B(mm40Var, sqlVar, fetVar, x8x.L(1));
                break;
            default:
                vcc.q(mm40Var, sqlVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
