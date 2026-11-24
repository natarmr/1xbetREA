package a;

import android.content.ClipData;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ContentInfo;
import android.view.View;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.motion.AppBarMotionLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class prc implements j5a, vo9, oee, SuccessContinuation, zf60, giu0, p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27457a;
    public Object b;

    public prc(byte b) {
        this.f27457a = b;
        switch (b) {
            case 22:
                this.b = new yox(wjt.l);
                break;
        }
    }

    @Override // a.p0h0
    public diu0 a(vzg0 vzg0Var) {
        dti dtiVar = (dti) ((msi) this.b).c;
        return new r3i0(dtiVar.f6657a, new sqt(), dtiVar.c, vzg0Var);
    }

    /* JADX WARN: Code duplicated, block: B:204:0x038a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:205:0x038c  */
    /* JADX WARN: Code duplicated, block: B:206:0x038e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:207:0x0390  */
    /* JADX WARN: Code duplicated, block: B:208:0x0392  */
    /* JADX WARN: Code duplicated, block: B:209:0x0394 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:210:0x0396  */
    /* JADX WARN: Code duplicated, block: B:211:0x0398 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:212:0x039a  */
    /* JADX WARN: Code duplicated, block: B:213:0x039d  */
    /* JADX WARN: Code duplicated, block: B:216:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:219:0x03af  */
    /* JADX WARN: Code duplicated, block: B:221:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:223:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:225:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:227:0x03be  */
    /* JADX WARN: Code duplicated, block: B:228:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:229:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:230:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:233:0x03d2 A[LOOP:21: B:242:0x0234->B:233:0x03d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:281:0x0388 A[SYNTHETIC] */
    public ykj b(o24 o24Var, Map map) throws bwq, q9c {
        hm40 hm40Var;
        hm40 hm40Var2;
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        int iB;
        ubu0 ubu0VarN = o24Var.n();
        int i5 = o24Var.m().f5092a;
        cwq cwqVarM = o24Var.m();
        ubu0 ubu0VarN2 = o24Var.n();
        int i6 = hne.H(8)[cwqVarM.b];
        r68 r68Var = (r68) o24Var.b;
        int i7 = r68Var.b;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            for (int i10 = 0; i10 < i7; i10++) {
                if (b1j.a(i6, i9, i10)) {
                    r68Var.a(i10, i9);
                }
            }
        }
        int i11 = ubu0VarN2.f35401a * 4;
        int i12 = i11 + 17;
        int i13 = ubu0VarN2.d;
        r68 r68Var2 = new r68(i12, i12);
        r68Var2.i(0, 0, 9, 9);
        int i14 = i11 + 9;
        r68Var2.i(i14, 0, 8, 9);
        r68Var2.i(0, i14, 9, 8);
        int[] iArr = ubu0VarN2.b;
        int length = iArr.length;
        int i15 = 0;
        while (i15 < length) {
            int i16 = iArr[i15] - 2;
            for (int i17 = i8; i17 < length; i17++) {
                if ((i15 != 0 || (i17 != 0 && i17 != length - 1)) && (i15 != length - 1 || i17 != 0)) {
                    r68Var2.i(iArr[i17] - 2, i16, 5, 5);
                }
            }
            i15++;
            i8 = 0;
        }
        int i18 = 2;
        int i19 = 6;
        int i20 = 1;
        r68Var2.i(6, 9, 1, i11);
        r68Var2.i(9, 6, i11, 1);
        if (ubu0VarN2.f35401a > 6) {
            int i21 = i11 + 6;
            r68Var2.i(i21, 0, 3, 6);
            r68Var2.i(0, i21, 6, 3);
        }
        byte[] bArr = new byte[i13];
        int i22 = i7 - 1;
        int i23 = i22;
        boolean z = true;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        while (i23 > 0) {
            if (i23 == i19) {
                i23--;
            }
            int i27 = 0;
            while (i27 < i7) {
                int i28 = z ? i22 - i27 : i27;
                int i29 = i20;
                int i30 = 0;
                for (int i31 = i18; i30 < i31; i31 = 2) {
                    int i32 = i23 - i30;
                    if (!r68Var2.b(i32, i28)) {
                        i25++;
                        i26 <<= 1;
                        if (r68Var.b(i32, i28)) {
                            i26 |= 1;
                        }
                        if (i25 == 8) {
                            bArr[i24] = (byte) i26;
                            i24++;
                            i25 = 0;
                            i26 = 0;
                        }
                    }
                    i30++;
                }
                i27++;
                i20 = i29;
                i18 = 2;
            }
            z = !z;
            i23 -= 2;
            i19 = 6;
            i18 = 2;
        }
        int i33 = i20;
        if (i24 != i13) {
            throw bwq.a();
        }
        if (i13 != ubu0VarN.d) {
            e9d0.o();
            return null;
        }
        oo8 oo8Var = ubu0VarN.c[hne.E(i5)];
        qbu0[] qbu0VarArr = (qbu0[]) oo8Var.b;
        byte b = oo8Var.f25582a;
        int i34 = 0;
        for (qbu0 qbu0Var : qbu0VarArr) {
            i34 += qbu0Var.f28456a;
        }
        oo8[] oo8VarArr = new oo8[i34];
        int i35 = 0;
        for (qbu0 qbu0Var2 : qbu0VarArr) {
            int i36 = 0;
            while (i36 < qbu0Var2.f28456a) {
                byte b2 = qbu0Var2.b;
                oo8VarArr[i35] = new oo8(b2, new byte[b + b2]);
                i36++;
                i35++;
            }
        }
        int length2 = ((byte[]) oo8VarArr[0].b).length;
        int i37 = i34 - 1;
        while (i37 >= 0 && ((byte[]) oo8VarArr[i37].b).length != length2) {
            i37--;
        }
        int i38 = i37 + 1;
        int i39 = length2 - b;
        int i40 = 0;
        int i41 = 0;
        while (i40 < i39) {
            int i42 = i41;
            int i43 = 0;
            while (i43 < i35) {
                ((byte[]) oo8VarArr[i43].b)[i40] = bArr[i42];
                i43++;
                i42++;
            }
            i40++;
            i41 = i42;
        }
        int i44 = i38;
        while (i44 < i35) {
            ((byte[]) oo8VarArr[i44].b)[i39] = bArr[i41];
            i44++;
            i41++;
        }
        boolean z2 = false;
        int length3 = ((byte[]) oo8VarArr[0].b).length;
        while (i39 < length3) {
            int i45 = i41;
            int i46 = 0;
            while (i46 < i35) {
                ((byte[]) oo8VarArr[i46].b)[i46 < i38 ? i39 : i39 + 1] = bArr[i45];
                i46++;
                i45++;
            }
            i39++;
            i41 = i45;
        }
        int i47 = 0;
        for (int i48 = 0; i48 < i34; i48++) {
            i47 += oo8VarArr[i48].f25582a;
        }
        byte[] bArr2 = new byte[i47];
        int i49 = 0;
        int i50 = 0;
        int i51 = 0;
        while (i50 < i34) {
            oo8 oo8Var2 = oo8VarArr[i50];
            byte[] bArr3 = (byte[]) oo8Var2.b;
            byte b3 = oo8Var2.f25582a;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i52 = 0; i52 < length4; i52++) {
                iArr2[i52] = bArr3[i52] & 255;
            }
            try {
                int iF = ((yox) this.b).f(iArr2, bArr3.length - b3);
                for (int i53 = 0; i53 < b3; i53++) {
                    bArr3[i53] = (byte) iArr2[i53];
                }
                i49 += iF;
                int i54 = i51;
                int i55 = 0;
                while (i55 < b3) {
                    bArr2[i54] = bArr3[i55];
                    i55++;
                    i54++;
                }
                i50++;
                i51 = i54;
            } catch (eie0 unused) {
                throw q9c.a();
            }
        }
        t68 t68Var = new t68(bArr2);
        StringBuilder sb = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(i33);
        int iB2 = -1;
        int iB3 = -1;
        boolean z3 = false;
        boolean z4 = false;
        uvb uvbVarA = null;
        while (true) {
            try {
                int iA = t68Var.a();
                hm40 hm40Var3 = hm40.TERMINATOR;
                if (iA < 4) {
                    hm40Var2 = hm40Var3;
                } else {
                    int iB4 = t68Var.b(4);
                    if (iB4 == 0) {
                        hm40Var = hm40Var3;
                    } else if (iB4 == 1) {
                        hm40Var = hm40.NUMERIC;
                    } else if (iB4 == 2) {
                        hm40Var = hm40.ALPHANUMERIC;
                    } else if (iB4 == 3) {
                        hm40Var = hm40.STRUCTURED_APPEND;
                    } else if (iB4 == 4) {
                        hm40Var = hm40.BYTE;
                    } else if (iB4 == 5) {
                        hm40Var = hm40.FNC1_FIRST_POSITION;
                    } else if (iB4 == 7) {
                        hm40Var = hm40.ECI;
                    } else if (iB4 == 8) {
                        hm40Var = hm40.KANJI;
                    } else if (iB4 == 9) {
                        hm40Var = hm40.FNC1_SECOND_POSITION;
                    } else {
                        if (iB4 != 13) {
                            throw new IllegalArgumentException();
                        }
                        hm40Var = hm40.HANZI;
                    }
                    hm40Var2 = hm40Var;
                }
                int iOrdinal = hm40Var2.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 5) {
                            if (iOrdinal == 7) {
                                i = i49;
                                i2 = 5;
                                z3 = true;
                                z2 = true;
                            } else if (iOrdinal == 8) {
                                i = i49;
                                i2 = 5;
                                i3 = iB2;
                                z4 = true;
                                z3 = true;
                            } else if (iOrdinal != 9) {
                                int iB5 = t68Var.b(hm40Var2.a(ubu0VarN));
                                int iOrdinal2 = hm40Var2.ordinal();
                                i = i49;
                                if (iOrdinal2 == 1) {
                                    i2 = 5;
                                    vbw0.W(t68Var, sb, iB5);
                                } else if (iOrdinal2 == 2) {
                                    i2 = 5;
                                    vbw0.S(t68Var, sb, iB5, z3);
                                } else if (iOrdinal2 == 4) {
                                    i2 = 5;
                                    vbw0.T(t68Var, sb, iB5, uvbVarA, arrayList, map);
                                } else {
                                    if (iOrdinal2 != 6) {
                                        throw bwq.a();
                                    }
                                    vbw0.V(t68Var, sb, iB5);
                                }
                            } else {
                                i = i49;
                                i2 = 5;
                                int iB6 = t68Var.b(4);
                                int iB7 = t68Var.b(hm40Var2.a(ubu0VarN));
                                if (iB6 == 1) {
                                    vbw0.U(t68Var, sb, iB7);
                                }
                            }
                            if (hm40Var2 == hm40Var3) {
                                if (uvbVarA != null) {
                                    if (z2) {
                                        i4 = 4;
                                    } else if (z4) {
                                        i4 = 6;
                                    } else {
                                        i4 = 2;
                                    }
                                } else if (z2) {
                                    i4 = 3;
                                } else if (z4) {
                                    i4 = i2;
                                } else {
                                    i4 = 1;
                                }
                                String string = sb.toString();
                                if (arrayList.isEmpty()) {
                                    arrayList = null;
                                }
                                if (i5 != 1) {
                                    str = TokenNames.L;
                                } else if (i5 != 2) {
                                    str = TokenNames.M;
                                } else if (i5 != 3) {
                                    str = "Q";
                                } else {
                                    if (i5 == 4) {
                                        throw null;
                                    }
                                    str = "H";
                                }
                                ykj ykjVar = new ykj(bArr2, string, arrayList, str, i3, iB3, i4);
                                ykjVar.e = Integer.valueOf(i);
                                return ykjVar;
                            }
                            iB2 = i3;
                            z4 = z4;
                            i49 = i;
                        } else {
                            i = i49;
                            i2 = 5;
                            int iB8 = t68Var.b(8);
                            if ((iB8 & 128) == 0) {
                                iB = iB8 & 127;
                            } else if ((iB8 & 192) == 128) {
                                iB = ((iB8 & 63) << 8) | t68Var.b(8);
                            } else {
                                if ((iB8 & 224) != 192) {
                                    throw bwq.a();
                                }
                                iB = ((iB8 & 31) << 16) | t68Var.b(16);
                            }
                            uvbVarA = uvb.a(iB);
                            if (uvbVarA == null) {
                                throw bwq.a();
                            }
                        }
                        i3 = iB2;
                        if (hm40Var2 == hm40Var3) {
                            if (uvbVarA != null) {
                                if (z2) {
                                    i4 = 4;
                                } else if (z4) {
                                    i4 = 6;
                                } else {
                                    i4 = 2;
                                }
                            } else if (z2) {
                                i4 = 3;
                            } else if (z4) {
                                i4 = i2;
                            } else {
                                i4 = 1;
                            }
                            String string2 = sb.toString();
                            if (arrayList.isEmpty()) {
                                arrayList = null;
                            }
                            if (i5 != 1) {
                                str = TokenNames.L;
                            } else if (i5 != 2) {
                                str = TokenNames.M;
                            } else if (i5 != 3) {
                                str = "Q";
                            } else {
                                if (i5 == 4) {
                                    throw null;
                                }
                                str = "H";
                            }
                            ykj ykjVar2 = new ykj(bArr2, string2, arrayList, str, i3, iB3, i4);
                            ykjVar2.e = Integer.valueOf(i);
                            return ykjVar2;
                        }
                        iB2 = i3;
                        z4 = z4;
                        i49 = i;
                    } else {
                        i = i49;
                        i2 = 5;
                        if (t68Var.a() < 16) {
                            throw bwq.a();
                        }
                        iB2 = t68Var.b(8);
                        iB3 = t68Var.b(8);
                    }
                    i3 = iB2;
                    if (hm40Var2 == hm40Var3) {
                        if (uvbVarA != null) {
                            if (z2) {
                                i4 = 4;
                            } else if (z4) {
                                i4 = 6;
                            } else {
                                i4 = 2;
                            }
                        } else if (z2) {
                            i4 = 3;
                        } else if (z4) {
                            i4 = i2;
                        } else {
                            i4 = 1;
                        }
                        String string3 = sb.toString();
                        if (arrayList.isEmpty()) {
                            arrayList = null;
                        }
                        if (i5 != 1) {
                            str = TokenNames.L;
                        } else if (i5 != 2) {
                            str = TokenNames.M;
                        } else if (i5 != 3) {
                            str = "Q";
                        } else {
                            if (i5 == 4) {
                                throw null;
                            }
                            str = "H";
                        }
                        ykj ykjVar3 = new ykj(bArr2, string3, arrayList, str, i3, iB3, i4);
                        ykjVar3.e = Integer.valueOf(i);
                        return ykjVar3;
                    }
                    iB2 = i3;
                    z4 = z4;
                    i49 = i;
                } else {
                    i = i49;
                }
                i2 = 5;
                i3 = iB2;
                if (hm40Var2 == hm40Var3) {
                    if (uvbVarA != null) {
                        if (z2) {
                            i4 = 4;
                        } else if (z4) {
                            i4 = 6;
                        } else {
                            i4 = 2;
                        }
                    } else if (z2) {
                        i4 = 3;
                    } else if (z4) {
                        i4 = i2;
                    } else {
                        i4 = 1;
                    }
                    String string4 = sb.toString();
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    if (i5 != 1) {
                        str = TokenNames.L;
                    } else if (i5 != 2) {
                        str = TokenNames.M;
                    } else if (i5 != 3) {
                        str = "Q";
                    } else {
                        if (i5 == 4) {
                            throw null;
                        }
                        str = "H";
                    }
                    ykj ykjVar4 = new ykj(bArr2, string4, arrayList, str, i3, iB3, i4);
                    ykjVar4.e = Integer.valueOf(i);
                    return ykjVar4;
                }
                iB2 = i3;
                z4 = z4;
                i49 = i;
            } catch (IllegalArgumentException unused2) {
                throw bwq.a();
            }
        }
    }

    @Override // a.oee
    public ree build() {
        return new ree(new yqc(((ContentInfo.Builder) this.b).build()));
    }

    @Override // a.giu0
    public diu0 c(Object obj) {
        switch (this.f27457a) {
            case 15:
                c7i c7iVar = (c7i) this.b;
                q8i q8iVar = (q8i) c7iVar.c;
                v88 v88VarU0 = q8iVar.f28301a.u0();
                wsf0 wsf0VarF0 = q8iVar.f28301a.f0();
                mne mneVarV1 = q8iVar.f28301a.v1();
                fpi0 fpi0Var = (fpi0) q8iVar.m.get();
                fq fqVar = (fq) q8iVar.x.get();
                r8i r8iVar = (r8i) c7iVar.d;
                return new wm70((i1w0) obj, v88VarU0, wsf0VarF0, mneVarV1, fpi0Var, fqVar, (dqx) ((n5d0) r8iVar.g).get(), (itt) q8iVar.u.get(), (qni0) q8iVar.d0.get(), (l1u) ((n5d0) r8iVar.l).get(), (lg60) q8iVar.e0.get(), (qa60) q8iVar.F.get(), (ppb) ((n5d0) r8iVar.m).get(), (i5m0) q8iVar.f0.get(), (lzt) q8iVar.f.get(), (xcc) q8iVar.U.get(), (ztt) q8iVar.k.get(), (d3c) q8iVar.e.get(), (xyb) q8iVar.h.get(), (oqt) q8iVar.p.get(), (y5s) q8iVar.T.get(), (t0u) q8iVar.X.get());
            case 16:
                qdi qdiVar = (qdi) ((c7i) this.b).c;
                qa60 qa60Var = (qa60) qdiVar.E.get();
                xcc xccVar = (xcc) qdiVar.T.get();
                return new gh70((fq) qdiVar.w.get(), xccVar, qdiVar.f28534a.v1(), (lzt) qdiVar.e.get(), qa60Var, (i1w0) obj);
            default:
                c7i c7iVar2 = (c7i) this.b;
                cii ciiVar = (cii) c7iVar2.c;
                v88 v88VarU1 = ciiVar.f4416a.u0();
                wsf0 wsf0VarF1 = ciiVar.f4416a.f0();
                mne mneVarV2 = ciiVar.f4416a.v1();
                fpi0 fpi0Var2 = (fpi0) ciiVar.m.get();
                fq fqVar2 = (fq) ciiVar.x.get();
                r8i r8iVar2 = (r8i) c7iVar2.d;
                return new wm70((i1w0) obj, v88VarU1, wsf0VarF1, mneVarV2, fpi0Var2, fqVar2, (dqx) ((n5d0) r8iVar2.g).get(), (itt) ciiVar.u.get(), (qni0) ciiVar.d0.get(), (l1u) ((n5d0) r8iVar2.l).get(), (lg60) ciiVar.e0.get(), (qa60) ciiVar.F.get(), (ppb) ((n5d0) r8iVar2.m).get(), (i5m0) ciiVar.f0.get(), (lzt) ciiVar.f.get(), (xcc) ciiVar.U.get(), (ztt) ciiVar.k.get(), (d3c) ciiVar.e.get(), (xyb) ciiVar.h.get(), (oqt) ciiVar.p.get(), (y5s) ciiVar.T.get(), (t0u) ciiVar.X.get());
        }
    }

    @Override // a.oee
    public void d(Uri uri) {
        ((ContentInfo.Builder) this.b).setLinkUri(uri);
    }

    @Override // a.vo9
    public Type e() {
        return (Type) this.b;
    }

    @Override // a.vo9
    public Object f(jf60 jf60Var) {
        pdd pddVar = new pdd(jf60Var);
        jf60Var.y(new psc((Object) pddVar, (byte) 3));
        return pddVar;
    }

    @Override // a.j5a
    public void g(Typeface typeface) {
        f2d f2dVar = (f2d) this.b;
        if (f2dVar.t(typeface)) {
            f2dVar.l(false);
        }
    }

    @Override // a.oee
    public void h(int i) {
        ((ContentInfo.Builder) this.b).setFlags(i);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036 A[Catch: bwq | q9c -> 0x005e, TryCatch #1 {bwq | q9c -> 0x005e, blocks: (B:13:0x001e, B:14:0x0032, B:16:0x0036, B:17:0x0039, B:19:0x003d, B:21:0x0047, B:22:0x004d, B:24:0x0052), top: B:31:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:19:0x003d A[Catch: bwq | q9c -> 0x005e, TryCatch #1 {bwq | q9c -> 0x005e, blocks: (B:13:0x001e, B:14:0x0032, B:16:0x0036, B:17:0x0039, B:19:0x003d, B:21:0x0047, B:22:0x004d, B:24:0x0052), top: B:31:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0047 A[Catch: bwq | q9c -> 0x005e, TryCatch #1 {bwq | q9c -> 0x005e, blocks: (B:13:0x001e, B:14:0x0032, B:16:0x0036, B:17:0x0039, B:19:0x003d, B:21:0x0047, B:22:0x004d, B:24:0x0052), top: B:31:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:38:0x004d A[SYNTHETIC] */
    public ykj i(r68 r68Var, Map map) throws bwq, q9c {
        q9c q9cVar;
        bwq e;
        r68 r68Var2;
        int i;
        int i2;
        o24 o24Var = new o24();
        int i3 = r68Var.b;
        if (i3 < 21 || (i3 & 3) != 1) {
            throw bwq.a();
        }
        o24Var.b = r68Var;
        try {
            return b(o24Var, map);
        } catch (bwq e2) {
            e = e2;
            q9cVar = null;
            try {
                o24Var.p();
                o24Var.c = null;
                o24Var.d = null;
                o24Var.f24513a = true;
                o24Var.n();
                o24Var.m();
                r68Var2 = (r68) o24Var.b;
                i = 0;
                while (i < r68Var2.f29923a) {
                    int i4 = i + 1;
                    for (i2 = i4; i2 < r68Var2.b; i2++) {
                        if (r68Var2.b(i, i2) != r68Var2.b(i2, i)) {
                            r68Var2.a(i2, i);
                            r68Var2.a(i, i2);
                        }
                    }
                    i = i4;
                }
                ykj ykjVarB = b(o24Var, map);
                ykjVarB.g = new red0();
                return ykjVarB;
            } catch (bwq | q9c unused) {
                if (e != null) {
                    throw e;
                }
                throw q9cVar;
            }
        } catch (q9c e3) {
            q9cVar = e3;
            e = null;
            o24Var.p();
            o24Var.c = null;
            o24Var.d = null;
            o24Var.f24513a = true;
            o24Var.n();
            o24Var.m();
            r68Var2 = (r68) o24Var.b;
            i = 0;
            while (i < r68Var2.f29923a) {
                int i5 = i + 1;
                while (i2 < r68Var2.b) {
                    if (r68Var2.b(i, i2) != r68Var2.b(i2, i)) {
                        r68Var2.a(i2, i);
                        r68Var2.a(i, i2);
                    }
                }
                i = i5;
            }
            ykj ykjVarB2 = b(o24Var, map);
            ykjVarB2.g = new red0();
            return ykjVarB2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:135|25|127|26|27|125|28|29|121|30|31|115|32|33|131|34|123|35|119|36|37|133|38|39|117|40|41|(1:44)|106) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(1:7)|8|(1:(4:(1:(1:13)(2:14|15))(2:16|137)|92|93|(29:135|25|127|26|27|125|28|29|121|30|31|115|32|33|131|34|123|35|119|36|37|133|38|39|117|40|41|(1:44)|106)(1:(2:111|112)(1:113)))(4:17|129|18|19))(2:23|(29:135|25|127|26|27|125|28|29|121|30|31|115|32|33|131|34|123|35|119|36|37|133|38|39|117|40|41|(1:44)|106)(1:(2:111|112)(1:113)))|114|45|(2:47|139)(3:51|52|53)|(1:(0))) */
    /* JADX WARN: Code duplicated, block: B:100:0x0231  */
    /* JADX WARN: Code duplicated, block: B:101:0x0233  */
    /* JADX WARN: Code duplicated, block: B:104:0x0238  */
    /* JADX WARN: Code duplicated, block: B:107:0x0256  */
    /* JADX WARN: Code duplicated, block: B:108:0x025d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0268  */
    /* JADX WARN: Code duplicated, block: B:110:0x0276 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0278  */
    /* JADX WARN: Code duplicated, block: B:113:0x027e  */
    /* JADX WARN: Code duplicated, block: B:135:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0131  */
    /* JADX WARN: Code duplicated, block: B:47:0x014b A[Catch: all -> 0x0150, TryCatch #0 {all -> 0x0150, blocks: (B:45:0x0141, B:47:0x014b, B:51:0x015e), top: B:114:0x0141 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x015e A[Catch: all -> 0x0150, TRY_LEAVE, TryCatch #0 {all -> 0x0150, blocks: (B:45:0x0141, B:47:0x014b, B:51:0x015e), top: B:114:0x0141 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01de  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:90:0x0204  */
    /* JADX WARN: Code duplicated, block: B:94:0x0210  */
    /* JADX WARN: Code duplicated, block: B:96:0x0220  */
    /* JADX WARN: Code duplicated, block: B:98:0x022a  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0150, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0151, code lost:
    
        r9 = r8;
        r8 = r4;
        r4 = r9;
        r17 = r10;
        r9 = r12;
        r12 = r6;
        r7 = r2;
        r2 = r15;
        r15 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x015b, code lost:
    
        r5 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0194, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0195, code lost:
    
        r3 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0197, code lost:
    
        r17 = r12;
        r12 = r10;
        r9 = r17;
        r17 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x019f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01a0, code lost:
    
        r3 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a5, code lost:
    
        r8 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a9, code lost:
    
        r8 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ab, code lost:
    
        r3 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ae, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01af, code lost:
    
        r8 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b3, code lost:
    
        r8 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b7, code lost:
    
        r15 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01b9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ba, code lost:
    
        r15 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01bc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01bd, code lost:
    
        r15 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01bf, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c0, code lost:
    
        r15 = r9;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x0256 -> B:92:0x020a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0268 -> B:24:0x00c3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01ca -> B:24:0x00c3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(java.lang.String r36, java.lang.String r37, long r38, a.zje r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.prc.j(java.lang.String, java.lang.String, long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:69|24|(1:27)|61) */
    /* JADX WARN: Code duplicated, block: B:27:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:30:0x0102 A[Catch: all -> 0x009e, TryCatch #1 {all -> 0x009e, blocks: (B:28:0x00f8, B:30:0x0102, B:31:0x0107, B:18:0x0099), top: B:71:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0107 A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #1 {all -> 0x009e, blocks: (B:28:0x00f8, B:30:0x0102, B:31:0x0107, B:18:0x0099), top: B:71:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x014c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x014e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0156  */
    /* JADX WARN: Code duplicated, block: B:41:0x015d  */
    /* JADX WARN: Code duplicated, block: B:42:0x015f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0164  */
    /* JADX WARN: Code duplicated, block: B:49:0x0185  */
    /* JADX WARN: Code duplicated, block: B:50:0x018d  */
    /* JADX WARN: Code duplicated, block: B:51:0x018f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0196  */
    /* JADX WARN: Code duplicated, block: B:55:0x019d  */
    /* JADX WARN: Code duplicated, block: B:56:0x019f  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:64:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01de  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0145, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01bd, code lost:
    
        if (a.qcc.P(r10, r6) == r3) goto L61;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x014e -> B:23:0x00c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01bd -> B:62:0x01c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x01c3 -> B:62:0x01c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01cc -> B:48:0x0182). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(java.lang.String r36, java.lang.String r37, java.lang.String r38, a.zje r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.prc.k(java.lang.String, java.lang.String, java.lang.String, a.zje):java.lang.Object");
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        view.getClass();
        int i = xiv0Var.f40966a.i(1).b;
        wcg wcgVar = (wcg) this.b;
        if (wcgVar.M1 == null) {
            Intrinsics.h("appBarToolbarDelegate");
            throw null;
        }
        AppBarMotionLayout appBarMotionLayout = (AppBarMotionLayout) wcgVar.G0().c.b;
        appBarMotionLayout.setMinimumHeight(appBarMotionLayout.getContext().getResources().getDimensionPixelSize(R.dimen.toolbar_height_size) + i);
        return xiv0Var;
    }

    public ArrayList m(uaq0 uaq0Var) {
        pnh pnhVar = (pnh) this.b;
        List list = pnh.d;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(vfc.O((udh) it.next(), StringsKt.O(pnhVar.c.c(), "ru", false), uaq0Var));
        }
        return arrayList;
    }

    public List n(uaq0 uaq0Var) {
        return kotlin.collections.a.c(vfc.O(bah.d, StringsKt.O(((bah) this.b).c.c(), "ru", false), uaq0Var));
    }

    public boolean o(iz30 iz30Var) {
        iz30Var.getClass();
        pv00 pv00Var = (pv00) this.b;
        ArrayList arrayListN0 = CollectionsKt.N0(pv00Var.d());
        if (!arrayListN0.isEmpty()) {
            Iterator it = arrayListN0.iterator();
            while (it.hasNext()) {
                if (((iz30) it.next()) == iz30Var) {
                    arrayListN0.remove(iz30Var);
                    cyu cyuVar = (cyu) pv00Var.f27640a;
                    q7d0 q7d0Var = (q7d0) cyuVar.f5196a;
                    vby vbyVar = (vby) cyuVar.b;
                    vbyVar.getClass();
                    iz30[] iz30VarArrValues = iz30.values();
                    iz30VarArrValues.getClass();
                    q7d0Var.g("KEY_MENU_ITEMS_INNOVATIONS", vbyVar.d(new zw3(new g0o("org.xplatform.onexcore.configs.MenuItemModel", (Enum[]) iz30VarArrValues), (byte) 0), arrayListN0));
                    return true;
                }
            }
        }
        return false;
    }

    public bu90 p() {
        return (bu90) ((n5d0) this.b).get();
    }

    public void q(int i, Object obj, p2h0 p2h0Var) {
        qyc qycVar = (qyc) this.b;
        qycVar.m(i, 3);
        p2h0Var.g((y3) obj, qycVar.f29525a);
        qycVar.m(i, 4);
    }

    public void r(int i, Object obj, p2h0 p2h0Var) {
        qyc qycVar = (qyc) this.b;
        y3 y3Var = (y3) obj;
        qycVar.m(i, 2);
        qycVar.n(y3Var.g(p2h0Var));
        p2h0Var.g(y3Var, qycVar.f29525a);
    }

    @Override // a.oee
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.b).setExtras(bundle);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        lwi0 lwi0Var = (lwi0) obj;
        xr xrVar = (xr) this.b;
        if (lwi0Var == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        f8f f8fVar = (f8f) xrVar.b;
        z7f z7fVar = f8f.r;
        f8fVar.g();
        f8fVar.m.D(null, (aaf) f8fVar.e.b);
        f8fVar.q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public prc(qj9 qj9Var) {
        this.f27457a = (byte) 27;
        qj9Var.getClass();
        this.b = qj9Var;
    }

    public prc(uwf uwfVar) {
        this.f27457a = (byte) 10;
        this.b = new qwf(uwfVar, (byte) 0);
    }

    public prc(xdj xdjVar) {
        this.f27457a = (byte) 21;
        xdjVar.getClass();
        this.b = xdjVar;
    }

    public prc(dcl dclVar) {
        this.f27457a = (byte) 29;
        dclVar.getClass();
        this.b = dclVar;
    }

    public prc(gii0 gii0Var) {
        this.f27457a = (byte) 9;
        gii0Var.getClass();
        this.b = new sza(gii0Var, (byte) 16);
    }

    public prc(qyc qycVar) {
        this.f27457a = (byte) 4;
        Charset charset = dmx.f6339a;
        this.b = qycVar;
        qycVar.f29525a = this;
    }

    public /* synthetic */ prc(Object obj, byte b) {
        this.f27457a = b;
        this.b = obj;
    }

    public prc(ClipData clipData, int i) {
        this.f27457a = (byte) 7;
        this.b = kn4.i(clipData, i);
    }
}
