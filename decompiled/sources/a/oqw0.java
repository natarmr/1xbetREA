package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class oqw0 extends orw0 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ wrw0 f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqw0(wrw0 wrw0Var, Boolean bool) {
        super(wrw0Var, true);
        this.e = (byte) 0;
        this.g = bool;
        Objects.requireNonNull(wrw0Var);
        this.f = wrw0Var;
    }

    @Override // a.orw0
    public final void a() {
        switch (this.e) {
            case 0:
                yow0 yow0Var = this.f.f;
                s0x.H(yow0Var);
                yow0Var.setMeasurementEnabled(((Boolean) this.g).booleanValue(), this.f25755a);
                break;
            case 1:
                yow0 yow0Var2 = this.f.f;
                s0x.H(yow0Var2);
                yow0Var2.retrieveAndUploadBatches(new vqw0(this, (k3x0) this.g));
                break;
            case 2:
                yow0 yow0Var3 = this.f.f;
                s0x.H(yow0Var3);
                yow0Var3.logHealthData(5, "Error with data collection. Data lost.", new aa60((Exception) this.g), new aa60(null), new aa60(null));
                break;
            default:
                yow0 yow0Var4 = this.f.f;
                s0x.H(yow0Var4);
                yow0Var4.registerOnMeasurementEventListener((qrw0) this.g);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oqw0(wrw0 wrw0Var, Object obj, byte b) {
        super(wrw0Var, true);
        this.e = b;
        this.g = obj;
        this.f = wrw0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqw0(wrw0 wrw0Var, Exception exc) {
        super(wrw0Var, false);
        this.e = (byte) 2;
        this.g = exc;
        this.f = wrw0Var;
    }
}
