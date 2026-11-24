.class public final La/spq0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/tpq0;


# direct methods
.method public synthetic constructor <init>(La/tpq0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/spq0;->i:B

    iput-object p1, p0, La/spq0;->k:La/tpq0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/spq0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/spq0;->k:La/tpq0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/spq0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/spq0;-><init>(La/tpq0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/spq0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/spq0;-><init>(La/tpq0;La/yje;B)V

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
    iget-byte v0, p0, La/spq0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/spq0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/spq0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/spq0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/spq0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/spq0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/spq0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 6

    .line 1
    iget-byte v0, p0, La/spq0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/spq0;->k:La/tpq0;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/spq0;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v3, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

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
    iput-boolean v3, p0, La/spq0;->j:Z

    .line 32
    .line 33
    const-wide/16 v2, 0x12c

    .line 34
    .line 35
    invoke-static {v2, v3, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-ne p0, v0, :cond_2

    .line 40
    .line 41
    move-object v4, v0

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    iget-object p0, v1, La/tpq0;->l:La/p7m0;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    sget-object p1, La/ppq0;->a:La/ppq0;

    .line 49
    .line 50
    invoke-virtual {p0, v4, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    :goto_1
    return-object v4

    .line 56
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 57
    .line 58
    iget-boolean v5, p0, La/spq0;->j:Z

    .line 59
    .line 60
    if-eqz v5, :cond_4

    .line 61
    .line 62
    if-ne v5, v3, :cond_3

    .line 63
    .line 64
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object p1, v1, La/tpq0;->h:La/m1e;

    .line 76
    .line 77
    invoke-interface {p1}, La/m1e;->b()La/gmq;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {p1, v3}, La/dtb;->z(La/gmq;I)La/lnq;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    new-instance v2, La/mmq0;

    .line 86
    .line 87
    const/4 v4, 0x3

    .line 88
    invoke-direct {v2, v1, v4}, La/mmq0;-><init>(Ljava/lang/Object;B)V

    .line 89
    .line 90
    .line 91
    iput-boolean v3, p0, La/spq0;->j:Z

    .line 92
    .line 93
    invoke-virtual {p1, v2, p0}, La/lnq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    if-ne p0, v0, :cond_5

    .line 98
    .line 99
    move-object v4, v0

    .line 100
    goto :goto_3

    .line 101
    :cond_5
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    :goto_3
    return-object v4

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
