package a;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class kf00 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18176a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kf00(Object obj, byte b) {
        this.f18176a = b;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        hil hilVar;
        byte b = this.f18176a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (i != -1 && (hilVar = ((of00) obj).c) != null) {
                    hilVar.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((androidx.appcompat.widget.d) obj).o(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        byte b = this.f18176a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
