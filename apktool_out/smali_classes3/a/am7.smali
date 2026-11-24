.class public final La/am7;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/fm7;

.field public final synthetic l:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/fm7;Ljava/lang/String;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/am7;->i:B

    iput-object p1, p0, La/am7;->k:La/fm7;

    iput-object p2, p0, La/am7;->l:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/am7;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/am7;->l:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, La/am7;->k:La/fm7;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/am7;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/am7;-><init>(La/fm7;Ljava/lang/String;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/am7;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/am7;-><init>(La/fm7;Ljava/lang/String;La/yje;B)V

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
    iget-byte v0, p0, La/am7;->i:B

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
    invoke-virtual {p0, p1, p2}, La/am7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/am7;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/am7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/am7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/am7;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/am7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 13

    .line 1
    iget-byte v0, p0, La/am7;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, La/am7;->k:La/fm7;

    .line 7
    .line 8
    iget-object v4, p0, La/am7;->l:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, p0, La/am7;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v2, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, v3, La/fm7;->c0:La/jtj;

    .line 34
    .line 35
    iput-boolean v2, p0, La/am7;->j:Z

    .line 36
    .line 37
    iget-object v1, p1, La/jtj;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, La/nvu;

    .line 40
    .line 41
    iget-object p1, p1, La/jtj;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, La/k7u;

    .line 44
    .line 45
    iget-object p1, p1, La/k7u;->a:La/uzc;

    .line 46
    .line 47
    invoke-virtual {p1}, La/uzc;->b()La/jvn;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, La/jvn;->getId()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-virtual {v1, p1, p0, v4}, La/nvu;->v(ILa/zje;Ljava/lang/String;)Ljava/io/Serializable;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-ne p1, v0, :cond_2

    .line 60
    .line 61
    move-object v5, v0

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    :goto_0
    check-cast p1, [B

    .line 64
    .line 65
    new-instance p0, La/vk7;

    .line 66
    .line 67
    invoke-direct {p0, v4, p1}, La/vk7;-><init>(Ljava/lang/String;[B)V

    .line 68
    .line 69
    .line 70
    sget p1, La/fm7;->p0:I

    .line 71
    .line 72
    invoke-virtual {v3, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    :goto_1
    return-object v5

    .line 78
    :pswitch_0
    iget-object v0, v3, La/fm7;->B:La/fvt0;

    .line 79
    .line 80
    iget-object v6, v3, La/fm7;->p:La/mne;

    .line 81
    .line 82
    sget-object v7, La/wne;->a:La/wne;

    .line 83
    .line 84
    iget-boolean v8, p0, La/am7;->j:Z

    .line 85
    .line 86
    if-eqz v8, :cond_4

    .line 87
    .line 88
    if-ne v8, v2, :cond_3

    .line 89
    .line 90
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_4

    .line 98
    .line 99
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iget-object p1, v3, La/fm7;->M:La/ocl;

    .line 103
    .line 104
    iput-boolean v2, p0, La/am7;->j:Z

    .line 105
    .line 106
    invoke-virtual {p1}, La/ocl;->j()Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-ne p1, v7, :cond_5

    .line 111
    .line 112
    move-object v5, v7

    .line 113
    goto :goto_4

    .line 114
    :cond_5
    :goto_2
    check-cast p1, Ljava/util/List;

    .line 115
    .line 116
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 117
    .line 118
    .line 119
    move-result-wide v1

    .line 120
    invoke-static {v1, v2, p1}, La/axq;->y(JLjava/util/List;)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-eqz p0, :cond_6

    .line 125
    .line 126
    sget p0, La/fm7;->p0:I

    .line 127
    .line 128
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    iget-object v10, v6, La/mne;->b:La/dvj;

    .line 133
    .line 134
    new-instance v11, La/zl7;

    .line 135
    .line 136
    const/4 p0, 0x2

    .line 137
    invoke-direct {v11, v3, v4, v5, p0}, La/zl7;-><init>(La/fm7;Ljava/lang/String;La/yje;B)V

    .line 138
    .line 139
    .line 140
    const/16 v12, 0xb

    .line 141
    .line 142
    const/4 v8, 0x0

    .line 143
    const/4 v9, 0x0

    .line 144
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_6
    iget-object p0, v3, La/fm7;->G:La/hru;

    .line 149
    .line 150
    invoke-virtual {p0}, La/hru;->i()Z

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    if-nez p0, :cond_7

    .line 155
    .line 156
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 157
    .line 158
    .line 159
    move-result-wide p0

    .line 160
    invoke-virtual {v0, p0, p1}, La/fvt0;->x(J)V

    .line 161
    .line 162
    .line 163
    sget-object p0, La/wk7;->a:La/wk7;

    .line 164
    .line 165
    invoke-virtual {v3, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_7
    iget-object p0, v3, La/fm7;->F:La/vpt;

    .line 170
    .line 171
    invoke-virtual {p0}, La/vpt;->a()Z

    .line 172
    .line 173
    .line 174
    move-result p0

    .line 175
    if-nez p0, :cond_8

    .line 176
    .line 177
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 178
    .line 179
    .line 180
    move-result-wide p0

    .line 181
    invoke-virtual {v0, p0, p1}, La/fvt0;->x(J)V

    .line 182
    .line 183
    .line 184
    sget-object p0, La/cl7;->a:La/cl7;

    .line 185
    .line 186
    invoke-virtual {v3, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_8
    move-object p0, v4

    .line 191
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    iget-object v7, v6, La/mne;->b:La/dvj;

    .line 196
    .line 197
    move-object p1, v5

    .line 198
    new-instance v5, La/ql7;

    .line 199
    .line 200
    const/4 v0, 0x4

    .line 201
    invoke-direct {v5, v3, v0}, La/ql7;-><init>(La/fm7;B)V

    .line 202
    .line 203
    .line 204
    new-instance v8, La/ex1;

    .line 205
    .line 206
    const/16 v0, 0x11

    .line 207
    .line 208
    invoke-direct {v8, v3, p0, p1, v0}, La/ex1;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 209
    .line 210
    .line 211
    const/16 v9, 0xa

    .line 212
    .line 213
    const/4 v6, 0x0

    .line 214
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 215
    .line 216
    .line 217
    :goto_3
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 218
    .line 219
    :goto_4
    return-object v5

    .line 220
    nop

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
