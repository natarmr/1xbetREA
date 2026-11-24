.class public final La/q7b;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/y7b;


# direct methods
.method public synthetic constructor <init>(La/y7b;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/q7b;->i:B

    iput-object p1, p0, La/q7b;->j:La/y7b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/q7b;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/q7b;->j:La/y7b;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/q7b;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/q7b;-><init>(La/y7b;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/q7b;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/q7b;-><init>(La/y7b;La/yje;B)V

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
    iget-byte v0, p0, La/q7b;->i:B

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
    invoke-virtual {p0, p1, p2}, La/q7b;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/q7b;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/q7b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/q7b;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/q7b;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/q7b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 3

    .line 1
    iget-byte v0, p0, La/q7b;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/q7b;->j:La/y7b;

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
    iget-object p1, p0, La/y7b;->z:La/owp0;

    .line 14
    .line 15
    sget-object v0, La/idf0;->a:La/idf0;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, La/owp0;->g(La/ldf0;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, La/y7b;->x:La/ikt0;

    .line 21
    .line 22
    sget-object v0, La/lx7;->a:La/lx7;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, La/ikt0;->b(La/px7;)V

    .line 25
    .line 26
    .line 27
    new-instance p1, La/pua;

    .line 28
    .line 29
    const/16 v0, 0xf

    .line 30
    .line 31
    invoke-direct {p1, v0}, La/pua;-><init>(B)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 41
    .line 42
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, La/y7b;->q:La/x4u;

    .line 46
    .line 47
    iget-object p1, p1, La/x4u;->a:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, La/n9s;

    .line 50
    .line 51
    invoke-virtual {p1}, La/n9s;->a()La/i89;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    new-instance v0, La/d09;

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    const/16 v2, 0x15

    .line 59
    .line 60
    invoke-direct {v0, p0, v1, v2}, La/d09;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 61
    .line 62
    .line 63
    new-instance v1, La/fnq;

    .line 64
    .line 65
    const/4 v2, 0x4

    .line 66
    invoke-direct {v1, p1, v0, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 67
    .line 68
    .line 69
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    sget-object p1, La/p7b;->h:La/p7b;

    .line 74
    .line 75
    invoke-static {v1, p0, p1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 76
    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
