package a;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class jqw0 extends orw0 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ wrw0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqw0(wrw0 wrw0Var, Bundle bundle, byte b) {
        super(wrw0Var, true);
        this.e = b;
        switch (b) {
            case 1:
                this.f = bundle;
                Objects.requireNonNull(wrw0Var);
                this.g = wrw0Var;
                super(wrw0Var, true);
                break;
            default:
                this.f = bundle;
                Objects.requireNonNull(wrw0Var);
                this.g = wrw0Var;
                break;
        }
    }

    @Override // a.orw0
    public final void a() {
        switch (this.e) {
            case 0:
                yow0 yow0Var = this.g.f;
                s0x.H(yow0Var);
                yow0Var.setConditionalUserProperty(this.f, this.f25755a);
                break;
            default:
                yow0 yow0Var2 = this.g.f;
                s0x.H(yow0Var2);
                yow0Var2.setConsentThirdParty(this.f, this.f25755a);
                break;
        }
    }
}
