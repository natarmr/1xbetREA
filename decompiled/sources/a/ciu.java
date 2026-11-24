package a;

import java.util.Iterator;
import java.util.List;
import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;

/* JADX INFO: loaded from: classes5.dex */
public final class ciu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4431a;
    public final pzu b;

    public /* synthetic */ ciu(pzu pzuVar, byte b) {
        this.f4431a = b;
        this.b = pzuVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x007a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0101  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public Object a(zje zjeVar) {
        xhu xhuVar;
        Object next;
        itu ituVar;
        byte b = this.f4431a;
        pzu pzuVar = this.b;
        Object obj = null;
        switch (b) {
            case 0:
                dzz dzzVar = (dzz) pzuVar.b;
                if (zjeVar instanceof xhu) {
                    xhuVar = (xhu) zjeVar;
                    int i = xhuVar.k;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        xhuVar.k = i - Integer.MIN_VALUE;
                    } else {
                        xhuVar = new xhu(this, zjeVar);
                    }
                } else {
                    xhuVar = new xhu(this, zjeVar);
                }
                Object objK = xhuVar.i;
                wne wneVar = wne.f39444a;
                int i2 = xhuVar.k;
                if (i2 == 0) {
                    z1x.P(objK);
                    xhuVar.k = 1;
                    objK = pzuVar.K(xhuVar);
                    if (objK == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(objK);
                }
                List list = (List) objK;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        kzz kzzVar = (kzz) next;
                        if (kzzVar.f19172a != LimitTypeEnum.REALITY_CHECK || kzzVar.h != prz.ACTIVE) {
                        }
                    } else {
                        next = null;
                    }
                }
                kzz kzzVar2 = (kzz) next;
                if (kzzVar2 != null) {
                    uen uenVar = wen.b;
                    dzzVar.c = wen.e(ibc.w0(kzzVar2.g, bfn.MINUTES));
                }
                for (Object obj2 : list) {
                    kzz kzzVar3 = (kzz) obj2;
                    LimitTypeEnum limitTypeEnum = kzzVar3.f19172a;
                    if (limitTypeEnum == LimitTypeEnum.DEPOSIT_LIMIT_1_DAY || limitTypeEnum == LimitTypeEnum.DEPOSIT_LIMIT_7_DAY || limitTypeEnum == LimitTypeEnum.DEPOSIT_LIMIT_30_DAY) {
                        if (kzzVar3.h == prz.PENDING && kzzVar3.d) {
                            obj = obj2;
                            dzzVar.b = obj != null;
                            return objK;
                        }
                    }
                }
                dzzVar.b = obj != null;
                return objK;
            default:
                if (zjeVar instanceof itu) {
                    ituVar = (itu) zjeVar;
                    int i3 = ituVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ituVar.k = i3 - Integer.MIN_VALUE;
                    } else {
                        ituVar = new itu(this, zjeVar);
                    }
                } else {
                    ituVar = new itu(this, zjeVar);
                }
                Object objE = ituVar.i;
                Object obj3 = wne.f39444a;
                int i4 = ituVar.k;
                if (i4 == 0) {
                    z1x.P(objE);
                    ituVar.k = 1;
                    objE = pzuVar.E(ituVar);
                    if (objE == obj3) {
                        return obj3;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(objE);
                }
                for (Object obj4 : (Iterable) objE) {
                    if (((h85) obj4).b == LimitTypeEnum.SELF_EXCLUSION) {
                        obj = obj4;
                        return Boolean.valueOf(obj != null);
                    }
                }
                return Boolean.valueOf(obj != null);
        }
    }
}
