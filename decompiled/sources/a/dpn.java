package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dpn implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6477a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ mdm c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ byte e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dpn(mm40 mm40Var, mdm mdmVar, Function0 function0, int i, int i2, byte b) {
        this.f6477a = b;
        this.b = mm40Var;
        this.c = mdmVar;
        this.d = function0;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6477a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                vfc.r(this.b, this.c, this.d, (fet) obj, iL, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                nnw0.d(this.b, this.c, this.d, (fet) obj, iL2, this.e);
                break;
        }
        return Unit.f46060a;
    }
}
