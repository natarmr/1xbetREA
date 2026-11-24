.class public final La/m54;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/xn4;

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:J


# direct methods
.method public constructor <init>(La/xn4;ZZZZJ)V
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
    iput-object p1, p0, La/m54;->a:La/xn4;

    .line 8
    .line 9
    iput-boolean p2, p0, La/m54;->b:Z

    .line 10
    .line 11
    iput-boolean p3, p0, La/m54;->c:Z

    .line 12
    .line 13
    iput-boolean p4, p0, La/m54;->d:Z

    .line 14
    .line 15
    iput-boolean p5, p0, La/m54;->e:Z

    .line 16
    .line 17
    iput-wide p6, p0, La/m54;->f:J

    .line 18
    .line 19
    return-void
.end method

.method public static a(La/m54;La/xn4;ZZJI)La/m54;
    .locals 8

    .line 1
    and-int/lit8 v0, p6, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, La/m54;->a:La/xn4;

    .line 6
    .line 7
    :cond_0
    move-object v1, p1

    .line 8
    and-int/lit8 p1, p6, 0x2

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-boolean p2, p0, La/m54;->b:Z

    .line 13
    .line 14
    :cond_1
    move v2, p2

    .line 15
    iget-boolean v3, p0, La/m54;->c:Z

    .line 16
    .line 17
    iget-boolean v4, p0, La/m54;->d:Z

    .line 18
    .line 19
    and-int/lit8 p1, p6, 0x10

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    iget-boolean p3, p0, La/m54;->e:Z

    .line 24
    .line 25
    :cond_2
    move v5, p3

    .line 26
    and-int/lit8 p1, p6, 0x20

    .line 27
    .line 28
    if-eqz p1, :cond_3

    .line 29
    .line 30
    iget-wide p4, p0, La/m54;->f:J

    .line 31
    .line 32
    :cond_3
    move-wide v6, p4

    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v0, La/m54;

    .line 37
    .line 38
    invoke-direct/range {v0 .. v7}, La/m54;-><init>(La/xn4;ZZZZJ)V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/m54;

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
    check-cast p1, La/m54;

    .line 12
    .line 13
    iget-object v1, p0, La/m54;->a:La/xn4;

    .line 14
    .line 15
    iget-object v3, p1, La/m54;->a:La/xn4;

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-boolean v1, p0, La/m54;->b:Z

    .line 21
    .line 22
    iget-boolean v3, p1, La/m54;->b:Z

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget-boolean v1, p0, La/m54;->c:Z

    .line 28
    .line 29
    iget-boolean v3, p1, La/m54;->c:Z

    .line 30
    .line 31
    if-eq v1, v3, :cond_4

    .line 32
    .line 33
    return v2

    .line 34
    :cond_4
    iget-boolean v1, p0, La/m54;->d:Z

    .line 35
    .line 36
    iget-boolean v3, p1, La/m54;->d:Z

    .line 37
    .line 38
    if-eq v1, v3, :cond_5

    .line 39
    .line 40
    return v2

    .line 41
    :cond_5
    iget-boolean v1, p0, La/m54;->e:Z

    .line 42
    .line 43
    iget-boolean v3, p1, La/m54;->e:Z

    .line 44
    .line 45
    if-eq v1, v3, :cond_6

    .line 46
    .line 47
    return v2

    .line 48
    :cond_6
    iget-wide v3, p0, La/m54;->f:J

    .line 49
    .line 50
    iget-wide p0, p1, La/m54;->f:J

    .line 51
    .line 52
    cmp-long p0, v3, p0

    .line 53
    .line 54
    if-eqz p0, :cond_7

    .line 55
    .line 56
    return v2

    .line 57
    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/m54;->a:La/xn4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget-boolean v2, p0, La/m54;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/m54;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/m54;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/m54;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-wide v1, p0, La/m54;->f:J

    .line 35
    .line 36
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

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
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AuthDefaultStateModel(authType="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/m54;->a:La/xn4;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", isAnimateChanges="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, La/m54;->b:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", hasAllowedAppWithoutAuth="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", lottieAnimationEnable="

    .line 29
    .line 30
    const-string v2, ", childLoading="

    .line 31
    .line 32
    iget-boolean v3, p0, La/m54;->c:Z

    .line 33
    .line 34
    iget-boolean v4, p0, La/m54;->d:Z

    .line 35
    .line 36
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", backPressTime="

    .line 40
    .line 41
    iget-wide v2, p0, La/m54;->f:J

    .line 42
    .line 43
    iget-boolean p0, p0, La/m54;->e:Z

    .line 44
    .line 45
    invoke-static {v2, v3, v1, v0, p0}, La/rw2;->v(JLjava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 46
    .line 47
    .line 48
    const-string p0, ")"

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method
