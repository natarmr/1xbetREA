package a;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class ge3 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11131a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ge3(Object obj, byte b) {
        this.f11131a = b;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        byte b = this.f11131a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ie3 ie3Var = (ie3) obj;
                androidx.appcompat.widget.b bVar = ie3Var.h1;
                bVar.setSelection(i);
                if (bVar.getOnItemClickListener() != null) {
                    bVar.performItemClick(view, i, ie3Var.Z.getItemId(i));
                }
                ie3Var.dismiss();
                break;
            case 1:
                nh30 nh30Var = (nh30) obj;
                of00 of00Var = nh30Var.e;
                if (i < 0) {
                    item = !of00Var.z.isShowing() ? null : of00Var.c.getSelectedItem();
                } else {
                    item = nh30Var.getAdapter().getItem(i);
                }
                nh30Var.setText(nh30Var.convertSelectionToString(item), false);
                AdapterView.OnItemClickListener onItemClickListener = nh30Var.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !of00Var.z.isShowing() ? null : of00Var.c.getSelectedView();
                        i = !of00Var.z.isShowing() ? -1 : of00Var.c.getSelectedItemPosition();
                        j = !of00Var.z.isShowing() ? Long.MIN_VALUE : of00Var.c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(of00Var.c, view, i, j);
                }
                of00Var.dismiss();
                break;
            default:
                ((androidx.appcompat.widget.d) obj).n(i);
                break;
        }
    }
}
