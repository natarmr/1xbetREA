package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class iwm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15496a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ a4x e;
    public final /* synthetic */ a4x f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ y1m i;
    public final /* synthetic */ boolean j;

    public /* synthetic */ iwm(mm40 mm40Var, String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, String str4, y1m y1mVar, boolean z, int i, byte b) {
        this.f15496a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.e = a4xVar;
        this.f = a4xVar2;
        this.g = str3;
        this.h = str4;
        this.i = y1mVar;
        this.j = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15496a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                vzb.v(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                wzb.F(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
