.class public final La/jbu0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/lbu0;


# direct methods
.method public synthetic constructor <init>(La/lbu0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/jbu0;->i:B

    iput-object p1, p0, La/jbu0;->k:La/lbu0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/jbu0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/jbu0;->k:La/lbu0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/jbu0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/jbu0;-><init>(La/lbu0;La/yje;B)V

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
    iput-boolean p0, v0, La/jbu0;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/jbu0;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/jbu0;-><init>(La/lbu0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/jbu0;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/jbu0;-><init>(La/lbu0;La/yje;B)V

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
    iget-byte v0, p0, La/jbu0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/jbu0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/jbu0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/jbu0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/jbu0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/jbu0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/jbu0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/jbu0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/jbu0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/jbu0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 7

    .line 1
    iget-byte v0, p0, La/jbu0;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, La/jbu0;->k:La/lbu0;

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-boolean p0, p0, La/jbu0;->j:Z

    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, La/ebu0;

    .line 27
    .line 28
    iget-object p1, p1, La/ebu0;->c:La/x9u0;

    .line 29
    .line 30
    sget-object v0, La/x9u0;->a:La/x9u0;

    .line 31
    .line 32
    if-ne p1, v0, :cond_0

    .line 33
    .line 34
    move p1, v5

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move p1, v2

    .line 37
    :goto_0
    if-eqz p0, :cond_1

    .line 38
    .line 39
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, La/ebu0;

    .line 44
    .line 45
    iget-object p0, p0, La/ebu0;->c:La/x9u0;

    .line 46
    .line 47
    sget-object v0, La/x9u0;->c:La/x9u0;

    .line 48
    .line 49
    if-ne p0, v0, :cond_1

    .line 50
    .line 51
    move v2, v5

    .line 52
    :cond_1
    if-nez p1, :cond_2

    .line 53
    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    :cond_2
    sget-object p0, La/lbu0;->J:Ljava/util/List;

    .line 57
    .line 58
    invoke-virtual {v4}, La/lbu0;->N()V

    .line 59
    .line 60
    .line 61
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 65
    .line 66
    iget-boolean v2, p0, La/jbu0;->j:Z

    .line 67
    .line 68
    if-eqz v2, :cond_5

    .line 69
    .line 70
    if-ne v2, v5, :cond_4

    .line 71
    .line 72
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iput-boolean v5, p0, La/jbu0;->j:Z

    .line 84
    .line 85
    sget-object p1, La/lbu0;->J:Ljava/util/List;

    .line 86
    .line 87
    invoke-virtual {v4, v5, p0}, La/lbu0;->M(ZLa/zje;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-ne p1, v0, :cond_6

    .line 92
    .line 93
    move-object v3, v0

    .line 94
    goto :goto_2

    .line 95
    :cond_6
    :goto_1
    check-cast p1, La/m2c0;

    .line 96
    .line 97
    iget-object v0, p1, La/m2c0;->e0:La/cau0;

    .line 98
    .line 99
    sget-object p0, La/lbu0;->J:Ljava/util/List;

    .line 100
    .line 101
    iget-object p0, v4, La/i3t0;->i:La/ocj;

    .line 102
    .line 103
    iget-object v6, p0, La/ocj;->a:La/p7m0;

    .line 104
    .line 105
    :cond_7
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-object p1, p0

    .line 113
    check-cast p1, La/ebu0;

    .line 114
    .line 115
    const/16 v1, 0x3d

    .line 116
    .line 117
    invoke-static {p1, v0, v3, v1}, La/ebu0;->a(La/ebu0;La/cau0;La/x9u0;I)La/ebu0;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {v6, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    if-eqz p0, :cond_7

    .line 126
    .line 127
    sget-object p0, La/lbu0;->J:Ljava/util/List;

    .line 128
    .line 129
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, La/ebu0;

    .line 134
    .line 135
    iget-object p1, p1, La/ebu0;->b:La/cau0;

    .line 136
    .line 137
    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    if-nez p0, :cond_8

    .line 142
    .line 143
    iget-object p0, v4, La/lbu0;->G:La/bby;

    .line 144
    .line 145
    if-eqz p0, :cond_8

    .line 146
    .line 147
    invoke-interface {p0, v3}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 148
    .line 149
    .line 150
    :cond_8
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    :goto_2
    return-object v3

    .line 153
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 154
    .line 155
    iget-boolean v6, p0, La/jbu0;->j:Z

    .line 156
    .line 157
    if-eqz v6, :cond_a

    .line 158
    .line 159
    if-ne v6, v5, :cond_9

    .line 160
    .line 161
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_9
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    iget-object p1, v4, La/lbu0;->u:La/woc;

    .line 173
    .line 174
    iput-boolean v5, p0, La/jbu0;->j:Z

    .line 175
    .line 176
    invoke-virtual {p1, v2, p0}, La/woc;->a(ZLa/zje;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    if-ne p0, v0, :cond_b

    .line 181
    .line 182
    move-object v3, v0

    .line 183
    goto :goto_4

    .line 184
    :cond_b
    :goto_3
    sget-object p0, La/lbu0;->J:Ljava/util/List;

    .line 185
    .line 186
    sget-object p0, La/cbu0;->a:La/cbu0;

    .line 187
    .line 188
    invoke-virtual {v4, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    :goto_4
    return-object v3

    .line 194
    nop

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
