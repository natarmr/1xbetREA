.class public final La/wfe;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:I

.field public final synthetic l:I

.field public final synthetic m:La/xcz;


# direct methods
.method public constructor <init>(IILa/xcz;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/wfe;->i:B

    .line 3
    .line 4
    iput p1, p0, La/wfe;->k:I

    .line 5
    .line 6
    iput p2, p0, La/wfe;->l:I

    .line 7
    .line 8
    iput-object p3, p0, La/wfe;->m:La/xcz;

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(La/xcz;IILa/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/wfe;->i:B

    .line 15
    iput-object p1, p0, La/wfe;->m:La/xcz;

    iput p2, p0, La/wfe;->k:I

    iput p3, p0, La/wfe;->l:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/wfe;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/wfe;->m:La/xcz;

    .line 4
    .line 5
    iget v1, p0, La/wfe;->l:I

    .line 6
    .line 7
    iget p0, p0, La/wfe;->k:I

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance p1, La/wfe;

    .line 13
    .line 14
    invoke-direct {p1, p0, v1, v0, p2}, La/wfe;-><init>(IILa/xcz;La/yje;)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_0
    new-instance p1, La/wfe;

    .line 19
    .line 20
    invoke-direct {p1, v0, p0, v1, p2}, La/wfe;-><init>(La/xcz;IILa/yje;)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/wfe;->i:B

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
    invoke-virtual {p0, p1, p2}, La/wfe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/wfe;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/wfe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/wfe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/wfe;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/wfe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 11

    .line 1
    iget-byte v0, p0, La/wfe;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    iget v3, p0, La/wfe;->l:I

    .line 6
    .line 7
    iget v4, p0, La/wfe;->k:I

    .line 8
    .line 9
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    iget-object v6, p0, La/wfe;->m:La/xcz;

    .line 12
    .line 13
    const/4 v7, 0x1

    .line 14
    const/4 v8, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    sget-object v0, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-boolean v9, p0, La/wfe;->j:Z

    .line 21
    .line 22
    if-eqz v9, :cond_1

    .line 23
    .line 24
    if-ne v9, v7, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto/16 :goto_3

    .line 30
    .line 31
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto/16 :goto_5

    .line 35
    .line 36
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    if-le v4, v3, :cond_8

    .line 40
    .line 41
    if-ge v4, v2, :cond_2

    .line 42
    .line 43
    goto :goto_4

    .line 44
    :cond_2
    sub-int/2addr v3, v7

    .line 45
    invoke-virtual {v6}, La/xcz;->j()La/mcz;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object p1, p1, La/mcz;->l:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_4

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    move-object v4, v2

    .line 66
    check-cast v4, La/ncz;

    .line 67
    .line 68
    iget v4, v4, La/ncz;->a:I

    .line 69
    .line 70
    if-ne v4, v3, :cond_3

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    move-object v2, v8

    .line 74
    :goto_0
    check-cast v2, La/ncz;

    .line 75
    .line 76
    if-eqz v2, :cond_7

    .line 77
    .line 78
    invoke-virtual {v6}, La/xcz;->j()La/mcz;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iget p1, p1, La/mcz;->n:I

    .line 83
    .line 84
    invoke-virtual {v6}, La/xcz;->j()La/mcz;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    iget v3, v3, La/mcz;->m:I

    .line 89
    .line 90
    sub-int/2addr p1, v3

    .line 91
    iget v3, v2, La/ncz;->p:I

    .line 92
    .line 93
    iget v2, v2, La/ncz;->q:I

    .line 94
    .line 95
    add-int v4, v3, v2

    .line 96
    .line 97
    if-le v4, p1, :cond_5

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_5
    move p1, v4

    .line 101
    :goto_1
    if-gez v3, :cond_6

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_6
    move v1, v3

    .line 105
    :goto_2
    sub-int/2addr p1, v1

    .line 106
    int-to-float p1, p1

    .line 107
    int-to-float v1, v2

    .line 108
    div-float/2addr p1, v1

    .line 109
    const v2, 0x3e4ccccd    # 0.2f

    .line 110
    .line 111
    .line 112
    cmpl-float p1, p1, v2

    .line 113
    .line 114
    if-ltz p1, :cond_7

    .line 115
    .line 116
    const/high16 p1, 0x43480000    # 200.0f

    .line 117
    .line 118
    const/4 v2, 0x4

    .line 119
    const/high16 v3, 0x3f400000    # 0.75f

    .line 120
    .line 121
    invoke-static {v3, p1, v8, v2}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    iput-boolean v7, p0, La/wfe;->j:Z

    .line 126
    .line 127
    invoke-static {v6, v1, p1, p0}, La/bww;->x(La/bch0;FLa/j73;La/yje;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    if-ne p0, v0, :cond_7

    .line 132
    .line 133
    move-object v8, v0

    .line 134
    goto :goto_5

    .line 135
    :cond_7
    :goto_3
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_8
    :goto_4
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    :goto_5
    return-object v8

    .line 141
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 142
    .line 143
    iget-boolean v9, p0, La/wfe;->j:Z

    .line 144
    .line 145
    if-eqz v9, :cond_a

    .line 146
    .line 147
    if-ne v9, v7, :cond_9

    .line 148
    .line 149
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    goto :goto_8

    .line 153
    :cond_9
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    goto :goto_9

    .line 157
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v6}, La/xcz;->j()La/mcz;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    iget-object p1, p1, La/mcz;->l:Ljava/util/List;

    .line 165
    .line 166
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    :cond_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    if-eqz v5, :cond_c

    .line 175
    .line 176
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    move-object v9, v5

    .line 181
    check-cast v9, La/ncz;

    .line 182
    .line 183
    iget v9, v9, La/ncz;->a:I

    .line 184
    .line 185
    if-ne v9, v3, :cond_b

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_c
    move-object v5, v8

    .line 189
    :goto_6
    check-cast v5, La/ncz;

    .line 190
    .line 191
    if-eqz v5, :cond_d

    .line 192
    .line 193
    iget p1, v5, La/ncz;->p:I

    .line 194
    .line 195
    goto :goto_7

    .line 196
    :cond_d
    move p1, v1

    .line 197
    :goto_7
    invoke-virtual {v6}, La/xcz;->j()La/mcz;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    iget-object v5, v5, La/mcz;->l:Ljava/util/List;

    .line 202
    .line 203
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    :cond_e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v9

    .line 211
    if-eqz v9, :cond_f

    .line 212
    .line 213
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    move-object v10, v9

    .line 218
    check-cast v10, La/ncz;

    .line 219
    .line 220
    iget v10, v10, La/ncz;->a:I

    .line 221
    .line 222
    if-ne v10, v3, :cond_e

    .line 223
    .line 224
    move-object v8, v9

    .line 225
    :cond_f
    check-cast v8, La/ncz;

    .line 226
    .line 227
    if-eqz v8, :cond_10

    .line 228
    .line 229
    iget v1, v8, La/ncz;->q:I

    .line 230
    .line 231
    :cond_10
    sub-int/2addr v4, v1

    .line 232
    div-int/2addr v4, v2

    .line 233
    sub-int/2addr p1, v4

    .line 234
    int-to-float p1, p1

    .line 235
    iput-boolean v7, p0, La/wfe;->j:Z

    .line 236
    .line 237
    invoke-static {v6, p1, p0}, La/bww;->y(La/bch0;FLa/zje;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    if-ne p0, v0, :cond_11

    .line 242
    .line 243
    move-object v8, v0

    .line 244
    goto :goto_9

    .line 245
    :cond_11
    :goto_8
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 246
    .line 247
    :goto_9
    return-object v8

    .line 248
    nop

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
