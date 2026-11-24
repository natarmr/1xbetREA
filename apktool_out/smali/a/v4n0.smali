.class public final La/v4n0;
.super La/um40;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/um40;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0081\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "La/v4n0;",
        "La/um40;",
        "La/w4n0;",
        "io.coil-kt.coil3_coil-compose-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final b:La/pm80;

.field public final c:La/u12;

.field public final d:La/qge;

.field public final e:F

.field public final f:La/a4d;

.field public final g:Z


# direct methods
.method public constructor <init>(La/pm80;La/u12;La/qge;FLa/a4d;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/v4n0;->b:La/pm80;

    .line 5
    .line 6
    iput-object p2, p0, La/v4n0;->c:La/u12;

    .line 7
    .line 8
    iput-object p3, p0, La/v4n0;->d:La/qge;

    .line 9
    .line 10
    iput p4, p0, La/v4n0;->e:F

    .line 11
    .line 12
    iput-object p5, p0, La/v4n0;->f:La/a4d;

    .line 13
    .line 14
    iput-boolean p6, p0, La/v4n0;->g:Z

    .line 15
    .line 16
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
    instance-of v0, p1, La/v4n0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/v4n0;

    .line 10
    .line 11
    iget-object v0, p0, La/v4n0;->b:La/pm80;

    .line 12
    .line 13
    iget-object v1, p1, La/v4n0;->b:La/pm80;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/v4n0;->c:La/u12;

    .line 23
    .line 24
    iget-object v1, p1, La/v4n0;->c:La/u12;

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
    iget-object v0, p0, La/v4n0;->d:La/qge;

    .line 34
    .line 35
    iget-object v1, p1, La/v4n0;->d:La/qge;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget v0, p0, La/v4n0;->e:F

    .line 45
    .line 46
    iget v1, p1, La/v4n0;->e:F

    .line 47
    .line 48
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget-object v0, p0, La/v4n0;->f:La/a4d;

    .line 56
    .line 57
    iget-object v1, p1, La/v4n0;->f:La/a4d;

    .line 58
    .line 59
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_6

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_6
    iget-boolean p0, p0, La/v4n0;->g:Z

    .line 67
    .line 68
    iget-boolean p1, p1, La/v4n0;->g:Z

    .line 69
    .line 70
    if-eq p0, p1, :cond_7

    .line 71
    .line 72
    :goto_0
    const/4 p0, 0x0

    .line 73
    return p0

    .line 74
    :cond_7
    :goto_1
    const/4 p0, 0x1

    .line 75
    return p0
.end method

.method public final f()La/lm40;
    .locals 8

    .line 1
    new-instance v0, La/w4n0;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v7, 0x0

    .line 5
    iget-object v1, p0, La/v4n0;->c:La/u12;

    .line 6
    .line 7
    iget-object v2, p0, La/v4n0;->d:La/qge;

    .line 8
    .line 9
    iget v3, p0, La/v4n0;->e:F

    .line 10
    .line 11
    iget-object v4, p0, La/v4n0;->f:La/a4d;

    .line 12
    .line 13
    iget-boolean v5, p0, La/v4n0;->g:Z

    .line 14
    .line 15
    invoke-direct/range {v0 .. v7}, La/z1;-><init>(La/u12;La/qge;FLa/a4d;ZLjava/lang/String;La/t4e;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, La/v4n0;->b:La/pm80;

    .line 19
    .line 20
    iput-object p0, v0, La/w4n0;->v:La/pm80;

    .line 21
    .line 22
    return-object v0
.end method

.method public final h(La/lm40;)V
    .locals 5

    .line 1
    check-cast p1, La/w4n0;

    .line 2
    .line 3
    iget-object v0, p1, La/w4n0;->v:La/pm80;

    .line 4
    .line 5
    invoke-virtual {v0}, La/pm80;->i()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-object v2, p0, La/v4n0;->b:La/pm80;

    .line 10
    .line 11
    invoke-virtual {v2}, La/pm80;->i()J

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    invoke-static {v0, v1, v3, v4}, La/h7k0;->b(JJ)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput-object v2, p1, La/w4n0;->v:La/pm80;

    .line 20
    .line 21
    iget-object v1, p0, La/v4n0;->c:La/u12;

    .line 22
    .line 23
    iput-object v1, p1, La/z1;->o:La/u12;

    .line 24
    .line 25
    iget-object v1, p0, La/v4n0;->d:La/qge;

    .line 26
    .line 27
    iput-object v1, p1, La/z1;->p:La/qge;

    .line 28
    .line 29
    iget v1, p0, La/v4n0;->e:F

    .line 30
    .line 31
    iput v1, p1, La/z1;->q:F

    .line 32
    .line 33
    iget-object v1, p0, La/v4n0;->f:La/a4d;

    .line 34
    .line 35
    iput-object v1, p1, La/z1;->r:La/a4d;

    .line 36
    .line 37
    iget-boolean p0, p0, La/v4n0;->g:Z

    .line 38
    .line 39
    iput-boolean p0, p1, La/z1;->s:Z

    .line 40
    .line 41
    iget-object p0, p1, La/z1;->t:Ljava/lang/String;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_0

    .line 49
    .line 50
    iput-object v1, p1, La/z1;->t:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {p1}, La/s0x;->S(La/qai0;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    if-nez v0, :cond_1

    .line 56
    .line 57
    invoke-static {p1}, La/n7x;->I(La/v6z;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    invoke-static {p1}, La/vfc;->J(La/ehl;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/v4n0;->b:La/pm80;

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
    iget-object v2, p0, La/v4n0;->c:La/u12;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, La/v4n0;->d:La/qge;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget v2, p0, La/v4n0;->e:F

    .line 27
    .line 28
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v2, p0, La/v4n0;->f:La/a4d;

    .line 33
    .line 34
    if-nez v2, :cond_0

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    :goto_0
    add-int/2addr v0, v2

    .line 43
    mul-int/2addr v0, v1

    .line 44
    iget-boolean p0, p0, La/v4n0;->g:Z

    .line 45
    .line 46
    invoke-static {v0, v1, p0}, La/brm0;->e(IIZ)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "SubcomposeContentPainterElement(painter="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/v4n0;->b:La/pm80;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", alignment="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/v4n0;->c:La/u12;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", contentScale="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/v4n0;->d:La/qge;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", alpha="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget v1, p0, La/v4n0;->e:F

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", colorFilter="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/v4n0;->f:La/a4d;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", clipToBounds="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-boolean p0, p0, La/v4n0;->g:Z

    .line 59
    .line 60
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p0, ", contentDescription=null)"

    .line 64
    .line 65
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method
