.class public final La/nc50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/qc50;


# instance fields
.field public final a:La/ee;

.field public final b:La/sd;

.field public final c:La/rd;


# direct methods
.method public constructor <init>(La/ee;La/sd;)V
    .locals 6

    .line 1
    new-instance v0, La/rd;

    .line 2
    .line 3
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 4
    .line 5
    sget-object v1, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 6
    .line 7
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    new-instance v4, La/y3d;

    .line 12
    .line 13
    invoke-direct {v4, v2, v3}, La/y3d;-><init>(J)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    new-instance v5, La/y3d;

    .line 21
    .line 22
    invoke-direct {v5, v2, v3}, La/y3d;-><init>(J)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite20-0d7_KjU()J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    new-instance v3, La/y3d;

    .line 30
    .line 31
    invoke-direct {v3, v1, v2}, La/y3d;-><init>(J)V

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, v4, v5, v3}, La/rd;-><init>(La/y3d;La/y3d;La/y3d;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, La/nc50;->a:La/ee;

    .line 41
    .line 42
    iput-object p2, p0, La/nc50;->b:La/sd;

    .line 43
    .line 44
    iput-object v0, p0, La/nc50;->c:La/rd;

    .line 45
    .line 46
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
    instance-of v0, p1, La/nc50;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/nc50;

    .line 10
    .line 11
    iget-object v0, p0, La/nc50;->a:La/ee;

    .line 12
    .line 13
    iget-object v1, p1, La/nc50;->a:La/ee;

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
    iget-object v0, p0, La/nc50;->b:La/sd;

    .line 23
    .line 24
    iget-object v1, p1, La/nc50;->b:La/sd;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, La/sd;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, La/nc50;->c:La/rd;

    .line 34
    .line 35
    iget-object p1, p1, La/nc50;->c:La/rd;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, La/rd;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_4

    .line 42
    .line 43
    :goto_0
    const/4 p0, 0x0

    .line 44
    return p0

    .line 45
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 46
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/nc50;->a:La/ee;

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
    iget-object v2, p0, La/nc50;->b:La/sd;

    .line 11
    .line 12
    invoke-virtual {v2}, La/sd;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object p0, p0, La/nc50;->c:La/rd;

    .line 24
    .line 25
    invoke-virtual {p0}, La/rd;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    add-int/2addr p0, v0

    .line 30
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AccountControl(style="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/nc50;->a:La/ee;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", model="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/nc50;->b:La/sd;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", reversed=true, colors="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, La/nc50;->c:La/rd;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p0, ")"

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
