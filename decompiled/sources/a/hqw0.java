package a;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class hqw0 extends orw0 {
    public final /* synthetic */ byte e = 2;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ wrw0 i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqw0(wrw0 wrw0Var, String str, String str2, Object obj, boolean z) {
        super(wrw0Var, true);
        this.f = str;
        this.g = str2;
        this.j = obj;
        this.h = z;
        Objects.requireNonNull(wrw0Var);
        this.i = wrw0Var;
    }

    @Override // a.orw0
    public final void a() {
        switch (this.e) {
            case 0:
                yow0 yow0Var = this.i.f;
                s0x.H(yow0Var);
                yow0Var.setUserProperty(this.f, this.g, new aa60(this.j), this.h, this.f25755a);
                break;
            case 1:
                yow0 yow0Var2 = this.i.f;
                s0x.H(yow0Var2);
                yow0Var2.getUserProperties(this.f, this.g, this.h, (pow0) this.j);
                break;
            default:
                long j = this.f25755a;
                long j2 = this.b;
                yow0 yow0Var3 = this.i.f;
                s0x.H(yow0Var3);
                yow0Var3.logEventWithElapsedTime(this.f, this.g, (Bundle) this.j, this.h, true, j, j2);
                break;
        }
    }

    @Override // a.orw0
    public void b() {
        switch (this.e) {
            case 1:
                ((pow0) this.j).u(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqw0(wrw0 wrw0Var, String str, String str2, Bundle bundle, boolean z) {
        super(wrw0Var, true);
        this.f = str;
        this.g = str2;
        this.j = bundle;
        this.h = z;
        this.i = wrw0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqw0(wrw0 wrw0Var, String str, String str2, boolean z, pow0 pow0Var) {
        super(wrw0Var, true);
        this.f = str;
        this.g = str2;
        this.h = z;
        this.j = pow0Var;
        Objects.requireNonNull(wrw0Var);
        this.i = wrw0Var;
    }
}
