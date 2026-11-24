.class public final La/i890;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/j890;


# direct methods
.method public synthetic constructor <init>(La/j890;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/i890;->i:B

    iput-object p1, p0, La/i890;->k:La/j890;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/i890;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/i890;->k:La/j890;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/i890;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/i890;-><init>(La/j890;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/i890;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/i890;-><init>(La/j890;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance v0, La/i890;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, p2, v1}, La/i890;-><init>(La/j890;La/yje;B)V

    .line 26
    .line 27
    .line 28
    check-cast p1, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    iput-boolean p0, v0, La/i890;->j:Z

    .line 35
    .line 36
    return-object v0

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
    iget-byte v0, p0, La/i890;->i:B

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
    invoke-virtual {p0, p1, p2}, La/i890;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/i890;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/i890;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/i890;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/i890;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/i890;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/i890;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/i890;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/i890;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/i890;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/i890;->k:La/j890;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, La/wne;->a:La/wne;

    .line 12
    .line 13
    iget-boolean v4, p0, La/i890;->j:Z

    .line 14
    .line 15
    const/4 v10, 0x1

    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    if-ne v4, v10, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

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
    iput-boolean v10, p0, La/i890;->j:Z

    .line 32
    .line 33
    const-wide/16 v3, 0x7d0

    .line 34
    .line 35
    invoke-static {v3, v4, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-ne p0, v0, :cond_2

    .line 40
    .line 41
    move-object v3, v0

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    sget p0, La/j890;->x:I

    .line 44
    .line 45
    iget-object p0, v2, La/i3t0;->i:La/ocj;

    .line 46
    .line 47
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 48
    .line 49
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-object p1, v2, La/i3t0;->f:La/oyg0;

    .line 57
    .line 58
    move-object v5, p0

    .line 59
    check-cast v5, La/d890;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    const/4 v9, 0x0

    .line 65
    const/16 v11, 0x1f

    .line 66
    .line 67
    const/4 v6, 0x0

    .line 68
    const-wide/16 v7, 0x0

    .line 69
    .line 70
    invoke-static/range {v5 .. v11}, La/d890;->a(La/d890;Ljava/util/Map;JLa/c890;ZI)La/d890;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-eqz p0, :cond_3

    .line 79
    .line 80
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    :goto_1
    return-object v3

    .line 83
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 84
    .line 85
    iget-boolean v4, p0, La/i890;->j:Z

    .line 86
    .line 87
    const/4 v5, 0x1

    .line 88
    if-eqz v4, :cond_5

    .line 89
    .line 90
    if-ne v4, v5, :cond_4

    .line 91
    .line 92
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    iput-boolean v5, p0, La/i890;->j:Z

    .line 104
    .line 105
    const-wide/16 v3, 0xbb8

    .line 106
    .line 107
    invoke-static {v3, v4, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    if-ne p0, v0, :cond_6

    .line 112
    .line 113
    move-object v3, v0

    .line 114
    goto :goto_3

    .line 115
    :cond_6
    :goto_2
    sget p0, La/j890;->x:I

    .line 116
    .line 117
    iget-object p0, v2, La/i3t0;->i:La/ocj;

    .line 118
    .line 119
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 120
    .line 121
    :cond_7
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-object v1, p0

    .line 129
    check-cast v1, La/d890;

    .line 130
    .line 131
    iget-wide v2, v1, La/d890;->d:J

    .line 132
    .line 133
    const-wide/16 v4, 0x1

    .line 134
    .line 135
    add-long v3, v2, v4

    .line 136
    .line 137
    const/4 v6, 0x0

    .line 138
    const/16 v7, 0x37

    .line 139
    .line 140
    const/4 v2, 0x0

    .line 141
    const/4 v5, 0x0

    .line 142
    invoke-static/range {v1 .. v7}, La/d890;->a(La/d890;Ljava/util/Map;JLa/c890;ZI)La/d890;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    if-eqz p0, :cond_7

    .line 151
    .line 152
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    :goto_3
    return-object v3

    .line 155
    :pswitch_1
    iget-boolean p0, p0, La/i890;->j:Z

    .line 156
    .line 157
    sget-object v0, La/wne;->a:La/wne;

    .line 158
    .line 159
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    iget-boolean p1, v2, La/j890;->w:Z

    .line 163
    .line 164
    const/4 v0, 0x0

    .line 165
    iput-boolean v0, v2, La/j890;->w:Z

    .line 166
    .line 167
    if-eqz p0, :cond_9

    .line 168
    .line 169
    if-nez p1, :cond_9

    .line 170
    .line 171
    iput v0, v2, La/j890;->v:I

    .line 172
    .line 173
    iget-object p0, v2, La/j890;->u:La/bby;

    .line 174
    .line 175
    if-eqz p0, :cond_8

    .line 176
    .line 177
    invoke-interface {p0, v3}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 178
    .line 179
    .line 180
    :cond_8
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    iget-object p0, v2, La/j890;->q:La/mne;

    .line 185
    .line 186
    iget-object v7, p0, La/mne;->a:La/rwj;

    .line 187
    .line 188
    new-instance v5, La/ev80;

    .line 189
    .line 190
    const/16 p0, 0xd

    .line 191
    .line 192
    invoke-direct {v5, p0}, La/ev80;-><init>(B)V

    .line 193
    .line 194
    .line 195
    new-instance v8, La/h890;

    .line 196
    .line 197
    invoke-direct {v8, v2, v3, v0}, La/h890;-><init>(La/j890;La/yje;B)V

    .line 198
    .line 199
    .line 200
    const/16 v9, 0xa

    .line 201
    .line 202
    const/4 v6, 0x0

    .line 203
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 204
    .line 205
    .line 206
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object p0

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
