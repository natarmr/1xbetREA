package a;

import android.provider.Settings;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.registration.bonus.api.BonusSelectionScreenParams;
import org.xplatform.registration_default.impl.presentation.registration_bonus.models.RegistrationBonusDefaultScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tie0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34005a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tie0(Object obj, byte b) {
        this.f34005a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IOException {
        Object g0g0Var;
        Object value;
        int iY;
        Pair pair;
        Pair pair2;
        byte b = this.f34005a;
        byte b2 = 7;
        boolean z = false;
        byte b3 = 6;
        ?? r9 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (oie0) ((gii0) ((nw20) obj).f24215a).b(sre0.f32672a.b(oie0.class));
            case 1:
                zie0 zie0Var = bje0.P1;
                fiu0 fiu0Var = ((bje0) obj).K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                fiu0 fiu0Var2 = ((gke0) obj).L1;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 3:
                gle0 gle0Var = ile0.P1;
                fiu0 fiu0Var3 = ((ile0) obj).M1;
                if (fiu0Var3 != null) {
                    return fiu0Var3;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 4:
                lme0 lme0Var = nme0.Q1;
                fiu0 fiu0Var4 = ((nme0) obj).O1;
                if (fiu0Var4 != null) {
                    return fiu0Var4;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 5:
                ane0 ane0Var = (ane0) obj;
                try {
                    e0g0 e0g0Var = j0g0.b;
                    String[] list = ane0Var.f1147a.getAssets().list("");
                    g0g0Var = list != null ? tx3.l0(list) : null;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                Set set = (Set) (g0g0Var instanceof g0g0 ? 0 : g0g0Var);
                return set == null ? xun.f41520a : set;
            case 6:
                hoe0 hoe0Var = ((doe0) obj).N1;
                if (hoe0Var != null) {
                    hoe0Var.c.B();
                    return Unit.f46060a;
                }
                Intrinsics.h("viewModel");
                throw null;
            case 7:
                tpe0 tpe0Var = (tpe0) obj;
                p7m0 p7m0Var = tpe0Var.i;
                upe0 upe0Var = new upe0(sa10.b(tpe0Var.h, pb10.g, R.string.data_retrieval_error, 0, null, 28));
                p7m0Var.getClass();
                p7m0Var.o(null, upe0Var);
                return Unit.f46060a;
            case 8:
                zie0 zie0Var2 = eue0.n2;
                fiu0 fiu0Var5 = ((eue0) obj).l2;
                if (fiu0Var5 != null) {
                    return fiu0Var5;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 9:
                RegistrationBonusDefaultScreenParams registrationBonusDefaultScreenParams = (RegistrationBonusDefaultScreenParams) obj;
                return new mg8(registrationBonusDefaultScreenParams.f46870a, registrationBonusDefaultScreenParams.b, registrationBonusDefaultScreenParams.c, registrationBonusDefaultScreenParams.d, iun.f15405a, registrationBonusDefaultScreenParams.e);
            case 10:
                gle0 gle0Var2 = jue0.n2;
                fiu0 fiu0Var6 = ((jue0) obj).l2;
                if (fiu0Var6 != null) {
                    return fiu0Var6;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 11:
                BonusSelectionScreenParams bonusSelectionScreenParams = (BonusSelectionScreenParams) obj;
                return new vg8(bonusSelectionScreenParams.f46849a, bonusSelectionScreenParams.b, bonusSelectionScreenParams.c, bonusSelectionScreenParams.d, iun.f15405a, bonusSelectionScreenParams.e);
            case 12:
                eze0 eze0Var = (eze0) obj;
                oyg0 oyg0Var = eze0Var.f;
                ocj ocjVar = eze0Var.i;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                List list2 = ((aye0) eze0Var.D()).e;
                ArrayList<q0f0> arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (n2x.F((q0f0) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                q0f0 q0f0Var = (q0f0) CollectionsKt.f0(arrayList);
                for (q0f0 q0f0Var2 : arrayList) {
                    boolean zD = Intrinsics.d(q0f0Var2, q0f0Var);
                    if (!q0f0Var2.a()) {
                        linkedHashMap.put(x2x.s0(q0f0Var2), new j3x(zD ? 7 : 6));
                    }
                }
                p7m0 p7m0Var2 = ocjVar.f25029a;
                while (true) {
                    Object value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                    LinkedHashMap linkedHashMap2 = linkedHashMap;
                    if (p7m0Var2.m(value2, aye0.a((aye0) value2, false, false, false, null, null, null, null, null, linkedHashMap2, null, null, null, false, null, null, null, null, null, null, null, null, 2147483391))) {
                        List list3 = ((aye0) eze0Var.D()).e;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : list3) {
                            if (n2x.F((q0f0) obj3)) {
                                arrayList2.add(obj3);
                            }
                        }
                        int iA = wp20.a(r3d.q(arrayList2, 10));
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iA >= 16 ? iA : 16);
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            linkedHashMap3.put(x2x.s0((q0f0) it.next()), Boolean.FALSE);
                        }
                        p7m0 p7m0Var3 = ocjVar.f25029a;
                        while (true) {
                            Object value3 = p7m0Var3.getValue();
                            value3.getClass();
                            oyg0Var.getClass();
                            LinkedHashMap linkedHashMap4 = linkedHashMap3;
                            if (p7m0Var3.m(value3, aye0.a((aye0) value3, false, false, false, null, null, null, null, null, null, linkedHashMap4, null, null, false, null, null, null, null, null, null, null, null, 2147483135))) {
                                eze0Var.H(new dke0(((aye0) eze0Var.D()).h, (byte) 5));
                                return Unit.f46060a;
                            }
                            linkedHashMap3 = linkedHashMap4;
                        }
                    } else {
                        linkedHashMap = linkedHashMap2;
                    }
                }
                break;
            case 13:
                x5f0 x5f0Var = (x5f0) obj;
                oyg0 oyg0Var2 = x5f0Var.f;
                ocj ocjVar2 = x5f0Var.i;
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                List list4 = ((u4f0) x5f0Var.D()).d;
                ArrayList<q0f0> arrayList3 = new ArrayList();
                for (Object obj4 : list4) {
                    if (n2x.F((q0f0) obj4)) {
                        arrayList3.add(obj4);
                    }
                }
                q0f0 q0f0Var3 = (q0f0) CollectionsKt.f0(arrayList3);
                for (q0f0 q0f0Var4 : arrayList3) {
                    boolean zD2 = Intrinsics.d(q0f0Var4, q0f0Var3);
                    if (!q0f0Var4.a()) {
                        linkedHashMap5.put(x2x.s0(q0f0Var4), new j3x(zD2 ? 7 : 6));
                    }
                }
                p7m0 p7m0Var4 = ocjVar2.f25029a;
                while (true) {
                    Object value4 = p7m0Var4.getValue();
                    value4.getClass();
                    oyg0Var2.getClass();
                    LinkedHashMap linkedHashMap6 = linkedHashMap5;
                    if (p7m0Var4.m(value4, u4f0.a((u4f0) value4, false, false, null, null, null, null, null, linkedHashMap6, null, null, null, false, null, false, null, null, null, null, null, null, null, null, 1073741695))) {
                        List list5 = ((u4f0) x5f0Var.D()).d;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj5 : list5) {
                            if (n2x.F((q0f0) obj5)) {
                                arrayList4.add(obj5);
                            }
                        }
                        int iA2 = wp20.a(r3d.q(arrayList4, 10));
                        LinkedHashMap linkedHashMap7 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            linkedHashMap7.put(x2x.s0((q0f0) it2.next()), Boolean.FALSE);
                        }
                        p7m0 p7m0Var5 = ocjVar2.f25029a;
                        while (true) {
                            Object value5 = p7m0Var5.getValue();
                            value5.getClass();
                            oyg0Var2.getClass();
                            LinkedHashMap linkedHashMap8 = linkedHashMap7;
                            if (p7m0Var5.m(value5, u4f0.a((u4f0) value5, false, false, null, null, null, null, null, null, linkedHashMap8, null, null, false, null, false, null, null, null, null, null, null, null, null, 1073741567))) {
                                x5f0Var.H(new dke0(((u4f0) x5f0Var.D()).g, b3));
                                return Unit.f46060a;
                            }
                            linkedHashMap7 = linkedHashMap8;
                        }
                    } else {
                        linkedHashMap5 = linkedHashMap6;
                    }
                }
                break;
            case 14:
                ocf0 ocf0Var = (ocf0) obj;
                oyg0 oyg0Var3 = ocf0Var.f;
                ocj ocjVar3 = ocf0Var.i;
                LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                List list6 = ((mbf0) ocf0Var.D()).d;
                ArrayList<q0f0> arrayList5 = new ArrayList();
                for (Object obj6 : list6) {
                    if (n2x.F((q0f0) obj6)) {
                        arrayList5.add(obj6);
                    }
                }
                q0f0 q0f0Var5 = (q0f0) CollectionsKt.f0(arrayList5);
                for (q0f0 q0f0Var6 : arrayList5) {
                    boolean zD3 = Intrinsics.d(q0f0Var6, q0f0Var5);
                    if (!q0f0Var6.a()) {
                        linkedHashMap9.put(x2x.s0(q0f0Var6), new j3x(zD3 ? 7 : 6));
                    }
                }
                p7m0 p7m0Var6 = ocjVar3.f25029a;
                while (true) {
                    Object value6 = p7m0Var6.getValue();
                    value6.getClass();
                    oyg0Var3.getClass();
                    LinkedHashMap linkedHashMap10 = linkedHashMap9;
                    if (p7m0Var6.m(value6, mbf0.a((mbf0) value6, false, false, null, null, null, null, null, linkedHashMap10, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 1073741695))) {
                        List list7 = ((mbf0) ocf0Var.D()).d;
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj7 : list7) {
                            if (n2x.F((q0f0) obj7)) {
                                arrayList6.add(obj7);
                            }
                        }
                        int iA3 = wp20.a(r3d.q(arrayList6, 10));
                        LinkedHashMap linkedHashMap11 = new LinkedHashMap(iA3 >= 16 ? iA3 : 16);
                        Iterator it3 = arrayList6.iterator();
                        while (it3.hasNext()) {
                            linkedHashMap11.put(x2x.s0((q0f0) it3.next()), Boolean.FALSE);
                        }
                        p7m0 p7m0Var7 = ocjVar3.f25029a;
                        while (true) {
                            Object value7 = p7m0Var7.getValue();
                            value7.getClass();
                            oyg0Var3.getClass();
                            LinkedHashMap linkedHashMap12 = linkedHashMap11;
                            if (p7m0Var7.m(value7, mbf0.a((mbf0) value7, false, false, null, null, null, null, null, null, linkedHashMap12, null, null, null, null, false, null, null, null, null, null, null, null, null, 1073741567))) {
                                ocf0Var.H(new dke0(((mbf0) ocf0Var.D()).g, b2));
                                return Unit.f46060a;
                            }
                            linkedHashMap11 = linkedHashMap12;
                        }
                    } else {
                        linkedHashMap9 = linkedHashMap10;
                    }
                }
                break;
            case 15:
                rb50[] rb50VarArr = (rb50[]) obj;
                rb50[] rb50VarArr2 = (rb50[]) Arrays.copyOf(rb50VarArr, rb50VarArr.length);
                Object[] objArrCopyOf = Arrays.copyOf(rb50VarArr2, rb50VarArr2.length);
                SnapshotStateList snapshotStateList = new SnapshotStateList();
                snapshotStateList.addAll(tx3.g0(objArrCopyOf));
                return new u950(snapshotStateList);
            case 16:
                gle0 gle0Var3 = lgf0.N1;
                fiu0 fiu0Var7 = ((lgf0) obj).L1;
                if (fiu0Var7 != null) {
                    return fiu0Var7;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 17:
                return new gif0(((krc) obj).a(), "", false, false);
            case 18:
                p7m0 p7m0Var8 = ((gjf0) obj).i;
                do {
                    value = p7m0Var8.getValue();
                } while (!p7m0Var8.m(value, ejf0.a((ejf0) value, false, null, false, false, 14)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                knf0 knf0Var = (knf0) obj;
                wsb0 wsb0Var = knf0Var.c;
                String strC = ((twb0) wsb0Var).f34643a.c("APP_GUID", "");
                if (strC.length() != 0) {
                    return strC;
                }
                String strN = ohs0.n(Settings.Secure.getString(knf0Var.f18584a.getContentResolver(), "android_id"), "_2");
                twb0 twb0Var = (twb0) wsb0Var;
                twb0Var.getClass();
                twb0Var.f34643a.h("APP_GUID", strN);
                return strN;
            case 20:
                aqf0 aqf0Var = (aqf0) obj;
                sac.V(jiu0.a(aqf0Var), xpf0.f41268a, null, aqf0Var.s.f22085a, new ypf0(aqf0Var, r9, z ? 1 : 0), 10);
                return Unit.f46060a;
            case 21:
                return (kof0) ((xqf0) obj).f41316a.b(sre0.f32672a.b(kof0.class));
            case 22:
                zsf0 zsf0Var = (zsf0) obj;
                ClassLoader classLoader = zsf0Var.c;
                yzp yzpVar = zsf0Var.d;
                Enumeration<URL> resources = classLoader.getResources("");
                resources.getClass();
                ArrayList<URL> list8 = Collections.list(resources);
                list8.getClass();
                ArrayList arrayList7 = new ArrayList();
                for (URL url : list8) {
                    url.getClass();
                    if (Intrinsics.d(url.getProtocol(), "file")) {
                        String str = y190.b;
                        pair2 = new Pair(yzpVar, rl70.c(new File(url.toURI())));
                    } else {
                        pair2 = null;
                    }
                    if (pair2 != null) {
                        arrayList7.add(pair2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                resources2.getClass();
                ArrayList<URL> list9 = Collections.list(resources2);
                list9.getClass();
                ArrayList arrayList8 = new ArrayList();
                for (URL url2 : list9) {
                    url2.getClass();
                    String string = url2.toString();
                    string.getClass();
                    if (kotlin.text.c.x(string, "jar:file:", false) && (iY = StringsKt.Y(0, string, 6, "!")) != -1) {
                        String str2 = y190.b;
                        pair = new Pair(s7n0.t(rl70.c(new File(URI.create(string.substring(4, iY)))), yzpVar, new bue0((byte) 28)), zsf0.f);
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList8.add(pair);
                    }
                }
                return CollectionsKt.q0(arrayList7, arrayList8);
            case 23:
                return (duf0) ((gii0) ((zn00) obj).f44650a).b(sre0.f32672a.b(duf0.class));
            case 24:
                gne0 gne0Var = zuf0.e2;
                fiu0 fiu0Var8 = ((zuf0) obj).c2;
                if (fiu0Var8 != null) {
                    return fiu0Var8;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                dwf0 dwf0Var = (dwf0) obj;
                cge0 cge0Var = dwf0.O1;
                i1w0 i1w0VarF = a4n0.f(dwf0Var);
                jzi jziVar = dwf0Var.K1;
                if (jziVar != null) {
                    return new ry3(i1w0VarF, jziVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                p7m0 p7m0Var9 = ((sxf0) obj).s;
                Boolean bool = Boolean.FALSE;
                p7m0Var9.getClass();
                p7m0Var9.o(null, bool);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                p7m0 p7m0Var10 = ((nyf0) obj).G;
                Boolean bool2 = Boolean.FALSE;
                p7m0Var10.getClass();
                p7m0Var10.o(null, bool2);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                whh0 whh0Var = (whh0) obj;
                ohh0 ohh0Var = whh0Var instanceof ohh0 ? (ohh0) whh0Var : null;
                List list10 = ohh0Var != null ? ohh0Var.b : null;
                return Boolean.valueOf(list10 == null || list10.isEmpty());
            default:
                lme0 lme0Var2 = x6g0.Q1;
                fiu0 fiu0Var9 = ((x6g0) obj).L1;
                if (fiu0Var9 != null) {
                    return fiu0Var9;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
