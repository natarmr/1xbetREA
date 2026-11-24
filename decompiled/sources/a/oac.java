package a;

import android.graphics.Rect;
import android.view.View;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import org.xplatform.uikit.components.cells.right.DsCellRightRadioButton;
import org.xplatform.uikit.components.radio_button.DsRadioButton;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class oac implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24922a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oac(Object obj, byte b) {
        this.f24922a = b;
        this.b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Object value;
        o6d0 o6d0Var;
        u6d0 u6d0Var;
        String str;
        int i;
        String str2;
        String str3;
        byte b = this.f24922a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Chip chip = (Chip) obj;
                Rect rect = Chip.x;
                gi30 gi30Var = chip.j;
                if (gi30Var != null) {
                    m9c m9cVar = (m9c) ((ok50) gi30Var).f25390a;
                    if (!z ? m9cVar.g(chip, m9cVar.b) : m9cVar.a(chip)) {
                        m9cVar.d();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
                break;
            case 1:
                usd usdVar = o0g.k2;
                compoundButton.getClass();
                ((o0g) obj).U0().y(new rh(z));
                break;
            case 2:
                int i2 = DsCellRightRadioButton.g1;
                compoundButton.getClass();
                Object parent = ((DsCellRightRadioButton) obj).getParent();
                parent.getClass();
                ((View) parent).setSelected(z);
                break;
            case 3:
                int i3 = DsRadioButton.h;
                compoundButton.getClass();
                Object parent2 = ((DsRadioButton) obj).getParent();
                parent2.getClass();
                ((View) parent2).setSelected(z);
                break;
            case 4:
                nh70 nh70Var = h6d0.Q1;
                compoundButton.getClass();
                p7m0 p7m0Var = ((h6d0) obj).J0().k;
                do {
                    value = p7m0Var.getValue();
                    o6d0Var = (o6d0) value;
                    j6d0 j6d0Var = o6d0Var.f24729a;
                    u6d0Var = j6d0Var.b;
                    str = j6d0Var.c;
                    i = j6d0Var.d;
                    str2 = j6d0Var.e;
                    str3 = j6d0Var.f;
                    str.getClass();
                    str2.getClass();
                    str3.getClass();
                } while (!p7m0Var.m(value, o6d0.a(o6d0Var, new j6d0(z, u6d0Var, str, i, str2, str3), false, false, 14)));
                break;
            default:
                fl70 fl70Var = ymd0.o2;
                compoundButton.getClass();
                tod0 tod0Var = (tod0) ((ymd0) obj).j2.getValue();
                mne mneVar = tod0Var.b;
                p7m0 p7m0Var2 = tod0Var.m;
                Object value2 = p7m0Var2.getValue();
                yje yjeVar = null;
                mod0 mod0Var = value2 instanceof mod0 ? (mod0) value2 : null;
                if (mod0Var != null) {
                    double d = mod0Var.g;
                    double d2 = mod0Var.f;
                    byte b2 = 1;
                    p7m0Var2.o(null, mod0.a(mod0Var, z, tod0Var.d.g() != z && d2 >= d, 0.0d, 121));
                    if (z && d2 < d) {
                        sac.V(jiu0.a(tod0Var), new znd0(tod0Var, b2), null, mneVar.b, new s9c0(tod0Var, mod0Var, yjeVar, (byte) 17), 10);
                    } else {
                        sac.V(jiu0.a(tod0Var), new znd0(tod0Var, (byte) 2), null, mneVar.b, new pnd0(tod0Var, mod0Var, yjeVar, b2), 10);
                    }
                }
                break;
        }
    }
}
