package a;

import java.util.Collection;
import java.util.Iterator;
import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;

/* JADX INFO: loaded from: classes5.dex */
public final class mtt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22384a;
    public final pzu b;

    public /* synthetic */ mtt(pzu pzuVar, byte b) {
        this.f22384a = b;
        this.b = pzuVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0080  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x0127  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public final Object a(zje zjeVar) {
        ltt lttVar;
        byt bytVar;
        kzz kzzVar;
        int i;
        ptu ptuVar;
        byte b = this.f22384a;
        boolean z = false;
        pzu pzuVar = this.b;
        Object obj = null;
        switch (b) {
            case 0:
                if (zjeVar instanceof ltt) {
                    lttVar = (ltt) zjeVar;
                    int i2 = lttVar.k;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        lttVar.k = i2 - Integer.MIN_VALUE;
                    } else {
                        lttVar = new ltt(this, zjeVar);
                    }
                } else {
                    lttVar = new ltt(this, zjeVar);
                }
                Object objE = lttVar.i;
                Object obj2 = wne.f39444a;
                int i3 = lttVar.k;
                if (i3 == 0) {
                    z1x.P(objE);
                    lttVar.k = 1;
                    objE = pzuVar.E(lttVar);
                    if (objE == obj2) {
                        return obj2;
                    }
                } else {
                    if (i3 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(objE);
                }
                for (Object obj3 : (Iterable) objE) {
                    LimitTypeEnum limitTypeEnum = ((h85) obj3).b;
                    if (limitTypeEnum == LimitTypeEnum.BET_LIMIT_1_DAY || limitTypeEnum == LimitTypeEnum.BET_LIMIT_7_DAY || limitTypeEnum == LimitTypeEnum.BET_LIMIT_30_DAY) {
                        obj = obj3;
                        return Boolean.valueOf(obj != null);
                    }
                }
                return Boolean.valueOf(obj != null);
            case 1:
                if (zjeVar instanceof byt) {
                    bytVar = (byt) zjeVar;
                    int i4 = bytVar.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        bytVar.k = i4 - Integer.MIN_VALUE;
                    } else {
                        bytVar = new byt(this, zjeVar);
                    }
                } else {
                    bytVar = new byt(this, zjeVar);
                }
                Object objK = bytVar.i;
                Object obj4 = wne.f39444a;
                int i5 = bytVar.k;
                if (i5 == 0) {
                    z1x.P(objK);
                    bytVar.k = 1;
                    objK = pzuVar.K(bytVar);
                    if (objK == obj4) {
                        return obj4;
                    }
                } else {
                    if (i5 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(objK);
                }
                for (Object obj5 : (Iterable) objK) {
                    if (((kzz) obj5).f19172a == LimitTypeEnum.REALITY_CHECK) {
                        obj = obj5;
                        kzzVar = (kzz) obj;
                        if (kzzVar != null) {
                            i = (int) kzzVar.g;
                        } else {
                            i = 60;
                        }
                        return new Integer(i);
                    }
                }
                kzzVar = (kzz) obj;
                if (kzzVar != null) {
                    i = (int) kzzVar.g;
                } else {
                    i = 60;
                }
                return new Integer(i);
            default:
                if (zjeVar instanceof ptu) {
                    ptuVar = (ptu) zjeVar;
                    int i6 = ptuVar.k;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        ptuVar.k = i6 - Integer.MIN_VALUE;
                    } else {
                        ptuVar = new ptu(this, zjeVar);
                    }
                } else {
                    ptuVar = new ptu(this, zjeVar);
                }
                Object objE2 = ptuVar.i;
                Object obj6 = wne.f39444a;
                int i7 = ptuVar.k;
                if (i7 == 0) {
                    z1x.P(objE2);
                    ptuVar.k = 1;
                    objE2 = pzuVar.E(ptuVar);
                    if (objE2 == obj6) {
                        return obj6;
                    }
                } else {
                    if (i7 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(objE2);
                }
                Iterable iterable = (Iterable) objE2;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (((h85) it.next()).b == LimitTypeEnum.SESSION_TIME_LIMIT) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
