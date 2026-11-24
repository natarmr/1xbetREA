package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class xqw0 extends orw0 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ pow0 f;
    public final /* synthetic */ wrw0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqw0(wrw0 wrw0Var, pow0 pow0Var, byte b) {
        super(wrw0Var, true);
        this.e = b;
        switch (b) {
            case 1:
                this.f = pow0Var;
                Objects.requireNonNull(wrw0Var);
                this.g = wrw0Var;
                super(wrw0Var, true);
                break;
            case 2:
                this.f = pow0Var;
                Objects.requireNonNull(wrw0Var);
                this.g = wrw0Var;
                super(wrw0Var, true);
                break;
            default:
                this.f = pow0Var;
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
                yow0Var.getGmpAppId(this.f);
                break;
            case 1:
                yow0 yow0Var2 = this.g.f;
                s0x.H(yow0Var2);
                yow0Var2.getCachedAppInstanceId(this.f);
                break;
            case 2:
                yow0 yow0Var3 = this.g.f;
                s0x.H(yow0Var3);
                yow0Var3.generateEventId(this.f);
                break;
            case 3:
                yow0 yow0Var4 = this.g.f;
                s0x.H(yow0Var4);
                yow0Var4.getCurrentScreenName(this.f);
                break;
            default:
                yow0 yow0Var5 = this.g.f;
                s0x.H(yow0Var5);
                yow0Var5.getCurrentScreenClass(this.f);
                break;
        }
    }

    @Override // a.orw0
    public final void b() {
        byte b = this.e;
        pow0 pow0Var = this.f;
        switch (b) {
            case 0:
                pow0Var.u(null);
                break;
            case 1:
                pow0Var.u(null);
                break;
            case 2:
                pow0Var.u(null);
                break;
            case 3:
                pow0Var.u(null);
                break;
            default:
                pow0Var.u(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xqw0(wrw0 wrw0Var, pow0 pow0Var, byte b, boolean z) {
        super(wrw0Var, true);
        this.e = b;
        this.f = pow0Var;
        this.g = wrw0Var;
    }
}
