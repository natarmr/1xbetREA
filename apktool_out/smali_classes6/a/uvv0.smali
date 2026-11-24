.class public final La/uvv0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I


# direct methods
.method public constructor <init>(ZZIIIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, La/uvv0;->a:Z

    .line 5
    .line 6
    iput-boolean p2, p0, La/uvv0;->b:Z

    .line 7
    .line 8
    iput p3, p0, La/uvv0;->c:I

    .line 9
    .line 10
    iput p4, p0, La/uvv0;->d:I

    .line 11
    .line 12
    iput p5, p0, La/uvv0;->e:I

    .line 13
    .line 14
    iput p6, p0, La/uvv0;->f:I

    .line 15
    .line 16
    iput p7, p0, La/uvv0;->g:I

    .line 17
    .line 18
    iput p8, p0, La/uvv0;->h:I

    .line 19
    .line 20
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
    instance-of v0, p1, La/uvv0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/uvv0;

    .line 10
    .line 11
    iget-boolean v0, p0, La/uvv0;->a:Z

    .line 12
    .line 13
    iget-boolean v1, p1, La/uvv0;->a:Z

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-boolean v0, p0, La/uvv0;->b:Z

    .line 19
    .line 20
    iget-boolean v1, p1, La/uvv0;->b:Z

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget v0, p0, La/uvv0;->c:I

    .line 26
    .line 27
    iget v1, p1, La/uvv0;->c:I

    .line 28
    .line 29
    if-eq v0, v1, :cond_4

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_4
    iget v0, p0, La/uvv0;->d:I

    .line 33
    .line 34
    iget v1, p1, La/uvv0;->d:I

    .line 35
    .line 36
    if-eq v0, v1, :cond_5

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_5
    iget v0, p0, La/uvv0;->e:I

    .line 40
    .line 41
    iget v1, p1, La/uvv0;->e:I

    .line 42
    .line 43
    if-eq v0, v1, :cond_6

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_6
    iget v0, p0, La/uvv0;->f:I

    .line 47
    .line 48
    iget v1, p1, La/uvv0;->f:I

    .line 49
    .line 50
    if-eq v0, v1, :cond_7

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_7
    iget v0, p0, La/uvv0;->g:I

    .line 54
    .line 55
    iget v1, p1, La/uvv0;->g:I

    .line 56
    .line 57
    if-eq v0, v1, :cond_8

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_8
    iget p0, p0, La/uvv0;->h:I

    .line 61
    .line 62
    iget p1, p1, La/uvv0;->h:I

    .line 63
    .line 64
    if-eq p0, p1, :cond_9

    .line 65
    .line 66
    :goto_0
    const/4 p0, 0x0

    .line 67
    return p0

    .line 68
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 69
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La/uvv0;->a:Z

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
    iget-boolean v2, p0, La/uvv0;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/uvv0;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, La/uvv0;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, La/uvv0;->e:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, La/uvv0;->f:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, La/uvv0;->g:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget p0, p0, La/uvv0;->h:I

    .line 47
    .line 48
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    add-int/2addr p0, v0

    .line 53
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", isPinning="

    .line 2
    .line 3
    const-string v1, ", itemBottomCachedPx="

    .line 4
    .line 5
    const-string v2, "XBottomSheetPinPreviousState(isArmed="

    .line 6
    .line 7
    iget-boolean v3, p0, La/uvv0;->a:Z

    .line 8
    .line 9
    iget-boolean v4, p0, La/uvv0;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v0, v1, v3, v4}, La/f140;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", cachedItemCount="

    .line 16
    .line 17
    const-string v2, ", consumedSincePx="

    .line 18
    .line 19
    iget v3, p0, La/uvv0;->c:I

    .line 20
    .line 21
    iget v4, p0, La/uvv0;->d:I

    .line 22
    .line 23
    invoke-static {v3, v4, v1, v2, v0}, La/axq;->r(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", consecutiveClampCount="

    .line 27
    .line 28
    const-string v2, ", lastDispatchConsumedPx="

    .line 29
    .line 30
    iget v3, p0, La/uvv0;->e:I

    .line 31
    .line 32
    iget v4, p0, La/uvv0;->f:I

    .line 33
    .line 34
    invoke-static {v3, v4, v1, v2, v0}, La/axq;->r(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", lastPlainViewportHeightPx="

    .line 38
    .line 39
    const-string v2, ")"

    .line 40
    .line 41
    iget v3, p0, La/uvv0;->g:I

    .line 42
    .line 43
    iget p0, p0, La/uvv0;->h:I

    .line 44
    .line 45
    invoke-static {v3, p0, v1, v2, v0}, La/w6x;->o(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method
