package a;

import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;

/* JADX INFO: loaded from: classes5.dex */
public final class fpc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pzu f9921a;

    public /* synthetic */ fpc(pzu pzuVar) {
        this.f9921a = pzuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(zje zjeVar) {
        qgu qguVar;
        if (zjeVar instanceof qgu) {
            qguVar = (qgu) zjeVar;
            int i = qguVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                qguVar.k = i - Integer.MIN_VALUE;
            } else {
                qguVar = new qgu(this, zjeVar);
            }
        } else {
            qguVar = new qgu(this, zjeVar);
        }
        Object objE = qguVar.i;
        Object obj = wne.f39444a;
        int i2 = qguVar.k;
        Object obj2 = null;
        if (i2 == 0) {
            z1x.P(objE);
            qguVar.k = 1;
            objE = this.f9921a.E(qguVar);
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
            LimitTypeEnum limitTypeEnum = ((h85) obj3).b;
            if (limitTypeEnum == LimitTypeEnum.DEPOSIT_LIMIT_1_DAY || limitTypeEnum == LimitTypeEnum.DEPOSIT_LIMIT_7_DAY) {
                obj2 = obj3;
                break;
            }
        }
        return Boolean.valueOf(obj2 != null);
    }
}
