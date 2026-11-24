.class public final La/jfd;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/kfd;


# direct methods
.method public synthetic constructor <init>(La/kfd;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/jfd;->i:B

    iput-object p1, p0, La/jfd;->k:La/kfd;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/jfd;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/jfd;->k:La/kfd;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/jfd;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/jfd;-><init>(La/kfd;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/jfd;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/jfd;-><init>(La/kfd;La/yje;B)V

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
    iput-boolean p0, v0, La/jfd;->j:Z

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
    iget-byte v0, p0, La/jfd;->i:B

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
    invoke-virtual {p0, p1, p2}, La/jfd;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/jfd;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/jfd;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/jfd;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/jfd;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/jfd;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 7

    .line 1
    iget-byte v0, p0, La/jfd;->i:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/jfd;->k:La/kfd;

    .line 5
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
    iget-boolean v4, p0, La/jfd;->j:Z

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    if-eqz v4, :cond_1

    .line 16
    .line 17
    if-ne v4, v1, :cond_0

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
    iget-object p1, v2, La/kfd;->p:La/bwl;

    .line 34
    .line 35
    iget-object v4, v2, La/kfd;->s:Ljava/lang/String;

    .line 36
    .line 37
    iput-boolean v1, p0, La/jfd;->j:Z

    .line 38
    .line 39
    iget-object p1, p1, La/bwl;->a:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, La/lhf0;

    .line 42
    .line 43
    iget-object v1, p1, La/lhf0;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, La/mne;

    .line 46
    .line 47
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 48
    .line 49
    new-instance v6, La/oed;

    .line 50
    .line 51
    invoke-direct {v6, p1, v4, v5, v3}, La/oed;-><init>(Ljava/lang/Object;Ljava/lang/String;La/yje;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v6, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-ne p1, v0, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    :goto_0
    move-object v0, p1

    .line 62
    check-cast v0, Ljava/util/List;

    .line 63
    .line 64
    sget p0, La/kfd;->w:I

    .line 65
    .line 66
    iget-object p0, v2, La/i3t0;->i:La/ocj;

    .line 67
    .line 68
    iget-object v4, p0, La/ocj;->a:La/p7m0;

    .line 69
    .line 70
    :cond_3
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-object p1, p0

    .line 78
    check-cast p1, La/sed;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    new-instance p1, La/sed;

    .line 84
    .line 85
    invoke-direct {p1, v0, v3, v3}, La/sed;-><init>(Ljava/util/List;ZZ)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-eqz p0, :cond_3

    .line 93
    .line 94
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    :goto_1
    return-object v0

    .line 97
    :pswitch_0
    iget-boolean p0, p0, La/jfd;->j:Z

    .line 98
    .line 99
    sget-object v0, La/wne;->a:La/wne;

    .line 100
    .line 101
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    if-nez p0, :cond_4

    .line 105
    .line 106
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    check-cast p1, La/sed;

    .line 111
    .line 112
    iget-boolean p1, p1, La/sed;->a:Z

    .line 113
    .line 114
    if-eqz p1, :cond_4

    .line 115
    .line 116
    move p1, v1

    .line 117
    goto :goto_2

    .line 118
    :cond_4
    move p1, v3

    .line 119
    :goto_2
    if-eqz p0, :cond_5

    .line 120
    .line 121
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    check-cast p0, La/sed;

    .line 126
    .line 127
    iget-boolean p0, p0, La/sed;->b:Z

    .line 128
    .line 129
    if-eqz p0, :cond_5

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_5
    move v1, v3

    .line 133
    :goto_3
    if-nez p1, :cond_6

    .line 134
    .line 135
    if-eqz v1, :cond_7

    .line 136
    .line 137
    :cond_6
    sget p0, La/kfd;->w:I

    .line 138
    .line 139
    invoke-virtual {v2}, La/kfd;->M()V

    .line 140
    .line 141
    .line 142
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    return-object p0

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
