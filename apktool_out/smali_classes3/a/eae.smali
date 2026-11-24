.class public final La/eae;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:I

.field public k:Z

.field public final synthetic l:Z

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/fae;La/skp;IZLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/eae;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/eae;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/eae;->n:Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, La/eae;->j:I

    .line 9
    .line 10
    iput-boolean p4, p0, La/eae;->l:Z

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(La/rrd;ZILa/jvn;La/yje;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/eae;->i:B

    .line 17
    iput-object p1, p0, La/eae;->m:Ljava/lang/Object;

    iput-boolean p2, p0, La/eae;->l:Z

    iput p3, p0, La/eae;->j:I

    iput-object p4, p0, La/eae;->n:Ljava/lang/Object;

    invoke-direct {p0, v0, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/w5z;La/ouj0;ZILa/yje;)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, La/eae;->i:B

    .line 18
    iput-object p1, p0, La/eae;->m:Ljava/lang/Object;

    iput-object p2, p0, La/eae;->n:Ljava/lang/Object;

    iput-boolean p3, p0, La/eae;->l:Z

    iput p4, p0, La/eae;->j:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(ZLa/f7u;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/eae;->i:B

    .line 19
    iput-boolean p1, p0, La/eae;->l:Z

    iput-object p2, p0, La/eae;->n:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte v0, p0, La/eae;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/eae;->n:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, La/eae;

    .line 9
    .line 10
    iget-object p1, p0, La/eae;->m:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v3, p1

    .line 13
    check-cast v3, La/w5z;

    .line 14
    .line 15
    move-object v4, v1

    .line 16
    check-cast v4, La/ouj0;

    .line 17
    .line 18
    iget-boolean v5, p0, La/eae;->l:Z

    .line 19
    .line 20
    iget v6, p0, La/eae;->j:I

    .line 21
    .line 22
    move-object v7, p2

    .line 23
    invoke-direct/range {v2 .. v7}, La/eae;-><init>(La/w5z;La/ouj0;ZILa/yje;)V

    .line 24
    .line 25
    .line 26
    return-object v2

    .line 27
    :pswitch_0
    move-object v8, p2

    .line 28
    new-instance v3, La/eae;

    .line 29
    .line 30
    iget-object p1, p0, La/eae;->m:Ljava/lang/Object;

    .line 31
    .line 32
    move-object v4, p1

    .line 33
    check-cast v4, La/rrd;

    .line 34
    .line 35
    iget v6, p0, La/eae;->j:I

    .line 36
    .line 37
    move-object v7, v1

    .line 38
    check-cast v7, La/jvn;

    .line 39
    .line 40
    iget-boolean v5, p0, La/eae;->l:Z

    .line 41
    .line 42
    invoke-direct/range {v3 .. v8}, La/eae;-><init>(La/rrd;ZILa/jvn;La/yje;)V

    .line 43
    .line 44
    .line 45
    return-object v3

    .line 46
    :pswitch_1
    move-object v8, p2

    .line 47
    new-instance p2, La/eae;

    .line 48
    .line 49
    iget-boolean p0, p0, La/eae;->l:Z

    .line 50
    .line 51
    check-cast v1, La/f7u;

    .line 52
    .line 53
    invoke-direct {p2, p0, v1, v8}, La/eae;-><init>(ZLa/f7u;La/yje;)V

    .line 54
    .line 55
    .line 56
    iput-object p1, p2, La/eae;->m:Ljava/lang/Object;

    .line 57
    .line 58
    return-object p2

    .line 59
    :pswitch_2
    move-object v8, p2

    .line 60
    new-instance v3, La/eae;

    .line 61
    .line 62
    iget-object p1, p0, La/eae;->m:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v4, p1

    .line 65
    check-cast v4, La/fae;

    .line 66
    .line 67
    move-object v5, v1

    .line 68
    check-cast v5, La/skp;

    .line 69
    .line 70
    iget v6, p0, La/eae;->j:I

    .line 71
    .line 72
    iget-boolean v7, p0, La/eae;->l:Z

    .line 73
    .line 74
    invoke-direct/range {v3 .. v8}, La/eae;-><init>(La/fae;La/skp;IZLa/yje;)V

    .line 75
    .line 76
    .line 77
    return-object v3

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/eae;->i:B

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
    invoke-virtual {p0, p1, p2}, La/eae;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/eae;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/eae;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    check-cast p2, La/yje;

    .line 30
    .line 31
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1, p2}, La/eae;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/eae;

    .line 40
    .line 41
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, La/eae;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 49
    .line 50
    check-cast p2, La/yje;

    .line 51
    .line 52
    invoke-virtual {p0, p1, p2}, La/eae;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, La/eae;

    .line 57
    .line 58
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    invoke-virtual {p0, p1}, La/eae;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_2
    check-cast p1, La/vne;

    .line 66
    .line 67
    check-cast p2, La/yje;

    .line 68
    .line 69
    invoke-virtual {p0, p1, p2}, La/eae;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, La/eae;

    .line 74
    .line 75
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    invoke-virtual {p0, p1}, La/eae;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/eae;->i:B

    .line 2
    .line 3
    iget-boolean v1, p0, La/eae;->l:Z

    .line 4
    .line 5
    iget-object v2, p0, La/eae;->n:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, La/eae;->m:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, La/w5z;

    .line 17
    .line 18
    sget-object v1, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-boolean v6, p0, La/eae;->k:Z

    .line 21
    .line 22
    if-eqz v6, :cond_1

    .line 23
    .line 24
    if-ne v6, v4, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    move-object p1, v5

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 46
    .line 47
    .line 48
    move-result-wide v7

    .line 49
    move-object v5, v2

    .line 50
    check-cast v5, La/ouj0;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {v5, v7, v8}, La/w5z;->l(La/ouj0;J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    iget v13, p0, La/eae;->j:I

    .line 60
    .line 61
    iget-object p1, v0, La/w5z;->d:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, La/knf0;

    .line 64
    .line 65
    invoke-virtual {p1}, La/knf0;->a()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-virtual {p1}, La/knf0;->c()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    iget-boolean v12, v5, La/ouj0;->u:Z

    .line 74
    .line 75
    iget-boolean v11, p0, La/eae;->l:Z

    .line 76
    .line 77
    invoke-static/range {v5 .. v13}, La/lv00;->W(La/ouj0;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZI)La/zt6;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iget-object v2, v0, La/w5z;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, La/abu;

    .line 84
    .line 85
    iget-object v0, v0, La/w5z;->c:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, La/btt0;

    .line 88
    .line 89
    invoke-virtual {v0}, La/btt0;->a()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iput-boolean v4, p0, La/eae;->k:Z

    .line 94
    .line 95
    invoke-virtual {v2}, La/abu;->m()La/m520;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-interface {v2, v0, p1, p0}, La/m520;->a(Ljava/lang/String;La/zt6;La/yje;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-ne p1, v1, :cond_2

    .line 104
    .line 105
    move-object p1, v1

    .line 106
    :cond_2
    :goto_0
    return-object p1

    .line 107
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 108
    .line 109
    iget-boolean v1, p0, La/eae;->k:Z

    .line 110
    .line 111
    if-eqz v1, :cond_4

    .line 112
    .line 113
    if-ne v1, v4, :cond_3

    .line 114
    .line 115
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    move-object p1, v5

    .line 123
    goto :goto_1

    .line 124
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    iget-object p1, p0, La/eae;->m:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p1, La/rrd;

    .line 130
    .line 131
    iget-object p1, p1, La/rrd;->b:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p1, La/hru;

    .line 134
    .line 135
    iget v8, p0, La/eae;->j:I

    .line 136
    .line 137
    move-object v9, v2

    .line 138
    check-cast v9, La/jvn;

    .line 139
    .line 140
    sget-object v10, La/y9s;->b:La/y9s;

    .line 141
    .line 142
    iput-boolean v4, p0, La/eae;->k:Z

    .line 143
    .line 144
    iget-object p1, p1, La/hru;->a:Ljava/lang/Object;

    .line 145
    .line 146
    move-object v5, p1

    .line 147
    check-cast v5, La/w5z;

    .line 148
    .line 149
    const/4 v6, 0x0

    .line 150
    iget-boolean v7, p0, La/eae;->l:Z

    .line 151
    .line 152
    move-object v11, p0

    .line 153
    invoke-virtual/range {v5 .. v11}, La/w5z;->N(ZZILa/jvn;La/y9s;La/bnn0;)Ljava/io/Serializable;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    if-ne p1, v0, :cond_5

    .line 158
    .line 159
    move-object p1, v0

    .line 160
    :cond_5
    :goto_1
    return-object p1

    .line 161
    :pswitch_1
    move-object v11, p0

    .line 162
    check-cast v2, La/f7u;

    .line 163
    .line 164
    iget-object p0, v11, La/eae;->m:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast p0, Ljava/lang/Throwable;

    .line 167
    .line 168
    sget-object v0, La/wne;->a:La/wne;

    .line 169
    .line 170
    iget-boolean v6, v11, La/eae;->k:Z

    .line 171
    .line 172
    const/4 v7, 0x0

    .line 173
    if-eqz v6, :cond_7

    .line 174
    .line 175
    if-ne v6, v4, :cond_6

    .line 176
    .line 177
    iget p0, v11, La/eae;->j:I

    .line 178
    .line 179
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_6
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    goto :goto_7

    .line 187
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    instance-of p1, p0, La/zhi0;

    .line 191
    .line 192
    if-eqz p1, :cond_b

    .line 193
    .line 194
    check-cast p0, La/zhi0;

    .line 195
    .line 196
    iget-object p1, p0, La/zhi0;->c:La/kuw;

    .line 197
    .line 198
    sget-object v3, La/i2o;->D2:La/i2o;

    .line 199
    .line 200
    if-ne p1, v3, :cond_9

    .line 201
    .line 202
    iget-object p0, v2, La/f7u;->b:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast p0, La/gst0;

    .line 205
    .line 206
    if-eqz v1, :cond_8

    .line 207
    .line 208
    invoke-virtual {p0}, La/gst0;->j()V

    .line 209
    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_8
    invoke-virtual {p0}, La/gst0;->i()V

    .line 213
    .line 214
    .line 215
    :goto_2
    move p0, v4

    .line 216
    goto :goto_4

    .line 217
    :cond_9
    iget-boolean p0, p0, La/zhi0;->e:Z

    .line 218
    .line 219
    if-nez p0, :cond_a

    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_a
    :goto_3
    move p0, v7

    .line 223
    goto :goto_4

    .line 224
    :cond_b
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    instance-of p1, p0, Ljava/net/SocketTimeoutException;

    .line 228
    .line 229
    if-nez p1, :cond_a

    .line 230
    .line 231
    instance-of p0, p0, Ljava/net/UnknownHostException;

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :goto_4
    if-eqz p0, :cond_c

    .line 235
    .line 236
    iput-object v5, v11, La/eae;->m:Ljava/lang/Object;

    .line 237
    .line 238
    iput p0, v11, La/eae;->j:I

    .line 239
    .line 240
    iput-boolean v4, v11, La/eae;->k:Z

    .line 241
    .line 242
    const-wide/16 v1, 0xbb8

    .line 243
    .line 244
    invoke-static {v1, v2, v11}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    if-ne p1, v0, :cond_c

    .line 249
    .line 250
    move-object v5, v0

    .line 251
    goto :goto_7

    .line 252
    :cond_c
    :goto_5
    if-eqz p0, :cond_d

    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_d
    move v4, v7

    .line 256
    :goto_6
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    :goto_7
    return-object v5

    .line 261
    :pswitch_2
    move-object v11, p0

    .line 262
    sget-object p0, La/wne;->a:La/wne;

    .line 263
    .line 264
    iget-boolean v0, v11, La/eae;->k:Z

    .line 265
    .line 266
    if-eqz v0, :cond_f

    .line 267
    .line 268
    if-ne v0, v4, :cond_e

    .line 269
    .line 270
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    goto :goto_a

    .line 274
    :cond_e
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    goto :goto_b

    .line 278
    :cond_f
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    iget-object p1, v11, La/eae;->m:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast p1, La/fae;

    .line 284
    .line 285
    iget-object p1, p1, La/fae;->j:La/f4v;

    .line 286
    .line 287
    check-cast v2, La/skp;

    .line 288
    .line 289
    iget-object v0, v2, La/skp;->a:Ljava/lang/String;

    .line 290
    .line 291
    iget v2, v11, La/eae;->j:I

    .line 292
    .line 293
    iput-boolean v4, v11, La/eae;->k:Z

    .line 294
    .line 295
    iget-object p1, p1, La/f4v;->a:La/g45;

    .line 296
    .line 297
    iget-object p1, p1, La/g45;->b:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast p1, La/vae;

    .line 300
    .line 301
    invoke-virtual {p1, v2, v11, v0, v1}, La/vae;->m(ILa/zje;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    if-ne p1, p0, :cond_10

    .line 306
    .line 307
    goto :goto_8

    .line 308
    :cond_10
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 309
    .line 310
    :goto_8
    if-ne p1, p0, :cond_11

    .line 311
    .line 312
    goto :goto_9

    .line 313
    :cond_11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 314
    .line 315
    :goto_9
    if-ne p1, p0, :cond_12

    .line 316
    .line 317
    move-object v5, p0

    .line 318
    goto :goto_b

    .line 319
    :cond_12
    :goto_a
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 320
    .line 321
    :goto_b
    return-object v5

    .line 322
    nop

    .line 323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
