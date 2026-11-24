.class public final La/ui60;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/a4x;

.field public final b:La/a4x;

.field public final c:La/a4x;

.field public final d:I

.field public final e:I

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:La/uaq0;


# direct methods
.method public constructor <init>(La/a4x;La/a4x;La/a4x;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;La/uaq0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/ui60;->a:La/a4x;

    .line 23
    .line 24
    iput-object p2, p0, La/ui60;->b:La/a4x;

    .line 25
    .line 26
    iput-object p3, p0, La/ui60;->c:La/a4x;

    .line 27
    .line 28
    iput p4, p0, La/ui60;->d:I

    .line 29
    .line 30
    iput p5, p0, La/ui60;->e:I

    .line 31
    .line 32
    iput-object p6, p0, La/ui60;->f:Ljava/lang/String;

    .line 33
    .line 34
    iput-object p7, p0, La/ui60;->g:Ljava/lang/String;

    .line 35
    .line 36
    iput-object p8, p0, La/ui60;->h:Ljava/lang/String;

    .line 37
    .line 38
    iput-object p9, p0, La/ui60;->i:La/uaq0;

    .line 39
    .line 40
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
    instance-of v0, p1, La/ui60;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/ui60;

    .line 10
    .line 11
    iget-object v0, p0, La/ui60;->a:La/a4x;

    .line 12
    .line 13
    iget-object v1, p1, La/ui60;->a:La/a4x;

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
    iget-object v0, p0, La/ui60;->b:La/a4x;

    .line 23
    .line 24
    iget-object v1, p1, La/ui60;->b:La/a4x;

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
    iget-object v0, p0, La/ui60;->c:La/a4x;

    .line 34
    .line 35
    iget-object v1, p1, La/ui60;->c:La/a4x;

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
    iget v0, p0, La/ui60;->d:I

    .line 45
    .line 46
    iget v1, p1, La/ui60;->d:I

    .line 47
    .line 48
    if-eq v0, v1, :cond_5

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    iget v0, p0, La/ui60;->e:I

    .line 52
    .line 53
    iget v1, p1, La/ui60;->e:I

    .line 54
    .line 55
    if-eq v0, v1, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    iget-object v0, p0, La/ui60;->f:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v1, p1, La/ui60;->f:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/ui60;->g:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v1, p1, La/ui60;->g:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_8

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_8
    iget-object v0, p0, La/ui60;->h:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v1, p1, La/ui60;->h:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_9

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_9
    iget-object p0, p0, La/ui60;->i:La/uaq0;

    .line 92
    .line 93
    iget-object p1, p1, La/ui60;->i:La/uaq0;

    .line 94
    .line 95
    if-eq p0, p1, :cond_a

    .line 96
    .line 97
    :goto_0
    const/4 p0, 0x0

    .line 98
    return p0

    .line 99
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 100
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/ui60;->a:La/a4x;

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
    iget-object v2, p0, La/ui60;->b:La/a4x;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/ui60;->c:La/a4x;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, La/ui60;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, La/ui60;->e:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/ui60;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/ui60;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, La/ui60;->h:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object p0, p0, La/ui60;->i:La/uaq0;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    add-int/2addr p0, v0

    .line 59
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", titles="

    .line 2
    .line 3
    const-string v1, ", descriptions="

    .line 4
    .line 5
    const-string v2, "OnboardingBottomSheetUiModel(images="

    .line 6
    .line 7
    iget-object v3, p0, La/ui60;->a:La/a4x;

    .line 8
    .line 9
    iget-object v4, p0, La/ui60;->b:La/a4x;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/rw2;->q(Ljava/lang/String;La/a4x;Ljava/lang/String;La/a4x;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, La/ui60;->c:La/a4x;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", initialPage="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget v1, p0, La/ui60;->d:I

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", currentPage="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, ", acceptButtonTitle="

    .line 36
    .line 37
    const-string v2, ", skipButtonLabel="

    .line 38
    .line 39
    iget v3, p0, La/ui60;->e:I

    .line 40
    .line 41
    iget-object v4, p0, La/ui60;->f:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v3, v1, v4, v2, v0}, La/kng0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 44
    .line 45
    .line 46
    const-string v1, ", nextButtonLabel="

    .line 47
    .line 48
    const-string v2, ", theme="

    .line 49
    .line 50
    iget-object v3, p0, La/ui60;->g:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v4, p0, La/ui60;->h:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object p0, p0, La/ui60;->i:La/uaq0;

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string p0, ")"

    .line 63
    .line 64
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method
