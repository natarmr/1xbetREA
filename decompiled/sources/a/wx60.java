package a;

import java.net.SocketTimeoutException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class wx60 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ dy60 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wx60(dy60 dy60Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dy60Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        dy60 dy60Var = this.k;
        switch (b) {
            case 0:
                wx60 wx60Var = new wx60(dy60Var, yjeVar, (byte) 0);
                wx60Var.j = ((Boolean) obj).booleanValue();
                return wx60Var;
            case 1:
                wx60 wx60Var2 = new wx60(dy60Var, yjeVar, (byte) 1);
                wx60Var2.j = ((Boolean) obj).booleanValue();
                return wx60Var2;
            default:
                return new wx60(dy60Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((wx60) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((wx60) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wx60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c7  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        qx60 qx60Var;
        List list;
        boolean z;
        Object value3;
        Object objB;
        byte b = this.i;
        dy60 dy60Var = this.k;
        switch (b) {
            case 0:
                boolean z2 = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = dy60.S;
                p7m0 p7m0Var = dy60Var.i.f25029a;
                while (true) {
                    Object value4 = p7m0Var.getValue();
                    value4.getClass();
                    qx60 qx60Var2 = (qx60) value4;
                    boolean z3 = z2;
                    if (p7m0Var.m(value4, qx60.a(qx60Var2, gep.a(qx60Var2.b, null, null, null, !z2, 7), null, false, false, z3, null, 221))) {
                        if (z3) {
                            dy60Var.Q();
                        }
                        return Unit.f46060a;
                    }
                    z2 = z3;
                }
                break;
            case 1:
                boolean z4 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                oyg0 oyg0Var = dy60Var.f;
                ocj ocjVar = dy60Var.i;
                boolean z5 = ((qx60) dy60Var.D()).d;
                boolean z6 = ((qx60) dy60Var.D()).c.f4274a == null;
                dy60Var.B.a(z4);
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                } while (!p7m0Var2.m(value, qx60.a((qx60) value, null, null, z4, z5, false, null, 231)));
                if (!z4) {
                    List list2 = ((qx60) dy60Var.D()).c.f4274a;
                    pat patVar = (pat) dy60Var.K.getValue();
                    patVar.getClass();
                    if (patVar instanceof oat) {
                        z = true;
                    } else {
                        pat patVar2 = (pat) dy60Var.L.getValue();
                        patVar2.getClass();
                        if (patVar2 instanceof oat) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (!(((qx60) dy60Var.D()).h instanceof sq60)) {
                        if (list2 == null || list2.isEmpty()) {
                            c4m0 c4m0Var = dy60Var.N;
                            if (c4m0Var != null) {
                                v3c.N(c4m0Var);
                            }
                            SocketTimeoutException socketTimeoutException = new SocketTimeoutException();
                            p7m0 p7m0Var3 = ocjVar.f25029a;
                            while (true) {
                                Object value5 = p7m0Var3.getValue();
                                value5.getClass();
                                oyg0Var.getClass();
                                SocketTimeoutException socketTimeoutException2 = socketTimeoutException;
                                if (!p7m0Var3.m(value5, qx60.a((qx60) value5, null, null, false, false, false, socketTimeoutException, 127))) {
                                    socketTimeoutException = socketTimeoutException2;
                                }
                            }
                        } else if (((qx60) dy60Var.D()).e && z) {
                            sq60 sq60Var = new sq60();
                            p7m0 p7m0Var4 = ocjVar.f25029a;
                            do {
                                value3 = p7m0Var4.getValue();
                                value3.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var4.m(value3, qx60.a((qx60) value3, null, null, false, false, false, sq60Var, 127)));
                        } else {
                            c4m0 c4m0Var2 = dy60Var.N;
                            if (c4m0Var2 != null) {
                                v3c.N(c4m0Var2);
                            }
                        }
                    }
                } else if (z4 && (z6 || ((qx60) dy60Var.D()).h != null)) {
                    p7m0 p7m0Var5 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var5.getValue();
                        value2.getClass();
                        qx60Var = (qx60) value2;
                        list = qx60Var.c.b;
                        list.getClass();
                    } while (!p7m0Var5.m(value2, qx60.a(qx60Var, null, new cfp(null, list), false, false, false, null, 123)));
                    dy60Var.N();
                } else if (z4) {
                    dy60Var.N();
                }
                return Unit.f46060a;
            default:
                wsf0 wsf0Var = dy60Var.q;
                wne wneVar3 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    ahu ahuVarY = ((g45) wsf0Var.b).y();
                    bm5 bm5Var = bm5.d;
                    this.j = true;
                    objB = ahuVarY.b(bm5Var, this);
                    if (objB == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                ql5 ql5Var = (ql5) objB;
                wsf0Var.s().l(bm5.d, ql5Var);
                dy60Var.x.a(dy60Var.o, true, ql5Var.f28916a);
                return Unit.f46060a;
        }
    }
}
