package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mea implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21635a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ long f;
    public final /* synthetic */ String g;

    public /* synthetic */ mea(mm40 mm40Var, String str, String str2, String str3, long j, String str4, int i, byte b) {
        this.f21635a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = str4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21635a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                jd8.N(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                jd8.C(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
