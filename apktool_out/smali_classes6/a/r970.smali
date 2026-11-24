.class public final La/r970;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/wul;

.field public final b:La/wul;

.field public final c:J


# direct methods
.method public constructor <init>(La/wul;La/wul;J)V
    .locals 1

    .line 1
    sget-object v0, La/vul;->a:La/vul;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/r970;->a:La/wul;

    .line 7
    .line 8
    iput-object p2, p0, La/r970;->b:La/wul;

    .line 9
    .line 10
    iput-wide p3, p0, La/r970;->c:J

    .line 11
    .line 12
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
    instance-of v0, p1, La/r970;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/r970;

    .line 10
    .line 11
    sget-object v0, La/vul;->a:La/vul;

    .line 12
    .line 13
    iget-object v0, p0, La/r970;->a:La/wul;

    .line 14
    .line 15
    iget-object v1, p1, La/r970;->a:La/wul;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, La/wul;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    iget-object v0, p0, La/r970;->b:La/wul;

    .line 25
    .line 26
    iget-object v1, p1, La/r970;->b:La/wul;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, La/wul;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    iget-wide v0, p1, La/r970;->c:J

    .line 36
    .line 37
    sget p1, La/y3d;->h:I

    .line 38
    .line 39
    iget-wide p0, p0, La/r970;->c:J

    .line 40
    .line 41
    invoke-static {p0, p1, v0, v1}, La/h2t0;->a(JJ)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-nez p0, :cond_4

    .line 46
    .line 47
    :goto_0
    const/4 p0, 0x0

    .line 48
    return p0

    .line 49
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 50
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    sget-object v0, La/vul;->b:La/vul;

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
    iget-object v2, p0, La/r970;->a:La/wul;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/i8i;->a(La/wul;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/r970;->b:La/wul;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/i8i;->a(La/wul;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sget v1, La/y3d;->h:I

    .line 23
    .line 24
    sget-object v1, La/h2t0;->b:La/g2t0;

    .line 25
    .line 26
    iget-wide v1, p0, La/r970;->c:J

    .line 27
    .line 28
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    add-int/2addr p0, v0

    .line 33
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, La/vul;->b:La/vul;

    .line 2
    .line 3
    iget-wide v1, p0, La/r970;->c:J

    .line 4
    .line 5
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v3, "BottomContent(arrangement="

    .line 12
    .line 13
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v0, ", disableDemoButtonModel="

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, La/r970;->a:La/wul;

    .line 25
    .line 26
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v0, ", exitButtonModel="

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, La/r970;->b:La/wul;

    .line 35
    .line 36
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p0, ", backgroundColor="

    .line 40
    .line 41
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p0, ")"

    .line 48
    .line 49
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method
