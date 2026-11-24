package a;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xplatform.feed.topgamesbystat.presentation.params.TopGamesByStatBottomSheetScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class wnp extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ eop k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wnp(eop eopVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = eopVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        eop eopVar = this.k;
        switch (b) {
            case 0:
                wnp wnpVar = new wnp(eopVar, yjeVar, (byte) 0);
                wnpVar.j = obj;
                return wnpVar;
            case 1:
                wnp wnpVar2 = new wnp(eopVar, yjeVar, (byte) 1);
                wnpVar2.j = obj;
                return wnpVar2;
            case 2:
                wnp wnpVar3 = new wnp(eopVar, yjeVar, (byte) 2);
                wnpVar3.j = obj;
                return wnpVar3;
            default:
                wnp wnpVar4 = new wnp(eopVar, yjeVar, (byte) 3);
                wnpVar4.j = obj;
                return wnpVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((wnp) create((zmb) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((wnp) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((wnp) create((ghq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wnp) create((x5r0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e7  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        f9h0 m8h0Var;
        Object value;
        boolean z;
        List listL0;
        List list;
        v5r0 v5r0Var;
        int iOrdinal;
        Long l;
        long jLongValue;
        byte b = this.i;
        eop eopVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                zmb zmbVar = (zmb) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = eop.Z;
                p7m0 p7m0Var = eopVar.i.f25029a;
                while (true) {
                    Object value2 = p7m0Var.getValue();
                    value2.getClass();
                    zmb zmbVar2 = zmbVar;
                    if (p7m0Var.m(value2, pnp.a((pnp) value2, null, false, null, null, false, false, null, false, 0, null, false, false, false, false, zmbVar, null, 1572863))) {
                        eopVar.o.e("KEY_CHAMP_SORT_TYPE", zmbVar2);
                        return Unit.f46060a;
                    }
                    zmbVar = zmbVar2;
                }
                break;
            case 1:
                String str = (String) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                f9h0 f9h0Var = ((pnp) eopVar.D()).d;
                if (f9h0Var instanceof m8h0) {
                    m8h0 m8h0Var2 = (m8h0) f9h0Var;
                    Set set = m8h0Var2.b;
                    boolean z2 = m8h0Var2.c;
                    str.getClass();
                    set.getClass();
                    m8h0Var = new m8h0(str, set, z2);
                } else {
                    m8h0Var = f9h0Var;
                }
                p7m0 p7m0Var2 = eopVar.i.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                } while (!p7m0Var2.m(value, pnp.a((pnp) value, null, false, m8h0Var, null, false, false, null, false, 0, null, false, false, false, false, null, null, 2097143)));
                eopVar.o.e("KEY_SCREEN_STATE", eopVar.D());
                return Unit.f46060a;
            case 2:
                ghq0 ghq0Var = (ghq0) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                ygq0 ygq0Var = ghq0Var.f11314a;
                int i2 = eop.Z;
                boolean z3 = ygq0Var != ygq0.NOT;
                eopVar.o.e("KEY_TIME_ACTIVE_STATE", Boolean.valueOf(z3));
                p7m0 p7m0Var3 = eopVar.i.f25029a;
                while (true) {
                    Object value3 = p7m0Var3.getValue();
                    value3.getClass();
                    ghq0 ghq0Var2 = ghq0Var;
                    if (p7m0Var3.m(value3, pnp.a((pnp) value3, null, false, null, null, false, false, null, false, 0, null, false, false, false, z3, null, ghq0Var2, 786431))) {
                        return Unit.f46060a;
                    }
                    ghq0Var = ghq0Var2;
                }
                break;
            default:
                x5r0 x5r0Var = (x5r0) obj2;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (x5r0Var.f40332a) {
                    nas nasVar = x5r0Var.b;
                    int i3 = eop.Z;
                    pnp pnpVar = (pnp) eopVar.D();
                    pnpVar.getClass();
                    j700 j700VarW = hfm0.w(pnpVar);
                    f9h0 f9h0Var2 = pnpVar.d;
                    int iOrdinal2 = j700VarW.ordinal();
                    TopGamesByStatBottomSheetScreenParams topGamesByStatBottomSheetScreenParams = null;
                    if (iOrdinal2 == 0) {
                        z = false;
                    } else {
                        if (iOrdinal2 != 1 && iOrdinal2 != 2 && iOrdinal2 != 3) {
                            t9f.b();
                            return null;
                        }
                        z = true;
                    }
                    if (f9h0Var2.equals(y8h0.f42195a) || f9h0Var2.equals(z8h0.f43966a)) {
                        listL0 = iun.f15405a;
                    } else {
                        if (f9h0Var2 instanceof d8h0) {
                            listL0 = CollectionsKt.L0(pnpVar.m);
                        } else {
                            if (!(f9h0Var2 instanceof m8h0) && !(f9h0Var2 instanceof p8h0)) {
                                t9f.b();
                                return null;
                            }
                            list = null;
                        }
                        if (list != null && nasVar != null) {
                            if (f9h0Var2 instanceof d8h0) {
                                if (!((d8h0) f9h0Var2).f5648a.isEmpty()) {
                                    v5r0Var = v5r0.CHAMP_BET_ON_YOURS;
                                } else if (j700VarW == j700.b) {
                                    v5r0Var = v5r0.CHAMP_LIVE;
                                } else {
                                    v5r0Var = (j700VarW == j700.f16016a && j700VarW == j700.c) ? v5r0.CHAMP_STREAM : v5r0.CHAMP_LINE;
                                }
                            } else if (f9h0Var2 instanceof y8h0) {
                                iOrdinal = j700VarW.ordinal();
                                if (iOrdinal != 0) {
                                    v5r0Var = v5r0.SPORTS_LINE;
                                } else if (iOrdinal != 1) {
                                    v5r0Var = v5r0.SPORTS_LIVE;
                                } else if (iOrdinal != 2) {
                                    v5r0Var = v5r0.SPORTS_LINE;
                                } else {
                                    v5r0Var = v5r0.SPORTS_STREAM;
                                }
                            } else if (f9h0Var2 instanceof z8h0) {
                                v5r0Var = v5r0.SPORTS_BET_ON_YOURS;
                            } else {
                                v5r0Var = v5r0.POPULAR_SPORT;
                            }
                            String str2 = v5r0Var.f36839a;
                            long j = nasVar.f23205a;
                            long j2 = nasVar.x;
                            l = nasVar.w;
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            topGamesByStatBottomSheetScreenParams = new TopGamesByStatBottomSheetScreenParams(j, j2, jLongValue, str2, list, z);
                        }
                        if (topGamesByStatBottomSheetScreenParams != null) {
                            eopVar.G(new dkp(topGamesByStatBottomSheetScreenParams));
                        }
                    }
                    list = listL0;
                    if (list != null) {
                        if (f9h0Var2 instanceof d8h0) {
                            if (!((d8h0) f9h0Var2).f5648a.isEmpty()) {
                                v5r0Var = v5r0.CHAMP_BET_ON_YOURS;
                            } else if (j700VarW == j700.b) {
                                v5r0Var = v5r0.CHAMP_LIVE;
                            } else if (j700VarW == j700.f16016a) {
                                v5r0Var = v5r0.CHAMP_LINE;
                            }
                        } else if (f9h0Var2 instanceof y8h0) {
                            iOrdinal = j700VarW.ordinal();
                            if (iOrdinal != 0) {
                                v5r0Var = v5r0.SPORTS_LINE;
                            } else if (iOrdinal != 1) {
                                v5r0Var = v5r0.SPORTS_LIVE;
                            } else if (iOrdinal != 2) {
                                v5r0Var = v5r0.SPORTS_LINE;
                            } else {
                                v5r0Var = v5r0.SPORTS_STREAM;
                            }
                        } else if (f9h0Var2 instanceof z8h0) {
                            v5r0Var = v5r0.SPORTS_BET_ON_YOURS;
                        } else {
                            v5r0Var = v5r0.POPULAR_SPORT;
                        }
                        String str3 = v5r0Var.f36839a;
                        long j3 = nasVar.f23205a;
                        long j4 = nasVar.x;
                        l = nasVar.w;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        topGamesByStatBottomSheetScreenParams = new TopGamesByStatBottomSheetScreenParams(j3, j4, jLongValue, str3, list, z);
                    }
                    if (topGamesByStatBottomSheetScreenParams != null) {
                        eopVar.G(new dkp(topGamesByStatBottomSheetScreenParams));
                    }
                }
                return Unit.f46060a;
        }
    }
}
