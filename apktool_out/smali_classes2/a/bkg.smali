.class public final La/bkg;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/xk80;

.field public final synthetic l:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/xk80;La/pz40;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/bkg;->i:B

    iput-object p1, p0, La/bkg;->k:La/xk80;

    iput-object p2, p0, La/bkg;->l:La/pz40;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/bkg;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, La/bkg;

    .line 7
    .line 8
    iget-object v0, p0, La/bkg;->l:La/pz40;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iget-object p0, p0, La/bkg;->k:La/xk80;

    .line 12
    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/bkg;-><init>(La/xk80;La/pz40;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/bkg;

    .line 18
    .line 19
    iget-object v0, p0, La/bkg;->l:La/pz40;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iget-object p0, p0, La/bkg;->k:La/xk80;

    .line 23
    .line 24
    invoke-direct {p1, p0, v0, p2, v1}, La/bkg;-><init>(La/xk80;La/pz40;La/yje;B)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/bkg;->i:B

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
    invoke-virtual {p0, p1, p2}, La/bkg;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/bkg;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/bkg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/bkg;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/bkg;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/bkg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/bkg;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/bkg;->l:La/pz40;

    .line 4
    .line 5
    iget-object v2, p0, La/bkg;->k:La/xk80;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, p0, La/bkg;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v4, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    new-instance p1, La/s39;

    .line 34
    .line 35
    const/16 v3, 0x9

    .line 36
    .line 37
    invoke-direct {p1, v2, v3}, La/s39;-><init>(La/xk80;B)V

    .line 38
    .line 39
    .line 40
    invoke-static {v5, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    new-instance v2, La/yy0;

    .line 45
    .line 46
    invoke-direct {v2, v1, v3}, La/yy0;-><init>(La/pz40;B)V

    .line 47
    .line 48
    .line 49
    iput-boolean v4, p0, La/bkg;->j:Z

    .line 50
    .line 51
    invoke-virtual {p1, v2, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-ne p0, v0, :cond_2

    .line 56
    .line 57
    move-object v5, v0

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    :goto_0
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    :goto_1
    return-object v5

    .line 62
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 63
    .line 64
    iget-boolean v6, p0, La/bkg;->j:Z

    .line 65
    .line 66
    if-eqz v6, :cond_4

    .line 67
    .line 68
    if-ne v6, v4, :cond_3

    .line 69
    .line 70
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    new-instance p1, La/s39;

    .line 82
    .line 83
    const/4 v3, 0x2

    .line 84
    invoke-direct {p1, v2, v3}, La/s39;-><init>(La/xk80;B)V

    .line 85
    .line 86
    .line 87
    invoke-static {v5, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    new-instance v2, La/yy0;

    .line 92
    .line 93
    const/4 v3, 0x6

    .line 94
    invoke-direct {v2, v1, v3}, La/yy0;-><init>(La/pz40;B)V

    .line 95
    .line 96
    .line 97
    iput-boolean v4, p0, La/bkg;->j:Z

    .line 98
    .line 99
    invoke-virtual {p1, v2, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    if-ne p0, v0, :cond_5

    .line 104
    .line 105
    move-object v5, v0

    .line 106
    goto :goto_3

    .line 107
    :cond_5
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    :goto_3
    return-object v5

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
