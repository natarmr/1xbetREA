package a;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.statistic.rating.api.di.RatingStatisticScreenParams;
import org.xplatform.statistic.rating.impl.rating_statistic.domain.model.SelectorOptionModel;

/* JADX INFO: loaded from: classes6.dex */
public final class u7e0 extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ z220 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ byte l;
    public final /* synthetic */ j6i0 m;
    public final /* synthetic */ RatingStatisticScreenParams n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u7e0(z220 z220Var, int i, int i2, j6i0 j6i0Var, RatingStatisticScreenParams ratingStatisticScreenParams, yje yjeVar) {
        super(2, yjeVar);
        this.j = z220Var;
        this.k = i;
        this.l = i2;
        this.m = j6i0Var;
        this.n = ratingStatisticScreenParams;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new u7e0(this.j, this.k, this.l, this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u7e0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x014c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0185  */
    /* JADX WARN: Code duplicated, block: B:127:0x018c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0192  */
    /* JADX WARN: Code duplicated, block: B:131:0x0198  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:149:0x0202  */
    /* JADX WARN: Code duplicated, block: B:151:0x0207  */
    /* JADX WARN: Code duplicated, block: B:153:0x0212  */
    /* JADX WARN: Code duplicated, block: B:175:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:? A[LOOP:6: B:136:0x01aa->B:177:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:85:0x0118  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Object obj2;
        String str3;
        String str4;
        String str5;
        int i;
        String str6;
        RatingStatisticScreenParams ratingStatisticScreenParams;
        String str7;
        String str8;
        int i2;
        Object objB;
        Object objA;
        Map map;
        List list;
        Iterator it;
        Object obj3;
        SelectorOptionModel selectorOptionModel;
        String str9;
        Object next;
        Map map2;
        List list2;
        Object next2;
        Map map3;
        List list3;
        Object next3;
        Map map4;
        List list4;
        Object next4;
        Map map5;
        List list5;
        Object next5;
        Map map6;
        List list6;
        Object next6;
        Map map7;
        List list7;
        Object next7;
        dx5 dx5Var;
        z220 z220Var = this.j;
        zn00 zn00Var = (zn00) z220Var.b;
        knf0 knf0Var = (knf0) z220Var.d;
        wne wneVar = wne.f39444a;
        byte b = this.i;
        Object obj4 = null;
        if (b == 0) {
            z1x.P(obj);
            String strC = knf0Var.c();
            int iB = knf0Var.b();
            String strValueOf = String.valueOf(this.k);
            String strValueOf2 = String.valueOf((int) this.l);
            String str10 = "";
            j6i0 j6i0Var = this.m;
            if (j6i0Var == null || (map7 = j6i0Var.b) == null || (list7 = (List) map7.get(g6i0.b)) == null) {
                str = "";
            } else {
                Iterator it2 = list7.iterator();
                do {
                    if (!it2.hasNext()) {
                        next7 = null;
                        break;
                    }
                    next7 = it2.next();
                } while (!((SelectorOptionModel) next7).d);
                SelectorOptionModel selectorOptionModel2 = (SelectorOptionModel) next7;
                if (selectorOptionModel2 == null || (str = selectorOptionModel2.b) == null) {
                    str = "";
                }
            }
            if (j6i0Var == null || (map6 = j6i0Var.b) == null || (list6 = (List) map6.get(g6i0.c)) == null) {
                str2 = "";
            } else {
                Iterator it3 = list6.iterator();
                do {
                    if (!it3.hasNext()) {
                        next6 = null;
                        break;
                    }
                    next6 = it3.next();
                } while (!((SelectorOptionModel) next6).d);
                SelectorOptionModel selectorOptionModel3 = (SelectorOptionModel) next6;
                if (selectorOptionModel3 == null || (str2 = selectorOptionModel3.b) == null) {
                    str2 = "";
                }
            }
            if (j6i0Var != null && (map5 = j6i0Var.b) != null && (list5 = (List) map5.get(g6i0.d)) != null) {
                Iterator it4 = list5.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj2 = obj4;
                        next5 = obj2;
                        break;
                    }
                    next5 = it4.next();
                    obj2 = obj4;
                    if (((SelectorOptionModel) next5).d) {
                        break;
                    }
                    obj4 = obj2;
                }
                SelectorOptionModel selectorOptionModel4 = (SelectorOptionModel) next5;
                if (selectorOptionModel4 == null || (str3 = selectorOptionModel4.b) == null) {
                }
                if (j6i0Var != null || (map4 = j6i0Var.b) == null || (list4 = (List) map4.get(g6i0.e)) == null) {
                    str4 = "";
                } else {
                    Iterator it5 = list4.iterator();
                    do {
                        if (!it5.hasNext()) {
                            next4 = obj2;
                            break;
                        }
                        next4 = it5.next();
                    } while (!((SelectorOptionModel) next4).d);
                    SelectorOptionModel selectorOptionModel5 = (SelectorOptionModel) next4;
                    if (selectorOptionModel5 == null || (str4 = selectorOptionModel5.b) == null) {
                        str4 = "";
                    }
                }
                if (j6i0Var != null || (map3 = j6i0Var.b) == null || (list3 = (List) map3.get(g6i0.h)) == null) {
                    str5 = "";
                } else {
                    Iterator it6 = list3.iterator();
                    do {
                        if (!it6.hasNext()) {
                            next3 = obj2;
                            break;
                        }
                        next3 = it6.next();
                    } while (!((SelectorOptionModel) next3).d);
                    SelectorOptionModel selectorOptionModel6 = (SelectorOptionModel) next3;
                    if (selectorOptionModel6 == null || (str5 = selectorOptionModel6.b) == null) {
                        str5 = "";
                    }
                }
                if (j6i0Var == null && (map2 = j6i0Var.b) != null && (list2 = (List) map2.get(g6i0.f)) != null) {
                    Iterator it7 = list2.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            i = iB;
                            next2 = obj2;
                            break;
                        }
                        next2 = it7.next();
                        i = iB;
                        if (((SelectorOptionModel) next2).d) {
                            break;
                        }
                        iB = i;
                    }
                    SelectorOptionModel selectorOptionModel7 = (SelectorOptionModel) next2;
                    if (selectorOptionModel7 == null || (str6 = selectorOptionModel7.b) == null) {
                    }
                    ratingStatisticScreenParams = this.n;
                    if (ratingStatisticScreenParams != null) {
                        str7 = str3;
                        if (ratingStatisticScreenParams instanceof RatingStatisticScreenParams.GameParamsStatistic) {
                            String str11 = ((RatingStatisticScreenParams.GameParamsStatistic) ratingStatisticScreenParams).f47061a;
                            if (j6i0Var != null && (map = j6i0Var.b) != null && (list = (List) map.get(g6i0.g)) != null) {
                                it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj3 = obj2;
                                        break;
                                    }
                                    next = it.next();
                                    if (((SelectorOptionModel) next).d) {
                                        obj3 = next;
                                        break;
                                    }
                                }
                                selectorOptionModel = (SelectorOptionModel) obj3;
                                if (selectorOptionModel != null && (str9 = selectorOptionModel.b) != null) {
                                    str10 = str9;
                                }
                            }
                            this.i = (byte) 1;
                            objA = ((p7e0) ((p7d0) zn00Var.b).invoke()).a("application/vnd.xenvelop+json", strC, str11, i, 1, sj3.i0(str10), sj3.i0(str5), sj3.i0(str), sj3.i0(str2), sj3.i0(str4), sj3.i0(str7), sj3.i0(str6), strValueOf2, strValueOf, this);
                            if (objA == wneVar) {
                                return wneVar;
                            }
                            dx5Var = (dx5) objA;
                        } else {
                            str8 = str4;
                            i2 = i;
                            if (ratingStatisticScreenParams instanceof RatingStatisticScreenParams.EventParamsStatistic) {
                                String str12 = ((RatingStatisticScreenParams.EventParamsStatistic) ratingStatisticScreenParams).f47060a;
                                this.i = (byte) 2;
                                objB = ((p7e0) ((p7d0) zn00Var.b).invoke()).b(str12, strC, 1, i2, 1357, sj3.i0(str5), sj3.i0(str), sj3.i0(str2), sj3.i0(str8), sj3.i0(str7), sj3.i0(str6), strValueOf2, strValueOf, this);
                                if (objB == wneVar) {
                                    return wneVar;
                                }
                                dx5Var = (dx5) objB;
                            }
                        }
                    }
                    t9f.b();
                    return obj2;
                }
                i = iB;
                str6 = "";
                ratingStatisticScreenParams = this.n;
                if (ratingStatisticScreenParams != null) {
                    str7 = str3;
                    if (ratingStatisticScreenParams instanceof RatingStatisticScreenParams.GameParamsStatistic) {
                        String str13 = ((RatingStatisticScreenParams.GameParamsStatistic) ratingStatisticScreenParams).f47061a;
                        if (j6i0Var != null) {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj3 = obj2;
                                    break;
                                }
                                next = it.next();
                                if (((SelectorOptionModel) next).d) {
                                    obj3 = next;
                                    break;
                                }
                            }
                            selectorOptionModel = (SelectorOptionModel) obj3;
                            if (selectorOptionModel != null) {
                                str10 = str9;
                            }
                        }
                        this.i = (byte) 1;
                        objA = ((p7e0) ((p7d0) zn00Var.b).invoke()).a("application/vnd.xenvelop+json", strC, str13, i, 1, sj3.i0(str10), sj3.i0(str5), sj3.i0(str), sj3.i0(str2), sj3.i0(str4), sj3.i0(str7), sj3.i0(str6), strValueOf2, strValueOf, this);
                        if (objA == wneVar) {
                            return wneVar;
                        }
                        dx5Var = (dx5) objA;
                    } else {
                        str8 = str4;
                        i2 = i;
                        if (ratingStatisticScreenParams instanceof RatingStatisticScreenParams.EventParamsStatistic) {
                            String str14 = ((RatingStatisticScreenParams.EventParamsStatistic) ratingStatisticScreenParams).f47060a;
                            this.i = (byte) 2;
                            objB = ((p7e0) ((p7d0) zn00Var.b).invoke()).b(str14, strC, 1, i2, 1357, sj3.i0(str5), sj3.i0(str), sj3.i0(str2), sj3.i0(str8), sj3.i0(str7), sj3.i0(str6), strValueOf2, strValueOf, this);
                            if (objB == wneVar) {
                                return wneVar;
                            }
                            dx5Var = (dx5) objB;
                        }
                    }
                }
                t9f.b();
                return obj2;
            }
            obj2 = null;
            str3 = "";
            if (j6i0Var != null) {
                str4 = "";
            } else {
                str4 = "";
            }
            if (j6i0Var != null) {
                str5 = "";
            } else {
                str5 = "";
            }
            if (j6i0Var == null) {
                i = iB;
                str6 = "";
            } else {
                i = iB;
                str6 = "";
            }
            ratingStatisticScreenParams = this.n;
            if (ratingStatisticScreenParams != null) {
                str7 = str3;
                if (ratingStatisticScreenParams instanceof RatingStatisticScreenParams.GameParamsStatistic) {
                    String str15 = ((RatingStatisticScreenParams.GameParamsStatistic) ratingStatisticScreenParams).f47061a;
                    if (j6i0Var != null) {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj3 = obj2;
                                break;
                            }
                            next = it.next();
                            if (((SelectorOptionModel) next).d) {
                                obj3 = next;
                                break;
                            }
                        }
                        selectorOptionModel = (SelectorOptionModel) obj3;
                        if (selectorOptionModel != null) {
                            str10 = str9;
                        }
                    }
                    this.i = (byte) 1;
                    objA = ((p7e0) ((p7d0) zn00Var.b).invoke()).a("application/vnd.xenvelop+json", strC, str15, i, 1, sj3.i0(str10), sj3.i0(str5), sj3.i0(str), sj3.i0(str2), sj3.i0(str4), sj3.i0(str7), sj3.i0(str6), strValueOf2, strValueOf, this);
                    if (objA == wneVar) {
                        return wneVar;
                    }
                    dx5Var = (dx5) objA;
                } else {
                    str8 = str4;
                    i2 = i;
                    if (ratingStatisticScreenParams instanceof RatingStatisticScreenParams.EventParamsStatistic) {
                        String str16 = ((RatingStatisticScreenParams.EventParamsStatistic) ratingStatisticScreenParams).f47060a;
                        this.i = (byte) 2;
                        objB = ((p7e0) ((p7d0) zn00Var.b).invoke()).b(str16, strC, 1, i2, 1357, sj3.i0(str5), sj3.i0(str), sj3.i0(str2), sj3.i0(str8), sj3.i0(str7), sj3.i0(str6), strValueOf2, strValueOf, this);
                        if (objB == wneVar) {
                            return wneVar;
                        }
                        dx5Var = (dx5) objB;
                    }
                }
            }
            t9f.b();
            return obj2;
        }
        if (b == 1) {
            z1x.P(obj);
            objA = obj;
            dx5Var = (dx5) objA;
        } else {
            if (b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objB = obj;
            dx5Var = (dx5) objB;
        }
        return dx5Var.a();
    }
}
