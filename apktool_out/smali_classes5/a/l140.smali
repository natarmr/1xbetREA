.class public final La/l140;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/f240;


# instance fields
.field public final a:La/iz30;

.field public final b:Z

.field public final c:La/r040;

.field public final d:I

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:I

.field public final h:J


# direct methods
.method public constructor <init>(La/iz30;ZLa/r040;ILjava/lang/String;Ljava/lang/String;IJ)V
    .locals 0

    .line 1
    invoke-static {p3, p5, p6}, La/w6x;->y(La/r040;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/l140;->a:La/iz30;

    .line 8
    .line 9
    iput-boolean p2, p0, La/l140;->b:Z

    .line 10
    .line 11
    iput-object p3, p0, La/l140;->c:La/r040;

    .line 12
    .line 13
    iput p4, p0, La/l140;->d:I

    .line 14
    .line 15
    iput-object p5, p0, La/l140;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p6, p0, La/l140;->f:Ljava/lang/String;

    .line 18
    .line 19
    iput p7, p0, La/l140;->g:I

    .line 20
    .line 21
    iput-wide p8, p0, La/l140;->h:J

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final K()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/l140;->b:Z

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
    instance-of v0, p1, La/l140;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/l140;

    .line 10
    .line 11
    iget-object v0, p0, La/l140;->a:La/iz30;

    .line 12
    .line 13
    iget-object v1, p1, La/l140;->a:La/iz30;

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-boolean v0, p0, La/l140;->b:Z

    .line 19
    .line 20
    iget-boolean v1, p1, La/l140;->b:Z

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget-object v0, p0, La/l140;->c:La/r040;

    .line 26
    .line 27
    iget-object v1, p1, La/l140;->c:La/r040;

    .line 28
    .line 29
    if-eq v0, v1, :cond_4

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_4
    iget v0, p0, La/l140;->d:I

    .line 33
    .line 34
    iget v1, p1, La/l140;->d:I

    .line 35
    .line 36
    if-eq v0, v1, :cond_5

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_5
    iget-object v0, p0, La/l140;->e:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v1, p1, La/l140;->e:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_6

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_6
    iget-object v0, p0, La/l140;->f:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v1, p1, La/l140;->f:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_7

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_7
    iget v0, p0, La/l140;->g:I

    .line 62
    .line 63
    iget v1, p1, La/l140;->g:I

    .line 64
    .line 65
    if-eq v0, v1, :cond_8

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_8
    iget-wide v0, p1, La/l140;->h:J

    .line 69
    .line 70
    sget p1, La/y3d;->h:I

    .line 71
    .line 72
    iget-wide p0, p0, La/l140;->h:J

    .line 73
    .line 74
    invoke-static {p0, p1, v0, v1}, La/h2t0;->a(JJ)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-nez p0, :cond_9

    .line 79
    .line 80
    :goto_0
    const/4 p0, 0x0

    .line 81
    return p0

    .line 82
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 83
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/l140;->a:La/iz30;

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
    iget-boolean v2, p0, La/l140;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/l140;->c:La/r040;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/w6x;->f(La/r040;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, La/l140;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const v2, 0x7f040afc

    .line 29
    .line 30
    .line 31
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const v3, 0x7f040b5f

    .line 36
    .line 37
    .line 38
    invoke-static {v3, v0, v1}, La/twn;->a(III)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v3, p0, La/l140;->e:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v0, v1, v3}, La/ua80;->b(IILjava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object v3, p0, La/l140;->f:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v0, v1, v3}, La/ua80;->b(IILjava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget v3, p0, La/l140;->g:I

    .line 55
    .line 56
    invoke-static {v3, v0, v1}, La/twn;->a(III)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    sget v1, La/y3d;->h:I

    .line 65
    .line 66
    sget-object v1, La/h2t0;->b:La/g2t0;

    .line 67
    .line 68
    iget-wide v1, p0, La/l140;->h:J

    .line 69
    .line 70
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    add-int/2addr p0, v0

    .line 75
    return p0
.end method

.method public final m()La/iz30;
    .locals 0

    .line 1
    iget-object p0, p0, La/l140;->a:La/iz30;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n()La/r040;
    .locals 0

    .line 1
    iget-object p0, p0, La/l140;->c:La/r040;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-wide v0, p0, La/l140;->h:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, ", isBadgeVisible="

    .line 8
    .line 9
    const-string v2, ", menuSectionType="

    .line 10
    .line 11
    const-string v3, "DecoratedTintMenuUiItem(menuItemModel="

    .line 12
    .line 13
    iget-object v4, p0, La/l140;->a:La/iz30;

    .line 14
    .line 15
    iget-boolean v5, p0, La/l140;->b:Z

    .line 16
    .line 17
    invoke-static {v3, v4, v1, v5, v2}, La/w6x;->s(Ljava/lang/String;La/iz30;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, ", icon="

    .line 22
    .line 23
    const-string v3, ", iconTint="

    .line 24
    .line 25
    iget-object v4, p0, La/l140;->c:La/r040;

    .line 26
    .line 27
    iget v5, p0, La/l140;->d:I

    .line 28
    .line 29
    invoke-static {v1, v4, v2, v5, v3}, La/f140;->t(Ljava/lang/StringBuilder;La/r040;Ljava/lang/String;ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v2, ", iconBackgroundTint="

    .line 33
    .line 34
    const-string v3, ", title="

    .line 35
    .line 36
    const v4, 0x7f040afc

    .line 37
    .line 38
    .line 39
    const v5, 0x7f040b5f

    .line 40
    .line 41
    .line 42
    invoke-static {v4, v5, v2, v3, v1}, La/axq;->r(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 43
    .line 44
    .line 45
    const-string v2, ", subtitle="

    .line 46
    .line 47
    const-string v3, ", endIcon="

    .line 48
    .line 49
    iget-object v5, p0, La/l140;->e:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v6, p0, La/l140;->f:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v1, v5, v2, v6, v3}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v2, ", backgroundTint="

    .line 57
    .line 58
    const-string v3, ", backgroundTintColor="

    .line 59
    .line 60
    iget p0, p0, La/l140;->g:I

    .line 61
    .line 62
    invoke-static {p0, v4, v2, v3, v1}, La/axq;->r(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 63
    .line 64
    .line 65
    const-string p0, ")"

    .line 66
    .line 67
    invoke-static {v1, v0, p0}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method
