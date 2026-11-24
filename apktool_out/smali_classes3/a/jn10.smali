.class public final La/jn10;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/pn10;

.field public final synthetic l:La/csr;


# direct methods
.method public synthetic constructor <init>(La/pn10;La/csr;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/jn10;->i:B

    iput-object p1, p0, La/jn10;->k:La/pn10;

    iput-object p2, p0, La/jn10;->l:La/csr;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/jn10;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/jn10;->l:La/csr;

    .line 4
    .line 5
    iget-object p0, p0, La/jn10;->k:La/pn10;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/jn10;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/jn10;-><init>(La/pn10;La/csr;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/jn10;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/jn10;-><init>(La/pn10;La/csr;La/yje;B)V

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
    iget-byte v0, p0, La/jn10;->i:B

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
    invoke-virtual {p0, p1, p2}, La/jn10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/jn10;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/jn10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/jn10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/jn10;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/jn10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/jn10;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/wne;->a:La/wne;

    .line 11
    .line 12
    iget-boolean v4, p0, La/jn10;->j:Z

    .line 13
    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    if-ne v4, v3, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v8, p0, La/jn10;->l:La/csr;

    .line 30
    .line 31
    iget-object p1, v8, La/csr;->a:La/bsr;

    .line 32
    .line 33
    iget-wide v6, p1, La/bsr;->b:J

    .line 34
    .line 35
    iput-boolean v3, p0, La/jn10;->j:Z

    .line 36
    .line 37
    sget p1, La/pn10;->e0:I

    .line 38
    .line 39
    iget-object v5, p0, La/jn10;->k:La/pn10;

    .line 40
    .line 41
    const/4 v9, 0x1

    .line 42
    move-object v10, p0

    .line 43
    invoke-virtual/range {v5 .. v10}, La/pn10;->V(JLa/csr;ZLa/zje;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-ne p0, v0, :cond_2

    .line 48
    .line 49
    move-object v1, v0

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    :goto_0
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    :goto_1
    return-object v1

    .line 54
    :pswitch_0
    move-object v7, p0

    .line 55
    sget-object p0, La/wne;->a:La/wne;

    .line 56
    .line 57
    iget-boolean v0, v7, La/jn10;->j:Z

    .line 58
    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    if-ne v0, v3, :cond_3

    .line 62
    .line 63
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object v5, v7, La/jn10;->l:La/csr;

    .line 75
    .line 76
    iget-object p1, v5, La/csr;->a:La/bsr;

    .line 77
    .line 78
    iget-wide v0, p1, La/bsr;->b:J

    .line 79
    .line 80
    iput-boolean v3, v7, La/jn10;->j:Z

    .line 81
    .line 82
    sget p1, La/pn10;->e0:I

    .line 83
    .line 84
    iget-object v2, v7, La/jn10;->k:La/pn10;

    .line 85
    .line 86
    const/4 v6, 0x0

    .line 87
    move-wide v3, v0

    .line 88
    invoke-virtual/range {v2 .. v7}, La/pn10;->V(JLa/csr;ZLa/zje;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    if-ne p1, p0, :cond_5

    .line 93
    .line 94
    move-object v1, p0

    .line 95
    goto :goto_3

    .line 96
    :cond_5
    :goto_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    :goto_3
    return-object v1

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
