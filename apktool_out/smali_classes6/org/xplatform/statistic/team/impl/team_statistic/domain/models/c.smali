.class public abstract Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    instance-of v0, p0, Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam$Game;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam$Game;

    .line 11
    .line 12
    iget-object p0, p0, Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam$Game;->a:Ljava/lang/String;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    instance-of v0, p0, Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam$Team;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    check-cast p0, Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam$Team;

    .line 20
    .line 21
    iget-object p0, p0, Lorg/xplatform/statistic/team/impl/team_statistic/domain/models/TypeParam$Team;->a:Ljava/lang/String;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method
