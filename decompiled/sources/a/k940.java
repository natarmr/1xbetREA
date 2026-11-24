package a;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class k940 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ m940 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k940(m940 m940Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = m940Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        m940 m940Var = this.k;
        switch (b) {
            case 0:
                return new k940(m940Var, yjeVar, (byte) 0);
            case 1:
                k940 k940Var = new k940(m940Var, yjeVar, (byte) 1);
                k940Var.j = ((Boolean) obj).booleanValue();
                return k940Var;
            default:
                return new k940(m940Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((k940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((k940) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((k940) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object value;
        Object objD0;
        Object value2;
        byte b = this.i;
        m940 m940Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    ahu ahuVar = m940Var.K;
                    this.j = true;
                    objB = ahuVar.b(bm5.f2822a, this);
                    if (objB == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                m940Var.o.d(new g940(m940Var, ((ql5) objB).f28916a, (byte) 1));
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!z2 && (((n940) m940Var.D()).f23121a instanceof c940)) {
                    p7m0 p7m0Var = m940Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, n940.a((n940) value, new b940(new UnknownHostException()), false, null, null, 14)));
                } else if (z2 && !(((n940) m940Var.D()).f23121a instanceof a940)) {
                    m940Var.M();
                }
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    erc ercVar = m940Var.D;
                    boolean z4 = m940Var.F.a().l0;
                    this.j = true;
                    pzu pzuVar = ercVar.f8273a;
                    mne mneVar = (mne) pzuVar.f;
                    if (z4) {
                        objD0 = qjj.d0(mneVar.b, new u52(pzuVar, 7467263L, (yje) null), this);
                    } else {
                        int offset = TimeZone.getDefault().getOffset(new Date().getTime());
                        long j = offset;
                        double d = j / 3600000;
                        double d2 = ((j / 60000) - (d * 60.0d)) / 60.0d;
                        objD0 = qjj.d0(mneVar.b, new vdc(pzuVar, offset < 0 ? d - Math.abs(d2) : d + d2, (yje) null, (byte) 4), this);
                    }
                    if (objD0 == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD0 = obj;
                }
                List list = (List) objD0;
                int i = m940.U;
                p7m0 p7m0Var2 = m940Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, n940.a((n940) value2, new a940(list), false, null, null, 12)));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!((z540) obj2).f43799a) {
                        arrayList.add(obj2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    sac.V(jiu0.a(m940Var), null, null, m940Var.B.b, new j940(m940Var, arrayList, null, (byte) 3), 11);
                }
                return Unit.f46060a;
        }
    }
}
