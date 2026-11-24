package a;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.MaterialCalendarGridView;

/* JADX INFO: loaded from: classes.dex */
public final class e12 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7017a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e12(Object obj, Object obj2, byte b) {
        this.f7017a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        byte b = this.f7017a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                f12 f12Var = (f12) obj;
                i12 i12Var = (i12) obj2;
                f12Var.l.onClick(i12Var.b, i);
                if (f12Var.n) {
                    return;
                }
                i12Var.b.dismiss();
                return;
            default:
                MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) obj2;
                com.google.android.material.datepicker.h hVarA = materialCalendarGridView.a();
                if (i < hVarA.c() || i > hVarA.f()) {
                    return;
                }
                if (materialCalendarGridView.a().getItem(i).longValue() >= ((DateValidatorPointForward) ((com.google.android.material.datepicker.i) obj).e.f45569a.J1.c).f45565a) {
                    throw null;
                }
                return;
        }
    }
}
