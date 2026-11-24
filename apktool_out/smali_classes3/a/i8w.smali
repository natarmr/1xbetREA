.class public abstract La/i8w;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;)La/f8w;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    instance-of v0, p0, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object p0, La/f8w;->b:La/f8w;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    instance-of p0, p0, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetHistory;

    .line 14
    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    sget-object p0, La/f8w;->a:La/f8w;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method
