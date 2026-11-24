package a;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class g3 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10586a;
    public final Object b;

    public /* synthetic */ g3(Object obj, byte b) {
        this.f10586a = b;
        this.b = obj;
    }

    @Override // a.u1
    public final int b() {
        byte b = this.f10586a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((h3) obj).c();
            case 1:
                return ((bh30) obj).f2586a.groupCount() + 1;
            case 2:
                return ((dh90) obj).e;
            case 3:
                return ((eh90) obj).e;
            default:
                return ((uh90) obj).f.c();
        }
    }

    @Override // a.u1, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        byte b = this.f10586a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((h3) obj2).containsValue(obj);
            case 1:
                if (obj == null ? true : obj instanceof MatchGroup) {
                    return super.contains((MatchGroup) obj);
                }
                return false;
            case 2:
                return ((dh90) obj2).containsValue(obj);
            case 3:
                return ((eh90) obj2).containsValue(obj);
            default:
                return ((uh90) obj2).containsValue(obj);
        }
    }

    public MatchGroup e(int i) {
        Matcher matcher = ((bh30) this.b).f2586a;
        IntRange intRangeO = l1e0.o(matcher.start(i), matcher.end(i));
        if (intRangeO.f46068a < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return new MatchGroup(strGroup, intRangeO);
    }

    @Override // a.u1, java.util.Collection
    public boolean isEmpty() {
        switch (this.f10586a) {
            case 1:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.f10586a;
        int i = 0;
        byte b2 = 1;
        byte b3 = 2;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new e3(((h3) obj).a().iterator(), (byte) 1);
            case 1:
                return new pls0(pgi0.p(new sx3(q3d.h(this), b2), new b530(this, b3)));
            case 2:
                nqs0 nqs0Var = ((dh90) obj).d;
                nqs0Var.getClass();
                pqs0[] pqs0VarArr = new pqs0[8];
                while (i < 8) {
                    pqs0VarArr[i] = new qqs0((byte) 2);
                    i++;
                }
                return new qh90(nqs0Var, pqs0VarArr);
            case 3:
                oqs0 oqs0Var = ((eh90) obj).d;
                pqs0[] pqs0VarArr2 = new pqs0[8];
                while (i < 8) {
                    pqs0VarArr2[i] = new rqs0((byte) 2);
                    i++;
                }
                return new rh90(oqs0Var, pqs0VarArr2);
            default:
                return new zh90((uh90) obj, (byte) 2);
        }
    }
}
