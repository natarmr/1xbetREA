package a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class nsb extends gms0 {
    public static final String[] m1 = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    public static final uob n1 = new uob(float[].class, "nonTranslations", (byte) 6);
    public static final uob o1 = new uob(PointF.class, "translations", (byte) 7);
    public static final boolean p1 = true;
    public boolean j1;
    public boolean k1;
    public Matrix l1;

    public final void U(mns0 mns0Var) {
        View view = mns0Var.b;
        HashMap map = mns0Var.f22105a;
        if (view.getVisibility() == 8) {
            return;
        }
        map.put("android:changeTransform:parent", view.getParent());
        map.put("android:changeTransform:transforms", new msb(view));
        Matrix matrix = view.getMatrix();
        map.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.k1) {
            Matrix matrix2 = new Matrix();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            bmu0.f2855a.K(viewGroup, matrix2);
            matrix2.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
            map.put("android:changeTransform:parentMatrix", matrix2);
            map.put("android:changeTransform:intermediateMatrix", view.getTag(R.id.transition_transform));
            map.put("android:changeTransform:intermediateParentMatrix", view.getTag(R.id.parent_matrix));
        }
    }

    @Override // a.gms0
    public final void f(mns0 mns0Var) {
        U(mns0Var);
    }

    @Override // a.gms0
    public final void i(mns0 mns0Var) {
        U(mns0Var);
        View view = mns0Var.b;
        if (p1) {
            return;
        }
        ((ViewGroup) view.getParent()).startViewTransition(view);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // a.gms0
    public final Animator o(ViewGroup viewGroup, mns0 mns0Var, mns0 mns0Var2) {
        int i;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder;
        Object obj;
        ObjectAnimator objectAnimator;
        int i2;
        x6v x6vVar;
        boolean z;
        x6v x6vVar2;
        w6v w6vVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        ObjectAnimator objectAnimator2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int iIntValue;
        w6v w6vVar2;
        u6v u6vVar;
        ro roVar;
        mns0 mns0VarV;
        if (mns0Var == null) {
            return null;
        }
        View view = mns0Var.b;
        HashMap map = mns0Var.f22105a;
        if (mns0Var2 == null) {
            return null;
        }
        View view2 = mns0Var2.b;
        HashMap map2 = mns0Var2.f22105a;
        if (!map.containsKey("android:changeTransform:parent") || !map2.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeTransform:parent");
        View view3 = (ViewGroup) map2.get("android:changeTransform:parent");
        boolean z3 = this.k1 && (!(D(viewGroup2) && D(view3)) ? viewGroup2 == view3 : !((mns0VarV = v(viewGroup2, true)) == null || view3 != mns0VarV.b));
        Matrix matrix = (Matrix) map.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            map.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) map.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            map.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z3) {
            Matrix matrix3 = (Matrix) map2.get("android:changeTransform:parentMatrix");
            view2.setTag(R.id.parent_matrix, matrix3);
            Matrix matrix4 = this.l1;
            matrix4.reset();
            matrix3.invert(matrix4);
            Matrix matrix5 = (Matrix) map.get("android:changeTransform:matrix");
            if (matrix5 == null) {
                matrix5 = new Matrix();
                map.put("android:changeTransform:matrix", matrix5);
            }
            matrix5.postConcat((Matrix) map.get("android:changeTransform:parentMatrix"));
            matrix5.postConcat(matrix4);
        }
        Matrix matrix6 = (Matrix) map.get("android:changeTransform:matrix");
        Matrix matrix7 = (Matrix) map2.get("android:changeTransform:matrix");
        if (matrix6 == null) {
            matrix6 = xi30.f40924a;
        }
        if (matrix7 == null) {
            matrix7 = xi30.f40924a;
        }
        if (matrix6.equals(matrix7)) {
            obj = "android:changeTransform:parentMatrix";
            objectAnimatorOfPropertyValuesHolder = null;
            i = 2;
        } else {
            msb msbVar = (msb) map2.get("android:changeTransform:transforms");
            view2.setTranslationX(0.0f);
            view2.setTranslationY(0.0f);
            WeakHashMap weakHashMap = rgu0.f30456a;
            view2.setTranslationZ(0.0f);
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            view2.setRotationX(0.0f);
            view2.setRotationY(0.0f);
            view2.setRotation(0.0f);
            float[] fArr = new float[9];
            matrix6.getValues(fArr);
            float[] fArr2 = new float[9];
            matrix7.getValues(fArr2);
            lsb lsbVar = new lsb(view2, fArr);
            i = 2;
            zkq zkqVar = new zkq((byte) 0);
            zkqVar.b = new float[9];
            objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(lsbVar, PropertyValuesHolder.ofObject(n1, zkqVar, fArr, fArr2), w0d0.a(o1, this.B.a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
            obj = "android:changeTransform:parentMatrix";
            view2 = view2;
            ksb ksbVar = new ksb(view2, msbVar, lsbVar, matrix7, z3, this.j1);
            objectAnimatorOfPropertyValuesHolder.addListener(ksbVar);
            objectAnimatorOfPropertyValuesHolder.addPauseListener(ksbVar);
        }
        boolean z4 = p1;
        if (z3 && objectAnimatorOfPropertyValuesHolder != null && this.j1) {
            Matrix matrix8 = new Matrix((Matrix) map2.get(obj));
            bmu0.f2855a.L(viewGroup, matrix8);
            if (Build.VERSION.SDK_INT == 28) {
                if (!ro.e) {
                    try {
                        ro.b();
                        Method declaredMethod = ro.b.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
                        ro.d = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e) {
                        Log.i("GhostViewApi21", "Failed to retrieve addGhost method", e);
                    }
                    ro.e = true;
                }
                Method method = ro.d;
                if (method != null) {
                    try {
                        roVar = new ro((View) method.invoke(null, view2, viewGroup, matrix8));
                    } catch (IllegalAccessException unused) {
                        roVar = null;
                    } catch (InvocationTargetException e2) {
                        ohq.p(e2.getCause());
                        return null;
                    }
                } else {
                    roVar = null;
                }
                objectAnimator = objectAnimatorOfPropertyValuesHolder;
                z = z4;
                u6vVar = roVar;
            } else {
                int i6 = x6v.g;
                if (!(view2.getParent() instanceof ViewGroup)) {
                    jf4.o("Ghosted views must be parented by a ViewGroup");
                    return null;
                }
                int i7 = w6v.c;
                w6v w6vVar3 = (w6v) viewGroup.getTag(R.id.ghost_view_holder);
                x6v x6vVar3 = (x6v) view2.getTag(R.id.ghost_view);
                if (x6vVar3 == null || (w6vVar2 = (w6v) x6vVar3.getParent()) == w6vVar3) {
                    i2 = 0;
                    x6vVar = x6vVar3;
                } else {
                    i2 = x6vVar3.d;
                    w6vVar2.removeView(x6vVar3);
                    x6vVar = null;
                }
                if (x6vVar == null) {
                    x6v x6vVar4 = new x6v(view2);
                    x6vVar4.e = matrix8;
                    if (w6vVar3 == null) {
                        w6v w6vVar4 = new w6v(viewGroup.getContext());
                        w6vVar4.setClipChildren(false);
                        w6vVar4.f38644a = viewGroup;
                        viewGroup.setTag(R.id.ghost_view_holder, w6vVar4);
                        viewGroup.getOverlay().add(w6vVar4);
                        w6vVar4.b = true;
                        w6vVar = w6vVar4;
                    } else {
                        ViewGroup viewGroup3 = w6vVar3.f38644a;
                        if (!w6vVar3.b) {
                            jf4.n("This GhostViewHolder is detached!");
                            return null;
                        }
                        viewGroup3.getOverlay().remove(w6vVar3);
                        viewGroup3.getOverlay().add(w6vVar3);
                        w6vVar = w6vVar3;
                    }
                    bmu0.a(w6vVar, w6vVar.getLeft(), w6vVar.getTop(), viewGroup.getWidth() + w6vVar.getLeft(), viewGroup.getHeight() + w6vVar.getTop());
                    bmu0.a(x6vVar4, x6vVar4.getLeft(), x6vVar4.getTop(), viewGroup.getWidth() + x6vVar4.getLeft(), viewGroup.getHeight() + x6vVar4.getTop());
                    ArrayList arrayList3 = new ArrayList();
                    w6v.a(x6vVar4.c, arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    int childCount = w6vVar.getChildCount() - 1;
                    int i8 = 0;
                    while (i8 <= childCount) {
                        int i9 = (i8 + childCount) / 2;
                        w6v.a(((x6v) w6vVar.getChildAt(i9)).c, arrayList4);
                        if (arrayList3.isEmpty() || arrayList4.isEmpty()) {
                            arrayList = arrayList3;
                            arrayList2 = arrayList4;
                            objectAnimator2 = objectAnimatorOfPropertyValuesHolder;
                            z2 = z4;
                        } else {
                            objectAnimator2 = objectAnimatorOfPropertyValuesHolder;
                            z2 = z4;
                            if (arrayList3.get(0) != arrayList4.get(0)) {
                                arrayList = arrayList3;
                            } else {
                                int iMin = Math.min(arrayList3.size(), arrayList4.size());
                                int i10 = 1;
                                while (true) {
                                    if (i10 < iMin) {
                                        View view4 = (View) arrayList3.get(i10);
                                        arrayList = arrayList3;
                                        View view5 = (View) arrayList4.get(i10);
                                        if (view4 != view5) {
                                            ViewGroup viewGroup4 = (ViewGroup) view4.getParent();
                                            int childCount2 = viewGroup4.getChildCount();
                                            if (v6v.a(view4) == v6v.a(view5)) {
                                                arrayList2 = arrayList4;
                                                int i11 = 0;
                                                while (true) {
                                                    if (i11 < childCount2) {
                                                        int i12 = childCount2;
                                                        i5 = childCount;
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            iIntValue = khu0.a(viewGroup4, i11);
                                                            i11 = i11;
                                                            i4 = i;
                                                        } else {
                                                            if (!v2n0.c) {
                                                                try {
                                                                    Class[] clsArr = new Class[i];
                                                                    Class cls = Integer.TYPE;
                                                                    clsArr[0] = cls;
                                                                    clsArr[1] = cls;
                                                                    Method declaredMethod2 = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", clsArr);
                                                                    v2n0.b = declaredMethod2;
                                                                    declaredMethod2.setAccessible(true);
                                                                } catch (NoSuchMethodException unused2) {
                                                                }
                                                                v2n0.c = true;
                                                            }
                                                            Method method2 = v2n0.b;
                                                            if (method2 != null) {
                                                                i4 = 2;
                                                                try {
                                                                    Object[] objArr = new Object[2];
                                                                    try {
                                                                        objArr[0] = Integer.valueOf(viewGroup4.getChildCount());
                                                                        objArr[1] = Integer.valueOf(i11);
                                                                        iIntValue = ((Integer) method2.invoke(viewGroup4, objArr)).intValue();
                                                                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                                                                        iIntValue = i11;
                                                                    }
                                                                } catch (IllegalAccessException | InvocationTargetException unused4) {
                                                                }
                                                            } else {
                                                                i4 = 2;
                                                            }
                                                            iIntValue = i11;
                                                        }
                                                        View childAt = viewGroup4.getChildAt(iIntValue);
                                                        if (childAt != view4) {
                                                            if (childAt != view5) {
                                                                i11++;
                                                                i = i4;
                                                                childCount2 = i12;
                                                                childCount = i5;
                                                            }
                                                        }
                                                    }
                                                    i8 = i9 + 1;
                                                    i3 = i5;
                                                }
                                            } else if (v6v.a(view4) <= v6v.a(view5)) {
                                                arrayList2 = arrayList4;
                                                i4 = i;
                                            }
                                            i3 = i9 - 1;
                                        } else {
                                            i10++;
                                            arrayList3 = arrayList;
                                            childCount = childCount;
                                        }
                                    } else {
                                        arrayList = arrayList3;
                                        arrayList2 = arrayList4;
                                        i5 = childCount;
                                        i4 = i;
                                        if (arrayList2.size() == iMin) {
                                            i8 = i9 + 1;
                                            i3 = i5;
                                        } else {
                                            i3 = i9 - 1;
                                        }
                                    }
                                    arrayList2.clear();
                                    arrayList3 = arrayList;
                                    i = i4;
                                    childCount = i3;
                                    arrayList4 = arrayList2;
                                    objectAnimatorOfPropertyValuesHolder = objectAnimator2;
                                    z4 = z2;
                                }
                            }
                            arrayList2 = arrayList4;
                        }
                        i5 = childCount;
                        i4 = i;
                        i8 = i9 + 1;
                        i3 = i5;
                        arrayList2.clear();
                        arrayList3 = arrayList;
                        i = i4;
                        childCount = i3;
                        arrayList4 = arrayList2;
                        objectAnimatorOfPropertyValuesHolder = objectAnimator2;
                        z4 = z2;
                    }
                    objectAnimator = objectAnimatorOfPropertyValuesHolder;
                    z = z4;
                    if (i8 < 0 || i8 >= w6vVar.getChildCount()) {
                        w6vVar.addView(x6vVar4);
                    } else {
                        w6vVar.addView(x6vVar4, i8);
                    }
                    x6vVar4.d = i2;
                    x6vVar2 = x6vVar4;
                } else {
                    objectAnimator = objectAnimatorOfPropertyValuesHolder;
                    z = z4;
                    x6vVar.e = matrix8;
                    x6vVar2 = x6vVar;
                }
                x6vVar2.d++;
                u6vVar = x6vVar2;
            }
            if (u6vVar != null) {
                u6vVar.a(view, (ViewGroup) map.get("android:changeTransform:parent"));
                gms0 gms0Var = this;
                while (true) {
                    gms0 gms0Var2 = gms0Var.n;
                    if (gms0Var2 == null) {
                        break;
                    }
                    gms0Var = gms0Var2;
                }
                jsb jsbVar = new jsb();
                jsbVar.b = view2;
                jsbVar.c = u6vVar;
                gms0Var.a(jsbVar);
                if (z) {
                    if (view != view2) {
                        bmu0.b(view, 0.0f);
                    }
                    bmu0.b(view2, 1.0f);
                }
            }
        } else {
            objectAnimator = objectAnimatorOfPropertyValuesHolder;
            if (!z4) {
                viewGroup2.endViewTransition(view);
            }
        }
        return objectAnimator;
    }

    @Override // a.gms0
    public final String[] z() {
        return m1;
    }
}
