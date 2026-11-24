.class public final La/p2w;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/r2w;


# direct methods
.method public synthetic constructor <init>(La/r2w;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/p2w;->i:B

    iput-object p1, p0, La/p2w;->k:La/r2w;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/p2w;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/p2w;->k:La/r2w;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/p2w;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/p2w;-><init>(La/r2w;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/p2w;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/p2w;-><init>(La/r2w;La/yje;B)V

    .line 19
    .line 20
    .line 21
    check-cast p1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    iput-boolean p0, v0, La/p2w;->j:Z

    .line 28
    .line 29
    return-object v0

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
    iget-byte v0, p0, La/p2w;->i:B

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
    invoke-virtual {p0, p1, p2}, La/p2w;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/p2w;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/p2w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/p2w;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/p2w;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/p2w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/p2w;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/p2w;->k:La/r2w;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/wne;->a:La/wne;

    .line 11
    .line 12
    iget-boolean v4, p0, La/p2w;->j:Z

    .line 13
    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    if-ne v4, v2, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v4, v1, La/r2w;->g:La/vkr0;

    .line 32
    .line 33
    invoke-virtual {v1}, La/r2w;->w()La/n3w;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object v5, p1, La/n3w;->a:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v1}, La/r2w;->w()La/n3w;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-object v6, p1, La/n3w;->c:La/s77;

    .line 44
    .line 45
    invoke-virtual {v1}, La/r2w;->w()La/n3w;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object v7, p1, La/n3w;->g:Ljava/lang/String;

    .line 50
    .line 51
    iget-wide v9, v1, La/r2w;->c:J

    .line 52
    .line 53
    iput-boolean v2, p0, La/p2w;->j:Z

    .line 54
    .line 55
    const/4 v8, 0x1

    .line 56
    move-object v11, p0

    .line 57
    invoke-virtual/range {v4 .. v11}, La/vkr0;->q(Ljava/lang/String;La/s77;Ljava/lang/String;ZJLa/zje;)Ljava/io/Serializable;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-ne p1, v0, :cond_2

    .line 62
    .line 63
    move-object v3, v0

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    :goto_0
    check-cast p1, La/n3w;

    .line 66
    .line 67
    invoke-virtual {v1, p1}, La/r2w;->G(La/n3w;)V

    .line 68
    .line 69
    .line 70
    iget-object p0, p1, La/n3w;->J1:Ljava/util/List;

    .line 71
    .line 72
    invoke-static {p0}, La/r2w;->A(Ljava/util/List;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-eqz p0, :cond_3

    .line 77
    .line 78
    sget-object p0, La/e4f;->l:La/e4f;

    .line 79
    .line 80
    sget-object p1, La/e4f;->m:La/e4f;

    .line 81
    .line 82
    sget-object v0, La/e4f;->g:La/e4f;

    .line 83
    .line 84
    sget-object v2, La/e4f;->j:La/e4f;

    .line 85
    .line 86
    filled-new-array {p0, p1, v0, v2}, [La/e4f;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {v1}, La/r2w;->w()La/n3w;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iget-object p1, p1, La/n3w;->l:La/e4f;

    .line 99
    .line 100
    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    if-nez p0, :cond_3

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_3
    iget-object p0, v1, La/r2w;->C:La/bby;

    .line 108
    .line 109
    invoke-interface {p0, v3}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 110
    .line 111
    .line 112
    :goto_1
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    :goto_2
    return-object v3

    .line 115
    :pswitch_0
    move-object v11, p0

    .line 116
    iget-boolean p0, v11, La/p2w;->j:Z

    .line 117
    .line 118
    sget-object v0, La/wne;->a:La/wne;

    .line 119
    .line 120
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    iget-object p1, v1, La/r2w;->A:La/p7m0;

    .line 124
    .line 125
    invoke-static {p0, p1, v3}, La/twn;->A(ZLa/p7m0;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    iget-object p1, v1, La/r2w;->y:La/p7m0;

    .line 129
    .line 130
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    check-cast v0, La/d3w;

    .line 135
    .line 136
    iget-boolean v0, v0, La/d3w;->f:Z

    .line 137
    .line 138
    if-eqz v0, :cond_4

    .line 139
    .line 140
    if-eqz p0, :cond_8

    .line 141
    .line 142
    invoke-virtual {v1, v2}, La/r2w;->B(Z)V

    .line 143
    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_4
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, La/d3w;

    .line 151
    .line 152
    iget-boolean v3, v0, La/d3w;->d:Z

    .line 153
    .line 154
    if-nez v3, :cond_6

    .line 155
    .line 156
    iget-boolean v0, v0, La/d3w;->e:Z

    .line 157
    .line 158
    if-eqz v0, :cond_5

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_5
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    check-cast p0, La/d3w;

    .line 166
    .line 167
    iget-boolean p0, p0, La/d3w;->d:Z

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_6
    :goto_3
    if-eqz p0, :cond_7

    .line 171
    .line 172
    invoke-virtual {v1, v2}, La/r2w;->B(Z)V

    .line 173
    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_7
    invoke-virtual {v1}, La/r2w;->D()V

    .line 177
    .line 178
    .line 179
    :cond_8
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 180
    .line 181
    return-object p0

    .line 182
    nop

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
