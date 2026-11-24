.class public final La/pc3;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/qc3;


# direct methods
.method public synthetic constructor <init>(La/qc3;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/pc3;->i:B

    iput-object p1, p0, La/pc3;->k:La/qc3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/pc3;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/pc3;->k:La/qc3;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/pc3;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/pc3;-><init>(La/qc3;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/pc3;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/pc3;-><init>(La/qc3;La/yje;B)V

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
    iget-byte v0, p0, La/pc3;->i:B

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
    invoke-virtual {p0, p1, p2}, La/pc3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/pc3;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/pc3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/pc3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/pc3;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/pc3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 7

    .line 1
    iget-byte v0, p0, La/pc3;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/pc3;->k:La/qc3;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/pc3;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v4, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

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
    iget-object p1, v1, La/qc3;->d:La/fxu;

    .line 32
    .line 33
    iget-object v1, v1, La/qc3;->f:La/p7m0;

    .line 34
    .line 35
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, La/mc3;

    .line 40
    .line 41
    iget-boolean v1, v1, La/mc3;->a:Z

    .line 42
    .line 43
    iput-boolean v4, p0, La/pc3;->j:Z

    .line 44
    .line 45
    invoke-virtual {p1, v1, p0}, La/fxu;->a(ZLa/bnn0;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    if-ne p0, v0, :cond_2

    .line 50
    .line 51
    move-object v2, v0

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    :goto_0
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    :goto_1
    return-object v2

    .line 56
    :pswitch_0
    iget-object v0, v1, La/qc3;->f:La/p7m0;

    .line 57
    .line 58
    sget-object v5, La/wne;->a:La/wne;

    .line 59
    .line 60
    iget-boolean v6, p0, La/pc3;->j:Z

    .line 61
    .line 62
    if-eqz v6, :cond_4

    .line 63
    .line 64
    if-ne v6, v4, :cond_3

    .line 65
    .line 66
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, La/mc3;

    .line 82
    .line 83
    iget-boolean p1, p1, La/mc3;->a:Z

    .line 84
    .line 85
    xor-int/2addr p1, v4

    .line 86
    :cond_5
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    move-object v3, v2

    .line 91
    check-cast v3, La/mc3;

    .line 92
    .line 93
    iget-boolean v6, v3, La/mc3;->b:Z

    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    new-instance v3, La/mc3;

    .line 99
    .line 100
    invoke-direct {v3, p1, v6}, La/mc3;-><init>(ZZ)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_5

    .line 108
    .line 109
    iget-object v0, v1, La/qc3;->d:La/fxu;

    .line 110
    .line 111
    iput-boolean v4, p0, La/pc3;->j:Z

    .line 112
    .line 113
    invoke-virtual {v0, p1, p0}, La/fxu;->a(ZLa/bnn0;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    if-ne p0, v5, :cond_6

    .line 118
    .line 119
    move-object v2, v5

    .line 120
    goto :goto_3

    .line 121
    :cond_6
    :goto_2
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    :goto_3
    return-object v2

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
