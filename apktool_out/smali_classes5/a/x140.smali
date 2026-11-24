.class public final La/x140;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/z140;


# instance fields
.field public final a:Z

.field public final b:La/r040;

.field public final c:I

.field public final d:La/iz30;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZLa/r040;ILa/iz30;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-boolean p1, p0, La/x140;->a:Z

    .line 11
    .line 12
    iput-object p2, p0, La/x140;->b:La/r040;

    .line 13
    .line 14
    iput p3, p0, La/x140;->c:I

    .line 15
    .line 16
    iput-object p4, p0, La/x140;->d:La/iz30;

    .line 17
    .line 18
    iput-object p5, p0, La/x140;->e:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p6, p0, La/x140;->f:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p7, p0, La/x140;->g:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p8, p0, La/x140;->h:Ljava/lang/String;

    .line 25
    .line 26
    iput-object p9, p0, La/x140;->i:Ljava/lang/String;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final K()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/x140;->a:Z

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
    instance-of v0, p1, La/x140;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/x140;

    .line 10
    .line 11
    iget-boolean v0, p0, La/x140;->a:Z

    .line 12
    .line 13
    iget-boolean v1, p1, La/x140;->a:Z

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-object v0, p0, La/x140;->b:La/r040;

    .line 19
    .line 20
    iget-object v1, p1, La/x140;->b:La/r040;

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget v0, p0, La/x140;->c:I

    .line 26
    .line 27
    iget v1, p1, La/x140;->c:I

    .line 28
    .line 29
    if-eq v0, v1, :cond_4

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_4
    iget-object v0, p0, La/x140;->d:La/iz30;

    .line 33
    .line 34
    iget-object v1, p1, La/x140;->d:La/iz30;

    .line 35
    .line 36
    if-eq v0, v1, :cond_5

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_5
    iget-object v0, p0, La/x140;->e:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v1, p1, La/x140;->e:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/x140;->f:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v1, p1, La/x140;->f:Ljava/lang/String;

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
    iget-object v0, p0, La/x140;->g:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v1, p1, La/x140;->g:Ljava/lang/String;

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
    iget-object v0, p0, La/x140;->h:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v1, p1, La/x140;->h:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_9

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_9
    iget-object p0, p0, La/x140;->i:Ljava/lang/String;

    .line 84
    .line 85
    iget-object p1, p1, La/x140;->i:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-nez p0, :cond_a

    .line 92
    .line 93
    :goto_0
    const/4 p0, 0x0

    .line 94
    return p0

    .line 95
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 96
    return p0
.end method

.method public final getEventId()I
    .locals 0

    .line 1
    iget p0, p0, La/x140;->c:I

    .line 2
    .line 3
    return p0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/x140;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La/x140;->a:Z

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
    iget-object v2, p0, La/x140;->b:La/r040;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/w6x;->f(La/r040;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/x140;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/x140;->d:La/iz30;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/f140;->g(La/iz30;II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const v2, 0x7f040b5f

    .line 29
    .line 30
    .line 31
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-object v2, p0, La/x140;->e:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-object v2, p0, La/x140;->f:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const v2, 0x7f040b0b

    .line 48
    .line 49
    .line 50
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const v2, 0x7f080f06

    .line 55
    .line 56
    .line 57
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget-object v2, p0, La/x140;->g:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    iget-object v2, p0, La/x140;->h:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    iget-object p0, p0, La/x140;->i:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    add-int/2addr p0, v0

    .line 80
    return p0
.end method

.method public final m()La/iz30;
    .locals 0

    .line 1
    iget-object p0, p0, La/x140;->d:La/iz30;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n()La/r040;
    .locals 0

    .line 1
    iget-object p0, p0, La/x140;->b:La/r040;

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
    const-string v1, "SpecialMenuDefaultUiItem(isBadgeVisible="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, La/x140;->a:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", menuSectionType="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/x140;->b:La/r040;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", eventId="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget v1, p0, La/x140;->c:I

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", menuItemModel="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/x140;->d:La/iz30;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", iconTint="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", iconUrl="

    .line 49
    .line 50
    const-string v2, ", iconBackgroundUrl="

    .line 51
    .line 52
    const v3, 0x7f040b5f

    .line 53
    .line 54
    .line 55
    iget-object v4, p0, La/x140;->e:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v3, v1, v4, v2, v0}, La/kng0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 58
    .line 59
    .line 60
    const-string v1, ", iconPlaceholderTint="

    .line 61
    .line 62
    const-string v2, ", iconPlaceholder="

    .line 63
    .line 64
    const v3, 0x7f040b0b

    .line 65
    .line 66
    .line 67
    iget-object v4, p0, La/x140;->f:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v3, v4, v1, v2, v0}, La/twn;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 70
    .line 71
    .line 72
    const-string v1, ", title="

    .line 73
    .line 74
    const-string v2, ", subtitle="

    .line 75
    .line 76
    const v3, 0x7f080f06

    .line 77
    .line 78
    .line 79
    iget-object v4, p0, La/x140;->g:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {v3, v1, v4, v2, v0}, La/kng0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 82
    .line 83
    .line 84
    const-string v1, ", endIconUrl="

    .line 85
    .line 86
    const-string v2, ")"

    .line 87
    .line 88
    iget-object v3, p0, La/x140;->h:Ljava/lang/String;

    .line 89
    .line 90
    iget-object p0, p0, La/x140;->i:Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {v0, v3, v1, p0, v2}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0
.end method
