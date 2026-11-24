.class public final La/k0a0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:I

.field public final e:Ljava/util/List;

.field public final f:La/hva;

.field public final g:Ljava/util/List;

.field public final h:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/hva;->d:La/hva;

    .line 2
    .line 3
    return-void
.end method

.method public constructor <init>(ZZZILjava/util/List;La/hva;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-boolean p1, p0, La/k0a0;->a:Z

    .line 17
    .line 18
    iput-boolean p2, p0, La/k0a0;->b:Z

    .line 19
    .line 20
    iput-boolean p3, p0, La/k0a0;->c:Z

    .line 21
    .line 22
    iput p4, p0, La/k0a0;->d:I

    .line 23
    .line 24
    iput-object p5, p0, La/k0a0;->e:Ljava/util/List;

    .line 25
    .line 26
    iput-object p6, p0, La/k0a0;->f:La/hva;

    .line 27
    .line 28
    iput-object p7, p0, La/k0a0;->g:Ljava/util/List;

    .line 29
    .line 30
    iput-object p8, p0, La/k0a0;->h:Ljava/util/List;

    .line 31
    .line 32
    return-void
.end method

.method public static a(La/k0a0;ZZZ)La/k0a0;
    .locals 9

    .line 1
    iget v4, p0, La/k0a0;->d:I

    .line 2
    .line 3
    iget-object v5, p0, La/k0a0;->e:Ljava/util/List;

    .line 4
    .line 5
    iget-object v6, p0, La/k0a0;->f:La/hva;

    .line 6
    .line 7
    iget-object v7, p0, La/k0a0;->g:Ljava/util/List;

    .line 8
    .line 9
    iget-object v8, p0, La/k0a0;->h:Ljava/util/List;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance v0, La/k0a0;

    .line 27
    .line 28
    move v1, p1

    .line 29
    move v2, p2

    .line 30
    move v3, p3

    .line 31
    invoke-direct/range {v0 .. v8}, La/k0a0;-><init>(ZZZILjava/util/List;La/hva;Ljava/util/List;Ljava/util/List;)V

    .line 32
    .line 33
    .line 34
    return-object v0
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
    instance-of v0, p1, La/k0a0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/k0a0;

    .line 10
    .line 11
    iget-boolean v0, p0, La/k0a0;->a:Z

    .line 12
    .line 13
    iget-boolean v1, p1, La/k0a0;->a:Z

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-boolean v0, p0, La/k0a0;->b:Z

    .line 19
    .line 20
    iget-boolean v1, p1, La/k0a0;->b:Z

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget-boolean v0, p0, La/k0a0;->c:Z

    .line 26
    .line 27
    iget-boolean v1, p1, La/k0a0;->c:Z

    .line 28
    .line 29
    if-eq v0, v1, :cond_4

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_4
    iget v0, p0, La/k0a0;->d:I

    .line 33
    .line 34
    iget v1, p1, La/k0a0;->d:I

    .line 35
    .line 36
    if-eq v0, v1, :cond_5

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_5
    iget-object v0, p0, La/k0a0;->e:Ljava/util/List;

    .line 40
    .line 41
    iget-object v1, p1, La/k0a0;->e:Ljava/util/List;

    .line 42
    .line 43
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_6

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_6
    iget-object v0, p0, La/k0a0;->f:La/hva;

    .line 51
    .line 52
    iget-object v1, p1, La/k0a0;->f:La/hva;

    .line 53
    .line 54
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_7

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_7
    iget-object v0, p0, La/k0a0;->g:Ljava/util/List;

    .line 62
    .line 63
    iget-object v1, p1, La/k0a0;->g:Ljava/util/List;

    .line 64
    .line 65
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_8

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_8
    iget-object p0, p0, La/k0a0;->h:Ljava/util/List;

    .line 73
    .line 74
    iget-object p1, p1, La/k0a0;->h:Ljava/util/List;

    .line 75
    .line 76
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-nez p0, :cond_9

    .line 81
    .line 82
    :goto_0
    const/4 p0, 0x0

    .line 83
    return p0

    .line 84
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 85
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La/k0a0;->a:Z

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
    iget-boolean v2, p0, La/k0a0;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/k0a0;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, La/k0a0;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/k0a0;->e:Ljava/util/List;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/k0a0;->f:La/hva;

    .line 35
    .line 36
    invoke-virtual {v2}, La/hva;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v2, v0

    .line 41
    mul-int/2addr v2, v1

    .line 42
    iget-object v0, p0, La/k0a0;->g:Ljava/util/List;

    .line 43
    .line 44
    invoke-static {v2, v1, v0}, La/dw9;->a(IILjava/util/List;)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object p0, p0, La/k0a0;->h:Ljava/util/List;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    add-int/2addr p0, v0

    .line 55
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", error="

    .line 2
    .line 3
    const-string v1, ", empty="

    .line 4
    .line 5
    const-string v2, "PlayerCareerTableState(loading="

    .line 6
    .line 7
    iget-boolean v3, p0, La/k0a0;->a:Z

    .line 8
    .line 9
    iget-boolean v4, p0, La/k0a0;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v0, v1, v3, v4}, La/f140;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", selectedTabId="

    .line 16
    .line 17
    const-string v2, ", careerTables="

    .line 18
    .line 19
    iget v3, p0, La/k0a0;->d:I

    .line 20
    .line 21
    iget-boolean v4, p0, La/k0a0;->c:Z

    .line 22
    .line 23
    invoke-static {v3, v1, v2, v0, v4}, La/ua80;->q(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, La/k0a0;->e:Ljava/util/List;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ", currentTable="

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, La/k0a0;->f:La/hva;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ", teams="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, ", tournaments="

    .line 47
    .line 48
    const-string v2, ")"

    .line 49
    .line 50
    iget-object v3, p0, La/k0a0;->g:Ljava/util/List;

    .line 51
    .line 52
    iget-object p0, p0, La/k0a0;->h:Ljava/util/List;

    .line 53
    .line 54
    invoke-static {v1, v2, v0, v3, p0}, La/kng0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Ljava/util/List;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method
