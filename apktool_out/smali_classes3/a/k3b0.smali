.class public final La/k3b0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/v3b0;


# direct methods
.method public synthetic constructor <init>(La/v3b0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/k3b0;->i:B

    iput-object p1, p0, La/k3b0;->k:La/v3b0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/k3b0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/k3b0;->k:La/v3b0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/k3b0;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/k3b0;-><init>(La/v3b0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/k3b0;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/k3b0;-><init>(La/v3b0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    check-cast p1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    iput-boolean p0, v0, La/k3b0;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance p1, La/k3b0;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/k3b0;-><init>(La/v3b0;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/k3b0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/k3b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/k3b0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/k3b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/k3b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/k3b0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/k3b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, La/vne;

    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/k3b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/k3b0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/k3b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/k3b0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, La/k3b0;->k:La/v3b0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/k3b0;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v3, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, v4, La/v3b0;->r:La/urt;

    .line 32
    .line 33
    sget-object v1, La/tl5;->a:La/tl5;

    .line 34
    .line 35
    iput-boolean v3, p0, La/k3b0;->j:Z

    .line 36
    .line 37
    iget-object p1, p1, La/urt;->a:La/rrd;

    .line 38
    .line 39
    invoke-virtual {p1, v1, p0}, La/rrd;->i(La/tl5;La/zje;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-ne p0, v0, :cond_2

    .line 44
    .line 45
    move-object v1, v0

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    :goto_0
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    :goto_1
    return-object v1

    .line 50
    :pswitch_0
    move-object v0, v4

    .line 51
    iget-boolean v4, p0, La/k3b0;->j:Z

    .line 52
    .line 53
    sget-object p0, La/wne;->a:La/wne;

    .line 54
    .line 55
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, La/u2b0;

    .line 63
    .line 64
    iget-boolean p0, p0, La/u2b0;->b:Z

    .line 65
    .line 66
    if-nez p0, :cond_3

    .line 67
    .line 68
    if-eqz v4, :cond_3

    .line 69
    .line 70
    invoke-virtual {v0}, La/v3b0;->W()V

    .line 71
    .line 72
    .line 73
    :cond_3
    iget-object p0, v0, La/i3t0;->i:La/ocj;

    .line 74
    .line 75
    iget-object v11, p0, La/ocj;->a:La/p7m0;

    .line 76
    .line 77
    :cond_4
    invoke-virtual {v11}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-object v2, p0

    .line 85
    check-cast v2, La/u2b0;

    .line 86
    .line 87
    const/4 v9, 0x0

    .line 88
    const/16 v10, 0xffd

    .line 89
    .line 90
    const/4 v3, 0x0

    .line 91
    const/4 v5, 0x0

    .line 92
    const/4 v6, 0x0

    .line 93
    const/4 v7, 0x0

    .line 94
    const/4 v8, 0x0

    .line 95
    invoke-static/range {v2 .. v10}, La/u2b0;->a(La/u2b0;ZZZZLjava/util/Set;La/hus;Ljava/util/AbstractList;I)La/u2b0;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {v11, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-eqz p0, :cond_4

    .line 104
    .line 105
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    return-object p0

    .line 108
    :pswitch_1
    move-object v0, v4

    .line 109
    sget-object v4, La/wne;->a:La/wne;

    .line 110
    .line 111
    iget-boolean v5, p0, La/k3b0;->j:Z

    .line 112
    .line 113
    if-eqz v5, :cond_6

    .line 114
    .line 115
    if-ne v5, v3, :cond_5

    .line 116
    .line 117
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_5
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    goto/16 :goto_5

    .line 125
    .line 126
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iget-object p1, v0, La/v3b0;->G:La/hsj;

    .line 130
    .line 131
    const/4 v1, 0x0

    .line 132
    new-array v1, v1, [La/z7b;

    .line 133
    .line 134
    iput-boolean v3, p0, La/k3b0;->j:Z

    .line 135
    .line 136
    invoke-virtual {p1, v1, p0}, La/hsj;->r([La/z7b;La/zje;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    if-ne p1, v4, :cond_7

    .line 141
    .line 142
    move-object v1, v4

    .line 143
    goto :goto_5

    .line 144
    :cond_7
    :goto_2
    check-cast p1, La/a3b;

    .line 145
    .line 146
    iget-object p0, p1, La/a3b;->a:Ljava/util/ArrayList;

    .line 147
    .line 148
    new-instance p1, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    :cond_8
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-eqz v1, :cond_9

    .line 162
    .line 163
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    move-object v2, v1

    .line 168
    check-cast v2, La/vh0;

    .line 169
    .line 170
    iget-wide v2, v2, La/vh0;->f:J

    .line 171
    .line 172
    const-wide/16 v4, 0x3

    .line 173
    .line 174
    cmp-long v2, v2, v4

    .line 175
    .line 176
    if-eqz v2, :cond_8

    .line 177
    .line 178
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_9
    new-instance p0, Ljava/util/ArrayList;

    .line 183
    .line 184
    const/16 v1, 0xa

    .line 185
    .line 186
    invoke-static {p1, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-eqz v1, :cond_a

    .line 202
    .line 203
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    check-cast v1, La/vh0;

    .line 208
    .line 209
    new-instance v2, La/pe40;

    .line 210
    .line 211
    new-instance v3, La/q4t;

    .line 212
    .line 213
    iget-wide v4, v1, La/vh0;->a:J

    .line 214
    .line 215
    iget-object v1, v1, La/vh0;->b:Ljava/lang/String;

    .line 216
    .line 217
    invoke-direct {v3, v4, v5, v1}, La/q4t;-><init>(JLjava/lang/String;)V

    .line 218
    .line 219
    .line 220
    sget-object v1, La/byx;->a:La/byx;

    .line 221
    .line 222
    invoke-direct {v2, v3, v1}, La/pe40;-><init>(La/w4t;La/fyx;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_a
    new-instance p1, La/mo1;

    .line 230
    .line 231
    const/4 v1, 0x4

    .line 232
    invoke-direct {p1, p0, v1}, La/mo1;-><init>(Ljava/util/ArrayList;B)V

    .line 233
    .line 234
    .line 235
    sget p0, La/v3b0;->W:I

    .line 236
    .line 237
    invoke-virtual {v0, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0}, La/v3b0;->Q()V

    .line 241
    .line 242
    .line 243
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 244
    .line 245
    :goto_5
    return-object v1

    .line 246
    nop

    .line 247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
