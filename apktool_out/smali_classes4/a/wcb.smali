.class public final La/wcb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Ljava/util/Map;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/wcb;->a:Ljava/util/Map;

    .line 5
    .line 6
    iput-object p3, p0, La/wcb;->b:Ljava/util/Map;

    .line 7
    .line 8
    iput-object p1, p0, La/wcb;->c:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(JJ)Ljava/lang/String;
    .locals 4

    .line 1
    const-wide/16 v0, 0x28

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-nez v0, :cond_2

    .line 9
    .line 10
    cmp-long v0, p3, v1

    .line 11
    .line 12
    iget-object v1, p0, La/wcb;->c:Ljava/lang/String;

    .line 13
    .line 14
    if-lez v0, :cond_1

    .line 15
    .line 16
    new-instance v0, La/vcb;

    .line 17
    .line 18
    invoke-direct {v0, p3, p4}, La/vcb;-><init>(J)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, La/wcb;->a:Ljava/util/Map;

    .line 22
    .line 23
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-nez p0, :cond_0

    .line 28
    .line 29
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    :cond_0
    check-cast p0, Ljava/lang/String;

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {p0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_2
    new-instance p3, La/tcb;

    .line 66
    .line 67
    invoke-direct {p3, p1, p2}, La/tcb;-><init>(J)V

    .line 68
    .line 69
    .line 70
    iget-object p0, p0, La/wcb;->b:Ljava/util/Map;

    .line 71
    .line 72
    invoke-interface {p0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, La/ucb;

    .line 77
    .line 78
    if-eqz p0, :cond_3

    .line 79
    .line 80
    iget-boolean p3, p0, La/ucb;->b:Z

    .line 81
    .line 82
    if-ne p3, v3, :cond_3

    .line 83
    .line 84
    iget-object p0, p0, La/ucb;->a:Ljava/lang/String;

    .line 85
    .line 86
    return-object p0

    .line 87
    :cond_3
    cmp-long p0, p1, v1

    .line 88
    .line 89
    if-eqz p0, :cond_4

    .line 90
    .line 91
    const-string p0, "svg"

    .line 92
    .line 93
    const-string p3, "sports_v2"

    .line 94
    .line 95
    const-string p4, "static"

    .line 96
    .line 97
    invoke-static {p4, p0, p3}, La/rz4;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/bzu;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    const-string p3, ".svg"

    .line 102
    .line 103
    invoke-static {p1, p2, p3, p0}, La/rz4;->s(JLjava/lang/String;La/bzu;)V

    .line 104
    .line 105
    .line 106
    iget-object p0, p0, La/bzu;->b:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p0, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0

    .line 115
    :cond_4
    const-string p0, ""

    .line 116
    .line 117
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/wcb;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/wcb;

    .line 10
    .line 11
    iget-object v0, p0, La/wcb;->a:Ljava/util/Map;

    .line 12
    .line 13
    iget-object v1, p1, La/wcb;->a:Ljava/util/Map;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/wcb;->b:Ljava/util/Map;

    .line 23
    .line 24
    iget-object v1, p1, La/wcb;->b:Ljava/util/Map;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, La/wcb;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object p1, p1, La/wcb;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_4

    .line 42
    .line 43
    :goto_0
    const/4 p0, 0x0

    .line 44
    return p0

    .line 45
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 46
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/wcb;->a:Ljava/util/Map;

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
    iget-object v2, p0, La/wcb;->b:Ljava/util/Map;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/ohs0;->f(Ljava/util/Map;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object p0, p0, La/wcb;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    add-int/2addr p0, v0

    .line 23
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ChampImagesHolder(cyberImagesMap="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/wcb;->a:Ljava/util/Map;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", sportImagesMap="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/wcb;->b:Ljava/util/Map;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", defaultChampImage="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ")"

    .line 29
    .line 30
    iget-object p0, p0, La/wcb;->c:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0, p0, v1}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method
