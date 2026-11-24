package a;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class gms0 implements Cloneable {
    public static final Animator[] f1 = new Animator[0];
    public static final int[] g1 = {2, 1, 3, 4};
    public static final sls0 h1 = new sls0();
    public static final ThreadLocal i1 = new ThreadLocal();
    public saj A;
    public f290 B;
    public long Y;
    public long Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11555a;
    public long b;
    public long c;
    public TimeInterpolator d;
    public final ArrayList e;
    public final ArrayList f;
    public ArrayList g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public n660 l;
    public n660 m;
    public bns0 n;
    public final int[] o;
    public ArrayList p;
    public ArrayList q;
    public dms0[] r;
    public final ArrayList s;
    public Animator[] t;
    public int u;
    public boolean v;
    public boolean w;
    public gms0 x;
    public ArrayList y;
    public ArrayList z;

    public gms0(Context context, AttributeSet attributeSet) {
        this.f11555a = getClass().getName();
        this.b = -1L;
        this.c = -1L;
        this.d = null;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = new n660((byte) 28);
        this.m = new n660((byte) 28);
        this.n = null;
        int[] iArr = g1;
        this.o = iArr;
        this.s = new ArrayList();
        this.t = f1;
        this.u = 0;
        this.v = false;
        this.w = false;
        this.x = null;
        this.y = null;
        this.z = new ArrayList();
        this.B = h1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x4d0.g);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jP = zsm0.p(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jP >= 0) {
            M(jP);
        }
        long j = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startDelay") != null ? typedArrayObtainStyledAttributes.getInt(2, -1) : -1;
        if (j > 0) {
            R(j);
        }
        int resourceId = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? typedArrayObtainStyledAttributes.getResourceId(0, 0) : 0;
        if (resourceId > 0) {
            O(AnimationUtils.loadInterpolator(context, resourceId));
        }
        String strQ = zsm0.q(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strQ != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(strQ, Separators.COMMA);
            int[] iArr2 = new int[stringTokenizer.countTokens()];
            int i = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String strTrim = stringTokenizer.nextToken().trim();
                if (ParameterNames.ID.equalsIgnoreCase(strTrim)) {
                    iArr2[i] = 3;
                } else if ("instance".equalsIgnoreCase(strTrim)) {
                    iArr2[i] = 1;
                } else if ("name".equalsIgnoreCase(strTrim)) {
                    iArr2[i] = 2;
                } else if ("itemId".equalsIgnoreCase(strTrim)) {
                    iArr2[i] = 4;
                } else {
                    if (!strTrim.isEmpty()) {
                        throw new InflateException(kng0.l("Unknown match type in matchOrder: '", strTrim, Separators.QUOTE));
                    }
                    int[] iArr3 = new int[iArr2.length - 1];
                    System.arraycopy(iArr2, 0, iArr3, 0, i);
                    i--;
                    iArr2 = iArr3;
                }
                i++;
            }
            if (iArr2.length == 0) {
                this.o = iArr;
            } else {
                for (int i2 = 0; i2 < iArr2.length; i2++) {
                    int i3 = iArr2[i2];
                    if (i3 < 1 || i3 > 4) {
                        jf4.o("matches contains invalid value");
                        throw null;
                    }
                    for (int i4 = 0; i4 < i2; i4++) {
                        if (iArr2[i4] == i3) {
                            jf4.o("matches contains a duplicate value");
                            throw null;
                        }
                    }
                }
                this.o = (int[]) iArr2.clone();
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static boolean E(mns0 mns0Var, mns0 mns0Var2, String str) {
        Object obj = mns0Var.f22105a.get(str);
        Object obj2 = mns0Var2.f22105a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void e(n660 n660Var, View view, mns0 mns0Var) {
        gx3 gx3Var = (gx3) n660Var.f22981a;
        gx3 gx3Var2 = (gx3) n660Var.d;
        SparseArray sparseArray = (SparseArray) n660Var.b;
        u710 u710Var = (u710) n660Var.c;
        gx3Var.put(view, mns0Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = rgu0.f30456a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (gx3Var2.containsKey(transitionName)) {
                gx3Var2.put(transitionName, null);
            } else {
                gx3Var2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (u710Var.c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    u710Var.f(view, itemIdAtPosition);
                    return;
                }
                View view2 = (View) u710Var.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    u710Var.f(null, itemIdAtPosition);
                }
            }
        }
    }

    public static gx3 x() {
        ThreadLocal threadLocal = i1;
        gx3 gx3Var = (gx3) threadLocal.get();
        if (gx3Var != null) {
            return gx3Var;
        }
        gx3 gx3Var2 = new gx3(0);
        threadLocal.set(gx3Var2);
        return gx3Var2;
    }

    public final mns0 A(View view, boolean z) {
        bns0 bns0Var = this.n;
        if (bns0Var != null) {
            return bns0Var.A(view, z);
        }
        return (mns0) ((gx3) (z ? this.l : this.m).f22981a).get(view);
    }

    public boolean B() {
        return !this.s.isEmpty();
    }

    public boolean C(mns0 mns0Var, mns0 mns0Var2) {
        if (mns0Var != null && mns0Var2 != null) {
            String[] strArrZ = z();
            if (strArrZ != null) {
                for (String str : strArrZ) {
                    if (E(mns0Var, mns0Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = mns0Var.f22105a.keySet().iterator();
                while (it.hasNext()) {
                    if (E(mns0Var, mns0Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b0 A[LOOP:1: B:48:0x0099->B:53:0x00b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public final boolean D(View view) {
        int size;
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int id = view.getId();
        ArrayList arrayList4 = this.i;
        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
            ArrayList arrayList5 = this.j;
            if (arrayList5 != null) {
                int size2 = arrayList5.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (!((Class) this.j.get(i2)).isInstance(view)) {
                    }
                }
                if (this.k != null) {
                    WeakHashMap weakHashMap = rgu0.f30456a;
                    if (view.getTransitionName() != null || !this.k.contains(view.getTransitionName())) {
                        ArrayList arrayList6 = this.e;
                        size = arrayList6.size();
                        ArrayList arrayList7 = this.f;
                        if ((size != 0 && arrayList7.size() == 0 && (((arrayList2 = this.h) == null || arrayList2.isEmpty()) && ((arrayList3 = this.g) == null || arrayList3.isEmpty()))) || arrayList6.contains(Integer.valueOf(id)) || arrayList7.contains(view)) {
                            return true;
                        }
                        arrayList = this.g;
                        if (arrayList != null) {
                            WeakHashMap weakHashMap2 = rgu0.f30456a;
                            if (arrayList.contains(view.getTransitionName())) {
                                return true;
                            }
                        }
                        if (this.h != null) {
                            for (i = 0; i < this.h.size(); i++) {
                                if (((Class) this.h.get(i)).isInstance(view)) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    ArrayList arrayList8 = this.e;
                    size = arrayList8.size();
                    ArrayList arrayList9 = this.f;
                    if (size != 0) {
                    }
                    arrayList = this.g;
                    if (arrayList != null) {
                        WeakHashMap weakHashMap3 = rgu0.f30456a;
                        if (arrayList.contains(view.getTransitionName())) {
                            return true;
                        }
                    }
                    if (this.h != null) {
                        while (i < this.h.size()) {
                            if (((Class) this.h.get(i)).isInstance(view)) {
                                return true;
                            }
                        }
                    }
                }
            } else if (this.k != null) {
                WeakHashMap weakHashMap4 = rgu0.f30456a;
                if (view.getTransitionName() != null) {
                    ArrayList arrayList10 = this.e;
                    size = arrayList10.size();
                    ArrayList arrayList11 = this.f;
                    if (size != 0) {
                    }
                    arrayList = this.g;
                    if (arrayList != null) {
                        WeakHashMap weakHashMap5 = rgu0.f30456a;
                        if (arrayList.contains(view.getTransitionName())) {
                            return true;
                        }
                    }
                    if (this.h != null) {
                        while (i < this.h.size()) {
                            if (((Class) this.h.get(i)).isInstance(view)) {
                                return true;
                            }
                        }
                    }
                } else {
                    ArrayList arrayList12 = this.e;
                    size = arrayList12.size();
                    ArrayList arrayList13 = this.f;
                    if (size != 0) {
                    }
                    arrayList = this.g;
                    if (arrayList != null) {
                        WeakHashMap weakHashMap6 = rgu0.f30456a;
                        if (arrayList.contains(view.getTransitionName())) {
                            return true;
                        }
                    }
                    if (this.h != null) {
                        while (i < this.h.size()) {
                            if (((Class) this.h.get(i)).isInstance(view)) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                ArrayList arrayList14 = this.e;
                size = arrayList14.size();
                ArrayList arrayList15 = this.f;
                if (size != 0) {
                }
                arrayList = this.g;
                if (arrayList != null) {
                    WeakHashMap weakHashMap7 = rgu0.f30456a;
                    if (arrayList.contains(view.getTransitionName())) {
                        return true;
                    }
                }
                if (this.h != null) {
                    while (i < this.h.size()) {
                        if (((Class) this.h.get(i)).isInstance(view)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void F(gms0 gms0Var, v4i0 v4i0Var, boolean z) {
        gms0 gms0Var2 = this.x;
        if (gms0Var2 != null) {
            gms0Var2.F(gms0Var, v4i0Var, z);
        }
        ArrayList arrayList = this.y;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.y.size();
        dms0[] dms0VarArr = this.r;
        if (dms0VarArr == null) {
            dms0VarArr = new dms0[size];
        }
        this.r = null;
        dms0[] dms0VarArr2 = (dms0[]) this.y.toArray(dms0VarArr);
        for (int i = 0; i < size; i++) {
            dms0 dms0Var = dms0VarArr2[i];
            switch (v4i0Var.f36781a) {
                case 16:
                    dms0Var.f(gms0Var);
                    break;
                case 17:
                    dms0Var.e(gms0Var);
                    break;
                case 18:
                    dms0Var.g(gms0Var);
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    dms0Var.a();
                    break;
                default:
                    dms0Var.d();
                    break;
            }
            dms0VarArr2[i] = null;
        }
        this.r = dms0VarArr2;
    }

    public void G(ViewGroup viewGroup) {
        if (this.w) {
            return;
        }
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.t);
        this.t = f1;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.t = animatorArr;
        F(this, v4i0.e, false);
        this.v = true;
    }

    public void H() {
        gx3 gx3VarX = x();
        this.Y = 0L;
        int i = 0;
        while (true) {
            int size = this.z.size();
            ArrayList arrayList = this.z;
            if (i >= size) {
                arrayList.clear();
                return;
            }
            Animator animator = (Animator) arrayList.get(i);
            tls0 tls0Var = (tls0) gx3VarX.get(animator);
            if (animator != null && tls0Var != null) {
                Animator animator2 = tls0Var.f;
                long j = this.c;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.b;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.d;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.s.add(animator);
                this.Y = Math.max(this.Y, xls0.a(animator));
            }
            i++;
        }
    }

    public gms0 I(dms0 dms0Var) {
        gms0 gms0Var;
        ArrayList arrayList = this.y;
        if (arrayList != null) {
            if (!arrayList.remove(dms0Var) && (gms0Var = this.x) != null) {
                gms0Var.I(dms0Var);
            }
            if (this.y.size() == 0) {
                this.y = null;
            }
        }
        return this;
    }

    public void J(View view) {
        if (this.v) {
            if (!this.w) {
                ArrayList arrayList = this.s;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.t);
                this.t = f1;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.t = animatorArr;
                F(this, v4i0.f, false);
            }
            this.v = false;
        }
    }

    public void K() {
        S();
        gx3 gx3VarX = x();
        for (Animator animator : this.z) {
            if (gx3VarX.containsKey(animator)) {
                S();
                if (animator != null) {
                    animator.addListener(new ywv(this, gx3VarX, (byte) 2));
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new xh(this, (byte) 12));
                    animator.start();
                }
            }
        }
        this.z.clear();
        r();
    }

    public void L(long j, long j2) {
        long j3 = this.Y;
        int i = 0;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.w = false;
            F(this, v4i0.b, z);
        }
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.t);
        this.t = f1;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            xls0.b(animator, Math.min(Math.max(0L, j), xls0.a(animator)));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.t = animatorArr;
        if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j4) {
            this.w = true;
        }
        F(this, v4i0.c, z);
    }

    public void M(long j) {
        this.c = j;
    }

    public void O(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void P(f290 f290Var) {
        if (f290Var == null) {
            this.B = h1;
        } else {
            this.B = f290Var;
        }
    }

    public void Q(saj sajVar) {
        this.A = sajVar;
    }

    public void R(long j) {
        this.b = j;
    }

    public final void S() {
        if (this.u == 0) {
            F(this, v4i0.b, false);
            this.w = false;
        }
        this.u++;
    }

    public String T(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append(Separators.AT);
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.c != -1) {
            sb.append("dur(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.b != -1) {
            sb.append("dly(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(Separators.RPAREN);
        }
        return sb.toString();
    }

    public void a(dms0 dms0Var) {
        ArrayList arrayList = this.y;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.y = arrayList;
        }
        arrayList.add(dms0Var);
    }

    public void b(int i) {
        if (i != 0) {
            this.e.add(Integer.valueOf(i));
        }
    }

    public void c(Class cls) {
        ArrayList arrayList = this.h;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.h = arrayList;
        }
        arrayList.add(cls);
    }

    public void cancel() {
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.t);
        this.t = f1;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.t = animatorArr;
        F(this, v4i0.d, false);
    }

    public void d(String str) {
        ArrayList arrayList = this.g;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.g = arrayList;
        }
        arrayList.add(str);
    }

    public void f(mns0 mns0Var) {
        bpb.U(mns0Var, false);
    }

    public final void g(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.j;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    if (((Class) this.j.get(i)).isInstance(view)) {
                        return;
                    }
                }
            }
            if (view.getParent() instanceof ViewGroup) {
                mns0 mns0Var = new mns0(view);
                if (z) {
                    i(mns0Var);
                } else {
                    f(mns0Var);
                }
                mns0Var.c.add(this);
                h(mns0Var);
                if (z) {
                    e(this.l, view, mns0Var);
                } else {
                    e(this.m, view, mns0Var);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    g(viewGroup.getChildAt(i2), z);
                }
            }
        }
    }

    public void h(mns0 mns0Var) {
        if (this.A != null) {
            HashMap map = mns0Var.f22105a;
            if (map.isEmpty()) {
                return;
            }
            this.A.getClass();
            String[] strArr = saj.r;
            for (int i = 0; i < 2; i++) {
                if (!map.containsKey(strArr[i])) {
                    this.A.getClass();
                    View view = mns0Var.b;
                    Integer numValueOf = (Integer) map.get("android:visibility:visibility");
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(view.getVisibility());
                    }
                    map.put("android:visibilityPropagation:visibility", numValueOf);
                    int[] iArr = {iRound, 0};
                    view.getLocationOnScreen(iArr);
                    int iRound = Math.round(view.getTranslationX()) + iArr[0];
                    iArr[0] = (view.getWidth() / 2) + iRound;
                    int iRound2 = Math.round(view.getTranslationY()) + iArr[1];
                    iArr[1] = iRound2;
                    iArr[1] = (view.getHeight() / 2) + iRound2;
                    map.put("android:visibilityPropagation:center", iArr);
                    return;
                }
            }
        }
    }

    public void i(mns0 mns0Var) {
        bpb.U(mns0Var, true);
    }

    public final void j(ViewGroup viewGroup, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        m(z);
        ArrayList arrayList3 = this.e;
        int size = arrayList3.size();
        ArrayList arrayList4 = this.f;
        if ((size <= 0 && arrayList4.size() <= 0) || (((arrayList = this.g) != null && !arrayList.isEmpty()) || ((arrayList2 = this.h) != null && !arrayList2.isEmpty()))) {
            g(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList3.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList3.get(i)).intValue());
            if (viewFindViewById != null) {
                mns0 mns0Var = new mns0(viewFindViewById);
                if (z) {
                    i(mns0Var);
                } else {
                    f(mns0Var);
                }
                mns0Var.c.add(this);
                h(mns0Var);
                if (z) {
                    e(this.l, viewFindViewById, mns0Var);
                } else {
                    e(this.m, viewFindViewById, mns0Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList4.size(); i2++) {
            View view = (View) arrayList4.get(i2);
            mns0 mns0Var2 = new mns0(view);
            if (z) {
                i(mns0Var2);
            } else {
                f(mns0Var2);
            }
            mns0Var2.c.add(this);
            h(mns0Var2);
            if (z) {
                e(this.l, view, mns0Var2);
            } else {
                e(this.m, view, mns0Var2);
            }
        }
    }

    public final void m(boolean z) {
        if (z) {
            ((gx3) this.l.f22981a).clear();
            ((SparseArray) this.l.b).clear();
            ((u710) this.l.c).a();
        } else {
            ((gx3) this.m.f22981a).clear();
            ((SparseArray) this.m.b).clear();
            ((u710) this.m.c).a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public gms0 clone() {
        try {
            gms0 gms0Var = (gms0) super.clone();
            gms0Var.z = new ArrayList();
            gms0Var.l = new n660((byte) 28);
            gms0Var.m = new n660((byte) 28);
            gms0Var.p = null;
            gms0Var.q = null;
            gms0Var.x = this;
            gms0Var.y = null;
            return gms0Var;
        } catch (CloneNotSupportedException e) {
            ohq.p(e);
            return null;
        }
    }

    public Animator o(ViewGroup viewGroup, mns0 mns0Var, mns0 mns0Var2) {
        return null;
    }

    public void p(ViewGroup viewGroup, n660 n660Var, n660 n660Var2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorO;
        int i;
        View view;
        mns0 mns0Var;
        Animator animator;
        mns0 mns0Var2;
        gx3 gx3VarX = x();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        w().getClass();
        long jMin = Long.MAX_VALUE;
        int i2 = 0;
        while (i2 < size) {
            mns0 mns0Var3 = (mns0) arrayList.get(i2);
            mns0 mns0Var4 = (mns0) arrayList2.get(i2);
            if (mns0Var3 != null && !mns0Var3.c.contains(this)) {
                mns0Var3 = null;
            }
            if (mns0Var4 != null && !mns0Var4.c.contains(this)) {
                mns0Var4 = null;
            }
            if (!(mns0Var3 == null && mns0Var4 == null) && ((mns0Var3 == null || mns0Var4 == null || C(mns0Var3, mns0Var4)) && (animatorO = o(viewGroup, mns0Var3, mns0Var4)) != null)) {
                String str = this.f11555a;
                if (mns0Var4 != null) {
                    view = mns0Var4.b;
                    String[] strArrZ = z();
                    if (strArrZ != null && strArrZ.length > 0) {
                        mns0Var2 = new mns0(view);
                        i = i2;
                        mns0 mns0Var5 = (mns0) ((gx3) n660Var2.f22981a).get(view);
                        if (mns0Var5 != null) {
                            int i3 = 0;
                            while (i3 < strArrZ.length) {
                                String str2 = strArrZ[i3];
                                mns0Var2.f22105a.put(str2, mns0Var5.f22105a.get(str2));
                                i3++;
                                mns0Var5 = mns0Var5;
                            }
                        }
                        int i4 = gx3VarX.c;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= i4) {
                                animator = animatorO;
                                break;
                            }
                            tls0 tls0Var = (tls0) gx3VarX.get((Animator) gx3VarX.f(i5));
                            if (tls0Var.c != null && tls0Var.f34163a == view && tls0Var.b.equals(str) && tls0Var.c.equals(mns0Var2)) {
                                animator = null;
                                break;
                            }
                            i5++;
                        }
                    } else {
                        i = i2;
                        animator = animatorO;
                        mns0Var2 = null;
                    }
                    animatorO = animator;
                    mns0Var = mns0Var2;
                } else {
                    i = i2;
                    view = mns0Var3.b;
                    mns0Var = null;
                }
                if (animatorO != null) {
                    saj sajVar = this.A;
                    if (sajVar != null) {
                        long jW = sajVar.W(viewGroup, this, mns0Var3, mns0Var4);
                        sparseIntArray.put(this.z.size(), (int) jW);
                        jMin = Math.min(jW, jMin);
                    }
                    WindowId windowId = viewGroup.getWindowId();
                    tls0 tls0Var2 = new tls0();
                    tls0Var2.f34163a = view;
                    tls0Var2.b = str;
                    tls0Var2.c = mns0Var;
                    tls0Var2.d = windowId;
                    tls0Var2.e = this;
                    tls0Var2.f = animatorO;
                    gx3VarX.put(animatorO, tls0Var2);
                    this.z.add(animatorO);
                }
            } else {
                size = size;
                i = i2;
            }
            i2 = i + 1;
            size = size;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                tls0 tls0Var3 = (tls0) gx3VarX.get((Animator) this.z.get(sparseIntArray.keyAt(i6)));
                tls0Var3.f.setStartDelay(tls0Var3.f.getStartDelay() + (((long) sparseIntArray.valueAt(i6)) - jMin));
            }
        }
    }

    public final void r() {
        int i = this.u - 1;
        this.u = i;
        if (i == 0) {
            F(this, v4i0.c, false);
            for (int i2 = 0; i2 < ((u710) this.l.c).h(); i2++) {
                View view = (View) ((u710) this.l.c).i(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((u710) this.m.c).h(); i3++) {
                View view2 = (View) ((u710) this.m.c).i(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.w = true;
        }
    }

    public void s(int i) {
        ArrayList arrayListO = this.i;
        if (i > 0) {
            arrayListO = rsm0.o(arrayListO, Integer.valueOf(i));
        }
        this.i = arrayListO;
    }

    public void t(Class cls) {
        this.j = rsm0.o(this.j, cls);
    }

    public final String toString() {
        return T("");
    }

    public void u(String str) {
        this.k = rsm0.o(this.k, str);
    }

    public final mns0 v(View view, boolean z) {
        bns0 bns0Var = this.n;
        if (bns0Var != null) {
            return bns0Var.v(view, z);
        }
        ArrayList arrayList = z ? this.p : this.q;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            mns0 mns0Var = (mns0) arrayList.get(i);
            if (mns0Var == null) {
                return null;
            }
            if (mns0Var.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (mns0) (z ? this.q : this.p).get(i);
        }
        return null;
    }

    public final gms0 w() {
        bns0 bns0Var = this.n;
        return bns0Var != null ? bns0Var.w() : this;
    }

    public String[] z() {
        return null;
    }

    public void N(vsm0 vsm0Var) {
    }

    public gms0() {
        this.f11555a = getClass().getName();
        this.b = -1L;
        this.c = -1L;
        this.d = null;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = new n660((byte) 28);
        this.m = new n660((byte) 28);
        this.n = null;
        this.o = g1;
        this.s = new ArrayList();
        this.t = f1;
        this.u = 0;
        this.v = false;
        this.w = false;
        this.x = null;
        this.y = null;
        this.z = new ArrayList();
        this.B = h1;
    }
}
