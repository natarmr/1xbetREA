package a;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: loaded from: classes.dex */
public final class ee3 implements je3, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k12 f7649a;
    public fe3 b;
    public CharSequence c;
    public final /* synthetic */ androidx.appcompat.widget.b d;

    public ee3(androidx.appcompat.widget.b bVar) {
        this.d = bVar;
    }

    @Override // a.je3
    public final void dismiss() {
        k12 k12Var = this.f7649a;
        if (k12Var != null) {
            k12Var.dismiss();
            this.f7649a = null;
        }
    }

    @Override // a.je3
    public final Drawable e() {
        return null;
    }

    @Override // a.je3
    public final boolean f() {
        k12 k12Var = this.f7649a;
        if (k12Var != null) {
            return k12Var.isShowing();
        }
        return false;
    }

    @Override // a.je3
    public final int g() {
        return 0;
    }

    @Override // a.je3
    public final void h(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // a.je3
    public final CharSequence i() {
        return this.c;
    }

    @Override // a.je3
    public final void j(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // a.je3
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // a.je3
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // a.je3
    public final void m(int i, int i2) {
        if (this.b == null) {
            return;
        }
        androidx.appcompat.widget.b bVar = this.d;
        j12 j12Var = new j12(bVar.getPopupContext());
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            j12Var.setTitle(charSequence);
        }
        fe3 fe3Var = this.b;
        int selectedItemPosition = bVar.getSelectedItemPosition();
        f12 f12Var = j12Var.f15710a;
        f12Var.k = fe3Var;
        f12Var.l = this;
        f12Var.o = selectedItemPosition;
        f12Var.n = true;
        k12 k12VarCreate = j12Var.create();
        this.f7649a = k12VarCreate;
        AlertController$RecycleListView alertController$RecycleListView = k12VarCreate.g.e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f7649a.show();
    }

    @Override // a.je3
    public final int n() {
        return 0;
    }

    @Override // a.je3
    public final void o(ListAdapter listAdapter) {
        this.b = (fe3) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        androidx.appcompat.widget.b bVar = this.d;
        bVar.setSelection(i);
        if (bVar.getOnItemClickListener() != null) {
            bVar.performItemClick(null, i, this.b.getItemId(i));
        }
        dismiss();
    }

    @Override // a.je3
    public final void s(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }
}
