package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class nqw0 extends orw0 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ String f;
    public final /* synthetic */ wrw0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqw0(wrw0 wrw0Var, String str, byte b) {
        super(wrw0Var, true);
        this.e = b;
        switch (b) {
            case 1:
                this.f = str;
                Objects.requireNonNull(wrw0Var);
                this.g = wrw0Var;
                super(wrw0Var, true);
                break;
            case 2:
                this.f = str;
                Objects.requireNonNull(wrw0Var);
                this.g = wrw0Var;
                super(wrw0Var, true);
                break;
            default:
                this.f = str;
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
                yow0Var.setUserId(this.f, this.f25755a);
                break;
            case 1:
                yow0 yow0Var2 = this.g.f;
                s0x.H(yow0Var2);
                yow0Var2.beginAdUnitExposure(this.f, this.b);
                break;
            default:
                yow0 yow0Var3 = this.g.f;
                s0x.H(yow0Var3);
                yow0Var3.endAdUnitExposure(this.f, this.b);
                break;
        }
    }
}
