package a;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.xplatform.cyber.game.rainbow.api.RainbowGameScreenParams;
import org.xplatform.cyber.game.valorant.api.ValorantGameScreenParams;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsParams;
import org.xplatform.results.impl.presentation.alt_history.GamesHistoryResultsParams;
import org.xplatform.special_event.impl.alleventsgames.presentation.AllEventGamesScreenParams;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pg1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26932a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ pg1(wyu wyuVar, zlt0 zlt0Var, reu reuVar, ctf0 ctf0Var, pru pruVar, j9c j9cVar, lk5 lk5Var) {
        this.f26932a = (byte) 11;
        this.e = wyuVar;
        this.c = zlt0Var;
        this.f = reuVar;
        this.d = ctf0Var;
        this.b = pruVar;
        this.g = j9cVar;
        this.h = lk5Var;
    }

    private final Object a() {
        gps zosVar;
        lbu lbuVar = (lbu) this.e;
        pru pruVar = (pru) this.b;
        luu luuVar = (luu) this.c;
        vzg0 vzg0Var = (vzg0) this.f;
        e1u e1uVar = (e1u) this.d;
        RainbowGameScreenParams rainbowGameScreenParams = (RainbowGameScreenParams) this.g;
        r9u r9uVar = (r9u) this.h;
        boolean zJ = lbuVar.j();
        sff0 sff0VarA = pruVar.a();
        List listA = luuVar.f20692a.a();
        Boolean bool = (Boolean) vzg0Var.a("auto_start_stream_enabled_key");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : e1uVar.f();
        gps gpsVar = (gps) vzg0Var.a("game_request_state_key");
        if (gpsVar == null) {
            long j = rainbowGameScreenParams.f46520a;
            bek bekVar = sip.f32274a;
            boolean z = rainbowGameScreenParams.b;
            bekVar.getClass();
            zosVar = new zos(j, bek.f(z), rainbowGameScreenParams.e);
        } else {
            zosVar = gpsVar;
        }
        lel0.Companion.getClass();
        ypl0 ypl0Var = new ypl0(0L, "", kel0.a());
        bqr bqrVar = new bqr(0L, 0L, "");
        iun iunVar = iun.f15405a;
        xus xusVar = new xus("", false, -1, new owq0(iunVar, iunVar, false), null);
        o4i0 o4i0Var = new o4i0("", "");
        u0e0[] u0e0VarArr = u0e0.f34850a;
        ixd0 ixd0Var = new ixd0(1L, 6L, 7L, o4i0Var, true);
        rud0 rud0Var = new rud0(0);
        da10 da10Var = da10.DEFAULT_ERROR;
        c0o c0oVar = ryd0.c;
        ArrayList arrayList = new ArrayList(r3d.q(c0oVar, 10));
        Iterator it = c0oVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((ryd0) it.next()).f31310a);
        }
        iun iunVar2 = iun.f15405a;
        long j2 = rainbowGameScreenParams.h;
        String str = rainbowGameScreenParams.g;
        boolean z2 = rainbowGameScreenParams.f;
        ygp ygpVar = ygp.t;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        return new qyd0(rainbowGameScreenParams, zosVar, ilr.b, null, ypl0Var, bqrVar, xusVar, zJ, false, ixd0Var, rud0Var, da10Var, iunVar, arrayList, !zJ, false, iunVar2, j2, str, sff0VarA, listA, false, z2, zBooleanValue, null, null, j1q0Var.f15748a.d(ygpVar));
    }

    private final Object b() {
        gps zosVar;
        lbu lbuVar = (lbu) this.e;
        pru pruVar = (pru) this.b;
        luu luuVar = (luu) this.c;
        vzg0 vzg0Var = (vzg0) this.f;
        e1u e1uVar = (e1u) this.d;
        ValorantGameScreenParams valorantGameScreenParams = (ValorantGameScreenParams) this.g;
        r9u r9uVar = (r9u) this.h;
        boolean zJ = lbuVar.j();
        sff0 sff0VarA = pruVar.a();
        List listA = luuVar.f20692a.a();
        Boolean bool = (Boolean) vzg0Var.a("auto_start_stream_enabled_key");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : e1uVar.f();
        gps gpsVar = (gps) vzg0Var.a("game_request_state_key");
        if (gpsVar == null) {
            long j = valorantGameScreenParams.f46542a;
            bek bekVar = sip.f32274a;
            boolean z = valorantGameScreenParams.d;
            bekVar.getClass();
            zosVar = new zos(j, bek.f(z), valorantGameScreenParams.e);
        } else {
            zosVar = gpsVar;
        }
        lel0.Companion.getClass();
        ypl0 ypl0Var = new ypl0(0L, "", kel0.a());
        bqr bqrVar = new bqr(0L, 0L, "");
        iun iunVar = iun.f15405a;
        xus xusVar = new xus("", false, -1, new owq0(iunVar, iunVar, false), null);
        vzt0 vzt0Var = new vzt0(new o4i0("", ""), 0L, 0L, true);
        nxt0 nxt0Var = new nxt0(0);
        da10 da10Var = da10.DEFAULT_ERROR;
        c0o c0oVar = c0u0.c;
        ArrayList arrayList = new ArrayList(r3d.q(c0oVar, 10));
        Iterator it = c0oVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((c0u0) it.next()).f3541a);
        }
        iun iunVar2 = iun.f15405a;
        boolean z2 = valorantGameScreenParams.f;
        ygp ygpVar = ygp.t;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        return new b0u0(valorantGameScreenParams, zosVar, ilr.b, null, ypl0Var, bqrVar, xusVar, zJ, false, vzt0Var, nxt0Var, da10Var, iunVar, arrayList, !zJ, false, iunVar2, sff0VarA, listA, false, z2, zBooleanValue, null, null, j1q0Var.f15748a.d(ygpVar));
    }

    /* JADX WARN: Code duplicated, block: B:130:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:131:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:133:0x05db  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v57 java.lang.Object, still in use, count: 2, list:
          (r3v57 java.lang.Object) from 0x05ae: PHI (r3 I:??) = (r3v50 java.lang.Object), (r3v57 java.lang.Object) binds: [B:122:0x05ac, B:319:0x05ae] A[DONT_GENERATE, DONT_INLINE]
          (r3v57 java.lang.Object) from 0x059f: CHECK_CAST (a.ekw) (r3v57 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instruction units count: 3494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pg1.invoke():java.lang.Object");
    }

    public /* synthetic */ pg1(lbu lbuVar, pru pruVar, luu luuVar, vzg0 vzg0Var, e1u e1uVar, Parcelable parcelable, r9u r9uVar, byte b) {
        this.f26932a = b;
        this.e = lbuVar;
        this.b = pruVar;
        this.c = luuVar;
        this.f = vzg0Var;
        this.d = e1uVar;
        this.g = parcelable;
        this.h = r9uVar;
    }

    public /* synthetic */ pg1(pru pruVar, bzt bztVar, vzg0 vzg0Var, hru hruVar, GamesHistoryResultsParams gamesHistoryResultsParams, r9u r9uVar, qrc qrcVar) {
        this.f26932a = (byte) 4;
        this.b = pruVar;
        this.d = bztVar;
        this.e = vzg0Var;
        this.c = hruVar;
        this.f = gamesHistoryResultsParams;
        this.g = r9uVar;
        this.h = qrcVar;
    }

    public /* synthetic */ pg1(pru pruVar, vzg0 vzg0Var, ctf0 ctf0Var, iqt iqtVar, String str, String str2, bzt bztVar) {
        this.f26932a = (byte) 1;
        this.b = pruVar;
        this.e = vzg0Var;
        this.f = ctf0Var;
        this.c = iqtVar;
        this.g = str;
        this.h = str2;
        this.d = bztVar;
    }

    public /* synthetic */ pg1(uc0 uc0Var, ctf0 ctf0Var, pru pruVar, vzg0 vzg0Var, iqt iqtVar, bzt bztVar, dmt dmtVar) {
        this.f26932a = (byte) 5;
        this.e = uc0Var;
        this.f = ctf0Var;
        this.b = pruVar;
        this.h = vzg0Var;
        this.c = iqtVar;
        this.d = bztVar;
        this.g = dmtVar;
    }

    public /* synthetic */ pg1(vzg0 vzg0Var, AllEventGamesScreenParams allEventGamesScreenParams, bzt bztVar, kuu kuuVar, pru pruVar, lbu lbuVar, r9u r9uVar) {
        this.f26932a = (byte) 2;
        this.e = vzg0Var;
        this.c = allEventGamesScreenParams;
        this.d = bztVar;
        this.f = kuuVar;
        this.b = pruVar;
        this.g = lbuVar;
        this.h = r9uVar;
    }

    public /* synthetic */ pg1(Parcelable parcelable, luu luuVar, lbu lbuVar, pru pruVar, svu svuVar, wiu wiuVar, r9u r9uVar, byte b) {
        this.f26932a = b;
        this.e = parcelable;
        this.c = luuVar;
        this.d = lbuVar;
        this.b = pruVar;
        this.g = svuVar;
        this.f = wiuVar;
        this.h = r9uVar;
    }

    public /* synthetic */ pg1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        this.f26932a = b;
        this.b = obj;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
        this.d = obj5;
        this.g = obj6;
        this.h = obj7;
    }

    public /* synthetic */ pg1(TeamDetailsParams teamDetailsParams, svu svuVar, pru pruVar, bzt bztVar, lbu lbuVar, luu luuVar, r9u r9uVar) {
        this.f26932a = (byte) 14;
        this.e = teamDetailsParams;
        this.c = svuVar;
        this.b = pruVar;
        this.d = bztVar;
        this.f = lbuVar;
        this.g = luuVar;
        this.h = r9uVar;
    }
}
