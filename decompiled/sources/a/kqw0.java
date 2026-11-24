package a;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class kqw0 extends orw0 {
    public final /* synthetic */ byte e = 2;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ wrw0 h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqw0(wrw0 wrw0Var, zzdd zzddVar, String str, String str2) {
        super(wrw0Var, true);
        this.i = zzddVar;
        this.f = str;
        this.g = str2;
        Objects.requireNonNull(wrw0Var);
        this.h = wrw0Var;
    }

    @Override // a.orw0
    public final void a() {
        switch (this.e) {
            case 0:
                yow0 yow0Var = this.h.f;
                s0x.H(yow0Var);
                yow0Var.clearConditionalUserProperty(this.f, this.g, (Bundle) this.i);
                break;
            case 1:
                yow0 yow0Var2 = this.h.f;
                s0x.H(yow0Var2);
                yow0Var2.getConditionalUserProperties(this.f, this.g, (pow0) this.i);
                break;
            default:
                yow0 yow0Var3 = this.h.f;
                s0x.H(yow0Var3);
                yow0Var3.setCurrentScreenByScionActivityInfo((zzdd) this.i, this.f, this.g, this.f25755a);
                break;
        }
    }

    @Override // a.orw0
    public void b() {
        switch (this.e) {
            case 1:
                ((pow0) this.i).u(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqw0(wrw0 wrw0Var, String str, String str2, pow0 pow0Var) {
        super(wrw0Var, true);
        this.f = str;
        this.g = str2;
        this.i = pow0Var;
        Objects.requireNonNull(wrw0Var);
        this.h = wrw0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqw0(wrw0 wrw0Var, String str, String str2, Bundle bundle) {
        super(wrw0Var, true);
        this.f = str;
        this.g = str2;
        this.i = bundle;
        Objects.requireNonNull(wrw0Var);
        this.h = wrw0Var;
    }
}
