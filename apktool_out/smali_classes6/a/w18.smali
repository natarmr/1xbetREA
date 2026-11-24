.class public final La/w18;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/f4l0;

.field public b:La/yse;

.field public c:La/cue;

.field public d:I

.field public e:Z

.field public final f:I

.field public final g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:La/zse;

.field public final l:La/l5k0;

.field public final m:La/x18;

.field public final n:La/siz;

.field public o:Landroid/view/View;

.field public p:La/due;


# direct methods
.method public constructor <init>(La/f4l0;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/w18;->a:La/f4l0;

    .line 5
    .line 6
    sget-object v0, La/wse;->a:La/wse;

    .line 7
    .line 8
    iput-object v0, p0, La/w18;->b:La/yse;

    .line 9
    .line 10
    sget-object v0, La/zte;->a:La/zte;

    .line 11
    .line 12
    iput-object v0, p0, La/w18;->c:La/cue;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const v1, 0x7f0706ea

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iput v0, p0, La/w18;->f:I

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const v1, 0x7f0706fe

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const v2, 0x7f07072d

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    iput v1, p0, La/w18;->g:I

    .line 50
    .line 51
    new-instance v1, La/l5k0;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-direct {v1, v2}, La/l5k0;-><init>(Landroid/content/Context;)V

    .line 61
    .line 62
    .line 63
    const/4 v2, 0x4

    .line 64
    invoke-virtual {v1, v2}, Landroid/view/View;->setTextAlignment(I)V

    .line 65
    .line 66
    .line 67
    const v2, 0x7f140463

    .line 68
    .line 69
    .line 70
    invoke-static {v2, v1}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 71
    .line 72
    .line 73
    const/4 v2, 0x0

    .line 74
    invoke-virtual {v1, v2, v0, v2, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 75
    .line 76
    .line 77
    iput-object v1, p0, La/w18;->l:La/l5k0;

    .line 78
    .line 79
    new-instance v0, La/x18;

    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-direct {v0, v1}, La/x18;-><init>(Landroid/content/Context;)V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, La/w18;->m:La/x18;

    .line 92
    .line 93
    new-instance v0, La/siz;

    .line 94
    .line 95
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-direct {v0, p1}, La/siz;-><init>(Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    iput-object v0, p0, La/w18;->n:La/siz;

    .line 106
    .line 107
    return-void
.end method


# virtual methods
.method public final a(La/cue;La/yse;)V
    .locals 9

    .line 1
    iget-object v0, p0, La/w18;->k:La/zse;

    .line 2
    .line 3
    iget-object v1, p0, La/w18;->a:La/f4l0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v3, p0, La/w18;->b:La/yse;

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    if-ne v0, v3, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v3, p0, La/w18;->c:La/cue;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-eq v0, v3, :cond_a

    .line 31
    .line 32
    :cond_0
    instance-of v0, p1, La/zte;

    .line 33
    .line 34
    if-nez v0, :cond_a

    .line 35
    .line 36
    iget-object v0, p0, La/w18;->k:La/zse;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    check-cast v0, Landroid/view/View;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object v0, v2

    .line 44
    :goto_0
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    instance-of v0, p1, La/aue;

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    :cond_3
    move-object v0, v2

    .line 54
    goto :goto_2

    .line 55
    :cond_4
    instance-of v0, p2, La/wse;

    .line 56
    .line 57
    if-nez v0, :cond_8

    .line 58
    .line 59
    instance-of v0, p2, La/vse;

    .line 60
    .line 61
    if-eqz v0, :cond_5

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_5
    instance-of v0, p2, La/tse;

    .line 65
    .line 66
    if-eqz v0, :cond_6

    .line 67
    .line 68
    new-instance v0, La/udf;

    .line 69
    .line 70
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-direct {v0, v3}, La/udf;-><init>(Landroid/content/Context;)V

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_6
    instance-of v0, p2, La/use;

    .line 82
    .line 83
    if-eqz v0, :cond_7

    .line 84
    .line 85
    new-instance v0, La/v18;

    .line 86
    .line 87
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-direct {v0, v3}, La/v18;-><init>(Landroid/content/Context;)V

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_7
    instance-of v0, p2, La/xse;

    .line 99
    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    new-instance v0, La/lxp0;

    .line 103
    .line 104
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-direct {v0, v3}, La/lxp0;-><init>(Landroid/content/Context;)V

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_8
    :goto_1
    new-instance v0, La/wte;

    .line 116
    .line 117
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-direct {v0, v3}, La/wte;-><init>(Landroid/content/Context;)V

    .line 125
    .line 126
    .line 127
    :goto_2
    if-eqz v0, :cond_9

    .line 128
    .line 129
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_9
    move-object v0, v2

    .line 134
    :goto_3
    iput-object v0, p0, La/w18;->k:La/zse;

    .line 135
    .line 136
    :cond_a
    iget-object v0, p0, La/w18;->k:La/zse;

    .line 137
    .line 138
    instance-of v3, v0, La/rkg0;

    .line 139
    .line 140
    if-eqz v3, :cond_b

    .line 141
    .line 142
    check-cast v0, La/rkg0;

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_b
    move-object v0, v2

    .line 146
    :goto_4
    if-eqz v0, :cond_c

    .line 147
    .line 148
    iget-boolean v3, p0, La/w18;->e:Z

    .line 149
    .line 150
    invoke-interface {v0, v3}, La/rkg0;->setRtlSupportEnabled(Z)V

    .line 151
    .line 152
    .line 153
    :cond_c
    iget-object v0, p0, La/w18;->k:La/zse;

    .line 154
    .line 155
    if-eqz v0, :cond_d

    .line 156
    .line 157
    invoke-interface {v0, p2}, La/zse;->setScoreUiModel(La/yse;)V

    .line 158
    .line 159
    .line 160
    :cond_d
    const/4 v0, 0x3

    .line 161
    new-array v0, v0, [Landroid/view/View;

    .line 162
    .line 163
    const/4 v3, 0x0

    .line 164
    iget-object v4, p0, La/w18;->l:La/l5k0;

    .line 165
    .line 166
    aput-object v4, v0, v3

    .line 167
    .line 168
    const/4 v5, 0x1

    .line 169
    iget-object v6, p0, La/w18;->m:La/x18;

    .line 170
    .line 171
    aput-object v6, v0, v5

    .line 172
    .line 173
    const/4 v5, 0x2

    .line 174
    iget-object v7, p0, La/w18;->n:La/siz;

    .line 175
    .line 176
    aput-object v7, v0, v5

    .line 177
    .line 178
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    :cond_e
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    if-eqz v5, :cond_f

    .line 191
    .line 192
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    check-cast v5, Landroid/view/View;

    .line 197
    .line 198
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 199
    .line 200
    .line 201
    move-result-object v8

    .line 202
    if-nez v8, :cond_e

    .line 203
    .line 204
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 205
    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_f
    instance-of v0, p1, La/aue;

    .line 209
    .line 210
    if-eqz v0, :cond_10

    .line 211
    .line 212
    goto :goto_7

    .line 213
    :cond_10
    instance-of v0, p1, La/bue;

    .line 214
    .line 215
    if-eqz v0, :cond_13

    .line 216
    .line 217
    iget-object v0, p0, La/w18;->k:La/zse;

    .line 218
    .line 219
    instance-of v4, v0, La/wte;

    .line 220
    .line 221
    if-nez v4, :cond_12

    .line 222
    .line 223
    instance-of v0, v0, La/v18;

    .line 224
    .line 225
    if-eqz v0, :cond_11

    .line 226
    .line 227
    goto :goto_6

    .line 228
    :cond_11
    move-object v4, v7

    .line 229
    goto :goto_7

    .line 230
    :cond_12
    :goto_6
    move-object v4, v6

    .line 231
    goto :goto_7

    .line 232
    :cond_13
    move-object v4, v2

    .line 233
    :goto_7
    iget-object v0, p0, La/w18;->o:Landroid/view/View;

    .line 234
    .line 235
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    if-eqz v0, :cond_14

    .line 240
    .line 241
    iget-object v0, p0, La/w18;->c:La/cue;

    .line 242
    .line 243
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    if-eq v0, v5, :cond_18

    .line 252
    .line 253
    :cond_14
    iget-object v0, p0, La/w18;->o:Landroid/view/View;

    .line 254
    .line 255
    if-eqz v0, :cond_15

    .line 256
    .line 257
    const/16 v5, 0x8

    .line 258
    .line 259
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 260
    .line 261
    .line 262
    :cond_15
    iput-object v4, p0, La/w18;->o:Landroid/view/View;

    .line 263
    .line 264
    if-eqz v4, :cond_16

    .line 265
    .line 266
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 267
    .line 268
    .line 269
    :cond_16
    if-eqz v4, :cond_17

    .line 270
    .line 271
    move-object v2, v4

    .line 272
    :cond_17
    iput-object v2, p0, La/w18;->p:La/due;

    .line 273
    .line 274
    :cond_18
    iget-object v0, p0, La/w18;->p:La/due;

    .line 275
    .line 276
    if-eqz v0, :cond_19

    .line 277
    .line 278
    invoke-interface {v0, p1}, La/due;->setTeamsUiModel(La/cue;)V

    .line 279
    .line 280
    .line 281
    :cond_19
    iget-boolean v0, p0, La/w18;->e:Z

    .line 282
    .line 283
    invoke-virtual {v6, v0}, La/x18;->setRtlSupportEnabled(Z)V

    .line 284
    .line 285
    .line 286
    iput-object p2, p0, La/w18;->b:La/yse;

    .line 287
    .line 288
    iput-object p1, p0, La/w18;->c:La/cue;

    .line 289
    .line 290
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v1}, Landroid/view/View;->requestLayout()V

    .line 294
    .line 295
    .line 296
    return-void
.end method
