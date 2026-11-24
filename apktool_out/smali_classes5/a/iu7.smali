.class public final La/iu7;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:F

.field public l:Ljava/lang/Object;

.field public m:La/l7m0;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(FLa/iuj;La/qah0;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/iu7;->i:B

    .line 19
    iput p1, p0, La/iu7;->k:F

    iput-object p2, p0, La/iu7;->n:Ljava/lang/Object;

    iput-object p3, p0, La/iu7;->o:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/t33;La/pz40;FLa/agk0;La/agk0;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/iu7;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/iu7;->l:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/iu7;->m:La/l7m0;

    .line 7
    .line 8
    iput p3, p0, La/iu7;->k:F

    .line 9
    .line 10
    iput-object p4, p0, La/iu7;->n:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, La/iu7;->o:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte p1, p0, La/iu7;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/iu7;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, La/iu7;->n:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/iu7;

    .line 11
    .line 12
    check-cast v1, La/iuj;

    .line 13
    .line 14
    check-cast v0, La/qah0;

    .line 15
    .line 16
    iget p0, p0, La/iu7;->k:F

    .line 17
    .line 18
    invoke-direct {p1, p0, v1, v0, p2}, La/iu7;-><init>(FLa/iuj;La/qah0;La/yje;)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_0
    new-instance v2, La/iu7;

    .line 23
    .line 24
    iget-object p1, p0, La/iu7;->l:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v3, p1

    .line 27
    check-cast v3, La/t33;

    .line 28
    .line 29
    iget-object p1, p0, La/iu7;->m:La/l7m0;

    .line 30
    .line 31
    move-object v4, p1

    .line 32
    check-cast v4, La/pz40;

    .line 33
    .line 34
    move-object v6, v1

    .line 35
    check-cast v6, La/agk0;

    .line 36
    .line 37
    move-object v7, v0

    .line 38
    check-cast v7, La/agk0;

    .line 39
    .line 40
    iget v5, p0, La/iu7;->k:F

    .line 41
    .line 42
    move-object v8, p2

    .line 43
    invoke-direct/range {v2 .. v8}, La/iu7;-><init>(La/t33;La/pz40;FLa/agk0;La/agk0;La/yje;)V

    .line 44
    .line 45
    .line 46
    return-object v2

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/iu7;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/iu7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/iu7;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/iu7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/iu7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/iu7;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/iu7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/iu7;->i:B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object v2, v5, La/iu7;->o:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v3, v5, La/iu7;->n:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const/high16 v6, 0x3f800000    # 1.0f

    .line 12
    .line 13
    const-string v7, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    const/4 v8, 0x1

    .line 16
    iget v9, v5, La/iu7;->k:F

    .line 17
    .line 18
    const/4 v10, 0x0

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    sget-object v0, La/wne;->a:La/wne;

    .line 23
    .line 24
    iget-boolean v11, v5, La/iu7;->j:Z

    .line 25
    .line 26
    if-eqz v11, :cond_1

    .line 27
    .line 28
    if-ne v11, v8, :cond_0

    .line 29
    .line 30
    iget-object v0, v5, La/iu7;->m:La/l7m0;

    .line 31
    .line 32
    check-cast v0, La/l73;

    .line 33
    .line 34
    iget-object v1, v5, La/iu7;->l:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, La/jie0;

    .line 37
    .line 38
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    cmpl-float v6, v7, v6

    .line 54
    .line 55
    if-lez v6, :cond_3

    .line 56
    .line 57
    new-instance v6, La/jie0;

    .line 58
    .line 59
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    iput v9, v6, La/jie0;->a:F

    .line 63
    .line 64
    new-instance v7, La/jie0;

    .line 65
    .line 66
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    const/16 v10, 0x1c

    .line 70
    .line 71
    invoke-static {v4, v9, v10}, La/x4d0;->d(FFI)La/l73;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    :try_start_1
    check-cast v3, La/iuj;

    .line 76
    .line 77
    iget-object v9, v3, La/iuj;->a:La/sjj;

    .line 78
    .line 79
    check-cast v2, La/qah0;

    .line 80
    .line 81
    new-instance v10, La/sw8;

    .line 82
    .line 83
    invoke-direct {v10, v7, v2, v6, v3}, La/sw8;-><init>(La/jie0;La/qah0;La/jie0;La/iuj;)V

    .line 84
    .line 85
    .line 86
    iput-object v6, v5, La/iu7;->l:Ljava/lang/Object;

    .line 87
    .line 88
    iput-object v4, v5, La/iu7;->m:La/l7m0;

    .line 89
    .line 90
    iput-boolean v8, v5, La/iu7;->j:Z

    .line 91
    .line 92
    invoke-static {v4, v9, v1, v10, v5}, La/hhm0;->o(La/l73;La/sjj;ZLkotlin/jvm/functions/Function1;La/zje;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 96
    if-ne v1, v0, :cond_2

    .line 97
    .line 98
    move-object v10, v0

    .line 99
    goto :goto_1

    .line 100
    :cond_2
    move-object v1, v6

    .line 101
    goto :goto_0

    .line 102
    :catch_0
    move-object v0, v4

    .line 103
    move-object v1, v6

    .line 104
    :catch_1
    invoke-virtual {v0}, La/l73;->b()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, Ljava/lang/Number;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    iput v0, v1, La/jie0;->a:F

    .line 115
    .line 116
    :goto_0
    iget v9, v1, La/jie0;->a:F

    .line 117
    .line 118
    :cond_3
    new-instance v10, Ljava/lang/Float;

    .line 119
    .line 120
    invoke-direct {v10, v9}, Ljava/lang/Float;-><init>(F)V

    .line 121
    .line 122
    .line 123
    :goto_1
    return-object v10

    .line 124
    :pswitch_0
    iget-object v0, v5, La/iu7;->m:La/l7m0;

    .line 125
    .line 126
    check-cast v0, La/pz40;

    .line 127
    .line 128
    sget-object v11, La/wne;->a:La/wne;

    .line 129
    .line 130
    iget-boolean v12, v5, La/iu7;->j:Z

    .line 131
    .line 132
    if-eqz v12, :cond_5

    .line 133
    .line 134
    if-ne v12, v8, :cond_4

    .line 135
    .line 136
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    goto/16 :goto_4

    .line 140
    .line 141
    :cond_4
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    goto/16 :goto_5

    .line 145
    .line 146
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    iget-object v7, v5, La/iu7;->l:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v7, La/t33;

    .line 152
    .line 153
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v12

    .line 157
    check-cast v12, La/dah0;

    .line 158
    .line 159
    if-nez v12, :cond_6

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_6
    instance-of v13, v12, La/x9h0;

    .line 163
    .line 164
    if-eqz v13, :cond_7

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_7
    instance-of v4, v12, La/aah0;

    .line 168
    .line 169
    if-eqz v4, :cond_c

    .line 170
    .line 171
    move v4, v6

    .line 172
    :goto_2
    new-instance v12, Ljava/lang/Float;

    .line 173
    .line 174
    invoke-direct {v12, v4}, Ljava/lang/Float;-><init>(F)V

    .line 175
    .line 176
    .line 177
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    check-cast v4, La/dah0;

    .line 182
    .line 183
    const/4 v13, 0x6

    .line 184
    const/high16 v14, 0x43960000    # 300.0f

    .line 185
    .line 186
    if-nez v4, :cond_8

    .line 187
    .line 188
    mul-float/2addr v14, v9

    .line 189
    float-to-int v4, v14

    .line 190
    invoke-static {v4, v1, v10, v13}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    goto :goto_3

    .line 195
    :cond_8
    instance-of v15, v4, La/x9h0;

    .line 196
    .line 197
    if-eqz v15, :cond_9

    .line 198
    .line 199
    mul-float/2addr v14, v9

    .line 200
    float-to-int v4, v14

    .line 201
    invoke-static {v4, v1, v10, v13}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    goto :goto_3

    .line 206
    :cond_9
    instance-of v4, v4, La/aah0;

    .line 207
    .line 208
    if-eqz v4, :cond_b

    .line 209
    .line 210
    sub-float/2addr v6, v9

    .line 211
    mul-float/2addr v6, v14

    .line 212
    float-to-int v4, v6

    .line 213
    invoke-static {v4, v1, v10, v13}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    :goto_3
    check-cast v3, La/agk0;

    .line 218
    .line 219
    check-cast v2, La/agk0;

    .line 220
    .line 221
    new-instance v4, La/hu7;

    .line 222
    .line 223
    invoke-direct {v4, v3, v0, v2}, La/hu7;-><init>(La/agk0;La/pz40;La/agk0;)V

    .line 224
    .line 225
    .line 226
    iput-boolean v8, v5, La/iu7;->j:Z

    .line 227
    .line 228
    const/4 v3, 0x0

    .line 229
    const/4 v6, 0x4

    .line 230
    move-object v2, v1

    .line 231
    move-object v0, v7

    .line 232
    move-object v1, v12

    .line 233
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    if-ne v0, v11, :cond_a

    .line 238
    .line 239
    move-object v10, v11

    .line 240
    goto :goto_5

    .line 241
    :cond_a
    :goto_4
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 245
    .line 246
    .line 247
    goto :goto_5

    .line 248
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 249
    .line 250
    .line 251
    :goto_5
    return-object v10

    .line 252
    nop

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
