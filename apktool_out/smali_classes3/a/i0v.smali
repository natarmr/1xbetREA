.class public final La/i0v;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:La/kmq;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:J

.field public final synthetic n:Z

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/yje;La/wdu;JZ)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/i0v;->i:B

    .line 3
    .line 4
    iput-object p2, p0, La/i0v;->o:Ljava/lang/Object;

    .line 5
    .line 6
    iput-wide p3, p0, La/i0v;->m:J

    .line 7
    .line 8
    iput-boolean p5, p0, La/i0v;->n:Z

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

.method public constructor <init>(La/yje;La/ywq0;ZJ)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/i0v;->i:B

    .line 15
    iput-object p2, p0, La/i0v;->o:Ljava/lang/Object;

    iput-boolean p3, p0, La/i0v;->n:Z

    iput-wide p4, p0, La/i0v;->m:J

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/i0v;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/i0v;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, La/kmq;

    .line 6
    .line 7
    move-object v3, p3

    .line 8
    check-cast v3, La/yje;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance v2, La/i0v;

    .line 14
    .line 15
    move-object v4, v1

    .line 16
    check-cast v4, La/wdu;

    .line 17
    .line 18
    iget-wide v5, p0, La/i0v;->m:J

    .line 19
    .line 20
    iget-boolean v7, p0, La/i0v;->n:Z

    .line 21
    .line 22
    invoke-direct/range {v2 .. v7}, La/i0v;-><init>(La/yje;La/wdu;JZ)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v2, La/i0v;->k:La/kmq;

    .line 26
    .line 27
    iput-object p2, v2, La/i0v;->l:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {v2, p0}, La/i0v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_0
    new-instance v2, La/i0v;

    .line 37
    .line 38
    move-object v4, v1

    .line 39
    check-cast v4, La/ywq0;

    .line 40
    .line 41
    iget-boolean v5, p0, La/i0v;->n:Z

    .line 42
    .line 43
    iget-wide v6, p0, La/i0v;->m:J

    .line 44
    .line 45
    invoke-direct/range {v2 .. v7}, La/i0v;-><init>(La/yje;La/ywq0;ZJ)V

    .line 46
    .line 47
    .line 48
    iput-object p1, v2, La/i0v;->k:La/kmq;

    .line 49
    .line 50
    iput-object p2, v2, La/i0v;->l:Ljava/lang/Object;

    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    invoke-virtual {v2, p0}, La/i0v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/i0v;->i:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    iget-boolean v3, v0, La/i0v;->n:Z

    .line 7
    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    iget-object v5, v0, La/i0v;->o:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x1

    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object v10, v5

    .line 19
    check-cast v10, La/wdu;

    .line 20
    .line 21
    iget-object v1, v0, La/i0v;->k:La/kmq;

    .line 22
    .line 23
    iget-object v5, v0, La/i0v;->l:Ljava/lang/Object;

    .line 24
    .line 25
    sget-object v15, La/wne;->a:La/wne;

    .line 26
    .line 27
    iget-boolean v9, v0, La/i0v;->j:Z

    .line 28
    .line 29
    if-eqz v9, :cond_1

    .line 30
    .line 31
    if-ne v9, v8, :cond_0

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    check-cast v5, Ljava/lang/Number;

    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v13

    .line 50
    iget-object v4, v10, La/wdu;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v4, La/kc60;

    .line 53
    .line 54
    invoke-virtual {v4}, La/kc60;->a()La/p7m0;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    new-instance v9, La/apu;

    .line 59
    .line 60
    const/4 v14, 0x0

    .line 61
    iget-wide v11, v0, La/i0v;->m:J

    .line 62
    .line 63
    invoke-direct/range {v9 .. v14}, La/apu;-><init>(La/wdu;JILa/yje;)V

    .line 64
    .line 65
    .line 66
    new-instance v5, La/vsg0;

    .line 67
    .line 68
    invoke-direct {v5, v9}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 69
    .line 70
    .line 71
    new-instance v9, La/o2v;

    .line 72
    .line 73
    invoke-direct {v9, v7, v10, v3}, La/o2v;-><init>(La/yje;La/wdu;Z)V

    .line 74
    .line 75
    .line 76
    iput-object v7, v0, La/i0v;->k:La/kmq;

    .line 77
    .line 78
    iput-object v7, v0, La/i0v;->l:Ljava/lang/Object;

    .line 79
    .line 80
    iput-boolean v8, v0, La/i0v;->j:Z

    .line 81
    .line 82
    invoke-static {v1}, La/f7k;->J(La/kmq;)V

    .line 83
    .line 84
    .line 85
    new-array v2, v2, [La/gmq;

    .line 86
    .line 87
    aput-object v4, v2, v6

    .line 88
    .line 89
    aput-object v5, v2, v8

    .line 90
    .line 91
    sget-object v3, La/pul;->j:La/pul;

    .line 92
    .line 93
    new-instance v4, La/kh1;

    .line 94
    .line 95
    const/16 v5, 0x9

    .line 96
    .line 97
    invoke-direct {v4, v9, v7, v5}, La/kh1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 98
    .line 99
    .line 100
    invoke-static {v0, v1, v4, v3, v2}, La/tdc;->G(La/yje;La/kmq;La/xdr;Lkotlin/jvm/functions/Function0;[La/gmq;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    sget-object v1, La/wne;->a:La/wne;

    .line 105
    .line 106
    if-ne v0, v1, :cond_2

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    :goto_0
    sget-object v1, La/wne;->a:La/wne;

    .line 112
    .line 113
    if-ne v0, v1, :cond_3

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    :goto_1
    if-ne v0, v15, :cond_4

    .line 119
    .line 120
    move-object v7, v15

    .line 121
    goto :goto_3

    .line 122
    :cond_4
    :goto_2
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    :goto_3
    return-object v7

    .line 125
    :pswitch_0
    move-object v10, v5

    .line 126
    check-cast v10, La/ywq0;

    .line 127
    .line 128
    sget-object v1, La/wne;->a:La/wne;

    .line 129
    .line 130
    iget-boolean v5, v0, La/i0v;->j:Z

    .line 131
    .line 132
    if-eqz v5, :cond_6

    .line 133
    .line 134
    if-ne v5, v8, :cond_5

    .line 135
    .line 136
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    goto/16 :goto_4

    .line 140
    .line 141
    :cond_5
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    goto/16 :goto_5

    .line 145
    .line 146
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    iget-object v4, v0, La/i0v;->k:La/kmq;

    .line 150
    .line 151
    iget-object v5, v0, La/i0v;->l:Ljava/lang/Object;

    .line 152
    .line 153
    move-object v11, v5

    .line 154
    check-cast v11, La/jvn;

    .line 155
    .line 156
    new-instance v5, La/hie0;

    .line 157
    .line 158
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 159
    .line 160
    .line 161
    iput-boolean v3, v5, La/hie0;->a:Z

    .line 162
    .line 163
    new-instance v9, La/n1;

    .line 164
    .line 165
    const/4 v14, 0x0

    .line 166
    const/16 v15, 0xf

    .line 167
    .line 168
    iget-wide v12, v0, La/i0v;->m:J

    .line 169
    .line 170
    invoke-direct/range {v9 .. v15}, La/n1;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLa/yje;B)V

    .line 171
    .line 172
    .line 173
    const-wide/16 v11, 0x1e

    .line 174
    .line 175
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 176
    .line 177
    invoke-static {v11, v12, v3, v9}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    new-instance v9, La/qqu;

    .line 182
    .line 183
    const/4 v11, 0x7

    .line 184
    invoke-direct {v9, v3, v5, v11}, La/qqu;-><init>(La/vsg0;La/hie0;B)V

    .line 185
    .line 186
    .line 187
    new-instance v3, La/h0v;

    .line 188
    .line 189
    invoke-direct {v3, v10, v7, v6}, La/h0v;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 190
    .line 191
    .line 192
    new-instance v11, La/a1g;

    .line 193
    .line 194
    const/16 v12, 0x14

    .line 195
    .line 196
    invoke-direct {v11, v9, v3, v12}, La/a1g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 197
    .line 198
    .line 199
    new-instance v12, La/lqu;

    .line 200
    .line 201
    const/16 v3, 0xa

    .line 202
    .line 203
    invoke-direct {v12, v5, v3}, La/lqu;-><init>(La/hie0;B)V

    .line 204
    .line 205
    .line 206
    new-instance v15, La/m91;

    .line 207
    .line 208
    invoke-direct {v15, v10, v7, v3}, La/m91;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 209
    .line 210
    .line 211
    const/16 v17, 0x0

    .line 212
    .line 213
    const/16 v18, 0x38

    .line 214
    .line 215
    const-wide/16 v13, 0x1e

    .line 216
    .line 217
    const/16 v16, 0x0

    .line 218
    .line 219
    invoke-static/range {v11 .. v18}, La/uvw;->P(La/gmq;Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function1;La/xdr;Lkotlin/jvm/functions/Function1;I)La/a1g;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    new-instance v5, La/i89;

    .line 224
    .line 225
    const/16 v9, 0x16

    .line 226
    .line 227
    invoke-direct {v5, v3, v9}, La/i89;-><init>(La/gmq;B)V

    .line 228
    .line 229
    .line 230
    iget-object v3, v10, La/ywq0;->a:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v3, La/w5z;

    .line 233
    .line 234
    sget-object v10, La/y9s;->a:La/y9s;

    .line 235
    .line 236
    invoke-virtual {v3, v10}, La/w5z;->r(La/y9s;)La/gmq;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    new-instance v10, La/i89;

    .line 241
    .line 242
    invoke-direct {v10, v3, v9}, La/i89;-><init>(La/gmq;B)V

    .line 243
    .line 244
    .line 245
    new-array v2, v2, [La/gmq;

    .line 246
    .line 247
    aput-object v5, v2, v6

    .line 248
    .line 249
    aput-object v10, v2, v8

    .line 250
    .line 251
    invoke-static {v2}, La/aoq;->b([La/gmq;)La/ltb;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    iput-object v7, v0, La/i0v;->k:La/kmq;

    .line 256
    .line 257
    iput-object v7, v0, La/i0v;->l:Ljava/lang/Object;

    .line 258
    .line 259
    iput-boolean v8, v0, La/i0v;->j:Z

    .line 260
    .line 261
    invoke-static {v4, v2, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    if-ne v0, v1, :cond_7

    .line 266
    .line 267
    move-object v7, v1

    .line 268
    goto :goto_5

    .line 269
    :cond_7
    :goto_4
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 270
    .line 271
    :goto_5
    return-object v7

    .line 272
    nop

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
