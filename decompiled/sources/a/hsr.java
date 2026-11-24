package a;

import androidx.fragment.app.Fragment;
import java.util.List;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;

/* JADX INFO: loaded from: classes5.dex */
public final class hsr extends zx5 {
    public static final ek5 r = new ek5(23);
    public final androidx.fragment.app.e o;
    public final sek p;
    public final bek q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsr(androidx.fragment.app.e eVar, glz glzVar, sek sekVar, bek bekVar) {
        super(eVar, glzVar, r);
        glzVar.getClass();
        sekVar.getClass();
        bekVar.getClass();
        this.o = eVar;
        this.p = sekVar;
        this.q = bekVar;
    }

    @Override // a.zx5, a.f5r
    public final boolean A(long j) {
        List<y39> list = ((yz3) this.n).f;
        list.getClass();
        if (!list.isEmpty()) {
            for (y39 y39Var : list) {
                if (y39Var != null) {
                    if (y39Var instanceof w39) {
                        if (((w39) y39Var).f38490a.f.hashCode() == j) {
                            return true;
                        }
                    } else if (y39Var instanceof x39) {
                        if (Integer.hashCode(((x39) y39Var).f40206a.e) == j) {
                            return true;
                        }
                    }
                }
                t9f.b();
            }
        }
        return false;
    }

    @Override // a.f5r
    public final Fragment B(int i) {
        y39 y39Var = (y39) G(i);
        Object obj = null;
        if (y39Var != null) {
            boolean z = y39Var instanceof w39;
            androidx.fragment.app.e eVar = this.o;
            if (z) {
                List listP = eVar.c.p();
                listP.getClass();
                for (Object obj2 : listP) {
                    if (((Fragment) obj2) instanceof wws) {
                        obj = obj2;
                        break;
                    }
                }
                Fragment fragment = (Fragment) obj;
                if (fragment != null) {
                    zb5 zb5Var = new zb5(eVar);
                    zb5Var.n(fragment);
                    zb5Var.i();
                }
                w39 w39Var = (w39) y39Var;
                return this.p.m(w39Var.f38490a, w39Var.b);
            }
            if (y39Var instanceof x39) {
                List listP2 = eVar.c.p();
                listP2.getClass();
                for (Object obj3 : listP2) {
                    if (((Fragment) obj3) instanceof p0t) {
                        obj = obj3;
                        break;
                    }
                }
                Fragment fragment2 = (Fragment) obj;
                if (fragment2 != null) {
                    zb5 zb5Var2 = new zb5(eVar);
                    zb5Var2.n(fragment2);
                    zb5Var2.i();
                }
                GameBroadcastingParams gameBroadcastingParams = ((x39) y39Var).f40206a;
                this.q.getClass();
                p0t.P1.getClass();
                p0t p0tVar = new p0t();
                p0tVar.O1.J(p0tVar, p0t.Q1[1], gameBroadcastingParams);
                return p0tVar;
            }
        }
        t9f.b();
        return null;
    }

    @Override // a.zx5, a.f5r, a.yge0
    public final long e(int i) {
        y39 y39Var = (y39) G(i);
        if (y39Var != null) {
            if (y39Var instanceof w39) {
                return ((w39) y39Var).f38490a.f.hashCode();
            }
            if (y39Var instanceof x39) {
                return Integer.hashCode(((x39) y39Var).f40206a.e);
            }
        }
        t9f.b();
        return 0L;
    }
}
