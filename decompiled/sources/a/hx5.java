package a;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class hx5 implements Window.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13797a;
    public final /* synthetic */ Window.Callback b;
    public final /* synthetic */ Window.Callback c;

    public /* synthetic */ hx5(Window.Callback callback, byte b) {
        this.f13797a = b;
        this.c = callback;
        this.b = callback;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        byte b = this.f13797a;
        Window.Callback callback = this.b;
        switch (b) {
            case 0:
                break;
        }
        return callback.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        byte b = this.f13797a;
        Window.Callback callback = this.b;
        switch (b) {
            case 0:
                break;
        }
        return callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        byte b = this.f13797a;
        Window.Callback callback = this.b;
        switch (b) {
            case 0:
                break;
        }
        return callback.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        byte b = this.f13797a;
        Window.Callback callback = this.b;
        switch (b) {
            case 0:
                break;
        }
        return callback.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        byte b = this.f13797a;
        Window.Callback callback = this.c;
        motionEvent.getClass();
        switch (b) {
            case 0:
                try {
                    return callback.dispatchTouchEvent(motionEvent);
                } catch (NullPointerException e) {
                    if (StringsKt.O(tjo.b(e), "resetCancelNextUpFlag", false)) {
                        return false;
                    }
                    throw e;
                }
            default:
                try {
                    return callback.dispatchTouchEvent(motionEvent);
                } catch (NullPointerException e2) {
                    if (StringsKt.O(tjo.b(e2), "resetCancelNextUpFlag", false)) {
                        return false;
                    }
                    throw e2;
                }
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        byte b = this.f13797a;
        Window.Callback callback = this.b;
        switch (b) {
            case 0:
                break;
        }
        return callback.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        byte b = this.f13797a;
        Window.Callback callback = this.b;
        switch (b) {
            case 0:
                callback.onActionModeFinished(actionMode);
                break;
            default:
                callback.onActionModeFinished(actionMode);
                break;
        }
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        byte b = this.f13797a;
        Window.Callback callback = this.b;
        switch (b) {
            case 0:
                callback.onActionModeStarted(actionMode);
                break;
            default:
                callback.onActionModeStarted(actionMode);
                break;
        }
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        byte b = this.f13797a;
        Window.Callback callback = this.b;
        switch (b) {
            case 0:
                callback.onAttachedToWindow();
                break;
            default:
                callback.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        byte b = this.f13797a;
        Window.Callback callback = this.b;
        switch (b) {
            case 0:
                callback.onContentChanged();
                break;
            default:
                callback.onContentChanged();
                break;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        byte b = this.f13797a;
        Window.Callback callback = this.b;
        switch (b) {
            case 0:
                menu.getClass();
                break;
            default:
                menu.getClass();
                break;
        }
        return callback.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        byte b = this.f13797a;
        Window.Callback callback = this.b;
        switch (b) {
            case 0:
                break;
        }
        return callback.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        byte b = this.f13797a;
        Window.Callback callback = this.b;
        switch (b) {
            case 0:
                callback.onDetachedFromWindow();
                break;
            default:
                callback.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        byte b = this.f13797a;
        Window.Callback callback = this.b;
        switch (b) {
            case 0:
                menuItem.getClass();
                break;
            default:
                menuItem.getClass();
                break;
        }
        return callback.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        byte b = this.f13797a;
        Window.Callback callback = this.b;
        switch (b) {
            case 0:
                menu.getClass();
                break;
            default:
                menu.getClass();
                break;
        }
        return callback.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        byte b = this.f13797a;
        Window.Callback callback = this.b;
        switch (b) {
            case 0:
                menu.getClass();
                callback.onPanelClosed(i, menu);
                break;
            default:
                menu.getClass();
                callback.onPanelClosed(i, menu);
                break;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        byte b = this.f13797a;
        Window.Callback callback = this.b;
        switch (b) {
            case 0:
                menu.getClass();
                break;
            default:
                menu.getClass();
                break;
        }
        return callback.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        byte b = this.f13797a;
        Window.Callback callback = this.b;
        switch (b) {
            case 0:
                break;
        }
        return callback.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        byte b = this.f13797a;
        Window.Callback callback = this.b;
        switch (b) {
            case 0:
                callback.onWindowAttributesChanged(layoutParams);
                break;
            default:
                callback.onWindowAttributesChanged(layoutParams);
                break;
        }
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        byte b = this.f13797a;
        Window.Callback callback = this.b;
        switch (b) {
            case 0:
                callback.onWindowFocusChanged(z);
                break;
            default:
                callback.onWindowFocusChanged(z);
                break;
        }
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        byte b = this.f13797a;
        Window.Callback callback2 = this.b;
        switch (b) {
            case 0:
                break;
        }
        return callback2.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        byte b = this.f13797a;
        Window.Callback callback = this.b;
        switch (b) {
            case 0:
                break;
        }
        return callback.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        byte b = this.f13797a;
        Window.Callback callback2 = this.b;
        switch (b) {
            case 0:
                break;
        }
        return callback2.onWindowStartingActionMode(callback, i);
    }
}
