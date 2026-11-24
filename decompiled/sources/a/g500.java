package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;

/* JADX INFO: loaded from: classes5.dex */
public final class g500 extends w46 {
    public final i1w0 b;
    public final sa10 c;
    public final vd1 d;
    public final ctf0 e;
    public final wdu f;
    public final nou g;
    public final m0u h;
    public final ciu i;
    public final duj j;
    public final sff0 k;
    public final p7m0 l;
    public final p7m0 m;
    public final p7m0 n;
    public final ol60 o;
    public List p;
    public final c4m0 q;
    public bby r;

    public g500(i1w0 i1w0Var, pru pruVar, m1e m1eVar, sa10 sa10Var, vd1 vd1Var, ctf0 ctf0Var, wdu wduVar, nou nouVar, m0u m0uVar, ciu ciuVar, duj dujVar) {
        i1w0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        this.b = i1w0Var;
        this.c = sa10Var;
        this.d = vd1Var;
        this.e = ctf0Var;
        this.f = wduVar;
        this.g = nouVar;
        this.h = m0uVar;
        this.i = ciuVar;
        this.j = dujVar;
        this.k = pruVar.a();
        iun iunVar = iun.f15405a;
        this.l = q7m0.a(iunVar);
        this.m = q7m0.a(b500.f1979a);
        this.n = q7m0.a(Boolean.TRUE);
        this.o = new ol60(1, i99.b);
        this.p = iunVar;
        c4m0 c4m0Var = this.q;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            fnq fnqVar = new fnq(m1eVar.b(), new u88(this, null, (byte) 27), (byte) 4);
            rwj rwjVar = tvk.f34603a;
            this.q = slb.U(ulb.L(fnqVar, dvj.c), jiu0.a(this));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:109:0x020c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0223  */
    /* JADX WARN: Code duplicated, block: B:113:0x022e  */
    /* JADX WARN: Code duplicated, block: B:116:0x023a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0252  */
    /* JADX WARN: Code duplicated, block: B:125:0x0256  */
    /* JADX WARN: Code duplicated, block: B:128:0x026c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:149:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:152:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:154:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:161:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:162:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:164:0x0306  */
    /* JADX WARN: Code duplicated, block: B:168:0x0318  */
    /* JADX WARN: Code duplicated, block: B:178:0x0334  */
    /* JADX WARN: Code duplicated, block: B:179:0x0339  */
    /* JADX WARN: Code duplicated, block: B:183:0x0345  */
    /* JADX WARN: Code duplicated, block: B:186:0x034f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0367  */
    /* JADX WARN: Code duplicated, block: B:198:0x0378  */
    /* JADX WARN: Code duplicated, block: B:206:0x0390  */
    /* JADX WARN: Code duplicated, block: B:208:0x0398  */
    /* JADX WARN: Code duplicated, block: B:210:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:211:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:212:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:213:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:214:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:219:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:223:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x01c6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x032e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x0323 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x0312 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x038a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x0383 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x0372 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x0361 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x035a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x0349 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x0204 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x0234 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x02ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x02ed A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:45:0x0104  */
    /* JADX WARN: Code duplicated, block: B:46:0x010e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0118  */
    /* JADX WARN: Code duplicated, block: B:48:0x0122  */
    /* JADX WARN: Code duplicated, block: B:49:0x012c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0134  */
    /* JADX WARN: Code duplicated, block: B:52:0x013a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0141  */
    /* JADX WARN: Code duplicated, block: B:54:0x0148  */
    /* JADX WARN: Code duplicated, block: B:56:0x014f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0152  */
    /* JADX WARN: Code duplicated, block: B:58:0x0155  */
    /* JADX WARN: Code duplicated, block: B:59:0x0158  */
    /* JADX WARN: Code duplicated, block: B:60:0x015b  */
    /* JADX WARN: Code duplicated, block: B:61:0x015e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0161  */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX WARN: Code duplicated, block: B:64:0x0167  */
    /* JADX WARN: Code duplicated, block: B:65:0x016a  */
    /* JADX WARN: Code duplicated, block: B:66:0x016d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0170  */
    /* JADX WARN: Code duplicated, block: B:68:0x0173  */
    /* JADX WARN: Code duplicated, block: B:69:0x0176  */
    /* JADX WARN: Code duplicated, block: B:74:0x0188  */
    /* JADX WARN: Code duplicated, block: B:75:0x018c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0190  */
    /* JADX WARN: Code duplicated, block: B:77:0x0193 A[PHI: r14
  0x0193: PHI (r14v6 int) = (r14v5 int), (r14v10 int), (r14v11 int), (r14v12 int) binds: [B:71:0x0181, B:76:0x0190, B:75:0x018c, B:74:0x0188] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:86:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:93:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ec  */
    public final Object w(zje zjeVar) {
        e500 e500Var;
        m0u m0uVar;
        List list;
        List list2;
        String str;
        p7m0 p7m0Var;
        Serializable serializableT;
        String str2;
        p7m0 p7m0Var2;
        String str3;
        ArrayList arrayList;
        List list3;
        ctf0 ctf0Var;
        p7m0 p7m0Var3;
        Object srzVar;
        LimitTypeEnum limitTypeEnum;
        int iOrdinal;
        int i;
        String strF;
        String strP;
        int i2;
        String strP2;
        String strF2;
        Iterator it;
        Object next;
        kzz kzzVar;
        Iterator it2;
        Object next2;
        kzz kzzVar2;
        int i3;
        int i4;
        int i5;
        String strF3;
        kzz kzzVar3;
        Iterator it3;
        Object next3;
        kzz kzzVar4;
        kzz kzzVar5;
        prz przVar;
        Iterator it4;
        Object next4;
        kzz kzzVar6;
        int i6;
        Iterator it5;
        Object next5;
        kzz kzzVar7;
        Iterator it6;
        Object next6;
        kzz kzzVar8;
        long j;
        kzz kzzVar9;
        kzz kzzVar10;
        prz przVar2;
        Iterator it7;
        Object next7;
        kzz kzzVar11;
        Object srzVar2;
        if (zjeVar instanceof e500) {
            e500Var = (e500) zjeVar;
            int i7 = e500Var.n;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                e500Var.n = i7 - Integer.MIN_VALUE;
            } else {
                e500Var = new e500(this, zjeVar);
            }
        } else {
            e500Var = new e500(this, zjeVar);
        }
        Object objA = e500Var.l;
        wne wneVar = wne.f39444a;
        int i8 = e500Var.n;
        char c = 2;
        p7m0 p7m0Var4 = null;
        if (i8 == 0) {
            z1x.P(objA);
            e500Var.n = 1;
            objA = this.i.a(e500Var);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (i8 == 1) {
            z1x.P(objA);
        } else {
            if (i8 == 2) {
                m0uVar = (m0u) e500Var.j;
                list = e500Var.i;
                z1x.P(objA);
                long j2 = ((ql5) objA).e;
                e500Var.i = list;
                e500Var.j = null;
                e500Var.n = 3;
                objA = m0uVar.f20973a.c(j2, e500Var);
                if (objA != wneVar) {
                    list2 = list;
                    str = ((xuf) objA).f;
                    e500Var.i = list2;
                    e500Var.j = str;
                    p7m0Var = this.l;
                    e500Var.k = p7m0Var;
                    e500Var.n = 4;
                    serializableT = this.f.t(list2, e500Var);
                    if (serializableT != wneVar) {
                        str2 = str;
                        p7m0Var2 = p7m0Var;
                        objA = serializableT;
                        str3 = str2;
                        Iterable<enz> iterable = (Iterable) objA;
                        arrayList = new ArrayList(r3d.q(iterable, 10));
                        for (enz enzVar : iterable) {
                            enzVar.getClass();
                            ctf0Var = this.e;
                            ctf0Var.getClass();
                            list2.getClass();
                            str3.getClass();
                            p7m0Var3 = p7m0Var4;
                            switch (enzVar.ordinal()) {
                                case 0:
                                    srzVar = new srz(R.string.set_your_limits);
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    arrayList.add(srzVar);
                                    p7m0Var4 = p7m0Var3;
                                    c = 2;
                                    break;
                                case 1:
                                    srzVar = new k120();
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    arrayList.add(srzVar);
                                    p7m0Var4 = p7m0Var3;
                                    c = 2;
                                    break;
                                case 2:
                                    srzVar = new ws10();
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    arrayList.add(srzVar);
                                    p7m0Var4 = p7m0Var3;
                                    c = 2;
                                    break;
                                case 3:
                                    srzVar = new srz(R.string.bet_limit_title);
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    arrayList.add(srzVar);
                                    p7m0Var4 = p7m0Var3;
                                    c = 2;
                                    break;
                                case 4:
                                    srzVar = new rrz(R.string.bet_limit_title);
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    arrayList.add(srzVar);
                                    p7m0Var4 = p7m0Var3;
                                    c = 2;
                                    break;
                                case 5:
                                case 6:
                                case 7:
                                case 10:
                                case 11:
                                case 12:
                                case 15:
                                case 16:
                                case 17:
                                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                case 21:
                                case 23:
                                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                                    switch (enzVar.ordinal()) {
                                        case 5:
                                            limitTypeEnum = LimitTypeEnum.BET_LIMIT_1_DAY;
                                            break;
                                        case 6:
                                            limitTypeEnum = LimitTypeEnum.BET_LIMIT_7_DAY;
                                            break;
                                        case 7:
                                            limitTypeEnum = LimitTypeEnum.BET_LIMIT_30_DAY;
                                            break;
                                        case 8:
                                        case 9:
                                        case 13:
                                        case 14:
                                        case 18:
                                        case 20:
                                        case 22:
                                        case 24:
                                        default:
                                            limitTypeEnum = LimitTypeEnum.EMPTY;
                                            break;
                                        case 10:
                                            limitTypeEnum = LimitTypeEnum.LOSE_LIMIT_1_DAY;
                                            break;
                                        case 11:
                                            limitTypeEnum = LimitTypeEnum.LOSE_LIMIT_7_DAY;
                                            break;
                                        case 12:
                                            limitTypeEnum = LimitTypeEnum.LOSE_LIMIT_30_DAY;
                                            break;
                                        case 15:
                                            limitTypeEnum = LimitTypeEnum.DEPOSIT_LIMIT_1_DAY;
                                            break;
                                        case 16:
                                            limitTypeEnum = LimitTypeEnum.DEPOSIT_LIMIT_7_DAY;
                                            break;
                                        case 17:
                                            limitTypeEnum = LimitTypeEnum.DEPOSIT_LIMIT_30_DAY;
                                            break;
                                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                            limitTypeEnum = LimitTypeEnum.SELF_EXCLUSION;
                                            break;
                                        case 21:
                                            limitTypeEnum = LimitTypeEnum.REALITY_CHECK;
                                            break;
                                        case 23:
                                            limitTypeEnum = LimitTypeEnum.TIMEOUT;
                                            break;
                                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                                            limitTypeEnum = LimitTypeEnum.SESSION_TIME_LIMIT;
                                            break;
                                    }
                                    iOrdinal = limitTypeEnum.ordinal();
                                    i = R.string.limit_self_block_end_time;
                                    switch (iOrdinal) {
                                        case 0:
                                        case 10:
                                        case 12:
                                        case 13:
                                            strF = ctf0Var.f(i, new Object[0]);
                                            strP = "";
                                            switch (limitTypeEnum) {
                                                case null:
                                                    i2 = 0;
                                                    strF2 = "";
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str4 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str4, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                    break;
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    i2 = 0;
                                                    strP2 = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.ACTIVE);
                                                    strF2 = strP2;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str5 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str5, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                    break;
                                                case 10:
                                                    it = list2.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            next = it.next();
                                                            kzzVar = (kzz) next;
                                                            if (kzzVar.f19172a == LimitTypeEnum.SELF_EXCLUSION) {
                                                            }
                                                        } else {
                                                            next = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next) != null) {
                                                        strF2 = "";
                                                        i2 = 0;
                                                        it4 = list2.iterator();
                                                        while (true) {
                                                            if (it4.hasNext()) {
                                                                next4 = it4.next();
                                                                kzzVar10 = (kzz) next4;
                                                                if (kzzVar10.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next4 = p7m0Var3;
                                                            }
                                                        }
                                                        kzzVar6 = (kzz) next4;
                                                        if (kzzVar6 != null) {
                                                            i6 = kzzVar6.f;
                                                        } else {
                                                            i6 = i2;
                                                        }
                                                        switch (limitTypeEnum.ordinal()) {
                                                            case 1:
                                                            case 2:
                                                            case 3:
                                                            case 4:
                                                            case 5:
                                                            case 6:
                                                            case 7:
                                                            case 8:
                                                            case 9:
                                                                it5 = list2.iterator();
                                                                while (true) {
                                                                    if (it5.hasNext()) {
                                                                        next5 = it5.next();
                                                                        kzzVar7 = (kzz) next5;
                                                                        if (kzzVar7.f19172a == limitTypeEnum) {
                                                                        }
                                                                    } else {
                                                                        next5 = p7m0Var3;
                                                                    }
                                                                }
                                                                if (((kzz) next5) != null) {
                                                                    strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                                }
                                                                break;
                                                        }
                                                        String str6 = strP;
                                                        it6 = list2.iterator();
                                                        while (true) {
                                                            if (it6.hasNext()) {
                                                                next6 = it6.next();
                                                                kzzVar9 = (kzz) next6;
                                                                if (kzzVar9.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next6 = p7m0Var3;
                                                            }
                                                        }
                                                        kzzVar8 = (kzz) next6;
                                                        if (kzzVar8 != null) {
                                                            j = kzzVar8.f;
                                                        } else {
                                                            j = 0;
                                                        }
                                                        srzVar = new goz(limitTypeEnum, strF, strF2, i6, str6, j);
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                        arrayList.add(srzVar);
                                                        p7m0Var4 = p7m0Var3;
                                                        c = 2;
                                                    } else {
                                                        i2 = 0;
                                                        strP2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                        strF2 = strP2;
                                                        it4 = list2.iterator();
                                                        while (true) {
                                                            if (it4.hasNext()) {
                                                                next4 = it4.next();
                                                                kzzVar10 = (kzz) next4;
                                                                if (kzzVar10.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next4 = p7m0Var3;
                                                            }
                                                        }
                                                        kzzVar6 = (kzz) next4;
                                                        if (kzzVar6 != null) {
                                                            i6 = kzzVar6.f;
                                                        } else {
                                                            i6 = i2;
                                                        }
                                                        switch (limitTypeEnum.ordinal()) {
                                                            case 1:
                                                            case 2:
                                                            case 3:
                                                            case 4:
                                                            case 5:
                                                            case 6:
                                                            case 7:
                                                            case 8:
                                                            case 9:
                                                                it5 = list2.iterator();
                                                                while (true) {
                                                                    if (it5.hasNext()) {
                                                                        next5 = it5.next();
                                                                        kzzVar7 = (kzz) next5;
                                                                        if (kzzVar7.f19172a == limitTypeEnum) {
                                                                        }
                                                                    } else {
                                                                        next5 = p7m0Var3;
                                                                    }
                                                                }
                                                                if (((kzz) next5) != null) {
                                                                    strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                                }
                                                                break;
                                                        }
                                                        String str7 = strP;
                                                        it6 = list2.iterator();
                                                        while (true) {
                                                            if (it6.hasNext()) {
                                                                next6 = it6.next();
                                                                kzzVar9 = (kzz) next6;
                                                                if (kzzVar9.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next6 = p7m0Var3;
                                                            }
                                                        }
                                                        kzzVar8 = (kzz) next6;
                                                        if (kzzVar8 != null) {
                                                            j = kzzVar8.f;
                                                        } else {
                                                            j = 0;
                                                        }
                                                        srzVar = new goz(limitTypeEnum, strF, strF2, i6, str7, j);
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                        arrayList.add(srzVar);
                                                        p7m0Var4 = p7m0Var3;
                                                        c = 2;
                                                    }
                                                    break;
                                                case 11:
                                                    prz przVar3 = prz.ACTIVE;
                                                    it2 = list2.iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            next2 = it2.next();
                                                            kzzVar3 = (kzz) next2;
                                                            if (kzzVar3.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next2 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar2 = (kzz) next2;
                                                    gne0 gne0Var = nki0.b;
                                                    if (kzzVar2 != null) {
                                                        i3 = (int) kzzVar2.g;
                                                    } else {
                                                        i3 = 0;
                                                    }
                                                    gne0Var.getClass();
                                                    nki0 nki0VarD = gne0.d(i3);
                                                    i4 = nki0VarD.f23683a;
                                                    i5 = q6t0.f28218a[nki0VarD.ordinal()];
                                                    if (i5 != 1) {
                                                        strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                                    } else {
                                                        strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                                    }
                                                    strF2 = strF3;
                                                    i2 = 0;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str8 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str8, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                    break;
                                                case 12:
                                                    it3 = list2.iterator();
                                                    while (true) {
                                                        if (it3.hasNext()) {
                                                            next3 = it3.next();
                                                            kzzVar5 = (kzz) next3;
                                                            if (kzzVar5.f19172a == LimitTypeEnum.REALITY_CHECK) {
                                                            }
                                                        } else {
                                                            next3 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar4 = (kzz) next3;
                                                    if (kzzVar4 != null) {
                                                        strF3 = ctf0Var.f(R.string.reality_minute_v2, Integer.valueOf((int) kzzVar4.g));
                                                    } else {
                                                        strF3 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                    }
                                                    strF2 = strF3;
                                                    i2 = 0;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str9 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str9, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                    break;
                                                case 13:
                                                    it7 = list2.iterator();
                                                    while (true) {
                                                        if (it7.hasNext()) {
                                                            next7 = it7.next();
                                                            kzzVar11 = (kzz) next7;
                                                            if (kzzVar11.f19172a == LimitTypeEnum.TIMEOUT) {
                                                            }
                                                        } else {
                                                            next7 = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next7) != null) {
                                                        i2 = 0;
                                                        strF2 = "";
                                                    } else {
                                                        strF2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                        i2 = 0;
                                                    }
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str10 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str10, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                    break;
                                                default:
                                                    t9f.b();
                                                    return p7m0Var3;
                                            }
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                        case 11:
                                            i = R.string.limit_for_day;
                                            strF = ctf0Var.f(i, new Object[0]);
                                            strP = "";
                                            switch (limitTypeEnum) {
                                                case null:
                                                    i2 = 0;
                                                    strF2 = "";
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str11 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                    break;
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    i2 = 0;
                                                    strP2 = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.ACTIVE);
                                                    strF2 = strP2;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str12 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str12, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                    break;
                                                case 10:
                                                    it = list2.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            next = it.next();
                                                            kzzVar = (kzz) next;
                                                            if (kzzVar.f19172a == LimitTypeEnum.SELF_EXCLUSION) {
                                                            }
                                                        } else {
                                                            next = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next) != null) {
                                                        strF2 = "";
                                                        i2 = 0;
                                                        it4 = list2.iterator();
                                                        while (true) {
                                                            if (it4.hasNext()) {
                                                                next4 = it4.next();
                                                                kzzVar10 = (kzz) next4;
                                                                if (kzzVar10.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next4 = p7m0Var3;
                                                            }
                                                        }
                                                        kzzVar6 = (kzz) next4;
                                                        if (kzzVar6 != null) {
                                                            i6 = kzzVar6.f;
                                                        } else {
                                                            i6 = i2;
                                                        }
                                                        switch (limitTypeEnum.ordinal()) {
                                                            case 1:
                                                            case 2:
                                                            case 3:
                                                            case 4:
                                                            case 5:
                                                            case 6:
                                                            case 7:
                                                            case 8:
                                                            case 9:
                                                                it5 = list2.iterator();
                                                                while (true) {
                                                                    if (it5.hasNext()) {
                                                                        next5 = it5.next();
                                                                        kzzVar7 = (kzz) next5;
                                                                        if (kzzVar7.f19172a == limitTypeEnum) {
                                                                        }
                                                                    } else {
                                                                        next5 = p7m0Var3;
                                                                    }
                                                                }
                                                                if (((kzz) next5) != null) {
                                                                    strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                                }
                                                                break;
                                                        }
                                                        String str13 = strP;
                                                        it6 = list2.iterator();
                                                        while (true) {
                                                            if (it6.hasNext()) {
                                                                next6 = it6.next();
                                                                kzzVar9 = (kzz) next6;
                                                                if (kzzVar9.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next6 = p7m0Var3;
                                                            }
                                                        }
                                                        kzzVar8 = (kzz) next6;
                                                        if (kzzVar8 != null) {
                                                            j = kzzVar8.f;
                                                        } else {
                                                            j = 0;
                                                        }
                                                        srzVar = new goz(limitTypeEnum, strF, strF2, i6, str13, j);
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                        arrayList.add(srzVar);
                                                        p7m0Var4 = p7m0Var3;
                                                        c = 2;
                                                    } else {
                                                        i2 = 0;
                                                        strP2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                        strF2 = strP2;
                                                        it4 = list2.iterator();
                                                        while (true) {
                                                            if (it4.hasNext()) {
                                                                next4 = it4.next();
                                                                kzzVar10 = (kzz) next4;
                                                                if (kzzVar10.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next4 = p7m0Var3;
                                                            }
                                                        }
                                                        kzzVar6 = (kzz) next4;
                                                        if (kzzVar6 != null) {
                                                            i6 = kzzVar6.f;
                                                        } else {
                                                            i6 = i2;
                                                        }
                                                        switch (limitTypeEnum.ordinal()) {
                                                            case 1:
                                                            case 2:
                                                            case 3:
                                                            case 4:
                                                            case 5:
                                                            case 6:
                                                            case 7:
                                                            case 8:
                                                            case 9:
                                                                it5 = list2.iterator();
                                                                while (true) {
                                                                    if (it5.hasNext()) {
                                                                        next5 = it5.next();
                                                                        kzzVar7 = (kzz) next5;
                                                                        if (kzzVar7.f19172a == limitTypeEnum) {
                                                                        }
                                                                    } else {
                                                                        next5 = p7m0Var3;
                                                                    }
                                                                }
                                                                if (((kzz) next5) != null) {
                                                                    strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                                }
                                                                break;
                                                        }
                                                        String str14 = strP;
                                                        it6 = list2.iterator();
                                                        while (true) {
                                                            if (it6.hasNext()) {
                                                                next6 = it6.next();
                                                                kzzVar9 = (kzz) next6;
                                                                if (kzzVar9.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next6 = p7m0Var3;
                                                            }
                                                        }
                                                        kzzVar8 = (kzz) next6;
                                                        if (kzzVar8 != null) {
                                                            j = kzzVar8.f;
                                                        } else {
                                                            j = 0;
                                                        }
                                                        srzVar = new goz(limitTypeEnum, strF, strF2, i6, str14, j);
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                        arrayList.add(srzVar);
                                                        p7m0Var4 = p7m0Var3;
                                                        c = 2;
                                                    }
                                                    break;
                                                case 11:
                                                    prz przVar4 = prz.ACTIVE;
                                                    it2 = list2.iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            next2 = it2.next();
                                                            kzzVar3 = (kzz) next2;
                                                            if (kzzVar3.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next2 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar2 = (kzz) next2;
                                                    gne0 gne0Var2 = nki0.b;
                                                    if (kzzVar2 != null) {
                                                        i3 = (int) kzzVar2.g;
                                                    } else {
                                                        i3 = 0;
                                                    }
                                                    gne0Var2.getClass();
                                                    nki0 nki0VarD2 = gne0.d(i3);
                                                    i4 = nki0VarD2.f23683a;
                                                    i5 = q6t0.f28218a[nki0VarD2.ordinal()];
                                                    if (i5 != 1) {
                                                        strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                                    } else {
                                                        strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                                    }
                                                    strF2 = strF3;
                                                    i2 = 0;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str15 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str15, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                    break;
                                                case 12:
                                                    it3 = list2.iterator();
                                                    while (true) {
                                                        if (it3.hasNext()) {
                                                            next3 = it3.next();
                                                            kzzVar5 = (kzz) next3;
                                                            if (kzzVar5.f19172a == LimitTypeEnum.REALITY_CHECK) {
                                                            }
                                                        } else {
                                                            next3 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar4 = (kzz) next3;
                                                    if (kzzVar4 != null) {
                                                        strF3 = ctf0Var.f(R.string.reality_minute_v2, Integer.valueOf((int) kzzVar4.g));
                                                    } else {
                                                        strF3 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                    }
                                                    strF2 = strF3;
                                                    i2 = 0;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str16 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str16, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                    break;
                                                case 13:
                                                    it7 = list2.iterator();
                                                    while (true) {
                                                        if (it7.hasNext()) {
                                                            next7 = it7.next();
                                                            kzzVar11 = (kzz) next7;
                                                            if (kzzVar11.f19172a == LimitTypeEnum.TIMEOUT) {
                                                            }
                                                        } else {
                                                            next7 = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next7) != null) {
                                                        i2 = 0;
                                                        strF2 = "";
                                                    } else {
                                                        strF2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                        i2 = 0;
                                                    }
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str17 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str17, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                    break;
                                                default:
                                                    t9f.b();
                                                    return p7m0Var3;
                                            }
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i = R.string.limit_for_week;
                                            strF = ctf0Var.f(i, new Object[0]);
                                            strP = "";
                                            switch (limitTypeEnum) {
                                                case null:
                                                    i2 = 0;
                                                    strF2 = "";
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str18 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str18, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                    break;
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    i2 = 0;
                                                    strP2 = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.ACTIVE);
                                                    strF2 = strP2;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str19 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str19, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                    break;
                                                case 10:
                                                    it = list2.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            next = it.next();
                                                            kzzVar = (kzz) next;
                                                            if (kzzVar.f19172a == LimitTypeEnum.SELF_EXCLUSION) {
                                                            }
                                                        } else {
                                                            next = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next) != null) {
                                                        strF2 = "";
                                                        i2 = 0;
                                                        it4 = list2.iterator();
                                                        while (true) {
                                                            if (it4.hasNext()) {
                                                                next4 = it4.next();
                                                                kzzVar10 = (kzz) next4;
                                                                if (kzzVar10.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next4 = p7m0Var3;
                                                            }
                                                        }
                                                        kzzVar6 = (kzz) next4;
                                                        if (kzzVar6 != null) {
                                                            i6 = kzzVar6.f;
                                                        } else {
                                                            i6 = i2;
                                                        }
                                                        switch (limitTypeEnum.ordinal()) {
                                                            case 1:
                                                            case 2:
                                                            case 3:
                                                            case 4:
                                                            case 5:
                                                            case 6:
                                                            case 7:
                                                            case 8:
                                                            case 9:
                                                                it5 = list2.iterator();
                                                                while (true) {
                                                                    if (it5.hasNext()) {
                                                                        next5 = it5.next();
                                                                        kzzVar7 = (kzz) next5;
                                                                        if (kzzVar7.f19172a == limitTypeEnum) {
                                                                        }
                                                                    } else {
                                                                        next5 = p7m0Var3;
                                                                    }
                                                                }
                                                                if (((kzz) next5) != null) {
                                                                    strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                                }
                                                                break;
                                                        }
                                                        String str110 = strP;
                                                        it6 = list2.iterator();
                                                        while (true) {
                                                            if (it6.hasNext()) {
                                                                next6 = it6.next();
                                                                kzzVar9 = (kzz) next6;
                                                                if (kzzVar9.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next6 = p7m0Var3;
                                                            }
                                                        }
                                                        kzzVar8 = (kzz) next6;
                                                        if (kzzVar8 != null) {
                                                            j = kzzVar8.f;
                                                        } else {
                                                            j = 0;
                                                        }
                                                        srzVar = new goz(limitTypeEnum, strF, strF2, i6, str110, j);
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                        arrayList.add(srzVar);
                                                        p7m0Var4 = p7m0Var3;
                                                        c = 2;
                                                    } else {
                                                        i2 = 0;
                                                        strP2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                        strF2 = strP2;
                                                        it4 = list2.iterator();
                                                        while (true) {
                                                            if (it4.hasNext()) {
                                                                next4 = it4.next();
                                                                kzzVar10 = (kzz) next4;
                                                                if (kzzVar10.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next4 = p7m0Var3;
                                                            }
                                                        }
                                                        kzzVar6 = (kzz) next4;
                                                        if (kzzVar6 != null) {
                                                            i6 = kzzVar6.f;
                                                        } else {
                                                            i6 = i2;
                                                        }
                                                        switch (limitTypeEnum.ordinal()) {
                                                            case 1:
                                                            case 2:
                                                            case 3:
                                                            case 4:
                                                            case 5:
                                                            case 6:
                                                            case 7:
                                                            case 8:
                                                            case 9:
                                                                it5 = list2.iterator();
                                                                while (true) {
                                                                    if (it5.hasNext()) {
                                                                        next5 = it5.next();
                                                                        kzzVar7 = (kzz) next5;
                                                                        if (kzzVar7.f19172a == limitTypeEnum) {
                                                                        }
                                                                    } else {
                                                                        next5 = p7m0Var3;
                                                                    }
                                                                }
                                                                if (((kzz) next5) != null) {
                                                                    strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                                }
                                                                break;
                                                        }
                                                        String str111 = strP;
                                                        it6 = list2.iterator();
                                                        while (true) {
                                                            if (it6.hasNext()) {
                                                                next6 = it6.next();
                                                                kzzVar9 = (kzz) next6;
                                                                if (kzzVar9.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next6 = p7m0Var3;
                                                            }
                                                        }
                                                        kzzVar8 = (kzz) next6;
                                                        if (kzzVar8 != null) {
                                                            j = kzzVar8.f;
                                                        } else {
                                                            j = 0;
                                                        }
                                                        srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111, j);
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                        arrayList.add(srzVar);
                                                        p7m0Var4 = p7m0Var3;
                                                        c = 2;
                                                    }
                                                    break;
                                                case 11:
                                                    prz przVar5 = prz.ACTIVE;
                                                    it2 = list2.iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            next2 = it2.next();
                                                            kzzVar3 = (kzz) next2;
                                                            if (kzzVar3.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next2 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar2 = (kzz) next2;
                                                    gne0 gne0Var3 = nki0.b;
                                                    if (kzzVar2 != null) {
                                                        i3 = (int) kzzVar2.g;
                                                    } else {
                                                        i3 = 0;
                                                    }
                                                    gne0Var3.getClass();
                                                    nki0 nki0VarD3 = gne0.d(i3);
                                                    i4 = nki0VarD3.f23683a;
                                                    i5 = q6t0.f28218a[nki0VarD3.ordinal()];
                                                    if (i5 != 1) {
                                                        strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                                    } else {
                                                        strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                                    }
                                                    strF2 = strF3;
                                                    i2 = 0;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str112 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str112, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                    break;
                                                case 12:
                                                    it3 = list2.iterator();
                                                    while (true) {
                                                        if (it3.hasNext()) {
                                                            next3 = it3.next();
                                                            kzzVar5 = (kzz) next3;
                                                            if (kzzVar5.f19172a == LimitTypeEnum.REALITY_CHECK) {
                                                            }
                                                        } else {
                                                            next3 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar4 = (kzz) next3;
                                                    if (kzzVar4 != null) {
                                                        strF3 = ctf0Var.f(R.string.reality_minute_v2, Integer.valueOf((int) kzzVar4.g));
                                                    } else {
                                                        strF3 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                    }
                                                    strF2 = strF3;
                                                    i2 = 0;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str113 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str113, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                    break;
                                                case 13:
                                                    it7 = list2.iterator();
                                                    while (true) {
                                                        if (it7.hasNext()) {
                                                            next7 = it7.next();
                                                            kzzVar11 = (kzz) next7;
                                                            if (kzzVar11.f19172a == LimitTypeEnum.TIMEOUT) {
                                                            }
                                                        } else {
                                                            next7 = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next7) != null) {
                                                        i2 = 0;
                                                        strF2 = "";
                                                    } else {
                                                        strF2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                        i2 = 0;
                                                    }
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str114 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str114, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                    break;
                                                default:
                                                    t9f.b();
                                                    return p7m0Var3;
                                            }
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i = R.string.limit_for_month;
                                            strF = ctf0Var.f(i, new Object[0]);
                                            strP = "";
                                            switch (limitTypeEnum) {
                                                case null:
                                                    i2 = 0;
                                                    strF2 = "";
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str115 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str115, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                    break;
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    i2 = 0;
                                                    strP2 = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.ACTIVE);
                                                    strF2 = strP2;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str116 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str116, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                    break;
                                                case 10:
                                                    it = list2.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            next = it.next();
                                                            kzzVar = (kzz) next;
                                                            if (kzzVar.f19172a == LimitTypeEnum.SELF_EXCLUSION) {
                                                            }
                                                        } else {
                                                            next = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next) != null) {
                                                        strF2 = "";
                                                        i2 = 0;
                                                        it4 = list2.iterator();
                                                        while (true) {
                                                            if (it4.hasNext()) {
                                                                next4 = it4.next();
                                                                kzzVar10 = (kzz) next4;
                                                                if (kzzVar10.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next4 = p7m0Var3;
                                                            }
                                                        }
                                                        kzzVar6 = (kzz) next4;
                                                        if (kzzVar6 != null) {
                                                            i6 = kzzVar6.f;
                                                        } else {
                                                            i6 = i2;
                                                        }
                                                        switch (limitTypeEnum.ordinal()) {
                                                            case 1:
                                                            case 2:
                                                            case 3:
                                                            case 4:
                                                            case 5:
                                                            case 6:
                                                            case 7:
                                                            case 8:
                                                            case 9:
                                                                it5 = list2.iterator();
                                                                while (true) {
                                                                    if (it5.hasNext()) {
                                                                        next5 = it5.next();
                                                                        kzzVar7 = (kzz) next5;
                                                                        if (kzzVar7.f19172a == limitTypeEnum) {
                                                                        }
                                                                    } else {
                                                                        next5 = p7m0Var3;
                                                                    }
                                                                }
                                                                if (((kzz) next5) != null) {
                                                                    strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                                }
                                                                break;
                                                        }
                                                        String str117 = strP;
                                                        it6 = list2.iterator();
                                                        while (true) {
                                                            if (it6.hasNext()) {
                                                                next6 = it6.next();
                                                                kzzVar9 = (kzz) next6;
                                                                if (kzzVar9.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next6 = p7m0Var3;
                                                            }
                                                        }
                                                        kzzVar8 = (kzz) next6;
                                                        if (kzzVar8 != null) {
                                                            j = kzzVar8.f;
                                                        } else {
                                                            j = 0;
                                                        }
                                                        srzVar = new goz(limitTypeEnum, strF, strF2, i6, str117, j);
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                        arrayList.add(srzVar);
                                                        p7m0Var4 = p7m0Var3;
                                                        c = 2;
                                                    } else {
                                                        i2 = 0;
                                                        strP2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                        strF2 = strP2;
                                                        it4 = list2.iterator();
                                                        while (true) {
                                                            if (it4.hasNext()) {
                                                                next4 = it4.next();
                                                                kzzVar10 = (kzz) next4;
                                                                if (kzzVar10.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next4 = p7m0Var3;
                                                            }
                                                        }
                                                        kzzVar6 = (kzz) next4;
                                                        if (kzzVar6 != null) {
                                                            i6 = kzzVar6.f;
                                                        } else {
                                                            i6 = i2;
                                                        }
                                                        switch (limitTypeEnum.ordinal()) {
                                                            case 1:
                                                            case 2:
                                                            case 3:
                                                            case 4:
                                                            case 5:
                                                            case 6:
                                                            case 7:
                                                            case 8:
                                                            case 9:
                                                                it5 = list2.iterator();
                                                                while (true) {
                                                                    if (it5.hasNext()) {
                                                                        next5 = it5.next();
                                                                        kzzVar7 = (kzz) next5;
                                                                        if (kzzVar7.f19172a == limitTypeEnum) {
                                                                        }
                                                                    } else {
                                                                        next5 = p7m0Var3;
                                                                    }
                                                                }
                                                                if (((kzz) next5) != null) {
                                                                    strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                                }
                                                                break;
                                                        }
                                                        String str118 = strP;
                                                        it6 = list2.iterator();
                                                        while (true) {
                                                            if (it6.hasNext()) {
                                                                next6 = it6.next();
                                                                kzzVar9 = (kzz) next6;
                                                                if (kzzVar9.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next6 = p7m0Var3;
                                                            }
                                                        }
                                                        kzzVar8 = (kzz) next6;
                                                        if (kzzVar8 != null) {
                                                            j = kzzVar8.f;
                                                        } else {
                                                            j = 0;
                                                        }
                                                        srzVar = new goz(limitTypeEnum, strF, strF2, i6, str118, j);
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                        arrayList.add(srzVar);
                                                        p7m0Var4 = p7m0Var3;
                                                        c = 2;
                                                    }
                                                    break;
                                                case 11:
                                                    prz przVar6 = prz.ACTIVE;
                                                    it2 = list2.iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            next2 = it2.next();
                                                            kzzVar3 = (kzz) next2;
                                                            if (kzzVar3.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next2 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar2 = (kzz) next2;
                                                    gne0 gne0Var4 = nki0.b;
                                                    if (kzzVar2 != null) {
                                                        i3 = (int) kzzVar2.g;
                                                    } else {
                                                        i3 = 0;
                                                    }
                                                    gne0Var4.getClass();
                                                    nki0 nki0VarD4 = gne0.d(i3);
                                                    i4 = nki0VarD4.f23683a;
                                                    i5 = q6t0.f28218a[nki0VarD4.ordinal()];
                                                    if (i5 != 1) {
                                                        strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                                    } else {
                                                        strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                                    }
                                                    strF2 = strF3;
                                                    i2 = 0;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str119 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str119, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                    break;
                                                case 12:
                                                    it3 = list2.iterator();
                                                    while (true) {
                                                        if (it3.hasNext()) {
                                                            next3 = it3.next();
                                                            kzzVar5 = (kzz) next3;
                                                            if (kzzVar5.f19172a == LimitTypeEnum.REALITY_CHECK) {
                                                            }
                                                        } else {
                                                            next3 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar4 = (kzz) next3;
                                                    if (kzzVar4 != null) {
                                                        strF3 = ctf0Var.f(R.string.reality_minute_v2, Integer.valueOf((int) kzzVar4.g));
                                                    } else {
                                                        strF3 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                    }
                                                    strF2 = strF3;
                                                    i2 = 0;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str1110 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1110, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                    break;
                                                case 13:
                                                    it7 = list2.iterator();
                                                    while (true) {
                                                        if (it7.hasNext()) {
                                                            next7 = it7.next();
                                                            kzzVar11 = (kzz) next7;
                                                            if (kzzVar11.f19172a == LimitTypeEnum.TIMEOUT) {
                                                            }
                                                        } else {
                                                            next7 = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next7) != null) {
                                                        i2 = 0;
                                                        strF2 = "";
                                                    } else {
                                                        strF2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                        i2 = 0;
                                                    }
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str1111 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1111, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                    break;
                                                default:
                                                    t9f.b();
                                                    return p7m0Var3;
                                            }
                                            break;
                                        default:
                                            t9f.b();
                                            return p7m0Var3;
                                    }
                                    break;
                                case 8:
                                    srzVar = new srz(R.string.lose_limit_title);
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    arrayList.add(srzVar);
                                    p7m0Var4 = p7m0Var3;
                                    c = 2;
                                    break;
                                case 9:
                                    srzVar = new rrz(R.string.lose_limit_title);
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    arrayList.add(srzVar);
                                    p7m0Var4 = p7m0Var3;
                                    c = 2;
                                    break;
                                case 13:
                                    srzVar2 = new srz(R.string.deposit_limits_title);
                                    break;
                                case 14:
                                    srzVar2 = new rrz(R.string.deposit_limits_title);
                                    break;
                                case 18:
                                    srzVar = new srz(R.string.limit_self_block);
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    arrayList.add(srzVar);
                                    p7m0Var4 = p7m0Var3;
                                    c = 2;
                                    break;
                                case 20:
                                    srzVar = new srz(R.string.reality_title);
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    arrayList.add(srzVar);
                                    p7m0Var4 = p7m0Var3;
                                    c = 2;
                                    break;
                                case 22:
                                    srzVar = new srz(R.string.timeout_title);
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    arrayList.add(srzVar);
                                    p7m0Var4 = p7m0Var3;
                                    c = 2;
                                    break;
                                case 24:
                                    srzVar = new srz(R.string.limit_for_session_time);
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    arrayList.add(srzVar);
                                    p7m0Var4 = p7m0Var3;
                                    c = 2;
                                    break;
                                default:
                                    t9f.b();
                                    return p7m0Var3;
                            }
                            srzVar = srzVar2;
                            arrayList.add(srzVar);
                            p7m0Var4 = p7m0Var3;
                            c = 2;
                        }
                        p7m0 p7m0Var5 = p7m0Var4;
                        e500Var.i = list2;
                        e500Var.j = p7m0Var5;
                        e500Var.k = p7m0Var5;
                        e500Var.n = 5;
                        p7m0Var2.getClass();
                        p7m0Var2.o(p7m0Var5, arrayList);
                        if (Unit.f46060a != wneVar) {
                            list3 = list2;
                        }
                    }
                }
                return wneVar;
            }
            if (i8 == 3) {
                list2 = e500Var.i;
                z1x.P(objA);
                str = ((xuf) objA).f;
                e500Var.i = list2;
                e500Var.j = str;
                p7m0Var = this.l;
                e500Var.k = p7m0Var;
                e500Var.n = 4;
                serializableT = this.f.t(list2, e500Var);
                if (serializableT != wneVar) {
                    str2 = str;
                    p7m0Var2 = p7m0Var;
                    objA = serializableT;
                    str3 = str2;
                    Iterable<enz> iterable2 = (Iterable) objA;
                    arrayList = new ArrayList(r3d.q(iterable2, 10));
                    while (r1.hasNext()) {
                        enzVar.getClass();
                        ctf0Var = this.e;
                        ctf0Var.getClass();
                        list2.getClass();
                        str3.getClass();
                        p7m0Var3 = p7m0Var4;
                        switch (enzVar.ordinal()) {
                            case 0:
                                srzVar = new srz(R.string.set_your_limits);
                                continue;
                                continue;
                                continue;
                                continue;
                                arrayList.add(srzVar);
                                p7m0Var4 = p7m0Var3;
                                c = 2;
                                break;
                            case 1:
                                srzVar = new k120();
                                continue;
                                continue;
                                continue;
                                continue;
                                arrayList.add(srzVar);
                                p7m0Var4 = p7m0Var3;
                                c = 2;
                                break;
                            case 2:
                                srzVar = new ws10();
                                continue;
                                continue;
                                continue;
                                continue;
                                arrayList.add(srzVar);
                                p7m0Var4 = p7m0Var3;
                                c = 2;
                                break;
                            case 3:
                                srzVar = new srz(R.string.bet_limit_title);
                                continue;
                                continue;
                                continue;
                                continue;
                                arrayList.add(srzVar);
                                p7m0Var4 = p7m0Var3;
                                c = 2;
                                break;
                            case 4:
                                srzVar = new rrz(R.string.bet_limit_title);
                                continue;
                                continue;
                                continue;
                                continue;
                                arrayList.add(srzVar);
                                p7m0Var4 = p7m0Var3;
                                c = 2;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 10:
                            case 11:
                            case 12:
                            case 15:
                            case 16:
                            case 17:
                            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                            case 21:
                            case 23:
                            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                                switch (enzVar.ordinal()) {
                                    case 5:
                                        limitTypeEnum = LimitTypeEnum.BET_LIMIT_1_DAY;
                                        break;
                                    case 6:
                                        limitTypeEnum = LimitTypeEnum.BET_LIMIT_7_DAY;
                                        break;
                                    case 7:
                                        limitTypeEnum = LimitTypeEnum.BET_LIMIT_30_DAY;
                                        break;
                                    case 8:
                                    case 9:
                                    case 13:
                                    case 14:
                                    case 18:
                                    case 20:
                                    case 22:
                                    case 24:
                                    default:
                                        limitTypeEnum = LimitTypeEnum.EMPTY;
                                        break;
                                    case 10:
                                        limitTypeEnum = LimitTypeEnum.LOSE_LIMIT_1_DAY;
                                        break;
                                    case 11:
                                        limitTypeEnum = LimitTypeEnum.LOSE_LIMIT_7_DAY;
                                        break;
                                    case 12:
                                        limitTypeEnum = LimitTypeEnum.LOSE_LIMIT_30_DAY;
                                        break;
                                    case 15:
                                        limitTypeEnum = LimitTypeEnum.DEPOSIT_LIMIT_1_DAY;
                                        break;
                                    case 16:
                                        limitTypeEnum = LimitTypeEnum.DEPOSIT_LIMIT_7_DAY;
                                        break;
                                    case 17:
                                        limitTypeEnum = LimitTypeEnum.DEPOSIT_LIMIT_30_DAY;
                                        break;
                                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                        limitTypeEnum = LimitTypeEnum.SELF_EXCLUSION;
                                        break;
                                    case 21:
                                        limitTypeEnum = LimitTypeEnum.REALITY_CHECK;
                                        break;
                                    case 23:
                                        limitTypeEnum = LimitTypeEnum.TIMEOUT;
                                        break;
                                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                                        limitTypeEnum = LimitTypeEnum.SESSION_TIME_LIMIT;
                                        break;
                                }
                                iOrdinal = limitTypeEnum.ordinal();
                                i = R.string.limit_self_block_end_time;
                                switch (iOrdinal) {
                                    case 0:
                                    case 10:
                                    case 12:
                                    case 13:
                                        strF = ctf0Var.f(i, new Object[0]);
                                        strP = "";
                                        switch (limitTypeEnum) {
                                            case null:
                                                i2 = 0;
                                                strF2 = "";
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str1112 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1112, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 9:
                                                i2 = 0;
                                                strP2 = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.ACTIVE);
                                                strF2 = strP2;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str1113 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1113, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 10:
                                                it = list2.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        next = it.next();
                                                        kzzVar = (kzz) next;
                                                        if (kzzVar.f19172a == LimitTypeEnum.SELF_EXCLUSION) {
                                                        }
                                                    } else {
                                                        next = p7m0Var3;
                                                    }
                                                }
                                                if (((kzz) next) != null) {
                                                    strF2 = "";
                                                    i2 = 0;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str1114 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1114, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                } else {
                                                    i2 = 0;
                                                    strP2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                    strF2 = strP2;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str1115 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1115, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                }
                                                break;
                                            case 11:
                                                prz przVar7 = prz.ACTIVE;
                                                it2 = list2.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        next2 = it2.next();
                                                        kzzVar3 = (kzz) next2;
                                                        if (kzzVar3.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next2 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar2 = (kzz) next2;
                                                gne0 gne0Var5 = nki0.b;
                                                if (kzzVar2 != null) {
                                                    i3 = (int) kzzVar2.g;
                                                } else {
                                                    i3 = 0;
                                                }
                                                gne0Var5.getClass();
                                                nki0 nki0VarD5 = gne0.d(i3);
                                                i4 = nki0VarD5.f23683a;
                                                i5 = q6t0.f28218a[nki0VarD5.ordinal()];
                                                if (i5 != 1) {
                                                    strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                                } else {
                                                    strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                                }
                                                strF2 = strF3;
                                                i2 = 0;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str1116 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1116, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 12:
                                                it3 = list2.iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        next3 = it3.next();
                                                        kzzVar5 = (kzz) next3;
                                                        if (kzzVar5.f19172a == LimitTypeEnum.REALITY_CHECK) {
                                                        }
                                                    } else {
                                                        next3 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar4 = (kzz) next3;
                                                if (kzzVar4 != null) {
                                                    strF3 = ctf0Var.f(R.string.reality_minute_v2, Integer.valueOf((int) kzzVar4.g));
                                                } else {
                                                    strF3 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                }
                                                strF2 = strF3;
                                                i2 = 0;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str1117 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1117, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 13:
                                                it7 = list2.iterator();
                                                while (true) {
                                                    if (it7.hasNext()) {
                                                        next7 = it7.next();
                                                        kzzVar11 = (kzz) next7;
                                                        if (kzzVar11.f19172a == LimitTypeEnum.TIMEOUT) {
                                                        }
                                                    } else {
                                                        next7 = p7m0Var3;
                                                    }
                                                }
                                                if (((kzz) next7) != null) {
                                                    i2 = 0;
                                                    strF2 = "";
                                                } else {
                                                    strF2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                    i2 = 0;
                                                }
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str1118 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1118, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            default:
                                                t9f.b();
                                                return p7m0Var3;
                                        }
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                    case 11:
                                        i = R.string.limit_for_day;
                                        strF = ctf0Var.f(i, new Object[0]);
                                        strP = "";
                                        switch (limitTypeEnum) {
                                            case null:
                                                i2 = 0;
                                                strF2 = "";
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str1119 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1119, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 9:
                                                i2 = 0;
                                                strP2 = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.ACTIVE);
                                                strF2 = strP2;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str11110 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11110, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 10:
                                                it = list2.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        next = it.next();
                                                        kzzVar = (kzz) next;
                                                        if (kzzVar.f19172a == LimitTypeEnum.SELF_EXCLUSION) {
                                                        }
                                                    } else {
                                                        next = p7m0Var3;
                                                    }
                                                }
                                                if (((kzz) next) != null) {
                                                    strF2 = "";
                                                    i2 = 0;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str11111 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11111, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                } else {
                                                    i2 = 0;
                                                    strP2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                    strF2 = strP2;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str11112 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11112, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                }
                                                break;
                                            case 11:
                                                prz przVar8 = prz.ACTIVE;
                                                it2 = list2.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        next2 = it2.next();
                                                        kzzVar3 = (kzz) next2;
                                                        if (kzzVar3.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next2 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar2 = (kzz) next2;
                                                gne0 gne0Var6 = nki0.b;
                                                if (kzzVar2 != null) {
                                                    i3 = (int) kzzVar2.g;
                                                } else {
                                                    i3 = 0;
                                                }
                                                gne0Var6.getClass();
                                                nki0 nki0VarD6 = gne0.d(i3);
                                                i4 = nki0VarD6.f23683a;
                                                i5 = q6t0.f28218a[nki0VarD6.ordinal()];
                                                if (i5 != 1) {
                                                    strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                                } else {
                                                    strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                                }
                                                strF2 = strF3;
                                                i2 = 0;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str11113 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11113, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 12:
                                                it3 = list2.iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        next3 = it3.next();
                                                        kzzVar5 = (kzz) next3;
                                                        if (kzzVar5.f19172a == LimitTypeEnum.REALITY_CHECK) {
                                                        }
                                                    } else {
                                                        next3 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar4 = (kzz) next3;
                                                if (kzzVar4 != null) {
                                                    strF3 = ctf0Var.f(R.string.reality_minute_v2, Integer.valueOf((int) kzzVar4.g));
                                                } else {
                                                    strF3 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                }
                                                strF2 = strF3;
                                                i2 = 0;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str11114 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11114, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 13:
                                                it7 = list2.iterator();
                                                while (true) {
                                                    if (it7.hasNext()) {
                                                        next7 = it7.next();
                                                        kzzVar11 = (kzz) next7;
                                                        if (kzzVar11.f19172a == LimitTypeEnum.TIMEOUT) {
                                                        }
                                                    } else {
                                                        next7 = p7m0Var3;
                                                    }
                                                }
                                                if (((kzz) next7) != null) {
                                                    i2 = 0;
                                                    strF2 = "";
                                                } else {
                                                    strF2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                    i2 = 0;
                                                }
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str11115 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11115, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            default:
                                                t9f.b();
                                                return p7m0Var3;
                                        }
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        i = R.string.limit_for_week;
                                        strF = ctf0Var.f(i, new Object[0]);
                                        strP = "";
                                        switch (limitTypeEnum) {
                                            case null:
                                                i2 = 0;
                                                strF2 = "";
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str11116 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11116, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 9:
                                                i2 = 0;
                                                strP2 = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.ACTIVE);
                                                strF2 = strP2;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str11117 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11117, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 10:
                                                it = list2.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        next = it.next();
                                                        kzzVar = (kzz) next;
                                                        if (kzzVar.f19172a == LimitTypeEnum.SELF_EXCLUSION) {
                                                        }
                                                    } else {
                                                        next = p7m0Var3;
                                                    }
                                                }
                                                if (((kzz) next) != null) {
                                                    strF2 = "";
                                                    i2 = 0;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str11118 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11118, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                } else {
                                                    i2 = 0;
                                                    strP2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                    strF2 = strP2;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str11119 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11119, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                }
                                                break;
                                            case 11:
                                                prz przVar9 = prz.ACTIVE;
                                                it2 = list2.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        next2 = it2.next();
                                                        kzzVar3 = (kzz) next2;
                                                        if (kzzVar3.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next2 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar2 = (kzz) next2;
                                                gne0 gne0Var7 = nki0.b;
                                                if (kzzVar2 != null) {
                                                    i3 = (int) kzzVar2.g;
                                                } else {
                                                    i3 = 0;
                                                }
                                                gne0Var7.getClass();
                                                nki0 nki0VarD7 = gne0.d(i3);
                                                i4 = nki0VarD7.f23683a;
                                                i5 = q6t0.f28218a[nki0VarD7.ordinal()];
                                                if (i5 != 1) {
                                                    strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                                } else {
                                                    strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                                }
                                                strF2 = strF3;
                                                i2 = 0;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str111110 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111110, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 12:
                                                it3 = list2.iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        next3 = it3.next();
                                                        kzzVar5 = (kzz) next3;
                                                        if (kzzVar5.f19172a == LimitTypeEnum.REALITY_CHECK) {
                                                        }
                                                    } else {
                                                        next3 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar4 = (kzz) next3;
                                                if (kzzVar4 != null) {
                                                    strF3 = ctf0Var.f(R.string.reality_minute_v2, Integer.valueOf((int) kzzVar4.g));
                                                } else {
                                                    strF3 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                }
                                                strF2 = strF3;
                                                i2 = 0;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str111111 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111111, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 13:
                                                it7 = list2.iterator();
                                                while (true) {
                                                    if (it7.hasNext()) {
                                                        next7 = it7.next();
                                                        kzzVar11 = (kzz) next7;
                                                        if (kzzVar11.f19172a == LimitTypeEnum.TIMEOUT) {
                                                        }
                                                    } else {
                                                        next7 = p7m0Var3;
                                                    }
                                                }
                                                if (((kzz) next7) != null) {
                                                    i2 = 0;
                                                    strF2 = "";
                                                } else {
                                                    strF2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                    i2 = 0;
                                                }
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str111112 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111112, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            default:
                                                t9f.b();
                                                return p7m0Var3;
                                        }
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        i = R.string.limit_for_month;
                                        strF = ctf0Var.f(i, new Object[0]);
                                        strP = "";
                                        switch (limitTypeEnum) {
                                            case null:
                                                i2 = 0;
                                                strF2 = "";
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str111113 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111113, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 9:
                                                i2 = 0;
                                                strP2 = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.ACTIVE);
                                                strF2 = strP2;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str111114 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111114, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 10:
                                                it = list2.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        next = it.next();
                                                        kzzVar = (kzz) next;
                                                        if (kzzVar.f19172a == LimitTypeEnum.SELF_EXCLUSION) {
                                                        }
                                                    } else {
                                                        next = p7m0Var3;
                                                    }
                                                }
                                                if (((kzz) next) != null) {
                                                    strF2 = "";
                                                    i2 = 0;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str111115 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111115, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                } else {
                                                    i2 = 0;
                                                    strP2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                    strF2 = strP2;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str111116 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111116, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                }
                                                break;
                                            case 11:
                                                prz przVar10 = prz.ACTIVE;
                                                it2 = list2.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        next2 = it2.next();
                                                        kzzVar3 = (kzz) next2;
                                                        if (kzzVar3.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next2 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar2 = (kzz) next2;
                                                gne0 gne0Var8 = nki0.b;
                                                if (kzzVar2 != null) {
                                                    i3 = (int) kzzVar2.g;
                                                } else {
                                                    i3 = 0;
                                                }
                                                gne0Var8.getClass();
                                                nki0 nki0VarD8 = gne0.d(i3);
                                                i4 = nki0VarD8.f23683a;
                                                i5 = q6t0.f28218a[nki0VarD8.ordinal()];
                                                if (i5 != 1) {
                                                    strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                                } else {
                                                    strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                                }
                                                strF2 = strF3;
                                                i2 = 0;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str111117 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111117, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 12:
                                                it3 = list2.iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        next3 = it3.next();
                                                        kzzVar5 = (kzz) next3;
                                                        if (kzzVar5.f19172a == LimitTypeEnum.REALITY_CHECK) {
                                                        }
                                                    } else {
                                                        next3 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar4 = (kzz) next3;
                                                if (kzzVar4 != null) {
                                                    strF3 = ctf0Var.f(R.string.reality_minute_v2, Integer.valueOf((int) kzzVar4.g));
                                                } else {
                                                    strF3 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                }
                                                strF2 = strF3;
                                                i2 = 0;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str111118 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111118, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 13:
                                                it7 = list2.iterator();
                                                while (true) {
                                                    if (it7.hasNext()) {
                                                        next7 = it7.next();
                                                        kzzVar11 = (kzz) next7;
                                                        if (kzzVar11.f19172a == LimitTypeEnum.TIMEOUT) {
                                                        }
                                                    } else {
                                                        next7 = p7m0Var3;
                                                    }
                                                }
                                                if (((kzz) next7) != null) {
                                                    i2 = 0;
                                                    strF2 = "";
                                                } else {
                                                    strF2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                    i2 = 0;
                                                }
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str111119 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111119, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            default:
                                                t9f.b();
                                                return p7m0Var3;
                                        }
                                        break;
                                    default:
                                        t9f.b();
                                        return p7m0Var3;
                                }
                                break;
                            case 8:
                                srzVar = new srz(R.string.lose_limit_title);
                                continue;
                                continue;
                                continue;
                                continue;
                                arrayList.add(srzVar);
                                p7m0Var4 = p7m0Var3;
                                c = 2;
                                break;
                            case 9:
                                srzVar = new rrz(R.string.lose_limit_title);
                                continue;
                                continue;
                                continue;
                                continue;
                                arrayList.add(srzVar);
                                p7m0Var4 = p7m0Var3;
                                c = 2;
                                break;
                            case 13:
                                srzVar2 = new srz(R.string.deposit_limits_title);
                                break;
                            case 14:
                                srzVar2 = new rrz(R.string.deposit_limits_title);
                                break;
                            case 18:
                                srzVar = new srz(R.string.limit_self_block);
                                continue;
                                continue;
                                continue;
                                continue;
                                arrayList.add(srzVar);
                                p7m0Var4 = p7m0Var3;
                                c = 2;
                                break;
                            case 20:
                                srzVar = new srz(R.string.reality_title);
                                continue;
                                continue;
                                continue;
                                continue;
                                arrayList.add(srzVar);
                                p7m0Var4 = p7m0Var3;
                                c = 2;
                                break;
                            case 22:
                                srzVar = new srz(R.string.timeout_title);
                                continue;
                                continue;
                                continue;
                                continue;
                                arrayList.add(srzVar);
                                p7m0Var4 = p7m0Var3;
                                c = 2;
                                break;
                            case 24:
                                srzVar = new srz(R.string.limit_for_session_time);
                                continue;
                                continue;
                                continue;
                                continue;
                                arrayList.add(srzVar);
                                p7m0Var4 = p7m0Var3;
                                c = 2;
                                break;
                            default:
                                t9f.b();
                                return p7m0Var3;
                        }
                        srzVar = srzVar2;
                        arrayList.add(srzVar);
                        p7m0Var4 = p7m0Var3;
                        c = 2;
                    }
                    p7m0 p7m0Var6 = p7m0Var4;
                    e500Var.i = list2;
                    e500Var.j = p7m0Var6;
                    e500Var.k = p7m0Var6;
                    e500Var.n = 5;
                    p7m0Var2.getClass();
                    p7m0Var2.o(p7m0Var6, arrayList);
                    if (Unit.f46060a != wneVar) {
                        list3 = list2;
                    }
                }
                return wneVar;
            }
            if (i8 == 4) {
                p7m0 p7m0Var7 = e500Var.k;
                String str20 = (String) e500Var.j;
                List list4 = e500Var.i;
                z1x.P(objA);
                str2 = str20;
                p7m0Var2 = p7m0Var7;
                list2 = list4;
                str3 = str2;
                Iterable<enz> iterable3 = (Iterable) objA;
                arrayList = new ArrayList(r3d.q(iterable3, 10));
                while (r1.hasNext()) {
                    enzVar.getClass();
                    ctf0Var = this.e;
                    ctf0Var.getClass();
                    list2.getClass();
                    str3.getClass();
                    p7m0Var3 = p7m0Var4;
                    switch (enzVar.ordinal()) {
                        case 0:
                            srzVar = new srz(R.string.set_your_limits);
                            continue;
                            continue;
                            continue;
                            continue;
                            arrayList.add(srzVar);
                            p7m0Var4 = p7m0Var3;
                            c = 2;
                            break;
                        case 1:
                            srzVar = new k120();
                            continue;
                            continue;
                            continue;
                            continue;
                            arrayList.add(srzVar);
                            p7m0Var4 = p7m0Var3;
                            c = 2;
                            break;
                        case 2:
                            srzVar = new ws10();
                            continue;
                            continue;
                            continue;
                            continue;
                            arrayList.add(srzVar);
                            p7m0Var4 = p7m0Var3;
                            c = 2;
                            break;
                        case 3:
                            srzVar = new srz(R.string.bet_limit_title);
                            continue;
                            continue;
                            continue;
                            continue;
                            arrayList.add(srzVar);
                            p7m0Var4 = p7m0Var3;
                            c = 2;
                            break;
                        case 4:
                            srzVar = new rrz(R.string.bet_limit_title);
                            continue;
                            continue;
                            continue;
                            continue;
                            arrayList.add(srzVar);
                            p7m0Var4 = p7m0Var3;
                            c = 2;
                            break;
                        case 5:
                        case 6:
                        case 7:
                        case 10:
                        case 11:
                        case 12:
                        case 15:
                        case 16:
                        case 17:
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        case 21:
                        case 23:
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                            switch (enzVar.ordinal()) {
                                case 5:
                                    limitTypeEnum = LimitTypeEnum.BET_LIMIT_1_DAY;
                                    break;
                                case 6:
                                    limitTypeEnum = LimitTypeEnum.BET_LIMIT_7_DAY;
                                    break;
                                case 7:
                                    limitTypeEnum = LimitTypeEnum.BET_LIMIT_30_DAY;
                                    break;
                                case 8:
                                case 9:
                                case 13:
                                case 14:
                                case 18:
                                case 20:
                                case 22:
                                case 24:
                                default:
                                    limitTypeEnum = LimitTypeEnum.EMPTY;
                                    break;
                                case 10:
                                    limitTypeEnum = LimitTypeEnum.LOSE_LIMIT_1_DAY;
                                    break;
                                case 11:
                                    limitTypeEnum = LimitTypeEnum.LOSE_LIMIT_7_DAY;
                                    break;
                                case 12:
                                    limitTypeEnum = LimitTypeEnum.LOSE_LIMIT_30_DAY;
                                    break;
                                case 15:
                                    limitTypeEnum = LimitTypeEnum.DEPOSIT_LIMIT_1_DAY;
                                    break;
                                case 16:
                                    limitTypeEnum = LimitTypeEnum.DEPOSIT_LIMIT_7_DAY;
                                    break;
                                case 17:
                                    limitTypeEnum = LimitTypeEnum.DEPOSIT_LIMIT_30_DAY;
                                    break;
                                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                    limitTypeEnum = LimitTypeEnum.SELF_EXCLUSION;
                                    break;
                                case 21:
                                    limitTypeEnum = LimitTypeEnum.REALITY_CHECK;
                                    break;
                                case 23:
                                    limitTypeEnum = LimitTypeEnum.TIMEOUT;
                                    break;
                                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                                    limitTypeEnum = LimitTypeEnum.SESSION_TIME_LIMIT;
                                    break;
                            }
                            iOrdinal = limitTypeEnum.ordinal();
                            i = R.string.limit_self_block_end_time;
                            switch (iOrdinal) {
                                case 0:
                                case 10:
                                case 12:
                                case 13:
                                    strF = ctf0Var.f(i, new Object[0]);
                                    strP = "";
                                    switch (limitTypeEnum) {
                                        case null:
                                            i2 = 0;
                                            strF2 = "";
                                            it4 = list2.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    next4 = it4.next();
                                                    kzzVar10 = (kzz) next4;
                                                    if (kzzVar10.f19172a == limitTypeEnum || ((przVar2 = kzzVar10.h) != prz.ACTIVE && przVar2 != prz.PENDING)) {
                                                    }
                                                } else {
                                                    next4 = p7m0Var3;
                                                }
                                            }
                                            kzzVar6 = (kzz) next4;
                                            if (kzzVar6 != null) {
                                                i6 = kzzVar6.f;
                                            } else {
                                                i6 = i2;
                                            }
                                            switch (limitTypeEnum.ordinal()) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    it5 = list2.iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            next5 = it5.next();
                                                            kzzVar7 = (kzz) next5;
                                                            if (kzzVar7.f19172a == limitTypeEnum || kzzVar7.h != prz.PENDING) {
                                                            }
                                                        } else {
                                                            next5 = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next5) != null) {
                                                        strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                    }
                                                    break;
                                            }
                                            String str1111110 = strP;
                                            it6 = list2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    next6 = it6.next();
                                                    kzzVar9 = (kzz) next6;
                                                    if (kzzVar9.f19172a == limitTypeEnum || kzzVar9.h != prz.PENDING) {
                                                    }
                                                } else {
                                                    next6 = p7m0Var3;
                                                }
                                            }
                                            kzzVar8 = (kzz) next6;
                                            if (kzzVar8 != null) {
                                                j = kzzVar8.f;
                                            } else {
                                                j = 0;
                                            }
                                            srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1111110, j);
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            arrayList.add(srzVar);
                                            p7m0Var4 = p7m0Var3;
                                            c = 2;
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                            i2 = 0;
                                            strP2 = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.ACTIVE);
                                            strF2 = strP2;
                                            it4 = list2.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    next4 = it4.next();
                                                    kzzVar10 = (kzz) next4;
                                                    if (kzzVar10.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next4 = p7m0Var3;
                                                }
                                            }
                                            kzzVar6 = (kzz) next4;
                                            if (kzzVar6 != null) {
                                                i6 = kzzVar6.f;
                                            } else {
                                                i6 = i2;
                                            }
                                            switch (limitTypeEnum.ordinal()) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    it5 = list2.iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            next5 = it5.next();
                                                            kzzVar7 = (kzz) next5;
                                                            if (kzzVar7.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next5 = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next5) != null) {
                                                        strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                    }
                                                    break;
                                            }
                                            String str1111111 = strP;
                                            it6 = list2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    next6 = it6.next();
                                                    kzzVar9 = (kzz) next6;
                                                    if (kzzVar9.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next6 = p7m0Var3;
                                                }
                                            }
                                            kzzVar8 = (kzz) next6;
                                            if (kzzVar8 != null) {
                                                j = kzzVar8.f;
                                            } else {
                                                j = 0;
                                            }
                                            srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1111111, j);
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            arrayList.add(srzVar);
                                            p7m0Var4 = p7m0Var3;
                                            c = 2;
                                            break;
                                        case 10:
                                            it = list2.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    next = it.next();
                                                    kzzVar = (kzz) next;
                                                    if (kzzVar.f19172a == LimitTypeEnum.SELF_EXCLUSION || kzzVar.h != prz.ACTIVE) {
                                                    }
                                                } else {
                                                    next = p7m0Var3;
                                                }
                                            }
                                            if (((kzz) next) != null) {
                                                strF2 = "";
                                                i2 = 0;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str1111112 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1111112, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                            } else {
                                                i2 = 0;
                                                strP2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                strF2 = strP2;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str1111113 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1111113, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                            }
                                            break;
                                        case 11:
                                            prz przVar11 = prz.ACTIVE;
                                            it2 = list2.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    next2 = it2.next();
                                                    kzzVar3 = (kzz) next2;
                                                    if (kzzVar3.f19172a == limitTypeEnum || kzzVar3.h != przVar11) {
                                                    }
                                                } else {
                                                    next2 = p7m0Var3;
                                                }
                                            }
                                            kzzVar2 = (kzz) next2;
                                            gne0 gne0Var9 = nki0.b;
                                            if (kzzVar2 != null) {
                                                i3 = (int) kzzVar2.g;
                                            } else {
                                                i3 = 0;
                                            }
                                            gne0Var9.getClass();
                                            nki0 nki0VarD9 = gne0.d(i3);
                                            i4 = nki0VarD9.f23683a;
                                            i5 = q6t0.f28218a[nki0VarD9.ordinal()];
                                            if (i5 != 1 || i5 == 2) {
                                                strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                            } else if (i5 == 3 || i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                                strF3 = ctf0Var.f(R.string.limit_second_hour_declination_v2, Integer.valueOf(i4));
                                            } else {
                                                strF3 = (nki0VarD9.compareTo(nki0.HOUR_20) > 0 || nki0VarD9.compareTo(nki0.HOUR_5) < 0) ? ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]) : ctf0Var.f(R.string.limit_third_hour_declination_v2, Integer.valueOf(i4));
                                            }
                                            strF2 = strF3;
                                            i2 = 0;
                                            it4 = list2.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    next4 = it4.next();
                                                    kzzVar10 = (kzz) next4;
                                                    if (kzzVar10.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next4 = p7m0Var3;
                                                }
                                            }
                                            kzzVar6 = (kzz) next4;
                                            if (kzzVar6 != null) {
                                                i6 = kzzVar6.f;
                                            } else {
                                                i6 = i2;
                                            }
                                            switch (limitTypeEnum.ordinal()) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    it5 = list2.iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            next5 = it5.next();
                                                            kzzVar7 = (kzz) next5;
                                                            if (kzzVar7.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next5 = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next5) != null) {
                                                        strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                    }
                                                    break;
                                            }
                                            String str1111114 = strP;
                                            it6 = list2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    next6 = it6.next();
                                                    kzzVar9 = (kzz) next6;
                                                    if (kzzVar9.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next6 = p7m0Var3;
                                                }
                                            }
                                            kzzVar8 = (kzz) next6;
                                            if (kzzVar8 != null) {
                                                j = kzzVar8.f;
                                            } else {
                                                j = 0;
                                            }
                                            srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1111114, j);
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            arrayList.add(srzVar);
                                            p7m0Var4 = p7m0Var3;
                                            c = 2;
                                            break;
                                        case 12:
                                            it3 = list2.iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    next3 = it3.next();
                                                    kzzVar5 = (kzz) next3;
                                                    if (kzzVar5.f19172a == LimitTypeEnum.REALITY_CHECK || ((przVar = kzzVar5.h) != prz.ACTIVE && przVar != prz.PENDING)) {
                                                    }
                                                } else {
                                                    next3 = p7m0Var3;
                                                }
                                            }
                                            kzzVar4 = (kzz) next3;
                                            if (kzzVar4 != null) {
                                                strF3 = ctf0Var.f(R.string.reality_minute_v2, Integer.valueOf((int) kzzVar4.g));
                                            } else {
                                                strF3 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                            }
                                            strF2 = strF3;
                                            i2 = 0;
                                            it4 = list2.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    next4 = it4.next();
                                                    kzzVar10 = (kzz) next4;
                                                    if (kzzVar10.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next4 = p7m0Var3;
                                                }
                                            }
                                            kzzVar6 = (kzz) next4;
                                            if (kzzVar6 != null) {
                                                i6 = kzzVar6.f;
                                            } else {
                                                i6 = i2;
                                            }
                                            switch (limitTypeEnum.ordinal()) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    it5 = list2.iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            next5 = it5.next();
                                                            kzzVar7 = (kzz) next5;
                                                            if (kzzVar7.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next5 = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next5) != null) {
                                                        strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                    }
                                                    break;
                                            }
                                            String str1111115 = strP;
                                            it6 = list2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    next6 = it6.next();
                                                    kzzVar9 = (kzz) next6;
                                                    if (kzzVar9.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next6 = p7m0Var3;
                                                }
                                            }
                                            kzzVar8 = (kzz) next6;
                                            if (kzzVar8 != null) {
                                                j = kzzVar8.f;
                                            } else {
                                                j = 0;
                                            }
                                            srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1111115, j);
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            arrayList.add(srzVar);
                                            p7m0Var4 = p7m0Var3;
                                            c = 2;
                                            break;
                                        case 13:
                                            it7 = list2.iterator();
                                            while (true) {
                                                if (it7.hasNext()) {
                                                    next7 = it7.next();
                                                    kzzVar11 = (kzz) next7;
                                                    if (kzzVar11.f19172a == LimitTypeEnum.TIMEOUT || kzzVar11.h != prz.ACTIVE) {
                                                    }
                                                } else {
                                                    next7 = p7m0Var3;
                                                }
                                            }
                                            if (((kzz) next7) != null) {
                                                i2 = 0;
                                                strF2 = "";
                                            } else {
                                                strF2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                i2 = 0;
                                            }
                                            it4 = list2.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    next4 = it4.next();
                                                    kzzVar10 = (kzz) next4;
                                                    if (kzzVar10.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next4 = p7m0Var3;
                                                }
                                            }
                                            kzzVar6 = (kzz) next4;
                                            if (kzzVar6 != null) {
                                                i6 = kzzVar6.f;
                                            } else {
                                                i6 = i2;
                                            }
                                            switch (limitTypeEnum.ordinal()) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    it5 = list2.iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            next5 = it5.next();
                                                            kzzVar7 = (kzz) next5;
                                                            if (kzzVar7.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next5 = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next5) != null) {
                                                        strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                    }
                                                    break;
                                            }
                                            String str1111116 = strP;
                                            it6 = list2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    next6 = it6.next();
                                                    kzzVar9 = (kzz) next6;
                                                    if (kzzVar9.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next6 = p7m0Var3;
                                                }
                                            }
                                            kzzVar8 = (kzz) next6;
                                            if (kzzVar8 != null) {
                                                j = kzzVar8.f;
                                            } else {
                                                j = 0;
                                            }
                                            srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1111116, j);
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            arrayList.add(srzVar);
                                            p7m0Var4 = p7m0Var3;
                                            c = 2;
                                            break;
                                        default:
                                            t9f.b();
                                            return p7m0Var3;
                                    }
                                    break;
                                case 1:
                                case 4:
                                case 7:
                                case 11:
                                    i = R.string.limit_for_day;
                                    strF = ctf0Var.f(i, new Object[0]);
                                    strP = "";
                                    switch (limitTypeEnum) {
                                        case null:
                                            i2 = 0;
                                            strF2 = "";
                                            it4 = list2.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    next4 = it4.next();
                                                    kzzVar10 = (kzz) next4;
                                                    if (kzzVar10.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next4 = p7m0Var3;
                                                }
                                            }
                                            kzzVar6 = (kzz) next4;
                                            if (kzzVar6 != null) {
                                                i6 = kzzVar6.f;
                                            } else {
                                                i6 = i2;
                                            }
                                            switch (limitTypeEnum.ordinal()) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    it5 = list2.iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            next5 = it5.next();
                                                            kzzVar7 = (kzz) next5;
                                                            if (kzzVar7.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next5 = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next5) != null) {
                                                        strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                    }
                                                    break;
                                            }
                                            String str1111117 = strP;
                                            it6 = list2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    next6 = it6.next();
                                                    kzzVar9 = (kzz) next6;
                                                    if (kzzVar9.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next6 = p7m0Var3;
                                                }
                                            }
                                            kzzVar8 = (kzz) next6;
                                            if (kzzVar8 != null) {
                                                j = kzzVar8.f;
                                            } else {
                                                j = 0;
                                            }
                                            srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1111117, j);
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            arrayList.add(srzVar);
                                            p7m0Var4 = p7m0Var3;
                                            c = 2;
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                            i2 = 0;
                                            strP2 = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.ACTIVE);
                                            strF2 = strP2;
                                            it4 = list2.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    next4 = it4.next();
                                                    kzzVar10 = (kzz) next4;
                                                    if (kzzVar10.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next4 = p7m0Var3;
                                                }
                                            }
                                            kzzVar6 = (kzz) next4;
                                            if (kzzVar6 != null) {
                                                i6 = kzzVar6.f;
                                            } else {
                                                i6 = i2;
                                            }
                                            switch (limitTypeEnum.ordinal()) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    it5 = list2.iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            next5 = it5.next();
                                                            kzzVar7 = (kzz) next5;
                                                            if (kzzVar7.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next5 = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next5) != null) {
                                                        strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                    }
                                                    break;
                                            }
                                            String str1111118 = strP;
                                            it6 = list2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    next6 = it6.next();
                                                    kzzVar9 = (kzz) next6;
                                                    if (kzzVar9.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next6 = p7m0Var3;
                                                }
                                            }
                                            kzzVar8 = (kzz) next6;
                                            if (kzzVar8 != null) {
                                                j = kzzVar8.f;
                                            } else {
                                                j = 0;
                                            }
                                            srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1111118, j);
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            arrayList.add(srzVar);
                                            p7m0Var4 = p7m0Var3;
                                            c = 2;
                                            break;
                                        case 10:
                                            it = list2.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    next = it.next();
                                                    kzzVar = (kzz) next;
                                                    if (kzzVar.f19172a == LimitTypeEnum.SELF_EXCLUSION) {
                                                    }
                                                } else {
                                                    next = p7m0Var3;
                                                }
                                            }
                                            if (((kzz) next) != null) {
                                                strF2 = "";
                                                i2 = 0;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str1111119 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1111119, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                            } else {
                                                i2 = 0;
                                                strP2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                strF2 = strP2;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str11111110 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11111110, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                            }
                                            break;
                                        case 11:
                                            prz przVar12 = prz.ACTIVE;
                                            it2 = list2.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    next2 = it2.next();
                                                    kzzVar3 = (kzz) next2;
                                                    if (kzzVar3.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next2 = p7m0Var3;
                                                }
                                            }
                                            kzzVar2 = (kzz) next2;
                                            gne0 gne0Var10 = nki0.b;
                                            if (kzzVar2 != null) {
                                                i3 = (int) kzzVar2.g;
                                            } else {
                                                i3 = 0;
                                            }
                                            gne0Var10.getClass();
                                            nki0 nki0VarD10 = gne0.d(i3);
                                            i4 = nki0VarD10.f23683a;
                                            i5 = q6t0.f28218a[nki0VarD10.ordinal()];
                                            if (i5 != 1) {
                                                strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                            } else {
                                                strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                            }
                                            strF2 = strF3;
                                            i2 = 0;
                                            it4 = list2.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    next4 = it4.next();
                                                    kzzVar10 = (kzz) next4;
                                                    if (kzzVar10.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next4 = p7m0Var3;
                                                }
                                            }
                                            kzzVar6 = (kzz) next4;
                                            if (kzzVar6 != null) {
                                                i6 = kzzVar6.f;
                                            } else {
                                                i6 = i2;
                                            }
                                            switch (limitTypeEnum.ordinal()) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    it5 = list2.iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            next5 = it5.next();
                                                            kzzVar7 = (kzz) next5;
                                                            if (kzzVar7.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next5 = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next5) != null) {
                                                        strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                    }
                                                    break;
                                            }
                                            String str11111111 = strP;
                                            it6 = list2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    next6 = it6.next();
                                                    kzzVar9 = (kzz) next6;
                                                    if (kzzVar9.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next6 = p7m0Var3;
                                                }
                                            }
                                            kzzVar8 = (kzz) next6;
                                            if (kzzVar8 != null) {
                                                j = kzzVar8.f;
                                            } else {
                                                j = 0;
                                            }
                                            srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11111111, j);
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            arrayList.add(srzVar);
                                            p7m0Var4 = p7m0Var3;
                                            c = 2;
                                            break;
                                        case 12:
                                            it3 = list2.iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    next3 = it3.next();
                                                    kzzVar5 = (kzz) next3;
                                                    if (kzzVar5.f19172a == LimitTypeEnum.REALITY_CHECK) {
                                                    }
                                                } else {
                                                    next3 = p7m0Var3;
                                                }
                                            }
                                            kzzVar4 = (kzz) next3;
                                            if (kzzVar4 != null) {
                                                strF3 = ctf0Var.f(R.string.reality_minute_v2, Integer.valueOf((int) kzzVar4.g));
                                            } else {
                                                strF3 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                            }
                                            strF2 = strF3;
                                            i2 = 0;
                                            it4 = list2.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    next4 = it4.next();
                                                    kzzVar10 = (kzz) next4;
                                                    if (kzzVar10.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next4 = p7m0Var3;
                                                }
                                            }
                                            kzzVar6 = (kzz) next4;
                                            if (kzzVar6 != null) {
                                                i6 = kzzVar6.f;
                                            } else {
                                                i6 = i2;
                                            }
                                            switch (limitTypeEnum.ordinal()) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    it5 = list2.iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            next5 = it5.next();
                                                            kzzVar7 = (kzz) next5;
                                                            if (kzzVar7.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next5 = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next5) != null) {
                                                        strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                    }
                                                    break;
                                            }
                                            String str11111112 = strP;
                                            it6 = list2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    next6 = it6.next();
                                                    kzzVar9 = (kzz) next6;
                                                    if (kzzVar9.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next6 = p7m0Var3;
                                                }
                                            }
                                            kzzVar8 = (kzz) next6;
                                            if (kzzVar8 != null) {
                                                j = kzzVar8.f;
                                            } else {
                                                j = 0;
                                            }
                                            srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11111112, j);
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            arrayList.add(srzVar);
                                            p7m0Var4 = p7m0Var3;
                                            c = 2;
                                            break;
                                        case 13:
                                            it7 = list2.iterator();
                                            while (true) {
                                                if (it7.hasNext()) {
                                                    next7 = it7.next();
                                                    kzzVar11 = (kzz) next7;
                                                    if (kzzVar11.f19172a == LimitTypeEnum.TIMEOUT) {
                                                    }
                                                } else {
                                                    next7 = p7m0Var3;
                                                }
                                            }
                                            if (((kzz) next7) != null) {
                                                i2 = 0;
                                                strF2 = "";
                                            } else {
                                                strF2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                i2 = 0;
                                            }
                                            it4 = list2.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    next4 = it4.next();
                                                    kzzVar10 = (kzz) next4;
                                                    if (kzzVar10.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next4 = p7m0Var3;
                                                }
                                            }
                                            kzzVar6 = (kzz) next4;
                                            if (kzzVar6 != null) {
                                                i6 = kzzVar6.f;
                                            } else {
                                                i6 = i2;
                                            }
                                            switch (limitTypeEnum.ordinal()) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    it5 = list2.iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            next5 = it5.next();
                                                            kzzVar7 = (kzz) next5;
                                                            if (kzzVar7.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next5 = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next5) != null) {
                                                        strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                    }
                                                    break;
                                            }
                                            String str11111113 = strP;
                                            it6 = list2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    next6 = it6.next();
                                                    kzzVar9 = (kzz) next6;
                                                    if (kzzVar9.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next6 = p7m0Var3;
                                                }
                                            }
                                            kzzVar8 = (kzz) next6;
                                            if (kzzVar8 != null) {
                                                j = kzzVar8.f;
                                            } else {
                                                j = 0;
                                            }
                                            srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11111113, j);
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            arrayList.add(srzVar);
                                            p7m0Var4 = p7m0Var3;
                                            c = 2;
                                            break;
                                        default:
                                            t9f.b();
                                            return p7m0Var3;
                                    }
                                    break;
                                case 2:
                                case 5:
                                case 8:
                                    i = R.string.limit_for_week;
                                    strF = ctf0Var.f(i, new Object[0]);
                                    strP = "";
                                    switch (limitTypeEnum) {
                                        case null:
                                            i2 = 0;
                                            strF2 = "";
                                            it4 = list2.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    next4 = it4.next();
                                                    kzzVar10 = (kzz) next4;
                                                    if (kzzVar10.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next4 = p7m0Var3;
                                                }
                                            }
                                            kzzVar6 = (kzz) next4;
                                            if (kzzVar6 != null) {
                                                i6 = kzzVar6.f;
                                            } else {
                                                i6 = i2;
                                            }
                                            switch (limitTypeEnum.ordinal()) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    it5 = list2.iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            next5 = it5.next();
                                                            kzzVar7 = (kzz) next5;
                                                            if (kzzVar7.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next5 = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next5) != null) {
                                                        strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                    }
                                                    break;
                                            }
                                            String str11111114 = strP;
                                            it6 = list2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    next6 = it6.next();
                                                    kzzVar9 = (kzz) next6;
                                                    if (kzzVar9.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next6 = p7m0Var3;
                                                }
                                            }
                                            kzzVar8 = (kzz) next6;
                                            if (kzzVar8 != null) {
                                                j = kzzVar8.f;
                                            } else {
                                                j = 0;
                                            }
                                            srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11111114, j);
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            arrayList.add(srzVar);
                                            p7m0Var4 = p7m0Var3;
                                            c = 2;
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                            i2 = 0;
                                            strP2 = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.ACTIVE);
                                            strF2 = strP2;
                                            it4 = list2.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    next4 = it4.next();
                                                    kzzVar10 = (kzz) next4;
                                                    if (kzzVar10.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next4 = p7m0Var3;
                                                }
                                            }
                                            kzzVar6 = (kzz) next4;
                                            if (kzzVar6 != null) {
                                                i6 = kzzVar6.f;
                                            } else {
                                                i6 = i2;
                                            }
                                            switch (limitTypeEnum.ordinal()) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    it5 = list2.iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            next5 = it5.next();
                                                            kzzVar7 = (kzz) next5;
                                                            if (kzzVar7.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next5 = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next5) != null) {
                                                        strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                    }
                                                    break;
                                            }
                                            String str11111115 = strP;
                                            it6 = list2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    next6 = it6.next();
                                                    kzzVar9 = (kzz) next6;
                                                    if (kzzVar9.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next6 = p7m0Var3;
                                                }
                                            }
                                            kzzVar8 = (kzz) next6;
                                            if (kzzVar8 != null) {
                                                j = kzzVar8.f;
                                            } else {
                                                j = 0;
                                            }
                                            srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11111115, j);
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            arrayList.add(srzVar);
                                            p7m0Var4 = p7m0Var3;
                                            c = 2;
                                            break;
                                        case 10:
                                            it = list2.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    next = it.next();
                                                    kzzVar = (kzz) next;
                                                    if (kzzVar.f19172a == LimitTypeEnum.SELF_EXCLUSION) {
                                                    }
                                                } else {
                                                    next = p7m0Var3;
                                                }
                                            }
                                            if (((kzz) next) != null) {
                                                strF2 = "";
                                                i2 = 0;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str11111116 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11111116, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                            } else {
                                                i2 = 0;
                                                strP2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                strF2 = strP2;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str11111117 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11111117, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                            }
                                            break;
                                        case 11:
                                            prz przVar13 = prz.ACTIVE;
                                            it2 = list2.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    next2 = it2.next();
                                                    kzzVar3 = (kzz) next2;
                                                    if (kzzVar3.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next2 = p7m0Var3;
                                                }
                                            }
                                            kzzVar2 = (kzz) next2;
                                            gne0 gne0Var11 = nki0.b;
                                            if (kzzVar2 != null) {
                                                i3 = (int) kzzVar2.g;
                                            } else {
                                                i3 = 0;
                                            }
                                            gne0Var11.getClass();
                                            nki0 nki0VarD11 = gne0.d(i3);
                                            i4 = nki0VarD11.f23683a;
                                            i5 = q6t0.f28218a[nki0VarD11.ordinal()];
                                            if (i5 != 1) {
                                                strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                            } else {
                                                strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                            }
                                            strF2 = strF3;
                                            i2 = 0;
                                            it4 = list2.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    next4 = it4.next();
                                                    kzzVar10 = (kzz) next4;
                                                    if (kzzVar10.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next4 = p7m0Var3;
                                                }
                                            }
                                            kzzVar6 = (kzz) next4;
                                            if (kzzVar6 != null) {
                                                i6 = kzzVar6.f;
                                            } else {
                                                i6 = i2;
                                            }
                                            switch (limitTypeEnum.ordinal()) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    it5 = list2.iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            next5 = it5.next();
                                                            kzzVar7 = (kzz) next5;
                                                            if (kzzVar7.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next5 = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next5) != null) {
                                                        strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                    }
                                                    break;
                                            }
                                            String str11111118 = strP;
                                            it6 = list2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    next6 = it6.next();
                                                    kzzVar9 = (kzz) next6;
                                                    if (kzzVar9.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next6 = p7m0Var3;
                                                }
                                            }
                                            kzzVar8 = (kzz) next6;
                                            if (kzzVar8 != null) {
                                                j = kzzVar8.f;
                                            } else {
                                                j = 0;
                                            }
                                            srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11111118, j);
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            arrayList.add(srzVar);
                                            p7m0Var4 = p7m0Var3;
                                            c = 2;
                                            break;
                                        case 12:
                                            it3 = list2.iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    next3 = it3.next();
                                                    kzzVar5 = (kzz) next3;
                                                    if (kzzVar5.f19172a == LimitTypeEnum.REALITY_CHECK) {
                                                    }
                                                } else {
                                                    next3 = p7m0Var3;
                                                }
                                            }
                                            kzzVar4 = (kzz) next3;
                                            if (kzzVar4 != null) {
                                                strF3 = ctf0Var.f(R.string.reality_minute_v2, Integer.valueOf((int) kzzVar4.g));
                                            } else {
                                                strF3 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                            }
                                            strF2 = strF3;
                                            i2 = 0;
                                            it4 = list2.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    next4 = it4.next();
                                                    kzzVar10 = (kzz) next4;
                                                    if (kzzVar10.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next4 = p7m0Var3;
                                                }
                                            }
                                            kzzVar6 = (kzz) next4;
                                            if (kzzVar6 != null) {
                                                i6 = kzzVar6.f;
                                            } else {
                                                i6 = i2;
                                            }
                                            switch (limitTypeEnum.ordinal()) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    it5 = list2.iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            next5 = it5.next();
                                                            kzzVar7 = (kzz) next5;
                                                            if (kzzVar7.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next5 = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next5) != null) {
                                                        strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                    }
                                                    break;
                                            }
                                            String str11111119 = strP;
                                            it6 = list2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    next6 = it6.next();
                                                    kzzVar9 = (kzz) next6;
                                                    if (kzzVar9.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next6 = p7m0Var3;
                                                }
                                            }
                                            kzzVar8 = (kzz) next6;
                                            if (kzzVar8 != null) {
                                                j = kzzVar8.f;
                                            } else {
                                                j = 0;
                                            }
                                            srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11111119, j);
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            arrayList.add(srzVar);
                                            p7m0Var4 = p7m0Var3;
                                            c = 2;
                                            break;
                                        case 13:
                                            it7 = list2.iterator();
                                            while (true) {
                                                if (it7.hasNext()) {
                                                    next7 = it7.next();
                                                    kzzVar11 = (kzz) next7;
                                                    if (kzzVar11.f19172a == LimitTypeEnum.TIMEOUT) {
                                                    }
                                                } else {
                                                    next7 = p7m0Var3;
                                                }
                                            }
                                            if (((kzz) next7) != null) {
                                                i2 = 0;
                                                strF2 = "";
                                            } else {
                                                strF2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                i2 = 0;
                                            }
                                            it4 = list2.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    next4 = it4.next();
                                                    kzzVar10 = (kzz) next4;
                                                    if (kzzVar10.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next4 = p7m0Var3;
                                                }
                                            }
                                            kzzVar6 = (kzz) next4;
                                            if (kzzVar6 != null) {
                                                i6 = kzzVar6.f;
                                            } else {
                                                i6 = i2;
                                            }
                                            switch (limitTypeEnum.ordinal()) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    it5 = list2.iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            next5 = it5.next();
                                                            kzzVar7 = (kzz) next5;
                                                            if (kzzVar7.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next5 = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next5) != null) {
                                                        strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                    }
                                                    break;
                                            }
                                            String str111111110 = strP;
                                            it6 = list2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    next6 = it6.next();
                                                    kzzVar9 = (kzz) next6;
                                                    if (kzzVar9.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next6 = p7m0Var3;
                                                }
                                            }
                                            kzzVar8 = (kzz) next6;
                                            if (kzzVar8 != null) {
                                                j = kzzVar8.f;
                                            } else {
                                                j = 0;
                                            }
                                            srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111111110, j);
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            arrayList.add(srzVar);
                                            p7m0Var4 = p7m0Var3;
                                            c = 2;
                                            break;
                                        default:
                                            t9f.b();
                                            return p7m0Var3;
                                    }
                                    break;
                                case 3:
                                case 6:
                                case 9:
                                    i = R.string.limit_for_month;
                                    strF = ctf0Var.f(i, new Object[0]);
                                    strP = "";
                                    switch (limitTypeEnum) {
                                        case null:
                                            i2 = 0;
                                            strF2 = "";
                                            it4 = list2.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    next4 = it4.next();
                                                    kzzVar10 = (kzz) next4;
                                                    if (kzzVar10.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next4 = p7m0Var3;
                                                }
                                            }
                                            kzzVar6 = (kzz) next4;
                                            if (kzzVar6 != null) {
                                                i6 = kzzVar6.f;
                                            } else {
                                                i6 = i2;
                                            }
                                            switch (limitTypeEnum.ordinal()) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    it5 = list2.iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            next5 = it5.next();
                                                            kzzVar7 = (kzz) next5;
                                                            if (kzzVar7.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next5 = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next5) != null) {
                                                        strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                    }
                                                    break;
                                            }
                                            String str111111111 = strP;
                                            it6 = list2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    next6 = it6.next();
                                                    kzzVar9 = (kzz) next6;
                                                    if (kzzVar9.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next6 = p7m0Var3;
                                                }
                                            }
                                            kzzVar8 = (kzz) next6;
                                            if (kzzVar8 != null) {
                                                j = kzzVar8.f;
                                            } else {
                                                j = 0;
                                            }
                                            srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111111111, j);
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            arrayList.add(srzVar);
                                            p7m0Var4 = p7m0Var3;
                                            c = 2;
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                            i2 = 0;
                                            strP2 = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.ACTIVE);
                                            strF2 = strP2;
                                            it4 = list2.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    next4 = it4.next();
                                                    kzzVar10 = (kzz) next4;
                                                    if (kzzVar10.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next4 = p7m0Var3;
                                                }
                                            }
                                            kzzVar6 = (kzz) next4;
                                            if (kzzVar6 != null) {
                                                i6 = kzzVar6.f;
                                            } else {
                                                i6 = i2;
                                            }
                                            switch (limitTypeEnum.ordinal()) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    it5 = list2.iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            next5 = it5.next();
                                                            kzzVar7 = (kzz) next5;
                                                            if (kzzVar7.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next5 = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next5) != null) {
                                                        strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                    }
                                                    break;
                                            }
                                            String str111111112 = strP;
                                            it6 = list2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    next6 = it6.next();
                                                    kzzVar9 = (kzz) next6;
                                                    if (kzzVar9.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next6 = p7m0Var3;
                                                }
                                            }
                                            kzzVar8 = (kzz) next6;
                                            if (kzzVar8 != null) {
                                                j = kzzVar8.f;
                                            } else {
                                                j = 0;
                                            }
                                            srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111111112, j);
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            arrayList.add(srzVar);
                                            p7m0Var4 = p7m0Var3;
                                            c = 2;
                                            break;
                                        case 10:
                                            it = list2.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    next = it.next();
                                                    kzzVar = (kzz) next;
                                                    if (kzzVar.f19172a == LimitTypeEnum.SELF_EXCLUSION) {
                                                    }
                                                } else {
                                                    next = p7m0Var3;
                                                }
                                            }
                                            if (((kzz) next) != null) {
                                                strF2 = "";
                                                i2 = 0;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str111111113 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111111113, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                            } else {
                                                i2 = 0;
                                                strP2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                strF2 = strP2;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str111111114 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111111114, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                            }
                                            break;
                                        case 11:
                                            prz przVar14 = prz.ACTIVE;
                                            it2 = list2.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    next2 = it2.next();
                                                    kzzVar3 = (kzz) next2;
                                                    if (kzzVar3.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next2 = p7m0Var3;
                                                }
                                            }
                                            kzzVar2 = (kzz) next2;
                                            gne0 gne0Var12 = nki0.b;
                                            if (kzzVar2 != null) {
                                                i3 = (int) kzzVar2.g;
                                            } else {
                                                i3 = 0;
                                            }
                                            gne0Var12.getClass();
                                            nki0 nki0VarD12 = gne0.d(i3);
                                            i4 = nki0VarD12.f23683a;
                                            i5 = q6t0.f28218a[nki0VarD12.ordinal()];
                                            if (i5 != 1) {
                                                strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                            } else {
                                                strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                            }
                                            strF2 = strF3;
                                            i2 = 0;
                                            it4 = list2.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    next4 = it4.next();
                                                    kzzVar10 = (kzz) next4;
                                                    if (kzzVar10.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next4 = p7m0Var3;
                                                }
                                            }
                                            kzzVar6 = (kzz) next4;
                                            if (kzzVar6 != null) {
                                                i6 = kzzVar6.f;
                                            } else {
                                                i6 = i2;
                                            }
                                            switch (limitTypeEnum.ordinal()) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    it5 = list2.iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            next5 = it5.next();
                                                            kzzVar7 = (kzz) next5;
                                                            if (kzzVar7.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next5 = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next5) != null) {
                                                        strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                    }
                                                    break;
                                            }
                                            String str111111115 = strP;
                                            it6 = list2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    next6 = it6.next();
                                                    kzzVar9 = (kzz) next6;
                                                    if (kzzVar9.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next6 = p7m0Var3;
                                                }
                                            }
                                            kzzVar8 = (kzz) next6;
                                            if (kzzVar8 != null) {
                                                j = kzzVar8.f;
                                            } else {
                                                j = 0;
                                            }
                                            srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111111115, j);
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            arrayList.add(srzVar);
                                            p7m0Var4 = p7m0Var3;
                                            c = 2;
                                            break;
                                        case 12:
                                            it3 = list2.iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    next3 = it3.next();
                                                    kzzVar5 = (kzz) next3;
                                                    if (kzzVar5.f19172a == LimitTypeEnum.REALITY_CHECK) {
                                                    }
                                                } else {
                                                    next3 = p7m0Var3;
                                                }
                                            }
                                            kzzVar4 = (kzz) next3;
                                            if (kzzVar4 != null) {
                                                strF3 = ctf0Var.f(R.string.reality_minute_v2, Integer.valueOf((int) kzzVar4.g));
                                            } else {
                                                strF3 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                            }
                                            strF2 = strF3;
                                            i2 = 0;
                                            it4 = list2.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    next4 = it4.next();
                                                    kzzVar10 = (kzz) next4;
                                                    if (kzzVar10.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next4 = p7m0Var3;
                                                }
                                            }
                                            kzzVar6 = (kzz) next4;
                                            if (kzzVar6 != null) {
                                                i6 = kzzVar6.f;
                                            } else {
                                                i6 = i2;
                                            }
                                            switch (limitTypeEnum.ordinal()) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    it5 = list2.iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            next5 = it5.next();
                                                            kzzVar7 = (kzz) next5;
                                                            if (kzzVar7.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next5 = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next5) != null) {
                                                        strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                    }
                                                    break;
                                            }
                                            String str111111116 = strP;
                                            it6 = list2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    next6 = it6.next();
                                                    kzzVar9 = (kzz) next6;
                                                    if (kzzVar9.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next6 = p7m0Var3;
                                                }
                                            }
                                            kzzVar8 = (kzz) next6;
                                            if (kzzVar8 != null) {
                                                j = kzzVar8.f;
                                            } else {
                                                j = 0;
                                            }
                                            srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111111116, j);
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            arrayList.add(srzVar);
                                            p7m0Var4 = p7m0Var3;
                                            c = 2;
                                            break;
                                        case 13:
                                            it7 = list2.iterator();
                                            while (true) {
                                                if (it7.hasNext()) {
                                                    next7 = it7.next();
                                                    kzzVar11 = (kzz) next7;
                                                    if (kzzVar11.f19172a == LimitTypeEnum.TIMEOUT) {
                                                    }
                                                } else {
                                                    next7 = p7m0Var3;
                                                }
                                            }
                                            if (((kzz) next7) != null) {
                                                i2 = 0;
                                                strF2 = "";
                                            } else {
                                                strF2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                i2 = 0;
                                            }
                                            it4 = list2.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    next4 = it4.next();
                                                    kzzVar10 = (kzz) next4;
                                                    if (kzzVar10.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next4 = p7m0Var3;
                                                }
                                            }
                                            kzzVar6 = (kzz) next4;
                                            if (kzzVar6 != null) {
                                                i6 = kzzVar6.f;
                                            } else {
                                                i6 = i2;
                                            }
                                            switch (limitTypeEnum.ordinal()) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    it5 = list2.iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            next5 = it5.next();
                                                            kzzVar7 = (kzz) next5;
                                                            if (kzzVar7.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next5 = p7m0Var3;
                                                        }
                                                    }
                                                    if (((kzz) next5) != null) {
                                                        strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                    }
                                                    break;
                                            }
                                            String str111111117 = strP;
                                            it6 = list2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    next6 = it6.next();
                                                    kzzVar9 = (kzz) next6;
                                                    if (kzzVar9.f19172a == limitTypeEnum) {
                                                    }
                                                } else {
                                                    next6 = p7m0Var3;
                                                }
                                            }
                                            kzzVar8 = (kzz) next6;
                                            if (kzzVar8 != null) {
                                                j = kzzVar8.f;
                                            } else {
                                                j = 0;
                                            }
                                            srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111111117, j);
                                            continue;
                                            continue;
                                            continue;
                                            continue;
                                            arrayList.add(srzVar);
                                            p7m0Var4 = p7m0Var3;
                                            c = 2;
                                            break;
                                        default:
                                            t9f.b();
                                            return p7m0Var3;
                                    }
                                    break;
                                default:
                                    t9f.b();
                                    return p7m0Var3;
                            }
                            break;
                        case 8:
                            srzVar = new srz(R.string.lose_limit_title);
                            continue;
                            continue;
                            continue;
                            continue;
                            arrayList.add(srzVar);
                            p7m0Var4 = p7m0Var3;
                            c = 2;
                            break;
                        case 9:
                            srzVar = new rrz(R.string.lose_limit_title);
                            continue;
                            continue;
                            continue;
                            continue;
                            arrayList.add(srzVar);
                            p7m0Var4 = p7m0Var3;
                            c = 2;
                            break;
                        case 13:
                            srzVar2 = new srz(R.string.deposit_limits_title);
                            break;
                        case 14:
                            srzVar2 = new rrz(R.string.deposit_limits_title);
                            break;
                        case 18:
                            srzVar = new srz(R.string.limit_self_block);
                            continue;
                            continue;
                            continue;
                            continue;
                            arrayList.add(srzVar);
                            p7m0Var4 = p7m0Var3;
                            c = 2;
                            break;
                        case 20:
                            srzVar = new srz(R.string.reality_title);
                            continue;
                            continue;
                            continue;
                            continue;
                            arrayList.add(srzVar);
                            p7m0Var4 = p7m0Var3;
                            c = 2;
                            break;
                        case 22:
                            srzVar = new srz(R.string.timeout_title);
                            continue;
                            continue;
                            continue;
                            continue;
                            arrayList.add(srzVar);
                            p7m0Var4 = p7m0Var3;
                            c = 2;
                            break;
                        case 24:
                            srzVar = new srz(R.string.limit_for_session_time);
                            continue;
                            continue;
                            continue;
                            continue;
                            arrayList.add(srzVar);
                            p7m0Var4 = p7m0Var3;
                            c = 2;
                            break;
                        default:
                            t9f.b();
                            return p7m0Var3;
                    }
                    srzVar = srzVar2;
                    arrayList.add(srzVar);
                    p7m0Var4 = p7m0Var3;
                    c = 2;
                }
                p7m0 p7m0Var8 = p7m0Var4;
                e500Var.i = list2;
                e500Var.j = p7m0Var8;
                e500Var.k = p7m0Var8;
                e500Var.n = 5;
                p7m0Var2.getClass();
                p7m0Var2.o(p7m0Var8, arrayList);
                if (Unit.f46060a != wneVar) {
                    list3 = list2;
                }
                return wneVar;
            }
            if (i8 != 5) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list3 = e500Var.i;
            z1x.P(objA);
        }
        this.p = list3;
        return list3;
        List list5 = (List) objA;
        e500Var.i = list5;
        m0uVar = this.h;
        e500Var.j = m0uVar;
        e500Var.n = 2;
        Serializable serializableA = this.g.a(tl5.c, e500Var);
        if (serializableA != wneVar) {
            list = list5;
            objA = serializableA;
            long j3 = ((ql5) objA).e;
            e500Var.i = list;
            e500Var.j = null;
            e500Var.n = 3;
            objA = m0uVar.f20973a.c(j3, e500Var);
            if (objA != wneVar) {
                list2 = list;
                str = ((xuf) objA).f;
                e500Var.i = list2;
                e500Var.j = str;
                p7m0Var = this.l;
                e500Var.k = p7m0Var;
                e500Var.n = 4;
                serializableT = this.f.t(list2, e500Var);
                if (serializableT != wneVar) {
                    str2 = str;
                    p7m0Var2 = p7m0Var;
                    objA = serializableT;
                    str3 = str2;
                    Iterable<enz> iterable4 = (Iterable) objA;
                    arrayList = new ArrayList(r3d.q(iterable4, 10));
                    while (r1.hasNext()) {
                        enzVar.getClass();
                        ctf0Var = this.e;
                        ctf0Var.getClass();
                        list2.getClass();
                        str3.getClass();
                        p7m0Var3 = p7m0Var4;
                        switch (enzVar.ordinal()) {
                            case 0:
                                srzVar = new srz(R.string.set_your_limits);
                                continue;
                                continue;
                                continue;
                                continue;
                                arrayList.add(srzVar);
                                p7m0Var4 = p7m0Var3;
                                c = 2;
                                break;
                            case 1:
                                srzVar = new k120();
                                continue;
                                continue;
                                continue;
                                continue;
                                arrayList.add(srzVar);
                                p7m0Var4 = p7m0Var3;
                                c = 2;
                                break;
                            case 2:
                                srzVar = new ws10();
                                continue;
                                continue;
                                continue;
                                continue;
                                arrayList.add(srzVar);
                                p7m0Var4 = p7m0Var3;
                                c = 2;
                                break;
                            case 3:
                                srzVar = new srz(R.string.bet_limit_title);
                                continue;
                                continue;
                                continue;
                                continue;
                                arrayList.add(srzVar);
                                p7m0Var4 = p7m0Var3;
                                c = 2;
                                break;
                            case 4:
                                srzVar = new rrz(R.string.bet_limit_title);
                                continue;
                                continue;
                                continue;
                                continue;
                                arrayList.add(srzVar);
                                p7m0Var4 = p7m0Var3;
                                c = 2;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 10:
                            case 11:
                            case 12:
                            case 15:
                            case 16:
                            case 17:
                            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                            case 21:
                            case 23:
                            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                                switch (enzVar.ordinal()) {
                                    case 5:
                                        limitTypeEnum = LimitTypeEnum.BET_LIMIT_1_DAY;
                                        break;
                                    case 6:
                                        limitTypeEnum = LimitTypeEnum.BET_LIMIT_7_DAY;
                                        break;
                                    case 7:
                                        limitTypeEnum = LimitTypeEnum.BET_LIMIT_30_DAY;
                                        break;
                                    case 8:
                                    case 9:
                                    case 13:
                                    case 14:
                                    case 18:
                                    case 20:
                                    case 22:
                                    case 24:
                                    default:
                                        limitTypeEnum = LimitTypeEnum.EMPTY;
                                        break;
                                    case 10:
                                        limitTypeEnum = LimitTypeEnum.LOSE_LIMIT_1_DAY;
                                        break;
                                    case 11:
                                        limitTypeEnum = LimitTypeEnum.LOSE_LIMIT_7_DAY;
                                        break;
                                    case 12:
                                        limitTypeEnum = LimitTypeEnum.LOSE_LIMIT_30_DAY;
                                        break;
                                    case 15:
                                        limitTypeEnum = LimitTypeEnum.DEPOSIT_LIMIT_1_DAY;
                                        break;
                                    case 16:
                                        limitTypeEnum = LimitTypeEnum.DEPOSIT_LIMIT_7_DAY;
                                        break;
                                    case 17:
                                        limitTypeEnum = LimitTypeEnum.DEPOSIT_LIMIT_30_DAY;
                                        break;
                                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                        limitTypeEnum = LimitTypeEnum.SELF_EXCLUSION;
                                        break;
                                    case 21:
                                        limitTypeEnum = LimitTypeEnum.REALITY_CHECK;
                                        break;
                                    case 23:
                                        limitTypeEnum = LimitTypeEnum.TIMEOUT;
                                        break;
                                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                                        limitTypeEnum = LimitTypeEnum.SESSION_TIME_LIMIT;
                                        break;
                                }
                                iOrdinal = limitTypeEnum.ordinal();
                                i = R.string.limit_self_block_end_time;
                                switch (iOrdinal) {
                                    case 0:
                                    case 10:
                                    case 12:
                                    case 13:
                                        strF = ctf0Var.f(i, new Object[0]);
                                        strP = "";
                                        switch (limitTypeEnum) {
                                            case null:
                                                i2 = 0;
                                                strF2 = "";
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str111111118 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111111118, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 9:
                                                i2 = 0;
                                                strP2 = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.ACTIVE);
                                                strF2 = strP2;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str111111119 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111111119, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 10:
                                                it = list2.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        next = it.next();
                                                        kzzVar = (kzz) next;
                                                        if (kzzVar.f19172a == LimitTypeEnum.SELF_EXCLUSION) {
                                                        }
                                                    } else {
                                                        next = p7m0Var3;
                                                    }
                                                }
                                                if (((kzz) next) != null) {
                                                    strF2 = "";
                                                    i2 = 0;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str1111111110 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1111111110, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                } else {
                                                    i2 = 0;
                                                    strP2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                    strF2 = strP2;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str1111111111 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1111111111, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                }
                                                break;
                                            case 11:
                                                prz przVar15 = prz.ACTIVE;
                                                it2 = list2.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        next2 = it2.next();
                                                        kzzVar3 = (kzz) next2;
                                                        if (kzzVar3.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next2 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar2 = (kzz) next2;
                                                gne0 gne0Var13 = nki0.b;
                                                if (kzzVar2 != null) {
                                                    i3 = (int) kzzVar2.g;
                                                } else {
                                                    i3 = 0;
                                                }
                                                gne0Var13.getClass();
                                                nki0 nki0VarD13 = gne0.d(i3);
                                                i4 = nki0VarD13.f23683a;
                                                i5 = q6t0.f28218a[nki0VarD13.ordinal()];
                                                if (i5 != 1) {
                                                    strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                                } else {
                                                    strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                                }
                                                strF2 = strF3;
                                                i2 = 0;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str1111111112 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1111111112, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 12:
                                                it3 = list2.iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        next3 = it3.next();
                                                        kzzVar5 = (kzz) next3;
                                                        if (kzzVar5.f19172a == LimitTypeEnum.REALITY_CHECK) {
                                                        }
                                                    } else {
                                                        next3 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar4 = (kzz) next3;
                                                if (kzzVar4 != null) {
                                                    strF3 = ctf0Var.f(R.string.reality_minute_v2, Integer.valueOf((int) kzzVar4.g));
                                                } else {
                                                    strF3 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                }
                                                strF2 = strF3;
                                                i2 = 0;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str1111111113 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1111111113, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 13:
                                                it7 = list2.iterator();
                                                while (true) {
                                                    if (it7.hasNext()) {
                                                        next7 = it7.next();
                                                        kzzVar11 = (kzz) next7;
                                                        if (kzzVar11.f19172a == LimitTypeEnum.TIMEOUT) {
                                                        }
                                                    } else {
                                                        next7 = p7m0Var3;
                                                    }
                                                }
                                                if (((kzz) next7) != null) {
                                                    i2 = 0;
                                                    strF2 = "";
                                                } else {
                                                    strF2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                    i2 = 0;
                                                }
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str1111111114 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1111111114, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            default:
                                                t9f.b();
                                                return p7m0Var3;
                                        }
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                    case 11:
                                        i = R.string.limit_for_day;
                                        strF = ctf0Var.f(i, new Object[0]);
                                        strP = "";
                                        switch (limitTypeEnum) {
                                            case null:
                                                i2 = 0;
                                                strF2 = "";
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str1111111115 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1111111115, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 9:
                                                i2 = 0;
                                                strP2 = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.ACTIVE);
                                                strF2 = strP2;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str1111111116 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1111111116, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 10:
                                                it = list2.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        next = it.next();
                                                        kzzVar = (kzz) next;
                                                        if (kzzVar.f19172a == LimitTypeEnum.SELF_EXCLUSION) {
                                                        }
                                                    } else {
                                                        next = p7m0Var3;
                                                    }
                                                }
                                                if (((kzz) next) != null) {
                                                    strF2 = "";
                                                    i2 = 0;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str1111111117 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1111111117, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                } else {
                                                    i2 = 0;
                                                    strP2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                    strF2 = strP2;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str1111111118 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1111111118, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                }
                                                break;
                                            case 11:
                                                prz przVar16 = prz.ACTIVE;
                                                it2 = list2.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        next2 = it2.next();
                                                        kzzVar3 = (kzz) next2;
                                                        if (kzzVar3.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next2 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar2 = (kzz) next2;
                                                gne0 gne0Var14 = nki0.b;
                                                if (kzzVar2 != null) {
                                                    i3 = (int) kzzVar2.g;
                                                } else {
                                                    i3 = 0;
                                                }
                                                gne0Var14.getClass();
                                                nki0 nki0VarD14 = gne0.d(i3);
                                                i4 = nki0VarD14.f23683a;
                                                i5 = q6t0.f28218a[nki0VarD14.ordinal()];
                                                if (i5 != 1) {
                                                    strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                                } else {
                                                    strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                                }
                                                strF2 = strF3;
                                                i2 = 0;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str1111111119 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str1111111119, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 12:
                                                it3 = list2.iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        next3 = it3.next();
                                                        kzzVar5 = (kzz) next3;
                                                        if (kzzVar5.f19172a == LimitTypeEnum.REALITY_CHECK) {
                                                        }
                                                    } else {
                                                        next3 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar4 = (kzz) next3;
                                                if (kzzVar4 != null) {
                                                    strF3 = ctf0Var.f(R.string.reality_minute_v2, Integer.valueOf((int) kzzVar4.g));
                                                } else {
                                                    strF3 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                }
                                                strF2 = strF3;
                                                i2 = 0;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str11111111110 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11111111110, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 13:
                                                it7 = list2.iterator();
                                                while (true) {
                                                    if (it7.hasNext()) {
                                                        next7 = it7.next();
                                                        kzzVar11 = (kzz) next7;
                                                        if (kzzVar11.f19172a == LimitTypeEnum.TIMEOUT) {
                                                        }
                                                    } else {
                                                        next7 = p7m0Var3;
                                                    }
                                                }
                                                if (((kzz) next7) != null) {
                                                    i2 = 0;
                                                    strF2 = "";
                                                } else {
                                                    strF2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                    i2 = 0;
                                                }
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str11111111111 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11111111111, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            default:
                                                t9f.b();
                                                return p7m0Var3;
                                        }
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        i = R.string.limit_for_week;
                                        strF = ctf0Var.f(i, new Object[0]);
                                        strP = "";
                                        switch (limitTypeEnum) {
                                            case null:
                                                i2 = 0;
                                                strF2 = "";
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str11111111112 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11111111112, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 9:
                                                i2 = 0;
                                                strP2 = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.ACTIVE);
                                                strF2 = strP2;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str11111111113 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11111111113, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 10:
                                                it = list2.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        next = it.next();
                                                        kzzVar = (kzz) next;
                                                        if (kzzVar.f19172a == LimitTypeEnum.SELF_EXCLUSION) {
                                                        }
                                                    } else {
                                                        next = p7m0Var3;
                                                    }
                                                }
                                                if (((kzz) next) != null) {
                                                    strF2 = "";
                                                    i2 = 0;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str11111111114 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11111111114, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                } else {
                                                    i2 = 0;
                                                    strP2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                    strF2 = strP2;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str11111111115 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11111111115, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                }
                                                break;
                                            case 11:
                                                prz przVar17 = prz.ACTIVE;
                                                it2 = list2.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        next2 = it2.next();
                                                        kzzVar3 = (kzz) next2;
                                                        if (kzzVar3.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next2 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar2 = (kzz) next2;
                                                gne0 gne0Var15 = nki0.b;
                                                if (kzzVar2 != null) {
                                                    i3 = (int) kzzVar2.g;
                                                } else {
                                                    i3 = 0;
                                                }
                                                gne0Var15.getClass();
                                                nki0 nki0VarD15 = gne0.d(i3);
                                                i4 = nki0VarD15.f23683a;
                                                i5 = q6t0.f28218a[nki0VarD15.ordinal()];
                                                if (i5 != 1) {
                                                    strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                                } else {
                                                    strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                                }
                                                strF2 = strF3;
                                                i2 = 0;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str11111111116 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11111111116, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 12:
                                                it3 = list2.iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        next3 = it3.next();
                                                        kzzVar5 = (kzz) next3;
                                                        if (kzzVar5.f19172a == LimitTypeEnum.REALITY_CHECK) {
                                                        }
                                                    } else {
                                                        next3 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar4 = (kzz) next3;
                                                if (kzzVar4 != null) {
                                                    strF3 = ctf0Var.f(R.string.reality_minute_v2, Integer.valueOf((int) kzzVar4.g));
                                                } else {
                                                    strF3 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                }
                                                strF2 = strF3;
                                                i2 = 0;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str11111111117 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11111111117, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case 13:
                                                it7 = list2.iterator();
                                                while (true) {
                                                    if (it7.hasNext()) {
                                                        next7 = it7.next();
                                                        kzzVar11 = (kzz) next7;
                                                        if (kzzVar11.f19172a == LimitTypeEnum.TIMEOUT) {
                                                        }
                                                    } else {
                                                        next7 = p7m0Var3;
                                                    }
                                                }
                                                if (((kzz) next7) != null) {
                                                    i2 = 0;
                                                    strF2 = "";
                                                } else {
                                                    strF2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                    i2 = 0;
                                                }
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str11111111118 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11111111118, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            default:
                                                t9f.b();
                                                return p7m0Var3;
                                        }
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        i = R.string.limit_for_month;
                                        strF = ctf0Var.f(i, new Object[0]);
                                        strP = "";
                                        switch (limitTypeEnum) {
                                            case EMPTY:
                                                i2 = 0;
                                                strF2 = "";
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str11111111119 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str11111111119, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case BET_LIMIT_1_DAY:
                                            case BET_LIMIT_7_DAY:
                                            case BET_LIMIT_30_DAY:
                                            case LOSE_LIMIT_1_DAY:
                                            case LOSE_LIMIT_7_DAY:
                                            case LOSE_LIMIT_30_DAY:
                                            case DEPOSIT_LIMIT_1_DAY:
                                            case DEPOSIT_LIMIT_7_DAY:
                                            case DEPOSIT_LIMIT_30_DAY:
                                                i2 = 0;
                                                strP2 = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.ACTIVE);
                                                strF2 = strP2;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str111111111110 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111111111110, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case SELF_EXCLUSION:
                                                it = list2.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        next = it.next();
                                                        kzzVar = (kzz) next;
                                                        if (kzzVar.f19172a == LimitTypeEnum.SELF_EXCLUSION) {
                                                        }
                                                    } else {
                                                        next = p7m0Var3;
                                                    }
                                                }
                                                if (((kzz) next) != null) {
                                                    strF2 = "";
                                                    i2 = 0;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str111111111111 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111111111111, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                } else {
                                                    i2 = 0;
                                                    strP2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                    strF2 = strP2;
                                                    it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next4 = it4.next();
                                                            kzzVar10 = (kzz) next4;
                                                            if (kzzVar10.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next4 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar6 = (kzz) next4;
                                                    if (kzzVar6 != null) {
                                                        i6 = kzzVar6.f;
                                                    } else {
                                                        i6 = i2;
                                                    }
                                                    switch (limitTypeEnum.ordinal()) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            it5 = list2.iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    next5 = it5.next();
                                                                    kzzVar7 = (kzz) next5;
                                                                    if (kzzVar7.f19172a == limitTypeEnum) {
                                                                    }
                                                                } else {
                                                                    next5 = p7m0Var3;
                                                                }
                                                            }
                                                            if (((kzz) next5) != null) {
                                                                strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                            }
                                                            break;
                                                    }
                                                    String str111111111112 = strP;
                                                    it6 = list2.iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            next6 = it6.next();
                                                            kzzVar9 = (kzz) next6;
                                                            if (kzzVar9.f19172a == limitTypeEnum) {
                                                            }
                                                        } else {
                                                            next6 = p7m0Var3;
                                                        }
                                                    }
                                                    kzzVar8 = (kzz) next6;
                                                    if (kzzVar8 != null) {
                                                        j = kzzVar8.f;
                                                    } else {
                                                        j = 0;
                                                    }
                                                    srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111111111112, j);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                                    arrayList.add(srzVar);
                                                    p7m0Var4 = p7m0Var3;
                                                    c = 2;
                                                }
                                                break;
                                            case SESSION_TIME_LIMIT:
                                                prz przVar18 = prz.ACTIVE;
                                                it2 = list2.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        next2 = it2.next();
                                                        kzzVar3 = (kzz) next2;
                                                        if (kzzVar3.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next2 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar2 = (kzz) next2;
                                                gne0 gne0Var16 = nki0.b;
                                                if (kzzVar2 != null) {
                                                    i3 = (int) kzzVar2.g;
                                                } else {
                                                    i3 = 0;
                                                }
                                                gne0Var16.getClass();
                                                nki0 nki0VarD16 = gne0.d(i3);
                                                i4 = nki0VarD16.f23683a;
                                                i5 = q6t0.f28218a[nki0VarD16.ordinal()];
                                                if (i5 != 1) {
                                                    strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                                } else {
                                                    strF3 = ctf0Var.f(R.string.limit_first_hour_declination_v2, Integer.valueOf(i4));
                                                }
                                                strF2 = strF3;
                                                i2 = 0;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str111111111113 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111111111113, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case REALITY_CHECK:
                                                it3 = list2.iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        next3 = it3.next();
                                                        kzzVar5 = (kzz) next3;
                                                        if (kzzVar5.f19172a == LimitTypeEnum.REALITY_CHECK) {
                                                        }
                                                    } else {
                                                        next3 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar4 = (kzz) next3;
                                                if (kzzVar4 != null) {
                                                    strF3 = ctf0Var.f(R.string.reality_minute_v2, Integer.valueOf((int) kzzVar4.g));
                                                } else {
                                                    strF3 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                }
                                                strF2 = strF3;
                                                i2 = 0;
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str111111111114 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111111111114, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            case TIMEOUT:
                                                it7 = list2.iterator();
                                                while (true) {
                                                    if (it7.hasNext()) {
                                                        next7 = it7.next();
                                                        kzzVar11 = (kzz) next7;
                                                        if (kzzVar11.f19172a == LimitTypeEnum.TIMEOUT) {
                                                        }
                                                    } else {
                                                        next7 = p7m0Var3;
                                                    }
                                                }
                                                if (((kzz) next7) != null) {
                                                    i2 = 0;
                                                    strF2 = "";
                                                } else {
                                                    strF2 = ctf0Var.f(R.string.security_secret_question_state_false, new Object[0]);
                                                    i2 = 0;
                                                }
                                                it4 = list2.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next4 = it4.next();
                                                        kzzVar10 = (kzz) next4;
                                                        if (kzzVar10.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next4 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar6 = (kzz) next4;
                                                if (kzzVar6 != null) {
                                                    i6 = kzzVar6.f;
                                                } else {
                                                    i6 = i2;
                                                }
                                                switch (limitTypeEnum.ordinal()) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        it5 = list2.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                next5 = it5.next();
                                                                kzzVar7 = (kzz) next5;
                                                                if (kzzVar7.f19172a == limitTypeEnum) {
                                                                }
                                                            } else {
                                                                next5 = p7m0Var3;
                                                            }
                                                        }
                                                        if (((kzz) next5) != null) {
                                                            strP = n8n0.p(limitTypeEnum, list2, str3, ctf0Var, prz.PENDING);
                                                        }
                                                        break;
                                                }
                                                String str111111111115 = strP;
                                                it6 = list2.iterator();
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        next6 = it6.next();
                                                        kzzVar9 = (kzz) next6;
                                                        if (kzzVar9.f19172a == limitTypeEnum) {
                                                        }
                                                    } else {
                                                        next6 = p7m0Var3;
                                                    }
                                                }
                                                kzzVar8 = (kzz) next6;
                                                if (kzzVar8 != null) {
                                                    j = kzzVar8.f;
                                                } else {
                                                    j = 0;
                                                }
                                                srzVar = new goz(limitTypeEnum, strF, strF2, i6, str111111111115, j);
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                arrayList.add(srzVar);
                                                p7m0Var4 = p7m0Var3;
                                                c = 2;
                                                break;
                                            default:
                                                t9f.b();
                                                return p7m0Var3;
                                        }
                                        break;
                                    default:
                                        t9f.b();
                                        return p7m0Var3;
                                }
                                break;
                            case 8:
                                srzVar = new srz(R.string.lose_limit_title);
                                continue;
                                continue;
                                continue;
                                continue;
                                arrayList.add(srzVar);
                                p7m0Var4 = p7m0Var3;
                                c = 2;
                                break;
                            case 9:
                                srzVar = new rrz(R.string.lose_limit_title);
                                continue;
                                continue;
                                continue;
                                continue;
                                arrayList.add(srzVar);
                                p7m0Var4 = p7m0Var3;
                                c = 2;
                                break;
                            case 13:
                                srzVar2 = new srz(R.string.deposit_limits_title);
                                break;
                            case 14:
                                srzVar2 = new rrz(R.string.deposit_limits_title);
                                break;
                            case 18:
                                srzVar = new srz(R.string.limit_self_block);
                                continue;
                                continue;
                                continue;
                                continue;
                                arrayList.add(srzVar);
                                p7m0Var4 = p7m0Var3;
                                c = 2;
                                break;
                            case 20:
                                srzVar = new srz(R.string.reality_title);
                                continue;
                                continue;
                                continue;
                                continue;
                                arrayList.add(srzVar);
                                p7m0Var4 = p7m0Var3;
                                c = 2;
                                break;
                            case 22:
                                srzVar = new srz(R.string.timeout_title);
                                continue;
                                continue;
                                continue;
                                continue;
                                arrayList.add(srzVar);
                                p7m0Var4 = p7m0Var3;
                                c = 2;
                                break;
                            case 24:
                                srzVar = new srz(R.string.limit_for_session_time);
                                continue;
                                continue;
                                continue;
                                continue;
                                arrayList.add(srzVar);
                                p7m0Var4 = p7m0Var3;
                                c = 2;
                                break;
                            default:
                                t9f.b();
                                return p7m0Var3;
                        }
                        srzVar = srzVar2;
                        arrayList.add(srzVar);
                        p7m0Var4 = p7m0Var3;
                        c = 2;
                    }
                    p7m0 p7m0Var9 = p7m0Var4;
                    e500Var.i = list2;
                    e500Var.j = p7m0Var9;
                    e500Var.k = p7m0Var9;
                    e500Var.n = 5;
                    p7m0Var2.getClass();
                    p7m0Var2.o(p7m0Var9, arrayList);
                    if (Unit.f46060a != wneVar) {
                        list3 = list2;
                        this.p = list3;
                        return list3;
                    }
                }
            }
        }
        return wneVar;
    }

    public final int x(int i) {
        Object next;
        Iterator it = this.p.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((kzz) next).f19172a.f46888a != i);
        kzz kzzVar = (kzz) next;
        if (kzzVar != null) {
            return (int) kzzVar.g;
        }
        return 0;
    }

    public final void y() {
        bvc bvcVarA = jiu0.a(this);
        rwj rwjVar = tvk.f34603a;
        this.r = sac.V(bvcVarA, new z400(this, (byte) 0), new a500(this, (byte) 0), dvj.c, new f500(this, null, (byte) 2), 8);
    }
}
