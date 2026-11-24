package a;

import android.content.res.Resources;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.ranges.IntRange;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;

/* JADX INFO: loaded from: classes3.dex */
public final class art {
    public static ArrayList a() {
        LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
        locales.getClass();
        IntRange intRangeO = l1e0.o(0, locales.size());
        ArrayList arrayList = new ArrayList(r3d.q(intRangeO, 10));
        Iterator it = intRangeO.iterator();
        while (((kkx) it).c) {
            arrayList.add(locales.get(((bkx) it).nextInt()));
        }
        return arrayList;
    }

    public static orz b(String str) {
        str.getClass();
        orz orzVar = orz.b;
        if (str.equals("ACTIVE")) {
            return orzVar;
        }
        orz orzVar2 = orz.c;
        if (str.equals("PENDING")) {
            return orzVar2;
        }
        orz orzVar3 = orz.d;
        str.equals("INACTIVE");
        return orzVar3;
    }

    public static LimitTypeEnum c(int i) {
        LimitTypeEnum limitTypeEnum = LimitTypeEnum.EMPTY;
        if (i != -1) {
            LimitTypeEnum limitTypeEnum2 = LimitTypeEnum.BET_LIMIT_1_DAY;
            if (i == 1) {
                return limitTypeEnum2;
            }
            LimitTypeEnum limitTypeEnum3 = LimitTypeEnum.BET_LIMIT_7_DAY;
            if (i == 2) {
                return limitTypeEnum3;
            }
            LimitTypeEnum limitTypeEnum4 = LimitTypeEnum.BET_LIMIT_30_DAY;
            if (i == 3) {
                return limitTypeEnum4;
            }
            LimitTypeEnum limitTypeEnum5 = LimitTypeEnum.LOSE_LIMIT_1_DAY;
            if (i == 10) {
                return limitTypeEnum5;
            }
            LimitTypeEnum limitTypeEnum6 = LimitTypeEnum.LOSE_LIMIT_7_DAY;
            if (i == 11) {
                return limitTypeEnum6;
            }
            LimitTypeEnum limitTypeEnum7 = LimitTypeEnum.LOSE_LIMIT_30_DAY;
            if (i == 12) {
                return limitTypeEnum7;
            }
            LimitTypeEnum limitTypeEnum8 = LimitTypeEnum.DEPOSIT_LIMIT_1_DAY;
            if (i == 20) {
                return limitTypeEnum8;
            }
            LimitTypeEnum limitTypeEnum9 = LimitTypeEnum.DEPOSIT_LIMIT_7_DAY;
            if (i == 21) {
                return limitTypeEnum9;
            }
            LimitTypeEnum limitTypeEnum10 = LimitTypeEnum.DEPOSIT_LIMIT_30_DAY;
            if (i == 22) {
                return limitTypeEnum10;
            }
            LimitTypeEnum limitTypeEnum11 = LimitTypeEnum.SELF_EXCLUSION;
            if (i == 30) {
                return limitTypeEnum11;
            }
            LimitTypeEnum limitTypeEnum12 = LimitTypeEnum.SESSION_TIME_LIMIT;
            if (i == 31) {
                return limitTypeEnum12;
            }
            LimitTypeEnum limitTypeEnum13 = LimitTypeEnum.REALITY_CHECK;
            if (i == 32) {
                return limitTypeEnum13;
            }
            LimitTypeEnum limitTypeEnum14 = LimitTypeEnum.TIMEOUT;
            if (i == 33) {
                return limitTypeEnum14;
            }
        }
        return limitTypeEnum;
    }

    public static aw20 d(t730 t730Var) {
        urv urvVar;
        i0d i0dVar;
        boolean z = t730Var == t730.f33447a;
        if (z) {
            urvVar = urv.SIZE_2;
        } else {
            urv.b.getClass();
            urvVar = urv.SIZE_1;
        }
        sw20.b.getClass();
        sw20 sw20Var = sw20.SIZE_1;
        if (z) {
            i0dVar = i0d.SIZE_2;
        } else {
            i0d.b.getClass();
            i0dVar = i0d.SIZE_1;
        }
        i0d i0dVar2 = i0dVar;
        s4d.b.getClass();
        s4d s4dVar = s4d.TWO_TONE;
        qy20.b.getClass();
        return new aw20(urvVar, sw20Var, i0dVar2, s4dVar, qy20.ROW, t730Var);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0143  */
    /* JADX WARN: Code duplicated, block: B:103:0x014c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0163  */
    /* JADX WARN: Code duplicated, block: B:109:0x017a  */
    /* JADX WARN: Code duplicated, block: B:110:0x017c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0186 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x0191  */
    /* JADX WARN: Code duplicated, block: B:119:0x0193  */
    /* JADX WARN: Code duplicated, block: B:122:0x019c  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:144:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:147:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:161:0x0204  */
    /* JADX WARN: Code duplicated, block: B:35:0x007a  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x010e  */
    /* JADX WARN: Code duplicated, block: B:90:0x011d A[ADDED_TO_REGION] */
    public static List e(a5w a5wVar, f8w f8wVar, HistoryTypeModel historyTypeModel, boolean z, gx7 gx7Var) {
        boolean z2;
        double d;
        HistoryMenuItem historyMenuItem;
        HistoryMenuItem historyMenuItem2;
        HistoryMenuItem historyMenuItem3;
        HistoryMenuItem historyMenuItem4;
        boolean z3;
        HistoryMenuItem historyMenuItem5;
        HistoryMenuItem historyMenuItem6;
        HistoryMenuItem historyMenuItem7;
        HistoryMenuItem historyMenuItem8;
        kzv kzvVar;
        q4f q4fVar;
        for0 for0Var;
        for0 for0Var2;
        i0w i0wVar;
        q4f q4fVar2;
        b3f b3fVar = gx7Var.c;
        a5wVar.getClass();
        f8wVar.getClass();
        historyTypeModel.getClass();
        boolean z4 = a5wVar instanceof vw4;
        HistoryMenuItem historyMenuItem9 = (z4 && q3d.j(iy4.b, iy4.c).contains(((vw4) a5wVar).g)) ? null : HistoryMenuItem.c;
        HistoryMenuItem historyMenuItem10 = HistoryMenuItem.d;
        gm7 gm7Var = gx7Var.f12063a;
        boolean z5 = b3fVar.c;
        HistoryMenuItem historyMenuItem11 = (!(a5wVar instanceof for0) ? !(!(a5wVar instanceof kzv) ? z4 && ((vw4) a5wVar).G && z5 : ((kzv) a5wVar).I && z5) : !((i0wVar = (for0Var2 = (for0) a5wVar).g) == i0w.i || i0wVar == i0w.f || (q4fVar2 = for0Var2.b) == q4f.u || !z5 || q4fVar2 == q4f.y)) ? null : historyMenuItem10;
        HistoryMenuItem historyMenuItem12 = HistoryMenuItem.e;
        boolean z6 = gm7Var.l;
        if (f8wVar != f8w.b && ((z2 = a5wVar instanceof kzv)) && ((kzv) a5wVar).g == i0w.b && z2) {
            kzv kzvVar2 = (kzv) a5wVar;
            if (q3d.j(q4f.c, q4f.d).contains(kzvVar2.b) && kzvVar2.H) {
                d = 0.0d;
                if (kzvVar2.o == 0.0d && z6 && z2 && !kzvVar2.x && z2 && ((kzv) a5wVar).m > 0.0d) {
                    historyMenuItem = historyMenuItem12;
                }
            } else {
                d = 0.0d;
            }
            historyMenuItem = null;
        } else {
            d = 0.0d;
            historyMenuItem = null;
        }
        HistoryMenuItem historyMenuItem13 = HistoryMenuItem.f;
        boolean z7 = gm7Var.q;
        if (!z4) {
            if (a5wVar instanceof kzv) {
                kzv kzvVar3 = (kzv) a5wVar;
                historyMenuItem2 = ((kzvVar3.X || kzvVar3.K) && z7) ? historyMenuItem13 : null;
            }
        } else if (!((vw4) a5wVar).S || !z7) {
        }
        HistoryMenuItem historyMenuItem14 = HistoryMenuItem.g;
        boolean z8 = gm7Var.m;
        if (z4) {
            vw4 vw4Var = (vw4) a5wVar;
            if (vw4Var.F && vw4Var.Q <= d) {
                if (z && z8) {
                    historyMenuItem3 = historyMenuItem14;
                }
            }
            historyMenuItem4 = HistoryMenuItem.h;
            boolean z9 = gm7Var.k;
            z3 = a5wVar instanceof kzv;
            if (z3 || !z3 || ((kzv) a5wVar).g != i0w.b || !z3 || ((kzv) a5wVar).m <= d || ((kzv) a5wVar).P.f23860a == mob0.f.f22128a || !z9) {
                historyMenuItem4 = null;
            }
            HistoryMenuItem historyMenuItem15 = HistoryMenuItem.i;
            boolean z10 = b3fVar.e;
            if (a5wVar instanceof for0) {
                for0Var = (for0) a5wVar;
                if (q3d.j(i0w.i, i0w.f).contains(for0Var.g) && !q3d.j(q4f.u, q4f.y).contains(for0Var.b) && z10) {
                    historyMenuItem5 = historyMenuItem15;
                } else {
                    historyMenuItem5 = null;
                }
            } else if (z4 ? !(z3 && ((kzv) a5wVar).I && z10) : !(((vw4) a5wVar).G && z10)) {
                historyMenuItem5 = null;
            } else {
                historyMenuItem5 = historyMenuItem15;
            }
            HistoryMenuItem historyMenuItem16 = HistoryMenuItem.b;
            boolean z11 = gx7Var.b.g;
            if (z3 || ((kzv) a5wVar).g == i0w.b || !z11) {
                historyMenuItem6 = null;
            } else {
                historyMenuItem6 = historyMenuItem16;
            }
            HistoryMenuItem historyMenuItem17 = (z3 ? !z4 || ((vw4) a5wVar).l <= d : ((kzv) a5wVar).M <= d) ? null : HistoryMenuItem.j;
            HistoryMenuItem historyMenuItem18 = HistoryMenuItem.l;
            if (!z4 && ((vw4) a5wVar).g == iy4.b && historyTypeModel == HistoryTypeModel.AUTO) {
                historyMenuItem7 = historyMenuItem18;
            } else {
                historyMenuItem7 = null;
            }
            HistoryMenuItem historyMenuItem19 = HistoryMenuItem.k;
            if (z3) {
                kzvVar = (kzv) a5wVar;
                if (kzvVar.t > kzvVar.v || (q4fVar = kzvVar.b) == q4f.c || q4fVar == q4f.j || q4fVar == q4f.k || q4fVar == q4f.m || q4fVar == q4f.x) {
                    historyMenuItem8 = null;
                } else {
                    historyMenuItem8 = historyMenuItem19;
                }
            } else {
                historyMenuItem8 = null;
            }
            return tx3.z(new HistoryMenuItem[]{historyMenuItem9, historyMenuItem11, historyMenuItem, historyMenuItem2, historyMenuItem3, historyMenuItem4, historyMenuItem5, historyMenuItem6, historyMenuItem17, historyMenuItem7, historyMenuItem8});
        }
        if (a5wVar instanceof kzv) {
            kzv kzvVar4 = (kzv) a5wVar;
            if (kzvVar4.H && kzvVar4.V <= d) {
                if (z) {
                }
            }
            historyMenuItem4 = HistoryMenuItem.h;
            boolean z12 = gm7Var.k;
            z3 = a5wVar instanceof kzv;
            if (z3) {
                historyMenuItem4 = null;
            } else {
                historyMenuItem4 = null;
            }
            HistoryMenuItem historyMenuItem110 = HistoryMenuItem.i;
            boolean z13 = b3fVar.e;
            if (a5wVar instanceof for0) {
                for0Var = (for0) a5wVar;
                if (q3d.j(i0w.i, i0w.f).contains(for0Var.g)) {
                }
                historyMenuItem5 = null;
            } else if (z4) {
                historyMenuItem5 = null;
            } else {
                historyMenuItem5 = null;
            }
            HistoryMenuItem historyMenuItem111 = HistoryMenuItem.b;
            boolean z14 = gx7Var.b.g;
            if (z3) {
                historyMenuItem6 = null;
            } else {
                historyMenuItem6 = null;
            }
            if (z3) {
            }
            HistoryMenuItem historyMenuItem112 = HistoryMenuItem.l;
            if (!z4) {
                historyMenuItem7 = null;
            } else {
                historyMenuItem7 = null;
            }
            HistoryMenuItem historyMenuItem113 = HistoryMenuItem.k;
            if (z3) {
                kzvVar = (kzv) a5wVar;
                if (kzvVar.t > kzvVar.v) {
                    historyMenuItem8 = null;
                } else {
                    historyMenuItem8 = null;
                }
            } else {
                historyMenuItem8 = null;
            }
            return tx3.z(new HistoryMenuItem[]{historyMenuItem9, historyMenuItem11, historyMenuItem, historyMenuItem2, historyMenuItem3, historyMenuItem4, historyMenuItem5, historyMenuItem6, historyMenuItem17, historyMenuItem7, historyMenuItem8});
        }
        historyMenuItem3 = null;
        historyMenuItem4 = HistoryMenuItem.h;
        boolean z15 = gm7Var.k;
        z3 = a5wVar instanceof kzv;
        if (z3) {
            historyMenuItem4 = null;
        } else {
            historyMenuItem4 = null;
        }
        HistoryMenuItem historyMenuItem114 = HistoryMenuItem.i;
        boolean z16 = b3fVar.e;
        if (a5wVar instanceof for0) {
            for0Var = (for0) a5wVar;
            if (q3d.j(i0w.i, i0w.f).contains(for0Var.g)) {
            }
            historyMenuItem5 = null;
        } else if (z4) {
            historyMenuItem5 = null;
        } else {
            historyMenuItem5 = null;
        }
        HistoryMenuItem historyMenuItem115 = HistoryMenuItem.b;
        boolean z17 = gx7Var.b.g;
        if (z3) {
            historyMenuItem6 = null;
        } else {
            historyMenuItem6 = null;
        }
        if (z3) {
        }
        HistoryMenuItem historyMenuItem116 = HistoryMenuItem.l;
        if (!z4) {
            historyMenuItem7 = null;
        } else {
            historyMenuItem7 = null;
        }
        HistoryMenuItem historyMenuItem117 = HistoryMenuItem.k;
        if (z3) {
            kzvVar = (kzv) a5wVar;
            if (kzvVar.t > kzvVar.v) {
                historyMenuItem8 = null;
            } else {
                historyMenuItem8 = null;
            }
        } else {
            historyMenuItem8 = null;
        }
        return tx3.z(new HistoryMenuItem[]{historyMenuItem9, historyMenuItem11, historyMenuItem, historyMenuItem2, historyMenuItem3, historyMenuItem4, historyMenuItem5, historyMenuItem6, historyMenuItem17, historyMenuItem7, historyMenuItem8});
    }

    public static Date f(long j) {
        Date date = new Date(TimeUnit.SECONDS.toMillis(j));
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Date time = calendar.getTime();
        time.getClass();
        return time;
    }
}
