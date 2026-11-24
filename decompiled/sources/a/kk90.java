package a;

import android.gov.nist.core.Separators;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.personal.impl.navigation.ChangeLoginScreen;
import org.xplatform.personal.impl.navigation.PersonalScreen$EditProfileScreen;
import org.xplatform.personal.impl.navigation.PersonalScreen$EditProfileTjScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class kk90 extends w46 {
    public final f3c0 A;
    public final p7m0 B;
    public final p7m0 C;
    public final qoj0 D;
    public final ol60 E;
    public boolean F;
    public c4m0 G;
    public bby H;
    public String I;
    public final czt b;
    public final kpt c;
    public final rou d;
    public final u8u e;
    public final zn00 f;
    public final drm0 g;
    public final lme0 h;
    public final qgd i;
    public final m1e j;
    public final sa10 k;
    public final ctf0 l;
    public final mne m;
    public final duj n;
    public final mi70 o;
    public final i1w0 p;
    public final sek q;
    public final ik4 r;
    public final vd1 s;
    public final kl5 t;
    public final ywq0 u;
    public String v;
    public final gle0 w;
    public final yfu x;
    public final v8d y;
    public final sff0 z;

    public kk90(pru pruVar, bzt bztVar, czt cztVar, kpt kptVar, rou rouVar, u8u u8uVar, zn00 zn00Var, drm0 drm0Var, lme0 lme0Var, qgd qgdVar, m1e m1eVar, sa10 sa10Var, ctf0 ctf0Var, mne mneVar, duj dujVar, mi70 mi70Var, i1w0 i1w0Var, sek sekVar, ik4 ik4Var, vd1 vd1Var, kl5 kl5Var, ywq0 ywq0Var, String str, gle0 gle0Var, yfu yfuVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        str.getClass();
        this.b = cztVar;
        this.c = kptVar;
        this.d = rouVar;
        this.e = u8uVar;
        this.f = zn00Var;
        this.g = drm0Var;
        this.h = lme0Var;
        this.i = qgdVar;
        this.j = m1eVar;
        this.k = sa10Var;
        this.l = ctf0Var;
        this.m = mneVar;
        this.n = dujVar;
        this.o = mi70Var;
        this.p = i1w0Var;
        this.q = sekVar;
        this.r = ik4Var;
        this.s = vd1Var;
        this.t = kl5Var;
        this.u = ywq0Var;
        this.v = str;
        this.w = gle0Var;
        this.x = yfuVar;
        this.y = bztVar.f3488a.a();
        sff0 sff0VarA = pruVar.a();
        this.z = sff0VarA;
        this.A = sff0VarA.k;
        this.B = q7m0.a(Boolean.FALSE);
        this.C = q7m0.a(pj90.f27078a);
        this.D = roj0.b(1, 0, i99.b, 2);
        this.E = new ol60(3);
        this.F = true;
        this.I = "";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A(zje zjeVar) {
        zj90 zj90Var;
        if (zjeVar instanceof zj90) {
            zj90Var = (zj90) zjeVar;
            int i = zj90Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zj90Var.k = i - Integer.MIN_VALUE;
            } else {
                zj90Var = new zj90(this, zjeVar);
            }
        } else {
            zj90Var = new zj90(this, zjeVar);
        }
        Object objA = zj90Var.i;
        wne wneVar = wne.f39444a;
        int i2 = zj90Var.k;
        boolean z = false;
        if (i2 == 0) {
            z1x.P(objA);
            zj90Var.k = 1;
            objA = this.d.a(false, zj90Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        jqt0 jqt0Var = ((m2c0) objA).k;
        if (jqt0Var != jqt0.c && jqt0Var != jqt0.d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(zje zjeVar) {
        ak90 ak90Var;
        if (zjeVar instanceof ak90) {
            ak90Var = (ak90) zjeVar;
            int i = ak90Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ak90Var.k = i - Integer.MIN_VALUE;
            } else {
                ak90Var = new ak90(this, zjeVar);
            }
        } else {
            ak90Var = new ak90(this, zjeVar);
        }
        Object objA = ak90Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ak90Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            ak90Var.k = 1;
            objA = this.d.a(false, ak90Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return Boolean.valueOf(!q3d.j(jqt0.e, jqt0.d).contains(((m2c0) objA).k));
    }

    public final void C() {
        if (this.z.N.p) {
            ywq0 ywq0Var = this.u;
            ((zg) ywq0Var.b).f44322a.c("acc_change_log");
            ((au0) ywq0Var.f).f1455a.a(xun.f41520a, 11359L);
        }
        i1w0 i1w0Var = this.p;
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        this.t.getClass();
        k0w0VarI.h(new ChangeLoginScreen());
        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void D() {
        Object obj;
        Iterator it = r3d.r(this.D.d()).iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            sie sieVar = (sie) next;
            sde sdeVar = sieVar instanceof sde ? (sde) sieVar : null;
            if ((sdeVar != null ? sdeVar.f32030a : null) == ej90.FILL_DATA_ITEM) {
                obj = next;
                break;
            }
        }
        if (((sie) obj) == null) {
            return;
        }
        ywq0 ywq0Var = this.u;
        ywq0Var.getClass();
        ((zg) ywq0Var.b).g("acc_personal");
        ((au0) ywq0Var.f).l("acc_personal");
        lxw lxwVar = this.y.p;
        lxw lxwVar2 = lxw.h;
        i1w0 i1w0Var = this.p;
        if (lxwVar == lxwVar2) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            FragmentScreen fragmentScreen = PersonalScreen$EditProfileTjScreen.f46781a;
            if (fragmentScreen instanceof DialogScreen) {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen)));
            } else {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen)));
            }
            ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorO;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            FragmentScreen fragmentScreen2 = PersonalScreen$EditProfileScreen.f46780a;
            if (fragmentScreen2 instanceof DialogScreen) {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen2)));
            } else {
                copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen2)));
            }
            ListIterator listIteratorO2 = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorO2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }

    public final void E() {
        sac.V(jiu0.a(this), dk90.f6220a, null, this.m.f22085a, new ek90(this, null, (byte) 0), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object F(zje zjeVar) {
        ik90 ik90Var;
        if (zjeVar instanceof ik90) {
            ik90Var = (ik90) zjeVar;
            int i = ik90Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ik90Var.k = i - Integer.MIN_VALUE;
            } else {
                ik90Var = new ik90(this, zjeVar);
            }
        } else {
            ik90Var = new ik90(this, zjeVar);
        }
        Object objA = ik90Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ik90Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            ik90Var.k = 1;
            objA = this.d.a(false, ik90Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return Boolean.valueOf(((m2c0) objA).T.length() == 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G(zje zjeVar) {
        jk90 jk90Var;
        if (zjeVar instanceof jk90) {
            jk90Var = (jk90) zjeVar;
            int i = jk90Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                jk90Var.k = i - Integer.MIN_VALUE;
            } else {
                jk90Var = new jk90(this, zjeVar);
            }
        } else {
            jk90Var = new jk90(this, zjeVar);
        }
        Object objA = jk90Var.i;
        wne wneVar = wne.f39444a;
        int i2 = jk90Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            jk90Var.k = 1;
            objA = this.d.a(false, jk90Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return Boolean.valueOf(kotlin.text.c.r(((m2c0) objA).Z, Separators.DOT, "", false).length() == 0);
    }

    public final void H() {
        qj90 qj90Var = new qj90(sa10.b(this.k, pb10.g, R.string.data_retrieval_error, 0, null, 28));
        p7m0 p7m0Var = this.C;
        p7m0Var.getClass();
        p7m0Var.o(null, qj90Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(zje zjeVar) {
        tj90 tj90Var;
        if (zjeVar instanceof tj90) {
            tj90Var = (tj90) zjeVar;
            int i = tj90Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                tj90Var.k = i - Integer.MIN_VALUE;
            } else {
                tj90Var = new tj90(this, zjeVar);
            }
        } else {
            tj90Var = new tj90(this, zjeVar);
        }
        Object objA = tj90Var.i;
        wne wneVar = wne.f39444a;
        int i2 = tj90Var.k;
        boolean z = false;
        if (i2 == 0) {
            z1x.P(objA);
            tj90Var.k = 1;
            objA = this.d.a(false, tj90Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        m2c0 m2c0Var = (m2c0) objA;
        if (m2c0Var.c.length() > 0 && m2c0Var.Z.length() > 0 && this.A.d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3 A[PHI: r2 r10 r11
  0x00a3: PHI (r2v4 boolean) = (r2v3 boolean), (r2v9 boolean) binds: [B:26:0x0079, B:35:0x00a0] A[DONT_GENERATE, DONT_INLINE]
  0x00a3: PHI (r10v4 boolean) = (r10v2 boolean), (r10v17 boolean) binds: [B:26:0x0079, B:35:0x00a0] A[DONT_GENERATE, DONT_INLINE]
  0x00a3: PHI (r11v11 boolean) = (r11v9 boolean), (r11v23 boolean) binds: [B:26:0x0079, B:35:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:41:0x0102  */
    /* JADX WARN: Code duplicated, block: B:42:0x0104 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0110 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x013a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(boolean z, zje zjeVar) {
        uj90 uj90Var;
        boolean z2;
        boolean zBooleanValue;
        Object objA;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        byte b;
        i1w0 i1w0Var;
        if (zjeVar instanceof uj90) {
            uj90Var = (uj90) zjeVar;
            int i = uj90Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                uj90Var.n = i - Integer.MIN_VALUE;
            } else {
                uj90Var = new uj90(this, zjeVar);
            }
        } else {
            uj90Var = new uj90(this, zjeVar);
        }
        Object objB = uj90Var.l;
        Object obj = wne.f39444a;
        int i2 = uj90Var.n;
        f3c0 f3c0Var = this.A;
        if (i2 == 0) {
            z1x.P(objB);
            uj90Var.i = z;
            uj90Var.n = 1;
            objB = B(uj90Var);
            if (objB != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            z = uj90Var.i;
            z1x.P(objB);
        } else {
            if (i2 == 2) {
                boolean z7 = uj90Var.j;
                boolean z8 = uj90Var.i;
                z1x.P(objB);
                z2 = z7;
                z = z8;
                zBooleanValue = ((Boolean) objB).booleanValue();
                if (f3c0Var.f) {
                    uj90Var.i = z;
                    uj90Var.j = z2;
                    uj90Var.k = zBooleanValue;
                    uj90Var.n = 3;
                    objA = A(uj90Var);
                    if (objA != obj) {
                        z3 = z;
                        z4 = zBooleanValue;
                        objB = objA;
                        z5 = z2;
                    }
                    return obj;
                }
                z6 = f3c0Var.f;
                b = 0;
                i1w0Var = this.p;
                if (z6) {
                    i1w0Var.d(new ij90(z, this, b));
                } else if (zBooleanValue) {
                    ywq0 ywq0Var = this.u;
                    ((vd1) ywq0Var.f43384a).f37210a.a("acc_add_phone_call", xp20.f(new Pair("screen", "acc_personal"), new Pair("element", "allert_add_phone")));
                    ((ik4) ywq0Var.g).f14907a.a(tx3.l0(new k1p[]{new j1p("acc_personal", (byte) 0), new j1p("allert_add_phone", (byte) 1)}), 3231L);
                    y(lj90.f20138a);
                } else if (!zBooleanValue || !z2 || z) {
                    if (zBooleanValue && z2 && z) {
                        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                        k0w0VarI.h(this.i.h(true));
                        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorO;
                            if (!pawVar.hasNext()) {
                                break;
                            }
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    } else {
                        i1w0Var.d(new ij90(z, this, b));
                    }
                } else {
                    y(kj90.f18376a);
                }
                return Unit.f46060a;
            }
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z4 = uj90Var.k;
            z5 = uj90Var.j;
            z3 = uj90Var.i;
            z1x.P(objB);
        }
        if (((Boolean) objB).booleanValue() || z3) {
            zBooleanValue = z4;
            z = z3;
            z2 = z5;
            z6 = f3c0Var.f;
            b = 0;
            i1w0Var = this.p;
            if (z6) {
                i1w0Var.d(new ij90(z, this, b));
            } else if (zBooleanValue) {
                ywq0 ywq0Var2 = this.u;
                ((vd1) ywq0Var2.f43384a).f37210a.a("acc_add_phone_call", xp20.f(new Pair("screen", "acc_personal"), new Pair("element", "allert_add_phone")));
                ((ik4) ywq0Var2.g).f14907a.a(tx3.l0(new k1p[]{new j1p("acc_personal", (byte) 0), new j1p("allert_add_phone", (byte) 1)}), 3231L);
                y(lj90.f20138a);
            } else if (!zBooleanValue) {
                if (zBooleanValue) {
                    i1w0Var.d(new ij90(z, this, b));
                } else {
                    i1w0Var.d(new ij90(z, this, b));
                }
            } else if (zBooleanValue) {
                i1w0Var.d(new ij90(z, this, b));
            } else {
                i1w0Var.d(new ij90(z, this, b));
            }
        } else {
            y(jj90.f16610a);
        }
        return Unit.f46060a;
        boolean zBooleanValue2 = ((Boolean) objB).booleanValue();
        uj90Var.i = z;
        uj90Var.j = zBooleanValue2;
        uj90Var.n = 2;
        Object objG = G(uj90Var);
        if (objG != obj) {
            z2 = zBooleanValue2;
            objB = objG;
            zBooleanValue = ((Boolean) objB).booleanValue();
            if (f3c0Var.f) {
                uj90Var.i = z;
                uj90Var.j = z2;
                uj90Var.k = zBooleanValue;
                uj90Var.n = 3;
                objA = A(uj90Var);
                if (objA != obj) {
                    z3 = z;
                    z4 = zBooleanValue;
                    objB = objA;
                    z5 = z2;
                    if (((Boolean) objB).booleanValue()) {
                    }
                    zBooleanValue = z4;
                    z = z3;
                    z2 = z5;
                    z6 = f3c0Var.f;
                    b = 0;
                    i1w0Var = this.p;
                    if (z6) {
                        i1w0Var.d(new ij90(z, this, b));
                    } else if (zBooleanValue) {
                        ywq0 ywq0Var3 = this.u;
                        ((vd1) ywq0Var3.f43384a).f37210a.a("acc_add_phone_call", xp20.f(new Pair("screen", "acc_personal"), new Pair("element", "allert_add_phone")));
                        ((ik4) ywq0Var3.g).f14907a.a(tx3.l0(new k1p[]{new j1p("acc_personal", (byte) 0), new j1p("allert_add_phone", (byte) 1)}), 3231L);
                        y(lj90.f20138a);
                    } else if (!zBooleanValue) {
                        if (zBooleanValue) {
                            i1w0Var.d(new ij90(z, this, b));
                        } else {
                            i1w0Var.d(new ij90(z, this, b));
                        }
                    } else if (zBooleanValue) {
                        i1w0Var.d(new ij90(z, this, b));
                    } else {
                        i1w0Var.d(new ij90(z, this, b));
                    }
                }
            } else {
                z6 = f3c0Var.f;
                b = 0;
                i1w0Var = this.p;
                if (z6) {
                    i1w0Var.d(new ij90(z, this, b));
                } else if (zBooleanValue) {
                    ywq0 ywq0Var4 = this.u;
                    ((vd1) ywq0Var4.f43384a).f37210a.a("acc_add_phone_call", xp20.f(new Pair("screen", "acc_personal"), new Pair("element", "allert_add_phone")));
                    ((ik4) ywq0Var4.g).f14907a.a(tx3.l0(new k1p[]{new j1p("acc_personal", (byte) 0), new j1p("allert_add_phone", (byte) 1)}), 3231L);
                    y(lj90.f20138a);
                } else if (!zBooleanValue) {
                    if (zBooleanValue) {
                        i1w0Var.d(new ij90(z, this, b));
                    } else {
                        i1w0Var.d(new ij90(z, this, b));
                    }
                } else if (zBooleanValue) {
                    i1w0Var.d(new ij90(z, this, b));
                } else {
                    i1w0Var.d(new ij90(z, this, b));
                }
            }
            return Unit.f46060a;
        }
        return obj;
    }

    public final void y(oj90 oj90Var) {
        sac.V(jiu0.a(this), vj90.f37516a, null, this.m.f22085a, new s980(this, oj90Var, null, (byte) 12), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(zje zjeVar) {
        yj90 yj90Var;
        if (zjeVar instanceof yj90) {
            yj90Var = (yj90) zjeVar;
            int i = yj90Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                yj90Var.k = i - Integer.MIN_VALUE;
            } else {
                yj90Var = new yj90(this, zjeVar);
            }
        } else {
            yj90Var = new yj90(this, zjeVar);
        }
        Object objA = yj90Var.i;
        wne wneVar = wne.f39444a;
        int i2 = yj90Var.k;
        byte b = 0;
        if (i2 == 0) {
            z1x.P(objA);
            yj90Var.k = 1;
            objA = this.d.a(false, yj90Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        this.I = ((m2c0) objA).Z;
        this.p.d(new hj90(this, b));
        return Unit.f46060a;
    }
}
