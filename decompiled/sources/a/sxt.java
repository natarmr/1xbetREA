package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.ExpandBtnView;

/* JADX INFO: loaded from: classes4.dex */
public final class sxt implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32996a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public sxt(cp cpVar, xcz xczVar, boolean z, i4 i4Var) {
        this.f32996a = (byte) 2;
        this.b = cpVar;
        this.e = xczVar;
        this.d = z;
        this.c = i4Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        rxt rxtVar;
        vxt vxtVar;
        int i;
        byte b = this.f32996a;
        Object obj2 = this.c;
        boolean z = this.d;
        Object obj3 = this.e;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof rxt) {
                    rxtVar = (rxt) yjeVar;
                    int i2 = rxtVar.j;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        rxtVar.j = i2 - Integer.MIN_VALUE;
                    } else {
                        rxtVar = new rxt(this, yjeVar);
                    }
                } else {
                    rxtVar = new rxt(this, yjeVar);
                }
                Object obj5 = rxtVar.i;
                wne wneVar = wne.f39444a;
                int i3 = rxtVar.j;
                if (i3 == 0) {
                    z1x.P(obj5);
                    knb knbVar = (knb) obj3;
                    knb knbVarA = knb.a(knbVar, ((mci) obj2).i(knbVar.f18576a, (z9s) obj, z));
                    rxtVar.j = 1;
                    if (((kmq) obj4).a(knbVarA, rxtVar) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i3 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj5);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof vxt) {
                    vxtVar = (vxt) yjeVar;
                    int i4 = vxtVar.j;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        vxtVar.j = i4 - Integer.MIN_VALUE;
                    } else {
                        vxtVar = new vxt(this, yjeVar);
                    }
                } else {
                    vxtVar = new vxt(this, yjeVar);
                }
                Object obj6 = vxtVar.i;
                wne wneVar2 = wne.f39444a;
                int i5 = vxtVar.j;
                if (i5 == 0) {
                    z1x.P(obj6);
                    kmq kmqVar = (kmq) obj4;
                    z9s z9sVar = (z9s) obj;
                    List<zlb> list = (List) obj3;
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    for (zlb zlbVar : list) {
                        arrayList.add(zlb.a(zlbVar, ((mci) obj2).i(zlbVar.c, z9sVar, z)));
                    }
                    vxtVar.j = 1;
                    if (kmqVar.a(arrayList, vxtVar) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i5 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj6);
                }
                return Unit.f46060a;
            default:
                ExpandBtnView expandBtnView = ((vsx) ((cp) obj4).u).b;
                int size = ((i4) obj2).size();
                List list2 = ((xcz) obj3).j().l;
                if (list2.isEmpty()) {
                    i = 8;
                } else {
                    int i6 = ((ncz) CollectionsKt.U(list2)).f23317a;
                    int i7 = ((ncz) CollectionsKt.d0(list2)).f23317a + 1;
                    if (!z && size - i7 <= 0 && i6 == 0) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                }
                expandBtnView.setVisibility(i);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ sxt(kmq kmqVar, Object obj, mci mciVar, boolean z, byte b) {
        this.f32996a = b;
        this.b = kmqVar;
        this.e = obj;
        this.c = mciVar;
        this.d = z;
    }
}
