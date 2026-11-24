.class public final La/vb9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Ljava/util/List;

.field public final d:Z

.field public final e:Ljava/lang/String;

.field public final f:I


# direct methods
.method public constructor <init>(IJJLjava/lang/String;Ljava/util/List;Z)V
    .locals 0

    .line 1
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p2, p0, La/vb9;->a:J

    .line 8
    .line 9
    iput-wide p4, p0, La/vb9;->b:J

    .line 10
    .line 11
    iput-object p7, p0, La/vb9;->c:Ljava/util/List;

    .line 12
    .line 13
    iput-boolean p8, p0, La/vb9;->d:Z

    .line 14
    .line 15
    iput-object p6, p0, La/vb9;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput p1, p0, La/vb9;->f:I

    .line 18
    .line 19
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
    instance-of v0, p1, La/vb9;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/vb9;

    .line 10
    .line 11
    iget-wide v0, p0, La/vb9;->a:J

    .line 12
    .line 13
    iget-wide v2, p1, La/vb9;->a:J

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
    iget-wide v0, p0, La/vb9;->b:J

    .line 21
    .line 22
    iget-wide v2, p1, La/vb9;->b:J

    .line 23
    .line 24
    cmp-long v0, v0, v2

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-object v0, p0, La/vb9;->c:Ljava/util/List;

    .line 30
    .line 31
    iget-object v1, p1, La/vb9;->c:Ljava/util/List;

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
    iget-boolean v0, p0, La/vb9;->d:Z

    .line 41
    .line 42
    iget-boolean v1, p1, La/vb9;->d:Z

    .line 43
    .line 44
    if-eq v0, v1, :cond_5

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_5
    iget-object v0, p0, La/vb9;->e:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v1, p1, La/vb9;->e:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    iget p0, p0, La/vb9;->f:I

    .line 59
    .line 60
    iget p1, p1, La/vb9;->f:I

    .line 61
    .line 62
    if-eq p0, p1, :cond_7

    .line 63
    .line 64
    :goto_0
    const/4 p0, 0x0

    .line 65
    return p0

    .line 66
    :cond_7
    :goto_1
    const/4 p0, 0x1

    .line 67
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/vb9;->a:J

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
    iget-wide v2, p0, La/vb9;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/vb9;->c:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/vb9;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/vb9;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget p0, p0, La/vb9;->f:I

    .line 35
    .line 36
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v0

    .line 41
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "BuilderCouponModel(id="

    .line 2
    .line 3
    const-string v1, ", sportId="

    .line 4
    .line 5
    iget-wide v2, p0, La/vb9;->a:J

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, La/kng0;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, ", games="

    .line 12
    .line 13
    iget-wide v2, p0, La/vb9;->b:J

    .line 14
    .line 15
    iget-object v4, p0, La/vb9;->c:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {v0, v2, v3, v1, v4}, La/hne;->x(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    const-string v1, ", block="

    .line 21
    .line 22
    const-string v2, ", exceptionText="

    .line 23
    .line 24
    iget-object v3, p0, La/vb9;->e:Ljava/lang/String;

    .line 25
    .line 26
    iget-boolean v4, p0, La/vb9;->d:Z

    .line 27
    .line 28
    invoke-static {v1, v2, v3, v0, v4}, La/hne;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 29
    .line 30
    .line 31
    const-string v1, ", exceptionId="

    .line 32
    .line 33
    const-string v2, ")"

    .line 34
    .line 35
    iget p0, p0, La/vb9;->f:I

    .line 36
    .line 37
    invoke-static {v0, v1, p0, v2}, La/vqd;->p(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method
