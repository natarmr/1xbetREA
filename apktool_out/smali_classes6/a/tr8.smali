.class public final La/tr8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/xr8;

.field public final b:La/ur8;

.field public final c:La/xr8;

.field public final d:La/xr8;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    new-instance v0, La/vr8;

    .line 2
    .line 3
    const v1, 0x3f5ddd6e    # 0.86666f

    .line 4
    .line 5
    .line 6
    const v2, 0x3edf3b64    # 0.436f

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, La/vr8;-><init>(FF)V

    .line 10
    .line 11
    .line 12
    sget-object v1, La/ur8;->a:La/ur8;

    .line 13
    .line 14
    new-instance v2, La/vr8;

    .line 15
    .line 16
    const v3, 0x3d03126f    # 0.032f

    .line 17
    .line 18
    .line 19
    const v4, 0x3c83126f    # 0.016f

    .line 20
    .line 21
    .line 22
    invoke-direct {v2, v3, v4}, La/vr8;-><init>(FF)V

    .line 23
    .line 24
    .line 25
    new-instance v5, La/vr8;

    .line 26
    .line 27
    invoke-direct {v5, v3, v4}, La/vr8;-><init>(FF)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, La/tr8;->a:La/xr8;

    .line 34
    .line 35
    iput-object v1, p0, La/tr8;->b:La/ur8;

    .line 36
    .line 37
    iput-object v2, p0, La/tr8;->c:La/xr8;

    .line 38
    .line 39
    iput-object v5, p0, La/tr8;->d:La/xr8;

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/tr8;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/tr8;

    .line 11
    .line 12
    iget-object v1, p0, La/tr8;->a:La/xr8;

    .line 13
    .line 14
    iget-object v2, p1, La/tr8;->a:La/xr8;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget-object v1, p0, La/tr8;->b:La/ur8;

    .line 24
    .line 25
    iget-object v2, p1, La/tr8;->b:La/ur8;

    .line 26
    .line 27
    if-eq v1, v2, :cond_3

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_3
    iget-object v1, p0, La/tr8;->c:La/xr8;

    .line 31
    .line 32
    iget-object v2, p1, La/tr8;->c:La/xr8;

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_4

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_4
    iget-object p0, p0, La/tr8;->d:La/xr8;

    .line 42
    .line 43
    iget-object p1, p1, La/tr8;->d:La/xr8;

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-nez p0, :cond_5

    .line 50
    .line 51
    :goto_0
    const/4 p0, 0x0

    .line 52
    return p0

    .line 53
    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/tr8;->a:La/xr8;

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
    const/16 v2, 0x5c

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/tr8;->b:La/ur8;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-static {v0, v2, v1}, La/twn;->a(III)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v2, p0, La/tr8;->c:La/xr8;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    add-int/2addr v2, v0

    .line 36
    mul-int/2addr v2, v1

    .line 37
    iget-object p0, p0, La/tr8;->d:La/xr8;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    add-int/2addr p0, v2

    .line 44
    mul-int/2addr p0, v1

    .line 45
    const/16 v0, 0x10

    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    add-int/2addr v0, p0

    .line 52
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Config(cellWidth="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/tr8;->a:La/xr8;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", cellHeight=92, contentMode="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/tr8;->b:La/ur8;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", horizontalPageOffset=0, lineStartLength="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/tr8;->c:La/xr8;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", lineEndLength="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, La/tr8;->d:La/xr8;

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p0, ", nextLayerShowLength=16)"

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
