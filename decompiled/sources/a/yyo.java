package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yyo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f43475a;
    public final c6q0 b;
    public final c6q0 c;
    public final c6q0 d;
    public final boolean e;
    public final zrm f;
    public final List g;
    public final wul h;
    public final mtl i;
    public final yxo j;

    public yyo(imm immVar, c6q0 c6q0Var, c6q0 c6q0Var2, c6q0 c6q0Var3, boolean z, zrm zrmVar, List list, wul wulVar, mtl mtlVar, yxo yxoVar) {
        list.getClass();
        this.f43475a = immVar;
        this.b = c6q0Var;
        this.c = c6q0Var2;
        this.d = c6q0Var3;
        this.e = z;
        this.f = zrmVar;
        this.g = list;
        this.h = wulVar;
        this.i = mtlVar;
        this.j = yxoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyo)) {
            return false;
        }
        yyo yyoVar = (yyo) obj;
        return this.f43475a.equals(yyoVar.f43475a) && this.b.equals(yyoVar.b) && this.c.equals(yyoVar.c) && this.d.equals(yyoVar.d) && this.e == yyoVar.e && this.f.equals(yyoVar.f) && Intrinsics.d(this.g, yyoVar.g) && this.h.equals(yyoVar.h) && this.i.equals(yyoVar.i) && this.j == yyoVar.j;
    }

    public final int hashCode() {
        int iB = cs0.b(this.i.f22376a, i8i.a(this.h, dw9.a((this.f.hashCode() + brm0.e((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f43475a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e)) * 31, 31, this.g), 31), 31);
        yxo yxoVar = this.j;
        return iB + (yxoVar == null ? 0 : yxoVar.hashCode());
    }

    public final String toString() {
        return "FastChangePasswordUiState(navigationBar=" + this.f43475a + ", oldPassTextFieldModel=" + this.b + ", newPassTextFieldModel=" + this.c + ", repeatPassTextFieldModel=" + this.d + ", showPasswordRequirements=" + this.e + ", requirementForPassTitle=" + this.f + ", requirementForPassDescription=" + this.g + ", forgotPasswordButton=" + this.h + ", bottomBar=" + this.i + ", focusField=" + this.j + Separators.RPAREN;
    }
}
