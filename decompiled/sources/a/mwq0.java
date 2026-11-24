package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mwq0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22519a;
    public final /* synthetic */ ugd b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ ugd e;

    public /* synthetic */ mwq0(ugd ugdVar, float f, float f2, ugd ugdVar2, byte b) {
        this.f22519a = b;
        this.b = ugdVar;
        this.c = f;
        this.d = f2;
        this.e = ugdVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        switch (this.f22519a) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ugd ugdVar = this.b;
                    boolean zG = fetVar.g(ugdVar);
                    float f = this.c;
                    boolean zD = zG | fetVar.d(f);
                    float f2 = this.d;
                    boolean zD2 = zD | fetVar.d(f2);
                    ugd ugdVar2 = this.e;
                    boolean zG2 = fetVar.g(ugdVar2) | zD2;
                    Object objP = fetVar.P();
                    if (zG2 || objP == ukd.f35823a) {
                        mwq0 mwq0Var = new mwq0(ugdVar, f, f2, ugdVar2, (byte) 1);
                        fetVar.o0(mwq0Var);
                        objP = mwq0Var;
                    }
                    x4n0.a(null, (Function2) objP, fetVar, 0, 1);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            default:
                c5n0 c5n0Var = (c5n0) obj;
                p4e p4eVar = (p4e) obj2;
                c5n0Var.getClass();
                int i = p4e.i(p4eVar.f26347a);
                long j = p4eVar.f26347a;
                int iH = p4e.h(j);
                List listK = c5n0Var.k("toolbarContentId", this.b);
                ArrayList arrayList = new ArrayList(listK.size());
                int size = listK.size();
                for (int iE = 0; iE < size; iE = w6x.e((pj30) listK.get(iE), p4e.b(p4eVar.f26347a, 0, 0, 0, 0, 11), arrayList, iE, 1)) {
                }
                int i2 = 1;
                if (arrayList.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList.get(0);
                    int i3 = ((pu90) obj3).b;
                    int size2 = arrayList.size() - 1;
                    if (1 <= size2) {
                        int i4 = 1;
                        while (true) {
                            Object obj4 = arrayList.get(i4);
                            int i5 = ((pu90) obj4).b;
                            if (i3 < i5) {
                                obj3 = obj4;
                                i3 = i5;
                            }
                            if (i4 != size2) {
                                i4++;
                            }
                        }
                    }
                }
                pu90 pu90Var = (pu90) obj3;
                List listK2 = c5n0Var.k("contentId", new ugd(219350726, true, new clb(c5n0Var, pu90Var != null ? pu90Var.b : 0, this.c, this.d, this.e)));
                ArrayList arrayList2 = new ArrayList(listK2.size());
                int size3 = listK2.size();
                int iE2 = 0;
                while (iE2 < size3) {
                    int i6 = i2;
                    iE2 = w6x.e((pj30) listK2.get(iE2), j, arrayList2, iE2, i6);
                    iH = iH;
                    i2 = i6;
                }
                return vj30.x(c5n0Var, i, iH, new x5q(arrayList, arrayList2, (byte) 3));
        }
    }
}
