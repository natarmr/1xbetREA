.class public final La/ed60;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:I

.field public k:B

.field public final synthetic l:J

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/ed60;->i:B

    iput-object p1, p0, La/ed60;->m:Ljava/lang/Object;

    iput-wide p2, p0, La/ed60;->l:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    iget-byte p1, p0, La/ed60;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/ed60;

    .line 7
    .line 8
    iget-object p1, p0, La/ed60;->m:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v1, p1

    .line 11
    check-cast v1, La/rrd;

    .line 12
    .line 13
    iget-wide v2, p0, La/ed60;->l:J

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    move-object v4, p2

    .line 17
    invoke-direct/range {v0 .. v5}, La/ed60;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_0
    move-object v4, p2

    .line 22
    new-instance v1, La/ed60;

    .line 23
    .line 24
    iget-object p1, p0, La/ed60;->m:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v2, p1

    .line 27
    check-cast v2, La/rrd;

    .line 28
    .line 29
    iget-wide p0, p0, La/ed60;->l:J

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    move-object v5, v4

    .line 33
    move-wide v3, p0

    .line 34
    invoke-direct/range {v1 .. v6}, La/ed60;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ed60;->i:B

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Number;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    check-cast p2, La/yje;

    .line 13
    .line 14
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, p1, p2}, La/ed60;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, La/ed60;

    .line 23
    .line 24
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, La/ed60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    check-cast p2, La/yje;

    .line 36
    .line 37
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0, p1, p2}, La/ed60;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, La/ed60;

    .line 46
    .line 47
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    invoke-virtual {p0, p1}, La/ed60;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/ed60;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    iget-object v3, p0, La/ed60;->m:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x2

    .line 10
    const/4 v6, 0x3

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v3, La/rrd;

    .line 15
    .line 16
    sget-object v8, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-byte v0, p0, La/ed60;->k:B

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    if-eq v0, v4, :cond_2

    .line 23
    .line 24
    if-eq v0, v5, :cond_1

    .line 25
    .line 26
    if-ne v0, v6, :cond_0

    .line 27
    .line 28
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    move-object v0, p1

    .line 32
    goto :goto_3

    .line 33
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    move-object v0, v1

    .line 37
    goto :goto_3

    .line 38
    :cond_1
    iget v0, p0, La/ed60;->j:I

    .line 39
    .line 40
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move-object v1, p1

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    move-object v0, p1

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, v3, La/rrd;->g:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, La/ieu;

    .line 56
    .line 57
    iput-byte v4, p0, La/ed60;->k:B

    .line 58
    .line 59
    invoke-virtual {v0, p0}, La/ieu;->i(La/yje;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-ne v0, v8, :cond_4

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    :goto_0
    check-cast v0, La/elt;

    .line 67
    .line 68
    iget v0, v0, La/elt;->e:I

    .line 69
    .line 70
    iput v0, p0, La/ed60;->j:I

    .line 71
    .line 72
    iput-byte v5, p0, La/ed60;->k:B

    .line 73
    .line 74
    invoke-virtual {v3, v0, p0}, La/rrd;->q(ILa/zje;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    if-ne v1, v8, :cond_5

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_5
    :goto_1
    check-cast v1, La/c3c0;

    .line 82
    .line 83
    iget-boolean v2, v1, La/c3c0;->b:Z

    .line 84
    .line 85
    iget-wide v4, v1, La/c3c0;->c:J

    .line 86
    .line 87
    iget-object v1, v3, La/rrd;->f:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v1, La/xyt;

    .line 90
    .line 91
    iget-object v1, v1, La/xyt;->a:La/uzc;

    .line 92
    .line 93
    invoke-virtual {v1}, La/uzc;->b()La/jvn;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    iget-object v3, v3, La/rrd;->b:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v3, La/u8u;

    .line 100
    .line 101
    iput v0, p0, La/ed60;->j:I

    .line 102
    .line 103
    iput-byte v6, p0, La/ed60;->k:B

    .line 104
    .line 105
    move-object v6, v1

    .line 106
    move v1, v2

    .line 107
    move-object v0, v3

    .line 108
    move-wide v2, v4

    .line 109
    iget-wide v4, p0, La/ed60;->l:J

    .line 110
    .line 111
    move-object v7, p0

    .line 112
    invoke-virtual/range {v0 .. v7}, La/u8u;->w(ZJJLa/jvn;La/zje;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    if-ne v0, v8, :cond_6

    .line 117
    .line 118
    :goto_2
    move-object v0, v8

    .line 119
    :cond_6
    :goto_3
    return-object v0

    .line 120
    :pswitch_0
    check-cast v3, La/rrd;

    .line 121
    .line 122
    sget-object v8, La/wne;->a:La/wne;

    .line 123
    .line 124
    iget-byte v0, p0, La/ed60;->k:B

    .line 125
    .line 126
    if-eqz v0, :cond_a

    .line 127
    .line 128
    if-eq v0, v4, :cond_9

    .line 129
    .line 130
    if-eq v0, v5, :cond_8

    .line 131
    .line 132
    if-ne v0, v6, :cond_7

    .line 133
    .line 134
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    move-object v0, p1

    .line 138
    goto :goto_7

    .line 139
    :cond_7
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    move-object v0, v1

    .line 143
    goto :goto_7

    .line 144
    :cond_8
    iget v0, p0, La/ed60;->j:I

    .line 145
    .line 146
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    move-object v1, p1

    .line 150
    goto :goto_5

    .line 151
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    move-object v0, p1

    .line 155
    goto :goto_4

    .line 156
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    iget-object v0, v3, La/rrd;->g:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v0, La/ieu;

    .line 162
    .line 163
    iput-byte v4, p0, La/ed60;->k:B

    .line 164
    .line 165
    invoke-virtual {v0, p0}, La/ieu;->i(La/yje;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    if-ne v0, v8, :cond_b

    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_b
    :goto_4
    check-cast v0, La/elt;

    .line 173
    .line 174
    iget v0, v0, La/elt;->e:I

    .line 175
    .line 176
    iput v0, p0, La/ed60;->j:I

    .line 177
    .line 178
    iput-byte v5, p0, La/ed60;->k:B

    .line 179
    .line 180
    invoke-virtual {v3, v0, p0}, La/rrd;->q(ILa/zje;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    if-ne v1, v8, :cond_c

    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_c
    :goto_5
    check-cast v1, La/c3c0;

    .line 188
    .line 189
    iget-boolean v2, v1, La/c3c0;->b:Z

    .line 190
    .line 191
    iget-wide v4, v1, La/c3c0;->c:J

    .line 192
    .line 193
    iget-object v1, v3, La/rrd;->f:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v1, La/xyt;

    .line 196
    .line 197
    iget-object v1, v1, La/xyt;->a:La/uzc;

    .line 198
    .line 199
    invoke-virtual {v1}, La/uzc;->b()La/jvn;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    iget-object v3, v3, La/rrd;->b:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v3, La/edu;

    .line 206
    .line 207
    iput v0, p0, La/ed60;->j:I

    .line 208
    .line 209
    iput-byte v6, p0, La/ed60;->k:B

    .line 210
    .line 211
    move-object v6, v1

    .line 212
    move v1, v2

    .line 213
    move-object v0, v3

    .line 214
    move-wide v2, v4

    .line 215
    iget-wide v4, p0, La/ed60;->l:J

    .line 216
    .line 217
    move-object v7, p0

    .line 218
    invoke-virtual/range {v0 .. v7}, La/edu;->p(ZJJLa/jvn;La/zje;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    if-ne v0, v8, :cond_d

    .line 223
    .line 224
    :goto_6
    move-object v0, v8

    .line 225
    :cond_d
    :goto_7
    return-object v0

    .line 226
    nop

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
