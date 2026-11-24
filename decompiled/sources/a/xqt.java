package a;

import kotlin.Unit;
import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;

/* JADX INFO: loaded from: classes5.dex */
public final class xqt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41339a;
    public final pzu b;

    public /* synthetic */ xqt(pzu pzuVar, byte b) {
        this.f41339a = b;
        this.b = pzuVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:53:0x00be  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public Object a(zje zjeVar) {
        sju sjuVar;
        zyu zyuVar;
        byte b = this.f41339a;
        pzu pzuVar = this.b;
        Object obj = null;
        switch (b) {
            case 1:
                if (zjeVar instanceof sju) {
                    sjuVar = (sju) zjeVar;
                    int i = sjuVar.k;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        sjuVar.k = i - Integer.MIN_VALUE;
                    } else {
                        sjuVar = new sju(this, zjeVar);
                    }
                } else {
                    sjuVar = new sju(this, zjeVar);
                }
                Object objE = sjuVar.i;
                Object obj2 = wne.f39444a;
                int i2 = sjuVar.k;
                if (i2 == 0) {
                    z1x.P(objE);
                    sjuVar.k = 1;
                    objE = pzuVar.E(sjuVar);
                    if (objE == obj2) {
                        return obj2;
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
                    if (limitTypeEnum == LimitTypeEnum.LOSE_LIMIT_1_DAY || limitTypeEnum == LimitTypeEnum.LOSE_LIMIT_7_DAY || limitTypeEnum == LimitTypeEnum.LOSE_LIMIT_30_DAY) {
                        obj = obj3;
                        return Boolean.valueOf(obj != null);
                    }
                }
                return Boolean.valueOf(obj != null);
            default:
                if (zjeVar instanceof zyu) {
                    zyuVar = (zyu) zjeVar;
                    int i3 = zyuVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        zyuVar.k = i3 - Integer.MIN_VALUE;
                    } else {
                        zyuVar = new zyu(this, zjeVar);
                    }
                } else {
                    zyuVar = new zyu(this, zjeVar);
                }
                Object objE2 = zyuVar.i;
                Object obj4 = wne.f39444a;
                int i4 = zyuVar.k;
                if (i4 == 0) {
                    z1x.P(objE2);
                    zyuVar.k = 1;
                    objE2 = pzuVar.E(zyuVar);
                    if (objE2 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(objE2);
                }
                for (Object obj5 : (Iterable) objE2) {
                    if (((h85) obj5).b == LimitTypeEnum.TIMEOUT) {
                        obj = obj5;
                        return Boolean.valueOf(obj != null);
                    }
                }
                return Boolean.valueOf(obj != null);
        }
    }

    public void b() {
        dzz dzzVar = (dzz) this.b.b;
        if (dzzVar.d == 0) {
            dzzVar.d = System.currentTimeMillis();
        }
        uen uenVar = wen.b;
        dzzVar.e = (int) wen.l(ibc.w0(System.currentTimeMillis() - dzzVar.f, bfn.MILLISECONDS), bfn.MINUTES);
        dzzVar.f = System.currentTimeMillis();
        dzzVar.g = System.currentTimeMillis();
        dzzVar.h = false;
        dzzVar.f6965a.f(Unit.f46060a);
    }
}
