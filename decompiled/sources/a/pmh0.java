package a;

import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.security.api.domain.models.SecretQuestionModel;

/* JADX INFO: loaded from: classes5.dex */
public final class pmh0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ qmh0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pmh0(qmh0 qmh0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = qmh0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        qmh0 qmh0Var = this.k;
        switch (b) {
            case 0:
                return new pmh0(qmh0Var, yjeVar, (byte) 0);
            default:
                return new pmh0(qmh0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((pmh0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        List listR0;
        Object value;
        byte b = this.i;
        qmh0 qmh0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    rsu rsuVar = qmh0Var.p;
                    this.j = true;
                    objA = rsuVar.a(this);
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
                List list = (List) objA;
                if (list.isEmpty()) {
                    listR0 = list;
                } else {
                    int i = qmh0.y;
                    listR0 = CollectionsKt.r0(list, new SecretQuestionModel(0, qmh0Var.v.b.a(R.string.ask_own_question, Arrays.copyOf(new Object[0], 0))));
                }
                rsu rsuVar2 = qmh0Var.r;
                rsuVar2.getClass();
                hmh0 hmh0Var = (hmh0) rsuVar2.f31050a.d;
                hmh0Var.getClass();
                hmh0Var.f13307a.o(null, list);
                p7m0 p7m0Var = qmh0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, mmh0.a((mmh0) value, klh0.f18488a, listR0, false, 0, null, null, null, false, null, 508)));
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    gmq gmqVarB = qmh0Var.u.b();
                    yng0 yng0Var = new yng0(qmh0Var, null, (byte) 5);
                    this.j = true;
                    Object objC = gmqVarB.c(new vnq(h660.f12515a, yng0Var, (byte) 2), this);
                    if (objC != wneVar2) {
                        objC = Unit.f46060a;
                    }
                    if (objC != wneVar2) {
                        objC = Unit.f46060a;
                    }
                    if (objC == wneVar2) {
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
        }
    }
}
