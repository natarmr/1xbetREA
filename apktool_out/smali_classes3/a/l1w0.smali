.class public final La/l1w0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/o1w0;


# direct methods
.method public synthetic constructor <init>(La/o1w0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/l1w0;->i:B

    iput-object p1, p0, La/l1w0;->k:La/o1w0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/l1w0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/l1w0;->k:La/o1w0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/l1w0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/l1w0;-><init>(La/o1w0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/l1w0;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/l1w0;-><init>(La/o1w0;La/yje;B)V

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
    iput-boolean p0, v0, La/l1w0;->j:Z

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
    iget-byte v0, p0, La/l1w0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/l1w0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/l1w0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/l1w0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/l1w0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/l1w0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/l1w0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 5

    .line 1
    iget-byte v0, p0, La/l1w0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/l1w0;->k:La/o1w0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/wne;->a:La/wne;

    .line 10
    .line 11
    iget-boolean v3, p0, La/l1w0;->j:Z

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    if-ne v3, v4, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

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
    iget-object p1, v2, La/o1w0;->c:La/pru;

    .line 32
    .line 33
    invoke-virtual {p1}, La/pru;->a()La/sff0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object v1, v2, La/o1w0;->b:La/jru;

    .line 38
    .line 39
    iget-object v3, p1, La/sff0;->k:La/f3c0;

    .line 40
    .line 41
    iget-boolean v3, v3, La/f3c0;->h:Z

    .line 42
    .line 43
    iget-object p1, p1, La/sff0;->N:La/co4;

    .line 44
    .line 45
    iget-object p1, p1, La/co4;->r:Ljava/util/List;

    .line 46
    .line 47
    iput-boolean v4, p0, La/l1w0;->j:Z

    .line 48
    .line 49
    invoke-virtual {v1, p0, p1, v3}, La/jru;->d(La/zje;Ljava/util/List;Z)Ljava/io/Serializable;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-ne p1, v0, :cond_2

    .line 54
    .line 55
    move-object v1, v0

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    :goto_0
    move-object v0, p1

    .line 58
    check-cast v0, Ljava/util/List;

    .line 59
    .line 60
    iget-object v3, v2, La/o1w0;->g:La/p7m0;

    .line 61
    .line 62
    :cond_3
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    move-object p1, p0

    .line 67
    check-cast p1, La/j1w0;

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    invoke-static {p1, v1, v0, v4}, La/j1w0;->a(La/j1w0;ZLjava/util/List;I)La/j1w0;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {v3, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-eqz p0, :cond_3

    .line 79
    .line 80
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    :goto_1
    return-object v1

    .line 83
    :pswitch_0
    iget-boolean p0, p0, La/l1w0;->j:Z

    .line 84
    .line 85
    sget-object v0, La/wne;->a:La/wne;

    .line 86
    .line 87
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object p1, v2, La/o1w0;->g:La/p7m0;

    .line 91
    .line 92
    :cond_4
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    move-object v2, v0

    .line 97
    check-cast v2, La/j1w0;

    .line 98
    .line 99
    const/4 v3, 0x2

    .line 100
    invoke-static {v2, p0, v1, v3}, La/j1w0;->a(La/j1w0;ZLjava/util/List;I)La/j1w0;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {p1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object p0

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
