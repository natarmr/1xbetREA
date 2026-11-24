package a;

import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsParams;

/* JADX INFO: loaded from: classes4.dex */
public final class bsf implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3127a;
    public final mbp0 b;
    public final ctf0 c;
    public final g2v d;
    public final y78 e;
    public final Locale f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;
    public final n0o0 j;
    public final n0o0 k;
    public final n0o0 l;
    public final n0o0 m;
    public final n0o0 n;
    public final n0o0 o;
    public final n0o0 p;

    public bsf(mbp0 mbp0Var, ctf0 ctf0Var, g2v g2vVar, y78 y78Var, Locale locale, byte b) {
        this.f3127a = b;
        final byte b2 = 4;
        final byte b3 = 3;
        final byte b4 = 2;
        final byte b5 = 1;
        final byte b6 = 7;
        final byte b7 = 6;
        final byte b8 = 5;
        final byte b9 = 0;
        byte b10 = 20;
        ctf0Var.getClass();
        switch (b) {
            case 1:
                this.b = mbp0Var;
                this.c = ctf0Var;
                this.d = g2vVar;
                this.e = y78Var;
                this.f = locale;
                this.g = maz.b(new yw9(mbp0Var, new w800((byte) 27), b10));
                this.h = maz.b(new yw9(mbp0Var, new w800((byte) 28), b10));
                this.i = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.y510
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b11 = b9;
                        List list = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new rx00(bsfVar, (byte) 2));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.b(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.b(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list == null) {
                                    list = iun.f15405a;
                                }
                                return ghm0.o(list, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                obp0 obp0Var = (obp0) obj;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    listH = fem0.h((List) obj3, 2L, bsfVar.c, true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var = (o9p0) obj;
                                List list2 = o9p0Var != null ? o9p0Var.j : null;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list2);
                            case 6:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                o9p0 o9p0Var2 = mbp0Var6.c;
                                List listM = o9p0Var2 != null ? ycm0.m(o9p0Var2, mbp0Var6.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var3 = (o9p0) obj;
                                ctf0 ctf0Var2 = bsfVar.c;
                                List list3 = o9p0Var3 != null ? o9p0Var3.i : null;
                                if (list3 == null) {
                                    list3 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var2, list3);
                        }
                    }
                }, b10));
                this.j = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.y510
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b11 = b5;
                        List list = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new rx00(bsfVar, (byte) 2));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.b(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.b(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list == null) {
                                    list = iun.f15405a;
                                }
                                return ghm0.o(list, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                obp0 obp0Var = (obp0) obj;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    listH = fem0.h((List) obj3, 2L, bsfVar.c, true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var = (o9p0) obj;
                                List list2 = o9p0Var != null ? o9p0Var.j : null;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list2);
                            case 6:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                o9p0 o9p0Var2 = mbp0Var6.c;
                                List listM = o9p0Var2 != null ? ycm0.m(o9p0Var2, mbp0Var6.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var3 = (o9p0) obj;
                                ctf0 ctf0Var2 = bsfVar.c;
                                List list3 = o9p0Var3 != null ? o9p0Var3.i : null;
                                if (list3 == null) {
                                    list3 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var2, list3);
                        }
                    }
                }, b10));
                this.k = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.y510
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b11 = b4;
                        List list = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new rx00(bsfVar, (byte) 2));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.b(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.b(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list == null) {
                                    list = iun.f15405a;
                                }
                                return ghm0.o(list, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                obp0 obp0Var = (obp0) obj;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    listH = fem0.h((List) obj3, 2L, bsfVar.c, true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var = (o9p0) obj;
                                List list2 = o9p0Var != null ? o9p0Var.j : null;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list2);
                            case 6:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                o9p0 o9p0Var2 = mbp0Var6.c;
                                List listM = o9p0Var2 != null ? ycm0.m(o9p0Var2, mbp0Var6.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var3 = (o9p0) obj;
                                ctf0 ctf0Var2 = bsfVar.c;
                                List list3 = o9p0Var3 != null ? o9p0Var3.i : null;
                                if (list3 == null) {
                                    list3 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var2, list3);
                        }
                    }
                }, b10));
                this.l = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.y510
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b11 = b3;
                        List list = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new rx00(bsfVar, (byte) 2));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.b(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.b(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list == null) {
                                    list = iun.f15405a;
                                }
                                return ghm0.o(list, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                obp0 obp0Var = (obp0) obj;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    listH = fem0.h((List) obj3, 2L, bsfVar.c, true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var = (o9p0) obj;
                                List list2 = o9p0Var != null ? o9p0Var.j : null;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list2);
                            case 6:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                o9p0 o9p0Var2 = mbp0Var6.c;
                                List listM = o9p0Var2 != null ? ycm0.m(o9p0Var2, mbp0Var6.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var3 = (o9p0) obj;
                                ctf0 ctf0Var2 = bsfVar.c;
                                List list3 = o9p0Var3 != null ? o9p0Var3.i : null;
                                if (list3 == null) {
                                    list3 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var2, list3);
                        }
                    }
                }, b10));
                this.m = maz.b(new yw9(mbp0Var.l, new Function1(this) { // from class: a.y510
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b11 = b2;
                        List list = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new rx00(bsfVar, (byte) 2));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.b(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.b(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list == null) {
                                    list = iun.f15405a;
                                }
                                return ghm0.o(list, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                obp0 obp0Var = (obp0) obj;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    listH = fem0.h((List) obj3, 2L, bsfVar.c, true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var = (o9p0) obj;
                                List list2 = o9p0Var != null ? o9p0Var.j : null;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list2);
                            case 6:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                o9p0 o9p0Var2 = mbp0Var6.c;
                                List listM = o9p0Var2 != null ? ycm0.m(o9p0Var2, mbp0Var6.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var3 = (o9p0) obj;
                                ctf0 ctf0Var2 = bsfVar.c;
                                List list3 = o9p0Var3 != null ? o9p0Var3.i : null;
                                if (list3 == null) {
                                    list3 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var2, list3);
                        }
                    }
                }, b10));
                o9p0 o9p0Var = mbp0Var.c;
                this.n = maz.b(new yw9(o9p0Var, new Function1(this) { // from class: a.y510
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b11 = b8;
                        List list = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new rx00(bsfVar, (byte) 2));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.b(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.b(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list == null) {
                                    list = iun.f15405a;
                                }
                                return ghm0.o(list, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                obp0 obp0Var = (obp0) obj;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    listH = fem0.h((List) obj3, 2L, bsfVar.c, true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var2 = (o9p0) obj;
                                List list2 = o9p0Var2 != null ? o9p0Var2.j : null;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list2);
                            case 6:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                o9p0 o9p0Var3 = mbp0Var6.c;
                                List listM = o9p0Var3 != null ? ycm0.m(o9p0Var3, mbp0Var6.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var4 = (o9p0) obj;
                                ctf0 ctf0Var2 = bsfVar.c;
                                List list3 = o9p0Var4 != null ? o9p0Var4.i : null;
                                if (list3 == null) {
                                    list3 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var2, list3);
                        }
                    }
                }, b10));
                this.o = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.y510
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b11 = b7;
                        List list = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new rx00(bsfVar, (byte) 2));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.b(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.b(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list == null) {
                                    list = iun.f15405a;
                                }
                                return ghm0.o(list, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                obp0 obp0Var = (obp0) obj;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    listH = fem0.h((List) obj3, 2L, bsfVar.c, true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var2 = (o9p0) obj;
                                List list2 = o9p0Var2 != null ? o9p0Var2.j : null;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list2);
                            case 6:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                o9p0 o9p0Var3 = mbp0Var6.c;
                                List listM = o9p0Var3 != null ? ycm0.m(o9p0Var3, mbp0Var6.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var4 = (o9p0) obj;
                                ctf0 ctf0Var2 = bsfVar.c;
                                List list3 = o9p0Var4 != null ? o9p0Var4.i : null;
                                if (list3 == null) {
                                    list3 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var2, list3);
                        }
                    }
                }, b10));
                this.p = maz.b(new yw9(o9p0Var, new Function1(this) { // from class: a.y510
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b11 = b6;
                        List list = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new rx00(bsfVar, (byte) 2));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.b(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.b(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list == null) {
                                    list = iun.f15405a;
                                }
                                return ghm0.o(list, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                obp0 obp0Var = (obp0) obj;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    listH = fem0.h((List) obj3, 2L, bsfVar.c, true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var2 = (o9p0) obj;
                                List list2 = o9p0Var2 != null ? o9p0Var2.j : null;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list2);
                            case 6:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                o9p0 o9p0Var3 = mbp0Var6.c;
                                List listM = o9p0Var3 != null ? ycm0.m(o9p0Var3, mbp0Var6.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var4 = (o9p0) obj;
                                ctf0 ctf0Var2 = bsfVar.c;
                                List list3 = o9p0Var4 != null ? o9p0Var4.i : null;
                                if (list3 == null) {
                                    list3 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var2, list3);
                        }
                    }
                }, b10));
                break;
            case 2:
                this.b = mbp0Var;
                this.c = ctf0Var;
                this.d = g2vVar;
                this.e = y78Var;
                this.f = locale;
                this.g = maz.b(new yw9(mbp0Var, new bod0(b6), b10));
                this.h = maz.b(new yw9(mbp0Var, new bod0((byte) 8), b10));
                this.i = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.w0e0
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b11 = b9;
                        List list = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new p7d0(bsfVar, (byte) 12));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.c(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.c(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list == null) {
                                    list = iun.f15405a;
                                }
                                return ghm0.o(list, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                obp0 obp0Var = (obp0) obj;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    listH = fem0.h((List) obj3, 15L, bsfVar.c, true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var2 = (o9p0) obj;
                                List list2 = o9p0Var2 != null ? o9p0Var2.j : null;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list2);
                            case 6:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                o9p0 o9p0Var3 = mbp0Var6.c;
                                List listM = o9p0Var3 != null ? ycm0.m(o9p0Var3, mbp0Var6.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var4 = (o9p0) obj;
                                ctf0 ctf0Var2 = bsfVar.c;
                                List list3 = o9p0Var4 != null ? o9p0Var4.i : null;
                                if (list3 == null) {
                                    list3 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var2, list3);
                        }
                    }
                }, b10));
                this.j = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.w0e0
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b11 = b5;
                        List list = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new p7d0(bsfVar, (byte) 12));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.c(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.c(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list == null) {
                                    list = iun.f15405a;
                                }
                                return ghm0.o(list, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                obp0 obp0Var = (obp0) obj;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    listH = fem0.h((List) obj3, 15L, bsfVar.c, true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var2 = (o9p0) obj;
                                List list2 = o9p0Var2 != null ? o9p0Var2.j : null;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list2);
                            case 6:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                o9p0 o9p0Var3 = mbp0Var6.c;
                                List listM = o9p0Var3 != null ? ycm0.m(o9p0Var3, mbp0Var6.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var4 = (o9p0) obj;
                                ctf0 ctf0Var2 = bsfVar.c;
                                List list3 = o9p0Var4 != null ? o9p0Var4.i : null;
                                if (list3 == null) {
                                    list3 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var2, list3);
                        }
                    }
                }, b10));
                this.k = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.w0e0
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b11 = b4;
                        List list = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new p7d0(bsfVar, (byte) 12));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.c(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.c(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list == null) {
                                    list = iun.f15405a;
                                }
                                return ghm0.o(list, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                obp0 obp0Var = (obp0) obj;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    listH = fem0.h((List) obj3, 15L, bsfVar.c, true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var2 = (o9p0) obj;
                                List list2 = o9p0Var2 != null ? o9p0Var2.j : null;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list2);
                            case 6:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                o9p0 o9p0Var3 = mbp0Var6.c;
                                List listM = o9p0Var3 != null ? ycm0.m(o9p0Var3, mbp0Var6.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var4 = (o9p0) obj;
                                ctf0 ctf0Var2 = bsfVar.c;
                                List list3 = o9p0Var4 != null ? o9p0Var4.i : null;
                                if (list3 == null) {
                                    list3 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var2, list3);
                        }
                    }
                }, b10));
                this.l = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.w0e0
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b11 = b3;
                        List list = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new p7d0(bsfVar, (byte) 12));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.c(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.c(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list == null) {
                                    list = iun.f15405a;
                                }
                                return ghm0.o(list, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                obp0 obp0Var = (obp0) obj;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    listH = fem0.h((List) obj3, 15L, bsfVar.c, true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var2 = (o9p0) obj;
                                List list2 = o9p0Var2 != null ? o9p0Var2.j : null;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list2);
                            case 6:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                o9p0 o9p0Var3 = mbp0Var6.c;
                                List listM = o9p0Var3 != null ? ycm0.m(o9p0Var3, mbp0Var6.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var4 = (o9p0) obj;
                                ctf0 ctf0Var2 = bsfVar.c;
                                List list3 = o9p0Var4 != null ? o9p0Var4.i : null;
                                if (list3 == null) {
                                    list3 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var2, list3);
                        }
                    }
                }, b10));
                this.m = maz.b(new yw9(mbp0Var.l, new Function1(this) { // from class: a.w0e0
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b11 = b2;
                        List list = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new p7d0(bsfVar, (byte) 12));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.c(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.c(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list == null) {
                                    list = iun.f15405a;
                                }
                                return ghm0.o(list, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                obp0 obp0Var = (obp0) obj;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    listH = fem0.h((List) obj3, 15L, bsfVar.c, true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var2 = (o9p0) obj;
                                List list2 = o9p0Var2 != null ? o9p0Var2.j : null;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list2);
                            case 6:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                o9p0 o9p0Var3 = mbp0Var6.c;
                                List listM = o9p0Var3 != null ? ycm0.m(o9p0Var3, mbp0Var6.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var4 = (o9p0) obj;
                                ctf0 ctf0Var2 = bsfVar.c;
                                List list3 = o9p0Var4 != null ? o9p0Var4.i : null;
                                if (list3 == null) {
                                    list3 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var2, list3);
                        }
                    }
                }, b10));
                o9p0 o9p0Var2 = mbp0Var.c;
                this.n = maz.b(new yw9(o9p0Var2, new Function1(this) { // from class: a.w0e0
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b11 = b8;
                        List list = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new p7d0(bsfVar, (byte) 12));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.c(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.c(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list == null) {
                                    list = iun.f15405a;
                                }
                                return ghm0.o(list, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                obp0 obp0Var = (obp0) obj;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    listH = fem0.h((List) obj3, 15L, bsfVar.c, true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var3 = (o9p0) obj;
                                List list2 = o9p0Var3 != null ? o9p0Var3.j : null;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list2);
                            case 6:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                o9p0 o9p0Var4 = mbp0Var6.c;
                                List listM = o9p0Var4 != null ? ycm0.m(o9p0Var4, mbp0Var6.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var5 = (o9p0) obj;
                                ctf0 ctf0Var2 = bsfVar.c;
                                List list3 = o9p0Var5 != null ? o9p0Var5.i : null;
                                if (list3 == null) {
                                    list3 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var2, list3);
                        }
                    }
                }, b10));
                this.o = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.w0e0
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b11 = b7;
                        List list = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new p7d0(bsfVar, (byte) 12));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.c(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.c(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list == null) {
                                    list = iun.f15405a;
                                }
                                return ghm0.o(list, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                obp0 obp0Var = (obp0) obj;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    listH = fem0.h((List) obj3, 15L, bsfVar.c, true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var3 = (o9p0) obj;
                                List list2 = o9p0Var3 != null ? o9p0Var3.j : null;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list2);
                            case 6:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                o9p0 o9p0Var4 = mbp0Var6.c;
                                List listM = o9p0Var4 != null ? ycm0.m(o9p0Var4, mbp0Var6.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var5 = (o9p0) obj;
                                ctf0 ctf0Var2 = bsfVar.c;
                                List list3 = o9p0Var5 != null ? o9p0Var5.i : null;
                                if (list3 == null) {
                                    list3 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var2, list3);
                        }
                    }
                }, b10));
                this.p = maz.b(new yw9(o9p0Var2, new Function1(this) { // from class: a.w0e0
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b11 = b6;
                        List list = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new p7d0(bsfVar, (byte) 12));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.c(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.c(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list == null) {
                                    list = iun.f15405a;
                                }
                                return ghm0.o(list, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                obp0 obp0Var = (obp0) obj;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    listH = fem0.h((List) obj3, 15L, bsfVar.c, true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var3 = (o9p0) obj;
                                List list2 = o9p0Var3 != null ? o9p0Var3.j : null;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list2);
                            case 6:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                o9p0 o9p0Var4 = mbp0Var6.c;
                                List listM = o9p0Var4 != null ? ycm0.m(o9p0Var4, mbp0Var6.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var5 = (o9p0) obj;
                                ctf0 ctf0Var2 = bsfVar.c;
                                List list3 = o9p0Var5 != null ? o9p0Var5.i : null;
                                if (list3 == null) {
                                    list3 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var2, list3);
                        }
                    }
                }, b10));
                break;
            case 3:
                this.b = mbp0Var;
                this.c = ctf0Var;
                this.d = g2vVar;
                this.e = y78Var;
                this.f = locale;
                this.g = maz.b(new yw9(mbp0Var, new qzs0((byte) 9), b10));
                this.h = maz.b(new yw9(mbp0Var, new qzs0((byte) 10), b10));
                this.i = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.t1u0
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b11 = b9;
                        List list = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new rbt0(bsfVar, (byte) 6));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.d(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.d(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list == null) {
                                    list = iun.f15405a;
                                }
                                return ghm0.o(list, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                obp0 obp0Var = (obp0) obj;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    listH = fem0.h((List) obj3, 27L, bsfVar.c, true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var3 = (o9p0) obj;
                                List list2 = o9p0Var3 != null ? o9p0Var3.j : null;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list2);
                            case 6:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                o9p0 o9p0Var4 = mbp0Var6.c;
                                List listM = o9p0Var4 != null ? ycm0.m(o9p0Var4, mbp0Var6.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var5 = (o9p0) obj;
                                ctf0 ctf0Var2 = bsfVar.c;
                                List list3 = o9p0Var5 != null ? o9p0Var5.i : null;
                                if (list3 == null) {
                                    list3 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var2, list3);
                        }
                    }
                }, b10));
                this.j = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.t1u0
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b11 = b5;
                        List list = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new rbt0(bsfVar, (byte) 6));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.d(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.d(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list == null) {
                                    list = iun.f15405a;
                                }
                                return ghm0.o(list, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                obp0 obp0Var = (obp0) obj;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    listH = fem0.h((List) obj3, 27L, bsfVar.c, true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var3 = (o9p0) obj;
                                List list2 = o9p0Var3 != null ? o9p0Var3.j : null;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list2);
                            case 6:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                o9p0 o9p0Var4 = mbp0Var6.c;
                                List listM = o9p0Var4 != null ? ycm0.m(o9p0Var4, mbp0Var6.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var5 = (o9p0) obj;
                                ctf0 ctf0Var2 = bsfVar.c;
                                List list3 = o9p0Var5 != null ? o9p0Var5.i : null;
                                if (list3 == null) {
                                    list3 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var2, list3);
                        }
                    }
                }, b10));
                this.k = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.t1u0
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b11 = b4;
                        List list = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new rbt0(bsfVar, (byte) 6));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.d(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.d(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list == null) {
                                    list = iun.f15405a;
                                }
                                return ghm0.o(list, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                obp0 obp0Var = (obp0) obj;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    listH = fem0.h((List) obj3, 27L, bsfVar.c, true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var3 = (o9p0) obj;
                                List list2 = o9p0Var3 != null ? o9p0Var3.j : null;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list2);
                            case 6:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                o9p0 o9p0Var4 = mbp0Var6.c;
                                List listM = o9p0Var4 != null ? ycm0.m(o9p0Var4, mbp0Var6.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var5 = (o9p0) obj;
                                ctf0 ctf0Var2 = bsfVar.c;
                                List list3 = o9p0Var5 != null ? o9p0Var5.i : null;
                                if (list3 == null) {
                                    list3 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var2, list3);
                        }
                    }
                }, b10));
                this.l = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.t1u0
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b11 = b3;
                        List list = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new rbt0(bsfVar, (byte) 6));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.d(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.d(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list == null) {
                                    list = iun.f15405a;
                                }
                                return ghm0.o(list, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                obp0 obp0Var = (obp0) obj;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    listH = fem0.h((List) obj3, 27L, bsfVar.c, true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var3 = (o9p0) obj;
                                List list2 = o9p0Var3 != null ? o9p0Var3.j : null;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list2);
                            case 6:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                o9p0 o9p0Var4 = mbp0Var6.c;
                                List listM = o9p0Var4 != null ? ycm0.m(o9p0Var4, mbp0Var6.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var5 = (o9p0) obj;
                                ctf0 ctf0Var2 = bsfVar.c;
                                List list3 = o9p0Var5 != null ? o9p0Var5.i : null;
                                if (list3 == null) {
                                    list3 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var2, list3);
                        }
                    }
                }, b10));
                this.m = maz.b(new yw9(mbp0Var.l, new Function1(this) { // from class: a.t1u0
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b11 = b2;
                        List list = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new rbt0(bsfVar, (byte) 6));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.d(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.d(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list == null) {
                                    list = iun.f15405a;
                                }
                                return ghm0.o(list, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                obp0 obp0Var = (obp0) obj;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    listH = fem0.h((List) obj3, 27L, bsfVar.c, true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var3 = (o9p0) obj;
                                List list2 = o9p0Var3 != null ? o9p0Var3.j : null;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list2);
                            case 6:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                o9p0 o9p0Var4 = mbp0Var6.c;
                                List listM = o9p0Var4 != null ? ycm0.m(o9p0Var4, mbp0Var6.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var5 = (o9p0) obj;
                                ctf0 ctf0Var2 = bsfVar.c;
                                List list3 = o9p0Var5 != null ? o9p0Var5.i : null;
                                if (list3 == null) {
                                    list3 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var2, list3);
                        }
                    }
                }, b10));
                o9p0 o9p0Var3 = mbp0Var.c;
                this.n = maz.b(new yw9(o9p0Var3, new Function1(this) { // from class: a.t1u0
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b11 = b8;
                        List list = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new rbt0(bsfVar, (byte) 6));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.d(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.d(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list == null) {
                                    list = iun.f15405a;
                                }
                                return ghm0.o(list, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                obp0 obp0Var = (obp0) obj;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    listH = fem0.h((List) obj3, 27L, bsfVar.c, true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var4 = (o9p0) obj;
                                List list2 = o9p0Var4 != null ? o9p0Var4.j : null;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list2);
                            case 6:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                o9p0 o9p0Var5 = mbp0Var6.c;
                                List listM = o9p0Var5 != null ? ycm0.m(o9p0Var5, mbp0Var6.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var6 = (o9p0) obj;
                                ctf0 ctf0Var2 = bsfVar.c;
                                List list3 = o9p0Var6 != null ? o9p0Var6.i : null;
                                if (list3 == null) {
                                    list3 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var2, list3);
                        }
                    }
                }, b10));
                this.o = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.t1u0
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b11 = b7;
                        List list = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new rbt0(bsfVar, (byte) 6));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.d(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.d(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list == null) {
                                    list = iun.f15405a;
                                }
                                return ghm0.o(list, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                obp0 obp0Var = (obp0) obj;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    listH = fem0.h((List) obj3, 27L, bsfVar.c, true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var4 = (o9p0) obj;
                                List list2 = o9p0Var4 != null ? o9p0Var4.j : null;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list2);
                            case 6:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                o9p0 o9p0Var5 = mbp0Var6.c;
                                List listM = o9p0Var5 != null ? ycm0.m(o9p0Var5, mbp0Var6.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var6 = (o9p0) obj;
                                ctf0 ctf0Var2 = bsfVar.c;
                                List list3 = o9p0Var6 != null ? o9p0Var6.i : null;
                                if (list3 == null) {
                                    list3 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var2, list3);
                        }
                    }
                }, b10));
                this.p = maz.b(new yw9(o9p0Var3, new Function1(this) { // from class: a.t1u0
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b11 = b6;
                        List list = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new rbt0(bsfVar, (byte) 6));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.d(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.d(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list == null) {
                                    list = iun.f15405a;
                                }
                                return ghm0.o(list, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                obp0 obp0Var = (obp0) obj;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    listH = fem0.h((List) obj3, 27L, bsfVar.c, true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var4 = (o9p0) obj;
                                List list2 = o9p0Var4 != null ? o9p0Var4.j : null;
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list2);
                            case 6:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                o9p0 o9p0Var5 = mbp0Var6.c;
                                List listM = o9p0Var5 != null ? ycm0.m(o9p0Var5, mbp0Var6.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var6 = (o9p0) obj;
                                ctf0 ctf0Var2 = bsfVar.c;
                                List list3 = o9p0Var6 != null ? o9p0Var6.i : null;
                                if (list3 == null) {
                                    list3 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var2, list3);
                        }
                    }
                }, b10));
                break;
            default:
                this.b = mbp0Var;
                this.c = ctf0Var;
                this.d = g2vVar;
                this.e = y78Var;
                this.f = locale;
                this.g = maz.b(new yw9(mbp0Var, new vlf(b8), b10));
                this.h = maz.b(new yw9(mbp0Var, new vlf(b7), b10));
                this.i = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.asf
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        List list;
                        eh ehVar;
                        byte b11 = b9;
                        List list2 = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new jwd(bsfVar, (byte) 22));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.a(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.a(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list2 = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return ghm0.o(list2, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                obp0 obp0Var = mbp0Var6.l;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    List list3 = (List) obj3;
                                    ctf0 ctf0Var2 = bsfVar.c;
                                    o9p0 o9p0Var4 = mbp0Var6.c;
                                    listH = fem0.h(list3, 46L, ctf0Var2, (o9p0Var4 == null || (list = o9p0Var4.i) == null || (ehVar = (eh) CollectionsKt.firstOrNull(list)) == null || !ehVar.g) ? false : true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var5 = (o9p0) obj;
                                List list4 = o9p0Var5 != null ? o9p0Var5.j : null;
                                if (list4 == null) {
                                    list4 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list4);
                            case 6:
                                mbp0 mbp0Var7 = (mbp0) obj;
                                mbp0Var7.getClass();
                                o9p0 o9p0Var6 = mbp0Var7.c;
                                List listM = o9p0Var6 != null ? ycm0.m(o9p0Var6, mbp0Var7.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var7 = (o9p0) obj;
                                ctf0 ctf0Var3 = bsfVar.c;
                                List list5 = o9p0Var7 != null ? o9p0Var7.i : null;
                                if (list5 == null) {
                                    list5 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var3, list5);
                        }
                    }
                }, b10));
                this.j = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.asf
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        List list;
                        eh ehVar;
                        byte b11 = b5;
                        List list2 = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new jwd(bsfVar, (byte) 22));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.a(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.a(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list2 = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return ghm0.o(list2, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                obp0 obp0Var = mbp0Var6.l;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    List list3 = (List) obj3;
                                    ctf0 ctf0Var2 = bsfVar.c;
                                    o9p0 o9p0Var4 = mbp0Var6.c;
                                    listH = fem0.h(list3, 46L, ctf0Var2, (o9p0Var4 == null || (list = o9p0Var4.i) == null || (ehVar = (eh) CollectionsKt.firstOrNull(list)) == null || !ehVar.g) ? false : true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var5 = (o9p0) obj;
                                List list4 = o9p0Var5 != null ? o9p0Var5.j : null;
                                if (list4 == null) {
                                    list4 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list4);
                            case 6:
                                mbp0 mbp0Var7 = (mbp0) obj;
                                mbp0Var7.getClass();
                                o9p0 o9p0Var6 = mbp0Var7.c;
                                List listM = o9p0Var6 != null ? ycm0.m(o9p0Var6, mbp0Var7.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var7 = (o9p0) obj;
                                ctf0 ctf0Var3 = bsfVar.c;
                                List list5 = o9p0Var7 != null ? o9p0Var7.i : null;
                                if (list5 == null) {
                                    list5 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var3, list5);
                        }
                    }
                }, b10));
                this.k = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.asf
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        List list;
                        eh ehVar;
                        byte b11 = b4;
                        List list2 = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new jwd(bsfVar, (byte) 22));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.a(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.a(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list2 = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return ghm0.o(list2, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                obp0 obp0Var = mbp0Var6.l;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    List list3 = (List) obj3;
                                    ctf0 ctf0Var2 = bsfVar.c;
                                    o9p0 o9p0Var4 = mbp0Var6.c;
                                    listH = fem0.h(list3, 46L, ctf0Var2, (o9p0Var4 == null || (list = o9p0Var4.i) == null || (ehVar = (eh) CollectionsKt.firstOrNull(list)) == null || !ehVar.g) ? false : true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var5 = (o9p0) obj;
                                List list4 = o9p0Var5 != null ? o9p0Var5.j : null;
                                if (list4 == null) {
                                    list4 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list4);
                            case 6:
                                mbp0 mbp0Var7 = (mbp0) obj;
                                mbp0Var7.getClass();
                                o9p0 o9p0Var6 = mbp0Var7.c;
                                List listM = o9p0Var6 != null ? ycm0.m(o9p0Var6, mbp0Var7.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var7 = (o9p0) obj;
                                ctf0 ctf0Var3 = bsfVar.c;
                                List list5 = o9p0Var7 != null ? o9p0Var7.i : null;
                                if (list5 == null) {
                                    list5 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var3, list5);
                        }
                    }
                }, b10));
                this.l = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.asf
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        List list;
                        eh ehVar;
                        byte b11 = b3;
                        List list2 = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new jwd(bsfVar, (byte) 22));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.a(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.a(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list2 = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return ghm0.o(list2, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                obp0 obp0Var = mbp0Var6.l;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    List list3 = (List) obj3;
                                    ctf0 ctf0Var2 = bsfVar.c;
                                    o9p0 o9p0Var4 = mbp0Var6.c;
                                    listH = fem0.h(list3, 46L, ctf0Var2, (o9p0Var4 == null || (list = o9p0Var4.i) == null || (ehVar = (eh) CollectionsKt.firstOrNull(list)) == null || !ehVar.g) ? false : true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var5 = (o9p0) obj;
                                List list4 = o9p0Var5 != null ? o9p0Var5.j : null;
                                if (list4 == null) {
                                    list4 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list4);
                            case 6:
                                mbp0 mbp0Var7 = (mbp0) obj;
                                mbp0Var7.getClass();
                                o9p0 o9p0Var6 = mbp0Var7.c;
                                List listM = o9p0Var6 != null ? ycm0.m(o9p0Var6, mbp0Var7.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var7 = (o9p0) obj;
                                ctf0 ctf0Var3 = bsfVar.c;
                                List list5 = o9p0Var7 != null ? o9p0Var7.i : null;
                                if (list5 == null) {
                                    list5 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var3, list5);
                        }
                    }
                }, b10));
                this.m = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.asf
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        List list;
                        eh ehVar;
                        byte b11 = b2;
                        List list2 = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new jwd(bsfVar, (byte) 22));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.a(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.a(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list2 = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return ghm0.o(list2, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                obp0 obp0Var = mbp0Var6.l;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    List list3 = (List) obj3;
                                    ctf0 ctf0Var2 = bsfVar.c;
                                    o9p0 o9p0Var4 = mbp0Var6.c;
                                    listH = fem0.h(list3, 46L, ctf0Var2, (o9p0Var4 == null || (list = o9p0Var4.i) == null || (ehVar = (eh) CollectionsKt.firstOrNull(list)) == null || !ehVar.g) ? false : true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var5 = (o9p0) obj;
                                List list4 = o9p0Var5 != null ? o9p0Var5.j : null;
                                if (list4 == null) {
                                    list4 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list4);
                            case 6:
                                mbp0 mbp0Var7 = (mbp0) obj;
                                mbp0Var7.getClass();
                                o9p0 o9p0Var6 = mbp0Var7.c;
                                List listM = o9p0Var6 != null ? ycm0.m(o9p0Var6, mbp0Var7.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var7 = (o9p0) obj;
                                ctf0 ctf0Var3 = bsfVar.c;
                                List list5 = o9p0Var7 != null ? o9p0Var7.i : null;
                                if (list5 == null) {
                                    list5 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var3, list5);
                        }
                    }
                }, b10));
                o9p0 o9p0Var4 = mbp0Var.c;
                this.n = maz.b(new yw9(o9p0Var4, new Function1(this) { // from class: a.asf
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        List list;
                        eh ehVar;
                        byte b11 = b8;
                        List list2 = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new jwd(bsfVar, (byte) 22));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.a(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.a(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list2 = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return ghm0.o(list2, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                obp0 obp0Var = mbp0Var6.l;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    List list3 = (List) obj3;
                                    ctf0 ctf0Var2 = bsfVar.c;
                                    o9p0 o9p0Var5 = mbp0Var6.c;
                                    listH = fem0.h(list3, 46L, ctf0Var2, (o9p0Var5 == null || (list = o9p0Var5.i) == null || (ehVar = (eh) CollectionsKt.firstOrNull(list)) == null || !ehVar.g) ? false : true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var6 = (o9p0) obj;
                                List list4 = o9p0Var6 != null ? o9p0Var6.j : null;
                                if (list4 == null) {
                                    list4 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list4);
                            case 6:
                                mbp0 mbp0Var7 = (mbp0) obj;
                                mbp0Var7.getClass();
                                o9p0 o9p0Var7 = mbp0Var7.c;
                                List listM = o9p0Var7 != null ? ycm0.m(o9p0Var7, mbp0Var7.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var8 = (o9p0) obj;
                                ctf0 ctf0Var3 = bsfVar.c;
                                List list5 = o9p0Var8 != null ? o9p0Var8.i : null;
                                if (list5 == null) {
                                    list5 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var3, list5);
                        }
                    }
                }, b10));
                this.o = maz.b(new yw9(mbp0Var, new Function1(this) { // from class: a.asf
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        List list;
                        eh ehVar;
                        byte b11 = b7;
                        List list2 = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new jwd(bsfVar, (byte) 22));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.a(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.a(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list2 = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return ghm0.o(list2, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                obp0 obp0Var = mbp0Var6.l;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    List list3 = (List) obj3;
                                    ctf0 ctf0Var2 = bsfVar.c;
                                    o9p0 o9p0Var5 = mbp0Var6.c;
                                    listH = fem0.h(list3, 46L, ctf0Var2, (o9p0Var5 == null || (list = o9p0Var5.i) == null || (ehVar = (eh) CollectionsKt.firstOrNull(list)) == null || !ehVar.g) ? false : true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var6 = (o9p0) obj;
                                List list4 = o9p0Var6 != null ? o9p0Var6.j : null;
                                if (list4 == null) {
                                    list4 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list4);
                            case 6:
                                mbp0 mbp0Var7 = (mbp0) obj;
                                mbp0Var7.getClass();
                                o9p0 o9p0Var7 = mbp0Var7.c;
                                List listM = o9p0Var7 != null ? ycm0.m(o9p0Var7, mbp0Var7.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var8 = (o9p0) obj;
                                ctf0 ctf0Var3 = bsfVar.c;
                                List list5 = o9p0Var8 != null ? o9p0Var8.i : null;
                                if (list5 == null) {
                                    list5 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var3, list5);
                        }
                    }
                }, b10));
                this.p = maz.b(new yw9(o9p0Var4, new Function1(this) { // from class: a.asf
                    public final /* synthetic */ bsf b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        List list;
                        eh ehVar;
                        byte b11 = b6;
                        List list2 = null;
                        List listH = null;
                        bsf bsfVar = this.b;
                        switch (b11) {
                            case 0:
                                g2v g2vVar2 = bsfVar.d;
                                mbp0 mbp0Var2 = (mbp0) obj;
                                mbp0Var2.getClass();
                                fbp0 fbp0Var = mbp0Var2.h;
                                TeamDetailsParams teamDetailsParams = mbp0Var2.b;
                                if (!fbp0Var.equals(dbp0.c)) {
                                    if (fbp0Var.equals(ebp0.c)) {
                                        return gnm0.h(mbp0Var2.c, mbp0Var2.l, g2vVar2, mbp0Var2.f21520a, teamDetailsParams.f46569a, new jwd(bsfVar, (byte) 22));
                                    }
                                    t9f.b();
                                    return null;
                                }
                                e9p0 e9p0Var = mbp0Var2.k;
                                v5l0 v5l0Var = mbp0Var2.f.g.y;
                                boolean z = mbp0Var2.f21520a;
                                long j = teamDetailsParams.f46569a;
                                lc00 lc00VarB = kotlin.collections.a.b();
                                lc00VarB.addAll((Collection) ((fee) bsfVar.j.getValue()).b());
                                lc00VarB.addAll((Collection) ((fee) bsfVar.k.getValue()).b());
                                return aem0.m(e9p0Var, g2vVar2, v5l0Var, z, j, twn.k(lc00VarB, (Collection) ((fee) bsfVar.l.getValue()).b(), lc00VarB));
                            case 1:
                                mbp0 mbp0Var3 = (mbp0) obj;
                                mbp0Var3.getClass();
                                return bsfVar.a(mbp0Var3, true);
                            case 2:
                                mbp0 mbp0Var4 = (mbp0) obj;
                                mbp0Var4.getClass();
                                return bsfVar.a(mbp0Var4, false);
                            case 3:
                                mbp0 mbp0Var5 = (mbp0) obj;
                                mbp0Var5.getClass();
                                e9p0 e9p0Var2 = mbp0Var5.k;
                                if (e9p0Var2 != null) {
                                    Object obj2 = e9p0Var2.d;
                                    e0g0 e0g0Var = j0g0.b;
                                    list2 = (List) (obj2 instanceof g0g0 ? null : obj2);
                                }
                                if (list2 == null) {
                                    list2 = iun.f15405a;
                                }
                                return ghm0.o(list2, mbp0Var5.m, bsfVar.c, mbp0Var5.f.g.y, bsfVar.f, mbp0Var5.o);
                            case 4:
                                mbp0 mbp0Var6 = (mbp0) obj;
                                mbp0Var6.getClass();
                                obp0 obp0Var = mbp0Var6.l;
                                if (obp0Var != null) {
                                    Object obj3 = obp0Var.f24993a;
                                    iun iunVar = iun.f15405a;
                                    e0g0 e0g0Var2 = j0g0.b;
                                    if (obj3 instanceof g0g0) {
                                        obj3 = iunVar;
                                    }
                                    List list3 = (List) obj3;
                                    ctf0 ctf0Var2 = bsfVar.c;
                                    o9p0 o9p0Var5 = mbp0Var6.c;
                                    listH = fem0.h(list3, 46L, ctf0Var2, (o9p0Var5 == null || (list = o9p0Var5.i) == null || (ehVar = (eh) CollectionsKt.firstOrNull(list)) == null || !ehVar.g) ? false : true);
                                }
                                return listH == null ? iun.f15405a : listH;
                            case 5:
                                o9p0 o9p0Var6 = (o9p0) obj;
                                List list4 = o9p0Var6 != null ? o9p0Var6.j : null;
                                if (list4 == null) {
                                    list4 = iun.f15405a;
                                }
                                return iom0.h(bsfVar.c, list4);
                            case 6:
                                mbp0 mbp0Var7 = (mbp0) obj;
                                mbp0Var7.getClass();
                                o9p0 o9p0Var7 = mbp0Var7.c;
                                List listM = o9p0Var7 != null ? ycm0.m(o9p0Var7, mbp0Var7.n, bsfVar.c) : null;
                                return listM == null ? iun.f15405a : listM;
                            default:
                                o9p0 o9p0Var8 = (o9p0) obj;
                                ctf0 ctf0Var3 = bsfVar.c;
                                List list5 = o9p0Var8 != null ? o9p0Var8.i : null;
                                if (list5 == null) {
                                    list5 = iun.f15405a;
                                }
                                return zcm0.g(ctf0Var3, list5);
                        }
                    }
                }, b10));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    public List a(mbp0 mbp0Var, boolean z) {
        e9p0 e9p0Var = mbp0Var.k;
        Object obj = null;
        if (z) {
            if (e9p0Var != null) {
                Object obj2 = e9p0Var.f7433a;
                e0g0 e0g0Var = j0g0.b;
                obj = (List) (obj2 instanceof g0g0 ? null : obj2);
            }
            if (obj == null) {
                obj = iun.f15405a;
            }
        } else {
            if (e9p0Var != null) {
                Object obj3 = e9p0Var.b;
                e0g0 e0g0Var2 = j0g0.b;
                obj = (List) (obj3 instanceof g0g0 ? null : obj3);
            }
            if (obj == null) {
                obj = iun.f15405a;
            }
        }
        ?? r3 = obj;
        Map map = mbp0Var.d;
        boolean z2 = mbp0Var.i;
        sff0 sff0Var = mbp0Var.f;
        return dem0.l(z, r3, map, mbp0Var.j, this.e, z2, sff0Var.J, this.c, sff0Var.g.y, this.b.o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    public List b(mbp0 mbp0Var, boolean z) {
        e9p0 e9p0Var = mbp0Var.k;
        Object obj = null;
        if (z) {
            if (e9p0Var != null) {
                Object obj2 = e9p0Var.f7433a;
                e0g0 e0g0Var = j0g0.b;
                obj = (List) (obj2 instanceof g0g0 ? null : obj2);
            }
            if (obj == null) {
                obj = iun.f15405a;
            }
        } else {
            if (e9p0Var != null) {
                Object obj3 = e9p0Var.b;
                e0g0 e0g0Var2 = j0g0.b;
                obj = (List) (obj3 instanceof g0g0 ? null : obj3);
            }
            if (obj == null) {
                obj = iun.f15405a;
            }
        }
        ?? r3 = obj;
        Map map = mbp0Var.d;
        boolean z2 = mbp0Var.i;
        sff0 sff0Var = mbp0Var.f;
        return dem0.l(z, r3, map, mbp0Var.j, this.e, z2, sff0Var.J, this.c, sff0Var.g.y, this.b.o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    public List c(mbp0 mbp0Var, boolean z) {
        e9p0 e9p0Var = mbp0Var.k;
        Object obj = null;
        if (z) {
            if (e9p0Var != null) {
                Object obj2 = e9p0Var.f7433a;
                e0g0 e0g0Var = j0g0.b;
                obj = (List) (obj2 instanceof g0g0 ? null : obj2);
            }
            if (obj == null) {
                obj = iun.f15405a;
            }
        } else {
            if (e9p0Var != null) {
                Object obj3 = e9p0Var.b;
                e0g0 e0g0Var2 = j0g0.b;
                obj = (List) (obj3 instanceof g0g0 ? null : obj3);
            }
            if (obj == null) {
                obj = iun.f15405a;
            }
        }
        ?? r3 = obj;
        Map map = mbp0Var.d;
        boolean z2 = mbp0Var.i;
        sff0 sff0Var = mbp0Var.f;
        return dem0.l(z, r3, map, mbp0Var.j, this.e, z2, sff0Var.J, this.c, sff0Var.g.y, this.b.o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    public List d(mbp0 mbp0Var, boolean z) {
        e9p0 e9p0Var = mbp0Var.k;
        Object obj = null;
        if (z) {
            if (e9p0Var != null) {
                Object obj2 = e9p0Var.f7433a;
                e0g0 e0g0Var = j0g0.b;
                obj = (List) (obj2 instanceof g0g0 ? null : obj2);
            }
            if (obj == null) {
                obj = iun.f15405a;
            }
        } else {
            if (e9p0Var != null) {
                Object obj3 = e9p0Var.b;
                e0g0 e0g0Var2 = j0g0.b;
                obj = (List) (obj3 instanceof g0g0 ? null : obj3);
            }
            if (obj == null) {
                obj = iun.f15405a;
            }
        }
        ?? r3 = obj;
        Map map = mbp0Var.d;
        boolean z2 = mbp0Var.i;
        sff0 sff0Var = mbp0Var.f;
        return dem0.l(z, r3, map, mbp0Var.j, this.e, z2, sff0Var.J, this.c, sff0Var.g.y, this.b.o);
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        byte b = this.f3127a;
        n0o0 n0o0Var = this.p;
        n0o0 n0o0Var2 = this.o;
        n0o0 n0o0Var3 = this.n;
        n0o0 n0o0Var4 = this.m;
        n0o0 n0o0Var5 = this.l;
        n0o0 n0o0Var6 = this.k;
        n0o0 n0o0Var7 = this.j;
        n0o0 n0o0Var8 = this.i;
        n0o0 n0o0Var9 = this.h;
        n0o0 n0o0Var10 = this.g;
        switch (b) {
            case 0:
                mbp0 mbp0Var = (mbp0) obj;
                mbp0Var.getClass();
                ((fee) n0o0Var10.getValue()).d(mbp0Var);
                ((fee) n0o0Var9.getValue()).d(mbp0Var);
                ((fee) n0o0Var8.getValue()).d(mbp0Var);
                ((fee) n0o0Var7.getValue()).d(mbp0Var);
                ((fee) n0o0Var6.getValue()).d(mbp0Var);
                ((fee) n0o0Var5.getValue()).d(mbp0Var);
                ((fee) n0o0Var4.getValue()).d(mbp0Var);
                fee feeVar = (fee) n0o0Var3.getValue();
                o9p0 o9p0Var = mbp0Var.c;
                feeVar.d(o9p0Var);
                ((fee) n0o0Var2.getValue()).d(mbp0Var);
                ((fee) n0o0Var.getValue()).d(o9p0Var);
                break;
            case 1:
                mbp0 mbp0Var2 = (mbp0) obj;
                mbp0Var2.getClass();
                ((fee) n0o0Var10.getValue()).d(mbp0Var2);
                ((fee) n0o0Var9.getValue()).d(mbp0Var2);
                ((fee) n0o0Var8.getValue()).d(mbp0Var2);
                ((fee) n0o0Var7.getValue()).d(mbp0Var2);
                ((fee) n0o0Var6.getValue()).d(mbp0Var2);
                ((fee) n0o0Var5.getValue()).d(mbp0Var2);
                ((fee) n0o0Var4.getValue()).d(mbp0Var2.l);
                fee feeVar2 = (fee) n0o0Var3.getValue();
                o9p0 o9p0Var2 = mbp0Var2.c;
                feeVar2.d(o9p0Var2);
                ((fee) n0o0Var2.getValue()).d(mbp0Var2);
                ((fee) n0o0Var.getValue()).d(o9p0Var2);
                break;
            case 2:
                mbp0 mbp0Var3 = (mbp0) obj;
                mbp0Var3.getClass();
                ((fee) n0o0Var10.getValue()).d(mbp0Var3);
                ((fee) n0o0Var9.getValue()).d(mbp0Var3);
                ((fee) n0o0Var8.getValue()).d(mbp0Var3);
                ((fee) n0o0Var7.getValue()).d(mbp0Var3);
                ((fee) n0o0Var6.getValue()).d(mbp0Var3);
                ((fee) n0o0Var5.getValue()).d(mbp0Var3);
                ((fee) n0o0Var4.getValue()).d(mbp0Var3.l);
                fee feeVar3 = (fee) n0o0Var3.getValue();
                o9p0 o9p0Var3 = mbp0Var3.c;
                feeVar3.d(o9p0Var3);
                ((fee) n0o0Var2.getValue()).d(mbp0Var3);
                ((fee) n0o0Var.getValue()).d(o9p0Var3);
                break;
            default:
                mbp0 mbp0Var4 = (mbp0) obj;
                mbp0Var4.getClass();
                ((fee) n0o0Var10.getValue()).d(mbp0Var4);
                ((fee) n0o0Var9.getValue()).d(mbp0Var4);
                ((fee) n0o0Var8.getValue()).d(mbp0Var4);
                ((fee) n0o0Var7.getValue()).d(mbp0Var4);
                ((fee) n0o0Var6.getValue()).d(mbp0Var4);
                ((fee) n0o0Var5.getValue()).d(mbp0Var4);
                ((fee) n0o0Var4.getValue()).d(mbp0Var4.l);
                fee feeVar4 = (fee) n0o0Var3.getValue();
                o9p0 o9p0Var4 = mbp0Var4.c;
                feeVar4.d(o9p0Var4);
                ((fee) n0o0Var2.getValue()).d(mbp0Var4);
                ((fee) n0o0Var.getValue()).d(o9p0Var4);
                break;
        }
        return new sbp0(((fee) n0o0Var10.getValue()).e, ((fee) n0o0Var9.getValue()).e, ((fee) n0o0Var8.getValue()).e);
    }
}
