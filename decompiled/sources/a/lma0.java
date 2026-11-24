package a;

import android.os.Bundle;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.feed.linelive.presentation.feeds.child.champs.models.FeedsChampsItemsSelectionState;
import org.xplatform.personal.impl.presentation.edit.ProfileEditViewModel$UiState;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModel;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModelItem;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModelItemClickable;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lma0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20289a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lma0(Object obj, byte b) {
        this.f20289a = b;
        this.b = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:221:0x0626  */
    /* JADX WARN: Code duplicated, block: B:238:0x066c  */
    /* JADX WARN: Code duplicated, block: B:240:0x0678  */
    /* JADX WARN: Code duplicated, block: B:241:0x067b  */
    /* JADX WARN: Code duplicated, block: B:243:0x067e  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        w2c0 w2c0Var;
        ProfileEditViewModel$UiState.Loaded loaded;
        Map map;
        Object obj3;
        ProfileEditUiModel profileEditUiModel;
        byte b = this.f20289a;
        byte b2 = 4;
        byte b3 = 5;
        cl5 cl5Var = ukd.f35823a;
        byte b4 = 2;
        byte b5 = 3;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                sma0 sma0Var = (sma0) obj4;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ahy.I(sma0Var.f, fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                dna0 dna0Var = (dna0) obj4;
                oyg0 oyg0Var = dna0Var.f;
                ocj ocjVar = dna0Var.i;
                Throwable th = (Throwable) obj;
                th.getClass();
                ((String) obj2).getClass();
                if (th instanceof ff5) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value2, pma0.a((pma0) value2, null, null, null, null, 0, false, false, false, 119)));
                } else {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value, pma0.a((pma0) value, null, null, null, null, 0, false, false, true, 127)));
                }
                return Unit.f46060a;
            case 2:
                fsa0 fsa0Var = (fsa0) obj4;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                nh70 nh70Var = fsa0.V1;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    k3t0 k3t0VarG0 = fsa0Var.G0();
                    boolean zI = fetVar2.i(fsa0Var);
                    Object objP = fetVar2.P();
                    if (zI || objP == cl5Var) {
                        wma0 wma0Var = new wma0(1, fsa0Var, fsa0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/polybet/impl/presentation/polybet_event/models/PolybetEventSideEffect;)V", 0, (byte) 1);
                        fetVar2.o0(wma0Var);
                        objP = wma0Var;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar2);
                    boolean zI2 = fetVar2.i(k3t0VarG0) | fetVar2.i(fsa0Var) | fetVar2.e(3) | fetVar2.g(pz40VarF);
                    Object objP2 = fetVar2.P();
                    if (zI2 || objP2 == cl5Var) {
                        nu80 nu80Var = new nu80(k3t0VarG0, fsa0Var, pz40VarF, null, (byte) 6);
                        fetVar2.o0(nu80Var);
                        objP2 = nu80Var;
                    }
                    m0x0.t(fetVar2, fsa0Var, (Function2) objP2);
                    pz40 pz40VarY = ((i3t0) fsa0Var.G0()).y(fetVar2);
                    boolean zI3 = fetVar2.i(fsa0Var);
                    Object objP3 = fetVar2.P();
                    if (zI3 || objP3 == cl5Var) {
                        objP3 = new dsa0(fsa0Var, (byte) 1);
                        fetVar2.o0(objP3);
                    }
                    Function1 function1 = (Function1) objP3;
                    boolean zI4 = fetVar2.i(fsa0Var);
                    Object objP4 = fetVar2.P();
                    if (zI4 || objP4 == cl5Var) {
                        objP4 = new csa0(fsa0Var, b5);
                        fetVar2.o0(objP4);
                    }
                    o050.B(0, fetVar2, pz40VarY, (Function0) objP4, function1);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 3:
                eta0 eta0Var = (eta0) obj4;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                xi70 xi70Var = eta0.P1;
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    k3t0 k3t0VarG1 = eta0Var.G0();
                    boolean zI5 = fetVar3.i(eta0Var);
                    Object objP5 = fetVar3.P();
                    if (zI5 || objP5 == cl5Var) {
                        wma0 wma0Var2 = new wma0(1, eta0Var, eta0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/feed/linelive/presentation/feeds/polybet/models/PolybetSideEffect;)V", 0, (byte) 2);
                        fetVar3.o0(wma0Var2);
                        objP5 = wma0Var2;
                    }
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) ((jhy) objP5), fetVar3);
                    boolean zI6 = fetVar3.i(k3t0VarG1) | fetVar3.i(eta0Var) | fetVar3.e(3) | fetVar3.g(pz40VarF2);
                    Object objP6 = fetVar3.P();
                    if (zI6 || objP6 == cl5Var) {
                        nu80 nu80Var2 = new nu80(k3t0VarG1, eta0Var, pz40VarF2, null, (byte) 7);
                        fetVar3.o0(nu80Var2);
                        objP6 = nu80Var2;
                    }
                    m0x0.t(fetVar3, eta0Var, (Function2) objP6);
                    nua0 nua0Var = (nua0) ((i3t0) eta0Var.G0()).y(fetVar3).getValue();
                    zcz zczVar = (zcz) eta0Var.L1.getValue();
                    k3t0 k3t0VarG2 = eta0Var.G0();
                    boolean zI7 = fetVar3.i(k3t0VarG2);
                    Object objP7 = fetVar3.P();
                    if (zI7 || objP7 == cl5Var) {
                        objP7 = new wma0(1, k3t0VarG2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 3);
                        fetVar3.o0(objP7);
                    }
                    ju70.B(null, nua0Var, zczVar, (Function1) ((jhy) objP7), fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 4:
                ota0 ota0Var = (ota0) obj4;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var3 = ota0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    ota0Var.f.getClass();
                } while (!p7m0Var3.m(value3, hua0.a((hua0) value3, null, true, 5)));
                return Unit.f46060a;
            case 5:
                FeedsChampsItemsSelectionState feedsChampsItemsSelectionState = (FeedsChampsItemsSelectionState) obj4;
                oyg0 oyg0Var2 = (oyg0) obj;
                gua0 gua0Var = (gua0) obj2;
                oyg0Var2.getClass();
                gua0Var.getClass();
                q7x.F(oyg0Var2, feedsChampsItemsSelectionState, "SELECTION_STATE_KEY");
                boolean z = feedsChampsItemsSelectionState.f46666a;
                q7x.F(oyg0Var2, Boolean.valueOf(z), "KEY_MULTISELECT_ACTIVE_STATE");
                return gua0.a(gua0Var, null, null, null, null, null, false, false, null, false, feedsChampsItemsSelectionState, z, 32767);
            case 6:
                ygq0 ygq0Var = (ygq0) obj4;
                oyg0 oyg0Var3 = (oyg0) obj;
                gua0 gua0Var2 = (gua0) obj2;
                oyg0Var3.getClass();
                gua0Var2.getClass();
                q7x.F(oyg0Var3, Integer.valueOf(ygq0Var.f42598a), "KEY_TIME_FILTER_ID");
                return gua0.a(gua0Var2, null, null, null, null, null, false, false, new ghq0(ygq0Var, gua0Var2.n.b), false, null, false, 122879);
            case 7:
                d2b0 d2b0Var = (d2b0) obj4;
                a8z a8zVar = d2b0Var.L1;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                rl70 rl70Var = d2b0.S1;
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI8 = fetVar4.i(d2b0Var);
                    Object objP8 = fetVar4.P();
                    if (zI8 || objP8 == cl5Var) {
                        wma0 wma0Var3 = new wma0(1, d2b0Var, d2b0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/aggregator/popular/classic/impl/presentation/compose/models/PopularClassicAggregatorSideEffect;)V", 0, (byte) 18);
                        fetVar4.o0(wma0Var3);
                        objP8 = wma0Var3;
                    }
                    lkz lkzVar3 = lkz.f20223a;
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f((Function1) ((jhy) objP8), fetVar4);
                    boolean zI9 = fetVar4.i(k3t0Var) | fetVar4.i(d2b0Var) | fetVar4.e(3) | fetVar4.g(pz40VarF3);
                    Object objP9 = fetVar4.P();
                    if (zI9 || objP9 == cl5Var) {
                        nu80 nu80Var3 = new nu80(k3t0Var, d2b0Var, pz40VarF3, null, (byte) 8);
                        fetVar4.o0(nu80Var3);
                        objP9 = nu80Var3;
                    }
                    m0x0.t(fetVar4, d2b0Var, (Function2) objP9);
                    pz40 pz40VarY2 = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar4);
                    k3t0 k3t0Var2 = (k3t0) a8zVar.getValue();
                    boolean zI10 = fetVar4.i(k3t0Var2);
                    Object objP10 = fetVar4.P();
                    if (zI10 || objP10 == cl5Var) {
                        wma0 wma0Var4 = new wma0(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 19);
                        fetVar4.o0(wma0Var4);
                        objP10 = wma0Var4;
                    }
                    Function1 function2 = (Function1) ((jhy) objP10);
                    boolean zI11 = fetVar4.i(d2b0Var);
                    Object objP11 = fetVar4.P();
                    if (zI11 || objP11 == cl5Var) {
                        objP11 = new yr80(d2b0Var, (byte) 21);
                        fetVar4.o0(objP11);
                    }
                    gq80.L(null, pz40VarY2, function2, (Function1) objP11, fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 8:
                a8z a8zVar2 = ((z5b0) obj4).O1;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                mi70 mi70Var = z5b0.R1;
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    d6b0 d6b0Var = (d6b0) ((i3t0) ((k3t0) a8zVar2.getValue())).y(fetVar5).getValue();
                    k3t0 k3t0Var3 = (k3t0) a8zVar2.getValue();
                    boolean zI12 = fetVar5.i(k3t0Var3);
                    Object objP12 = fetVar5.P();
                    if (zI12 || objP12 == cl5Var) {
                        wma0 wma0Var5 = new wma0(1, k3t0Var3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 23);
                        fetVar5.o0(wma0Var5);
                        objP12 = wma0Var5;
                    }
                    wha0.B(null, d6b0Var, (Function1) ((jhy) objP12), fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 9:
                u6b0 u6b0Var = (u6b0) obj4;
                Bundle bundle = (Bundle) obj2;
                xi70 xi70Var2 = u6b0.e2;
                if (!h97.B(bundle, (String) obj, "FROM_EDIT_COUPON")) {
                    return Unit.f46060a;
                }
                sbb0 sbb0VarJ0 = u6b0Var.J0();
                if (sbb0VarJ0.z.f()) {
                    p7m0 p7m0Var4 = sbb0VarJ0.J0;
                    p7m0Var4.getClass();
                    p7m0Var4.o(null, l5b0.f19446a);
                }
                return Unit.f46060a;
            case 10:
                String str = (String) obj2;
                ((Throwable) obj).getClass();
                str.getClass();
                p7m0 p7m0Var5 = ((sbb0) obj4).G0;
                o5b0 o5b0Var = new o5b0(str);
                p7m0Var5.getClass();
                p7m0Var5.o(null, o5b0Var);
                return Unit.f46060a;
            case 11:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                aib0 aib0Var = (aib0) obj2;
                rl70 rl70Var2 = qib0.Q1;
                aib0Var.getClass();
                ((qib0) obj4).H0().x(new gib0(zBooleanValue, aib0Var));
                return Unit.f46060a;
            case 12:
                String str2 = (String) obj2;
                ((Throwable) obj).getClass();
                str2.getClass();
                ((pmb0) obj4).G(new jjb0(str2));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                ((rmb0) obj4).a(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 14:
                lpb0 lpb0Var = (lpb0) obj4;
                Throwable th2 = (Throwable) obj;
                String str3 = (String) obj2;
                th2.getClass();
                str3.getClass();
                boolean z2 = th2 instanceof zhi0;
                sob0 sob0Var = pob0.f27321a;
                if (z2) {
                    String message = th2.getMessage();
                    if (message == null) {
                        message = str3;
                    }
                    lpb0Var.G(new wob0(message));
                } else if (agc.M(th2) && !((zob0) lpb0Var.D()).f44711a) {
                    sob0Var = oob0.f25589a;
                } else {
                    if (agc.M(th2) && ((zob0) lpb0Var.D()).f44711a) {
                        return Unit.f46060a;
                    }
                    lpb0Var.G(new wob0(str3));
                }
                sob0 sob0Var2 = sob0Var;
                p7m0 p7m0Var6 = lpb0Var.i.f25029a;
                do {
                    value4 = p7m0Var6.getValue();
                    value4.getClass();
                    lpb0Var.f.getClass();
                } while (!p7m0Var6.m(value4, zob0.a((zob0) value4, false, false, null, null, null, sob0Var2, null, null, 30719)));
                lpb0Var.G(new wob0(str3));
                return Unit.f46060a;
            case 15:
                org.xplatform.personal.impl.presentation.edit.n nVar = (org.xplatform.personal.impl.presentation.edit.n) obj4;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((String) obj2).getClass();
                if (th3 instanceof zhi0) {
                    zhi0 zhi0Var = (zhi0) th3;
                    b1j.w("error_code", Integer.valueOf(zhi0Var.c.getErrorCode()), nVar.l.f44322a, "acc_pers_data_sys_error");
                    b1j.r(zhi0Var.c.getErrorCode(), nVar.m.f1455a, 3225L);
                } else if (th3 instanceof ypn) {
                    List<cqn> list = ((ypn) th3).f43039a;
                    nVar.getClass();
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((cqn) it.next()).b);
                    }
                    for (cqn cqnVar : list) {
                        xi70 xi70Var3 = w2c0.f38441a;
                        String str4 = cqnVar.b;
                        String str5 = cqnVar.f4803a;
                        xi70Var3.getClass();
                        switch (str4) {
                            case "PassportDt":
                                w2c0Var = w2c0.q;
                                break;
                            case "BirthPlace":
                                w2c0Var = w2c0.i;
                                break;
                            case "CountryId":
                                w2c0Var = w2c0.j;
                                break;
                            case "RegionId":
                                w2c0Var = w2c0.k;
                                break;
                            case "Surname":
                                w2c0Var = w2c0.f;
                                break;
                            case "Inn":
                                w2c0Var = w2c0.s;
                                break;
                            case "Name":
                                w2c0Var = w2c0.e;
                                break;
                            case "Address":
                                w2c0Var = w2c0.m;
                                break;
                            case "BankAccountNumber":
                                w2c0Var = w2c0.u;
                                break;
                            case "PassportNumber":
                                w2c0Var = w2c0.p;
                                break;
                            case "Birthday":
                                w2c0Var = w2c0.h;
                                break;
                            case "PassportSeries":
                                w2c0Var = w2c0.o;
                                break;
                            case "PassportWho":
                                w2c0Var = w2c0.r;
                                break;
                            case "MiddleName":
                                w2c0Var = w2c0.g;
                                break;
                            case "CityId":
                                w2c0Var = w2c0.l;
                                break;
                            default:
                                w2c0Var = w2c0.v;
                                break;
                        }
                        ProfileEditViewModel$UiState profileEditViewModel$UiStateB = nVar.B();
                        if (profileEditViewModel$UiStateB instanceof ProfileEditViewModel$UiState.Loaded) {
                            int iOrdinal = w2c0Var.ordinal();
                            if (iOrdinal != 6 && iOrdinal != 12 && iOrdinal != 15) {
                                switch (iOrdinal) {
                                    case 8:
                                    case 9:
                                    case 10:
                                        loaded = (ProfileEditViewModel$UiState.Loaded) profileEditViewModel$UiStateB;
                                        map = loaded.f46786a;
                                        obj3 = map.get(w2c0Var);
                                        if (obj3 instanceof ProfileEditUiModel) {
                                            profileEditUiModel = (ProfileEditUiModel) obj3;
                                        } else {
                                            profileEditUiModel = null;
                                        }
                                        if (profileEditUiModel != null) {
                                            ProfileEditUiModelItemClickable profileEditUiModelItemClickableZ = ProfileEditUiModelItemClickable.z((ProfileEditUiModelItemClickable) profileEditUiModel, 0, null, false, false, str5, 95);
                                            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                                            linkedHashMap.put(w2c0Var, profileEditUiModelItemClickableZ);
                                            loaded = new ProfileEditViewModel$UiState.Loaded(linkedHashMap);
                                        }
                                        break;
                                    default:
                                        loaded = (ProfileEditViewModel$UiState.Loaded) profileEditViewModel$UiStateB;
                                        Map map2 = loaded.f46786a;
                                        Object obj5 = map2.get(w2c0Var);
                                        ProfileEditUiModel profileEditUiModel2 = obj5 instanceof ProfileEditUiModel ? (ProfileEditUiModel) obj5 : null;
                                        if (profileEditUiModel2 != null) {
                                            ProfileEditUiModelItem profileEditUiModelItemZ = ProfileEditUiModelItem.z((ProfileEditUiModelItem) profileEditUiModel2, null, str5, 47);
                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
                                            linkedHashMap2.put(w2c0Var, profileEditUiModelItemZ);
                                            loaded = new ProfileEditViewModel$UiState.Loaded(linkedHashMap2);
                                        }
                                        break;
                                }
                            } else {
                                loaded = (ProfileEditViewModel$UiState.Loaded) profileEditViewModel$UiStateB;
                                map = loaded.f46786a;
                                obj3 = map.get(w2c0Var);
                                if (obj3 instanceof ProfileEditUiModel) {
                                    profileEditUiModel = (ProfileEditUiModel) obj3;
                                } else {
                                    profileEditUiModel = null;
                                }
                                if (profileEditUiModel != null) {
                                    ProfileEditUiModelItemClickable profileEditUiModelItemClickableZ2 = ProfileEditUiModelItemClickable.z((ProfileEditUiModelItemClickable) profileEditUiModel, 0, null, false, false, str5, 95);
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(map);
                                    linkedHashMap3.put(w2c0Var, profileEditUiModelItemClickableZ2);
                                    loaded = new ProfileEditViewModel$UiState.Loaded(linkedHashMap3);
                                }
                            }
                            nVar.E(loaded);
                        }
                    }
                    zg zgVar = nVar.l;
                    zgVar.getClass();
                    i8i.D("field", CollectionsKt.b0(arrayList, ", ", null, null, null, 62), zgVar.f44322a, "acc_pers_data_error");
                    au0 au0Var = nVar.m;
                    au0Var.getClass();
                    au0Var.f1455a.a(cui0.b(new j1p(CollectionsKt.b0(arrayList, ", ", null, null, null, 62), (byte) 0)), 3226L);
                }
                return Unit.f46060a;
            case 16:
                euc0 euc0Var = (euc0) obj;
                ((Integer) obj2).getClass();
                euc0Var.getClass();
                ((e9b0) obj4).invoke(euc0Var);
                return Unit.f46060a;
            case 17:
                euc0 euc0Var2 = (euc0) obj;
                ((Integer) obj2).getClass();
                euc0Var2.getClass();
                ((l8c0) obj4).invoke(euc0Var2);
                return Unit.f46060a;
            case 18:
                int iIntValue6 = ((Integer) obj).intValue();
                ((Integer) obj2).getClass();
                mi70 mi70Var2 = m8c0.V1;
                ((m8c0) obj4).G0().c.y0(iIntValue6);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                x9c0 x9c0Var = (x9c0) obj4;
                fet fetVar6 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                rl70 rl70Var3 = x9c0.Q1;
                if (fetVar6.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    pz40 pz40VarY3 = ((i3t0) x9c0Var.H0()).y(fetVar6);
                    k3t0 k3t0VarH0 = x9c0Var.H0();
                    boolean zI13 = fetVar6.i(x9c0Var);
                    Object objP13 = fetVar6.P();
                    if (zI13 || objP13 == cl5Var) {
                        l8c0 l8c0Var = new l8c0(1, x9c0Var, x9c0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/promo/impl/promocheck/presentation/model/PromoCheckSideEffect;)V", 0, (byte) 11);
                        fetVar6.o0(l8c0Var);
                        objP13 = l8c0Var;
                    }
                    lkz lkzVar4 = lkz.f20223a;
                    pz40 pz40VarF4 = androidx.compose.runtime.e.f((Function1) ((jhy) objP13), fetVar6);
                    boolean zI14 = fetVar6.i(k3t0VarH0) | fetVar6.i(x9c0Var) | fetVar6.e(3) | fetVar6.g(pz40VarF4);
                    Object objP14 = fetVar6.P();
                    if (zI14 || objP14 == cl5Var) {
                        nu80 nu80Var4 = new nu80(k3t0VarH0, x9c0Var, pz40VarF4, null, (byte) 11);
                        fetVar6.o0(nu80Var4);
                        objP14 = nu80Var4;
                    }
                    m0x0.t(fetVar6, x9c0Var, (Function2) objP14);
                    boolean zI15 = fetVar6.i(x9c0Var);
                    Object objP15 = fetVar6.P();
                    if (zI15 || objP15 == cl5Var) {
                        objP15 = new v9c0(x9c0Var, b5);
                        fetVar6.o0(objP15);
                    }
                    Function0 function0 = (Function0) objP15;
                    boolean zI16 = fetVar6.i(x9c0Var);
                    Object objP16 = fetVar6.P();
                    if (zI16 || objP16 == cl5Var) {
                        objP16 = new v9c0(x9c0Var, b2);
                        fetVar6.o0(objP16);
                    }
                    v3c.A(function0, (Function0) objP16, null, fetVar6, 0, 4);
                    k3t0 k3t0VarH1 = x9c0Var.H0();
                    boolean zI17 = fetVar6.i(k3t0VarH1);
                    Object objP17 = fetVar6.P();
                    if (zI17 || objP17 == cl5Var) {
                        l8c0 l8c0Var2 = new l8c0(1, k3t0VarH1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 12);
                        fetVar6.o0(l8c0Var2);
                        objP17 = l8c0Var2;
                    }
                    f1t0.C(pz40VarY3, (Function1) ((jhy) objP17), fetVar6, 6);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 20:
                String str6 = (String) obj2;
                ((Throwable) obj).getClass();
                str6.getClass();
                ((pac0) obj4).G(new fac0(str6));
                return Unit.f46060a;
            case 21:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                ((tac0) obj4).m.f(new rac0(null));
                return Unit.f46060a;
            case 22:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                ((rkc0) obj4).b.d.g(null);
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                piz.v((llc0) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                yyw.s((mlc0) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                azw.q((nlc0) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lmc0 lmc0Var = (lmc0) obj4;
                fet fetVar7 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                mi70 mi70Var3 = lmc0.Q1;
                if (fetVar7.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    clz clzVar = (clz) fetVar7.k(or00.f25714a);
                    Object objP18 = fetVar7.P();
                    if (objP18 == cl5Var) {
                        xpi xpiVar = lmc0Var.N1;
                        if (xpiVar == null) {
                            Intrinsics.h("viewModelFactory");
                            throw null;
                        }
                        objP18 = new q0h0(xpiVar);
                        fetVar7.o0(objP18);
                    }
                    q0h0 q0h0Var = (q0h0) objP18;
                    sgy sgyVarB = sre0.f32672a.b(lyc0.class);
                    boolean zI18 = fetVar7.i(q0h0Var);
                    Object objP19 = fetVar7.P();
                    if (zI18 || objP19 == cl5Var) {
                        objP19 = new lop(q0h0Var, b4);
                        fetVar7.o0(objP19);
                    }
                    a8z a8zVarA0 = xbc.a0(lmc0Var, sgyVarB, null, (Function0) objP19, 14);
                    Unit unit = Unit.f46060a;
                    boolean zI19 = fetVar7.i(lmc0Var) | fetVar7.i(clzVar) | fetVar7.i(a8zVarA0);
                    Object objP20 = fetVar7.P();
                    if (zI19 || objP20 == cl5Var) {
                        objP20 = new zlb0(lmc0Var, clzVar, a8zVarA0, b3);
                        fetVar7.o0(objP20);
                    }
                    m0x0.o(unit, (Function1) objP20, fetVar7);
                    k3t0 k3t0Var4 = (k3t0) a8zVarA0.getValue();
                    Object objP21 = fetVar7.P();
                    if (objP21 == cl5Var) {
                        objP21 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar7);
                        fetVar7.o0(objP21);
                    }
                    vne vneVar = (vne) objP21;
                    boolean zI20 = fetVar7.i(lmc0Var) | fetVar7.i(a8zVarA0);
                    Object objP22 = fetVar7.P();
                    if (zI20 || objP22 == cl5Var) {
                        objP22 = new oac0(lmc0Var, a8zVarA0, b3);
                        fetVar7.o0(objP22);
                    }
                    Function1 function3 = (Function1) objP22;
                    boolean zI21 = fetVar7.i(vneVar) | fetVar7.i(k3t0Var4) | fetVar7.g(function3) | fetVar7.g(null);
                    Object objP23 = fetVar7.P();
                    if (zI21 || objP23 == cl5Var) {
                        objP23 = new ggc0(vneVar, k3t0Var4, function3, b5);
                        fetVar7.o0(objP23);
                    }
                    m0x0.o(unit, (Function1) objP23, fetVar7);
                    boolean zI22 = fetVar7.i(a8zVarA0);
                    Object objP24 = fetVar7.P();
                    if (zI22 || objP24 == cl5Var) {
                        objP24 = new nop(a8zVarA0, (byte) 8);
                        fetVar7.o0(objP24);
                    }
                    Function0 function4 = (Function0) objP24;
                    boolean zI23 = fetVar7.i(a8zVarA0);
                    Object objP25 = fetVar7.P();
                    if (zI23 || objP25 == cl5Var) {
                        objP25 = new nop(a8zVarA0, (byte) 9);
                        fetVar7.o0(objP25);
                    }
                    v3c.z(function4, (Function0) objP25, null, fetVar7, 0, 4);
                    pz40 pz40VarY4 = ((i3t0) ((k3t0) a8zVarA0.getValue())).y(fetVar7);
                    k3t0 k3t0Var5 = (k3t0) a8zVarA0.getValue();
                    boolean zI24 = fetVar7.i(k3t0Var5);
                    Object objP26 = fetVar7.P();
                    if (zI24 || objP26 == cl5Var) {
                        l8c0 l8c0Var3 = new l8c0(1, k3t0Var5, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 24);
                        fetVar7.o0(l8c0Var3);
                        objP26 = l8c0Var3;
                    }
                    i4w0.F(pz40VarY4, (Function1) ((jhy) objP26), fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                i4w0.B((anc0) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ppc0 ppc0Var = (ppc0) obj4;
                a8z a8zVar3 = ppc0Var.O1;
                fet fetVar8 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                nh70 nh70Var2 = ppc0.R1;
                if (fetVar8.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    k3t0 k3t0Var6 = (k3t0) a8zVar3.getValue();
                    Object objP27 = fetVar8.P();
                    if (objP27 == cl5Var) {
                        objP27 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar8);
                        fetVar8.o0(objP27);
                    }
                    vne vneVar2 = (vne) objP27;
                    boolean zI25 = fetVar8.i(ppc0Var);
                    Object objP28 = fetVar8.P();
                    if (zI25 || objP28 == cl5Var) {
                        objP28 = new opc0(1, ppc0Var, ppc0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/promo/impl/promocodes/presentation/models/PromoShopCategoriesSideEffect;)V", 0, (byte) 0);
                        fetVar8.o0(objP28);
                    }
                    Function1 function5 = (Function1) ((jhy) objP28);
                    Unit unit2 = Unit.f46060a;
                    boolean zG = fetVar8.g(null) | fetVar8.i(vneVar2) | fetVar8.i(k3t0Var6) | fetVar8.g(function5);
                    Object objP29 = fetVar8.P();
                    if (zG || objP29 == cl5Var) {
                        objP29 = new ggc0(vneVar2, k3t0Var6, function5, b2);
                        fetVar8.o0(objP29);
                    }
                    m0x0.o(unit2, (Function1) objP29, fetVar8);
                    pz40 pz40VarY5 = ((i3t0) ((k3t0) a8zVar3.getValue())).y(fetVar8);
                    k3t0 k3t0Var7 = (k3t0) a8zVar3.getValue();
                    boolean zI26 = fetVar8.i(k3t0Var7);
                    Object objP30 = fetVar8.P();
                    if (zI26 || objP30 == cl5Var) {
                        l8c0 l8c0Var4 = new l8c0(1, k3t0Var7, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 27);
                        fetVar8.o0(l8c0Var4);
                        objP30 = l8c0Var4;
                    }
                    vbw0.G(pz40VarY5, (Function1) ((jhy) objP30), fetVar8, 0);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            default:
                pqc0 pqc0Var = (pqc0) obj4;
                a8z a8zVar4 = pqc0Var.N1;
                fet fetVar9 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                mi70 mi70Var4 = pqc0.Q1;
                if (fetVar9.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    k3t0 k3t0Var8 = (k3t0) a8zVar4.getValue();
                    boolean zI27 = fetVar9.i(pqc0Var);
                    Object objP31 = fetVar9.P();
                    if (zI27 || objP31 == cl5Var) {
                        l8c0 l8c0Var5 = new l8c0(1, pqc0Var, pqc0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/promo/impl/promocodes/presentation/detail/models/PromoShopDetailSideEffect;)V", 0, (byte) 28);
                        fetVar9.o0(l8c0Var5);
                        objP31 = l8c0Var5;
                    }
                    lkz lkzVar5 = lkz.f20223a;
                    pz40 pz40VarF5 = androidx.compose.runtime.e.f((Function1) ((jhy) objP31), fetVar9);
                    boolean zI28 = fetVar9.i(k3t0Var8) | fetVar9.i(pqc0Var) | fetVar9.e(3) | fetVar9.g(pz40VarF5);
                    Object objP32 = fetVar9.P();
                    if (zI28 || objP32 == cl5Var) {
                        nu80 nu80Var5 = new nu80(k3t0Var8, pqc0Var, pz40VarF5, null, (byte) 12);
                        fetVar9.o0(nu80Var5);
                        objP32 = nu80Var5;
                    }
                    m0x0.t(fetVar9, pqc0Var, (Function2) objP32);
                    pz40 pz40VarY6 = ((i3t0) ((k3t0) a8zVar4.getValue())).y(fetVar9);
                    k3t0 k3t0Var9 = (k3t0) a8zVar4.getValue();
                    boolean zI29 = fetVar9.i(k3t0Var9);
                    Object objP33 = fetVar9.P();
                    if (zI29 || objP33 == cl5Var) {
                        objP33 = new l8c0(1, k3t0Var9, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 29);
                        fetVar9.o0(objP33);
                    }
                    hew0.x(0, fetVar9, null, pz40VarY6, (Function1) ((jhy) objP33));
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ lma0(Object obj, int i, byte b) {
        this.f20289a = b;
        this.b = obj;
    }
}
