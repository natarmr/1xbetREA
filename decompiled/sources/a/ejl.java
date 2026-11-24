package a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.helper.widget.Flow;
import org.xbet.client1.R;
import org.xplatform.uikit.components.account_selection.DsAccountSelection;

/* JADX INFO: loaded from: classes6.dex */
public final class ejl implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7916a;
    public final /* synthetic */ DsAccountSelection b;

    public /* synthetic */ ejl(DsAccountSelection dsAccountSelection, byte b) {
        this.f7916a = b;
        this.b = dsAccountSelection;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        byte b = this.f7916a;
        DsAccountSelection dsAccountSelection = this.b;
        view.getClass();
        switch (b) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                jg jgVar = dsAccountSelection.q;
                ((Flow) jgVar.f).setVerticalGap(dsAccountSelection.getResources().getDimensionPixelSize(R.dimen.space_2));
                ImageView imageView = (ImageView) jgVar.i;
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams == null) {
                    hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginStart(dsAccountSelection.getResources().getDimensionPixelSize(R.dimen.size_2));
                    marginLayoutParams.setMarginEnd(dsAccountSelection.getResources().getDimensionPixelSize(R.dimen.size_12));
                    imageView.setLayoutParams(marginLayoutParams);
                    ImageView imageView2 = (ImageView) jgVar.j;
                    ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                    if (layoutParams2 == null) {
                        hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.setMarginEnd(dsAccountSelection.getResources().getDimensionPixelSize(R.dimen.size_8));
                        imageView2.setLayoutParams(marginLayoutParams2);
                    }
                }
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                jg jgVar2 = dsAccountSelection.q;
                int i9 = DsAccountSelection.z;
                int i10 = dsAccountSelection.p() ? 8388613 : 8388611;
                jgVar2.c.setGravity(i10);
                jgVar2.b.setGravity(i10);
                break;
        }
    }
}
