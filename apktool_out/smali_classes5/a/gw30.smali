.class public final La/gw30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/hw30;


# instance fields
.field public final a:Z

.field public final b:La/r040;

.field public final c:I

.field public final d:J

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:J

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZLa/r040;IJLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, La/iz30;->a:La/htz;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-boolean p1, p0, La/gw30;->a:Z

    .line 13
    .line 14
    iput-object p2, p0, La/gw30;->b:La/r040;

    .line 15
    .line 16
    iput p3, p0, La/gw30;->c:I

    .line 17
    .line 18
    iput-wide p4, p0, La/gw30;->d:J

    .line 19
    .line 20
    iput-object p6, p0, La/gw30;->e:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p7, p0, La/gw30;->f:Ljava/lang/String;

    .line 23
    .line 24
    iput-wide p8, p0, La/gw30;->g:J

    .line 25
    .line 26
    iput-object p10, p0, La/gw30;->h:Ljava/lang/String;

    .line 27
    .line 28
    iput-object p11, p0, La/gw30;->i:Ljava/lang/String;

    .line 29
    .line 30
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
    instance-of v0, p1, La/gw30;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/gw30;

    .line 11
    .line 12
    iget-boolean v0, p0, La/gw30;->a:Z

    .line 13
    .line 14
    iget-boolean v1, p1, La/gw30;->a:Z

    .line 15
    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_2
    iget-object v0, p0, La/gw30;->b:La/r040;

    .line 20
    .line 21
    iget-object v1, p1, La/gw30;->b:La/r040;

    .line 22
    .line 23
    if-eq v0, v1, :cond_3

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    iget v0, p0, La/gw30;->c:I

    .line 27
    .line 28
    iget v1, p1, La/gw30;->c:I

    .line 29
    .line 30
    if-eq v0, v1, :cond_4

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_4
    sget-object v0, La/iz30;->a:La/htz;

    .line 34
    .line 35
    iget-wide v0, p1, La/gw30;->d:J

    .line 36
    .line 37
    sget v2, La/y3d;->h:I

    .line 38
    .line 39
    iget-wide v2, p0, La/gw30;->d:J

    .line 40
    .line 41
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_5

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_5
    iget-object v0, p0, La/gw30;->e:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v1, p1, La/gw30;->e:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_6

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_6
    iget-object v0, p0, La/gw30;->f:Ljava/lang/String;

    .line 60
    .line 61
    iget-object v1, p1, La/gw30;->f:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_7

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_7
    iget-wide v0, p0, La/gw30;->g:J

    .line 71
    .line 72
    iget-wide v2, p1, La/gw30;->g:J

    .line 73
    .line 74
    invoke-static {v0, v1, v2, v3}, La/h2t0;->a(JJ)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_8

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_8
    iget-object v0, p0, La/gw30;->h:Ljava/lang/String;

    .line 82
    .line 83
    iget-object v1, p1, La/gw30;->h:Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_9

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_9
    iget-object p0, p0, La/gw30;->i:Ljava/lang/String;

    .line 93
    .line 94
    iget-object p1, p1, La/gw30;->i:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-nez p0, :cond_a

    .line 101
    .line 102
    :goto_0
    const/4 p0, 0x0

    .line 103
    return p0

    .line 104
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 105
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-boolean v0, p0, La/gw30;->a:Z

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
    iget-object v2, p0, La/gw30;->b:La/r040;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/w6x;->f(La/r040;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/gw30;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sget-object v2, La/iz30;->c:La/iz30;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/f140;->g(La/iz30;II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    sget v2, La/y3d;->h:I

    .line 29
    .line 30
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 31
    .line 32
    iget-wide v2, p0, La/gw30;->d:J

    .line 33
    .line 34
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-object v2, p0, La/gw30;->e:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v2, p0, La/gw30;->f:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-wide v2, p0, La/gw30;->g:J

    .line 51
    .line 52
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    const v2, 0x7f080f06

    .line 57
    .line 58
    .line 59
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget-object v1, p0, La/gw30;->h:Ljava/lang/String;

    .line 64
    .line 65
    const/16 v2, 0x3c1

    .line 66
    .line 67
    invoke-static {v0, v2, v1}, La/ua80;->b(IILjava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iget-object p0, p0, La/gw30;->i:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    add-int/2addr p0, v0

    .line 78
    return p0
.end method

.method public final m()La/iz30;
    .locals 0

    .line 1
    sget-object p0, La/iz30;->c:La/iz30;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n()La/r040;
    .locals 0

    .line 1
    iget-object p0, p0, La/gw30;->b:La/r040;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v0, La/iz30;->c:La/iz30;

    .line 2
    .line 3
    iget-wide v1, p0, La/gw30;->d:J

    .line 4
    .line 5
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-wide v2, p0, La/gw30;->g:J

    .line 10
    .line 11
    invoke-static {v2, v3}, La/y3d;->i(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    new-instance v3, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v4, "SpecialMenuIndividualUiItem(isBadgeVisible="

    .line 18
    .line 19
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-boolean v4, p0, La/gw30;->a:Z

    .line 23
    .line 24
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v4, ", menuSectionType="

    .line 28
    .line 29
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v4, p0, La/gw30;->b:La/r040;

    .line 33
    .line 34
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v4, ", eventId="

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget v4, p0, La/gw30;->c:I

    .line 43
    .line 44
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v4, ", menuItemModel="

    .line 48
    .line 49
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v0, ", iconTint="

    .line 56
    .line 57
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v0, ", iconUrl="

    .line 61
    .line 62
    const-string v4, ", iconBackgroundUrl="

    .line 63
    .line 64
    iget-object v5, p0, La/gw30;->e:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v3, v1, v0, v5, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const-string v0, ", iconPlaceholderTint="

    .line 70
    .line 71
    const-string v1, ", iconPlaceholder="

    .line 72
    .line 73
    iget-object v4, p0, La/gw30;->f:Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v3, v4, v0, v2, v1}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-string v0, ", title="

    .line 79
    .line 80
    const-string v1, ", subtitle=, endIconUrl="

    .line 81
    .line 82
    const v2, 0x7f080f06

    .line 83
    .line 84
    .line 85
    iget-object v4, p0, La/gw30;->h:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v2, v0, v4, v1, v3}, La/kng0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 88
    .line 89
    .line 90
    const-string v0, ")"

    .line 91
    .line 92
    iget-object p0, p0, La/gw30;->i:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {v3, p0, v0}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0
.end method
