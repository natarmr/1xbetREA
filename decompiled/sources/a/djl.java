package a;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.WeakHashMap;
import org.xbet.client1.R;
import org.xplatform.uikit.components.account_selection.DsAccountSelection;
import org.xplatform.uikit.components.badges.DsBadge;
import org.xplatform.uikit.components.cells.menu.DsMenuCompactCell;

/* JADX INFO: loaded from: classes6.dex */
public final class djl implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6192a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public djl(vbo0 vbo0Var, View view) {
        this.f6192a = (byte) 4;
        this.c = vbo0Var;
        this.b = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        DsBadge dsBadge;
        byte b = this.f6192a;
        Object[] objArr = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                jg jgVar = (jg) obj2;
                ((Flow) jgVar.e).setHorizontalGap(((DsAccountSelection) obj).getResources().getDimensionPixelOffset(R.dimen.space_8));
                FrameLayout frameLayout = (FrameLayout) jgVar.k;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                int iMin = Math.min(frameLayout.getWidth(), frameLayout.getHeight());
                layoutParams.width = iMin;
                layoutParams.height = iMin;
                frameLayout.setLayoutParams(layoutParams);
                ImageView imageView = (ImageView) jgVar.i;
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                layoutParams2.getClass();
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                layoutParams3.gravity = 17;
                imageView.setLayoutParams(layoutParams3);
                break;
            case 1:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                if5 if5Var = ((DsMenuCompactCell) obj2).B;
                ColorStateList colorStateList = (ColorStateList) obj;
                if (!if5Var.i && (dsBadge = if5Var.c) != null) {
                    tl60.a(dsBadge, new hf5(dsBadge, if5Var, colorStateList, objArr == true ? 1 : 0));
                }
                break;
            case 2:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                ((a1o0) obj2).h.setCrystalGameState(((zhf) obj).c);
                break;
            case 3:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                mjv0.f21914a.getClass();
                njv0 njv0Var = ljv0.b;
                njv0Var.getClass();
                Rect rectC = njv0Var.a((yc3) obj2).f18406a.c();
                WeakHashMap weakHashMap = rgu0.f30456a;
                xiv0 xiv0VarA = jgu0.a(view);
                pfx pfxVarI = xiv0VarA != null ? xiv0VarA.f40966a.i(647) : null;
                int iWidth = (rectC.width() - (pfxVarI != null ? pfxVarI.f26926a : 0)) - (pfxVarI != null ? pfxVarI.c : 0);
                ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                if (layoutParams4 == null) {
                    hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4;
                    marginLayoutParams.width = Math.min(((rrm) obj).i.getResources().getDimensionPixelSize(R.dimen.size_448), iWidth - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin));
                    if (marginLayoutParams instanceof ble) {
                        ((ble) marginLayoutParams).c = 81;
                    } else if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                        ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 81;
                    }
                    view.setLayoutParams(marginLayoutParams);
                }
                break;
            case 4:
                View view2 = (View) obj2;
                if (view2.getVisibility() == 0) {
                    ((vbo0) obj).e(view2);
                }
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                vju0 vju0Var = (vju0) obj2;
                LinearLayoutManager linearLayoutManager = vju0Var.E;
                if (linearLayoutManager != null) {
                    int i9 = ((kie0) obj).f18333a;
                    jva jvaVar = new jva(((LinearLayout) vju0Var.u.b).getContext(), (byte) 2);
                    jvaVar.f32207a = i9;
                    linearLayoutManager.S0(jvaVar);
                }
                break;
        }
    }

    public /* synthetic */ djl(Object obj, Object obj2, byte b) {
        this.f6192a = b;
        this.b = obj;
        this.c = obj2;
    }
}
