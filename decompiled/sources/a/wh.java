package a;

import android.R;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.ui.TrackSelectionView;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wh implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39140a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wh(Object obj, byte b) {
        this.f39140a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        byte b = this.f39140a;
        Message messageObtain = null;
        String strFlattenToShortString = null;
        messageObtain = null;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((xj) obj).c();
                break;
            case 1:
                i12 i12Var = (i12) obj;
                if (view == i12Var.h && (message3 = i12Var.j) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view == i12Var.k && (message2 = i12Var.m) != null) {
                    messageObtain = Message.obtain(message2);
                } else if (view == i12Var.n && (message = i12Var.p) != null) {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                i12Var.D.obtainMessage(1, i12Var.b).sendToTarget();
                break;
            case 2:
                wo8 wo8Var = (wo8) obj;
                if (wo8Var.k && wo8Var.isShowing()) {
                    if (!wo8Var.m) {
                        TypedArray typedArrayObtainStyledAttributes = wo8Var.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        wo8Var.l = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        wo8Var.m = true;
                    }
                    if (wo8Var.l) {
                        wo8Var.cancel();
                    }
                    break;
                }
                break;
            case 3:
                com.google.android.material.datepicker.e eVar = (com.google.android.material.datepicker.e) obj;
                int i = eVar.L1;
                if (i == 2) {
                    eVar.A0(1);
                } else if (i == 1) {
                    eVar.A0(2);
                }
                eVar.B0(eVar.l1);
                break;
            case 4:
                androidx.appcompat.widget.d dVar = (androidx.appcompat.widget.d) obj;
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = dVar.p;
                if (view == dVar.t) {
                    dVar.w(false);
                    searchView$SearchAutoComplete.requestFocus();
                    searchView$SearchAutoComplete.setImeVisibility(true);
                    View.OnClickListener onClickListener = dVar.p1;
                    if (onClickListener != null) {
                        onClickListener.onClick(dVar);
                    }
                    break;
                } else if (view == dVar.v) {
                    dVar.m();
                    break;
                } else if (view == dVar.u) {
                    dVar.q();
                    break;
                } else if (view != dVar.w) {
                    if (view == searchView$SearchAutoComplete) {
                        dVar.l();
                    }
                    break;
                } else {
                    SearchableInfo searchableInfo = dVar.D1;
                    if (searchableInfo != null) {
                        try {
                            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                                Intent intent = new Intent(dVar.k1);
                                ComponentName searchActivity = searchableInfo.getSearchActivity();
                                if (searchActivity != null) {
                                    strFlattenToShortString = searchActivity.flattenToShortString();
                                }
                                intent.putExtra("calling_package", strFlattenToShortString);
                                dVar.getContext().startActivity(intent);
                            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                                dVar.getContext().startActivity(dVar.k(dVar.l1, searchableInfo));
                            }
                        } catch (ActivityNotFoundException unused) {
                            Log.w("SearchView", "Could not find voice search activity");
                            return;
                        }
                        break;
                    }
                }
                break;
            case 5:
                fwq0 fwq0Var = ((Toolbar) obj).p1;
                hz30 hz30Var = fwq0Var != null ? fwq0Var.b : null;
                if (hz30Var != null) {
                    hz30Var.collapseActionView();
                }
                break;
            default:
                TrackSelectionView trackSelectionView = (TrackSelectionView) obj;
                int i2 = TrackSelectionView.m;
                HashMap map = trackSelectionView.g;
                if (view == trackSelectionView.c) {
                    trackSelectionView.l = true;
                    map.clear();
                } else if (view == trackSelectionView.d) {
                    trackSelectionView.l = false;
                    map.clear();
                } else {
                    trackSelectionView.l = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    tcs0 tcs0Var = (tcs0) tag;
                    qds0 qds0Var = tcs0Var.f33734a;
                    ccs0 ccs0Var = qds0Var.b;
                    int i3 = tcs0Var.b;
                    pcs0 pcs0Var = (pcs0) map.get(ccs0Var);
                    if (pcs0Var == null) {
                        if (!trackSelectionView.i && !map.isEmpty()) {
                            map.clear();
                        }
                        map.put(ccs0Var, new pcs0(ccs0Var, b4x.t(Integer.valueOf(i3))));
                    } else {
                        ArrayList arrayList = new ArrayList(pcs0Var.b);
                        boolean zIsChecked = ((CheckedTextView) view).isChecked();
                        Object[] objArr = trackSelectionView.h && qds0Var.c;
                        if (objArr != false || (trackSelectionView.i && trackSelectionView.f.size() > 1)) {
                            z = true;
                        }
                        if (zIsChecked && z) {
                            arrayList.remove(Integer.valueOf(i3));
                            if (arrayList.isEmpty()) {
                                map.remove(ccs0Var);
                            } else {
                                map.put(ccs0Var, new pcs0(ccs0Var, arrayList));
                            }
                        } else if (!zIsChecked) {
                            if (objArr == true) {
                                arrayList.add(Integer.valueOf(i3));
                                map.put(ccs0Var, new pcs0(ccs0Var, arrayList));
                            } else {
                                map.put(ccs0Var, new pcs0(ccs0Var, b4x.t(Integer.valueOf(i3))));
                            }
                        }
                    }
                }
                trackSelectionView.a();
                break;
        }
    }
}
