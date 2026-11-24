package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kwm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19008a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ dkk d;

    public /* synthetic */ kwm(mm40 mm40Var, String str, dkk dkkVar, int i, byte b) {
        this.f19008a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = dkkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19008a;
        dkk dkkVar = this.d;
        String str = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                n4c.A(mm40Var, str, dkkVar, fetVar, x8x.L(1));
                break;
            case 1:
                n4c.w(mm40Var, str, dkkVar, fetVar, x8x.L(1));
                break;
            case 2:
                aac.D(mm40Var, str, dkkVar, fetVar, x8x.L(1));
                break;
            case 3:
                aac.x(mm40Var, str, dkkVar, fetVar, x8x.L(1));
                break;
            case 4:
                sac.z(mm40Var, str, dkkVar, fetVar, x8x.L(1));
                break;
            case 5:
                sac.E(mm40Var, str, dkkVar, fetVar, x8x.L(1));
                break;
            case 6:
                ebc.J(mm40Var, str, dkkVar, fetVar, x8x.L(1));
                break;
            default:
                ebc.Q(mm40Var, str, dkkVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
