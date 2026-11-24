package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes5.dex */
public final class mjf0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21894a;

    public /* synthetic */ mjf0(byte b) {
        this.f21894a = b;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0312  */
    /* JADX WARN: Code duplicated, block: B:124:0x031f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0334  */
    /* JADX WARN: Code duplicated, block: B:135:0x0339  */
    /* JADX WARN: Code duplicated, block: B:137:0x033d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0344  */
    /* JADX WARN: Code duplicated, block: B:141:0x0346  */
    /* JADX WARN: Code duplicated, block: B:143:0x034a  */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        boolean z;
        Boolean boolValueOf;
        ooh0 ooh0Var;
        int i2;
        long j;
        long j2;
        int i3 = 2;
        boolean z2 = true;
        switch (this.f21894a) {
            case 0:
                Integer num = ((t9v0) ((IndexedValue) obj).b).h;
                Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
                Integer num2 = ((t9v0) ((IndexedValue) obj2).b).h;
                return numValueOf.compareTo(Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
            case 1:
                return Boolean.valueOf(((hc50) obj2).k).compareTo(Boolean.valueOf(((hc50) obj).k));
            case 2:
                return Integer.valueOf(((twr0) obj).f34666a).compareTo(Integer.valueOf(((twr0) obj2).f34666a));
            case 3:
                return hdd.b((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 4:
                return hdd.b((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 5:
                return hdd.b((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 6:
                return hdd.b((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 7:
                return Integer.valueOf(((lk50) obj2).n).compareTo(Integer.valueOf(((lk50) obj).n));
            case 8:
                ooh0 ooh0Var2 = (ooh0) obj;
                if (ooh0Var2 instanceof hqh0) {
                    i = !((hqh0) ooh0Var2).s() ? 1 : 2;
                } else {
                    i = 0;
                }
                Integer numValueOf2 = Integer.valueOf(i);
                ooh0 ooh0Var3 = (ooh0) obj2;
                if (!(ooh0Var3 instanceof hqh0)) {
                    i3 = 0;
                } else if (!((hqh0) ooh0Var3).s()) {
                    i3 = 1;
                }
                return numValueOf2.compareTo(Integer.valueOf(i3));
            case 9:
                ooh0 ooh0Var4 = (ooh0) obj2;
                if (ooh0Var4 != null) {
                    if (ooh0Var4 instanceof koh0) {
                        z = true;
                        boolValueOf = Boolean.valueOf(z);
                        ooh0Var = (ooh0) obj;
                        if (ooh0Var != null) {
                            if (!(ooh0Var instanceof koh0)) {
                                if (ooh0Var instanceof loh0) {
                                    if (((loh0) ooh0Var).b) {
                                        z2 = false;
                                    }
                                } else if (ooh0Var instanceof moh0) {
                                    if (((moh0) ooh0Var).b) {
                                        z2 = false;
                                    }
                                }
                            }
                            return boolValueOf.compareTo(Boolean.valueOf(z2));
                        }
                    } else if (ooh0Var4 instanceof loh0) {
                        if (((loh0) ooh0Var4).b) {
                            z = false;
                        } else {
                            z = true;
                        }
                        boolValueOf = Boolean.valueOf(z);
                        ooh0Var = (ooh0) obj;
                        if (ooh0Var != null) {
                            if (!(ooh0Var instanceof koh0)) {
                                if (ooh0Var instanceof loh0) {
                                    if (((loh0) ooh0Var).b) {
                                        z2 = false;
                                    }
                                } else if (ooh0Var instanceof moh0) {
                                    if (((moh0) ooh0Var).b) {
                                        z2 = false;
                                    }
                                }
                            }
                            return boolValueOf.compareTo(Boolean.valueOf(z2));
                        }
                    } else if (ooh0Var4 instanceof moh0) {
                        if (((moh0) ooh0Var4).b) {
                            z = false;
                        } else {
                            z = true;
                        }
                        boolValueOf = Boolean.valueOf(z);
                        ooh0Var = (ooh0) obj;
                        if (ooh0Var != null) {
                            if (!(ooh0Var instanceof koh0)) {
                                if (ooh0Var instanceof loh0) {
                                    if (((loh0) ooh0Var).b) {
                                        z2 = false;
                                    }
                                } else if (ooh0Var instanceof moh0) {
                                    if (((moh0) ooh0Var).b) {
                                        z2 = false;
                                    }
                                }
                            }
                            return boolValueOf.compareTo(Boolean.valueOf(z2));
                        }
                    }
                }
                t9f.b();
                return 0;
            case 10:
                iqh0 iqh0Var = (iqh0) obj;
                if (iqh0Var instanceof hqh0) {
                    i2 = !((hqh0) iqh0Var).s() ? 1 : 2;
                } else {
                    i2 = 0;
                }
                Integer numValueOf3 = Integer.valueOf(i2);
                iqh0 iqh0Var2 = (iqh0) obj2;
                if (!(iqh0Var2 instanceof hqh0)) {
                    i3 = 0;
                } else if (!((hqh0) iqh0Var2).s()) {
                    i3 = 1;
                }
                return numValueOf3.compareTo(Integer.valueOf(i3));
            case 11:
                return Integer.valueOf(((Number) obj2).intValue()).compareTo(Integer.valueOf(((Number) obj).intValue()));
            case 12:
                return Integer.valueOf(((odw) obj).e).compareTo(Integer.valueOf(((odw) obj2).e));
            case 13:
                return Integer.valueOf(((wdw) obj).f).compareTo(Integer.valueOf(((wdw) obj2).f));
            case 14:
                return Integer.valueOf(((en7) obj).c).compareTo(Integer.valueOf(((en7) obj2).c));
            case 15:
                return Integer.valueOf(((btp) obj).f3192a).compareTo(Integer.valueOf(((btp) obj2).f3192a));
            case 16:
                return Long.valueOf(((d0t) obj).s).compareTo(Long.valueOf(((d0t) obj2).s));
            case 17:
                b2w b2wVar = (b2w) obj;
                if (b2wVar != null) {
                    if (b2wVar instanceof u1w) {
                        j = ((u1w) b2wVar).l;
                    } else if (b2wVar instanceof x1w) {
                        j = ((x1w) b2wVar).l;
                    } else if (b2wVar instanceof c2w) {
                        j = ((c2w) b2wVar).l;
                    }
                    Long lValueOf = Long.valueOf(j);
                    b2w b2wVar2 = (b2w) obj2;
                    if (b2wVar2 != null) {
                        if (b2wVar2 instanceof u1w) {
                            j2 = ((u1w) b2wVar2).l;
                        } else if (b2wVar2 instanceof x1w) {
                            j2 = ((x1w) b2wVar2).l;
                        } else if (b2wVar2 instanceof c2w) {
                            j2 = ((c2w) b2wVar2).l;
                        }
                        return lValueOf.compareTo(Long.valueOf(j2));
                    }
                }
                t9f.b();
                return 0;
            case 18:
                return Long.valueOf(((u0m0) obj).h).compareTo(Long.valueOf(((u0m0) obj2).h));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Integer.valueOf(((m800) obj).c).compareTo(Integer.valueOf(((m800) obj2).c));
            case 20:
                Iterator it = ((f3a) obj).b.iterator();
                if (it.hasNext()) {
                    Integer numValueOf4 = Integer.valueOf(CollectionsKt.Y(((krm0) it.next()).h, lrm0.n));
                    while (it.hasNext()) {
                        Integer numValueOf5 = Integer.valueOf(CollectionsKt.Y(((krm0) it.next()).h, lrm0.n));
                        if (numValueOf4.compareTo(numValueOf5) < 0) {
                            numValueOf4 = numValueOf5;
                        }
                    }
                    Iterator it2 = ((f3a) obj2).b.iterator();
                    if (it2.hasNext()) {
                        Integer numValueOf6 = Integer.valueOf(CollectionsKt.Y(((krm0) it2.next()).h, lrm0.n));
                        while (it2.hasNext()) {
                            Integer numValueOf7 = Integer.valueOf(CollectionsKt.Y(((krm0) it2.next()).h, lrm0.n));
                            if (numValueOf6.compareTo(numValueOf7) < 0) {
                                numValueOf6 = numValueOf7;
                            }
                        }
                        return numValueOf4.compareTo(numValueOf6);
                    }
                }
                itt0.a();
                return 0;
            case 21:
                Iterator it3 = ((f3a) obj).b.iterator();
                if (it3.hasNext()) {
                    Integer numValueOf8 = Integer.valueOf(lrm0.p.indexOf(new grm0(((krm0) it3.next()).c)));
                    while (it3.hasNext()) {
                        Integer numValueOf9 = Integer.valueOf(lrm0.p.indexOf(new grm0(((krm0) it3.next()).c)));
                        if (numValueOf8.compareTo(numValueOf9) < 0) {
                            numValueOf8 = numValueOf9;
                        }
                    }
                    Iterator it4 = ((f3a) obj2).b.iterator();
                    if (it4.hasNext()) {
                        Integer numValueOf10 = Integer.valueOf(lrm0.p.indexOf(new grm0(((krm0) it4.next()).c)));
                        while (it4.hasNext()) {
                            Integer numValueOf11 = Integer.valueOf(lrm0.p.indexOf(new grm0(((krm0) it4.next()).c)));
                            if (numValueOf10.compareTo(numValueOf11) < 0) {
                                numValueOf10 = numValueOf11;
                            }
                        }
                        return numValueOf8.compareTo(numValueOf10);
                    }
                }
                itt0.a();
                return 0;
            case 22:
                return Boolean.valueOf(!((d0t) obj).C).compareTo(Boolean.valueOf(!((d0t) obj2).C));
            case 23:
                return Float.valueOf(daq0.c(((daq0) obj).f5764a)).compareTo(Float.valueOf(daq0.c(((daq0) obj2).f5764a)));
            case 24:
                return Integer.valueOf(((epn0) obj).f8198a).compareTo(Integer.valueOf(((epn0) obj2).f8198a));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Integer.valueOf(((epn0) obj).f8198a).compareTo(Integer.valueOf(((epn0) obj2).f8198a));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Long.valueOf(((hpn0) obj).c).compareTo(Long.valueOf(((hpn0) obj2).c));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Long.valueOf(((hpn0) obj).f13452a).compareTo(Long.valueOf(((hpn0) obj2).f13452a));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Long.valueOf(((hpn0) obj).c).compareTo(Long.valueOf(((hpn0) obj2).c));
            default:
                return Long.valueOf(((hpn0) obj).f13452a).compareTo(Long.valueOf(((hpn0) obj2).f13452a));
        }
    }
}
