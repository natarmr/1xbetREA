.class public final La/kba;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/a4x;

.field public final c:J

.field public final d:Ljava/lang/String;

.field public final e:La/a4x;

.field public final f:J

.field public final g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;La/a4x;JLjava/lang/String;La/a4x;JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, La/kba;->a:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p2, p0, La/kba;->b:La/a4x;

    .line 22
    .line 23
    iput-wide p3, p0, La/kba;->c:J

    .line 24
    .line 25
    iput-object p5, p0, La/kba;->d:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p6, p0, La/kba;->e:La/a4x;

    .line 28
    .line 29
    iput-wide p7, p0, La/kba;->f:J

    .line 30
    .line 31
    iput-object p9, p0, La/kba;->g:Ljava/lang/String;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/kba;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/kba;

    .line 12
    .line 13
    iget-object v1, p0, La/kba;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, La/kba;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, La/kba;->b:La/a4x;

    .line 25
    .line 26
    iget-object v3, p1, La/kba;->b:La/a4x;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-wide v3, p1, La/kba;->c:J

    .line 36
    .line 37
    sget v1, La/y3d;->h:I

    .line 38
    .line 39
    iget-wide v5, p0, La/kba;->c:J

    .line 40
    .line 41
    invoke-static {v5, v6, v3, v4}, La/h2t0;->a(JJ)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_4

    .line 46
    .line 47
    return v2

    .line 48
    :cond_4
    iget-object v1, p0, La/kba;->d:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v3, p1, La/kba;->d:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_5

    .line 57
    .line 58
    return v2

    .line 59
    :cond_5
    iget-object v1, p0, La/kba;->e:La/a4x;

    .line 60
    .line 61
    iget-object v3, p1, La/kba;->e:La/a4x;

    .line 62
    .line 63
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_6

    .line 68
    .line 69
    return v2

    .line 70
    :cond_6
    iget-wide v3, p0, La/kba;->f:J

    .line 71
    .line 72
    iget-wide v5, p1, La/kba;->f:J

    .line 73
    .line 74
    invoke-static {v3, v4, v5, v6}, La/h2t0;->a(JJ)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-nez v1, :cond_7

    .line 79
    .line 80
    return v2

    .line 81
    :cond_7
    iget-object p0, p0, La/kba;->g:Ljava/lang/String;

    .line 82
    .line 83
    iget-object p1, p1, La/kba;->g:Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    if-nez p0, :cond_8

    .line 90
    .line 91
    return v2

    .line 92
    :cond_8
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/kba;->a:Ljava/lang/String;

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
    iget-object v2, p0, La/kba;->b:La/a4x;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

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
    iget-wide v2, p0, La/kba;->c:J

    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v2, p0, La/kba;->d:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v2, p0, La/kba;->e:La/a4x;

    .line 33
    .line 34
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-wide v2, p0, La/kba;->f:J

    .line 39
    .line 40
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object p0, p0, La/kba;->g:Ljava/lang/String;

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
    iget-wide v0, p0, La/kba;->c:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/kba;->f:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, ", firstPlayerCards="

    .line 14
    .line 15
    const-string v3, ", firstPlayerColor="

    .line 16
    .line 17
    const-string v4, "CardBasketballQuarterUiModel(title="

    .line 18
    .line 19
    iget-object v5, p0, La/kba;->a:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v6, p0, La/kba;->b:La/a4x;

    .line 22
    .line 23
    invoke-static {v4, v5, v2, v6, v3}, La/kng0;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/a4x;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, ", firstPlayerScore="

    .line 28
    .line 29
    const-string v4, ", secondPlayerCards="

    .line 30
    .line 31
    iget-object v5, p0, La/kba;->d:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v2, v0, v3, v5, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, La/kba;->e:La/a4x;

    .line 37
    .line 38
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v0, ", secondPlayerColor="

    .line 42
    .line 43
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v0, ", secondPlayerScore="

    .line 50
    .line 51
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v0, ")"

    .line 55
    .line 56
    iget-object p0, p0, La/kba;->g:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v2, p0, v0}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method
