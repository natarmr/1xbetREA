.class public final La/gwc;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/iwc;


# direct methods
.method public synthetic constructor <init>(La/iwc;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/gwc;->i:B

    iput-object p1, p0, La/gwc;->k:La/iwc;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/gwc;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/gwc;->k:La/iwc;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/gwc;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/gwc;-><init>(La/iwc;La/yje;B)V

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
    iput-boolean p0, v0, La/gwc;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/gwc;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/gwc;-><init>(La/iwc;La/yje;B)V

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
    iget-byte v0, p0, La/gwc;->i:B

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
    invoke-virtual {p0, p1, p2}, La/gwc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/gwc;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/gwc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/gwc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/gwc;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/gwc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 10

    .line 1
    iget-byte v0, p0, La/gwc;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/gwc;->k:La/iwc;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-boolean p0, p0, La/gwc;->j:Z

    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, v2, La/iwc;->o:La/p7m0;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    sget-object v0, La/cwc;->a:La/cwc;

    .line 23
    .line 24
    invoke-virtual {p1, v3, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v3, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    iget-object p0, v2, La/iwc;->d:La/mne;

    .line 40
    .line 41
    iget-object v7, p0, La/mne;->b:La/dvj;

    .line 42
    .line 43
    new-instance v5, La/lya;

    .line 44
    .line 45
    const/16 p0, 0x15

    .line 46
    .line 47
    invoke-direct {v5, v2, p0}, La/lya;-><init>(Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    new-instance v8, La/gwc;

    .line 51
    .line 52
    invoke-direct {v8, v2, v3, v1}, La/gwc;-><init>(La/iwc;La/yje;B)V

    .line 53
    .line 54
    .line 55
    const/16 v9, 0xa

    .line 56
    .line 57
    const/4 v6, 0x0

    .line 58
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    new-instance p0, La/ewc;

    .line 63
    .line 64
    iget-object v0, v2, La/iwc;->n:La/ra10;

    .line 65
    .line 66
    invoke-direct {p0, v0}, La/ewc;-><init>(La/ra10;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v3, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_0
    iget-object v0, v2, La/iwc;->o:La/p7m0;

    .line 79
    .line 80
    sget-object v4, La/wne;->a:La/wne;

    .line 81
    .line 82
    iget-boolean v5, p0, La/gwc;->j:Z

    .line 83
    .line 84
    const/4 v6, 0x1

    .line 85
    if-eqz v5, :cond_2

    .line 86
    .line 87
    if-ne v5, v6, :cond_1

    .line 88
    .line 89
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 94
    .line 95
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto/16 :goto_4

    .line 99
    .line 100
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    iget-object p1, v2, La/iwc;->f:La/gyt;

    .line 104
    .line 105
    iget v5, v2, La/iwc;->b:I

    .line 106
    .line 107
    iput-boolean v6, p0, La/gwc;->j:Z

    .line 108
    .line 109
    invoke-virtual {p1, v5, p0}, La/gyt;->b(ILa/zje;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-ne p1, v4, :cond_3

    .line 114
    .line 115
    move-object v3, v4

    .line 116
    goto :goto_4

    .line 117
    :cond_3
    :goto_1
    check-cast p1, La/uvc;

    .line 118
    .line 119
    iget-object p0, p1, La/uvc;->k:Ljava/lang/String;

    .line 120
    .line 121
    iget-object v4, p1, La/uvc;->l:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    if-nez p0, :cond_4

    .line 128
    .line 129
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    if-lez p0, :cond_4

    .line 134
    .line 135
    iget-object p0, v2, La/iwc;->j:La/grj;

    .line 136
    .line 137
    invoke-virtual {p0, v4}, La/grj;->a(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    iget-object p0, v2, La/iwc;->e:La/i1w0;

    .line 141
    .line 142
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    new-instance v0, La/c8d;

    .line 147
    .line 148
    sget-object v2, La/y7d;->a:La/v7d;

    .line 149
    .line 150
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 151
    .line 152
    invoke-direct {v0, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 153
    .line 154
    .line 155
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    :goto_2
    move-object v0, p1

    .line 160
    check-cast v0, La/paw;

    .line 161
    .line 162
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-eqz v1, :cond_6

    .line 167
    .line 168
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    check-cast v0, La/oe50;

    .line 173
    .line 174
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_4
    iget-object p0, p1, La/uvc;->k:Ljava/lang/String;

    .line 179
    .line 180
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 181
    .line 182
    .line 183
    move-result p0

    .line 184
    if-lez p0, :cond_5

    .line 185
    .line 186
    iget-object p0, v2, La/iwc;->h:La/ntu;

    .line 187
    .line 188
    invoke-virtual {p0}, La/ntu;->a()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    new-instance v1, La/dwc;

    .line 193
    .line 194
    invoke-direct {v1, p1, p0}, La/dwc;-><init>(La/uvc;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v3, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_5
    new-instance p0, La/ewc;

    .line 205
    .line 206
    iget-object p1, v2, La/iwc;->m:La/ra10;

    .line 207
    .line 208
    invoke-direct {p0, p1}, La/ewc;-><init>(La/ra10;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0, v3, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    :cond_6
    :goto_3
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 218
    .line 219
    :goto_4
    return-object v3

    .line 220
    nop

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
