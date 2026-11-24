package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class cin0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ fin0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cin0(fin0 fin0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = fin0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        fin0 fin0Var = this.k;
        switch (b) {
            case 0:
                return new cin0(fin0Var, yjeVar, (byte) 0);
            case 1:
                return new cin0(fin0Var, yjeVar, (byte) 1);
            case 2:
                return new cin0(fin0Var, yjeVar, (byte) 2);
            case 3:
                return new cin0(fin0Var, yjeVar, (byte) 3);
            default:
                return new cin0(fin0Var, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((cin0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        fin0 fin0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    p7m0 p7m0Var = fin0Var.l;
                    this.j = true;
                    p7m0Var.getClass();
                    p7m0Var.o(null, yhn0.f42645a);
                    if (Unit.f46060a == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    p7m0 p7m0Var2 = fin0Var.m;
                    Boolean bool = Boolean.FALSE;
                    this.j = true;
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, bool);
                    if (Unit.f46060a == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    p7m0 p7m0Var3 = fin0Var.l;
                    zhn0 zhn0Var = new zhn0(fin0Var.n);
                    this.j = true;
                    p7m0Var3.getClass();
                    p7m0Var3.o(null, zhn0Var);
                    if (Unit.f46060a == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    p7m0 p7m0Var4 = fin0Var.m;
                    Boolean bool2 = Boolean.TRUE;
                    this.j = true;
                    p7m0Var4.getClass();
                    p7m0Var4.o(null, bool2);
                    if (Unit.f46060a == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    p7m0 p7m0Var5 = fin0Var.l;
                    String strN = ohs0.n(fin0Var.d.a(), "/verification/sumsub?skip-lang-redirect=1&set-base-url=v3-api");
                    String strA = fin0Var.g.a();
                    jo20 jo20Var = new jo20();
                    fin0Var.h.e();
                    jo20Var.put("X-Mobile-Project-Id", String.valueOf(1357));
                    jo20Var.put("X-Auth", fin0Var.i.f15225a.a() ? ((btt0) ((okt0) fin0Var.j.f13549a).b).a() : "");
                    jo20Var.put("mf-render-mode", "html");
                    if (strA.length() > 0) {
                        jo20Var.put("X-Language", strA);
                    }
                    ain0 ain0Var = new ain0(strN, jo20Var.b());
                    this.j = true;
                    p7m0Var5.getClass();
                    p7m0Var5.o(null, ain0Var);
                    if (Unit.f46060a == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
