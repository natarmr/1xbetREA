package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;
import org.xplatform.uikit.components.header.DsHeader;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h7w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12596a;

    public /* synthetic */ h7w(mie0 mie0Var) {
        this.f12596a = (byte) 14;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f12596a) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                DsHeader dsHeader = new DsHeader(context, null, 6);
                String string = context.getString(R.string.transactions_history);
                string.getClass();
                dsHeader.setModel(new nrv(string, false, null, null, null, null, null, 254));
                return dsHeader;
            case 1:
                Context context2 = (Context) obj;
                context2.getClass();
                DsHeader dsHeader2 = new DsHeader(context2, null, 6);
                String string2 = context2.getString(R.string.transactions_history);
                string2.getClass();
                dsHeader2.setModel(new nrv(string2, false, null, context2.getString(R.string.all), Integer.valueOf(R.drawable.glyph_chevron_right_small), null, null, 230));
                dsHeader2.c(context2.getResources().getDimensionPixelSize(R.dimen.space_12), 0);
                return dsHeader2;
            case 2:
                ((Throwable) obj).getClass();
                e0g0 e0g0Var = j0g0.b;
                return new j0g0(uzb.X());
            case 3:
                ((uew) obj).getClass();
                return Unit.f46060a;
            case 4:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 5:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                StringBuilder sb = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/ImgDefault/MMA/UFC/Logo.png", ujn.h, false) || kotlin.text.c.x("static/img/ImgDefault/MMA/UFC/Logo.png", "https://", false)) {
                    sb.setLength(0);
                    sb.append("static/img/ImgDefault/MMA/UFC/Logo.png");
                } else {
                    if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                        sb.append('/');
                    }
                    sb.append(StringsKt.y0("static/img/ImgDefault/MMA/UFC/Logo.png", '/'));
                }
                n0x n0xVar = new n0x(sb.toString());
                StringBuilder sb2 = new StringBuilder(ujn.h);
                String str = zBooleanValue ? "static/img/ImgDefault/MMA/UFC/Main_Screen/Background_Tablet.png" : "static/img/ImgDefault/MMA/UFC/Main_Screen/Background.png";
                if (str.length() == 0) {
                    sb2.setLength(0);
                } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                    sb2.setLength(0);
                    sb2.append(str);
                } else {
                    if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                        sb2.append('/');
                    }
                    sb2.append(StringsKt.y0(str, '/'));
                }
                return new cjw(n0xVar, new n0x(sb2.toString()));
            case 6:
                n1g n1gVar = (n1g) obj;
                n1gVar.getClass();
                n1gVar.d = j1g.SYNTHETIC;
                n1gVar.e = new rq2();
                n1gVar.f = l1g.OPEN_SCREEN;
                n1gVar.g = k1g.OPEN_FROM_BANNER;
                return Unit.f46060a;
            case 7:
                sjd sjdVar = (sjd) obj;
                sjdVar.getClass();
                return new qjw(sjdVar);
            case 8:
                n1g n1gVar2 = (n1g) obj;
                n1gVar2.getClass();
                n1gVar2.d = j1g.SYNTHETIC;
                n1gVar2.e = new tq2();
                n1gVar2.f = l1g.OPEN_SCREEN;
                n1gVar2.g = k1g.OPEN_REGULAR;
                return Unit.f46060a;
            case 9:
                sjd sjdVar2 = (sjd) obj;
                sjdVar2.getClass();
                return new rjw(sjdVar2);
            case 10:
                Context context3 = (Context) obj;
                context3.getClass();
                TableViewImpl tableViewImpl = new TableViewImpl(context3, null, 0);
                pow powVar = new pow(tableViewImpl, true, R.dimen.text_12);
                powVar.l = tableViewImpl;
                tableViewImpl.setAdapter(powVar);
                return tableViewImpl;
            case 11:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new b1w(cpVar, (byte) 4));
                return Unit.f46060a;
            case 12:
                ((String) obj).getClass();
                return Unit.f46060a;
            case 13:
                ((String) obj).getClass();
                return Unit.f46060a;
            case 14:
                ((qsw) obj).getClass();
                return Boolean.TRUE;
            case 15:
                yai0.e((abi0) obj, 0);
                return Unit.f46060a;
            case 16:
                ((g7z) obj).a();
                return Unit.f46060a;
            case 17:
                return Unit.f46060a;
            case 18:
                ((Drawable) obj).getClass();
                return Boolean.FALSE;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Drawable) obj).getClass();
                return Boolean.FALSE;
            case 20:
                ((Drawable) obj).getClass();
                return Boolean.FALSE;
            case 21:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                pz40 pz40Var = s6t0.f31722a;
                fhl.o0(fhlVar, s6t0.b().f33626a.getBackgroundContent(), 0L, 0L, 0L, null, 254);
                return Unit.f46060a;
            case 22:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                pz40 pz40Var2 = s6t0.f31722a;
                fhl.u(fhlVar2, s6t0.b().f33626a.getBackgroundContent(), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case 23:
                zdo zdoVar = (zdo) obj;
                zdoVar.getClass();
                return zdoVar.a();
            case 24:
                zdo zdoVar2 = (zdo) obj;
                zdoVar2.getClass();
                return sre0.f32672a.b(zdoVar2.getClass());
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                y130 y130Var = (y130) obj;
                y130Var.getClass();
                return new nhx(y130Var);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            default:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
        }
    }

    public /* synthetic */ h7w(byte b) {
        this.f12596a = b;
    }
}
