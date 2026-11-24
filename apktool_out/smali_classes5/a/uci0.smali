.class public final La/uci0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:I

.field public final g:Landroid/text/SpannableStringBuilder;

.field public final h:La/ici0;

.field public final i:Z

.field public final j:Z

.field public final k:Z


# direct methods
.method public constructor <init>(ZZZZZILandroid/text/SpannableStringBuilder;La/ici0;ZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, La/uci0;->a:Z

    .line 5
    .line 6
    iput-boolean p2, p0, La/uci0;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, La/uci0;->c:Z

    .line 9
    .line 10
    iput-boolean p4, p0, La/uci0;->d:Z

    .line 11
    .line 12
    iput-boolean p5, p0, La/uci0;->e:Z

    .line 13
    .line 14
    iput p6, p0, La/uci0;->f:I

    .line 15
    .line 16
    iput-object p7, p0, La/uci0;->g:Landroid/text/SpannableStringBuilder;

    .line 17
    .line 18
    iput-object p8, p0, La/uci0;->h:La/ici0;

    .line 19
    .line 20
    iput-boolean p9, p0, La/uci0;->i:Z

    .line 21
    .line 22
    iput-boolean p10, p0, La/uci0;->j:Z

    .line 23
    .line 24
    iput-boolean p11, p0, La/uci0;->k:Z

    .line 25
    .line 26
    return-void
.end method

.method public static a(La/uci0;ZZZZLa/eci0;ZZI)La/uci0;
    .locals 12

    .line 1
    move/from16 v0, p8

    .line 2
    .line 3
    iget-boolean v1, p0, La/uci0;->a:Z

    .line 4
    .line 5
    and-int/lit8 v2, v0, 0x2

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-boolean p1, p0, La/uci0;->b:Z

    .line 10
    .line 11
    :cond_0
    move v2, p1

    .line 12
    and-int/lit8 p1, v0, 0x4

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-boolean p2, p0, La/uci0;->c:Z

    .line 17
    .line 18
    :cond_1
    move v3, p2

    .line 19
    and-int/lit8 p1, v0, 0x8

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    iget-boolean p1, p0, La/uci0;->d:Z

    .line 24
    .line 25
    move v4, p1

    .line 26
    goto :goto_0

    .line 27
    :cond_2
    move v4, p3

    .line 28
    :goto_0
    and-int/lit8 p1, v0, 0x10

    .line 29
    .line 30
    if-eqz p1, :cond_3

    .line 31
    .line 32
    iget-boolean p1, p0, La/uci0;->e:Z

    .line 33
    .line 34
    move v5, p1

    .line 35
    goto :goto_1

    .line 36
    :cond_3
    move/from16 v5, p4

    .line 37
    .line 38
    :goto_1
    iget v6, p0, La/uci0;->f:I

    .line 39
    .line 40
    iget-object v7, p0, La/uci0;->g:Landroid/text/SpannableStringBuilder;

    .line 41
    .line 42
    and-int/lit16 p1, v0, 0x80

    .line 43
    .line 44
    if-eqz p1, :cond_4

    .line 45
    .line 46
    iget-object p1, p0, La/uci0;->h:La/ici0;

    .line 47
    .line 48
    move-object v8, p1

    .line 49
    goto :goto_2

    .line 50
    :cond_4
    move-object/from16 v8, p5

    .line 51
    .line 52
    :goto_2
    and-int/lit16 p1, v0, 0x100

    .line 53
    .line 54
    if-eqz p1, :cond_5

    .line 55
    .line 56
    iget-boolean p1, p0, La/uci0;->i:Z

    .line 57
    .line 58
    move v9, p1

    .line 59
    goto :goto_3

    .line 60
    :cond_5
    move/from16 v9, p6

    .line 61
    .line 62
    :goto_3
    iget-boolean v10, p0, La/uci0;->j:Z

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    and-int/lit16 p1, v0, 0x800

    .line 68
    .line 69
    if-eqz p1, :cond_6

    .line 70
    .line 71
    iget-boolean p1, p0, La/uci0;->k:Z

    .line 72
    .line 73
    move v11, p1

    .line 74
    goto :goto_4

    .line 75
    :cond_6
    move/from16 v11, p7

    .line 76
    .line 77
    :goto_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    new-instance v0, La/uci0;

    .line 81
    .line 82
    invoke-direct/range {v0 .. v11}, La/uci0;-><init>(ZZZZZILandroid/text/SpannableStringBuilder;La/ici0;ZZZ)V

    .line 83
    .line 84
    .line 85
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/uci0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/uci0;

    .line 11
    .line 12
    iget-boolean v0, p0, La/uci0;->a:Z

    .line 13
    .line 14
    iget-boolean v1, p1, La/uci0;->a:Z

    .line 15
    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_2
    iget-boolean v0, p0, La/uci0;->b:Z

    .line 20
    .line 21
    iget-boolean v1, p1, La/uci0;->b:Z

    .line 22
    .line 23
    if-eq v0, v1, :cond_3

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    iget-boolean v0, p0, La/uci0;->c:Z

    .line 27
    .line 28
    iget-boolean v1, p1, La/uci0;->c:Z

    .line 29
    .line 30
    if-eq v0, v1, :cond_4

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_4
    iget-boolean v0, p0, La/uci0;->d:Z

    .line 34
    .line 35
    iget-boolean v1, p1, La/uci0;->d:Z

    .line 36
    .line 37
    if-eq v0, v1, :cond_5

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_5
    iget-boolean v0, p0, La/uci0;->e:Z

    .line 41
    .line 42
    iget-boolean v1, p1, La/uci0;->e:Z

    .line 43
    .line 44
    if-eq v0, v1, :cond_6

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_6
    iget v0, p0, La/uci0;->f:I

    .line 48
    .line 49
    iget v1, p1, La/uci0;->f:I

    .line 50
    .line 51
    if-eq v0, v1, :cond_7

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_7
    iget-object v0, p0, La/uci0;->g:Landroid/text/SpannableStringBuilder;

    .line 55
    .line 56
    iget-object v1, p1, La/uci0;->g:Landroid/text/SpannableStringBuilder;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_8

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_8
    iget-object v0, p0, La/uci0;->h:La/ici0;

    .line 66
    .line 67
    iget-object v1, p1, La/uci0;->h:La/ici0;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_9

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_9
    iget-boolean v0, p0, La/uci0;->i:Z

    .line 77
    .line 78
    iget-boolean v1, p1, La/uci0;->i:Z

    .line 79
    .line 80
    if-eq v0, v1, :cond_a

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_a
    iget-boolean v0, p0, La/uci0;->j:Z

    .line 84
    .line 85
    iget-boolean v1, p1, La/uci0;->j:Z

    .line 86
    .line 87
    if-eq v0, v1, :cond_b

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_b
    iget-boolean p0, p0, La/uci0;->k:Z

    .line 91
    .line 92
    iget-boolean p1, p1, La/uci0;->k:Z

    .line 93
    .line 94
    if-eq p0, p1, :cond_c

    .line 95
    .line 96
    :goto_0
    const/4 p0, 0x0

    .line 97
    return p0

    .line 98
    :cond_c
    :goto_1
    const/4 p0, 0x1

    .line 99
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La/uci0;->a:Z

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
    iget-boolean v2, p0, La/uci0;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/uci0;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/uci0;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/uci0;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, La/uci0;->f:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/uci0;->g:Landroid/text/SpannableStringBuilder;

    .line 41
    .line 42
    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    add-int/2addr v2, v0

    .line 47
    mul-int/2addr v2, v1

    .line 48
    iget-object v0, p0, La/uci0;->h:La/ici0;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    add-int/2addr v0, v2

    .line 55
    mul-int/2addr v0, v1

    .line 56
    iget-boolean v2, p0, La/uci0;->i:Z

    .line 57
    .line 58
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-boolean v2, p0, La/uci0;->j:Z

    .line 63
    .line 64
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    const/4 v2, 0x0

    .line 69
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    iget-boolean p0, p0, La/uci0;->k:Z

    .line 74
    .line 75
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    add-int/2addr p0, v0

    .line 80
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", smsVisible="

    .line 2
    .line 3
    const-string v1, ", voiceSmsVisible="

    .line 4
    .line 5
    const-string v2, "UiState(authenticatorVisible="

    .line 6
    .line 7
    iget-boolean v3, p0, La/uci0;->a:Z

    .line 8
    .line 9
    iget-boolean v4, p0, La/uci0;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v0, v1, v3, v4}, La/f140;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", telegramVisible="

    .line 16
    .line 17
    const-string v2, ", callCodeVisible="

    .line 18
    .line 19
    iget-boolean v3, p0, La/uci0;->c:Z

    .line 20
    .line 21
    iget-boolean v4, p0, La/uci0;->d:Z

    .line 22
    .line 23
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", titleResId="

    .line 27
    .line 28
    const-string v2, ", message="

    .line 29
    .line 30
    iget v3, p0, La/uci0;->f:I

    .line 31
    .line 32
    iget-boolean v4, p0, La/uci0;->e:Z

    .line 33
    .line 34
    invoke-static {v3, v1, v2, v0, v4}, La/ua80;->q(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, La/uci0;->g:Landroid/text/SpannableStringBuilder;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", activationState="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, La/uci0;->h:La/ici0;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, ", networkConnected="

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, ", antiSpamVisible="

    .line 58
    .line 59
    const-string v2, ", mailingInfoVisible=false, loading="

    .line 60
    .line 61
    iget-boolean v3, p0, La/uci0;->i:Z

    .line 62
    .line 63
    iget-boolean v4, p0, La/uci0;->j:Z

    .line 64
    .line 65
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 66
    .line 67
    .line 68
    const-string v1, ")"

    .line 69
    .line 70
    iget-boolean p0, p0, La/uci0;->k:Z

    .line 71
    .line 72
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0
.end method
