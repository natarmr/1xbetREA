package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ann0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xx40 f1165a;

    static {
        f2o f2oVar = f2o.f8821a;
        nun nunVar = new nun(f2o.b, j4m0.f, (byte) 0);
        slc slcVar = slc.f32392a;
        g950 g950VarG = j4m0.g.f32934a.g();
        wt00 wt00Var = eu00.e;
        xx40 xx40Var = new xx40(nunVar, g950VarG, wt00Var);
        xx40Var.h = gm40.e;
        tek tekVar = uek.e;
        if (tekVar == null) {
            xx40.s0(9);
            throw null;
        }
        xx40Var.i = tekVar;
        List listC = kotlin.collections.a.c(izs0.s1(xx40Var, t3u0.d, g950.e(TokenNames.T), 0, wt00Var));
        if (listC == null) {
            xx40.s0(14);
            throw null;
        }
        if (xx40Var.k != null) {
            hny.w(xx40Var.getName(), "Type parameters are already set for ");
            return;
        }
        ArrayList arrayList = new ArrayList(listC);
        xx40Var.k = arrayList;
        xx40Var.j = new dmc(xx40Var, arrayList, xx40Var.l, xx40Var.m);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            xx40.s0(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((flc) ((mer) it.next())).h = xx40Var.I();
        }
        f1165a = xx40Var;
    }
}
