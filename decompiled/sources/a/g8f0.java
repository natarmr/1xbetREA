package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class g8f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1f0 f10862a;
    public final iw20 b;
    public final knf0 c;
    public final mne d;

    public g8f0(e1f0 e1f0Var, iw20 iw20Var, knf0 knf0Var, mne mneVar) {
        e1f0Var.getClass();
        knf0Var.getClass();
        this.f10862a = e1f0Var;
        this.b = iw20Var;
        this.c = knf0Var;
        this.d = mneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(zje zjeVar) {
        e8f0 e8f0Var;
        q0f0 xze0Var;
        if (zjeVar instanceof e8f0) {
            e8f0Var = (e8f0) zjeVar;
            int i = e8f0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                e8f0Var.k = i - Integer.MIN_VALUE;
            } else {
                e8f0Var = new e8f0(this, zjeVar);
            }
        } else {
            e8f0Var = new e8f0(this, zjeVar);
        }
        Object objW0 = e8f0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = e8f0Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objW0);
            e8f0Var.k = 1;
            objW0 = sj3.w0(e8f0Var, ((xue0) this.f10862a.f7033a.getValue()).f41507a, new st20(2, yjeVar, (byte) 25), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW0);
        }
        List list = (List) objW0;
        list.getClass();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(Integer.valueOf(((fze0) obj).b))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((fze0) it.next()).b));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            ArrayList arrayList4 = new ArrayList();
            ArrayList<fze0> arrayList5 = new ArrayList();
            for (Object obj2 : list) {
                if (((fze0) obj2).b == iIntValue) {
                    arrayList5.add(obj2);
                }
            }
            for (fze0 fze0Var : arrayList5) {
                String str = fze0Var.c;
                boolean z = fze0Var.e;
                boolean z2 = fze0Var.d;
                switch (str) {
                    case "NotifyNewsCall":
                        xze0Var = new xze0(z2, z);
                        break;
                    case "CommercialCommunicationSettings":
                        xze0Var = new mze0(z2, z);
                        break;
                    case "PassportDateIssue":
                        xze0Var = new zze0(z2, z);
                        break;
                    case "VidDoc":
                        xze0Var = new qze0(z2, z);
                        break;
                    case "RepeatPassword":
                        xze0Var = new h0f0(z2, z);
                        break;
                    case "RulesConfirmation":
                        xze0Var = new i0f0(z2, z);
                        break;
                    case "SurnameTwo":
                        xze0Var = new k0f0(z2, z);
                        break;
                    case "MediaSourceId":
                        xze0Var = vze0.c;
                        break;
                    case "CountryId":
                        xze0Var = new nze0(z2, z);
                        break;
                    case "RegionId":
                        xze0Var = new g0f0(z2, z);
                        break;
                    case "SocialNetId":
                        xze0Var = new p0f0(z2, z);
                        break;
                    case "Surname":
                        xze0Var = new uze0(z2, z);
                        break;
                    case "Sex":
                        xze0Var = new tze0(z2, z);
                        break;
                    case "Name":
                        xze0Var = new sze0(z2, z);
                        break;
                    case "Email":
                        xze0Var = new rze0(z2, z);
                        break;
                    case "Phone":
                        xze0Var = new c0f0(z2, z);
                        break;
                    case "SharePersonalDataConfirmation":
                        xze0Var = new o0f0(z2, z);
                        break;
                    case "AppsflyerId":
                        xze0Var = ize0.c;
                        break;
                    case "Address":
                        xze0Var = new gze0(z2, z);
                        break;
                    case "Postcode":
                        xze0Var = new e0f0(z2, z);
                        break;
                    case "CurrencyId":
                        xze0Var = new oze0(z2, z);
                        break;
                    case "IsPoliticallyExposedPerson":
                        xze0Var = new d0f0(z2, z);
                        break;
                    case "PassportNumber":
                        xze0Var = new a0f0(z2, z);
                        break;
                    case "Birthday":
                        String str2 = fze0Var.f;
                        if (str2 == null) {
                            str2 = "";
                        }
                        xze0Var = new pze0(str2, z2, z);
                        break;
                    case "MiddleName":
                        xze0Var = new wze0(z2, z);
                        break;
                    case "Promocode":
                        xze0Var = new f0f0(z2, z);
                        break;
                    case "Password":
                        xze0Var = new b0f0(z2, z);
                        break;
                    case "PassportDateExpire":
                        xze0Var = new yze0(z2, z);
                        break;
                    case "RulesConfirmationAll":
                        xze0Var = new j0f0(z2, z);
                        break;
                    case "SendEmailBet":
                        xze0Var = new l0f0(z2, z);
                        break;
                    case "SendSmsEvents":
                        xze0Var = new n0f0(z2, z);
                        break;
                    case "Nationality":
                        xze0Var = new kze0(z2, z);
                        break;
                    case "SendEmailEvents":
                        xze0Var = new m0f0(z2, z);
                        break;
                    case "CityId":
                        xze0Var = new lze0(z2, z);
                        break;
                    case "FirstBonusChoice":
                        xze0Var = new jze0(z2, z);
                        break;
                    default:
                        xze0Var = null;
                        break;
                }
                if (xze0Var != null) {
                    arrayList4.add(xze0Var);
                }
            }
            q7f0.b.getClass();
            arrayList3.add(new b1f0(gne0.c(iIntValue), arrayList4));
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zje zjeVar) {
        f8f0 f8f0Var;
        if (zjeVar instanceof f8f0) {
            f8f0Var = (f8f0) zjeVar;
            int i = f8f0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                f8f0Var.k = i - Integer.MIN_VALUE;
            } else {
                f8f0Var = new f8f0(this, zjeVar);
            }
        } else {
            f8f0Var = new f8f0(this, zjeVar);
        }
        Object obj = f8f0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = f8f0Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            int iB = this.c.b();
            f8f0Var.k = 1;
            if (qjj.d0(this.d.b, new gc1((Object) this, iB, yjeVar, (byte) 16), f8f0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
