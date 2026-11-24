.class public final synthetic La/ws80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jt80;


# direct methods
.method public synthetic constructor <init>(La/jt80;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ws80;->a:B

    iput-object p1, p0, La/ws80;->b:La/jt80;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ws80;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/ws80;->b:La/jt80;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Throwable;

    .line 13
    .line 14
    sget v1, La/jt80;->s0:I

    .line 15
    .line 16
    sget-object v1, La/ns80;->a:La/ns80;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, Ljava/lang/Throwable;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v0, v0, La/jt80;->H:La/duj;

    .line 32
    .line 33
    new-instance v2, La/zc70;

    .line 34
    .line 35
    const/16 v3, 0x17

    .line 36
    .line 37
    invoke-direct {v2, v3}, La/zc70;-><init>(B)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 41
    .line 42
    .line 43
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_1
    move-object/from16 v1, p1

    .line 47
    .line 48
    check-cast v1, Ljava/lang/Throwable;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    instance-of v2, v1, La/jfp;

    .line 54
    .line 55
    iget-object v3, v0, La/jt80;->I:La/ctf0;

    .line 56
    .line 57
    if-eqz v2, :cond_0

    .line 58
    .line 59
    new-instance v1, La/ps80;

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    new-array v4, v2, [Ljava/lang/Object;

    .line 63
    .line 64
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 65
    .line 66
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    const v4, 0x7f1303d7

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-direct {v1, v2}, La/ps80;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    new-instance v2, La/os80;

    .line 85
    .line 86
    invoke-static {v1, v3}, La/jwb;->G(Ljava/lang/Throwable;La/ctf0;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-direct {v2, v1}, La/os80;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object v0

    .line 99
    :pswitch_2
    move-object/from16 v1, p1

    .line 100
    .line 101
    check-cast v1, La/pb0;

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 107
    .line 108
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 109
    .line 110
    :cond_1
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 118
    .line 119
    move-object v5, v3

    .line 120
    check-cast v5, La/rs80;

    .line 121
    .line 122
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    iget-object v4, v1, La/pb0;->a:La/ql5;

    .line 126
    .line 127
    const/16 v24, 0x0

    .line 128
    .line 129
    const v25, 0x7efffff

    .line 130
    .line 131
    .line 132
    const/4 v6, 0x0

    .line 133
    const/4 v7, 0x0

    .line 134
    const/4 v8, 0x0

    .line 135
    const/4 v9, 0x0

    .line 136
    const/4 v10, 0x0

    .line 137
    const/4 v11, 0x0

    .line 138
    const/4 v12, 0x0

    .line 139
    const/4 v13, 0x0

    .line 140
    const/4 v14, 0x0

    .line 141
    const/4 v15, 0x0

    .line 142
    const/16 v16, 0x0

    .line 143
    .line 144
    const/16 v17, 0x0

    .line 145
    .line 146
    const/16 v18, 0x0

    .line 147
    .line 148
    const/16 v20, 0x0

    .line 149
    .line 150
    const/16 v21, 0x0

    .line 151
    .line 152
    const/16 v22, 0x0

    .line 153
    .line 154
    const/16 v23, 0x0

    .line 155
    .line 156
    move-object/from16 v19, v4

    .line 157
    .line 158
    invoke-static/range {v5 .. v25}, La/rs80;->a(La/rs80;ZZZZZZZLjava/lang/String;Ljava/lang/String;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Ljava/util/List;Ljava/util/Set;La/pr80;La/ql5;La/wr80;Ljava/util/List;Ljava/util/List;ZLkotlin/Pair;I)La/rs80;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-eqz v3, :cond_1

    .line 167
    .line 168
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    return-object v0

    .line 171
    :pswitch_3
    move-object/from16 v1, p1

    .line 172
    .line 173
    check-cast v1, Ljava/lang/Throwable;

    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    iget-object v0, v0, La/jt80;->H:La/duj;

    .line 179
    .line 180
    new-instance v2, La/zc70;

    .line 181
    .line 182
    const/16 v3, 0x18

    .line 183
    .line 184
    invoke-direct {v2, v3}, La/zc70;-><init>(B)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 188
    .line 189
    .line 190
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_4
    move-object/from16 v1, p1

    .line 194
    .line 195
    check-cast v1, Ljava/lang/Throwable;

    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 201
    .line 202
    .line 203
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 204
    .line 205
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 206
    .line 207
    :cond_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 215
    .line 216
    move-object v4, v2

    .line 217
    check-cast v4, La/rs80;

    .line 218
    .line 219
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    const/16 v23, 0x0

    .line 223
    .line 224
    const v24, 0x7f7ffff

    .line 225
    .line 226
    .line 227
    const/4 v5, 0x0

    .line 228
    const/4 v6, 0x0

    .line 229
    const/4 v7, 0x0

    .line 230
    const/4 v8, 0x0

    .line 231
    const/4 v9, 0x0

    .line 232
    const/4 v10, 0x0

    .line 233
    const/4 v11, 0x0

    .line 234
    const/4 v12, 0x0

    .line 235
    const/4 v13, 0x0

    .line 236
    const/4 v14, 0x0

    .line 237
    const/4 v15, 0x0

    .line 238
    const/16 v16, 0x0

    .line 239
    .line 240
    sget-object v17, La/nr80;->a:La/nr80;

    .line 241
    .line 242
    const/16 v18, 0x0

    .line 243
    .line 244
    const/16 v19, 0x0

    .line 245
    .line 246
    const/16 v20, 0x0

    .line 247
    .line 248
    const/16 v21, 0x0

    .line 249
    .line 250
    const/16 v22, 0x0

    .line 251
    .line 252
    invoke-static/range {v4 .. v24}, La/rs80;->a(La/rs80;ZZZZZZZLjava/lang/String;Ljava/lang/String;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Ljava/util/List;Ljava/util/Set;La/pr80;La/ql5;La/wr80;Ljava/util/List;Ljava/util/List;ZLkotlin/Pair;I)La/rs80;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    if-eqz v2, :cond_2

    .line 261
    .line 262
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 263
    .line 264
    return-object v0

    .line 265
    :pswitch_5
    move-object/from16 v1, p1

    .line 266
    .line 267
    check-cast v1, Ljava/lang/Throwable;

    .line 268
    .line 269
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    iget-object v0, v0, La/jt80;->H:La/duj;

    .line 273
    .line 274
    new-instance v2, La/zc70;

    .line 275
    .line 276
    const/16 v3, 0x16

    .line 277
    .line 278
    invoke-direct {v2, v3}, La/zc70;-><init>(B)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 282
    .line 283
    .line 284
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 285
    .line 286
    return-object v0

    .line 287
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
