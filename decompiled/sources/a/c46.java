package a;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.google.android.material.timepicker.ClockFaceView;
import com.google.android.material.timepicker.ClockHandView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class c46 extends p6 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c46(Object obj, byte b) {
        this.d = b;
        this.e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // a.p6
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        pj80 pj80Var;
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 2:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) obj).d);
                break;
            case 8:
                ViewPager viewPager = (ViewPager) obj;
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName(ViewPager.class.getName());
                pj80 pj80Var2 = viewPager.e;
                if (pj80Var2 != null) {
                    z = pj80Var2.c() > 1;
                }
                accessibilityEvent.setScrollable(z);
                if (accessibilityEvent.getEventType() == 4096 && (pj80Var = viewPager.e) != null) {
                    accessibilityEvent.setItemCount(pj80Var.c());
                    accessibilityEvent.setFromIndex(viewPager.f);
                    accessibilityEvent.setToIndex(viewPager.f);
                    break;
                }
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // a.p6
    public final void d(View view, k7 k7Var) {
        byte b = this.d;
        int i = -1;
        boolean z = false;
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.f26429a;
        switch (b) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = k7Var.f17795a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                k7Var.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = k7Var.f17795a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                if (((wo8) obj).k) {
                    k7Var.a(1048576);
                    accessibilityNodeInfo2.setDismissable(true);
                } else {
                    accessibilityNodeInfo2.setDismissable(false);
                }
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo3 = k7Var.f17795a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo3.setCheckable(checkableImageButton.e);
                accessibilityNodeInfo3.setChecked(checkableImageButton.d);
                break;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo4 = k7Var.f17795a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                k7Var.o(((EditText) view).getText());
                k7Var.m(((ChipTextInputComboView) obj).c.getText());
                accessibilityNodeInfo4.setMaxTextLength(2);
                break;
            case 4:
                AccessibilityNodeInfo accessibilityNodeInfo5 = k7Var.f17795a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo5);
                int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
                if (iIntValue > 0) {
                    accessibilityNodeInfo5.setTraversalAfter((View) ((ClockFaceView) obj).x.get(iIntValue - 1));
                }
                k7Var.l(j7.a(view.isSelected(), 0, 1, iIntValue, 1));
                accessibilityNodeInfo5.setClickable(true);
                k7Var.b(d7.e);
                break;
            case 5:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, k7Var.f17795a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i2 = MaterialButtonToggleGroup.s;
                if (view instanceof MaterialButton) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < materialButtonToggleGroup.getChildCount(); i4++) {
                        if (materialButtonToggleGroup.getChildAt(i4) == view) {
                            i = i3;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i4).getVisibility() != 8) {
                                i3++;
                            }
                        }
                    }
                }
                k7Var.l(j7.a(((MaterialButton) view).v, 0, 1, i, 1));
                break;
            case 6:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, k7Var.f17795a);
                com.google.android.material.datepicker.e eVar = (com.google.android.material.datepicker.e) obj;
                k7Var.b(new d7(16, eVar.S1.getVisibility() == 0 ? eVar.H(R.string.mtrl_picker_toggle_to_year_selection) : eVar.H(R.string.mtrl_picker_toggle_to_day_selection)));
                break;
            case 7:
                AccessibilityNodeInfo accessibilityNodeInfo6 = k7Var.f17795a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo6);
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) obj;
                accessibilityNodeInfo6.setCheckable(navigationMenuItemView.x);
                accessibilityNodeInfo6.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", navigationMenuItemView.getResources().getString(R.string.item_view_role_description));
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, k7Var.f17795a);
                k7Var.j(ViewPager.class.getName());
                ViewPager viewPager = (ViewPager) obj;
                pj80 pj80Var = viewPager.e;
                if (pj80Var != null && pj80Var.c() > 1) {
                    z = true;
                }
                k7Var.n(z);
                if (viewPager.canScrollHorizontally(1)) {
                    k7Var.a(4096);
                }
                if (viewPager.canScrollHorizontally(-1)) {
                    k7Var.a(8192);
                }
                break;
        }
    }

    @Override // a.p6
    public boolean g(View view, int i, Bundle bundle) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                if (i != 1048576) {
                    return super.g(view, i, bundle);
                }
                ((g46) obj).a(3);
                return true;
            case 1:
                if (i == 1048576) {
                    wo8 wo8Var = (wo8) obj;
                    if (wo8Var.k) {
                        wo8Var.cancel();
                        return true;
                    }
                }
                return super.g(view, i, bundle);
            case 4:
                ClockFaceView clockFaceView = (ClockFaceView) obj;
                ClockHandView clockHandView = clockFaceView.t;
                Rect rect = clockFaceView.u;
                if (i != 16) {
                    return super.g(view, i, bundle);
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                view.getHitRect(rect);
                float fCenterX = rect.centerX();
                float fCenterY = rect.centerY();
                clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
                clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
                return true;
            case 8:
                ViewPager viewPager = (ViewPager) obj;
                if (super.g(view, i, bundle)) {
                    return true;
                }
                if (i != 4096) {
                    if (i == 8192 && viewPager.canScrollHorizontally(-1)) {
                        viewPager.setCurrentItem(viewPager.f - 1);
                        return true;
                    }
                } else if (viewPager.canScrollHorizontally(1)) {
                    viewPager.setCurrentItem(viewPager.f + 1);
                    return true;
                }
                return false;
            default:
                return super.g(view, i, bundle);
        }
    }
}
