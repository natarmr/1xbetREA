.class public final La/aix;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/dix;


# direct methods
.method public synthetic constructor <init>(La/dix;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/aix;->i:B

    iput-object p1, p0, La/aix;->j:La/dix;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/aix;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/aix;->j:La/dix;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/aix;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/aix;-><init>(La/dix;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/aix;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/aix;-><init>(La/dix;La/yje;B)V

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
    iget-byte v0, p0, La/aix;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/aix;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/aix;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/aix;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/aix;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/aix;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/aix;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/aix;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/aix;->j:La/dix;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/wne;->a:La/wne;

    .line 9
    .line 10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, La/dix;->x:La/owp0;

    .line 14
    .line 15
    sget-object v0, La/idf0;->a:La/idf0;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, La/owp0;->g(La/ldf0;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, La/dix;->u:La/ikt0;

    .line 21
    .line 22
    sget-object v0, La/lx7;->a:La/lx7;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, La/ikt0;->b(La/px7;)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, La/i3t0;->i:La/ocj;

    .line 28
    .line 29
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 30
    .line 31
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-object v1, p0

    .line 39
    check-cast v1, La/ohx;

    .line 40
    .line 41
    sget-object v3, La/iun;->a:La/iun;

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    const/16 v6, 0x75

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-static/range {v1 .. v6}, La/ohx;->a(La/ohx;Ljava/util/List;Ljava/util/List;La/l9s;La/aw20;I)La/ohx;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-eqz p0, :cond_0

    .line 57
    .line 58
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 62
    .line 63
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, La/dix;->r:La/x4u;

    .line 67
    .line 68
    iget-object p1, p1, La/x4u;->a:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, La/n9s;

    .line 71
    .line 72
    invoke-virtual {p1}, La/n9s;->a()La/i89;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    new-instance v0, La/u5u;

    .line 77
    .line 78
    const/4 v1, 0x0

    .line 79
    const/16 v2, 0x15

    .line 80
    .line 81
    invoke-direct {v0, p0, v1, v2}, La/u5u;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 82
    .line 83
    .line 84
    new-instance v1, La/fnq;

    .line 85
    .line 86
    const/4 v2, 0x4

    .line 87
    invoke-direct {v1, p1, v0, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 88
    .line 89
    .line 90
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    sget-object p1, La/zhx;->h:La/zhx;

    .line 95
    .line 96
    invoke-static {v1, p0, p1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 97
    .line 98
    .line 99
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    return-object p0

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
