.class public Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;
.super Lcom/google/android/material/textfield/TextInputLayout;
.source "SourceFile"


# static fields
.field public static final synthetic j2:I


# instance fields
.field public f2:Lkotlin/jvm/functions/Function1;

.field public final g2:La/tpb;

.field public final h2:Ljava/util/ArrayList;

.field public final i2:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 208
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 207
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 12

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p3, v0

    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/material/textfield/TextInputLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    new-instance v1, La/t6q0;

    .line 14
    .line 15
    const/16 v2, 0x8

    .line 16
    .line 17
    invoke-direct {v1, v2}, La/t6q0;-><init>(B)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->f2:Lkotlin/jvm/functions/Function1;

    .line 21
    .line 22
    new-instance v1, La/tpb;

    .line 23
    .line 24
    const/4 v2, 0x4

    .line 25
    invoke-direct {v1, v2}, La/tpb;-><init>(B)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->g2:La/tpb;

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    new-array v4, v3, [Landroid/text/InputFilter;

    .line 32
    .line 33
    aput-object v1, v4, p3

    .line 34
    .line 35
    invoke-static {v4}, La/q3d;->l([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->h2:Ljava/util/ArrayList;

    .line 40
    .line 41
    new-instance v1, La/yip0;

    .line 42
    .line 43
    const/16 v4, 0x9

    .line 44
    .line 45
    invoke-direct {v1, p1, p0, v4}, La/yip0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 46
    .line 47
    .line 48
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->i2:La/n0o0;

    .line 53
    .line 54
    if-eqz p2, :cond_2

    .line 55
    .line 56
    new-instance v1, La/q14;

    .line 57
    .line 58
    sget-object v4, La/aqd0;->y:[I

    .line 59
    .line 60
    invoke-direct {v1, p1, p2, v4}, La/q14;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;[I)V

    .line 61
    .line 62
    .line 63
    iget-object p1, v1, La/q14;->b:Landroid/content/res/TypedArray;

    .line 64
    .line 65
    :try_start_0
    invoke-virtual {p1, v0, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->getEditText()La/juc;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setInputType(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :catch_0
    move-exception v0

    .line 78
    move-object p2, v0

    .line 79
    :try_start_1
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 80
    .line 81
    .line 82
    :goto_0
    sget-object p2, La/j5d;->a:Landroid/util/TypedValue;

    .line 83
    .line 84
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    const v0, 0x7f040b72

    .line 92
    .line 93
    .line 94
    invoke-static {p2, v0, p3}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    new-instance v4, La/w6q0;

    .line 99
    .line 100
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->getEditText()La/juc;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    const-class v7, La/juc;

    .line 105
    .line 106
    const-string v8, "setTextColor"

    .line 107
    .line 108
    const-string v9, "setTextColor(I)V"

    .line 109
    .line 110
    const/4 v10, 0x0

    .line 111
    const/4 v11, 0x1

    .line 112
    const/4 v5, 0x1

    .line 113
    invoke-direct/range {v4 .. v11}, La/w6q0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 114
    .line 115
    .line 116
    const/4 v0, 0x3

    .line 117
    :try_start_2
    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    invoke-virtual {v4, p2}, La/w6q0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :catch_1
    move-exception v0

    .line 130
    move-object p2, v0

    .line 131
    :try_start_3
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 132
    .line 133
    .line 134
    :goto_1
    :try_start_4
    invoke-virtual {p1, v3, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 135
    .line 136
    .line 137
    move-result p2

    .line 138
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->getEditText()La/juc;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v0, p2}, Landroid/view/View;->setClickable(Z)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :catch_2
    move-exception v0

    .line 147
    move-object p2, v0

    .line 148
    :try_start_5
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 149
    .line 150
    .line 151
    :goto_2
    :try_start_6
    invoke-virtual {p1, p3, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 152
    .line 153
    .line 154
    move-result p2

    .line 155
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->getEditText()La/juc;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v0, p2}, Landroid/view/View;->setFocusable(Z)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 160
    .line 161
    .line 162
    goto :goto_3

    .line 163
    :catch_3
    move-exception v0

    .line 164
    move-object p2, v0

    .line 165
    :try_start_7
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 166
    .line 167
    .line 168
    :goto_3
    :try_start_8
    invoke-virtual {p1, v2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-eqz p1, :cond_1

    .line 173
    .line 174
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->getEditText()La/juc;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->g2:La/tpb;

    .line 179
    .line 180
    new-array p2, v3, [Landroid/text/InputFilter;

    .line 181
    .line 182
    aput-object p0, p2, p3

    .line 183
    .line 184
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 185
    .line 186
    .line 187
    goto :goto_4

    .line 188
    :catch_4
    move-exception v0

    .line 189
    move-object p0, v0

    .line 190
    :try_start_9
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 191
    .line 192
    .line 193
    :cond_1
    :goto_4
    invoke-virtual {v1}, La/q14;->close()V

    .line 194
    .line 195
    .line 196
    return-void

    .line 197
    :catchall_0
    move-exception v0

    .line 198
    move-object p0, v0

    .line 199
    :try_start_a
    throw p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 200
    :catchall_1
    move-exception v0

    .line 201
    move-object p1, v0

    .line 202
    invoke-static {v1, p0}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 203
    .line 204
    .line 205
    throw p1

    .line 206
    :cond_2
    return-void
.end method

.method public static final A(Landroid/content/Context;Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;)La/juc;
    .locals 4

    .line 1
    new-instance v0, La/juc;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p0}, Landroidx/appcompat/widget/AppCompatEditText;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, La/zxb;

    .line 10
    .line 11
    const/16 v2, 0x15

    .line 12
    .line 13
    invoke-direct {v1, v2}, La/zxb;-><init>(B)V

    .line 14
    .line 15
    .line 16
    iput-object v1, v0, La/juc;->h:Lkotlin/jvm/functions/Function0;

    .line 17
    .line 18
    new-instance v1, La/zxb;

    .line 19
    .line 20
    const/16 v2, 0x16

    .line 21
    .line 22
    invoke-direct {v1, v2}, La/zxb;-><init>(B)V

    .line 23
    .line 24
    .line 25
    iput-object v1, v0, La/juc;->i:Lkotlin/jvm/functions/Function0;

    .line 26
    .line 27
    new-instance v1, La/zxb;

    .line 28
    .line 29
    const/16 v2, 0x17

    .line 30
    .line 31
    invoke-direct {v1, v2}, La/zxb;-><init>(B)V

    .line 32
    .line 33
    .line 34
    iput-object v1, v0, La/juc;->j:Lkotlin/jvm/functions/Function0;

    .line 35
    .line 36
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 37
    .line 38
    const v1, 0x7f040b72

    .line 39
    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-static {p0, v1, v2}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 47
    .line 48
    .line 49
    const v1, 0x7f040b0b

    .line 50
    .line 51
    .line 52
    invoke-static {p0, v1, v1}, La/j5d;->d(Landroid/content/Context;II)Landroid/content/res/ColorStateList;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/widget/TextView;->setSingleLine()V

    .line 60
    .line 61
    .line 62
    const/4 v1, 0x5

    .line 63
    invoke-virtual {v0, v1}, Landroid/view/View;->setTextAlignment(I)V

    .line 64
    .line 65
    .line 66
    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 69
    .line 70
    .line 71
    invoke-direct {p1, v0}, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->setCursorDrawable(Landroid/widget/EditText;)V

    .line 72
    .line 73
    .line 74
    new-instance v1, La/j8q0;

    .line 75
    .line 76
    const/4 v3, 0x1

    .line 77
    invoke-direct {v1, p1, v3}, La/j8q0;-><init>(Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;B)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 81
    .line 82
    .line 83
    new-instance v1, La/j8q0;

    .line 84
    .line 85
    invoke-direct {v1, p1, v2}, La/j8q0;-><init>(Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;B)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 89
    .line 90
    .line 91
    new-instance p1, La/ud7;

    .line 92
    .line 93
    invoke-direct {p1, v3, v0, p0}, La/ud7;-><init>(BLandroid/view/View;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 97
    .line 98
    .line 99
    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 100
    .line 101
    const/4 p1, -0x1

    .line 102
    const/4 v1, -0x2

    .line 103
    invoke-direct {p0, p1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 107
    .line 108
    .line 109
    return-object v0
.end method

.method private final setCursorDrawable(Landroid/widget/EditText;)V
    .locals 1

    .line 1
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v0, 0x1d

    .line 4
    .line 5
    if-lt p0, v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, La/i8q0;->q(Landroid/widget/EditText;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    :try_start_0
    const-class p0, Landroid/widget/TextView;

    .line 12
    .line 13
    const-string v0, "mCursorDrawableRes"

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 21
    .line 22
    .line 23
    const v0, 0x7f080e2e

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p0, p1, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    :catch_0
    return-void
.end method


# virtual methods
.method public final getEditText()La/juc;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->i2:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/juc;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getFilters()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/text/InputFilter;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->h2:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOnTextChanged()Lkotlin/jvm/functions/Function1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->f2:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getText()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->getEditText()La/juc;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final getWhitespaceFilter()Landroid/text/InputFilter;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->g2:La/tpb;

    .line 2
    .line 3
    return-object p0
.end method

.method public final onAttachedToWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->getEditText()La/juc;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->getEditText()La/juc;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 19
    .line 20
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->getEditText()La/juc;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-direct {v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-virtual {p0, v0, v2, v1}, Lcom/google/android/material/textfield/TextInputLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method

.method public final setOnClickListenerEditText(Lkotlin/jvm/functions/Function0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->getEditText()La/juc;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/ymx;->e:La/ymx;

    .line 9
    .line 10
    new-instance v1, La/vpj0;

    .line 11
    .line 12
    const/16 v2, 0x8

    .line 13
    .line 14
    invoke-direct {v1, p1, v2}, La/vpj0;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v0, v1}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final setOnFocusListenerEditText(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->getEditText()La/juc;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    new-instance v0, La/dgh0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p1, v1}, La/dgh0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final setOnTextChanged(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->f2:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    return-void
.end method

.method public final setSelection(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->getEditText()La/juc;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setText(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->getEditText()La/juc;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setTextColor(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->getEditText()La/juc;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
