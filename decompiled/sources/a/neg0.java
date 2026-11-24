package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class neg0 extends b7z {
    public static final neg0 c = new neg0("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ neg0(String str, byte b) {
        super(str);
        this.b = b;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        switch (this.b) {
            case 0:
                int size = list.size();
                if (size == 0) {
                    return vj30.x(vj30Var, p4e.k(j), p4e.j(j), new wtf0((byte) 15));
                }
                if (size == 1) {
                    pu90 pu90VarS = ((pj30) list.get(0)).S(j);
                    return vj30.x(vj30Var, r4e.g(pu90VarS.f27604a, j), r4e.f(pu90VarS.b, j), new cam(pu90VarS, (byte) 27));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    pu90 pu90VarS2 = ((pj30) list.get(i)).S(j);
                    iMax = Math.max(pu90VarS2.f27604a, iMax);
                    iMax2 = Math.max(pu90VarS2.b, iMax2);
                    arrayList.add(pu90VarS2);
                }
                return vj30.x(vj30Var, r4e.g(iMax, j), r4e.f(iMax2, j), new uy2(arrayList, (byte) 14));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
