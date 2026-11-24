package a;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class lja implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20139a;
    public final /* synthetic */ cp b;
    public final /* synthetic */ gkz c;
    public final /* synthetic */ gkz d;
    public final /* synthetic */ cp e;

    public /* synthetic */ lja(cp cpVar, gkz gkzVar, gkz gkzVar2, cp cpVar2, byte b) {
        this.f20139a = b;
        this.b = cpVar;
        this.c = gkzVar;
        this.d = gkzVar2;
        this.e = cpVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f20139a;
        cp cpVar = this.e;
        gkz gkzVar = this.d;
        gkz gkzVar2 = this.c;
        cp cpVar2 = this.b;
        switch (b) {
            case 0:
                List list = (List) obj;
                list.getClass();
                if (list.isEmpty()) {
                    lka lkaVar = (lka) cpVar2.u();
                    String str = lkaVar.e;
                    String str2 = lkaVar.f;
                    int length = str.length();
                    yfu0 yfu0Var = cpVar2.u;
                    if (length > 0) {
                        msx msxVar = (msx) yfu0Var;
                        AppCompatTextView appCompatTextView = msxVar.e;
                        TextView textView = msxVar.d;
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
                        layoutParams.getClass();
                        a3e a3eVar = (a3e) layoutParams;
                        ((ViewGroup.MarginLayoutParams) a3eVar).height = -2;
                        appCompatTextView.setLayoutParams(a3eVar);
                        textView.setVisibility(0);
                        textView.setText(str);
                    } else {
                        ((msx) yfu0Var).d.setVisibility(8);
                    }
                    msx msxVar2 = (msx) yfu0Var;
                    AppCompatTextView appCompatTextView2 = msxVar2.f;
                    AppCompatTextView appCompatTextView3 = msxVar2.e;
                    jwb.y(appCompatTextView2);
                    msxVar2.f.setText(lkaVar.b);
                    appCompatTextView3.setVisibility(str2.length() > 0 ? 0 : 8);
                    appCompatTextView3.setText(str2);
                    msxVar2.g.u(lkaVar.g);
                    gkzVar2.A(lkaVar.c);
                    gkzVar.A(lkaVar.d);
                    msxVar2.f22345a.setLayoutDirection(((lka) cpVar2.u()).i ? 2 : 0);
                } else {
                    ArrayList<List> arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        obj2.getClass();
                        w3d.u(arrayList, (Collection) obj2);
                    }
                    for (List list2 : arrayList) {
                        ArrayList<ifs> arrayList2 = new ArrayList();
                        for (Object obj3 : list2) {
                            if (obj3 instanceof ifs) {
                                arrayList2.add(obj3);
                            }
                        }
                        for (ifs ifsVar : arrayList2) {
                            ifsVar.getClass();
                            if (!(ifsVar instanceof ifs)) {
                                t9f.b();
                                return null;
                            }
                            ((msx) cpVar.u).g.u(ifsVar.f14703a);
                        }
                    }
                }
                return Unit.f46060a;
            default:
                List list3 = (List) obj;
                list3.getClass();
                if (list3.isEmpty()) {
                    Object objU = cpVar2.u();
                    Context context = cpVar2.w;
                    mka mkaVar = (mka) objU;
                    String str3 = mkaVar.e;
                    ank0 ank0Var = mkaVar.f;
                    int length2 = str3.length();
                    yfu0 yfu0Var2 = cpVar2.u;
                    if (length2 > 0) {
                        msx msxVar3 = (msx) yfu0Var2;
                        msxVar3.d.setVisibility(0);
                        msxVar3.d.setText(str3);
                    } else {
                        ((msx) yfu0Var2).d.setVisibility(8);
                    }
                    msx msxVar4 = (msx) yfu0Var2;
                    AppCompatTextView appCompatTextView4 = msxVar4.f;
                    AppCompatTextView appCompatTextView5 = msxVar4.e;
                    jwb.z(appCompatTextView4);
                    msxVar4.f.setText(mkaVar.b.b(context));
                    jwb.A(appCompatTextView5);
                    appCompatTextView5.setVisibility(ank0Var.a().length() > 0 ? 0 : 8);
                    appCompatTextView5.setText(ank0Var.b(context));
                    msxVar4.g.u(mkaVar.g);
                    gkzVar2.A(mkaVar.c);
                    gkzVar.A(mkaVar.d);
                    msxVar4.f22345a.setLayoutDirection(((mka) cpVar2.u()).i ? 2 : 0);
                } else {
                    ArrayList<List> arrayList3 = new ArrayList();
                    for (Object obj4 : list3) {
                        obj4.getClass();
                        w3d.u(arrayList3, (Collection) obj4);
                    }
                    for (List list4 : arrayList3) {
                        ArrayList<mfs> arrayList4 = new ArrayList();
                        for (Object obj5 : list4) {
                            if (obj5 instanceof mfs) {
                                arrayList4.add(obj5);
                            }
                        }
                        for (mfs mfsVar : arrayList4) {
                            Context context2 = cpVar.w;
                            yfu0 yfu0Var3 = cpVar.u;
                            mfsVar.getClass();
                            if (mfsVar instanceof jfs) {
                                ((msx) yfu0Var3).e.setText(((jfs) mfsVar).f16443a.b(context2));
                            } else if (mfsVar instanceof kfs) {
                                ((msx) yfu0Var3).f.setText(((kfs) mfsVar).f18210a.b(context2));
                            } else {
                                if (!(mfsVar instanceof lfs)) {
                                    t9f.b();
                                    return null;
                                }
                                ((msx) yfu0Var3).g.u(((lfs) mfsVar).f19973a);
                            }
                        }
                    }
                }
                return Unit.f46060a;
        }
    }
}
