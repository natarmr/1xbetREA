package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wym implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39980a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ azm c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ wym(mm40 mm40Var, azm azmVar, boolean z, int i, byte b) {
        this.f39980a = b;
        switch (b) {
            case 1:
                break;
            default:
                q6x q6xVar = q6x.f28221a;
                break;
        }
        this.b = mm40Var;
        this.c = azmVar;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f39980a;
        boolean z = this.d;
        azm azmVar = this.c;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                q6x q6xVar = q6x.f28221a;
                ((Integer) obj2).getClass();
                sj3.E(mm40Var, azmVar, z, (fet) obj, x8x.L(3073));
                break;
            default:
                ((Integer) obj2).getClass();
                kpb.q(mm40Var, azmVar, z, (fet) obj, x8x.L(385));
                break;
        }
        return Unit.f46060a;
    }
}
