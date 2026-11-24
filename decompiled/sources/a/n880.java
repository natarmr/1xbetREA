package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.xplatform.picker.api.presentation.PickerParams;

/* JADX INFO: loaded from: classes3.dex */
public final class n880 extends i3t0 {
    public static final /* synthetic */ int L = 0;
    public final ivn A;
    public final p4u B;
    public final duj C;
    public final ctf0 D;
    public final tkt0 E;
    public final chf0 F;
    public final czt G;
    public c4m0 H;
    public bby I;
    public bby J;
    public final c4m0 K;
    public final pru o;
    public final vqb p;
    public final x1u q;
    public final gnu r;
    public final ali s;
    public final mne t;
    public final z4w0 u;
    public final cyh v;
    public final nv20 w;
    public final es x;
    public final rpt y;
    public final cmt z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n880(vzg0 vzg0Var, pru pruVar, vqb vqbVar, m1e m1eVar, x1u x1uVar, gnu gnuVar, ali aliVar, mne mneVar, z4w0 z4w0Var, cyh cyhVar, nv20 nv20Var, es esVar, rpt rptVar, cmt cmtVar, ivn ivnVar, p4u p4uVar, duj dujVar, ctf0 ctf0Var, tkt0 tkt0Var, ocl oclVar, chf0 chf0Var, czt cztVar) {
        super(null, new i280((byte) 8), new cz(ctf0Var, oclVar, (byte) 23), cvm0.p(mneVar.f22085a, mneVar.b), null);
        m1eVar.getClass();
        ctf0Var.getClass();
        this.o = pruVar;
        this.p = vqbVar;
        this.q = x1uVar;
        this.r = gnuVar;
        this.s = aliVar;
        this.t = mneVar;
        this.u = z4w0Var;
        this.v = cyhVar;
        this.w = nv20Var;
        this.x = esVar;
        this.y = rptVar;
        this.z = cmtVar;
        this.A = ivnVar;
        this.B = p4uVar;
        this.C = dujVar;
        this.D = ctf0Var;
        this.E = tkt0Var;
        this.F = chf0Var;
        this.G = cztVar;
        c4m0 c4m0Var = this.K;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.K = sac.T(new fnq(m1eVar.a(), new e880(this, null, (byte) 2), (byte) 4), jiu0.a(this), l880.h);
        }
        N();
        M();
    }

    public final void M() {
        Object value;
        bby bbyVar = this.J;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, y780.a((y780) value, null, 0, null, null, null, null, null, null, null, null, false, null, true, false, false, false, 245759)));
            this.J = sac.g0(jiu0.a(this), n880.class.getName().concat(".getCallbackLanguages"), this.t.f22085a, new d880(this, b), new e880(this, null, (byte) 0), 86);
        }
    }

    public final void N() {
        bby bbyVar = this.I;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.I = sac.i0(jiu0.a(this), n880.class.getName().concat(".loadCountry"), 3, 0L, kotlin.collections.a.c(oqt0.class), null, new e880(this, null, b), null, this.t.b, g880.f10854a, null, 596);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object O(String str, ynb0 ynb0Var, Integer num, zje zjeVar) {
        j880 j880Var;
        Object g0g0Var;
        Integer num2;
        n880 n880Var;
        if (zjeVar instanceof j880) {
            j880Var = (j880) zjeVar;
            int i = j880Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                j880Var.m = i - Integer.MIN_VALUE;
            } else {
                j880Var = new j880(this, zjeVar);
            }
        } else {
            j880Var = new j880(this, zjeVar);
        }
        Object objD0 = j880Var.k;
        wne wneVar = wne.f39444a;
        int i2 = j880Var.m;
        try {
            if (i2 == 0) {
                z1x.P(objD0);
                e0g0 e0g0Var = j0g0.b;
                Integer num3 = ((y780) D()).f;
                if (num3 == null) {
                    return Unit.f46060a;
                }
                int iIntValue = num3.intValue();
                nv20 nv20Var = this.w;
                String strReplace = new Regex("[^0-9]").replace(StringsKt.u0(str).toString(), "");
                bt9 bt9Var = ((y780) D()).d;
                String str2 = bt9Var != null ? bt9Var.c : null;
                String str3 = ((y780) D()).l;
                String str4 = ynb0Var.f42933a;
                String str5 = ynb0Var.b;
                j880Var.i = num;
                j880Var.j = this;
                j880Var.m = 1;
                ju9 ju9Var = (ju9) nv20Var.f24171a;
                objD0 = qjj.d0(ju9Var.c.b, new iu9(ju9Var, str4, str5, iIntValue, strReplace, str3, num, str2, null), j880Var);
                if (objD0 == wneVar) {
                    return wneVar;
                }
                num2 = num;
                n880Var = this;
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                n880Var = j880Var.j;
                num2 = j880Var.i;
                z1x.P(objD0);
            }
            n880Var.F.T(num2);
            n880Var.G(new r780(((nu9) objD0).f24138a));
            g0g0Var = Unit.f46060a;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (j0g0.a(g0g0Var) != null) {
            this.F.U("Other");
        }
        z1x.P(g0g0Var);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object P(String str, String str2, zje zjeVar) {
        k880 k880Var;
        String str3;
        String str4;
        String str5;
        String str6;
        Object g0g0Var;
        Object obj;
        List list;
        p7m0 p7m0Var;
        Object value;
        if (zjeVar instanceof k880) {
            k880Var = (k880) zjeVar;
            int i = k880Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                k880Var.m = i - Integer.MIN_VALUE;
            } else {
                k880Var = new k880(this, zjeVar);
            }
        } else {
            k880Var = new k880(this, zjeVar);
        }
        Object objD = k880Var.k;
        wne wneVar = wne.f39444a;
        int i2 = k880Var.m;
        if (i2 == 0) {
            z1x.P(objD);
            try {
                e0g0 e0g0Var = j0g0.b;
                cmt cmtVar = this.z;
                str3 = str;
                try {
                    k880Var.i = str3;
                    str4 = str2;
                    try {
                        k880Var.j = str4;
                        k880Var.m = 1;
                        objD = cmtVar.d(k880Var);
                        if (objD == wneVar) {
                            return wneVar;
                        }
                        str5 = str3;
                        str6 = str4;
                    } catch (Throwable th) {
                        th = th;
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var = new g0g0(th);
                        str5 = str3;
                        str6 = str4;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str4 = str2;
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var = new g0g0(th);
                    str5 = str3;
                    str6 = str4;
                    obj = iun.f15405a;
                    if (g0g0Var instanceof g0g0) {
                        g0g0Var = obj;
                    }
                    list = (List) g0g0Var;
                    if (list.size() == 1) {
                        Q(new Integer(((fp9) CollectionsKt.U(list)).f9917a), str5, str6);
                    } else if (list.size() > 1) {
                        p7m0Var = this.i.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                            this.f.getClass();
                        } while (!p7m0Var.m(value, y780.a((y780) value, null, 0, null, null, null, null, null, null, null, null, false, null, false, false, false, false, 229375)));
                        G(new s780(list));
                    } else {
                        Q(null, str5, str6);
                    }
                    return Unit.f46060a;
                }
            } catch (Throwable th3) {
                th = th3;
                str3 = str;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str6 = k880Var.j;
            str5 = k880Var.i;
            try {
                z1x.P(objD);
            } catch (Throwable th4) {
                th = th4;
                str3 = str5;
                str4 = str6;
                e0g0 e0g0Var4 = j0g0.b;
                g0g0Var = new g0g0(th);
                str5 = str3;
                str6 = str4;
            }
        }
        g0g0Var = (List) objD;
        e0g0 e0g0Var5 = j0g0.b;
        obj = iun.f15405a;
        if (g0g0Var instanceof g0g0) {
            g0g0Var = obj;
        }
        list = (List) g0g0Var;
        if (list.size() == 1) {
            Q(new Integer(((fp9) CollectionsKt.U(list)).f9917a), str5, str6);
        } else if (list.size() > 1) {
            p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, y780.a((y780) value, null, 0, null, null, null, null, null, null, null, null, false, null, false, false, false, false, 229375)));
            G(new s780(list));
        } else {
            Q(null, str5, str6);
        }
        return Unit.f46060a;
    }

    public final void Q(Integer num, String str, String str2) {
        long jA = this.q.a();
        String strN = ohs0.n(str, str2);
        yje yjeVar = null;
        wmq wmqVar = new wmq((Object) this, (Object) str2, (Object) num, yjeVar, (byte) 13);
        d880 d880Var = new d880(this, (byte) 0);
        gk70 gk70Var = new gk70(1, this, n880.class, "handleException", "handleException(Ljava/lang/Throwable;)V", 0, (byte) 25);
        String strValueOf = String.valueOf(jA);
        strValueOf.getClass();
        this.H = sac.T(new dnq(new fnq(this.v.a(new p6a("AddUserCall", strN, strValueOf)), new zm70((Object) wmqVar, (Object) d880Var, yjeVar, (byte) 10), (byte) 4), new gbv(this, yjeVar, (byte) 14), (byte) 0), d5c.S(jiu0.a(this), this.t.c), new nf60(gk70Var, yjeVar, (byte) 29));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object R(String str, String str2, zje zjeVar) {
        m880 m880Var;
        Object g0g0Var;
        if (zjeVar instanceof m880) {
            m880Var = (m880) zjeVar;
            int i = m880Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                m880Var.k = i - Integer.MIN_VALUE;
            } else {
                m880Var = new m880(this, zjeVar);
            }
        } else {
            m880Var = new m880(this, zjeVar);
        }
        Object objB0 = m880Var.i;
        wne wneVar = wne.f39444a;
        int i2 = m880Var.k;
        try {
            if (i2 == 0) {
                z1x.P(objB0);
                e0g0 e0g0Var = j0g0.b;
                vqb vqbVar = this.p;
                m880Var.k = 1;
                objB0 = vqbVar.f37848a.b0(str + str2, m880Var);
                if (objB0 == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objB0);
            }
            g0g0Var = (o4c) objB0;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null && (thA instanceof orv0)) {
            this.F.U("number_error");
        }
        z1x.P(g0g0Var);
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        q780 q780Var = (q780) obj;
        q780Var.getClass();
        super.x(q780Var);
        if (q780Var instanceof d780) {
            if (((d780) q780Var).equals(d780.f5584a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        if (!(q780Var instanceof p780)) {
            t9f.b();
            return;
        }
        p780 p780Var = (p780) q780Var;
        boolean z = p780Var instanceof f780;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            String str = ((f780) p780Var).f9048a;
            p7m0 p7m0Var = ocjVar.f25029a;
            while (true) {
                Object value4 = p7m0Var.getValue();
                value4.getClass();
                oyg0Var.getClass();
                String str2 = str;
                if (p7m0Var.m(value4, y780.a((y780) value4, null, 0, null, null, null, null, null, null, null, null, false, str2, false, false, false, false, 253951))) {
                    return;
                } else {
                    str = str2;
                }
            }
        } else {
            if (p780Var instanceof g780) {
                String str3 = ((g780) p780Var).f10805a;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var2.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value3, y780.a((y780) value3, str3, 0, null, null, "", null, null, null, null, null, false, null, false, false, false, false, 262110)));
                return;
            }
            boolean zEquals = p780Var.equals(h780.f12564a);
            mne mneVar = this.t;
            Object obj2 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            if (zEquals) {
                sac.V(jiu0.a(this), h880.f12615a, null, mneVar.f22085a, new i880(this, null), 10);
                return;
            }
            if (p780Var.equals(j780.f16029a)) {
                List<bt9> list = ((y780) D()).c;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (bt9 bt9Var : list) {
                    bt9Var.getClass();
                    arrayList.add(new jq90(bt9Var.f3171a, bt9Var.b));
                }
                tkt0 tkt0Var = this.E;
                tkt0Var.getClass();
                tkt0Var.f34114a.k(arrayList);
                bt9 bt9Var2 = ((y780) D()).d;
                if (bt9Var2 != null) {
                    G(new w780(new PickerParams.Language(Integer.valueOf(bt9Var2.f3171a))));
                    return;
                }
                return;
            }
            if (p780Var.equals(n780.f23030a)) {
                String str4 = ((y780) D()).h;
                if (str4 == null) {
                    str4 = "";
                }
                this.F.V(str4, ((y780) D()).l);
                sac.V(jiu0.a(this), new gk70(1, this, n880.class, "handleException", "handleException(Ljava/lang/Throwable;)V", 0, (byte) 23), null, mneVar.f22085a, new er60((i3t0) this, (yje) (objArr4 == true ? 1 : 0), (byte) 11), 10);
                return;
            }
            if (p780Var.equals(e780.f7320a)) {
                c4m0 c4m0Var = this.H;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                    return;
                }
                return;
            }
            if (p780Var instanceof i780) {
                this.u.a(((i780) p780Var).f14281a);
                return;
            }
            if (p780Var instanceof o780) {
                int i = ((o780) p780Var).f24774a;
                bvc bvcVarA = jiu0.a(this);
                rwj rwjVar = mneVar.f22085a;
                sac.V(bvcVarA, new gk70(1, this, n880.class, "handleException", "handleException(Ljava/lang/Throwable;)V", 0, (byte) 24), null, rwjVar, new bh0(this, i, objArr3 == true ? 1 : 0, (byte) 19), 10);
                return;
            }
            boolean z2 = true;
            if (p780Var instanceof k780) {
                k780 k780Var = (k780) p780Var;
                int i2 = k780Var.f17808a;
                PickerParams pickerParams = k780Var.b;
                if (pickerParams instanceof PickerParams.Phone) {
                    sac.V(jiu0.a(this), f880.f9094a, null, mneVar.f22085a, new a48(this, i2, z2, objArr2 == true ? 1 : 0, (byte) 1), 10);
                    return;
                }
                if (pickerParams instanceof PickerParams.Language) {
                    for (Object obj3 : ((y780) D()).c) {
                        if (((bt9) obj3).f3171a == i2) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    bt9 bt9Var3 = (bt9) obj2;
                    if (bt9Var3 == null) {
                        return;
                    }
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var3.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value2, y780.a((y780) value2, null, 0, null, bt9Var3, null, null, null, null, null, null, false, null, false, false, false, false, 262135)));
                    return;
                }
                return;
            }
            if (!(p780Var instanceof l780)) {
                if (!p780Var.equals(m780.f21307a)) {
                    t9f.b();
                    return;
                }
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value = p7m0Var4.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var4.m(value, y780.a((y780) value, null, 0, null, null, null, null, null, null, null, null, false, null, true, false, false, false, 114687)));
                bby bbyVar = this.J;
                if (bbyVar == null || !bbyVar.isCancelled()) {
                    return;
                }
                M();
                return;
            }
            l780 l780Var = (l780) p780Var;
            int i3 = l780Var.f19546a;
            boolean z3 = l780Var.b;
            p7m0 p7m0Var5 = ocjVar.f25029a;
            while (true) {
                Object value5 = p7m0Var5.getValue();
                value5.getClass();
                oyg0Var.getClass();
                if (p7m0Var5.m(value5, y780.a((y780) value5, "", 0, null, null, null, null, null, null, null, null, false, null, false, false, false, false, 262142))) {
                    sac.V(jiu0.a(this), f880.f9094a, null, mneVar.f22085a, new a48(this, i3, z3, objArr == true ? 1 : 0, (byte) 1), 10);
                    return;
                }
                i3 = i3;
            }
        }
    }
}
