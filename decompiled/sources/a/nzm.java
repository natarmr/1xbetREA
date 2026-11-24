package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nzm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24381a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ uzm c;
    public final /* synthetic */ int d;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    public /* synthetic */ nzm(mm40 mm40Var, uzm uzmVar, int i, byte b) {
        this.f24381a = b;
        switch (b) {
        }
        uso0 uso0Var = uso0.f36223a;
        this.b = mm40Var;
        this.c = uzmVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24381a;
        int i = this.d;
        uzm uzmVar = this.c;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                uso0 uso0Var = uso0.f36223a;
                ((Integer) obj2).getClass();
                jiq0.B(mm40Var, uzmVar, (fet) obj, x8x.L(i | 1));
                break;
            default:
                uso0 uso0Var2 = uso0.f36223a;
                ((Integer) obj2).getClass();
                jiq0.X(mm40Var, uzmVar, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
