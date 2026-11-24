.class public final La/ck90;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/kk90;


# direct methods
.method public synthetic constructor <init>(La/kk90;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ck90;->i:B

    iput-object p1, p0, La/ck90;->k:La/kk90;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ck90;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ck90;->k:La/kk90;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/ck90;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/ck90;-><init>(La/kk90;La/yje;B)V

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
    iput-boolean p0, v0, La/ck90;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/ck90;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/ck90;-><init>(La/kk90;La/yje;B)V

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
    iget-byte v0, p0, La/ck90;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ck90;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/ck90;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/ck90;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/ck90;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/ck90;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/ck90;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/ck90;->i:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/ck90;->k:La/kk90;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-boolean p0, p0, La/ck90;->j:Z

    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    iget-object p0, v2, La/kk90;->H:La/bby;

    .line 20
    .line 21
    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    iget-object p0, v2, La/kk90;->m:La/mne;

    .line 29
    .line 30
    iget-object v7, p0, La/mne;->b:La/dvj;

    .line 31
    .line 32
    new-instance v5, La/hj90;

    .line 33
    .line 34
    invoke-direct {v5, v2, v1}, La/hj90;-><init>(La/kk90;B)V

    .line 35
    .line 36
    .line 37
    new-instance v6, La/pl70;

    .line 38
    .line 39
    const/16 p0, 0x10

    .line 40
    .line 41
    invoke-direct {v6, v2, p0}, La/pl70;-><init>(Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    new-instance v8, La/mt00;

    .line 45
    .line 46
    const/16 p0, 0x1d

    .line 47
    .line 48
    invoke-direct {v8, v2, v3, p0}, La/mt00;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 49
    .line 50
    .line 51
    const/16 v9, 0x8

    .line 52
    .line 53
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    iput-object p0, v2, La/kk90;->H:La/bby;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    if-nez p0, :cond_1

    .line 61
    .line 62
    iget-boolean p0, v2, La/kk90;->F:Z

    .line 63
    .line 64
    if-eqz p0, :cond_1

    .line 65
    .line 66
    invoke-virtual {v2}, La/kk90;->H()V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    iget-object p0, v2, La/kk90;->C:La/p7m0;

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    sget-object p1, La/pj90;->a:La/pj90;

    .line 76
    .line 77
    invoke-virtual {p0, v3, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 84
    .line 85
    iget-boolean v4, p0, La/ck90;->j:Z

    .line 86
    .line 87
    if-eqz v4, :cond_3

    .line 88
    .line 89
    if-ne v4, v1, :cond_2

    .line 90
    .line 91
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 96
    .line 97
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    iget-object p1, v2, La/kk90;->u:La/ywq0;

    .line 105
    .line 106
    iget-object v3, p1, La/ywq0;->b:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v3, La/zg;

    .line 109
    .line 110
    iget-object v3, v3, La/zg;->a:La/kt2;

    .line 111
    .line 112
    const-string v4, "screen"

    .line 113
    .line 114
    const-string v5, "acc_personal"

    .line 115
    .line 116
    const-string v6, "acc_change_password_call"

    .line 117
    .line 118
    invoke-static {v4, v5, v3, v6}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    iget-object p1, p1, La/ywq0;->f:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p1, La/au0;

    .line 124
    .line 125
    iget-object p1, p1, La/au0;->a:La/s1p;

    .line 126
    .line 127
    const-wide/16 v3, 0xca8

    .line 128
    .line 129
    invoke-static {v5, p1, v3, v4}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 130
    .line 131
    .line 132
    iput-boolean v1, p0, La/ck90;->j:Z

    .line 133
    .line 134
    const/4 p1, 0x0

    .line 135
    invoke-virtual {v2, p1, p0}, La/kk90;->x(ZLa/zje;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    if-ne p0, v0, :cond_4

    .line 140
    .line 141
    move-object v3, v0

    .line 142
    goto :goto_2

    .line 143
    :cond_4
    :goto_1
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    :goto_2
    return-object v3

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
