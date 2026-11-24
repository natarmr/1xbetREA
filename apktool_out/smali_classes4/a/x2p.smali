.class public final La/x2p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/zrm;

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:La/sgb;

.field public final f:J

.field public final g:Ljava/lang/String;

.field public final h:I


# direct methods
.method public constructor <init>(La/zrm;JJJLa/sgb;JLjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/x2p;->a:La/zrm;

    .line 8
    .line 9
    iput-wide p2, p0, La/x2p;->b:J

    .line 10
    .line 11
    iput-wide p4, p0, La/x2p;->c:J

    .line 12
    .line 13
    iput-wide p6, p0, La/x2p;->d:J

    .line 14
    .line 15
    iput-object p8, p0, La/x2p;->e:La/sgb;

    .line 16
    .line 17
    iput-wide p9, p0, La/x2p;->f:J

    .line 18
    .line 19
    iput-object p11, p0, La/x2p;->g:Ljava/lang/String;

    .line 20
    .line 21
    iput p12, p0, La/x2p;->h:I

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/x2p;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/x2p;

    .line 10
    .line 11
    iget-object v0, p0, La/x2p;->a:La/zrm;

    .line 12
    .line 13
    iget-object v1, p1, La/x2p;->a:La/zrm;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/zrm;->equals(Ljava/lang/Object;)Z

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
    iget-wide v0, p0, La/x2p;->b:J

    .line 23
    .line 24
    iget-wide v2, p1, La/x2p;->b:J

    .line 25
    .line 26
    cmp-long v0, v0, v2

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    iget-wide v0, p0, La/x2p;->c:J

    .line 32
    .line 33
    iget-wide v2, p1, La/x2p;->c:J

    .line 34
    .line 35
    cmp-long v0, v0, v2

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-wide v0, p0, La/x2p;->d:J

    .line 41
    .line 42
    iget-wide v2, p1, La/x2p;->d:J

    .line 43
    .line 44
    cmp-long v0, v0, v2

    .line 45
    .line 46
    if-eqz v0, :cond_5

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_5
    iget-object v0, p0, La/x2p;->e:La/sgb;

    .line 50
    .line 51
    iget-object v1, p1, La/x2p;->e:La/sgb;

    .line 52
    .line 53
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_6

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_6
    iget-wide v0, p0, La/x2p;->f:J

    .line 61
    .line 62
    iget-wide v2, p1, La/x2p;->f:J

    .line 63
    .line 64
    cmp-long v0, v0, v2

    .line 65
    .line 66
    if-eqz v0, :cond_7

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_7
    iget-object v0, p0, La/x2p;->g:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v1, p1, La/x2p;->g:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_8

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_8
    iget p0, p0, La/x2p;->h:I

    .line 81
    .line 82
    iget p1, p1, La/x2p;->h:I

    .line 83
    .line 84
    if-eq p0, p1, :cond_9

    .line 85
    .line 86
    :goto_0
    const/4 p0, 0x0

    .line 87
    return p0

    .line 88
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 89
    return p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, La/x2p;->a:La/zrm;

    .line 2
    .line 3
    invoke-virtual {v0}, La/zrm;->hashCode()I

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
    iget-wide v2, p0, La/x2p;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/x2p;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, La/x2p;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/x2p;->e:La/sgb;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, v0

    .line 35
    mul-int/2addr v2, v1

    .line 36
    iget-wide v3, p0, La/x2p;->f:J

    .line 37
    .line 38
    invoke-static {v2, v1, v3, v4}, La/rw2;->b(IIJ)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v2, p0, La/x2p;->g:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget p0, p0, La/x2p;->h:I

    .line 49
    .line 50
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

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
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "FavoriteAltChampsUiModel(style="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/x2p;->a:La/zrm;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", id="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-wide v1, p0, La/x2p;->b:J

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", sportId="

    .line 24
    .line 25
    const-string v2, ", subSportId="

    .line 26
    .line 27
    iget-wide v3, p0, La/x2p;->c:J

    .line 28
    .line 29
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-wide v1, p0, La/x2p;->d:J

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, ", champType="

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, La/x2p;->e:La/sgb;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, ", globalChampId="

    .line 48
    .line 49
    const-string v2, ", title="

    .line 50
    .line 51
    iget-wide v3, p0, La/x2p;->f:J

    .line 52
    .line 53
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v1, ", cyberType="

    .line 57
    .line 58
    const-string v2, ")"

    .line 59
    .line 60
    iget v3, p0, La/x2p;->h:I

    .line 61
    .line 62
    iget-object p0, p0, La/x2p;->g:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v3, p0, v1, v2, v0}, La/brm0;->j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method
