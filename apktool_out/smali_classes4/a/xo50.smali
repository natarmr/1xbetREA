.class public final La/xo50;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/xk80;

.field public final synthetic l:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(La/xk80;Lkotlin/jvm/functions/Function0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/xo50;->i:B

    iput-object p1, p0, La/xo50;->k:La/xk80;

    iput-object p2, p0, La/xo50;->l:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/xo50;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, La/xo50;

    .line 7
    .line 8
    iget-object v0, p0, La/xo50;->l:Lkotlin/jvm/functions/Function0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iget-object p0, p0, La/xo50;->k:La/xk80;

    .line 12
    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/xo50;-><init>(La/xk80;Lkotlin/jvm/functions/Function0;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/xo50;

    .line 18
    .line 19
    iget-object v0, p0, La/xo50;->l:Lkotlin/jvm/functions/Function0;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iget-object p0, p0, La/xo50;->k:La/xk80;

    .line 23
    .line 24
    invoke-direct {p1, p0, v0, p2, v1}, La/xo50;-><init>(La/xk80;Lkotlin/jvm/functions/Function0;La/yje;B)V

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
    iget-byte v0, p0, La/xo50;->i:B

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
    invoke-virtual {p0, p1, p2}, La/xo50;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/xo50;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/xo50;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/xo50;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/xo50;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/xo50;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/xo50;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/xo50;->l:Lkotlin/jvm/functions/Function0;

    .line 4
    .line 5
    iget-object v2, p0, La/xo50;->k:La/xk80;

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
    iget-boolean v6, p0, La/xo50;->j:Z

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
    const/16 v3, 0x19

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
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance v2, La/wo50;

    .line 49
    .line 50
    const/4 v3, 0x2

    .line 51
    invoke-direct {v2, v1, v3}, La/wo50;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 52
    .line 53
    .line 54
    iput-boolean v4, p0, La/xo50;->j:Z

    .line 55
    .line 56
    invoke-interface {p1, v2, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-ne p0, v0, :cond_2

    .line 61
    .line 62
    move-object v5, v0

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    :goto_0
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    :goto_1
    return-object v5

    .line 67
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 68
    .line 69
    iget-boolean v6, p0, La/xo50;->j:Z

    .line 70
    .line 71
    if-eqz v6, :cond_4

    .line 72
    .line 73
    if-ne v6, v4, :cond_3

    .line 74
    .line 75
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-object p1, v2, La/xk80;->p:La/gy40;

    .line 89
    .line 90
    iget-object p1, p1, La/gy40;->a:La/qoj0;

    .line 91
    .line 92
    new-instance v2, La/wo50;

    .line 93
    .line 94
    const/4 v3, 0x0

    .line 95
    invoke-direct {v2, v1, v3}, La/wo50;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 96
    .line 97
    .line 98
    iput-boolean v4, p0, La/xo50;->j:Z

    .line 99
    .line 100
    invoke-virtual {p1, v2, p0}, La/qoj0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-object v5, v0

    .line 104
    :goto_2
    return-object v5

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
