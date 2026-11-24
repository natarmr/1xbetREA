package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v1i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36631a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ u1i c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ u1i e;
    public final /* synthetic */ Function0 f;

    public /* synthetic */ v1i(mm40 mm40Var, u1i u1iVar, Function0 function0, u1i u1iVar2, Function0 function1, byte b) {
        this.f36631a = b;
        this.b = mm40Var;
        this.c = u1iVar;
        this.d = function0;
        this.e = u1iVar2;
        this.f = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f36631a;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    vfc.j(s5x0.L(o7k0.e(mm40VarD, 38.0f), 8.0f, 0.0f, 2), u1c.M(1189679050, new x1i(this.c, this.d, this.e, this.f, (byte) 0), fetVar), fetVar, 48);
                } else {
                    fetVar.X();
                }
                break;
            default:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarD2 = o7k0.d(mm40Var, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    vfc.j(s5x0.N(o7k0.e(mm40VarD2, 40.0f), 12.0f, 4.0f, 12.0f, 0.0f, 8), u1c.M(-610596970, new x1i(this.c, this.d, this.e, this.f, (byte) 1), fetVar), fetVar, 48);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
