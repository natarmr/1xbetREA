package a;

import android.view.autofill.AutofillValue;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wai0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e7z f38828a;
    public final vun b;
    public final gkx c;
    public final vy40 d = new vy40(2);

    public wai0(e7z e7zVar, vun vunVar, ey40 ey40Var) {
        this.f38828a = e7zVar;
        this.b = vunVar;
        this.c = ey40Var;
    }

    public final tai0 a() {
        return new tai0(this.b, false, this.f38828a, new nai0());
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(e7z e7zVar, nai0 nai0Var) {
        jy2 jy2Var;
        jy2 jy2Var2;
        String str;
        String str2;
        evq0 evq0Var;
        evq0 evq0Var2;
        ez2 ez2Var;
        ez2 ez2Var2;
        vy40 vy40Var = this.d;
        Object[] objArr = vy40Var.f38232a;
        int i = vy40Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            jw2 jw2Var = (jw2) objArr[i2];
            jw2Var.getClass();
            nai0 nai0VarX = e7zVar.x();
            int i3 = e7zVar.b;
            j910 j910Var = jw2Var.f17231a;
            AndroidComposeView androidComposeView = jw2Var.c;
            if (nai0Var != null) {
                Object objG = nai0Var.f23193a.g(xai0.s);
                if (objG == null) {
                    objG = null;
                }
                jy2Var = (jy2) objG;
            } else {
                jy2Var = null;
            }
            if (nai0VarX != null) {
                Object objG2 = nai0VarX.f23193a.g(xai0.s);
                if (objG2 == null) {
                    objG2 = null;
                }
                jy2Var2 = (jy2) objG2;
            } else {
                jy2Var2 = null;
            }
            jy2 jy2Var3 = rv00.h;
            if (!Intrinsics.d(jy2Var2, jy2Var3)) {
                if (Intrinsics.d(jy2Var, jy2Var3) && !Intrinsics.d(jy2Var2, jy2Var3)) {
                    j910Var.z(androidComposeView, i3, true);
                }
                if (nai0Var != null) {
                    Object objG3 = nai0Var.f23193a.g(xai0.F);
                    if (objG3 == null) {
                        objG3 = null;
                    }
                    j83 j83Var = (j83) objG3;
                    if (j83Var != null) {
                        str = j83Var.b;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (nai0VarX != null) {
                    Object objG4 = nai0VarX.f23193a.g(xai0.F);
                    if (objG4 == null) {
                        objG4 = null;
                    }
                    j83 j83Var2 = (j83) objG4;
                    if (j83Var2 != null) {
                        str2 = j83Var2.b;
                    } else {
                        str2 = null;
                    }
                } else {
                    str2 = null;
                }
                if (str != str2) {
                    if (str == null) {
                        j910Var.z(androidComposeView, i3, true);
                    } else if (str2 == null) {
                        j910Var.z(androidComposeView, i3, false);
                    } else if (Intrinsics.d(jy2Var2, rv00.i)) {
                        j910Var.m().notifyValueChanged(androidComposeView, i3, AutofillValue.forText(zgc.T(str2)));
                    }
                }
                if (nai0Var != null) {
                    Object objG5 = nai0Var.f23193a.g(xai0.L);
                    if (objG5 == null) {
                        objG5 = null;
                    }
                    evq0Var = (evq0) objG5;
                } else {
                    evq0Var = null;
                }
                if (nai0VarX != null) {
                    Object objG6 = nai0VarX.f23193a.g(xai0.L);
                    if (objG6 == null) {
                        objG6 = null;
                    }
                    evq0Var2 = (evq0) objG6;
                } else {
                    evq0Var2 = null;
                }
                if (evq0Var != evq0Var2) {
                    if (evq0Var == null) {
                        j910Var.z(androidComposeView, i3, true);
                    } else if (evq0Var2 == null) {
                        j910Var.z(androidComposeView, i3, false);
                    } else if (Intrinsics.d(jy2Var2, rv00.j)) {
                        int iOrdinal = evq0Var2.ordinal();
                        Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                        if (bool != null) {
                            j910Var.m().notifyValueChanged(androidComposeView, i3, AutofillValue.forToggle(bool.booleanValue()));
                        }
                    }
                }
                if (nai0Var != null) {
                    Object objG7 = nai0Var.f23193a.g(xai0.t);
                    if (objG7 == null) {
                        objG7 = null;
                    }
                    ez2Var = (ez2) objG7;
                } else {
                    ez2Var = null;
                }
                if (nai0VarX != null) {
                    Object objG8 = nai0VarX.f23193a.g(xai0.t);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    ez2Var2 = (ez2) objG8;
                } else {
                    ez2Var2 = null;
                }
                if (!Intrinsics.d(ez2Var, ez2Var2)) {
                    if (ez2Var == null) {
                        j910Var.z(androidComposeView, i3, true);
                    } else if (ez2Var2 == null) {
                        j910Var.z(androidComposeView, i3, false);
                    } else {
                        j910Var.m().notifyValueChanged(androidComposeView, i3, ez2Var2.f8652a);
                    }
                }
            } else if (!Intrinsics.d(jy2Var, jy2Var3)) {
                j910Var.z(androidComposeView, i3, false);
            }
            boolean z = nai0Var != null && nai0Var.f23193a.b(xai0.r);
            boolean z2 = nai0VarX != null && nai0VarX.f23193a.b(xai0.r);
            if (z != z2) {
                fy40 fy40Var = jw2Var.h;
                if (z2) {
                    fy40Var.a(i3);
                } else {
                    fy40Var.g(i3);
                }
            }
        }
    }
}
