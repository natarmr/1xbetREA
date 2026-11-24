.class public final Lorg/xplatform/ui_core/circleindicator/CircleIndicator;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# static fields
.field public static final synthetic o:I


# instance fields
.field public final a:La/ijc;

.field public final b:La/xp6;

.field public final c:La/gz6;

.field public final d:La/hjc;

.field public final e:La/hjc;

.field public f:La/tk80;

.field public g:Landroidx/recyclerview/widget/RecyclerView;

.field public h:Landroidx/viewpager2/widget/ViewPager2;

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public final m:La/ku5;

.field public final n:La/nhf0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 270
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 269
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    and-int/lit8 v3, p3, 0x2

    .line 7
    .line 8
    if-eqz v3, :cond_0

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object/from16 v3, p2

    .line 13
    .line 14
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-direct {v0, v1, v3, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 19
    .line 20
    .line 21
    new-instance v5, La/ijc;

    .line 22
    .line 23
    invoke-direct {v5, v0}, La/ijc;-><init>(Lorg/xplatform/ui_core/circleindicator/CircleIndicator;)V

    .line 24
    .line 25
    .line 26
    iput-object v5, v0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->a:La/ijc;

    .line 27
    .line 28
    new-instance v5, La/xp6;

    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    invoke-direct {v5, v0, v6}, La/xp6;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    iput-object v5, v0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->b:La/xp6;

    .line 35
    .line 36
    new-instance v5, La/gz6;

    .line 37
    .line 38
    invoke-direct {v5, v0, v6}, La/gz6;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    iput-object v5, v0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->c:La/gz6;

    .line 42
    .line 43
    new-instance v5, La/hjc;

    .line 44
    .line 45
    invoke-direct {v5, v0, v4}, La/hjc;-><init>(Lorg/xplatform/ui_core/circleindicator/CircleIndicator;B)V

    .line 46
    .line 47
    .line 48
    iput-object v5, v0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->d:La/hjc;

    .line 49
    .line 50
    new-instance v5, La/hjc;

    .line 51
    .line 52
    invoke-direct {v5, v0, v6}, La/hjc;-><init>(Lorg/xplatform/ui_core/circleindicator/CircleIndicator;B)V

    .line 53
    .line 54
    .line 55
    iput-object v5, v0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->e:La/hjc;

    .line 56
    .line 57
    const/4 v5, -0x1

    .line 58
    iput v5, v0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->i:I

    .line 59
    .line 60
    iput v5, v0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->j:I

    .line 61
    .line 62
    iput v5, v0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->k:I

    .line 63
    .line 64
    sget-object v7, La/aqd0;->g:[I

    .line 65
    .line 66
    invoke-virtual {v1, v3, v7}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    const/16 v7, 0x8

    .line 74
    .line 75
    invoke-virtual {v3, v7, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    const/4 v8, 0x5

    .line 80
    invoke-virtual {v3, v8, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    const/4 v10, 0x6

    .line 85
    invoke-virtual {v3, v10, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    const v11, 0x7f02002e

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, v4, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 93
    .line 94
    .line 95
    move-result v12

    .line 96
    invoke-virtual {v3, v6, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 97
    .line 98
    .line 99
    move-result v18

    .line 100
    const v13, 0x7f080f90

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3, v2, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    const/4 v14, 0x3

    .line 108
    invoke-virtual {v3, v14, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 109
    .line 110
    .line 111
    move-result v14

    .line 112
    const/4 v15, 0x7

    .line 113
    invoke-virtual {v3, v15, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 114
    .line 115
    .line 116
    move-result v15

    .line 117
    if-ne v15, v6, :cond_1

    .line 118
    .line 119
    move v4, v6

    .line 120
    :cond_1
    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 121
    .line 122
    .line 123
    const/4 v4, 0x4

    .line 124
    invoke-virtual {v3, v4, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-ltz v4, :cond_2

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_2
    const/16 v4, 0x11

    .line 132
    .line 133
    :goto_1
    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 134
    .line 135
    .line 136
    move v4, v13

    .line 137
    new-instance v13, La/ku5;

    .line 138
    .line 139
    if-gez v10, :cond_3

    .line 140
    .line 141
    invoke-static {v8}, La/sj3;->X(I)I

    .line 142
    .line 143
    .line 144
    move-result v10

    .line 145
    :cond_3
    if-gez v7, :cond_4

    .line 146
    .line 147
    invoke-static {v8}, La/sj3;->X(I)I

    .line 148
    .line 149
    .line 150
    move-result v7

    .line 151
    :cond_4
    move v15, v7

    .line 152
    if-gez v9, :cond_5

    .line 153
    .line 154
    invoke-static {v8}, La/sj3;->X(I)I

    .line 155
    .line 156
    .line 157
    move-result v9

    .line 158
    :cond_5
    move/from16 v16, v9

    .line 159
    .line 160
    if-nez v12, :cond_6

    .line 161
    .line 162
    move/from16 v17, v11

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_6
    move/from16 v17, v12

    .line 166
    .line 167
    :goto_2
    if-nez v2, :cond_7

    .line 168
    .line 169
    move/from16 v19, v4

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_7
    move/from16 v19, v2

    .line 173
    .line 174
    :goto_3
    if-nez v14, :cond_8

    .line 175
    .line 176
    move/from16 v20, v2

    .line 177
    .line 178
    :goto_4
    move v14, v10

    .line 179
    goto :goto_5

    .line 180
    :cond_8
    move/from16 v20, v14

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :goto_5
    invoke-direct/range {v13 .. v20}, La/ku5;-><init>(IIIIIII)V

    .line 184
    .line 185
    .line 186
    move/from16 v12, v17

    .line 187
    .line 188
    move/from16 v2, v18

    .line 189
    .line 190
    iput-object v13, v0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->m:La/ku5;

    .line 191
    .line 192
    invoke-static {v1, v12}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-static {v1, v12}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    const-wide/16 v6, 0x0

    .line 207
    .line 208
    invoke-virtual {v5, v6, v7}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 209
    .line 210
    .line 211
    if-nez v2, :cond_9

    .line 212
    .line 213
    invoke-static {v1, v12}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    .line 214
    .line 215
    .line 216
    move-result-object v8

    .line 217
    new-instance v9, La/jjc;

    .line 218
    .line 219
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v8, v9}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 223
    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_9
    invoke-static {v1, v2}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    .line 227
    .line 228
    .line 229
    move-result-object v8

    .line 230
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    :goto_6
    if-nez v2, :cond_a

    .line 234
    .line 235
    invoke-static {v1, v12}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    new-instance v2, La/jjc;

    .line 240
    .line 241
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v1, v2}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 245
    .line 246
    .line 247
    goto :goto_7

    .line 248
    :cond_a
    invoke-static {v1, v2}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    :goto_7
    invoke-virtual {v1, v6, v7}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 256
    .line 257
    .line 258
    new-instance v2, La/nhf0;

    .line 259
    .line 260
    invoke-direct {v2, v4, v8, v5, v1}, La/nhf0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    iput-object v2, v0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->n:La/nhf0;

    .line 264
    .line 265
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 266
    .line 267
    .line 268
    return-void
.end method


# virtual methods
.method public final a(IILandroid/animation/Animator;)V
    .locals 5

    .line 1
    invoke-virtual {p3}, Landroid/animation/Animator;->isRunning()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p3}, Landroid/animation/Animator;->end()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3}, Landroid/animation/Animator;->cancel()V

    .line 11
    .line 12
    .line 13
    :cond_0
    new-instance v0, Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {p2, v1}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {v0, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 31
    .line 32
    .line 33
    iget-object p2, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->m:La/ku5;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    const-string v2, "settings"

    .line 37
    .line 38
    if-eqz p2, :cond_4

    .line 39
    .line 40
    iget v3, p2, La/ku5;->c:I

    .line 41
    .line 42
    iget v4, p2, La/ku5;->d:I

    .line 43
    .line 44
    invoke-virtual {p0, v0, v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    check-cast p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 55
    .line 56
    if-nez p1, :cond_2

    .line 57
    .line 58
    if-eqz p2, :cond_1

    .line 59
    .line 60
    iget p1, p2, La/ku5;->b:I

    .line 61
    .line 62
    iput p1, p0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 63
    .line 64
    iput p1, p0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v1

    .line 71
    :cond_2
    if-eqz p2, :cond_3

    .line 72
    .line 73
    iget p1, p2, La/ku5;->b:I

    .line 74
    .line 75
    iput p1, p0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 76
    .line 77
    iput p1, p0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 78
    .line 79
    :goto_0
    invoke-virtual {v0, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p3, v0}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p3}, Landroid/animation/Animator;->start()V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw v1

    .line 93
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw v1
.end method

.method public final b(I)V
    .locals 8

    .line 1
    iget v0, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->i:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->n:La/nhf0;

    .line 7
    .line 8
    const-string v1, "animators"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v0, :cond_10

    .line 12
    .line 13
    iget-object v3, v0, La/nhf0;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Landroid/animation/Animator;

    .line 16
    .line 17
    invoke-virtual {v3}, Landroid/animation/Animator;->isRunning()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_3

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    iget-object v3, v0, La/nhf0;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, Landroid/animation/Animator;

    .line 28
    .line 29
    invoke-virtual {v3}, Landroid/animation/Animator;->end()V

    .line 30
    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v3, v0, La/nhf0;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, Landroid/animation/Animator;

    .line 37
    .line 38
    invoke-virtual {v3}, Landroid/animation/Animator;->cancel()V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v2

    .line 46
    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v2

    .line 50
    :cond_3
    :goto_0
    if-eqz v0, :cond_f

    .line 51
    .line 52
    iget-object v3, v0, La/nhf0;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, Landroid/animation/Animator;

    .line 55
    .line 56
    invoke-virtual {v3}, Landroid/animation/Animator;->isRunning()Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_6

    .line 61
    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    iget-object v3, v0, La/nhf0;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v3, Landroid/animation/Animator;

    .line 67
    .line 68
    invoke-virtual {v3}, Landroid/animation/Animator;->end()V

    .line 69
    .line 70
    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    iget-object v3, v0, La/nhf0;->a:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v3, Landroid/animation/Animator;

    .line 76
    .line 77
    invoke-virtual {v3}, Landroid/animation/Animator;->cancel()V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v2

    .line 85
    :cond_5
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v2

    .line 89
    :cond_6
    :goto_1
    iget v3, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->i:I

    .line 90
    .line 91
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    iget v4, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->i:I

    .line 96
    .line 97
    iget-object v5, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->m:La/ku5;

    .line 98
    .line 99
    const-string v6, "settings"

    .line 100
    .line 101
    if-ltz v4, :cond_a

    .line 102
    .line 103
    if-eqz v3, :cond_a

    .line 104
    .line 105
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    if-eqz v5, :cond_9

    .line 110
    .line 111
    iget v7, v5, La/ku5;->f:I

    .line 112
    .line 113
    invoke-static {v7, v4}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-virtual {v3, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 118
    .line 119
    .line 120
    if-eqz v0, :cond_8

    .line 121
    .line 122
    iget-object v4, v0, La/nhf0;->b:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v4, Landroid/animation/Animator;

    .line 125
    .line 126
    invoke-virtual {v4, v3}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    if-eqz v0, :cond_7

    .line 130
    .line 131
    iget-object v3, v0, La/nhf0;->b:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v3, Landroid/animation/Animator;

    .line 134
    .line 135
    invoke-virtual {v3}, Landroid/animation/Animator;->start()V

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_7
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v2

    .line 143
    :cond_8
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw v2

    .line 147
    :cond_9
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw v2

    .line 151
    :cond_a
    :goto_2
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    if-eqz v3, :cond_e

    .line 156
    .line 157
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    if-eqz v5, :cond_d

    .line 162
    .line 163
    iget v5, v5, La/ku5;->e:I

    .line 164
    .line 165
    invoke-static {v5, v4}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    invoke-virtual {v3, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 170
    .line 171
    .line 172
    if-eqz v0, :cond_c

    .line 173
    .line 174
    iget-object v4, v0, La/nhf0;->a:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v4, Landroid/animation/Animator;

    .line 177
    .line 178
    invoke-virtual {v4, v3}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    if-eqz v0, :cond_b

    .line 182
    .line 183
    iget-object v0, v0, La/nhf0;->a:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, Landroid/animation/Animator;

    .line 186
    .line 187
    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    .line 188
    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_b
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw v2

    .line 195
    :cond_c
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw v2

    .line 199
    :cond_d
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw v2

    .line 203
    :cond_e
    :goto_3
    iput p1, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->i:I

    .line 204
    .line 205
    return-void

    .line 206
    :cond_f
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    throw v2

    .line 210
    :cond_10
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw v2
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->h:Landroidx/viewpager2/widget/ViewPager2;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()La/yge0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v1, v0, La/yge0;->a:La/zge0;

    .line 12
    .line 13
    invoke-virtual {v1}, La/zge0;->a()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->e:La/hjc;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, La/yge0;->y(La/ahe0;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->h:Landroidx/viewpager2/widget/ViewPager2;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object p0, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->b:La/xp6;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Landroidx/viewpager2/widget/ViewPager2;->g(La/nju0;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final d()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->k:I

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-lt v0, v1, :cond_5

    .line 8
    .line 9
    iget v1, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->j:I

    .line 10
    .line 11
    iput v1, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->i:I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-ge v1, v0, :cond_5

    .line 15
    .line 16
    iget v2, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->j:I

    .line 17
    .line 18
    iget-object v3, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->n:La/nhf0;

    .line 19
    .line 20
    iget-object v4, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->m:La/ku5;

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    const-string v6, "animators"

    .line 24
    .line 25
    const-string v7, "settings"

    .line 26
    .line 27
    if-ne v2, v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getOrientation()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    iget v4, v4, La/ku5;->e:I

    .line 36
    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    iget-object v3, v3, La/nhf0;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, Landroid/animation/Animator;

    .line 42
    .line 43
    invoke-virtual {p0, v2, v4, v3}, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->a(IILandroid/animation/Animator;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v5

    .line 51
    :cond_1
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v5

    .line 55
    :cond_2
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getOrientation()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v4, :cond_4

    .line 60
    .line 61
    iget v4, v4, La/ku5;->f:I

    .line 62
    .line 63
    if-eqz v3, :cond_3

    .line 64
    .line 65
    iget-object v3, v3, La/nhf0;->d:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v3, Landroid/animation/Animator;

    .line 68
    .line 69
    invoke-virtual {p0, v2, v4, v3}, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->a(IILandroid/animation/Animator;)V

    .line 70
    .line 71
    .line 72
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v5

    .line 79
    :cond_4
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v5

    .line 83
    :cond_5
    return-void
.end method

.method public final e(Landroidx/recyclerview/widget/b;)I
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget-object p0, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->f:La/tk80;

    .line 5
    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/tk80;->e(Landroidx/recyclerview/widget/b;)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/4 p0, 0x0

    .line 14
    :goto_0
    if-nez p0, :cond_2

    .line 15
    .line 16
    :goto_1
    const/4 p0, -0x1

    .line 17
    return p0

    .line 18
    :cond_2
    invoke-static {p0}, Landroidx/recyclerview/widget/b;->T(Landroid/view/View;)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->c:La/gz6;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->u0(La/lhe0;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->h:Landroidx/viewpager2/widget/ViewPager2;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->b:La/xp6;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->g(La/nju0;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    instance-of v0, p1, Landroid/os/Bundle;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroid/os/Bundle;

    .line 6
    .line 7
    const-string v0, "BUNDLE_KEY_SUPER"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "BUNDLE_KEY_INFO_POSITION"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iput p1, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->l:I

    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->i:I

    .line 7
    .line 8
    const/4 v2, -0x1

    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    const-string v2, "BUNDLE_KEY_INFO_POSITION"

    .line 12
    .line 13
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const-string v1, "BUNDLE_KEY_SUPER"

    .line 17
    .line 18
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public final setViewPager(Landroidx/viewpager/widget/ViewPager;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getAdapter()La/pj80;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    iput v1, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->i:I

    .line 12
    .line 13
    invoke-virtual {v0}, La/pj80;->c()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->k:I

    .line 18
    .line 19
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iput v0, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->j:I

    .line 24
    .line 25
    invoke-virtual {p0}, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->d()V

    .line 26
    .line 27
    .line 28
    iget-object v0, p1, Landroidx/viewpager/widget/ViewPager;->u1:Ljava/util/ArrayList;

    .line 29
    .line 30
    iget-object p0, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->a:La/ijc;

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v0, p1, Landroidx/viewpager/widget/ViewPager;->u1:Ljava/util/ArrayList;

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    new-instance v0, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v0, p1, Landroidx/viewpager/widget/ViewPager;->u1:Ljava/util/ArrayList;

    .line 47
    .line 48
    :cond_1
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-virtual {p0, p1}, La/ijc;->c(I)V

    .line 56
    .line 57
    .line 58
    :cond_2
    return-void
.end method

.method public final setViewPager2(Landroidx/viewpager2/widget/ViewPager2;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->h:Landroidx/viewpager2/widget/ViewPager2;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()La/yge0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->e:La/hjc;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, La/yge0;->v(La/ahe0;)V

    .line 15
    .line 16
    .line 17
    const/4 v1, -0x1

    .line 18
    iput v1, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->i:I

    .line 19
    .line 20
    invoke-virtual {v0}, La/yge0;->d()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iput v0, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->k:I

    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iput v0, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->j:I

    .line 31
    .line 32
    invoke-virtual {p0}, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->d()V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->b:La/xp6;

    .line 36
    .line 37
    invoke-virtual {p1, p0}, Landroidx/viewpager2/widget/ViewPager2;->c(La/nju0;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-virtual {p0, p1}, La/xp6;->c(I)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method
