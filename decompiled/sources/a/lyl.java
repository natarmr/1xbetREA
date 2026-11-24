package a;

import android.content.Context;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;
import org.xplatform.uikit.components.chips.DsChipsLinearLayoutManager;
import org.xplatform.uikit.components.views.OptimizedScrollRecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class lyl extends OptimizedScrollRecyclerView implements iyl {
    public final oyl o2;
    public wxl p2;
    public wyl q2;
    public uyl r2;
    public List s2;
    public final pyl t2;
    public boolean u2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyl(Context context) {
        super(context, null, 4, 0);
        context.getClass();
        androidx.recyclerview.widget.b dsChipsLinearLayoutManager = new DsChipsLinearLayoutManager(context);
        this.p2 = wxl.PRIMARY;
        this.q2 = wyl.f39978a;
        uyl uylVar = uyl.f36494a;
        this.r2 = uylVar;
        this.s2 = iun.f15405a;
        pyl pylVar = new pyl(getResources().getDimensionPixelSize(R.dimen.extra_large_horizontal_margin_dynamic));
        this.t2 = pylVar;
        setId(R.id.dsChipsHorizontal);
        setLayoutManager(dsChipsLinearLayoutManager);
        oyl oylVar = new oyl(oyl.j);
        oylVar.h = uylVar;
        oylVar.i = -1;
        this.o2 = oylVar;
        setAdapter(oylVar);
        m(pylVar);
        setItemAnimator(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        this.u2 = parcelable != null;
    }

    @Override // a.iyl
    public void setChips(List<mxl> list) {
        nwl lwlVar;
        hwl hwlVar;
        list.getClass();
        wxl wxlVar = this.p2;
        wxlVar.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (mxl mxlVar : list) {
            String str = mxlVar.f22560a;
            fxl fxlVar = mxlVar.b;
            if (fxlVar != null) {
                if (fxlVar instanceof exl) {
                    lwlVar = mwl.f22509a;
                } else {
                    if (fxlVar instanceof cxl) {
                        throw null;
                    }
                    if (fxlVar instanceof axl) {
                        throw null;
                    }
                    if (fxlVar instanceof bxl) {
                        lwlVar = new jwl();
                    } else if (fxlVar instanceof dxl) {
                        lwlVar = new lwl(((dxl) fxlVar).f6851a);
                    }
                }
                kxl kxlVar = mxlVar.c;
                if (kxlVar != null) {
                    if (kxlVar instanceof jxl) {
                        zwl zwlVar = mxlVar.d;
                        if (zwlVar != null) {
                            if (zwlVar instanceof xwl) {
                                hwlVar = fwl.f10266a;
                            } else if (zwlVar instanceof ywl) {
                                hwlVar = gwl.f12032a;
                            } else if (zwlVar instanceof wwl) {
                                throw null;
                            }
                            hwl hwlVar2 = hwlVar;
                            arrayList.add(new twl(str, lwlVar, rwl.f31221a, hwlVar2, mxlVar.e, wxlVar, new xjl((byte) 12)));
                        }
                        t9f.b();
                        return;
                    }
                    if ((kxlVar instanceof ixl) || (kxlVar instanceof gxl) || (kxlVar instanceof hxl)) {
                        throw null;
                    }
                }
                t9f.b();
                return;
            }
            t9f.b();
            return;
        }
        this.s2 = arrayList;
        oyl oylVar = this.o2;
        if (!Intrinsics.d(((yz3) oylVar.e).f, arrayList)) {
            oylVar.H(arrayList, new a4e(this, arrayList, (byte) 26));
        }
        oylVar.f = new edl(this, (byte) 11);
    }

    @Override // a.iyl
    public void setCustomHorizontalMargin(int i) {
        this.t2.f27805a = i;
        b0();
    }

    @Override // a.iyl
    public void setLoading(boolean z) {
        oyl oylVar = this.o2;
        if (!z) {
            List list = this.s2;
            if (Intrinsics.d(((yz3) oylVar.e).f, list)) {
                return;
            }
            oylVar.H(list, new kyl(this, list));
            return;
        }
        IntRange intRange = new IntRange(1, 6, 1);
        ArrayList arrayList = new ArrayList(r3d.q(intRange, 10));
        Iterator it = intRange.iterator();
        while (((kkx) it).c) {
            ((bkx) it).nextInt();
            arrayList.add(new txl(this.q2));
        }
        oylVar.G(arrayList);
    }

    @Override // a.iyl
    public void setOnChipClickListener(Function2<? super mxl, ? super Integer, Unit> function2) {
        this.o2.g = function2;
    }

    @Override // a.iyl
    public void setSelectionMode(uyl uylVar) {
        uylVar.getClass();
        oyl oylVar = this.o2;
        oylVar.getClass();
        uylVar.getClass();
        oylVar.h = uylVar;
        this.r2 = uylVar;
    }

    @Override // a.iyl
    public void setSkeletonStyle(wyl wylVar) {
        wylVar.getClass();
        this.q2 = wylVar;
    }

    @Override // a.iyl
    public void setStyle(wxl wxlVar) {
        wxlVar.getClass();
        this.p2 = wxlVar;
    }
}
