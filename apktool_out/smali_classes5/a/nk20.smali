.class public final La/nk20;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/nn20;

.field public final synthetic l:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/nn20;Ljava/lang/String;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/nk20;->i:B

    iput-object p1, p0, La/nk20;->k:La/nn20;

    iput-object p2, p0, La/nk20;->l:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/nk20;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/nk20;->l:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, La/nk20;->k:La/nn20;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/nk20;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/nk20;-><init>(La/nn20;Ljava/lang/String;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/nk20;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/nk20;-><init>(La/nn20;Ljava/lang/String;La/yje;B)V

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
    iget-byte v0, p0, La/nk20;->i:B

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
    invoke-virtual {p0, p1, p2}, La/nk20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/nk20;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/nk20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/nk20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/nk20;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/nk20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/nk20;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/nk20;->l:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    iget-object v4, p0, La/nk20;->k:La/nn20;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, p0, La/nk20;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v5, :cond_0

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
    iget-object p1, v4, La/nn20;->v:La/f3c;

    .line 34
    .line 35
    iput-boolean v5, p0, La/nk20;->j:Z

    .line 36
    .line 37
    invoke-virtual {p1, p0}, La/f3c;->a(La/yje;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v0, :cond_2

    .line 42
    .line 43
    move-object v2, v0

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    :goto_0
    check-cast p1, La/m97;

    .line 46
    .line 47
    new-instance p0, La/mk20;

    .line 48
    .line 49
    invoke-direct {p0, v4, p1, v1, v5}, La/mk20;-><init>(La/nn20;La/m97;Ljava/lang/String;B)V

    .line 50
    .line 51
    .line 52
    sget p1, La/nn20;->c1:I

    .line 53
    .line 54
    invoke-virtual {v4, p0}, La/nn20;->I0(Lkotlin/jvm/functions/Function1;)La/bby;

    .line 55
    .line 56
    .line 57
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    :goto_1
    return-object v2

    .line 60
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 61
    .line 62
    iget-boolean v6, p0, La/nk20;->j:Z

    .line 63
    .line 64
    if-eqz v6, :cond_4

    .line 65
    .line 66
    if-ne v6, v5, :cond_3

    .line 67
    .line 68
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object p1, v4, La/nn20;->v:La/f3c;

    .line 80
    .line 81
    iput-boolean v5, p0, La/nk20;->j:Z

    .line 82
    .line 83
    invoke-virtual {p1, p0}, La/f3c;->a(La/yje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-ne p1, v0, :cond_5

    .line 88
    .line 89
    move-object v2, v0

    .line 90
    goto :goto_3

    .line 91
    :cond_5
    :goto_2
    check-cast p1, La/m97;

    .line 92
    .line 93
    new-instance p0, La/mk20;

    .line 94
    .line 95
    const/4 v0, 0x0

    .line 96
    invoke-direct {p0, v4, p1, v1, v0}, La/mk20;-><init>(La/nn20;La/m97;Ljava/lang/String;B)V

    .line 97
    .line 98
    .line 99
    sget p1, La/nn20;->c1:I

    .line 100
    .line 101
    invoke-virtual {v4, p0}, La/nn20;->I0(Lkotlin/jvm/functions/Function1;)La/bby;

    .line 102
    .line 103
    .line 104
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    :goto_3
    return-object v2

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
