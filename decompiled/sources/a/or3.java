package a;

import android.content.res.Resources;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class or3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25718a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        byte b = 2;
        boolean z = true;
        char c = 1;
        switch (this.f25718a) {
            case 0:
                int i2 = ApplicationActivity.F1;
                ((Resources) obj).getClass();
                pz40 pz40Var = s6t0.f31722a;
                return Boolean.valueOf(s6t0.c());
            case 1:
                HashSet hashSet = ((apv0) obj).c;
                if (hashSet.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        if (q3d.j("FavoriteLocalNotificationWorker", "theme_on_worker", "theme_off_worker", "TaxStatusWorker").contains((String) it.next())) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                o1d0 o1d0Var = (o1d0) obj;
                o1d0Var.getClass();
                return o1d0Var.getClass();
            case 3:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 4:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 5:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case 6:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                th4.printStackTrace();
                return Unit.f46060a;
            case 7:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                th5.printStackTrace();
                return Unit.f46060a;
            case 8:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                th6.printStackTrace();
                return Unit.f46060a;
            case 9:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new ok(cpVar, cpVar, c == true ? 1 : 0));
                return Unit.f46060a;
            case 10:
                return (lz3) obj;
            case 11:
                ((o0x) obj).getClass();
                return Unit.f46060a;
            case 12:
                ((c53) obj).getClass();
                return ay3.e0(kzn.d(ro4.m0(500, 500, null, 4), 0.0f, 2), kzn.e(ro4.m0(500, 0, null, 6), 2));
            case 13:
                ((m54) obj).getClass();
                return new kun(b);
            case 14:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.g(hczVar, 3, null, null, s5x0.f31677a, 6);
                return Unit.f46060a;
            case 15:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 16:
                List list = (List) obj;
                list.getClass();
                if (list.size() > 5) {
                    lc00 lc00VarB = kotlin.collections.a.b();
                    List listSubList = list.subList(0, 4);
                    ArrayList arrayList = new ArrayList(r3d.q(listSubList, 10));
                    Iterator it2 = listSubList.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(cjx.Y((u54) it2.next()));
                    }
                    lc00VarB.addAll(arrayList);
                    lc00VarB.add(qa4.f28376a);
                    return kotlin.collections.a.a(lc00VarB);
                }
                ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(cjx.Y((u54) it3.next()));
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (((ra4) obj2).f30115a != 0) {
                        arrayList3.add(obj2);
                    }
                }
                return arrayList3;
            case 17:
                af4 af4Var = (af4) obj;
                qek0 qek0Var = ze4.g2;
                af4Var.getClass();
                return Integer.valueOf(af4Var.b);
            case 18:
                ((ou90) obj).getClass();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 20:
                return Float.valueOf(((Float) obj).floatValue() * 0.5f);
            case 21:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                yai0.j(abi0Var);
                return Unit.f46060a;
            case 22:
                abi0 abi0Var2 = (abi0) obj;
                rek0 rek0Var = ig4.O1;
                abi0Var2.getClass();
                yai0.j(abi0Var2);
                return Unit.f46060a;
            case 23:
                lg4 lg4Var = (lg4) obj;
                lg4Var.getClass();
                return lg4Var;
            case 24:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                List<u54> list2 = (List) obj;
                list2.getClass();
                ArrayList arrayList4 = new ArrayList(r3d.q(list2, 10));
                for (u54 u54Var : list2) {
                    u54Var.getClass();
                    int iA = u54Var.a();
                    if (iA == 1) {
                        i = R.drawable.ic_social_circle_vk;
                    } else if (iA == 5) {
                        i = R.drawable.ic_social_circle_ok;
                    } else if (iA == 13) {
                        i = R.drawable.ic_social_circle_x;
                    } else if (iA == 31) {
                        i = R.drawable.ic_social_circle_discord;
                    } else if (iA == 7) {
                        i = R.drawable.ic_social_circle_yandex;
                    } else if (iA == 9) {
                        i = R.drawable.ic_social_circle_mail;
                    } else if (iA == 11) {
                        i = R.drawable.ic_social_circle_google;
                    } else if (iA == 17) {
                        i = R.drawable.ic_social_circle_telegram;
                    } else if (iA == 19) {
                        i = R.drawable.ic_social_circle_apple;
                    } else if (iA == 26) {
                        i = R.drawable.ic_social_circle_itsme;
                    } else {
                        i = iA == 48 ? R.drawable.ic_qr_scanner_office : 0;
                    }
                    arrayList4.add(new af4(i, u54Var.a()));
                }
                return arrayList4;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.a(o0w0.f24450a);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                ((c8d) k0w0Var2.b(t0w0.f33140a).f14945a).f3908a = new v7d(false, cfx0.o, new bjk(null, false, false, false));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((c8d) ((k0w0) obj).b(m0w0.f20976a).f14945a).f3908a = new v7d(false, cfx0.o, new bjk(null, false, false, false));
                return Unit.f46060a;
            default:
                ((ou90) obj).getClass();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ or3(byte b) {
        this.f25718a = b;
    }
}
