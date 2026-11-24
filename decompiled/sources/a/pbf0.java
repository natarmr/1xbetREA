package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.picker.api.presentation.AnalyticsEntryPoint;
import org.xplatform.picker.api.presentation.PickerDialogParams;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.CitizenshipStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.CityStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.CountryStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.CurrencyStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.DocumentStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.RegionStateModel;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pbf0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26704a;
    public final /* synthetic */ ocf0 b;

    public /* synthetic */ pbf0(ocf0 ocf0Var, byte b) {
        this.f26704a = b;
        this.b = ocf0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f26704a;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        ocf0 ocf0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ocf0Var.G(new gbf0(false));
                th.printStackTrace();
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                j910 j910Var = ocf0Var.y0;
                ((pbf0) j910Var.c).invoke(new z9f0(j910Var, objArr == true ? 1 : 0));
                break;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                j910 j910Var2 = ocf0Var.y0;
                ((pbf0) j910Var2.c).invoke(new z9f0(j910Var2, objArr2 == true ? 1 : 0));
                break;
            case 3:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                ocf0Var.H(new ru80(function1, (byte) 10));
                break;
            case 4:
                k0w0 k0w0Var = (k0w0) obj;
                nh70 nh70Var = ocf0Var.s0;
                CitizenshipStateModel citizenshipStateModel = ((mbf0) ocf0Var.D()).g.o;
                PickerDialogParams pickerDialogParams = new PickerDialogParams(new PickerDialogParams.PickerType.Citizenship(citizenshipStateModel != null ? Integer.valueOf(citizenshipStateModel.f46861a) : null), AnalyticsEntryPoint.b);
                nh70Var.getClass();
                k0w0Var.l(nh70.h(pickerDialogParams));
                break;
            case 5:
                k0w0 k0w0Var2 = (k0w0) obj;
                nh70 nh70Var2 = ocf0Var.s0;
                CityStateModel cityStateModel = ((mbf0) ocf0Var.D()).g.d;
                PickerDialogParams pickerDialogParams2 = new PickerDialogParams(new PickerDialogParams.PickerType.City(cityStateModel != null ? Integer.valueOf(cityStateModel.f46862a) : null), AnalyticsEntryPoint.b);
                nh70Var2.getClass();
                k0w0Var2.l(nh70.h(pickerDialogParams2));
                break;
            case 6:
                k0w0 k0w0Var3 = (k0w0) obj;
                nh70 nh70Var3 = ocf0Var.s0;
                CountryStateModel countryStateModel = ((mbf0) ocf0Var.D()).g.g;
                PickerDialogParams pickerDialogParams3 = new PickerDialogParams(new PickerDialogParams.PickerType.Country(countryStateModel != null ? Integer.valueOf(countryStateModel.f46863a) : null), AnalyticsEntryPoint.b);
                nh70Var3.getClass();
                k0w0Var3.h(nh70.h(pickerDialogParams3));
                break;
            case 7:
                k0w0 k0w0Var4 = (k0w0) obj;
                nh70 nh70Var4 = ocf0Var.s0;
                CurrencyStateModel currencyStateModel = ((mbf0) ocf0Var.D()).g.h;
                PickerDialogParams pickerDialogParams4 = new PickerDialogParams(new PickerDialogParams.PickerType.Currency(currencyStateModel != null ? Integer.valueOf(currencyStateModel.f46864a) : null), AnalyticsEntryPoint.b);
                nh70Var4.getClass();
                k0w0Var4.l(nh70.h(pickerDialogParams4));
                break;
            case 8:
                k0w0 k0w0Var5 = (k0w0) obj;
                nh70 nh70Var5 = ocf0Var.s0;
                DocumentStateModel documentStateModel = ((mbf0) ocf0Var.D()).g.j;
                PickerDialogParams pickerDialogParams5 = new PickerDialogParams(new PickerDialogParams.PickerType.Document(documentStateModel != null ? Integer.valueOf(documentStateModel.f46865a) : null), AnalyticsEntryPoint.b);
                nh70Var5.getClass();
                k0w0Var5.l(nh70.h(pickerDialogParams5));
                break;
            case 9:
                k0w0 k0w0Var6 = (k0w0) obj;
                nh70 nh70Var6 = ocf0Var.s0;
                RegionStateModel regionStateModel = ((mbf0) ocf0Var.D()).g.v;
                PickerDialogParams pickerDialogParams6 = new PickerDialogParams(new PickerDialogParams.PickerType.Region(regionStateModel != null ? Integer.valueOf(regionStateModel.f46867a) : null), AnalyticsEntryPoint.b);
                nh70Var6.getClass();
                k0w0Var6.l(nh70.h(pickerDialogParams6));
                break;
            case 10:
                k0w0 k0w0Var7 = (k0w0) obj;
                nh70 nh70Var7 = ocf0Var.s0;
                CountryStateModel countryStateModel2 = ((mbf0) ocf0Var.D()).g.g;
                PickerDialogParams pickerDialogParams7 = new PickerDialogParams(new PickerDialogParams.PickerType.Phone(countryStateModel2 != null ? Integer.valueOf(countryStateModel2.f46863a) : null, true, ((mbf0) ocf0Var.D()).g.M == q7f0.PHONE), AnalyticsEntryPoint.b);
                nh70Var7.getClass();
                k0w0Var7.l(nh70.h(pickerDialogParams7));
                break;
            default:
                cbf0 cbf0Var = new cbf0((d7a) obj);
                int i = ocf0.z0;
                ocf0Var.G(cbf0Var);
                break;
        }
        return Unit.f46060a;
    }
}
