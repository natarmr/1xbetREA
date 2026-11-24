.class public final La/l980;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/aa80;


# direct methods
.method public synthetic constructor <init>(La/aa80;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/l980;->i:B

    iput-object p1, p0, La/l980;->k:La/aa80;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/l980;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/l980;->k:La/aa80;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/l980;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/l980;-><init>(La/aa80;La/yje;B)V

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
    iput-boolean p0, v0, La/l980;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/l980;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/l980;-><init>(La/aa80;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/l980;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/l980;-><init>(La/aa80;La/yje;B)V

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
    iget-byte v0, p0, La/l980;->i:B

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
    invoke-virtual {p0, p1, p2}, La/l980;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/l980;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/l980;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/l980;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/l980;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/l980;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/l980;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/l980;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/l980;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 14

    .line 1
    iget-byte v0, p0, La/l980;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, La/l980;->k:La/aa80;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-boolean p0, p0, La/l980;->j:Z

    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    iget-object p0, v3, La/aa80;->w:La/bby;

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    invoke-interface {p0}, La/bby;->isCancelled()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-ne p0, v4, :cond_0

    .line 30
    .line 31
    invoke-virtual {v3}, La/aa80;->x()V

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object p0, v3, La/aa80;->x:La/bby;

    .line 35
    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    invoke-interface {p0}, La/bby;->isCancelled()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-ne p0, v4, :cond_1

    .line 43
    .line 44
    invoke-virtual {v3}, La/aa80;->w()V

    .line 45
    .line 46
    .line 47
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 51
    .line 52
    iget-boolean v5, p0, La/l980;->j:Z

    .line 53
    .line 54
    if-eqz v5, :cond_3

    .line 55
    .line 56
    if-ne v5, v4, :cond_2

    .line 57
    .line 58
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, v3, La/aa80;->k:La/es;

    .line 70
    .line 71
    iget-object v1, v3, La/aa80;->u:La/k0j0;

    .line 72
    .line 73
    iget-object v2, v1, La/k0j0;->b:Ljava/util/List;

    .line 74
    .line 75
    iget-object v1, v1, La/k0j0;->c:Ljava/util/List;

    .line 76
    .line 77
    iput-boolean v4, p0, La/l980;->j:Z

    .line 78
    .line 79
    invoke-virtual {p1, v2, v1, p0}, La/es;->p(Ljava/util/List;Ljava/util/List;La/zje;)Ljava/io/Serializable;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-ne p1, v0, :cond_4

    .line 84
    .line 85
    move-object v2, v0

    .line 86
    goto :goto_1

    .line 87
    :cond_4
    :goto_0
    check-cast p1, La/qkt;

    .line 88
    .line 89
    iget p0, p1, La/qkt;->a:I

    .line 90
    .line 91
    const/4 v0, -0x1

    .line 92
    if-eq p0, v0, :cond_6

    .line 93
    .line 94
    iget-object p0, v3, La/aa80;->z:La/p7m0;

    .line 95
    .line 96
    :cond_5
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    move-object v5, v0

    .line 101
    check-cast v5, La/d980;

    .line 102
    .line 103
    invoke-static {p1, v4}, La/mbc;->e0(La/qkt;Z)La/a980;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    const/4 v12, 0x0

    .line 108
    const/16 v13, 0x77

    .line 109
    .line 110
    const/4 v6, 0x0

    .line 111
    const/4 v7, 0x0

    .line 112
    const/4 v8, 0x0

    .line 113
    const/4 v10, 0x0

    .line 114
    const/4 v11, 0x0

    .line 115
    invoke-static/range {v5 .. v13}, La/d980;->a(La/d980;ZLjava/lang/String;La/c980;La/a980;La/b980;ZZI)La/d980;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {p0, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_5

    .line 124
    .line 125
    :cond_6
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    :goto_1
    return-object v2

    .line 128
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 129
    .line 130
    iget-boolean v5, p0, La/l980;->j:Z

    .line 131
    .line 132
    if-eqz v5, :cond_8

    .line 133
    .line 134
    if-ne v5, v4, :cond_7

    .line 135
    .line 136
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_7
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    iget-object p1, v3, La/aa80;->n:La/ivn;

    .line 148
    .line 149
    iput-boolean v4, p0, La/l980;->j:Z

    .line 150
    .line 151
    iget-object p1, p1, La/ivn;->a:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast p1, La/ju9;

    .line 154
    .line 155
    iget-object v1, p1, La/ju9;->c:La/mne;

    .line 156
    .line 157
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 158
    .line 159
    new-instance v5, La/hu9;

    .line 160
    .line 161
    invoke-direct {v5, p1, v2, v4}, La/hu9;-><init>(La/ju9;La/yje;B)V

    .line 162
    .line 163
    .line 164
    invoke-static {v1, v5, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    if-ne p1, v0, :cond_9

    .line 169
    .line 170
    move-object v2, v0

    .line 171
    goto :goto_3

    .line 172
    :cond_9
    :goto_2
    check-cast p1, Ljava/util/List;

    .line 173
    .line 174
    iget-object p0, v3, La/aa80;->o:La/p4u;

    .line 175
    .line 176
    invoke-virtual {p0, p1}, La/p4u;->c(Ljava/util/List;)La/bt9;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    iget-object v0, v3, La/aa80;->z:La/p7m0;

    .line 181
    .line 182
    :cond_a
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    move-object v2, v1

    .line 187
    check-cast v2, La/d980;

    .line 188
    .line 189
    iget-object v3, v2, La/d980;->e:La/b980;

    .line 190
    .line 191
    new-instance v7, La/b980;

    .line 192
    .line 193
    invoke-direct {v7, p1, p0}, La/b980;-><init>(Ljava/util/List;La/bt9;)V

    .line 194
    .line 195
    .line 196
    const/4 v9, 0x0

    .line 197
    const/16 v10, 0xf

    .line 198
    .line 199
    const/4 v3, 0x0

    .line 200
    const/4 v4, 0x0

    .line 201
    const/4 v5, 0x0

    .line 202
    const/4 v6, 0x0

    .line 203
    const/4 v8, 0x0

    .line 204
    invoke-static/range {v2 .. v10}, La/d980;->a(La/d980;ZLjava/lang/String;La/c980;La/a980;La/b980;ZZI)La/d980;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    if-eqz v1, :cond_a

    .line 213
    .line 214
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    :goto_3
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
