.class public final Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView$SavedState;
    }
.end annotation


# static fields
.field public static final synthetic v:I


# instance fields
.field public final q:La/a8z;

.field public r:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;

.field public s:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/value/b;

.field public t:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;

.field public u:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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
    const/4 p3, 0x0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    new-instance p1, La/ucj;

    .line 14
    .line 15
    const/16 p2, 0x19

    .line 16
    .line 17
    invoke-direct {p1, p0, p2}, La/ucj;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    sget-object p2, La/wez;->b:La/wez;

    .line 21
    .line 22
    invoke-static {p2, p1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;->q:La/a8z;

    .line 27
    .line 28
    return-void
.end method

.method private final getDownloadViewInflater()La/ucl;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;->q:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ucl;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;->u:I

    .line 5
    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;->t:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;->j()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;->t:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;->k()V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;->r:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const v0, 0x7f0a046e

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;

    .line 13
    .line 14
    iput-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;->r:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;->s:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/value/b;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    const v0, 0x7f0a0471

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/value/b;

    .line 28
    .line 29
    iput-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;->s:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/value/b;

    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;->t:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    const v0, 0x7f0a0470

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;

    .line 43
    .line 44
    iput-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;->t:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;

    .line 45
    .line 46
    :cond_2
    invoke-super/range {p0 .. p5}, Landroidx/constraintlayout/widget/ConstraintLayout;->onLayout(ZIIII)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView$SavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView$SavedState;

    .line 6
    .line 7
    iget v0, p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView$SavedState;->b:I

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;->v(I)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p1, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView$SavedState;->a:Landroid/os/Parcelable;

    .line 13
    .line 14
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    new-instance v0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView$SavedState;

    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget p0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;->u:I

    .line 8
    .line 9
    invoke-direct {v0, v1, p0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView$SavedState;-><init>(Landroid/os/Parcelable;I)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final u(La/ql3;)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-static/range {p0 .. p0}, La/hxm0;->q(Landroid/view/ViewGroup;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-direct/range {p0 .. p0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;->getDownloadViewInflater()La/ucl;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v3, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;

    .line 26
    .line 27
    iget-object v4, v1, La/ucl;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 28
    .line 29
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-direct {v3, v5}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;-><init>(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    new-instance v3, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/value/b;

    .line 43
    .line 44
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-direct {v3, v5}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/value/b;-><init>(Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    instance-of v3, v0, La/nl3;

    .line 58
    .line 59
    const v5, 0x7f0a046f

    .line 60
    .line 61
    .line 62
    if-eqz v3, :cond_1

    .line 63
    .line 64
    new-instance v6, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/description/b;

    .line 65
    .line 66
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-direct {v6, v7}, Lcom/google/android/material/textview/MaterialTextView;-><init>(Landroid/content/Context;)V

    .line 77
    .line 78
    .line 79
    const-string v7, ""

    .line 80
    .line 81
    iput-object v7, v6, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/description/b;->i:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v6, v5}, Landroid/view/View;->setId(I)V

    .line 84
    .line 85
    .line 86
    const/4 v7, 0x5

    .line 87
    invoke-virtual {v6, v7}, Landroid/view/View;->setTextDirection(I)V

    .line 88
    .line 89
    .line 90
    const/16 v7, 0x11

    .line 91
    .line 92
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v6}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    :cond_1
    instance-of v6, v0, La/ol3;

    .line 99
    .line 100
    if-nez v6, :cond_3

    .line 101
    .line 102
    instance-of v7, v0, La/pl3;

    .line 103
    .line 104
    if-eqz v7, :cond_2

    .line 105
    .line 106
    move-object v7, v0

    .line 107
    check-cast v7, La/pl3;

    .line 108
    .line 109
    iget-object v8, v7, La/pl3;->b:La/ml3;

    .line 110
    .line 111
    instance-of v8, v8, La/il3;

    .line 112
    .line 113
    if-nez v8, :cond_3

    .line 114
    .line 115
    iget-object v7, v7, La/pl3;->a:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    if-nez v7, :cond_2

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_2
    new-instance v7, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;

    .line 125
    .line 126
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-direct {v7, v8}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;-><init>(Landroid/content/Context;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    :cond_3
    :goto_0
    invoke-static {v2}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    const/4 v7, 0x0

    .line 144
    const/4 v8, -0x1

    .line 145
    const v9, 0x7f070718

    .line 146
    .line 147
    .line 148
    const/16 v10, 0xa

    .line 149
    .line 150
    const v11, 0x7f0a046e

    .line 151
    .line 152
    .line 153
    const/4 v12, -0x2

    .line 154
    const v13, 0x7f0706f8

    .line 155
    .line 156
    .line 157
    const/high16 v14, 0x3f800000    # 1.0f

    .line 158
    .line 159
    if-eqz v3, :cond_d

    .line 160
    .line 161
    check-cast v0, La/nl3;

    .line 162
    .line 163
    iget-object v3, v0, La/nl3;->c:La/ml3;

    .line 164
    .line 165
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    const v15, 0x7f080298

    .line 170
    .line 171
    .line 172
    invoke-virtual {v6, v15}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    invoke-virtual {v4, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 177
    .line 178
    .line 179
    new-instance v6, Ljava/util/ArrayList;

    .line 180
    .line 181
    invoke-static {v2, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    invoke-direct {v6, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2, v7}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 189
    .line 190
    .line 191
    move-result-object v10

    .line 192
    :goto_1
    move-object v15, v10

    .line 193
    check-cast v15, La/paw;

    .line 194
    .line 195
    invoke-virtual {v15}, La/paw;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v16

    .line 199
    if-eqz v16, :cond_20

    .line 200
    .line 201
    invoke-virtual {v15}, La/paw;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v15

    .line 205
    check-cast v15, Landroid/view/View;

    .line 206
    .line 207
    if-nez v15, :cond_4

    .line 208
    .line 209
    goto/16 :goto_12

    .line 210
    .line 211
    :cond_4
    instance-of v5, v15, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;

    .line 212
    .line 213
    if-eqz v5, :cond_5

    .line 214
    .line 215
    check-cast v15, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;

    .line 216
    .line 217
    new-instance v5, La/qn3;

    .line 218
    .line 219
    invoke-direct {v5}, La/qn3;-><init>()V

    .line 220
    .line 221
    .line 222
    iput v7, v5, La/qn3;->a:I

    .line 223
    .line 224
    iput v12, v5, La/qn3;->b:I

    .line 225
    .line 226
    iput v7, v5, La/qn3;->c:I

    .line 227
    .line 228
    iput v7, v5, La/qn3;->e:I

    .line 229
    .line 230
    iput v7, v5, La/qn3;->h:I

    .line 231
    .line 232
    iput v7, v5, La/qn3;->f:I

    .line 233
    .line 234
    iput v9, v5, La/qn3;->n:I

    .line 235
    .line 236
    iput v13, v5, La/qn3;->m:I

    .line 237
    .line 238
    iput v13, v5, La/qn3;->k:I

    .line 239
    .line 240
    iput v14, v5, La/qn3;->i:F

    .line 241
    .line 242
    invoke-virtual {v5}, La/qn3;->a()La/pn3;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    invoke-virtual {v15, v5}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->setContainerLayoutParams(La/pn3;)V

    .line 247
    .line 248
    .line 249
    const v5, 0x7f060784

    .line 250
    .line 251
    .line 252
    invoke-virtual {v15, v3, v5}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->a(La/ml3;I)V

    .line 253
    .line 254
    .line 255
    goto/16 :goto_6

    .line 256
    .line 257
    :cond_5
    instance-of v5, v15, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/value/b;

    .line 258
    .line 259
    if-eqz v5, :cond_9

    .line 260
    .line 261
    check-cast v15, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/value/b;

    .line 262
    .line 263
    new-instance v5, La/qn3;

    .line 264
    .line 265
    invoke-direct {v5}, La/qn3;-><init>()V

    .line 266
    .line 267
    .line 268
    iput v12, v5, La/qn3;->a:I

    .line 269
    .line 270
    iput v12, v5, La/qn3;->b:I

    .line 271
    .line 272
    instance-of v9, v3, La/il3;

    .line 273
    .line 274
    if-nez v9, :cond_8

    .line 275
    .line 276
    instance-of v9, v3, La/jl3;

    .line 277
    .line 278
    if-eqz v9, :cond_6

    .line 279
    .line 280
    goto :goto_2

    .line 281
    :cond_6
    iput v7, v5, La/qn3;->c:I

    .line 282
    .line 283
    iput v11, v5, La/qn3;->e:I

    .line 284
    .line 285
    iput v11, v5, La/qn3;->h:I

    .line 286
    .line 287
    iput v11, v5, La/qn3;->g:I

    .line 288
    .line 289
    instance-of v9, v3, La/ll3;

    .line 290
    .line 291
    if-nez v9, :cond_7

    .line 292
    .line 293
    iput v13, v5, La/qn3;->n:I

    .line 294
    .line 295
    :cond_7
    iput v14, v5, La/qn3;->i:F

    .line 296
    .line 297
    goto :goto_3

    .line 298
    :cond_8
    :goto_2
    iput v11, v5, La/qn3;->c:I

    .line 299
    .line 300
    iput v11, v5, La/qn3;->e:I

    .line 301
    .line 302
    iput v11, v5, La/qn3;->h:I

    .line 303
    .line 304
    iput v11, v5, La/qn3;->f:I

    .line 305
    .line 306
    :goto_3
    invoke-virtual {v5}, La/qn3;->a()La/pn3;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    invoke-virtual {v15, v5}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/value/b;->setViewLayoutParams(La/pn3;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v1, v15, v0}, La/ucl;->c(Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/value/b;La/ql3;)V

    .line 314
    .line 315
    .line 316
    sget-object v5, La/fcl;->a:La/pek;

    .line 317
    .line 318
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    invoke-static {v3}, La/pek;->l(La/ml3;)La/fcl;

    .line 322
    .line 323
    .line 324
    move-result-object v5

    .line 325
    invoke-virtual {v15, v5}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/value/b;->setDownloadBarType(La/fcl;)V

    .line 326
    .line 327
    .line 328
    goto/16 :goto_6

    .line 329
    .line 330
    :cond_9
    instance-of v5, v15, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/description/b;

    .line 331
    .line 332
    const v9, 0x7f07072d

    .line 333
    .line 334
    .line 335
    if-eqz v5, :cond_c

    .line 336
    .line 337
    check-cast v15, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/description/b;

    .line 338
    .line 339
    new-instance v5, La/qn3;

    .line 340
    .line 341
    invoke-direct {v5}, La/qn3;-><init>()V

    .line 342
    .line 343
    .line 344
    iput v12, v5, La/qn3;->a:I

    .line 345
    .line 346
    iput v12, v5, La/qn3;->b:I

    .line 347
    .line 348
    iput v7, v5, La/qn3;->c:I

    .line 349
    .line 350
    iput v7, v5, La/qn3;->e:I

    .line 351
    .line 352
    iput v7, v5, La/qn3;->h:I

    .line 353
    .line 354
    iput v9, v5, La/qn3;->l:I

    .line 355
    .line 356
    instance-of v9, v3, La/jl3;

    .line 357
    .line 358
    if-nez v9, :cond_b

    .line 359
    .line 360
    instance-of v9, v3, La/il3;

    .line 361
    .line 362
    if-eqz v9, :cond_a

    .line 363
    .line 364
    goto :goto_4

    .line 365
    :cond_a
    const v9, 0x7f0a0471

    .line 366
    .line 367
    .line 368
    goto :goto_5

    .line 369
    :cond_b
    :goto_4
    move v9, v11

    .line 370
    :goto_5
    iput v9, v5, La/qn3;->g:I

    .line 371
    .line 372
    const v9, 0x7f07070c

    .line 373
    .line 374
    .line 375
    iput v9, v5, La/qn3;->n:I

    .line 376
    .line 377
    iput v14, v5, La/qn3;->i:F

    .line 378
    .line 379
    invoke-virtual {v5}, La/qn3;->a()La/pn3;

    .line 380
    .line 381
    .line 382
    move-result-object v5

    .line 383
    invoke-virtual {v15, v5}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/description/b;->setViewLayoutParams(La/pn3;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 387
    .line 388
    .line 389
    move-result-object v5

    .line 390
    const v9, 0x7f1403e1

    .line 391
    .line 392
    .line 393
    invoke-virtual {v15, v5, v9}, Lcom/google/android/material/textview/MaterialTextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 394
    .line 395
    .line 396
    sget-object v5, La/j5d;->a:Landroid/util/TypedValue;

    .line 397
    .line 398
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 399
    .line 400
    .line 401
    move-result-object v5

    .line 402
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    const v9, 0x7f040b0b

    .line 406
    .line 407
    .line 408
    invoke-static {v5, v9, v7}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 409
    .line 410
    .line 411
    move-result v5

    .line 412
    invoke-virtual {v15, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 413
    .line 414
    .line 415
    const/high16 v5, 0x41800000    # 16.0f

    .line 416
    .line 417
    invoke-virtual {v15, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 418
    .line 419
    .line 420
    iget-object v5, v0, La/nl3;->b:Ljava/lang/String;

    .line 421
    .line 422
    invoke-virtual {v15, v5}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/description/b;->setContent(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    goto :goto_6

    .line 426
    :cond_c
    instance-of v5, v15, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;

    .line 427
    .line 428
    if-eqz v5, :cond_20

    .line 429
    .line 430
    check-cast v15, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;

    .line 431
    .line 432
    new-instance v5, La/qn3;

    .line 433
    .line 434
    invoke-direct {v5}, La/qn3;-><init>()V

    .line 435
    .line 436
    .line 437
    iput v8, v5, La/qn3;->a:I

    .line 438
    .line 439
    iput v12, v5, La/qn3;->b:I

    .line 440
    .line 441
    iput v7, v5, La/qn3;->c:I

    .line 442
    .line 443
    iput v11, v5, La/qn3;->e:I

    .line 444
    .line 445
    iput v11, v5, La/qn3;->h:I

    .line 446
    .line 447
    const v8, 0x7f0a046f

    .line 448
    .line 449
    .line 450
    iput v8, v5, La/qn3;->g:I

    .line 451
    .line 452
    const v8, 0x7f070712

    .line 453
    .line 454
    .line 455
    iput v8, v5, La/qn3;->l:I

    .line 456
    .line 457
    iput v13, v5, La/qn3;->m:I

    .line 458
    .line 459
    iput v13, v5, La/qn3;->k:I

    .line 460
    .line 461
    iput v9, v5, La/qn3;->n:I

    .line 462
    .line 463
    iput v14, v5, La/qn3;->i:F

    .line 464
    .line 465
    invoke-virtual {v5}, La/qn3;->a()La/pn3;

    .line 466
    .line 467
    .line 468
    move-result-object v5

    .line 469
    invoke-virtual {v15, v5}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;->setViewLayoutParams(La/pn3;)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v1, v15, v0}, La/ucl;->b(Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;La/ql3;)V

    .line 473
    .line 474
    .line 475
    iget-object v5, v0, La/nl3;->a:Ljava/lang/String;

    .line 476
    .line 477
    invoke-virtual {v15, v5}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;->setContent(Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    :goto_6
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 481
    .line 482
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    const v5, 0x7f0a046f

    .line 486
    .line 487
    .line 488
    const/4 v8, -0x1

    .line 489
    const v9, 0x7f070718

    .line 490
    .line 491
    .line 492
    goto/16 :goto_1

    .line 493
    .line 494
    :cond_d
    const v3, 0x7f0606dd

    .line 495
    .line 496
    .line 497
    if-eqz v6, :cond_13

    .line 498
    .line 499
    check-cast v0, La/ol3;

    .line 500
    .line 501
    iget-object v6, v0, La/ol3;->a:La/ml3;

    .line 502
    .line 503
    new-instance v8, Ljava/util/ArrayList;

    .line 504
    .line 505
    invoke-static {v2, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 506
    .line 507
    .line 508
    move-result v9

    .line 509
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v2, v7}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 513
    .line 514
    .line 515
    move-result-object v9

    .line 516
    :goto_7
    move-object v10, v9

    .line 517
    check-cast v10, La/paw;

    .line 518
    .line 519
    invoke-virtual {v10}, La/paw;->hasNext()Z

    .line 520
    .line 521
    .line 522
    move-result v15

    .line 523
    if-eqz v15, :cond_20

    .line 524
    .line 525
    invoke-virtual {v10}, La/paw;->next()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v10

    .line 529
    check-cast v10, Landroid/view/View;

    .line 530
    .line 531
    if-nez v10, :cond_e

    .line 532
    .line 533
    goto/16 :goto_12

    .line 534
    .line 535
    :cond_e
    instance-of v15, v10, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;

    .line 536
    .line 537
    if-eqz v15, :cond_f

    .line 538
    .line 539
    check-cast v10, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;

    .line 540
    .line 541
    new-instance v15, La/qn3;

    .line 542
    .line 543
    invoke-direct {v15}, La/qn3;-><init>()V

    .line 544
    .line 545
    .line 546
    iput v7, v15, La/qn3;->a:I

    .line 547
    .line 548
    iput v12, v15, La/qn3;->b:I

    .line 549
    .line 550
    iput v7, v15, La/qn3;->c:I

    .line 551
    .line 552
    iput v7, v15, La/qn3;->e:I

    .line 553
    .line 554
    iput v7, v15, La/qn3;->h:I

    .line 555
    .line 556
    iput v7, v15, La/qn3;->f:I

    .line 557
    .line 558
    const v5, 0x7f070718

    .line 559
    .line 560
    .line 561
    iput v5, v15, La/qn3;->n:I

    .line 562
    .line 563
    iput v13, v15, La/qn3;->m:I

    .line 564
    .line 565
    iput v13, v15, La/qn3;->k:I

    .line 566
    .line 567
    iput v14, v15, La/qn3;->i:F

    .line 568
    .line 569
    invoke-virtual {v15}, La/qn3;->a()La/pn3;

    .line 570
    .line 571
    .line 572
    move-result-object v5

    .line 573
    invoke-virtual {v10, v5}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->setContainerLayoutParams(La/pn3;)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v10, v6, v3}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->a(La/ml3;I)V

    .line 577
    .line 578
    .line 579
    goto :goto_a

    .line 580
    :cond_f
    instance-of v5, v10, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/value/b;

    .line 581
    .line 582
    if-eqz v5, :cond_20

    .line 583
    .line 584
    check-cast v10, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/value/b;

    .line 585
    .line 586
    new-instance v5, La/qn3;

    .line 587
    .line 588
    invoke-direct {v5}, La/qn3;-><init>()V

    .line 589
    .line 590
    .line 591
    iput v12, v5, La/qn3;->a:I

    .line 592
    .line 593
    iput v12, v5, La/qn3;->b:I

    .line 594
    .line 595
    instance-of v15, v6, La/il3;

    .line 596
    .line 597
    if-nez v15, :cond_12

    .line 598
    .line 599
    instance-of v15, v6, La/jl3;

    .line 600
    .line 601
    if-eqz v15, :cond_10

    .line 602
    .line 603
    goto :goto_8

    .line 604
    :cond_10
    iput v7, v5, La/qn3;->c:I

    .line 605
    .line 606
    iput v11, v5, La/qn3;->e:I

    .line 607
    .line 608
    iput v11, v5, La/qn3;->h:I

    .line 609
    .line 610
    iput v11, v5, La/qn3;->g:I

    .line 611
    .line 612
    instance-of v15, v6, La/ll3;

    .line 613
    .line 614
    if-nez v15, :cond_11

    .line 615
    .line 616
    iput v13, v5, La/qn3;->n:I

    .line 617
    .line 618
    :cond_11
    iput v13, v5, La/qn3;->m:I

    .line 619
    .line 620
    iput v13, v5, La/qn3;->k:I

    .line 621
    .line 622
    const/4 v15, 0x0

    .line 623
    iput v15, v5, La/qn3;->i:F

    .line 624
    .line 625
    goto :goto_9

    .line 626
    :cond_12
    :goto_8
    iput v7, v5, La/qn3;->c:I

    .line 627
    .line 628
    iput v11, v5, La/qn3;->e:I

    .line 629
    .line 630
    iput v11, v5, La/qn3;->h:I

    .line 631
    .line 632
    iput v11, v5, La/qn3;->f:I

    .line 633
    .line 634
    :goto_9
    invoke-virtual {v5}, La/qn3;->a()La/pn3;

    .line 635
    .line 636
    .line 637
    move-result-object v5

    .line 638
    invoke-virtual {v10, v5}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/value/b;->setViewLayoutParams(La/pn3;)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v1, v10, v0}, La/ucl;->c(Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/value/b;La/ql3;)V

    .line 642
    .line 643
    .line 644
    sget-object v5, La/fcl;->a:La/pek;

    .line 645
    .line 646
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 647
    .line 648
    .line 649
    invoke-static {v6}, La/pek;->l(La/ml3;)La/fcl;

    .line 650
    .line 651
    .line 652
    move-result-object v5

    .line 653
    invoke-virtual {v10, v5}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/value/b;->setDownloadBarType(La/fcl;)V

    .line 654
    .line 655
    .line 656
    :goto_a
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 657
    .line 658
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    goto/16 :goto_7

    .line 662
    .line 663
    :cond_13
    instance-of v5, v0, La/pl3;

    .line 664
    .line 665
    if-eqz v5, :cond_21

    .line 666
    .line 667
    check-cast v0, La/pl3;

    .line 668
    .line 669
    iget-object v5, v0, La/pl3;->b:La/ml3;

    .line 670
    .line 671
    iget-boolean v6, v1, La/ucl;->b:Z

    .line 672
    .line 673
    new-instance v8, Ljava/util/ArrayList;

    .line 674
    .line 675
    invoke-static {v2, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 676
    .line 677
    .line 678
    move-result v9

    .line 679
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 680
    .line 681
    .line 682
    invoke-virtual {v2, v7}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 683
    .line 684
    .line 685
    move-result-object v9

    .line 686
    :goto_b
    move-object v10, v9

    .line 687
    check-cast v10, La/paw;

    .line 688
    .line 689
    invoke-virtual {v10}, La/paw;->hasNext()Z

    .line 690
    .line 691
    .line 692
    move-result v15

    .line 693
    if-eqz v15, :cond_20

    .line 694
    .line 695
    invoke-virtual {v10}, La/paw;->next()Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v10

    .line 699
    check-cast v10, Landroid/view/View;

    .line 700
    .line 701
    if-nez v10, :cond_14

    .line 702
    .line 703
    goto/16 :goto_12

    .line 704
    .line 705
    :cond_14
    instance-of v15, v10, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;

    .line 706
    .line 707
    if-eqz v15, :cond_15

    .line 708
    .line 709
    check-cast v10, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;

    .line 710
    .line 711
    new-instance v15, La/qn3;

    .line 712
    .line 713
    invoke-direct {v15}, La/qn3;-><init>()V

    .line 714
    .line 715
    .line 716
    iput v7, v15, La/qn3;->a:I

    .line 717
    .line 718
    iput v12, v15, La/qn3;->b:I

    .line 719
    .line 720
    iput v7, v15, La/qn3;->c:I

    .line 721
    .line 722
    iput v7, v15, La/qn3;->e:I

    .line 723
    .line 724
    iput v7, v15, La/qn3;->h:I

    .line 725
    .line 726
    iput v7, v15, La/qn3;->f:I

    .line 727
    .line 728
    const v11, 0x7f070718

    .line 729
    .line 730
    .line 731
    iput v11, v15, La/qn3;->n:I

    .line 732
    .line 733
    iput v13, v15, La/qn3;->m:I

    .line 734
    .line 735
    iput v13, v15, La/qn3;->k:I

    .line 736
    .line 737
    iput v14, v15, La/qn3;->i:F

    .line 738
    .line 739
    invoke-virtual {v15}, La/qn3;->a()La/pn3;

    .line 740
    .line 741
    .line 742
    move-result-object v15

    .line 743
    invoke-virtual {v10, v15}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->setContainerLayoutParams(La/pn3;)V

    .line 744
    .line 745
    .line 746
    invoke-virtual {v10, v5, v3}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->a(La/ml3;I)V

    .line 747
    .line 748
    .line 749
    const v11, 0x7f0a046e

    .line 750
    .line 751
    .line 752
    const/4 v13, 0x0

    .line 753
    const/4 v15, -0x1

    .line 754
    goto/16 :goto_11

    .line 755
    .line 756
    :cond_15
    const v11, 0x7f070718

    .line 757
    .line 758
    .line 759
    instance-of v15, v10, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;

    .line 760
    .line 761
    if-eqz v15, :cond_1c

    .line 762
    .line 763
    check-cast v10, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;

    .line 764
    .line 765
    new-instance v15, La/qn3;

    .line 766
    .line 767
    invoke-direct {v15}, La/qn3;-><init>()V

    .line 768
    .line 769
    .line 770
    iput v7, v15, La/qn3;->a:I

    .line 771
    .line 772
    iput v12, v15, La/qn3;->b:I

    .line 773
    .line 774
    iput v7, v15, La/qn3;->c:I

    .line 775
    .line 776
    const v3, 0x7f0a046e

    .line 777
    .line 778
    .line 779
    iput v3, v15, La/qn3;->e:I

    .line 780
    .line 781
    iput v3, v15, La/qn3;->h:I

    .line 782
    .line 783
    iput v3, v15, La/qn3;->g:I

    .line 784
    .line 785
    const/4 v3, 0x0

    .line 786
    iput v3, v15, La/qn3;->i:F

    .line 787
    .line 788
    instance-of v3, v5, La/jl3;

    .line 789
    .line 790
    if-nez v3, :cond_17

    .line 791
    .line 792
    if-eqz v6, :cond_16

    .line 793
    .line 794
    move v3, v14

    .line 795
    goto :goto_c

    .line 796
    :cond_16
    const/4 v3, 0x0

    .line 797
    :goto_c
    iput v3, v15, La/qn3;->j:F

    .line 798
    .line 799
    :cond_17
    instance-of v3, v5, La/ll3;

    .line 800
    .line 801
    if-nez v3, :cond_18

    .line 802
    .line 803
    iput v13, v15, La/qn3;->n:I

    .line 804
    .line 805
    :cond_18
    invoke-virtual {v15}, La/qn3;->a()La/pn3;

    .line 806
    .line 807
    .line 808
    move-result-object v3

    .line 809
    invoke-virtual {v10, v3}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;->setViewLayoutParams(La/pn3;)V

    .line 810
    .line 811
    .line 812
    instance-of v3, v5, La/il3;

    .line 813
    .line 814
    if-nez v3, :cond_1a

    .line 815
    .line 816
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 817
    .line 818
    .line 819
    move-result-object v3

    .line 820
    const v15, 0x7f0606e2

    .line 821
    .line 822
    .line 823
    invoke-virtual {v3, v15}, Landroid/content/Context;->getColor(I)I

    .line 824
    .line 825
    .line 826
    move-result v3

    .line 827
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 828
    .line 829
    .line 830
    move-result-object v15

    .line 831
    const v11, 0x7f0606e1

    .line 832
    .line 833
    .line 834
    invoke-virtual {v15, v11}, Landroid/content/Context;->getColor(I)I

    .line 835
    .line 836
    .line 837
    move-result v11

    .line 838
    const/4 v15, -0x1

    .line 839
    if-eq v3, v15, :cond_19

    .line 840
    .line 841
    iget v13, v10, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;->i:I

    .line 842
    .line 843
    if-eq v3, v13, :cond_19

    .line 844
    .line 845
    iput v3, v10, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;->i:I

    .line 846
    .line 847
    :cond_19
    if-eq v11, v15, :cond_1b

    .line 848
    .line 849
    iget v3, v10, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;->j:I

    .line 850
    .line 851
    if-eq v11, v3, :cond_1b

    .line 852
    .line 853
    iput v11, v10, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;->j:I

    .line 854
    .line 855
    goto :goto_d

    .line 856
    :cond_1a
    const/4 v15, -0x1

    .line 857
    :cond_1b
    :goto_d
    invoke-virtual {v1, v10, v0}, La/ucl;->b(Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;La/ql3;)V

    .line 858
    .line 859
    .line 860
    iget-object v3, v0, La/pl3;->a:Ljava/lang/String;

    .line 861
    .line 862
    invoke-virtual {v10, v3}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;->setContent(Ljava/lang/String;)V

    .line 863
    .line 864
    .line 865
    const v11, 0x7f0a046e

    .line 866
    .line 867
    .line 868
    const/4 v13, 0x0

    .line 869
    goto :goto_11

    .line 870
    :cond_1c
    const/4 v15, -0x1

    .line 871
    instance-of v3, v10, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/value/b;

    .line 872
    .line 873
    if-eqz v3, :cond_20

    .line 874
    .line 875
    check-cast v10, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/value/b;

    .line 876
    .line 877
    new-instance v3, La/qn3;

    .line 878
    .line 879
    invoke-direct {v3}, La/qn3;-><init>()V

    .line 880
    .line 881
    .line 882
    iput v12, v3, La/qn3;->a:I

    .line 883
    .line 884
    iput v12, v3, La/qn3;->b:I

    .line 885
    .line 886
    instance-of v11, v5, La/il3;

    .line 887
    .line 888
    if-nez v11, :cond_1d

    .line 889
    .line 890
    instance-of v11, v5, La/jl3;

    .line 891
    .line 892
    if-eqz v11, :cond_1e

    .line 893
    .line 894
    :cond_1d
    const v11, 0x7f0a046e

    .line 895
    .line 896
    .line 897
    const/4 v13, 0x0

    .line 898
    goto :goto_f

    .line 899
    :cond_1e
    iput v7, v3, La/qn3;->c:I

    .line 900
    .line 901
    const v11, 0x7f0a046e

    .line 902
    .line 903
    .line 904
    iput v11, v3, La/qn3;->e:I

    .line 905
    .line 906
    iput v11, v3, La/qn3;->h:I

    .line 907
    .line 908
    iput v7, v3, La/qn3;->f:I

    .line 909
    .line 910
    if-eqz v6, :cond_1f

    .line 911
    .line 912
    const/4 v13, 0x0

    .line 913
    goto :goto_e

    .line 914
    :cond_1f
    move v13, v14

    .line 915
    :goto_e
    iput v13, v3, La/qn3;->j:F

    .line 916
    .line 917
    const/4 v13, 0x0

    .line 918
    iput v13, v3, La/qn3;->i:F

    .line 919
    .line 920
    goto :goto_10

    .line 921
    :goto_f
    iput v11, v3, La/qn3;->c:I

    .line 922
    .line 923
    iput v11, v3, La/qn3;->e:I

    .line 924
    .line 925
    iput v11, v3, La/qn3;->h:I

    .line 926
    .line 927
    iput v11, v3, La/qn3;->f:I

    .line 928
    .line 929
    :goto_10
    invoke-virtual {v3}, La/qn3;->a()La/pn3;

    .line 930
    .line 931
    .line 932
    move-result-object v3

    .line 933
    invoke-virtual {v10, v3}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/value/b;->setViewLayoutParams(La/pn3;)V

    .line 934
    .line 935
    .line 936
    invoke-virtual {v1, v10, v0}, La/ucl;->c(Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/value/b;La/ql3;)V

    .line 937
    .line 938
    .line 939
    sget-object v3, La/fcl;->a:La/pek;

    .line 940
    .line 941
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 942
    .line 943
    .line 944
    invoke-static {v5}, La/pek;->l(La/ml3;)La/fcl;

    .line 945
    .line 946
    .line 947
    move-result-object v3

    .line 948
    invoke-virtual {v10, v3}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/value/b;->setDownloadBarType(La/fcl;)V

    .line 949
    .line 950
    .line 951
    :goto_11
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 952
    .line 953
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 954
    .line 955
    .line 956
    const v3, 0x7f0606dd

    .line 957
    .line 958
    .line 959
    const v13, 0x7f0706f8

    .line 960
    .line 961
    .line 962
    goto/16 :goto_b

    .line 963
    .line 964
    :cond_20
    :goto_12
    invoke-static {v4, v2}, La/ewm0;->p(Landroid/view/ViewGroup;Ljava/util/AbstractList;)V

    .line 965
    .line 966
    .line 967
    return-void

    .line 968
    :cond_21
    invoke-static {}, La/t9f;->b()V

    .line 969
    .line 970
    .line 971
    return-void
.end method

.method public final v(I)V
    .locals 1

    .line 1
    iget v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;->u:I

    .line 2
    .line 3
    if-le v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput p1, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;->u:I

    .line 7
    .line 8
    iget-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;->r:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/bar/b;->setProgress(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    iget-object v0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;->s:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/value/b;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/value/b;->setContent(I)V

    .line 20
    .line 21
    .line 22
    :cond_2
    iget-object p0, p0, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/DownloadView;->t:Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;

    .line 23
    .line 24
    if-eqz p0, :cond_3

    .line 25
    .line 26
    invoke-virtual {p0}, Lorg/xplatform/app_update/impl/presentation/update_screen/views/content/download/label/b;->j()V

    .line 27
    .line 28
    .line 29
    :cond_3
    :goto_0
    return-void
.end method
