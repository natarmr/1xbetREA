package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fu20 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10142a;
    public final /* synthetic */ uv20 b;

    public /* synthetic */ fu20(uv20 uv20Var, byte b) {
        this.f10142a = b;
        this.b = uv20Var;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.f10142a;
        jm40 jm40Var = jm40.b;
        uv20 uv20Var = this.b;
        yhg0 yhg0Var = (yhg0) obj;
        tv20 tv20Var = (tv20) obj2;
        fet fetVar = (fet) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        switch (b) {
            case 0:
                yhg0Var.getClass();
                tv20Var.getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 129) != 128)) {
                    zcl zclVar = qmk.f28987a;
                    q5x.i(o7k0.n(jm40Var, 16.0f), uv20Var.f, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                yhg0Var.getClass();
                tv20Var.getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 129) != 128)) {
                    zcl zclVar2 = qmk.f28987a;
                    q5x.i(o7k0.n(jm40Var, 18.0f), uv20Var.f, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 2:
                yhg0Var.getClass();
                tv20Var.getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 129) != 128)) {
                    zcl zclVar3 = qmk.f28987a;
                    q5x.i(o7k0.n(jm40Var, 18.0f), uv20Var.f, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 3:
                yhg0Var.getClass();
                tv20Var.getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 129) != 128)) {
                    zcl zclVar4 = qmk.f28987a;
                    q5x.i(o7k0.n(jm40Var, 16.0f), uv20Var.f, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                yhg0Var.getClass();
                tv20Var.getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 129) != 128)) {
                    zcl zclVar5 = qmk.f28987a;
                    q5x.i(o7k0.n(jm40Var, 16.0f), uv20Var.f, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
