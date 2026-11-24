.class public Lcom/google/android/material/datepicker/f;
.super La/sik;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "La/sik;"
    }
.end annotation


# instance fields
.field public final Y1:Ljava/util/LinkedHashSet;

.field public final Z1:Ljava/util/LinkedHashSet;

.field public a2:I

.field public b2:La/rp90;

.field public c2:Lcom/google/android/material/datepicker/CalendarConstraints;

.field public d2:Lcom/google/android/material/datepicker/e;

.field public e2:I

.field public f2:Ljava/lang/CharSequence;

.field public g2:Z

.field public h2:I

.field public i2:I

.field public j2:Ljava/lang/CharSequence;

.field public k2:I

.field public l2:Ljava/lang/CharSequence;

.field public m2:I

.field public n2:Ljava/lang/CharSequence;

.field public o2:I

.field public p2:Ljava/lang/CharSequence;

.field public q2:Landroid/widget/TextView;

.field public r2:Lcom/google/android/material/internal/CheckableImageButton;

.field public s2:La/ki30;

.field public t2:Z

.field public u2:Ljava/lang/CharSequence;

.field public v2:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, La/sik;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/google/android/material/datepicker/f;->Y1:Ljava/util/LinkedHashSet;

    .line 20
    .line 21
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/google/android/material/datepicker/f;->Z1:Ljava/util/LinkedHashSet;

    .line 27
    .line 28
    return-void
.end method

.method public static J0(Landroid/content/Context;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const v0, 0x7f0704f3

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    new-instance v1, Lcom/google/android/material/datepicker/Month;

    .line 13
    .line 14
    invoke-static {}, La/ett0;->b()Ljava/util/Calendar;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-direct {v1, v2}, Lcom/google/android/material/datepicker/Month;-><init>(Ljava/util/Calendar;)V

    .line 19
    .line 20
    .line 21
    const v2, 0x7f0704f9

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const v3, 0x7f070507

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    mul-int/lit8 v0, v0, 0x2

    .line 36
    .line 37
    iget v1, v1, Lcom/google/android/material/datepicker/Month;->d:I

    .line 38
    .line 39
    mul-int/2addr v2, v1

    .line 40
    add-int/2addr v2, v0

    .line 41
    const/4 v0, 0x1

    .line 42
    invoke-static {v1, v0, p0, v2}, La/twn;->b(IIII)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0
.end method

.method public static K0(ILandroid/content/Context;)Z
    .locals 2

    .line 1
    const-class v0, Lcom/google/android/material/datepicker/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const v1, 0x7f0405b3

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v1, v0}, La/n6x;->U(Landroid/content/Context;ILjava/lang/String;)Landroid/util/TypedValue;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 15
    .line 16
    filled-new-array {p0}, [I

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p1, v0, p0}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const/4 p1, 0x0

    .line 25
    invoke-virtual {p0, p1, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 30
    .line 31
    .line 32
    return p1
.end method


# virtual methods
.method public final C0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 5

    .line 1
    new-instance p1, Landroid/app/Dialog;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    iget v1, p0, Lcom/google/android/material/datepicker/f;->a2:I

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-direct {p1, v0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const v1, 0x101020d

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v0}, Lcom/google/android/material/datepicker/f;->K0(ILandroid/content/Context;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iput-boolean v1, p0, Lcom/google/android/material/datepicker/f;->g2:Z

    .line 30
    .line 31
    new-instance v1, La/ki30;

    .line 32
    .line 33
    const v3, 0x7f0405b3

    .line 34
    .line 35
    .line 36
    const v4, 0x7f140a19

    .line 37
    .line 38
    .line 39
    invoke-direct {v1, v0, v2, v3, v4}, La/ki30;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, Lcom/google/android/material/datepicker/f;->s2:La/ki30;

    .line 43
    .line 44
    sget-object v1, La/rpd0;->A:[I

    .line 45
    .line 46
    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const/4 v2, 0x1

    .line 51
    const/4 v3, 0x0

    .line 52
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lcom/google/android/material/datepicker/f;->s2:La/ki30;

    .line 60
    .line 61
    invoke-virtual {v1, v0}, La/ki30;->o(Landroid/content/Context;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lcom/google/android/material/datepicker/f;->s2:La/ki30;

    .line 65
    .line 66
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v0, v1}, La/ki30;->s(Landroid/content/res/ColorStateList;)V

    .line 71
    .line 72
    .line 73
    iget-object p0, p0, Lcom/google/android/material/datepicker/f;->s2:La/ki30;

    .line 74
    .line 75
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Landroid/view/View;->getElevation()F

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    invoke-virtual {p0, v0}, La/ki30;->r(F)V

    .line 88
    .line 89
    .line 90
    return-object p1

    .line 91
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/f;->I0()V

    .line 92
    .line 93
    .line 94
    throw v2
.end method

.method public final I0()V
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 2
    .line 3
    const-string v0, "DATE_SELECTOR_KEY"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {}, La/hny;->b()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, La/sik;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 7
    .line 8
    :cond_0
    const-string v0, "OVERRIDE_THEME_RES_ID"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Lcom/google/android/material/datepicker/f;->a2:I

    .line 15
    .line 16
    const-string v0, "DATE_SELECTOR_KEY"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-nez v0, :cond_5

    .line 23
    .line 24
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 31
    .line 32
    iput-object v0, p0, Lcom/google/android/material/datepicker/f;->c2:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 33
    .line 34
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-nez v0, :cond_4

    .line 41
    .line 42
    const-string v0, "TITLE_TEXT_RES_ID_KEY"

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iput v0, p0, Lcom/google/android/material/datepicker/f;->e2:I

    .line 49
    .line 50
    const-string v0, "TITLE_TEXT_KEY"

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, Lcom/google/android/material/datepicker/f;->f2:Ljava/lang/CharSequence;

    .line 57
    .line 58
    const-string v0, "INPUT_MODE_KEY"

    .line 59
    .line 60
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iput v0, p0, Lcom/google/android/material/datepicker/f;->h2:I

    .line 65
    .line 66
    const-string v0, "POSITIVE_BUTTON_TEXT_RES_ID_KEY"

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iput v0, p0, Lcom/google/android/material/datepicker/f;->i2:I

    .line 73
    .line 74
    const-string v0, "POSITIVE_BUTTON_TEXT_KEY"

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, p0, Lcom/google/android/material/datepicker/f;->j2:Ljava/lang/CharSequence;

    .line 81
    .line 82
    const-string v0, "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iput v0, p0, Lcom/google/android/material/datepicker/f;->k2:I

    .line 89
    .line 90
    const-string v0, "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY"

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iput-object v0, p0, Lcom/google/android/material/datepicker/f;->l2:Ljava/lang/CharSequence;

    .line 97
    .line 98
    const-string v0, "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"

    .line 99
    .line 100
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    iput v0, p0, Lcom/google/android/material/datepicker/f;->m2:I

    .line 105
    .line 106
    const-string v0, "NEGATIVE_BUTTON_TEXT_KEY"

    .line 107
    .line 108
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iput-object v0, p0, Lcom/google/android/material/datepicker/f;->n2:Ljava/lang/CharSequence;

    .line 113
    .line 114
    const-string v0, "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"

    .line 115
    .line 116
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    iput v0, p0, Lcom/google/android/material/datepicker/f;->o2:I

    .line 121
    .line 122
    const-string v0, "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY"

    .line 123
    .line 124
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    iput-object p1, p0, Lcom/google/android/material/datepicker/f;->p2:Ljava/lang/CharSequence;

    .line 129
    .line 130
    iget-object p1, p0, Lcom/google/android/material/datepicker/f;->f2:Ljava/lang/CharSequence;

    .line 131
    .line 132
    if-eqz p1, :cond_1

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    iget v0, p0, Lcom/google/android/material/datepicker/f;->e2:I

    .line 144
    .line 145
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    :goto_0
    iput-object p1, p0, Lcom/google/android/material/datepicker/f;->u2:Ljava/lang/CharSequence;

    .line 150
    .line 151
    if-eqz p1, :cond_2

    .line 152
    .line 153
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    const-string v1, "\n"

    .line 158
    .line 159
    invoke-static {v0, v1}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    array-length v1, v0

    .line 164
    const/4 v2, 0x1

    .line 165
    if-le v1, v2, :cond_3

    .line 166
    .line 167
    const/4 p1, 0x0

    .line 168
    aget-object p1, v0, p1

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_2
    const/4 p1, 0x0

    .line 172
    :cond_3
    :goto_1
    iput-object p1, p0, Lcom/google/android/material/datepicker/f;->v2:Ljava/lang/CharSequence;

    .line 173
    .line 174
    return-void

    .line 175
    :cond_4
    invoke-static {}, La/hny;->b()V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :cond_5
    invoke-static {}, La/hny;->b()V

    .line 180
    .line 181
    .line 182
    return-void
.end method

.method public final X(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .line 1
    iget-boolean p3, p0, Lcom/google/android/material/datepicker/f;->g2:Z

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const p3, 0x7f0d04df

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const p3, 0x7f0d04de

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-virtual {p1, p3, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    iget-boolean p3, p0, Lcom/google/android/material/datepicker/f;->g2:Z

    .line 21
    .line 22
    if-eqz p3, :cond_1

    .line 23
    .line 24
    const p3, 0x7f0a0a5c

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 32
    .line 33
    invoke-static {p2}, Lcom/google/android/material/datepicker/f;->J0(Landroid/content/Context;)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/4 v2, -0x2

    .line 38
    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const p3, 0x7f0a0a5d

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 53
    .line 54
    invoke-static {p2}, Lcom/google/android/material/datepicker/f;->J0(Landroid/content/Context;)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    const/4 v2, -0x1

    .line 59
    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 63
    .line 64
    .line 65
    :goto_1
    const p3, 0x7f0a0a6b

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    check-cast p3, Landroid/widget/TextView;

    .line 73
    .line 74
    const/4 v0, 0x1

    .line 75
    invoke-virtual {p3, v0}, Landroid/view/View;->setAccessibilityLiveRegion(I)V

    .line 76
    .line 77
    .line 78
    const p3, 0x7f0a0a6d

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    check-cast p3, Lcom/google/android/material/internal/CheckableImageButton;

    .line 86
    .line 87
    iput-object p3, p0, Lcom/google/android/material/datepicker/f;->r2:Lcom/google/android/material/internal/CheckableImageButton;

    .line 88
    .line 89
    const p3, 0x7f0a0a71

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    check-cast p3, Landroid/widget/TextView;

    .line 97
    .line 98
    iput-object p3, p0, Lcom/google/android/material/datepicker/f;->q2:Landroid/widget/TextView;

    .line 99
    .line 100
    iget-object p3, p0, Lcom/google/android/material/datepicker/f;->r2:Lcom/google/android/material/internal/CheckableImageButton;

    .line 101
    .line 102
    const-string v1, "TOGGLE_BUTTON_TAG"

    .line 103
    .line 104
    invoke-virtual {p3, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iget-object p3, p0, Lcom/google/android/material/datepicker/f;->r2:Lcom/google/android/material/internal/CheckableImageButton;

    .line 108
    .line 109
    new-instance v1, Landroid/graphics/drawable/StateListDrawable;

    .line 110
    .line 111
    invoke-direct {v1}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 112
    .line 113
    .line 114
    const v2, 0x10100a0

    .line 115
    .line 116
    .line 117
    filled-new-array {v2}, [I

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    const v3, 0x7f080d99

    .line 122
    .line 123
    .line 124
    invoke-static {v3, p2}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-virtual {v1, v2, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 129
    .line 130
    .line 131
    const/4 v2, 0x0

    .line 132
    new-array v3, v2, [I

    .line 133
    .line 134
    const v4, 0x7f080d9b

    .line 135
    .line 136
    .line 137
    invoke-static {v4, p2}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    invoke-virtual {v1, v3, p2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p3, v1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 145
    .line 146
    .line 147
    iget-object p2, p0, Lcom/google/android/material/datepicker/f;->r2:Lcom/google/android/material/internal/CheckableImageButton;

    .line 148
    .line 149
    iget p3, p0, Lcom/google/android/material/datepicker/f;->h2:I

    .line 150
    .line 151
    if-eqz p3, :cond_2

    .line 152
    .line 153
    move v2, v0

    .line 154
    :cond_2
    invoke-virtual {p2, v2}, Lcom/google/android/material/internal/CheckableImageButton;->setChecked(Z)V

    .line 155
    .line 156
    .line 157
    iget-object p2, p0, Lcom/google/android/material/datepicker/f;->r2:Lcom/google/android/material/internal/CheckableImageButton;

    .line 158
    .line 159
    const/4 p3, 0x0

    .line 160
    invoke-static {p2, p3}, La/rgu0;->o(Landroid/view/View;La/p6;)V

    .line 161
    .line 162
    .line 163
    iget-object p2, p0, Lcom/google/android/material/datepicker/f;->r2:Lcom/google/android/material/internal/CheckableImageButton;

    .line 164
    .line 165
    iget v1, p0, Lcom/google/android/material/datepicker/f;->h2:I

    .line 166
    .line 167
    if-ne v1, v0, :cond_3

    .line 168
    .line 169
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    const v1, 0x7f130d8d

    .line 174
    .line 175
    .line 176
    invoke-virtual {p2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    goto :goto_2

    .line 181
    :cond_3
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    const v1, 0x7f130d90

    .line 186
    .line 187
    .line 188
    invoke-virtual {p2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    :goto_2
    iget-object v1, p0, Lcom/google/android/material/datepicker/f;->r2:Lcom/google/android/material/internal/CheckableImageButton;

    .line 193
    .line 194
    invoke-virtual {v1, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 195
    .line 196
    .line 197
    iget-object p2, p0, Lcom/google/android/material/datepicker/f;->r2:Lcom/google/android/material/internal/CheckableImageButton;

    .line 198
    .line 199
    iget v1, p0, Lcom/google/android/material/datepicker/f;->h2:I

    .line 200
    .line 201
    if-ne v1, v0, :cond_4

    .line 202
    .line 203
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    const v0, 0x7f130d8e

    .line 208
    .line 209
    .line 210
    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    goto :goto_3

    .line 215
    :cond_4
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 216
    .line 217
    .line 218
    move-result-object p2

    .line 219
    const v0, 0x7f130d91

    .line 220
    .line 221
    .line 222
    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p2

    .line 226
    :goto_3
    iget-object v0, p0, Lcom/google/android/material/datepicker/f;->r2:Lcom/google/android/material/internal/CheckableImageButton;

    .line 227
    .line 228
    invoke-static {v0, p2}, La/a4n0;->l(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 229
    .line 230
    .line 231
    iget-object p2, p0, Lcom/google/android/material/datepicker/f;->r2:Lcom/google/android/material/internal/CheckableImageButton;

    .line 232
    .line 233
    new-instance v0, La/l910;

    .line 234
    .line 235
    const/4 v1, 0x5

    .line 236
    invoke-direct {v0, p0, v1}, La/l910;-><init>(Ljava/lang/Object;B)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 240
    .line 241
    .line 242
    const p2, 0x7f0a0383

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    check-cast p1, Landroid/widget/Button;

    .line 250
    .line 251
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/f;->I0()V

    .line 252
    .line 253
    .line 254
    throw p3
.end method

.method public final f0(Landroid/os/Bundle;)V
    .locals 14

    .line 1
    invoke-super {p0, p1}, La/sik;->f0(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "OVERRIDE_THEME_RES_ID"

    .line 5
    .line 6
    iget v1, p0, Lcom/google/android/material/datepicker/f;->a2:I

    .line 7
    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    const-string v0, "DATE_SELECTOR_KEY"

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Lcom/google/android/material/datepicker/b;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/google/android/material/datepicker/f;->c2:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v3, v2, Lcom/google/android/material/datepicker/CalendarConstraints;->a:Lcom/google/android/material/datepicker/Month;

    .line 25
    .line 26
    iget-wide v3, v3, Lcom/google/android/material/datepicker/Month;->f:J

    .line 27
    .line 28
    iget-object v5, v2, Lcom/google/android/material/datepicker/CalendarConstraints;->b:Lcom/google/android/material/datepicker/Month;

    .line 29
    .line 30
    iget-wide v5, v5, Lcom/google/android/material/datepicker/Month;->f:J

    .line 31
    .line 32
    iget-object v7, v2, Lcom/google/android/material/datepicker/CalendarConstraints;->d:Lcom/google/android/material/datepicker/Month;

    .line 33
    .line 34
    iget-wide v7, v7, Lcom/google/android/material/datepicker/Month;->f:J

    .line 35
    .line 36
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    iput-object v7, v0, Lcom/google/android/material/datepicker/b;->a:Ljava/lang/Long;

    .line 41
    .line 42
    iget v13, v2, Lcom/google/android/material/datepicker/CalendarConstraints;->e:I

    .line 43
    .line 44
    iget-object v2, v2, Lcom/google/android/material/datepicker/CalendarConstraints;->c:Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;

    .line 45
    .line 46
    iget-object v7, p0, Lcom/google/android/material/datepicker/f;->d2:Lcom/google/android/material/datepicker/e;

    .line 47
    .line 48
    if-nez v7, :cond_0

    .line 49
    .line 50
    move-object v7, v1

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iget-object v7, v7, Lcom/google/android/material/datepicker/e;->K1:Lcom/google/android/material/datepicker/Month;

    .line 53
    .line 54
    :goto_0
    if-eqz v7, :cond_1

    .line 55
    .line 56
    iget-wide v7, v7, Lcom/google/android/material/datepicker/Month;->f:J

    .line 57
    .line 58
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    iput-object v7, v0, Lcom/google/android/material/datepicker/b;->a:Ljava/lang/Long;

    .line 63
    .line 64
    :cond_1
    new-instance v7, Landroid/os/Bundle;

    .line 65
    .line 66
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 67
    .line 68
    .line 69
    const-string v8, "DEEP_COPY_VALIDATOR_KEY"

    .line 70
    .line 71
    invoke-virtual {v7, v8, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 72
    .line 73
    .line 74
    move-object v2, v8

    .line 75
    new-instance v8, Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 76
    .line 77
    invoke-static {v3, v4}, Lcom/google/android/material/datepicker/Month;->b(J)Lcom/google/android/material/datepicker/Month;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    invoke-static {v5, v6}, Lcom/google/android/material/datepicker/Month;->b(J)Lcom/google/android/material/datepicker/Month;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    invoke-virtual {v7, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    move-object v11, v2

    .line 90
    check-cast v11, Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;

    .line 91
    .line 92
    iget-object v0, v0, Lcom/google/android/material/datepicker/b;->a:Ljava/lang/Long;

    .line 93
    .line 94
    if-nez v0, :cond_2

    .line 95
    .line 96
    move-object v12, v1

    .line 97
    goto :goto_1

    .line 98
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 99
    .line 100
    .line 101
    move-result-wide v2

    .line 102
    invoke-static {v2, v3}, Lcom/google/android/material/datepicker/Month;->b(J)Lcom/google/android/material/datepicker/Month;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    move-object v12, v0

    .line 107
    :goto_1
    invoke-direct/range {v8 .. v13}, Lcom/google/android/material/datepicker/CalendarConstraints;-><init>(Lcom/google/android/material/datepicker/Month;Lcom/google/android/material/datepicker/Month;Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;Lcom/google/android/material/datepicker/Month;I)V

    .line 108
    .line 109
    .line 110
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 111
    .line 112
    invoke-virtual {p1, v0, v8}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 113
    .line 114
    .line 115
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 116
    .line 117
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 118
    .line 119
    .line 120
    const-string v0, "TITLE_TEXT_RES_ID_KEY"

    .line 121
    .line 122
    iget v1, p0, Lcom/google/android/material/datepicker/f;->e2:I

    .line 123
    .line 124
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 125
    .line 126
    .line 127
    const-string v0, "TITLE_TEXT_KEY"

    .line 128
    .line 129
    iget-object v1, p0, Lcom/google/android/material/datepicker/f;->f2:Ljava/lang/CharSequence;

    .line 130
    .line 131
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 132
    .line 133
    .line 134
    const-string v0, "INPUT_MODE_KEY"

    .line 135
    .line 136
    iget v1, p0, Lcom/google/android/material/datepicker/f;->h2:I

    .line 137
    .line 138
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 139
    .line 140
    .line 141
    const-string v0, "POSITIVE_BUTTON_TEXT_RES_ID_KEY"

    .line 142
    .line 143
    iget v1, p0, Lcom/google/android/material/datepicker/f;->i2:I

    .line 144
    .line 145
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 146
    .line 147
    .line 148
    const-string v0, "POSITIVE_BUTTON_TEXT_KEY"

    .line 149
    .line 150
    iget-object v1, p0, Lcom/google/android/material/datepicker/f;->j2:Ljava/lang/CharSequence;

    .line 151
    .line 152
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 153
    .line 154
    .line 155
    const-string v0, "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"

    .line 156
    .line 157
    iget v1, p0, Lcom/google/android/material/datepicker/f;->k2:I

    .line 158
    .line 159
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 160
    .line 161
    .line 162
    const-string v0, "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY"

    .line 163
    .line 164
    iget-object v1, p0, Lcom/google/android/material/datepicker/f;->l2:Ljava/lang/CharSequence;

    .line 165
    .line 166
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 167
    .line 168
    .line 169
    const-string v0, "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"

    .line 170
    .line 171
    iget v1, p0, Lcom/google/android/material/datepicker/f;->m2:I

    .line 172
    .line 173
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 174
    .line 175
    .line 176
    const-string v0, "NEGATIVE_BUTTON_TEXT_KEY"

    .line 177
    .line 178
    iget-object v1, p0, Lcom/google/android/material/datepicker/f;->n2:Ljava/lang/CharSequence;

    .line 179
    .line 180
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 181
    .line 182
    .line 183
    const-string v0, "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"

    .line 184
    .line 185
    iget v1, p0, Lcom/google/android/material/datepicker/f;->o2:I

    .line 186
    .line 187
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 188
    .line 189
    .line 190
    const-string v0, "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY"

    .line 191
    .line 192
    iget-object p0, p0, Lcom/google/android/material/datepicker/f;->p2:Ljava/lang/CharSequence;

    .line 193
    .line 194
    invoke-virtual {p1, v0, p0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 195
    .line 196
    .line 197
    return-void
.end method

.method public final g0()V
    .locals 13

    .line 1
    invoke-super {p0}, La/sik;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/sik;->D0()Landroid/app/Dialog;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-boolean v1, p0, Lcom/google/android/material/datepicker/f;->g2:Z

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x1

    .line 16
    if-eqz v1, :cond_13

    .line 17
    .line 18
    const/4 v1, -0x1

    .line 19
    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/google/android/material/datepicker/f;->s2:La/ki30;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 25
    .line 26
    .line 27
    iget-boolean v1, p0, Lcom/google/android/material/datepicker/f;->t2:Z

    .line 28
    .line 29
    if-nez v1, :cond_14

    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const v4, 0x7f0a061d

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    invoke-virtual {v7}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v1}, La/plc;->F(Landroid/graphics/drawable/Drawable;)Landroid/content/res/ColorStateList;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move-object v1, v2

    .line 62
    :goto_0
    const/4 v4, 0x0

    .line 63
    if-eqz v1, :cond_2

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-nez v5, :cond_1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    move v5, v4

    .line 73
    goto :goto_2

    .line 74
    :cond_2
    :goto_1
    move v5, v3

    .line 75
    :goto_2
    invoke-virtual {v0}, Landroid/view/Window;->getContext()Landroid/content/Context;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    const v8, 0x1010031

    .line 80
    .line 81
    .line 82
    invoke-static {v8, v6}, La/d7x;->y(ILandroid/content/Context;)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    const/high16 v8, -0x1000000

    .line 87
    .line 88
    if-eqz v6, :cond_3

    .line 89
    .line 90
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    goto :goto_3

    .line 95
    :cond_3
    move v6, v8

    .line 96
    :goto_3
    if-eqz v5, :cond_4

    .line 97
    .line 98
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    :cond_4
    invoke-static {v0, v4}, La/bcm0;->x(Landroid/view/Window;Z)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Landroid/view/Window;->getContext()Landroid/content/Context;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Landroid/view/Window;->getContext()Landroid/content/Context;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 113
    .line 114
    const/16 v10, 0x1b

    .line 115
    .line 116
    if-ge v9, v10, :cond_6

    .line 117
    .line 118
    const v10, 0x1010452

    .line 119
    .line 120
    .line 121
    invoke-static {v10, v5}, La/d7x;->y(ILandroid/content/Context;)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    if-eqz v5, :cond_5

    .line 126
    .line 127
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    :cond_5
    const/16 v5, 0x80

    .line 132
    .line 133
    invoke-static {v8, v5}, La/k5d;->e(II)I

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    goto :goto_4

    .line 138
    :cond_6
    move v5, v4

    .line 139
    :goto_4
    const/16 v8, 0x23

    .line 140
    .line 141
    if-ge v9, v8, :cond_7

    .line 142
    .line 143
    invoke-virtual {v0, v4}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 144
    .line 145
    .line 146
    :cond_7
    if-ge v9, v8, :cond_8

    .line 147
    .line 148
    invoke-virtual {v0, v5}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 149
    .line 150
    .line 151
    :cond_8
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    invoke-static {v1}, La/d7x;->D(I)Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    invoke-static {v4}, La/d7x;->D(I)Z

    .line 160
    .line 161
    .line 162
    move-result v10

    .line 163
    if-nez v10, :cond_a

    .line 164
    .line 165
    if-eqz v1, :cond_9

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_9
    move v1, v4

    .line 169
    goto :goto_6

    .line 170
    :cond_a
    :goto_5
    move v1, v3

    .line 171
    :goto_6
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    new-instance v11, La/ani0;

    .line 176
    .line 177
    invoke-direct {v11, v10}, La/ani0;-><init>(Landroid/view/View;)V

    .line 178
    .line 179
    .line 180
    const/16 v10, 0x1a

    .line 181
    .line 182
    const/16 v12, 0x1e

    .line 183
    .line 184
    if-lt v9, v8, :cond_b

    .line 185
    .line 186
    new-instance v9, La/bjv0;

    .line 187
    .line 188
    invoke-direct {v9, v0, v11}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 189
    .line 190
    .line 191
    goto :goto_7

    .line 192
    :cond_b
    if-lt v9, v12, :cond_c

    .line 193
    .line 194
    new-instance v9, La/ajv0;

    .line 195
    .line 196
    invoke-direct {v9, v0, v11}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 197
    .line 198
    .line 199
    goto :goto_7

    .line 200
    :cond_c
    if-lt v9, v10, :cond_d

    .line 201
    .line 202
    new-instance v9, La/ziv0;

    .line 203
    .line 204
    invoke-direct {v9, v0, v11}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 205
    .line 206
    .line 207
    goto :goto_7

    .line 208
    :cond_d
    new-instance v9, La/yiv0;

    .line 209
    .line 210
    invoke-direct {v9, v0, v11}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 211
    .line 212
    .line 213
    :goto_7
    invoke-virtual {v9, v1}, La/ycm0;->w(Z)V

    .line 214
    .line 215
    .line 216
    invoke-static {v6}, La/d7x;->D(I)Z

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    invoke-static {v5}, La/d7x;->D(I)Z

    .line 221
    .line 222
    .line 223
    move-result v6

    .line 224
    if-nez v6, :cond_e

    .line 225
    .line 226
    if-nez v5, :cond_f

    .line 227
    .line 228
    if-eqz v1, :cond_f

    .line 229
    .line 230
    :cond_e
    move v4, v3

    .line 231
    :cond_f
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    new-instance v5, La/ani0;

    .line 236
    .line 237
    invoke-direct {v5, v1}, La/ani0;-><init>(Landroid/view/View;)V

    .line 238
    .line 239
    .line 240
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 241
    .line 242
    if-lt v1, v8, :cond_10

    .line 243
    .line 244
    new-instance v1, La/bjv0;

    .line 245
    .line 246
    invoke-direct {v1, v0, v5}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 247
    .line 248
    .line 249
    goto :goto_8

    .line 250
    :cond_10
    if-lt v1, v12, :cond_11

    .line 251
    .line 252
    new-instance v1, La/ajv0;

    .line 253
    .line 254
    invoke-direct {v1, v0, v5}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 255
    .line 256
    .line 257
    goto :goto_8

    .line 258
    :cond_11
    if-lt v1, v10, :cond_12

    .line 259
    .line 260
    new-instance v1, La/ziv0;

    .line 261
    .line 262
    invoke-direct {v1, v0, v5}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 263
    .line 264
    .line 265
    goto :goto_8

    .line 266
    :cond_12
    new-instance v1, La/yiv0;

    .line 267
    .line 268
    invoke-direct {v1, v0, v5}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 269
    .line 270
    .line 271
    :goto_8
    invoke-virtual {v1, v4}, La/ycm0;->v(Z)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v7}, Landroid/view/View;->getPaddingTop()I

    .line 275
    .line 276
    .line 277
    move-result v9

    .line 278
    invoke-virtual {v7}, Landroid/view/View;->getPaddingLeft()I

    .line 279
    .line 280
    .line 281
    move-result v8

    .line 282
    invoke-virtual {v7}, Landroid/view/View;->getPaddingRight()I

    .line 283
    .line 284
    .line 285
    move-result v10

    .line 286
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    iget v6, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 291
    .line 292
    new-instance v5, La/z55;

    .line 293
    .line 294
    const/4 v11, 0x3

    .line 295
    invoke-direct/range {v5 .. v11}, La/z55;-><init>(ILjava/lang/Object;IIIB)V

    .line 296
    .line 297
    .line 298
    sget-object v0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 299
    .line 300
    invoke-static {v7, v5}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 301
    .line 302
    .line 303
    iput-boolean v3, p0, Lcom/google/android/material/datepicker/f;->t2:Z

    .line 304
    .line 305
    goto :goto_9

    .line 306
    :cond_13
    const/4 v1, -0x2

    .line 307
    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    const v4, 0x7f0704fb

    .line 315
    .line 316
    .line 317
    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 318
    .line 319
    .line 320
    move-result v7

    .line 321
    new-instance v1, Landroid/graphics/Rect;

    .line 322
    .line 323
    invoke-direct {v1, v7, v7, v7, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 324
    .line 325
    .line 326
    new-instance v5, Landroid/graphics/drawable/InsetDrawable;

    .line 327
    .line 328
    iget-object v6, p0, Lcom/google/android/material/datepicker/f;->s2:La/ki30;

    .line 329
    .line 330
    move v8, v7

    .line 331
    move v9, v7

    .line 332
    move v10, v7

    .line 333
    invoke-direct/range {v5 .. v10}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0, v5}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    new-instance v4, La/ofx;

    .line 344
    .line 345
    invoke-virtual {p0}, La/sik;->D0()Landroid/app/Dialog;

    .line 346
    .line 347
    .line 348
    move-result-object v5

    .line 349
    invoke-direct {v4, v5, v1}, La/ofx;-><init>(Landroid/app/Dialog;Landroid/graphics/Rect;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v0, v4}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 353
    .line 354
    .line 355
    :cond_14
    :goto_9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 356
    .line 357
    .line 358
    iget v0, p0, Lcom/google/android/material/datepicker/f;->a2:I

    .line 359
    .line 360
    if-eqz v0, :cond_1a

    .line 361
    .line 362
    iget v1, p0, Lcom/google/android/material/datepicker/f;->h2:I

    .line 363
    .line 364
    if-ne v1, v3, :cond_15

    .line 365
    .line 366
    const-string v1, "TEXT_INPUT_FRAGMENT_TAG"

    .line 367
    .line 368
    goto :goto_a

    .line 369
    :cond_15
    const-string v1, "CALENDAR_FRAGMENT_TAG"

    .line 370
    .line 371
    :goto_a
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 372
    .line 373
    .line 374
    move-result-object v4

    .line 375
    invoke-virtual {v4, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    instance-of v4, v1, La/rp90;

    .line 380
    .line 381
    if-eqz v4, :cond_16

    .line 382
    .line 383
    check-cast v1, La/rp90;

    .line 384
    .line 385
    goto :goto_b

    .line 386
    :cond_16
    move-object v1, v2

    .line 387
    :goto_b
    if-nez v1, :cond_18

    .line 388
    .line 389
    iget v1, p0, Lcom/google/android/material/datepicker/f;->h2:I

    .line 390
    .line 391
    const-string v4, "CALENDAR_CONSTRAINTS_KEY"

    .line 392
    .line 393
    const-string v5, "THEME_RES_ID_KEY"

    .line 394
    .line 395
    if-ne v1, v3, :cond_17

    .line 396
    .line 397
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/f;->I0()V

    .line 398
    .line 399
    .line 400
    iget-object v1, p0, Lcom/google/android/material/datepicker/f;->c2:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 401
    .line 402
    new-instance v6, La/oi30;

    .line 403
    .line 404
    invoke-direct {v6}, La/oi30;-><init>()V

    .line 405
    .line 406
    .line 407
    new-instance v7, Landroid/os/Bundle;

    .line 408
    .line 409
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v7, v5, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 413
    .line 414
    .line 415
    const-string v0, "DATE_SELECTOR_KEY"

    .line 416
    .line 417
    invoke-virtual {v7, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v7, v4, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v6, v7}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 424
    .line 425
    .line 426
    :goto_c
    move-object v1, v6

    .line 427
    goto :goto_d

    .line 428
    :cond_17
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/f;->I0()V

    .line 429
    .line 430
    .line 431
    iget-object v1, p0, Lcom/google/android/material/datepicker/f;->c2:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 432
    .line 433
    new-instance v6, Lcom/google/android/material/datepicker/e;

    .line 434
    .line 435
    invoke-direct {v6}, Lcom/google/android/material/datepicker/e;-><init>()V

    .line 436
    .line 437
    .line 438
    new-instance v7, Landroid/os/Bundle;

    .line 439
    .line 440
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v7, v5, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 444
    .line 445
    .line 446
    const-string v0, "GRID_SELECTOR_KEY"

    .line 447
    .line 448
    invoke-virtual {v7, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v7, v4, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 452
    .line 453
    .line 454
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 455
    .line 456
    invoke-virtual {v7, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 457
    .line 458
    .line 459
    const-string v0, "CURRENT_MONTH_KEY"

    .line 460
    .line 461
    iget-object v1, v1, Lcom/google/android/material/datepicker/CalendarConstraints;->d:Lcom/google/android/material/datepicker/Month;

    .line 462
    .line 463
    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v6, v7}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 467
    .line 468
    .line 469
    iput-object v6, p0, Lcom/google/android/material/datepicker/f;->d2:Lcom/google/android/material/datepicker/e;

    .line 470
    .line 471
    goto :goto_c

    .line 472
    :cond_18
    :goto_d
    iput-object v1, p0, Lcom/google/android/material/datepicker/f;->b2:La/rp90;

    .line 473
    .line 474
    new-instance v0, La/wsz;

    .line 475
    .line 476
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v1, v0}, La/rp90;->x0(La/wsz;)V

    .line 480
    .line 481
    .line 482
    iget-object v0, p0, Lcom/google/android/material/datepicker/f;->q2:Landroid/widget/TextView;

    .line 483
    .line 484
    iget v1, p0, Lcom/google/android/material/datepicker/f;->h2:I

    .line 485
    .line 486
    if-ne v1, v3, :cond_19

    .line 487
    .line 488
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    .line 497
    .line 498
    const/4 v3, 0x2

    .line 499
    if-ne v1, v3, :cond_19

    .line 500
    .line 501
    iget-object v1, p0, Lcom/google/android/material/datepicker/f;->v2:Ljava/lang/CharSequence;

    .line 502
    .line 503
    goto :goto_e

    .line 504
    :cond_19
    iget-object v1, p0, Lcom/google/android/material/datepicker/f;->u2:Ljava/lang/CharSequence;

    .line 505
    .line 506
    :goto_e
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/f;->I0()V

    .line 510
    .line 511
    .line 512
    throw v2

    .line 513
    :cond_1a
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/f;->I0()V

    .line 514
    .line 515
    .line 516
    throw v2
.end method

.method public final h0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/f;->b2:La/rp90;

    .line 2
    .line 3
    iget-object v0, v0, La/rp90;->H1:Ljava/util/LinkedHashSet;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, La/sik;->h0()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/datepicker/f;->Y1:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/content/DialogInterface$OnCancelListener;

    .line 18
    .line 19
    invoke-interface {v0, p1}, Landroid/content/DialogInterface$OnCancelListener;->onCancel(Landroid/content/DialogInterface;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/f;->Z1:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/content/DialogInterface$OnDismissListener;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Landroid/content/DialogInterface$OnDismissListener;->onDismiss(Landroid/content/DialogInterface;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 24
    .line 25
    check-cast v0, Landroid/view/ViewGroup;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-super {p0, p1}, La/sik;->onDismiss(Landroid/content/DialogInterface;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
