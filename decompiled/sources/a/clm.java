package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class clm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4566a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ ga50 g;

    public /* synthetic */ clm(mm40 mm40Var, String str, String str2, long j, long j2, ga50 ga50Var, int i, byte b) {
        this.f4566a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f = j2;
        this.g = ga50Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4566a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                hlm.j(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                hlm.h(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
