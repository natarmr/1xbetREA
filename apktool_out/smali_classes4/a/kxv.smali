.class public final La/kxv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:La/boh;

.field public final f:Z

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Z

.field public final j:Z


# direct methods
.method public constructor <init>(JJLjava/lang/String;Ljava/lang/String;La/boh;ZLjava/lang/String;Ljava/lang/String;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/kxv;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, La/kxv;->b:J

    .line 7
    .line 8
    iput-object p5, p0, La/kxv;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p6, p0, La/kxv;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p7, p0, La/kxv;->e:La/boh;

    .line 13
    .line 14
    iput-boolean p8, p0, La/kxv;->f:Z

    .line 15
    .line 16
    iput-object p9, p0, La/kxv;->g:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p10, p0, La/kxv;->h:Ljava/lang/String;

    .line 19
    .line 20
    iput-boolean p11, p0, La/kxv;->i:Z

    .line 21
    .line 22
    iput-boolean p12, p0, La/kxv;->j:Z

    .line 23
    .line 24
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
    instance-of v0, p1, La/kxv;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/kxv;

    .line 11
    .line 12
    iget-wide v0, p0, La/kxv;->a:J

    .line 13
    .line 14
    iget-wide v2, p1, La/kxv;->a:J

    .line 15
    .line 16
    cmp-long v0, v0, v2

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    iget-wide v0, p0, La/kxv;->b:J

    .line 22
    .line 23
    iget-wide v2, p1, La/kxv;->b:J

    .line 24
    .line 25
    cmp-long v0, v0, v2

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_3
    iget-object v0, p0, La/kxv;->c:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v1, p1, La/kxv;->c:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_4

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_4
    iget-object v0, p0, La/kxv;->d:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v1, p1, La/kxv;->d:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_5

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_5
    iget-object v0, p0, La/kxv;->e:La/boh;

    .line 53
    .line 54
    iget-object v1, p1, La/kxv;->e:La/boh;

    .line 55
    .line 56
    if-eq v0, v1, :cond_6

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_6
    iget-boolean v0, p0, La/kxv;->f:Z

    .line 60
    .line 61
    iget-boolean v1, p1, La/kxv;->f:Z

    .line 62
    .line 63
    if-eq v0, v1, :cond_7

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_7
    iget-object v0, p0, La/kxv;->g:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v1, p1, La/kxv;->g:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_8

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_8
    iget-object v0, p0, La/kxv;->h:Ljava/lang/String;

    .line 78
    .line 79
    iget-object v1, p1, La/kxv;->h:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_9

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_9
    iget-boolean v0, p0, La/kxv;->i:Z

    .line 89
    .line 90
    iget-boolean v1, p1, La/kxv;->i:Z

    .line 91
    .line 92
    if-eq v0, v1, :cond_a

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_a
    iget-boolean p0, p0, La/kxv;->j:Z

    .line 96
    .line 97
    iget-boolean p1, p1, La/kxv;->j:Z

    .line 98
    .line 99
    if-eq p0, p1, :cond_b

    .line 100
    .line 101
    :goto_0
    const/4 p0, 0x0

    .line 102
    return p0

    .line 103
    :cond_b
    :goto_1
    const/4 p0, 0x1

    .line 104
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/kxv;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

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
    iget-wide v2, p0, La/kxv;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/kxv;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/kxv;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/kxv;->e:La/boh;

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
    iget-boolean v0, p0, La/kxv;->f:Z

    .line 37
    .line 38
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v2, p0, La/kxv;->g:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object v2, p0, La/kxv;->h:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-boolean v2, p0, La/kxv;->i:Z

    .line 55
    .line 56
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-boolean p0, p0, La/kxv;->j:Z

    .line 61
    .line 62
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    add-int/2addr p0, v0

    .line 67
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "HighRatedChampModel(id="

    .line 2
    .line 3
    const-string v1, ", sportId="

    .line 4
    .line 5
    iget-wide v2, p0, La/kxv;->a:J

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, La/kng0;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, ", name="

    .line 12
    .line 13
    iget-wide v2, p0, La/kxv;->b:J

    .line 14
    .line 15
    iget-object v4, p0, La/kxv;->c:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0, v2, v3, v1, v4}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v1, ", image="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, La/kxv;->d:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", cyberType="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, La/kxv;->e:La/boh;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", isDuelChamp="

    .line 41
    .line 42
    const-string v2, ", nameEng="

    .line 43
    .line 44
    iget-object v3, p0, La/kxv;->g:Ljava/lang/String;

    .line 45
    .line 46
    iget-boolean v4, p0, La/kxv;->f:Z

    .line 47
    .line 48
    invoke-static {v1, v2, v3, v0, v4}, La/hne;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 49
    .line 50
    .line 51
    const-string v1, ", countryImage="

    .line 52
    .line 53
    const-string v2, ", live="

    .line 54
    .line 55
    iget-object v3, p0, La/kxv;->h:Ljava/lang/String;

    .line 56
    .line 57
    iget-boolean v4, p0, La/kxv;->i:Z

    .line 58
    .line 59
    invoke-static {v1, v3, v2, v0, v4}, La/w6x;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 60
    .line 61
    .line 62
    const-string v1, ", favorite="

    .line 63
    .line 64
    const-string v2, ")"

    .line 65
    .line 66
    iget-boolean p0, p0, La/kxv;->j:Z

    .line 67
    .line 68
    invoke-static {v0, v1, p0, v2}, La/f140;->n(Ljava/lang/StringBuilder;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method
