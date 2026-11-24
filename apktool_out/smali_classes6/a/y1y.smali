.class public final La/y1y;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/a2y;


# direct methods
.method public synthetic constructor <init>(La/a2y;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/y1y;->i:B

    iput-object p1, p0, La/y1y;->k:La/a2y;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/y1y;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/y1y;->k:La/a2y;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/y1y;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/y1y;-><init>(La/a2y;La/yje;B)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iput-boolean p0, v0, La/y1y;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/y1y;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/y1y;-><init>(La/a2y;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/y1y;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/y1y;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/y1y;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/y1y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/vne;

    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/y1y;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/y1y;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/y1y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/y1y;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/y1y;->k:La/a2y;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-boolean v5, p0, La/y1y;->j:Z

    .line 9
    .line 10
    sget-object p0, La/wne;->a:La/wne;

    .line 11
    .line 12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget p0, La/a2y;->G:I

    .line 16
    .line 17
    iget-object p0, v1, La/i3t0;->i:La/ocj;

    .line 18
    .line 19
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-object v2, p0

    .line 29
    check-cast v2, La/s1y;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    const/16 v7, 0x5f

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-static/range {v2 .. v7}, La/s1y;->a(La/s1y;La/sm5;La/ax6;ZZI)La/s1y;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_0

    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_0
    iget-object v0, v1, La/a2y;->A:La/mne;

    .line 50
    .line 51
    sget-object v2, La/wne;->a:La/wne;

    .line 52
    .line 53
    iget-boolean v3, p0, La/y1y;->j:Z

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    const/4 v5, 0x1

    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    if-ne v3, v5, :cond_1

    .line 60
    .line 61
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    move-object v2, v4

    .line 71
    goto/16 :goto_3

    .line 72
    .line 73
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, v1, La/a2y;->s:La/khf0;

    .line 77
    .line 78
    sget-object v3, La/bm5;->m:La/bm5;

    .line 79
    .line 80
    iput-boolean v5, p0, La/y1y;->j:Z

    .line 81
    .line 82
    invoke-static {p1, v3, p0}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-ne p1, v2, :cond_3

    .line 87
    .line 88
    goto/16 :goto_3

    .line 89
    .line 90
    :cond_3
    :goto_0
    check-cast p1, La/ql5;

    .line 91
    .line 92
    iget-wide v2, p1, La/ql5;->b:D

    .line 93
    .line 94
    const-wide/16 v6, 0x0

    .line 95
    .line 96
    cmpg-double p0, v2, v6

    .line 97
    .line 98
    if-gtz p0, :cond_4

    .line 99
    .line 100
    move p0, v5

    .line 101
    goto :goto_1

    .line 102
    :cond_4
    const/4 p0, 0x0

    .line 103
    :goto_1
    iget-object v2, v1, La/a2y;->w:La/rou;

    .line 104
    .line 105
    iget-object v2, v2, La/rou;->a:La/b3c0;

    .line 106
    .line 107
    invoke-virtual {v2}, La/b3c0;->c()Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    new-instance v3, La/uo1;

    .line 112
    .line 113
    invoke-direct {v3, p1, v2, p0}, La/uo1;-><init>(La/ql5;ZZ)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v3}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    iget-object v9, v0, La/mne;->a:La/rwj;

    .line 124
    .line 125
    sget-object v7, La/z1y;->a:La/z1y;

    .line 126
    .line 127
    new-instance v10, La/cin;

    .line 128
    .line 129
    const/16 p0, 0x17

    .line 130
    .line 131
    invoke-direct {v10, v1, v4, p0}, La/cin;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 132
    .line 133
    .line 134
    const/16 v11, 0xa

    .line 135
    .line 136
    const/4 v8, 0x0

    .line 137
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 138
    .line 139
    .line 140
    iget-object p1, v1, La/a2y;->F:La/c4m0;

    .line 141
    .line 142
    if-eqz p1, :cond_5

    .line 143
    .line 144
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-ne p1, v5, :cond_5

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_5
    iget-object p1, v1, La/a2y;->v:La/b8u;

    .line 152
    .line 153
    sget-object v2, La/bm5;->m:La/bm5;

    .line 154
    .line 155
    invoke-virtual {p1, v2}, La/b8u;->a(La/bm5;)La/i89;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    new-instance v2, La/v1x;

    .line 160
    .line 161
    const/16 v3, 0x14

    .line 162
    .line 163
    invoke-direct {v2, v3}, La/v1x;-><init>(B)V

    .line 164
    .line 165
    .line 166
    sget-object v3, La/i120;->f:La/eoh0;

    .line 167
    .line 168
    const/4 v5, 0x2

    .line 169
    invoke-static {v5, v2}, La/zys0;->e(ILjava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    invoke-static {p1, v3, v2}, La/i120;->X(La/gmq;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/rwk;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    new-instance v2, La/u5u;

    .line 177
    .line 178
    invoke-direct {v2, v1, v4, p0}, La/u5u;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 179
    .line 180
    .line 181
    new-instance p0, La/fnq;

    .line 182
    .line 183
    const/4 v3, 0x4

    .line 184
    invoke-direct {p0, p1, v2, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 185
    .line 186
    .line 187
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 192
    .line 193
    invoke-static {p1, v0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    new-instance v0, La/kaw;

    .line 198
    .line 199
    const/16 v2, 0xb

    .line 200
    .line 201
    invoke-direct {v0, v1, v4, v2}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 202
    .line 203
    .line 204
    invoke-static {p0, p1, v0}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    iput-object p0, v1, La/a2y;->F:La/c4m0;

    .line 209
    .line 210
    :goto_2
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 211
    .line 212
    :goto_3
    return-object v2

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
