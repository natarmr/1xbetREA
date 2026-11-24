package a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.textclassifier.TextClassification;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.math.BigDecimal;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a6p0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f327a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a6p0(byte b, int i, mm40 mm40Var, Object obj) {
        this.f327a = b;
        this.c = obj;
        this.b = mm40Var;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x043c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0440  */
    /* JADX WARN: Code duplicated, block: B:112:0x04b1  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Object value2;
        o9q0 o9q0Var;
        String str;
        obq0 obq0VarA;
        Object value3;
        cl5 cl5Var;
        final byte b;
        boolean zG;
        Object objP;
        boolean z;
        w0o w0oVar;
        byte b2 = this.f327a;
        cl5 cl5Var2 = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        l4q0 l4q0Var = null;
        i2oVar = null;
        i2o i2oVar = null;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b2) {
            case 0:
                ((Integer) obj2).getClass();
                kc5.C0((mm40) obj4, (c6p0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                nsm0.h((mm40) obj4, (lep0) obj3, (fet) obj, x8x.L(65));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                jtt0.b((x1z) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                j5n0.j((rkp0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                o5n0.f((skp0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                ycm0.e((mm40) obj4, (kmp0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                p8a.m((lnp0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                q8a.o((gtp0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                q8a.E((ftp0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                zgc.G((lzp0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                x0q0 x0q0Var = (x0q0) obj3;
                oyg0 oyg0Var = x0q0Var.f;
                ocj ocjVar = x0q0Var.i;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                if (((Throwable) obj4) instanceof ff5) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value2, p0q0.a((p0q0) value2, false, false, 26)));
                } else {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value, p0q0.a((p0q0) value, false, true, 28)));
                }
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                tke.l((v3q0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                ((hfk0) obj4).h((Drawable) obj3, (fet) obj, x8x.L(49));
                return Unit.f46060a;
            case 13:
                k7q0 k7q0Var = (k7q0) obj4;
                vne vneVar = (vne) obj3;
                s4q0 s4q0Var = (s4q0) obj;
                Context context = (Context) obj2;
                boolean zH = k7q0Var.h();
                j83 j83VarK = k7q0Var.k();
                String str2 = j83VarK != null ? j83VarK.b : null;
                o9q0 o9q0Var2 = k7q0Var.w;
                if (o9q0Var2 != null) {
                    long j = o9q0Var2.f24893a;
                    qe60 qe60Var = k7q0Var.b;
                    o9q0Var = new o9q0(s7n0.e(qe60Var.s((int) (j >> 32)), qe60Var.s((int) (j & 4294967295L))));
                } else {
                    o9q0Var = null;
                }
                hw90 hw90Var = k7q0Var.j;
                nej0 nej0Var = new nej0((Object) k7q0Var, (Object) vneVar, (Object) context, (byte) 22);
                zfn zfnVar = mw90.f22493a;
                if (Build.VERSION.SDK_INT < 28 || str2 == null || o9q0Var == null || hw90Var == null || !(hw90Var instanceof lw90)) {
                    String str3 = str2;
                    nej0Var.invoke(s4q0Var);
                    if (str3 != null && o9q0Var != null) {
                        n7x.o(s4q0Var, context, zH, str3, o9q0Var.f24893a);
                    }
                } else {
                    lw90 lw90Var = (lw90) hw90Var;
                    long j2 = o9q0Var.f24893a;
                    Object obj5 = lw90Var.h;
                    k050 k050Var = lw90Var.e;
                    if (k050Var.g()) {
                        l4q0 l4q0Var2 = (l4q0) ((hgk0) lw90Var.g).getValue();
                        if (l4q0Var2 == null || !o9q0.b(j2, l4q0Var2.b) || !Intrinsics.d(str2, l4q0Var2.f19422a)) {
                            l4q0Var2 = null;
                        }
                        k050Var.c(null);
                        l4q0Var = l4q0Var2;
                    }
                    if (l4q0Var == null) {
                        nej0Var.invoke(s4q0Var);
                    } else {
                        ArrayList arrayList = l4q0Var.d;
                        TextClassification textClassification = l4q0Var.c;
                        if (!textClassification.getActions().isEmpty()) {
                            s4q0Var.f31620a.a(new h5q0(obj5, textClassification, 0, (Drawable) arrayList.get(0)));
                        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                            s4q0Var.f31620a.a(new h5q0(obj5, textClassification, -1, textClassification.getIcon()));
                        }
                        nej0Var.invoke(s4q0Var);
                        List actions = textClassification.getActions();
                        int size = actions.size();
                        for (int i = 0; i < size; i++) {
                            um30.v(actions.get(i));
                            if (i > 0) {
                                s4q0Var.f31620a.a(new h5q0(obj5, textClassification, i, (Drawable) arrayList.get(i)));
                            }
                        }
                    }
                    n7x.o(s4q0Var, context, zH, str2, o9q0Var.f24893a);
                }
                return Unit.f46060a;
            case 14:
                xbq0 xbq0Var = (xbq0) obj4;
                String str4 = (String) obj3;
                lw5 lw5Var = (lw5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m6m0 m6m0Var = xbq0.O1;
                lw5Var.getClass();
                if (lw5Var == lw5.f20747a) {
                    zbq0 zbq0VarK0 = xbq0Var.K0();
                    uaq0.f35345a.getClass();
                    uaq0 uaq0VarD = s9m0.d(iIntValue);
                    uaq0VarD.getClass();
                    zbq0VarK0.l.c(uaq0VarD);
                } else {
                    zbq0 zbq0VarK1 = xbq0Var.K0();
                    boolean zIs24HourFormat = DateFormat.is24HourFormat(xbq0Var.I0().f36838a.getContext());
                    boolean zEquals = str4.equals("TIME_PICKER_ON_DIALOG_KEY");
                    vkq0 vkq0VarA = zbq0VarK1.k.a(zEquals);
                    String strW = zbq0VarK1.w(vkq0VarA.f37587a, vkq0VarA.b, zIs24HourFormat);
                    p7m0 p7m0Var3 = zbq0VarK1.n;
                    while (true) {
                        Object value4 = p7m0Var3.getValue();
                        obq0 obq0Var = (obq0) value4;
                        if (zEquals) {
                            obq0VarA = obq0.a(obq0Var, null, false, false, strW, null, 47);
                            str = strW;
                        } else {
                            str = strW;
                            obq0VarA = obq0.a(obq0Var, null, false, false, null, str, 31);
                        }
                        if (!p7m0Var3.m(value4, obq0VarA)) {
                            strW = str;
                        }
                    }
                }
                return Unit.f46060a;
            case 15:
                lkq0 lkq0Var = (lkq0) obj4;
                Throwable th = (Throwable) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var4 = lkq0Var.i.f25029a;
                do {
                    value3 = p7m0Var4.getValue();
                    value3.getClass();
                    lkq0Var.f.getClass();
                } while (!p7m0Var4.m(value3, ikq0.a((ikq0) value3, false, false, false, false, null, 0, 0, 253)));
                String strA = lkq0Var.p.b.a(R.string.something_went_wrong, Arrays.copyOf(new Object[0], 0));
                if ((th instanceof zhi0) && ((zhi0) th).f44396a == i2o.Forbidden.getErrorCode()) {
                    String message = th.getMessage();
                    String str5 = message != null ? message : "";
                    if (!StringsKt.W(str5)) {
                        strA = str5;
                    }
                    lkq0Var.G(new gkq0(strA));
                } else {
                    lkq0Var.G(new fkq0(strA));
                }
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                ltt0.g((mm40) obj4, (lrq0) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                pvm0.g((mm40) obj4, (zrr0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                j5n0.n((mm40) obj4, (x00) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                dnm0.d((mm40) obj4, (d9r0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                mm40 mm40Var = (mm40) obj4;
                final nar0 nar0Var = (nar0) obj3;
                fet fetVar = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarD, 16.0f, 16.0f, 16.0f, 0.0f, 8);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
                    mkd.c0.getClass();
                    fetVar.i0();
                    boolean z2 = fetVar.S;
                    pcy pcyVar = e7z.u1;
                    if (z2) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar, x5dVarA, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar, numValueOf, shdVar3);
                    jpm0.n(fetVar);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar, mm40VarC0, shdVar4);
                    String str6 = nar0Var.f23204a;
                    y9q0 y9q0VarM = g1t0.m();
                    pz40 pz40Var = s6t0.f31722a;
                    v8q0.a(str6, null, s6t0.b().f33626a.getPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarM, fetVar, 0, 0, 131066);
                    mm40 mm40VarN2 = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
                    lw3 lw3Var = uc9.f35418a;
                    thg0 thg0VarA = shg0.a(lw3Var, gqw0.j, fetVar, 0);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN2);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, shdVar);
                    jpm0.o(fetVar, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC1, shdVar4);
                    zhg0 zhg0Var = zhg0.f44392a;
                    mm40 mm40VarA = zhg0Var.a(0.5f, jm40Var, true);
                    yx7 yx7Var = gqw0.k;
                    thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar, 54);
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarA);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA2, shdVar);
                    jpm0.o(fetVar, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC2, shdVar4);
                    mm40 mm40VarN3 = o7k0.n(jm40Var, 32.0f);
                    boolean zG2 = fetVar.g(nar0Var);
                    Object objP2 = fetVar.P();
                    if (zG2) {
                        cl5Var = cl5Var2;
                    } else {
                        cl5Var = cl5Var2;
                        if (objP2 != cl5Var) {
                            b = 0;
                        }
                        kkb.p(b, fetVar, mm40VarN3, (Function0) objP2);
                        v8q0.a(nar0Var.b, zhg0Var.a(1.0f, s5x0.L(jm40Var, 8.0f, 0.0f, 2), true), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, g1t0.g(), fetVar, 0, 24960, 109560);
                        fetVar.r(true);
                        mm40 mm40VarA2 = zhg0Var.a(0.5f, jm40Var, true);
                        thg0 thg0VarA3 = shg0.a(uc9.b, yx7Var, fetVar, 54);
                        int iHashCode4 = Long.hashCode(fetVar.T);
                        bh90 bh90VarM4 = fetVar.m();
                        mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarA2);
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(pcyVar);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, thg0VarA3, shdVar);
                        jpm0.o(fetVar, bh90VarM4, shdVar2);
                        vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
                        jpm0.o(fetVar, mm40VarC3, shdVar4);
                        v8q0.a(nar0Var.d, zhg0Var.a(1.0f, s5x0.L(jm40Var, 8.0f, 0.0f, 2), true), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, g1t0.g(), fetVar, 0, 24960, 109560);
                        mm40 mm40VarN4 = o7k0.n(jm40Var, 32.0f);
                        zG = fetVar.g(nar0Var);
                        objP = fetVar.P();
                        if (!zG || objP == cl5Var) {
                            z = true;
                            final char c = 1 == true ? 1 : 0;
                            objP = new Function0() { // from class: a.mar0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    byte b3 = c;
                                    nar0 nar0Var2 = nar0Var;
                                    switch (b3) {
                                        case 0:
                                            return nar0Var2.c;
                                        default:
                                            return nar0Var2.e;
                                    }
                                }
                            };
                            fetVar.o0(objP);
                        } else {
                            z = true;
                        }
                        kkb.p(0, fetVar, mm40VarN4, (Function0) objP);
                        fetVar.r(z);
                        fetVar.r(z);
                        xkb.r(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13), nar0Var.f, 0, 0, fetVar, 0);
                        xkb.r(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13), nar0Var.g, 0, 0, fetVar, 0);
                        fetVar.r(true);
                    }
                    b = 0;
                    objP2 = new Function0() { // from class: a.mar0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b3 = b;
                            nar0 nar0Var2 = nar0Var;
                            switch (b3) {
                                case 0:
                                    return nar0Var2.c;
                                default:
                                    return nar0Var2.e;
                            }
                        }
                    };
                    fetVar.o0(objP2);
                    kkb.p(b, fetVar, mm40VarN3, (Function0) objP2);
                    v8q0.a(nar0Var.b, zhg0Var.a(1.0f, s5x0.L(jm40Var, 8.0f, 0.0f, 2), true), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, g1t0.g(), fetVar, 0, 24960, 109560);
                    fetVar.r(true);
                    mm40 mm40VarA3 = zhg0Var.a(0.5f, jm40Var, true);
                    thg0 thg0VarA4 = shg0.a(uc9.b, yx7Var, fetVar, 54);
                    int iHashCode5 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM5 = fetVar.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarA3);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA4, shdVar);
                    jpm0.o(fetVar, bh90VarM5, shdVar2);
                    vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC4, shdVar4);
                    v8q0.a(nar0Var.d, zhg0Var.a(1.0f, s5x0.L(jm40Var, 8.0f, 0.0f, 2), true), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, g1t0.g(), fetVar, 0, 24960, 109560);
                    mm40 mm40VarN5 = o7k0.n(jm40Var, 32.0f);
                    zG = fetVar.g(nar0Var);
                    objP = fetVar.P();
                    if (zG) {
                        z = true;
                        final byte c2 = 1 == true ? 1 : 0;
                        objP = new Function0() { // from class: a.mar0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b3 = c2;
                                nar0 nar0Var2 = nar0Var;
                                switch (b3) {
                                    case 0:
                                        return nar0Var2.c;
                                    default:
                                        return nar0Var2.e;
                                }
                            }
                        };
                        fetVar.o0(objP);
                    } else {
                        z = true;
                        final byte c3 = 1 == true ? 1 : 0;
                        objP = new Function0() { // from class: a.mar0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b3 = c3;
                                nar0 nar0Var2 = nar0Var;
                                switch (b3) {
                                    case 0:
                                        return nar0Var2.c;
                                    default:
                                        return nar0Var2.e;
                                }
                            }
                        };
                        fetVar.o0(objP);
                    }
                    kkb.p(0, fetVar, mm40VarN5, (Function0) objP);
                    fetVar.r(z);
                    fetVar.r(z);
                    xkb.r(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13), nar0Var.f, 0, 0, fetVar, 0);
                    xkb.r(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13), nar0Var.g, 0, 0, fetVar, 0);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 21:
                i3t0 i3t0Var = (i3t0) obj4;
                l7m0 l7m0Var = (l7m0) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    gfx.h(6, fetVar2, true);
                    pz40 pz40Var2 = s6t0.f31722a;
                    mm40 mm40VarH = phu0.H(i120.Q(jm40Var, s6t0.b().f33626a.getBackground(), jd8.n), null, 1);
                    llb0 llb0Var = (llb0) l7m0Var.getValue();
                    boolean zI = fetVar2.i(i3t0Var);
                    Object objP3 = fetVar2.P();
                    if (zI || objP3 == cl5Var2) {
                        ddr0 ddr0Var = new ddr0(1, i3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 1);
                        fetVar2.o0(ddr0Var);
                        objP3 = ddr0Var;
                    }
                    gq80.X(mm40VarH, llb0Var, (Function1) ((jhy) objP3), fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                btm0.h((snr0) obj3, (mm40) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 23:
                fir0 fir0Var = (fir0) obj4;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                String message2 = ((Throwable) obj3).getMessage();
                fir0Var.G(new vhr0(message2 != null ? message2 : ""));
                return Unit.f46060a;
            case 24:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                ol60 ol60Var = ((njr0) obj4).I;
                String message3 = ((Throwable) obj3).getMessage();
                ol60Var.f(new zir0(message3 != null ? message3 : ""));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                nia0.V((njr0) obj3, (mm40) obj4, (fet) obj, x8x.L(9));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                j5n0.o((mm40) obj4, (tnr0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                String str7 = (String) obj4;
                tqr0 tqr0Var = (tqr0) obj2;
                ((oyg0) obj).getClass();
                tqr0Var.getClass();
                str7.getClass();
                return tqr0.a(tqr0Var, new w7y(new jpr0("", "", "", str7, -1L)), new c3y((ra10) obj3), false, null, null, 120);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                rek0 rek0Var = rek0.b;
                Throwable th2 = (Throwable) obj4;
                ltr0 ltr0Var = (ltr0) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                if ((th2 instanceof SocketTimeoutException) || (th2 instanceof UnknownHostException) || (th2 instanceof el50)) {
                    ltr0Var.O();
                } else if (th2 instanceof zhi0) {
                    ltr0Var.getClass();
                    uhi0 uhi0Var = ((zhi0) th2).d;
                    String str8 = uhi0Var != null ? uhi0Var.b : null;
                    String str9 = str8 == null ? "" : str8;
                    if (uhi0Var != null && (w0oVar = uhi0Var.g) != null) {
                        i2oVar = w0oVar.b;
                    }
                    int i2 = i2oVar != null ? itr0.f15367a[i2oVar.ordinal()] : -1;
                    if (i2 == 1) {
                        ltr0Var.G(new btr0(str9));
                    } else if (i2 != 2) {
                        ltr0Var.G(new dtr0(new xdk0(rek0Var, str9, null, null, null, null, 124)));
                    } else {
                        ltr0Var.G(new dtr0(new xdk0(pek0.f26859a, ltr0Var.q.b.a(R.string.toto_promocode_not_found, Arrays.copyOf(new Object[0], 0)), null, null, null, null, 124)));
                    }
                } else {
                    String message4 = th2.getMessage();
                    String str10 = message4 == null ? "" : message4;
                    ltr0Var.getClass();
                    ltr0Var.G(new dtr0(new xdk0(rek0Var, str10, null, null, null, null, 124)));
                }
                return Unit.f46060a;
            default:
                a8q0 a8q0Var = (a8q0) obj4;
                BigDecimal bigDecimal = (BigDecimal) obj3;
                ftr0 ftr0Var = (ftr0) obj2;
                ((oyg0) obj).getClass();
                ftr0Var.getClass();
                pur0 pur0Var = ftr0Var.f;
                rjr0 rjr0Var = pur0Var.f27632a;
                bigDecimal.getClass();
                return ftr0.a(ftr0Var, null, null, pur0.a(pur0Var, rjr0.a(rjr0Var, a8q0Var, bigDecimal, null, null, null, null, false, false, 252), null, 2), false, null, 223);
        }
    }

    public /* synthetic */ a6p0(Object obj, Object obj2, byte b) {
        this.f327a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ a6p0(Object obj, Object obj2, int i, byte b) {
        this.f327a = b;
        this.b = obj;
        this.c = obj2;
    }
}
