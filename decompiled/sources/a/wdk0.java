package a;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xplatform.uikit.components.snackbar.DsSnackBarView;

/* JADX INFO: loaded from: classes6.dex */
public final class wdk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f38978a;
    public final Function0 b;
    public final Function0 c;
    public final LinkedHashMap d;
    public final Set e;

    public wdk0(Function0 function0, Function0 function1, Function0 function2) {
        this.f38978a = function0;
        this.b = function1;
        this.c = function2;
        this.d = new LinkedHashMap();
        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        setNewSetFromMap.getClass();
        this.e = setNewSetFromMap;
    }

    public static void a(wdk0 wdk0Var, Fragment fragment) {
        wdk0Var.getClass();
        fragment.getClass();
        vcc.C(fragment, "request_key_notification_updated");
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Fragment fragment = (Fragment) obj;
            if ((fragment instanceof yx5) || (fragment instanceof by5) || (fragment instanceof i620)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static View c(kxq kxqVar, View view) {
        Object objPrevious;
        Activity activity;
        if (view == null) {
            ArrayList arrayList = ujk.f35785a;
            w3d.y(arrayList, new vbk((byte) 4));
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) it.next()).get();
                if (view2 != null) {
                    arrayList2.add(view2);
                }
            }
            ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                View view3 = (View) objPrevious;
                if (view3.isAttachedToWindow() && view3.isShown()) {
                    Context context = view3.getContext();
                    context.getClass();
                    while (true) {
                        if (!(context instanceof Activity)) {
                            if (!(context instanceof ContextWrapper)) {
                                activity = null;
                                break;
                            }
                            context = ((ContextWrapper) context).getBaseContext();
                            context.getClass();
                        } else {
                            activity = (Activity) context;
                            break;
                        }
                    }
                    if (activity == kxqVar) {
                        break;
                    }
                }
            }
            View view4 = (View) objPrevious;
            if (view4 != null) {
                ViewGroup viewGroup = (ViewGroup) view4.getRootView().findViewById(R.id.content);
                return viewGroup != null ? viewGroup : view4;
            }
        }
        return null;
    }

    public static ArrayList d(List list) {
        Object objPrevious;
        androidx.fragment.app.e eVarC;
        List listP;
        try {
            ListIterator listIterator = list.listIterator(list.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((Fragment) objPrevious).Q());
            Fragment fragment = (Fragment) objPrevious;
            if (fragment != null && (eVarC = fragment.C()) != null && (listP = eVarC.c.p()) != null) {
                return b(listP);
            }
        } catch (IllegalStateException unused) {
        }
        return null;
    }

    public static int e(View view) {
        WeakHashMap weakHashMap = rgu0.f30456a;
        xiv0 xiv0VarA = jgu0.a(view);
        if (xiv0VarA == null) {
            return 0;
        }
        uiv0 uiv0Var = xiv0VarA.f40966a;
        int i = uiv0Var.i(8).d;
        int i2 = uiv0Var.i(2).d;
        if (uiv0Var.u(8)) {
            return i - i2;
        }
        return 0;
    }

    public static Fragment f(List list) {
        ArrayList arrayListD = d(list);
        if (arrayListD == null || arrayListD.isEmpty()) {
            return (Fragment) CollectionsKt.f0(list);
        }
        List listD = d(list);
        if (listD == null) {
            listD = iun.f15405a;
        }
        return f(listD);
    }

    public static Fragment g(List list) {
        Fragment fragment;
        Object next;
        ArrayList arrayListD = d(list);
        if (arrayListD != null) {
            Iterator it = arrayListD.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Fragment fragment2 = (Fragment) next;
                if ((fragment2 instanceof i620) && fragment2.Q()) {
                    break;
                }
            }
            fragment = (Fragment) next;
        } else {
            fragment = null;
        }
        if (fragment != null) {
            return fragment;
        }
        if (arrayListD == null || arrayListD.isEmpty()) {
            return null;
        }
        List listD = d(list);
        if (listD == null) {
            listD = iun.f15405a;
        }
        return g(listD);
    }

    public static mdk0 i(wdk0 wdk0Var, xdk0 xdk0Var, View view) {
        rrm rrmVarH = wdk0Var.h(view, xdk0Var, new l3c0(new pdk0((byte) 3), (byte) 15));
        rrmVarH.e();
        return new mdk0(rrmVarH);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    public static ndk0 j(final wdk0 wdk0Var, xdk0 xdk0Var, kxq kxqVar, View view, Function0 function0, boolean z, boolean z2, Integer num, int i) {
        View viewFindViewById;
        boolean z3;
        rrm rrmVar;
        Integer num2;
        Dialog dialogA0;
        Window window;
        Dialog dialogA1;
        View view2 = (i & 4) != 0 ? null : view;
        final Function0 pdk0Var = (i & 8) != 0 ? new pdk0((byte) 0) : function0;
        final boolean z4 = (i & 16) != 0 ? true : z;
        final boolean z5 = (i & 32) != 0 ? true : z2;
        Integer num3 = (i & 64) != 0 ? null : num;
        wdk0Var.getClass();
        kxqVar.getClass();
        View viewC = c(kxqVar, view2);
        if (viewC == null) {
            List listP = kxqVar.r().c.p();
            listP.getClass();
            ArrayList arrayListB = b(listP);
            Fragment fragmentG = g(arrayListB);
            sik sikVar = fragmentG instanceof sik ? (sik) fragmentG : null;
            ViewGroup viewGroup = (sikVar == null || (dialogA1 = sikVar.A0()) == null) ? null : (ViewGroup) dialogA1.findViewById(R.id.content);
            Fragment fragmentF = f(arrayListB);
            by5 by5Var = fragmentF instanceof by5 ? (by5) fragmentF : null;
            if (by5Var == null) {
                viewC = null;
            } else {
                if (!by5Var.S()) {
                    by5Var = null;
                }
                if (by5Var == null || (dialogA0 = by5Var.A0()) == null || (window = dialogA0.getWindow()) == null) {
                    viewC = null;
                } else {
                    viewC = (ViewGroup) window.findViewById(R.id.content);
                }
            }
            if (viewGroup != null) {
                viewC = viewGroup;
            }
        }
        if (viewC != null) {
            viewFindViewById = viewC;
        } else if (view2 == null) {
            viewFindViewById = kxqVar.findViewById(R.id.content);
            if (viewFindViewById == null) {
                jf4.o("Container or activity must not be null");
                return null;
            }
        } else {
            viewFindViewById = view2;
        }
        boolean z6 = viewC != null;
        rrm rrmVarH = wdk0Var.h(viewFindViewById, xdk0Var, new Function0() { // from class: a.qdk0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                pdk0Var.invoke();
                boolean z7 = z4;
                wdk0 wdk0Var2 = wdk0Var;
                if (z7) {
                    wdk0Var2.b.invoke();
                }
                if (z5) {
                    wdk0Var2.c.invoke();
                }
                return Unit.f46060a;
            }
        });
        f46 f46Var = rrmVarH.i;
        WeakReference weakReference = new WeakReference(kxqVar);
        f46Var.getClass();
        if (!f46Var.isLaidOut() || f46Var.isLayoutRequested()) {
            boolean z7 = z6;
            Integer num4 = num3;
            z3 = z7;
            rrmVar = rrmVarH;
            num2 = num4;
            f46Var.addOnLayoutChangeListener(new tdk0(weakReference, z7, wdk0Var, rrmVarH, num4));
        } else {
            kxq kxqVar2 = (kxq) weakReference.get();
            if (kxqVar2 != null) {
                if (kxqVar2.isFinishing() || kxqVar2.isDestroyed() || !f46Var.isAttachedToWindow()) {
                    kxqVar2 = null;
                }
                if (kxqVar2 != null) {
                    db50 db50Var = (db50) zdx.A(kxqVar2).f2242a.getValue();
                    Float f = db50Var.b;
                    if (z6) {
                        wdk0Var.p(rrmVarH);
                    } else if (!db50Var.f5786a) {
                        Resources resources = f46Var.getResources();
                        resources.getClass();
                        o(rrmVarH, resources, 0, num3);
                    } else if (f != null) {
                        wdk0Var.m(rrmVarH, f.floatValue());
                    } else {
                        Resources resources2 = f46Var.getResources();
                        resources2.getClass();
                        n(rrmVarH, resources2, 0);
                    }
                }
            }
            z3 = z6;
            num2 = num3;
            rrmVar = rrmVarH;
        }
        rrmVar.e();
        rdk0 rdk0Var = view2 == null ? new rdk0(wdk0Var, xdk0Var, pdk0Var, z4, z5, num2) : null;
        if (z3) {
            ldk0 ldk0Var = new ldk0(rrmVar);
            ldk0Var.b = rdk0Var;
            return ldk0Var;
        }
        mdk0 mdk0Var = new mdk0(rrmVar);
        mdk0Var.b = rdk0Var;
        return mdk0Var;
    }

    public static ndk0 k(wdk0 wdk0Var, xdk0 xdk0Var, Fragment fragment, Window window, View view, boolean z, Integer num, int i) {
        View viewFindViewById;
        kxq kxqVar = null;
        Window window2 = (i & 4) != 0 ? null : window;
        View view2 = (i & 8) != 0 ? null : view;
        boolean z2 = (i & 16) != 0 ? false : z;
        boolean z3 = (i & 32) == 0;
        pdk0 pdk0Var = new pdk0((byte) 4);
        Integer num2 = (i & 512) != 0 ? null : num;
        wdk0Var.getClass();
        xdk0Var.getClass();
        fragment.getClass();
        kxq kxqVarN0 = fragment.n0();
        View viewC = c(kxqVarN0, view2);
        if (view2 != null) {
            viewFindViewById = view2;
        } else if (viewC == null) {
            viewFindViewById = kxqVarN0.findViewById(R.id.content);
            if (viewFindViewById == null) {
                viewFindViewById = window2 != null ? window2.getDecorView() : null;
                if (viewFindViewById == null) {
                    jf4.o("Container or activity must not be null");
                    return null;
                }
            }
        } else {
            viewFindViewById = viewC;
        }
        rrm rrmVarH = wdk0Var.h(viewFindViewById, xdk0Var, new o0k0((Object) pdk0Var, (Object) wdk0Var, (byte) 2));
        f46 f46Var = rrmVarH.i;
        WeakReference weakReference = new WeakReference(kxqVarN0);
        f46Var.getClass();
        if (!f46Var.isLaidOut() || f46Var.isLayoutRequested()) {
            f46Var.addOnLayoutChangeListener(new udk0(weakReference, z3, wdk0Var, viewC, rrmVarH, view2, num2, z2));
        } else {
            kxq kxqVar2 = (kxq) weakReference.get();
            if (kxqVar2 != null) {
                if (!kxqVar2.isFinishing() && !kxqVar2.isDestroyed() && f46Var.isAttachedToWindow()) {
                    kxqVar = kxqVar2;
                }
                if (kxqVar != null) {
                    int iE = z3 ? e(f46Var) : 0;
                    db50 db50Var = (db50) zdx.A(kxqVar).f2242a.getValue();
                    Float f = db50Var.b;
                    if (viewC != null) {
                        wdk0Var.p(rrmVarH);
                    } else {
                        boolean z4 = db50Var.f5786a;
                        if (!z4 && view2 == null) {
                            Resources resources = f46Var.getResources();
                            resources.getClass();
                            o(rrmVarH, resources, iE, num2);
                        } else if (f != null && view2 == null) {
                            wdk0Var.m(rrmVarH, f.floatValue());
                        } else if (z2 || (z4 && view2 == null)) {
                            Resources resources2 = f46Var.getResources();
                            resources2.getClass();
                            n(rrmVarH, resources2, iE);
                        } else {
                            Resources resources3 = f46Var.getResources();
                            resources3.getClass();
                            o(rrmVarH, resources3, iE, num2);
                        }
                    }
                }
            }
        }
        rrmVarH.e();
        return viewC != null ? new ldk0(rrmVarH) : new mdk0(rrmVarH);
    }

    public static void l(wdk0 wdk0Var, Fragment fragment, boolean z) {
        qek0 qek0Var = qek0.f28589a;
        wdk0Var.getClass();
        fragment.getClass();
        vcc.g0(fragment, "request_key_notification_updated", new zw8("request_key_notification_updated", "bundle_key_notification_update", wdk0Var, qek0Var, fragment, z));
    }

    public static void n(rrm rrmVar, Resources resources, int i) {
        rrmVar.i.setTranslationY(-(((resources.getDimensionPixelSize(org.xbet.client1.R.dimen.size_56) / 2) + (i + resources.getDimensionPixelSize(org.xbet.client1.R.dimen.bottom_navigation_view_height))) - resources.getDimensionPixelSize(org.xbet.client1.R.dimen.size_8)));
    }

    public static void o(rrm rrmVar, Resources resources, int i, Integer num) {
        rrmVar.i.setTranslationY(-(resources.getDimensionPixelSize(num != null ? num.intValue() : org.xbet.client1.R.dimen.size_16) + i));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:143:0x0312  */
    /* JADX WARN: Code duplicated, block: B:146:0x0319  */
    /* JADX WARN: Code duplicated, block: B:148:0x031c  */
    /* JADX WARN: Code duplicated, block: B:149:0x0329  */
    /* JADX WARN: Code duplicated, block: B:152:0x033c  */
    /* JADX WARN: Code duplicated, block: B:187:0x03e2 A[LOOP:0: B:63:0x00d7->B:187:0x03e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:192:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b0  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final rrm h(View view, xdk0 xdk0Var, Function0 function0) {
        mek0 mek0Var;
        lek0 lek0Var;
        ViewGroup viewGroup;
        int i;
        String str;
        wdk0 wdk0Var;
        ArrayList arrayList;
        yc3 yc3VarP;
        Object parent;
        String str2 = (String) this.f38978a.invoke();
        if (str2 == null) {
            str2 = "monochromeWithWhiteIcon";
        }
        sje sjeVar = rrm.B;
        String str3 = xdk0Var.b;
        String str4 = xdk0Var.c;
        Integer num = xdk0Var.f;
        idk0 idk0Var = xdk0Var.d;
        kdk0 kdk0Var = xdk0Var.e;
        sek0 sek0Var = xdk0Var.f40698a;
        rek0 rek0Var = rek0.b;
        qek0 qek0Var = qek0.f28589a;
        pek0 pek0Var = pek0.f26859a;
        mek0.f21650a.getClass();
        switch (str2) {
            case "monochromeNoIcon":
                mek0Var = mek0.c;
                break;
            case "monochromeWithColloredIcon":
                mek0Var = mek0.d;
                break;
            case "colloredBackgroundNoIcon":
                mek0Var = mek0.e;
                break;
            case "monochromeWithWhiteIcon":
                mek0Var = mek0.b;
                break;
            default:
                mek0Var = mek0.b;
                break;
        }
        int iOrdinal = mek0Var.ordinal();
        char c = 2;
        char c2 = 3;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                lek0Var = dek0.c;
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    t9f.b();
                    return null;
                }
                if (Intrinsics.d(sek0Var, pek0Var)) {
                    lek0Var = zdk0.e;
                } else if (Intrinsics.d(sek0Var, qek0Var)) {
                    lek0Var = aek0.e;
                } else {
                    if (!Intrinsics.d(sek0Var, rek0Var)) {
                        t9f.b();
                        return null;
                    }
                    lek0Var = bek0.e;
                }
            } else if (Intrinsics.d(sek0Var, pek0Var)) {
                lek0Var = eek0.e;
            } else if (Intrinsics.d(sek0Var, qek0Var)) {
                lek0Var = fek0.e;
            } else {
                if (!Intrinsics.d(sek0Var, rek0Var)) {
                    t9f.b();
                    return null;
                }
                lek0Var = gek0.e;
            }
        } else if (Intrinsics.d(sek0Var, pek0Var)) {
            lek0Var = hek0.d;
        } else if (Intrinsics.d(sek0Var, qek0Var)) {
            lek0Var = iek0.d;
        } else {
            if (!Intrinsics.d(sek0Var, rek0Var)) {
                t9f.b();
                return null;
            }
            lek0Var = jek0.d;
        }
        str3.getClass();
        AtomicLong atomicLong = jmu0.f16783a;
        View view2 = view;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view2 instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view2;
            } else if (!(view2 instanceof FrameLayout)) {
                parent = view2.getParent();
                if (parent instanceof View) {
                    view2 = (View) parent;
                } else {
                    view2 = null;
                }
                if (view2 == null) {
                    viewGroup = viewGroup2;
                } else {
                    str3 = str3;
                    c = c;
                    idk0Var = idk0Var;
                    str4 = str4;
                    c2 = c2;
                    kdk0Var = kdk0Var;
                    num = num;
                }
            } else if (((FrameLayout) view2).getId() == 16908290) {
                viewGroup = (ViewGroup) view2;
            } else {
                viewGroup2 = (ViewGroup) view2;
                parent = view2.getParent();
                if (parent instanceof View) {
                    view2 = (View) parent;
                } else {
                    view2 = null;
                }
                if (view2 == null) {
                    viewGroup = viewGroup2;
                } else {
                    str3 = str3;
                    c = c;
                    idk0Var = idk0Var;
                    str4 = str4;
                    c2 = c2;
                    kdk0Var = kdk0Var;
                    num = num;
                }
            }
        }
        if (viewGroup == null) {
            jf4.o("No suitable parent found.");
            return null;
        }
        Context context = view.getContext();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(org.xbet.client1.R.dimen.size_448);
        View viewInflate = LayoutInflater.from(context).inflate(org.xbet.client1.R.layout.snackbar_view, viewGroup, false);
        viewInflate.getClass();
        DsSnackBarView dsSnackBarView = (DsSnackBarView) viewInflate;
        zkk zkkVar = dsSnackBarView.q;
        int i2 = str4.length() == 0 ? org.xbet.client1.R.style.TextStyle_Text_Regular_StaticWhite : org.xbet.client1.R.style.TextStyle_Text_Medium_StaticWhite;
        boolean z = num != null;
        Context context2 = dsSnackBarView.getContext();
        context2.getClass();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(lek0Var.a(), bqd0.n0);
        ConstraintLayout constraintLayout = (ConstraintLayout) zkkVar.c;
        TextView textView = (TextView) zkkVar.h;
        Integer num2 = num;
        AppCompatImageView appCompatImageView = (AppCompatImageView) zkkVar.b;
        TextView textView2 = (TextView) zkkVar.e;
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) zkkVar.i;
        idk0 idk0Var2 = idk0Var;
        kdk0 kdk0Var2 = kdk0Var;
        jmu0.j(constraintLayout, typedArrayObtainStyledAttributes.getColorStateList(1));
        if (typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            Drawable background = ((ConstraintLayout) zkkVar.c).getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.mutate();
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(org.xbet.client1.R.dimen.size_1);
                Context context3 = dsSnackBarView.getContext();
                context3.getClass();
                gradientDrawable.setStroke(dimensionPixelSize2, m5d.g(context3, org.xbet.client1.R.attr.uikitSeparator, 6));
            }
        }
        appCompatImageView2.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(5));
        cem0.n(i2, textView2);
        textView2.setTextColor(typedArrayObtainStyledAttributes.getColorStateList(12));
        zkkVar.d.setTextColor(typedArrayObtainStyledAttributes.getColorStateList(11));
        textView.setTextColor(typedArrayObtainStyledAttributes.getColorStateList(0));
        jmu0.j(appCompatImageView, typedArrayObtainStyledAttributes.getColorStateList(3));
        appCompatImageView.setColorFilter(typedArrayObtainStyledAttributes.getColor(4, 0));
        if (z || (lek0Var instanceof kek0)) {
            appCompatImageView2.setColorFilter(typedArrayObtainStyledAttributes.getColor(6, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        appCompatImageView2.setVisibility(lek0Var.f19908a ? 0 : 8);
        rrm rrmVar = new rrm(viewGroup, dsSnackBarView, dsSnackBarView);
        f46 f46Var = rrmVar.i;
        f46Var.setBackgroundColor(f46Var.getContext().getColor(org.xbet.client1.R.color.static_transparent));
        f46Var.setPadding(0, 0, 0, 0);
        qjj.W(rrm.B, null, null, new wib(rrmVar, null, (byte) 27), 3);
        qrm qrmVar = new qrm(context, dimensionPixelSize);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(f46Var, qrmVar);
        if (Build.VERSION.SDK_INT <= 29) {
            tl60.a(f46Var, new mfr(f46Var, viewGroup, rrmVar));
        }
        dsSnackBarView.setTitle(str3);
        if (str4.length() != 0) {
            dsSnackBarView.setSubtitle(str4);
        }
        if (num2 != null) {
            dsSnackBarView.setIcon(num2.intValue());
        }
        if (!idk0Var2.equals(ujn.Z)) {
            if (idk0Var2.equals(lwf.Y)) {
                dsSnackBarView.setCancelAction(new ntl(rrmVar, (byte) 9));
            } else {
                if (!(idk0Var2 instanceof hdk0)) {
                    t9f.b();
                    return null;
                }
                String str5 = ((hdk0) idk0Var2).f12874a;
                gnm gnmVar = new gnm(idk0Var2, rrmVar, (byte) 3);
                str5.getClass();
                int dimensionPixelSize3 = dsSnackBarView.getResources().getDimensionPixelSize(org.xbet.client1.R.dimen.space_8);
                TextView textView3 = (TextView) zkkVar.e;
                ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
                if (layoutParams == null) {
                    hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginEnd(dimensionPixelSize3);
                textView3.setLayoutParams(marginLayoutParams);
                textView.setVisibility(0);
                textView.setText(str5);
                textView.setOnClickListener(new q10(gnmVar, (byte) 19));
            }
        }
        if (!kdk0Var2.equals(jtv.x)) {
            if (kdk0Var2.equals(rv00.B)) {
                rrmVar.k = -2;
            } else if (kdk0Var2.equals(gqw0.D1)) {
                i = 0;
                rrmVar.k = 0;
            } else {
                i = 0;
                if (!kdk0Var2.equals(jdk0.f16332a)) {
                    t9f.b();
                    return null;
                }
                rrmVar.k = -1;
            }
            f46Var.setTranslationZ(sj3.X(20));
            str = xdk0Var.g;
            if (str == null) {
                wdk0Var = this;
            } else {
                if (StringsKt.W(str)) {
                    str = null;
                }
                if (str != null) {
                    wdk0Var = this;
                    wdk0Var.d.put(str, new WeakReference(rrmVar));
                } else {
                    wdk0Var = this;
                }
            }
            wq wqVar = new wq(new zbg0(xdk0Var, wdk0Var, rrmVar, function0), (byte) 1);
            arrayList = rrmVar.s;
            if (arrayList == null) {
                arrayList = new ArrayList();
                rrmVar.s = arrayList;
            }
            arrayList.add(wqVar);
            yc3VarP = hxm0.p(view);
            if (f46Var.isLaidOut() || f46Var.isLayoutRequested()) {
                f46Var.addOnLayoutChangeListener(new djl(yc3VarP, rrmVar, (byte) 3));
                return rrmVar;
            }
            mjv0.f21914a.getClass();
            njv0 njv0Var = ljv0.b;
            njv0Var.getClass();
            Rect rectC = njv0Var.a(yc3VarP).f18406a.c();
            xiv0 xiv0VarA = jgu0.a(f46Var);
            pfx pfxVarI = xiv0VarA != null ? xiv0VarA.f40966a.i(647) : null;
            int iWidth = (rectC.width() - (pfxVarI != null ? pfxVarI.f26926a : i)) - (pfxVarI != null ? pfxVarI.c : i);
            ViewGroup.LayoutParams layoutParams2 = f46Var.getLayoutParams();
            if (layoutParams2 == null) {
                hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.width = Math.min(f46Var.getResources().getDimensionPixelSize(org.xbet.client1.R.dimen.size_448), iWidth - (marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin));
            if (marginLayoutParams2 instanceof ble) {
                ((ble) marginLayoutParams2).c = 81;
            } else if (marginLayoutParams2 instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) marginLayoutParams2).gravity = 81;
            }
            f46Var.setLayoutParams(marginLayoutParams2);
            return rrmVar;
        }
        rrmVar.k = 4000;
        i = 0;
        f46Var.setTranslationZ(sj3.X(20));
        str = xdk0Var.g;
        if (str == null) {
            wdk0Var = this;
        } else {
            if (StringsKt.W(str)) {
                str = null;
            }
            if (str != null) {
                wdk0Var = this;
                wdk0Var.d.put(str, new WeakReference(rrmVar));
            } else {
                wdk0Var = this;
            }
        }
        wq wqVar2 = new wq(new zbg0(xdk0Var, wdk0Var, rrmVar, function0), (byte) 1);
        arrayList = rrmVar.s;
        if (arrayList == null) {
            arrayList = new ArrayList();
            rrmVar.s = arrayList;
        }
        arrayList.add(wqVar2);
        yc3VarP = hxm0.p(view);
        if (f46Var.isLaidOut()) {
        }
        f46Var.addOnLayoutChangeListener(new djl(yc3VarP, rrmVar, (byte) 3));
        return rrmVar;
    }

    public final void m(rrm rrmVar, float f) {
        f46 f46Var = rrmVar.i;
        if (f46Var.getHeight() != 0) {
            int[] iArr = new int[2];
            f46Var.getLocationInWindow(iArr);
            f46Var.setTranslationY(f46Var.getTranslationY() - ((f46Var.getHeight() + iArr[1]) - f));
            return;
        }
        f46Var.getClass();
        if (!f46Var.isLaidOut() || f46Var.isLayoutRequested()) {
            f46Var.addOnLayoutChangeListener(new vdk0(this, rrmVar, f));
        } else {
            m(rrmVar, f);
        }
    }

    public final void p(rrm rrmVar) {
        View rootView = rrmVar.i.getRootView();
        rootView.getViewTreeObserver().addOnGlobalLayoutListener(new ptl(rrmVar, rootView, this));
    }

    public /* synthetic */ wdk0(Function0 function0) {
        this(function0, new pdk0((byte) 1), new pdk0((byte) 2));
    }
}
