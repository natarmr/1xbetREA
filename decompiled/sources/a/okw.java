package a;

import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xplatform.cyber.section.api.virtualgamescategories.VirtualGameCategoryParams;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$virtualGameCategoryMainScreen$1;
import org.xplatform.promo.impl.promocodes.presentation.shop.components.HorizontalPromoStoreCollectionItem;
import org.xplatform.rules.impl.navigation.PaymentInfoScreenFactoryImpl$getPaymentInfoScreen$1;
import org.xplatform.statistic.horse_menu.actual.HorseMenusScreen;
import org.xplatform.statistic.horse_menu.domain.model.HorseInfoModel;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class okw implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25426a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ okw(Object obj, Object obj2, byte b) {
        this.f25426a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        Object value;
        Object value2;
        Object value3;
        String string;
        byte b = this.f25426a;
        byte b2 = 2;
        byte b3 = 4;
        byte b4 = 16;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                oru0 oru0Var = (oru0) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                vqc vqcVar = ((ukw) obj3).G;
                List list = oru0Var.d;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((iqu0) it.next()).f15227a));
                }
                VirtualGameCategoryParams virtualGameCategoryParams = new VirtualGameCategoryParams(oru0Var.f25753a, oru0Var.b, oru0Var.c, arrayList);
                vqcVar.getClass();
                k0w0Var.h(new CyberGamesScreenFactoryImpl$virtualGameCategoryMainScreen$1(vqcVar, virtualGameCategoryParams));
                return Unit.f46060a;
            case 1:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                k0w0Var2.h(((tkw) obj3).v.b((j700) obj2, new d8h0(3, null), cui0.b(189L), -1L, ""));
                return Unit.f46060a;
            case 2:
                tiw tiwVar = (tiw) obj2;
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                kys0 kys0Var = ((tkw) obj3).t;
                long j = tiwVar.d;
                String str = tiwVar.c;
                kys0Var.getClass();
                k0w0Var3.h(new UfcScreensFactoryImpl$getChampionshipFragmentScreen$1(j, str));
                return Unit.f46060a;
            case 3:
                Drawable drawable = (Drawable) obj;
                int i = HorizontalPromoStoreCollectionItem.h;
                drawable.getClass();
                Boolean bool = (Boolean) ((Function2) obj3).invoke(drawable, (HorizontalPromoStoreCollectionItem) obj2);
                bool.getClass();
                return bool;
            case 4:
                snw snwVar = (snw) obj2;
                ((Throwable) obj).getClass();
                bby bbyVar = (bby) ((mie0) obj3).f21842a;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                p7m0 p7m0Var = snwVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    snwVar.f.getClass();
                } while (!p7m0Var.m(value, gnw.a((gnw) value, false, true, false, null, null, null, 124)));
                return Unit.f46060a;
            case 5:
                yow yowVar = (yow) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                bby bbyVar2 = (bby) ((mie0) obj3).f21842a;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                yowVar.q.b(th, new wow(yowVar, null == true ? 1 : 0));
                return Unit.f46060a;
            case 6:
                drw drwVar = (drw) obj3;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = drwVar.b;
                hczVar.f(a4xVar.size(), null, new far(a4xVar, (byte) 21), new ugd(2039820996, true, new h8w((List) a4xVar, (Object) drwVar, (Function1) obj2, b2)));
                return Unit.f46060a;
            case 7:
                qqw qqwVar = (qqw) obj2;
                ((Throwable) obj).getClass();
                bby bbyVar3 = (bby) ((mie0) obj3).f21842a;
                if (bbyVar3 != null) {
                    bbyVar3.cancel(null);
                }
                p7m0 p7m0Var2 = qqwVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    qqwVar.f.getClass();
                } while (!p7m0Var2.m(value2, dqw.a((dqw) value2, false, true, false, null, null, null, null, null, null, 1020)));
                return Unit.f46060a;
            case 8:
                krw krwVar = (krw) obj2;
                ((Throwable) obj).getClass();
                bby bbyVar4 = (bby) ((mie0) obj3).f21842a;
                if (bbyVar4 != null) {
                    bbyVar4.cancel(null);
                }
                p7m0 p7m0Var3 = krwVar.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    krwVar.f.getClass();
                } while (!p7m0Var3.m(value3, crw.a((crw) value3, false, true, false, null, false, 28)));
                return Unit.f46060a;
            case 9:
                epw epwVar = (epw) obj3;
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                long j2 = ((krw) obj2).p;
                String str2 = epwVar.f8207a;
                String str3 = epwVar.c;
                String str4 = epwVar.b;
                String str5 = (String) CollectionsKt.f0(StringsKt__StringsKt.split$default(epwVar.f, new String[]{Separators.SLASH}, false, 0, 6, null));
                if (str5 == null || (string = StringsKt.u0(str5).toString()) == null) {
                    string = "-";
                }
                k0w0Var4.h(new HorseMenusScreen(new HorseInfoModel(str2, str3, str4, string, epwVar.d, j2)));
                return Unit.f46060a;
            case 10:
                z7x z7xVar = (z7x) obj3;
                x7x x7xVar = (x7x) obj2;
                z7xVar.f43942a.b(x7xVar);
                ((hgk0) z7xVar.b).setValue(Boolean.TRUE);
                return new pr0(z7xVar, x7xVar, (byte) 11);
            case 11:
                tax taxVar = (tax) obj3;
                y9x y9xVar = (y9x) obj2;
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                yox yoxVarC = ((h6i) taxVar.l.f24171a).c();
                int iT = x9x.T(y9xVar);
                edu eduVar = taxVar.n;
                String strA = ((ntu) eduVar.b).a();
                hsj hsjVar = (hsj) eduVar.c;
                knf0 knf0Var = (knf0) ((yk50) hsjVar.f13586a).b;
                yox yoxVar = (yox) hsjVar.b;
                Locale locale = Locale.getDefault();
                locale.getClass();
                String strA2 = ((kuy) yoxVar.f43005a).a();
                if (StringsKt.O(strA2, "zh", false) || StringsKt.O(strA2, "ZH", false)) {
                    String script = locale.getScript();
                    script.getClass();
                    Locale locale2 = Locale.getDefault();
                    locale2.getClass();
                    String lowerCase = script.toLowerCase(locale2);
                    lowerCase.getClass();
                    if (lowerCase.equals("hans")) {
                        strA2 = "cn";
                    } else if (lowerCase.equals("hant")) {
                        strA2 = "tw";
                    } else {
                        String country = locale.getCountry();
                        country.getClass();
                        Locale locale3 = Locale.getDefault();
                        locale3.getClass();
                        strA2 = country.toLowerCase(locale3);
                        strA2.getClass();
                    }
                }
                knf0Var.getClass();
                knf0Var.getClass();
                k0w0Var5.h(new PaymentInfoScreenFactoryImpl$getPaymentInfoScreen$1(yoxVarC, iT, w6x.q(strA, Separators.SLASH, "/paysystems/information/?type=2&whence=22&lng=" + strA2 + "&ref_id=1"), -1, y9xVar == y9x.INFO_PAYMENTS));
                return Unit.f46060a;
            case 12:
                ((View) obj).getClass();
                ((adw) obj3).invoke(((cp) obj2).u());
                return Unit.f46060a;
            case 13:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new k9v((Object) cpVar, obj3, obj2, (byte) 7));
                return Unit.f46060a;
            case 14:
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                ou90.F(ou90Var, (pu90) obj3, 0, 0, new lly((nly) obj2, null == true ? 1 : 0), 4);
                return Unit.f46060a;
            case 15:
                kvy kvyVar = (kvy) obj3;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                ArrayList arrayList2 = kvyVar.f18977a;
                hczVar2.f(arrayList2.size(), new far(xdx.E(arrayList2, new djx(b4)), (byte) 25), new j13(arrayList2, (byte) 16, false), new ugd(-1311333631, true, new h8w(arrayList2, kvyVar, (xdr) obj2, b3)));
                return Unit.f46060a;
            case 16:
                d2w d2wVar = (d2w) obj2;
                k0w0 k0w0Var6 = (k0w0) obj;
                k0w0Var6.getClass();
                k0w0Var6.h(((ryy) obj3).r.e(d2wVar.b(), d2wVar.d(), d2wVar.f()));
                return Unit.f46060a;
            case 17:
                ((Function1) obj3).invoke(new yt30(((Integer) obj).intValue(), (jam0) obj2));
                return Unit.f46060a;
            case 18:
                n8z n8zVar = (n8z) obj2;
                tyj tyjVarB = ((y8z) obj3).b(((Integer) obj).intValue());
                int i2 = tyjVarB.b;
                List list2 = tyjVarB.f34759a;
                ArrayList arrayList3 = new ArrayList(list2.size());
                int size = list2.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    int i5 = (int) ((pgv) list2.get(i4)).f26968a;
                    arrayList3.add(new Pair(Integer.valueOf(i2), new p4e(n8zVar.a(i3, i5))));
                    i2++;
                    i3 += i5;
                }
                return arrayList3;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                n8z n8zVar2 = (n8z) obj3;
                m8z m8zVar = (m8z) obj2;
                int iIntValue = ((Integer) obj).intValue();
                y8z y8zVar = (y8z) n8zVar2.h;
                int i6 = y8zVar.i;
                int iE = y8zVar.e(iIntValue);
                return m8zVar.n1(iIntValue, n8zVar2.a(0, iE), 0, iE, m8zVar.e);
            case 20:
                ldz ldzVar = (ldz) obj3;
                ldzVar.c.i(obj2);
                return new pr0(ldzVar, obj2, (byte) 13);
            case 21:
                return new ldz((fzg0) obj3, (Map) obj, (bzg0) obj2);
            case 22:
                hcz hczVar3 = (hcz) obj;
                sqt sqtVar = cgz.m2;
                hczVar3.getClass();
                a4x a4xVar2 = ((wfz) ((yfz) obj3)).f39089a;
                hczVar3.f(a4xVar2.size(), null, new bgz(a4xVar2, (byte) 0), new ugd(802480018, true, new yul(a4xVar2, (Function1) obj2, b4)));
                return Unit.f46060a;
            case 23:
                hcz hczVar4 = (hcz) obj;
                art artVar = pgz.l2;
                hczVar4.getClass();
                a4x a4xVar3 = ((rgz) obj3).f30461a;
                hczVar4.f(a4xVar3.size(), null, new bgz(a4xVar3, (byte) 1), new ugd(802480018, true, new yul(a4xVar3, (Function1) obj2, (byte) 17)));
                return Unit.f46060a;
            case 24:
                hcz hczVar5 = (hcz) obj;
                bst bstVar = mhz.l2;
                hczVar5.getClass();
                a4x a4xVar4 = ((khz) obj3).f18312a;
                hczVar5.f(a4xVar4.size(), null, new bgz(a4xVar4, (byte) 2), new ugd(802480018, true, new yul(a4xVar4, (Function1) obj2, (byte) 18)));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                hcz hczVar6 = (hcz) obj;
                gst gstVar = qhz.l2;
                hczVar6.getClass();
                List list3 = ((ohz) obj3).f25288a;
                hczVar6.f(list3.size(), null, new bgz(list3, (byte) 3), new ugd(802480018, true, new yul(list3, (Function1) obj2, (byte) 19)));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                hcz hczVar7 = (hcz) obj;
                rqt rqtVar = vhz.l2;
                hczVar7.getClass();
                a4x a4xVar5 = ((thz) obj3).f33983a;
                hczVar7.f(a4xVar5.size(), null, new bgz(a4xVar5, (byte) 4), new ugd(802480018, true, new yul(a4xVar5, (Function1) obj2, (byte) 20)));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((View) obj).getClass();
                ((ujz) obj3).v.invoke((tjz) obj2);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((View) obj).getClass();
                ((ujz) obj3).v.invoke((sjz) obj2);
                return Unit.f46060a;
            default:
                ((View) obj).getClass();
                ((svz) obj3).invoke(((goz) ((cp) obj2).u()).f11657a);
                return Unit.f46060a;
        }
    }
}
