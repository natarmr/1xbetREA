.class public final La/o190;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/t190;


# direct methods
.method public synthetic constructor <init>(La/t190;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/o190;->i:B

    iput-object p1, p0, La/o190;->j:La/t190;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/o190;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/o190;->j:La/t190;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/o190;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/o190;-><init>(La/t190;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/o190;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/o190;-><init>(La/t190;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/o190;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/o190;-><init>(La/t190;La/yje;B)V

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
    iget-byte v0, p0, La/o190;->i:B

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
    invoke-virtual {p0, p1, p2}, La/o190;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/o190;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/o190;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/kmq;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/o190;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/o190;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/o190;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/kmq;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/o190;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/o190;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/o190;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/o190;->i:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, La/o190;->j:La/t190;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, La/wne;->a:La/wne;

    .line 12
    .line 13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, La/t190;->k:La/pru;

    .line 17
    .line 18
    invoke-virtual {p1}, La/pru;->a()La/sff0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object p1, p1, La/sff0;->g:La/mum0;

    .line 23
    .line 24
    iget-object v0, p1, La/mum0;->x:La/zvh0;

    .line 25
    .line 26
    iget-object v4, p0, La/t190;->t:La/p7m0;

    .line 27
    .line 28
    :cond_0
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    move-object p1, p0

    .line 33
    check-cast p1, La/m190;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_4

    .line 40
    .line 41
    if-eq v5, v2, :cond_3

    .line 42
    .line 43
    const/4 v6, 0x2

    .line 44
    if-eq v5, v6, :cond_2

    .line 45
    .line 46
    if-ne v5, v1, :cond_1

    .line 47
    .line 48
    sget-object v5, La/bxh0;->a:La/bxh0;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    sget-object v5, La/cxh0;->a:La/cxh0;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    sget-object v5, La/zwh0;->a:La/zwh0;

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_4
    sget-object v5, La/axh0;->a:La/axh0;

    .line 62
    .line 63
    :goto_0
    const/4 v6, 0x0

    .line 64
    const/4 v7, 0x6

    .line 65
    invoke-static {p1, v5, v6, v7}, La/m190;->a(La/m190;La/dxh0;II)La/m190;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {v4, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_0

    .line 74
    .line 75
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    :goto_1
    return-object v3

    .line 78
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 79
    .line 80
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, La/t190;->o:La/reu;

    .line 84
    .line 85
    iget-object p1, p1, La/reu;->b:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p1, La/g090;

    .line 88
    .line 89
    iget-object p1, p1, La/g090;->a:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p1, La/d190;

    .line 92
    .line 93
    iget-object p1, p1, La/d190;->g:La/qoj0;

    .line 94
    .line 95
    new-instance v0, La/s980;

    .line 96
    .line 97
    const/16 v1, 0x8

    .line 98
    .line 99
    invoke-direct {v0, p0, v3, v1}, La/s980;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 100
    .line 101
    .line 102
    new-instance v1, La/fnq;

    .line 103
    .line 104
    const/4 v2, 0x4

    .line 105
    invoke-direct {v1, p1, v0, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 106
    .line 107
    .line 108
    sget-object p1, La/s190;->h:La/s190;

    .line 109
    .line 110
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iget-object v2, p0, La/t190;->m:La/mne;

    .line 115
    .line 116
    iget-object v2, v2, La/mne;->a:La/rwj;

    .line 117
    .line 118
    invoke-static {v0, v2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-static {v1, v0, p1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    iput-object p1, p0, La/t190;->x:La/c4m0;

    .line 127
    .line 128
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    return-object p0

    .line 131
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 132
    .line 133
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    iget-object p1, p0, La/t190;->j:La/m1e;

    .line 137
    .line 138
    invoke-interface {p1}, La/m1e;->b()La/gmq;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    iget-object v0, p0, La/t190;->n:La/yfu;

    .line 143
    .line 144
    iget-object v0, v0, La/yfu;->a:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v0, La/g090;

    .line 147
    .line 148
    iget-object v0, v0, La/g090;->a:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, La/d190;

    .line 151
    .line 152
    iget-object v0, v0, La/d190;->f:La/p7m0;

    .line 153
    .line 154
    new-instance v4, La/jr9;

    .line 155
    .line 156
    invoke-direct {v4, p0, v3, v1}, La/jr9;-><init>(La/diu0;La/yje;B)V

    .line 157
    .line 158
    .line 159
    new-instance v1, La/p6d;

    .line 160
    .line 161
    invoke-direct {v1, p1, v0, v4, v2}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 162
    .line 163
    .line 164
    sget-object p1, La/r190;->h:La/r190;

    .line 165
    .line 166
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    iget-object v2, p0, La/t190;->m:La/mne;

    .line 171
    .line 172
    iget-object v2, v2, La/mne;->a:La/rwj;

    .line 173
    .line 174
    invoke-static {v0, v2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v1, v0, p1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    iput-object p1, p0, La/t190;->w:La/c4m0;

    .line 183
    .line 184
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object p0

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
