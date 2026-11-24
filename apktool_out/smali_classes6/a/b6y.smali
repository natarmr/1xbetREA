.class public final La/b6y;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/e6y;


# direct methods
.method public synthetic constructor <init>(La/e6y;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/b6y;->i:B

    iput-object p1, p0, La/b6y;->k:La/e6y;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/b6y;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/b6y;->k:La/e6y;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/b6y;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/b6y;-><init>(La/e6y;La/yje;B)V

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
    iput-boolean p0, v0, La/b6y;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/b6y;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/b6y;-><init>(La/e6y;La/yje;B)V

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
    iget-byte v0, p0, La/b6y;->i:B

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
    invoke-virtual {p0, p1, p2}, La/b6y;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/b6y;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/b6y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/b6y;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/b6y;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/b6y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/b6y;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/b6y;->k:La/e6y;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-boolean v5, p0, La/b6y;->j:Z

    .line 9
    .line 10
    sget-object p0, La/wne;->a:La/wne;

    .line 11
    .line 12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget p0, La/e6y;->G:I

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
    check-cast v2, La/x5y;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    const/16 v7, 0x2f

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-static/range {v2 .. v7}, La/x5y;->a(La/x5y;La/vm5;La/zw6;ZZI)La/x5y;

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
    iget-object v0, v1, La/e6y;->A:La/mne;

    .line 50
    .line 51
    sget-object v2, La/wne;->a:La/wne;

    .line 52
    .line 53
    iget-boolean v3, p0, La/b6y;->j:Z

    .line 54
    .line 55
    const/4 v4, 0x1

    .line 56
    const/4 v5, 0x0

    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    if-ne v3, v4, :cond_1

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
    move-object v2, v5

    .line 71
    goto/16 :goto_2

    .line 72
    .line 73
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, v1, La/e6y;->s:La/khf0;

    .line 77
    .line 78
    sget-object v3, La/bm5;->m:La/bm5;

    .line 79
    .line 80
    iput-boolean v4, p0, La/b6y;->j:Z

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
    goto :goto_2

    .line 89
    :cond_3
    :goto_0
    check-cast p1, La/ql5;

    .line 90
    .line 91
    iget-object p0, v1, La/e6y;->w:La/rou;

    .line 92
    .line 93
    iget-object p0, p0, La/rou;->a:La/b3c0;

    .line 94
    .line 95
    invoke-virtual {p0}, La/b3c0;->c()Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    new-instance v2, La/ns6;

    .line 100
    .line 101
    invoke-direct {v2, p1, p0, v4}, La/ns6;-><init>(La/ql5;ZB)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    iget-object v9, v0, La/mne;->a:La/rwj;

    .line 112
    .line 113
    sget-object v7, La/d6y;->a:La/d6y;

    .line 114
    .line 115
    new-instance v10, La/cin;

    .line 116
    .line 117
    const/16 p0, 0x18

    .line 118
    .line 119
    invoke-direct {v10, v1, v5, p0}, La/cin;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 120
    .line 121
    .line 122
    const/16 v11, 0xa

    .line 123
    .line 124
    const/4 v8, 0x0

    .line 125
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 126
    .line 127
    .line 128
    iget-object p0, v1, La/e6y;->F:La/c4m0;

    .line 129
    .line 130
    if-eqz p0, :cond_4

    .line 131
    .line 132
    invoke-virtual {p0}, La/pby;->isActive()Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-ne p0, v4, :cond_4

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_4
    iget-object p0, v1, La/e6y;->v:La/b8u;

    .line 140
    .line 141
    sget-object p1, La/bm5;->m:La/bm5;

    .line 142
    .line 143
    invoke-virtual {p0, p1}, La/b8u;->a(La/bm5;)La/i89;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    new-instance p1, La/v1x;

    .line 148
    .line 149
    const/16 v2, 0x16

    .line 150
    .line 151
    invoke-direct {p1, v2}, La/v1x;-><init>(B)V

    .line 152
    .line 153
    .line 154
    sget-object v2, La/i120;->f:La/eoh0;

    .line 155
    .line 156
    const/4 v3, 0x2

    .line 157
    invoke-static {v3, p1}, La/zys0;->e(ILjava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    invoke-static {p0, v2, p1}, La/i120;->X(La/gmq;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/rwk;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    new-instance p1, La/u5u;

    .line 165
    .line 166
    const/16 v2, 0x1a

    .line 167
    .line 168
    invoke-direct {p1, v1, v5, v2}, La/u5u;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 169
    .line 170
    .line 171
    new-instance v2, La/fnq;

    .line 172
    .line 173
    const/4 v3, 0x4

    .line 174
    invoke-direct {v2, p0, p1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 175
    .line 176
    .line 177
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    iget-object p1, v0, La/mne;->a:La/rwj;

    .line 182
    .line 183
    invoke-static {p0, p1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    new-instance p1, La/kaw;

    .line 188
    .line 189
    const/16 v0, 0xe

    .line 190
    .line 191
    invoke-direct {p1, v1, v5, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 192
    .line 193
    .line 194
    invoke-static {v2, p0, p1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    iput-object p0, v1, La/e6y;->F:La/c4m0;

    .line 199
    .line 200
    :goto_1
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 201
    .line 202
    :goto_2
    return-object v2

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
