package a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Response;
import android.widget.EditText;
import java.io.File;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.uikit.components.team_logo.DsTeamLogo;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddlePairTeams;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hic {
    public static boolean A(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static String B(j jVar, String str) {
        if (Intrinsics.d(jVar.f15657a, cy2.z)) {
            return "";
        }
        Map map = tzn.f34812a;
        return tzn.a(dwi0.N(jVar, str), false, false);
    }

    public static final boolean C(Throwable th) {
        th.getClass();
        List listJ = q3d.j(SocketTimeoutException.class, UnknownHostException.class);
        if (listJ != null && listJ.isEmpty()) {
            return false;
        }
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            if (((Class) it.next()).isInstance(th)) {
                return true;
            }
        }
        return false;
    }

    public static Bitmap D(Drawable drawable, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = drawable.getIntrinsicWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                jf4.o("bitmap is null");
                return null;
            }
            if (i == bitmapDrawable.getBitmap().getWidth() && i2 == bitmapDrawable.getBitmap().getHeight()) {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                bitmap.getClass();
                return bitmap;
            }
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i, i2, true);
            bitmapCreateScaledBitmap.getClass();
            return bitmapCreateScaledBitmap;
        }
        Rect bounds = drawable.getBounds();
        bounds.getClass();
        int i4 = bounds.left;
        int i5 = bounds.top;
        int i6 = bounds.right;
        int i7 = bounds.bottom;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(i4, i5, i6, i7);
        return bitmapCreateBitmap;
    }

    public static final wpf E(gsf gsfVar) {
        int i = gsfVar == null ? -1 : xpf.f41267a[gsfVar.ordinal()];
        if (i != 1) {
            return i != 2 ? wpf.c : wpf.f39542a;
        }
        return wpf.b;
    }

    public static final s4i F(r040 r040Var, ctf0 ctf0Var, qho qhoVar, String str) {
        r040Var.getClass();
        ctf0Var.getClass();
        switch (r040Var) {
            case SPORTS:
            case SINGLE_SPORTS:
                return new s4i(ctf0Var.b.a(R.string.sport, Arrays.copyOf(new Object[0], 0)), qhoVar.b(R.drawable.ic_glyph_sport), null, false, 12);
            case AGGREGATOR:
            case SINGLE_AGGREGATOR:
                return new s4i(ctf0Var.b.a(R.string.casino_chip, Arrays.copyOf(new Object[0], 0)), qhoVar.b(R.drawable.ic_glyph_cards), null, false, 12);
            case GAMES:
            case SINGLE_GAMES:
                return new s4i(str, qhoVar.b(R.drawable.ic_glyph_games), null, false, 12);
            case OTHER:
            case SINGLE_OTHER:
                return new s4i(ctf0Var.b.a(R.string.other_menu, Arrays.copyOf(new Object[0], 0)), qhoVar.b(R.drawable.ic_glyph_other), null, false, 12);
            case TOP:
            case SINGLE_TOP:
                return new s4i(ctf0Var.b.a(R.string.top, Arrays.copyOf(new Object[0], 0)), qhoVar.b(R.drawable.ic_glyph_top), null, false, 12);
            case VIRTUAL:
            case SINGLE_VIRTUAL:
                return new s4i(ctf0Var.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0)), qhoVar.b(R.drawable.ic_glyph_virtual), null, false, 12);
            default:
                t9f.b();
                return null;
        }
    }

    public static final d4n G(List list, qil0 qil0Var) {
        list.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (true) {
            chl0 chl0Var = null;
            if (!it.hasNext()) {
                a4x a4xVarO0 = dyb.o0(arrayList);
                if (qil0Var instanceof hil0) {
                    return new a4n(a4xVarO0, qil0Var.b(), qil0Var.e(), qil0Var.a(), qil0Var.c());
                }
                if (qil0Var instanceof eil0) {
                    return new z3n(a4xVarO0, qil0Var.b(), qil0Var.e(), qil0Var.a(), qil0Var.c(), (eil0) qil0Var);
                }
                if (qil0Var instanceof lil0) {
                    return new b4n(a4xVarO0, qil0Var.b(), qil0Var.e(), qil0Var.a(), qil0Var.c());
                }
                if (qil0Var instanceof pil0) {
                    return new c4n(a4xVarO0, qil0Var.b(), qil0Var.e(), qil0Var.a(), qil0Var.c());
                }
                if (qil0Var instanceof bil0) {
                    bil0 bil0Var = (bil0) qil0Var;
                    return new y3n(a4xVarO0, bil0Var.f2664a, bil0Var.b, bil0Var.c);
                }
                t9f.b();
                return null;
            }
            kao kaoVar = (kao) it.next();
            if (kaoVar instanceof iao) {
                chl0Var = ((iao) kaoVar).g;
            } else if (!Intrinsics.d(kaoVar, jao.f16199a)) {
                t9f.b();
                return null;
            }
            arrayList.add(chl0Var);
        }
    }

    public static final xkt H(dlt dltVar) {
        String str = dltVar.f6300a;
        if (str == null) {
            str = "";
        }
        String str2 = dltVar.b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = dltVar.c;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = dltVar.d;
        String str5 = str4 != null ? str4 : "";
        Integer num = dltVar.e;
        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 225);
        Long l = dltVar.f;
        Long lValueOf = Long.valueOf(l != null ? l.longValue() : 0L);
        Integer num2 = dltVar.g;
        return new xkt(str, str2, str3, str5, numValueOf, lValueOf, Integer.valueOf(num2 != null ? num2.intValue() : 0));
    }

    public static final nfv I(qfv qfvVar) {
        qfvVar.getClass();
        String str = qfvVar.f28656a;
        if (str == null) {
            str = "";
        }
        String str2 = qfvVar.b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = qfvVar.c;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = qfvVar.d;
        return new nfv(str, str2, str3, str4 != null ? str4 : "");
    }

    public static final e1w J(h0w h0wVar, ctf0 ctf0Var, boolean z) {
        h0wVar.getClass();
        ctf0Var.getClass();
        jvw jvwVar = h0wVar.f12253a;
        return new e1w(jvwVar, ctf0Var.b.a(lmc.b0(jvwVar), Arrays.copyOf(new Object[0], 0)), h0wVar.b, z);
    }

    public static CharSequence K(int i, String str) {
        str.getClass();
        if (i == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            if (i2 == 0 || str.charAt(i2 - 1) == '\n') {
                sb.append(str.subSequence(i3, i2));
                int i4 = 0;
                while (i4 < i && i2 < str.length()) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt != ' ') {
                        if (cCharAt != '\t') {
                            break;
                        }
                        i4 = (4 - (i4 % 4)) + i4;
                    } else {
                        i4++;
                    }
                    i2++;
                }
                if (i4 > i) {
                    sb.append(kotlin.text.c.q(i4 - i, Separators.SP));
                }
                i3 = i2;
            }
            i2++;
        }
        sb.append(str.subSequence(i3, str.length()));
        return sb;
    }

    public static final void a(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        a4x a4xVar2;
        mm40 mm40Var2;
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(502764006);
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            ak50 ak50VarG = a8k0.G(xczVarA, fetVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarV = cjx.V(jm40Var, ak50VarG, null);
            zcl zclVar = qmk.f28987a;
            byte b = 7;
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 16.0f, 7);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                a4xVar2 = a4xVar;
                objP = new or0(a4xVar2, function1, b);
                fetVar.o0(objP);
            } else {
                a4xVar2 = a4xVar;
            }
            b8k0.e(mm40VarV, xczVarA, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 0, Response.SERVER_TIMEOUT);
            mm40Var2 = jm40Var;
        } else {
            a4xVar2 = a4xVar;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new de9(mm40Var2, a4xVar2, function1, i, (byte) 1);
        }
    }

    public static final void b(mm40 mm40Var, bdm bdmVar, xdr xdrVar, Function1 function1, fet fetVar, int i) {
        int i2;
        mcm mcmVar = bdmVar.f2405a;
        fetVar.g0(-847449944);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(bdmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 120.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new lrk(function1, bdmVar, (byte) 24);
                fetVar.o0(objP2);
            }
            mm40 mm40VarE0 = o2e.e0(s5x0.J(i120.Q(y860.W(mm40VarE2, gy40Var, null, false, null, (Function0) objP2, 28), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), 12.0f), "DS_CYBER_TRANSFER_CARD_PLAYER_WITH_DATE_COLUMN");
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            vfc.n(o7k0.d(jm40.b, 1.0f), mcmVar.f21559a, fetVar, 6);
            fre0.A(mcmVar.b, xdrVar, fetVar, (i2 & 896) | 6);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i((byte) 13, i, (Object) mm40Var, (Object) bdmVar, (Object) xdrVar, (Object) function1);
        }
    }

    public static final void c(mm40 mm40Var, rwe rweVar, Function0 function0, fet fetVar, int i) {
        if ((i & 4) != 0) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new yld((byte) 24);
                fetVar.o0(objP);
            }
            function0 = (Function0) objP;
        }
        if (rweVar instanceof pwe) {
            fetVar.e0(1539208247);
            ckb.w(mm40Var, (pwe) rweVar, function0, fetVar, 0);
            fetVar.r(false);
        } else {
            if (!(rweVar instanceof qwe)) {
                throw b1j.f(188197254, fetVar, false);
            }
            fetVar.e0(1539417435);
            zjb.n(mm40Var, (qwe) rweVar, fetVar, 0);
            fetVar.r(false);
        }
    }

    public static final void d(mm40 mm40Var, jeg jegVar, Function0 function0, fet fetVar, int i) {
        int i2;
        function0.getClass();
        fetVar.g0(151707217);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(jegVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            nkb.h(o7k0.d(mm40Var, 1.0f), jegVar.b, kjm.f18392a, null, function0, null, fetVar, ((i2 << 6) & 57344) | 384, 40);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(mm40Var, jegVar, function0, i, (byte) 16);
        }
    }

    public static final void e(mm40 mm40Var, final o0h o0hVar, fet fetVar, int i) {
        o0hVar.getClass();
        fetVar.g0(-136705663);
        final byte b = 4;
        final byte b2 = 2;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(o0hVar) ? 32 : 16);
        final byte b3 = 0;
        final byte b4 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            final byte b5 = 3;
            final mm40 mm40VarW = o7k0.w(o7k0.e(jm40.b, 40.0f), null, false, 3);
            mbc.f(mm40Var, 0.0f, 0.55f, u1c.M(-1653703556, new xdr() { // from class: a.b9d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b6 = b3;
                    o0h o0hVar2 = o0hVar;
                    switch (b6) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f), o0hVar2.e);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                pm80 pm80VarF = a8k0.F(R.drawable.icon_globe_attr_new, 0, fetVar3);
                                zcl zclVar3 = qmk.f28987a;
                                k7x.b(o0hVar2.f, null, o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 4.0f, 0.0f, 11), 40.0f), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar3, 36912, 0, 32736);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        default:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                zcl zclVar4 = qmk.f28987a;
                                mm40 mm40VarL = s5x0.L(jm40.b, 8.0f, 0.0f, 2);
                                String str = o0hVar2.g;
                                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                v8q0.a(str, mm40VarL, ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar4, 0, 24960, 109560);
                            } else {
                                fetVar4.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(1372593661, new xdr() { // from class: a.b9d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b6 = b4;
                    o0h o0hVar2 = o0hVar;
                    switch (b6) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f), o0hVar2.e);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                pm80 pm80VarF = a8k0.F(R.drawable.icon_globe_attr_new, 0, fetVar3);
                                zcl zclVar3 = qmk.f28987a;
                                k7x.b(o0hVar2.f, null, o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 4.0f, 0.0f, 11), 40.0f), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar3, 36912, 0, 32736);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        default:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                zcl zclVar4 = qmk.f28987a;
                                mm40 mm40VarL = s5x0.L(jm40.b, 8.0f, 0.0f, 2);
                                String str = o0hVar2.g;
                                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                v8q0.a(str, mm40VarL, ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar4, 0, 24960, 109560);
                            } else {
                                fetVar4.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(103923582, new xdr() { // from class: a.b9d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b6 = b2;
                    o0h o0hVar2 = o0hVar;
                    switch (b6) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(s5x0.N(jm40.b, 0.0f, 0.0f, 4.0f, 0.0f, 11), 24.0f), o0hVar2.e);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                pm80 pm80VarF = a8k0.F(R.drawable.icon_globe_attr_new, 0, fetVar3);
                                zcl zclVar3 = qmk.f28987a;
                                k7x.b(o0hVar2.f, null, o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 4.0f, 0.0f, 11), 40.0f), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar3, 36912, 0, 32736);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        default:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                zcl zclVar4 = qmk.f28987a;
                                mm40 mm40VarL = s5x0.L(jm40.b, 8.0f, 0.0f, 2);
                                String str = o0hVar2.g;
                                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                v8q0.a(str, mm40VarL, ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar4, 0, 24960, 109560);
                            } else {
                                fetVar4.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-1164746497, new xdr() { // from class: a.c9d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b6 = b3;
                    o0h o0hVar2 = o0hVar;
                    mm40 mm40Var2 = mm40VarW;
                    yhg0 yhg0Var = (yhg0) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (b6) {
                        case 0:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(4, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(3, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 2:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(2, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 3:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(1, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(0, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(1861550720, new xdr() { // from class: a.c9d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b6 = b4;
                    o0h o0hVar2 = o0hVar;
                    mm40 mm40Var2 = mm40VarW;
                    yhg0 yhg0Var = (yhg0) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (b6) {
                        case 0:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(4, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(3, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 2:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(2, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 3:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(1, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(0, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(283032958, new xdr() { // from class: a.c9d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b6 = b2;
                    o0h o0hVar2 = o0hVar;
                    mm40 mm40Var2 = mm40VarW;
                    yhg0 yhg0Var = (yhg0) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (b6) {
                        case 0:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(4, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(3, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 2:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(2, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 3:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(1, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(0, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-985637121, new xdr() { // from class: a.c9d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b6 = b5;
                    o0h o0hVar2 = o0hVar;
                    mm40 mm40Var2 = mm40VarW;
                    yhg0 yhg0Var = (yhg0) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (b6) {
                        case 0:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(4, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(3, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 2:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(2, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 3:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(1, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(0, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(2040660096, new xdr() { // from class: a.c9d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b6 = b;
                    o0h o0hVar2 = o0hVar;
                    mm40 mm40Var2 = mm40VarW;
                    yhg0 yhg0Var = (yhg0) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (b6) {
                        case 0:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(4, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(3, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 2:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(2, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 3:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(1, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                hic.o(mm40Var2, (a9d) CollectionsKt.W(0, o0hVar2.h), fetVar2, 0);
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, (i2 & 14) | 920325120, 438, 22);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kea(mm40Var, o0hVar, i, (byte) 21);
        }
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        str.getClass();
        fetVar.g0(453752517);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2;
            long j = iph.i;
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            y9q0 y9q0VarA = y9q0.a(g1t0.e(), 0L, 0L, null, null, null, qmk.n, null, null, 0, 0, 0L, null, null, 16777087);
            mm40Var2 = jm40.b;
            str2 = str;
            v8q0.a(str2, mm40Var2, j, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, y9q0VarA, fetVar, ((i3 >> 3) & 14) | ((i3 << 3) & 112), 24960, 109560);
        } else {
            str2 = str;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx(mm40Var2, str2, i, (byte) 9);
        }
    }

    public static z6k g() {
        return new z6k(1.0f, 1.0f);
    }

    public static final void h(mm40 mm40Var, krl krlVar, fet fetVar, int i) {
        fetVar.g0(-858661044);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(krlVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(null) ? 256 : 128;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = krlVar instanceof irl;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(-539532670);
                i(jm40Var, (irl) krlVar, fetVar, i2 & 1022);
                fetVar.r(false);
            } else {
                if (!krlVar.equals(jrl.f17007a)) {
                    throw b1j.f(-539534846, fetVar, false);
                }
                fetVar.e0(-539525211);
                j(i2 & 14, fetVar, jm40Var);
                fetVar.r(false);
            }
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new crl(mm40Var, krlVar, i, b);
        }
    }

    public static final void i(mm40 mm40Var, irl irlVar, fet fetVar, int i) {
        int i2;
        ugg0 ugg0Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(311506693);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(irlVar) ? 32 : 16;
        }
        yje yjeVar = null;
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(null) ? 256 : 128;
        }
        byte b = 1;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.TRUE);
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            boolean zH = fetVar2.h(((Boolean) pz40Var.getValue()).booleanValue());
            Object objP2 = fetVar2.P();
            if (zH || objP2 == cl5Var) {
                if (((Boolean) pz40Var.getValue()).booleanValue()) {
                    zcl zclVar = qmk.f28987a;
                    ugg0Var = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                } else {
                    zcl zclVar2 = qmk.i;
                    ugg0 ugg0Var2 = vgg0.f37379a;
                    ugg0Var = new ugg0(zclVar2, zclVar2, zclVar2, zclVar2);
                }
                objP2 = androidx.compose.runtime.e.e(ugg0Var);
                fetVar2.o0(objP2);
            }
            pz40 pz40Var2 = (pz40) objP2;
            Object value = pz40Var.getValue();
            boolean z = (i2 & 896) == 256;
            Object objP3 = fetVar2.P();
            if (z || objP3 == cl5Var) {
                objP3 = new nbd(pz40Var, yjeVar, b);
                fetVar2.o0(objP3);
            }
            m0x0.t(fetVar2, value, (Function2) objP3);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarJ = lgb.J(jm40.b, (yjj0) pz40Var2.getValue());
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarJ, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = new cml(pz40Var, (byte) 17);
                fetVar2.o0(objP4);
            }
            mm40 mm40VarF = phu0.F(mm40VarQ, null, null, false, null, (Function0) objP4, fetVar2, 196608, 15);
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(mm40VarF, 12.0f, 4.0f, 4.0f, 4.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarM);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            x7z x7zVarI = ohs0.i(fetVar2, mm40VarC1, shdVar4, 1.0f, true);
            kjm kjmVar = kjm.f18392a;
            hjm hjmVar = new hjm(irlVar.f15262a, null, null, new m0x(R.drawable.ic_glyph_info_circle_filled, null, 6), new y3d(((ThemeColors) fetVar2.k(zfnVar)).getSecondary()), null, false, null, null, false, null, null, 8166);
            Object objP5 = fetVar2.P();
            if (objP5 == cl5Var) {
                objP5 = new cml(pz40Var, (byte) 18);
                fetVar2.o0(objP5);
            }
            nkb.h(x7zVarI, hjmVar, kjmVar, (Function0) objP5, null, null, fetVar2, 3456, 48);
            zb zbVar = new zb(null, null, 7);
            boolean zBooleanValue = ((Boolean) pz40Var.getValue()).booleanValue();
            Object objP6 = fetVar2.P();
            if (objP6 == cl5Var) {
                objP6 = new cml(pz40Var, (byte) 19);
                fetVar2.o0(objP6);
            }
            acb.n(zbVar, zBooleanValue, (Function0) objP6, null, fetVar, 384, 8);
            fetVar.r(true);
            b34.e(y5d.f42040a, ((Boolean) pz40Var.getValue()).booleanValue(), null, null, null, null, u1c.M(1560025299, new drl(irlVar, b), fetVar), fetVar, 1572870, 30);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new erl(mm40Var, irlVar, i, b);
        }
    }

    public static final void j(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(829097479);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 288.0f), 1.0f);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i, (byte) 21);
        }
    }

    public static final void k(mm40 mm40Var, u1m u1mVar, fet fetVar, int i) {
        fet fetVar2;
        int i2;
        u1mVar.getClass();
        fetVar.g0(488163849);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= fetVar.e(u1mVar.ordinal()) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            int iOrdinal = u1mVar.ordinal();
            if (iOrdinal == 0) {
                i2 = R.drawable.ic_custom_badge_popular;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return;
                }
                i2 = R.drawable.ic_custom_badge_new;
            }
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            fetVar2 = fetVar;
            dww.c(a8k0.F(i2, 0, fetVar), null, o7k0.n(jm40Var, 24.0f), y3d.g, fetVar2, 3128, 0);
            mm40Var = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl((Object) mm40Var, (Object) u1mVar, i, (byte) 7);
        }
    }

    public static final void l(mm40 mm40Var, ddm ddmVar, xdr xdrVar, Function1 function1, fet fetVar, int i) {
        int i2;
        mm40Var.getClass();
        xdrVar.getClass();
        function1.getClass();
        fetVar.g0(892498485);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ddmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (!fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.X();
        } else if (ddmVar instanceof bdm) {
            fetVar.e0(-1302405515);
            b(mm40Var, (bdm) ddmVar, xdrVar, function1, fetVar, i2 & 8190);
            fetVar.r(false);
        } else {
            if (!ddmVar.equals(cdm.f4167a)) {
                throw b1j.f(-1302407858, fetVar, false);
            }
            fetVar.e0(-1302398502);
            vic.f(i2 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i((byte) 12, i, (Object) mm40Var, (Object) ddmVar, (Object) xdrVar, (Object) function1);
        }
    }

    public static final void m(mm40 mm40Var, tsm tsmVar, Function1 function1, Function0 function0, Function0 function2, xdr xdrVar, fet fetVar, int i, int i2) {
        tsmVar.getClass();
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        mm40 mm40Var2 = mm40Var;
        float f = xfn.a(fetVar).c;
        Function1 function3 = (i2 & 8) != 0 ? null : function1;
        Function0 function4 = (i2 & 16) != 0 ? null : function0;
        Function0 function5 = (i2 & 32) != 0 ? null : function2;
        xdr xdrVar2 = (i2 & 64) != 0 ? null : xdrVar;
        if (tsmVar instanceof psm) {
            fetVar.e0(-2065303970);
            qjj.J(mm40Var2, (psm) tsmVar, f, function3, function4, function5, xdrVar2, fetVar, i & 4194302, 0);
            fetVar.r(false);
            return;
        }
        if (tsmVar instanceof jsm) {
            fetVar.e0(-2064876418);
            x8f.R(mm40Var2, (jsm) tsmVar, f, function3, function4, function5, xdrVar2, fetVar, i & 4194302, 0);
            fetVar.r(false);
            return;
        }
        if (tsmVar instanceof ssm) {
            fetVar.e0(-2064438636);
            eeq.L(mm40Var2, (ssm) tsmVar, f, function3, function4, function5, xdrVar2, fetVar, i & 4194302, 0);
            fetVar.r(false);
        } else if (tsmVar instanceof msm) {
            fetVar.e0(-2064001474);
            saj.Q(mm40Var2, (msm) tsmVar, f, function3, function4, function5, xdrVar2, fetVar, i & 4194302, 0);
            fetVar.r(false);
        } else {
            if (!(tsmVar instanceof gsm)) {
                throw b1j.f(764661091, fetVar, false);
            }
            fetVar.e0(-2063568807);
            tke.L(mm40Var2, (gsm) tsmVar, f, function3, function4, function5, xdrVar2, fetVar, i & 4194302, 0);
            fetVar.r(false);
        }
    }

    public static final void n(mm40 mm40Var, oxm oxmVar, boolean z, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fet fetVar3;
        zfn zfnVar;
        k6z k6zVar;
        k6z k6zVar2;
        boolean z2;
        jwm jwmVar = oxmVar.b;
        fetVar.g0(545828769);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(oxmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar2 = bmd.n;
            k6z k6zVar3 = (k6z) fetVar.k(zfnVar2);
            k6z k6zVar4 = z ? k6zVar3 : k6z.f17794a;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 12.0f, 0.0f, 12.0f, 12.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            String str = jwmVar.f17257a;
            if (str == null || str.length() == 0) {
                fetVar3 = fetVar;
                zfnVar = zfnVar2;
                k6zVar = k6zVar3;
                k6zVar2 = k6zVar4;
                z2 = true;
                fetVar3.e0(972497271);
                fetVar3.r(false);
            } else {
                fetVar.e0(972161572);
                String str2 = jwmVar.f17257a;
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                zfnVar = zfnVar2;
                k6zVar = k6zVar3;
                z2 = true;
                k6zVar2 = k6zVar4;
                v8q0.a(str2, null, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 109562);
                fetVar3 = fetVar;
                fetVar3.r(false);
            }
            mm40 mm40VarN2 = s5x0.N(jm40.b, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            String str3 = oxmVar.f26019a;
            ((g1t0) fetVar3.k(j1t0.e)).getClass();
            fet fetVar4 = fetVar3;
            v8q0.a(str3, mm40VarN2, ((ThemeColors) fetVar3.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar4, 0, 24960, 109560);
            fetVar2 = fetVar4;
            obc.d(zfnVar.a(k6zVar2), u1c.M(-1128974293, new wvm(oxmVar, k6zVar, (byte) 13), fetVar2), fetVar2, 56);
            fetVar2.r(z2);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02((byte) 19, i, mm40Var, (Object) oxmVar, z);
        }
    }

    public static final void o(mm40 mm40Var, a9d a9dVar, fet fetVar, int i) {
        fetVar.g0(1417391457);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(a9dVar) ? 32 : 16);
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (a9dVar == null) {
            fetVar.e0(1685561621);
            fetVar.r(false);
        } else {
            fetVar.e0(1685561622);
            mm40 mm40VarS = o7k0.s(mm40Var, a9dVar.f470a);
            if (a9dVar instanceof y8d) {
                fetVar.e0(460296017);
                zcl zclVar = qmk.f28987a;
                mm40VarS = mm40VarS.e(o7k0.w(i120.Q(o7k0.e(mm40VarS, 40.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), vgg0.a(8.0f)), null, false, 3));
                fetVar.r(false);
            } else {
                fetVar.e0(460513761);
                fetVar.r(false);
            }
            x2x.u(0, 0, fetVar, mm40VarS, a9dVar.a());
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kea(mm40Var, a9dVar, i, (byte) 22);
        }
    }

    public static final void p(iyh0 iyh0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(1132386240);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(iyh0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            clz clzVar = (clz) fetVar.k(or00.f25714a);
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = c6o.f3826a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            int i3 = i2 & 14;
            boolean zI = (i3 == 4) | fetVar.i(clzVar);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new qzn(iyh0Var, clzVar, (byte) 13);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) objP2;
            boolean zI2 = fetVar.i(clzVar) | (i3 == 4);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == cl5Var) {
                objP3 = new fun(iyh0Var, clzVar, (byte) 10);
                fetVar.o0(objP3);
            }
            idm0.j(mm40Var, iyh0Var, xdrVar, null, function1, (Function2) objP3, fetVar, ((i2 << 3) & 112) | 384, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(iyh0Var, i, (byte) 21);
        }
    }

    public static final void q(u0p u0pVar, String str, fet fetVar, int i) {
        jm40 jm40Var;
        mm40 mm40VarS;
        fet fetVar2 = fetVar;
        u0pVar.getClass();
        str.getClass();
        fetVar2.g0(1326559861);
        int i2 = i | (fetVar2.i(u0pVar) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) fetVar2.k(dy2.b);
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = j1t0.f15753a;
                context.getClass();
                objP.getClass();
                if (str.length() != 0) {
                    try {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(new File(context.getCacheDir(), str));
                        typefaceCreateFromFile.getClass();
                        objP = lv00.E(typefaceCreateFromFile);
                    } catch (Exception unused) {
                    }
                }
                fetVar2.o0(objP);
            }
            nrq nrqVar = (nrq) objP;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40Var2, 1.0f), "FATA_FURY_TABLE_ROW");
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(-4.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var3 = jm40Var2;
            v8q0.a(u0pVar.f34865a, o2e.e0(o7k0.s(s5x0.N(jm40Var2, 0.0f, 0.0f, 4.0f, 0.0f, 11), 22.0f), "FATA_FURY_TABLE_NUMBER"), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, qmk.t, null, null, nrqVar, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 12582912, 0, 260968);
            fetVar2 = fetVar;
            fetVar2.e0(1884147545);
            for (z0p z0pVar : u0pVar.b) {
                float fD = z0pVar.d();
                zcl zclVar2 = qmk.f28987a;
                if (ycl.b(fD, 0.0f)) {
                    mm40VarS = new x7z(1.0f, true);
                    jm40Var = jm40Var3;
                } else {
                    jm40Var = jm40Var3;
                    mm40VarS = o7k0.s(jm40Var, z0pVar.d());
                }
                vfc.v(o2e.e0(mm40VarS, "FATA_FURY_TABLE_CELL"), z0pVar, nrqVar, fetVar2, 448);
                jm40Var3 = jm40Var;
            }
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fun(u0pVar, str, i, (byte) 25);
        }
    }

    public static final void r(pls plsVar, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        plsVar.getClass();
        fetVar.g0(-1726653860);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(plsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-879571556, new cls(plsVar), fetVar), fetVar, 56);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n0n((p6t0) plsVar, mm40Var, i, (byte) 20);
        }
    }

    public static final boolean s(kuk kukVar, CyberGamesPage cyberGamesPage, n2o n2oVar) {
        j0g0 j0g0Var;
        j0g0 j0g0Var2;
        j0g0 j0g0Var3;
        j0g0 j0g0Var4;
        kukVar.getClass();
        cyberGamesPage.getClass();
        n2oVar.getClass();
        boolean z = cyberGamesPage instanceof CyberGamesPage.Real;
        if (z && n2oVar == n2o.DEFAULT) {
            Object obj = kukVar.j;
            e0g0 e0g0Var = j0g0.b;
            return (obj instanceof g0g0) && (j0g0Var3 = kukVar.c) != null && (j0g0Var3.f15681a instanceof g0g0) && (j0g0Var4 = kukVar.d) != null && (j0g0Var4.f15681a instanceof g0g0);
        }
        if (z) {
            j0g0 j0g0Var5 = kukVar.c;
            return j0g0Var5 != null && (j0g0Var5.f15681a instanceof g0g0) && (j0g0Var2 = kukVar.d) != null && (j0g0Var2.f15681a instanceof g0g0);
        }
        j0g0 j0g0Var6 = kukVar.f18914a;
        return j0g0Var6 != null && (j0g0Var6.f15681a instanceof g0g0) && (j0g0Var = kukVar.c) != null && (j0g0Var.f15681a instanceof g0g0);
    }

    public static final void t(EventCardMiddlePairTeams eventCardMiddlePairTeams, wyr wyrVar) {
        zmk0 zmk0Var = wyrVar.b;
        Context context = eventCardMiddlePairTeams.getContext();
        context.getClass();
        eventCardMiddlePairTeams.setFirstTeamsName(zmk0Var.a(context));
        Context context2 = eventCardMiddlePairTeams.getContext();
        context2.getClass();
        Drawable drawable = context2.getDrawable(R.drawable.no_photo_new);
        String str = wyrVar.c;
        long j = wyrVar.f39987a;
        String strS = vsm0.s(j, str);
        zkk zkkVar = eventCardMiddlePairTeams.q;
        LoadableShapeableImageView.i((DsTeamLogo) zkkVar.h, strS, drawable, 12);
        if (!wyrVar.e) {
            eventCardMiddlePairTeams.setBotFirstTeamLogo((Drawable) null);
        } else {
            LoadableShapeableImageView.i((DsTeamLogo) zkkVar.b, vsm0.s(j, wyrVar.d), drawable, 12);
        }
    }

    public static final void u(EventCardMiddlePairTeams eventCardMiddlePairTeams, xyr xyrVar) {
        zmk0 zmk0Var = xyrVar.b;
        Context context = eventCardMiddlePairTeams.getContext();
        context.getClass();
        eventCardMiddlePairTeams.setSecondTeamsName(zmk0Var.a(context));
        Context context2 = eventCardMiddlePairTeams.getContext();
        context2.getClass();
        Drawable drawable = context2.getDrawable(R.drawable.no_photo_new);
        String str = xyrVar.c;
        long j = xyrVar.f41718a;
        String strS = vsm0.s(j, str);
        zkk zkkVar = eventCardMiddlePairTeams.q;
        LoadableShapeableImageView.i((DsTeamLogo) zkkVar.i, strS, drawable, 12);
        if (!xyrVar.e) {
            eventCardMiddlePairTeams.setBotSecondTeamLogo((Drawable) null);
        } else {
            LoadableShapeableImageView.i((DsTeamLogo) zkkVar.c, vsm0.s(j, xyrVar.d), drawable, 12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [int] */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public static final ArrayList v(ieh iehVar, ueh uehVar) {
        Object next;
        Object next2;
        List list;
        List list2;
        List listD0;
        uehVar.getClass();
        ArrayList arrayList = new ArrayList();
        List list3 = iehVar.b;
        ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
        ?? r5 = 0;
        int i = 0;
        for (Object obj : list3) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            List list4 = ((eeh) obj).b;
            Iterator it = list4.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((aeh) next).d.length() <= 0);
            aeh aehVar = (aeh) next;
            String str = "";
            String str2 = aehVar != null ? aehVar.d : "";
            Iterator it2 = uehVar.b.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!((hhh) next2).f13063a.equals(str2));
            hhh hhhVar = (hhh) next2;
            cfh cfhVar = (cfh) CollectionsKt.firstOrNull(iehVar.f14633a);
            ?? size = (cfhVar == null || (list2 = cfhVar.b) == null || (listD0 = CollectionsKt.D0(list2, list4.size())) == null) ? r5 : listD0.size();
            Iterator it3 = list4.iterator();
            ?? r14 = r5;
            while (true) {
                if (!it3.hasNext()) {
                    r14 = -1;
                    break;
                }
                if (((aeh) it3.next()).d.length() > 0) {
                    break;
                }
                r14++;
            }
            List listY0 = CollectionsKt.y0(list4, l1e0.o(r14 + 1, size));
            String str3 = hhhVar != null ? hhhVar.f13063a : null;
            String str4 = str3 == null ? "" : str3;
            String strValueOf = String.valueOf(i2);
            strValueOf.getClass();
            String str5 = hhhVar != null ? hhhVar.c : null;
            if (str5 == null) {
                str5 = "";
            }
            if (kotlin.text.c.x(str5, ujn.h, r5)) {
                str = str5;
            } else if (str5.length() != 0) {
                List list5 = u0d.f34849a;
                if (!u0d.c(str5)) {
                    str = String.format(Locale.ENGLISH, StringsKt.O(str5, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str5}, 2));
                }
            }
            String str6 = hhhVar != null ? hhhVar.b : "-";
            IntRange intRange = new IntRange(r5, 4, 1);
            ArrayList arrayList3 = new ArrayList(r3d.q(intRange, 10));
            Iterator it4 = intRange.iterator();
            ?? r6 = r5;
            while (true) {
                ?? r13 = r6;
                if (((kkx) it4).c) {
                    ((bkx) it4).nextInt();
                    int i3 = (r13 == true ? 1 : 0) + 1;
                    if (r13 < 0) {
                        q3d.p();
                        throw null;
                    }
                    aeh aehVar2 = (aeh) CollectionsKt.W(r13 == true ? 1 : 0, listY0);
                    arrayList3.add(sj3.j0((aehVar2 == null || (list = aehVar2.c) == null) ? null : (String) CollectionsKt.firstOrNull(list), "-"));
                    r6 = i3;
                }
            }
            arrayList2.add(Boolean.valueOf(arrayList.add(new kfh(str4, strValueOf, str, str6, arrayList3))));
            i = i2;
            r5 = 0;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015  */
    public static final ArrayList w(kuk kukVar) {
        List list;
        j0g0 j0g0Var;
        j0g0 j0g0Var2;
        List list2 = null;
        if (kukVar == null || (j0g0Var2 = kukVar.c) == null) {
            list = null;
        } else {
            Object obj = j0g0Var2.f15681a;
            if (obj instanceof g0g0) {
                obj = null;
            }
            btk btkVar = (btk) obj;
            if (btkVar != null) {
                list = btkVar.f3186a;
            } else {
                list = null;
            }
        }
        if (list == null) {
            list = iun.f15405a;
        }
        if (kukVar != null && (j0g0Var = kukVar.d) != null) {
            Object obj2 = j0g0Var.f15681a;
            if (obj2 instanceof g0g0) {
                obj2 = null;
            }
            btk btkVar2 = (btk) obj2;
            if (btkVar2 != null) {
                list2 = btkVar2.f3186a;
            }
        }
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        return CollectionsKt.q0(list, list2);
    }

    public static final imm x(plm plmVar, boolean z, boolean z2) {
        pz40 pz40Var = s6t0.f31722a;
        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), plmVar, new dmm(new ta50(new wkm(0, z ? R.drawable.ic_glyph_quick_bet_active : R.drawable.ic_glyph_quick_bet_inactive, z2, ra50.f30118a, z ? s6t0.b().f33626a.getPrimary() : s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
    }

    public static w7r y(bwl bwlVar, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        w7r w7rVar = (w7r) bwlVar.f3330a;
        if (w7rVar != null && Intrinsics.d(w7rVar.f38688a, sQLiteDatabase)) {
            return w7rVar;
        }
        w7r w7rVar2 = new w7r(sQLiteDatabase);
        bwlVar.f3330a = w7rVar2;
        return w7rVar2;
    }

    public static final void z(cp cpVar, bex bexVar, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2) {
        yfu0 yfu0Var = cpVar.u;
        int iOrdinal = bexVar.ordinal();
        if (iOrdinal == 0) {
            ((mtx) yfu0Var).g.setVisibility(8);
            ((mtx) yfu0Var).d.setVisibility(0);
            objectAnimator2.cancel();
            objectAnimator.start();
            return;
        }
        if (iOrdinal == 1) {
            ((mtx) yfu0Var).d.setVisibility(8);
            ((mtx) yfu0Var).g.setVisibility(0);
            objectAnimator.cancel();
            objectAnimator2.start();
            return;
        }
        if (iOrdinal != 2) {
            t9f.b();
            return;
        }
        objectAnimator.cancel();
        objectAnimator2.cancel();
        ((mtx) yfu0Var).d.setVisibility(8);
        ((mtx) yfu0Var).g.setVisibility(8);
    }
}
