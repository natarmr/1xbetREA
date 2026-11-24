package a;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.games_section.api.models.GamesActionsFragmentResultModel;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zz extends xo implements Function1 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zz(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.h = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j1r0 j1r0VarA;
        byte b = this.h;
        Object obj2 = this.f41192a;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((g00) obj2).y(th, new hhd((byte) 29));
                return Unit.f46060a;
            case 1:
                GamesActionsFragmentResultModel gamesActionsFragmentResultModel = (GamesActionsFragmentResultModel) obj;
                gamesActionsFragmentResultModel.getClass();
                o2t.c((androidx.fragment.app.e) obj2, gamesActionsFragmentResultModel, "");
                return Unit.f46060a;
            case 2:
                ((xz40) obj2).b((v9h0) obj);
                return Unit.f46060a;
            default:
                ofr0 ofr0Var = (ofr0) obj2;
                ser0 ser0Var = (ser0) ofr0Var.D();
                ser0Var.getClass();
                ArrayList arrayListL = xsm0.l(ser0Var);
                ArrayList<f0r0> arrayList = new ArrayList();
                for (Object obj3 : arrayListL) {
                    f0r0 f0r0Var = (f0r0) obj3;
                    f0r0Var.getClass();
                    if (!(f0r0Var.a() instanceof i1r0) || !(f0r0Var instanceof iyq0)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                for (f0r0 f0r0Var2 : arrayList) {
                    if (f0r0Var2 != null) {
                        if (f0r0Var2 instanceof zyq0) {
                            j1r0VarA = ((zyq0) f0r0Var2).a();
                        } else if (f0r0Var2 instanceof xxq0) {
                            j1r0VarA = ((xxq0) f0r0Var2).a();
                        } else if (f0r0Var2 instanceof zxq0) {
                            j1r0VarA = ((zxq0) f0r0Var2).a();
                        } else if (f0r0Var2 instanceof eyq0) {
                            j1r0VarA = ((eyq0) f0r0Var2).a();
                        } else if (f0r0Var2 instanceof hyq0) {
                            j1r0VarA = ((hyq0) f0r0Var2).a();
                        } else if (f0r0Var2 instanceof iyq0) {
                            j1r0VarA = ((iyq0) f0r0Var2).a();
                        } else if (f0r0Var2 instanceof b3r0) {
                            j1r0VarA = ((b3r0) f0r0Var2).a();
                        } else if (f0r0Var2 instanceof a3r0) {
                            j1r0VarA = ((a3r0) f0r0Var2).a();
                        } else if (f0r0Var2 instanceof h2r0) {
                            j1r0VarA = ((h2r0) f0r0Var2).a();
                        } else if (f0r0Var2 instanceof j2r0) {
                            j1r0VarA = ((j2r0) f0r0Var2).a();
                        } else if (f0r0Var2 instanceof n2r0) {
                            j1r0VarA = ((n2r0) f0r0Var2).a();
                        } else if (f0r0Var2 instanceof c4r0) {
                            j1r0VarA = ((c4r0) f0r0Var2).a();
                        } else if (f0r0Var2 instanceof s8r0) {
                            j1r0VarA = ((s8r0) f0r0Var2).a();
                        } else if (f0r0Var2 instanceof t8r0) {
                            j1r0VarA = ((t8r0) f0r0Var2).a();
                        } else if (f0r0Var2 instanceof u8r0) {
                            j1r0VarA = ((u8r0) f0r0Var2).a();
                        } else if (f0r0Var2 instanceof her0) {
                            j1r0VarA = ((her0) f0r0Var2).a();
                        } else if (f0r0Var2 instanceof ler0) {
                            j1r0VarA = ((ler0) f0r0Var2).a();
                        } else if (f0r0Var2 instanceof per0) {
                            j1r0VarA = ((per0) f0r0Var2).a();
                        } else if (f0r0Var2 instanceof qer0) {
                            j1r0VarA = ((qer0) f0r0Var2).a();
                        } else if (f0r0Var2 instanceof pfr0) {
                            j1r0VarA = ((pfr0) f0r0Var2).a();
                        }
                        arrayList2.add(Boolean.valueOf(j1r0VarA instanceof d1r0));
                    }
                    t9f.b();
                    return null;
                }
                if (arrayList2.isEmpty()) {
                    ofr0Var.Y(n8r0.b);
                } else {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (!((Boolean) it.next()).booleanValue()) {
                            c4m0 c4m0Var = ofr0Var.q0;
                            byte b2 = 1;
                            if (c4m0Var == null || !c4m0Var.isActive()) {
                                ofr0Var.q0 = kkb.Q(d5c.S(jiu0.a(ofr0Var), ofr0Var.p.f22085a), new cfr0(ofr0Var, (byte) 0), new cfr0(ofr0Var, b2), 48);
                            }
                        }
                    }
                    ofr0Var.Y(n8r0.b);
                }
                return Unit.f46060a;
        }
    }
}
