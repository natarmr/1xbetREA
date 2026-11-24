package androidx.appcompat.widget;

import a.a4n0;
import a.cih0;
import a.cwf;
import a.dih0;
import a.eih0;
import a.fih0;
import a.ge3;
import a.gih0;
import a.hih0;
import a.iih0;
import a.jih0;
import a.jt6;
import a.kf00;
import a.lhn0;
import a.ln40;
import a.mqd0;
import a.o1d;
import a.rgu0;
import a.sf3;
import a.w23;
import a.wh;
import a.ywu;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.gov.nist.core.Separators;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.huawei.hms.actions.SearchIntents;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends LinearLayoutCompat implements o1d {
    public static final ln40 I1;
    public final Rect A;
    public CharSequence A1;
    public final int[] B;
    public boolean B1;
    public int C1;
    public SearchableInfo D1;
    public Bundle E1;
    public final cih0 F1;
    public final cih0 G1;
    public final WeakHashMap H1;
    public final int[] f1;
    public final ImageView g1;
    public final Drawable h1;
    public final int i1;
    public final int j1;
    public final Intent k1;
    public final Intent l1;
    public final CharSequence m1;
    public hih0 n1;
    public View.OnFocusChangeListener o1;
    public final SearchView$SearchAutoComplete p;
    public View.OnClickListener p1;
    public final View q;
    public boolean q1;
    public final View r;
    public boolean r1;
    public final View s;
    public cwf s1;
    public final ImageView t;
    public boolean t1;
    public final ImageView u;
    public CharSequence u1;
    public final ImageView v;
    public boolean v1;
    public final ImageView w;
    public boolean w1;
    public final View x;
    public int x1;
    public jih0 y;
    public boolean y1;
    public final Rect z;
    public String z1;

    static {
        ln40 ln40Var = null;
        if (Build.VERSION.SDK_INT < 29) {
            ln40 ln40Var2 = new ln40();
            ln40Var2.f20326a = null;
            ln40Var2.b = null;
            ln40Var2.c = null;
            ln40.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                ln40Var2.f20326a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                ln40Var2.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                ln40Var2.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            ln40Var = ln40Var2;
        }
        I1 = ln40Var;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.searchViewStyle);
        this.z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.f1 = new int[2];
        this.F1 = new cih0(this, (byte) 0);
        this.G1 = new cih0(this, (byte) 1);
        this.H1 = new WeakHashMap();
        wh whVar = new wh(this, (byte) 4);
        eih0 eih0Var = new eih0(this);
        fih0 fih0Var = new fih0(this);
        ge3 ge3Var = new ge3(this, (byte) 2);
        kf00 kf00Var = new kf00(this, (byte) 1);
        jt6 jt6Var = new jt6(this, (byte) 16);
        int[] iArr = mqd0.u;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.searchViewStyle, 0);
        ywu ywuVar = new ywu(context, typedArrayObtainStyledAttributes);
        rgu0.n(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.searchViewStyle, 0);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(21, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) findViewById(R.id.search_src_text);
        this.p = searchView$SearchAutoComplete;
        searchView$SearchAutoComplete.setSearchView(this);
        this.q = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.r = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.g1 = imageView5;
        viewFindViewById.setBackground(ywuVar.n(22));
        viewFindViewById2.setBackground(ywuVar.n(27));
        imageView.setImageDrawable(ywuVar.n(25));
        imageView2.setImageDrawable(ywuVar.n(17));
        imageView3.setImageDrawable(ywuVar.n(12));
        imageView4.setImageDrawable(ywuVar.n(30));
        imageView5.setImageDrawable(ywuVar.n(25));
        this.h1 = ywuVar.n(24);
        a4n0.l(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.i1 = typedArrayObtainStyledAttributes.getResourceId(28, R.layout.abc_search_dropdown_item_icons_2line);
        byte b = 13;
        this.j1 = typedArrayObtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(whVar);
        imageView3.setOnClickListener(whVar);
        imageView2.setOnClickListener(whVar);
        imageView4.setOnClickListener(whVar);
        searchView$SearchAutoComplete.setOnClickListener(whVar);
        searchView$SearchAutoComplete.addTextChangedListener(jt6Var);
        searchView$SearchAutoComplete.setOnEditorActionListener(fih0Var);
        searchView$SearchAutoComplete.setOnItemClickListener(ge3Var);
        searchView$SearchAutoComplete.setOnItemSelectedListener(kf00Var);
        searchView$SearchAutoComplete.setOnKeyListener(eih0Var);
        searchView$SearchAutoComplete.setOnFocusChangeListener(new dih0(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(20, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.m1 = typedArrayObtainStyledAttributes.getText(15);
        this.u1 = typedArrayObtainStyledAttributes.getText(23);
        int i = typedArrayObtainStyledAttributes.getInt(6, -1);
        if (i != -1) {
            setImeOptions(i);
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(5, -1);
        if (i2 != -1) {
            setInputType(i2);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(1, true));
        ywuVar.A();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.k1 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.l1 = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchView$SearchAutoComplete.getDropDownAnchor());
        this.x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new w23(this, b));
        }
        w(this.q1);
        t();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.p;
        searchView$SearchAutoComplete.setText(charSequence);
        searchView$SearchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.w1 = true;
        super.clearFocus();
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.p;
        searchView$SearchAutoComplete.clearFocus();
        searchView$SearchAutoComplete.setImeVisibility(false);
        this.w1 = false;
    }

    public int getImeOptions() {
        return this.p.getImeOptions();
    }

    public int getInputType() {
        return this.p.getInputType();
    }

    public int getMaxWidth() {
        return this.x1;
    }

    public CharSequence getQuery() {
        return this.p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.u1;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.D1;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.m1 : getContext().getText(this.D1.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.j1;
    }

    public int getSuggestionRowLayout() {
        return this.i1;
    }

    public cwf getSuggestionsAdapter() {
        return this.s1;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.A1);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.E1;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.D1.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.E1;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        int i = Build.VERSION.SDK_INT;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.p;
        if (i >= 29) {
            sf3.u(searchView$SearchAutoComplete);
            return;
        }
        ln40 ln40Var = I1;
        ln40Var.getClass();
        ln40.a();
        Method method = ln40Var.f20326a;
        if (method != null) {
            try {
                method.invoke(searchView$SearchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        ln40.a();
        Method method2 = ln40Var.b;
        if (method2 != null) {
            try {
                method2.invoke(searchView$SearchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.p;
        if (!TextUtils.isEmpty(searchView$SearchAutoComplete.getText())) {
            searchView$SearchAutoComplete.setText("");
            searchView$SearchAutoComplete.requestFocus();
            searchView$SearchAutoComplete.setImeVisibility(true);
        } else if (this.q1) {
            clearFocus();
            w(true);
        }
    }

    public final void n(int i) {
        int position;
        String strG;
        Cursor cursor = this.s1.c;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentJ = null;
            try {
                int i2 = lhn0.x;
                String strG2 = lhn0.g(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strG2 == null) {
                    strG2 = this.D1.getSuggestIntentAction();
                }
                if (strG2 == null) {
                    strG2 = "android.intent.action.SEARCH";
                }
                String strG3 = lhn0.g(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strG3 == null) {
                    strG3 = this.D1.getSuggestIntentData();
                }
                if (strG3 != null && (strG = lhn0.g(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strG3 = strG3 + Separators.SLASH + Uri.encode(strG);
                }
                intentJ = j(strG2, strG3 == null ? null : Uri.parse(strG3), lhn0.g(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), lhn0.g(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e);
            }
            if (intentJ != null) {
                try {
                    getContext().startActivity(intentJ);
                } catch (RuntimeException e2) {
                    Log.e("SearchView", "Failed launch activity: " + intentJ, e2);
                }
            }
        }
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.p;
        searchView$SearchAutoComplete.setImeVisibility(false);
        searchView$SearchAutoComplete.dismissDropDown();
    }

    public final void o(int i) {
        Editable text = this.p.getText();
        Cursor cursor = this.s1.c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String strC = this.s1.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    @Override // a.o1d
    public final void onActionViewCollapsed() {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.p;
        searchView$SearchAutoComplete.setText("");
        searchView$SearchAutoComplete.setSelection(searchView$SearchAutoComplete.length());
        this.A1 = "";
        clearFocus();
        w(true);
        searchView$SearchAutoComplete.setImeOptions(this.C1);
        this.B1 = false;
    }

    @Override // a.o1d
    public final void onActionViewExpanded() {
        if (this.B1) {
            return;
        }
        this.B1 = true;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.p;
        int imeOptions = searchView$SearchAutoComplete.getImeOptions();
        this.C1 = imeOptions;
        searchView$SearchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchView$SearchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.F1);
        post(this.G1);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.p;
            int[] iArr = this.B;
            searchView$SearchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f1;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchView$SearchAutoComplete.getWidth() + i6;
            int height = searchView$SearchAutoComplete.getHeight() + i5;
            Rect rect = this.z;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.A;
            rect2.set(i7, 0, i8, i9);
            jih0 jih0Var = this.y;
            if (jih0Var == null) {
                jih0 jih0Var2 = new jih0(rect2, rect, searchView$SearchAutoComplete);
                this.y = jih0Var2;
                setTouchDelegate(jih0Var2);
            } else {
                jih0Var.b.set(rect2);
                Rect rect3 = jih0Var.d;
                rect3.set(rect2);
                int i10 = -jih0Var.e;
                rect3.inset(i10, i10);
                jih0Var.c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.r1) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.x1;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.x1;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.x1) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SearchView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SearchView$SavedState searchView$SavedState = (SearchView$SavedState) parcelable;
        super.onRestoreInstanceState(searchView$SavedState.f45367a);
        w(searchView$SavedState.c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SearchView$SavedState searchView$SavedState = new SearchView$SavedState(super.onSaveInstanceState());
        searchView$SavedState.c = this.r1;
        return searchView$SavedState;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.F1);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.p;
        Editable text = searchView$SearchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        hih0 hih0Var = this.n1;
        if (hih0Var != null) {
            hih0Var.onQueryTextSubmit(text.toString());
        }
        if (this.D1 != null) {
            getContext().startActivity(j("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchView$SearchAutoComplete.setImeVisibility(false);
        searchView$SearchAutoComplete.dismissDropDown();
    }

    public final void r() {
        boolean zIsEmpty = TextUtils.isEmpty(this.p.getText());
        int i = (!zIsEmpty || (this.q1 && !this.B1)) ? 0 : 8;
        ImageView imageView = this.v;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.w1 || !isFocusable()) {
            return false;
        }
        if (this.r1) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.p.requestFocus(i, rect);
        if (zRequestFocus) {
            w(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        int[] iArr = this.p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.E1 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m();
            return;
        }
        w(false);
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.p;
        searchView$SearchAutoComplete.requestFocus();
        searchView$SearchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.p1;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.q1 == z) {
            return;
        }
        this.q1 = z;
        w(z);
        t();
    }

    public void setImeOptions(int i) {
        this.p.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.p.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.x1 = i;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.o1 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(hih0 hih0Var) {
        this.n1 = hih0Var;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.p1 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.u1 = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.v1 = z;
        cwf cwfVar = this.s1;
        if (cwfVar instanceof lhn0) {
            ((lhn0) cwfVar).p = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean z;
        this.D1 = searchableInfo;
        Intent intent = null;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.p;
        if (searchableInfo != null) {
            searchView$SearchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchView$SearchAutoComplete.setImeOptions(this.D1.getImeOptions());
            int inputType = this.D1.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.D1.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchView$SearchAutoComplete.setInputType(inputType);
            cwf cwfVar = this.s1;
            if (cwfVar != null) {
                cwfVar.b(null);
            }
            if (this.D1.getSuggestAuthority() != null) {
                lhn0 lhn0Var = new lhn0(getContext(), this, this.D1, this.H1);
                this.s1 = lhn0Var;
                searchView$SearchAutoComplete.setAdapter(lhn0Var);
                ((lhn0) this.s1).p = this.v1 ? 2 : 1;
            }
            t();
        }
        SearchableInfo searchableInfo2 = this.D1;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.D1.getVoiceSearchLaunchWebSearch()) {
                intent = this.k1;
            } else if (this.D1.getVoiceSearchLaunchRecognizer()) {
                intent = this.l1;
            }
            z = (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
        }
        this.y1 = z;
        if (z) {
            searchView$SearchAutoComplete.setPrivateImeOptions("nm");
        }
        w(this.r1);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.t1 = z;
        w(this.r1);
    }

    public void setSuggestionsAdapter(cwf cwfVar) {
        this.s1 = cwfVar;
        this.p.setAdapter(cwfVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void t() {
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z = this.q1;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.p;
        CharSequence charSequence2 = charSequence;
        if (z) {
            Drawable drawable = this.h1;
            charSequence2 = charSequence;
            if (drawable != null) {
                int textSize = (int) (((double) searchView$SearchAutoComplete.getTextSize()) * 1.25d);
                drawable.setBounds(0, 0, textSize, textSize);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
                spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
                spannableStringBuilder.append(charSequence);
                charSequence2 = spannableStringBuilder;
            }
        }
        searchView$SearchAutoComplete.setHint(charSequence2);
    }

    public final void u() {
        this.s.setVisibility(((this.t1 || this.y1) && !this.r1 && (this.u.getVisibility() == 0 || this.w.getVisibility() == 0)) ? 0 : 8);
    }

    public final void v(boolean z) {
        boolean z2 = this.t1;
        this.u.setVisibility((!z2 || !(z2 || this.y1) || this.r1 || !hasFocus() || (!z && this.y1)) ? 8 : 0);
    }

    public final void w(boolean z) {
        this.r1 = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.p.getText());
        this.t.setVisibility(i2);
        v(!zIsEmpty);
        this.q.setVisibility(z ? 8 : 0);
        ImageView imageView = this.g1;
        imageView.setVisibility((imageView.getDrawable() == null || this.q1) ? 8 : 0);
        r();
        if (this.y1 && !this.r1 && zIsEmpty) {
            this.u.setVisibility(8);
            i = 0;
        }
        this.w.setVisibility(i);
        u();
    }

    public void setOnCloseListener(gih0 gih0Var) {
    }

    public void setOnSuggestionListener(iih0 iih0Var) {
    }
}
