package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pi4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27026a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ pi4(mm40 mm40Var, l7m0 l7m0Var, boolean z) {
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27026a;
        boolean z = this.d;
        l7m0 l7m0Var = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                o050.c(this.b, l7m0Var, z, (fet) obj, x8x.L(1));
                break;
            default:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                byte b2 = 0;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    jwb.p(this.b, new qw3(2.0f, true, new gne(gqw0.m, (byte) 12)), new qw3(2.0f, true, new jf4((byte) 14)), null, 0, 0, u1c.M(1530396330, new zvm(b2, l7m0Var, z), fetVar), fetVar, 1572864, 56);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ pi4(mm40 mm40Var, l7m0 l7m0Var, boolean z, int i) {
        this.b = mm40Var;
        this.c = l7m0Var;
        this.d = z;
    }
}
