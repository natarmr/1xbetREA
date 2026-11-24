package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class wfy extends ajt implements e540 {
    public final /* synthetic */ byte b;
    public int c;
    public Serializable d;
    public Object e;
    public ljt f;
    public Serializable g;
    public Serializable h;

    public /* synthetic */ wfy(byte b) {
        this.b = b;
    }

    public static wfy h() {
        wfy wfyVar = new wfy((byte) 0);
        wfyVar.d = ufy.g;
        vfy vfyVar = vfy.g;
        wfyVar.e = vfyVar;
        wfyVar.f = vfyVar;
        wfyVar.g = vfyVar;
        wfyVar.h = vfyVar;
        return wfyVar;
    }

    public static wfy i() {
        wfy wfyVar = new wfy((byte) 1);
        wfyVar.d = z2d0.RETURNS_CONSTANT;
        wfyVar.e = Collections.EMPTY_LIST;
        wfyVar.f = g3d0.l;
        wfyVar.g = a3d0.AT_MOST_ONCE;
        wfyVar.h = y2d0.CONCLUSION_CONDITION;
        return wfyVar;
    }

    @Override // a.ajt
    public final z3 c() {
        switch (this.b) {
            case 0:
                xfy xfyVarF = f();
                if (xfyVarF.b()) {
                    return xfyVarF;
                }
                throw new ss3((byte) 28);
            default:
                b3d0 b3d0VarG = g();
                if (b3d0VarG.b()) {
                    return b3d0VarG;
                }
                throw new ss3((byte) 28);
        }
    }

    public final Object clone() {
        switch (this.b) {
            case 0:
                wfy wfyVarH = h();
                wfyVarH.j(f());
                return wfyVarH;
            default:
                wfy wfyVarI = i();
                wfyVarI.m(g());
                return wfyVarI;
        }
    }

    @Override // a.ajt
    public final ajt d(pyc pycVar, sso ssoVar) throws Throwable {
        b3d0 b3d0Var = null;
        xfy xfyVar = null;
        try {
            try {
                switch (this.b) {
                    case 0:
                        try {
                            xfy.k.getClass();
                            j(new xfy(pycVar, ssoVar));
                            return this;
                        } catch (aox e) {
                            xfy xfyVar2 = (xfy) e.f1223a;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                xfyVar = xfyVar2;
                                if (xfyVar != null) {
                                    j(xfyVar);
                                }
                                throw th;
                            }
                        }
                    default:
                        try {
                            b3d0.k.getClass();
                            m(new b3d0(pycVar, ssoVar));
                            return this;
                        } catch (aox e2) {
                            b3d0 b3d0Var2 = (b3d0) e2.f1223a;
                            try {
                                throw e2;
                            } catch (Throwable th2) {
                                th = th2;
                                b3d0Var = b3d0Var2;
                                if (b3d0Var != null) {
                                    m(b3d0Var);
                                }
                                throw th;
                            }
                        }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // a.ajt
    public final /* bridge */ /* synthetic */ ajt e(ljt ljtVar) {
        switch (this.b) {
            case 0:
                j((xfy) ljtVar);
                break;
            default:
                m((b3d0) ljtVar);
                break;
        }
        return this;
    }

    public xfy f() {
        xfy xfyVar = new xfy(this);
        int i = this.c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        xfyVar.c = (ufy) this.d;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        xfyVar.d = (vfy) this.e;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        xfyVar.e = (vfy) this.f;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        xfyVar.f = (vfy) this.g;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        xfyVar.g = (vfy) this.h;
        xfyVar.b = i2;
        return xfyVar;
    }

    public b3d0 g() {
        b3d0 b3d0Var = new b3d0(this);
        int i = this.c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        b3d0Var.c = (z2d0) this.d;
        if ((i & 2) == 2) {
            this.e = Collections.unmodifiableList((List) this.e);
            this.c &= -3;
        }
        b3d0Var.d = (List) this.e;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        b3d0Var.e = (g3d0) this.f;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        b3d0Var.f = (a3d0) this.g;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        b3d0Var.g = (y2d0) this.h;
        b3d0Var.b = i2;
        return b3d0Var;
    }

    public void j(xfy xfyVar) {
        vfy vfyVar;
        vfy vfyVar2;
        vfy vfyVar3;
        vfy vfyVar4;
        ufy ufyVar;
        if (xfyVar == xfy.j) {
            return;
        }
        if ((xfyVar.b & 1) == 1) {
            ufy ufyVar2 = xfyVar.c;
            if ((this.c & 1) != 1 || (ufyVar = (ufy) this.d) == ufy.g) {
                this.d = ufyVar2;
            } else {
                tfy tfyVar = new tfy((byte) 0);
                tfyVar.h(ufyVar);
                tfyVar.h(ufyVar2);
                this.d = tfyVar.f();
            }
            this.c |= 1;
        }
        if ((xfyVar.b & 2) == 2) {
            vfy vfyVar5 = xfyVar.d;
            if ((this.c & 2) != 2 || (vfyVar4 = (vfy) this.e) == vfy.g) {
                this.e = vfyVar5;
            } else {
                tfy tfyVarJ = vfy.j(vfyVar4);
                tfyVarJ.i(vfyVar5);
                this.e = tfyVarJ.g();
            }
            this.c |= 2;
        }
        if (xfyVar.j()) {
            vfy vfyVar6 = xfyVar.e;
            if ((this.c & 4) != 4 || (vfyVar3 = (vfy) this.f) == vfy.g) {
                this.f = vfyVar6;
            } else {
                tfy tfyVarJ2 = vfy.j(vfyVar3);
                tfyVarJ2.i(vfyVar6);
                this.f = tfyVarJ2.g();
            }
            this.c |= 4;
        }
        if ((xfyVar.b & 8) == 8) {
            vfy vfyVar7 = xfyVar.f;
            if ((this.c & 8) != 8 || (vfyVar2 = (vfy) this.g) == vfy.g) {
                this.g = vfyVar7;
            } else {
                tfy tfyVarJ3 = vfy.j(vfyVar2);
                tfyVarJ3.i(vfyVar7);
                this.g = tfyVarJ3.g();
            }
            this.c |= 8;
        }
        if ((xfyVar.b & 16) == 16) {
            vfy vfyVar8 = xfyVar.g;
            if ((this.c & 16) != 16 || (vfyVar = (vfy) this.h) == vfy.g) {
                this.h = vfyVar8;
            } else {
                tfy tfyVarJ4 = vfy.j(vfyVar);
                tfyVarJ4.i(vfyVar8);
                this.h = tfyVarJ4.g();
            }
            this.c |= 16;
        }
        this.f994a = this.f994a.c(xfyVar.f40815a);
    }

    public void m(b3d0 b3d0Var) {
        g3d0 g3d0Var;
        if (b3d0Var == b3d0.j) {
            return;
        }
        if ((b3d0Var.b & 1) == 1) {
            z2d0 z2d0Var = b3d0Var.c;
            z2d0Var.getClass();
            this.c = 1 | this.c;
            this.d = z2d0Var;
        }
        if (!b3d0Var.d.isEmpty()) {
            if (((List) this.e).isEmpty()) {
                this.e = b3d0Var.d;
                this.c &= -3;
            } else {
                if ((this.c & 2) != 2) {
                    this.e = new ArrayList((List) this.e);
                    this.c |= 2;
                }
                ((List) this.e).addAll(b3d0Var.d);
            }
        }
        if ((b3d0Var.b & 2) == 2) {
            g3d0 g3d0Var2 = b3d0Var.e;
            if ((this.c & 4) != 4 || (g3d0Var = (g3d0) this.f) == g3d0.l) {
                this.f = g3d0Var2;
            } else {
                e3d0 e3d0VarG = e3d0.g();
                e3d0VarG.h(g3d0Var);
                e3d0VarG.h(g3d0Var2);
                this.f = e3d0VarG.f();
            }
            this.c |= 4;
        }
        if ((b3d0Var.b & 4) == 4) {
            a3d0 a3d0Var = b3d0Var.f;
            a3d0Var.getClass();
            this.c |= 8;
            this.g = a3d0Var;
        }
        if ((b3d0Var.b & 8) == 8) {
            y2d0 y2d0Var = b3d0Var.g;
            y2d0Var.getClass();
            this.c |= 16;
            this.h = y2d0Var;
        }
        this.f994a = this.f994a.c(b3d0Var.f1897a);
    }
}
