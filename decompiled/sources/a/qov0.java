package a;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qov0 {
    public static final String i = wv00.h("WorkContinuationImpl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cpv0 f29087a;
    public final String b;
    public final zko c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f = new ArrayList();
    public boolean g;
    public gqw0 h;

    public qov0(cpv0 cpv0Var, String str, zko zkoVar, List list, int i2) {
        this.f29087a = cpv0Var;
        this.b = str;
        this.c = zkoVar;
        this.d = list;
        this.e = new ArrayList(list.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (zkoVar == zko.f44542a && ((lpv0) list.get(i3)).b.u != Long.MAX_VALUE) {
                jf4.o("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String string = ((lpv0) list.get(i3)).f20459a.toString();
            string.getClass();
            this.e.add(string);
            this.f.add(string);
        }
    }

    public static HashSet b(qov0 qov0Var) {
        HashSet hashSet = new HashSet();
        qov0Var.getClass();
        return hashSet;
    }

    public final gqw0 a() {
        if (this.g) {
            wv00.f().j(i, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + Separators.RPAREN);
        } else {
            cpv0 cpv0Var = this.f29087a;
            this.h = r8x.T(cpv0Var.b.f, "EnqueueRunnable_" + this.c.name(), cpv0Var.d.f9946a, new jmv0(this, (byte) 2));
        }
        return this.h;
    }
}
