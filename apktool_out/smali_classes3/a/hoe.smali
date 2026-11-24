.class public final La/hoe;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public k:I

.field public final synthetic l:Z

.field public m:I

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(La/p850;ILjava/lang/Integer;ZLa/mlr;ILa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/hoe;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/hoe;->n:Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, La/hoe;->k:I

    .line 7
    .line 8
    iput-object p3, p0, La/hoe;->o:Ljava/lang/Object;

    .line 9
    .line 10
    iput-boolean p4, p0, La/hoe;->l:Z

    .line 11
    .line 12
    iput-object p5, p0, La/hoe;->p:Ljava/io/Serializable;

    .line 13
    .line 14
    iput p6, p0, La/hoe;->m:I

    .line 15
    .line 16
    const/4 p1, 0x2

    .line 17
    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function2;ZLjava/lang/String;La/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/hoe;->i:B

    .line 21
    iput-object p1, p0, La/hoe;->o:Ljava/lang/Object;

    iput-boolean p2, p0, La/hoe;->l:Z

    iput-object p3, p0, La/hoe;->p:Ljava/io/Serializable;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 11

    .line 1
    iget-byte v0, p0, La/hoe;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/hoe;->p:Ljava/io/Serializable;

    .line 4
    .line 5
    iget-object v2, p0, La/hoe;->o:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v3, La/hoe;

    .line 11
    .line 12
    iget-object p1, p0, La/hoe;->n:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v4, p1

    .line 15
    check-cast v4, La/p850;

    .line 16
    .line 17
    iget v5, p0, La/hoe;->k:I

    .line 18
    .line 19
    move-object v6, v2

    .line 20
    check-cast v6, Ljava/lang/Integer;

    .line 21
    .line 22
    move-object v8, v1

    .line 23
    check-cast v8, La/mlr;

    .line 24
    .line 25
    iget v9, p0, La/hoe;->m:I

    .line 26
    .line 27
    iget-boolean v7, p0, La/hoe;->l:Z

    .line 28
    .line 29
    move-object v10, p2

    .line 30
    invoke-direct/range {v3 .. v10}, La/hoe;-><init>(La/p850;ILjava/lang/Integer;ZLa/mlr;ILa/yje;)V

    .line 31
    .line 32
    .line 33
    return-object v3

    .line 34
    :pswitch_0
    move-object v10, p2

    .line 35
    new-instance p2, La/hoe;

    .line 36
    .line 37
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 38
    .line 39
    iget-boolean p0, p0, La/hoe;->l:Z

    .line 40
    .line 41
    check-cast v1, Ljava/lang/String;

    .line 42
    .line 43
    invoke-direct {p2, v2, p0, v1, v10}, La/hoe;-><init>(Lkotlin/jvm/functions/Function2;ZLjava/lang/String;La/yje;)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p2, La/hoe;->n:Ljava/lang/Object;

    .line 47
    .line 48
    return-object p2

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/hoe;->i:B

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
    invoke-virtual {p0, p1, p2}, La/hoe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/hoe;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/hoe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/hoe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/hoe;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/hoe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    move-object/from16 v4, p0

    .line 2
    .line 3
    iget-byte v0, v4, La/hoe;->i:B

    .line 4
    .line 5
    iget-boolean v1, v4, La/hoe;->l:Z

    .line 6
    .line 7
    iget-object v2, v4, La/hoe;->o:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x2

    .line 14
    iget-object v8, v4, La/hoe;->p:Ljava/io/Serializable;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast v8, La/mlr;

    .line 20
    .line 21
    iget-object v0, v4, La/hoe;->n:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, La/p850;

    .line 24
    .line 25
    sget-object v9, La/wne;->a:La/wne;

    .line 26
    .line 27
    iget-byte v10, v4, La/hoe;->j:B

    .line 28
    .line 29
    if-eqz v10, :cond_2

    .line 30
    .line 31
    if-eq v10, v6, :cond_1

    .line 32
    .line 33
    if-ne v10, v7, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget v3, v4, La/hoe;->k:I

    .line 48
    .line 49
    check-cast v2, Ljava/lang/Integer;

    .line 50
    .line 51
    sget v5, La/p850;->p0:I

    .line 52
    .line 53
    invoke-virtual {v0, v3, v2}, La/p850;->c0(ILjava/lang/Integer;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    if-nez v1, :cond_3

    .line 58
    .line 59
    iget-object v0, v0, La/p850;->O:La/xex;

    .line 60
    .line 61
    iget v1, v4, La/hoe;->m:I

    .line 62
    .line 63
    iput-byte v6, v4, La/hoe;->j:B

    .line 64
    .line 65
    invoke-virtual {v0, v8, v1, v5, v4}, La/xex;->I(La/mlr;ILjava/lang/String;La/bnn0;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-ne v0, v9, :cond_4

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    iget-object v0, v0, La/p850;->P:La/zn00;

    .line 73
    .line 74
    iget-wide v2, v8, La/mlr;->a:J

    .line 75
    .line 76
    iget v1, v4, La/hoe;->m:I

    .line 77
    .line 78
    iput-byte v7, v4, La/hoe;->j:B

    .line 79
    .line 80
    invoke-virtual/range {v0 .. v5}, La/zn00;->N0(IJLa/bnn0;Ljava/lang/String;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    if-ne v0, v9, :cond_4

    .line 85
    .line 86
    :goto_1
    move-object v3, v9

    .line 87
    goto :goto_3

    .line 88
    :cond_4
    :goto_2
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    :goto_3
    return-object v3

    .line 91
    :pswitch_0
    iget-object v0, v4, La/hoe;->n:Ljava/lang/Object;

    .line 92
    .line 93
    move-object v9, v0

    .line 94
    check-cast v9, La/vne;

    .line 95
    .line 96
    sget-object v10, La/wne;->a:La/wne;

    .line 97
    .line 98
    iget-byte v0, v4, La/hoe;->j:B

    .line 99
    .line 100
    const/4 v11, 0x0

    .line 101
    if-eqz v0, :cond_7

    .line 102
    .line 103
    if-eq v0, v6, :cond_6

    .line 104
    .line 105
    if-ne v0, v7, :cond_5

    .line 106
    .line 107
    iget v0, v4, La/hoe;->m:I

    .line 108
    .line 109
    iget v3, v4, La/hoe;->k:I

    .line 110
    .line 111
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto/16 :goto_8

    .line 115
    .line 116
    :cond_5
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    goto/16 :goto_9

    .line 120
    .line 121
    :cond_6
    iget v0, v4, La/hoe;->m:I

    .line 122
    .line 123
    iget v3, v4, La/hoe;->k:I

    .line 124
    .line 125
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 126
    .line 127
    .line 128
    goto/16 :goto_8

    .line 129
    .line 130
    :catch_0
    move-exception v0

    .line 131
    goto :goto_4

    .line 132
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    move v3, v11

    .line 136
    :cond_8
    :try_start_1
    move-object v0, v2

    .line 137
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 138
    .line 139
    iput-object v9, v4, La/hoe;->n:Ljava/lang/Object;

    .line 140
    .line 141
    iput v3, v4, La/hoe;->k:I

    .line 142
    .line 143
    iput v11, v4, La/hoe;->m:I

    .line 144
    .line 145
    iput-byte v6, v4, La/hoe;->j:B

    .line 146
    .line 147
    invoke-interface {v0, v9, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 151
    if-ne v0, v10, :cond_9

    .line 152
    .line 153
    goto :goto_7

    .line 154
    :cond_9
    move v0, v11

    .line 155
    goto :goto_8

    .line 156
    :goto_4
    invoke-static {v0}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    xor-int/2addr v5, v6

    .line 161
    instance-of v12, v0, La/zhi0;

    .line 162
    .line 163
    if-eqz v12, :cond_a

    .line 164
    .line 165
    move-object v5, v0

    .line 166
    check-cast v5, La/zhi0;

    .line 167
    .line 168
    iget-boolean v5, v5, La/zhi0;->e:Z

    .line 169
    .line 170
    :cond_a
    add-int/lit8 v12, v3, 0x1

    .line 171
    .line 172
    const/4 v13, 0x3

    .line 173
    if-ge v3, v13, :cond_b

    .line 174
    .line 175
    move v3, v6

    .line 176
    goto :goto_5

    .line 177
    :cond_b
    move v3, v11

    .line 178
    :goto_5
    if-nez v5, :cond_c

    .line 179
    .line 180
    if-eqz v1, :cond_c

    .line 181
    .line 182
    if-eqz v3, :cond_c

    .line 183
    .line 184
    move v3, v6

    .line 185
    goto :goto_6

    .line 186
    :cond_c
    move v3, v11

    .line 187
    :goto_6
    move-object v5, v8

    .line 188
    check-cast v5, Ljava/lang/String;

    .line 189
    .line 190
    const-string v13, " // "

    .line 191
    .line 192
    const-string v14, " retry // delay 3 sec"

    .line 193
    .line 194
    const-string v15, "ALARM1 from "

    .line 195
    .line 196
    invoke-static {v12, v15, v5, v13, v14}, La/dw9;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    sget-object v13, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 201
    .line 202
    invoke-virtual {v13, v5}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    if-eqz v3, :cond_f

    .line 206
    .line 207
    sget-object v0, La/wen;->b:La/uen;

    .line 208
    .line 209
    sget-object v0, La/bfn;->e:La/bfn;

    .line 210
    .line 211
    const-wide/16 v13, 0x3

    .line 212
    .line 213
    invoke-static {v13, v14, v0}, La/ibc;->w0(JLa/bfn;)J

    .line 214
    .line 215
    .line 216
    move-result-wide v13

    .line 217
    iput-object v9, v4, La/hoe;->n:Ljava/lang/Object;

    .line 218
    .line 219
    iput v12, v4, La/hoe;->k:I

    .line 220
    .line 221
    iput v3, v4, La/hoe;->m:I

    .line 222
    .line 223
    iput-byte v7, v4, La/hoe;->j:B

    .line 224
    .line 225
    invoke-static {v13, v14, v4}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    if-ne v0, v10, :cond_d

    .line 230
    .line 231
    :goto_7
    move-object v3, v10

    .line 232
    goto :goto_9

    .line 233
    :cond_d
    move v0, v3

    .line 234
    move v3, v12

    .line 235
    :goto_8
    if-eqz v0, :cond_e

    .line 236
    .line 237
    invoke-static {v9}, La/d5c;->R(La/vne;)Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-nez v0, :cond_8

    .line 242
    .line 243
    :cond_e
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 244
    .line 245
    :goto_9
    return-object v3

    .line 246
    :cond_f
    throw v0

    .line 247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
