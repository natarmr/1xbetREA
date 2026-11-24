package a;

import android.gov.nist.core.Separators;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ib60 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib60(Object obj, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.l = obj;
    }

    private final Object l(Object obj) {
        int i;
        Map map;
        Object value;
        String strA;
        int i2;
        int i3;
        boolean z = this.j;
        jph0 jph0Var = (jph0) this.k;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        zuh0 zuh0Var = (zuh0) this.l;
        zuh0Var.M = z;
        boolean z2 = jph0Var.g;
        boolean z3 = zuh0Var.h.a().N.f;
        ctf0 ctf0Var = zuh0Var.t;
        ctf0Var.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        cge0 cge0Var = mrh0.f22272a;
        int i4 = jph0Var.c;
        Map map2 = jph0Var.d;
        cge0Var.getClass();
        mrh0 mrh0VarI = cge0.i(i4);
        if (mrh0VarI != mrh0.b) {
            int iOrdinal = mrh0VarI.ordinal();
            if (iOrdinal == 0) {
                i2 = R.string.increase_the_security;
            } else if (iOrdinal == 1) {
                i2 = R.string.security_level_title_low_new;
            } else if (iOrdinal == 2) {
                i2 = R.string.security_level_title_bad_new;
            } else if (iOrdinal == 3) {
                i2 = R.string.security_level_title_normal_new;
            } else {
                if (iOrdinal != 4) {
                    t9f.b();
                    return null;
                }
                i2 = R.string.security_level_title_full_secure;
            }
            int iOrdinal2 = mrh0VarI.ordinal();
            if (iOrdinal2 == 0) {
                i3 = R.color.static_white;
            } else if (iOrdinal2 == 1) {
                i3 = R.color.static_red;
            } else if (iOrdinal2 == 2) {
                i3 = R.color.static_dark_orange;
            } else if (iOrdinal2 == 3) {
                i3 = R.color.static_yellow;
            } else {
                if (iOrdinal2 != 4) {
                    t9f.b();
                    return null;
                }
                i3 = R.color.static_green;
            }
            lc00VarB.add(new ush0(i2, i3, mrh0VarI != mrh0.f));
        }
        lc00VarB.add(new eth0());
        if (map2.isEmpty()) {
            i = 0;
        } else {
            Iterator it = map2.entrySet().iterator();
            i = 0;
            while (it.hasNext()) {
                if (((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                    i++;
                }
            }
        }
        int size = map2.size();
        int iA = size == 0 ? 0 : si30.a((((double) i) * 100.0d) / ((double) size));
        String strN = cy7.c() ? w6x.n(size, i, Separators.SLASH) : w6x.n(i, size, Separators.SLASH);
        String strA2 = jph0Var.h;
        if (strA2.length() == 0) {
            strA2 = ctf0Var.b.a(R.string.increase_the_security, Arrays.copyOf(new Object[0], 0));
        }
        lc00VarB.add(new vsh0(iA, i, size, strN, strA2, jph0Var.g));
        if (z3) {
            dsh0 dsh0Var = dsh0.f6610a;
            if (map2.containsKey(dsh0Var)) {
                String str = jph0Var.f;
                boolean zU = x9x.U(map2, dsh0Var);
                ssh0 ssh0Var = ssh0.f32726a;
                lsm0 lsm0Var = ctf0Var.b;
                String strA3 = lsm0Var.a(R.string.security_phone_number_title, Arrays.copyOf(new Object[0], 0));
                int iOrdinal3 = jph0Var.e.ordinal();
                if (iOrdinal3 == 0) {
                    strA = lsm0Var.a(R.string.security_phone_activated_short_v2, Arrays.copyOf(new Object[]{btm0.t(str)}, 1));
                } else if (iOrdinal3 == 1) {
                    strA = lsm0Var.a(R.string.security_phone_number_state_false, Arrays.copyOf(new Object[0], 0));
                } else if (iOrdinal3 != 2) {
                    if (iOrdinal3 != 3) {
                        t9f.b();
                        return null;
                    }
                    strA = lsm0Var.a(R.string.security_phone_number_state_false, Arrays.copyOf(new Object[0], 0));
                } else {
                    strA = lsm0Var.a(R.string.security_phone_not_activated_short_v2, Arrays.copyOf(new Object[]{btm0.t(str)}, 1));
                }
                lc00VarB.add(new wsh0(ssh0Var, zU, R.drawable.ic_glyph_phone, strA3, strA, zU ? i8m0.CHECK : i8m0.WARNING_RED, !zU));
            }
        }
        dsh0 dsh0Var2 = dsh0.b;
        if (map2.containsKey(dsh0Var2)) {
            boolean zU2 = x9x.U(map2, dsh0Var2);
            ssh0 ssh0Var2 = ssh0.b;
            Object[] objArr = {String.valueOf(jph0Var.b)};
            lsm0 lsm0Var2 = ctf0Var.b;
            String strA4 = lsm0Var2.a(R.string.security_change_password_period_title_v2, Arrays.copyOf(objArr, 1));
            int i5 = jph0Var.f16901a;
            lc00VarB.add(new wsh0(ssh0Var2, zU2, R.drawable.ic_glyph_key, strA4, i5 == 0 ? lsm0Var2.a(R.string.security_password_change_now, Arrays.copyOf(new Object[0], 0)) : lsm0Var2.a(R.string.security_password_state_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i5)}, 1)), zU2 ? i8m0.CHECK : i8m0.WARNING_RED, true));
        }
        dsh0 dsh0Var3 = dsh0.c;
        if (map2.containsKey(dsh0Var3)) {
            boolean zU3 = x9x.U(map2, dsh0Var3);
            ssh0 ssh0Var3 = ssh0.c;
            lsm0 lsm0Var3 = ctf0Var.b;
            lc00VarB.add(new wsh0(ssh0Var3, zU3, R.drawable.ic_glyph_question, lsm0Var3.a(R.string.security_secret_question_title, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(zU3 ? R.string.security_secret_question_state_true : R.string.security_secret_question_state_false, Arrays.copyOf(new Object[0], 0)), zU3 ? i8m0.CHECK : i8m0.WARNING_RED, !zU3));
        }
        dsh0 dsh0Var4 = dsh0.d;
        if (map2.containsKey(dsh0Var4)) {
            boolean zU4 = x9x.U(map2, dsh0Var4);
            ssh0 ssh0Var4 = ssh0.d;
            lsm0 lsm0Var4 = ctf0Var.b;
            lc00VarB.add(new wsh0(ssh0Var4, zU4, R.drawable.ic_glyph_authenticator, lsm0Var4.a(R.string.security_tfa_title, Arrays.copyOf(new Object[0], 0)), lsm0Var4.a(zU4 ? R.string.security_tfa_state_true : R.string.security_tfa_state_false, Arrays.copyOf(new Object[0], 0)), zU4 ? i8m0.CHECK : i8m0.WARNING_RED, true));
        }
        dsh0 dsh0Var5 = dsh0.e;
        if (map2.containsKey(dsh0Var5)) {
            boolean zU5 = x9x.U(map2, dsh0Var5);
            ssh0 ssh0Var5 = ssh0.e;
            lsm0 lsm0Var5 = ctf0Var.b;
            lc00VarB.add(new wsh0(ssh0Var5, zU5, R.drawable.ic_glyph_user, lsm0Var5.a(R.string.personal_data, Arrays.copyOf(new Object[0], 0)), lsm0Var5.a(zU5 ? R.string.security_page_filled : R.string.security_page_not_filled, Arrays.copyOf(new Object[0], 0)), zU5 ? i8m0.CHECK : i8m0.WARNING_RED, !zU5));
        }
        dsh0 dsh0Var6 = dsh0.f;
        if (map2.containsKey(dsh0Var6)) {
            boolean zU6 = x9x.U(map2, dsh0Var6);
            int i6 = zU6 ? R.color.static_green : R.color.static_red;
            ssh0 ssh0Var6 = ssh0.f;
            lsm0 lsm0Var6 = ctf0Var.b;
            map = map2;
            lc00VarB.add(new cth0(ssh0Var6, zU6, R.drawable.ic_glyph_mail, lsm0Var6.a(R.string.security_forbidden_auth_by_email, Arrays.copyOf(new Object[0], 0)), lsm0Var6.a(zU6 ? R.string.security_email_state_true : R.string.security_email_state_false, Arrays.copyOf(new Object[0], 0)), i6, zU6, z, zU6 ? i8m0.CHECK : i8m0.WARNING_RED, false, true));
        } else {
            map = map2;
        }
        quh0 quh0Var = new quh0(z2, kotlin.collections.a.a(lc00VarB), Boolean.valueOf(x9x.U(map, dsh0Var3)));
        p7m0 p7m0Var = zuh0Var.H;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, quh0Var));
        p7m0 p7m0Var2 = zuh0Var.F;
        Boolean bool = Boolean.FALSE;
        p7m0Var2.getClass();
        p7m0Var2.o(null, bool);
        return Unit.f46060a;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.l;
        switch (b) {
            case 0:
                ib60 ib60Var = new ib60((pzu) obj4, (yje) obj3, (byte) 0);
                ib60Var.k = (kmq) obj;
                return ib60Var.invokeSuspend(Unit.f46060a);
            case 1:
                ib60 ib60Var2 = new ib60((uf70) obj4, (yje) obj3, (byte) 1);
                ib60Var2.k = (Throwable) obj2;
                return ib60Var2.invokeSuspend(Unit.f46060a);
            case 2:
                ib60 ib60Var3 = new ib60((gh70) obj4, (yje) obj3, (byte) 2);
                ib60Var3.k = (Throwable) obj2;
                return ib60Var3.invokeSuspend(Unit.f46060a);
            case 3:
                ib60 ib60Var4 = new ib60((vi70) obj4, (yje) obj3, (byte) 3);
                ib60Var4.k = (Throwable) obj2;
                return ib60Var4.invokeSuspend(Unit.f46060a);
            case 4:
                ib60 ib60Var5 = new ib60((ol70) obj4, (yje) obj3, (byte) 4);
                ib60Var5.k = (Throwable) obj2;
                return ib60Var5.invokeSuspend(Unit.f46060a);
            case 5:
                ib60 ib60Var6 = new ib60((to70) obj4, (yje) obj3, (byte) 5);
                ib60Var6.k = (Throwable) obj2;
                return ib60Var6.invokeSuspend(Unit.f46060a);
            case 6:
                ib60 ib60Var7 = new ib60((g9b0) obj4, (yje) obj3, (byte) 6);
                ib60Var7.k = (Throwable) obj2;
                return ib60Var7.invokeSuspend(Unit.f46060a);
            case 7:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ib60 ib60Var8 = new ib60((shd0) obj4, (yje) obj3, (byte) 7);
                ib60Var8.k = (String) obj;
                ib60Var8.j = zBooleanValue;
                return ib60Var8.invokeSuspend(Unit.f46060a);
            case 8:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                ib60 ib60Var9 = new ib60((k4g0) obj4, (yje) obj3, (byte) 8);
                ib60Var9.k = (String) obj;
                ib60Var9.j = zBooleanValue2;
                return ib60Var9.invokeSuspend(Unit.f46060a);
            case 9:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                ib60 ib60Var10 = new ib60((o9g0) obj4, (yje) obj3, (byte) 9);
                ib60Var10.k = (List) obj;
                ib60Var10.j = zBooleanValue3;
                return ib60Var10.invokeSuspend(Unit.f46060a);
            case 10:
                ib60 ib60Var11 = new ib60((w6h0) obj4, (yje) obj3, (byte) 10);
                ib60Var11.k = (Throwable) obj2;
                return ib60Var11.invokeSuspend(Unit.f46060a);
            case 11:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                ib60 ib60Var12 = new ib60((iph0) obj4, (yje) obj3, (byte) 11);
                ib60Var12.j = zBooleanValue4;
                ib60Var12.k = (jph0) obj2;
                return ib60Var12.invokeSuspend(Unit.f46060a);
            case 12:
                boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                ib60 ib60Var13 = new ib60((irh0) obj4, (yje) obj3, (byte) 12);
                ib60Var13.j = zBooleanValue5;
                ib60Var13.k = (jph0) obj2;
                return ib60Var13.invokeSuspend(Unit.f46060a);
            case 13:
                boolean zBooleanValue6 = ((Boolean) obj).booleanValue();
                ib60 ib60Var14 = new ib60((zuh0) obj4, (yje) obj3, (byte) 13);
                ib60Var14.j = zBooleanValue6;
                ib60Var14.k = (jph0) obj2;
                return ib60Var14.invokeSuspend(Unit.f46060a);
            case 14:
                boolean zBooleanValue7 = ((Boolean) obj2).booleanValue();
                ib60 ib60Var15 = new ib60((iwk0) obj4, (yje) obj3, (byte) 14);
                ib60Var15.k = (List) obj;
                ib60Var15.j = zBooleanValue7;
                return ib60Var15.invokeSuspend(Unit.f46060a);
            default:
                ib60 ib60Var16 = new ib60((wfq0) obj4, (yje) obj3, (byte) 15);
                ib60Var16.k = (Throwable) obj2;
                return ib60Var16.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:102:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:106:0x0205  */
    /* JADX WARN: Code duplicated, block: B:110:0x0227  */
    /* JADX WARN: Code duplicated, block: B:112:0x0242  */
    /* JADX WARN: Code duplicated, block: B:114:0x024f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0271  */
    /* JADX WARN: Code duplicated, block: B:120:0x0283  */
    /* JADX WARN: Code duplicated, block: B:121:0x0287  */
    /* JADX WARN: Code duplicated, block: B:125:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:127:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:128:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:132:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:134:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:139:0x0304  */
    /* JADX WARN: Code duplicated, block: B:141:0x0316  */
    /* JADX WARN: Code duplicated, block: B:142:0x031a  */
    /* JADX WARN: Code duplicated, block: B:144:0x032f  */
    /* JADX WARN: Code duplicated, block: B:178:0x03ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x0401  */
    /* JADX WARN: Code duplicated, block: B:181:0x0404  */
    /* JADX WARN: Code duplicated, block: B:183:0x0407  */
    /* JADX WARN: Code duplicated, block: B:185:0x040a  */
    /* JADX WARN: Code duplicated, block: B:187:0x040f  */
    /* JADX WARN: Code duplicated, block: B:188:0x0413  */
    /* JADX WARN: Code duplicated, block: B:189:0x0417  */
    /* JADX WARN: Code duplicated, block: B:190:0x041b  */
    /* JADX WARN: Code duplicated, block: B:191:0x041f  */
    /* JADX WARN: Code duplicated, block: B:210:0x0470  */
    /* JADX WARN: Code duplicated, block: B:211:0x0473  */
    /* JADX WARN: Code duplicated, block: B:333:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:369:0x0884  */
    /* JADX WARN: Code duplicated, block: B:374:0x0898  */
    /* JADX WARN: Code duplicated, block: B:376:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:377:0x08a8  */
    /* JADX WARN: Code duplicated, block: B:383:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:96:0x01da  */
    /* JADX WARN: Code duplicated, block: B:97:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:99:0x01df  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        lhd0 lhd0Var;
        boolean z;
        String str;
        p7m0 p7m0Var;
        Object value2;
        enf0 enf0Var;
        anf0 anf0Var;
        List list;
        Object value3;
        List list2;
        List listA;
        Object value4;
        int i;
        int iOrdinal;
        int i2;
        int iOrdinal2;
        d4d d4dVar;
        boolean z2;
        wxf uxfVar;
        lc00 lc00Var;
        String strA;
        dsh0 dsh0Var;
        dsh0 dsh0Var2;
        dsh0 dsh0Var3;
        dsh0 dsh0Var4;
        dsh0 dsh0Var5;
        lc00 lc00Var2;
        boolean zE;
        int i3;
        boolean zE2;
        int i4;
        boolean zE3;
        int i5;
        boolean zE4;
        int i6;
        int i7;
        String strF;
        dsh0 dsh0Var6;
        String str2;
        int iOrdinal3;
        String strF2;
        int i8;
        int i9;
        d4d d4dVar2;
        int i10;
        byte b = this.i;
        aok0 aok0Var = aok0.f1205a;
        bok0 bok0Var = bok0.f2937a;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                kmq kmqVar = (kmq) this.k;
                wne wneVar = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    List listA2 = ((i9u) ((pzu) obj2).c).a();
                    if (listA2 == null || listA2.isEmpty()) {
                        iun iunVar = iun.f15405a;
                        this.k = null;
                        this.j = true;
                        if (kmqVar.a(iunVar, this) == wneVar) {
                            return wneVar;
                        }
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                Throwable th = (Throwable) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    xcc xccVar = ((uf70) obj2).b;
                    this.k = null;
                    this.j = true;
                    if (xccVar.a(th, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                Throwable th2 = (Throwable) this.k;
                wne wneVar3 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    xcc xccVar2 = ((gh70) obj2).b;
                    this.k = null;
                    this.j = true;
                    if (xccVar2.a(th2, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                Throwable th3 = (Throwable) this.k;
                wne wneVar4 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    xcc xccVar3 = ((vi70) obj2).i;
                    this.k = null;
                    this.j = true;
                    if (xccVar3.a(th3, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                Throwable th4 = (Throwable) this.k;
                wne wneVar5 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    xcc xccVar4 = ((ol70) obj2).j;
                    this.k = th4;
                    this.j = true;
                    if (xccVar4.a(th4, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                th4.printStackTrace();
                return Unit.f46060a;
            case 5:
                Throwable th5 = (Throwable) this.k;
                wne wneVar6 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    xcc xccVar5 = ((to70) obj2).B;
                    this.k = null;
                    this.j = true;
                    if (xccVar5.a(th5, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                Throwable th6 = (Throwable) this.k;
                wne wneVar7 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    xcc xccVar6 = ((g9b0) obj2).c;
                    this.k = null;
                    this.j = true;
                    if (xccVar6.a(th6, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                String str3 = (String) this.k;
                boolean z10 = this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var2 = ((shd0) obj2).t;
                do {
                    value = p7m0Var2.getValue();
                    lhd0Var = (lhd0) value;
                    rgd0 rgd0Var = lhd0Var.f;
                    z = z10 && str3.length() > 0;
                    str = rgd0Var.f30429a;
                    str.getClass();
                } while (!p7m0Var2.m(value, lhd0.a(lhd0Var, null, null, new rgd0(str, z), null, 95)));
                return Unit.f46060a;
            case 8:
                k4g0 k4g0Var = (k4g0) obj2;
                ocj ocjVar = k4g0Var.i;
                String str4 = (String) this.k;
                boolean z11 = this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                if (z11) {
                    v3c.N(k4g0Var.C);
                }
                if (z11 && !ntb.Y(str4)) {
                    int i11 = k4g0.F;
                    k4g0Var.M(str4, false);
                } else if (z11 && ntb.Y(str4)) {
                    int i12 = k4g0.F;
                    k4g0Var.N(false);
                } else if (!z11 && !ntb.Y(str4)) {
                    if (((y3g0) k4g0Var.D()).e instanceof ohh0) {
                        whh0 whh0Var = ((y3g0) k4g0Var.D()).e;
                        ohh0 ohh0Var = whh0Var instanceof ohh0 ? (ohh0) whh0Var : null;
                        if (ohh0Var == null || (list2 = ohh0Var.b) == null || !list2.isEmpty()) {
                            if (!z11) {
                                if (((y3g0) k4g0Var.D()).d instanceof anf0) {
                                    enf0Var = ((y3g0) k4g0Var.D()).d;
                                    if (enf0Var instanceof anf0) {
                                        anf0Var = (anf0) enf0Var;
                                    } else {
                                        anf0Var = null;
                                    }
                                    if (anf0Var != null) {
                                        p7m0Var = ocjVar.f25029a;
                                        do {
                                            value2 = p7m0Var.getValue();
                                            value2.getClass();
                                        } while (!p7m0Var.m(value2, y3g0.a((y3g0) value2, false, null, false, new ymf0(new UnknownHostException()), null, null, null, null, false, false, 16375)));
                                    }
                                } else {
                                    p7m0Var = ocjVar.f25029a;
                                    do {
                                        value2 = p7m0Var.getValue();
                                        value2.getClass();
                                    } while (!p7m0Var.m(value2, y3g0.a((y3g0) value2, false, null, false, new ymf0(new UnknownHostException()), null, null, null, null, false, false, 16375)));
                                }
                            }
                        }
                    }
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                    } while (!p7m0Var3.m(value3, y3g0.a((y3g0) value3, false, null, false, null, new khh0(new UnknownHostException()), null, null, null, false, false, 16367)));
                } else if (!z11 && ntb.Y(str4)) {
                    if (((y3g0) k4g0Var.D()).d instanceof anf0) {
                        enf0Var = ((y3g0) k4g0Var.D()).d;
                        if (enf0Var instanceof anf0) {
                            anf0Var = (anf0) enf0Var;
                        } else {
                            anf0Var = null;
                        }
                        if (anf0Var != null && (list = anf0Var.f1149a) != null && list.isEmpty()) {
                            p7m0Var = ocjVar.f25029a;
                            do {
                                value2 = p7m0Var.getValue();
                                value2.getClass();
                            } while (!p7m0Var.m(value2, y3g0.a((y3g0) value2, false, null, false, new ymf0(new UnknownHostException()), null, null, null, null, false, false, 16375)));
                        }
                    } else {
                        p7m0Var = ocjVar.f25029a;
                        do {
                            value2 = p7m0Var.getValue();
                            value2.getClass();
                        } while (!p7m0Var.m(value2, y3g0.a((y3g0) value2, false, null, false, new ymf0(new UnknownHostException()), null, null, null, null, false, false, 16375)));
                    }
                }
                return Unit.f46060a;
            case 9:
                List list3 = (List) this.k;
                boolean z12 = this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                o9g0 o9g0Var = (o9g0) obj2;
                o9g0Var.z.getClass();
                list3.getClass();
                if (list3.isEmpty() && z12) {
                    listA = iun.f15405a;
                } else {
                    lc00 lc00VarB = kotlin.collections.a.b();
                    if (!z12) {
                        lc00VarB.add(bok0Var);
                    }
                    lc00VarB.add(aok0Var);
                    lc00VarB.addAll(list3);
                    listA = kotlin.collections.a.a(lc00VarB);
                }
                List list4 = listA;
                if (list4 == null || !list4.isEmpty()) {
                    Iterator it = list4.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((dok0) it.next()).a() == ((e9g0) o9g0Var.D()).i) {
                            }
                        } else if (!list3.isEmpty()) {
                            o9g0Var.o.e("RESULTS_FRAGMENT_SELECTED_SPORT_ID_BUNDLE_KEY", new Long(-321L));
                            o9g0Var.A.f(-321L);
                        }
                    }
                } else if (!list3.isEmpty()) {
                    o9g0Var.o.e("RESULTS_FRAGMENT_SELECTED_SPORT_ID_BUNDLE_KEY", new Long(-321L));
                    o9g0Var.A.f(-321L);
                }
                p7m0 p7m0Var4 = o9g0Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                } while (!p7m0Var4.m(value4, e9g0.a((e9g0) value4, null, null, null, 0L, list4, null, null, 15871)));
                return Unit.f46060a;
            case 10:
                Throwable th7 = (Throwable) this.k;
                wne wneVar11 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    xcc xccVar7 = ((w6h0) obj2).k;
                    this.k = null;
                    this.j = true;
                    if (xccVar7.a(th7, this) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 11:
                boolean z14 = this.j;
                jph0 jph0Var = (jph0) this.k;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                iph0 iph0Var = (iph0) obj2;
                iph0Var.I = z14;
                ctf0 ctf0Var = iph0Var.v;
                jph0Var.getClass();
                ctf0Var.getClass();
                Map map = jph0Var.d;
                int size = map.size();
                int i13 = jph0Var.c;
                if (i13 != 0) {
                    if (map.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it2 = map.entrySet().iterator();
                        i = 0;
                        while (it2.hasNext()) {
                            if (((Boolean) ((Map.Entry) it2.next()).getValue()).booleanValue()) {
                                i++;
                            }
                        }
                    }
                    float f = size == 0 ? 0.0f : i / size;
                    mrh0.f22272a.getClass();
                    mrh0 mrh0VarI = cge0.i(i13);
                    int iOrdinal4 = mrh0VarI.ordinal();
                    int i14 = R.string.security_level_no_protection;
                    if (iOrdinal4 == 0 || iOrdinal4 == 1) {
                        iOrdinal = mrh0VarI.ordinal();
                        if (iOrdinal != 0) {
                            i2 = R.string.increase_the_security;
                        } else if (iOrdinal != 1) {
                            i2 = R.string.security_level_title_low_new;
                        } else if (iOrdinal != 2) {
                            i2 = R.string.security_level_title_bad_new;
                        } else if (iOrdinal != 3) {
                            i2 = R.string.security_level_title_normal_new;
                        } else if (iOrdinal == 4) {
                            i2 = R.string.security_level_title_full_secure;
                        } else {
                            t9f.b();
                        }
                        lsm0 lsm0Var = ctf0Var.b;
                        String strA2 = lsm0Var.a(i14, Arrays.copyOf(new Object[0], 0));
                        String strA3 = lsm0Var.a(i2, Arrays.copyOf(new Object[0], 0));
                        String strA4 = lsm0Var.a(R.string.security_level_description, Arrays.copyOf(new Object[0], 0));
                        iOrdinal2 = mrh0VarI.ordinal();
                        if (iOrdinal2 == 0 && iOrdinal2 != 1) {
                            if (iOrdinal2 == 2) {
                                d4dVar = d4d.STATIC_DARK_ORANGE;
                            } else if (iOrdinal2 == 3) {
                                d4dVar = d4d.STATIC_YELLOW;
                            } else if (iOrdinal2 == 4) {
                                d4dVar = d4d.STATIC_GREEN;
                            } else {
                                t9f.b();
                            }
                        }
                        d4d d4dVar3 = d4dVar;
                        if (mrh0VarI != mrh0.f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        uxfVar = new uxf(strA2, strA3, strA4, z2, f, i, size, d4dVar3);
                    } else {
                        if (iOrdinal4 == 2) {
                            i14 = R.string.security_level_low_protection;
                        } else if (iOrdinal4 == 3) {
                            i14 = R.string.security_level_middle_protection;
                        } else if (iOrdinal4 == 4) {
                            i14 = R.string.security_level_high_protection;
                        } else {
                            t9f.b();
                        }
                        iOrdinal = mrh0VarI.ordinal();
                        if (iOrdinal != 0) {
                            i2 = R.string.increase_the_security;
                        } else if (iOrdinal != 1) {
                            i2 = R.string.security_level_title_low_new;
                        } else if (iOrdinal != 2) {
                            i2 = R.string.security_level_title_bad_new;
                        } else if (iOrdinal != 3) {
                            i2 = R.string.security_level_title_normal_new;
                        } else if (iOrdinal == 4) {
                            i2 = R.string.security_level_title_full_secure;
                        } else {
                            t9f.b();
                        }
                        lsm0 lsm0Var2 = ctf0Var.b;
                        String strA5 = lsm0Var2.a(i14, Arrays.copyOf(new Object[0], 0));
                        String strA6 = lsm0Var2.a(i2, Arrays.copyOf(new Object[0], 0));
                        String strA7 = lsm0Var2.a(R.string.security_level_description, Arrays.copyOf(new Object[0], 0));
                        iOrdinal2 = mrh0VarI.ordinal();
                        d4dVar = iOrdinal2 == 0 ? d4d.STATIC_RED : d4d.STATIC_RED;
                        d4d d4dVar4 = d4dVar;
                        if (mrh0VarI != mrh0.f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        uxfVar = new uxf(strA5, strA6, strA7, z2, f, i, size, d4dVar4);
                    }
                    return null;
                }
                uxfVar = new vxf(ctf0Var.b.a(R.string.security_settings, Arrays.copyOf(new Object[0], 0)));
                boolean z15 = iph0Var.i.a().N.f;
                ctf0Var.getClass();
                lc00 lc00VarB2 = kotlin.collections.a.b();
                mrh0.f22272a.getClass();
                cge0.i(i13);
                boolean z16 = jph0Var.g;
                if (z16) {
                    lc00VarB2.add(new koh0(ctf0Var.b.a(R.string.security_get_promotion, Arrays.copyOf(new Object[0], 0)), z16 ? fbc.d(ctf0.b(R.attr.uikitPrimary, ctf0Var)) : fbc.d(ctf0.b(R.attr.uikitPrimary60, ctf0Var)), z16));
                }
                int i15 = R.drawable.ic_glyph_security;
                if (z15) {
                    dsh0 dsh0Var7 = dsh0.f6610a;
                    if (map.containsKey(dsh0Var7)) {
                        String str5 = jph0Var.f;
                        boolean zO = h8x.O(map, dsh0Var7);
                        ssh0 ssh0Var = ssh0.f32726a;
                        lsm0 lsm0Var3 = ctf0Var.b;
                        String strA8 = lsm0Var3.a(R.string.security_phone_number_title, Arrays.copyOf(new Object[0], 0));
                        long jK = h8x.K(ctf0Var, zO);
                        int iOrdinal5 = jph0Var.e.ordinal();
                        if (iOrdinal5 == 0) {
                            strA = lsm0Var3.a(R.string.security_phone_activated_short_v2, Arrays.copyOf(new Object[]{btm0.t(str5)}, 1));
                        } else if (iOrdinal5 == 1) {
                            strA = lsm0Var3.a(R.string.security_phone_number_state_false, Arrays.copyOf(new Object[0], 0));
                        } else if (iOrdinal5 != 2) {
                            if (iOrdinal5 != 3) {
                                t9f.b();
                                return null;
                            }
                            strA = lsm0Var3.a(R.string.security_phone_number_state_false, Arrays.copyOf(new Object[0], 0));
                        } else {
                            strA = lsm0Var3.a(R.string.security_phone_not_activated_short_v2, Arrays.copyOf(new Object[]{btm0.t(str5)}, 1));
                        }
                        String str6 = strA;
                        lc00VarB2.add(new loh0(ssh0Var, zO, zO ? R.drawable.ic_glyph_security_check : R.drawable.ic_glyph_security, jK, h8x.N(ctf0Var, zO), !zO, strA8, str6));
                    }
                }
                dsh0 dsh0Var8 = dsh0.b;
                if (map.containsKey(dsh0Var8)) {
                    boolean zO2 = h8x.O(map, dsh0Var8);
                    ssh0 ssh0Var2 = ssh0.b;
                    Object[] objArr = {String.valueOf(jph0Var.b)};
                    lsm0 lsm0Var4 = ctf0Var.b;
                    String strA9 = lsm0Var4.a(R.string.security_change_password_period_title_v2, Arrays.copyOf(objArr, 1));
                    long jK2 = h8x.K(ctf0Var, zO2);
                    int i16 = jph0Var.f16901a;
                    lc00VarB2.add(new loh0(ssh0Var2, zO2, zO2 ? R.drawable.ic_glyph_security_check : R.drawable.ic_glyph_security, jK2, h8x.N(ctf0Var, zO2), true, strA9, i16 == 0 ? lsm0Var4.a(R.string.security_password_change_now, Arrays.copyOf(new Object[0], 0)) : lsm0Var4.a(R.string.security_password_state_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i16)}, 1))));
                }
                dsh0 dsh0Var9 = dsh0.c;
                if (map.containsKey(dsh0Var9)) {
                    boolean zO3 = h8x.O(map, dsh0Var9);
                    ssh0 ssh0Var3 = ssh0.c;
                    String strA10 = ctf0Var.b.a(R.string.security_secret_question_title, Arrays.copyOf(new Object[0], 0));
                    long jK3 = h8x.K(ctf0Var, zO3);
                    String strF3 = ctf0Var.f(zO3 ? R.string.security_secret_question_state_true : R.string.security_secret_question_state_false, new Object[0]);
                    lc00VarB2.add(new loh0(ssh0Var3, zO3, zO3 ? R.drawable.ic_glyph_security_check : R.drawable.ic_glyph_security, jK3, h8x.N(ctf0Var, zO3), !zO3, strA10, strF3));
                }
                dsh0 dsh0Var10 = dsh0.d;
                if (map.containsKey(dsh0Var10)) {
                    boolean zO4 = h8x.O(map, dsh0Var10);
                    ssh0 ssh0Var4 = ssh0.d;
                    String strA11 = ctf0Var.b.a(R.string.security_tfa_title, Arrays.copyOf(new Object[0], 0));
                    lc00VarB2.add(new loh0(ssh0Var4, zO4, zO4 ? R.drawable.ic_glyph_security_check : R.drawable.ic_glyph_security, h8x.K(ctf0Var, zO4), h8x.N(ctf0Var, zO4), true, strA11, ctf0Var.f(zO4 ? R.string.security_tfa_state_true : R.string.security_tfa_state_false, new Object[0])));
                }
                dsh0 dsh0Var11 = dsh0.e;
                if (map.containsKey(dsh0Var11)) {
                    boolean zO5 = h8x.O(map, dsh0Var11);
                    ssh0 ssh0Var5 = ssh0.e;
                    lsm0 lsm0Var5 = ctf0Var.b;
                    String strA12 = lsm0Var5.a(R.string.personal_data, Arrays.copyOf(new Object[0], 0));
                    long jK4 = h8x.K(ctf0Var, zO5);
                    String strA13 = lsm0Var5.a(zO5 ? R.string.security_page_filled : R.string.security_page_not_filled, Arrays.copyOf(new Object[0], 0));
                    lc00VarB2.add(new loh0(ssh0Var5, zO5, zO5 ? R.drawable.ic_glyph_security_check : R.drawable.ic_glyph_security, jK4, h8x.N(ctf0Var, zO5), !zO5, strA12, strA13));
                }
                dsh0 dsh0Var12 = dsh0.f;
                if (map.containsKey(dsh0Var12)) {
                    boolean zO6 = h8x.O(map, dsh0Var12);
                    ssh0 ssh0Var6 = ssh0.f;
                    lsm0 lsm0Var6 = ctf0Var.b;
                    String strA14 = lsm0Var6.a(R.string.security_forbidden_auth_by_email, Arrays.copyOf(new Object[0], 0));
                    String strA15 = lsm0Var6.a(zO6 ? R.string.security_email_state_true : R.string.security_email_state_false, Arrays.copyOf(new Object[0], 0));
                    lc00Var = lc00VarB2;
                    long jK5 = h8x.K(ctf0Var, zO6);
                    if (zO6) {
                        i15 = R.drawable.ic_glyph_security_check;
                    }
                    lc00Var.add(new moh0(ssh0Var6, zO6, i15, jK5, h8x.N(ctf0Var, zO6), z14, strA14, zO6, strA15));
                } else {
                    lc00Var = lc00VarB2;
                }
                aph0 aph0Var = new aph0(uxfVar, dyb.o0(CollectionsKt.A0(kotlin.collections.a.a(lc00Var), new mjf0((byte) 8))));
                p7m0 p7m0Var5 = iph0Var.K;
                p7m0Var5.getClass();
                p7m0Var5.o(null, aph0Var);
                p7m0 p7m0Var6 = iph0Var.D;
                Boolean bool = Boolean.FALSE;
                p7m0Var6.getClass();
                p7m0Var6.o(null, bool);
                return Unit.f46060a;
            case 12:
                boolean z17 = this.j;
                jph0 jph0Var2 = (jph0) this.k;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                irh0 irh0Var = (irh0) obj2;
                irh0Var.H = z17;
                boolean z18 = irh0Var.h.a().N.f;
                ctf0 ctf0Var2 = irh0Var.u;
                jph0Var2.getClass();
                ctf0Var2.getClass();
                lc00 lc00VarB3 = kotlin.collections.a.b();
                cge0 cge0Var = mrh0.f22272a;
                int i17 = jph0Var2.c;
                cge0Var.getClass();
                mrh0 mrh0VarI2 = cge0.i(i17);
                boolean z19 = jph0Var2.g;
                Map map2 = jph0Var2.d;
                if (z19) {
                    if (map2.isEmpty()) {
                        i10 = 0;
                    } else {
                        Iterator it3 = map2.entrySet().iterator();
                        int i18 = 0;
                        while (it3.hasNext()) {
                            if (((Boolean) ((Map.Entry) it3.next()).getValue()).booleanValue()) {
                                i18++;
                            }
                        }
                        i10 = i18;
                    }
                    lc00VarB3.add(new dqh0(i10, map2.size(), ctf0Var2.f(R.string.security_gift_title, new Object[0]), z19));
                }
                if (mrh0VarI2 == mrh0.b) {
                    if (z18) {
                        dsh0Var6 = dsh0.f6610a;
                        if (map2.containsKey(dsh0Var6)) {
                            str2 = jph0Var2.f;
                            boolean zE5 = q8x.E(map2, dsh0Var6);
                            ssh0 ssh0Var7 = ssh0.f32726a;
                            String strF4 = ctf0Var2.f(R.string.security_phone_number_title, new Object[0]);
                            iOrdinal3 = jph0Var2.e.ordinal();
                            if (iOrdinal3 != 0) {
                                strF2 = ctf0Var2.f(R.string.security_phone_activated_short_v2, btm0.t(str2));
                            } else if (iOrdinal3 == 1) {
                                strF2 = ctf0Var2.f(R.string.security_phone_number_state_false, new Object[0]);
                            } else if (iOrdinal3 != 2) {
                                if (iOrdinal3 != 3) {
                                    t9f.b();
                                }
                                strF2 = ctf0Var2.f(R.string.security_phone_number_state_false, new Object[0]);
                            } else {
                                strF2 = ctf0Var2.f(R.string.security_phone_not_activated_short_v2, btm0.t(str2));
                            }
                            lc00VarB3.add(new fqh0(ssh0Var7, zE5, strF4, strF2, !zE5));
                        }
                    }
                    dsh0Var = dsh0.b;
                    if (map2.containsKey(dsh0Var)) {
                        boolean zE6 = q8x.E(map2, dsh0Var);
                        ssh0 ssh0Var8 = ssh0.b;
                        String strF5 = ctf0Var2.f(R.string.security_change_password_period_title_v2, String.valueOf(jph0Var2.b));
                        i7 = jph0Var2.f16901a;
                        if (i7 == 0) {
                            strF = ctf0Var2.f(R.string.security_password_change_now, new Object[0]);
                        } else {
                            strF = ctf0Var2.f(R.string.security_password_state_v2, Integer.valueOf(i7));
                        }
                        lc00VarB3.add(new fqh0(ssh0Var8, zE6, strF5, strF, true));
                    }
                    dsh0Var2 = dsh0.c;
                    if (map2.containsKey(dsh0Var2)) {
                        zE4 = q8x.E(map2, dsh0Var2);
                        ssh0 ssh0Var9 = ssh0.c;
                        String strF6 = ctf0Var2.f(R.string.security_secret_question_title, new Object[0]);
                        if (zE4) {
                            i6 = R.string.security_secret_question_state_true;
                        } else {
                            i6 = R.string.security_secret_question_state_false;
                        }
                        lc00VarB3.add(new fqh0(ssh0Var9, zE4, strF6, ctf0Var2.f(i6, new Object[0]), !zE4));
                    }
                    dsh0Var3 = dsh0.d;
                    if (map2.containsKey(dsh0Var3)) {
                        zE3 = q8x.E(map2, dsh0Var3);
                        ssh0 ssh0Var10 = ssh0.d;
                        String strF7 = ctf0Var2.f(R.string.security_tfa_title, new Object[0]);
                        if (zE3) {
                            i5 = R.string.security_tfa_state_true;
                        } else {
                            i5 = R.string.security_tfa_state_false;
                        }
                        lc00VarB3.add(new fqh0(ssh0Var10, zE3, strF7, ctf0Var2.f(i5, new Object[0]), true));
                    }
                    dsh0Var4 = dsh0.e;
                    if (map2.containsKey(dsh0Var4)) {
                        zE2 = q8x.E(map2, dsh0Var4);
                        ssh0 ssh0Var11 = ssh0.e;
                        String strF8 = ctf0Var2.f(R.string.personal_data, new Object[0]);
                        if (zE2) {
                            i4 = R.string.security_page_filled;
                        } else {
                            i4 = R.string.security_page_not_filled;
                        }
                        lc00VarB3.add(new fqh0(ssh0Var11, zE2, strF8, ctf0Var2.f(i4, new Object[0]), !zE2));
                    }
                    dsh0Var5 = dsh0.f;
                    if (map2.containsKey(dsh0Var5)) {
                        zE = q8x.E(map2, dsh0Var5);
                        ssh0 ssh0Var12 = ssh0.f;
                        String strF9 = ctf0Var2.f(R.string.security_forbidden_auth_by_email, new Object[0]);
                        if (zE) {
                            i3 = R.string.security_email_state_true;
                        } else {
                            i3 = R.string.security_email_state_false;
                        }
                        String strF10 = ctf0Var2.f(i3, new Object[0]);
                        lc00Var2 = lc00VarB3;
                        lc00Var2.add(new gqh0(ssh0Var12, zE, z17, strF9, zE, strF10));
                    } else {
                        lc00Var2 = lc00VarB3;
                    }
                    zqh0 zqh0Var = new zqh0(CollectionsKt.A0(kotlin.collections.a.a(lc00Var2), new mjf0((byte) 10)));
                    p7m0 p7m0Var7 = irh0Var.J;
                    p7m0Var7.getClass();
                    p7m0Var7.o(null, zqh0Var);
                    p7m0 p7m0Var8 = irh0Var.D;
                    Boolean bool2 = Boolean.FALSE;
                    p7m0Var8.getClass();
                    p7m0Var8.o(null, bool2);
                    return Unit.f46060a;
                }
                if (map2.isEmpty()) {
                    i8 = 0;
                } else {
                    Iterator it4 = map2.entrySet().iterator();
                    i8 = 0;
                    while (it4.hasNext()) {
                        if (((Boolean) ((Map.Entry) it4.next()).getValue()).booleanValue()) {
                            i8++;
                        }
                    }
                }
                int size2 = map2.size();
                float f2 = size2 == 0 ? 0.0f : i8 / size2;
                mrh0.f22272a.getClass();
                mrh0 mrh0VarI3 = cge0.i(i17);
                int iOrdinal6 = mrh0VarI3.ordinal();
                if (iOrdinal6 == 0) {
                    i9 = R.string.increase_the_security;
                } else if (iOrdinal6 == 1) {
                    i9 = R.string.security_level_title_low_new;
                } else if (iOrdinal6 == 2) {
                    i9 = R.string.security_level_title_bad_new;
                } else if (iOrdinal6 == 3) {
                    i9 = R.string.security_level_title_normal_new;
                } else if (iOrdinal6 == 4) {
                    i9 = R.string.security_level_title_full_secure;
                } else {
                    t9f.b();
                }
                String strF11 = ctf0Var2.f(i9, new Object[0]);
                String strF12 = ctf0Var2.f(R.string.security_level_description, new Object[0]);
                int iOrdinal7 = mrh0VarI3.ordinal();
                if (iOrdinal7 == 0 || iOrdinal7 == 1) {
                    d4dVar2 = d4d.STATIC_RED;
                } else if (iOrdinal7 == 2) {
                    d4dVar2 = d4d.STATIC_DARK_ORANGE;
                } else if (iOrdinal7 == 3) {
                    d4dVar2 = d4d.STATIC_YELLOW;
                } else if (iOrdinal7 == 4) {
                    d4dVar2 = d4d.STATIC_GREEN;
                } else {
                    t9f.b();
                }
                lc00VarB3.add(new eqh0(strF11, strF12, mrh0VarI3 != mrh0.f, f2, i8, size2, d4dVar2));
                if (z18) {
                    dsh0Var6 = dsh0.f6610a;
                    if (map2.containsKey(dsh0Var6)) {
                        str2 = jph0Var2.f;
                        boolean zE7 = q8x.E(map2, dsh0Var6);
                        ssh0 ssh0Var13 = ssh0.f32726a;
                        String strF13 = ctf0Var2.f(R.string.security_phone_number_title, new Object[0]);
                        iOrdinal3 = jph0Var2.e.ordinal();
                        if (iOrdinal3 != 0) {
                            strF2 = ctf0Var2.f(R.string.security_phone_activated_short_v2, btm0.t(str2));
                        } else if (iOrdinal3 == 1) {
                            strF2 = ctf0Var2.f(R.string.security_phone_number_state_false, new Object[0]);
                        } else if (iOrdinal3 != 2) {
                            if (iOrdinal3 != 3) {
                                t9f.b();
                            }
                            strF2 = ctf0Var2.f(R.string.security_phone_number_state_false, new Object[0]);
                        } else {
                            strF2 = ctf0Var2.f(R.string.security_phone_not_activated_short_v2, btm0.t(str2));
                        }
                        lc00VarB3.add(new fqh0(ssh0Var13, zE7, strF13, strF2, !zE7));
                    }
                }
                dsh0Var = dsh0.b;
                if (map2.containsKey(dsh0Var)) {
                    boolean zE8 = q8x.E(map2, dsh0Var);
                    ssh0 ssh0Var14 = ssh0.b;
                    String strF14 = ctf0Var2.f(R.string.security_change_password_period_title_v2, String.valueOf(jph0Var2.b));
                    i7 = jph0Var2.f16901a;
                    if (i7 == 0) {
                        strF = ctf0Var2.f(R.string.security_password_change_now, new Object[0]);
                    } else {
                        strF = ctf0Var2.f(R.string.security_password_state_v2, Integer.valueOf(i7));
                    }
                    lc00VarB3.add(new fqh0(ssh0Var14, zE8, strF14, strF, true));
                }
                dsh0Var2 = dsh0.c;
                if (map2.containsKey(dsh0Var2)) {
                    zE4 = q8x.E(map2, dsh0Var2);
                    ssh0 ssh0Var15 = ssh0.c;
                    String strF15 = ctf0Var2.f(R.string.security_secret_question_title, new Object[0]);
                    if (zE4) {
                        i6 = R.string.security_secret_question_state_true;
                    } else {
                        i6 = R.string.security_secret_question_state_false;
                    }
                    lc00VarB3.add(new fqh0(ssh0Var15, zE4, strF15, ctf0Var2.f(i6, new Object[0]), !zE4));
                }
                dsh0Var3 = dsh0.d;
                if (map2.containsKey(dsh0Var3)) {
                    zE3 = q8x.E(map2, dsh0Var3);
                    ssh0 ssh0Var16 = ssh0.d;
                    String strF16 = ctf0Var2.f(R.string.security_tfa_title, new Object[0]);
                    if (zE3) {
                        i5 = R.string.security_tfa_state_true;
                    } else {
                        i5 = R.string.security_tfa_state_false;
                    }
                    lc00VarB3.add(new fqh0(ssh0Var16, zE3, strF16, ctf0Var2.f(i5, new Object[0]), true));
                }
                dsh0Var4 = dsh0.e;
                if (map2.containsKey(dsh0Var4)) {
                    zE2 = q8x.E(map2, dsh0Var4);
                    ssh0 ssh0Var17 = ssh0.e;
                    String strF17 = ctf0Var2.f(R.string.personal_data, new Object[0]);
                    if (zE2) {
                        i4 = R.string.security_page_filled;
                    } else {
                        i4 = R.string.security_page_not_filled;
                    }
                    lc00VarB3.add(new fqh0(ssh0Var17, zE2, strF17, ctf0Var2.f(i4, new Object[0]), !zE2));
                }
                dsh0Var5 = dsh0.f;
                if (map2.containsKey(dsh0Var5)) {
                    zE = q8x.E(map2, dsh0Var5);
                    ssh0 ssh0Var18 = ssh0.f;
                    String strF18 = ctf0Var2.f(R.string.security_forbidden_auth_by_email, new Object[0]);
                    if (zE) {
                        i3 = R.string.security_email_state_true;
                    } else {
                        i3 = R.string.security_email_state_false;
                    }
                    String strF19 = ctf0Var2.f(i3, new Object[0]);
                    lc00Var2 = lc00VarB3;
                    lc00Var2.add(new gqh0(ssh0Var18, zE, z17, strF18, zE, strF19));
                } else {
                    lc00Var2 = lc00VarB3;
                }
                zqh0 zqh0Var2 = new zqh0(CollectionsKt.A0(kotlin.collections.a.a(lc00Var2), new mjf0((byte) 10)));
                p7m0 p7m0Var9 = irh0Var.J;
                p7m0Var9.getClass();
                p7m0Var9.o(null, zqh0Var2);
                p7m0 p7m0Var10 = irh0Var.D;
                Boolean bool3 = Boolean.FALSE;
                p7m0Var10.getClass();
                p7m0Var10.o(null, bool3);
                return Unit.f46060a;
                return null;
            case 13:
                return l(obj);
            case 14:
                List list5 = (List) this.k;
                boolean z20 = this.j;
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                iwk0 iwk0Var = (iwk0) obj2;
                iwk0Var.q0.getClass();
                list5.getClass();
                ArrayList arrayList = new ArrayList();
                if (!list5.isEmpty() || !z20) {
                    if (!z20) {
                        arrayList.add(bok0Var);
                    }
                    arrayList.add(aok0Var);
                    arrayList.addAll(list5);
                }
                iwk0Var.H(new mo1(arrayList, (byte) 6));
                return Unit.f46060a;
            default:
                Throwable th8 = (Throwable) this.k;
                wne wneVar15 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    xcc xccVar8 = ((wfq0) obj2).b;
                    this.k = null;
                    this.j = true;
                    if (xccVar8.a(th8, this) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
