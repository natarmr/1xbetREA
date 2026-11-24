.class public final La/mi2;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/qi2;


# direct methods
.method public synthetic constructor <init>(La/qi2;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/mi2;->i:B

    iput-object p1, p0, La/mi2;->l:La/qi2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/mi2;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/mi2;->l:La/qi2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/mi2;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/mi2;-><init>(La/qi2;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/mi2;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/mi2;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/mi2;-><init>(La/qi2;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/mi2;->k:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/mi2;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/mi2;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/mi2;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/mi2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/kmq;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/mi2;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/mi2;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/mi2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-byte v0, v1, La/mi2;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    iget-object v3, v1, La/mi2;->l:La/qi2;

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, v1, La/mi2;->k:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, La/vne;

    .line 18
    .line 19
    sget-object v7, La/wne;->a:La/wne;

    .line 20
    .line 21
    iget-byte v0, v1, La/mi2;->j:B

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    if-eq v0, v6, :cond_1

    .line 26
    .line 27
    if-ne v0, v4, :cond_0

    .line 28
    .line 29
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_5

    .line 33
    .line 34
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_6

    .line 38
    .line 39
    :cond_1
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 49
    .line 50
    iget-object v0, v3, La/qi2;->u:La/yzn0;

    .line 51
    .line 52
    iput-object v5, v1, La/mi2;->k:Ljava/lang/Object;

    .line 53
    .line 54
    iput-byte v6, v1, La/mi2;->j:B

    .line 55
    .line 56
    invoke-virtual {v0, v1}, La/yzn0;->l(La/yje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-ne v0, v7, :cond_3

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_3
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    sget-object v2, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :goto_1
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 69
    .line 70
    new-instance v2, La/g0g0;

    .line 71
    .line 72
    invoke-direct {v2, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    move-object v0, v2

    .line 76
    :goto_2
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    const/4 v8, 0x4

    .line 81
    const/4 v9, 0x0

    .line 82
    if-nez v2, :cond_4

    .line 83
    .line 84
    check-cast v0, Lkotlin/Unit;

    .line 85
    .line 86
    sget v0, La/qi2;->D:I

    .line 87
    .line 88
    iget-object v0, v3, La/qi2;->v:La/n4u;

    .line 89
    .line 90
    invoke-virtual {v0}, La/n4u;->b()La/a1t;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    new-instance v2, La/c00;

    .line 95
    .line 96
    const/4 v10, 0x3

    .line 97
    invoke-direct {v2, v0, v3, v10}, La/c00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 98
    .line 99
    .line 100
    new-instance v0, La/eh2;

    .line 101
    .line 102
    invoke-direct {v0, v3, v5, v6}, La/eh2;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 103
    .line 104
    .line 105
    invoke-static {v2, v0}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    goto :goto_3

    .line 110
    :cond_4
    sget v0, La/qi2;->D:I

    .line 111
    .line 112
    new-instance v0, La/mi2;

    .line 113
    .line 114
    invoke-direct {v0, v3, v5, v9}, La/mi2;-><init>(La/qi2;La/yje;B)V

    .line 115
    .line 116
    .line 117
    new-instance v10, La/vsg0;

    .line 118
    .line 119
    invoke-direct {v10, v0}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 120
    .line 121
    .line 122
    new-instance v0, La/c00;

    .line 123
    .line 124
    invoke-direct {v0, v10, v2, v8}, La/c00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 125
    .line 126
    .line 127
    :goto_3
    new-instance v2, La/wa;

    .line 128
    .line 129
    const/4 v10, 0x6

    .line 130
    invoke-direct {v2, v3, v5, v10}, La/wa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 131
    .line 132
    .line 133
    new-instance v10, La/fnq;

    .line 134
    .line 135
    invoke-direct {v10, v0, v2, v8}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 136
    .line 137
    .line 138
    new-instance v0, La/oi2;

    .line 139
    .line 140
    invoke-direct {v0, v3, v5, v9}, La/oi2;-><init>(La/qi2;La/yje;B)V

    .line 141
    .line 142
    .line 143
    new-instance v2, La/dnq;

    .line 144
    .line 145
    invoke-direct {v2, v10, v0, v6}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 146
    .line 147
    .line 148
    new-instance v0, La/mn1;

    .line 149
    .line 150
    const/16 v6, 0xd

    .line 151
    .line 152
    invoke-direct {v0, v3, v6}, La/mn1;-><init>(Ljava/lang/Object;B)V

    .line 153
    .line 154
    .line 155
    iput-object v5, v1, La/mi2;->k:Ljava/lang/Object;

    .line 156
    .line 157
    iput-byte v4, v1, La/mi2;->j:B

    .line 158
    .line 159
    invoke-virtual {v2, v0, v1}, La/dnq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    if-ne v0, v7, :cond_5

    .line 164
    .line 165
    :goto_4
    move-object v5, v7

    .line 166
    goto :goto_6

    .line 167
    :cond_5
    :goto_5
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    :goto_6
    return-object v5

    .line 170
    :pswitch_0
    iget-object v0, v1, La/mi2;->k:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, La/kmq;

    .line 173
    .line 174
    sget-object v7, La/wne;->a:La/wne;

    .line 175
    .line 176
    iget-byte v8, v1, La/mi2;->j:B

    .line 177
    .line 178
    if-eqz v8, :cond_8

    .line 179
    .line 180
    if-eq v8, v6, :cond_7

    .line 181
    .line 182
    if-ne v8, v4, :cond_6

    .line 183
    .line 184
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    goto :goto_9

    .line 188
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    goto :goto_a

    .line 192
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    move-object/from16 v2, p1

    .line 196
    .line 197
    goto :goto_7

    .line 198
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    check-cast v2, La/ei2;

    .line 206
    .line 207
    iget-object v2, v2, La/ei2;->g:Ljava/util/List;

    .line 208
    .line 209
    if-nez v2, :cond_a

    .line 210
    .line 211
    iget-object v2, v3, La/qi2;->s:La/abu;

    .line 212
    .line 213
    iput-object v0, v1, La/mi2;->k:Ljava/lang/Object;

    .line 214
    .line 215
    iput-byte v6, v1, La/mi2;->j:B

    .line 216
    .line 217
    invoke-virtual {v2, v1}, La/abu;->w(La/zje;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    if-ne v2, v7, :cond_9

    .line 222
    .line 223
    goto :goto_8

    .line 224
    :cond_9
    :goto_7
    check-cast v2, Ljava/util/List;

    .line 225
    .line 226
    :cond_a
    move-object v14, v2

    .line 227
    sget v2, La/qi2;->D:I

    .line 228
    .line 229
    iget-object v2, v3, La/i3t0;->i:La/ocj;

    .line 230
    .line 231
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 232
    .line 233
    :cond_b
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    move-object v8, v3

    .line 241
    check-cast v8, La/ei2;

    .line 242
    .line 243
    const/4 v13, 0x0

    .line 244
    const/16 v15, 0x3f

    .line 245
    .line 246
    const/4 v9, 0x0

    .line 247
    const/4 v10, 0x0

    .line 248
    const/4 v11, 0x0

    .line 249
    const/4 v12, 0x0

    .line 250
    invoke-static/range {v8 .. v15}, La/ei2;->a(La/ei2;La/wh2;ZLa/fqp0;ZZLjava/util/List;I)La/ei2;

    .line 251
    .line 252
    .line 253
    move-result-object v6

    .line 254
    invoke-virtual {v2, v3, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    if-eqz v3, :cond_b

    .line 259
    .line 260
    iput-object v5, v1, La/mi2;->k:Ljava/lang/Object;

    .line 261
    .line 262
    iput-byte v4, v1, La/mi2;->j:B

    .line 263
    .line 264
    invoke-interface {v0, v14, v1}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    if-ne v0, v7, :cond_c

    .line 269
    .line 270
    :goto_8
    move-object v5, v7

    .line 271
    goto :goto_a

    .line 272
    :cond_c
    :goto_9
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 273
    .line 274
    :goto_a
    return-object v5

    .line 275
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
