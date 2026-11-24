package a;

import java.io.Serializable;
import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;

/* JADX INFO: loaded from: classes5.dex */
public final class f5a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pzu f8952a;

    public Serializable a(int i, LimitTypeEnum limitTypeEnum, bnn0 bnn0Var) {
        return this.f8952a.q0(kotlin.collections.a.c(new q100(i, limitTypeEnum.f46888a)), bnn0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(zje zjeVar) {
        mtu mtuVar;
        if (zjeVar instanceof mtu) {
            mtuVar = (mtu) zjeVar;
            int i = mtuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                mtuVar.k = i - Integer.MIN_VALUE;
            } else {
                mtuVar = new mtu(this, zjeVar);
            }
        } else {
            mtuVar = new mtu(this, zjeVar);
        }
        Object objE = mtuVar.i;
        Object obj = wne.f39444a;
        int i2 = mtuVar.k;
        Object obj2 = null;
        if (i2 == 0) {
            z1x.P(objE);
            mtuVar.k = 1;
            objE = this.f8952a.E(mtuVar);
            if (objE == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objE);
        }
        for (Object obj3 : (Iterable) objE) {
            if (((h85) obj3).b == LimitTypeEnum.DEPOSIT_LIMIT_7_DAY) {
                obj2 = obj3;
                break;
            }
        }
        return Boolean.valueOf(obj2 != null);
    }
}
