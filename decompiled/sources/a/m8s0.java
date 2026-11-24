package a;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ufc.api.weight_class_rating.UfcWeightClassRatingParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m8s0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21384a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m8s0(pz40 pz40Var, d930 d930Var, jpu0 jpu0Var) {
        this.f21384a = (byte) 9;
        this.b = pz40Var;
        this.d = d930Var;
        this.c = jpu0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        byte b = this.f21384a;
        int i = 17;
        byte b2 = 9;
        byte b3 = 5;
        int i2 = 4;
        int i3 = 3;
        int i4 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                d930 d930Var = (d930) obj2;
                cp cpVar = (cp) obj;
                cpVar.getClass();
                bg5 bg5Var = new bg5(bg5.g);
                bg5Var.d.b(new gbn(new efr0((byte) 17), new d8q0(3, (byte) 13), new lcr0((t9f) obj4, b2), pfo0.v));
                js10 js10Var = (js10) cpVar.u;
                js10Var.b.setAdapter(bg5Var);
                RecyclerView recyclerView = js10Var.b;
                Context context = cpVar.w;
                recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
                RecyclerView recyclerView2 = js10Var.b;
                recyclerView2.setRecycledViewPool((nhe0) obj3);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
                recyclerView2.m(new qmk0(context.getResources().getDimensionPixelOffset(R.dimen.space_10), dimensionPixelSize, 0, dimensionPixelSize, 0, 0, null, null, 468));
                cpVar.t(new b8q0((Object) bg5Var, (Object) cpVar, (byte) 28));
                cpVar.x(new e5t((byte) 4, cpVar, d930Var));
                cpVar.y(new e5t(b3, cpVar, d930Var));
                return Unit.f46060a;
            case 1:
                ((vzg0) obj).getClass();
                a5w a5wVarA = ((ryu) obj4).a((String) obj3);
                List listA = ((luu) obj2).f20692a.a();
                iun iunVar = iun.f15405a;
                return new ifs0(false, jgs0.f16495a, a5wVarA, null, false, listA, iunVar, iunVar, iunVar);
            case 2:
                hcz hczVar = (hcz) obj;
                s9m0 s9m0Var = uks0.l2;
                hczVar.getClass();
                a4x a4xVar = ((yhs0) obj4).f42654a;
                hczVar.f(a4xVar.size(), null, new vdr0(a4xVar, (byte) 11), new ugd(2039820996, true, new p6p0(a4xVar, (Function0) obj3, (Function1) obj2, (byte) 1)));
                return Unit.f46060a;
            case 3:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.b(new a1w0(new hot0((daf) obj4, (i1w0) obj3, (zuc0) obj2, (byte) 1))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 4:
                pm80 pm80Var = (pm80) obj4;
                pm80 pm80Var2 = (pm80) obj3;
                pm80 pm80Var3 = (pm80) obj2;
                lz3 lz3Var = (lz3) obj;
                if (lz3Var instanceof jz3) {
                    return pm80Var != null ? new jz3(pm80Var) : (jz3) lz3Var;
                }
                if (!(lz3Var instanceof iz3)) {
                    return lz3Var;
                }
                iz3 iz3Var = (iz3) lz3Var;
                r1o r1oVar = iz3Var.b;
                if (r1oVar.c instanceof j860) {
                    return pm80Var2 != null ? new iz3(pm80Var2, r1oVar) : iz3Var;
                }
                return pm80Var3 != null ? new iz3(pm80Var3, r1oVar) : iz3Var;
            case 5:
                Function1 function1 = (Function1) obj4;
                Function1 function2 = (Function1) obj3;
                Function1 function3 = (Function1) obj2;
                lz3 lz3Var2 = (lz3) obj;
                if (lz3Var2 instanceof jz3) {
                    if (function1 != null) {
                        function1.invoke(lz3Var2);
                    }
                } else if (lz3Var2 instanceof kz3) {
                    if (function2 != null) {
                        function2.invoke(lz3Var2);
                    }
                } else if (lz3Var2 instanceof iz3) {
                    if (function3 != null) {
                        function3.invoke(lz3Var2);
                    }
                } else if (!(lz3Var2 instanceof hz3)) {
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
            case 6:
                f2u0 f2u0Var = (f2u0) obj3;
                FragmentScreen fragmentScreen = (FragmentScreen) obj2;
                k0w0 k0w0Var2 = (k0w0) obj;
                rzj0 rzj0Var = ((szj0) obj4).e;
                if (rzj0Var.equals(pzj0.f27849a)) {
                    i3t0.A(f2u0Var, f2u0Var.R, new vpr(false), null, null, 6);
                    k0w0Var2.c(fragmentScreen);
                } else {
                    if (!rzj0Var.equals(qzj0.f29581a)) {
                        t9f.b();
                        return null;
                    }
                    i3t0.A(f2u0Var, f2u0Var.R, new vpr(true), null, null, 6);
                    k0w0Var2.h(fragmentScreen);
                }
                return Unit.f46060a;
            case 7:
                ExoPlayer exoPlayer = (ExoPlayer) obj4;
                lwk lwkVar = (lwk) obj;
                lwkVar.getClass();
                jeu0 jeu0Var = new jeu0((Function0) obj3, (pz40) obj2);
                ((ulo) exoPlayer).m.a(jeu0Var);
                return new pr0(exoPlayer, jeu0Var, lwkVar);
            case 8:
                mk50 mk50Var = (mk50) obj4;
                vju0 vju0Var = (vju0) obj3;
                ss8 ss8Var = (ss8) obj2;
                bem bemVar = (bem) obj;
                bemVar.getClass();
                if (bemVar instanceof wdm) {
                    if (mk50Var.m == cys0.b) {
                        vju0Var.x.invoke(mk50Var, ss8Var.d);
                    } else {
                        vju0Var.y.invoke(mk50Var);
                    }
                }
                return Unit.f46060a;
            case 9:
                ((lwk) obj).getClass();
                return new u43((pz40) obj4, (d930) obj2, (jpu0) obj3, (byte) 10);
            case 10:
                z7v0 z7v0Var = (z7v0) obj;
                z7v0Var.getClass();
                return new s7p0((UfcWeightClassRatingParams) obj4, z7v0Var, (g2v) obj3, (ctf0) obj2);
            case 11:
                List list = (List) obj3;
                upv0 upv0Var = (upv0) obj2;
                qpg0 qpg0Var = (qpg0) obj;
                qpg0Var.getClass();
                xpg0 xpg0VarZ0 = qpg0Var.Z0((String) obj4);
                try {
                    Iterator it = list.iterator();
                    int i5 = 1;
                    while (it.hasNext()) {
                        xpg0VarZ0.z(i5, (String) it.next());
                        i5++;
                    }
                    gx3 gx3Var = new gx3(0);
                    gx3 gx3Var2 = new gx3(0);
                    while (xpg0VarZ0.W0()) {
                        String strJ0 = xpg0VarZ0.J0(0);
                        if (!gx3Var.containsKey(strJ0)) {
                            gx3Var.put(strJ0, new ArrayList());
                        }
                        String strJ1 = xpg0VarZ0.J0(0);
                        if (!gx3Var2.containsKey(strJ1)) {
                            gx3Var2.put(strJ1, new ArrayList());
                        }
                    }
                    xpg0VarZ0.reset();
                    upv0Var.b(qpg0Var, gx3Var);
                    upv0Var.a(qpg0Var, gx3Var2);
                    ArrayList arrayList = new ArrayList();
                    while (xpg0VarZ0.W0()) {
                        String strJ2 = xpg0VarZ0.J0(0);
                        zov0 zov0VarV = dqm0.v((int) xpg0VarZ0.getLong(i4));
                        byte[] blob = xpg0VarZ0.getBlob(2);
                        maj majVar = maj.b;
                        maj majVarB = nkb.B(blob);
                        int i6 = (int) xpg0VarZ0.getLong(i3);
                        int i7 = (int) xpg0VarZ0.getLong(i2);
                        long j = xpg0VarZ0.getLong(14);
                        long j2 = xpg0VarZ0.getLong(15);
                        long j3 = xpg0VarZ0.getLong(16);
                        af5 af5VarS = dqm0.s((int) xpg0VarZ0.getLong(i));
                        long j4 = xpg0VarZ0.getLong(18);
                        long j5 = xpg0VarZ0.getLong(19);
                        int i8 = (int) xpg0VarZ0.getLong(20);
                        long j6 = xpg0VarZ0.getLong(21);
                        int i9 = (int) xpg0VarZ0.getLong(22);
                        String strJ3 = xpg0VarZ0.J0(23);
                        o4e o4eVar = new o4e(dqm0.A(xpg0VarZ0.getBlob(6)), dqm0.t((int) xpg0VarZ0.getLong(5)), ((int) xpg0VarZ0.getLong(7)) != 0, ((int) xpg0VarZ0.getLong(8)) != 0, ((int) xpg0VarZ0.getLong(9)) != 0, ((int) xpg0VarZ0.getLong(10)) != 0, xpg0VarZ0.getLong(11), xpg0VarZ0.getLong(12), dqm0.n(xpg0VarZ0.getBlob(13)));
                        Object objD = xp20.d(gx3Var, xpg0VarZ0.J0(0));
                        objD.getClass();
                        List list2 = (List) objD;
                        Object objD2 = xp20.d(gx3Var2, xpg0VarZ0.J0(0));
                        objD2.getClass();
                        arrayList.add(new opv0(strJ2, zov0VarV, majVarB, j, j2, j3, o4eVar, i6, af5VarS, j4, j5, i8, i7, j6, i9, list2, strJ3, (List) objD2));
                        i = 17;
                        i2 = 4;
                        i3 = 3;
                        i4 = 1;
                        break;
                    }
                    return arrayList;
                } finally {
                    xpg0VarZ0.close();
                }
            case 12:
                w6k w6kVar = (w6k) obj2;
                bff0 bff0Var = (bff0) obj;
                bff0Var.getClass();
                mkx mkxVarB = bff0Var.b();
                int i10 = mkxVarB.b;
                int iA = mkxVarB.a();
                int i11 = i10 + iA;
                ((fuj0) obj4).j((tsv0) obj3, new nsv0(iA, i10, i11, w6kVar.r0(iA), w6kVar.r0(i10), w6kVar.r0(i11)));
                return Unit.f46060a;
            case 13:
                lsv0 lsv0Var = (lsv0) obj4;
                ywv0 ywv0Var = (ywv0) obj3;
                Function0 function0 = (Function0) obj2;
                if (!(lsv0Var instanceof isv0)) {
                    function0.invoke();
                } else if (((isv0) lsv0Var).f15325a && !ywv0Var.f.b()) {
                    function0.invoke();
                }
                return Unit.f46060a;
            default:
                ((bzv0) obj).getClass();
                return new fgh0((ctf0) obj4, ((bzt) obj3).f3488a.a().r, ((pru) obj2).a().d.f27973a.d);
        }
    }

    public /* synthetic */ m8s0(Object obj, Object obj2, Object obj3, byte b) {
        this.f21384a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
