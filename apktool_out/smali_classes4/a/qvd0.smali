.class public final La/qvd0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/pvd0;

.field public static final g:[La/a8z;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/lang/Integer;

.field public final c:Ljava/util/Map;

.field public final d:Ljava/util/Map;

.field public final e:La/tvd0;

.field public final f:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, La/pvd0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/qvd0;->Companion:La/pvd0;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/etd0;

    .line 11
    .line 12
    const/4 v2, 0x4

    .line 13
    invoke-direct {v1, v2}, La/etd0;-><init>(B)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v3, La/etd0;

    .line 21
    .line 22
    const/4 v4, 0x5

    .line 23
    invoke-direct {v3, v4}, La/etd0;-><init>(B)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    new-instance v5, La/etd0;

    .line 31
    .line 32
    const/4 v6, 0x6

    .line 33
    invoke-direct {v5, v6}, La/etd0;-><init>(B)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v5}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    new-instance v7, La/etd0;

    .line 41
    .line 42
    const/4 v8, 0x7

    .line 43
    invoke-direct {v7, v8}, La/etd0;-><init>(B)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v7}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    new-array v6, v6, [La/a8z;

    .line 51
    .line 52
    const/4 v7, 0x0

    .line 53
    aput-object v1, v6, v7

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    const/4 v7, 0x0

    .line 57
    aput-object v7, v6, v1

    .line 58
    .line 59
    const/4 v1, 0x2

    .line 60
    aput-object v3, v6, v1

    .line 61
    .line 62
    const/4 v1, 0x3

    .line 63
    aput-object v5, v6, v1

    .line 64
    .line 65
    aput-object v7, v6, v2

    .line 66
    .line 67
    aput-object v0, v6, v4

    .line 68
    .line 69
    sput-object v6, La/qvd0;->g:[La/a8z;

    .line 70
    .line 71
    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;La/tvd0;Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 v0, p1, 0x1

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object v1, p0, La/qvd0;->a:Ljava/util/List;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iput-object p2, p0, La/qvd0;->a:Ljava/util/List;

    .line 13
    .line 14
    :goto_0
    and-int/lit8 p2, p1, 0x2

    .line 15
    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    iput-object v1, p0, La/qvd0;->b:Ljava/lang/Integer;

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    iput-object p3, p0, La/qvd0;->b:Ljava/lang/Integer;

    .line 22
    .line 23
    :goto_1
    and-int/lit8 p2, p1, 0x4

    .line 24
    .line 25
    if-nez p2, :cond_2

    .line 26
    .line 27
    iput-object v1, p0, La/qvd0;->c:Ljava/util/Map;

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    iput-object p4, p0, La/qvd0;->c:Ljava/util/Map;

    .line 31
    .line 32
    :goto_2
    and-int/lit8 p2, p1, 0x8

    .line 33
    .line 34
    if-nez p2, :cond_3

    .line 35
    .line 36
    iput-object v1, p0, La/qvd0;->d:Ljava/util/Map;

    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_3
    iput-object p5, p0, La/qvd0;->d:Ljava/util/Map;

    .line 40
    .line 41
    :goto_3
    and-int/lit8 p2, p1, 0x10

    .line 42
    .line 43
    if-nez p2, :cond_4

    .line 44
    .line 45
    iput-object v1, p0, La/qvd0;->e:La/tvd0;

    .line 46
    .line 47
    goto :goto_4

    .line 48
    :cond_4
    iput-object p6, p0, La/qvd0;->e:La/tvd0;

    .line 49
    .line 50
    :goto_4
    and-int/lit8 p1, p1, 0x20

    .line 51
    .line 52
    if-nez p1, :cond_5

    .line 53
    .line 54
    iput-object v1, p0, La/qvd0;->f:Ljava/util/List;

    .line 55
    .line 56
    return-void

    .line 57
    :cond_5
    iput-object p7, p0, La/qvd0;->f:Ljava/util/List;

    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/qvd0;

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
    check-cast p1, La/qvd0;

    .line 12
    .line 13
    iget-object v1, p0, La/qvd0;->a:Ljava/util/List;

    .line 14
    .line 15
    iget-object v3, p1, La/qvd0;->a:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, La/qvd0;->b:Ljava/lang/Integer;

    .line 25
    .line 26
    iget-object v3, p1, La/qvd0;->b:Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, La/qvd0;->c:Ljava/util/Map;

    .line 36
    .line 37
    iget-object v3, p1, La/qvd0;->c:Ljava/util/Map;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, La/qvd0;->d:Ljava/util/Map;

    .line 47
    .line 48
    iget-object v3, p1, La/qvd0;->d:Ljava/util/Map;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, La/qvd0;->e:La/tvd0;

    .line 58
    .line 59
    iget-object v3, p1, La/qvd0;->e:La/tvd0;

    .line 60
    .line 61
    if-eq v1, v3, :cond_6

    .line 62
    .line 63
    return v2

    .line 64
    :cond_6
    iget-object p0, p0, La/qvd0;->f:Ljava/util/List;

    .line 65
    .line 66
    iget-object p1, p1, La/qvd0;->f:Ljava/util/List;

    .line 67
    .line 68
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-nez p0, :cond_7

    .line 73
    .line 74
    return v2

    .line 75
    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, La/qvd0;->a:Ljava/util/List;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, La/qvd0;->b:Ljava/lang/Integer;

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    move v2, v0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    :goto_1
    add-int/2addr v1, v2

    .line 25
    mul-int/lit8 v1, v1, 0x1f

    .line 26
    .line 27
    iget-object v2, p0, La/qvd0;->c:Ljava/util/Map;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    move v2, v0

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    :goto_2
    add-int/2addr v1, v2

    .line 38
    mul-int/lit8 v1, v1, 0x1f

    .line 39
    .line 40
    iget-object v2, p0, La/qvd0;->d:Ljava/util/Map;

    .line 41
    .line 42
    if-nez v2, :cond_3

    .line 43
    .line 44
    move v2, v0

    .line 45
    goto :goto_3

    .line 46
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    :goto_3
    add-int/2addr v1, v2

    .line 51
    mul-int/lit8 v1, v1, 0x1f

    .line 52
    .line 53
    iget-object v2, p0, La/qvd0;->e:La/tvd0;

    .line 54
    .line 55
    if-nez v2, :cond_4

    .line 56
    .line 57
    move v2, v0

    .line 58
    goto :goto_4

    .line 59
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    :goto_4
    add-int/2addr v1, v2

    .line 64
    mul-int/lit8 v1, v1, 0x1f

    .line 65
    .line 66
    iget-object p0, p0, La/qvd0;->f:Ljava/util/List;

    .line 67
    .line 68
    if-nez p0, :cond_5

    .line 69
    .line 70
    goto :goto_5

    .line 71
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    :goto_5
    add-int/2addr v1, v0

    .line 76
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", teamScore="

    .line 2
    .line 3
    const-string v1, ", firstRoundsHistory="

    .line 4
    .line 5
    iget-object v2, p0, La/qvd0;->b:Ljava/lang/Integer;

    .line 6
    .line 7
    const-string v3, "RainbowGameStatisticMainStatResponse(playerStatistic="

    .line 8
    .line 9
    iget-object v4, p0, La/qvd0;->a:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1, v4}, La/cs0;->r(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, La/qvd0;->c:Ljava/util/Map;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", secondRoundsHistory="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, La/qvd0;->d:Ljava/util/Map;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", role="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, La/qvd0;->e:La/tvd0;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", bans="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, La/qvd0;->f:Ljava/util/List;

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p0, ")"

    .line 51
    .line 52
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method
