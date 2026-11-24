package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o6e0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24731a;

    public /* synthetic */ o6e0(byte b) {
        this.f24731a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 0;
        switch (this.f24731a) {
            case 0:
                return new zw3(m9e0.f21407a, (byte) 0);
            case 1:
                return new zw3(y8e0.f42191a, (byte) 0);
            case 2:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 3:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 4:
                return new zw3(m8e0.f21366a, (byte) 0);
            case 5:
                return new zw3(new zw3(p6e0.f26450a, (byte) 0), (byte) 0);
            case 6:
                List listA0 = CollectionsKt.A0((List) iii0.f14829a.getValue(), new lk30((byte) 24));
                ArrayList arrayList = new ArrayList();
                int size = listA0.size();
                while (i < size) {
                    ((lf60) listA0.get(i)).getClass();
                    arrayList.add(new Pair(new uk50(new th50((byte) 20)), sre0.f32672a.b(aot0.class)));
                    i++;
                }
                return arrayList;
            case 7:
                List listA1 = CollectionsKt.A0((List) iii0.b.getValue(), new lk30((byte) 25));
                ArrayList arrayList2 = new ArrayList();
                int size2 = listA1.size();
                while (i < size2) {
                    ((nnn0) listA1.get(i)).getClass();
                    arrayList2.add(new q8m0());
                    i++;
                }
                return arrayList2;
            case 8:
                String str = wfe0.L;
                return ab0.f555a;
            case 9:
                return new zw3(n9a0.f23130a, (byte) 0);
            case 10:
                return new zw3(kip0.f18347a, (byte) 0);
            case 11:
                return new zw3(vhp0.f37443a, (byte) 0);
            case 12:
                return new dje0(iun.f15405a, true, false);
            case 13:
                return new zw3(whp0.f39176a, (byte) 0);
            case 14:
                return new zw3(o9a0.f24870a, (byte) 0);
            case 15:
                return new zw3(nje0.f23631a, (byte) 0);
            case 16:
                return new ike0(true, false, null);
            case 17:
                return new zw3(o9a0.f24870a, (byte) 0);
            case 18:
                return new zw3(ole0.f25450a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Unit.f46060a;
            case 20:
                return new yle0(true, false, false, null);
            case 21:
                return new qme0(iun.f15405a);
            case 22:
                return new zw3(ape0.f1248a, (byte) 0);
            case 23:
                return new zw3(tse0.f34458a, (byte) 0);
            case 24:
                return uue0.Companion.serializer();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                uue0[] uue0VarArrValues = uue0.values();
                uue0VarArrValues.getClass();
                return new g0o("org.xplatform.onexuser.domain.registration.RegistrationChoiceType", (Enum[]) uue0VarArrValues);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return w0f0.Companion.serializer();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ntb.F("org.xplatform.registration.core.data.models.RegistrationFieldTypeResponse", w0f0.values(), new String[]{"Surname", "SurnameTwo", "Name", "CountryId", "RegionId", "CityId", "Birthday", "Phone", "CurrencyId", "SocialNetId", "Email", "Password", "RepeatPassword", "Nationality", "VidDoc", "PassportNumber", "Sex", "Address", "Postcode", "PromoCode", "FirstBonusChoice", "SendEmailEvents", "SendEmailBet", "SendSmsEvents", "SendSmsBet", "NotifyNewsCall", "CommercialCommunicationSettings", "SharePersonalDataConfirmation", "RulesConfirmation", "RulesConfirmationAll", "FiscalAuthority", "MiddleName", "IsPoliticallyExposedPerson", "AppsflyerId", "PassportDt", "PassportDateExpire", "MediaSourceId"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(r0f0.f29626a, (byte) 0);
            default:
                return new zw3(g1f0.f10510a, (byte) 0);
        }
    }
}
