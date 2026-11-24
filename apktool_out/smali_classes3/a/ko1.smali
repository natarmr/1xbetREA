.class public final synthetic La/ko1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dp1;


# direct methods
.method public synthetic constructor <init>(La/dp1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ko1;->a:B

    iput-object p1, p0, La/ko1;->b:La/dp1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ko1;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/ko1;->b:La/dp1;

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
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 18
    .line 19
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 29
    .line 30
    move-object v4, v2

    .line 31
    check-cast v4, La/bo1;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const-wide/16 v16, 0x0

    .line 37
    .line 38
    const v18, 0xffffd

    .line 39
    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    sget-object v6, La/l8h0;->a:La/l8h0;

    .line 43
    .line 44
    const/4 v7, 0x0

    .line 45
    const/4 v8, 0x0

    .line 46
    const/4 v9, 0x0

    .line 47
    const/4 v10, 0x0

    .line 48
    const/4 v11, 0x0

    .line 49
    const/4 v12, 0x0

    .line 50
    const/4 v13, 0x0

    .line 51
    const/4 v14, 0x0

    .line 52
    const/4 v15, 0x0

    .line 53
    invoke-static/range {v4 .. v18}, La/bo1;->a(La/bo1;Ljava/lang/String;La/h9h0;Ljava/lang/String;Ljava/util/List;ZLjava/util/LinkedHashMap;ZZLjava/util/List;La/ql5;ZJI)La/bo1;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_0

    .line 62
    .line 63
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_0
    move-object/from16 v1, p1

    .line 67
    .line 68
    check-cast v1, Ljava/lang/Throwable;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 74
    .line 75
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 76
    .line 77
    :cond_1
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 85
    .line 86
    move-object v4, v2

    .line 87
    check-cast v4, La/bo1;

    .line 88
    .line 89
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    const-wide/16 v16, 0x0

    .line 93
    .line 94
    const v18, 0xffffd

    .line 95
    .line 96
    .line 97
    const/4 v5, 0x0

    .line 98
    sget-object v6, La/l8h0;->a:La/l8h0;

    .line 99
    .line 100
    const/4 v7, 0x0

    .line 101
    const/4 v8, 0x0

    .line 102
    const/4 v9, 0x0

    .line 103
    const/4 v10, 0x0

    .line 104
    const/4 v11, 0x0

    .line 105
    const/4 v12, 0x0

    .line 106
    const/4 v13, 0x0

    .line 107
    const/4 v14, 0x0

    .line 108
    const/4 v15, 0x0

    .line 109
    invoke-static/range {v4 .. v18}, La/bo1;->a(La/bo1;Ljava/lang/String;La/h9h0;Ljava/lang/String;Ljava/util/List;ZLjava/util/LinkedHashMap;ZZLjava/util/List;La/ql5;ZJI)La/bo1;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_1

    .line 118
    .line 119
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object v0

    .line 122
    :pswitch_1
    move-object/from16 v1, p1

    .line 123
    .line 124
    check-cast v1, La/pb0;

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 130
    .line 131
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 132
    .line 133
    :cond_2
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 141
    .line 142
    move-object v5, v3

    .line 143
    check-cast v5, La/bo1;

    .line 144
    .line 145
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iget-object v15, v1, La/pb0;->a:La/ql5;

    .line 149
    .line 150
    const-wide/16 v17, 0x0

    .line 151
    .line 152
    const v19, 0xdffff

    .line 153
    .line 154
    .line 155
    const/4 v6, 0x0

    .line 156
    const/4 v7, 0x0

    .line 157
    const/4 v8, 0x0

    .line 158
    const/4 v9, 0x0

    .line 159
    const/4 v10, 0x0

    .line 160
    const/4 v11, 0x0

    .line 161
    const/4 v12, 0x0

    .line 162
    const/4 v13, 0x0

    .line 163
    const/4 v14, 0x0

    .line 164
    const/16 v16, 0x0

    .line 165
    .line 166
    invoke-static/range {v5 .. v19}, La/bo1;->a(La/bo1;Ljava/lang/String;La/h9h0;Ljava/lang/String;Ljava/util/List;ZLjava/util/LinkedHashMap;ZZLjava/util/List;La/ql5;ZJI)La/bo1;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-eqz v3, :cond_2

    .line 175
    .line 176
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    return-object v0

    .line 179
    :pswitch_2
    move-object/from16 v1, p1

    .line 180
    .line 181
    check-cast v1, Ljava/lang/Throwable;

    .line 182
    .line 183
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    instance-of v2, v1, La/jfp;

    .line 187
    .line 188
    iget-object v3, v0, La/dp1;->t:La/ctf0;

    .line 189
    .line 190
    if-eqz v2, :cond_3

    .line 191
    .line 192
    new-instance v1, La/zn1;

    .line 193
    .line 194
    const/4 v2, 0x0

    .line 195
    new-array v4, v2, [Ljava/lang/Object;

    .line 196
    .line 197
    iget-object v5, v3, La/ctf0;->b:La/lsm0;

    .line 198
    .line 199
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    const v6, 0x7f1307bb

    .line 204
    .line 205
    .line 206
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    new-array v5, v2, [Ljava/lang/Object;

    .line 211
    .line 212
    iget-object v6, v3, La/ctf0;->b:La/lsm0;

    .line 213
    .line 214
    invoke-static {v5, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    const v7, 0x7f1303d7

    .line 219
    .line 220
    .line 221
    invoke-virtual {v6, v7, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    new-array v6, v2, [Ljava/lang/Object;

    .line 226
    .line 227
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 228
    .line 229
    invoke-static {v6, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    const v6, 0x7f130e5d

    .line 234
    .line 235
    .line 236
    invoke-virtual {v3, v6, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    invoke-direct {v1, v4, v5, v2}, La/zn1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    goto :goto_0

    .line 247
    :cond_3
    new-instance v2, La/yn1;

    .line 248
    .line 249
    invoke-static {v1, v3}, La/jwb;->G(Ljava/lang/Throwable;La/ctf0;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-direct {v2, v1}, La/yn1;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    return-object v0

    .line 262
    :pswitch_3
    move-object/from16 v1, p1

    .line 263
    .line 264
    check-cast v1, Ljava/lang/Throwable;

    .line 265
    .line 266
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    iget-object v0, v0, La/dp1;->x:La/duj;

    .line 270
    .line 271
    new-instance v2, La/xg1;

    .line 272
    .line 273
    const/4 v3, 0x5

    .line 274
    invoke-direct {v2, v3}, La/xg1;-><init>(B)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 278
    .line 279
    .line 280
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 281
    .line 282
    return-object v0

    .line 283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
