package a;

import android.javax.sip.message.Response;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.discipline.presentation.model.DisciplineDetailsParams;
import org.xplatform.cyber.section.api.virtualgamescategories.VirtualGameCategoryParams;
import org.xplatform.game_broadcasting.api.presentation.models.BroadcastingVideoLandscapeParams;
import org.xplatform.games_mania.presentation.views.GamesManiaMapView;
import org.xplatform.sportgame.advanced.api.SportGameAdvancedScreenParams;
import org.xplatform.ufc.api.game.UfcGameParams;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class co0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4678a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ co0(azg0 azg0Var, u0h0 u0h0Var, fzg0 fzg0Var, String str, Object obj, Object[] objArr) {
        this.f4678a = (byte) 8;
        this.b = azg0Var;
        this.e = u0h0Var;
        this.f = fzg0Var;
        this.g = str;
        this.c = obj;
        this.d = objArr;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x04d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x04d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x04d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:124:0x04db  */
    /* JADX WARN: Code duplicated, block: B:126:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:127:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:128:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:129:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:130:0x04ed  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
        yk0 yk0Var;
        d7v d7vVar;
        d7v d7vVar2;
        int iOrdinal;
        c01 c01Var;
        gps zosVar;
        Object g0g0Var;
        byte b = this.f4678a;
        boolean z = false;
        boolean z2 = true;
        dja djaVar = null;
        Object obj = this.g;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.f;
        Object obj5 = this.b;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                iqt iqtVar = (iqt) obj3;
                dmt dmtVar = (dmt) obj2;
                String str = (String) obj;
                sff0 sff0VarA = ((pru) obj5).a();
                hl1 hl1Var = sff0VarA.b;
                mum0 mum0Var = sff0VarA.g;
                v8d v8dVarA = ((bzt) obj6).f3488a.a();
                int iOrdinal2 = ((mdp) obj4).ordinal();
                if (iOrdinal2 == 0) {
                    yk0Var = yk0.FAVORITES;
                } else {
                    if (iOrdinal2 != 1) {
                        t9f.b();
                        return null;
                    }
                    yk0Var = yk0.VIEWED;
                }
                yk0 yk0Var2 = yk0Var;
                boolean zA = iqtVar.f15225a.a();
                kg kgVarB = dmtVar.b();
                zvh0 zvh0Var = mum0Var.x;
                boolean z3 = hl1Var.f13233a.f8987a;
                ot0 ot0Var = hl1Var.l;
                int i = v8dVarA.r;
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                xun xunVar = xun.f41520a;
                iun iunVar = iun.f15405a;
                sn0 sn0Var = sn0.f32471a;
                return new ln0(yk0Var2, zA, null, kgVarB, zvh0Var, z3, ot0Var, str, i, lunVar, xunVar, iunVar, sn0Var, sn0Var, -1L, false);
            case 1:
                iqt iqtVar2 = (iqt) obj3;
                dmt dmtVar2 = (dmt) obj2;
                bzt bztVar = (bzt) obj6;
                ctf0 ctf0Var = (ctf0) obj;
                sff0 sff0VarA2 = ((pru) obj5).a();
                d7v d7vVar3 = d7v.b;
                art artVar = d7v.f5612a;
                int i2 = ((x860) obj4).f40449a;
                artVar.getClass();
                if (i2 != 1) {
                    if (i2 != 2) {
                        d7vVar2 = d7vVar3;
                    } else {
                        d7vVar = d7v.d;
                    }
                    iun iunVar2 = iun.f15405a;
                    boolean z4 = sff0VarA2.k.h;
                    lun lunVar2 = lun.f20680a;
                    lunVar2.getClass();
                    boolean zA2 = iqtVar2.f15225a.a();
                    kg kgVarB2 = dmtVar2.b();
                    int i3 = bztVar.f3488a.a().r;
                    String strA = ctf0Var.b.a(R.string.gifts_title, Arrays.copyOf(new Object[0], 0));
                    hl1 hl1Var2 = sff0VarA2.b;
                    iOrdinal = hl1Var2.h.ordinal();
                    if (iOrdinal != 0) {
                        c01Var = c01.f3501a;
                    } else if (iOrdinal != 1) {
                        c01Var = c01.b;
                    } else if (iOrdinal != 2) {
                        c01Var = c01.c;
                    } else if (iOrdinal != 3) {
                        c01Var = c01.d;
                    } else {
                        if (iOrdinal == 4) {
                            t9f.b();
                            return null;
                        }
                        c01Var = c01.e;
                    }
                    return new q11(0L, d7vVar3, d7vVar2, null, z4, a7v.f393a, l7v.f19578a, iunVar2, iunVar2, iunVar2, lunVar2, false, zA2, false, f7v.f9076a, i3, false, strA, null, c01Var, kgVarB2, hl1Var2.C, iunVar2, hl1Var2.l, xun.f41520a);
                }
                d7vVar = d7v.c;
                d7vVar2 = d7vVar;
                iun iunVar3 = iun.f15405a;
                boolean z5 = sff0VarA2.k.h;
                lun lunVar3 = lun.f20680a;
                lunVar3.getClass();
                boolean zA3 = iqtVar2.f15225a.a();
                kg kgVarB3 = dmtVar2.b();
                int i4 = bztVar.f3488a.a().r;
                String strA2 = ctf0Var.b.a(R.string.gifts_title, Arrays.copyOf(new Object[0], 0));
                hl1 hl1Var3 = sff0VarA2.b;
                iOrdinal = hl1Var3.h.ordinal();
                if (iOrdinal != 0) {
                    c01Var = c01.f3501a;
                } else if (iOrdinal != 1) {
                    c01Var = c01.b;
                } else if (iOrdinal != 2) {
                    c01Var = c01.c;
                } else if (iOrdinal != 3) {
                    c01Var = c01.d;
                } else {
                    if (iOrdinal == 4) {
                        t9f.b();
                        return null;
                    }
                    c01Var = c01.e;
                }
                return new q11(0L, d7vVar3, d7vVar2, null, z5, a7v.f393a, l7v.f19578a, iunVar3, iunVar3, iunVar3, lunVar3, false, zA3, false, f7v.f9076a, i4, false, strA2, null, c01Var, kgVarB3, hl1Var3.C, iunVar3, hl1Var3.l, xun.f41520a);
            case 2:
                BroadcastingVideoLandscapeParams broadcastingVideoLandscapeParams = (BroadcastingVideoLandscapeParams) obj6;
                return new z59(broadcastingVideoLandscapeParams.f46689a, broadcastingVideoLandscapeParams.b, broadcastingVideoLandscapeParams.c, broadcastingVideoLandscapeParams.d, broadcastingVideoLandscapeParams.e, false, false, false, ((lut) obj3).a(), null, ((hrx) obj2).a(), false, ((m1e) obj4).c(), false, true, "", ((pru) obj5).a().F1, "", g2v.b((g2v) obj, pb10.r1, pdm.c, ldm.b, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.BUSY_EVERYWHERE));
            case 3:
                r9u r9uVar = (r9u) obj;
                sff0 sff0VarA3 = ((pru) obj5).a();
                List listA = ((luu) obj4).f20692a.a();
                boolean zL = ((svu) obj3).l();
                boolean zJ = ((lbu) obj2).j();
                sip sipVar = sip.c;
                ygp ygpVar = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                return new ksk((DisciplineDetailsParams) obj6, sff0VarA3, null, null, listA, zL, zJ, sipVar, j1q0Var.f15748a.d(ygpVar));
            case 4:
                SportGameAdvancedScreenParams sportGameAdvancedScreenParams = (SportGameAdvancedScreenParams) obj5;
                vzg0 vzg0Var = (vzg0) obj6;
                lbu lbuVar = (lbu) obj4;
                wyu wyuVar = (wyu) obj3;
                r9u r9uVar2 = (r9u) obj2;
                String str2 = (String) obj;
                long jLongValue = sportGameAdvancedScreenParams.c;
                boolean z6 = sportGameAdvancedScreenParams.b;
                String strH = h97.h(jLongValue, "KEY_GAME_ID");
                String strH2 = h97.h(jLongValue, "KEY_GAME_TYPE");
                dja djaVar2 = (dja) vzg0Var.a("KEY_CURRENT_CARD_TYPE");
                if (djaVar2 == null) {
                    int iOrdinal3 = sportGameAdvancedScreenParams.d.ordinal();
                    if (iOrdinal3 == 0) {
                        djaVar = dja.BROADCASTING_VIDEO;
                    } else if (iOrdinal3 == 1) {
                        djaVar = dja.BROADCASTING_ZONE;
                    } else if (iOrdinal3 != 2) {
                        t9f.b();
                        return null;
                    }
                } else {
                    djaVar = djaVar2;
                }
                Long l = (Long) vzg0Var.a(strH);
                if (l != null) {
                    jLongValue = l.longValue();
                }
                long j = jLongValue;
                Boolean bool = (Boolean) vzg0Var.a("KEY_LIVE");
                boolean zBooleanValue = bool != null ? bool.booleanValue() : z6;
                Long l2 = (Long) vzg0Var.a("KEY_SUB_GAME_ID");
                long jLongValue2 = l2 != null ? l2.longValue() : sportGameAdvancedScreenParams.e;
                long j2 = sportGameAdvancedScreenParams.f46985a;
                boolean zJ2 = lbuVar.j();
                Long lValueOf = (Long) vzg0Var.a("KEY_CHAMP_ID");
                if (lValueOf == null) {
                    lValueOf = Long.valueOf(sportGameAdvancedScreenParams.f);
                }
                Long l3 = lValueOf;
                boolean z7 = !h97.A(wyuVar, uaq0.f35345a);
                Boolean bool2 = (Boolean) vzg0Var.a("KEY_SHOW_SUB_GAMES");
                boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
                iun iunVar4 = iun.f15405a;
                t3z t3zVarH = (t3z) vzg0Var.a(strH2);
                if (t3zVarH == null) {
                    t3z.f33292a.getClass();
                    t3zVarH = rqt.h(z6, false, false);
                }
                t3z t3zVar = t3zVarH;
                Boolean bool3 = (Boolean) vzg0Var.a("KEY_EXPANDED_CARD_SECTION");
                boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
                boolean z8 = djaVar == dja.BROADCASTING_VIDEO;
                boolean z9 = djaVar == dja.BROADCASTING_ZONE;
                Long l4 = (Long) vzg0Var.a("KEY_CATEGORY_ID");
                ygp ygpVar2 = ygp.t;
                r9uVar2.getClass();
                j1q0 j1q0Var2 = r9uVar2.f30104a;
                j1q0Var2.getClass();
                boolean zD = j1q0Var2.f15748a.d(ygpVar2);
                Boolean bool4 = (Boolean) vzg0Var.a("KEY_BET_BUILDER_MODE_ENABLED");
                return new qnr(j, "", null, zBooleanValue, j2, jLongValue2, l4, l3, t3zVar, str2, zJ2, "", "", "", false, false, false, false, false, false, false, false, null, false, false, z8, z9, false, false, false, false, z7, "", "", true, zBooleanValue2, false, false, null, null, null, djaVar, null, null, null, null, iunVar4, zBooleanValue3, zD, iunVar4, bool4 != null ? bool4.booleanValue() : false);
            case 5:
                vzg0 vzg0Var2 = (vzg0) obj4;
                UfcGameParams ufcGameParams = (UfcGameParams) obj3;
                e1u e1uVar = (e1u) obj2;
                pru pruVar = (pru) obj5;
                r9u r9uVar3 = (r9u) obj;
                boolean zJ3 = ((lbu) obj6).j();
                gps gpsVar = (gps) vzg0Var2.a("game_request_state_key");
                if (gpsVar == null) {
                    long j3 = ufcGameParams.f47170a;
                    bek bekVar = sip.f32274a;
                    boolean z10 = ufcGameParams.b;
                    bekVar.getClass();
                    zosVar = new zos(j3, bek.f(z10), 189L);
                } else {
                    zosVar = gpsVar;
                }
                lel0.Companion.getClass();
                ypl0 ypl0Var = new ypl0(0L, "", kel0.a());
                bqr bqrVar = new bqr(0L, 0L, "");
                iun iunVar5 = iun.f15405a;
                xus xusVar = new xus("", false, -1, new owq0(iunVar5, iunVar5, false), null);
                boolean z11 = !zJ3;
                Boolean bool5 = (Boolean) vzg0Var2.a("auto_start_stream_enabled_key");
                boolean zBooleanValue4 = bool5 != null ? bool5.booleanValue() : e1uVar.f();
                sff0 sff0VarA4 = pruVar.a();
                da10 da10Var = da10.DEFAULT_ERROR;
                c0o c0oVar = yrs.c;
                ArrayList arrayList = new ArrayList(r3d.q(c0oVar, 10));
                Iterator it = c0oVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(((yrs) it.next()).f43136a);
                }
                pcs[] pcsVarArr = pcs.c;
                upv[] upvVarArr = upv.c;
                ygp ygpVar3 = ygp.t;
                r9uVar3.getClass();
                j1q0 j1q0Var3 = r9uVar3.f30104a;
                j1q0Var3.getClass();
                return new wrs(ufcGameParams, zosVar, ilr.b, ypl0Var, bqrVar, xusVar, "", iunVar5, false, null, null, iunVar5, null, zJ3, z11, false, false, zBooleanValue4, sff0VarA4, da10Var, iunVar5, arrayList, false, 1L, 1L, j1q0Var3.f15748a.d(ygpVar3));
            case 6:
                b8t b8tVar = (b8t) obj5;
                kie0 kie0Var = (kie0) obj6;
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                GamesManiaMapView gamesManiaMapView = (GamesManiaMapView) obj2;
                String str3 = (String) obj;
                iiy[] iiyVarArr = b8t.Q1;
                try {
                    e0g0 e0g0Var = j0g0.b;
                    g0g0Var = Boolean.valueOf(new Handler(Looper.getMainLooper()).post(new nbn(kie0Var, arrayList2, arrayList3, gamesManiaMapView, str3, b8tVar, (byte) 1)));
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                Throwable thA = j0g0.a(g0g0Var);
                if (thA != null) {
                    thA.printStackTrace();
                }
                return Unit.f46060a;
            case 7:
                r9u r9uVar4 = (r9u) obj;
                List listA2 = ((luu) obj6).f20692a.a();
                boolean zJ4 = ((lbu) obj4).j();
                sff0 sff0VarA5 = ((pru) obj5).a();
                boolean zL2 = ((svu) obj3).l();
                Locale localeA = ((wiu) obj2).a();
                ygp ygpVar4 = ygp.t;
                r9uVar4.getClass();
                j1q0 j1q0Var4 = r9uVar4.f30104a;
                j1q0Var4.getClass();
                return new yjw(listA2, zJ4, sff0VarA5, zL2, localeA, j1q0Var4.f15748a.d(ygpVar4), false, null);
            case 8:
                azg0 azg0Var = (azg0) obj5;
                u0h0 u0h0Var = (u0h0) obj6;
                fzg0 fzg0Var = (fzg0) obj4;
                String str4 = (String) obj;
                Object[] objArr = (Object[]) obj2;
                if (azg0Var.b != fzg0Var) {
                    azg0Var.b = fzg0Var;
                    z = true;
                }
                if (Intrinsics.d(azg0Var.c, str4)) {
                    z2 = z;
                } else {
                    azg0Var.c = str4;
                }
                azg0Var.f1716a = u0h0Var;
                azg0Var.d = obj3;
                azg0Var.e = objArr;
                ezg0 ezg0Var = azg0Var.f;
                if (ezg0Var != null && z2) {
                    ((nvu) ezg0Var).W();
                    azg0Var.f = null;
                    azg0Var.a();
                }
                return Unit.f46060a;
            case 9:
                return Boolean.valueOf(((hln0) obj5).a((gln0) obj6, (ArrayList) obj4, (LinkedHashMap) obj3, (List) obj2, (ArrayList) obj));
            case 10:
                pz40 pz40Var = (pz40) obj6;
                vne vneVar = (vne) obj4;
                t33 t33Var = (t33) obj3;
                o6s0 o6s0Var = (o6s0) obj2;
                sjj sjjVar = (sjj) obj;
                j6u0 j6u0Var = (j6u0) ((mie0) obj5).f21842a;
                j6u0Var.getClass();
                long jA = j6u0Var.a(wpm0.g(Float.MAX_VALUE, Float.MAX_VALUE));
                if (Math.abs(g6u0.b(jA)) < 120.0f && Math.abs(g6u0.c(jA)) < 120.0f) {
                    return Unit.f46060a;
                }
                pz40Var.setValue(qjj.W(vneVar, null, null, new ze1(t33Var, o6s0Var, ne60.g(1.1f, (((long) Float.floatToRawIntBits(-g6u0.c(jA))) & 4294967295L) | (((long) Float.floatToRawIntBits(-g6u0.b(jA))) << 32)), sjjVar, (yje) null), 3));
                return Unit.f46060a;
            default:
                VirtualGameCategoryParams virtualGameCategoryParams = (VirtualGameCategoryParams) obj6;
                r9u r9uVar5 = (r9u) obj;
                sff0 sff0VarA6 = ((pru) obj5).a();
                List listA3 = ((luu) obj4).f20692a.a();
                boolean zL3 = ((svu) obj3).l();
                boolean zJ5 = ((lbu) obj2).j();
                ygp ygpVar5 = ygp.t;
                r9uVar5.getClass();
                j1q0 j1q0Var5 = r9uVar5.f30104a;
                j1q0Var5.getClass();
                return new upu0(virtualGameCategoryParams, sff0VarA6, null, listA3, zL3, zJ5, j1q0Var5.f15748a.d(ygpVar5));
        }
    }

    public /* synthetic */ co0(luu luuVar, lbu lbuVar, pru pruVar, svu svuVar, wiu wiuVar, r9u r9uVar) {
        this.f4678a = (byte) 7;
        this.e = luuVar;
        this.f = lbuVar;
        this.b = pruVar;
        this.c = svuVar;
        this.d = wiuVar;
        this.g = r9uVar;
    }

    public /* synthetic */ co0(pru pruVar, x860 x860Var, iqt iqtVar, dmt dmtVar, bzt bztVar, ctf0 ctf0Var) {
        this.f4678a = (byte) 1;
        this.b = pruVar;
        this.f = x860Var;
        this.c = iqtVar;
        this.d = dmtVar;
        this.e = bztVar;
        this.g = ctf0Var;
    }

    public /* synthetic */ co0(Parcelable parcelable, pru pruVar, luu luuVar, svu svuVar, lbu lbuVar, r9u r9uVar, byte b) {
        this.f4678a = b;
        this.e = parcelable;
        this.b = pruVar;
        this.f = luuVar;
        this.c = svuVar;
        this.d = lbuVar;
        this.g = r9uVar;
    }

    public /* synthetic */ co0(Object obj, Object obj2, Object obj3, Object obj4, pru pruVar, Object obj5, byte b) {
        this.f4678a = b;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
        this.d = obj4;
        this.b = pruVar;
        this.g = obj5;
    }

    public /* synthetic */ co0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.f4678a = b;
        this.b = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = obj4;
        this.d = obj5;
        this.g = obj6;
    }
}
