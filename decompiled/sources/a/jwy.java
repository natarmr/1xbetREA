package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jwy implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17275a;
    public final /* synthetic */ ik00 b;
    public final /* synthetic */ mm40 c;
    public final /* synthetic */ qdz d;
    public final /* synthetic */ e2d e;
    public final /* synthetic */ Function1 f;

    public /* synthetic */ jwy(ik00 ik00Var, mm40 mm40Var, qdz qdzVar, e2d e2dVar, Function1 function1, byte b) {
        this.f17275a = b;
        this.b = ik00Var;
        this.c = mm40Var;
        this.d = qdzVar;
        this.e = e2dVar;
        this.f = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f17275a;
        ik00 ik00Var = this.b;
        ir8 ir8Var = (ir8) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (b) {
            case 0:
                ir8Var.getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x8f.S(this.c, (hk00) ik00Var, this.d, this.e, this.f, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                ir8Var.getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    kc5.B0(this.c, (hk00) ik00Var, this.d, this.e, this.f, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 2:
                ir8Var.getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dj8.Q(this.c, (hk00) ik00Var, this.d, this.e, this.f, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ir8Var.getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    j47.o0(this.c, (hk00) ik00Var, this.d, this.e, this.f, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
