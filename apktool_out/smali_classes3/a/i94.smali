.class public final La/i94;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/l94;

.field public k:Z


# direct methods
.method public synthetic constructor <init>(La/l94;La/yje;B)V
    .locals 0

    .line 13
    iput-byte p3, p0, La/i94;->i:B

    iput-object p1, p0, La/i94;->j:La/l94;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/l94;ZLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/i94;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/i94;->j:La/l94;

    .line 5
    .line 6
    iput-boolean p2, p0, La/i94;->k:Z

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/i94;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/i94;->j:La/l94;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, La/i94;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p0, v1, p2, v0}, La/i94;-><init>(La/l94;La/yje;B)V

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
    move-result p1

    .line 20
    iput-boolean p1, p0, La/i94;->k:Z

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    new-instance p1, La/i94;

    .line 24
    .line 25
    iget-boolean p0, p0, La/i94;->k:Z

    .line 26
    .line 27
    invoke-direct {p1, v1, p0, p2}, La/i94;-><init>(La/l94;ZLa/yje;)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_1
    new-instance p0, La/i94;

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    invoke-direct {p0, v1, p2, p1}, La/i94;-><init>(La/l94;La/yje;B)V

    .line 35
    .line 36
    .line 37
    return-object p0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/i94;->i:B

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
    invoke-virtual {p0, p1, p2}, La/i94;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/i94;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/i94;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/i94;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/i94;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/i94;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/i94;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/i94;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/i94;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

    .line 1
    iget-byte v0, p0, La/i94;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/i94;->j:La/l94;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-boolean v5, p0, La/i94;->k:Z

    .line 9
    .line 10
    sget-object p0, La/wne;->a:La/wne;

    .line 11
    .line 12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    if-eqz v5, :cond_0

    .line 16
    .line 17
    sget p0, La/l94;->y:I

    .line 18
    .line 19
    invoke-virtual {v1}, La/l94;->N()V

    .line 20
    .line 21
    .line 22
    :cond_0
    sget p0, La/l94;->y:I

    .line 23
    .line 24
    iget-object p0, v1, La/i3t0;->i:La/ocj;

    .line 25
    .line 26
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 27
    .line 28
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-object v2, p0

    .line 36
    check-cast v2, La/d94;

    .line 37
    .line 38
    const/4 v7, 0x0

    .line 39
    const/16 v8, 0x1b

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v6, 0x0

    .line 44
    invoke-static/range {v2 .. v8}, La/d94;->a(La/d94;Ljava/util/List;Ljava/util/List;ZLjava/lang/Throwable;ZI)La/d94;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_1

    .line 53
    .line 54
    if-nez v5, :cond_2

    .line 55
    .line 56
    sget-object p0, La/u84;->a:La/u84;

    .line 57
    .line 58
    invoke-virtual {v1, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 65
    .line 66
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, v1, La/l94;->s:La/ctf0;

    .line 70
    .line 71
    iget-boolean p0, p0, La/i94;->k:Z

    .line 72
    .line 73
    if-eqz p0, :cond_3

    .line 74
    .line 75
    const v0, 0x7f1311fa

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    const v0, 0x7f1311f5

    .line 80
    .line 81
    .line 82
    :goto_0
    const/4 v2, 0x0

    .line 83
    new-array v3, v2, [Ljava/lang/Object;

    .line 84
    .line 85
    iget-object p1, p1, La/ctf0;->b:La/lsm0;

    .line 86
    .line 87
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {p1, v0, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    if-eqz p0, :cond_4

    .line 96
    .line 97
    sget-object p0, La/qek0;->a:La/qek0;

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    sget-object p0, La/rek0;->b:La/rek0;

    .line 101
    .line 102
    :goto_1
    new-instance v0, La/x84;

    .line 103
    .line 104
    invoke-direct {v0, p0, p1}, La/x84;-><init>(La/sek0;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object p0

    .line 113
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 114
    .line 115
    iget-boolean v2, p0, La/i94;->k:Z

    .line 116
    .line 117
    const/4 v3, 0x0

    .line 118
    const/4 v4, 0x1

    .line 119
    if-eqz v2, :cond_6

    .line 120
    .line 121
    if-ne v2, v4, :cond_5

    .line 122
    .line 123
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_5
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 128
    .line 129
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    move-object v0, v3

    .line 133
    goto :goto_3

    .line 134
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    iget-object p1, v1, La/l94;->t:La/mne;

    .line 138
    .line 139
    iget-object p1, p1, La/mne;->c:La/vs10;

    .line 140
    .line 141
    new-instance v2, La/y32;

    .line 142
    .line 143
    const/16 v5, 0x14

    .line 144
    .line 145
    invoke-direct {v2, v1, v3, v5}, La/y32;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 146
    .line 147
    .line 148
    iput-boolean v4, p0, La/i94;->k:Z

    .line 149
    .line 150
    invoke-static {p1, v2, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    if-ne p0, v0, :cond_7

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_7
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    :goto_3
    return-object v0

    .line 160
    nop

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
