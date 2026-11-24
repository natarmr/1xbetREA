.class public final Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;
.super La/ay5;
.source "SourceFile"


# static fields
.field public static final synthetic i:I


# instance fields
.field public final a:B

.field public final b:La/n0o0;

.field public c:Ljava/util/ArrayList;

.field public d:Ljava/util/ArrayList;

.field public final e:Ljava/lang/String;

.field public f:Landroid/animation/AnimatorSet;

.field public g:La/y63;

.field public h:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
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
    invoke-direct {p0, p1, p2}, La/ay5;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x4

    .line 13
    iput-byte p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->a:B

    .line 14
    .line 15
    new-instance p1, La/a13;

    .line 16
    .line 17
    const/4 p2, 0x5

    .line 18
    invoke-direct {p1, p0, p2}, La/a13;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->b:La/n0o0;

    .line 26
    .line 27
    new-instance p1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->c:Ljava/util/ArrayList;

    .line 33
    .line 34
    new-instance p1, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->d:Ljava/util/ArrayList;

    .line 40
    .line 41
    const-string p1, "\u2022"

    .line 42
    .line 43
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->e:Ljava/lang/String;

    .line 44
    .line 45
    return-void
.end method

.method public static final synthetic b(Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;)Ljava/lang/StringBuilder;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->getStringBuilder()Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final getStringBuilder()Ljava/lang/StringBuilder;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->b:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 14

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_1

    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    iget-byte v2, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->a:B

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->c:Ljava/util/ArrayList;

    .line 21
    .line 22
    new-instance v1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->d:Ljava/util/ArrayList;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    move v3, v1

    .line 31
    :goto_0
    if-ge v3, v2, :cond_1

    .line 32
    .line 33
    new-instance v4, Landroid/widget/TextView;

    .line 34
    .line 35
    invoke-direct {v4, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 36
    .line 37
    .line 38
    sget-object v5, La/j5d;->a:Landroid/util/TypedValue;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const v5, 0x7f040b72

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v5, v1}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 51
    .line 52
    .line 53
    const/4 v6, 0x1

    .line 54
    const/high16 v7, 0x42100000    # 36.0f

    .line 55
    .line 56
    invoke-virtual {v4, v6, v7}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 57
    .line 58
    .line 59
    const/16 v8, 0x11

    .line 60
    .line 61
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 62
    .line 63
    .line 64
    const/4 v9, 0x0

    .line 65
    invoke-virtual {v4, v9}, Landroid/view/View;->setAlpha(F)V

    .line 66
    .line 67
    .line 68
    const/high16 v10, 0x41c80000    # 25.0f

    .line 69
    .line 70
    invoke-static {v0, v10}, La/i120;->Y(Landroid/content/Context;F)I

    .line 71
    .line 72
    .line 73
    move-result v11

    .line 74
    int-to-float v11, v11

    .line 75
    invoke-virtual {v4, v11}, Landroid/view/View;->setPivotX(F)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v10}, La/i120;->Y(Landroid/content/Context;F)I

    .line 79
    .line 80
    .line 81
    move-result v11

    .line 82
    int-to-float v11, v11

    .line 83
    invoke-virtual {v4, v11}, Landroid/view/View;->setPivotY(F)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    check-cast v11, Landroid/widget/FrameLayout$LayoutParams;

    .line 97
    .line 98
    const/high16 v12, 0x42480000    # 50.0f

    .line 99
    .line 100
    invoke-static {v0, v12}, La/i120;->Y(Landroid/content/Context;F)I

    .line 101
    .line 102
    .line 103
    move-result v13

    .line 104
    iput v13, v11, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 105
    .line 106
    invoke-static {v0, v12}, La/i120;->Y(Landroid/content/Context;F)I

    .line 107
    .line 108
    .line 109
    move-result v13

    .line 110
    iput v13, v11, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 111
    .line 112
    const/16 v13, 0x33

    .line 113
    .line 114
    iput v13, v11, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 115
    .line 116
    invoke-virtual {v4, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 117
    .line 118
    .line 119
    iget-object v11, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->c:Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    new-instance v4, Landroid/widget/TextView;

    .line 125
    .line 126
    invoke-direct {v4, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v0, v5, v1}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4, v6, v7}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4, v9}, Landroid/view/View;->setAlpha(F)V

    .line 143
    .line 144
    .line 145
    iget-object v5, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->e:Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 148
    .line 149
    .line 150
    invoke-static {v0, v10}, La/i120;->Y(Landroid/content/Context;F)I

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    int-to-float v5, v5

    .line 155
    invoke-virtual {v4, v5}, Landroid/view/View;->setPivotX(F)V

    .line 156
    .line 157
    .line 158
    invoke-static {v0, v10}, La/i120;->Y(Landroid/content/Context;F)I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    int-to-float v5, v5

    .line 163
    invoke-virtual {v4, v5}, Landroid/view/View;->setPivotY(F)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    check-cast v5, Landroid/widget/FrameLayout$LayoutParams;

    .line 177
    .line 178
    invoke-static {v0, v12}, La/i120;->Y(Landroid/content/Context;F)I

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    iput v6, v5, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 183
    .line 184
    invoke-static {v0, v12}, La/i120;->Y(Landroid/content/Context;F)I

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    iput v6, v5, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 189
    .line 190
    iput v13, v5, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 191
    .line 192
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 193
    .line 194
    .line 195
    iget-object v5, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->d:Ljava/util/ArrayList;

    .line 196
    .line 197
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    add-int/lit8 v3, v3, 0x1

    .line 201
    .line 202
    goto/16 :goto_0

    .line 203
    .line 204
    :cond_1
    :goto_1
    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 14

    .line 1
    move-object v1, p1

    .line 2
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->getStringBuilder()Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-byte v2, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->a:B

    .line 11
    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const/4 v0, 0x3

    .line 16
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/view/View;->performHapticFeedback(I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catch_0
    move-exception v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 22
    .line 23
    .line 24
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->getStringBuilder()Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->getStringBuilder()Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget-object v4, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->c:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    check-cast v4, Landroid/widget/TextView;

    .line 54
    .line 55
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v3}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f(I)F

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-virtual {v4, v1}, Landroid/view/View;->setTranslationX(F)V

    .line 63
    .line 64
    .line 65
    const/4 v1, 0x2

    .line 66
    new-array v5, v1, [F

    .line 67
    .line 68
    fill-array-data v5, :array_0

    .line 69
    .line 70
    .line 71
    const-string v6, "scaleX"

    .line 72
    .line 73
    invoke-static {v4, v6, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    new-array v5, v1, [F

    .line 81
    .line 82
    fill-array-data v5, :array_1

    .line 83
    .line 84
    .line 85
    const-string v7, "scaleY"

    .line 86
    .line 87
    invoke-static {v4, v7, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    new-array v5, v1, [F

    .line 95
    .line 96
    fill-array-data v5, :array_2

    .line 97
    .line 98
    .line 99
    const-string v8, "alpha"

    .line 100
    .line 101
    invoke-static {v4, v8, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 124
    .line 125
    const/high16 v9, 0x41a00000    # 20.0f

    .line 126
    .line 127
    mul-float/2addr v5, v9

    .line 128
    float-to-double v10, v5

    .line 129
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    .line 130
    .line 131
    .line 132
    move-result-wide v10

    .line 133
    double-to-float v5, v10

    .line 134
    float-to-int v5, v5

    .line 135
    int-to-float v5, v5

    .line 136
    new-array v10, v1, [F

    .line 137
    .line 138
    const/4 v11, 0x0

    .line 139
    aput v5, v10, v11

    .line 140
    .line 141
    const/4 v5, 0x1

    .line 142
    const/4 v12, 0x0

    .line 143
    aput v12, v10, v5

    .line 144
    .line 145
    const-string v13, "translationY"

    .line 146
    .line 147
    invoke-static {v4, v13, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    iget-object v4, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->d:Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    check-cast v4, Landroid/widget/TextView;

    .line 164
    .line 165
    invoke-virtual {p0, v3}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f(I)F

    .line 166
    .line 167
    .line 168
    move-result v10

    .line 169
    invoke-virtual {v4, v10}, Landroid/view/View;->setTranslationX(F)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v4, v12}, Landroid/view/View;->setAlpha(F)V

    .line 173
    .line 174
    .line 175
    new-array v10, v1, [F

    .line 176
    .line 177
    fill-array-data v10, :array_3

    .line 178
    .line 179
    .line 180
    invoke-static {v4, v6, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 181
    .line 182
    .line 183
    move-result-object v10

    .line 184
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    new-array v10, v1, [F

    .line 188
    .line 189
    fill-array-data v10, :array_4

    .line 190
    .line 191
    .line 192
    invoke-static {v4, v7, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 200
    .line 201
    .line 202
    move-result-object v10

    .line 203
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 207
    .line 208
    .line 209
    move-result-object v10

    .line 210
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 215
    .line 216
    mul-float/2addr v10, v9

    .line 217
    float-to-double v9, v10

    .line 218
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    .line 219
    .line 220
    .line 221
    move-result-wide v9

    .line 222
    double-to-float v9, v9

    .line 223
    float-to-int v9, v9

    .line 224
    int-to-float v9, v9

    .line 225
    new-array v1, v1, [F

    .line 226
    .line 227
    aput v9, v1, v11

    .line 228
    .line 229
    aput v12, v1, v5

    .line 230
    .line 231
    invoke-static {v4, v13, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    add-int/lit8 v1, v3, 0x1

    .line 239
    .line 240
    :goto_1
    if-ge v1, v2, :cond_3

    .line 241
    .line 242
    iget-object v4, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->c:Ljava/util/ArrayList;

    .line 243
    .line 244
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    check-cast v4, Landroid/widget/TextView;

    .line 252
    .line 253
    invoke-virtual {v4}, Landroid/view/View;->getAlpha()F

    .line 254
    .line 255
    .line 256
    move-result v9

    .line 257
    cmpg-float v9, v9, v12

    .line 258
    .line 259
    if-nez v9, :cond_1

    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_1
    new-array v9, v5, [F

    .line 263
    .line 264
    aput v12, v9, v11

    .line 265
    .line 266
    invoke-static {v4, v6, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 267
    .line 268
    .line 269
    move-result-object v9

    .line 270
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    new-array v9, v5, [F

    .line 274
    .line 275
    aput v12, v9, v11

    .line 276
    .line 277
    invoke-static {v4, v7, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 278
    .line 279
    .line 280
    move-result-object v9

    .line 281
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    new-array v9, v5, [F

    .line 285
    .line 286
    aput v12, v9, v11

    .line 287
    .line 288
    invoke-static {v4, v8, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    :goto_2
    iget-object v4, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->d:Ljava/util/ArrayList;

    .line 296
    .line 297
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    check-cast v4, Landroid/widget/TextView;

    .line 305
    .line 306
    invoke-virtual {v4}, Landroid/view/View;->getAlpha()F

    .line 307
    .line 308
    .line 309
    move-result v9

    .line 310
    cmpg-float v9, v9, v12

    .line 311
    .line 312
    if-nez v9, :cond_2

    .line 313
    .line 314
    goto :goto_3

    .line 315
    :cond_2
    new-array v9, v5, [F

    .line 316
    .line 317
    aput v12, v9, v11

    .line 318
    .line 319
    invoke-static {v4, v6, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    new-array v9, v5, [F

    .line 327
    .line 328
    aput v12, v9, v11

    .line 329
    .line 330
    invoke-static {v4, v7, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 331
    .line 332
    .line 333
    move-result-object v9

    .line 334
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    new-array v9, v5, [F

    .line 338
    .line 339
    aput v12, v9, v11

    .line 340
    .line 341
    invoke-static {v4, v8, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 349
    .line 350
    goto :goto_1

    .line 351
    :cond_3
    iget-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->g:La/y63;

    .line 352
    .line 353
    if-eqz v1, :cond_4

    .line 354
    .line 355
    invoke-virtual {v1}, La/y63;->run()V

    .line 356
    .line 357
    .line 358
    :cond_4
    new-instance v1, La/y63;

    .line 359
    .line 360
    invoke-direct {v1, p0, v3, v11}, La/y63;-><init>(Ljava/lang/Object;IB)V

    .line 361
    .line 362
    .line 363
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->g:La/y63;

    .line 364
    .line 365
    new-instance v2, La/a13;

    .line 366
    .line 367
    const/4 v4, 0x6

    .line 368
    invoke-direct {v2, v1, v4}, La/a13;-><init>(Ljava/lang/Object;B)V

    .line 369
    .line 370
    .line 371
    new-instance v1, Landroid/os/Handler;

    .line 372
    .line 373
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 374
    .line 375
    .line 376
    move-result-object v9

    .line 377
    invoke-direct {v1, v9}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 378
    .line 379
    .line 380
    new-instance v9, La/w1;

    .line 381
    .line 382
    invoke-direct {v9, v2, v4}, La/w1;-><init>(Ljava/lang/Object;B)V

    .line 383
    .line 384
    .line 385
    move p1, v11

    .line 386
    move v2, v12

    .line 387
    const-wide/16 v11, 0x5dc

    .line 388
    .line 389
    invoke-virtual {v1, v9, v11, v12}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 390
    .line 391
    .line 392
    move v1, p1

    .line 393
    :goto_4
    if-ge v1, v3, :cond_5

    .line 394
    .line 395
    iget-object v4, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->c:Ljava/util/ArrayList;

    .line 396
    .line 397
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v4

    .line 401
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    check-cast v4, Landroid/widget/TextView;

    .line 405
    .line 406
    invoke-virtual {p0, v1}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f(I)F

    .line 407
    .line 408
    .line 409
    move-result v9

    .line 410
    new-array v10, v5, [F

    .line 411
    .line 412
    aput v9, v10, p1

    .line 413
    .line 414
    const-string v9, "translationX"

    .line 415
    .line 416
    invoke-static {v4, v9, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 417
    .line 418
    .line 419
    move-result-object v10

    .line 420
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    new-array v10, v5, [F

    .line 424
    .line 425
    aput v2, v10, p1

    .line 426
    .line 427
    invoke-static {v4, v6, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 428
    .line 429
    .line 430
    move-result-object v10

    .line 431
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    new-array v10, v5, [F

    .line 435
    .line 436
    aput v2, v10, p1

    .line 437
    .line 438
    invoke-static {v4, v7, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 439
    .line 440
    .line 441
    move-result-object v10

    .line 442
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    new-array v10, v5, [F

    .line 446
    .line 447
    aput v2, v10, p1

    .line 448
    .line 449
    invoke-static {v4, v8, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 450
    .line 451
    .line 452
    move-result-object v10

    .line 453
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    new-array v10, v5, [F

    .line 457
    .line 458
    aput v2, v10, p1

    .line 459
    .line 460
    invoke-static {v4, v13, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 461
    .line 462
    .line 463
    move-result-object v4

    .line 464
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    iget-object v4, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->d:Ljava/util/ArrayList;

    .line 468
    .line 469
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v4

    .line 473
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    check-cast v4, Landroid/widget/TextView;

    .line 477
    .line 478
    invoke-virtual {p0, v1}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f(I)F

    .line 479
    .line 480
    .line 481
    move-result v10

    .line 482
    new-array v11, v5, [F

    .line 483
    .line 484
    aput v10, v11, p1

    .line 485
    .line 486
    invoke-static {v4, v9, v11}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 487
    .line 488
    .line 489
    move-result-object v9

    .line 490
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    new-array v9, v5, [F

    .line 494
    .line 495
    const/high16 v10, 0x3f800000    # 1.0f

    .line 496
    .line 497
    aput v10, v9, p1

    .line 498
    .line 499
    invoke-static {v4, v6, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 500
    .line 501
    .line 502
    move-result-object v9

    .line 503
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    new-array v9, v5, [F

    .line 507
    .line 508
    aput v10, v9, p1

    .line 509
    .line 510
    invoke-static {v4, v7, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 511
    .line 512
    .line 513
    move-result-object v9

    .line 514
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 515
    .line 516
    .line 517
    new-array v9, v5, [F

    .line 518
    .line 519
    aput v10, v9, p1

    .line 520
    .line 521
    invoke-static {v4, v8, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 522
    .line 523
    .line 524
    move-result-object v9

    .line 525
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    new-array v9, v5, [F

    .line 529
    .line 530
    aput v2, v9, p1

    .line 531
    .line 532
    invoke-static {v4, v13, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 533
    .line 534
    .line 535
    move-result-object v4

    .line 536
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    add-int/lit8 v1, v1, 0x1

    .line 540
    .line 541
    goto/16 :goto_4

    .line 542
    .line 543
    :cond_5
    iget-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f:Landroid/animation/AnimatorSet;

    .line 544
    .line 545
    if-eqz v1, :cond_6

    .line 546
    .line 547
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->cancel()V

    .line 548
    .line 549
    .line 550
    :cond_6
    new-instance v1, Landroid/animation/AnimatorSet;

    .line 551
    .line 552
    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 553
    .line 554
    .line 555
    const-wide/16 v2, 0x96

    .line 556
    .line 557
    invoke-virtual {v1, v2, v3}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet;->playTogether(Ljava/util/Collection;)V

    .line 561
    .line 562
    .line 563
    new-instance v0, La/x63;

    .line 564
    .line 565
    invoke-direct {v0, p0, v5}, La/x63;-><init>(Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;B)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->start()V

    .line 572
    .line 573
    .line 574
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f:Landroid/animation/AnimatorSet;

    .line 575
    .line 576
    return-void

    .line 577
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    :array_2
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    :array_3
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    :array_4
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final d()V
    .locals 10

    .line 1
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->getStringBuilder()Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->g:La/y63;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->g:La/y63;

    .line 19
    .line 20
    :cond_1
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f:Landroid/animation/AnimatorSet;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f:Landroid/animation/AnimatorSet;

    .line 28
    .line 29
    :cond_2
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->getStringBuilder()Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->getStringBuilder()Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-virtual {v0, v2, v1}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    new-instance v0, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    move v1, v2

    .line 51
    :goto_0
    const/4 v3, 0x1

    .line 52
    iget-byte v4, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->a:B

    .line 53
    .line 54
    if-ge v1, v4, :cond_5

    .line 55
    .line 56
    iget-object v4, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->c:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    check-cast v4, Landroid/widget/TextView;

    .line 66
    .line 67
    invoke-virtual {v4}, Landroid/view/View;->getAlpha()F

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    const/4 v6, 0x0

    .line 72
    cmpg-float v5, v5, v6

    .line 73
    .line 74
    const-string v7, "alpha"

    .line 75
    .line 76
    const-string v8, "scaleY"

    .line 77
    .line 78
    const-string v9, "scaleX"

    .line 79
    .line 80
    if-nez v5, :cond_3

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    new-array v5, v3, [F

    .line 84
    .line 85
    aput v6, v5, v2

    .line 86
    .line 87
    invoke-static {v4, v9, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    new-array v5, v3, [F

    .line 95
    .line 96
    aput v6, v5, v2

    .line 97
    .line 98
    invoke-static {v4, v8, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    new-array v5, v3, [F

    .line 106
    .line 107
    aput v6, v5, v2

    .line 108
    .line 109
    invoke-static {v4, v7, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    :goto_1
    iget-object v4, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->d:Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    check-cast v4, Landroid/widget/TextView;

    .line 126
    .line 127
    invoke-virtual {v4}, Landroid/view/View;->getAlpha()F

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    cmpg-float v5, v5, v6

    .line 132
    .line 133
    if-nez v5, :cond_4

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_4
    new-array v5, v3, [F

    .line 137
    .line 138
    aput v6, v5, v2

    .line 139
    .line 140
    invoke-static {v4, v9, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    new-array v5, v3, [F

    .line 148
    .line 149
    aput v6, v5, v2

    .line 150
    .line 151
    invoke-static {v4, v8, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    new-array v3, v3, [F

    .line 159
    .line 160
    aput v6, v3, v2

    .line 161
    .line 162
    invoke-static {v4, v7, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_5
    new-instance v1, Landroid/animation/AnimatorSet;

    .line 173
    .line 174
    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 175
    .line 176
    .line 177
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f:Landroid/animation/AnimatorSet;

    .line 178
    .line 179
    const-wide/16 v4, 0x96

    .line 180
    .line 181
    invoke-virtual {v1, v4, v5}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 182
    .line 183
    .line 184
    iget-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f:Landroid/animation/AnimatorSet;

    .line 185
    .line 186
    if-eqz v1, :cond_6

    .line 187
    .line 188
    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet;->playTogether(Ljava/util/Collection;)V

    .line 189
    .line 190
    .line 191
    :cond_6
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f:Landroid/animation/AnimatorSet;

    .line 192
    .line 193
    if-eqz v0, :cond_7

    .line 194
    .line 195
    new-instance v1, La/w63;

    .line 196
    .line 197
    invoke-direct {v1, p0, v3}, La/w63;-><init>(Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;B)V

    .line 198
    .line 199
    .line 200
    new-instance v2, La/q8d;

    .line 201
    .line 202
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 203
    .line 204
    .line 205
    new-instance v3, La/trb;

    .line 206
    .line 207
    const/16 v4, 0xf

    .line 208
    .line 209
    invoke-direct {v3, v1, v4}, La/trb;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 210
    .line 211
    .line 212
    iput-object v3, v2, La/q8d;->a:Lkotlin/jvm/functions/Function1;

    .line 213
    .line 214
    invoke-virtual {v0, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 215
    .line 216
    .line 217
    :cond_7
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f:Landroid/animation/AnimatorSet;

    .line 218
    .line 219
    if-eqz p0, :cond_8

    .line 220
    .line 221
    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->start()V

    .line 222
    .line 223
    .line 224
    :cond_8
    :goto_3
    return-void
.end method

.method public final e()V
    .locals 14

    .line 1
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->getStringBuilder()Ljava/lang/StringBuilder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_5

    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x3

    .line 14
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/view/View;->performHapticFeedback(I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 20
    .line 21
    .line 22
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->getStringBuilder()Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/4 v2, 0x1

    .line 36
    sub-int/2addr v1, v2

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->getStringBuilder()Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    :cond_1
    move v3, v1

    .line 47
    :goto_1
    const/4 v4, 0x0

    .line 48
    const-string v5, "translationX"

    .line 49
    .line 50
    iget-byte v6, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->a:B

    .line 51
    .line 52
    if-ge v3, v6, :cond_4

    .line 53
    .line 54
    iget-object v6, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->c:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    check-cast v6, Landroid/widget/TextView;

    .line 64
    .line 65
    invoke-virtual {v6}, Landroid/view/View;->getAlpha()F

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    const/4 v8, 0x0

    .line 70
    cmpg-float v7, v7, v8

    .line 71
    .line 72
    const-string v9, "translationY"

    .line 73
    .line 74
    const-string v10, "alpha"

    .line 75
    .line 76
    const-string v11, "scaleY"

    .line 77
    .line 78
    const-string v12, "scaleX"

    .line 79
    .line 80
    if-nez v7, :cond_2

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_2
    new-array v7, v2, [F

    .line 84
    .line 85
    aput v8, v7, v4

    .line 86
    .line 87
    invoke-static {v6, v12, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    new-array v7, v2, [F

    .line 95
    .line 96
    aput v8, v7, v4

    .line 97
    .line 98
    invoke-static {v6, v11, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    new-array v7, v2, [F

    .line 106
    .line 107
    aput v8, v7, v4

    .line 108
    .line 109
    invoke-static {v6, v10, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    new-array v7, v2, [F

    .line 117
    .line 118
    aput v8, v7, v4

    .line 119
    .line 120
    invoke-static {v6, v9, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, v3}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f(I)F

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    new-array v13, v2, [F

    .line 132
    .line 133
    aput v7, v13, v4

    .line 134
    .line 135
    invoke-static {v6, v5, v13}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    :goto_2
    iget-object v6, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->d:Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    check-cast v6, Landroid/widget/TextView;

    .line 152
    .line 153
    invoke-virtual {v6}, Landroid/view/View;->getAlpha()F

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    cmpg-float v7, v7, v8

    .line 158
    .line 159
    if-nez v7, :cond_3

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_3
    new-array v7, v2, [F

    .line 163
    .line 164
    aput v8, v7, v4

    .line 165
    .line 166
    invoke-static {v6, v12, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    new-array v7, v2, [F

    .line 174
    .line 175
    aput v8, v7, v4

    .line 176
    .line 177
    invoke-static {v6, v11, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    new-array v7, v2, [F

    .line 185
    .line 186
    aput v8, v7, v4

    .line 187
    .line 188
    invoke-static {v6, v10, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    new-array v7, v2, [F

    .line 196
    .line 197
    aput v8, v7, v4

    .line 198
    .line 199
    invoke-static {v6, v9, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 200
    .line 201
    .line 202
    move-result-object v7

    .line 203
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0, v3}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f(I)F

    .line 207
    .line 208
    .line 209
    move-result v7

    .line 210
    new-array v8, v2, [F

    .line 211
    .line 212
    aput v7, v8, v4

    .line 213
    .line 214
    invoke-static {v6, v5, v8}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 222
    .line 223
    goto/16 :goto_1

    .line 224
    .line 225
    :cond_4
    if-nez v1, :cond_5

    .line 226
    .line 227
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->getStringBuilder()Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    :cond_5
    move v3, v4

    .line 235
    :goto_4
    if-ge v3, v1, :cond_6

    .line 236
    .line 237
    iget-object v6, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->c:Ljava/util/ArrayList;

    .line 238
    .line 239
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    check-cast v6, Landroid/widget/TextView;

    .line 247
    .line 248
    invoke-virtual {p0, v3}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f(I)F

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    new-array v8, v2, [F

    .line 253
    .line 254
    aput v7, v8, v4

    .line 255
    .line 256
    invoke-static {v6, v5, v8}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    iget-object v6, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->d:Ljava/util/ArrayList;

    .line 264
    .line 265
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v6

    .line 269
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    check-cast v6, Landroid/widget/TextView;

    .line 273
    .line 274
    invoke-virtual {p0, v3}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f(I)F

    .line 275
    .line 276
    .line 277
    move-result v7

    .line 278
    new-array v8, v2, [F

    .line 279
    .line 280
    aput v7, v8, v4

    .line 281
    .line 282
    invoke-static {v6, v5, v8}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 283
    .line 284
    .line 285
    move-result-object v6

    .line 286
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    add-int/lit8 v3, v3, 0x1

    .line 290
    .line 291
    goto :goto_4

    .line 292
    :cond_6
    iget-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->g:La/y63;

    .line 293
    .line 294
    if-eqz v1, :cond_7

    .line 295
    .line 296
    const/4 v1, 0x0

    .line 297
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->g:La/y63;

    .line 298
    .line 299
    :cond_7
    iget-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f:Landroid/animation/AnimatorSet;

    .line 300
    .line 301
    if-eqz v1, :cond_8

    .line 302
    .line 303
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->cancel()V

    .line 304
    .line 305
    .line 306
    :cond_8
    new-instance v1, Landroid/animation/AnimatorSet;

    .line 307
    .line 308
    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 309
    .line 310
    .line 311
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f:Landroid/animation/AnimatorSet;

    .line 312
    .line 313
    const-wide/16 v2, 0x96

    .line 314
    .line 315
    invoke-virtual {v1, v2, v3}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 316
    .line 317
    .line 318
    iget-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f:Landroid/animation/AnimatorSet;

    .line 319
    .line 320
    if-eqz v1, :cond_9

    .line 321
    .line 322
    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet;->playTogether(Ljava/util/Collection;)V

    .line 323
    .line 324
    .line 325
    :cond_9
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f:Landroid/animation/AnimatorSet;

    .line 326
    .line 327
    if-eqz v0, :cond_a

    .line 328
    .line 329
    new-instance v1, La/w63;

    .line 330
    .line 331
    invoke-direct {v1, p0, v4}, La/w63;-><init>(Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;B)V

    .line 332
    .line 333
    .line 334
    new-instance v2, La/q8d;

    .line 335
    .line 336
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 337
    .line 338
    .line 339
    new-instance v3, La/trb;

    .line 340
    .line 341
    const/16 v4, 0xf

    .line 342
    .line 343
    invoke-direct {v3, v1, v4}, La/trb;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 344
    .line 345
    .line 346
    iput-object v3, v2, La/q8d;->a:Lkotlin/jvm/functions/Function1;

    .line 347
    .line 348
    invoke-virtual {v0, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 349
    .line 350
    .line 351
    :cond_a
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f:Landroid/animation/AnimatorSet;

    .line 352
    .line 353
    if-eqz p0, :cond_b

    .line 354
    .line 355
    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->start()V

    .line 356
    .line 357
    .line 358
    :cond_b
    :goto_5
    return-void
.end method

.method public final f(I)F
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->getStringBuilder()Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/high16 v3, 0x41f00000    # 30.0f

    .line 21
    .line 22
    invoke-static {v2, v3}, La/i120;->Y(Landroid/content/Context;F)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    mul-int/2addr v2, v1

    .line 27
    sub-int/2addr v0, v2

    .line 28
    div-int/lit8 v0, v0, 0x2

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v3}, La/i120;->Y(Landroid/content/Context;F)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    mul-int/2addr v1, p1

    .line 42
    add-int/2addr v1, v0

    .line 43
    int-to-float p1, v1

    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    const/high16 v0, 0x41200000    # 10.0f

    .line 52
    .line 53
    invoke-static {p0, v0}, La/i120;->Y(Landroid/content/Context;F)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    int-to-float p0, p0

    .line 58
    sub-float/2addr p1, p0

    .line 59
    return p1
.end method

.method public getLayoutView()I
    .locals 0

    const p0, 0x7f0d0191

    return p0
.end method

.method public final onLayout(ZIIII)V
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->g:La/y63;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->g:La/y63;

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f:Landroid/animation/AnimatorSet;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f:Landroid/animation/AnimatorSet;

    .line 16
    .line 17
    :cond_1
    const/4 v0, 0x0

    .line 18
    :goto_0
    iget-byte v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->a:B

    .line 19
    .line 20
    if-ge v0, v1, :cond_3

    .line 21
    .line 22
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->getStringBuilder()Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    iget-object v2, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->c:Ljava/util/ArrayList;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    if-ge v0, v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    check-cast v1, Landroid/widget/TextView;

    .line 43
    .line 44
    invoke-virtual {v1, v3}, Landroid/view/View;->setAlpha(F)V

    .line 45
    .line 46
    .line 47
    const/high16 v2, 0x3f800000    # 1.0f

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Landroid/view/View;->setScaleX(F)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2}, Landroid/view/View;->setScaleY(F)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v3}, Landroid/view/View;->setTranslationY(F)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f(I)F

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    invoke-virtual {v1, v4}, Landroid/view/View;->setTranslationX(F)V

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->d:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    check-cast v1, Landroid/widget/TextView;

    .line 75
    .line 76
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v2}, Landroid/view/View;->setScaleX(F)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2}, Landroid/view/View;->setScaleY(F)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v3}, Landroid/view/View;->setTranslationY(F)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v0}, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->f(I)F

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationX(F)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    check-cast v1, Landroid/widget/TextView;

    .line 101
    .line 102
    invoke-virtual {v1, v3}, Landroid/view/View;->setAlpha(F)V

    .line 103
    .line 104
    .line 105
    iget-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->d:Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    check-cast v1, Landroid/widget/TextView;

    .line 112
    .line 113
    invoke-virtual {v1, v3}, Landroid/view/View;->setAlpha(F)V

    .line 114
    .line 115
    .line 116
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_3
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public final setPasswordFinishedInterface(Lkotlin/jvm/functions/Function1;)V
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
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/AnimatingPasswordTextView;->h:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    return-void
.end method
