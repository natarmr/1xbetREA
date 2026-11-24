package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class axl0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1628a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ float e;
    public final /* synthetic */ byte f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ axl0(byte b, float f, int i, mm40 mm40Var, String str, boolean z) {
        this.f1628a = b;
        this.b = mm40Var;
        this.c = z;
        this.d = str;
        this.e = f;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1628a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(this.f | 1);
                y860.R(this.e, iL, (fet) obj, this.b, this.d, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(this.f | 1);
                ju70.E(this.e, iL2, (fet) obj, this.b, this.d, this.c);
                break;
        }
        return Unit.f46060a;
    }
}
