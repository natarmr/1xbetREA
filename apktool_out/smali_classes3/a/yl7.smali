.class public final La/yl7;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/fm7;


# direct methods
.method public synthetic constructor <init>(La/fm7;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/yl7;->i:B

    iput-object p1, p0, La/yl7;->k:La/fm7;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/yl7;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/yl7;->k:La/fm7;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/yl7;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/yl7;-><init>(La/fm7;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/yl7;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/yl7;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/yl7;-><init>(La/fm7;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/yl7;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/yl7;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/yl7;-><init>(La/fm7;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/yl7;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/yl7;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/qkt0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/yl7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/yl7;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/yl7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/yl7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/yl7;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/yl7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/ql5;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/yl7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/yl7;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/yl7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/yl7;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/yl7;->k:La/fm7;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, La/yl7;->j:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, La/qkt0;

    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget v1, La/fm7;->p0:I

    .line 21
    .line 22
    iget-object v0, v0, La/qkt0;->a:Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-virtual {v3, v0, v1}, La/fm7;->Z(Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v0, v3, La/fm7;->m0:La/bby;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-interface {v0, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {v3}, La/fm7;->U()V

    .line 39
    .line 40
    .line 41
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_0
    iget-object v0, v0, La/yl7;->j:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, La/vne;

    .line 47
    .line 48
    sget-object v1, La/wne;->a:La/wne;

    .line 49
    .line 50
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, v3, La/fm7;->y:La/b8u;

    .line 54
    .line 55
    sget-object v4, La/bm5;->c:La/bm5;

    .line 56
    .line 57
    invoke-virtual {v1, v4}, La/b8u;->a(La/bm5;)La/i89;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    new-instance v4, La/yl7;

    .line 62
    .line 63
    const/4 v5, 0x0

    .line 64
    invoke-direct {v4, v3, v2, v5}, La/yl7;-><init>(La/fm7;La/yje;B)V

    .line 65
    .line 66
    .line 67
    new-instance v2, La/fnq;

    .line 68
    .line 69
    const/4 v3, 0x4

    .line 70
    invoke-direct {v2, v1, v4, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 71
    .line 72
    .line 73
    invoke-static {v2, v0}, La/sac;->U(La/gmq;La/vne;)La/c4m0;

    .line 74
    .line 75
    .line 76
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object v0

    .line 79
    :pswitch_1
    iget-object v1, v3, La/i3t0;->i:La/ocj;

    .line 80
    .line 81
    iget-object v0, v0, La/yl7;->j:Ljava/lang/Object;

    .line 82
    .line 83
    move-object v10, v0

    .line 84
    check-cast v10, La/ql5;

    .line 85
    .line 86
    sget-object v0, La/wne;->a:La/wne;

    .line 87
    .line 88
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    iget-object v0, v10, La/ql5;->i:La/txs0;

    .line 92
    .line 93
    invoke-virtual {v0}, La/txs0;->a()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-nez v0, :cond_6

    .line 98
    .line 99
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, La/jk7;

    .line 104
    .line 105
    iget-object v0, v0, La/jk7;->f:La/ql5;

    .line 106
    .line 107
    if-eqz v0, :cond_4

    .line 108
    .line 109
    iget-wide v4, v10, La/ql5;->a:J

    .line 110
    .line 111
    iget-wide v6, v0, La/ql5;->a:J

    .line 112
    .line 113
    cmp-long v0, v4, v6

    .line 114
    .line 115
    if-nez v0, :cond_4

    .line 116
    .line 117
    iget-wide v4, v10, La/ql5;->b:D

    .line 118
    .line 119
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, La/jk7;

    .line 124
    .line 125
    iget-object v0, v0, La/jk7;->f:La/ql5;

    .line 126
    .line 127
    if-eqz v0, :cond_2

    .line 128
    .line 129
    iget-wide v2, v0, La/ql5;->b:D

    .line 130
    .line 131
    new-instance v0, Ljava/lang/Double;

    .line 132
    .line 133
    invoke-direct {v0, v2, v3}, Ljava/lang/Double;-><init>(D)V

    .line 134
    .line 135
    .line 136
    move-object v2, v0

    .line 137
    :cond_2
    invoke-static {v4, v5, v2}, Lkotlin/jvm/internal/Intrinsics;->a(DLjava/lang/Double;)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-nez v0, :cond_6

    .line 142
    .line 143
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 144
    .line 145
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    move-object v4, v1

    .line 153
    check-cast v4, La/jk7;

    .line 154
    .line 155
    const/16 v25, 0x0

    .line 156
    .line 157
    const v26, 0x1ffffdf

    .line 158
    .line 159
    .line 160
    const/4 v5, 0x0

    .line 161
    const/4 v6, 0x0

    .line 162
    const-wide/16 v7, 0x0

    .line 163
    .line 164
    const/4 v9, 0x0

    .line 165
    const/4 v11, 0x0

    .line 166
    const/4 v12, 0x0

    .line 167
    const/4 v13, 0x0

    .line 168
    const/4 v14, 0x0

    .line 169
    const/4 v15, 0x0

    .line 170
    const/16 v16, 0x0

    .line 171
    .line 172
    const/16 v17, 0x0

    .line 173
    .line 174
    const/16 v18, 0x0

    .line 175
    .line 176
    const/16 v19, 0x0

    .line 177
    .line 178
    const/16 v20, 0x0

    .line 179
    .line 180
    const/16 v21, 0x0

    .line 181
    .line 182
    const/16 v22, 0x0

    .line 183
    .line 184
    const/16 v23, 0x0

    .line 185
    .line 186
    const/16 v24, 0x0

    .line 187
    .line 188
    invoke-static/range {v4 .. v26}, La/jk7;->a(La/jk7;ZZJZLa/ql5;ZZLjava/util/List;Ljava/util/List;ZLjava/util/List;ZZLjava/util/List;Ljava/util/List;ZLjava/util/Map;ZLjava/util/HashMap;ZI)La/jk7;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-eqz v1, :cond_3

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_4
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 200
    .line 201
    :cond_5
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    move-object v4, v1

    .line 209
    check-cast v4, La/jk7;

    .line 210
    .line 211
    const/16 v25, 0x0

    .line 212
    .line 213
    const v26, 0x1f7ffde

    .line 214
    .line 215
    .line 216
    const/4 v5, 0x1

    .line 217
    const/4 v6, 0x0

    .line 218
    const-wide/16 v7, 0x0

    .line 219
    .line 220
    const/4 v9, 0x0

    .line 221
    const/4 v11, 0x0

    .line 222
    const/4 v12, 0x0

    .line 223
    const/4 v13, 0x0

    .line 224
    const/4 v14, 0x0

    .line 225
    const/4 v15, 0x0

    .line 226
    const/16 v16, 0x0

    .line 227
    .line 228
    const/16 v17, 0x0

    .line 229
    .line 230
    const/16 v18, 0x0

    .line 231
    .line 232
    const/16 v19, 0x0

    .line 233
    .line 234
    const/16 v20, 0x0

    .line 235
    .line 236
    const/16 v21, 0x1

    .line 237
    .line 238
    const/16 v22, 0x0

    .line 239
    .line 240
    const/16 v23, 0x0

    .line 241
    .line 242
    const/16 v24, 0x0

    .line 243
    .line 244
    invoke-static/range {v4 .. v26}, La/jk7;->a(La/jk7;ZZJZLa/ql5;ZZLjava/util/List;Ljava/util/List;ZLjava/util/List;ZZLjava/util/List;Ljava/util/List;ZLjava/util/Map;ZLjava/util/HashMap;ZI)La/jk7;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    if-eqz v1, :cond_5

    .line 253
    .line 254
    iget-object v0, v3, La/fm7;->l0:La/bby;

    .line 255
    .line 256
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v3}, La/fm7;->O()V

    .line 260
    .line 261
    .line 262
    :cond_6
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 263
    .line 264
    return-object v0

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
