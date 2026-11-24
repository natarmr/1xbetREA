package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zj4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44468a;
    public final /* synthetic */ String b;
    public final /* synthetic */ hk4 c;

    public /* synthetic */ zj4(String str, hk4 hk4Var, byte b) {
        this.f44468a = b;
        this.b = str;
        this.c = hk4Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:50:0x0174  */
    /* JADX WARN: Code duplicated, block: B:9:0x0047  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        List list;
        List list2;
        List list3;
        byte b = this.f44468a;
        hk4 hk4Var = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                oyg0 oyg0Var = (oyg0) obj;
                tj4 tj4Var = (tj4) obj2;
                oyg0Var.getClass();
                tj4Var.getClass();
                boolean z = false;
                if (tj4Var.o && str.length() != 0) {
                    z = true;
                }
                boolean z2 = z;
                q7x.F(oyg0Var, Boolean.valueOf(z2), "KEY_PASSWORD_RECOVER");
                String string = str.toString();
                q7x.F(oyg0Var, string, "KEY_PASSWORD");
                hd4 hd4VarA = hd4.a(string);
                if (((tj4) hk4Var.D()).f.f12852a.length() == 0) {
                    list = ((tj4) hk4Var.D()).j;
                } else {
                    List list4 = ((tj4) hk4Var.D()).j;
                    hh4 hh4Var = hh4.f13044a;
                    if (list4.contains(hh4Var)) {
                        List list5 = ((tj4) hk4Var.D()).j;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list5) {
                            if (!Intrinsics.d((lh4) obj3, hh4Var)) {
                                arrayList.add(obj3);
                            }
                        }
                        list = arrayList;
                    } else {
                        list = ((tj4) hk4Var.D()).j;
                    }
                }
                return tj4.a(tj4Var, false, false, false, null, hd4VarA, null, 0, false, list, null, z2, 48607);
            case 1:
                oyg0 oyg0Var2 = (oyg0) obj;
                tj4 tj4Var2 = (tj4) obj2;
                oyg0Var2.getClass();
                tj4Var2.getClass();
                id4 id4Var = tj4Var2.g;
                q7x.F(oyg0Var2, str, "KEY_PHONE");
                id4 id4VarA = id4.a(id4Var.d, str, id4Var.b, id4Var.c, id4Var.e);
                if (((tj4) hk4Var.D()).g.f14564a.length() == 0) {
                    list2 = ((tj4) hk4Var.D()).j;
                } else {
                    List list6 = ((tj4) hk4Var.D()).j;
                    ih4 ih4Var = ih4.f14763a;
                    boolean zContains = list6.contains(ih4Var);
                    kh4 kh4Var = kh4.f18271a;
                    if (zContains || ((tj4) hk4Var.D()).j.contains(kh4Var)) {
                        List list7 = ((tj4) hk4Var.D()).j;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : list7) {
                            lh4 lh4Var = (lh4) obj4;
                            if (!Intrinsics.d(lh4Var, ih4Var) && !Intrinsics.d(lh4Var, kh4Var)) {
                                arrayList2.add(obj4);
                            }
                        }
                        list2 = arrayList2;
                    } else {
                        list2 = ((tj4) hk4Var.D()).j;
                    }
                }
                return tj4.a(tj4Var2, false, false, false, null, null, id4VarA, 0, false, list2, null, false, 64959);
            default:
                oyg0 oyg0Var3 = (oyg0) obj;
                tj4 tj4Var3 = (tj4) obj2;
                oyg0Var3.getClass();
                tj4Var3.getClass();
                String string2 = str.toString();
                q7x.F(oyg0Var3, string2, "KEY_LOGIN");
                gd4 gd4VarA = gd4.a(string2);
                if (((tj4) hk4Var.D()).e.f11089a.length() == 0) {
                    list3 = ((tj4) hk4Var.D()).j;
                } else {
                    List list8 = ((tj4) hk4Var.D()).j;
                    gh4 gh4Var = gh4.f11281a;
                    if (list8.contains(gh4Var)) {
                        List list9 = ((tj4) hk4Var.D()).j;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : list9) {
                            if (!Intrinsics.d((lh4) obj5, gh4Var)) {
                                arrayList3.add(obj5);
                            }
                        }
                        list3 = arrayList3;
                    } else {
                        list3 = ((tj4) hk4Var.D()).j;
                    }
                }
                return tj4.a(tj4Var3, false, false, false, gd4VarA, null, null, 0, false, list3, null, false, 65007);
        }
    }
}
