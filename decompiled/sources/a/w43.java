package a;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class w43 extends guy implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38526a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w43(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(3);
        this.f38526a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f38526a;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                u63 u63Var = (u63) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Number) obj3).intValue();
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj6;
                i53 i53Var = (i53) obj5;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? fetVar.g(u63Var) : fetVar.i(u63Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zG = fetVar.g(snapshotStateList) | fetVar.i(obj7) | fetVar.i(i53Var);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zG || objP == cl5Var) {
                        objP = new v43(snapshotStateList, obj7, i53Var, (byte) 0);
                        fetVar.o0(objP);
                    }
                    m0x0.n(u63Var, obj7, (Function1) objP, fetVar);
                    hz40 hz40Var = i53Var.d;
                    u63Var.getClass();
                    hz40Var.n(obj7, ((v63) u63Var).f36852a);
                    Object objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = new b53();
                        fetVar.o0(objP2);
                    }
                    ((ydr) obj4).j((b53) objP2, obj7, fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            default:
                fet fetVar2 = (fet) obj2;
                ((Number) obj3).intValue();
                Unit unit = Unit.f46060a;
                ((pz40) obj7).setValue(unit);
                ((lwf) obj6).getClass();
                nie0 nie0Var = (nie0) obj5;
                if (nie0Var.f23583a == cmd.f4598a) {
                    nie0Var.f23583a = cmd.b;
                }
                fetVar2.e0(-290703421);
                mm40 mm40VarK0 = mrv.k0(jm40.b, "CONTENT_ID");
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK0);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(e7z.u1);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC, gqw0.x);
                jpm0.o(fetVar2, bh90VarM, gqw0.w);
                jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar2);
                jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                pvm0.i(null, ((nts0) obj4).c, fetVar2, 0);
                fetVar2.r(true);
                fetVar2.r(false);
                return unit;
        }
    }
}
