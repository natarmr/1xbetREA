package a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.chips.Chip;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e6c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7275a;

    public /* synthetic */ e6c(byte b) {
        this.f7275a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        a4x a4xVarN0;
        byte b = 2;
        boolean zC0 = false;
        switch (this.f7275a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 2:
                throw ((Throwable) obj);
            case 3:
                throw ((Throwable) obj);
            case 4:
                return Unit.f46060a;
            case 5:
                hps0 hps0Var = (hps0) obj;
                hps0Var.getClass();
                jp80 jp80Var = (jp80) hps0Var;
                jp80Var.p = false;
                s0x.S(jp80Var);
                return Boolean.FALSE;
            case 6:
                Chip chip = (Chip) obj;
                chip.getClass();
                return Boolean.valueOf(chip.isSelected());
            case 7:
                Context context = (Context) obj;
                context.getClass();
                zac zacVar = new zac(context);
                HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                horizontalScrollView.setHorizontalScrollBarEnabled(false);
                horizontalScrollView.setClipToPadding(false);
                horizontalScrollView.setOverScrollMode(2);
                int i = 0;
                for (Object obj2 : l4b.i) {
                    int i2 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    View viewInflate = LayoutInflater.from(zacVar.getContext()).inflate(R.layout.chip_item, (ViewGroup) zacVar, false);
                    viewInflate.getClass();
                    Chip chip2 = (Chip) viewInflate;
                    chip2.setStyle(R.style.Widget_Chips_Primary);
                    chip2.setText(context.getString(((l4b) obj2).f19395a));
                    chip2.setSelected(i == 0);
                    zacVar.addView(chip2);
                    i = i2;
                }
                zacVar.setSingleSelection(true);
                zacVar.setSingleLine(true);
                zacVar.setSelectionRequired(true);
                zacVar.setMiddleScroll(true);
                zacVar.setClipToPadding(false);
                zacVar.setOverScrollMode(2);
                horizontalScrollView.addView(zacVar);
                return horizontalScrollView;
            case 8:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case 9:
                egc egcVar = (egc) obj;
                egcVar.getClass();
                String str = egcVar.f7757a;
                String str2 = egcVar.c;
                String str3 = egcVar.e;
                String str4 = egcVar.b;
                int length = str2.length();
                a4x a4xVar = egcVar.d;
                if (length == 0) {
                    a4xVarN0 = kpb.n0(str3, a4xVar);
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : a4xVar) {
                        muy muyVar = (muy) obj3;
                        if (StringsKt.O(muyVar.c, str2, true) || StringsKt.O(muyVar.g, str2, true) || StringsKt.O(muyVar.d, str2, true)) {
                            arrayList.add(obj3);
                        }
                    }
                    a4xVarN0 = kpb.n0(str3, arrayList);
                }
                return new bp8(str2.length() == 0 && a4xVar.isEmpty(), str, str4, str2, a4xVarN0, new mdm(R.string.lottie_prophylaxis, pdm.c, null, R.drawable.ic_glyph_circle_favourite_secondary_60, 0, R.string.nothing_found, 0, 0, 0L, 0L, 724));
            case 10:
                whc whcVar = (whc) obj;
                whcVar.getClass();
                a4x a4xVarO0 = dyb.o0(whcVar.e);
                String str5 = whcVar.d;
                String str6 = whcVar.h;
                boolean z = whcVar.g;
                long j = whcVar.c;
                return new xhc(a4xVarO0, str5, str6, z, (j == -1 || j == whcVar.f39160a || j == whcVar.b) ? false : true, whcVar.f);
            case 11:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                for (int i3 = 0; i3 < 40; i3++) {
                    hcz.e(hczVar, null, null, i120.b, 3);
                }
                return Unit.f46060a;
            case 12:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case 13:
                Byte b2 = (Byte) obj;
                b2.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b2}, 1));
            case 14:
                o1x o1xVar = (o1x) obj;
                o1xVar.getClass();
                Object obj4 = o1xVar.b;
                if (obj4 instanceof aot0) {
                    zC0 = kpb.c0((aot0) obj4);
                } else if (obj4 instanceof String) {
                    zC0 = kpb.c0(dqm0.H((String) obj4));
                }
                return Boolean.valueOf(zC0);
            case 15:
                o1x o1xVar2 = (o1x) obj;
                o1xVar2.getClass();
                Object obj5 = o1xVar2.b;
                luo luoVar = o1xVar2.u;
                StringBuilder sb = new StringBuilder();
                sb.append(obj5);
                sb.append(luoVar);
                return sb.toString();
            case 16:
                return Unit.f46060a;
            case 17:
                return Unit.f46060a;
            case 18:
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Unit.f46060a;
            case 20:
                return Unit.f46060a;
            case 21:
                return Unit.f46060a;
            case 22:
                return Unit.f46060a;
            case 23:
                return Float.valueOf(((Float) obj).floatValue() * 0.5f);
            case 24:
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                return pi9Var.b(new n51(yk5.n(q3d.j(new y3d(fbc.d(6449)), new y3d(fbc.f(2147490097L))), 0.0f, 0.0f, 14), b));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                g7z g7zVar = (g7z) obj;
                g7zVar.getClass();
                g7zVar.a();
                pz40 pz40Var = s6t0.f31722a;
                fhl.u(g7zVar, StaticColors.INSTANCE.m73getBlack400d7_KjU(), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((ou90) obj).getClass();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((ou90) obj).getClass();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.h(1);
                return Unit.f46060a;
            default:
                List list = (List) obj;
                list.getClass();
                return new x2d(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
        }
    }
}
