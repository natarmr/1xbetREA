package a;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.os.UserManager;
import android.util.Property;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.aggregator.api.model.tournaments.UserActionButtonModel;

/* JADX INFO: loaded from: classes4.dex */
public final class tnq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tnq0 f34248a = new tnq0();

    public static final void a(int i, fet fetVar) {
        fetVar.g0(105144827);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.d(o7k0.u(jm40.b, 0.0f, 128.0f, 1), 1.0f), 18.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ofo0(i, (byte) 12);
        }
    }

    public static final void b(mm40 mm40Var, bxo0 bxo0Var, fet fetVar, int i) {
        bxo0Var.getClass();
        fetVar.g0(867598947);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(bxo0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (bxo0Var.equals(xwo0.f41619a)) {
                fetVar.e0(-1518845006);
                a(0, fetVar);
                fetVar.r(false);
            } else {
                if (!(bxo0Var instanceof zwo0)) {
                    throw b1j.f(228098042, fetVar, false);
                }
                fetVar.e0(-1518749526);
                zwo0 zwo0Var = (zwo0) bxo0Var;
                c(zwo0Var.f45116a, zwo0Var.b, fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o3m0(mm40Var, bxo0Var, i, (byte) 22);
        }
    }

    public static final void c(String str, d4d d4dVar, fet fetVar, int i) {
        fetVar.g0(-271165509);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.e(d4dVar.ordinal()) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            v8q0.a(str, null, ibc.Y(d4dVar, fetVar), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, i2 & 14, 24960, 109562);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vwo0(str, d4dVar, i, (byte) 0);
        }
    }

    public static final void d(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        ugd ugdVar = phu0.h;
        fetVar.g0(1284194665);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 16.0f);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = mu90.l;
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, -1219008692, a4xVar);
            while (itO.hasNext()) {
                uoo0 uoo0Var = (uoo0) itO.next();
                fetVar.b0(-1051902312, uoo0Var.a());
                ugdVar.F(uoo0Var, fetVar, 48);
                fetVar.r(false);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k5d0(i, a4xVar, mm40Var);
        }
    }

    public static final void e(int i, int i2, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        a4xVar.getClass();
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        d((i & 112) | 384, fetVar, a4xVar, o7k0.d(mm40Var, 1.0f));
    }

    public static final void f(int i, fet fetVar) {
        fetVar.g0(-260593591);
        if (fetVar.U(i & 1, i != 0)) {
            View view = (View) fetVar.k(dy2.f);
            ViewParent parent = view.getParent();
            vjk vjkVar = parent instanceof vjk ? (vjk) parent : null;
            Window window = vjkVar != null ? vjkVar.getWindow() : null;
            pz40 pz40Var = s6t0.f31722a;
            boolean zC = true ^ s6t0.c();
            boolean zI = fetVar.i(window) | fetVar.h(zC);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zI || objP == obj) {
                objP = new vt8(window, zC, (byte) 2);
                fetVar.o0(objP);
            }
            m0x0.o(window, (Function1) objP, fetVar);
            boolean zI2 = fetVar.i(view);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == obj) {
                objP2 = new oz7(view, (byte) 3);
                fetVar.o0(objP2);
            }
            m0x0.o(view, (Function1) objP2, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i9v0(i, (byte) 14);
        }
    }

    public static final void g(lc00 lc00Var, List list, ctf0 ctf0Var) {
        list.getClass();
        ctf0Var.getClass();
        if (list.isEmpty()) {
            return;
        }
        lc00Var.add(new psv("SEKIRO_HEADER_KEY", R.string.round_statistics));
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ctf0Var.b.a(R.string.synthetic_round_v2, Arrays.copyOf(new Object[]{String.valueOf(((nyh0) it.next()).f24330a)}, 1)));
        }
        lc00Var.add(new y7o0(arrayList));
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.mortal_kombat_hero_win, Arrays.copyOf(new Object[0], 0));
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((nyh0) it2.next()).b);
        }
        lc00Var.add(new b8o0(R.drawable.cybergame_synthetic_ufc_second_bg, "SEKIRO_WINNER_KEY", strA, arrayList2));
        String strA2 = lsm0Var.a(R.string.dead_of_shinobi, Arrays.copyOf(new Object[0], 0));
        ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList3.add(String.valueOf(((nyh0) it3.next()).c));
        }
        lc00Var.add(new b8o0(R.drawable.cybergame_synthetic_sekiro_statistic_bg, "SEKIRO_DEAD_KEY", strA2, arrayList3));
        String strA3 = lsm0Var.a(R.string.dead_of_opponent, Arrays.copyOf(new Object[0], 0));
        ArrayList arrayList4 = new ArrayList(r3d.q(list, 10));
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            arrayList4.add(String.valueOf(((nyh0) it4.next()).d));
        }
        lc00Var.add(new b8o0(R.drawable.cybergame_synthetic_ufc_second_last_bg, "SEKIRO_COUNT_DEAD_KEY", strA3, arrayList4));
    }

    public static final void h(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(Separators.QUESTION);
            if (i2 < i - 1) {
                sb.append(Separators.COMMA);
            }
        }
    }

    public static final void i(TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            return;
        }
        jf4.o("Attribute not defined in set.");
    }

    public static xbu0 j(n4d0 n4d0Var) {
        n4d0Var.getClass();
        if (n4d0Var.b.size() == 0) {
            return xbu0.b;
        }
        List list = n4d0Var.b;
        list.getClass();
        return new xbu0(list);
    }

    public static ObjectAnimator k(View view, mns0 mns0Var, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, muu0 muu0Var) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) mns0Var.b.getTag(R.id.transition_position);
        if (iArr != null) {
            f = (iArr[0] - i) + translationX;
            f2 = (iArr[1] - i2) + translationY;
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f2, f4));
        nns0 nns0Var = new nns0(view, mns0Var.b, translationX, translationY);
        muu0Var.a(nns0Var);
        objectAnimatorOfPropertyValuesHolder.addListener(nns0Var);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static final String l(e8h e8hVar, List list) {
        list.getClass();
        String str = e8hVar.c;
        if (str.length() != 0) {
            return str;
        }
        return zsm0.k(e8hVar.b, list, kotlin.collections.a.c(String.valueOf(e8hVar.f7371a)));
    }

    public static final boolean m(j83 j83Var) {
        int length = j83Var.b.length();
        List list = j83Var.f16067a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                i83 i83Var = (i83) list.get(i);
                if ((i83Var.f14321a instanceof kb00) && k83.b(0, length, i83Var.b, i83Var.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean n(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static final ArrayList o(List list, List list2) {
        Object obj;
        Object next;
        list.getClass();
        list2.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            myr0 myr0Var = (myr0) it.next();
            Iterator it2 = list2.iterator();
            do {
                obj = null;
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((w2s0) next).f38467a != myr0Var.f22617a);
            w2s0 w2s0Var = (w2s0) next;
            boolean z = w2s0Var != null ? w2s0Var.b : false;
            for (Object obj2 : list2) {
                if (((w2s0) obj2).f38467a == myr0Var.f22617a) {
                    obj = obj2;
                    break;
                }
            }
            arrayList.add(myr0.a(myr0Var, z, myr0Var.h, q(myr0Var, (w2s0) obj, false)));
        }
        return arrayList;
    }

    public static final ArrayList p(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            myr0 myr0Var = (myr0) it.next();
            arrayList.add(myr0.a(myr0Var, myr0Var.g, myr0Var.h, q(myr0Var, null, true)));
        }
        return arrayList;
    }

    public static final UserActionButtonModel q(myr0 myr0Var, w2s0 w2s0Var, boolean z) {
        z1s0 z1s0Var = myr0Var.b;
        UserActionButtonModel userActionButtonModel = myr0Var.i;
        lf9 lf9Var = myr0Var.j;
        int iOrdinal = z1s0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
        } else {
            if (z) {
                return new UserActionButtonModel("", gqt0.h);
            }
            re9 re9Var = myr0Var.l;
            re9 re9Var2 = re9.b;
            if (re9Var == re9Var2 && ((w2s0Var == null || !w2s0Var.b) && (w2s0Var == null || !w2s0Var.d))) {
                return new UserActionButtonModel(lf9Var.b, gqt0.f11750a);
            }
            if (re9Var == re9Var2 && w2s0Var != null && w2s0Var.d) {
                return new UserActionButtonModel(lf9Var.f19942a, gqt0.d);
            }
            if (re9Var == re9Var2) {
                return new UserActionButtonModel(lf9Var.e, gqt0.b);
            }
        }
        return userActionButtonModel;
    }

    public static final String r(f7v0 f7v0Var, ctf0 ctf0Var) {
        f7v0Var.getClass();
        ctf0Var.getClass();
        switch (f7v0Var.ordinal()) {
            case 0:
                return "";
            case 1:
                return ctf0Var.b.a(R.string.ufc_flyweight, Arrays.copyOf(new Object[0], 0));
            case 2:
                return ctf0Var.b.a(R.string.ufc_bantamweight, Arrays.copyOf(new Object[0], 0));
            case 3:
                return ctf0Var.b.a(R.string.ufc_featherweight, Arrays.copyOf(new Object[0], 0));
            case 4:
                return ctf0Var.b.a(R.string.ufc_lightweight, Arrays.copyOf(new Object[0], 0));
            case 5:
                return ctf0Var.b.a(R.string.ufc_welterweight, Arrays.copyOf(new Object[0], 0));
            case 6:
                return ctf0Var.b.a(R.string.ufc_middleweight, Arrays.copyOf(new Object[0], 0));
            case 7:
                return ctf0Var.b.a(R.string.ufc_light_heavyweight, Arrays.copyOf(new Object[0], 0));
            case 8:
                return ctf0Var.b.a(R.string.ufc_heavyweight, Arrays.copyOf(new Object[0], 0));
            case 9:
                return ctf0Var.b.a(R.string.ufc_mens_pound_for_pound, Arrays.copyOf(new Object[0], 0));
            case 10:
                return ctf0Var.b.a(R.string.ufc_womens_sw, Arrays.copyOf(new Object[0], 0));
            case 11:
                return ctf0Var.b.a(R.string.ufc_womens_flw, Arrays.copyOf(new Object[0], 0));
            case 12:
                return ctf0Var.b.a(R.string.ufc_womens_bw, Arrays.copyOf(new Object[0], 0));
            case 13:
                return ctf0Var.b.a(R.string.ufc_womens_pound_for_pound, Arrays.copyOf(new Object[0], 0));
            default:
                t9f.b();
                return null;
        }
    }

    public static String s(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strK;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strK = "null";
            } else {
                try {
                    strK = obj.toString();
                } catch (Exception e) {
                    String strL = kng0.l(obj.getClass().getName(), Separators.AT, Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strL), (Throwable) e);
                    strK = b1j.k(Separators.LESS_THAN, strL, " threw ", e.getClass().getName(), Separators.GREATER_THAN);
                }
            }
            objArr[i2] = strK;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
