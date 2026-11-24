.class public final La/mtt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:La/pzu;


# direct methods
.method public synthetic constructor <init>(La/pzu;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mtt;->a:B

    iput-object p1, p0, La/mtt;->b:La/pzu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/mtt;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/mtt;->b:La/pzu;

    .line 5
    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/high16 v5, -0x80000000

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, La/ptu;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    move-object v0, p1

    .line 20
    check-cast v0, La/ptu;

    .line 21
    .line 22
    iget v7, v0, La/ptu;->k:I

    .line 23
    .line 24
    and-int v8, v7, v5

    .line 25
    .line 26
    if-eqz v8, :cond_0

    .line 27
    .line 28
    sub-int/2addr v7, v5

    .line 29
    iput v7, v0, La/ptu;->k:I

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v0, La/ptu;

    .line 33
    .line 34
    invoke-direct {v0, p0, p1}, La/ptu;-><init>(La/mtt;La/zje;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    iget-object p0, v0, La/ptu;->i:Ljava/lang/Object;

    .line 38
    .line 39
    sget-object p1, La/wne;->a:La/wne;

    .line 40
    .line 41
    iget v5, v0, La/ptu;->k:I

    .line 42
    .line 43
    if-eqz v5, :cond_2

    .line 44
    .line 45
    if-ne v5, v4, :cond_1

    .line 46
    .line 47
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iput v4, v0, La/ptu;->k:I

    .line 59
    .line 60
    invoke-virtual {v2, v0}, La/pzu;->E(La/zje;)Ljava/io/Serializable;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-ne p0, p1, :cond_3

    .line 65
    .line 66
    move-object v6, p1

    .line 67
    goto :goto_3

    .line 68
    :cond_3
    :goto_1
    check-cast p0, Ljava/lang/Iterable;

    .line 69
    .line 70
    instance-of p1, p0, Ljava/util/Collection;

    .line 71
    .line 72
    if-eqz p1, :cond_4

    .line 73
    .line 74
    move-object p1, p0

    .line 75
    check-cast p1, Ljava/util/Collection;

    .line 76
    .line 77
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_4

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_6

    .line 93
    .line 94
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    check-cast p1, La/h85;

    .line 99
    .line 100
    iget-object p1, p1, La/h85;->b:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 101
    .line 102
    sget-object v0, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->n:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 103
    .line 104
    if-ne p1, v0, :cond_5

    .line 105
    .line 106
    move v1, v4

    .line 107
    :cond_6
    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    :goto_3
    return-object v6

    .line 112
    :pswitch_0
    instance-of v0, p1, La/byt;

    .line 113
    .line 114
    if-eqz v0, :cond_7

    .line 115
    .line 116
    move-object v0, p1

    .line 117
    check-cast v0, La/byt;

    .line 118
    .line 119
    iget v1, v0, La/byt;->k:I

    .line 120
    .line 121
    and-int v7, v1, v5

    .line 122
    .line 123
    if-eqz v7, :cond_7

    .line 124
    .line 125
    sub-int/2addr v1, v5

    .line 126
    iput v1, v0, La/byt;->k:I

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_7
    new-instance v0, La/byt;

    .line 130
    .line 131
    invoke-direct {v0, p0, p1}, La/byt;-><init>(La/mtt;La/zje;)V

    .line 132
    .line 133
    .line 134
    :goto_4
    iget-object p0, v0, La/byt;->i:Ljava/lang/Object;

    .line 135
    .line 136
    sget-object p1, La/wne;->a:La/wne;

    .line 137
    .line 138
    iget v1, v0, La/byt;->k:I

    .line 139
    .line 140
    if-eqz v1, :cond_9

    .line 141
    .line 142
    if-ne v1, v4, :cond_8

    .line 143
    .line 144
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_8
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    goto :goto_7

    .line 152
    :cond_9
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    iput v4, v0, La/byt;->k:I

    .line 156
    .line 157
    invoke-virtual {v2, v0}, La/pzu;->K(La/zje;)Ljava/io/Serializable;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    if-ne p0, p1, :cond_a

    .line 162
    .line 163
    move-object v6, p1

    .line 164
    goto :goto_7

    .line 165
    :cond_a
    :goto_5
    check-cast p0, Ljava/lang/Iterable;

    .line 166
    .line 167
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    :cond_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    if-eqz p1, :cond_c

    .line 176
    .line 177
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    move-object v0, p1

    .line 182
    check-cast v0, La/kzz;

    .line 183
    .line 184
    iget-object v0, v0, La/kzz;->a:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 185
    .line 186
    sget-object v1, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->o:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 187
    .line 188
    if-ne v0, v1, :cond_b

    .line 189
    .line 190
    move-object v6, p1

    .line 191
    :cond_c
    check-cast v6, La/kzz;

    .line 192
    .line 193
    if-eqz v6, :cond_d

    .line 194
    .line 195
    iget-wide p0, v6, La/kzz;->g:J

    .line 196
    .line 197
    long-to-int p0, p0

    .line 198
    goto :goto_6

    .line 199
    :cond_d
    const/16 p0, 0x3c

    .line 200
    .line 201
    :goto_6
    new-instance v6, Ljava/lang/Integer;

    .line 202
    .line 203
    invoke-direct {v6, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 204
    .line 205
    .line 206
    :goto_7
    return-object v6

    .line 207
    :pswitch_1
    instance-of v0, p1, La/ltt;

    .line 208
    .line 209
    if-eqz v0, :cond_e

    .line 210
    .line 211
    move-object v0, p1

    .line 212
    check-cast v0, La/ltt;

    .line 213
    .line 214
    iget v7, v0, La/ltt;->k:I

    .line 215
    .line 216
    and-int v8, v7, v5

    .line 217
    .line 218
    if-eqz v8, :cond_e

    .line 219
    .line 220
    sub-int/2addr v7, v5

    .line 221
    iput v7, v0, La/ltt;->k:I

    .line 222
    .line 223
    goto :goto_8

    .line 224
    :cond_e
    new-instance v0, La/ltt;

    .line 225
    .line 226
    invoke-direct {v0, p0, p1}, La/ltt;-><init>(La/mtt;La/zje;)V

    .line 227
    .line 228
    .line 229
    :goto_8
    iget-object p0, v0, La/ltt;->i:Ljava/lang/Object;

    .line 230
    .line 231
    sget-object p1, La/wne;->a:La/wne;

    .line 232
    .line 233
    iget v5, v0, La/ltt;->k:I

    .line 234
    .line 235
    if-eqz v5, :cond_10

    .line 236
    .line 237
    if-ne v5, v4, :cond_f

    .line 238
    .line 239
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    goto :goto_9

    .line 243
    :cond_f
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    goto :goto_a

    .line 247
    :cond_10
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    iput v4, v0, La/ltt;->k:I

    .line 251
    .line 252
    invoke-virtual {v2, v0}, La/pzu;->E(La/zje;)Ljava/io/Serializable;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    if-ne p0, p1, :cond_11

    .line 257
    .line 258
    move-object v6, p1

    .line 259
    goto :goto_a

    .line 260
    :cond_11
    :goto_9
    check-cast p0, Ljava/lang/Iterable;

    .line 261
    .line 262
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    :cond_12
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 267
    .line 268
    .line 269
    move-result p1

    .line 270
    if-eqz p1, :cond_14

    .line 271
    .line 272
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    move-object v0, p1

    .line 277
    check-cast v0, La/h85;

    .line 278
    .line 279
    iget-object v0, v0, La/h85;->b:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 280
    .line 281
    sget-object v2, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->d:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 282
    .line 283
    if-eq v0, v2, :cond_13

    .line 284
    .line 285
    sget-object v2, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->e:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 286
    .line 287
    if-eq v0, v2, :cond_13

    .line 288
    .line 289
    sget-object v2, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->f:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 290
    .line 291
    if-ne v0, v2, :cond_12

    .line 292
    .line 293
    :cond_13
    move-object v6, p1

    .line 294
    :cond_14
    if-eqz v6, :cond_15

    .line 295
    .line 296
    move v1, v4

    .line 297
    :cond_15
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 298
    .line 299
    .line 300
    move-result-object v6

    .line 301
    :goto_a
    return-object v6

    .line 302
    nop

    .line 303
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
