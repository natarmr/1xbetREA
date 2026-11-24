.class public final La/vxh;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/wxh;


# direct methods
.method public synthetic constructor <init>(La/wxh;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/vxh;->i:B

    iput-object p1, p0, La/vxh;->k:La/wxh;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/vxh;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/vxh;->k:La/wxh;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/vxh;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/vxh;-><init>(La/wxh;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/vxh;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/vxh;-><init>(La/wxh;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/vxh;->i:B

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
    invoke-virtual {p0, p1, p2}, La/vxh;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/vxh;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/vxh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/vxh;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/vxh;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/vxh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 14

    .line 1
    iget-byte v0, p0, La/vxh;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, La/vxh;->k:La/wxh;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v3, La/i3t0;->f:La/oyg0;

    .line 13
    .line 14
    iget-object v5, v3, La/i3t0;->i:La/ocj;

    .line 15
    .line 16
    sget-object v6, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v7, p0, La/vxh;->j:Z

    .line 19
    .line 20
    if-eqz v7, :cond_1

    .line 21
    .line 22
    if-ne v7, v2, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, v3, La/wxh;->p:La/ivn;

    .line 36
    .line 37
    iget-object v1, v3, La/wxh;->u:Ljava/lang/String;

    .line 38
    .line 39
    iput-boolean v2, p0, La/vxh;->j:Z

    .line 40
    .line 41
    iget-object p1, p1, La/ivn;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, La/axh;

    .line 44
    .line 45
    iget-object v2, p1, La/axh;->c:La/mne;

    .line 46
    .line 47
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 48
    .line 49
    new-instance v3, La/oed;

    .line 50
    .line 51
    const/4 v7, 0x3

    .line 52
    invoke-direct {v3, p1, v1, v4, v7}, La/oed;-><init>(Ljava/lang/Object;Ljava/lang/String;La/yje;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {v2, v3, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-ne p1, v6, :cond_2

    .line 60
    .line 61
    move-object v4, v6

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    :goto_0
    move-object v10, p1

    .line 64
    check-cast v10, La/zwh;

    .line 65
    .line 66
    iget-object p0, v10, La/zwh;->b:Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-eqz p0, :cond_4

    .line 73
    .line 74
    sget p0, La/wxh;->v:I

    .line 75
    .line 76
    iget-object p0, v5, La/ocj;->a:La/p7m0;

    .line 77
    .line 78
    :cond_3
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-object v1, p1

    .line 86
    check-cast v1, La/oxh;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    const-wide/16 v6, 0x0

    .line 92
    .line 93
    const/16 v8, 0x18

    .line 94
    .line 95
    const/4 v2, 0x0

    .line 96
    const/4 v3, 0x0

    .line 97
    const/4 v4, 0x1

    .line 98
    const/4 v5, 0x0

    .line 99
    invoke-static/range {v1 .. v8}, La/oxh;->a(La/oxh;ZZZLa/zwh;JI)La/oxh;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {p0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-eqz p1, :cond_3

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    sget p0, La/wxh;->v:I

    .line 111
    .line 112
    iget-object v0, v5, La/ocj;->a:La/p7m0;

    .line 113
    .line 114
    :cond_5
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-object v6, p0

    .line 122
    check-cast v6, La/oxh;

    .line 123
    .line 124
    const-wide/16 v11, 0x0

    .line 125
    .line 126
    const/16 v13, 0x10

    .line 127
    .line 128
    const/4 v7, 0x0

    .line 129
    const/4 v8, 0x0

    .line 130
    const/4 v9, 0x0

    .line 131
    invoke-static/range {v6 .. v13}, La/oxh;->a(La/oxh;ZZZLa/zwh;JI)La/oxh;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    if-eqz p0, :cond_5

    .line 140
    .line 141
    :goto_1
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    :goto_2
    return-object v4

    .line 144
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 145
    .line 146
    iget-boolean v5, p0, La/vxh;->j:Z

    .line 147
    .line 148
    if-eqz v5, :cond_7

    .line 149
    .line 150
    if-ne v5, v2, :cond_6

    .line 151
    .line 152
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_6
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    iget-object p1, v3, La/wxh;->q:La/m1e;

    .line 164
    .line 165
    invoke-interface {p1}, La/m1e;->b()La/gmq;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    new-instance v1, La/b5h;

    .line 170
    .line 171
    const/4 v4, 0x6

    .line 172
    invoke-direct {v1, v3, v4}, La/b5h;-><init>(Ljava/lang/Object;B)V

    .line 173
    .line 174
    .line 175
    iput-boolean v2, p0, La/vxh;->j:Z

    .line 176
    .line 177
    invoke-interface {p1, v1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    if-ne p0, v0, :cond_8

    .line 182
    .line 183
    move-object v4, v0

    .line 184
    goto :goto_4

    .line 185
    :cond_8
    :goto_3
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 186
    .line 187
    :goto_4
    return-object v4

    .line 188
    nop

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
