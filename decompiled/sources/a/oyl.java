package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.chips.DsChip;

/* JADX INFO: loaded from: classes6.dex */
public final class oyl extends q4 {
    public static final ek5 j = new ek5((byte) 21);
    public edl f;
    public Function2 g;
    public uyl h;
    public int i;

    @Override // a.q4
    public final void E(List list, List list2) {
        list.getClass();
        list2.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof twl) {
                arrayList.add(obj);
            }
        }
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            if (((twl) obj2).e) {
                this.i = i;
            }
            i = i2;
        }
    }

    @Override // a.q4, a.yge0
    public final int f(int i) {
        return ((eyl) A(i)).a().ordinal();
    }

    @Override // a.q4, a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        ColorStateList colorStateListValueOf;
        if (!(xhe0Var instanceof myl)) {
            if (xhe0Var instanceof nyl) {
                View view = xhe0Var.f40887a;
                Object objA = A(i);
                objA.getClass();
                int iOrdinal = ((txl) objA).f34705a.ordinal();
                if (iOrdinal == 0) {
                    Context context = view.getContext();
                    context.getClass();
                    colorStateListValueOf = ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary20, context));
                } else if (iOrdinal != 1) {
                    t9f.b();
                    return;
                } else {
                    Context context2 = view.getContext();
                    context2.getClass();
                    colorStateListValueOf = ColorStateList.valueOf(m5d.b(R.attr.uikitStaticWhite60, context2));
                }
                colorStateListValueOf.getClass();
                Drawable background = ((nyl) xhe0Var).u.getBackground();
                GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(colorStateListValueOf);
                    return;
                }
                return;
            }
            return;
        }
        Object objA2 = A(i);
        objA2.getClass();
        twl twlVar = (twl) objA2;
        DsChip dsChip = ((myl) xhe0Var).u;
        dsChip.setStyle(sac.r0(twlVar.f));
        dsChip.setText(twlVar.f34655a);
        dsChip.setEnabled(true);
        dsChip.setSelected(twlVar.e);
        dsChip.setValueText(null);
        dsChip.setCount(null);
        dsChip.setUnlimitedLines(false);
        dsChip.setTextMaxLines(null);
        dsChip.setBadge(null);
        dsChip.setTextActiveColor(null);
        dsChip.setBackgroundActiveColor(null);
        dsChip.setLeftIconRadius(0.0f);
        dsChip.setRightIconRadius(0.0f);
        hwl hwlVar = twlVar.d;
        if (hwlVar instanceof ewl) {
            throw null;
        }
        if (Intrinsics.d(hwlVar, gwl.f12032a)) {
            dsChip.setIconTint(null);
        } else if (!Intrinsics.d(hwlVar, fwl.f10266a)) {
            t9f.b();
            return;
        }
        nwl nwlVar = twlVar.b;
        if ((nwlVar instanceof iwl) || (nwlVar instanceof kwl)) {
            throw null;
        }
        if (!Intrinsics.d(nwlVar, mwl.f22509a)) {
            if (nwlVar instanceof jwl) {
                dsChip.setLeftIcon(R.drawable.ic_glyph_circle_check);
            } else {
                if (!(nwlVar instanceof lwl)) {
                    t9f.b();
                    return;
                }
                dsChip.e(((lwl) nwlVar).f20769a, epv0.U(R.drawable.ic_glyph_category_new, dsChip.getContext()));
            }
        }
        swl swlVar = twlVar.c;
        if (swlVar != null) {
            if ((swlVar instanceof qwl) || (swlVar instanceof owl)) {
                throw null;
            }
            if (swlVar instanceof pwl) {
                dsChip.getContext();
                throw null;
            }
            if (swlVar instanceof rwl) {
                View view2 = xhe0Var.f40887a;
                view2.getClass();
                dyb.c0(view2, new dpl(this, xhe0Var, (byte) 4));
                return;
            }
        }
        t9f.b();
    }

    @Override // a.yge0
    public final void o(xhe0 xhe0Var, int i, List list) {
        list.getClass();
        if (list.isEmpty() || !(xhe0Var instanceof myl)) {
            n(xhe0Var, i);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            obj.getClass();
            w3d.u(arrayList, (Collection) obj);
        }
        Set setP0 = CollectionsKt.P0(arrayList);
        DsChip dsChip = ((myl) xhe0Var).u;
        setP0.getClass();
        for (Object obj2 : setP0) {
            if (obj2 != null) {
                if (obj2 instanceof sxl) {
                    dsChip.setSelected(((sxl) obj2).f32982a);
                } else if (obj2 instanceof pxl) {
                    dsChip.setEnabled(true);
                } else if (obj2 instanceof nxl) {
                    dsChip.setBadge(null);
                } else if (obj2 instanceof oxl) {
                    dsChip.setCount(null);
                } else if (obj2 instanceof qxl) {
                    nwl nwlVar = ((qxl) obj2).f29489a;
                    if (nwlVar instanceof iwl) {
                        throw null;
                    }
                    if (nwlVar instanceof kwl) {
                        throw null;
                    }
                    if (nwlVar instanceof jwl) {
                        dsChip.setLeftIcon(R.drawable.ic_glyph_circle_check);
                    } else if (nwlVar instanceof lwl) {
                        dsChip.e(((lwl) nwlVar).f20769a, epv0.U(R.drawable.ic_glyph_category_new, dsChip.getContext()));
                    } else {
                        if (!Intrinsics.d(nwlVar, mwl.f22509a)) {
                            t9f.b();
                            return;
                        }
                        dsChip.setLeftIcon((Drawable) null);
                    }
                } else if (obj2 instanceof rxl) {
                    swl swlVar = ((rxl) obj2).f31270a;
                    if (swlVar instanceof qwl) {
                        throw null;
                    }
                    if (swlVar instanceof owl) {
                        throw null;
                    }
                    if (!Intrinsics.d(swlVar, rwl.f31221a)) {
                        if (swlVar instanceof pwl) {
                            dsChip.getContext();
                            throw null;
                        }
                        t9f.b();
                        return;
                    }
                    dsChip.setRightIcon(null);
                } else {
                    continue;
                }
            }
        }
    }

    @Override // a.q4, a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        int iOrdinal = ((uwl) uwl.d.get(i)).ordinal();
        if (iOrdinal == 0) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ds_chip_shimmer, viewGroup, false);
            viewInflate.getClass();
            return new nyl(viewInflate);
        }
        if (iOrdinal != 1) {
            t9f.b();
            return null;
        }
        Context context = viewGroup.getContext();
        context.getClass();
        DsChip dsChip = new DsChip(context, null);
        dsChip.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, dsChip.getContext().getResources().getDimensionPixelSize(R.dimen.size_48)));
        dsChip.setPaddingRelative(dsChip.getResources().getDimensionPixelSize(R.dimen.space_4), dsChip.getResources().getDimensionPixelSize(R.dimen.space_8), dsChip.getResources().getDimensionPixelSize(R.dimen.space_4), dsChip.getResources().getDimensionPixelSize(R.dimen.space_8));
        return new myl(dsChip);
    }
}
