package a;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;

/* JADX INFO: loaded from: classes.dex */
public final class eih0 implements View.OnKeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.d f7860a;

    public eih0(androidx.appcompat.widget.d dVar) {
        this.f7860a = dVar;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        androidx.appcompat.widget.d dVar = this.f7860a;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = dVar.p;
        if (dVar.D1 != null) {
            if (!searchView$SearchAutoComplete.isPopupShowing() || searchView$SearchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchView$SearchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i == 66) {
                    view.cancelLongPress();
                    dVar.getContext().startActivity(dVar.j("android.intent.action.SEARCH", null, null, searchView$SearchAutoComplete.getText().toString()));
                    return true;
                }
            } else if (dVar.D1 != null && dVar.s1 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                if (i == 66 || i == 84 || i == 61) {
                    dVar.n(searchView$SearchAutoComplete.getListSelection());
                    return true;
                }
                if (i == 21 || i == 22) {
                    searchView$SearchAutoComplete.setSelection(i == 21 ? 0 : searchView$SearchAutoComplete.length());
                    searchView$SearchAutoComplete.setListSelection(0);
                    searchView$SearchAutoComplete.clearListSelection();
                    searchView$SearchAutoComplete.a();
                    return true;
                }
                if (i == 19) {
                    searchView$SearchAutoComplete.getListSelection();
                    return false;
                }
            }
        }
        return false;
    }
}
