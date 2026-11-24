.class public final La/rxb;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/yxb;


# direct methods
.method public synthetic constructor <init>(La/yxb;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/rxb;->i:B

    iput-object p1, p0, La/rxb;->k:La/yxb;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/rxb;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/rxb;->k:La/yxb;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/rxb;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/rxb;-><init>(La/yxb;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/rxb;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/rxb;-><init>(La/yxb;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/rxb;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/rxb;-><init>(La/yxb;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/rxb;->i:B

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
    invoke-virtual {p0, p1, p2}, La/rxb;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/rxb;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/rxb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/rxb;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/rxb;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/rxb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/rxb;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/rxb;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/rxb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/rxb;->i:B

    .line 2
    .line 3
    const-wide/16 v1, 0x28

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object v4, p0, La/rxb;->k:La/yxb;

    .line 7
    .line 8
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    const/4 v7, 0x2

    .line 12
    const/4 v8, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-byte v9, p0, La/rxb;->j:B

    .line 19
    .line 20
    if-eqz v9, :cond_2

    .line 21
    .line 22
    if-eq v9, v6, :cond_1

    .line 23
    .line 24
    if-ne v9, v7, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_3

    .line 34
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    new-instance p1, La/vxb;

    .line 42
    .line 43
    invoke-direct {p1, v4, v8, v3}, La/vxb;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 44
    .line 45
    .line 46
    iput-byte v6, p0, La/rxb;->j:B

    .line 47
    .line 48
    invoke-static {p0, p1}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p1, v0, :cond_3

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    :goto_0
    iput-byte v7, p0, La/rxb;->j:B

    .line 56
    .line 57
    invoke-static {v1, v2, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-ne p0, v0, :cond_4

    .line 62
    .line 63
    :goto_1
    move-object v8, v0

    .line 64
    goto :goto_3

    .line 65
    :cond_4
    :goto_2
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    :goto_3
    return-object v8

    .line 68
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 69
    .line 70
    iget-byte v9, p0, La/rxb;->j:B

    .line 71
    .line 72
    const/4 v10, 0x4

    .line 73
    const/4 v11, 0x3

    .line 74
    if-eqz v9, :cond_9

    .line 75
    .line 76
    if-eq v9, v6, :cond_8

    .line 77
    .line 78
    if-eq v9, v7, :cond_7

    .line 79
    .line 80
    if-eq v9, v11, :cond_6

    .line 81
    .line 82
    if-ne v9, v10, :cond_5

    .line 83
    .line 84
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_8

    .line 88
    .line 89
    :cond_5
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    goto/16 :goto_9

    .line 93
    .line 94
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    goto :goto_6

    .line 98
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    goto :goto_5

    .line 102
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    iget-object p1, v4, La/yxb;->c:La/vpc;

    .line 110
    .line 111
    iput-byte v6, p0, La/rxb;->j:B

    .line 112
    .line 113
    new-instance v5, La/o3s;

    .line 114
    .line 115
    const/16 v9, 0x1a

    .line 116
    .line 117
    invoke-direct {v5, p1, v8, v9}, La/o3s;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 118
    .line 119
    .line 120
    invoke-static {p0, v5}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    if-ne p1, v0, :cond_a

    .line 125
    .line 126
    goto :goto_7

    .line 127
    :cond_a
    :goto_4
    iput-boolean v3, v4, La/yxb;->A:Z

    .line 128
    .line 129
    iput-boolean v3, v4, La/yxb;->B:Z

    .line 130
    .line 131
    iput-boolean v6, v4, La/yxb;->C:Z

    .line 132
    .line 133
    iput-object v8, v4, La/yxb;->s:Lkotlin/jvm/functions/Function0;

    .line 134
    .line 135
    iput-byte v7, p0, La/rxb;->j:B

    .line 136
    .line 137
    invoke-static {v1, v2, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    if-ne p1, v0, :cond_b

    .line 142
    .line 143
    goto :goto_7

    .line 144
    :cond_b
    :goto_5
    iget-object v9, v4, La/yxb;->o:La/p7m0;

    .line 145
    .line 146
    :cond_c
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    move-object v3, p1

    .line 151
    check-cast v3, Ljava/util/List;

    .line 152
    .line 153
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->N0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    sget-object v5, La/ixb;->a:La/ixb;

    .line 158
    .line 159
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    invoke-virtual {v9, p1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-eqz p1, :cond_c

    .line 167
    .line 168
    iput-byte v11, p0, La/rxb;->j:B

    .line 169
    .line 170
    invoke-static {v1, v2, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    if-ne p1, v0, :cond_d

    .line 175
    .line 176
    goto :goto_7

    .line 177
    :cond_d
    :goto_6
    iget-object p1, v4, La/yxb;->t:La/w8e;

    .line 178
    .line 179
    if-eqz p1, :cond_e

    .line 180
    .line 181
    invoke-virtual {p1}, La/w8e;->invoke()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    :cond_e
    iput-byte v10, p0, La/rxb;->j:B

    .line 185
    .line 186
    const-wide/16 v1, 0x96

    .line 187
    .line 188
    invoke-static {v1, v2, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    if-ne p0, v0, :cond_f

    .line 193
    .line 194
    :goto_7
    move-object v8, v0

    .line 195
    goto :goto_9

    .line 196
    :cond_f
    :goto_8
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    :goto_9
    return-object v8

    .line 199
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 200
    .line 201
    iget-byte v9, p0, La/rxb;->j:B

    .line 202
    .line 203
    const/16 v10, 0x3c

    .line 204
    .line 205
    if-eqz v9, :cond_12

    .line 206
    .line 207
    if-eq v9, v6, :cond_11

    .line 208
    .line 209
    if-ne v9, v7, :cond_10

    .line 210
    .line 211
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    goto :goto_c

    .line 215
    :cond_10
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    goto :goto_d

    .line 219
    :cond_11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    goto :goto_a

    .line 223
    :cond_12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    iget-object p1, v4, La/yxb;->h:La/jcl;

    .line 227
    .line 228
    iput-byte v6, p0, La/rxb;->j:B

    .line 229
    .line 230
    invoke-virtual {p1, v10, p0, v3}, La/jcl;->b(ILa/zje;Z)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    if-ne p1, v0, :cond_13

    .line 235
    .line 236
    goto :goto_b

    .line 237
    :cond_13
    :goto_a
    check-cast p1, Ljava/util/List;

    .line 238
    .line 239
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 240
    .line 241
    .line 242
    move-result p1

    .line 243
    if-ge p1, v10, :cond_14

    .line 244
    .line 245
    iput-boolean v6, v4, La/yxb;->A:Z

    .line 246
    .line 247
    :cond_14
    iput-byte v7, p0, La/rxb;->j:B

    .line 248
    .line 249
    invoke-static {v1, v2, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    if-ne p0, v0, :cond_15

    .line 254
    .line 255
    :goto_b
    move-object v8, v0

    .line 256
    goto :goto_d

    .line 257
    :cond_15
    :goto_c
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    :goto_d
    return-object v8

    .line 260
    nop

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
