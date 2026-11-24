package a;

import android.app.PendingIntent;
import android.content.Context;
import android.view.textclassifier.TextClassification;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.test.internal.TestMainDispatcherFactory;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.presentation.TransferScreenParams;
import org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter.TransferFilterTimeCustomDateValue;
import org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter.TransferTimeFilterUiModel;
import org.xplatform.tile_matching.presentation.views.TileMatchingGameFieldView;
import org.xplatform.ufc.api.game.UfcPostGameParams;
import org.xplatform.ui_core.calendar.model.DateRangeWithTimeCalendarBottomSheetParams;
import org.xplatform.ui_core.viewcomponents.layouts.linear.TextInputEditTextNew;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yip0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42705a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yip0(e9q0 e9q0Var, i83 i83Var, u23 u23Var) {
        this.f42705a = (byte) 10;
        this.b = i83Var;
        this.c = u23Var;
    }

    /* JADX WARN: Code duplicated, block: B:193:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:72:0x0182  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object g0g0Var;
        long j;
        b9q0 b9q0VarD;
        djz djzVar;
        j83 j83Var;
        sa4 sa4Var;
        Object value;
        obq0 obq0Var;
        boolean z;
        Object next;
        Object next2;
        fcg fcgVar;
        fcg fcgVar2;
        d1s0 d1s0Var;
        d1s0 d1s0Var2;
        d1s0 d1s0Var3;
        long jE;
        lc00 lc00VarB;
        Collection collection;
        byte b = this.f42705a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ajp0 ajp0Var = (ajp0) obj2;
                phf0 phf0Var = ajp0Var.l2;
                iiy[] iiyVarArr = ajp0.s2;
                vcc.f0(i120.V(new Pair("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", new ojp0(ajp0Var.n2.n(ajp0Var, iiyVarArr[2]).intValue(), ajp0Var.o2.n(ajp0Var, iiyVarArr[3]).intValue(), ((ejp0) obj).f7920a.f2946a))), ajp0Var, phf0Var.n(ajp0Var, iiyVarArr[0]));
                return Unit.f46060a;
            case 1:
                ((Function1) obj2).invoke(((rkp0) obj).f30659a);
                return Unit.f46060a;
            case 2:
                ((Function1) obj2).invoke(((skp0) obj).f32363a);
                return Unit.f46060a;
            case 3:
                ((Function1) obj2).invoke((d9a0) obj);
                return Unit.f46060a;
            case 4:
                Context context = (Context) obj2;
                ImageView imageView = new ImageView(context);
                imageView.setImageDrawable(context.getDrawable(R.drawable.ic_game_indicator));
                imageView.setColorFilter(m5d.b(R.attr.uikitSecondary, context));
                ((lxp0) obj).addView(imageView);
                return imageView;
            case 5:
                try {
                    vs10 vs10VarA = ((xs10) obj2).a((ArrayList) obj);
                    if (!(vs10VarA.x() instanceof ch40)) {
                        return vs10VarA;
                    }
                    try {
                        e0g0 e0g0Var = j0g0.b;
                        vs10VarA.q(vs10VarA, new d12((byte) 3));
                        g0g0Var = Unit.f46060a;
                        break;
                    } catch (Throwable th) {
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var = new g0g0(th);
                    }
                    hny.q("Dispatchers.Main was accessed when the platform dispatcher was absent and the test dispatcher was unset. Please make sure that Dispatchers.setMain() is called before accessing Dispatchers.Main and that Dispatchers.Main is not accessed after Dispatchers.resetMain().", j0g0.a(g0g0Var));
                    return null;
                } catch (Throwable th2) {
                    hny.q("Dispatchers.Main was accessed when the platform dispatcher was absent and the test dispatcher was unset. Please make sure that Dispatchers.setMain() is called before accessing Dispatchers.Main and that Dispatchers.Main is not accessed after Dispatchers.resetMain().", th2);
                }
                break;
            case 6:
                Context context2 = (Context) obj2;
                TextClassification textClassification = (TextClassification) obj;
                String text = textClassification.getText();
                btm0.u(PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592));
                return Unit.f46060a;
            case 7:
                qjj.W((vne) obj2, null, yne.d, new a2f((Function1) obj, null, (byte) 7), 1);
                return Unit.f46060a;
            case 8:
                k7q0 k7q0Var = (k7q0) obj2;
                long j2 = ((qkx) ((pz40) obj).getValue()).f28908a;
                ne60 ne60VarG = k7q0Var.g();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (ne60VarG != null) {
                    long j3 = ne60VarG.f23370a;
                    j83 j83VarK = k7q0Var.k();
                    if (j83VarK != null && j83VarK.b.length() != 0) {
                        blv blvVar = (blv) ((hgk0) k7q0Var.r).getValue();
                        int i = blvVar == null ? -1 : m7q0.f21333a[blvVar.ordinal()];
                        if (i != -1) {
                            if (i == 1 || i == 2) {
                                long j4 = k7q0Var.l().b;
                                int i2 = o9q0.c;
                                j = j4 >> 32;
                            } else {
                                if (i != 3) {
                                    t9f.b();
                                    return null;
                                }
                                long j5 = k7q0Var.l().b;
                                int i3 = o9q0.c;
                                j = j5 & 4294967295L;
                            }
                            int i4 = (int) j;
                            djz djzVar2 = k7q0Var.d;
                            if (djzVar2 != null && (b9q0VarD = djzVar2.d()) != null && (djzVar = k7q0Var.d) != null && (j83Var = (j83) djzVar.f6209a.b) != null) {
                                int iD = l1e0.d(k7q0Var.b.s(i4), 0, j83Var.b.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (b9q0VarD.d(j3) >> 32));
                                a9q0 a9q0Var = b9q0VarD.f2224a;
                                bw40 bw40Var = a9q0Var.b;
                                int iD2 = bw40Var.d(iD);
                                float fG = a9q0Var.g(iD2);
                                float fH = a9q0Var.h(iD2);
                                float fC = l1e0.c(fIntBitsToFloat, Math.min(fG, fH), Math.max(fG, fH));
                                if (qkx.a(j2, 0L) || Math.abs(fIntBitsToFloat - fC) <= ((int) (j2 >> 32)) / 2) {
                                    float f = bw40Var.f(iD2);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fC)) << 32) | (((long) Float.floatToRawIntBits(((bw40Var.b(iD2) - f) / 2.0f) + f)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new ne60(jFloatToRawIntBits);
            case 9:
                return TextInputEditTextNew.A((Context) obj2, (TextInputEditTextNew) obj);
            case 10:
                u23 u23Var = (u23) obj;
                kb00 kb00Var = (kb00) ((i83) obj2).f14321a;
                if (kb00Var instanceof jb00) {
                    sa4 sa4Var2 = ((jb00) kb00Var).c;
                    if (sa4Var2 != null) {
                        sa4Var2.a(kb00Var);
                    } else {
                        try {
                            u23Var.a(((jb00) kb00Var).f16214a);
                            break;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } else if ((kb00Var instanceof ib00) && (sa4Var = ((ib00) kb00Var).c) != null) {
                    sa4Var.a(kb00Var);
                }
                return Unit.f46060a;
            case 11:
                zbq0 zbq0Var = (zbq0) obj2;
                uaq0 uaq0Var = (uaq0) obj;
                v6j0 v6j0Var = zbq0Var.g.f21386a;
                v6j0Var.f36880a.e(uaq0Var.ordinal(), "THEME");
                p7m0 p7m0Var = (p7m0) v6j0Var.h();
                p7m0Var.getClass();
                p7m0Var.o(null, uaq0Var);
                y3v y3vVar = zbq0Var.c;
                String strName = uaq0Var.name();
                strName.getClass();
                HashMap map = (HashMap) y3vVar.d;
                Locale locale = Locale.ROOT;
                String lowerCase = strName.toLowerCase(locale);
                lowerCase.getClass();
                map.put("theme", lowerCase);
                nvu nvuVar = zbq0Var.m;
                String lowerCase2 = uaq0Var.name().toLowerCase(locale);
                lowerCase2.getClass();
                ((LinkedHashMap) nvuVar.d).put("THEME_KEY", lowerCase2);
                p7m0 p7m0Var2 = zbq0Var.n;
                do {
                    value = p7m0Var2.getValue();
                    obq0Var = (obq0) value;
                    if (zbq0Var.h.f36139a.f()) {
                        uaq0.f35345a.getClass();
                        if (s9m0.j(uaq0Var)) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    uaq0.f35345a.getClass();
                } while (!p7m0Var2.m(value, obq0.a(obq0Var, uaq0Var, z, !s9m0.j(uaq0Var), null, null, 49)));
                return Unit.f46060a;
            case 12:
                r1a r1aVar = (r1a) obj;
                Executor executor = ((k1a) ((y78) obj2).c).f17511a;
                if (executor != null) {
                    return executor;
                }
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1, new l23(-3, o23.b("CXCP-Camera-E", o23.b)));
                executorServiceNewFixedThreadPool.getClass();
                r1aVar.a(p1a.c, new apj0((Object) executorServiceNewFixedThreadPool, (byte) 17));
                return executorServiceNewFixedThreadPool;
            case 13:
                TileMatchingGameFieldView tileMatchingGameFieldView = (TileMatchingGameFieldView) obj2;
                List list = (List) obj;
                int i5 = TileMatchingGameFieldView.h;
                Iterator it = l1e0.o(0, 5).iterator();
                int i6 = 0;
                while (((kkx) it).c) {
                    int iNextInt = ((bkx) it).nextInt();
                    Iterator it2 = l1e0.o(0, 5).iterator();
                    while (((kkx) it2).c) {
                        int iNextInt2 = ((bkx) it2).nextInt();
                        zdq0 zdq0Var = (zdq0) tileMatchingGameFieldView.b.get(i6);
                        zdq0Var.setRow$tile_matching(iNextInt);
                        zdq0Var.setColumn$tile_matching(iNextInt2);
                        zdq0Var.setYByLine$tile_matching(iNextInt);
                        i6++;
                    }
                }
                tileMatchingGameFieldView.d.clear();
                tileMatchingGameFieldView.d(list);
                h3q0 h3q0Var = new h3q0((Object) tileMatchingGameFieldView, (byte) 12);
                kie0 kie0Var = new kie0();
                for (zdq0 zdq0Var2 : tileMatchingGameFieldView.b) {
                    zdq0Var2.setY(zdq0Var2.getY() - tileMatchingGameFieldView.getMeasuredHeight());
                    zdq0Var2.setVisibility(0);
                    zdq0Var2.h(zdq0Var2.getY() + tileMatchingGameFieldView.getMeasuredHeight(), new yip0((Object) kie0Var, (Object) h3q0Var, (byte) 15));
                }
                return Unit.f46060a;
            case 14:
                zdq0 zdq0Var3 = (zdq0) obj2;
                TileMatchingGameFieldView tileMatchingGameFieldView2 = (TileMatchingGameFieldView) obj;
                int i7 = TileMatchingGameFieldView.h;
                lgq0 type$tile_matching = zdq0Var3.getType$tile_matching();
                if (!zdq0Var3.g) {
                    type$tile_matching = null;
                }
                if (type$tile_matching != null) {
                    Iterator it3 = tileMatchingGameFieldView2.b.iterator();
                    while (it3.hasNext()) {
                        ((zdq0) it3.next()).setEnabled(false);
                    }
                    Iterator it4 = tileMatchingGameFieldView2.c.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next = it4.next();
                            List list2 = (List) next;
                            if (list2 == null || !list2.isEmpty()) {
                                Iterator it5 = list2.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        xdq0 xdq0Var = (xdq0) it5.next();
                                        if ((xdq0Var.c == zdq0Var3.getColumn$tile_matching()) & (xdq0Var.b == zdq0Var3.getRow$tile_matching())) {
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        } else {
                            next = null;
                        }
                    }
                    List<xdq0> list3 = (List) next;
                    if (list3 != null) {
                        ArrayList arrayList = tileMatchingGameFieldView2.d;
                        arrayList.clear();
                        ArrayList arrayList2 = new ArrayList();
                        for (xdq0 xdq0Var2 : list3) {
                            Iterator it6 = tileMatchingGameFieldView2.b.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    next2 = it6.next();
                                    zdq0 zdq0Var4 = (zdq0) next2;
                                    if (zdq0Var4.getRow$tile_matching() != xdq0Var2.b || zdq0Var4.getColumn$tile_matching() != xdq0Var2.c) {
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            zdq0 zdq0Var5 = (zdq0) next2;
                            if (zdq0Var5 != null) {
                                arrayList2.add(zdq0Var5);
                            }
                        }
                        arrayList.addAll(arrayList2);
                    }
                    tileMatchingGameFieldView2.g.invoke(Integer.valueOf(zdq0Var3.getRow$tile_matching()), Integer.valueOf(zdq0Var3.getColumn$tile_matching()));
                }
                return Unit.f46060a;
            case 15:
                kie0 kie0Var2 = (kie0) obj2;
                h3q0 h3q0Var2 = (h3q0) obj;
                int i8 = TileMatchingGameFieldView.h;
                int i9 = kie0Var2.f18333a + 1;
                kie0Var2.f18333a = i9;
                if (i9 == 25) {
                    h3q0Var2.invoke();
                }
                return Unit.f46060a;
            case 16:
                ((usq0) obj2).invoke(((cp) obj).u());
                return Unit.f46060a;
            case 17:
                ((Function1) obj2).invoke(((hco) obj).b);
                return Unit.f46060a;
            case 18:
                h4r0 h4r0Var = (h4r0) obj;
                ((Function1) obj2).invoke(new q01(h4r0Var.f12448a, h4r0Var.b, h4r0Var.c));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Boolean.valueOf(((x6r0) ((l7m0) obj2).getValue()).d ? ((Boolean) ((l7m0) ((e2d) obj).f.getValue()).getValue()).booleanValue() : true);
            case 20:
                lcb0 lcb0Var = (lcb0) obj;
                lcb0Var.getClass();
                ((Function1) obj2).invoke(new kkb0(lcb0Var));
                return Unit.f46060a;
            case 21:
                x1x.x(((vxi) obj2).p.d());
                ujd.a((Fragment) obj);
                return Unit.f46060a;
            case 22:
                upk0 upk0Var = (upk0) obj;
                ((Function1) obj2).invoke(new mkb0(upk0Var.f36070a, upk0Var.b));
                return Unit.f46060a;
            case 23:
                ((Function1) obj2).invoke(((byr0) obj).f3433a);
                return Unit.f46060a;
            case 24:
                s9m0 s9m0Var = uks0.l2;
                nwd nwdVar = xej.l2;
                DateRangeWithTimeCalendarBottomSheetParams dateRangeWithTimeCalendarBottomSheetParams = ((yhs0) obj2).b;
                androidx.fragment.app.e eVarC = ((uks0) obj).C();
                eVarC.getClass();
                nwdVar.getClass();
                nwd.f(dateRangeWithTimeCalendarBottomSheetParams, eVarC);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                TransferScreenParams transferScreenParams = (TransferScreenParams) obj2;
                ctf0 ctf0Var = (ctf0) obj;
                long j6 = transferScreenParams.f46565a;
                String strA = ctf0Var.b.a(R.string.cyber_games_chip_transfer, Arrays.copyOf(new Object[0], 0));
                String strA2 = ctf0Var.b.a(R.string.search, Arrays.copyOf(new Object[0], 0));
                xhs0 xhs0Var = xhs0.f40911a;
                TransferTimeFilterUiModel.SimpleTime simpleTime = new TransferTimeFilterUiModel.SimpleTime(xhs0Var);
                TransferTimeFilterUiModel.SimpleTime simpleTime2 = new TransferTimeFilterUiModel.SimpleTime(xhs0.b);
                TransferTimeFilterUiModel.SimpleTime simpleTime3 = new TransferTimeFilterUiModel.SimpleTime(xhs0.c);
                TransferTimeFilterUiModel.SimpleTime simpleTime4 = new TransferTimeFilterUiModel.SimpleTime(xhs0.d);
                TransferTimeFilterUiModel.SimpleTime simpleTime5 = new TransferTimeFilterUiModel.SimpleTime(xhs0.e);
                TransferFilterTimeCustomDateValue.Unselected unselected = TransferFilterTimeCustomDateValue.Unselected.f46617a;
                return new pks0(transferScreenParams, j6, strA, strA2, null, null, false, false, "", q3d.j(simpleTime, simpleTime2, simpleTime3, simpleTime4, simpleTime5, new TransferTimeFilterUiModel.CustomTime(unselected, unselected)), new TransferTimeFilterUiModel.SimpleTime(xhs0Var), iun.f15405a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                r9u r9uVar = (r9u) obj2;
                UfcPostGameParams ufcPostGameParams = (UfcPostGameParams) obj;
                n5t0 n5t0Var = n5t0.f22962a;
                iun iunVar = iun.f15405a;
                c0o c0oVar = vnb0.c;
                ArrayList arrayList3 = new ArrayList(r3d.q(c0oVar, 10));
                Iterator it7 = c0oVar.iterator();
                while (it7.hasNext()) {
                    arrayList3.add(((vnb0) it7.next()).f37712a);
                }
                lel0.Companion.getClass();
                ypl0 ypl0Var = new ypl0(0L, "", kel0.a());
                bqr bqrVar = new bqr(0L, 0L, "");
                pcs[] pcsVarArr = pcs.c;
                upv[] upvVarArr = upv.c;
                ygp ygpVar = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                return new s5t0(ufcPostGameParams, n5t0Var, null, null, null, iunVar, iunVar, iunVar, arrayList3, ypl0Var, bqrVar, false, 1L, j1q0Var.f15748a.d(ygpVar), 0L, 1L, 0L);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Function1) obj2).invoke(new o8t0(((l9t0) obj).f19673a));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ej1 ej1Var = (ej1) obj2;
                n0o0 n0o0Var = ej1Var.e;
                n0o0 n0o0Var2 = ej1Var.p;
                n0o0 n0o0Var3 = ej1Var.o;
                n0o0 n0o0Var4 = ej1Var.n;
                n0o0 n0o0Var5 = ej1Var.m;
                n0o0 n0o0Var6 = ej1Var.l;
                n0o0 n0o0Var7 = ej1Var.k;
                n0o0 n0o0Var8 = ej1Var.j;
                n0o0 n0o0Var9 = ej1Var.i;
                n0o0 n0o0Var10 = ej1Var.g;
                n0o0 n0o0Var11 = ej1Var.f;
                n0o0 n0o0Var12 = ej1Var.h;
                cdt0 cdt0Var = (cdt0) obj;
                fee feeVar = (fee) ej1Var.c.getValue();
                xbt0 xbt0Var = cdt0Var.c;
                feeVar.d(xbt0Var);
                n0o0 n0o0Var13 = ej1Var.d;
                fee feeVar2 = (fee) n0o0Var13.getValue();
                if (xbt0Var != null) {
                    Object obj3 = xbt0Var.b;
                    fcg fcgVar3 = new fcg(iun.f15405a, "");
                    e0g0 e0g0Var3 = j0g0.b;
                    if (obj3 instanceof g0g0) {
                        obj3 = fcgVar3;
                    }
                    fcgVar = (fcg) obj3;
                } else {
                    fcgVar = null;
                }
                feeVar2.d(fcgVar);
                fee feeVar3 = (fee) n0o0Var.getValue();
                if (xbt0Var != null) {
                    Object obj4 = xbt0Var.c;
                    fcg fcgVar4 = new fcg(iun.f15405a, "");
                    e0g0 e0g0Var4 = j0g0.b;
                    if (obj4 instanceof g0g0) {
                        obj4 = fcgVar4;
                    }
                    fcgVar2 = (fcg) obj4;
                } else {
                    fcgVar2 = null;
                }
                feeVar3.d(fcgVar2);
                ((fee) n0o0Var11.getValue()).d(cdt0Var);
                fee feeVar4 = (fee) n0o0Var10.getValue();
                List list4 = xbt0Var != null ? xbt0Var.d : null;
                if (list4 == null) {
                    list4 = iun.f15405a;
                }
                feeVar4.d(list4);
                ((fee) n0o0Var12.getValue()).d(xbt0Var);
                ((fee) n0o0Var9.getValue()).d(xbt0Var != null ? new j0g0(xbt0Var.f40616a) : null);
                ((fee) n0o0Var8.getValue()).d(cdt0Var);
                ((fee) n0o0Var7.getValue()).d(xbt0Var != null ? new j0g0(xbt0Var.f40616a) : null);
                fee feeVar5 = (fee) n0o0Var6.getValue();
                if (xbt0Var != null) {
                    Object obj5 = xbt0Var.g;
                    e0g0 e0g0Var5 = j0g0.b;
                    if (obj5 instanceof g0g0) {
                        obj5 = null;
                    }
                    d1s0Var = (d1s0) obj5;
                } else {
                    d1s0Var = null;
                }
                feeVar5.d(d1s0Var);
                fee feeVar6 = (fee) n0o0Var5.getValue();
                if (xbt0Var != null) {
                    Object obj6 = xbt0Var.g;
                    e0g0 e0g0Var6 = j0g0.b;
                    if (obj6 instanceof g0g0) {
                        obj6 = null;
                    }
                    d1s0Var2 = (d1s0) obj6;
                } else {
                    d1s0Var2 = null;
                }
                feeVar6.d(d1s0Var2);
                ((fee) n0o0Var4.getValue()).d(xbt0Var != null ? new j0g0(xbt0Var.f40616a) : null);
                fee feeVar7 = (fee) n0o0Var3.getValue();
                if (xbt0Var != null) {
                    Object obj7 = xbt0Var.g;
                    e0g0 e0g0Var7 = j0g0.b;
                    if (obj7 instanceof g0g0) {
                        obj7 = null;
                    }
                    d1s0Var3 = (d1s0) obj7;
                } else {
                    d1s0Var3 = null;
                }
                feeVar7.d(d1s0Var3);
                ((fee) n0o0Var2.getValue()).d(xbt0Var != null ? xbt0Var.h : null);
                xbt0 xbt0Var2 = (xbt0) ((fee) n0o0Var12.getValue()).c();
                if (xbt0Var2 != null) {
                    Object obj8 = xbt0Var2.f40616a;
                    e0g0 e0g0Var8 = j0g0.b;
                    fn9 fn9Var = (fn9) (obj8 instanceof g0g0 ? null : obj8);
                    if (fn9Var != null) {
                        long j7 = fn9Var.q;
                        uen uenVar = wen.b;
                        jE = wen.e(ibc.w0(j7, bfn.SECONDS));
                    } else {
                        jE = 0;
                    }
                } else {
                    jE = 0;
                }
                if (jE <= 0 || jE >= System.currentTimeMillis()) {
                    lc00VarB = kotlin.collections.a.b();
                    lc00VarB.addAll((Collection) ((fee) n0o0Var13.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var11.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var10.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var12.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var9.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var8.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var7.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var6.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var5.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var4.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var3.getValue()).b());
                    collection = (Collection) ((fee) n0o0Var2.getValue()).b();
                } else {
                    lc00VarB = kotlin.collections.a.b();
                    lc00VarB.addAll((Collection) ((fee) n0o0Var7.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var11.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var10.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var12.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var9.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var8.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var6.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var5.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var4.getValue()).b());
                    lc00VarB.addAll((Collection) ((fee) n0o0Var3.getValue()).b());
                    collection = (Collection) ((fee) n0o0Var2.getValue()).b();
                }
                return twn.k(lc00VarB, collection, lc00VarB);
            default:
                ((x1) obj2).removeOnAttachStateChangeListener((sgu0) obj);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ yip0(xs10 xs10Var, ArrayList arrayList, TestMainDispatcherFactory testMainDispatcherFactory) {
        this.f42705a = (byte) 5;
        this.b = xs10Var;
        this.c = arrayList;
    }

    public /* synthetic */ yip0(Object obj, Object obj2, byte b) {
        this.f42705a = b;
        this.b = obj;
        this.c = obj2;
    }
}
