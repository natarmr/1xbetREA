.class public final La/y8n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:J

.field public final h:Z

.field public final i:La/unm;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJZLa/unm;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/y8n;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, La/y8n;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, La/y8n;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-wide p4, p0, La/y8n;->d:J

    .line 14
    .line 15
    iput-wide p6, p0, La/y8n;->e:J

    .line 16
    .line 17
    iput-wide p8, p0, La/y8n;->f:J

    .line 18
    .line 19
    iput-wide p10, p0, La/y8n;->g:J

    .line 20
    .line 21
    iput-boolean p12, p0, La/y8n;->h:Z

    .line 22
    .line 23
    iput-object p13, p0, La/y8n;->i:La/unm;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/y8n;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/y8n;

    .line 11
    .line 12
    iget-object v0, p0, La/y8n;->a:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v1, p1, La/y8n;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget-object v0, p0, La/y8n;->b:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v1, p1, La/y8n;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    iget-object v0, p0, La/y8n;->c:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v1, p1, La/y8n;->c:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_4

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_4
    iget-wide v0, p1, La/y8n;->d:J

    .line 46
    .line 47
    sget v2, La/y3d;->h:I

    .line 48
    .line 49
    iget-wide v2, p0, La/y8n;->d:J

    .line 50
    .line 51
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_5

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_5
    iget-wide v0, p0, La/y8n;->e:J

    .line 59
    .line 60
    iget-wide v2, p1, La/y8n;->e:J

    .line 61
    .line 62
    invoke-static {v0, v1, v2, v3}, La/h2t0;->a(JJ)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_6

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_6
    iget-wide v0, p0, La/y8n;->f:J

    .line 70
    .line 71
    iget-wide v2, p1, La/y8n;->f:J

    .line 72
    .line 73
    invoke-static {v0, v1, v2, v3}, La/h2t0;->a(JJ)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_7

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_7
    iget-wide v0, p0, La/y8n;->g:J

    .line 81
    .line 82
    iget-wide v2, p1, La/y8n;->g:J

    .line 83
    .line 84
    invoke-static {v0, v1, v2, v3}, La/h2t0;->a(JJ)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_8

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_8
    iget-boolean v0, p0, La/y8n;->h:Z

    .line 92
    .line 93
    iget-boolean v1, p1, La/y8n;->h:Z

    .line 94
    .line 95
    if-eq v0, v1, :cond_9

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_9
    iget-object p0, p0, La/y8n;->i:La/unm;

    .line 99
    .line 100
    iget-object p1, p1, La/y8n;->i:La/unm;

    .line 101
    .line 102
    invoke-virtual {p0, p1}, La/unm;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-nez p0, :cond_a

    .line 107
    .line 108
    :goto_0
    const/4 p0, 0x0

    .line 109
    return p0

    .line 110
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 111
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/y8n;->a:Ljava/lang/String;

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
    iget-object v2, p0, La/y8n;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/y8n;->c:Ljava/lang/String;

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    :goto_0
    add-int/2addr v0, v2

    .line 27
    mul-int/2addr v0, v1

    .line 28
    sget v2, La/y3d;->h:I

    .line 29
    .line 30
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 31
    .line 32
    iget-wide v2, p0, La/y8n;->d:J

    .line 33
    .line 34
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-wide v2, p0, La/y8n;->e:J

    .line 39
    .line 40
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-wide v2, p0, La/y8n;->f:J

    .line 45
    .line 46
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-wide v2, p0, La/y8n;->g:J

    .line 51
    .line 52
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-boolean v2, p0, La/y8n;->h:Z

    .line 57
    .line 58
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-object p0, p0, La/y8n;->i:La/unm;

    .line 63
    .line 64
    invoke-virtual {p0}, La/unm;->hashCode()I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    add-int/2addr p0, v0

    .line 69
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    .line 1
    iget-wide v0, p0, La/y8n;->d:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/y8n;->e:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-wide v2, p0, La/y8n;->f:J

    .line 14
    .line 15
    invoke-static {v2, v3}, La/y3d;->i(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-wide v3, p0, La/y8n;->g:J

    .line 20
    .line 21
    invoke-static {v3, v4}, La/y3d;->i(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const-string v4, ", firstLabel="

    .line 26
    .line 27
    const-string v5, ", secondLabel="

    .line 28
    .line 29
    const-string v6, "DsWagerProgressUiModel(title="

    .line 30
    .line 31
    iget-object v7, p0, La/y8n;->a:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v8, p0, La/y8n;->b:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v6, v7, v4, v8, v5}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const-string v5, ", backgroundColor="

    .line 40
    .line 41
    const-string v6, ", titleColor="

    .line 42
    .line 43
    iget-object v7, p0, La/y8n;->c:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v4, v7, v5, v0, v6}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v0, ", firstLabelColor="

    .line 49
    .line 50
    const-string v5, ", secondLabelColor="

    .line 51
    .line 52
    invoke-static {v4, v1, v0, v2, v5}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const-string v0, ", hasSeparator="

    .line 56
    .line 57
    const-string v1, ", progressIndicator="

    .line 58
    .line 59
    iget-boolean v2, p0, La/y8n;->h:Z

    .line 60
    .line 61
    invoke-static {v3, v0, v1, v4, v2}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 62
    .line 63
    .line 64
    iget-object p0, p0, La/y8n;->i:La/unm;

    .line 65
    .line 66
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string p0, ")"

    .line 70
    .line 71
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method
