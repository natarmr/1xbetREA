.class public final La/id70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/xd70;


# direct methods
.method public synthetic constructor <init>(La/xd70;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/id70;->i:B

    iput-object p1, p0, La/id70;->j:La/xd70;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/id70;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/id70;->j:La/xd70;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/id70;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/id70;-><init>(La/xd70;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/id70;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/id70;-><init>(La/xd70;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/id70;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/id70;-><init>(La/xd70;La/yje;B)V

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
    iget-byte v0, p0, La/id70;->i:B

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
    invoke-virtual {p0, p1, p2}, La/id70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/id70;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/id70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/id70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/id70;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/id70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/id70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/id70;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/id70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/id70;->i:B

    .line 4
    .line 5
    iget-object v0, v0, La/id70;->j:La/xd70;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/wne;->a:La/wne;

    .line 11
    .line 12
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, La/rb70;

    .line 16
    .line 17
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, La/xb70;

    .line 22
    .line 23
    iget-object v2, v2, La/xb70;->c:La/c5v0;

    .line 24
    .line 25
    invoke-direct {v1, v2}, La/rb70;-><init>(La/c5v0;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 35
    .line 36
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    sget v1, La/xd70;->B0:I

    .line 40
    .line 41
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 42
    .line 43
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 44
    .line 45
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-object v3, v2

    .line 53
    check-cast v3, La/xb70;

    .line 54
    .line 55
    const/16 v20, 0x0

    .line 56
    .line 57
    const v21, 0x1f7ff

    .line 58
    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    const/4 v5, 0x0

    .line 62
    const/4 v6, 0x0

    .line 63
    const/4 v7, 0x0

    .line 64
    const/4 v8, 0x0

    .line 65
    const/4 v9, 0x0

    .line 66
    const/4 v10, 0x0

    .line 67
    const/4 v11, 0x0

    .line 68
    const/4 v12, 0x0

    .line 69
    const/4 v13, 0x0

    .line 70
    const/4 v14, 0x0

    .line 71
    const/4 v15, 0x0

    .line 72
    const/16 v16, 0x0

    .line 73
    .line 74
    const/16 v17, 0x0

    .line 75
    .line 76
    const/16 v18, 0x0

    .line 77
    .line 78
    const/16 v19, 0x0

    .line 79
    .line 80
    invoke-static/range {v3 .. v21}, La/xb70;->a(La/xb70;La/uaq0;Ljava/lang/String;La/c5v0;ZZZZZLa/x870;ZZIZLa/fa70;La/f970;La/c970;La/z870;I)La/xb70;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_0

    .line 89
    .line 90
    new-instance v1, La/qb70;

    .line 91
    .line 92
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    check-cast v2, La/xb70;

    .line 97
    .line 98
    iget-object v2, v2, La/xb70;->c:La/c5v0;

    .line 99
    .line 100
    invoke-direct {v1, v2}, La/qb70;-><init>(La/c5v0;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    new-instance v1, La/rb70;

    .line 107
    .line 108
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    check-cast v2, La/xb70;

    .line 113
    .line 114
    iget-object v2, v2, La/xb70;->c:La/c5v0;

    .line 115
    .line 116
    invoke-direct {v1, v2}, La/rb70;-><init>(La/c5v0;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, La/xb70;

    .line 127
    .line 128
    iget-boolean v1, v1, La/xb70;->g:Z

    .line 129
    .line 130
    if-eqz v1, :cond_1

    .line 131
    .line 132
    invoke-virtual {v0}, La/xd70;->t0()V

    .line 133
    .line 134
    .line 135
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object v0

    .line 138
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 139
    .line 140
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    new-instance v1, La/pgr;

    .line 144
    .line 145
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    check-cast v2, La/xb70;

    .line 150
    .line 151
    iget-object v2, v2, La/xb70;->n:La/fa70;

    .line 152
    .line 153
    iget-wide v2, v2, La/fa70;->e:J

    .line 154
    .line 155
    const/4 v4, 0x0

    .line 156
    invoke-direct {v1, v4, v2, v3}, La/pgr;-><init>(ZJ)V

    .line 157
    .line 158
    .line 159
    iget-object v2, v0, La/xd70;->j0:La/z7z;

    .line 160
    .line 161
    invoke-interface {v2}, La/z7z;->get()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    check-cast v2, La/vby;

    .line 169
    .line 170
    invoke-virtual {v1, v2}, La/mir;->a(La/vby;)La/agr;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-virtual {v0, v1}, La/xd70;->m0(La/agr;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    check-cast v1, La/xb70;

    .line 182
    .line 183
    iget-boolean v1, v1, La/xb70;->h:Z

    .line 184
    .line 185
    if-nez v1, :cond_2

    .line 186
    .line 187
    invoke-virtual {v0}, La/xd70;->l0()V

    .line 188
    .line 189
    .line 190
    iget-object v0, v0, La/xd70;->q:La/i1w0;

    .line 191
    .line 192
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    new-instance v2, La/c8d;

    .line 197
    .line 198
    sget-object v3, La/y7d;->a:La/v7d;

    .line 199
    .line 200
    sget-object v5, La/p0w0;->a:La/p0w0;

    .line 201
    .line 202
    invoke-direct {v2, v3, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 203
    .line 204
    .line 205
    invoke-static {v1, v2, v0, v1, v4}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    :goto_0
    move-object v2, v1

    .line 210
    check-cast v2, La/paw;

    .line 211
    .line 212
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    if-eqz v3, :cond_2

    .line 217
    .line 218
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    check-cast v2, La/oe50;

    .line 223
    .line 224
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 225
    .line 226
    .line 227
    goto :goto_0

    .line 228
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 229
    .line 230
    return-object v0

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
