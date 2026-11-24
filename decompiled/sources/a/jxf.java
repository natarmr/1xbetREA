package a;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes2.dex */
public final class jxf extends dxn {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jxf(cxn cxnVar, byte b) {
        super(cxnVar);
        this.e = b;
    }

    @Override // a.dxn
    public void q() {
        switch (this.e) {
            case 0:
                cxn cxnVar = this.b;
                cxnVar.o = null;
                CheckableImageButton checkableImageButton = cxnVar.g;
                checkableImageButton.setOnLongClickListener(null);
                cww.J(checkableImageButton, null);
                break;
        }
    }
}
