.class public final La/a3a0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Z

.field public final synthetic k:La/b3a0;


# direct methods
.method public synthetic constructor <init>(La/b3a0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/a3a0;->i:B

    iput-object p1, p0, La/a3a0;->k:La/b3a0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/a3a0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/a3a0;->k:La/b3a0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/a3a0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/a3a0;-><init>(La/b3a0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iput-boolean p0, v0, La/a3a0;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance v0, La/a3a0;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {v0, p0, p2, v1}, La/a3a0;-><init>(La/b3a0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    check-cast p1, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    iput-boolean p0, v0, La/a3a0;->j:Z

    .line 36
    .line 37
    return-object v0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/a3a0;->i:B

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/a3a0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/a3a0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/a3a0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/a3a0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, La/a3a0;

    .line 31
    .line 32
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, La/a3a0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/a3a0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/a3a0;->k:La/b3a0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-boolean v3, p0, La/a3a0;->j:Z

    .line 9
    .line 10
    sget-object p0, La/wne;->a:La/wne;

    .line 11
    .line 12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget p0, La/b3a0;->x:I

    .line 16
    .line 17
    iget-object p0, v1, La/i3t0;->i:La/ocj;

    .line 18
    .line 19
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-object v2, p0

    .line 29
    check-cast v2, La/p2a0;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    const/16 v7, 0x3d

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    invoke-static/range {v2 .. v7}, La/p2a0;->a(La/p2a0;ZLjava/util/List;Ljava/util/List;ZI)La/p2a0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_0

    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_0
    iget-boolean p0, p0, La/a3a0;->j:Z

    .line 50
    .line 51
    sget-object v0, La/wne;->a:La/wne;

    .line 52
    .line 53
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    if-eqz p0, :cond_1

    .line 57
    .line 58
    sget p0, La/b3a0;->x:I

    .line 59
    .line 60
    invoke-virtual {v1}, La/b3a0;->M()V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    iget-object p0, v1, La/b3a0;->v:La/c4m0;

    .line 65
    .line 66
    if-eqz p0, :cond_2

    .line 67
    .line 68
    const/4 p1, 0x0

    .line 69
    invoke-virtual {p0, p1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
