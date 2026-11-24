.class public final La/cb4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Ljava/util/List;

.field public final h:Ljava/util/List;

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/String;

.field public final n:Z

.field public final o:Ljava/util/List;


# direct methods
.method public constructor <init>(ZZZZZZLjava/util/List;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;)V
    .locals 1

    .line 1
    move-object/from16 v0, p15

    .line 2
    .line 3
    invoke-static {p7, p8, v0}, La/b1j;->B(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-boolean p1, p0, La/cb4;->a:Z

    .line 10
    .line 11
    iput-boolean p2, p0, La/cb4;->b:Z

    .line 12
    .line 13
    iput-boolean p3, p0, La/cb4;->c:Z

    .line 14
    .line 15
    iput-boolean p4, p0, La/cb4;->d:Z

    .line 16
    .line 17
    iput-boolean p5, p0, La/cb4;->e:Z

    .line 18
    .line 19
    iput-boolean p6, p0, La/cb4;->f:Z

    .line 20
    .line 21
    iput-object p7, p0, La/cb4;->g:Ljava/util/List;

    .line 22
    .line 23
    iput-object p8, p0, La/cb4;->h:Ljava/util/List;

    .line 24
    .line 25
    iput-boolean p9, p0, La/cb4;->i:Z

    .line 26
    .line 27
    iput-boolean p10, p0, La/cb4;->j:Z

    .line 28
    .line 29
    iput-boolean p11, p0, La/cb4;->k:Z

    .line 30
    .line 31
    iput-object p12, p0, La/cb4;->l:Ljava/lang/String;

    .line 32
    .line 33
    iput-object p13, p0, La/cb4;->m:Ljava/lang/String;

    .line 34
    .line 35
    iput-boolean p14, p0, La/cb4;->n:Z

    .line 36
    .line 37
    iput-object v0, p0, La/cb4;->o:Ljava/util/List;

    .line 38
    .line 39
    return-void
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
    instance-of v0, p1, La/cb4;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/cb4;

    .line 12
    .line 13
    iget-boolean v0, p0, La/cb4;->a:Z

    .line 14
    .line 15
    iget-boolean v1, p1, La/cb4;->a:Z

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_2
    iget-boolean v0, p0, La/cb4;->b:Z

    .line 22
    .line 23
    iget-boolean v1, p1, La/cb4;->b:Z

    .line 24
    .line 25
    if-eq v0, v1, :cond_3

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :cond_3
    iget-boolean v0, p0, La/cb4;->c:Z

    .line 30
    .line 31
    iget-boolean v1, p1, La/cb4;->c:Z

    .line 32
    .line 33
    if-eq v0, v1, :cond_4

    .line 34
    .line 35
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_4
    iget-boolean v0, p0, La/cb4;->d:Z

    .line 38
    .line 39
    iget-boolean v1, p1, La/cb4;->d:Z

    .line 40
    .line 41
    if-eq v0, v1, :cond_5

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_5
    iget-boolean v0, p0, La/cb4;->e:Z

    .line 46
    .line 47
    iget-boolean v1, p1, La/cb4;->e:Z

    .line 48
    .line 49
    if-eq v0, v1, :cond_6

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_6
    iget-boolean v0, p0, La/cb4;->f:Z

    .line 53
    .line 54
    iget-boolean v1, p1, La/cb4;->f:Z

    .line 55
    .line 56
    if-eq v0, v1, :cond_7

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_7
    iget-object v0, p0, La/cb4;->g:Ljava/util/List;

    .line 60
    .line 61
    iget-object v1, p1, La/cb4;->g:Ljava/util/List;

    .line 62
    .line 63
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_8

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_8
    iget-object v0, p0, La/cb4;->h:Ljava/util/List;

    .line 71
    .line 72
    iget-object v1, p1, La/cb4;->h:Ljava/util/List;

    .line 73
    .line 74
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_9

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_9
    iget-boolean v0, p0, La/cb4;->i:Z

    .line 82
    .line 83
    iget-boolean v1, p1, La/cb4;->i:Z

    .line 84
    .line 85
    if-eq v0, v1, :cond_a

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_a
    iget-boolean v0, p0, La/cb4;->j:Z

    .line 89
    .line 90
    iget-boolean v1, p1, La/cb4;->j:Z

    .line 91
    .line 92
    if-eq v0, v1, :cond_b

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_b
    iget-boolean v0, p0, La/cb4;->k:Z

    .line 96
    .line 97
    iget-boolean v1, p1, La/cb4;->k:Z

    .line 98
    .line 99
    if-eq v0, v1, :cond_c

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_c
    iget-object v0, p0, La/cb4;->l:Ljava/lang/String;

    .line 103
    .line 104
    iget-object v1, p1, La/cb4;->l:Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_d

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_d
    iget-object v0, p0, La/cb4;->m:Ljava/lang/String;

    .line 114
    .line 115
    iget-object v1, p1, La/cb4;->m:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_e

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_e
    iget-boolean v0, p0, La/cb4;->n:Z

    .line 125
    .line 126
    iget-boolean v1, p1, La/cb4;->n:Z

    .line 127
    .line 128
    if-eq v0, v1, :cond_f

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_f
    iget-object p0, p0, La/cb4;->o:Ljava/util/List;

    .line 132
    .line 133
    iget-object p1, p1, La/cb4;->o:Ljava/util/List;

    .line 134
    .line 135
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    if-nez p0, :cond_10

    .line 140
    .line 141
    :goto_0
    const/4 p0, 0x0

    .line 142
    return p0

    .line 143
    :cond_10
    :goto_1
    const/4 p0, 0x1

    .line 144
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La/cb4;->a:Z

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
    iget-boolean v2, p0, La/cb4;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/cb4;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/cb4;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/cb4;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, La/cb4;->f:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/cb4;->g:Ljava/util/List;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, La/cb4;->h:Ljava/util/List;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, La/cb4;->i:Z

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean v2, p0, La/cb4;->j:Z

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-boolean v2, p0, La/cb4;->k:Z

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v2, p0, La/cb4;->l:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-object v2, p0, La/cb4;->m:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-boolean v2, p0, La/cb4;->n:Z

    .line 83
    .line 84
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-object p0, p0, La/cb4;->o:Ljava/util/List;

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    add-int/2addr p0, v0

    .line 95
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", isLoginByPhoneAvailable="

    .line 2
    .line 3
    const-string v1, ", isLoginByEmailAndIdAvailable="

    .line 4
    .line 5
    const-string v2, "AuthLoginDefaultSettings(isNewApi="

    .line 6
    .line 7
    iget-boolean v3, p0, La/cb4;->a:Z

    .line 8
    .line 9
    iget-boolean v4, p0, La/cb4;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v0, v1, v3, v4}, La/f140;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", isLoginByLoginAvailable="

    .line 16
    .line 17
    const-string v2, ", isActivatePhoneNecessarily="

    .line 18
    .line 19
    iget-boolean v3, p0, La/cb4;->c:Z

    .line 20
    .line 21
    iget-boolean v4, p0, La/cb4;->d:Z

    .line 22
    .line 23
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", isConsultantAvailable="

    .line 27
    .line 28
    const-string v2, ", restorePasswordAllowedCountries="

    .line 29
    .line 30
    iget-boolean v3, p0, La/cb4;->e:Z

    .line 31
    .line 32
    iget-boolean v4, p0, La/cb4;->f:Z

    .line 33
    .line 34
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", restorePasswordForbiddenCountries="

    .line 38
    .line 39
    const-string v2, ", redirectToVerificationAfterLogin="

    .line 40
    .line 41
    iget-object v3, p0, La/cb4;->g:Ljava/util/List;

    .line 42
    .line 43
    iget-object v4, p0, La/cb4;->h:Ljava/util/List;

    .line 44
    .line 45
    invoke-static {v1, v2, v0, v3, v4}, La/b1j;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Ljava/util/List;)V

    .line 46
    .line 47
    .line 48
    const-string v1, ", redirectToPaymentAfterLogin="

    .line 49
    .line 50
    const-string v2, ", hasBlockAuthVerification="

    .line 51
    .line 52
    iget-boolean v3, p0, La/cb4;->i:Z

    .line 53
    .line 54
    iget-boolean v4, p0, La/cb4;->j:Z

    .line 55
    .line 56
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 57
    .line 58
    .line 59
    const-string v1, ", socialAppKey="

    .line 60
    .line 61
    const-string v2, ", xSocialAppKey="

    .line 62
    .line 63
    iget-object v3, p0, La/cb4;->l:Ljava/lang/String;

    .line 64
    .line 65
    iget-boolean v4, p0, La/cb4;->k:Z

    .line 66
    .line 67
    invoke-static {v1, v3, v2, v0, v4}, La/f140;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 68
    .line 69
    .line 70
    const-string v1, ", hasSocial="

    .line 71
    .line 72
    const-string v2, ", regTypesOrdering="

    .line 73
    .line 74
    iget-object v3, p0, La/cb4;->m:Ljava/lang/String;

    .line 75
    .line 76
    iget-boolean v4, p0, La/cb4;->n:Z

    .line 77
    .line 78
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 79
    .line 80
    .line 81
    const-string v1, ")"

    .line 82
    .line 83
    iget-object p0, p0, La/cb4;->o:Ljava/util/List;

    .line 84
    .line 85
    invoke-static {v0, p0, v1}, La/dw9;->r(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0
.end method
