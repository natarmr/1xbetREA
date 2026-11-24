package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.bet_history.bet_info.presentation.model.BetInfoScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class cd7 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public a5w j;
    public List k;
    public byte l;
    public final /* synthetic */ kd7 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cd7(kd7 kd7Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = kd7Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        kd7 kd7Var = this.m;
        switch (b) {
            case 0:
                return new cd7(kd7Var, yjeVar, (byte) 0);
            case 1:
                return new cd7(kd7Var, yjeVar, (byte) 1);
            default:
                return new cd7(kd7Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((cd7) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008f A[PHI: r0 r1
  0x008f: PHI (r0v22 a.a5w) = (r0v21 a.a5w), (r0v27 a.a5w) binds: [B:22:0x008c, B:12:0x0030] A[DONT_GENERATE, DONT_INLINE]
  0x008f: PHI (r1v32 java.lang.Object) = (r1v30 java.lang.Object), (r1v37 java.lang.Object) binds: [B:22:0x008c, B:12:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x013a  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d5  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objB;
        a5w a5wVar;
        Object objA;
        List list;
        Object objW;
        List list2;
        a5w a5wVar2;
        z760 z760Var;
        p7m0 p7m0Var;
        Object value;
        Object objB2;
        a5w a5wVar3;
        Object objA2;
        List list3;
        Object objW2;
        List list4;
        a5w a5wVar4;
        z760 z760Var2;
        p7m0 p7m0Var2;
        Object value2;
        Object objG;
        a5w a5wVar5;
        Object objA3;
        List list5;
        Object objW3;
        a5w a5wVar6;
        List list6;
        z760 z760Var3;
        p7m0 p7m0Var3;
        Object value3;
        byte b = this.i;
        kd7 kd7Var = this.m;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                byte b2 = this.l;
                if (b2 == 0) {
                    z1x.P(obj);
                    uii uiiVar = kd7Var.u;
                    String str = kd7Var.o;
                    BetInfoScreenModel betInfoScreenModel = kd7Var.p;
                    this.l = (byte) 1;
                    objB = uiiVar.B(str, betInfoScreenModel, this);
                    if (objB != wneVar) {
                    }
                    return wneVar;
                }
                if (b2 == 1) {
                    z1x.P(obj);
                    objB = obj;
                } else {
                    if (b2 == 2) {
                        a5wVar = this.j;
                        z1x.P(obj);
                        objA = obj;
                        list = (List) objA;
                        this.j = a5wVar;
                        this.k = list;
                        this.l = (byte) 3;
                        List list7 = kd7.m0;
                        objW = kd7Var.W(a5wVar, this);
                        if (objW != wneVar) {
                            list2 = list;
                        }
                        return wneVar;
                    }
                    if (b2 != 3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list8 = this.k;
                    a5wVar = this.j;
                    z1x.P(obj);
                    objW = obj;
                    list2 = list8;
                }
                a5wVar2 = a5wVar;
                z760Var = (z760) objW;
                List list9 = kd7.m0;
                p7m0Var = kd7Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, rc7.a((rc7) value, r9x.f30108a, false, a5wVar2, z760Var, null, null, null, list2, null, false, false, false, 0L, 0L, 268434902)));
                kd7Var.M();
                return Unit.f46060a;
                a5wVar = (a5w) objB;
                z7u z7uVar = kd7Var.F;
                List listC = kotlin.collections.a.c(a5wVar);
                this.j = a5wVar;
                this.l = (byte) 2;
                objA = z7uVar.a(listC, this);
                if (objA != wneVar) {
                    list = (List) objA;
                    this.j = a5wVar;
                    this.k = list;
                    this.l = (byte) 3;
                    List list10 = kd7.m0;
                    objW = kd7Var.W(a5wVar, this);
                    if (objW != wneVar) {
                        list2 = list;
                        a5wVar2 = a5wVar;
                        z760Var = (z760) objW;
                        List list11 = kd7.m0;
                        p7m0Var = kd7Var.i.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                        } while (!p7m0Var.m(value, rc7.a((rc7) value, r9x.f30108a, false, a5wVar2, z760Var, null, null, null, list2, null, false, false, false, 0L, 0L, 268434902)));
                        kd7Var.M();
                        return Unit.f46060a;
                    }
                }
                return wneVar;
            case 1:
                wne wneVar2 = wne.f39444a;
                byte b3 = this.l;
                if (b3 == 0) {
                    z1x.P(obj);
                    uii uiiVar2 = kd7Var.u;
                    String str2 = kd7Var.o;
                    BetInfoScreenModel betInfoScreenModel2 = kd7Var.p;
                    this.l = (byte) 1;
                    objB2 = uiiVar2.B(str2, betInfoScreenModel2, this);
                    if (objB2 != wneVar2) {
                    }
                    return wneVar2;
                }
                if (b3 == 1) {
                    z1x.P(obj);
                    objB2 = obj;
                } else {
                    if (b3 == 2) {
                        a5wVar3 = this.j;
                        z1x.P(obj);
                        objA2 = obj;
                        list3 = (List) objA2;
                        this.j = a5wVar3;
                        this.k = list3;
                        this.l = (byte) 3;
                        List list12 = kd7.m0;
                        objW2 = kd7Var.W(a5wVar3, this);
                        if (objW2 != wneVar2) {
                            list4 = list3;
                        }
                        return wneVar2;
                    }
                    if (b3 != 3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list13 = this.k;
                    a5wVar3 = this.j;
                    z1x.P(obj);
                    objW2 = obj;
                    list4 = list13;
                }
                a5wVar4 = a5wVar3;
                z760Var2 = (z760) objW2;
                List list14 = kd7.m0;
                p7m0Var2 = kd7Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, rc7.a((rc7) value2, r9x.f30108a, false, a5wVar4, z760Var2, null, null, null, list4, null, false, false, false, System.currentTimeMillis(), 0L, 263192022)));
                return Unit.f46060a;
                a5wVar3 = (a5w) objB2;
                z7u z7uVar2 = kd7Var.F;
                List listC2 = kotlin.collections.a.c(a5wVar3);
                this.j = a5wVar3;
                this.l = (byte) 2;
                objA2 = z7uVar2.a(listC2, this);
                if (objA2 != wneVar2) {
                    list3 = (List) objA2;
                    this.j = a5wVar3;
                    this.k = list3;
                    this.l = (byte) 3;
                    List list15 = kd7.m0;
                    objW2 = kd7Var.W(a5wVar3, this);
                    if (objW2 != wneVar2) {
                        list4 = list3;
                        a5wVar4 = a5wVar3;
                        z760Var2 = (z760) objW2;
                        List list16 = kd7.m0;
                        p7m0Var2 = kd7Var.i.f25029a;
                        do {
                            value2 = p7m0Var2.getValue();
                            value2.getClass();
                        } while (!p7m0Var2.m(value2, rc7.a((rc7) value2, r9x.f30108a, false, a5wVar4, z760Var2, null, null, null, list4, null, false, false, false, System.currentTimeMillis(), 0L, 263192022)));
                        return Unit.f46060a;
                    }
                }
                return wneVar2;
            default:
                wne wneVar3 = wne.f39444a;
                byte b4 = this.l;
                if (b4 == 0) {
                    z1x.P(obj);
                    uen uenVar = wen.b;
                    long jW0 = ibc.w0(50L, bfn.MILLISECONDS);
                    this.l = (byte) 1;
                    if (qcc.P(jW0, this) != wneVar3) {
                    }
                    return wneVar3;
                }
                if (b4 == 1) {
                    z1x.P(obj);
                } else {
                    if (b4 == 2) {
                        z1x.P(obj);
                        objG = obj;
                        a5wVar5 = (a5w) objG;
                        z7u z7uVar3 = kd7Var.F;
                        List listC3 = kotlin.collections.a.c(a5wVar5);
                        this.j = a5wVar5;
                        this.l = (byte) 3;
                        objA3 = z7uVar3.a(listC3, this);
                        if (objA3 != wneVar3) {
                            list5 = (List) objA3;
                            this.j = a5wVar5;
                            this.k = list5;
                            this.l = (byte) 4;
                            List list17 = kd7.m0;
                            objW3 = kd7Var.W(a5wVar5, this);
                            if (objW3 != wneVar3) {
                                a5wVar6 = a5wVar5;
                                list6 = list5;
                            }
                        }
                        return wneVar3;
                    }
                    if (b4 == 3) {
                        a5wVar5 = this.j;
                        z1x.P(obj);
                        objA3 = obj;
                        list5 = (List) objA3;
                        this.j = a5wVar5;
                        this.k = list5;
                        this.l = (byte) 4;
                        List list18 = kd7.m0;
                        objW3 = kd7Var.W(a5wVar5, this);
                        if (objW3 != wneVar3) {
                            a5wVar6 = a5wVar5;
                            list6 = list5;
                        }
                        return wneVar3;
                    }
                    if (b4 != 4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list19 = this.k;
                    a5w a5wVar7 = this.j;
                    z1x.P(obj);
                    objW3 = obj;
                    list6 = list19;
                    a5wVar6 = a5wVar7;
                }
                z760Var3 = (z760) objW3;
                List list20 = kd7.m0;
                p7m0Var3 = kd7Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, rc7.a((rc7) value3, r9x.f30108a, false, a5wVar6, z760Var3, null, null, null, list6, null, false, false, false, 0L, 0L, 267910614)));
                return Unit.f46060a;
                lsn lsnVar = kd7Var.w;
                String str3 = kd7Var.o;
                int id = kd7Var.v.f17841a.b().getId();
                long j = kd7Var.p.b;
                this.l = (byte) 2;
                objG = ((nr) lsnVar.f20589a).g(id, j, this, str3);
                if (objG != wneVar3) {
                    a5wVar5 = (a5w) objG;
                    z7u z7uVar4 = kd7Var.F;
                    List listC4 = kotlin.collections.a.c(a5wVar5);
                    this.j = a5wVar5;
                    this.l = (byte) 3;
                    objA3 = z7uVar4.a(listC4, this);
                    if (objA3 != wneVar3) {
                        list5 = (List) objA3;
                        this.j = a5wVar5;
                        this.k = list5;
                        this.l = (byte) 4;
                        List list110 = kd7.m0;
                        objW3 = kd7Var.W(a5wVar5, this);
                        if (objW3 != wneVar3) {
                            a5wVar6 = a5wVar5;
                            list6 = list5;
                            z760Var3 = (z760) objW3;
                            List list21 = kd7.m0;
                            p7m0Var3 = kd7Var.i.f25029a;
                            do {
                                value3 = p7m0Var3.getValue();
                                value3.getClass();
                            } while (!p7m0Var3.m(value3, rc7.a((rc7) value3, r9x.f30108a, false, a5wVar6, z760Var3, null, null, null, list6, null, false, false, false, 0L, 0L, 267910614)));
                            return Unit.f46060a;
                        }
                    }
                }
                return wneVar3;
        }
    }
}
