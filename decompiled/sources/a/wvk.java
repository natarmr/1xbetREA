package a;

import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.camera.view.PreviewView;

/* JADX INFO: loaded from: classes.dex */
public final class wvk implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39841a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wvk(Object obj, byte b) {
        this.f39841a = b;
        this.b = obj;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        switch (this.f39841a) {
            case 0:
                xvk xvkVar = (xvk) this.b;
                synchronized (xvkVar.c) {
                    xvkVar.d = null;
                    xvkVar.f = null;
                }
                return;
            default:
                return;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        switch (this.f39841a) {
            case 0:
                xvk xvkVar = (xvk) this.b;
                synchronized (xvkVar.c) {
                    xvkVar.d = null;
                    xvkVar.f = null;
                }
                return;
            default:
                PreviewView previewView = (PreviewView) this.b;
                Display defaultDisplay = previewView.getDefaultDisplay();
                if (defaultDisplay == null || defaultDisplay.getDisplayId() != i) {
                    return;
                }
                previewView.a();
                return;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        switch (this.f39841a) {
            case 0:
                xvk xvkVar = (xvk) this.b;
                synchronized (xvkVar.c) {
                    xvkVar.d = null;
                    xvkVar.f = null;
                }
                return;
            default:
                return;
        }
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }
}
