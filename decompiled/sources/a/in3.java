package a;

import java.util.Arrays;
import kotlin.Unit;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class in3 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15053a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ on3 c;

    public /* synthetic */ in3(kmq kmqVar, on3 on3Var, byte b) {
        this.f15053a = b;
        this.b = kmqVar;
        this.c = on3Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        hn3 hn3Var;
        hbk0 hbk0VarK;
        ok3 lk3Var;
        String str;
        String strA;
        kn3 kn3Var;
        Object wm3Var;
        Integer num;
        byte b = this.f15053a;
        on3 on3Var = this.c;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof hn3) {
                    hn3Var = (hn3) yjeVar;
                    int i = hn3Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        hn3Var.j = i - Integer.MIN_VALUE;
                    } else {
                        hn3Var = new hn3(this, yjeVar);
                    }
                } else {
                    hn3Var = new hn3(this, yjeVar);
                }
                Object obj2 = hn3Var.i;
                wne wneVar = wne.f39444a;
                int i2 = hn3Var.j;
                if (i2 != 0) {
                    if (i2 == 1) {
                        z1x.P(obj2);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj2);
                um3 um3Var = (um3) obj;
                bb6 bb6Var = on3Var.f;
                ctf0 ctf0Var = on3Var.e;
                um3Var.getClass();
                bb6Var.getClass();
                ctf0Var.getClass();
                tm3 tm3Var = um3Var.b;
                iy3 iy3Var = um3Var.f35902a;
                qm3 qm3Var = tm3Var.d;
                rm3 rm3Var = tm3Var.c;
                int iOrdinal = qm3Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        oc5 oc5Var = um3Var.d;
                        if (oc5Var == null) {
                            str = null;
                        } else if (iy3Var instanceof gy3) {
                            str = oc5Var.f25012a;
                        } else if (iy3Var instanceof ey3) {
                            str = oc5Var.b;
                        } else if ((iy3Var instanceof fy3) || (iy3Var instanceof hy3)) {
                            str = oc5Var.c;
                        } else {
                            t9f.b();
                        }
                        if (str == null) {
                            str = "";
                        }
                        if (str.length() == 0) {
                            hbk0VarK = m0x0.K(um3Var, bb6Var, ctf0Var);
                        } else {
                            hbk0VarK = new bbk0(iy3Var, new y0x(new tyw(str, m0x0.M(bb6Var, ctf0Var, iy3Var), false), ctf0.b(R.attr.uikitSplashBackground, ctf0Var)));
                        }
                    } else if (iOrdinal == 2) {
                        if (iy3Var instanceof ey3) {
                            strA = ctf0Var.b.a(R.string.app_update_background_lottie_1_17, Arrays.copyOf(new Object[0], 0));
                        } else if (iy3Var instanceof gy3) {
                            strA = ctf0Var.b.a(R.string.app_update_background_lottie_1_2, Arrays.copyOf(new Object[0], 0));
                        } else if (iy3Var instanceof hy3) {
                            strA = ctf0Var.b.a(R.string.app_update_background_lottie_1_12, Arrays.copyOf(new Object[0], 0));
                        } else if (iy3Var instanceof fy3) {
                            strA = ctf0Var.b.a(R.string.app_update_background_lottie_1_12, Arrays.copyOf(new Object[0], 0));
                        } else {
                            t9f.b();
                        }
                        int iA = bb6Var.a(strA, dkq.RAW);
                        hbk0VarK = iA != 0 ? new cbk0(iy3Var, iA, m0x0.L(bb6Var, ctf0Var, iy3Var, true)) : m0x0.K(um3Var, bb6Var, ctf0Var);
                    } else if (iOrdinal == 3) {
                        an3 an3Var = um3Var.c;
                        hbk0VarK = an3Var != null ? new gbk0(iy3Var, an3Var.f1131a, an3Var.b) : m0x0.K(um3Var, bb6Var, ctf0Var);
                    } else {
                        t9f.b();
                    }
                    return null;
                }
                hbk0VarK = m0x0.K(um3Var, bb6Var, ctf0Var);
                int iOrdinal2 = tm3Var.b.ordinal();
                if (iOrdinal2 == 0) {
                    lsm0 lsm0Var = ctf0Var.b;
                    lk3Var = new lk3(lsm0Var.a(R.string.update_available, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.app_update_description, Arrays.copyOf(new Object[0], 0)), pk3.a(um3Var, ctf0Var), new nl3(lsm0Var.a(R.string.app_is_updated, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.update_app_description, Arrays.copyOf(new Object[0], 0)), s5x0.S(rm3Var, bb6Var, ctf0Var)));
                } else if (iOrdinal2 == 1) {
                    lsm0 lsm0Var2 = ctf0Var.b;
                    lk3Var = new nk3(lsm0Var2.a(R.string.app_update_description, Arrays.copyOf(new Object[0], 0)), pk3.a(um3Var, ctf0Var), new pl3(rm3Var != rm3.CIRCLE ? lsm0Var2.a(R.string.app_update_downloading, Arrays.copyOf(new Object[0], 0)) : "", s5x0.S(rm3Var, bb6Var, ctf0Var)));
                } else {
                    if (iOrdinal2 != 2) {
                        t9f.b();
                        return null;
                    }
                    lsm0 lsm0Var3 = ctf0Var.b;
                    lk3Var = new mk3(lsm0Var3.a(R.string.update_available, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.app_updating, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.app_update_description, Arrays.copyOf(new Object[0], 0)), pk3.a(um3Var, ctf0Var), new ol3(s5x0.S(rm3Var, bb6Var, ctf0Var)));
                }
                vm3 vm3Var = new vm3(hbk0VarK, lk3Var);
                hn3Var.j = 1;
                if (kmqVar.a(vm3Var, hn3Var) == wneVar) {
                    return wneVar;
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof kn3) {
                    kn3Var = (kn3) yjeVar;
                    int i3 = kn3Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        kn3Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        kn3Var = new kn3(this, yjeVar);
                    }
                } else {
                    kn3Var = new kn3(this, yjeVar);
                }
                Object obj3 = kn3Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = kn3Var.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    um3 um3Var2 = (um3) obj;
                    ctf0 ctf0Var2 = on3Var.e;
                    um3Var2.getClass();
                    ctf0Var2.getClass();
                    boolean z = um3Var2.j;
                    if (!z || (num = um3Var2.g) == null) {
                        boolean z2 = um3Var2.i;
                        boolean z3 = um3Var2.h;
                        if (z2) {
                            wm3Var = new xm3(um3Var2.l ? ctf0Var2.b.a(R.string.full_storage, Arrays.copyOf(new Object[0], 0)) : ctf0Var2.b.a(R.string.error_update_and_apologize, Arrays.copyOf(new Object[0], 0)), !z3, um3Var2.m);
                        } else {
                            wm3Var = new wm3(!z3, um3Var2.e, um3Var2.k, z);
                        }
                    } else {
                        wm3Var = new ym3(num.intValue());
                    }
                    kn3Var.j = 1;
                    if (kmqVar.a(wm3Var, kn3Var) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
        }
    }
}
