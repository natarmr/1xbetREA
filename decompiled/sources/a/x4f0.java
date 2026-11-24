package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.BonusStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CitizenshipStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CityStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CountryStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CurrencyStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.DocumentStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.PhoneStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.RegionStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.SocialStateModel;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x4f0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40262a;
    public final /* synthetic */ pru b;
    public final /* synthetic */ f7u c;
    public final /* synthetic */ n4u d;
    public final /* synthetic */ vzg0 e;
    public final /* synthetic */ lbu f;
    public final /* synthetic */ bzt g;

    public /* synthetic */ x4f0(pru pruVar, f7u f7uVar, n4u n4uVar, vzg0 vzg0Var, rqt rqtVar, lbu lbuVar, bzt bztVar, byte b) {
        this.f40262a = b;
        this.b = pruVar;
        this.c = f7uVar;
        this.d = n4uVar;
        this.e = vzg0Var;
        this.f = lbuVar;
        this.g = bztVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40262a;
        bzt bztVar = this.g;
        lbu lbuVar = this.f;
        vzg0 vzg0Var = this.e;
        n4u n4uVar = this.d;
        f7u f7uVar = this.c;
        pru pruVar = this.b;
        switch (b) {
            case 0:
                sff0 sff0VarA = pruVar.a();
                cne0 cne0VarP = f7uVar.p();
                n4uVar.e();
                String str = (String) vzg0Var.a("ADDRESS");
                String str2 = str == null ? "" : str;
                Boolean bool = (Boolean) vzg0Var.a("AGE_CONFIRMATION_CHECKBOX");
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                BonusStateModel bonusStateModel = (BonusStateModel) vzg0Var.a("BONUS");
                CityStateModel cityStateModel = (CityStateModel) vzg0Var.a("CITY");
                Boolean bool2 = (Boolean) vzg0Var.a("COMMERCIAL_COMMUNICATION_CHECKBOX");
                boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                CountryStateModel countryStateModel = (CountryStateModel) vzg0Var.a("COUNTRY");
                CurrencyStateModel currencyStateModel = (CurrencyStateModel) vzg0Var.a("CURRENCY");
                Long l = (Long) vzg0Var.a("DATE");
                DocumentStateModel documentStateModel = (DocumentStateModel) vzg0Var.a("DOCUMENT_TYPE");
                String str3 = (String) vzg0Var.a(CommonConstant.RETKEY.EMAIL);
                String str4 = str3 == null ? "" : str3;
                String str5 = (String) vzg0Var.a("FIRST_NAME");
                String str6 = str5 == null ? "" : str5;
                String str7 = (String) vzg0Var.a("LAST_NAME");
                String str8 = str7 == null ? "" : str7;
                String str9 = (String) vzg0Var.a("MIDDLE_NAME");
                String str10 = str9 == null ? "" : str9;
                CitizenshipStateModel citizenshipStateModel = (CitizenshipStateModel) vzg0Var.a("CITIZENSHIP");
                String str11 = (String) vzg0Var.a("PASSPORT_NUMBER");
                String str12 = str11 == null ? "" : str11;
                String str13 = (String) vzg0Var.a("PASSWORD");
                String str14 = str13 == null ? "" : str13;
                PhoneStateModel phoneStateModel = (PhoneStateModel) vzg0Var.a("PHONE");
                Boolean bool3 = (Boolean) vzg0Var.a("POLITICALLY_EXPOSED_PERSON");
                String str15 = (String) vzg0Var.a("POST_CODE");
                String str16 = str15 == null ? "" : str15;
                String str17 = (String) vzg0Var.a("PROMO_CODE");
                String str18 = str17 == null ? "" : str17;
                RegionStateModel regionStateModel = (RegionStateModel) vzg0Var.a("REGION");
                String str19 = (String) vzg0Var.a("REPEAT_PASSWORD");
                String str20 = str19 == null ? "" : str19;
                Boolean bool4 = (Boolean) vzg0Var.a("RULES_CONFIRMATION");
                boolean zBooleanValue3 = bool4 != null ? bool4.booleanValue() : false;
                Boolean bool5 = (Boolean) vzg0Var.a("RULES_CONFIRMATION_ALL");
                boolean zBooleanValue4 = bool5 != null ? bool5.booleanValue() : false;
                String str21 = (String) vzg0Var.a("SECOND_LAST_NAME");
                String str22 = str21 == null ? "" : str21;
                Boolean bool6 = (Boolean) vzg0Var.a("EMAIL_BETS_CHECKBOX");
                boolean zBooleanValue5 = bool6 != null ? bool6.booleanValue() : false;
                Boolean bool7 = (Boolean) vzg0Var.a("EMAIL_NEWS_CHECKBOX");
                boolean zBooleanValue6 = bool7 != null ? bool7.booleanValue() : false;
                Boolean bool8 = (Boolean) vzg0Var.a("SHARE_PERSONAL_DATA_CONFIRMATION");
                boolean zBooleanValue7 = bool8 != null ? bool8.booleanValue() : false;
                Integer num = (Integer) vzg0Var.a("SOCIAL_TYPE_SELECTED");
                SocialStateModel socialStateModel = (SocialStateModel) vzg0Var.a("SOCIAL");
                Boolean bool9 = (Boolean) vzg0Var.a("PASSWORD_REQUIREMENTS_EXPANDED");
                boolean zBooleanValue8 = bool9 != null ? bool9.booleanValue() : false;
                Integer num2 = (Integer) vzg0Var.a(CommonConstant.RETKEY.GENDER);
                Long l2 = (Long) vzg0Var.a("PASSPORT_DATE_ISSUE");
                Long l3 = (Long) vzg0Var.a("PASSPORT_DATE_EXPIRE");
                Boolean bool10 = (Boolean) vzg0Var.a("NOTIFY_NEWS_CALL_SETTINGS");
                boolean zBooleanValue9 = bool10 != null ? bool10.booleanValue() : true;
                Boolean bool11 = (Boolean) vzg0Var.a("SOCIAL_BLOCK_EXPAND");
                boolean zBooleanValue10 = bool11 != null ? bool11.booleanValue() : false;
                Boolean bool12 = (Boolean) vzg0Var.a("SEND_SMS_EVENTS");
                boolean zBooleanValue11 = bool12 != null ? bool12.booleanValue() : false;
                q7f0 q7f0Var = (q7f0) vzg0Var.a("REGISTRATION_TYPE");
                List list = (List) vzg0Var.a("BONUS_LIST");
                if (list == null) {
                    list = iun.f15405a;
                }
                r1f0 r1f0Var = new r1f0(str2, zBooleanValue, bonusStateModel, cityStateModel, zBooleanValue2, zBooleanValue9, countryStateModel, currencyStateModel, l, documentStateModel, str4, str6, str8, str10, citizenshipStateModel, str12, str14, phoneStateModel, bool3, str16, str18, regionStateModel, str20, zBooleanValue3, zBooleanValue4, str22, zBooleanValue5, zBooleanValue6, zBooleanValue7, num, socialStateModel, num2, zBooleanValue8, list, l3, l2, zBooleanValue10, zBooleanValue11, q7f0Var);
                iun iunVar = iun.f15405a;
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                return new u4f0(false, true, iunVar, iunVar, lunVar, iunVar, r1f0Var, lunVar, lunVar, q7f0Var, rqt.f(sff0VarA.k), iunVar, sff0VarA, true, iunVar, false, lbuVar.j(), bztVar.f3488a.a(), null, null, null, null, null, null, null, null, cne0VarP, zBooleanValue9);
            default:
                sff0 sff0VarA2 = pruVar.a();
                cne0 cne0VarP2 = f7uVar.p();
                n4uVar.e();
                iun iunVar2 = iun.f15405a;
                lun lunVar2 = lun.f20680a;
                lunVar2.getClass();
                return new mbf0(false, true, iunVar2, iunVar2, lunVar2, iunVar2, idx.Q(vzg0Var), lunVar2, lunVar2, idx.Q(vzg0Var).M, rqt.f(sff0VarA2.k), iunVar2, sff0VarA2, null, iunVar2, false, lbuVar.j(), bztVar.f3488a.a(), null, null, null, null, null, null, null, null, cne0VarP2, idx.Q(vzg0Var).f);
        }
    }
}
