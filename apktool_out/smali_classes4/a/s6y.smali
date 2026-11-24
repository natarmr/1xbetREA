.class public final La/s6y;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/t6y;

.field public k:Z


# direct methods
.method public constructor <init>(La/t6y;La/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/s6y;->i:B

    .line 13
    iput-object p1, p0, La/s6y;->j:La/t6y;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/t6y;ZLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/s6y;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/s6y;->j:La/t6y;

    .line 5
    .line 6
    iput-boolean p2, p0, La/s6y;->k:Z

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
    .locals 1

    .line 1
    iget-byte p1, p0, La/s6y;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/s6y;->j:La/t6y;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/s6y;

    .line 9
    .line 10
    iget-boolean p0, p0, La/s6y;->k:Z

    .line 11
    .line 12
    invoke-direct {p1, v0, p0, p2}, La/s6y;-><init>(La/t6y;ZLa/yje;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    new-instance p0, La/s6y;

    .line 17
    .line 18
    invoke-direct {p0, v0, p2}, La/s6y;-><init>(La/t6y;La/yje;)V

    .line 19
    .line 20
    .line 21
    return-object p0

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
    iget-byte v0, p0, La/s6y;->i:B

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
    invoke-virtual {p0, p1, p2}, La/s6y;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/s6y;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/s6y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/s6y;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/s6y;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/s6y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 11

    .line 1
    iget-byte v0, p0, La/s6y;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    sget-object v0, La/wne;->a:La/wne;

    .line 8
    .line 9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-boolean p1, p0, La/s6y;->k:Z

    .line 13
    .line 14
    iget-object v4, p0, La/s6y;->j:La/t6y;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-boolean p0, v4, La/t6y;->m:Z

    .line 19
    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iget-object v0, v4, La/t6y;->h:La/mne;

    .line 27
    .line 28
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 29
    .line 30
    new-instance v2, La/g1y;

    .line 31
    .line 32
    const/4 v8, 0x0

    .line 33
    const/16 v9, 0x9

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    const-class v5, La/t6y;

    .line 37
    .line 38
    const-string v6, "handleErrorWithLottie"

    .line 39
    .line 40
    const-string v7, "handleErrorWithLottie(Ljava/lang/Throwable;)V"

    .line 41
    .line 42
    invoke-direct/range {v2 .. v9}, La/g1y;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 43
    .line 44
    .line 45
    new-instance v9, La/fhq;

    .line 46
    .line 47
    const/16 v3, 0x12

    .line 48
    .line 49
    invoke-direct {v9, v4, v1, v3}, La/fhq;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 50
    .line 51
    .line 52
    const/16 v10, 0xa

    .line 53
    .line 54
    const/4 v7, 0x0

    .line 55
    move-object v5, p0

    .line 56
    move-object v8, v0

    .line 57
    move-object v6, v2

    .line 58
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 59
    .line 60
    .line 61
    iget-object p0, v4, La/t6y;->o:La/p7m0;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    sget-object v0, La/m6y;->a:La/m6y;

    .line 67
    .line 68
    invoke-virtual {p0, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    if-nez p1, :cond_1

    .line 73
    .line 74
    iget-boolean p0, v4, La/t6y;->m:Z

    .line 75
    .line 76
    if-nez p0, :cond_1

    .line 77
    .line 78
    iget-object v5, v4, La/t6y;->e:La/sa10;

    .line 79
    .line 80
    sget-object v6, La/pb10;->g:La/pb10;

    .line 81
    .line 82
    const/4 v9, 0x0

    .line 83
    const/16 v10, 0x1c

    .line 84
    .line 85
    const v7, 0x7f130677

    .line 86
    .line 87
    .line 88
    const/4 v8, 0x0

    .line 89
    invoke-static/range {v5 .. v10}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 90
    .line 91
    .line 92
    :cond_1
    :goto_0
    iput-boolean p1, v4, La/t6y;->m:Z

    .line 93
    .line 94
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 98
    .line 99
    iget-boolean v2, p0, La/s6y;->k:Z

    .line 100
    .line 101
    iget-object v3, p0, La/s6y;->j:La/t6y;

    .line 102
    .line 103
    const/4 v4, 0x1

    .line 104
    if-eqz v2, :cond_3

    .line 105
    .line 106
    if-ne v2, v4, :cond_2

    .line 107
    .line 108
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 113
    .line 114
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    iget-object p1, v3, La/t6y;->j:La/abu;

    .line 122
    .line 123
    iput-boolean v4, p0, La/s6y;->k:Z

    .line 124
    .line 125
    invoke-virtual {p1, p0}, La/abu;->w(La/zje;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-ne p1, v0, :cond_4

    .line 130
    .line 131
    move-object v1, v0

    .line 132
    goto :goto_3

    .line 133
    :cond_4
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    iget-object p1, v3, La/t6y;->q:La/ol60;

    .line 140
    .line 141
    if-nez p0, :cond_5

    .line 142
    .line 143
    sget-object p0, La/l6y;->b:La/l6y;

    .line 144
    .line 145
    invoke-virtual {p1, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_5
    sget-object p0, La/l6y;->a:La/l6y;

    .line 150
    .line 151
    invoke-virtual {p1, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :goto_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 155
    .line 156
    :goto_3
    return-object v1

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
