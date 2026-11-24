.class public final La/e1l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/f1l0;


# instance fields
.field public final a:La/pzu;

.field public final b:La/oe;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:La/a4x;


# direct methods
.method public constructor <init>(La/pzu;La/oe;Ljava/lang/String;ZZZLa/a4x;)V
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
    iput-object p1, p0, La/e1l0;->a:La/pzu;

    .line 8
    .line 9
    iput-object p2, p0, La/e1l0;->b:La/oe;

    .line 10
    .line 11
    iput-object p3, p0, La/e1l0;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-boolean p4, p0, La/e1l0;->d:Z

    .line 14
    .line 15
    iput-boolean p5, p0, La/e1l0;->e:Z

    .line 16
    .line 17
    iput-boolean p6, p0, La/e1l0;->f:Z

    .line 18
    .line 19
    iput-object p7, p0, La/e1l0;->g:La/a4x;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()La/oe;
    .locals 0

    .line 1
    iget-object p0, p0, La/e1l0;->b:La/oe;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/e1l0;->f:Z

    .line 2
    .line 3
    return p0
.end method

.method public final c()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/e1l0;->e:Z

    .line 2
    .line 3
    return p0
.end method

.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/e1l0;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()La/pzu;
    .locals 0

    .line 1
    iget-object p0, p0, La/e1l0;->a:La/pzu;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/e1l0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/e1l0;

    .line 11
    .line 12
    iget-object v0, p0, La/e1l0;->a:La/pzu;

    .line 13
    .line 14
    iget-object v2, p1, La/e1l0;->a:La/pzu;

    .line 15
    .line 16
    if-eq v0, v2, :cond_2

    .line 17
    .line 18
    return v1

    .line 19
    :cond_2
    iget-object v0, p0, La/e1l0;->b:La/oe;

    .line 20
    .line 21
    iget-object v2, p1, La/e1l0;->b:La/oe;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, La/oe;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_3

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_3
    iget-object v0, p0, La/e1l0;->c:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v2, p1, La/e1l0;->c:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_4

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_4
    iget-boolean v0, p0, La/e1l0;->d:Z

    .line 42
    .line 43
    iget-boolean v2, p1, La/e1l0;->d:Z

    .line 44
    .line 45
    if-eq v0, v2, :cond_5

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_5
    iget-boolean v0, p0, La/e1l0;->e:Z

    .line 49
    .line 50
    iget-boolean v2, p1, La/e1l0;->e:Z

    .line 51
    .line 52
    if-eq v0, v2, :cond_6

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_6
    iget-boolean v0, p0, La/e1l0;->f:Z

    .line 56
    .line 57
    iget-boolean v2, p1, La/e1l0;->f:Z

    .line 58
    .line 59
    if-eq v0, v2, :cond_7

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_7
    iget-object p0, p0, La/e1l0;->g:La/a4x;

    .line 63
    .line 64
    iget-object p1, p1, La/e1l0;->g:La/a4x;

    .line 65
    .line 66
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-nez p0, :cond_8

    .line 71
    .line 72
    :goto_0
    return v1

    .line 73
    :cond_8
    :goto_1
    const/4 p0, 0x1

    .line 74
    return p0
.end method

.method public final f()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/e1l0;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/e1l0;->a:La/pzu;

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
    iget-object v2, p0, La/e1l0;->b:La/oe;

    .line 11
    .line 12
    invoke-virtual {v2}, La/oe;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, La/e1l0;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-boolean v2, p0, La/e1l0;->d:Z

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-boolean v2, p0, La/e1l0;->e:Z

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-boolean v2, p0, La/e1l0;->f:Z

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object p0, p0, La/e1l0;->g:La/a4x;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    add-int/2addr p0, v0

    .line 49
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "History(strings="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/e1l0;->a:La/pzu;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", accountInfoState="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/e1l0;->b:La/oe;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", transferSumInput="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", isTransferButtonEnabled="

    .line 29
    .line 30
    const-string v2, ", isTransferLoading="

    .line 31
    .line 32
    iget-object v3, p0, La/e1l0;->c:Ljava/lang/String;

    .line 33
    .line 34
    iget-boolean v4, p0, La/e1l0;->d:Z

    .line 35
    .line 36
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", isSwipeRefreshing="

    .line 40
    .line 41
    const-string v2, ", historyList="

    .line 42
    .line 43
    iget-boolean v3, p0, La/e1l0;->e:Z

    .line 44
    .line 45
    iget-boolean v4, p0, La/e1l0;->f:Z

    .line 46
    .line 47
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 48
    .line 49
    .line 50
    const-string v1, ")"

    .line 51
    .line 52
    iget-object p0, p0, La/e1l0;->g:La/a4x;

    .line 53
    .line 54
    invoke-static {v0, p0, v1}, La/cs0;->n(Ljava/lang/StringBuilder;La/a4x;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method
