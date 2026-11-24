package a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class n3b extends q4 {
    public static final ek5 h = new ek5((byte) 14);
    public final ntl f;
    public Function1 g;

    public n3b(ntl ntlVar) {
        super(h);
        this.f = ntlVar;
        this.g = null;
    }

    @Override // a.q4, a.yge0
    public final int f(int i) {
        return ((z3b) A(i)).a().ordinal();
    }

    @Override // a.q4, a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        int iOrdinal = ((z3b) A(i)).a().ordinal();
        if (iOrdinal == 0) {
            Object objA = A(i);
            objA.getClass();
            return;
        }
        if (iOrdinal != 1) {
            t9f.b();
            return;
        }
        t3b t3bVar = (t3b) xhe0Var;
        Object objA2 = A(i);
        objA2.getClass();
        p3b p3bVar = (p3b) objA2;
        o3b o3bVar = t3bVar.u;
        o3bVar.setModel(p3bVar);
        dyb.b0(o3bVar, ymx.INTERVAL_500, new s3b(t3bVar, p3bVar, (byte) 1));
    }

    @Override // a.yge0
    public final void o(xhe0 xhe0Var, int i, List list) {
        list.getClass();
        if (list.isEmpty()) {
            n(xhe0Var, i);
            return;
        }
        int iOrdinal = ((z3b) A(i)).a().ordinal();
        if (iOrdinal == 0) {
            Object objA = A(i);
            objA.getClass();
            return;
        }
        if (iOrdinal != 1) {
            t9f.b();
            return;
        }
        t3b t3bVar = (t3b) xhe0Var;
        Object objA2 = A(i);
        objA2.getClass();
        o3b o3bVar = t3bVar.u;
        dyb.b0(o3bVar, ymx.INTERVAL_500, new s3b(t3bVar, (p3b) objA2, (byte) 0));
        bkq bkqVar = new bkq(lgi0.c(pgi0.p(new sx3(list, (byte) 1), new m1b((byte) 2)), new eoh0((byte) 23)));
        while (bkqVar.hasNext()) {
            Object next = bkqVar.next();
            if (next != null) {
                if (next instanceof q3b) {
                    o3bVar.setLabel(((q3b) next).f28044a);
                } else if (next instanceof r3b) {
                    o3bVar.setPicture(((r3b) next).f29779a);
                }
            }
        }
    }

    @Override // a.q4, a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        int iOrdinal = ((n3d) n3d.d.get(i)).ordinal();
        AttributeSet attributeSet = null;
        if (iOrdinal == 0) {
            Context context = viewGroup.getContext();
            context.getClass();
            so5 so5Var = new so5(context, attributeSet, (byte) 6);
            LayoutInflater.from(context).inflate(R.layout.category_card_collection_shimmer, so5Var);
            return new v3b(so5Var);
        }
        if (iOrdinal != 1) {
            t9f.b();
            return null;
        }
        Context context2 = viewGroup.getContext();
        context2.getClass();
        return new t3b(new o3b(context2, this.f), new lya(this, (byte) 3));
    }
}
