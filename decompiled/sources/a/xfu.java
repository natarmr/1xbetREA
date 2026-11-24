package a;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;

/* JADX INFO: loaded from: classes5.dex */
public final class xfu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f40810a;

    public xfu(gii0 gii0Var) {
        gii0Var.getClass();
        this.f40810a = new wgn(gii0Var, (byte) 29);
    }

    public p6d a(boolean z) {
        gmq p6dVar;
        lef0 lef0Var = (lef0) this.f40810a;
        p7m0 p7m0VarF = lef0Var.f(z);
        byte b = 1;
        int i = 3;
        yje yjeVar = null;
        if (z) {
            p6dVar = new eu4(new wgq0(-1L, -1L), (byte) 12);
        } else {
            m8l0 m8l0Var = (m8l0) lef0Var.f19899a;
            p6dVar = new p6d(m8l0Var.d, m8l0Var.e, new l8l0(i, yjeVar, (byte) 0), b);
        }
        return new p6d(p7m0VarF, p6dVar, new qos(i, yjeVar, (byte) 7), b);
    }

    public rkv b() {
        cih cihVar = (cih) ((reu) this.f40810a).b;
        c0o c0oVar = rkv.j;
        q7d0 q7d0Var = cihVar.f4414a;
        q7d0Var.getClass();
        return (rkv) c0oVar.get(q7d0Var.a().getInt("SELECTED_HAND_SHAKE_SCREEN", 0));
    }

    public hxs0 c(n3q n3qVar) {
        n3qVar.getClass();
        dgu dguVar = (dgu) this.f40810a;
        return new hxs0(dguVar.h(n3qVar, lgp0.f20019a), dguVar.h(n3qVar, lgp0.b));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Serializable d(long j, zje zjeVar) {
        pgu pguVar;
        Serializable g0g0Var;
        if (zjeVar instanceof pgu) {
            pguVar = (pgu) zjeVar;
            int i = pguVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                pguVar.k = i - Integer.MIN_VALUE;
            } else {
                pguVar = new pgu(this, zjeVar);
            }
        } else {
            pguVar = new pgu(this, zjeVar);
        }
        Object objC = pguVar.i;
        wne wneVar = wne.f39444a;
        int i2 = pguVar.k;
        try {
            if (i2 == 0) {
                z1x.P(objC);
                e0g0 e0g0Var = j0g0.b;
                b8u b8uVar = (b8u) this.f40810a;
                pguVar.k = 1;
                objC = ((k41) b8uVar.f2175a).c(j, pguVar, "EUR");
                if (objC == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objC);
            }
            g0g0Var = "€ " + ((BigDecimal) objC);
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return g0g0Var instanceof g0g0 ? "" : g0g0Var;
    }

    public Object e(int i, zje zjeVar) {
        yse0 yse0Var = (yse0) this.f40810a;
        List list = (List) yse0Var.b.f41413a.get(Integer.valueOf(i));
        return list == null ? qjj.d0(yse0Var.d.b, new u52((Object) yse0Var, i, (yje) null, (byte) 20), zjeVar) : list;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object f(long j, aj00 aj00Var, boolean z, long j2, int i, jvn jvnVar, zje zjeVar) {
        hiu hiuVar;
        if (zjeVar instanceof hiu) {
            hiuVar = (hiu) zjeVar;
            int i2 = hiuVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hiuVar.k = i2 - Integer.MIN_VALUE;
            } else {
                hiuVar = new hiu(this, zjeVar);
            }
        } else {
            hiuVar = new hiu(this, zjeVar);
        }
        hiu hiuVar2 = hiuVar;
        Object objX = hiuVar2.i;
        Object obj = wne.f39444a;
        int i3 = hiuVar2.k;
        if (i3 == 0) {
            z1x.P(objX);
            ouu ouuVar = (ouu) this.f40810a;
            hiuVar2.k = 1;
            objX = ouuVar.x(j, aj00Var, z, j2, i, jvnVar, hiuVar2);
            if (objX == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objX);
        }
        return (List) objX;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(LimitTypeEnum limitTypeEnum, zje zjeVar) {
        hhu hhuVar;
        if (zjeVar instanceof hhu) {
            hhuVar = (hhu) zjeVar;
            int i = hhuVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                hhuVar.l = i - Integer.MIN_VALUE;
            } else {
                hhuVar = new hhu(this, zjeVar);
            }
        } else {
            hhuVar = new hhu(this, zjeVar);
        }
        Object objA = hhuVar.j;
        wne wneVar = wne.f39444a;
        int i2 = hhuVar.l;
        Object obj = null;
        if (i2 == 0) {
            z1x.P(objA);
            ciu ciuVar = (ciu) this.f40810a;
            hhuVar.i = limitTypeEnum;
            hhuVar.l = 1;
            objA = ciuVar.a(hhuVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            limitTypeEnum = hhuVar.i;
            z1x.P(objA);
        }
        for (Object obj2 : (Iterable) objA) {
            if (((kzz) obj2).f19172a == limitTypeEnum) {
                obj = obj2;
                break;
            }
        }
        kzz kzzVar = (kzz) obj;
        return kzzVar == null ? kzz.i : kzzVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object h(long j, long j2, zje zjeVar) {
        fyu fyuVar;
        if (zjeVar instanceof fyu) {
            fyuVar = (fyu) zjeVar;
            int i = fyuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fyuVar.k = i - Integer.MIN_VALUE;
            } else {
                fyuVar = new fyu(this, zjeVar);
            }
        } else {
            fyuVar = new fyu(this, zjeVar);
        }
        fyu fyuVar2 = fyuVar;
        Object obj = fyuVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = fyuVar2.k;
        if (i2 != 0) {
            if (i2 == 1) {
                z1x.P(obj);
                return ((j0g0) obj).f15681a;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        ouu ouuVar = (ouu) this.f40810a;
        fyuVar2.k = 1;
        Serializable serializableY = ouuVar.y(j, j2, fyuVar2);
        return serializableY == wneVar ? wneVar : serializableY;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object i(long j, Long l, int i, zje zjeVar) {
        rru rruVar;
        if (zjeVar instanceof rru) {
            rruVar = (rru) zjeVar;
            int i2 = rruVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rruVar.k = i2 - Integer.MIN_VALUE;
            } else {
                rruVar = new rru(this, zjeVar);
            }
        } else {
            rruVar = new rru(this, zjeVar);
        }
        rru rruVar2 = rruVar;
        Object obj = rruVar2.i;
        wne wneVar = wne.f39444a;
        int i3 = rruVar2.k;
        if (i3 != 0) {
            if (i3 == 1) {
                z1x.P(obj);
                return ((j0g0) obj).f15681a;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        if (l == null || l.longValue() <= 0) {
            e0g0 e0g0Var = j0g0.b;
            return new g0g0(new ff5(null));
        }
        nvu nvuVar = (nvu) this.f40810a;
        long jLongValue = l.longValue();
        rruVar2.k = 1;
        Object objZ = nvuVar.z(i, j, jLongValue, rruVar2);
        return objZ == wneVar ? wneVar : objZ;
    }

    public xfu(ovf ovfVar) {
        ovfVar.getClass();
        this.f40810a = ovfVar;
    }

    public xfu(twz twzVar) {
        twzVar.getClass();
        this.f40810a = twzVar;
    }

    public xfu(xs70 xs70Var) {
        xs70Var.getClass();
        this.f40810a = xs70Var;
    }

    public xfu(j1q0 j1q0Var) {
        j1q0Var.getClass();
        this.f40810a = j1q0Var;
    }

    public xfu(zkg zkgVar) {
        zkgVar.getClass();
        this.f40810a = zkgVar;
    }

    public xfu(zz90 zz90Var) {
        zz90Var.getClass();
        this.f40810a = zz90Var;
    }

    public xfu(ino inoVar) {
        inoVar.getClass();
        this.f40810a = inoVar;
    }

    public xfu(qi10 qi10Var) {
        qi10Var.getClass();
        this.f40810a = qi10Var;
    }

    public xfu(yse0 yse0Var) {
        yse0Var.getClass();
        this.f40810a = yse0Var;
    }

    public /* synthetic */ xfu(Object obj) {
        this.f40810a = obj;
    }
}
