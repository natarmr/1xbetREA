package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wp30 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39525a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ wp30(int i, boolean z, boolean z2, boolean z3) {
        this.f39525a = (byte) 0;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f39525a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                ny9.t(this.b, this.c, this.d, (fet) obj, iL);
                return Unit.f46060a;
            case 1:
                return twi0.a((twi0) obj2, false, false, null, null, null, null, null, null, null, null, false, false, null, null, this.b, this.c, this.d, false, false, false, false, false, null, false, false, false, false, 0, false, false, 0, -458753, 2097151);
            case 2:
                return tcj0.a((tcj0) obj2, false, false, null, null, null, null, false, null, false, false, null, null, this.b, this.c, this.d, false, false, false, false, false, null, false, false, false, false, 0, false, null, false, false, 0, -458753, 2097151);
            default:
                return pfj0.a((pfj0) obj2, false, false, null, null, null, null, null, null, null, false, false, null, null, this.b, this.c, this.d, false, false, false, false, false, null, false, false, false, false, 0, false, false, 0, -229377, 1048575);
        }
    }

    public /* synthetic */ wp30(boolean z, boolean z2, boolean z3, byte b) {
        this.f39525a = b;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }
}
