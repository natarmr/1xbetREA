package a;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class hg90 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13007a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ pz40 c;

    public /* synthetic */ hg90(pz40 pz40Var, pz40 pz40Var2, byte b) {
        this.f13007a = b;
        this.b = pz40Var;
        this.c = pz40Var2;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        byte b = this.f13007a;
        pz40 pz40Var = this.c;
        boolean z = false;
        pz40 pz40Var2 = this.b;
        switch (b) {
            case 0:
                mcz mczVar = (mcz) obj;
                mczVar.getClass();
                int i11 = mczVar.n;
                List list = mczVar.l;
                ncz nczVar = (ncz) CollectionsKt.firstOrNull(list);
                pz40Var2.setValue(Boolean.valueOf(nczVar != null && nczVar.f23317a == 0 && (i = nczVar.p) >= 0 && i + nczVar.q <= i11));
                ncz nczVar2 = (ncz) CollectionsKt.f0(list);
                if (nczVar2 != null) {
                    if (nczVar2.f23317a == mczVar.o - 1 && (i2 = nczVar2.p) >= 0 && i2 + nczVar2.q <= i11) {
                        z = true;
                    }
                }
                pz40Var.setValue(Boolean.valueOf(z));
                break;
            case 1:
                mcz mczVar2 = (mcz) obj;
                mczVar2.getClass();
                int i12 = mczVar2.n;
                List list2 = mczVar2.l;
                ncz nczVar3 = (ncz) CollectionsKt.firstOrNull(list2);
                pz40Var2.setValue(Boolean.valueOf(nczVar3 != null && nczVar3.f23317a == 0 && (i3 = nczVar3.p) >= 0 && i3 + nczVar3.q <= i12));
                ncz nczVar4 = (ncz) CollectionsKt.f0(list2);
                if (nczVar4 != null) {
                    if (nczVar4.f23317a == mczVar2.o - 1 && (i4 = nczVar4.p) >= 0 && i4 + nczVar4.q <= i12) {
                        z = true;
                    }
                }
                pz40Var.setValue(Boolean.valueOf(z));
                break;
            case 2:
                mcz mczVar3 = (mcz) obj;
                mczVar3.getClass();
                int i13 = mczVar3.n;
                List list3 = mczVar3.l;
                ncz nczVar5 = (ncz) CollectionsKt.firstOrNull(list3);
                pz40Var2.setValue(Boolean.valueOf(nczVar5 != null && nczVar5.f23317a == 0 && (i5 = nczVar5.p) >= 0 && i5 + nczVar5.q <= i13));
                ncz nczVar6 = (ncz) CollectionsKt.f0(list3);
                if (nczVar6 != null) {
                    if (nczVar6.f23317a == mczVar3.o - 1 && (i6 = nczVar6.p) >= 0 && i6 + nczVar6.q <= i13) {
                        z = true;
                    }
                }
                pz40Var.setValue(Boolean.valueOf(z));
                break;
            case 3:
                mcz mczVar4 = (mcz) obj;
                mczVar4.getClass();
                int i14 = mczVar4.n;
                List list4 = mczVar4.l;
                ncz nczVar7 = (ncz) CollectionsKt.firstOrNull(list4);
                pz40Var2.setValue(Boolean.valueOf(nczVar7 != null && nczVar7.f23317a == 0 && (i7 = nczVar7.p) >= 0 && i7 + nczVar7.q <= i14));
                ncz nczVar8 = (ncz) CollectionsKt.f0(list4);
                if (nczVar8 != null) {
                    if (nczVar8.f23317a == mczVar4.o - 1 && (i8 = nczVar8.p) >= 0 && i8 + nczVar8.q <= i14) {
                        z = true;
                    }
                }
                pz40Var.setValue(Boolean.valueOf(z));
                break;
            default:
                mcz mczVar5 = (mcz) obj;
                mczVar5.getClass();
                int i15 = mczVar5.n;
                List list5 = mczVar5.l;
                ncz nczVar9 = (ncz) CollectionsKt.firstOrNull(list5);
                pz40Var2.setValue(Boolean.valueOf(nczVar9 != null && nczVar9.f23317a == 0 && (i9 = nczVar9.p) >= 0 && i9 + nczVar9.q <= i15));
                ncz nczVar10 = (ncz) CollectionsKt.f0(list5);
                if (nczVar10 != null) {
                    if (nczVar10.f23317a == mczVar5.o - 1 && (i10 = nczVar10.p) >= 0 && i10 + nczVar10.q <= i15) {
                        z = true;
                    }
                }
                pz40Var.setValue(Boolean.valueOf(z));
                break;
        }
        return Unit.f46060a;
    }
}
