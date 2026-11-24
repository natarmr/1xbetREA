.class public final synthetic La/g57;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/z77;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/z77;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/g57;->a:B

    iput-object p1, p0, La/g57;->b:La/z77;

    iput-object p2, p0, La/g57;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/z77;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/g57;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/g57;->c:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/g57;->b:La/z77;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/g57;->a:B

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    sget-object v2, La/qv7;->a:La/qv7;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const v4, 0x799532c4

    .line 9
    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    iget-object v6, p0, La/g57;->c:Lkotlin/jvm/functions/Function1;

    .line 13
    .line 14
    iget-object p0, p0, La/g57;->b:La/z77;

    .line 15
    .line 16
    const/4 v7, 0x3

    .line 17
    const/4 v8, 0x0

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast p1, La/hcz;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-object v0, p0

    .line 27
    check-cast v0, La/x77;

    .line 28
    .line 29
    iget-object v3, v0, La/x77;->h:La/rv7;

    .line 30
    .line 31
    instance-of v9, v3, La/pv7;

    .line 32
    .line 33
    const/4 v10, 0x2

    .line 34
    if-eqz v9, :cond_0

    .line 35
    .line 36
    new-instance v2, La/h57;

    .line 37
    .line 38
    invoke-direct {v2, p0, v6, v10}, La/h57;-><init>(La/z77;Lkotlin/jvm/functions/Function1;B)V

    .line 39
    .line 40
    .line 41
    new-instance v3, La/ugd;

    .line 42
    .line 43
    const v9, 0x317ffee5

    .line 44
    .line 45
    .line 46
    invoke-direct {v3, v9, v5, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1, v8, v8, v3, v7}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    :goto_0
    iget-object v2, v0, La/x77;->g:Ljava/util/ArrayList;

    .line 60
    .line 61
    new-instance v3, La/ofo0;

    .line 62
    .line 63
    const/16 v9, 0x9

    .line 64
    .line 65
    invoke-direct {v3, v9}, La/ofo0;-><init>(B)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    new-instance v11, La/zcn0;

    .line 73
    .line 74
    invoke-direct {v11, v3, v2, v1}, La/zcn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 75
    .line 76
    .line 77
    new-instance v1, La/t9l0;

    .line 78
    .line 79
    const/4 v3, 0x7

    .line 80
    invoke-direct {v1, v2, v3}, La/t9l0;-><init>(Ljava/util/ArrayList;B)V

    .line 81
    .line 82
    .line 83
    new-instance v3, La/o57;

    .line 84
    .line 85
    invoke-direct {v3, v2, p0, v6, v10}, La/o57;-><init>(Ljava/util/ArrayList;La/z77;Lkotlin/jvm/functions/Function1;B)V

    .line 86
    .line 87
    .line 88
    new-instance p0, La/ugd;

    .line 89
    .line 90
    invoke-direct {p0, v4, v5, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v9, v11, v1, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 94
    .line 95
    .line 96
    iget-boolean p0, v0, La/x77;->j:Z

    .line 97
    .line 98
    if-eqz p0, :cond_1

    .line 99
    .line 100
    iget-boolean p0, v0, La/x77;->k:Z

    .line 101
    .line 102
    if-nez p0, :cond_1

    .line 103
    .line 104
    sget-object p0, La/nia0;->d:La/ugd;

    .line 105
    .line 106
    invoke-static {p1, v8, v8, p0, v7}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 107
    .line 108
    .line 109
    :cond_1
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 113
    .line 114
    .line 115
    :goto_1
    return-object v8

    .line 116
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    invoke-interface {p0}, La/z77;->f()La/w2w;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    iget-object p0, p0, La/w2w;->n:La/a4x;

    .line 127
    .line 128
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    check-cast p0, La/j8w;

    .line 133
    .line 134
    iget-object p0, p0, La/j8w;->b:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 135
    .line 136
    new-instance p1, La/l27;

    .line 137
    .line 138
    invoke-direct {p1, p0}, La/l27;-><init>(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v6, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    return-object p0

    .line 147
    :pswitch_1
    check-cast p1, La/hcz;

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    move-object v0, p0

    .line 153
    check-cast v0, La/x77;

    .line 154
    .line 155
    iget-object v1, v0, La/x77;->g:Ljava/util/ArrayList;

    .line 156
    .line 157
    new-instance v2, La/qbd;

    .line 158
    .line 159
    invoke-direct {v2, v7}, La/qbd;-><init>(B)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    new-instance v10, La/at7;

    .line 167
    .line 168
    const/16 v11, 0x15

    .line 169
    .line 170
    invoke-direct {v10, v2, v1, v11}, La/at7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 171
    .line 172
    .line 173
    new-instance v2, La/j13;

    .line 174
    .line 175
    const/16 v11, 0xa

    .line 176
    .line 177
    invoke-direct {v2, v1, v11, v3}, La/j13;-><init>(Ljava/util/ArrayList;BZ)V

    .line 178
    .line 179
    .line 180
    new-instance v3, La/o57;

    .line 181
    .line 182
    invoke-direct {v3, v1, p0, v6, v5}, La/o57;-><init>(Ljava/util/ArrayList;La/z77;Lkotlin/jvm/functions/Function1;B)V

    .line 183
    .line 184
    .line 185
    new-instance p0, La/ugd;

    .line 186
    .line 187
    invoke-direct {p0, v4, v5, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1, v9, v10, v2, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 191
    .line 192
    .line 193
    iget-boolean p0, v0, La/x77;->j:Z

    .line 194
    .line 195
    if-eqz p0, :cond_3

    .line 196
    .line 197
    iget-boolean p0, v0, La/x77;->k:Z

    .line 198
    .line 199
    if-nez p0, :cond_3

    .line 200
    .line 201
    sget-object p0, La/gq80;->a:La/ugd;

    .line 202
    .line 203
    invoke-static {p1, v8, v8, p0, v7}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 204
    .line 205
    .line 206
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object p0

    .line 209
    :pswitch_2
    check-cast p1, La/hcz;

    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    move-object v0, p0

    .line 215
    check-cast v0, La/x77;

    .line 216
    .line 217
    iget-object v9, v0, La/x77;->h:La/rv7;

    .line 218
    .line 219
    instance-of v10, v9, La/pv7;

    .line 220
    .line 221
    if-eqz v10, :cond_4

    .line 222
    .line 223
    new-instance v2, La/h57;

    .line 224
    .line 225
    invoke-direct {v2, p0, v6, v3}, La/h57;-><init>(La/z77;Lkotlin/jvm/functions/Function1;B)V

    .line 226
    .line 227
    .line 228
    new-instance v9, La/ugd;

    .line 229
    .line 230
    const v10, -0x72129cd1

    .line 231
    .line 232
    .line 233
    invoke-direct {v9, v10, v5, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    invoke-static {p1, v8, v8, v9, v7}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 237
    .line 238
    .line 239
    goto :goto_2

    .line 240
    :cond_4
    invoke-virtual {v9, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    if-eqz v2, :cond_6

    .line 245
    .line 246
    :goto_2
    iget-object v2, v0, La/x77;->g:Ljava/util/ArrayList;

    .line 247
    .line 248
    new-instance v9, La/os6;

    .line 249
    .line 250
    invoke-direct {v9, v1}, La/os6;-><init>(B)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    new-instance v10, La/ci2;

    .line 258
    .line 259
    const/16 v11, 0x19

    .line 260
    .line 261
    invoke-direct {v10, v9, v2, v11}, La/ci2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 262
    .line 263
    .line 264
    new-instance v9, La/ci2;

    .line 265
    .line 266
    const/16 v11, 0x1a

    .line 267
    .line 268
    invoke-direct {v9, v2, p0, v11}, La/ci2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 269
    .line 270
    .line 271
    new-instance v11, La/o57;

    .line 272
    .line 273
    invoke-direct {v11, v2, p0, v6, v3}, La/o57;-><init>(Ljava/util/ArrayList;La/z77;Lkotlin/jvm/functions/Function1;B)V

    .line 274
    .line 275
    .line 276
    new-instance p0, La/ugd;

    .line 277
    .line 278
    invoke-direct {p0, v4, v5, v11}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1, v1, v10, v9, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 282
    .line 283
    .line 284
    iget-boolean p0, v0, La/x77;->j:Z

    .line 285
    .line 286
    if-eqz p0, :cond_5

    .line 287
    .line 288
    iget-boolean p0, v0, La/x77;->k:Z

    .line 289
    .line 290
    if-nez p0, :cond_5

    .line 291
    .line 292
    sget-object p0, La/hp4;->a:La/ugd;

    .line 293
    .line 294
    invoke-static {p1, v8, v8, p0, v7}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 295
    .line 296
    .line 297
    :cond_5
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 298
    .line 299
    goto :goto_3

    .line 300
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 301
    .line 302
    .line 303
    :goto_3
    return-object v8

    .line 304
    nop

    .line 305
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
