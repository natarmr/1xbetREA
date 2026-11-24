package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qnm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29036a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ unm c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;

    public /* synthetic */ qnm(mm40 mm40Var, unm unmVar, float f, int i, byte b) {
        this.f29036a = b;
        this.b = mm40Var;
        this.c = unmVar;
        this.d = f;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29036a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                snm.a(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
            default:
                snm.c(this.b, this.c, this.d, fetVar, x8x.L(this.e | 1));
                break;
        }
        return Unit.f46060a;
    }
}
