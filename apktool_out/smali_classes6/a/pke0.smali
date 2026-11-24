.class public final La/pke0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/qke0;


# direct methods
.method public synthetic constructor <init>(La/qke0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/pke0;->i:B

    iput-object p1, p0, La/pke0;->k:La/qke0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/pke0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/pke0;->k:La/qke0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/pke0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/pke0;-><init>(La/qke0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/pke0;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/pke0;-><init>(La/qke0;La/yje;B)V

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
    iput-boolean p0, v0, La/pke0;->j:Z

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
    iget-byte v0, p0, La/pke0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/pke0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/pke0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/pke0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/pke0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/pke0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/pke0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    iget-byte v0, p0, La/pke0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, La/pke0;->k:La/qke0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/wne;->a:La/wne;

    .line 11
    .line 12
    iget-boolean v4, p0, La/pke0;->j:Z

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    if-eqz v4, :cond_1

    .line 16
    .line 17
    if-ne v4, v2, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    move-object v0, v5

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, v3, La/qke0;->o:La/b8u;

    .line 34
    .line 35
    iget-object v4, v3, La/qke0;->s:Ljava/lang/String;

    .line 36
    .line 37
    iput-boolean v2, p0, La/pke0;->j:Z

    .line 38
    .line 39
    iget-object p1, p1, La/b8u;->a:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, La/nvu;

    .line 42
    .line 43
    iget-object v2, p1, La/nvu;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v2, La/mne;

    .line 46
    .line 47
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 48
    .line 49
    new-instance v6, La/oed;

    .line 50
    .line 51
    const/16 v7, 0x12

    .line 52
    .line 53
    invoke-direct {v6, p1, v4, v5, v7}, La/oed;-><init>(Ljava/lang/Object;Ljava/lang/String;La/yje;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {v2, v6, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p1, v0, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    :goto_0
    move-object v0, p1

    .line 64
    check-cast v0, La/qje0;

    .line 65
    .line 66
    sget p0, La/qke0;->u:I

    .line 67
    .line 68
    iget-object p0, v3, La/i3t0;->i:La/ocj;

    .line 69
    .line 70
    iget-object v4, p0, La/ocj;->a:La/p7m0;

    .line 71
    .line 72
    :cond_3
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-object p1, p0

    .line 80
    check-cast p1, La/ike0;

    .line 81
    .line 82
    new-instance p1, La/ike0;

    .line 83
    .line 84
    invoke-direct {p1, v1, v1, v0}, La/ike0;-><init>(ZZLa/qje0;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-eqz p0, :cond_3

    .line 92
    .line 93
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    :goto_1
    return-object v0

    .line 96
    :pswitch_0
    iget-boolean p0, p0, La/pke0;->j:Z

    .line 97
    .line 98
    sget-object v0, La/wne;->a:La/wne;

    .line 99
    .line 100
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    if-nez p0, :cond_4

    .line 104
    .line 105
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    check-cast p1, La/ike0;

    .line 110
    .line 111
    iget-boolean p1, p1, La/ike0;->a:Z

    .line 112
    .line 113
    if-eqz p1, :cond_4

    .line 114
    .line 115
    move p1, v2

    .line 116
    goto :goto_2

    .line 117
    :cond_4
    move p1, v1

    .line 118
    :goto_2
    if-eqz p0, :cond_5

    .line 119
    .line 120
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    check-cast p0, La/ike0;

    .line 125
    .line 126
    iget-boolean p0, p0, La/ike0;->b:Z

    .line 127
    .line 128
    if-eqz p0, :cond_5

    .line 129
    .line 130
    move v1, v2

    .line 131
    :cond_5
    if-nez p1, :cond_6

    .line 132
    .line 133
    if-eqz v1, :cond_7

    .line 134
    .line 135
    :cond_6
    sget p0, La/qke0;->u:I

    .line 136
    .line 137
    invoke-virtual {v3}, La/qke0;->M()V

    .line 138
    .line 139
    .line 140
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 141
    .line 142
    return-object p0

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
