.class public final La/bqu0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/dqu0;


# direct methods
.method public synthetic constructor <init>(La/dqu0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/bqu0;->i:B

    iput-object p1, p0, La/bqu0;->k:La/dqu0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/bqu0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/bqu0;->k:La/dqu0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/bqu0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/bqu0;-><init>(La/dqu0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/bqu0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/bqu0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/bqu0;-><init>(La/dqu0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    check-cast p1, La/j0g0;

    .line 24
    .line 25
    iget-object p0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 26
    .line 27
    iput-object p0, v0, La/bqu0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/bqu0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/bqu0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/bqu0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/bqu0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/j0g0;

    .line 24
    .line 25
    iget-object v0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p2, La/yje;

    .line 28
    .line 29
    invoke-virtual {p0, p1, p2}, La/bqu0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, La/bqu0;

    .line 34
    .line 35
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, La/bqu0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/bqu0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/bqu0;->k:La/dqu0;

    .line 4
    .line 5
    iget-object p0, p0, La/bqu0;->j:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, La/vne;

    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance p1, La/aqu0;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {p1, v1, v2, v0}, La/aqu0;-><init>(La/dqu0;La/yje;B)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    invoke-static {p0, v2, v2, p1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 32
    .line 33
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sget p1, La/dqu0;->D:I

    .line 37
    .line 38
    iget-object p1, v1, La/i3t0;->i:La/ocj;

    .line 39
    .line 40
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 41
    .line 42
    :cond_0
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-object v1, v0

    .line 50
    check-cast v1, La/upu0;

    .line 51
    .line 52
    new-instance v5, La/j0g0;

    .line 53
    .line 54
    invoke-direct {v5, p0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object v3, v1, La/upu0;->a:Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;

    .line 58
    .line 59
    iget-object v4, v1, La/upu0;->b:La/sff0;

    .line 60
    .line 61
    iget-object v6, v1, La/upu0;->d:Ljava/util/List;

    .line 62
    .line 63
    iget-boolean v7, v1, La/upu0;->e:Z

    .line 64
    .line 65
    iget-boolean v8, v1, La/upu0;->f:Z

    .line 66
    .line 67
    iget-boolean v9, v1, La/upu0;->g:Z

    .line 68
    .line 69
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    new-instance v2, La/upu0;

    .line 73
    .line 74
    invoke-direct/range {v2 .. v9}, La/upu0;-><init>(Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;La/sff0;La/j0g0;Ljava/util/List;ZZZ)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_0

    .line 82
    .line 83
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
