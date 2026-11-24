.class public final La/jwo0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:D

.field public final f:Ljava/util/List;


# direct methods
.method public constructor <init>(DLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZZ)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-boolean p6, p0, La/jwo0;->a:Z

    .line 14
    .line 15
    iput-object p3, p0, La/jwo0;->b:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p4, p0, La/jwo0;->c:Ljava/lang/String;

    .line 18
    .line 19
    iput-boolean p7, p0, La/jwo0;->d:Z

    .line 20
    .line 21
    iput-wide p1, p0, La/jwo0;->e:D

    .line 22
    .line 23
    iput-object p5, p0, La/jwo0;->f:Ljava/util/List;

    .line 24
    .line 25
    return-void
.end method

.method public static a(La/jwo0;ZZDLjava/util/List;I)La/jwo0;
    .locals 8

    .line 1
    iget-object v3, p0, La/jwo0;->b:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v4, p0, La/jwo0;->c:Ljava/lang/String;

    .line 4
    .line 5
    and-int/lit8 v0, p6, 0x8

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-boolean p2, p0, La/jwo0;->d:Z

    .line 10
    .line 11
    :cond_0
    move v7, p2

    .line 12
    and-int/lit8 p2, p6, 0x10

    .line 13
    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    iget-wide p3, p0, La/jwo0;->e:D

    .line 17
    .line 18
    :cond_1
    move-wide v1, p3

    .line 19
    and-int/lit8 p2, p6, 0x20

    .line 20
    .line 21
    if-eqz p2, :cond_2

    .line 22
    .line 23
    iget-object p5, p0, La/jwo0;->f:Ljava/util/List;

    .line 24
    .line 25
    :cond_2
    move-object v5, p5

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance v0, La/jwo0;

    .line 39
    .line 40
    move v6, p1

    .line 41
    invoke-direct/range {v0 .. v7}, La/jwo0;-><init>(DLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZZ)V

    .line 42
    .line 43
    .line 44
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/jwo0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/jwo0;

    .line 12
    .line 13
    iget-boolean v1, p0, La/jwo0;->a:Z

    .line 14
    .line 15
    iget-boolean v3, p1, La/jwo0;->a:Z

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, La/jwo0;->b:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v3, p1, La/jwo0;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-object v1, p0, La/jwo0;->c:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v3, p1, La/jwo0;->c:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-boolean v1, p0, La/jwo0;->d:Z

    .line 43
    .line 44
    iget-boolean v3, p1, La/jwo0;->d:Z

    .line 45
    .line 46
    if-eq v1, v3, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    iget-wide v3, p0, La/jwo0;->e:D

    .line 50
    .line 51
    iget-wide v5, p1, La/jwo0;->e:D

    .line 52
    .line 53
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_6

    .line 58
    .line 59
    return v2

    .line 60
    :cond_6
    iget-object p0, p0, La/jwo0;->f:Ljava/util/List;

    .line 61
    .line 62
    iget-object p1, p1, La/jwo0;->f:Ljava/util/List;

    .line 63
    .line 64
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-nez p0, :cond_7

    .line 69
    .line 70
    return v2

    .line 71
    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-boolean v0, p0, La/jwo0;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-object v2, p0, La/jwo0;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/jwo0;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/jwo0;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-wide v2, p0, La/jwo0;->e:D

    .line 29
    .line 30
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object p0, p0, La/jwo0;->f:Ljava/util/List;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

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
    const-string v0, ", taxTitle="

    .line 2
    .line 3
    const-string v1, ", betTooltipTitle="

    .line 4
    .line 5
    const-string v2, "TaxStateModel(isVisible="

    .line 6
    .line 7
    iget-object v3, p0, La/jwo0;->b:Ljava/lang/String;

    .line 8
    .line 9
    iget-boolean v4, p0, La/jwo0;->a:Z

    .line 10
    .line 11
    invoke-static {v2, v0, v3, v4, v1}, La/axq;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", isLoading="

    .line 16
    .line 17
    const-string v2, ", taxPayDif="

    .line 18
    .line 19
    iget-object v3, p0, La/jwo0;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-boolean v4, p0, La/jwo0;->d:Z

    .line 22
    .line 23
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 24
    .line 25
    .line 26
    iget-wide v1, p0, La/jwo0;->e:D

    .line 27
    .line 28
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ", values="

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, La/jwo0;->f:Ljava/util/List;

    .line 37
    .line 38
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p0, ")"

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method
