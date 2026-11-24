package a;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import com.google.android.material.timepicker.ChipTextInputComboView;

/* JADX INFO: loaded from: classes2.dex */
public final class rbc implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30177a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ rbc(ViewGroup viewGroup, byte b) {
        this.f30177a = b;
        this.b = viewGroup;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        byte b = this.f30177a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) viewGroup;
                if (!TextUtils.isEmpty(editable)) {
                    int i = ChipTextInputComboView.e;
                    String strA = chipTextInputComboView.a(editable);
                    if (TextUtils.isEmpty(strA)) {
                        strA = chipTextInputComboView.a("00");
                    }
                    chipTextInputComboView.d = strA;
                } else {
                    int i2 = ChipTextInputComboView.e;
                    chipTextInputComboView.d = chipTextInputComboView.a("00");
                }
                break;
            default:
                ((cxn) viewGroup).a().a();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.f30177a) {
            case 1:
                ((cxn) this.b).a().b();
                break;
        }
    }

    public final void a(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
