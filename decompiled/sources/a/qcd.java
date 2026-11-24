package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qcd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28479a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;

    public /* synthetic */ qcd(mm40 mm40Var, long j, long j2, long j3, boolean z, int i, int i2, int i3) {
        this.f28479a = (byte) 0;
        this.b = mm40Var;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.e = z;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28479a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(24577);
                f7k.a(this.c, this.d, iL, this.f, this.g, this.h, (fet) obj, this.b, this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                p8n.a(this.c, this.d, iL2, this.f, this.g, this.h, (fet) obj, this.b, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                ktt0.a(this.c, this.d, iL3, this.f, this.g, this.h, (fet) obj, this.b, this.e);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ qcd(mm40 mm40Var, int i, int i2, boolean z, long j, long j2, long j3, int i3, byte b) {
        this.f28479a = b;
        this.b = mm40Var;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = j;
        this.g = j2;
        this.h = j3;
    }
}
