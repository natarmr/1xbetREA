package a;

import android.app.Activity;
import com.google.android.gms.internal.measurement.zzdd;

/* JADX INFO: loaded from: classes2.dex */
public final class rrw0 extends orw0 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ Activity f;
    public final /* synthetic */ cgp g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rrw0(cgp cgpVar, Activity activity, byte b) {
        super((wrw0) cgpVar.b, true);
        this.e = b;
        switch (b) {
            case 1:
                this.f = activity;
                this.g = cgpVar;
                super((wrw0) cgpVar.b, true);
                break;
            case 2:
                this.f = activity;
                this.g = cgpVar;
                super((wrw0) cgpVar.b, true);
                break;
            case 3:
                this.f = activity;
                this.g = cgpVar;
                super((wrw0) cgpVar.b, true);
                break;
            case 4:
                this.f = activity;
                this.g = cgpVar;
                super((wrw0) cgpVar.b, true);
                break;
            default:
                this.f = activity;
                this.g = cgpVar;
                break;
        }
    }

    @Override // a.orw0
    public final void a() {
        switch (this.e) {
            case 0:
                yow0 yow0Var = ((wrw0) this.g.b).f;
                s0x.H(yow0Var);
                yow0Var.onActivityStartedByScionActivityInfo(zzdd.m(this.f), this.b);
                break;
            case 1:
                yow0 yow0Var2 = ((wrw0) this.g.b).f;
                s0x.H(yow0Var2);
                yow0Var2.onActivityResumedByScionActivityInfo(zzdd.m(this.f), this.b);
                break;
            case 2:
                yow0 yow0Var3 = ((wrw0) this.g.b).f;
                s0x.H(yow0Var3);
                yow0Var3.onActivityPausedByScionActivityInfo(zzdd.m(this.f), this.b);
                break;
            case 3:
                yow0 yow0Var4 = ((wrw0) this.g.b).f;
                s0x.H(yow0Var4);
                yow0Var4.onActivityStoppedByScionActivityInfo(zzdd.m(this.f), this.b);
                break;
            default:
                yow0 yow0Var5 = ((wrw0) this.g.b).f;
                s0x.H(yow0Var5);
                yow0Var5.onActivityDestroyedByScionActivityInfo(zzdd.m(this.f), this.b);
                break;
        }
    }
}
