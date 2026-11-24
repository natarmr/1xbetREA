.class public final La/lvl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/mvl;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/tui0;

.field public final c:La/mvi0;

.field public final d:La/tvi0;

.field public final e:La/wui0;

.field public final f:La/rqm;


# direct methods
.method public constructor <init>(Ljava/lang/String;La/tui0;La/mvi0;)V
    .locals 10

    .line 1
    sget-object v6, La/wui0;->a:La/wui0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/lvl;->a:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p2, p0, La/lvl;->b:La/tui0;

    .line 9
    .line 10
    iput-object p3, p0, La/lvl;->c:La/mvi0;

    .line 11
    .line 12
    sget-object v5, La/qvi0;->a:La/qvi0;

    .line 13
    .line 14
    iput-object v5, p0, La/lvl;->d:La/tvi0;

    .line 15
    .line 16
    iput-object v6, p0, La/lvl;->e:La/wui0;

    .line 17
    .line 18
    new-instance v0, La/rqm;

    .line 19
    .line 20
    sget-object v4, La/d4d;->z:La/d4d;

    .line 21
    .line 22
    const/16 v9, 0x8

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    const/4 v7, 0x1

    .line 26
    const/4 v8, 0x0

    .line 27
    move-object v1, p2

    .line 28
    move-object v3, p3

    .line 29
    invoke-direct/range {v0 .. v9}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, La/lvl;->f:La/rqm;

    .line 33
    .line 34
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
    instance-of v0, p1, La/lvl;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/lvl;

    .line 10
    .line 11
    iget-object v0, p0, La/lvl;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, La/lvl;->a:Ljava/lang/String;

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
    iget-object v0, p0, La/lvl;->b:La/tui0;

    .line 23
    .line 24
    iget-object v1, p1, La/lvl;->b:La/tui0;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, La/tui0;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/lvl;->c:La/mvi0;

    .line 34
    .line 35
    iget-object v1, p1, La/lvl;->c:La/mvi0;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, La/mvi0;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-object v0, p0, La/lvl;->d:La/tvi0;

    .line 45
    .line 46
    iget-object v1, p1, La/lvl;->d:La/tvi0;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget-object p0, p0, La/lvl;->e:La/wui0;

    .line 56
    .line 57
    iget-object p1, p1, La/lvl;->e:La/wui0;

    .line 58
    .line 59
    if-eq p0, p1, :cond_6

    .line 60
    .line 61
    :goto_0
    const/4 p0, 0x0

    .line 62
    return p0

    .line 63
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 64
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/lvl;->a:Ljava/lang/String;

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
    iget-object v2, p0, La/lvl;->b:La/tui0;

    .line 11
    .line 12
    invoke-virtual {v2}, La/tui0;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/lit16 v2, v2, 0x3c1

    .line 18
    .line 19
    iget-object v0, p0, La/lvl;->c:La/mvi0;

    .line 20
    .line 21
    invoke-virtual {v0}, La/mvi0;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    add-int/2addr v0, v2

    .line 26
    mul-int/2addr v0, v1

    .line 27
    iget-object v2, p0, La/lvl;->d:La/tvi0;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    add-int/2addr v2, v0

    .line 34
    mul-int/2addr v2, v1

    .line 35
    iget-object p0, p0, La/lvl;->e:La/wui0;

    .line 36
    .line 37
    invoke-static {p0, v2, v1}, La/rw2;->c(La/wui0;II)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    const/4 v0, 0x1

    .line 42
    invoke-static {p0, v1, v0}, La/brm0;->e(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Short(id="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/lvl;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", settingCellMiddleStyle="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/lvl;->b:La/tui0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", settingCellLeftStyle=null, settingCellRightStyle="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/lvl;->c:La/mvi0;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", shape="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/lvl;->d:La/tvi0;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", position="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, La/lvl;->e:La/wui0;

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p0, ", enable=true, gradientBrush=null)"

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method
