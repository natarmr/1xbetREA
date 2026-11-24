package a;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class qac extends p6 {
    public static final Rect o = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final xak p = new xak((byte) 12);
    public static final ddk q = new ddk();
    public final AccessibilityManager h;
    public final Chip i;
    public rx2 j;
    public final /* synthetic */ Chip n;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    public qac(Chip chip, Chip chip2) {
        this.n = chip;
        this.i = chip2;
        this.h = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
        chip2.setFocusable(true);
        if (chip2.getImportantForAccessibility() == 0) {
            chip2.setImportantForAccessibility(1);
        }
    }

    @Override // a.p6
    public final ok50 b(View view) {
        rx2 rx2Var = this.j;
        if (rx2Var != null) {
            return rx2Var;
        }
        rx2 rx2Var2 = new rx2(this, (byte) 1);
        this.j = rx2Var2;
        return rx2Var2;
    }

    @Override // a.p6
    public final void d(View view, k7 k7Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = k7Var.f17795a;
        this.f26429a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.n;
        uac uacVar = chip.e;
        accessibilityNodeInfo.setCheckable(uacVar != null && uacVar.B1);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        k7Var.j(chip.getAccessibilityClassName());
        k7Var.o(chip.getText());
    }

    public final boolean j(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        p(i, false);
        r(i, 8);
        return true;
    }

    public final k7 k(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        k7 k7Var = new k7(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        k7Var.j("android.view.View");
        Rect rect = o;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        k7Var.i(rect);
        k7Var.b = -1;
        Chip chip = this.i;
        accessibilityNodeInfoObtain.setParent(chip);
        o(i, k7Var);
        if (k7Var.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            itt0.k("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.e;
        accessibilityNodeInfoObtain.getBoundsInParent(rect2);
        Rect rect3 = this.d;
        k7Var.f(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            itt0.k("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            itt0.k("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & 128) != 0) {
            itt0.k("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        k7Var.c = i;
        accessibilityNodeInfoObtain.setSource(chip, i);
        if (this.k == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            k7Var.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            k7Var.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            k7Var.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            k7Var.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.g;
        chip.getLocationOnScreen(iArr);
        if (rect3.equals(rect)) {
            accessibilityNodeInfoObtain.setBoundsInParent(rect2);
            Rect rect4 = new Rect();
            rect4.set(rect2);
            if (k7Var.b != -1) {
                k7 k7Var2 = new k7(AccessibilityNodeInfo.obtain());
                Rect rect5 = new Rect();
                for (int i2 = k7Var.b; i2 != -1; i2 = k7Var2.b) {
                    k7Var2.b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = k7Var2.f17795a;
                    accessibilityNodeInfo.setParent(chip, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    o(i2, k7Var2);
                    accessibilityNodeInfo.getBoundsInParent(rect5);
                    rect4.offset(rect5.left, rect5.top);
                }
            }
            chip.getLocationOnScreen(iArr);
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            k7Var.i(rect4);
            k7Var.f(rect3);
        }
        Rect rect6 = this.f;
        if (chip.getLocalVisibleRect(rect6)) {
            rect6.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect6)) {
                k7Var.i(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (parent instanceof View) {
                        View view = (View) parent;
                        if (view.getAlpha() > 0.0f && view.getVisibility() == 0) {
                            parent = view.getParent();
                        }
                    }
                    if (parent != null) {
                        k7Var.f17795a.setVisibleToUser(true);
                    }
                }
            }
        }
        return k7Var;
    }

    public final void l(ArrayList arrayList) {
        uac uacVar;
        arrayList.add(0);
        Rect rect = Chip.x;
        Chip chip = this.n;
        if (!chip.c() || (uacVar = chip.e) == null || !uacVar.v1 || chip.h == null) {
            return;
        }
        arrayList.add(1);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0145  */
    public final boolean m(int i, Rect rect) {
        int i2;
        Object obj;
        k7 k7Var;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        gnk0 gnk0Var = new gnk0(0);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            gnk0Var.c(((Integer) arrayList.get(i3)).intValue(), k(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.l;
        int iB = Integer.MIN_VALUE;
        k7 k7Var2 = i4 == Integer.MIN_VALUE ? null : (k7) j2e.L(gnk0Var, i4);
        xak xakVar = p;
        ddk ddkVar = q;
        Chip chip = this.i;
        int i5 = -1;
        if (i == 1 || i == 2) {
            boolean z = chip.getLayoutDirection() == 1;
            ddkVar.getClass();
            int i6 = gnk0Var.c;
            ArrayList arrayList2 = new ArrayList(i6);
            for (int i7 = 0; i7 < i6; i7++) {
                arrayList2.add((k7) gnk0Var.d(i7));
            }
            Collections.sort(arrayList2, new jqq(z, xakVar));
            if (i == 1) {
                i2 = 0;
                int size = arrayList2.size();
                if (k7Var2 != null) {
                    size = arrayList2.indexOf(k7Var2);
                }
                int i8 = size - 1;
                obj = i8 >= 0 ? arrayList2.get(i8) : null;
            } else {
                if (i != 2) {
                    jf4.o("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (k7Var2 == null ? -1 : arrayList2.lastIndexOf(k7Var2)) + 1;
                obj = iLastIndexOf < size2 ? arrayList2.get(iLastIndexOf) : null;
                i2 = 0;
            }
            k7Var = (k7) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                jf4.o("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i9 = this.l;
            if (i9 != Integer.MIN_VALUE) {
                n(i9).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        jf4.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i != 130) {
                    jf4.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            ddkVar.getClass();
            int i10 = gnk0Var.c;
            Rect rect4 = new Rect();
            k7Var = null;
            for (int i11 = 0; i11 < i10; i11++) {
                k7 k7Var3 = (k7) gnk0Var.d(i11);
                if (k7Var3 != k7Var2) {
                    xakVar.getClass();
                    k7Var3.f(rect4);
                    if (pzb.W(i, rect2, rect4)) {
                        if (!pzb.W(i, rect2, rect3) || pzb.A(i, rect2, rect4, rect3)) {
                            rect3.set(rect4);
                            k7Var = k7Var3;
                        } else if (!pzb.A(i, rect2, rect3, rect4)) {
                            int iZ = pzb.Z(i, rect2, rect4);
                            int iA0 = pzb.a0(i, rect2, rect4);
                            int i12 = (iA0 * iA0) + (iZ * 13 * iZ);
                            int iZ2 = pzb.Z(i, rect2, rect3);
                            int iA1 = pzb.a0(i, rect2, rect3);
                            if (i12 < (iA1 * iA1) + (iZ2 * 13 * iZ2)) {
                                rect3.set(rect4);
                                k7Var = k7Var3;
                            }
                        }
                    }
                }
            }
            i2 = 0;
        }
        k7 k7Var4 = k7Var;
        if (k7Var4 != null) {
            int i13 = gnk0Var.c;
            for (int i14 = i2; i14 < i13; i14++) {
                if (gnk0Var.b[i14] == k7Var4) {
                    i5 = i14;
                    break;
                }
            }
            iB = gnk0Var.b(i5);
        }
        return q(iB);
    }

    public final k7 n(int i) {
        if (i != -1) {
            return k(i);
        }
        Chip chip = this.i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        k7 k7Var = new k7(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = rgu0.f30456a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            itt0.k("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            k7Var.f17795a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return k7Var;
    }

    public final void o(int i, k7 k7Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = k7Var.f17795a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.x);
            return;
        }
        Chip chip = this.n;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        k7Var.b(d7.e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
        k7Var.j(Button.class.getName());
    }

    public final void p(int i, boolean z) {
        Chip chip = this.n;
        if (i == 1) {
            chip.n = z;
        }
        uac uacVar = chip.e;
        boolean z2 = chip.n;
        boolean zY = false;
        if (uacVar.w1 != null) {
            zY = uacVar.Y(z2 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : uac.r2);
        }
        if (zY) {
            chip.refreshDrawableState();
        }
    }

    public final boolean q(int i) {
        int i2;
        Chip chip = this.i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i;
        p(i, true);
        r(i, 8);
        return true;
    }

    public final void r(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            k7 k7VarN = n(i);
            accessibilityEventObtain.getText().add(k7VarN.g());
            AccessibilityNodeInfo accessibilityNodeInfo = k7VarN.f17795a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                itt0.k("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                return;
            } else {
                accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
                accessibilityEventObtain.setSource(view, i);
                accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
            }
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
