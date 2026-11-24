.class public final La/tej0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:Lorg/xplatform/settings/impl/presentation/a;

.field public final synthetic l:Z


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/settings/impl/presentation/a;ZLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/tej0;->i:B

    iput-object p1, p0, La/tej0;->k:Lorg/xplatform/settings/impl/presentation/a;

    iput-boolean p2, p0, La/tej0;->l:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/tej0;->i:B

    .line 2
    .line 3
    iget-boolean v0, p0, La/tej0;->l:Z

    .line 4
    .line 5
    iget-object p0, p0, La/tej0;->k:Lorg/xplatform/settings/impl/presentation/a;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/tej0;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/tej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;ZLa/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/tej0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/tej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;ZLa/yje;B)V

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
    iget-byte v0, p0, La/tej0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/tej0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/tej0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/tej0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/tej0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/tej0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/tej0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 12

    .line 1
    iget-byte v0, p0, La/tej0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/wne;->a:La/wne;

    .line 11
    .line 12
    iget-boolean v4, p0, La/tej0;->j:Z

    .line 13
    .line 14
    iget-object v6, p0, La/tej0;->k:Lorg/xplatform/settings/impl/presentation/a;

    .line 15
    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    if-ne v4, v3, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

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
    iget-object p1, v6, Lorg/xplatform/settings/impl/presentation/a;->f:La/ahu;

    .line 32
    .line 33
    iput-boolean v3, p0, La/tej0;->j:Z

    .line 34
    .line 35
    invoke-static {p1, p0}, La/ahu;->c(La/ahu;La/yje;)Ljava/io/Serializable;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    move-object v1, v0

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    check-cast p1, La/ql5;

    .line 44
    .line 45
    iget-wide v7, p1, La/ql5;->a:J

    .line 46
    .line 47
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object p1, v6, Lorg/xplatform/settings/impl/presentation/a;->s:La/mne;

    .line 52
    .line 53
    iget-object v3, p1, La/mne;->b:La/dvj;

    .line 54
    .line 55
    new-instance v1, La/kej0;

    .line 56
    .line 57
    const/16 p1, 0xb

    .line 58
    .line 59
    invoke-direct {v1, v6, p1}, La/kej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;B)V

    .line 60
    .line 61
    .line 62
    new-instance v4, La/qej0;

    .line 63
    .line 64
    const/4 v10, 0x0

    .line 65
    iget-boolean v9, p0, La/tej0;->l:Z

    .line 66
    .line 67
    move-object v5, v4

    .line 68
    invoke-direct/range {v5 .. v10}, La/qej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;JZLa/yje;)V

    .line 69
    .line 70
    .line 71
    const/16 v5, 0xa

    .line 72
    .line 73
    const/4 v2, 0x0

    .line 74
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 75
    .line 76
    .line 77
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    :goto_1
    return-object v1

    .line 80
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 81
    .line 82
    iget-boolean v4, p0, La/tej0;->j:Z

    .line 83
    .line 84
    const/4 v5, 0x0

    .line 85
    iget-object v7, p0, La/tej0;->k:Lorg/xplatform/settings/impl/presentation/a;

    .line 86
    .line 87
    if-eqz v4, :cond_4

    .line 88
    .line 89
    if-ne v4, v3, :cond_3

    .line 90
    .line 91
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iget-object p1, v7, Lorg/xplatform/settings/impl/presentation/a;->s0:La/nhf0;

    .line 103
    .line 104
    iput-boolean v3, p0, La/tej0;->j:Z

    .line 105
    .line 106
    invoke-virtual {p1, v5, v3, p0}, La/nhf0;->f(ZZLa/yje;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-ne p1, v0, :cond_5

    .line 111
    .line 112
    move-object v1, v0

    .line 113
    goto :goto_4

    .line 114
    :cond_5
    :goto_2
    check-cast p1, La/gm3;

    .line 115
    .line 116
    iget-object v8, p1, La/gm3;->a:Ljava/lang/String;

    .line 117
    .line 118
    iget-boolean v9, p1, La/gm3;->b:Z

    .line 119
    .line 120
    iget-object v10, p1, La/gm3;->c:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    iget-boolean p0, p0, La/tej0;->l:Z

    .line 127
    .line 128
    if-lez p1, :cond_6

    .line 129
    .line 130
    invoke-virtual {v7, v3}, Lorg/xplatform/settings/impl/presentation/a;->M(Z)V

    .line 131
    .line 132
    .line 133
    if-eqz p0, :cond_8

    .line 134
    .line 135
    iget-object p0, v7, Lorg/xplatform/settings/impl/presentation/a;->k:La/i1w0;

    .line 136
    .line 137
    new-instance v6, La/t13;

    .line 138
    .line 139
    const/16 v11, 0x17

    .line 140
    .line 141
    invoke-direct/range {v6 .. v11}, La/t13;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;B)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, v6}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_6
    if-eqz p0, :cond_7

    .line 149
    .line 150
    iget-boolean p0, v7, Lorg/xplatform/settings/impl/presentation/a;->O0:Z

    .line 151
    .line 152
    if-eqz p0, :cond_7

    .line 153
    .line 154
    invoke-virtual {v7}, Lorg/xplatform/settings/impl/presentation/a;->L()V

    .line 155
    .line 156
    .line 157
    iget p0, v7, Lorg/xplatform/settings/impl/presentation/a;->P0:I

    .line 158
    .line 159
    add-int/2addr p0, v3

    .line 160
    iput p0, v7, Lorg/xplatform/settings/impl/presentation/a;->P0:I

    .line 161
    .line 162
    :cond_7
    iput-boolean v3, v7, Lorg/xplatform/settings/impl/presentation/a;->O0:Z

    .line 163
    .line 164
    invoke-virtual {v7, v5}, Lorg/xplatform/settings/impl/presentation/a;->M(Z)V

    .line 165
    .line 166
    .line 167
    :cond_8
    :goto_3
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    :goto_4
    return-object v1

    .line 170
    nop

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
