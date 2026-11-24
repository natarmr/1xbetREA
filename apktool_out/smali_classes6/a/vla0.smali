.class public final La/vla0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/cma0;


# direct methods
.method public synthetic constructor <init>(La/cma0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/vla0;->i:B

    iput-object p1, p0, La/vla0;->k:La/cma0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/vla0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/vla0;->k:La/cma0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/vla0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/vla0;-><init>(La/cma0;La/yje;B)V

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
    iput-boolean p0, v0, La/vla0;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/vla0;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/vla0;-><init>(La/cma0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/vla0;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/vla0;-><init>(La/cma0;La/yje;B)V

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
    iget-byte v0, p0, La/vla0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/vla0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/vla0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/vla0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/vla0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/vla0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/vla0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/vla0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/vla0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/vla0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 6

    .line 1
    iget-byte v0, p0, La/vla0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    iget-object v3, p0, La/vla0;->k:La/cma0;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-boolean p0, p0, La/vla0;->j:Z

    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, La/lla0;

    .line 27
    .line 28
    iget-boolean v0, v0, La/lla0;->k:Z

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    move v0, v4

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v0, p1

    .line 35
    :goto_0
    if-eqz p0, :cond_1

    .line 36
    .line 37
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, La/lla0;

    .line 42
    .line 43
    iget-boolean p0, p0, La/lla0;->l:Z

    .line 44
    .line 45
    if-eqz p0, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move v4, p1

    .line 49
    :goto_1
    if-nez v0, :cond_2

    .line 50
    .line 51
    if-eqz v4, :cond_3

    .line 52
    .line 53
    :cond_2
    sget p0, La/cma0;->M:I

    .line 54
    .line 55
    invoke-virtual {v3}, La/cma0;->N()V

    .line 56
    .line 57
    .line 58
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 62
    .line 63
    iget-boolean v5, p0, La/vla0;->j:Z

    .line 64
    .line 65
    if-eqz v5, :cond_5

    .line 66
    .line 67
    if-ne v5, v4, :cond_4

    .line 68
    .line 69
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, v3, La/cma0;->B:La/jwu;

    .line 81
    .line 82
    iget-object v1, v3, La/cma0;->o:Ljava/lang/String;

    .line 83
    .line 84
    iput-boolean v4, p0, La/vla0;->j:Z

    .line 85
    .line 86
    invoke-virtual {p1, v1, p0}, La/jwu;->b(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    if-ne p0, v0, :cond_6

    .line 91
    .line 92
    move-object v1, v0

    .line 93
    goto :goto_3

    .line 94
    :cond_6
    :goto_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    :goto_3
    return-object v1

    .line 97
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 98
    .line 99
    iget-boolean v5, p0, La/vla0;->j:Z

    .line 100
    .line 101
    if-eqz v5, :cond_8

    .line 102
    .line 103
    if-ne v5, v4, :cond_7

    .line 104
    .line 105
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_7
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    iget-object p1, v3, La/cma0;->B:La/jwu;

    .line 117
    .line 118
    iget-object v1, v3, La/cma0;->o:Ljava/lang/String;

    .line 119
    .line 120
    iput-boolean v4, p0, La/vla0;->j:Z

    .line 121
    .line 122
    invoke-virtual {p1, v1, p0}, La/jwu;->b(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    if-ne p0, v0, :cond_9

    .line 127
    .line 128
    move-object v1, v0

    .line 129
    goto :goto_5

    .line 130
    :cond_9
    :goto_4
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    :goto_5
    return-object v1

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
