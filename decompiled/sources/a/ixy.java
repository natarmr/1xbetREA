package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ixy extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public byte k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ixy(int i, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                ixy ixyVar = new ixy(this.k, yjeVar, (byte) 0);
                ixyVar.j = obj;
                return ixyVar;
            case 1:
                ixy ixyVar2 = new ixy(this.k, yjeVar, (byte) 1);
                ixyVar2.j = obj;
                return ixyVar2;
            case 2:
                ixy ixyVar3 = new ixy(this.k, yjeVar, (byte) 2);
                ixyVar3.j = obj;
                return ixyVar3;
            default:
                ixy ixyVar4 = new ixy(2, yjeVar);
                ixyVar4.j = obj;
                return ixyVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ixy) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ixy) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ixy) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ixy) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        long j;
        kmq kmqVar;
        tgf0 tgf0Var;
        switch (this.i) {
            case 0:
                qpg0 qpg0Var = (qpg0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ0 = qpg0Var.Z0("select * from last_action where type = ?");
                try {
                    xpg0VarZ0.o(1, this.k);
                    int iP = x0x.P(xpg0VarZ0, ParameterNames.ID);
                    int iP2 = x0x.P(xpg0VarZ0, Payload.TYPE);
                    int iP3 = x0x.P(xpg0VarZ0, "date");
                    ArrayList arrayList = new ArrayList();
                    while (xpg0VarZ0.W0()) {
                        arrayList.add(new hxy((int) xpg0VarZ0.getLong(iP2), xpg0VarZ0.getLong(iP), xpg0VarZ0.getLong(iP3)));
                    }
                    xpg0VarZ0.close();
                    return arrayList;
                } catch (Throwable th) {
                    xpg0VarZ0.close();
                    throw th;
                }
            case 1:
                qpg0 qpg0Var2 = (qpg0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ1 = qpg0Var2.Z0("select count(*) from last_action where type = ?");
                try {
                    xpg0VarZ1.o(1, this.k);
                    if (xpg0VarZ1.W0()) {
                        j = xpg0VarZ1.getLong(0);
                        break;
                    } else {
                        j = 0;
                    }
                    return new Long(j);
                } finally {
                    xpg0VarZ1.close();
                }
            case 2:
                qpg0 qpg0Var3 = (qpg0) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ2 = qpg0Var3.Z0("select * from last_action where type = ?");
                try {
                    xpg0VarZ2.o(1, this.k);
                    int iP4 = x0x.P(xpg0VarZ2, ParameterNames.ID);
                    int iP5 = x0x.P(xpg0VarZ2, Payload.TYPE);
                    int iP6 = x0x.P(xpg0VarZ2, "date");
                    ArrayList arrayList2 = new ArrayList();
                    while (xpg0VarZ2.W0()) {
                        arrayList2.add(new hxy((int) xpg0VarZ2.getLong(iP5), xpg0VarZ2.getLong(iP4), xpg0VarZ2.getLong(iP6)));
                    }
                    xpg0VarZ2.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    xpg0VarZ2.close();
                    throw th2;
                }
            default:
                wne wneVar4 = wne.f39444a;
                byte b = this.k;
                if (b != 0) {
                    if (b == 1) {
                        kmqVar = (kmq) this.j;
                        z1x.P(obj);
                        tgf0Var = (tgf0) obj;
                    } else {
                        if (b != 2) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    return Unit.f46060a;
                }
                z1x.P(obj);
                kmqVar = (kmq) this.j;
                tgf0Var = null;
                yh80 yh80Var = new yh80(tgf0Var == tgf0.f33909a, zh80.c);
                this.j = null;
                this.k = (byte) 2;
                if (kmqVar.a(yh80Var, this) == wneVar4) {
                    return wneVar4;
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ixy(int i, yje yjeVar) {
        super(i, yjeVar);
        this.i = (byte) 3;
    }
}
