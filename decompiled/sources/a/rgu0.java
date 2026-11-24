package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatEditText;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class rgu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap f30456a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final fgu0 e = new fgu0();

    public static zju0 a(View view) {
        WeakHashMap weakHashMap = f30456a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            f30456a = weakHashMap;
        }
        zju0 zju0Var = (zju0) weakHashMap.get(view);
        if (zju0Var != null) {
            return zju0Var;
        }
        zju0 zju0Var2 = new zju0(view);
        f30456a.put(view, zju0Var2);
        return zju0Var2;
    }

    public static xiv0 b(View view, xiv0 xiv0Var) {
        WindowInsets windowInsetsG = xiv0Var.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsA = Build.VERSION.SDK_INT >= 30 ? ogu0.a(view, windowInsetsG) : ggu0.a(view, windowInsetsG);
            if (!windowInsetsA.equals(windowInsetsG)) {
                return xiv0.h(windowInsetsA, view);
            }
        }
        return xiv0Var;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = qgu0.d;
        qgu0 qgu0Var = (qgu0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (qgu0Var == null) {
            qgu0Var = new qgu0();
            qgu0Var.f28704a = null;
            qgu0Var.b = null;
            qgu0Var.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, qgu0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = qgu0Var.f28704a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = qgu0.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (qgu0Var.f28704a == null) {
                            qgu0Var.f28704a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = qgu0.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                qgu0Var.f28704a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    qgu0Var.f28704a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewA = qgu0Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                SparseArray sparseArray = qgu0Var.b;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    qgu0Var.b = sparseArray;
                }
                sparseArray.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = qgu0.d;
            qgu0 qgu0Var = (qgu0) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (qgu0Var == null) {
                qgu0Var = new qgu0();
                qgu0Var.f28704a = null;
                qgu0Var.b = null;
                qgu0Var.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, qgu0Var);
            }
            WeakReference weakReference2 = qgu0Var.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                qgu0Var.c = new WeakReference(keyEvent);
                SparseArray sparseArray = qgu0Var.b;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    qgu0Var.b = sparseArray;
                }
                if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
                    sparseArray.removeAt(iIndexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    hny.b();
                    return false;
                }
            }
        }
        return false;
    }

    public static View.AccessibilityDelegate e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ngu0.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static CharSequence f(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = mgu0.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList g(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] h(AppCompatEditText appCompatEditText) {
        return Build.VERSION.SDK_INT >= 31 ? pgu0.a(appCompatEditText) : (String[]) appCompatEditText.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void i(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = f(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(f(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(f(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static xiv0 j(View view, xiv0 xiv0Var) {
        WindowInsets windowInsetsG = xiv0Var.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsG);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsG)) {
                return xiv0.h(windowInsetsOnApplyWindowInsets, view);
            }
        }
        return xiv0Var;
    }

    public static ree k(AppCompatEditText appCompatEditText, ree reeVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + reeVar + ", view=" + appCompatEditText.getClass().getSimpleName() + "[" + appCompatEditText.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return pgu0.b(appCompatEditText, reeVar);
        }
        if (((jaq0) appCompatEditText.getTag(R.id.tag_on_receive_content_listener)) == null) {
            return appCompatEditText.c(reeVar);
        }
        ree reeVarA = jaq0.a(appCompatEditText, reeVar);
        if (reeVarA == null) {
            return null;
        }
        return appCompatEditText.c(reeVarA);
    }

    public static void l(View view, int i) {
        ArrayList arrayListG = g(view);
        for (int i2 = 0; i2 < arrayListG.size(); i2++) {
            if (((d7) arrayListG.get(i2)).a() == i) {
                arrayListG.remove(i2);
                return;
            }
        }
    }

    public static void m(View view, d7 d7Var, w7 w7Var) {
        p6 p6Var;
        d7 d7Var2 = new d7(null, d7Var.b, null, w7Var, d7Var.c);
        View.AccessibilityDelegate accessibilityDelegateE = e(view);
        if (accessibilityDelegateE == null) {
            p6Var = null;
        } else {
            p6Var = accessibilityDelegateE instanceof o6 ? ((o6) accessibilityDelegateE).f24709a : new p6(accessibilityDelegateE);
        }
        if (p6Var == null) {
            p6Var = new p6();
        }
        o(view, p6Var);
        l(view, d7Var2.a());
        g(view).add(d7Var2);
        i(view, 0);
    }

    public static void n(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            ngu0.b(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void o(View view, p6 p6Var) {
        if (p6Var == null && (e(view) instanceof o6)) {
            p6Var = new p6();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(p6Var == null ? null : p6Var.b);
    }

    public static void p(View view, CharSequence charSequence) {
        new egu0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, (byte) 1).a(view, charSequence);
        fgu0 fgu0Var = e;
        if (charSequence == null) {
            fgu0Var.f9511a.remove(view);
            view.removeOnAttachStateChangeListener(fgu0Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(fgu0Var);
        } else {
            fgu0Var.f9511a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(fgu0Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(fgu0Var);
            }
        }
    }
}
