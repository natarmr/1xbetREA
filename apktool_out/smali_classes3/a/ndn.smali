.class public final La/ndn;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/sdn;


# direct methods
.method public synthetic constructor <init>(La/sdn;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ndn;->i:B

    iput-object p1, p0, La/ndn;->l:La/sdn;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ndn;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ndn;->l:La/sdn;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/ndn;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/ndn;-><init>(La/sdn;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/ndn;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/ndn;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/ndn;-><init>(La/sdn;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/ndn;->k:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ndn;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/List;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ndn;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ndn;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ndn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/l9s;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/ndn;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/ndn;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/ndn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/ndn;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, La/ndn;->l:La/sdn;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/ndn;->k:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v7, v0

    .line 15
    check-cast v7, Ljava/util/List;

    .line 16
    .line 17
    sget-object v0, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-boolean v5, p0, La/ndn;->j:Z

    .line 20
    .line 21
    if-eqz v5, :cond_1

    .line 22
    .line 23
    if-ne v5, v2, :cond_0

    .line 24
    .line 25
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_1

    .line 29
    .line 30
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sget p1, La/sdn;->B:I

    .line 38
    .line 39
    iget-object p1, v3, La/i3t0;->i:La/ocj;

    .line 40
    .line 41
    iget-object v13, p1, La/ocj;->a:La/p7m0;

    .line 42
    .line 43
    :cond_2
    invoke-virtual {v13}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-object v5, p1

    .line 51
    check-cast v5, La/cdn;

    .line 52
    .line 53
    const/4 v11, 0x0

    .line 54
    const/16 v12, 0xed

    .line 55
    .line 56
    const/4 v6, 0x0

    .line 57
    const/4 v8, 0x0

    .line 58
    const/4 v9, 0x0

    .line 59
    const/4 v10, 0x0

    .line 60
    invoke-static/range {v5 .. v12}, La/cdn;->a(La/cdn;Ljava/util/List;Ljava/util/List;La/l9s;ZLa/xfa0;La/aw20;I)La/cdn;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v13, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_2

    .line 69
    .line 70
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    iget-object p0, v3, La/sdn;->w:La/owp0;

    .line 77
    .line 78
    sget-object p1, La/idf0;->a:La/idf0;

    .line 79
    .line 80
    invoke-virtual {p0, p1}, La/owp0;->g(La/ldf0;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    iget-object p1, v3, La/sdn;->s:La/o030;

    .line 85
    .line 86
    new-instance v1, Ljava/util/ArrayList;

    .line 87
    .line 88
    const/16 v3, 0xa

    .line 89
    .line 90
    invoke-static {v7, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 95
    .line 96
    .line 97
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-eqz v5, :cond_4

    .line 106
    .line 107
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    check-cast v5, La/mu20;

    .line 112
    .line 113
    iget-object v5, v5, La/mu20;->a:Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-static {v5}, La/r3d;->r(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_4
    invoke-static {v1}, La/r3d;->r(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    new-instance v3, La/s030;

    .line 128
    .line 129
    invoke-direct {v3, v1}, La/s030;-><init>(Ljava/util/ArrayList;)V

    .line 130
    .line 131
    .line 132
    iput-object v4, p0, La/ndn;->k:Ljava/lang/Object;

    .line 133
    .line 134
    iput-boolean v2, p0, La/ndn;->j:Z

    .line 135
    .line 136
    invoke-virtual {p1, v3, p0}, La/o030;->w(La/h130;La/yje;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    if-ne p0, v0, :cond_5

    .line 141
    .line 142
    move-object v4, v0

    .line 143
    goto :goto_2

    .line 144
    :cond_5
    :goto_1
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    :goto_2
    return-object v4

    .line 147
    :pswitch_0
    iget-object v0, p0, La/ndn;->k:Ljava/lang/Object;

    .line 148
    .line 149
    move-object v8, v0

    .line 150
    check-cast v8, La/l9s;

    .line 151
    .line 152
    sget-object v0, La/wne;->a:La/wne;

    .line 153
    .line 154
    iget-boolean v5, p0, La/ndn;->j:Z

    .line 155
    .line 156
    if-eqz v5, :cond_7

    .line 157
    .line 158
    if-ne v5, v2, :cond_6

    .line 159
    .line 160
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_6
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    sget p1, La/sdn;->B:I

    .line 172
    .line 173
    iget-object p1, v3, La/i3t0;->i:La/ocj;

    .line 174
    .line 175
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 176
    .line 177
    :cond_8
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    move-object v5, v1

    .line 185
    check-cast v5, La/cdn;

    .line 186
    .line 187
    const/4 v11, 0x0

    .line 188
    const/16 v12, 0xfb

    .line 189
    .line 190
    const/4 v6, 0x0

    .line 191
    const/4 v7, 0x0

    .line 192
    const/4 v9, 0x0

    .line 193
    const/4 v10, 0x0

    .line 194
    invoke-static/range {v5 .. v12}, La/cdn;->a(La/cdn;Ljava/util/List;Ljava/util/List;La/l9s;ZLa/xfa0;La/aw20;I)La/cdn;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    invoke-virtual {p1, v1, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-eqz v1, :cond_8

    .line 203
    .line 204
    iget-object p1, v3, La/sdn;->s:La/o030;

    .line 205
    .line 206
    new-instance v1, La/t030;

    .line 207
    .line 208
    invoke-direct {v1, v8}, La/t030;-><init>(La/l9s;)V

    .line 209
    .line 210
    .line 211
    iput-object v4, p0, La/ndn;->k:Ljava/lang/Object;

    .line 212
    .line 213
    iput-boolean v2, p0, La/ndn;->j:Z

    .line 214
    .line 215
    invoke-virtual {p1, v1, p0}, La/o030;->w(La/h130;La/yje;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    if-ne p0, v0, :cond_9

    .line 220
    .line 221
    move-object v4, v0

    .line 222
    goto :goto_4

    .line 223
    :cond_9
    :goto_3
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 224
    .line 225
    :goto_4
    return-object v4

    .line 226
    nop

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
