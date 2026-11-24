.class public final La/ws90;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/xcz;

.field public final synthetic l:I

.field public final synthetic m:F

.field public final synthetic n:La/j73;

.field public synthetic o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/xcz;IFLa/j73;La/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/ws90;->i:B

    .line 19
    iput-object p1, p0, La/ws90;->k:La/xcz;

    iput p2, p0, La/ws90;->l:I

    iput p3, p0, La/ws90;->m:F

    iput-object p4, p0, La/ws90;->n:La/j73;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/xcz;La/pz40;IFLa/j73;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/ws90;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/ws90;->k:La/xcz;

    .line 5
    .line 6
    iput-object p2, p0, La/ws90;->o:Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, La/ws90;->l:I

    .line 9
    .line 10
    iput p4, p0, La/ws90;->m:F

    .line 11
    .line 12
    iput-object p5, p0, La/ws90;->n:La/j73;

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
    .locals 8

    .line 1
    iget-byte v0, p0, La/ws90;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, La/ws90;

    .line 7
    .line 8
    iget-object p1, p0, La/ws90;->o:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v3, p1

    .line 11
    check-cast v3, La/pz40;

    .line 12
    .line 13
    iget v5, p0, La/ws90;->m:F

    .line 14
    .line 15
    iget-object v6, p0, La/ws90;->n:La/j73;

    .line 16
    .line 17
    iget-object v2, p0, La/ws90;->k:La/xcz;

    .line 18
    .line 19
    iget v4, p0, La/ws90;->l:I

    .line 20
    .line 21
    move-object v7, p2

    .line 22
    invoke-direct/range {v1 .. v7}, La/ws90;-><init>(La/xcz;La/pz40;IFLa/j73;La/yje;)V

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :pswitch_0
    move-object v7, p2

    .line 27
    new-instance v2, La/ws90;

    .line 28
    .line 29
    iget v5, p0, La/ws90;->m:F

    .line 30
    .line 31
    iget-object v6, p0, La/ws90;->n:La/j73;

    .line 32
    .line 33
    iget-object v3, p0, La/ws90;->k:La/xcz;

    .line 34
    .line 35
    iget v4, p0, La/ws90;->l:I

    .line 36
    .line 37
    invoke-direct/range {v2 .. v7}, La/ws90;-><init>(La/xcz;IFLa/j73;La/yje;)V

    .line 38
    .line 39
    .line 40
    iput-object p1, v2, La/ws90;->o:Ljava/lang/Object;

    .line 41
    .line 42
    return-object v2

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ws90;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ws90;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ws90;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ws90;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/qah0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/ws90;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/ws90;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/ws90;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 14

    .line 1
    iget-byte v0, p0, La/ws90;->i:B

    .line 2
    .line 3
    iget-object v6, p0, La/ws90;->k:La/xcz;

    .line 4
    .line 5
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/ws90;->o:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v7, v0

    .line 16
    check-cast v7, La/pz40;

    .line 17
    .line 18
    sget-object v0, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-byte v8, p0, La/ws90;->j:B

    .line 21
    .line 22
    if-eqz v8, :cond_2

    .line 23
    .line 24
    if-eq v8, v2, :cond_1

    .line 25
    .line 26
    if-ne v8, v3, :cond_0

    .line 27
    .line 28
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    goto :goto_3

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    goto :goto_5

    .line 34
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto :goto_4

    .line 38
    :cond_1
    :try_start_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sget v1, La/ys90;->a:F

    .line 46
    .line 47
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-interface {v7, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :try_start_2
    iput-byte v2, p0, La/ws90;->j:B

    .line 53
    .line 54
    sget-object v1, La/c050;->a:La/c050;

    .line 55
    .line 56
    new-instance v2, La/p23;

    .line 57
    .line 58
    const/16 v8, 0xb

    .line 59
    .line 60
    invoke-direct {v2, v3, v5, v8}, La/p23;-><init>(ILa/yje;B)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v6, v1, v2, p0}, La/xcz;->b(La/c050;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    if-ne v1, v0, :cond_3

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    :goto_0
    if-ne v1, v0, :cond_4

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    :goto_1
    iget-object v9, p0, La/ws90;->k:La/xcz;

    .line 76
    .line 77
    sget-object v1, La/c050;->c:La/c050;

    .line 78
    .line 79
    new-instance v8, La/ws90;

    .line 80
    .line 81
    iget v10, p0, La/ws90;->l:I

    .line 82
    .line 83
    iget v11, p0, La/ws90;->m:F

    .line 84
    .line 85
    iget-object v12, p0, La/ws90;->n:La/j73;

    .line 86
    .line 87
    const/4 v13, 0x0

    .line 88
    invoke-direct/range {v8 .. v13}, La/ws90;-><init>(La/xcz;IFLa/j73;La/yje;)V

    .line 89
    .line 90
    .line 91
    iput-byte v3, p0, La/ws90;->j:B

    .line 92
    .line 93
    invoke-virtual {v9, v1, v8, p0}, La/xcz;->b(La/c050;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 97
    if-ne v1, v0, :cond_5

    .line 98
    .line 99
    :goto_2
    move-object v5, v0

    .line 100
    goto :goto_4

    .line 101
    :cond_5
    :goto_3
    sget v0, La/ys90;->a:F

    .line 102
    .line 103
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-interface {v7, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    :goto_4
    return-object v5

    .line 111
    :goto_5
    sget v1, La/ys90;->a:F

    .line 112
    .line 113
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-interface {v7, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    throw v0

    .line 119
    :pswitch_0
    iget-object v0, p0, La/ws90;->o:Ljava/lang/Object;

    .line 120
    .line 121
    move-object v7, v0

    .line 122
    check-cast v7, La/qah0;

    .line 123
    .line 124
    sget-object v8, La/wne;->a:La/wne;

    .line 125
    .line 126
    iget-byte v0, p0, La/ws90;->j:B

    .line 127
    .line 128
    const/high16 v9, 0x3f000000    # 0.5f

    .line 129
    .line 130
    iget v10, p0, La/ws90;->m:F

    .line 131
    .line 132
    iget v11, p0, La/ws90;->l:I

    .line 133
    .line 134
    if-eqz v0, :cond_8

    .line 135
    .line 136
    if-eq v0, v2, :cond_7

    .line 137
    .line 138
    if-ne v0, v3, :cond_6

    .line 139
    .line 140
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    goto :goto_8

    .line 144
    :cond_6
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    goto :goto_9

    .line 148
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    goto :goto_6

    .line 152
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    new-instance v0, La/er90;

    .line 156
    .line 157
    const/4 v1, 0x3

    .line 158
    invoke-direct {v0, v1}, La/er90;-><init>(B)V

    .line 159
    .line 160
    .line 161
    iput-object v7, p0, La/ws90;->o:Ljava/lang/Object;

    .line 162
    .line 163
    iput-byte v2, p0, La/ws90;->j:B

    .line 164
    .line 165
    invoke-interface {p0}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-static {v1}, La/s0x;->P(Lkotlin/coroutines/CoroutineContext;)La/qq40;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-interface {v1, v0, p0}, La/qq40;->e(Lkotlin/jvm/functions/Function1;La/yje;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    if-ne v0, v8, :cond_9

    .line 178
    .line 179
    goto :goto_7

    .line 180
    :cond_9
    :goto_6
    invoke-static {v6, v11, v10}, La/ys90;->f(La/xcz;IF)F

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    cmpl-float v0, v0, v9

    .line 189
    .line 190
    if-lez v0, :cond_a

    .line 191
    .line 192
    new-instance v0, La/jie0;

    .line 193
    .line 194
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 195
    .line 196
    .line 197
    new-instance v2, La/vs90;

    .line 198
    .line 199
    const/4 v5, 0x0

    .line 200
    invoke-direct {v2, v0, v7, v5}, La/vs90;-><init>(La/jie0;La/qah0;B)V

    .line 201
    .line 202
    .line 203
    iput-object v7, p0, La/ws90;->o:Ljava/lang/Object;

    .line 204
    .line 205
    iput-byte v3, p0, La/ws90;->j:B

    .line 206
    .line 207
    const/4 v0, 0x0

    .line 208
    move-object v3, v2

    .line 209
    iget-object v2, p0, La/ws90;->n:La/j73;

    .line 210
    .line 211
    const/4 v5, 0x4

    .line 212
    move-object v4, p0

    .line 213
    invoke-static/range {v0 .. v5}, La/hhm0;->n(FFLa/j73;Lkotlin/jvm/functions/Function2;La/bnn0;I)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    if-ne v0, v8, :cond_a

    .line 218
    .line 219
    :goto_7
    move-object v5, v8

    .line 220
    goto :goto_9

    .line 221
    :cond_a
    :goto_8
    invoke-static {v6, v11, v10}, La/ys90;->f(La/xcz;IF)F

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    cmpl-float v1, v1, v9

    .line 230
    .line 231
    if-lez v1, :cond_b

    .line 232
    .line 233
    invoke-interface {v7, v0}, La/qah0;->a(F)F

    .line 234
    .line 235
    .line 236
    :cond_b
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 237
    .line 238
    :goto_9
    return-object v5

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
