.class public final La/pi3;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/ij3;

.field public final synthetic k:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/ij3;Ljava/lang/String;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/pi3;->i:B

    iput-object p1, p0, La/pi3;->j:La/ij3;

    iput-object p2, p0, La/pi3;->k:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/pi3;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/pi3;->k:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, La/pi3;->j:La/ij3;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/pi3;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/pi3;-><init>(La/ij3;Ljava/lang/String;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/pi3;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/pi3;-><init>(La/ij3;Ljava/lang/String;La/yje;B)V

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
    iget-byte v0, p0, La/pi3;->i:B

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
    invoke-virtual {p0, p1, p2}, La/pi3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/pi3;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/pi3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/pi3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/pi3;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/pi3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, p0, La/pi3;->i:B

    .line 2
    .line 3
    const/16 v2, 0x1d

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/wne;->a:La/wne;

    .line 11
    .line 12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v6, p0, La/pi3;->j:La/ij3;

    .line 16
    .line 17
    invoke-virtual {v6}, La/ij3;->y()La/sff0;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v1, v1, La/sff0;->R0:La/tm3;

    .line 22
    .line 23
    iget-object v1, v1, La/tm3;->d:La/qm3;

    .line 24
    .line 25
    sget-object v5, La/qm3;->d:La/qm3;

    .line 26
    .line 27
    if-ne v1, v5, :cond_0

    .line 28
    .line 29
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 30
    .line 31
    if-lt v1, v2, :cond_0

    .line 32
    .line 33
    move v8, v3

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v8, v4

    .line 36
    :goto_0
    invoke-virtual {v6}, La/ij3;->y()La/sff0;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v1, v1, La/sff0;->R0:La/tm3;

    .line 41
    .line 42
    iget-object v1, v1, La/tm3;->d:La/qm3;

    .line 43
    .line 44
    sget-object v2, La/qm3;->c:La/qm3;

    .line 45
    .line 46
    if-ne v1, v2, :cond_1

    .line 47
    .line 48
    move v9, v3

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move v9, v4

    .line 51
    :goto_1
    if-nez v8, :cond_2

    .line 52
    .line 53
    if-nez v9, :cond_2

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget-object v2, v6, La/ij3;->e:La/mne;

    .line 61
    .line 62
    iget-object v3, v2, La/mne;->c:La/vs10;

    .line 63
    .line 64
    move-object v2, v1

    .line 65
    sget-object v1, La/zi3;->a:La/zi3;

    .line 66
    .line 67
    new-instance v4, La/yi3;

    .line 68
    .line 69
    const/4 v10, 0x0

    .line 70
    const/4 v11, 0x1

    .line 71
    iget-object v7, p0, La/pi3;->k:Ljava/lang/String;

    .line 72
    .line 73
    move-object v5, v4

    .line 74
    invoke-direct/range {v5 .. v11}, La/yi3;-><init>(La/ij3;Ljava/lang/String;ZZLa/yje;B)V

    .line 75
    .line 76
    .line 77
    const/16 v5, 0xa

    .line 78
    .line 79
    move-object v0, v2

    .line 80
    const/4 v2, 0x0

    .line 81
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 82
    .line 83
    .line 84
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object v0

    .line 87
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 88
    .line 89
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object v6, p0, La/pi3;->j:La/ij3;

    .line 93
    .line 94
    invoke-virtual {v6}, La/ij3;->y()La/sff0;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    iget-object v1, v1, La/sff0;->Q0:La/hh3;

    .line 99
    .line 100
    iget-object v1, v1, La/hh3;->b:La/eh3;

    .line 101
    .line 102
    sget-object v5, La/eh3;->d:La/eh3;

    .line 103
    .line 104
    if-ne v1, v5, :cond_3

    .line 105
    .line 106
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 107
    .line 108
    if-lt v1, v2, :cond_3

    .line 109
    .line 110
    move v8, v3

    .line 111
    goto :goto_3

    .line 112
    :cond_3
    move v8, v4

    .line 113
    :goto_3
    invoke-virtual {v6}, La/ij3;->y()La/sff0;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iget-object v1, v1, La/sff0;->Q0:La/hh3;

    .line 118
    .line 119
    iget-object v1, v1, La/hh3;->b:La/eh3;

    .line 120
    .line 121
    sget-object v2, La/eh3;->c:La/eh3;

    .line 122
    .line 123
    if-ne v1, v2, :cond_4

    .line 124
    .line 125
    move v9, v3

    .line 126
    goto :goto_4

    .line 127
    :cond_4
    move v9, v4

    .line 128
    :goto_4
    if-nez v8, :cond_5

    .line 129
    .line 130
    if-nez v9, :cond_5

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_5
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    iget-object v2, v6, La/ij3;->e:La/mne;

    .line 138
    .line 139
    iget-object v3, v2, La/mne;->c:La/vs10;

    .line 140
    .line 141
    move-object v2, v1

    .line 142
    sget-object v1, La/xi3;->a:La/xi3;

    .line 143
    .line 144
    new-instance v4, La/yi3;

    .line 145
    .line 146
    const/4 v10, 0x0

    .line 147
    const/4 v11, 0x0

    .line 148
    iget-object v7, p0, La/pi3;->k:Ljava/lang/String;

    .line 149
    .line 150
    move-object v5, v4

    .line 151
    invoke-direct/range {v5 .. v11}, La/yi3;-><init>(La/ij3;Ljava/lang/String;ZZLa/yje;B)V

    .line 152
    .line 153
    .line 154
    const/16 v5, 0xa

    .line 155
    .line 156
    move-object v0, v2

    .line 157
    const/4 v2, 0x0

    .line 158
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 159
    .line 160
    .line 161
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 162
    .line 163
    return-object v0

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
