package a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class std implements ub00, giu0, qbw {
    public std(epi0 epi0Var) {
    }

    public static j1g e(int i) {
        Object next;
        c0o c0oVar = j1g.h;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (((j1g) next).f15732a != i);
        j1g j1gVar = (j1g) next;
        return j1gVar == null ? j1g.UNKNOWN : j1gVar;
    }

    public static b5i f(TypedArray typedArray) {
        typedArray.getClass();
        b5i b5iVar = b5i.ERROR_ICON;
        int i = typedArray.getInt(35, 0);
        if (i == 0) {
            return b5iVar;
        }
        b5i b5iVar2 = b5i.ICON;
        if (i == 1) {
            return b5iVar2;
        }
        b5i b5iVar3 = b5i.STEPPER;
        if (i == 2) {
            return b5iVar3;
        }
        b5i b5iVar4 = b5i.CHEVRON;
        if (i == 3) {
            return b5iVar4;
        }
        b5i b5iVar5 = b5i.PASSWORD;
        if (i == 4) {
            return b5iVar5;
        }
        b5i b5iVar6 = b5i.NONE;
        if (i == 5) {
            return b5iVar6;
        }
        jf4.o(twn.m(i, "Unknown style value: "));
        return null;
    }

    public static vkq0 g(int i, int i2) {
        Pair pair;
        Pair pair2;
        if (i == 0) {
            pair = new Pair(12, uhq0.f35695a);
        } else if (i == 12) {
            pair = new Pair(12, uhq0.b);
        } else {
            if (1 <= i && i < 13) {
                pair2 = new Pair(Integer.valueOf(i), uhq0.f35695a);
            } else if (12 > i || i >= 24) {
                pair = new Pair(12, uhq0.f35695a);
            } else {
                pair2 = new Pair(Integer.valueOf(i - 12), uhq0.b);
            }
            pair = pair2;
        }
        return new vkq0(((Number) pair.f46059a).intValue(), i2, (uhq0) pair.b);
    }

    public static void h(androidx.fragment.app.e eVar, n3w n3wVar, double d) {
        n3wVar.getClass();
        oyd oydVar = new oyd();
        iiy[] iiyVarArr = oyd.l2;
        oydVar.e2.u(oydVar, iiyVarArr[0], n3wVar);
        oydVar.f2.f0(oydVar, iiyVarArr[1], d);
        oydVar.g2.x(oydVar, iiyVarArr[2], "REQUEST_CONFIRM_SALE_DIALOG_KEY");
        oydVar.H0(eVar, "ConfirmSaleDialog");
    }

    @Override // a.qbw
    public lq80 a() {
        return new pbw(mbw.o, null);
    }

    @Override // a.qbw
    public lq80 b(mbw mbwVar, ibw ibwVar) {
        return new pbw(mbwVar, ibwVar);
    }

    @Override // a.giu0
    public diu0 c(Object obj) {
        ((i1w0) obj).getClass();
        return new q890();
    }

    @Override // a.ub00
    public void d(View view, String str) {
        int iHashCode;
        view.getClass();
        Context context = view.getContext();
        context.getClass();
        Uri uri = Uri.parse(str);
        uri.getClass();
        String scheme = uri.getScheme();
        if (scheme != null && ((iHashCode = scheme.hashCode()) == 3213448 ? scheme.equals("http") : iHashCode == 99617003 && scheme.equals("https"))) {
            vic.C(context, str);
            return;
        }
        try {
            Uri uri2 = Uri.parse(str);
            uri2.getClass();
            context.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri2));
        } catch (ActivityNotFoundException e) {
            Log.w("ConsultantLinkResolver", "No activity to handle link: ".concat(str), e);
        } catch (SecurityException e2) {
            Log.w("ConsultantLinkResolver", "Access denied to handle link: ".concat(str), e2);
        }
    }
}
