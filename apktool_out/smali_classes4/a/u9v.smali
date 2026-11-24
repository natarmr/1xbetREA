.class public final La/u9v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:J

.field public final g:Ljava/lang/String;


# direct methods
.method public constructor <init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p5, p0, La/u9v;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p6, p0, La/u9v;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-wide p1, p0, La/u9v;->c:J

    .line 12
    .line 13
    iput-object p7, p0, La/u9v;->d:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p8, p0, La/u9v;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-wide p3, p0, La/u9v;->f:J

    .line 18
    .line 19
    iput-object p9, p0, La/u9v;->g:Ljava/lang/String;

    .line 20
    .line 21
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
    instance-of v0, p1, La/u9v;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/u9v;

    .line 10
    .line 11
    iget-object v0, p0, La/u9v;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, La/u9v;->a:Ljava/lang/String;

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
    iget-object v0, p0, La/u9v;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p1, La/u9v;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-wide v0, p1, La/u9v;->c:J

    .line 34
    .line 35
    sget v2, La/y3d;->h:I

    .line 36
    .line 37
    iget-wide v2, p0, La/u9v;->c:J

    .line 38
    .line 39
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_4
    iget-object v0, p0, La/u9v;->d:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v1, p1, La/u9v;->d:Ljava/lang/String;

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
    goto :goto_0

    .line 57
    :cond_5
    iget-object v0, p0, La/u9v;->e:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v1, p1, La/u9v;->e:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_6

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_6
    iget-wide v0, p0, La/u9v;->f:J

    .line 69
    .line 70
    iget-wide v2, p1, La/u9v;->f:J

    .line 71
    .line 72
    invoke-static {v0, v1, v2, v3}, La/h2t0;->a(JJ)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_7

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_7
    iget-object p0, p0, La/u9v;->g:Ljava/lang/String;

    .line 80
    .line 81
    iget-object p1, p1, La/u9v;->g:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    if-nez p0, :cond_8

    .line 88
    .line 89
    :goto_0
    const/4 p0, 0x0

    .line 90
    return p0

    .line 91
    :cond_8
    :goto_1
    const/4 p0, 0x1

    .line 92
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/u9v;->a:Ljava/lang/String;

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
    iget-object v2, p0, La/u9v;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sget v2, La/y3d;->h:I

    .line 17
    .line 18
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 19
    .line 20
    iget-wide v2, p0, La/u9v;->c:J

    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v2, p0, La/u9v;->d:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v2, p0, La/u9v;->e:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-wide v2, p0, La/u9v;->f:J

    .line 39
    .line 40
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object p0, p0, La/u9v;->g:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

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
    iget-wide v0, p0, La/u9v;->c:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/u9v;->f:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, ", text="

    .line 14
    .line 15
    const-string v3, ", textColor="

    .line 16
    .line 17
    const-string v4, "GoldRushCoordinatesGameInfoUiModel(background="

    .line 18
    .line 19
    iget-object v5, p0, La/u9v;->a:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v6, p0, La/u9v;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v4, v5, v2, v6, v3}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, ", bonusIcon="

    .line 28
    .line 29
    const-string v4, ", filledBackground="

    .line 30
    .line 31
    iget-object v5, p0, La/u9v;->d:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v2, v0, v3, v5, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, ", filledTextColor="

    .line 37
    .line 38
    const-string v3, ", filledIcon="

    .line 39
    .line 40
    iget-object v4, p0, La/u9v;->e:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v2, v4, v0, v1, v3}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string v0, ")"

    .line 46
    .line 47
    iget-object p0, p0, La/u9v;->g:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v2, p0, v0}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method
