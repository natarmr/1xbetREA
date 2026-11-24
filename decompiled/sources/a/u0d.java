package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.util.TypedValue;
import android.widget.ImageView;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class u0d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f34849a = q3d.j("defaultlogo.png", "teamdefault.png");

    public static void a(ImageView imageView) {
        imageView.getClass();
        Context applicationContext = imageView.getContext().getApplicationContext();
        applicationContext.getClass();
        if (sj3.q0(applicationContext)) {
            o5n0.r(imageView).a();
        }
    }

    public static String b(String str) {
        str.getClass();
        if (!kotlin.text.c.x(str, "http", false)) {
            return str;
        }
        try {
            String strSubstring = str.substring(StringsKt.V(str, "//", 0, false, 6) + 2);
            return strSubstring.substring(StringsKt.V(strSubstring, Separators.SLASH, 0, false, 6));
        } catch (Exception unused) {
            return str;
        }
    }

    public static boolean c(String str) {
        str.getClass();
        List listJ = q3d.j("/0.svg", "/0.png", "/-1.svg", "/-1.png");
        if (listJ == null || !listJ.isEmpty()) {
            Iterator it = listJ.iterator();
            while (it.hasNext()) {
                if (StringsKt.O(str, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        List list = f34849a;
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (StringsKt.O(str, (String) it2.next(), false)) {
                    return true;
                }
            }
        }
        return str.length() == 0;
    }

    public static void d(ImageView imageView, String str, Integer num, Integer num2, int i) {
        Integer num3 = (i & 2) != 0 ? null : -1;
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        e6c e6cVar = new e6c((byte) 21);
        e6c e6cVar2 = new e6c((byte) 22);
        imageView.getClass();
        Context context = imageView.getContext();
        context.getClass();
        if (sj3.q0(context)) {
            Drawable colorDrawable = num3 != null ? new ColorDrawable(num3.intValue()) : epv0.U(R.drawable.default_background, imageView.getContext());
            gbe0 gbe0VarA = o5k0.a(imageView.getContext());
            k1x k1xVar = new k1x(imageView.getContext());
            k1xVar.c = str;
            t1x.h(k1xVar, imageView);
            k1xVar.i = b(str);
            k1xVar.f = b(str);
            t1x.g(k1xVar, colorDrawable);
            t1x.d(k1xVar, colorDrawable);
            if (num != null && num2 != null) {
                k1xVar.d(num.intValue(), num2.intValue());
            }
            k1xVar.e = new lhf0((Object) e6cVar2, (Object) e6cVar, (Object) imageView, (byte) 10);
            t1x.b(k1xVar, true);
            gbe0VarA.a(k1xVar.a());
        }
    }

    public static void e(ImageView imageView, String str, Drawable drawable, Drawable drawable2) {
        str.getClass();
        gbe0 gbe0VarA = o5k0.a(imageView.getContext());
        k1x k1xVar = new k1x(imageView.getContext());
        k1xVar.c = str;
        t1x.h(k1xVar, imageView);
        k1xVar.o = vi9.e;
        t1x.g(k1xVar, drawable2);
        t1x.d(k1xVar, drawable);
        k1xVar.e = new xr(imageView, str);
        gbe0VarA.a(k1xVar.a());
    }

    public static void f(ImageView imageView, String str, List list, String str2) {
        str.getClass();
        list.getClass();
        Context context = imageView.getContext();
        context.getClass();
        if (sj3.q0(context)) {
            gbe0 gbe0VarA = o5k0.a(imageView.getContext());
            k1x k1xVar = new k1x(imageView.getContext());
            k1xVar.c = str;
            t1x.h(k1xVar, imageView);
            if (str2 != null) {
                try {
                    byte[] bArrDecode = Base64.decode(str2, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(imageView.getContext().getResources(), BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                    t1x.g(k1xVar, bitmapDrawable);
                    t1x.d(k1xVar, bitmapDrawable);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Context context2 = imageView.getContext();
            context2.getClass();
            q1x.b(k1xVar, dtb.P(context2, list));
            t1x.b(k1xVar, true);
            gbe0VarA.a(k1xVar.a());
        }
    }

    public static void g(ImageView imageView, String str, List list, String str2, int i) {
        if ((i & 2) != 0) {
            list = iun.f15405a;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        f(imageView, str, list, str2);
    }

    public static void h(Context context, String str, Function1 function1) {
        context.getClass();
        if (!sj3.q0(context)) {
            function1.invoke(null);
            return;
        }
        k1x k1xVar = new k1x(context);
        k1xVar.c = str.length() != 0 ? str : null;
        if (str.length() > 0) {
            k1xVar.i = b(str);
            k1xVar.f = b(str);
        }
        k1xVar.e = new oif0((Object) function1, (Object) context, (Object) function1, (byte) 11);
        t1x.b(k1xVar, true);
        t1x.a(k1xVar, false);
        o5k0.a(context).a(k1xVar.a());
    }

    public static void i(ImageView imageView, int i) {
        Context context = imageView.getContext();
        context.getClass();
        if (sj3.q0(context)) {
            Integer numValueOf = Integer.valueOf(i);
            gbe0 gbe0VarA = o5k0.a(imageView.getContext());
            k1x k1xVar = new k1x(imageView.getContext());
            k1xVar.c = numValueOf;
            t1x.h(k1xVar, imageView);
            t1x.b(k1xVar, true);
            gbe0VarA.a(k1xVar.a());
        }
    }

    public static void j(ImageView imageView, String str, int i, int i2, List list, Function1 function1, Function1 function2, int i3) {
        int i4 = (i3 & 2) != 0 ? 0 : i;
        int i5 = (i3 & 4) != 0 ? i4 : i2;
        boolean z = (i3 & 8) == 0;
        List list2 = (i3 & 16) != 0 ? iun.f15405a : list;
        hzw hzwVar = (i3 & 32) != 0 ? ezw.f8691a : gzw.f12203a;
        boolean z2 = (i3 & 64) != 0;
        Function1 e6cVar = (i3 & 128) != 0 ? new e6c((byte) 16) : function1;
        Function1 e6cVar2 = (i3 & 256) != 0 ? new e6c((byte) 17) : function2;
        imageView.getClass();
        str.getClass();
        list2.getClass();
        Context context = imageView.getContext();
        context.getClass();
        if (sj3.q0(context)) {
            o(imageView, str, i4 == 0 ? null : epv0.U(i4, imageView.getContext()), i5 != 0 ? epv0.U(i5, imageView.getContext()) : null, z, list2, hzwVar, z2, e6cVar, e6cVar2);
        }
    }

    public static void k(ImageView imageView, String str) {
        imageView.getClass();
        Context context = imageView.getContext();
        context.getClass();
        if (sj3.q0(context)) {
            gbe0 gbe0VarA = o5k0.a(imageView.getContext());
            k1x k1xVar = new k1x(imageView.getContext());
            k1xVar.c = str;
            t1x.h(k1xVar, imageView);
            k1xVar.i = b(str);
            k1xVar.f = b(str);
            t1x.f(k1xVar, R.drawable.sport_new);
            t1x.c(k1xVar, R.drawable.sport_new);
            vi9 vi9Var = vi9.c;
            k1xVar.n = vi9Var;
            k1xVar.o = vi9Var;
            t1x.b(k1xVar, true);
            gbe0VarA.a(k1xVar.a());
            TypedValue typedValue = j5d.f15927a;
            Context context2 = imageView.getContext();
            context2.getClass();
            imageView.setColorFilter(j5d.a(context2, R.attr.uikitSecondary, false));
        }
    }

    public static void l(ImageView imageView, String str) {
        Context context = imageView.getContext();
        context.getClass();
        if (sj3.q0(context)) {
            gbe0 gbe0VarA = o5k0.a(imageView.getContext());
            k1x k1xVar = new k1x(imageView.getContext());
            k1xVar.c = str;
            t1x.h(k1xVar, imageView);
            k1xVar.i = b(str);
            k1xVar.f = b(str);
            t1x.f(k1xVar, R.drawable.sport_new);
            t1x.c(k1xVar, R.drawable.sport_new);
            vi9 vi9Var = vi9.c;
            k1xVar.n = vi9Var;
            k1xVar.o = vi9Var;
            t1x.b(k1xVar, true);
            gbe0VarA.a(k1xVar.a());
        }
    }

    public static void m(ImageView imageView, qzw qzwVar, String str, int i) {
        imageView.getClass();
        qzwVar.getClass();
        str.getClass();
        Context context = imageView.getContext();
        context.getClass();
        if (sj3.q0(context)) {
            gbe0 gbe0VarA = o5k0.a(imageView.getContext());
            k1x k1xVar = new k1x(imageView.getContext());
            k1xVar.c = str;
            t1x.h(k1xVar, imageView);
            k1xVar.i = b(str);
            k1xVar.f = b(str);
            if (i <= 0) {
                i = R.drawable.no_photo;
            }
            t1x.c(k1xVar, i);
            t1x.f(k1xVar, i);
            if (qzwVar == qzw.f29598a) {
                lls0[] lls0VarArr = {new fjc((byte) 0)};
                kuo kuoVar = q1x.f27974a;
                q1x.b(k1xVar, tx3.g0(lls0VarArr));
            }
            t1x.b(k1xVar, true);
            gbe0VarA.a(k1xVar.a());
        }
    }

    public static /* synthetic */ void n(ImageView imageView, String str, int i, int i2) {
        qzw qzwVar = qzw.f29598a;
        if ((i2 & 1) != 0) {
            qzwVar = qzw.b;
        }
        if ((i2 & 8) != 0) {
            i = 0;
        }
        m(imageView, qzwVar, str, i);
    }

    public static void o(ImageView imageView, String str, Drawable drawable, Drawable drawable2, boolean z, List list, hzw hzwVar, boolean z2, Function1 function1, Function1 function2) {
        imageView.getClass();
        str.getClass();
        list.getClass();
        Context context = imageView.getContext();
        context.getClass();
        if (sj3.q0(context)) {
            StringBuilder sb = new StringBuilder(ujn.h);
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
            String string = sb.toString();
            gbe0 gbe0VarA = o5k0.a(imageView.getContext());
            k1x k1xVar = new k1x(imageView.getContext());
            k1xVar.c = string;
            t1x.h(k1xVar, imageView);
            k1xVar.i = b(string);
            k1xVar.f = b(string);
            if (z) {
                q1x.a(k1xVar);
            }
            t1x.g(k1xVar, drawable);
            t1x.d(k1xVar, drawable2);
            prs0 prs0VarO = dtb.O(hzwVar);
            vi9 vi9Var = (vi9) prs0VarO.f27482a;
            vi9 vi9Var2 = (vi9) prs0VarO.b;
            vi9 vi9Var3 = (vi9) prs0VarO.c;
            k1xVar.n = vi9Var;
            k1xVar.m = vi9Var2;
            k1xVar.o = vi9Var3;
            Context context2 = imageView.getContext();
            context2.getClass();
            q1x.b(k1xVar, dtb.P(context2, list));
            k1xVar.e = new nr((Object) function2, (Object) function1, (Object) imageView, (byte) 11);
            t1x.b(k1xVar, z2);
            t1x.a(k1xVar, z2);
            gbe0VarA.a(k1xVar.a());
        }
    }

    public static void p(ImageView imageView, String str, Drawable drawable) {
        o(imageView, str, drawable, drawable, false, iun.f15405a, ezw.f8691a, true, new e6c((byte) 18), new e6c((byte) 19));
    }

    public static String q(String str) {
        str.getClass();
        if (kotlin.text.c.x(str, "http", false)) {
            return str;
        }
        if (!kotlin.text.c.x(str, Separators.SLASH, false)) {
            str = Separators.SLASH.concat(str);
        }
        return ohs0.n(ujn.h, str);
    }

    public static void r(Context context, String str) {
        context.getClass();
        str.getClass();
        if (str.length() == 0) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        k1x k1xVar = new k1x(applicationContext);
        k1xVar.c = str;
        vi9 vi9Var = vi9.c;
        k1xVar.m = vi9Var;
        k1xVar.n = vi9Var;
        k1xVar.o = vi9Var;
        o5k0.a(context).a(k1xVar.a());
    }

    public static void s(Context context, String str, Integer num, Integer num2, List list, Function1 function1, Function1 function2, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        Integer num3 = (i & 4) != 0 ? null : num2;
        if ((i & 8) != 0) {
            list = iun.f15405a;
        }
        if ((i & 32) != 0) {
            function2 = new e6c((byte) 20);
        }
        Function1 function3 = function2;
        context.getClass();
        str.getClass();
        list.getClass();
        if (sj3.q0(context)) {
            gbe0 gbe0VarA = o5k0.a(context);
            k1x k1xVar = new k1x(context);
            k1xVar.c = str;
            k1xVar.i = b(str);
            k1xVar.f = b(str);
            vi9 vi9Var = vi9.c;
            k1xVar.n = vi9Var;
            k1xVar.o = vi9Var;
            q1x.b(k1xVar, dtb.P(context, list));
            if (num != null) {
                k1xVar.c(num.intValue());
            }
            k1xVar.e = new esg0(function3, num3, function1, context, function1, context);
            t1x.b(k1xVar, true);
            gbe0VarA.a(k1xVar.a());
        }
    }
}
