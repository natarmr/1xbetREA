.class public final La/ec8;
.super La/i3t0;
.source "SourceFile"


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, La/ub8;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    instance-of v0, p1, La/tb8;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, La/bc8;

    .line 14
    .line 15
    check-cast p1, La/tb8;

    .line 16
    .line 17
    iget-object p1, p1, La/tb8;->a:Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel;

    .line 18
    .line 19
    invoke-direct {v0, p1}, La/bc8;-><init>(Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    instance-of p1, p1, La/sb8;

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 35
    .line 36
    .line 37
    return-void
.end method
