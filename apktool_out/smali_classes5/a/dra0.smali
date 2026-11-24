.class public final La/dra0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/era0;


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:Ljava/lang/String;

.field public final e:La/s7l0;

.field public final f:I

.field public final g:Z

.field public final h:La/yi00;


# direct methods
.method public constructor <init>(JLjava/lang/String;JLjava/lang/String;La/s7l0;IZLa/yi00;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-wide p1, p0, La/dra0;->a:J

    .line 11
    .line 12
    iput-object p3, p0, La/dra0;->b:Ljava/lang/String;

    .line 13
    .line 14
    iput-wide p4, p0, La/dra0;->c:J

    .line 15
    .line 16
    iput-object p6, p0, La/dra0;->d:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p7, p0, La/dra0;->e:La/s7l0;

    .line 19
    .line 20
    iput p8, p0, La/dra0;->f:I

    .line 21
    .line 22
    iput-boolean p9, p0, La/dra0;->g:Z

    .line 23
    .line 24
    iput-object p10, p0, La/dra0;->h:La/yi00;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/dra0;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/dra0;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/dra0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/dra0;

    .line 10
    .line 11
    iget-wide v0, p0, La/dra0;->a:J

    .line 12
    .line 13
    iget-wide v2, p1, La/dra0;->a:J

    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    iget-object v0, p0, La/dra0;->b:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v1, p1, La/dra0;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_3

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    iget-wide v0, p0, La/dra0;->c:J

    .line 32
    .line 33
    iget-wide v2, p1, La/dra0;->c:J

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
    iget-object v0, p0, La/dra0;->d:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v1, p1, La/dra0;->d:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_5

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    iget-object v0, p0, La/dra0;->e:La/s7l0;

    .line 52
    .line 53
    iget-object v1, p1, La/dra0;->e:La/s7l0;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_6

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_6
    iget v0, p0, La/dra0;->f:I

    .line 63
    .line 64
    iget v1, p1, La/dra0;->f:I

    .line 65
    .line 66
    if-eq v0, v1, :cond_7

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_7
    iget-boolean v0, p0, La/dra0;->g:Z

    .line 70
    .line 71
    iget-boolean v1, p1, La/dra0;->g:Z

    .line 72
    .line 73
    if-eq v0, v1, :cond_8

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_8
    iget-object p0, p0, La/dra0;->h:La/yi00;

    .line 77
    .line 78
    iget-object p1, p1, La/dra0;->h:La/yi00;

    .line 79
    .line 80
    invoke-virtual {p0, p1}, La/yi00;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-nez p0, :cond_9

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

.method public final getId()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/dra0;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/dra0;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/dra0;->a:J

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
    iget-object v2, p0, La/dra0;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/dra0;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/dra0;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/dra0;->e:La/s7l0;

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
    iget v0, p0, La/dra0;->f:I

    .line 37
    .line 38
    invoke-static {v0, v2, v1}, La/twn;->a(III)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget-boolean v2, p0, La/dra0;->g:Z

    .line 48
    .line 49
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iget-object p0, p0, La/dra0;->h:La/yi00;

    .line 54
    .line 55
    iget p0, p0, La/yi00;->a:I

    .line 56
    .line 57
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    add-int/2addr p0, v0

    .line 62
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "Sub(id="

    .line 2
    .line 3
    const-string v1, ", title="

    .line 4
    .line 5
    iget-wide v2, p0, La/dra0;->a:J

    .line 6
    .line 7
    iget-object v4, p0, La/dra0;->b:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v2, v3, v0, v1, v4}, La/axq;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", sportId="

    .line 14
    .line 15
    const-string v2, ", image="

    .line 16
    .line 17
    iget-wide v3, p0, La/dra0;->c:J

    .line 18
    .line 19
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, La/dra0;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ", style="

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, La/dra0;->e:La/s7l0;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, ", subSportId="

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", live=false, favoriteChecked="

    .line 43
    .line 44
    const-string v2, ", expressType="

    .line 45
    .line 46
    iget v3, p0, La/dra0;->f:I

    .line 47
    .line 48
    iget-boolean v4, p0, La/dra0;->g:Z

    .line 49
    .line 50
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, La/dra0;->h:La/yi00;

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string p0, ")"

    .line 59
    .line 60
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method
