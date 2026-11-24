package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class iom implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15124a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iom(long j, wom womVar) {
        this.f15124a = (byte) 1;
        this.b = j;
        this.c = womVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f15124a;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                wom womVar = (wom) obj4;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Boolean bool = (Boolean) ((hgk0) womVar.c).getValue();
                    bool.getClass();
                    jwb.e(bool, null, null, null, u1c.M(230934785, new iom(this.b, womVar), fetVar), fetVar, 24576, 14);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                wom womVar2 = (wom) obj4;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.h(zBooleanValue) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    long j = this.b;
                    if (zBooleanValue) {
                        fetVar2.e0(-759360737);
                        p3c0.a(o7k0.n(jm40.b, mom.f22141a), j, mom.d, 0L, 0, 0.0f, fetVar2, 390, 56);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-759149038);
                        boolean zG = fetVar2.g(womVar2);
                        Object objP = fetVar2.P();
                        if (zG || objP == ukd.f35823a) {
                            objP = new ntl(womVar2, (byte) 8);
                            fetVar2.o0(objP);
                        }
                        mom.a(j, (Function0) objP, fetVar2, 0);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                break;
            default:
                mm40 mm40Var = (mm40) obj4;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    zcl zclVar = qmk.f28987a;
                    dww.c(a8k0.F(R.drawable.ic_glyph_bet_on_player, 0, fetVar3), null, o7k0.n(mm40Var, 20.0f), this.b, fetVar3, 56, 0);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ iom(Object obj, long j, byte b) {
        this.f15124a = b;
        this.c = obj;
        this.b = j;
    }
}
