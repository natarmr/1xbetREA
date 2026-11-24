package a;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public final class d7 {
    public static final d7 e;
    public static final d7 f;
    public static final d7 g;
    public static final d7 h;
    public static final d7 i;
    public static final d7 j;
    public static final d7 k;
    public static final d7 l;
    public static final d7 m;
    public static final d7 n;
    public static final d7 o;
    public static final d7 p;
    public static final d7 q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5572a;
    public final int b;
    public final Class c;
    public final w7 d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
        new d7(1, (String) null);
        new d7(2, (String) null);
        new d7(4, (String) null);
        new d7(8, (String) null);
        e = new d7(16, (String) null);
        new d7(32, (String) null);
        f = new d7(64, (String) null);
        g = new d7(128, (String) null);
        new d7(256, p7.class);
        new d7(512, p7.class);
        new d7(1024, q7.class);
        new d7(2048, q7.class);
        h = new d7(4096, (String) null);
        i = new d7(8192, (String) null);
        new d7(16384, (String) null);
        new d7(32768, (String) null);
        new d7(65536, (String) null);
        new d7(131072, u7.class);
        j = new d7(262144, (String) null);
        new d7(524288, (String) null);
        k = new d7(1048576, (String) null);
        new d7(2097152, v7.class);
        new d7(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        l = new d7(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, s7.class);
        m = new d7(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        n = new d7(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        o = new d7(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        p = new d7(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        int i2 = Build.VERSION.SDK_INT;
        new d7(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new d7(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new d7(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new d7(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new d7(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new d7(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, t7.class);
        new d7(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, r7.class);
        new d7(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new d7(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new d7(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new d7(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new d7(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new d7(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new d7(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new d7(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        q = new d7(i2 >= 34 ? r6.d() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        w99 w99Var = w99.f38768a;
        if (i2 >= 36) {
            if ((i2 < 36 ? i2 * 100000 : Build.VERSION.SDK_INT_FULL) >= 3600001) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION;
            }
        }
        new d7(accessibilityAction, R.id.ALT, null, null, null);
    }

    public d7(Object obj, int i2, CharSequence charSequence, w7 w7Var, Class cls) {
        this.b = i2;
        this.d = w7Var;
        if (obj == null) {
            this.f5572a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
        } else {
            this.f5572a = obj;
        }
        this.c = cls;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f5572a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d7)) {
            return false;
        }
        Object obj2 = ((d7) obj).f5572a;
        Object obj3 = this.f5572a;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f5572a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strD = k7.d(this.b);
        if (strD.equals("ACTION_UNKNOWN")) {
            Object obj = this.f5572a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strD);
        return sb.toString();
    }

    public d7(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public d7(int i2, String str) {
        this(null, i2, str, null, null);
    }
}
