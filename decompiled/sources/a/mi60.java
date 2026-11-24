package a;

import android.gov.nist.core.Separators;
import android.text.Html;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xplatform.feature.promo_aggregator.impl.presentation.compose.PromoCodeCacheContentState;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mi60 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21829a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;

    public /* synthetic */ mi60(byte b, String str, List list) {
        this.f21829a = b;
        this.b = list;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f21829a;
        List<yoq0> list = this.b;
        switch (b) {
            case 0:
                ui60 ui60Var = (ui60) obj2;
                list.getClass();
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (yoq0 yoq0Var : list) {
                    StringBuilder sb = new StringBuilder(ujn.h);
                    String str = yoq0Var.c;
                    str.getClass();
                    if (str.length() == 0) {
                        sb.setLength(0);
                    } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                        sb.setLength(0);
                        sb.append(str);
                    } else {
                        if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                            sb.append('/');
                        }
                        sb.append(StringsKt.y0(str, '/'));
                    }
                    arrayList.add(new n0x(sb.toString()));
                }
                a4x a4xVarO0 = dyb.o0(arrayList);
                ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((yoq0) it.next()).f42999a));
                }
                a4x a4xVarO1 = dyb.o0(arrayList2);
                ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Integer.valueOf(((yoq0) it2.next()).b));
                }
                a4x a4xVarO2 = dyb.o0(arrayList3);
                int i = ui60Var.d;
                int i2 = ui60Var.e;
                String str2 = ui60Var.g;
                String str3 = ui60Var.h;
                uaq0 uaq0Var = ui60Var.i;
                a4xVarO0.getClass();
                a4xVarO1.getClass();
                a4xVarO2.getClass();
                String str4 = this.c;
                str4.getClass();
                str2.getClass();
                str3.getClass();
                return new ui60(a4xVarO0, a4xVarO1, a4xVarO2, i, i2, str4, str2, str3, uaq0Var);
            default:
                iac0 iac0Var = (iac0) obj2;
                ArrayList arrayList4 = new ArrayList(r3d.q(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    String str5 = (String) it3.next();
                    str5.getClass();
                    Spanned spannedFromHtml = Html.fromHtml(str5, 0);
                    spannedFromHtml.getClass();
                    arrayList4.add(spannedFromHtml.toString());
                }
                return iac0.a(iac0Var, PromoCodeCacheContentState.DetailsPromo.f46656a, false, null, this.c, arrayList4, null, false, false, false, 8141);
        }
    }
}
