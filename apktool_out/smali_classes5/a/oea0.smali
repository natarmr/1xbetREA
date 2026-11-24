.class public final La/oea0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/c280;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:Z

.field public final f:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;La/c280;Ljava/lang/String;ZZZ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/oea0;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, La/oea0;->b:La/c280;

    .line 13
    .line 14
    iput-object p3, p0, La/oea0;->c:Ljava/lang/String;

    .line 15
    .line 16
    iput-boolean p4, p0, La/oea0;->d:Z

    .line 17
    .line 18
    iput-boolean p5, p0, La/oea0;->e:Z

    .line 19
    .line 20
    iput-boolean p6, p0, La/oea0;->f:Z

    .line 21
    .line 22
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
    instance-of v0, p1, La/oea0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/oea0;

    .line 10
    .line 11
    iget-object v0, p0, La/oea0;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, La/oea0;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, La/oea0;->b:La/c280;

    .line 23
    .line 24
    iget-object v1, p1, La/oea0;->b:La/c280;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, La/c280;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-object v0, p0, La/oea0;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, La/oea0;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-boolean v0, p0, La/oea0;->d:Z

    .line 45
    .line 46
    iget-boolean v1, p1, La/oea0;->d:Z

    .line 47
    .line 48
    if-eq v0, v1, :cond_5

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    iget-boolean v0, p0, La/oea0;->e:Z

    .line 52
    .line 53
    iget-boolean v1, p1, La/oea0;->e:Z

    .line 54
    .line 55
    if-eq v0, v1, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    iget-boolean p0, p0, La/oea0;->f:Z

    .line 59
    .line 60
    iget-boolean p1, p1, La/oea0;->f:Z

    .line 61
    .line 62
    if-eq p0, p1, :cond_7

    .line 63
    .line 64
    :goto_0
    const/4 p0, 0x0

    .line 65
    return p0

    .line 66
    :cond_7
    :goto_1
    const/4 p0, 0x1

    .line 67
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/oea0;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget-object v2, p0, La/oea0;->b:La/c280;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/hne;->g(La/c280;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/oea0;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/oea0;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/oea0;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean p0, p0, La/oea0;->f:Z

    .line 35
    .line 36
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v0

    .line 41
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", playerIcon="

    .line 2
    .line 3
    const-string v1, ", playerName="

    .line 4
    .line 5
    iget-object v2, p0, La/oea0;->b:La/c280;

    .line 6
    .line 7
    const-string v3, "PlayerUiModel(playerId="

    .line 8
    .line 9
    iget-object v4, p0, La/oea0;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v4, v0, v1}, La/f140;->p(La/c280;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", isCaptain="

    .line 16
    .line 17
    const-string v2, ", isSelected="

    .line 18
    .line 19
    iget-object v3, p0, La/oea0;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-boolean v4, p0, La/oea0;->d:Z

    .line 22
    .line 23
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", isDisabled="

    .line 27
    .line 28
    const-string v2, ")"

    .line 29
    .line 30
    iget-boolean v3, p0, La/oea0;->e:Z

    .line 31
    .line 32
    iget-boolean p0, p0, La/oea0;->f:Z

    .line 33
    .line 34
    invoke-static {v1, v2, v0, v3, p0}, La/ohs0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method
