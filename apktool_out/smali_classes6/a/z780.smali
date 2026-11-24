.class public final La/z780;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/c880;


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/String;

.field public final c:La/hnm;

.field public final d:Z

.field public final e:La/s6q0;

.field public final f:La/x6q0;

.field public final g:La/mtl;


# direct methods
.method public constructor <init>(ZLjava/lang/String;La/hnm;ZLa/s6q0;La/x6q0;La/mtl;)V
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
    iput-boolean p1, p0, La/z780;->a:Z

    .line 8
    .line 9
    iput-object p2, p0, La/z780;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, La/z780;->c:La/hnm;

    .line 12
    .line 13
    iput-boolean p4, p0, La/z780;->d:Z

    .line 14
    .line 15
    iput-object p5, p0, La/z780;->e:La/s6q0;

    .line 16
    .line 17
    iput-object p6, p0, La/z780;->f:La/x6q0;

    .line 18
    .line 19
    iput-object p7, p0, La/z780;->g:La/mtl;

    .line 20
    .line 21
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
    instance-of v0, p1, La/z780;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/z780;

    .line 10
    .line 11
    iget-boolean v0, p0, La/z780;->a:Z

    .line 12
    .line 13
    iget-boolean v1, p1, La/z780;->a:Z

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-object v0, p0, La/z780;->b:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v1, p1, La/z780;->b:Ljava/lang/String;

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
    iget-object v0, p0, La/z780;->c:La/hnm;

    .line 30
    .line 31
    iget-object v1, p1, La/z780;->c:La/hnm;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, La/hnm;->equals(Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/z780;->d:Z

    .line 41
    .line 42
    iget-boolean v1, p1, La/z780;->d:Z

    .line 43
    .line 44
    if-eq v0, v1, :cond_5

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_5
    iget-object v0, p0, La/z780;->e:La/s6q0;

    .line 48
    .line 49
    iget-object v1, p1, La/z780;->e:La/s6q0;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, La/s6q0;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/z780;->f:La/x6q0;

    .line 59
    .line 60
    iget-object v1, p1, La/z780;->f:La/x6q0;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, La/x6q0;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_7

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_7
    iget-object p0, p0, La/z780;->g:La/mtl;

    .line 70
    .line 71
    iget-object p1, p1, La/z780;->g:La/mtl;

    .line 72
    .line 73
    invoke-virtual {p0, p1}, La/mtl;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-nez p0, :cond_8

    .line 78
    .line 79
    :goto_0
    const/4 p0, 0x0

    .line 80
    return p0

    .line 81
    :cond_8
    :goto_1
    const/4 p0, 0x1

    .line 82
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La/z780;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-object v2, p0, La/z780;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/z780;->c:La/hnm;

    .line 17
    .line 18
    invoke-virtual {v2}, La/hnm;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    iget-boolean v0, p0, La/z780;->d:Z

    .line 25
    .line 26
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, La/z780;->e:La/s6q0;

    .line 31
    .line 32
    invoke-virtual {v2}, La/s6q0;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    add-int/2addr v2, v0

    .line 37
    mul-int/2addr v2, v1

    .line 38
    iget-object v0, p0, La/z780;->f:La/x6q0;

    .line 39
    .line 40
    invoke-virtual {v0}, La/x6q0;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    add-int/2addr v0, v2

    .line 45
    mul-int/2addr v0, v1

    .line 46
    iget-object p0, p0, La/z780;->g:La/mtl;

    .line 47
    .line 48
    iget-object p0, p0, La/mtl;->a:La/a4x;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

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
    const-string v0, ", topNotifyText="

    .line 2
    .line 3
    const-string v1, ", phoneTextFieldModel="

    .line 4
    .line 5
    const-string v2, "Content(isLoading="

    .line 6
    .line 7
    iget-object v3, p0, La/z780;->b:Ljava/lang/String;

    .line 8
    .line 9
    iget-boolean v4, p0, La/z780;->a:Z

    .line 10
    .line 11
    invoke-static {v2, v0, v3, v4, v1}, La/axq;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, La/z780;->c:La/hnm;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", isLanguageOperatorVisible="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-boolean v1, p0, La/z780;->d:Z

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", languageOperatorModel="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, La/z780;->e:La/s6q0;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", messageModel="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, La/z780;->f:La/x6q0;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", bottomMenuModel="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object p0, p0, La/z780;->g:La/mtl;

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string p0, ")"

    .line 61
    .line 62
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method
