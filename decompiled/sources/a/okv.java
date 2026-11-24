package a;

import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class okv implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25425a;
    public final /* synthetic */ wdr b;
    public final /* synthetic */ Object c;

    public /* synthetic */ okv(cp cpVar, q1j0 q1j0Var) {
        this.f25425a = (byte) 3;
        this.c = cpVar;
        this.b = q1j0Var;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        byte b = this.f25425a;
        wdr wdrVar = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                vft vftVar = (vft) wdrVar;
                cp cpVar = (cp) obj;
                compoundButton.getClass();
                if (compoundButton.isPressed()) {
                    vftVar.invoke(cpVar.u());
                    break;
                }
                break;
            case 1:
                compoundButton.getClass();
                ((e000) wdrVar).invoke((cr10) obj, Boolean.valueOf(z));
                break;
            case 2:
                lma0 lma0Var = (lma0) wdrVar;
                cp cpVar2 = (cp) obj;
                compoundButton.getClass();
                if (compoundButton.isPressed()) {
                    lma0Var.invoke(Boolean.valueOf(z), ((jui0) cpVar2.u()).f);
                    break;
                }
                break;
            default:
                cp cpVar3 = (cp) obj;
                q1j0 q1j0Var = (q1j0) wdrVar;
                compoundButton.getClass();
                if (compoundButton.isPressed()) {
                    if (!(cpVar3.u() instanceof bej0)) {
                        q1j0Var.invoke(cpVar3.u());
                    } else {
                        bej0 bej0Var = (bej0) cpVar3.u();
                        q1j0Var.invoke(new bej0(z, bej0Var.d, bej0Var.f2454a, bej0Var.b));
                    }
                }
                break;
        }
    }

    public /* synthetic */ okv(byte b, wdr wdrVar, Object obj) {
        this.f25425a = b;
        this.b = wdrVar;
        this.c = obj;
    }
}
