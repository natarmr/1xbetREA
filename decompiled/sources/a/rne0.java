package a;

import android.gov.nist.core.Separators;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.xbet.client1.R;
import org.xplatform.referral.api.domain.model.ReferralNetworkInfo;
import org.xplatform.referral.api.domain.model.ReferralUser;

/* JADX INFO: loaded from: classes5.dex */
public final class rne0 {
    public static une0 a(String str, ReferralNetworkInfo referralNetworkInfo, long[] jArr) {
        boolean z;
        String strL;
        String str2;
        String str3 = "";
        str.getClass();
        referralNetworkInfo.getClass();
        pn40 pn40Var = pn40.f27267a;
        String strK = pn40.k(str, referralNetworkInfo.f46842a);
        double d = referralNetworkInfo.f46842a;
        String strK2 = pn40.k(str, referralNetworkInfo.b);
        String strK3 = pn40.k(str, referralNetworkInfo.c);
        if (jArr.length == 1) {
            strL = rdj.c(rdj.f30294a, sdj.UNIVERSAL, new Date(jArr[0]), null, 60);
            z = false;
        } else {
            rdj rdjVar = rdj.f30294a;
            z = false;
            Date date = new Date(jArr[0]);
            sdj sdjVar = sdj.UNIVERSAL;
            strL = kng0.l(rdj.c(rdjVar, sdjVar, date, null, 60), " - ", rdj.c(rdjVar, sdjVar, new Date(jArr[1]), null, 60));
        }
        String str4 = strL;
        String str5 = referralNetworkInfo.d;
        List list = referralNetworkInfo.e;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ReferralUser referralUser = (ReferralUser) it.next();
            String str6 = referralUser.f46843a;
            double d2 = referralUser.d;
            String strR = kotlin.text.c.r(str6, Separators.SLASH, " / ", z);
            String str7 = referralUser.b;
            String str8 = referralUser.c;
            tne0[] tne0VarArr = tne0.f34230a;
            sdj sdjVar2 = sdj.UNIVERSAL;
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            timeZone.getClass();
            TimeZone timeZone2 = TimeZone.getDefault();
            timeZone2.getClass();
            str8.getClass();
            Iterator it2 = it;
            String str9 = str3;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            simpleDateFormat.setTimeZone(timeZone);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
            simpleDateFormat2.setTimeZone(timeZone2);
            try {
                Date date2 = simpleDateFormat.parse(str8);
                if (date2 == null) {
                    date2 = new Date();
                }
                String str10 = simpleDateFormat2.format(date2);
                str10.getClass();
                str2 = str10;
            } catch (ParseException e) {
                e.printStackTrace();
                str2 = str9;
            }
            String str11 = d2 > 0.0d ? "+" : str9;
            pn40 pn40Var2 = pn40.f27267a;
            String strK4 = pn40.k(str, d2);
            if (d2 >= 0.0d) {
                strK4 = str11.concat(strK4);
            }
            arrayList.add(new dpe0(d2 >= 0.0d ? R.color.static_green : R.color.static_red, strR, str7, str2, strK4, String.valueOf(referralUser.e), referralUser.f));
            it = it2;
            str3 = str9;
            z = false;
        }
        return new une0(strK, d, strK2, strK3, str5, arrayList, str4);
    }
}
