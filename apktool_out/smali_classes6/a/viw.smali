.class public final La/viw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:La/ypl0;

.field public final d:La/j0g0;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;La/ypl0;La/j0g0;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/viw;->a:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, La/viw;->b:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, La/viw;->c:La/ypl0;

    .line 12
    .line 13
    iput-object p4, p0, La/viw;->d:La/j0g0;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/viw;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/viw;

    .line 10
    .line 11
    iget-object v0, p1, La/viw;->a:Ljava/lang/Object;

    .line 12
    .line 13
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 14
    .line 15
    iget-object v1, p0, La/viw;->a:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    iget-object v0, p0, La/viw;->b:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v1, p1, La/viw;->b:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    iget-object v0, p0, La/viw;->c:La/ypl0;

    .line 36
    .line 37
    iget-object v1, p1, La/viw;->c:La/ypl0;

    .line 38
    .line 39
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_4
    iget-object p0, p0, La/viw;->d:La/j0g0;

    .line 47
    .line 48
    iget-object p1, p1, La/viw;->d:La/j0g0;

    .line 49
    .line 50
    invoke-virtual {p0, p1}, La/j0g0;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-nez p0, :cond_5

    .line 55
    .line 56
    :goto_0
    const/4 p0, 0x0

    .line 57
    return p0

    .line 58
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 59
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/viw;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, La/j0g0;->b(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, La/viw;->b:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/twn;->c(IILjava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/viw;->c:La/ypl0;

    .line 17
    .line 18
    invoke-virtual {v2}, La/ypl0;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    iget-object p0, p0, La/viw;->d:La/j0g0;

    .line 25
    .line 26
    iget-object p0, p0, La/j0g0;->a:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {p0}, La/j0g0;->b(Ljava/lang/Object;)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    add-int/2addr p0, v2

    .line 33
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, La/viw;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, La/j0g0;->d(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, La/viw;->b:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {v1}, La/j0g0;->d(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, ", lineGamesResult="

    .line 14
    .line 15
    const-string v3, ", sportSimpleModel="

    .line 16
    .line 17
    const-string v4, "HomeScenarioModel(liveGamesResult="

    .line 18
    .line 19
    invoke-static {v4, v0, v2, v1, v3}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, La/viw;->c:La/ypl0;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", topGame="

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, La/viw;->d:La/j0g0;

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p0, ")"

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method
