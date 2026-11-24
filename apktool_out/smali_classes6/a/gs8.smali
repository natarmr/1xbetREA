.class public final La/gs8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/text/TextPaint;

.field public final b:Landroid/text/TextPaint;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:I

.field public final n:I

.field public final o:I

.field public final p:I

.field public final q:I

.field public final r:I

.field public final s:I

.field public final t:I

.field public final u:I

.field public final v:I

.field public final w:I

.field public final x:I

.field public final y:I

.field public final synthetic z:Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;


# direct methods
.method public constructor <init>(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/gs8;->z:Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;

    .line 5
    .line 6
    new-instance v0, Landroid/text/TextPaint;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const v2, 0x7f14045b

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1, v2}, La/r7x;->r(Landroid/text/TextPaint;Landroid/content/Context;I)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, La/gs8;->a:Landroid/text/TextPaint;

    .line 29
    .line 30
    new-instance v0, Landroid/text/TextPaint;

    .line 31
    .line 32
    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    const v3, 0x7f1404a2

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v2, v3}, La/r7x;->r(Landroid/text/TextPaint;Landroid/content/Context;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, La/gs8;->b:Landroid/text/TextPaint;

    .line 52
    .line 53
    const v0, 0x7f0706c4

    .line 54
    .line 55
    .line 56
    invoke-static {p1, v0}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 57
    .line 58
    .line 59
    const v0, 0x7f0706d0

    .line 60
    .line 61
    .line 62
    invoke-static {p1, v0}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iput v0, p0, La/gs8;->c:I

    .line 67
    .line 68
    const v0, 0x7f070640

    .line 69
    .line 70
    .line 71
    invoke-static {p1, v0}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    iput v0, p0, La/gs8;->d:I

    .line 76
    .line 77
    const v0, 0x7f07064b

    .line 78
    .line 79
    .line 80
    invoke-static {p1, v0}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iput v0, p0, La/gs8;->e:I

    .line 85
    .line 86
    const v0, 0x7f070656

    .line 87
    .line 88
    .line 89
    invoke-static {p1, v0}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    iput v0, p0, La/gs8;->f:I

    .line 94
    .line 95
    const v0, 0x7f07066c

    .line 96
    .line 97
    .line 98
    invoke-static {p1, v0}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 99
    .line 100
    .line 101
    const v0, 0x7f070674

    .line 102
    .line 103
    .line 104
    invoke-static {p1, v0}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    iput v0, p0, La/gs8;->g:I

    .line 109
    .line 110
    const v0, 0x7f07067a

    .line 111
    .line 112
    .line 113
    invoke-static {p1, v0}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    iput v0, p0, La/gs8;->h:I

    .line 118
    .line 119
    const v0, 0x7f07068c

    .line 120
    .line 121
    .line 122
    invoke-static {p1, v0}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 123
    .line 124
    .line 125
    const v0, 0x7f07069b

    .line 126
    .line 127
    .line 128
    invoke-static {p1, v0}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    iput v1, p0, La/gs8;->i:I

    .line 133
    .line 134
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    const v2, 0x7f0706a3

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    const v2, 0x7f0706d1

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    iput v1, p0, La/gs8;->j:I

    .line 164
    .line 165
    const v1, 0x7f0706d7

    .line 166
    .line 167
    .line 168
    invoke-static {p1, v1}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    iput v1, p0, La/gs8;->k:I

    .line 173
    .line 174
    const v1, 0x7f0706be

    .line 175
    .line 176
    .line 177
    invoke-static {p1, v1}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    iput v1, p0, La/gs8;->l:I

    .line 182
    .line 183
    const v2, 0x7f0706c7

    .line 184
    .line 185
    .line 186
    invoke-static {p1, v2}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 187
    .line 188
    .line 189
    const v3, 0x7f0706c5

    .line 190
    .line 191
    .line 192
    invoke-static {p1, v3}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 193
    .line 194
    .line 195
    const v3, 0x7f0706cc

    .line 196
    .line 197
    .line 198
    invoke-static {p1, v3}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    iput v4, p0, La/gs8;->m:I

    .line 203
    .line 204
    iput v1, p0, La/gs8;->n:I

    .line 205
    .line 206
    const v1, 0x7f0706cb

    .line 207
    .line 208
    .line 209
    invoke-static {p1, v1}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    iput v1, p0, La/gs8;->o:I

    .line 214
    .line 215
    const v1, 0x7f0706bf

    .line 216
    .line 217
    .line 218
    invoke-static {p1, v1}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    iput v4, p0, La/gs8;->p:I

    .line 223
    .line 224
    const v4, 0x7f0706d4

    .line 225
    .line 226
    .line 227
    invoke-static {p1, v4}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    iput v4, p0, La/gs8;->q:I

    .line 232
    .line 233
    invoke-static {p1, v1}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    iput v4, p0, La/gs8;->r:I

    .line 238
    .line 239
    invoke-static {p1, v1}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    iput v1, p0, La/gs8;->s:I

    .line 244
    .line 245
    invoke-static {p1, v2}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    iput v1, p0, La/gs8;->t:I

    .line 250
    .line 251
    const v1, 0x7f0706ca

    .line 252
    .line 253
    .line 254
    invoke-static {p1, v1}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    iput v1, p0, La/gs8;->u:I

    .line 259
    .line 260
    invoke-static {p1, v0}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    iput v0, p0, La/gs8;->v:I

    .line 265
    .line 266
    const v0, 0x7f0706ba

    .line 267
    .line 268
    .line 269
    invoke-static {p1, v0}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    iput v0, p0, La/gs8;->w:I

    .line 274
    .line 275
    const v0, 0x7f0706a9

    .line 276
    .line 277
    .line 278
    invoke-static {p1, v0}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    iput v0, p0, La/gs8;->x:I

    .line 283
    .line 284
    invoke-static {p1, v3}, La/h97;->d(Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)I

    .line 285
    .line 286
    .line 287
    move-result p1

    .line 288
    iput p1, p0, La/gs8;->y:I

    .line 289
    .line 290
    const/16 p0, 0x45

    .line 291
    .line 292
    invoke-static {p0}, La/sj3;->X(I)I

    .line 293
    .line 294
    .line 295
    return-void
.end method

.method public static c(La/lk50;)Z
    .locals 1

    .line 1
    iget-object p0, p0, La/lk50;->i:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/u0m0;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    iget-object p0, p0, La/u0m0;->i:La/lho;

    .line 12
    .line 13
    sget-object v0, La/lho;->c:La/lho;

    .line 14
    .line 15
    if-ne p0, v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public static d(La/lk50;)Z
    .locals 2

    .line 1
    iget-object p0, p0, La/lk50;->i:Ljava/util/List;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, La/u0m0;

    .line 27
    .line 28
    iget-object v0, v0, La/u0m0;->i:La/lho;

    .line 29
    .line 30
    sget-object v1, La/lho;->d:La/lho;

    .line 31
    .line 32
    if-ne v0, v1, :cond_1

    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    return p0

    .line 36
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 37
    return p0
.end method


# virtual methods
.method public final a(La/lk50;La/v5l0;)I
    .locals 13

    .line 1
    iget-object v0, p1, La/lk50;->c:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p1, La/lk50;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-boolean v2, p1, La/lk50;->o:Z

    .line 6
    .line 7
    iget v3, p0, La/gs8;->k:I

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    return v3

    .line 12
    :cond_0
    invoke-static {p1}, La/gs8;->d(La/lk50;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    iget-object v4, p1, La/lk50;->j:La/cys0;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x1

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    sget-object v2, La/fs8;->a:[I

    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    aget v2, v2, v7

    .line 29
    .line 30
    if-ne v2, v6, :cond_1

    .line 31
    .line 32
    iget v2, p0, La/gs8;->g:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget v2, p0, La/gs8;->f:I

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move v2, v5

    .line 39
    :goto_0
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    const/4 v8, 0x2

    .line 44
    iget v9, p0, La/gs8;->u:I

    .line 45
    .line 46
    iget v10, p0, La/gs8;->l:I

    .line 47
    .line 48
    if-eqz v7, :cond_e

    .line 49
    .line 50
    iget v11, p0, La/gs8;->e:I

    .line 51
    .line 52
    if-eq v7, v6, :cond_b

    .line 53
    .line 54
    const/4 v12, 0x3

    .line 55
    if-eq v7, v8, :cond_8

    .line 56
    .line 57
    iget v0, p0, La/gs8;->j:I

    .line 58
    .line 59
    iget v1, p0, La/gs8;->m:I

    .line 60
    .line 61
    if-eq v7, v12, :cond_7

    .line 62
    .line 63
    const/4 v11, 0x4

    .line 64
    if-ne v7, v11, :cond_6

    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    packed-switch v7, :pswitch_data_0

    .line 71
    .line 72
    .line 73
    invoke-static {}, La/t9f;->b()V

    .line 74
    .line 75
    .line 76
    return v5

    .line 77
    :cond_3
    :pswitch_0
    move v3, v0

    .line 78
    goto/16 :goto_9

    .line 79
    .line 80
    :pswitch_1
    invoke-static {p1}, La/gs8;->c(La/lk50;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :pswitch_2
    invoke-static {p1}, La/gs8;->c(La/lk50;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_4

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :pswitch_3
    invoke-static {p1}, La/gs8;->c(La/lk50;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_5

    .line 99
    .line 100
    :cond_4
    :goto_1
    :pswitch_4
    move v3, v10

    .line 101
    goto/16 :goto_9

    .line 102
    .line 103
    :pswitch_5
    invoke-static {p1}, La/gs8;->c(La/lk50;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_5

    .line 108
    .line 109
    :goto_2
    :pswitch_6
    move v3, v1

    .line 110
    goto/16 :goto_9

    .line 111
    .line 112
    :cond_5
    move v3, v9

    .line 113
    goto/16 :goto_9

    .line 114
    .line 115
    :goto_3
    :pswitch_7
    iget v3, p0, La/gs8;->y:I

    .line 116
    .line 117
    goto/16 :goto_9

    .line 118
    .line 119
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 120
    .line 121
    .line 122
    return v5

    .line 123
    :cond_7
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    packed-switch v7, :pswitch_data_1

    .line 128
    .line 129
    .line 130
    invoke-static {}, La/t9f;->b()V

    .line 131
    .line 132
    .line 133
    return v5

    .line 134
    :pswitch_8
    invoke-static {p1}, La/gs8;->c(La/lk50;)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_5

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :pswitch_9
    invoke-static {p1}, La/gs8;->c(La/lk50;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_4

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :pswitch_a
    invoke-static {p1}, La/gs8;->c(La/lk50;)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_5

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :pswitch_b
    invoke-static {p1}, La/gs8;->c(La/lk50;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_5

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_8
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    packed-switch v7, :pswitch_data_2

    .line 167
    .line 168
    .line 169
    invoke-static {}, La/t9f;->b()V

    .line 170
    .line 171
    .line 172
    return v5

    .line 173
    :pswitch_c
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    if-nez v3, :cond_9

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_9
    move-object v0, v1

    .line 181
    :goto_4
    iget-object v1, p0, La/gs8;->b:Landroid/text/TextPaint;

    .line 182
    .line 183
    invoke-virtual {p0, v0, v1, v12}, La/gs8;->b(Ljava/lang/String;Landroid/text/TextPaint;I)I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    mul-int v3, v0, v11

    .line 188
    .line 189
    iget v0, p0, La/gs8;->h:I

    .line 190
    .line 191
    if-ge v0, v3, :cond_3

    .line 192
    .line 193
    goto/16 :goto_9

    .line 194
    .line 195
    :pswitch_d
    invoke-static {p1}, La/gs8;->c(La/lk50;)Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-eqz v0, :cond_4

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :pswitch_e
    invoke-static {p1}, La/gs8;->c(La/lk50;)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_5

    .line 207
    .line 208
    goto :goto_5

    .line 209
    :pswitch_f
    invoke-static {p1}, La/gs8;->c(La/lk50;)Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-eqz v0, :cond_a

    .line 214
    .line 215
    :goto_5
    iget v3, p0, La/gs8;->n:I

    .line 216
    .line 217
    goto :goto_9

    .line 218
    :cond_a
    iget v3, p0, La/gs8;->o:I

    .line 219
    .line 220
    goto :goto_9

    .line 221
    :cond_b
    invoke-static {p1}, La/gs8;->c(La/lk50;)Z

    .line 222
    .line 223
    .line 224
    move-result v7

    .line 225
    if-eqz v7, :cond_c

    .line 226
    .line 227
    goto :goto_7

    .line 228
    :cond_c
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 229
    .line 230
    .line 231
    move-result v7

    .line 232
    packed-switch v7, :pswitch_data_3

    .line 233
    .line 234
    .line 235
    invoke-static {}, La/t9f;->b()V

    .line 236
    .line 237
    .line 238
    return v5

    .line 239
    :pswitch_10
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    if-nez v3, :cond_d

    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_d
    move-object v0, v1

    .line 247
    :goto_6
    iget-object v1, p0, La/gs8;->a:Landroid/text/TextPaint;

    .line 248
    .line 249
    invoke-virtual {p0, v0, v1, v8}, La/gs8;->b(Ljava/lang/String;Landroid/text/TextPaint;I)I

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    mul-int v3, v0, v11

    .line 254
    .line 255
    goto :goto_9

    .line 256
    :goto_7
    :pswitch_11
    iget v3, p0, La/gs8;->v:I

    .line 257
    .line 258
    goto :goto_9

    .line 259
    :pswitch_12
    iget v3, p0, La/gs8;->x:I

    .line 260
    .line 261
    goto :goto_9

    .line 262
    :pswitch_13
    iget v3, p0, La/gs8;->w:I

    .line 263
    .line 264
    goto :goto_9

    .line 265
    :cond_e
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    packed-switch v0, :pswitch_data_4

    .line 270
    .line 271
    .line 272
    invoke-static {}, La/t9f;->b()V

    .line 273
    .line 274
    .line 275
    return v5

    .line 276
    :pswitch_14
    invoke-static {p1}, La/gs8;->c(La/lk50;)Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-eqz v0, :cond_f

    .line 281
    .line 282
    goto :goto_8

    .line 283
    :cond_f
    iget v3, p0, La/gs8;->t:I

    .line 284
    .line 285
    goto :goto_9

    .line 286
    :pswitch_15
    invoke-static {p1}, La/gs8;->d(La/lk50;)Z

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    if-eqz v0, :cond_10

    .line 291
    .line 292
    iget v3, p0, La/gs8;->q:I

    .line 293
    .line 294
    goto :goto_9

    .line 295
    :cond_10
    iget v3, p0, La/gs8;->r:I

    .line 296
    .line 297
    goto :goto_9

    .line 298
    :pswitch_16
    invoke-static {p1}, La/gs8;->c(La/lk50;)Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-eqz v0, :cond_5

    .line 303
    .line 304
    :goto_8
    iget v3, p0, La/gs8;->s:I

    .line 305
    .line 306
    goto :goto_9

    .line 307
    :pswitch_17
    iget v3, p0, La/gs8;->p:I

    .line 308
    .line 309
    :goto_9
    :pswitch_18
    add-int/2addr v2, v3

    .line 310
    sget-object v0, La/cys0;->b:La/cys0;

    .line 311
    .line 312
    if-ne v4, v0, :cond_11

    .line 313
    .line 314
    move v0, v6

    .line 315
    goto :goto_a

    .line 316
    :cond_11
    move v0, v5

    .line 317
    :goto_a
    iget-object v1, p1, La/lk50;->m:La/k1m0;

    .line 318
    .line 319
    iget-boolean v1, v1, La/k1m0;->c:Z

    .line 320
    .line 321
    iget-object v3, p1, La/lk50;->i:Ljava/util/List;

    .line 322
    .line 323
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    if-eqz v3, :cond_12

    .line 328
    .line 329
    move v3, v6

    .line 330
    goto :goto_b

    .line 331
    :cond_12
    move v3, v5

    .line 332
    :goto_b
    if-eqz v0, :cond_14

    .line 333
    .line 334
    invoke-static {p1}, La/gs8;->c(La/lk50;)Z

    .line 335
    .line 336
    .line 337
    move-result p1

    .line 338
    if-eqz p1, :cond_13

    .line 339
    .line 340
    move v6, v1

    .line 341
    goto :goto_c

    .line 342
    :cond_13
    move v6, v5

    .line 343
    goto :goto_c

    .line 344
    :cond_14
    if-nez v3, :cond_15

    .line 345
    .line 346
    if-eqz v1, :cond_13

    .line 347
    .line 348
    :cond_15
    :goto_c
    if-eqz v6, :cond_16

    .line 349
    .line 350
    iget v5, p0, La/gs8;->i:I

    .line 351
    .line 352
    :cond_16
    add-int/2addr v2, v5

    .line 353
    sget-object p1, La/fs8;->a:[I

    .line 354
    .line 355
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 356
    .line 357
    .line 358
    move-result p2

    .line 359
    aget p1, p1, p2

    .line 360
    .line 361
    if-ne p1, v8, :cond_17

    .line 362
    .line 363
    iget p0, p0, La/gs8;->c:I

    .line 364
    .line 365
    :goto_d
    mul-int/2addr p0, v8

    .line 366
    goto :goto_e

    .line 367
    :cond_17
    iget p0, p0, La/gs8;->d:I

    .line 368
    .line 369
    goto :goto_d

    .line 370
    :goto_e
    add-int/2addr v2, p0

    .line 371
    return v2

    .line 372
    nop

    .line 373
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_5
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_18
    .end packed-switch

    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_18
    .end packed-switch

    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_f
        :pswitch_d
        :pswitch_f
        :pswitch_c
        :pswitch_18
    .end packed-switch

    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_13
        :pswitch_11
        :pswitch_13
        :pswitch_10
        :pswitch_18
    .end packed-switch

    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_15
        :pswitch_4
        :pswitch_18
    .end packed-switch
.end method

.method public final b(Ljava/lang/String;Landroid/text/TextPaint;I)I
    .locals 8

    .line 1
    invoke-static {p1}, La/f1t0;->L(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p1, p0, La/gs8;->z:Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;

    .line 6
    .line 7
    iget p1, p1, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;->B:I

    .line 8
    .line 9
    iget p0, p0, La/gs8;->h:I

    .line 10
    .line 11
    sub-int v2, p1, p0

    .line 12
    .line 13
    sget-object v4, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 14
    .line 15
    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    const/16 v7, 0x4f0

    .line 19
    .line 20
    move-object v1, p2

    .line 21
    move v3, p3

    .line 22
    invoke-static/range {v0 .. v7}, La/xdx;->I(Ljava/lang/CharSequence;Landroid/text/TextPaint;IILandroid/text/TextUtils$TruncateAt;ILandroid/text/Layout$Alignment;I)Landroid/text/StaticLayout;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Landroid/text/StaticLayout;->getLineCount()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method
