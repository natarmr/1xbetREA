.class public final synthetic La/x3h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/x3h;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte p0, p0, La/x3h;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    new-instance p0, La/zw3;

    .line 8
    .line 9
    sget-object v1, La/dah;->a:La/dah;

    .line 10
    .line 11
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 12
    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_0
    sget p0, La/dch;->F:I

    .line 16
    .line 17
    sget-object p0, La/bid;->a:La/bid;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_1
    new-instance v0, La/ubh;

    .line 21
    .line 22
    sget-object v3, La/tbh;->a:La/tbh;

    .line 23
    .line 24
    sget-object v4, La/iun;->a:La/iun;

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    sget-object v7, La/v5l0;->d:La/v5l0;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v9, 0x0

    .line 33
    move-object v8, v4

    .line 34
    invoke-direct/range {v0 .. v9}, La/ubh;-><init>(Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;ZLa/tbh;Ljava/util/List;ZZLa/v5l0;Ljava/util/List;La/wcb;)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_2
    sget p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;->f:I

    .line 39
    .line 40
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    :goto_0
    const/4 v1, 0x6

    .line 45
    if-ge v0, v1, :cond_0

    .line 46
    .line 47
    new-instance v1, La/fng;

    .line 48
    .line 49
    const v2, 0x7f080f5c

    .line 50
    .line 51
    .line 52
    invoke-direct {v1, v2, v2}, La/fng;-><init>(II)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-static {p0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :pswitch_3
    new-instance p0, La/zw3;

    .line 67
    .line 68
    sget-object v1, La/f9h;->a:La/f9h;

    .line 69
    .line 70
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 71
    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_4
    new-instance p0, La/zw3;

    .line 75
    .line 76
    sget-object v1, La/l9h;->a:La/l9h;

    .line 77
    .line 78
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 79
    .line 80
    .line 81
    return-object p0

    .line 82
    :pswitch_5
    new-instance p0, La/zw3;

    .line 83
    .line 84
    sget-object v1, La/y8h;->a:La/y8h;

    .line 85
    .line 86
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 87
    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_6
    new-instance p0, La/zw3;

    .line 91
    .line 92
    sget-object v1, La/i9h;->a:La/i9h;

    .line 93
    .line 94
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 95
    .line 96
    .line 97
    return-object p0

    .line 98
    :pswitch_7
    new-instance p0, La/zw3;

    .line 99
    .line 100
    sget-object v1, La/eh30;->a:La/eh30;

    .line 101
    .line 102
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 103
    .line 104
    .line 105
    return-object p0

    .line 106
    :pswitch_8
    new-instance p0, La/zw3;

    .line 107
    .line 108
    sget-object v1, La/g8h;->a:La/g8h;

    .line 109
    .line 110
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 111
    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_9
    new-instance p0, La/zw3;

    .line 115
    .line 116
    sget-object v1, La/vny;->a:La/vny;

    .line 117
    .line 118
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 119
    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_a
    new-instance p0, La/zw3;

    .line 123
    .line 124
    sget-object v1, La/gba0;->a:La/gba0;

    .line 125
    .line 126
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 127
    .line 128
    .line 129
    return-object p0

    .line 130
    :pswitch_b
    new-instance p0, La/zw3;

    .line 131
    .line 132
    sget-object v1, La/u0a0;->a:La/u0a0;

    .line 133
    .line 134
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 135
    .line 136
    .line 137
    return-object p0

    .line 138
    :pswitch_c
    new-instance p0, La/zw3;

    .line 139
    .line 140
    sget-object v1, La/oy90;->a:La/oy90;

    .line 141
    .line 142
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 143
    .line 144
    .line 145
    return-object p0

    .line 146
    :pswitch_d
    new-instance p0, La/zw3;

    .line 147
    .line 148
    sget-object v1, La/u0a0;->a:La/u0a0;

    .line 149
    .line 150
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 151
    .line 152
    .line 153
    return-object p0

    .line 154
    :pswitch_e
    sget p0, La/a8h;->O:I

    .line 155
    .line 156
    sget-object p0, La/gve;->a:La/gve;

    .line 157
    .line 158
    return-object p0

    .line 159
    :pswitch_f
    sget p0, La/a8h;->O:I

    .line 160
    .line 161
    sget-object p0, La/wld0;->a:La/wld0;

    .line 162
    .line 163
    return-object p0

    .line 164
    :pswitch_10
    sget p0, La/a8h;->O:I

    .line 165
    .line 166
    sget-object p0, La/g230;->a:La/g230;

    .line 167
    .line 168
    return-object p0

    .line 169
    :pswitch_11
    new-instance v0, La/g7h;

    .line 170
    .line 171
    sget-object v3, La/iun;->a:La/iun;

    .line 172
    .line 173
    sget-object v4, La/uh90;->g:La/uh90;

    .line 174
    .line 175
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    const-wide/16 v9, -0x1a

    .line 188
    .line 189
    const/4 v1, 0x0

    .line 190
    const/4 v2, 0x0

    .line 191
    move-object v5, v4

    .line 192
    move-object v6, v4

    .line 193
    move-object v7, v4

    .line 194
    move-object v8, v3

    .line 195
    invoke-direct/range {v0 .. v10}, La/g7h;-><init>(La/m9s;La/ms2;Ljava/util/List;La/th90;La/th90;La/th90;La/th90;Ljava/util/List;J)V

    .line 196
    .line 197
    .line 198
    return-object v0

    .line 199
    :pswitch_12
    new-instance p0, La/zw3;

    .line 200
    .line 201
    sget-object v1, La/n5h;->a:La/n5h;

    .line 202
    .line 203
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 204
    .line 205
    .line 206
    return-object p0

    .line 207
    :pswitch_13
    new-instance p0, La/zw3;

    .line 208
    .line 209
    sget-object v1, La/xxm0;->a:La/xxm0;

    .line 210
    .line 211
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 212
    .line 213
    .line 214
    return-object p0

    .line 215
    :pswitch_14
    new-instance p0, La/zw3;

    .line 216
    .line 217
    sget-object v1, La/aas;->a:La/aas;

    .line 218
    .line 219
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 220
    .line 221
    .line 222
    return-object p0

    .line 223
    :pswitch_15
    new-instance p0, La/zw3;

    .line 224
    .line 225
    sget-object v1, La/okx;->a:La/okx;

    .line 226
    .line 227
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 228
    .line 229
    .line 230
    return-object p0

    .line 231
    :pswitch_16
    new-instance p0, La/zw3;

    .line 232
    .line 233
    sget-object v1, La/k3h;->a:La/k3h;

    .line 234
    .line 235
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 236
    .line 237
    .line 238
    return-object p0

    .line 239
    :pswitch_17
    new-instance p0, La/zw3;

    .line 240
    .line 241
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 242
    .line 243
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 244
    .line 245
    .line 246
    return-object p0

    .line 247
    :pswitch_18
    new-instance p0, La/zw3;

    .line 248
    .line 249
    sget-object v1, La/s710;->a:La/s710;

    .line 250
    .line 251
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 252
    .line 253
    .line 254
    return-object p0

    .line 255
    :pswitch_19
    new-instance p0, La/zw3;

    .line 256
    .line 257
    sget-object v1, La/u3h;->a:La/u3h;

    .line 258
    .line 259
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 260
    .line 261
    .line 262
    return-object p0

    .line 263
    :pswitch_1a
    new-instance p0, La/inv;

    .line 264
    .line 265
    sget-object v1, La/okx;->a:La/okx;

    .line 266
    .line 267
    new-instance v2, La/zw3;

    .line 268
    .line 269
    sget-object v3, La/els;->a:La/els;

    .line 270
    .line 271
    invoke-direct {v2, v3, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 272
    .line 273
    .line 274
    const/4 v0, 0x1

    .line 275
    invoke-direct {p0, v1, v2, v0}, La/inv;-><init>(La/jiy;La/jiy;B)V

    .line 276
    .line 277
    .line 278
    return-object p0

    .line 279
    :pswitch_1b
    new-instance p0, La/zw3;

    .line 280
    .line 281
    sget-object v1, La/z3h;->a:La/z3h;

    .line 282
    .line 283
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 284
    .line 285
    .line 286
    return-object p0

    .line 287
    :pswitch_1c
    const/4 p0, 0x0

    .line 288
    invoke-static {p0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    return-object p0

    .line 293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
