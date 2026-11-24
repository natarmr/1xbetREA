package a;

import android.widget.NumberPicker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dlq0 implements NumberPicker.OnValueChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6297a;
    public final /* synthetic */ stl b;

    public /* synthetic */ dlq0(stl stlVar, byte b) {
        this.f6297a = b;
        this.b = stlVar;
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        byte b = this.f6297a;
        stl stlVar = this.b;
        switch (b) {
            case 0:
                s2m0 s2m0Var = ilq0.l2;
                p7m0 p7m0Var = ((ilq0) stlVar).W0().m;
                Integer numValueOf = Integer.valueOf(i2);
                p7m0Var.getClass();
                p7m0Var.o(null, numValueOf);
                break;
            case 1:
                s2m0 s2m0Var2 = ilq0.l2;
                p7m0 p7m0Var2 = ((ilq0) stlVar).W0().n;
                Integer numValueOf2 = Integer.valueOf(i2);
                p7m0Var2.getClass();
                p7m0Var2.o(null, numValueOf2);
                break;
            case 2:
                s2m0 s2m0Var3 = ilq0.l2;
                p7m0 p7m0Var3 = ((ilq0) stlVar).W0().o;
                Integer numValueOf3 = Integer.valueOf(i2);
                p7m0Var3.getClass();
                p7m0Var3.o(null, numValueOf3);
                break;
            default:
                f2i0 f2i0Var = (f2i0) stlVar;
                ArrayList arrayList = f2i0Var.m2;
                if (dqm0.r(i2, arrayList) == vhq0.d) {
                    arrayList.getClass();
                    if (arrayList.size() == 2) {
                        f2i0Var.b1(0);
                    }
                }
                f2i0Var.b1(f2i0Var.o2.get(10));
                break;
        }
    }
}
