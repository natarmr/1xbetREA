package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.widget.RemoteViews;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_constructor.impl.games.presentation.BetConstructorGamesScreen;
import org.xplatform.bet_constructor.impl.games.presentation.BetConstructorGamesScreenOld;

/* JADX INFO: loaded from: classes3.dex */
public final class kj5 implements qna {
    public static int b(Context context, int i, String str) {
        float lineWidth;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.text_12);
        Typeface typefaceCreate = Typeface.create(itf0.a(R.font.roboto_medium, context), 1);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(dimensionPixelSize);
        textPaint.setTypeface(typefaceCreate);
        StaticLayout staticLayout = new StaticLayout(str, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 0.0f, -4.0f, true);
        int lineCount = staticLayout.getLineCount() - 1;
        if (staticLayout.getLineCount() > 1) {
            lineWidth = staticLayout.getLineWidth(lineCount) + (i * lineCount);
        } else {
            lineWidth = staticLayout.getLineWidth(lineCount);
        }
        return (int) lineWidth;
    }

    public static uo5 e(mvc mvcVar) {
        int iOrdinal = mvcVar.ordinal();
        if (iOrdinal == 0) {
            return uo5.POPULAR;
        }
        if (iOrdinal == 1) {
            return uo5.DEPOSIT;
        }
        if (iOrdinal == 2) {
            return uo5.NEWS;
        }
        if (iOrdinal != 4) {
            return iOrdinal != 29 ? uo5.UNKNOWN : uo5.CYBER;
        }
        return uo5.ONE_X_BET;
    }

    public static uo5 f(int i) {
        uo5 uo5Var = uo5.POPULAR;
        if (i == 9) {
            return uo5Var;
        }
        uo5 uo5Var2 = uo5.DEPOSIT;
        if (i == 10) {
            return uo5Var2;
        }
        uo5 uo5Var3 = uo5.NEWS;
        if (i == 11) {
            return uo5Var3;
        }
        uo5 uo5Var4 = uo5.ACTIONS;
        if (i == 12) {
            return uo5Var4;
        }
        uo5 uo5Var5 = uo5.ONE_X_BET;
        if (i == 20) {
            return uo5Var5;
        }
        uo5 uo5Var6 = uo5.AGGREGATOR;
        if (i == 23) {
            return uo5Var6;
        }
        uo5 uo5Var7 = uo5.SUGGESTIONS;
        if (i == 43) {
            return uo5Var7;
        }
        uo5 uo5Var8 = uo5.TOURNAMENTS;
        if (i == 76) {
            return uo5Var8;
        }
        return i == 86 ? uo5.CYBER : uo5.UNKNOWN;
    }

    public static FragmentScreen g(boolean z) {
        return z ? new BetConstructorGamesScreen() : new BetConstructorGamesScreenOld();
    }

    public static re9 h(Integer num) {
        return ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2)) ? re9.b : re9.c;
    }

    public static fzc i(double d, Double d2) {
        if (d2 == null || Intrinsics.a(d, d2)) {
            return fzc.b;
        }
        if (d > d2.doubleValue()) {
            return fzc.c;
        }
        return d < d2.doubleValue() ? fzc.d : fzc.b;
    }

    public static String j(int i, String str) {
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) == '/') {
                i2++;
            }
        }
        return ua80.e((i - i2) - 1, Separators.LPAREN, Separators.RPAREN);
    }

    public static int k(fzc fzcVar, Context context) {
        fzcVar.getClass();
        context.getClass();
        int iOrdinal = fzcVar.ordinal();
        if (iOrdinal == 0) {
            TypedValue typedValue = j5d.f15927a;
            return j5d.a(context, R.attr.uikitStaticWhite, false);
        }
        if (iOrdinal == 1) {
            TypedValue typedValue2 = j5d.f15927a;
            return j5d.a(context, R.attr.uikitStaticGreen, false);
        }
        if (iOrdinal == 2) {
            TypedValue typedValue3 = j5d.f15927a;
            return j5d.a(context, R.attr.uikitStaticRed, false);
        }
        t9f.b();
        return 0;
    }

    public static SpannableString l(String str, int i, Context context, wdv0 wdv0Var) {
        int iX;
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{Separators.SLASH}, false, 0, 6, null);
        if (listSplit$default.size() < 2) {
            return new SpannableString(str);
        }
        String strB0 = CollectionsKt.b0(CollectionsKt.D0(listSplit$default, 2), Separators.SLASH, null, null, null, 62);
        int iOrdinal = wdv0Var.ordinal();
        if (iOrdinal == 0) {
            iX = 0;
        } else if (iOrdinal == 1) {
            iX = sj3.X(107);
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return null;
            }
            iX = sj3.X(140);
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.text_18);
        Typeface typefaceCreate = Typeface.create(itf0.a(R.font.roboto_medium, context), 1);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(dimensionPixelSize);
        textPaint.setTypeface(typefaceCreate);
        int lineWidth = iX + ((int) new StaticLayout("0000000", textPaint, v2n0.u(i, context), Layout.Alignment.ALIGN_NORMAL, 0.0f, 0.0f, true).getLineWidth(0));
        int iU = v2n0.u(i, context);
        int i2 = wdv0Var == wdv0.c ? (iU - lineWidth) / 2 : iU - lineWidth;
        int size = listSplit$default.size();
        int i3 = i2 * 2;
        String strJ = j(size, strB0);
        String strL = kng0.l(strB0, Separators.SP, strJ);
        if (b(context, i2, strL) > i3) {
            String strL2 = kng0.l(strB0, "..", strJ);
            int iB = b(context, i2, strL2);
            while (iB > i3) {
                String strConcat = ttm0.H(1, kotlin.text.c.r(kotlin.text.c.r(strL2, "..", "", false), strJ, "", false)).concat("..");
                strJ = j(size, strConcat);
                strL2 = strConcat.concat(strJ);
                iB = b(context, i2, strL2);
            }
            strL = strL2;
        }
        SpannableString spannableString = new SpannableString(strL);
        TypedValue typedValue = j5d.f15927a;
        spannableString.setSpan(new ForegroundColorSpan(j5d.a(context, R.attr.uikitSecondary, false)), spannableString.length() - 3, spannableString.length(), 33);
        return spannableString;
    }

    public static void n(RemoteViews remoteViews, long j, List list, List list2, Context context) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Integer num = (Integer) CollectionsKt.W(i, list);
            String str = (String) CollectionsKt.W(i, list2);
            if (num != null) {
                if (str == null || str.length() == 0) {
                    remoteViews.setViewVisibility(num.intValue(), 8);
                } else {
                    a4n0.h(remoteViews, context, num.intValue(), vsm0.s(j, str), R.drawable.no_photo, (int) context.getResources().getDimension(R.dimen.widget_logo_size), kotlin.collections.a.c(new j2x(R.dimen.corner_radius_10)));
                }
            }
        }
    }

    @Override // a.qna
    public void a(zj zjVar, bpn0 bpn0Var) {
        bpn0Var.getClass();
    }

    public List m(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (pfd pfdVar : componentRegistrar.getComponents()) {
            String str = pfdVar.f26897a;
            if (str != null) {
                uq uqVar = new uq((Object) str, (Object) pfdVar, (byte) 4);
                Set set = pfdVar.b;
                Set set2 = pfdVar.c;
                byte b = pfdVar.d;
                boolean z = pfdVar.e;
                pfdVar = new pfd(str, set, set2, b, z ? 1 : 0, uqVar, pfdVar.g);
            }
            arrayList.add(pfdVar);
        }
        return arrayList;
    }

    @Override // a.qna
    public void c(View view) {
    }

    @Override // a.qna
    public void d(zj zjVar) {
    }
}
