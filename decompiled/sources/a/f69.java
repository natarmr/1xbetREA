package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.game_broadcasting.impl.presentation.views.GameBroadcastingControlPanelView;

/* JADX INFO: loaded from: classes4.dex */
public final class f69 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ k69 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f69(k69 k69Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = k69Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        k69 k69Var = this.k;
        switch (b) {
            case 0:
                return new f69(k69Var, yjeVar, (byte) 0);
            case 1:
                return new f69(k69Var, yjeVar, (byte) 1);
            case 2:
                return new f69(k69Var, yjeVar, (byte) 2);
            case 3:
                return new f69(k69Var, yjeVar, (byte) 3);
            case 4:
                return new f69(k69Var, yjeVar, (byte) 4);
            default:
                return new f69(k69Var, yjeVar, (byte) 5);
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
            case 4:
                break;
        }
        return ((f69) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        hl90 hl90Var;
        Object value;
        Object objF;
        Object value2;
        Object value3;
        Object value4;
        byte b = this.i;
        k69 k69Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (!((z59) k69Var.D()).q) {
                        return Unit.f46060a;
                    }
                    if (!k69Var.z.f15225a.a()) {
                        return Unit.f46060a;
                    }
                    reu reuVar = k69Var.y;
                    this.j = true;
                    objA = ((b3c0) reuVar.b).a(false, this);
                    if (objA == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                m2c0 m2c0Var = (m2c0) objA;
                int i = k69.K;
                jqt0 jqt0Var = m2c0Var.k;
                String str = m2c0Var.Z;
                int iOrdinal = jqt0Var.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    hl90Var = str.length() == 0 ? hl90.b : hl90.c;
                } else {
                    hl90Var = hl90.f13247a;
                }
                hl90 hl90Var2 = hl90Var;
                if (hl90Var2 == hl90.b || hl90Var2 == hl90.c) {
                    p7m0 p7m0Var = k69Var.i.f25029a;
                    while (true) {
                        Object value5 = p7m0Var.getValue();
                        value5.getClass();
                        String str2 = str;
                        if (p7m0Var.m(value5, z59.a((z59) value5, null, false, false, false, false, hl90Var2, false, false, null, str2, 384511))) {
                            ((neu0) k69Var.w.f20148a).f23405a.a();
                        } else {
                            str = str2;
                        }
                    }
                }
                return Unit.f46060a;
            case 1:
                ocj ocjVar = k69Var.i;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    int i2 = k69.K;
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                    } while (!p7m0Var2.m(value, z59.a((z59) value, null, false, false, false, false, null, false, false, null, null, 522239)));
                    lbu lbuVar = k69Var.q;
                    String str3 = ((z59) k69Var.D()).c;
                    this.j = true;
                    objF = lbuVar.f(str3, this);
                    if (objF == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objF = obj;
                }
                String str4 = (String) objF;
                int i3 = k69.K;
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                } while (!p7m0Var3.m(value2, z59.a((z59) value2, str4, true, false, false, false, null, false, false, null, null, 522127)));
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    sdi0 sdi0Var = k69Var.u;
                    psr psrVar = psr.f27527a;
                    this.j = true;
                    if (sdi0Var.a(psrVar, this) == wneVar3) {
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
                    sdi0 sdi0Var2 = k69Var.u;
                    psr psrVar2 = psr.e;
                    this.j = true;
                    if (sdi0Var2.a(psrVar2, this) == wneVar4) {
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
            case 4:
                ocj ocjVar2 = k69Var.i;
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    int i4 = k69.K;
                    p7m0 p7m0Var4 = ocjVar2.f25029a;
                    do {
                        value3 = p7m0Var4.getValue();
                        value3.getClass();
                    } while (!p7m0Var4.m(value3, z59.a((z59) value3, null, false, false, true, false, null, false, false, null, null, 524159)));
                    int i5 = GameBroadcastingControlPanelView.A;
                    long jF = znq0.f(2L);
                    this.j = true;
                    if (qcc.O(jF, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i6 = k69.K;
                p7m0 p7m0Var5 = ocjVar2.f25029a;
                do {
                    value4 = p7m0Var5.getValue();
                    value4.getClass();
                } while (!p7m0Var5.m(value4, z59.a((z59) value4, null, false, false, false, false, null, false, false, null, null, 524159)));
                return Unit.f46060a;
            default:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    sdi0 sdi0Var3 = k69Var.u;
                    psr psrVar3 = psr.c;
                    this.j = true;
                    if (sdi0Var3.a(psrVar3, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
