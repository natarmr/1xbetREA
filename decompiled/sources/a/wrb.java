package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class wrb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f39632a;
    public final c6q0 b;
    public final c6q0 c;
    public final c6q0 d;
    public final mtl e;
    public final boolean f;

    public wrb(imm immVar, c6q0 c6q0Var, c6q0 c6q0Var2, c6q0 c6q0Var3, mtl mtlVar, boolean z) {
        this.f39632a = immVar;
        this.b = c6q0Var;
        this.c = c6q0Var2;
        this.d = c6q0Var3;
        this.e = mtlVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrb)) {
            return false;
        }
        wrb wrbVar = (wrb) obj;
        return this.f39632a.equals(wrbVar.f39632a) && this.b.equals(wrbVar.b) && this.c.equals(wrbVar.c) && this.d.equals(wrbVar.d) && this.e.equals(wrbVar.e) && this.f == wrbVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + cs0.b(this.e.f22376a, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f39632a.hashCode() * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ChangePinCodeUiState(navigationBarUiModel=" + this.f39632a + ", oldPinCodeTextFieldModel=" + this.b + ", newPinCodeTextFieldModel=" + this.c + ", repeatPinCodeTextFieldModel=" + this.d + ", bottomBarStyle=" + this.e + ", isFocusOnError=" + this.f + Separators.RPAREN;
    }
}
