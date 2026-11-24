package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ft7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10096a = 0;
    public final /* synthetic */ cp b;
    public final /* synthetic */ cp c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public ft7(cp cpVar, mhc mhcVar, pw4 pw4Var, cp cpVar2, mhc mhcVar2, pw4 pw4Var2) {
        this.b = cpVar;
        this.d = mhcVar;
        this.f = pw4Var;
        this.c = cpVar2;
        this.e = mhcVar2;
        this.g = pw4Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f10096a;
        Object obj2 = this.f;
        Object obj3 = this.g;
        Object obj4 = this.d;
        Object obj5 = this.e;
        cp cpVar = this.b;
        cp cpVar2 = this.c;
        switch (b) {
            case 0:
                List list = (List) obj;
                list.getClass();
                if (list.isEmpty()) {
                    pkd.i(((qcu0) cpVar.u).b, null, new ugd(1641388349, true, new ry2(cpVar, (mhc) obj4, (pw4) obj2, (byte) 26)));
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj6 : list) {
                        obj6.getClass();
                        w3d.u(arrayList, (Collection) obj6);
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((ct7) it.next()) == null) {
                            t9f.b();
                            return null;
                        }
                        pkd.i(((qcu0) cpVar2.u).b, null, new ugd(1641388349, true, new ry2(cpVar2, (mhc) obj5, (pw4) obj3, (byte) 26)));
                    }
                }
                return Unit.f46060a;
            default:
                List list2 = (List) obj;
                yfu0 yfu0Var = cpVar2.u;
                yfu0 yfu0Var2 = cpVar.u;
                list2.getClass();
                if (list2.isEmpty()) {
                    ((rcu0) yfu0Var2).b.setBlockName(((ra8) cpVar.u()).b);
                    ((rcu0) yfu0Var2).b.setBlockBetVisibility(((ra8) cpVar.u()).e);
                    if (((ra8) cpVar.u()).f) {
                        ((rcu0) yfu0Var2).b.setBlockBetValueLoading(((ra8) cpVar.u()).g);
                    }
                    ((rcu0) yfu0Var2).b.setBlockBetImage(((ra8) cpVar.u()).c);
                    ((rcu0) yfu0Var2).b.setBlockBetText(((ra8) cpVar.u()).d);
                    obc.K(cpVar);
                    obc.L(cpVar, (ase) ((a8z) obj5).getValue(), (zre) obj4);
                } else {
                    ArrayList<qa8> arrayList2 = new ArrayList();
                    for (Object obj7 : list2) {
                        obj7.getClass();
                        w3d.u(arrayList2, (Collection) obj7);
                    }
                    for (qa8 qa8Var : arrayList2) {
                        if (qa8Var != null) {
                            if (qa8Var instanceof pa8) {
                                ((rcu0) yfu0Var).b.setBlockName(((ra8) cpVar2.u()).b);
                            } else if (qa8Var instanceof ma8) {
                                ((rcu0) yfu0Var).b.setBlockBetVisibility(((ra8) cpVar2.u()).e);
                            } else if (qa8Var instanceof la8) {
                                if (((ra8) cpVar2.u()).f) {
                                    ((rcu0) yfu0Var).b.setBlockBetValueLoading(((ra8) cpVar2.u()).g);
                                }
                            } else if (qa8Var instanceof ja8) {
                                ((rcu0) yfu0Var).b.setBlockBetImage(((ra8) cpVar2.u()).c);
                            } else if (qa8Var instanceof ka8) {
                                ((rcu0) yfu0Var).b.setBlockBetText(((ra8) cpVar2.u()).d);
                            } else if (qa8Var instanceof ia8) {
                                obc.K(cpVar2);
                            } else if (qa8Var instanceof na8) {
                                obc.L(cpVar2, (ase) ((a8z) obj3).getValue(), (zre) obj2);
                            }
                        }
                    }
                }
                return Unit.f46060a;
        }
    }

    public ft7(cp cpVar, zre zreVar, a8z a8zVar, cp cpVar2, zre zreVar2, a8z a8zVar2) {
        this.b = cpVar;
        this.d = zreVar;
        this.e = a8zVar;
        this.c = cpVar2;
        this.f = zreVar2;
        this.g = a8zVar2;
    }
}
