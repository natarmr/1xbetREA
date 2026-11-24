package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hlw implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13281a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hlw(xcz xczVar, long j, long j2, float f, int i) {
        this.e = xczVar;
        this.b = j;
        this.d = j2;
        this.c = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13281a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                dwi0.q((xcz) this.e, this.b, this.d, this.c, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                u7x.r((mm40) this.e, this.b, this.c, this.d, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ hlw(mm40 mm40Var, long j, float f, long j2, int i) {
        this.e = mm40Var;
        this.b = j;
        this.c = f;
        this.d = j2;
    }
}
