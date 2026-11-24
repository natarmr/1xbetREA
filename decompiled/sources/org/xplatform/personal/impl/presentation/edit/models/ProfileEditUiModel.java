package org.xplatform.personal.impl.presentation.edit.models;

import a.p6t0;
import a.w2c0;
import a.xi70;
import android.os.Parcelable;
import java.util.Collection;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModel;", "La/p6t0;", "Landroid/os/Parcelable;", "Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;", "Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;", "Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelTitle;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class ProfileEditUiModel implements p6t0, Parcelable {
    public ProfileEditUiModel() {
        xi70 xi70Var = w2c0.f38441a;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof ProfileEditUiModelTitle) && (p6t0Var2 instanceof ProfileEditUiModelTitle)) {
            xi70 xi70Var = w2c0.f38441a;
            return true;
        }
        if ((p6t0Var instanceof ProfileEditUiModelItem) && (p6t0Var2 instanceof ProfileEditUiModelItem)) {
            if (((ProfileEditUiModelItem) p6t0Var).f46788a != ((ProfileEditUiModelItem) p6t0Var2).f46788a) {
                return false;
            }
        } else {
            if (!(p6t0Var instanceof ProfileEditUiModelItemClickable) || !(p6t0Var2 instanceof ProfileEditUiModelItemClickable)) {
                return p6t0Var.getClass().equals(p6t0Var2.getClass());
            }
            if (((ProfileEditUiModelItemClickable) p6t0Var).f46791a != ((ProfileEditUiModelItemClickable) p6t0Var2).f46791a) {
                return false;
            }
        }
        return true;
    }

    @Override // a.p6t0
    public Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof ProfileEditUiModelItem) && (p6t0Var2 instanceof ProfileEditUiModelItem)) {
            return ((ProfileEditUiModelItem) p6t0Var).o(p6t0Var, p6t0Var2);
        }
        if ((p6t0Var instanceof ProfileEditUiModelItemClickable) && (p6t0Var2 instanceof ProfileEditUiModelItemClickable)) {
            return ((ProfileEditUiModelItemClickable) p6t0Var).o(p6t0Var, p6t0Var2);
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public boolean getG() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public w2c0 getF46791a() {
        return w2c0.v;
    }
}
