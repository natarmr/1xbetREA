.class public final La/a6v;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public synthetic k:La/kmq;

.field public synthetic l:Ljava/lang/Object;

.field public m:I

.field public n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/yje;La/b6v;Ljava/util/ArrayList;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/a6v;->i:B

    .line 3
    .line 4
    iput-object p2, p0, La/a6v;->o:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p3, p0, La/a6v;->p:Ljava/lang/Object;

    .line 7
    .line 8
    iput p4, p0, La/a6v;->m:I

    .line 9
    .line 10
    const/4 p2, 0x3

    .line 11
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(La/yje;La/qi80;La/gp00;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/a6v;->i:B

    .line 15
    iput-object p2, p0, La/a6v;->n:Ljava/lang/Object;

    iput-object p3, p0, La/a6v;->o:Ljava/lang/Object;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/a6v;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/a6v;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, La/kmq;

    .line 6
    .line 7
    check-cast p3, La/yje;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, La/a6v;

    .line 13
    .line 14
    iget-object p0, p0, La/a6v;->n:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/qi80;

    .line 17
    .line 18
    check-cast v1, La/gp00;

    .line 19
    .line 20
    invoke-direct {v0, p3, p0, v1}, La/a6v;-><init>(La/yje;La/qi80;La/gp00;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/a6v;->k:La/kmq;

    .line 24
    .line 25
    iput-object p2, v0, La/a6v;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {v0, p0}, La/a6v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_0
    new-instance v0, La/a6v;

    .line 35
    .line 36
    check-cast v1, La/b6v;

    .line 37
    .line 38
    iget-object v2, p0, La/a6v;->p:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Ljava/util/ArrayList;

    .line 41
    .line 42
    iget p0, p0, La/a6v;->m:I

    .line 43
    .line 44
    invoke-direct {v0, p3, v1, v2, p0}, La/a6v;-><init>(La/yje;La/b6v;Ljava/util/ArrayList;I)V

    .line 45
    .line 46
    .line 47
    iput-object p1, v0, La/a6v;->k:La/kmq;

    .line 48
    .line 49
    iput-object p2, v0, La/a6v;->l:Ljava/lang/Object;

    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    invoke-virtual {v0, p0}, La/a6v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/a6v;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/a6v;->o:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/a6v;->n:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, La/qi80;

    .line 16
    .line 17
    check-cast v2, La/gp00;

    .line 18
    .line 19
    sget-object v6, La/wne;->a:La/wne;

    .line 20
    .line 21
    iget-byte v7, p0, La/a6v;->j:B

    .line 22
    .line 23
    if-eqz v7, :cond_2

    .line 24
    .line 25
    if-eq v7, v4, :cond_1

    .line 26
    .line 27
    if-ne v7, v3, :cond_0

    .line 28
    .line 29
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_5

    .line 33
    .line 34
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_6

    .line 38
    .line 39
    :cond_1
    iget v1, p0, La/a6v;->m:I

    .line 40
    .line 41
    iget-object v7, p0, La/a6v;->p:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v7, La/k050;

    .line 44
    .line 45
    iget-object v8, p0, La/a6v;->l:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v8, La/ri80;

    .line 48
    .line 49
    iget-object v9, p0, La/a6v;->k:La/kmq;

    .line 50
    .line 51
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v9, p0, La/a6v;->k:La/kmq;

    .line 59
    .line 60
    iget-object p1, p0, La/a6v;->l:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, Ljava/lang/Number;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    iget-object v8, v0, La/qi80;->j:La/ri80;

    .line 69
    .line 70
    iget-object v7, v8, La/ri80;->a:La/k050;

    .line 71
    .line 72
    iput-object v9, p0, La/a6v;->k:La/kmq;

    .line 73
    .line 74
    iput-object v8, p0, La/a6v;->l:Ljava/lang/Object;

    .line 75
    .line 76
    iput-object v7, p0, La/a6v;->p:Ljava/lang/Object;

    .line 77
    .line 78
    iput v1, p0, La/a6v;->m:I

    .line 79
    .line 80
    iput-byte v4, p0, La/a6v;->j:B

    .line 81
    .line 82
    invoke-virtual {v7, p0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-ne p1, v6, :cond_3

    .line 87
    .line 88
    goto/16 :goto_4

    .line 89
    .line 90
    :cond_3
    :goto_0
    :try_start_0
    iget-object p1, v8, La/ri80;->b:La/ti80;

    .line 91
    .line 92
    iget-object p1, p1, La/ti80;->i:La/cyu;

    .line 93
    .line 94
    invoke-virtual {p1, v2}, La/cyu;->h(La/gp00;)La/mva;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    sget-object v10, La/bp00;->b:La/bp00;

    .line 99
    .line 100
    invoke-virtual {v8, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    const/4 v10, 0x0

    .line 105
    if-eqz v8, :cond_4

    .line 106
    .line 107
    new-array p1, v10, [La/rjt;

    .line 108
    .line 109
    new-instance v0, La/eu4;

    .line 110
    .line 111
    const/16 v1, 0xb

    .line 112
    .line 113
    invoke-direct {v0, p1, v1}, La/eu4;-><init>(Ljava/lang/Object;B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    .line 115
    .line 116
    invoke-interface {v7, v5}, La/i050;->c(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :catchall_0
    move-exception p0

    .line 121
    goto :goto_7

    .line 122
    :cond_4
    :try_start_1
    invoke-virtual {p1, v2}, La/cyu;->h(La/gp00;)La/mva;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    instance-of v8, v8, La/zo00;

    .line 127
    .line 128
    if-nez v8, :cond_5

    .line 129
    .line 130
    sget-object v8, La/bp00;->c:La/bp00;

    .line 131
    .line 132
    invoke-virtual {p1, v2, v8}, La/cyu;->N(La/gp00;La/mva;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 133
    .line 134
    .line 135
    :cond_5
    invoke-interface {v7, v5}, La/i050;->c(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    iget-object p1, v0, La/qi80;->g:La/jru;

    .line 139
    .line 140
    iget-object p1, p1, La/jru;->b:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p1, La/dgu;

    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eq v0, v4, :cond_7

    .line 149
    .line 150
    if-ne v0, v3, :cond_6

    .line 151
    .line 152
    iget-object p1, p1, La/dgu;->b:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast p1, La/yxv;

    .line 155
    .line 156
    iget-object p1, p1, La/yxv;->b:La/qoj0;

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_6
    const-string p1, "invalid load type for hints"

    .line 160
    .line 161
    invoke-static {p1}, La/jf4;->o(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    move-object p1, v5

    .line 165
    goto :goto_1

    .line 166
    :cond_7
    iget-object p1, p1, La/dgu;->a:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast p1, La/yxv;

    .line 169
    .line 170
    iget-object p1, p1, La/yxv;->b:La/qoj0;

    .line 171
    .line 172
    :goto_1
    if-nez v1, :cond_8

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_8
    move v10, v4

    .line 176
    :goto_2
    invoke-static {p1, v10}, La/dtb;->z(La/gmq;I)La/lnq;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    new-instance v0, La/vuu;

    .line 181
    .line 182
    invoke-direct {v0, p1, v1, v4}, La/vuu;-><init>(La/gmq;IB)V

    .line 183
    .line 184
    .line 185
    :goto_3
    iput-object v5, p0, La/a6v;->k:La/kmq;

    .line 186
    .line 187
    iput-object v5, p0, La/a6v;->l:Ljava/lang/Object;

    .line 188
    .line 189
    iput-object v5, p0, La/a6v;->p:Ljava/lang/Object;

    .line 190
    .line 191
    iput-byte v3, p0, La/a6v;->j:B

    .line 192
    .line 193
    invoke-static {v9, v0, p0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    if-ne p0, v6, :cond_9

    .line 198
    .line 199
    :goto_4
    move-object v5, v6

    .line 200
    goto :goto_6

    .line 201
    :cond_9
    :goto_5
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    :goto_6
    return-object v5

    .line 204
    :goto_7
    invoke-interface {v7, v5}, La/i050;->c(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    throw p0

    .line 208
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 209
    .line 210
    iget-byte v6, p0, La/a6v;->j:B

    .line 211
    .line 212
    if-eqz v6, :cond_c

    .line 213
    .line 214
    if-eq v6, v4, :cond_b

    .line 215
    .line 216
    if-ne v6, v3, :cond_a

    .line 217
    .line 218
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    goto :goto_a

    .line 222
    :cond_a
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    goto :goto_b

    .line 226
    :cond_b
    iget-object v1, p0, La/a6v;->n:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v1, La/kmq;

    .line 229
    .line 230
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    goto :goto_8

    .line 234
    :cond_c
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    iget-object v1, p0, La/a6v;->k:La/kmq;

    .line 238
    .line 239
    iget-object p1, p0, La/a6v;->l:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast p1, Ljava/lang/Boolean;

    .line 242
    .line 243
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    check-cast v2, La/b6v;

    .line 247
    .line 248
    iget-object p1, p0, La/a6v;->p:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast p1, Ljava/util/ArrayList;

    .line 251
    .line 252
    iget v6, p0, La/a6v;->m:I

    .line 253
    .line 254
    iput-object v5, p0, La/a6v;->k:La/kmq;

    .line 255
    .line 256
    iput-object v5, p0, La/a6v;->l:Ljava/lang/Object;

    .line 257
    .line 258
    iput-object v1, p0, La/a6v;->n:Ljava/lang/Object;

    .line 259
    .line 260
    iput-byte v4, p0, La/a6v;->j:B

    .line 261
    .line 262
    invoke-virtual {v2, p1, v6, p0}, La/b6v;->c(Ljava/util/ArrayList;ILa/zje;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    if-ne p1, v0, :cond_d

    .line 267
    .line 268
    goto :goto_9

    .line 269
    :cond_d
    :goto_8
    check-cast p1, La/gmq;

    .line 270
    .line 271
    iput-object v5, p0, La/a6v;->k:La/kmq;

    .line 272
    .line 273
    iput-object v5, p0, La/a6v;->l:Ljava/lang/Object;

    .line 274
    .line 275
    iput-object v5, p0, La/a6v;->n:Ljava/lang/Object;

    .line 276
    .line 277
    iput-byte v3, p0, La/a6v;->j:B

    .line 278
    .line 279
    invoke-static {v1, p1, p0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    if-ne p0, v0, :cond_e

    .line 284
    .line 285
    :goto_9
    move-object v5, v0

    .line 286
    goto :goto_b

    .line 287
    :cond_e
    :goto_a
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 288
    .line 289
    :goto_b
    return-object v5

    .line 290
    nop

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
