.class public final La/lac;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/qai0;


# instance fields
.field public o:La/e6c;


# virtual methods
.method public final S0()V
    .locals 3

    .line 1
    sget-object v0, La/rv00;->y:La/rv00;

    .line 2
    .line 3
    new-instance v1, La/e6c;

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    invoke-direct {v1, v2}, La/e6c;-><init>(B)V

    .line 7
    .line 8
    .line 9
    invoke-static {p0, v0, v1}, La/etm0;->t(La/yzj;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final x0(La/abi0;)V
    .locals 3

    .line 1
    sget-object v0, La/rv00;->y:La/rv00;

    .line 2
    .line 3
    new-instance v1, La/kac;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p1, v2}, La/kac;-><init>(La/abi0;B)V

    .line 7
    .line 8
    .line 9
    invoke-static {p0, v0, v1}, La/etm0;->t(La/yzj;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/lac;->o:La/e6c;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    return-void
.end method
