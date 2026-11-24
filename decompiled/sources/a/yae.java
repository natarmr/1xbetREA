package a;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yae implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42291a;
    public final /* synthetic */ Dialog b;

    public /* synthetic */ yae(Dialog dialog, byte b) {
        this.f42291a = b;
        this.b = dialog;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.f42291a;
        Dialog dialog = this.b;
        switch (b) {
            case 0:
                kud kudVar = dbe.k2;
                FrameLayout frameLayout = (FrameLayout) ((wo8) dialog).findViewById(R.id.design_bottom_sheet);
                if (frameLayout != null) {
                    BottomSheetBehavior bottomSheetBehaviorE = BottomSheetBehavior.E(frameLayout);
                    bottomSheetBehaviorE.K = true;
                    bottomSheetBehaviorE.N(3);
                }
                break;
            case 1:
                art artVar = x6w.k2;
                View viewFindViewById = dialog.findViewById(R.id.design_bottom_sheet);
                viewFindViewById.getClass();
                BottomSheetBehavior.E((FrameLayout) viewFindViewById).N(3);
                break;
            default:
                g9m0 g9m0Var = npn0.j2;
                FrameLayout frameLayout2 = (FrameLayout) ((hw5) dialog).findViewById(R.id.design_bottom_sheet);
                if (frameLayout2 != null) {
                    BottomSheetBehavior bottomSheetBehaviorE2 = BottomSheetBehavior.E(frameLayout2);
                    bottomSheetBehaviorE2.K = true;
                    bottomSheetBehaviorE2.N(3);
                }
                break;
        }
    }
}
