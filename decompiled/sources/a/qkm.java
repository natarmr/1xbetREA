package a;

import android.text.Editable;
import android.text.TextWatcher;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;

/* JADX INFO: loaded from: classes6.dex */
public final class qkm implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f28892a = true;
    public final /* synthetic */ DsCellMiddleTitle b;

    public qkm(DsCellMiddleTitle dsCellMiddleTitle) {
        this.b = dsCellMiddleTitle;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.f28892a != (editable == null || editable.length() == 0)) {
            int i = DsMenuCell.g1;
            this.b.setTitleMaxLines((editable == null || editable.length() == 0) ? 2 : 1);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f28892a = charSequence == null || charSequence.length() == 0;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
