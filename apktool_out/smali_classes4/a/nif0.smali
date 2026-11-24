.class public final La/nif0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/oif0;

.field public final synthetic l:J


# direct methods
.method public synthetic constructor <init>(La/oif0;JLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/nif0;->i:B

    iput-object p1, p0, La/nif0;->k:La/oif0;

    iput-wide p2, p0, La/nif0;->l:J

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte v0, p0, La/nif0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, La/nif0;

    .line 7
    .line 8
    iget-wide v3, p0, La/nif0;->l:J

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    iget-object v2, p0, La/nif0;->k:La/oif0;

    .line 12
    .line 13
    move-object v5, p1

    .line 14
    invoke-direct/range {v1 .. v6}, La/nif0;-><init>(La/oif0;JLa/yje;B)V

    .line 15
    .line 16
    .line 17
    return-object v1

    .line 18
    :pswitch_0
    move-object v5, p1

    .line 19
    new-instance v2, La/nif0;

    .line 20
    .line 21
    move-object v6, v5

    .line 22
    iget-wide v4, p0, La/nif0;->l:J

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    iget-object v3, p0, La/nif0;->k:La/oif0;

    .line 26
    .line 27
    invoke-direct/range {v2 .. v7}, La/nif0;-><init>(La/oif0;JLa/yje;B)V

    .line 28
    .line 29
    .line 30
    return-object v2

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/nif0;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/nif0;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/nif0;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/nif0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/nif0;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/nif0;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/nif0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/nif0;->i:B

    .line 2
    .line 3
    iget-wide v1, p0, La/nif0;->l:J

    .line 4
    .line 5
    iget-object v3, p0, La/nif0;->k:La/oif0;

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v7, p0, La/nif0;->j:Z

    .line 17
    .line 18
    if-eqz v7, :cond_1

    .line 19
    .line 20
    if-ne v7, v6, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

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
    iget-object p1, v3, La/oif0;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, La/y3v;

    .line 36
    .line 37
    invoke-static {v1, v2}, La/cs0;->u(J)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iput-boolean v6, p0, La/nif0;->j:Z

    .line 42
    .line 43
    invoke-virtual {p1, v1, p0}, La/y3v;->x(Ljava/util/List;La/zje;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-ne p0, v0, :cond_2

    .line 48
    .line 49
    move-object v4, v0

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    :goto_1
    return-object v4

    .line 54
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 55
    .line 56
    iget-boolean v7, p0, La/nif0;->j:Z

    .line 57
    .line 58
    if-eqz v7, :cond_4

    .line 59
    .line 60
    if-ne v7, v6, :cond_3

    .line 61
    .line 62
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    move-object p1, v4

    .line 70
    goto :goto_2

    .line 71
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, v3, La/oif0;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, La/y3v;

    .line 77
    .line 78
    iput-boolean v6, p0, La/nif0;->j:Z

    .line 79
    .line 80
    iget-object p1, p1, La/y3v;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p1, La/y9n0;

    .line 83
    .line 84
    const/4 v3, 0x0

    .line 85
    invoke-virtual {p1, v1, v2, p0, v3}, La/y9n0;->a(JLa/zje;Z)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    if-ne p1, v0, :cond_5

    .line 90
    .line 91
    move-object p1, v0

    .line 92
    :cond_5
    :goto_2
    return-object p1

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
