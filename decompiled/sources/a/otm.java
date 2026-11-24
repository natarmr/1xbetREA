package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class otm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25836a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ y1m d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ otm(mm40 mm40Var, y1m y1mVar, String str, boolean z, int i) {
        this.f25836a = (byte) 2;
        this.b = mm40Var;
        this.d = y1mVar;
        this.c = str;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25836a) {
            case 0:
                ((Integer) obj2).getClass();
                slb.d(x8x.L(1), this.d, (fet) obj, this.b, this.c, this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                tlb.b(x8x.L(1), this.d, (fet) obj, this.b, this.c, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                qbc.b(x8x.L(1), this.d, (fet) obj, this.b, this.c, this.e);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ otm(mm40 mm40Var, String str, y1m y1mVar, boolean z, int i, byte b) {
        this.f25836a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = y1mVar;
        this.e = z;
    }
}
