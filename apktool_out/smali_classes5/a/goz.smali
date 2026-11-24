.class public final La/goz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p6t0;


# instance fields
.field public final a:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:Ljava/lang/String;

.field public final f:J


# direct methods
.method public constructor <init>(Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/goz;->a:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 5
    .line 6
    iput-object p2, p0, La/goz;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, La/goz;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput p4, p0, La/goz;->d:I

    .line 11
    .line 12
    iput-object p5, p0, La/goz;->e:Ljava/lang/String;

    .line 13
    .line 14
    iput-wide p6, p0, La/goz;->f:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, La/goz;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, La/goz;

    .line 10
    .line 11
    iget-object v0, p0, La/goz;->a:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 12
    .line 13
    iget-object v1, p1, La/goz;->a:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_2
    iget-object v0, p0, La/goz;->b:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v1, p1, La/goz;->b:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_3
    iget-object v0, p0, La/goz;->c:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v1, p1, La/goz;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_4
    iget v0, p0, La/goz;->d:I

    .line 41
    .line 42
    iget v1, p1, La/goz;->d:I

    .line 43
    .line 44
    if-ne v0, v1, :cond_6

    .line 45
    .line 46
    iget-object v0, p0, La/goz;->e:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v1, p1, La/goz;->e:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_5

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_5
    iget-wide v0, p0, La/goz;->f:J

    .line 58
    .line 59
    iget-wide p0, p1, La/goz;->f:J

    .line 60
    .line 61
    cmp-long p0, v0, p0

    .line 62
    .line 63
    if-nez p0, :cond_6

    .line 64
    .line 65
    :goto_0
    const/4 p0, 0x1

    .line 66
    return p0

    .line 67
    :cond_6
    :goto_1
    const/4 p0, 0x0

    .line 68
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/goz;->a:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget-object v2, p0, La/goz;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/goz;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, La/goz;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/goz;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-wide v1, p0, La/goz;->f:J

    .line 35
    .line 36
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v0

    .line 41
    return p0
.end method

.method public final o(La/p6t0;La/p6t0;)Ljava/util/Collection;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of p0, p1, La/goz;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p2, La/goz;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 18
    .line 19
    .line 20
    check-cast p1, La/goz;

    .line 21
    .line 22
    iget-object v0, p1, La/goz;->b:Ljava/lang/String;

    .line 23
    .line 24
    new-instance v1, La/eoz;

    .line 25
    .line 26
    invoke-direct {v1, v0}, La/eoz;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    check-cast p2, La/goz;

    .line 30
    .line 31
    iget-object v0, p2, La/goz;->b:Ljava/lang/String;

    .line 32
    .line 33
    new-instance v2, La/eoz;

    .line 34
    .line 35
    invoke-direct {v2, v0}, La/eoz;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p1, La/goz;->c:Ljava/lang/String;

    .line 42
    .line 43
    new-instance v1, La/aoz;

    .line 44
    .line 45
    invoke-direct {v1, v0}, La/aoz;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p2, La/goz;->c:Ljava/lang/String;

    .line 49
    .line 50
    new-instance v2, La/aoz;

    .line 51
    .line 52
    invoke-direct {v2, v0}, La/aoz;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget v0, p1, La/goz;->d:I

    .line 59
    .line 60
    new-instance v1, La/boz;

    .line 61
    .line 62
    invoke-direct {v1, v0}, La/boz;-><init>(I)V

    .line 63
    .line 64
    .line 65
    iget v0, p2, La/goz;->d:I

    .line 66
    .line 67
    new-instance v2, La/boz;

    .line 68
    .line 69
    invoke-direct {v2, v0}, La/boz;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object v0, p1, La/goz;->e:Ljava/lang/String;

    .line 76
    .line 77
    new-instance v1, La/coz;

    .line 78
    .line 79
    invoke-direct {v1, v0}, La/coz;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p2, La/goz;->e:Ljava/lang/String;

    .line 83
    .line 84
    new-instance v2, La/coz;

    .line 85
    .line 86
    invoke-direct {v2, v0}, La/coz;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-wide v0, p1, La/goz;->f:J

    .line 93
    .line 94
    new-instance p1, La/doz;

    .line 95
    .line 96
    invoke-direct {p1, v0, v1}, La/doz;-><init>(J)V

    .line 97
    .line 98
    .line 99
    iget-wide v0, p2, La/goz;->f:J

    .line 100
    .line 101
    new-instance p2, La/doz;

    .line 102
    .line 103
    invoke-direct {p2, v0, v1}, La/doz;-><init>(J)V

    .line 104
    .line 105
    .line 106
    invoke-static {p0, p1, p2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-nez p1, :cond_0

    .line 114
    .line 115
    return-object p0

    .line 116
    :cond_0
    const/4 p0, 0x0

    .line 117
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, "Title(value="

    .line 2
    .line 3
    iget-object v1, p0, La/goz;->b:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, ")"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, La/goz;->c:Ljava/lang/String;

    .line 12
    .line 13
    const-string v3, "Actual(value="

    .line 14
    .line 15
    invoke-static {v3, v1, v2}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget v3, p0, La/goz;->d:I

    .line 20
    .line 21
    const-string v4, "EndsAt(value="

    .line 22
    .line 23
    invoke-static {v3, v4, v2}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget-object v4, p0, La/goz;->e:Ljava/lang/String;

    .line 28
    .line 29
    const-string v5, "Previous(value="

    .line 30
    .line 31
    invoke-static {v5, v4, v2}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    iget-wide v5, p0, La/goz;->f:J

    .line 36
    .line 37
    const-string v7, "StartAt(value="

    .line 38
    .line 39
    invoke-static {v5, v6, v7, v2}, La/axq;->h(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    new-instance v6, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v7, "LimitRowUiModel(limitType="

    .line 46
    .line 47
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/goz;->a:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 51
    .line 52
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p0, ", title="

    .line 56
    .line 57
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p0, ", actual="

    .line 64
    .line 65
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string p0, ", endsAt="

    .line 69
    .line 70
    const-string v0, ", previous="

    .line 71
    .line 72
    invoke-static {v6, v1, p0, v3, v0}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const-string p0, ", startAt="

    .line 76
    .line 77
    invoke-static {v6, v4, p0, v5, v2}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method
