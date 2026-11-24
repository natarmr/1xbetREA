package a;

import android.view.View;
import androidx.constraintlayout.helper.widget.Flow;
import org.xbet.client1.R;
import org.xplatform.uikit.components.account_selection.DsAccountSelection;

/* JADX INFO: loaded from: classes6.dex */
public final class fjl implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9646a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ DsAccountSelection c;

    public /* synthetic */ fjl(boolean z, DsAccountSelection dsAccountSelection, byte b) {
        this.f9646a = b;
        this.b = z;
        this.c = dsAccountSelection;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int dimensionPixelOffset;
        byte b = this.f9646a;
        boolean z = this.b;
        DsAccountSelection dsAccountSelection = this.c;
        view.getClass();
        switch (b) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                dimensionPixelOffset = z ? 0 : dsAccountSelection.getResources().getDimensionPixelOffset(R.dimen.space_8);
                int i9 = DsAccountSelection.z;
                boolean zP = dsAccountSelection.p();
                jg jgVar = dsAccountSelection.q;
                if (!zP) {
                    ((Flow) jgVar.g).setPaddingLeft(dimensionPixelOffset);
                } else {
                    ((Flow) jgVar.g).setPaddingRight(dimensionPixelOffset);
                }
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                dimensionPixelOffset = z ? 0 : dsAccountSelection.getResources().getDimensionPixelOffset(R.dimen.space_8);
                int i10 = DsAccountSelection.z;
                boolean zP2 = dsAccountSelection.p();
                jg jgVar2 = dsAccountSelection.q;
                if (!zP2) {
                    ((Flow) jgVar2.g).setPaddingRight(dimensionPixelOffset);
                } else {
                    ((Flow) jgVar2.g).setPaddingLeft(dimensionPixelOffset);
                }
                break;
        }
    }
}
