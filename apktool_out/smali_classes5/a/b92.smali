.class public final La/b92;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:La/lok0;

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z


# direct methods
.method public constructor <init>(ILjava/lang/String;ZLa/lok0;ZZZZ)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, La/b92;->a:I

    .line 8
    .line 9
    iput-object p2, p0, La/b92;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-boolean p3, p0, La/b92;->c:Z

    .line 12
    .line 13
    iput-object p4, p0, La/b92;->d:La/lok0;

    .line 14
    .line 15
    iput-boolean p5, p0, La/b92;->e:Z

    .line 16
    .line 17
    iput-boolean p6, p0, La/b92;->f:Z

    .line 18
    .line 19
    iput-boolean p7, p0, La/b92;->g:Z

    .line 20
    .line 21
    iput-boolean p8, p0, La/b92;->h:Z

    .line 22
    .line 23
    return-void
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
    instance-of v0, p1, La/b92;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/b92;

    .line 10
    .line 11
    iget v0, p0, La/b92;->a:I

    .line 12
    .line 13
    iget v1, p1, La/b92;->a:I

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-object v0, p0, La/b92;->b:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v1, p1, La/b92;->b:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-boolean v0, p0, La/b92;->c:Z

    .line 30
    .line 31
    iget-boolean v1, p1, La/b92;->c:Z

    .line 32
    .line 33
    if-eq v0, v1, :cond_4

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_4
    iget-object v0, p0, La/b92;->d:La/lok0;

    .line 37
    .line 38
    iget-object v1, p1, La/b92;->d:La/lok0;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, La/lok0;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_5

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_5
    iget-boolean v0, p0, La/b92;->e:Z

    .line 48
    .line 49
    iget-boolean v1, p1, La/b92;->e:Z

    .line 50
    .line 51
    if-eq v0, v1, :cond_6

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_6
    iget-boolean v0, p0, La/b92;->f:Z

    .line 55
    .line 56
    iget-boolean v1, p1, La/b92;->f:Z

    .line 57
    .line 58
    if-eq v0, v1, :cond_7

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_7
    iget-boolean v0, p0, La/b92;->g:Z

    .line 62
    .line 63
    iget-boolean v1, p1, La/b92;->g:Z

    .line 64
    .line 65
    if-eq v0, v1, :cond_8

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_8
    iget-boolean p0, p0, La/b92;->h:Z

    .line 69
    .line 70
    iget-boolean p1, p1, La/b92;->h:Z

    .line 71
    .line 72
    if-eq p0, p1, :cond_9

    .line 73
    .line 74
    :goto_0
    const/4 p0, 0x0

    .line 75
    return p0

    .line 76
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 77
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, La/b92;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

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
    iget-object v2, p0, La/b92;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/b92;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/b92;->d:La/lok0;

    .line 23
    .line 24
    invoke-virtual {v2}, La/lok0;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-boolean v0, p0, La/b92;->e:Z

    .line 31
    .line 32
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-boolean v2, p0, La/b92;->f:Z

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-boolean v2, p0, La/b92;->g:Z

    .line 43
    .line 44
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-boolean p0, p0, La/b92;->h:Z

    .line 49
    .line 50
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    const-string v0, ", eventTitle="

    .line 2
    .line 3
    const-string v1, ", isTabletDevice="

    .line 4
    .line 5
    iget v2, p0, La/b92;->a:I

    .line 6
    .line 7
    const-string v3, "AltDesignLSpecialEventMainSettings(eventId="

    .line 8
    .line 9
    iget-object v4, p0, La/b92;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/vqd;->r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-boolean v1, p0, La/b92;->c:Z

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", specialEventInfo="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, La/b92;->d:La/lok0;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", isSmallDevice="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, ", isThemeDark="

    .line 36
    .line 37
    const-string v2, ", isNewEventParams="

    .line 38
    .line 39
    iget-boolean v3, p0, La/b92;->e:Z

    .line 40
    .line 41
    iget-boolean v4, p0, La/b92;->f:Z

    .line 42
    .line 43
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 44
    .line 45
    .line 46
    const-string v1, ", hasWhoWinSection="

    .line 47
    .line 48
    const-string v2, ")"

    .line 49
    .line 50
    iget-boolean v3, p0, La/b92;->g:Z

    .line 51
    .line 52
    iget-boolean p0, p0, La/b92;->h:Z

    .line 53
    .line 54
    invoke-static {v1, v2, v0, v3, p0}, La/ohs0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method
