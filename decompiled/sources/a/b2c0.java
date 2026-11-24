package a;

import android.javax.sip.message.Response;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.personal.impl.presentation.edit_tj.models.EditProfileTjItemEnum;
import org.xplatform.personal.impl.presentation.edit_tj.models.ProfileEditTjUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class b2c0 extends i3t0 {
    public static final List C = q3d.j('-', '.', '\'', ' ', ',', '/');
    public final z4w0 A;
    public final eyg0 B;
    public final vzg0 o;
    public final rou p;
    public final pru q;
    public final duj r;
    public final mne s;
    public final i1w0 t;
    public final ctf0 u;
    public final w4p0 v;
    public final mi70 w;
    public final iqi x;
    public final x1u y;
    public final cyh z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2c0(vzg0 vzg0Var, rou rouVar, pru pruVar, duj dujVar, mne mneVar, i1w0 i1w0Var, ctf0 ctf0Var, w4p0 w4p0Var, mi70 mi70Var, iqi iqiVar, x1u x1uVar, cyh cyhVar, z4w0 z4w0Var, eyg0 eyg0Var) {
        super(null, new npa0((byte) 22), new iv80(ctf0Var, (byte) 6), cvm0.p(mneVar.c, mneVar.f22085a), null);
        i1w0Var.getClass();
        ctf0Var.getClass();
        this.o = vzg0Var;
        this.p = rouVar;
        this.q = pruVar;
        this.r = dujVar;
        this.s = mneVar;
        this.t = i1w0Var;
        this.u = ctf0Var;
        this.v = w4p0Var;
        this.w = mi70Var;
        this.x = iqiVar;
        this.y = x1uVar;
        this.z = cyhVar;
        this.A = z4w0Var;
        this.B = eyg0Var;
        sac.V(jiu0.a(this), new r1c0(this, (byte) 1), null, mneVar.b, new c670(this, null, (byte) 21), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e0, code lost:
    
        if (R(r0) == r1) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(a.zje r15) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b2c0.M(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(zje zjeVar) {
        v1c0 v1c0Var;
        Object value;
        if (zjeVar instanceof v1c0) {
            v1c0Var = (v1c0) zjeVar;
            int i = v1c0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                v1c0Var.k = i - Integer.MIN_VALUE;
            } else {
                v1c0Var = new v1c0(this, zjeVar);
            }
        } else {
            v1c0Var = new v1c0(this, zjeVar);
        }
        Object objK = v1c0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = v1c0Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objK);
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, p1c0.a((p1c0) value, true, null, false, 14)));
            vsg0 vsg0Var = new vsg0(new nv(new fnq(this.z.a(new p6a(String.valueOf(this.y.a()), (byte) 6)), new s980(this, yjeVar, (byte) 28), (byte) 4), yjeVar, (byte) 5));
            v1c0Var.k = 1;
            objK = ntb.K(vsg0Var, v1c0Var);
            if (objK == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objK);
        }
        return (ynb0) objK;
    }

    public final String O(int i) {
        ctf0 ctf0Var = this.u;
        if (i != 0) {
            return i != 1 ? "" : ctf0Var.b.a(R.string.resident, Arrays.copyOf(new Object[0], 0));
        }
        return ctf0Var.b.a(R.string.not_resident, Arrays.copyOf(new Object[0], 0));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x00bb  */
    public final void P(String str, Throwable th) {
        uhi0 uhi0Var;
        Integer num;
        uhi0 uhi0Var2;
        Integer num2;
        uhi0 uhi0Var3;
        Integer num3;
        Object value;
        EditProfileTjItemEnum editProfileTjItemEnum;
        if (!(th instanceof ypn)) {
            boolean z = th instanceof zhi0;
            if (z && (uhi0Var3 = ((zhi0) th).d) != null && (num3 = uhi0Var3.c) != null && num3.intValue() == 400) {
                G(m1c0.f21001a);
                return;
            }
            ctf0 ctf0Var = this.u;
            if (z && (uhi0Var2 = ((zhi0) th).d) != null && (num2 = uhi0Var2.c) != null && num2.intValue() == 422) {
                G(new k1c0(ctf0Var.b.a(R.string.user_already_registered, Arrays.copyOf(new Object[0], 0))));
                return;
            }
            if (!z || (uhi0Var = ((zhi0) th).d) == null || (num = uhi0Var.c) == null || num.intValue() != 500) {
                G(new k1c0(str));
                return;
            } else {
                G(new k1c0(ctf0Var.b.a(R.string.error_get_data, Arrays.copyOf(new Object[0], 0))));
                return;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(((p1c0) D()).b);
        for (cqn cqnVar : ((ypn) th).f43039a) {
            nek nekVar = EditProfileTjItemEnum.f46794a;
            String str2 = cqnVar.b;
            nekVar.getClass();
            switch (str2) {
                case "CountryId":
                    editProfileTjItemEnum = EditProfileTjItemEnum.l;
                    break;
                case "RegionId":
                    editProfileTjItemEnum = EditProfileTjItemEnum.m;
                    break;
                case "Surname":
                    editProfileTjItemEnum = EditProfileTjItemEnum.f;
                    break;
                case "Inn":
                    editProfileTjItemEnum = EditProfileTjItemEnum.q;
                    break;
                case "Sex":
                    editProfileTjItemEnum = EditProfileTjItemEnum.j;
                    break;
                case "Name":
                    editProfileTjItemEnum = EditProfileTjItemEnum.g;
                    break;
                case "Address":
                    editProfileTjItemEnum = EditProfileTjItemEnum.o;
                    break;
                case "PassportNumber":
                    editProfileTjItemEnum = EditProfileTjItemEnum.p;
                    break;
                case "Birthday":
                    editProfileTjItemEnum = EditProfileTjItemEnum.i;
                    break;
                case "MiddleName":
                    editProfileTjItemEnum = EditProfileTjItemEnum.h;
                    break;
                case "CityId":
                    editProfileTjItemEnum = EditProfileTjItemEnum.n;
                    break;
                default:
                    editProfileTjItemEnum = EditProfileTjItemEnum.b;
                    break;
            }
            Object obj = linkedHashMap.get(editProfileTjItemEnum);
            ProfileEditTjUiModel.ProfileEditItemTjUiModel profileEditItemTjUiModel = obj instanceof ProfileEditTjUiModel.ProfileEditItemTjUiModel ? (ProfileEditTjUiModel.ProfileEditItemTjUiModel) obj : null;
            if (profileEditItemTjUiModel == null) {
                return;
            }
            ProfileEditTjUiModel.ProfileEditItemTjUiModel profileEditItemTjUiModelA = ProfileEditTjUiModel.ProfileEditItemTjUiModel.a(profileEditItemTjUiModel, null, false, false, cqnVar.f4803a, 255);
            this.o.e(agc.J(editProfileTjItemEnum), profileEditItemTjUiModelA);
            linkedHashMap.put(editProfileTjItemEnum, profileEditItemTjUiModelA);
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, p1c0.a((p1c0) value, false, xp20.n(linkedHashMap), false, 13)));
    }

    public final void Q(String str, int i, EditProfileTjItemEnum editProfileTjItemEnum) {
        Object value;
        LinkedHashMap linkedHashMap = new LinkedHashMap(((p1c0) D()).b);
        Object obj = linkedHashMap.get(editProfileTjItemEnum);
        ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModel = obj instanceof ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel ? (ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel) obj : null;
        if (profileEditItemClickableTjUiModel == null) {
            return;
        }
        ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModelA = ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel.a(profileEditItemClickableTjUiModel, str, i, false, false, Response.VERSION_NOT_SUPPORTED);
        this.o.e(agc.J(editProfileTjItemEnum), profileEditItemClickableTjUiModelA);
        linkedHashMap.put(editProfileTjItemEnum, profileEditItemClickableTjUiModelA);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, p1c0.a((p1c0) value, false, xp20.n(linkedHashMap), false, 13)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object R(zje zjeVar) {
        z1c0 z1c0Var;
        if (zjeVar instanceof z1c0) {
            z1c0Var = (z1c0) zjeVar;
            int i = z1c0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                z1c0Var.k = i - Integer.MIN_VALUE;
            } else {
                z1c0Var = new z1c0(this, zjeVar);
            }
        } else {
            z1c0Var = new z1c0(this, zjeVar);
        }
        Object obj = z1c0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = z1c0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            Map map = ((p1c0) D()).b;
            hqn hqnVarC = e0c0.c(map);
            ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModelA = e0c0.a(map, EditProfileTjItemEnum.k);
            int i3 = profileEditItemClickableTjUiModelA != null ? profileEditItemClickableTjUiModelA.c : 0;
            z1c0Var.k = 1;
            if (((yzn0) this.B.b).s(hqnVarC, i3, z1c0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        G(n1c0.f22744a);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r6 == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S(a.zje r6) throws a.ypn {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a.a2c0
            if (r0 == 0) goto L13
            r0 = r6
            a.a2c0 r0 = (a.a2c0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.a2c0 r0 = new a.a2c0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r6)
            goto L5a
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L31:
            a.z1x.P(r6)
            goto L41
        L35:
            a.z1x.P(r6)
            r0.k = r4
            java.lang.Object r6 = r5.N(r0)
            if (r6 != r1) goto L41
            goto L59
        L41:
            a.ynb0 r6 = (a.ynb0) r6
            java.lang.Object r2 = r5.D()
            a.p1c0 r2 = (a.p1c0) r2
            java.util.Map r2 = r2.b
            a.hqn r2 = a.e0c0.c(r2)
            r0.k = r3
            a.iqi r5 = r5.x
            java.lang.Object r6 = r5.i(r2, r6, r0)
            if (r6 != r1) goto L5a
        L59:
            return r1
        L5a:
            a.gqn r6 = (a.gqn) r6
            a.ypn r5 = r6.c
            java.util.List r5 = r5.f43039a
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L69
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        L69:
            a.ypn r5 = new a.ypn
            a.ypn r6 = r6.c
            java.util.List r6 = r6.f43039a
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b2c0.S(a.zje):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        yje yjeVar;
        Object value2;
        Object value3;
        yje yjeVar2;
        final byte b;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        u0c0 u0c0Var = (u0c0) obj;
        u0c0Var.getClass();
        if (u0c0Var.equals(h0c0.f12229a)) {
            E();
            return;
        }
        boolean z = u0c0Var instanceof r0c0;
        l1c0 l1c0Var = l1c0.f19245a;
        if (z) {
            if (((r0c0) u0c0Var).f29623a instanceof jd50) {
                G(l1c0Var);
                return;
            }
            return;
        }
        boolean z2 = u0c0Var instanceof org.xplatform.personal.impl.presentation.edit_tj.models.b;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        vzg0 vzg0Var = this.o;
        if (z2) {
            org.xplatform.personal.impl.presentation.edit_tj.models.b bVar = (org.xplatform.personal.impl.presentation.edit_tj.models.b) u0c0Var;
            EditProfileTjItemEnum editProfileTjItemEnum = bVar.b.f46796a;
            String str = bVar.f46799a.f38596a;
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (!Character.isLetterOrDigit(cCharAt) && !C.contains(Character.valueOf(cCharAt))) {
                    return;
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(((p1c0) D()).b);
            Object obj2 = linkedHashMap.get(editProfileTjItemEnum);
            ProfileEditTjUiModel.ProfileEditItemTjUiModel profileEditItemTjUiModel = obj2 instanceof ProfileEditTjUiModel.ProfileEditItemTjUiModel ? (ProfileEditTjUiModel.ProfileEditItemTjUiModel) obj2 : null;
            if (profileEditItemTjUiModel == null) {
                return;
            }
            ProfileEditTjUiModel.ProfileEditItemTjUiModel profileEditItemTjUiModelA = ProfileEditTjUiModel.ProfileEditItemTjUiModel.a(profileEditItemTjUiModel, str, false, false, null, 509);
            vzg0Var.e(agc.J(editProfileTjItemEnum), profileEditItemTjUiModelA);
            linkedHashMap.put(editProfileTjItemEnum, profileEditItemTjUiModelA);
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value8 = p7m0Var.getValue();
                value8.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value8, p1c0.a((p1c0) value8, false, xp20.n(linkedHashMap), false, 13)));
            return;
        }
        boolean z3 = u0c0Var instanceof org.xplatform.personal.impl.presentation.edit_tj.models.a;
        byte b2 = 5;
        mne mneVar = this.s;
        final byte b3 = 1;
        if (z3) {
            ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModel = ((org.xplatform.personal.impl.presentation.edit_tj.models.a) u0c0Var).f46798a;
            switch (profileEditItemClickableTjUiModel.f46795a.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 10:
                case 13:
                case 14:
                case 15:
                    break;
                case 7:
                    EditProfileTjItemEnum editProfileTjItemEnum2 = profileEditItemClickableTjUiModel.f46795a;
                    int i2 = this.q.a().N.n;
                    Calendar calendar = Calendar.getInstance();
                    if (editProfileTjItemEnum2 == EditProfileTjItemEnum.i) {
                        calendar.add(1, -i2);
                        calendar.add(5, -1);
                    }
                    calendar.getClass();
                    G(new f1c0(editProfileTjItemEnum2, calendar));
                    break;
                case 8:
                    sac.V(jiu0.a(this), new r1c0(this, (byte) 3), null, mneVar.b, new x1c0(this, null), 10);
                    break;
                case 9:
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value7 = p7m0Var2.getValue();
                        value7.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value7, p1c0.a((p1c0) value7, false, null, true, 11)));
                    sac.V(jiu0.a(this), new r1c0(this, (byte) 2), null, mneVar.b, new y1c0(this, null), 10);
                    break;
                case 11:
                    Object obj3 = ((p1c0) D()).b.get(EditProfileTjItemEnum.l);
                    ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModel2 = obj3 instanceof ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel ? (ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel) obj3 : null;
                    int i3 = profileEditItemClickableTjUiModel2 != null ? profileEditItemClickableTjUiModel2.c : -1;
                    if (i3 > 0) {
                        Object obj4 = ((p1c0) D()).b.get(EditProfileTjItemEnum.m);
                        ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModel3 = obj4 instanceof ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel ? (ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel) obj4 : null;
                        G(new h1c0(new tt00(i3, profileEditItemClickableTjUiModel3 != null ? profileEditItemClickableTjUiModel3.c : -1)));
                        break;
                    }
                    break;
                case 12:
                    Object obj5 = ((p1c0) D()).b.get(EditProfileTjItemEnum.m);
                    ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModel4 = obj5 instanceof ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel ? (ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel) obj5 : null;
                    int i4 = profileEditItemClickableTjUiModel4 != null ? profileEditItemClickableTjUiModel4.c : -1;
                    if (i4 > 0) {
                        Object obj6 = ((p1c0) D()).b.get(EditProfileTjItemEnum.n);
                        ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModel5 = obj6 instanceof ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel ? (ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel) obj6 : null;
                        G(new h1c0(new st00(i4, profileEditItemClickableTjUiModel5 != null ? profileEditItemClickableTjUiModel5.c : -1)));
                        break;
                    }
                    break;
                default:
                    t9f.b();
                    break;
            }
            return;
        }
        if (u0c0Var instanceof k0c0) {
            k0c0 k0c0Var = (k0c0) u0c0Var;
            GregorianCalendar gregorianCalendar = new GregorianCalendar(k0c0Var.f17459a, k0c0Var.b, k0c0Var.c);
            rdj rdjVar = rdj.f30294a;
            Date time = gregorianCalendar.getTime();
            sdj sdjVar = sdj.UNIVERSAL;
            Locale locale = Locale.US;
            locale.getClass();
            Q(rdj.c(rdjVar, sdjVar, time, locale, 24), 0, EditProfileTjItemEnum.i);
            return;
        }
        if (u0c0Var instanceof q0c0) {
            rue0 rue0Var = ((q0c0) u0c0Var).f27890a;
            try {
                int i5 = (int) rue0Var.f31124a;
                switch (rue0Var.d.ordinal()) {
                    case 0:
                    case 1:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        break;
                    case 2:
                        String str2 = rue0Var.b;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(((p1c0) D()).b);
                        EditProfileTjItemEnum editProfileTjItemEnum3 = EditProfileTjItemEnum.m;
                        Object obj7 = linkedHashMap2.get(editProfileTjItemEnum3);
                        ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModel6 = obj7 instanceof ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel ? (ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel) obj7 : null;
                        if (profileEditItemClickableTjUiModel6 != null) {
                            ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModelA = ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel.a(profileEditItemClickableTjUiModel6, str2, i5, false, false, Response.VERSION_NOT_SUPPORTED);
                            vzg0Var.e(agc.J(editProfileTjItemEnum3), profileEditItemClickableTjUiModelA);
                            linkedHashMap2.put(editProfileTjItemEnum3, profileEditItemClickableTjUiModelA);
                            if (profileEditItemClickableTjUiModel6.c != i5) {
                                EditProfileTjItemEnum editProfileTjItemEnum4 = EditProfileTjItemEnum.n;
                                Object obj8 = linkedHashMap2.get(editProfileTjItemEnum4);
                                ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModel7 = obj8 instanceof ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel ? (ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel) obj8 : null;
                                if (profileEditItemClickableTjUiModel7 != null) {
                                    if (profileEditItemClickableTjUiModel7.h) {
                                        ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModelA2 = ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel.a(profileEditItemClickableTjUiModel7, "", 0, false, false, Response.VERSION_NOT_SUPPORTED);
                                        vzg0Var.e(agc.J(editProfileTjItemEnum4), profileEditItemClickableTjUiModelA2);
                                        linkedHashMap2.put(editProfileTjItemEnum4, profileEditItemClickableTjUiModelA2);
                                    }
                                }
                            }
                            p7m0 p7m0Var3 = ocjVar.f25029a;
                            do {
                                value6 = p7m0Var3.getValue();
                                value6.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var3.m(value6, p1c0.a((p1c0) value6, false, xp20.n(linkedHashMap2), false, 13)));
                        }
                        break;
                    case 3:
                        Q(rue0Var.b, i5, EditProfileTjItemEnum.n);
                        break;
                    default:
                        t9f.b();
                        break;
                }
            } catch (Exception unused) {
                return;
            }
            return;
        }
        if (u0c0Var instanceof s0c0) {
            int i6 = ((s0c0) u0c0Var).f31405a;
            if (((p1c0) D()).c) {
                String strO = O(i6);
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(((p1c0) D()).b);
                EditProfileTjItemEnum editProfileTjItemEnum5 = EditProfileTjItemEnum.k;
                Object obj9 = linkedHashMap3.get(editProfileTjItemEnum5);
                ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModel8 = obj9 instanceof ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel ? (ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel) obj9 : null;
                if (profileEditItemClickableTjUiModel8 != null) {
                    int i7 = profileEditItemClickableTjUiModel8.c;
                    Object[] objArr = i7 == 0 && i6 == 1;
                    b3 = (i7 == 1 && i6 == 0) ? (byte) 1 : (byte) 0;
                    ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModelA3 = ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel.a(profileEditItemClickableTjUiModel8, strO, i6, false, false, Response.VERSION_NOT_SUPPORTED);
                    vzg0Var.e(agc.J(editProfileTjItemEnum5), profileEditItemClickableTjUiModelA3);
                    linkedHashMap3.put(editProfileTjItemEnum5, profileEditItemClickableTjUiModelA3);
                    EditProfileTjItemEnum editProfileTjItemEnum6 = EditProfileTjItemEnum.q;
                    Object obj10 = linkedHashMap3.get(editProfileTjItemEnum6);
                    ProfileEditTjUiModel.ProfileEditItemTjUiModel profileEditItemTjUiModel2 = obj10 instanceof ProfileEditTjUiModel.ProfileEditItemTjUiModel ? (ProfileEditTjUiModel.ProfileEditItemTjUiModel) obj10 : null;
                    EditProfileTjItemEnum editProfileTjItemEnum7 = EditProfileTjItemEnum.p;
                    Object obj11 = linkedHashMap3.get(editProfileTjItemEnum7);
                    ProfileEditTjUiModel.ProfileEditItemTjUiModel profileEditItemTjUiModel3 = obj11 instanceof ProfileEditTjUiModel.ProfileEditItemTjUiModel ? (ProfileEditTjUiModel.ProfileEditItemTjUiModel) obj11 : null;
                    EditProfileTjItemEnum editProfileTjItemEnum8 = EditProfileTjItemEnum.l;
                    Object obj12 = linkedHashMap3.get(editProfileTjItemEnum8);
                    ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModel9 = obj12 instanceof ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel ? (ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel) obj12 : null;
                    EditProfileTjItemEnum editProfileTjItemEnum9 = EditProfileTjItemEnum.m;
                    Object obj13 = linkedHashMap3.get(editProfileTjItemEnum9);
                    ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModel10 = obj13 instanceof ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel ? (ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel) obj13 : null;
                    EditProfileTjItemEnum editProfileTjItemEnum10 = EditProfileTjItemEnum.n;
                    Object obj14 = linkedHashMap3.get(editProfileTjItemEnum10);
                    ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModel11 = obj14 instanceof ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel ? (ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel) obj14 : null;
                    EditProfileTjItemEnum editProfileTjItemEnum11 = EditProfileTjItemEnum.o;
                    Object obj15 = linkedHashMap3.get(editProfileTjItemEnum11);
                    ProfileEditTjUiModel.ProfileEditItemTjUiModel profileEditItemTjUiModel4 = obj15 instanceof ProfileEditTjUiModel.ProfileEditItemTjUiModel ? (ProfileEditTjUiModel.ProfileEditItemTjUiModel) obj15 : null;
                    if (profileEditItemTjUiModel2 != null && profileEditItemTjUiModel3 != null && profileEditItemClickableTjUiModel9 != null && profileEditItemClickableTjUiModel10 != null && profileEditItemClickableTjUiModel11 != null && profileEditItemTjUiModel4 != null && (objArr != false || b3 != 0)) {
                        if (b3 != 0) {
                            ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModelA4 = ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel.a(profileEditItemClickableTjUiModel9, null, 0, true, false, 447);
                            vzg0Var.e(agc.J(editProfileTjItemEnum8), profileEditItemClickableTjUiModelA4);
                            linkedHashMap3.put(editProfileTjItemEnum8, profileEditItemClickableTjUiModelA4);
                            ProfileEditTjUiModel.ProfileEditItemTjUiModel profileEditItemTjUiModelA2 = ProfileEditTjUiModel.ProfileEditItemTjUiModel.a(profileEditItemTjUiModel3, null, true, false, null, 447);
                            vzg0Var.e(agc.J(editProfileTjItemEnum7), profileEditItemTjUiModelA2);
                            linkedHashMap3.put(editProfileTjItemEnum7, profileEditItemTjUiModelA2);
                            ProfileEditTjUiModel.ProfileEditItemTjUiModel profileEditItemTjUiModelA3 = ProfileEditTjUiModel.ProfileEditItemTjUiModel.a(profileEditItemTjUiModel2, null, false, false, null, 383);
                            vzg0Var.e(agc.J(editProfileTjItemEnum6), profileEditItemTjUiModelA3);
                            linkedHashMap3.put(editProfileTjItemEnum6, profileEditItemTjUiModelA3);
                            ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModelA5 = ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel.a(profileEditItemClickableTjUiModel10, null, 0, false, false, 383);
                            vzg0Var.e(agc.J(editProfileTjItemEnum9), profileEditItemClickableTjUiModelA5);
                            linkedHashMap3.put(editProfileTjItemEnum9, profileEditItemClickableTjUiModelA5);
                            ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModelA6 = ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel.a(profileEditItemClickableTjUiModel11, null, 0, false, false, 383);
                            vzg0Var.e(agc.J(editProfileTjItemEnum10), profileEditItemClickableTjUiModelA6);
                            linkedHashMap3.put(editProfileTjItemEnum10, profileEditItemClickableTjUiModelA6);
                            ProfileEditTjUiModel.ProfileEditItemTjUiModel profileEditItemTjUiModelA4 = ProfileEditTjUiModel.ProfileEditItemTjUiModel.a(profileEditItemTjUiModel4, null, false, false, null, 383);
                            vzg0Var.e(agc.J(editProfileTjItemEnum11), profileEditItemTjUiModelA4);
                            linkedHashMap3.put(editProfileTjItemEnum11, profileEditItemTjUiModelA4);
                        } else {
                            ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModelA7 = ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel.a(profileEditItemClickableTjUiModel9, null, 0, false, false, 447);
                            vzg0Var.e(agc.J(editProfileTjItemEnum8), profileEditItemClickableTjUiModelA7);
                            linkedHashMap3.put(editProfileTjItemEnum8, profileEditItemClickableTjUiModelA7);
                            ProfileEditTjUiModel.ProfileEditItemTjUiModel profileEditItemTjUiModelA5 = ProfileEditTjUiModel.ProfileEditItemTjUiModel.a(profileEditItemTjUiModel3, null, false, false, null, 447);
                            vzg0Var.e(agc.J(editProfileTjItemEnum7), profileEditItemTjUiModelA5);
                            linkedHashMap3.put(editProfileTjItemEnum7, profileEditItemTjUiModelA5);
                            ProfileEditTjUiModel.ProfileEditItemTjUiModel profileEditItemTjUiModelA6 = ProfileEditTjUiModel.ProfileEditItemTjUiModel.a(profileEditItemTjUiModel2, null, false, true, null, 383);
                            vzg0Var.e(agc.J(editProfileTjItemEnum6), profileEditItemTjUiModelA6);
                            linkedHashMap3.put(editProfileTjItemEnum6, profileEditItemTjUiModelA6);
                            ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModelA8 = ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel.a(profileEditItemClickableTjUiModel10, null, 0, false, true, 383);
                            vzg0Var.e(agc.J(editProfileTjItemEnum9), profileEditItemClickableTjUiModelA8);
                            linkedHashMap3.put(editProfileTjItemEnum9, profileEditItemClickableTjUiModelA8);
                            ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModelA9 = ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel.a(profileEditItemClickableTjUiModel11, null, 0, false, true, 383);
                            vzg0Var.e(agc.J(editProfileTjItemEnum10), profileEditItemClickableTjUiModelA9);
                            linkedHashMap3.put(editProfileTjItemEnum10, profileEditItemClickableTjUiModelA9);
                            ProfileEditTjUiModel.ProfileEditItemTjUiModel profileEditItemTjUiModelA7 = ProfileEditTjUiModel.ProfileEditItemTjUiModel.a(profileEditItemTjUiModel4, null, false, true, null, 383);
                            vzg0Var.e(agc.J(editProfileTjItemEnum11), profileEditItemTjUiModelA7);
                            linkedHashMap3.put(editProfileTjItemEnum11, profileEditItemTjUiModelA7);
                        }
                        p7m0 p7m0Var4 = ocjVar.f25029a;
                        do {
                            value5 = p7m0Var4.getValue();
                            value5.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var4.m(value5, p1c0.a((p1c0) value5, false, xp20.n(linkedHashMap3), false, 13)));
                    }
                }
                p7m0 p7m0Var5 = ocjVar.f25029a;
                do {
                    value4 = p7m0Var5.getValue();
                    value4.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var5.m(value4, p1c0.a((p1c0) value4, false, null, false, 11)));
                return;
            }
            return;
        }
        if (u0c0Var.equals(i0c0.f13943a)) {
            p7m0 p7m0Var6 = ocjVar.f25029a;
            do {
                value3 = p7m0Var6.getValue();
                value3.getClass();
                oyg0Var.getClass();
                yjeVar2 = null;
                b = 0;
            } while (!p7m0Var6.m(value3, p1c0.a((p1c0) value3, true, null, false, 14)));
            sac.V(jiu0.a(this), new r1c0(this, (byte) 4), new Function0(this) { // from class: a.t1c0
                public final /* synthetic */ b2c0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Object value9;
                    Object value10;
                    byte b4 = b;
                    b2c0 b2c0Var = this.b;
                    switch (b4) {
                        case 0:
                            p7m0 p7m0Var7 = b2c0Var.i.f25029a;
                            do {
                                value9 = p7m0Var7.getValue();
                                value9.getClass();
                                b2c0Var.f.getClass();
                            } while (!p7m0Var7.m(value9, p1c0.a((p1c0) value9, false, null, false, 14)));
                            break;
                        default:
                            p7m0 p7m0Var8 = b2c0Var.i.f25029a;
                            do {
                                value10 = p7m0Var8.getValue();
                                value10.getClass();
                                b2c0Var.f.getClass();
                            } while (!p7m0Var8.m(value10, p1c0.a((p1c0) value10, false, null, false, 14)));
                            break;
                    }
                    return Unit.f46060a;
                }
            }, mneVar.b, new w1c0(this, yjeVar2, b), 8);
            return;
        }
        if (u0c0Var.equals(l0c0.f19194a)) {
            p7m0 p7m0Var7 = ocjVar.f25029a;
            do {
                value2 = p7m0Var7.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var7.m(value2, p1c0.a((p1c0) value2, false, null, false, 14)));
            return;
        }
        if (u0c0Var instanceof m0c0) {
            this.A.a(((m0c0) u0c0Var).f20947a);
            return;
        }
        if (u0c0Var.equals(t0c0.f33113a)) {
            if (((p1c0) D()).d) {
                p7m0 p7m0Var8 = ocjVar.f25029a;
                do {
                    value = p7m0Var8.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                    yjeVar = null;
                } while (!p7m0Var8.m(value, p1c0.a((p1c0) value, true, null, false, 14)));
                sac.V(jiu0.a(this), new r1c0(this, b2), new Function0(this) { // from class: a.t1c0
                    public final /* synthetic */ b2c0 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Object value9;
                        Object value10;
                        byte b4 = b3;
                        b2c0 b2c0Var = this.b;
                        switch (b4) {
                            case 0:
                                p7m0 p7m0Var9 = b2c0Var.i.f25029a;
                                do {
                                    value9 = p7m0Var9.getValue();
                                    value9.getClass();
                                    b2c0Var.f.getClass();
                                } while (!p7m0Var9.m(value9, p1c0.a((p1c0) value9, false, null, false, 14)));
                                break;
                            default:
                                p7m0 p7m0Var10 = b2c0Var.i.f25029a;
                                do {
                                    value10 = p7m0Var10.getValue();
                                    value10.getClass();
                                    b2c0Var.f.getClass();
                                } while (!p7m0Var10.m(value10, p1c0.a((p1c0) value10, false, null, false, 14)));
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, mneVar.b, new w1c0(this, yjeVar, b3), 8);
                return;
            }
            return;
        }
        boolean zEquals = u0c0Var.equals(n0c0.f22693a);
        p0w0 p0w0Var = p0w0.f26173a;
        i1w0 i1w0Var = this.t;
        if (zEquals) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (!u0c0Var.equals(o0c0.f24417a)) {
                if (u0c0Var.equals(j0c0.f15677a)) {
                    G(l1c0Var);
                    return;
                } else if (!(u0c0Var instanceof p0c0)) {
                    t9f.b();
                    return;
                } else {
                    nk90 nk90Var = ((p0c0) u0c0Var).f26143a;
                    Q(nk90Var.b, nk90Var.f23672a, EditProfileTjItemEnum.j);
                    return;
                }
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
