.class public final La/q140;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/f240;


# instance fields
.field public final a:La/iz30;

.field public final b:Z

.field public final c:La/r040;

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:I

.field public final j:I


# direct methods
.method public constructor <init>(La/iz30;ZLa/r040;IIILjava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-static {p3, p7, p8}, La/w6x;->y(La/r040;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/q140;->a:La/iz30;

    .line 8
    .line 9
    iput-boolean p2, p0, La/q140;->b:Z

    .line 10
    .line 11
    iput-object p3, p0, La/q140;->c:La/r040;

    .line 12
    .line 13
    iput p4, p0, La/q140;->d:I

    .line 14
    .line 15
    iput p5, p0, La/q140;->e:I

    .line 16
    .line 17
    iput p6, p0, La/q140;->f:I

    .line 18
    .line 19
    iput-object p7, p0, La/q140;->g:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p8, p0, La/q140;->h:Ljava/lang/String;

    .line 22
    .line 23
    iput p9, p0, La/q140;->i:I

    .line 24
    .line 25
    iput p10, p0, La/q140;->j:I

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final K()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/q140;->b:Z

    .line 2
    .line 3
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/q140;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/q140;

    .line 10
    .line 11
    iget-object v0, p0, La/q140;->a:La/iz30;

    .line 12
    .line 13
    iget-object v1, p1, La/q140;->a:La/iz30;

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-boolean v0, p0, La/q140;->b:Z

    .line 19
    .line 20
    iget-boolean v1, p1, La/q140;->b:Z

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget-object v0, p0, La/q140;->c:La/r040;

    .line 26
    .line 27
    iget-object v1, p1, La/q140;->c:La/r040;

    .line 28
    .line 29
    if-eq v0, v1, :cond_4

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_4
    iget v0, p0, La/q140;->d:I

    .line 33
    .line 34
    iget v1, p1, La/q140;->d:I

    .line 35
    .line 36
    if-eq v0, v1, :cond_5

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_5
    iget v0, p0, La/q140;->e:I

    .line 40
    .line 41
    iget v1, p1, La/q140;->e:I

    .line 42
    .line 43
    if-eq v0, v1, :cond_6

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_6
    iget v0, p0, La/q140;->f:I

    .line 47
    .line 48
    iget v1, p1, La/q140;->f:I

    .line 49
    .line 50
    if-eq v0, v1, :cond_7

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_7
    iget-object v0, p0, La/q140;->g:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v1, p1, La/q140;->g:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_8

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_8
    iget-object v0, p0, La/q140;->h:Ljava/lang/String;

    .line 65
    .line 66
    iget-object v1, p1, La/q140;->h:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_9

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_9
    iget v0, p0, La/q140;->i:I

    .line 76
    .line 77
    iget v1, p1, La/q140;->i:I

    .line 78
    .line 79
    if-eq v0, v1, :cond_a

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_a
    iget p0, p0, La/q140;->j:I

    .line 83
    .line 84
    iget p1, p1, La/q140;->j:I

    .line 85
    .line 86
    if-eq p0, p1, :cond_b

    .line 87
    .line 88
    :goto_0
    const/4 p0, 0x0

    .line 89
    return p0

    .line 90
    :cond_b
    :goto_1
    const/4 p0, 0x1

    .line 91
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/q140;->a:La/iz30;

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
    iget-boolean v2, p0, La/q140;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/q140;->c:La/r040;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/w6x;->f(La/r040;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, La/q140;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, La/q140;->e:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, La/q140;->f:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/q140;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, La/q140;->h:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget v2, p0, La/q140;->i:I

    .line 53
    .line 54
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget p0, p0, La/q140;->j:I

    .line 59
    .line 60
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    add-int/2addr p0, v0

    .line 65
    return p0
.end method

.method public final m()La/iz30;
    .locals 0

    .line 1
    iget-object p0, p0, La/q140;->a:La/iz30;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n()La/r040;
    .locals 0

    .line 1
    iget-object p0, p0, La/q140;->c:La/r040;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", isBadgeVisible="

    .line 2
    .line 3
    const-string v1, ", menuSectionType="

    .line 4
    .line 5
    const-string v2, "IndividualDecoratedTintMenuUiItem(menuItemModel="

    .line 6
    .line 7
    iget-object v3, p0, La/q140;->a:La/iz30;

    .line 8
    .line 9
    iget-boolean v4, p0, La/q140;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/w6x;->s(Ljava/lang/String;La/iz30;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", icon="

    .line 16
    .line 17
    const-string v2, ", iconTint="

    .line 18
    .line 19
    iget-object v3, p0, La/q140;->c:La/r040;

    .line 20
    .line 21
    iget v4, p0, La/q140;->d:I

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->t(Ljava/lang/StringBuilder;La/r040;Ljava/lang/String;ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", iconBackgroundTint="

    .line 27
    .line 28
    const-string v2, ", title="

    .line 29
    .line 30
    iget v3, p0, La/q140;->e:I

    .line 31
    .line 32
    iget v4, p0, La/q140;->f:I

    .line 33
    .line 34
    invoke-static {v3, v4, v1, v2, v0}, La/axq;->r(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", subtitle="

    .line 38
    .line 39
    const-string v2, ", endIcon="

    .line 40
    .line 41
    iget-object v3, p0, La/q140;->g:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v4, p0, La/q140;->h:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v1, ", backgroundTint="

    .line 49
    .line 50
    const-string v2, ")"

    .line 51
    .line 52
    iget v3, p0, La/q140;->i:I

    .line 53
    .line 54
    iget p0, p0, La/q140;->j:I

    .line 55
    .line 56
    invoke-static {v3, p0, v1, v2, v0}, La/w6x;->o(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method
