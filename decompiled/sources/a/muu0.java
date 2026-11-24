package a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class muu0 extends gms0 {
    public static final String[] k1 = {"android:visibility:visibility", "android:visibility:parent"};
    public int j1;

    public muu0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j1 = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x4d0.i);
        int iP = zsm0.p(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iP != 0) {
            Y(iP);
        }
    }

    public static void U(mns0 mns0Var) {
        View view = mns0Var.b;
        int visibility = view.getVisibility();
        HashMap map = mns0Var.f22105a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static ujf0 V(mns0 mns0Var, mns0 mns0Var2) {
        ujf0 ujf0Var = new ujf0();
        ujf0Var.f35776a = false;
        ujf0Var.b = false;
        if (mns0Var != null) {
            HashMap map = mns0Var.f22105a;
            if (map.containsKey("android:visibility:visibility")) {
                ujf0Var.c = ((Integer) map.get("android:visibility:visibility")).intValue();
                ujf0Var.e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                ujf0Var.c = -1;
                ujf0Var.e = null;
            }
        } else {
            ujf0Var.c = -1;
            ujf0Var.e = null;
        }
        if (mns0Var2 != null) {
            HashMap map2 = mns0Var2.f22105a;
            if (map2.containsKey("android:visibility:visibility")) {
                ujf0Var.d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                ujf0Var.f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                ujf0Var.d = -1;
                ujf0Var.f = null;
            }
        } else {
            ujf0Var.d = -1;
            ujf0Var.f = null;
        }
        if (mns0Var != null && mns0Var2 != null) {
            int i = ujf0Var.c;
            int i2 = ujf0Var.d;
            if (i != i2 || ((ViewGroup) ujf0Var.e) != ((ViewGroup) ujf0Var.f)) {
                if (i != i2) {
                    if (i == 0) {
                        ujf0Var.b = false;
                        ujf0Var.f35776a = true;
                        return ujf0Var;
                    }
                    if (i2 == 0) {
                        ujf0Var.b = true;
                        ujf0Var.f35776a = true;
                        return ujf0Var;
                    }
                } else {
                    if (((ViewGroup) ujf0Var.f) == null) {
                        ujf0Var.b = false;
                        ujf0Var.f35776a = true;
                        return ujf0Var;
                    }
                    if (((ViewGroup) ujf0Var.e) == null) {
                        ujf0Var.b = true;
                        ujf0Var.f35776a = true;
                        return ujf0Var;
                    }
                }
            }
        } else {
            if (mns0Var == null && ujf0Var.d == 0) {
                ujf0Var.b = true;
                ujf0Var.f35776a = true;
                return ujf0Var;
            }
            if (mns0Var2 == null && ujf0Var.c == 0) {
                ujf0Var.b = false;
                ujf0Var.f35776a = true;
            }
        }
        return ujf0Var;
    }

    @Override // a.gms0
    public final boolean C(mns0 mns0Var, mns0 mns0Var2) {
        if (mns0Var == null && mns0Var2 == null) {
            return false;
        }
        if (mns0Var != null && mns0Var2 != null && mns0Var2.f22105a.containsKey("android:visibility:visibility") != mns0Var.f22105a.containsKey("android:visibility:visibility")) {
            return false;
        }
        ujf0 ujf0VarV = V(mns0Var, mns0Var2);
        if (ujf0VarV.f35776a) {
            return ujf0VarV.c == 0 || ujf0VarV.d == 0;
        }
        return false;
    }

    public abstract ObjectAnimator W(ViewGroup viewGroup, View view, mns0 mns0Var, mns0 mns0Var2);

    public abstract ObjectAnimator X(ViewGroup viewGroup, View view, mns0 mns0Var, mns0 mns0Var2);

    public final void Y(int i) {
        if ((i & (-4)) == 0) {
            this.j1 = i;
        } else {
            jf4.o("Only MODE_IN and MODE_OUT flags are allowed");
        }
    }

    @Override // a.gms0
    public void f(mns0 mns0Var) {
        U(mns0Var);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:58:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0130  */
    /* JADX WARN: Code duplicated, block: B:60:0x0138  */
    /* JADX WARN: Code duplicated, block: B:61:0x0155  */
    /* JADX WARN: Code duplicated, block: B:64:0x0171 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:78:0x0206  */
    /* JADX WARN: Code duplicated, block: B:81:0x020d  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (V(v(r5, false), A(r5, false)).f35776a != false) goto L9;
     */
    @Override // a.gms0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator o(android.view.ViewGroup r24, a.mns0 r25, a.mns0 r26) {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.muu0.o(android.view.ViewGroup, a.mns0, a.mns0):android.animation.Animator");
    }

    @Override // a.gms0
    public final String[] z() {
        return k1;
    }

    public muu0() {
        this.j1 = 3;
    }
}
