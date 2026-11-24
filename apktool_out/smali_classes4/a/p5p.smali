.class public final synthetic La/p5p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/s5p;


# direct methods
.method public synthetic constructor <init>(La/s5p;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/p5p;->a:B

    iput-object p1, p0, La/p5p;->b:La/s5p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/p5p;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/p5p;->b:La/s5p;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/s5p;->P1:La/nek;

    .line 11
    .line 12
    new-instance v1, La/o5p;

    .line 13
    .line 14
    new-instance v2, La/k4p;

    .line 15
    .line 16
    iget-object v0, v0, La/s5p;->N1:La/kiu0;

    .line 17
    .line 18
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    move-object v4, v3

    .line 23
    check-cast v4, La/k6p;

    .line 24
    .line 25
    const/4 v8, 0x0

    .line 26
    const/4 v9, 0x1

    .line 27
    const/4 v3, 0x1

    .line 28
    const-class v5, La/k6p;

    .line 29
    .line 30
    const-string v6, "onFavoriteChampClick"

    .line 31
    .line 32
    const-string v7, "onFavoriteChampClick(Lorg/xplatform/favorites/impl/presentation/all_champs/models/FavoriteChampsUiModel;)V"

    .line 33
    .line 34
    invoke-direct/range {v2 .. v9}, La/k4p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 35
    .line 36
    .line 37
    new-instance v10, La/k4p;

    .line 38
    .line 39
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    move-object v12, v0

    .line 44
    check-cast v12, La/k6p;

    .line 45
    .line 46
    const/16 v16, 0x0

    .line 47
    .line 48
    const/16 v17, 0x2

    .line 49
    .line 50
    const/4 v11, 0x1

    .line 51
    const-string v14, "onRemoveFavoriteChampClick"

    .line 52
    .line 53
    const-string v15, "onRemoveFavoriteChampClick(Lorg/xplatform/favorites/impl/presentation/all_champs/models/FavoriteChampsUiModel;)V"

    .line 54
    .line 55
    move-object v13, v5

    .line 56
    invoke-direct/range {v10 .. v17}, La/k4p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 57
    .line 58
    .line 59
    invoke-direct {v1}, La/qv5;-><init>()V

    .line 60
    .line 61
    .line 62
    new-instance v0, La/x6o;

    .line 63
    .line 64
    const/16 v3, 0x1c

    .line 65
    .line 66
    invoke-direct {v0, v3}, La/x6o;-><init>(B)V

    .line 67
    .line 68
    .line 69
    new-instance v3, La/f5p;

    .line 70
    .line 71
    const/4 v4, 0x1

    .line 72
    invoke-direct {v3, v10, v2, v4}, La/f5p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 73
    .line 74
    .line 75
    new-instance v2, La/e9k;

    .line 76
    .line 77
    const/16 v4, 0x1a

    .line 78
    .line 79
    const/4 v5, 0x3

    .line 80
    invoke-direct {v2, v5, v4}, La/e9k;-><init>(IB)V

    .line 81
    .line 82
    .line 83
    sget-object v4, La/gzn;->t:La/gzn;

    .line 84
    .line 85
    new-instance v6, La/gbn;

    .line 86
    .line 87
    invoke-direct {v6, v0, v2, v3, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, v1, La/zz3;->d:La/dp;

    .line 91
    .line 92
    invoke-virtual {v0, v6}, La/dp;->b(La/gbn;)V

    .line 93
    .line 94
    .line 95
    new-instance v2, La/x6o;

    .line 96
    .line 97
    const/16 v3, 0x1b

    .line 98
    .line 99
    invoke-direct {v2, v3}, La/x6o;-><init>(B)V

    .line 100
    .line 101
    .line 102
    new-instance v3, La/e4p;

    .line 103
    .line 104
    const/4 v4, 0x7

    .line 105
    invoke-direct {v3, v4}, La/e4p;-><init>(B)V

    .line 106
    .line 107
    .line 108
    new-instance v4, La/e9k;

    .line 109
    .line 110
    const/16 v6, 0x19

    .line 111
    .line 112
    invoke-direct {v4, v5, v6}, La/e9k;-><init>(IB)V

    .line 113
    .line 114
    .line 115
    sget-object v5, La/gzn;->s:La/gzn;

    .line 116
    .line 117
    new-instance v6, La/gbn;

    .line 118
    .line 119
    invoke-direct {v6, v2, v4, v3, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v6}, La/dp;->b(La/gbn;)V

    .line 123
    .line 124
    .line 125
    return-object v1

    .line 126
    :pswitch_0
    sget-object v1, La/s5p;->P1:La/nek;

    .line 127
    .line 128
    iget-object v0, v0, La/s5p;->M1:La/a8z;

    .line 129
    .line 130
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    check-cast v0, La/igi;

    .line 135
    .line 136
    iget-object v0, v0, La/igi;->r:La/n5d0;

    .line 137
    .line 138
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    check-cast v0, La/hgi;

    .line 143
    .line 144
    return-object v0

    .line 145
    :pswitch_1
    sget-object v1, La/s5p;->P1:La/nek;

    .line 146
    .line 147
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    instance-of v2, v1, La/af3;

    .line 159
    .line 160
    const/4 v3, 0x0

    .line 161
    if-eqz v2, :cond_0

    .line 162
    .line 163
    check-cast v1, La/af3;

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_0
    move-object v1, v3

    .line 167
    :goto_0
    const-class v2, La/t5p;

    .line 168
    .line 169
    if-eqz v1, :cond_3

    .line 170
    .line 171
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    check-cast v1, La/o5d0;

    .line 180
    .line 181
    if-eqz v1, :cond_1

    .line 182
    .line 183
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    check-cast v1, La/ze3;

    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_1
    move-object v1, v3

    .line 191
    :goto_1
    instance-of v4, v1, La/t5p;

    .line 192
    .line 193
    if-nez v4, :cond_2

    .line 194
    .line 195
    move-object v1, v3

    .line 196
    :cond_2
    check-cast v1, La/t5p;

    .line 197
    .line 198
    if-eqz v1, :cond_3

    .line 199
    .line 200
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {v1, v0}, La/t5p;->a(La/i1w0;)La/igi;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    goto :goto_2

    .line 209
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 210
    .line 211
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    :goto_2
    return-object v3

    .line 219
    :pswitch_2
    sget-object v1, La/s5p;->P1:La/nek;

    .line 220
    .line 221
    iget-object v0, v0, La/s5p;->N1:La/kiu0;

    .line 222
    .line 223
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    check-cast v0, La/k6p;

    .line 228
    .line 229
    iget-object v0, v0, La/k6p;->b:La/i1w0;

    .line 230
    .line 231
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    new-instance v2, La/c8d;

    .line 236
    .line 237
    sget-object v3, La/y7d;->a:La/v7d;

    .line 238
    .line 239
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 240
    .line 241
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 242
    .line 243
    .line 244
    const/4 v3, 0x0

    .line 245
    invoke-static {v1, v2, v0, v1, v3}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    :goto_3
    move-object v2, v1

    .line 250
    check-cast v2, La/paw;

    .line 251
    .line 252
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    if-eqz v3, :cond_4

    .line 257
    .line 258
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    check-cast v2, La/oe50;

    .line 263
    .line 264
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 265
    .line 266
    .line 267
    goto :goto_3

    .line 268
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 269
    .line 270
    return-object v0

    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
