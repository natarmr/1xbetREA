.class public final La/lw30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/nw30;


# instance fields
.field public final a:Z

.field public final b:La/iz30;

.field public final c:La/r040;

.field public final d:J

.field public final e:J

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:J


# direct methods
.method public constructor <init>(ZLa/iz30;La/r040;JJLjava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-boolean p1, p0, La/lw30;->a:Z

    .line 11
    .line 12
    iput-object p2, p0, La/lw30;->b:La/iz30;

    .line 13
    .line 14
    iput-object p3, p0, La/lw30;->c:La/r040;

    .line 15
    .line 16
    iput-wide p4, p0, La/lw30;->d:J

    .line 17
    .line 18
    iput-wide p6, p0, La/lw30;->e:J

    .line 19
    .line 20
    iput-object p8, p0, La/lw30;->f:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p9, p0, La/lw30;->g:Ljava/lang/String;

    .line 23
    .line 24
    iput-wide p10, p0, La/lw30;->h:J

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/lw30;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/lw30;

    .line 10
    .line 11
    iget-boolean v0, p0, La/lw30;->a:Z

    .line 12
    .line 13
    iget-boolean v1, p1, La/lw30;->a:Z

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-object v0, p0, La/lw30;->b:La/iz30;

    .line 19
    .line 20
    iget-object v1, p1, La/lw30;->b:La/iz30;

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget-object v0, p0, La/lw30;->c:La/r040;

    .line 26
    .line 27
    iget-object v1, p1, La/lw30;->c:La/r040;

    .line 28
    .line 29
    if-eq v0, v1, :cond_4

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_4
    iget-wide v0, p0, La/lw30;->d:J

    .line 33
    .line 34
    iget-wide v2, p1, La/lw30;->d:J

    .line 35
    .line 36
    cmp-long v0, v0, v2

    .line 37
    .line 38
    if-eqz v0, :cond_5

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_5
    iget-wide v0, p0, La/lw30;->e:J

    .line 42
    .line 43
    iget-wide v2, p1, La/lw30;->e:J

    .line 44
    .line 45
    cmp-long v0, v0, v2

    .line 46
    .line 47
    if-eqz v0, :cond_6

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_6
    iget-object v0, p0, La/lw30;->f:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v1, p1, La/lw30;->f:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/lw30;->g:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v1, p1, La/lw30;->g:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_8

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_8
    iget-wide v0, p0, La/lw30;->h:J

    .line 73
    .line 74
    iget-wide p0, p1, La/lw30;->h:J

    .line 75
    .line 76
    cmp-long p0, v0, p0

    .line 77
    .line 78
    if-eqz p0, :cond_9

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
    iget-boolean v0, p0, La/lw30;->a:Z

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
    iget-object v2, p0, La/lw30;->b:La/iz30;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/f140;->g(La/iz30;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/lw30;->c:La/r040;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/w6x;->f(La/r040;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, La/lw30;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-wide v2, p0, La/lw30;->e:J

    .line 29
    .line 30
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/lw30;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const v2, 0x7f08096d

    .line 41
    .line 42
    .line 43
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget-object v2, p0, La/lw30;->g:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iget-wide v1, p0, La/lw30;->h:J

    .line 54
    .line 55
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    add-int/2addr p0, v0

    .line 60
    return p0
.end method

.method public final m()La/iz30;
    .locals 0

    .line 1
    iget-object p0, p0, La/lw30;->b:La/iz30;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n()La/r040;
    .locals 0

    .line 1
    iget-object p0, p0, La/lw30;->c:La/r040;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "VirtualSimpleMenuUiItem(isBadgeVisible="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, La/lw30;->a:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", menuItemModel="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/lw30;->b:La/iz30;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", menuSectionType="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/lw30;->c:La/r040;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", id="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-wide v1, p0, La/lw30;->d:J

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", gameId="

    .line 44
    .line 45
    const-string v2, ", imageUrl="

    .line 46
    .line 47
    iget-wide v3, p0, La/lw30;->e:J

    .line 48
    .line 49
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-string v1, ", placeholder="

    .line 53
    .line 54
    const-string v2, ", title="

    .line 55
    .line 56
    const v3, 0x7f08096d

    .line 57
    .line 58
    .line 59
    iget-object v4, p0, La/lw30;->f:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v3, v4, v1, v2, v0}, La/twn;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 62
    .line 63
    .line 64
    const-string v1, ", partType="

    .line 65
    .line 66
    iget-wide v2, p0, La/lw30;->h:J

    .line 67
    .line 68
    iget-object p0, p0, La/lw30;->g:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v0, v2, v3, p0, v1}, Lc;->i(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string p0, ")"

    .line 74
    .line 75
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0
.end method
