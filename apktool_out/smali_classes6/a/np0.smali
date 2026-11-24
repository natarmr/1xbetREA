.class public final La/np0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pp0;


# instance fields
.field public final a:La/fyl;

.field public final b:Z

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:Z

.field public final f:J

.field public final g:J


# direct methods
.method public constructor <init>(La/fyl;ZLjava/lang/String;ZJI)V
    .locals 3

    .line 1
    and-int/lit8 v0, p7, 0x10

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    :goto_0
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 9
    .line 10
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 15
    .line 16
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    and-int/lit8 p7, p7, 0x40

    .line 21
    .line 22
    if-eqz p7, :cond_1

    .line 23
    .line 24
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 25
    .line 26
    .line 27
    move-result-object p5

    .line 28
    iget-object p5, p5, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 29
    .line 30
    invoke-virtual {p5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 31
    .line 32
    .line 33
    move-result-wide p5

    .line 34
    :cond_1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, La/np0;->a:La/fyl;

    .line 41
    .line 42
    iput-boolean p2, p0, La/np0;->b:Z

    .line 43
    .line 44
    iput-object p3, p0, La/np0;->c:Ljava/lang/String;

    .line 45
    .line 46
    iput-boolean p4, p0, La/np0;->d:Z

    .line 47
    .line 48
    iput-boolean v0, p0, La/np0;->e:Z

    .line 49
    .line 50
    iput-wide v1, p0, La/np0;->f:J

    .line 51
    .line 52
    iput-wide p5, p0, La/np0;->g:J

    .line 53
    .line 54
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
    instance-of v0, p1, La/np0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/np0;

    .line 10
    .line 11
    iget-object v0, p0, La/np0;->a:La/fyl;

    .line 12
    .line 13
    iget-object v1, p1, La/np0;->a:La/fyl;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/fyl;->equals(Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/np0;->b:Z

    .line 23
    .line 24
    iget-boolean v1, p1, La/np0;->b:Z

    .line 25
    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-object v0, p0, La/np0;->c:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v1, p1, La/np0;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-boolean v0, p0, La/np0;->d:Z

    .line 41
    .line 42
    iget-boolean v1, p1, La/np0;->d:Z

    .line 43
    .line 44
    if-eq v0, v1, :cond_5

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_5
    iget-boolean v0, p0, La/np0;->e:Z

    .line 48
    .line 49
    iget-boolean v1, p1, La/np0;->e:Z

    .line 50
    .line 51
    if-eq v0, v1, :cond_6

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_6
    iget-wide v0, p1, La/np0;->f:J

    .line 55
    .line 56
    sget v2, La/y3d;->h:I

    .line 57
    .line 58
    iget-wide v2, p0, La/np0;->f:J

    .line 59
    .line 60
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_7

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_7
    iget-wide v0, p0, La/np0;->g:J

    .line 68
    .line 69
    iget-wide p0, p1, La/np0;->g:J

    .line 70
    .line 71
    invoke-static {v0, v1, p0, p1}, La/h2t0;->a(JJ)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-nez p0, :cond_8

    .line 76
    .line 77
    :goto_0
    const/4 p0, 0x0

    .line 78
    return p0

    .line 79
    :cond_8
    :goto_1
    const/4 p0, 0x1

    .line 80
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/np0;->a:La/fyl;

    .line 2
    .line 3
    invoke-virtual {v0}, La/fyl;->hashCode()I

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
    iget-boolean v2, p0, La/np0;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/np0;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/np0;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/np0;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sget v2, La/y3d;->h:I

    .line 35
    .line 36
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 37
    .line 38
    iget-wide v2, p0, La/np0;->f:J

    .line 39
    .line 40
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-wide v1, p0, La/np0;->g:J

    .line 45
    .line 46
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    add-int/2addr p0, v0

    .line 51
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-wide v0, p0, La/np0;->f:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/np0;->g:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "Content(model="

    .line 16
    .line 17
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v3, p0, La/np0;->a:La/fyl;

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v3, ", hasFilter="

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-boolean v3, p0, La/np0;->b:Z

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v3, ", filterLabel="

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v3, ", isSelectedFilter="

    .line 41
    .line 42
    const-string v4, ", isScrollToStartEnabled="

    .line 43
    .line 44
    iget-object v5, p0, La/np0;->c:Ljava/lang/String;

    .line 45
    .line 46
    iget-boolean v6, p0, La/np0;->d:Z

    .line 47
    .line 48
    invoke-static {v5, v3, v4, v2, v6}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 49
    .line 50
    .line 51
    const-string v3, ", buttonIconColor="

    .line 52
    .line 53
    const-string v4, ", buttonBackgroundColor="

    .line 54
    .line 55
    iget-boolean p0, p0, La/np0;->e:Z

    .line 56
    .line 57
    invoke-static {v3, v0, v4, v2, p0}, La/f140;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 58
    .line 59
    .line 60
    const-string p0, ")"

    .line 61
    .line 62
    invoke-static {v2, v1, p0}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method
