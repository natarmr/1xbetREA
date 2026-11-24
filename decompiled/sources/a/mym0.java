package a;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Response;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BulletSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Toast f22609a;

    public static final void a(mm40 mm40Var, List list, fet fetVar, int i) {
        fetVar.g0(-374870749);
        byte b = 4;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(list) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                zcl zclVar = qmk.f28987a;
                pz40 pz40Var = s6t0.f31722a;
                objP = new sqm(-2.0f, 0.0f, 6.0f, StaticColors.INSTANCE.m71getBlack300d7_KjU(), qmk.f28987a);
                fetVar.o0(objP);
            }
            sqm sqmVar = (sqm) objP;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            Iterator itV = kng0.v(fetVar, mm40VarC0, gqw0.v, 995592212, list);
            int i3 = 0;
            while (itV.hasNext()) {
                Object next = itV.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                pm80 pm80VarF = a8k0.F(((una0) next).f35951a, 0, fetVar);
                zcl zclVar2 = qmk.f28987a;
                j0x.b(pm80VarF, null, o2e.e0(qbc.c0(s5x0.N(jm40.b, 28.0f * i3, 0.0f, 0.0f, 0.0f, 14), sqmVar), "TWENTY_ONE_CARD"), null, null, 0.0f, null, fetVar, 56, 120);
                i3 = i4;
                sqmVar = sqmVar;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ika(mm40Var, list, i, b);
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fetVar.g0(-476069228);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(837613396, new ovr0(mm40Var, str, str2), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ovr0(mm40Var, str, str2, i, (byte) 3);
        }
    }

    public static final void c(mm40 mm40Var, nym0 nym0Var, Function1 function1, Function0 function0, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        fet fetVar2 = fetVar;
        nym0Var.getClass();
        function1.getClass();
        function0.getClass();
        fetVar2.g0(-1697892019);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar2.g(mm40Var2) ? 4 : 2);
        }
        int i5 = i3 | (fetVar2.g(nym0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024);
        if (fetVar2.U(i5 & 1, (i5 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            if (i4 != 0) {
                mm40Var2 = jm40Var;
            }
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 0.0f, 8.0f, 1);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            String strW = rsm0.w(R.string.cancel, 0, fetVar2);
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                pz40 pz40Var = s6t0.f31722a;
                objP = new wul(new kul(s6t0.b().f33626a.getBackgroundContent(), s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getBackgroundContent(), s6t0.b().f33626a.getSecondary()), oe9.f25112a, new ue9(strW), true, false, false);
                fetVar2.o0(objP);
            }
            aac.n(new x7z(1.0f, true), true, nym0Var.f24336a, qfh0.f28634a, rsm0.w(R.string.search_by_markets, 0, fetVar2), null, function1, null, null, fetVar2, ((i5 << 12) & 3670016) | 3120, Response.UNSUPPORTED_URI_SCHEME);
            qzb.n(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), (wul) objP, function0, fetVar, ((i5 >> 3) & 896) | 48, 0);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new brc0(mm40Var2, nym0Var, function1, function0, i, i2);
        }
    }

    public static final void d(int i, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        fetVar.g0(-1844610977);
        byte b = 4;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            float fA = bdl.a(((yez) ((rhv0) fetVar.k(bmd.u))).a());
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                zcl zclVar = qmk.f28987a;
                objP = Integer.valueOf((int) (fA / 36.0f));
                fetVar.o0(objP);
            }
            int iIntValue = ((Number) objP).intValue();
            zcl zclVar2 = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(16.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            fetVar.e0(-51634638);
            int iB = 0;
            while (iB < iIntValue) {
                mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                zcl zclVar3 = qmk.f28987a;
                iB = h97.b(lgb.J(o7k0.e(mm40VarD, 20.0f), vgg0.f37379a), vbc.d0(null, fetVar, 0, 1), fetVar, 0, iB, 1);
            }
            fetVar2 = fetVar;
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, b);
        }
    }

    public static final void e(uy6 uy6Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        uy6Var.getClass();
        fetVar.g0(473796894);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(jm40.b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(uy6Var) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar2 = fetVar;
            vbw0.h(null, u1c.M(-1934685425, new umr0(uy6Var, b), fetVar), null, fetVar2, (i2 & 14) | 384, 10);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nb50(uy6Var, i);
        }
    }

    public static final void f(zts0 zts0Var, fet fetVar, int i) {
        String str = zts0Var.f44978a;
        d4d d4dVar = zts0Var.d;
        fetVar.g0(-1083191002);
        int i2 = (fetVar.g(zts0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 116.0f);
            x5d x5dVarA = w5d.a(new qw3(12.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            long jY = ibc.Y(d4dVar, fetVar);
            long jY2 = ibc.Y(d4dVar, fetVar);
            zcl zclVar2 = qmk.c;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(s5x0.K(i120.Q(jm40Var, jY2, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 2.0f), "TWENTY_ONE_SCORE_INFO_" + str);
            boolean zF = fetVar.f(jY);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                objP = new r2a0((byte) 21, jY);
                fetVar.o0(objP);
            }
            b(0, fetVar, pai0.a(mm40VarE0, false, (Function1) objP), str, zts0Var.b);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(792681564, new yts0(zts0Var), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yts0(zts0Var, i);
        }
    }

    public static final void g(ViewGroup viewGroup, lc00 lc00Var) {
        viewGroup.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(lc00Var, 10));
        ListIterator listIterator = lc00Var.listIterator(0);
        while (true) {
            paw pawVar = (paw) listIterator;
            if (!pawVar.hasNext()) {
                return;
            }
            viewGroup.addView((View) pawVar.next());
            arrayList.add(Unit.f46060a);
        }
    }

    public static final Pair h(Object obj, String str) {
        if (obj != null) {
            return new Pair(str, obj.toString());
        }
        return null;
    }

    public static final void i(p830 p830Var, String str, SpannableStringBuilder spannableStringBuilder) {
        if (p830Var != null) {
            int i = 0;
            if (p830Var instanceof m830) {
                ArrayList arrayList = ((m830) p830Var).f21351a;
                for (Object obj : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    int length = spannableStringBuilder.length();
                    Iterator it = ((ld00) obj).f19825a.iterator();
                    while (it.hasNext()) {
                        i((o830) it.next(), str, spannableStringBuilder);
                    }
                    spannableStringBuilder.setSpan(new BulletSpan(sj3.X(8)), length, spannableStringBuilder.length(), 33);
                    if (i < arrayList.size() - 1) {
                        spannableStringBuilder.append(Separators.RETURN);
                    }
                    i = i2;
                }
                return;
            }
            if (p830Var instanceof n830) {
                n830 n830Var = (n830) p830Var;
                ArrayList arrayList2 = n830Var.b;
                ca80 ca80Var = n830Var.f23070a;
                int i3 = ca80Var != null ? ca80Var.f3996a : 1;
                for (Object obj2 : arrayList2) {
                    int i4 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    spannableStringBuilder.append(i3 + ". ");
                    Iterator it2 = ((ld00) obj2).f19825a.iterator();
                    while (it2.hasNext()) {
                        i((o830) it2.next(), str, spannableStringBuilder);
                    }
                    if (i < arrayList2.size() - 1) {
                        spannableStringBuilder.append(Separators.RETURN);
                    }
                    i3++;
                    i = i4;
                }
                return;
            }
            if (p830Var instanceof o830) {
                for (r4q0 r4q0Var : ((o830) p830Var).f24814a) {
                    if (Intrinsics.d(r4q0Var, p4q0.f26367a)) {
                        spannableStringBuilder.append(Separators.RETURN);
                    } else {
                        if (!(r4q0Var instanceof q4q0)) {
                            t9f.b();
                            return;
                        }
                        q4q0 q4q0Var = (q4q0) r4q0Var;
                        int i5 = q4q0Var.f28112a;
                        SpannableString spannableString = new SpannableString(str.substring(i5, q4q0Var.b + i5));
                        for (y2q0 y2q0Var : q4q0Var.c) {
                            if (Intrinsics.d(y2q0Var, t2q0.f33228a)) {
                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                            } else if (Intrinsics.d(y2q0Var, u2q0.f34959a)) {
                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                            } else if (y2q0Var instanceof v2q0) {
                                spannableString.setSpan(new URLSpan(((v2q0) y2q0Var).f36699a), 0, spannableString.length(), 33);
                            } else if (Intrinsics.d(y2q0Var, w2q0.f38464a)) {
                                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
                            } else {
                                if (!Intrinsics.d(y2q0Var, x2q0.f40182a)) {
                                    t9f.b();
                                    return;
                                }
                                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
                            }
                        }
                        spannableStringBuilder.append((CharSequence) spannableString);
                    }
                }
                return;
            }
        }
        t9f.b();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:7:0x0015, please report this as an issue */
    public static final c78 j(Drawable drawable) {
        int intrinsicWidth;
        Integer numValueOf;
        int iIntValue;
        Bitmap bitmap;
        drawable.getClass();
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                bitmap = bitmapDrawable.getBitmap();
            } else {
                intrinsicWidth = drawable.getIntrinsicWidth();
                numValueOf = Integer.valueOf(intrinsicWidth);
                if (intrinsicWidth <= 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = 1;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Integer numValueOf2 = intrinsicHeight > 0 ? Integer.valueOf(intrinsicHeight) : null;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, numValueOf2 != null ? numValueOf2.intValue() : 1, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.getClass();
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                bitmap = bitmapCreateBitmap;
            }
        } else {
            intrinsicWidth = drawable.getIntrinsicWidth();
            numValueOf = Integer.valueOf(intrinsicWidth);
            if (intrinsicWidth <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 1;
            }
            int intrinsicHeight2 = drawable.getIntrinsicHeight();
            if (intrinsicHeight2 > 0) {
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iIntValue, numValueOf2 != null ? numValueOf2.intValue() : 1, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap2.getClass();
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawable.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
            drawable.draw(canvas2);
            bitmap = bitmapCreateBitmap2;
        }
        bitmap.getClass();
        return new c78(new vz2(bitmap));
    }

    public static final String k(String str, String str2, boolean z) {
        str.getClass();
        StringBuilder sb = new StringBuilder();
        if (z) {
            String strB0 = CollectionsKt.b0(StringsKt__StringsKt.split$default(str, new String[]{Separators.SLASH}, false, 0, 6, null), Separators.SLASH, null, null, new meo0((byte) 21), 30);
            if (str.length() <= 0) {
                strB0 = null;
            }
            str = strB0 == null ? "" : strB0;
        }
        sb.append(str);
        if (str2.length() > 0) {
            sb.append(" (" + str2 + Separators.RPAREN);
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    public static final i4 l(ieh iehVar, ueh uehVar, ctf0 ctf0Var) {
        List list;
        Object next;
        Object next2;
        uehVar.getClass();
        ctf0Var.getClass();
        List<hhh> list2 = null;
        if (iehVar != null && (list = iehVar.b) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((eeh) it.next()).b.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (((aeh) next).d.length() <= 0);
                aeh aehVar = (aeh) next;
                String str = aehVar != null ? aehVar.d : null;
                Iterator it3 = uehVar.b.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (!((hhh) next2).f13063a.equals(str));
                hhh hhhVar = (hhh) next2;
                if (hhhVar != null) {
                    arrayList.add(hhhVar);
                }
            }
            list2 = arrayList;
        }
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        int size = list2.size();
        lc00 lc00VarB = kotlin.collections.a.b();
        nzr0 nzr0Var = nzr0.f24387a;
        lsm0 lsm0Var = ctf0Var.b;
        lc00VarB.add(new lzr0(nzr0Var, lsm0Var.a(R.string.number, Arrays.copyOf(new Object[0], 0)), nrq0.b));
        IntRange intRange = new IntRange(1, size, 1);
        ArrayList arrayList2 = new ArrayList(r3d.q(intRange, 10));
        Iterator it4 = intRange.iterator();
        while (((kkx) it4).c) {
            arrayList2.add(new lzr0(nzr0.b, String.valueOf(((bkx) it4).nextInt()), nrq0.b));
        }
        lc00VarB.addAll(arrayList2);
        i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB));
        lc00 lc00VarB2 = kotlin.collections.a.b();
        lc00VarB2.add(new lzr0(nzr0.f24387a, lsm0Var.a(R.string.team, Arrays.copyOf(new Object[0], 0)), nrq0.f24017a));
        ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
        for (hhh hhhVar2 : list2) {
            nzr0 nzr0Var2 = nzr0.f24387a;
            String str2 = hhhVar2.c;
            if (!kotlin.text.c.x(str2, ujn.h, false)) {
                if (str2.length() == 0) {
                    str2 = "";
                } else {
                    List list3 = u0d.f34849a;
                    if (u0d.c(str2)) {
                        str2 = "";
                    } else {
                        str2 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
                    }
                }
            }
            arrayList3.add(new kzr0(str2, hhhVar2.b));
        }
        lc00VarB2.addAll(arrayList3);
        i4 i4VarR1 = dyb.r0(kotlin.collections.a.a(lc00VarB2));
        lc00 lc00VarB3 = kotlin.collections.a.b();
        lc00VarB3.add(new x7s0(i4VarR0, zzr0.f45269a));
        lc00VarB3.add(new x7s0(i4VarR1, zzr0.b));
        return dyb.r0(kotlin.collections.a.a(lc00VarB3));
    }

    public static final String m(d0t d0tVar, ctf0 ctf0Var) {
        String strH = d0tVar.p.m;
        if (strH.length() == 0) {
            rdj rdjVar = rdj.f30294a;
            boolean zH = ctf0Var.h();
            long j = d0tVar.s;
            strH = rdj.h(new znq0(j), ykq0.UNIVERSAL, Boolean.valueOf(zH), null, 248);
        }
        return StringsKt.x0(ctf0Var.b.a(R.string.placeholder_variant_3, Arrays.copyOf(new Object[]{d0tVar.c, strH}, 2))).toString();
    }

    public static final String n(d0t d0tVar, ctf0 ctf0Var) {
        d0tVar.getClass();
        ctf0Var.getClass();
        String strF = d0tVar.p.m;
        if (strF.length() == 0) {
            rdj rdjVar = rdj.f30294a;
            strF = rdj.f(new znq0(d0tVar.s), sdj.UNIVERSAL, null, 60);
        }
        return StringsKt.x0(ctf0Var.b.a(R.string.placeholder_variant_3, Arrays.copyOf(new Object[]{d0tVar.c, strF}, 2))).toString();
    }

    public static final r0n o(d0t d0tVar) {
        if (!qzb.B0(d0tVar)) {
            return o0n.f24435a;
        }
        return new p0n(TimeUnit.SECONDS.toMillis(d0tVar.t), fgm.b, d0tVar.P.getTime(), kpb.j0(d0tVar), 16);
    }

    public static final String p(int i) {
        return f140.i(i, Separators.PERCENT);
    }

    public static final void q(View view, jj3 jj3Var) {
        int i = jj3Var.p;
        view.setPadding(view.getResources().getDimensionPixelSize(R.dimen.space_0), view.getResources().getDimensionPixelSize(jj3Var.o), view.getResources().getDimensionPixelSize(R.dimen.space_0), view.getResources().getDimensionPixelSize(i));
    }

    public static final xdv0 r(d0t d0tVar) {
        d0tVar.getClass();
        long j = d0tVar.f5282a;
        f0t f0tVar = d0tVar.r;
        f0t f0tVar2 = d0tVar.q;
        long j2 = d0tVar.v;
        long j3 = d0tVar.u;
        boolean z = d0tVar.C;
        String strA0 = d0tVar.o;
        if (strA0.length() <= 0) {
            strA0 = null;
        }
        if (strA0 == null) {
            strA0 = sj3.a0(d0tVar);
        }
        return new xdv0(j, j2, j3, null, z, j2, strA0, d0tVar.n, new unp0(f0tVar2.f8731a, qzb.c0(d0tVar), f0tVar2.d), new unp0(f0tVar.f8731a, qzb.r0(d0tVar), f0tVar.d), qzb.F0(d0tVar), d0tVar.E, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [a.iun] */
    public static final List s(c5q c5qVar, List list, boolean z) {
        ?? U = twn.u(list);
        for (Object obj : list) {
            mz60 mz60Var = (mz60) obj;
            if (x1x.D(mz60Var.b) != s470.LUCKY_WHEEL.a() && mz60Var.f) {
                U.add(obj);
            }
        }
        if (U.isEmpty()) {
            U = 0;
            break;
        }
        Iterator it = U.iterator();
        do {
            if (!it.hasNext()) {
                U = 0;
                break;
            }
        } while (((mz60) it.next()).e);
        if (U == 0) {
            U = iun.f15405a;
        }
        return pgi0.t(pgi0.p(c5qVar, new ij90((Object) U, z, (byte) 21)));
    }

    public static jlw0 t(Object obj) {
        if (obj == null) {
            return jlw0.W0;
        }
        if (obj instanceof String) {
            return new slw0((String) obj);
        }
        if (obj instanceof Double) {
            return new ihw0((Double) obj);
        }
        if (obj instanceof Long) {
            return new ihw0(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new ihw0(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new pfw0((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jf4.o("Invalid value type");
                return null;
            }
            rew0 rew0Var = new rew0();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                rew0Var.m(rew0Var.k(), t(it.next()));
            }
            return rew0Var;
        }
        akw0 akw0Var = new akw0();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            jlw0 jlw0VarT = t(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                akw0Var.f((String) string, jlw0VarT);
            }
        }
        return akw0Var;
    }

    public static jlw0 u(qyw0 qyw0Var) {
        if (qyw0Var == null) {
            return jlw0.V0;
        }
        int iZ = qyw0Var.z() - 1;
        if (iZ == 1) {
            return qyw0Var.t() ? new slw0(qyw0Var.u()) : jlw0.c1;
        }
        if (iZ == 2) {
            return qyw0Var.x() ? new ihw0(Double.valueOf(qyw0Var.y())) : new ihw0(null);
        }
        if (iZ == 3) {
            return qyw0Var.v() ? new pfw0(Boolean.valueOf(qyw0Var.w())) : new pfw0(null);
        }
        if (iZ != 4) {
            jf4.o("Unknown type found. Cannot convert entity");
            return null;
        }
        List listR = qyw0Var.r();
        ArrayList arrayList = new ArrayList();
        Iterator it = listR.iterator();
        while (it.hasNext()) {
            arrayList.add(u((qyw0) it.next()));
        }
        return new plw0(qyw0Var.s(), arrayList);
    }
}
