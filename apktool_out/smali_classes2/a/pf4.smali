.class public final La/pf4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Ljava/util/List;

.field public final i:Ljava/util/List;

.field public final j:Z

.field public final k:Z

.field public final l:Z

.field public final m:Ljava/lang/String;

.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/String;

.field public final p:Z

.field public final q:Z


# direct methods
.method public constructor <init>(ZZZZZZZLjava/util/List;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V
    .locals 0

    .line 1
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-boolean p1, p0, La/pf4;->a:Z

    .line 14
    .line 15
    iput-boolean p2, p0, La/pf4;->b:Z

    .line 16
    .line 17
    iput-boolean p3, p0, La/pf4;->c:Z

    .line 18
    .line 19
    iput-boolean p4, p0, La/pf4;->d:Z

    .line 20
    .line 21
    iput-boolean p5, p0, La/pf4;->e:Z

    .line 22
    .line 23
    iput-boolean p6, p0, La/pf4;->f:Z

    .line 24
    .line 25
    iput-boolean p7, p0, La/pf4;->g:Z

    .line 26
    .line 27
    iput-object p8, p0, La/pf4;->h:Ljava/util/List;

    .line 28
    .line 29
    iput-object p9, p0, La/pf4;->i:Ljava/util/List;

    .line 30
    .line 31
    iput-boolean p10, p0, La/pf4;->j:Z

    .line 32
    .line 33
    iput-boolean p11, p0, La/pf4;->k:Z

    .line 34
    .line 35
    iput-boolean p12, p0, La/pf4;->l:Z

    .line 36
    .line 37
    iput-object p13, p0, La/pf4;->m:Ljava/lang/String;

    .line 38
    .line 39
    iput-object p14, p0, La/pf4;->n:Ljava/lang/String;

    .line 40
    .line 41
    iput-object p15, p0, La/pf4;->o:Ljava/lang/String;

    .line 42
    .line 43
    move/from16 p1, p16

    .line 44
    .line 45
    iput-boolean p1, p0, La/pf4;->p:Z

    .line 46
    .line 47
    move/from16 p1, p17

    .line 48
    .line 49
    iput-boolean p1, p0, La/pf4;->q:Z

    .line 50
    .line 51
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
    instance-of v0, p1, La/pf4;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/pf4;

    .line 12
    .line 13
    iget-boolean v0, p0, La/pf4;->a:Z

    .line 14
    .line 15
    iget-boolean v1, p1, La/pf4;->a:Z

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_2
    iget-boolean v0, p0, La/pf4;->b:Z

    .line 22
    .line 23
    iget-boolean v1, p1, La/pf4;->b:Z

    .line 24
    .line 25
    if-eq v0, v1, :cond_3

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :cond_3
    iget-boolean v0, p0, La/pf4;->c:Z

    .line 30
    .line 31
    iget-boolean v1, p1, La/pf4;->c:Z

    .line 32
    .line 33
    if-eq v0, v1, :cond_4

    .line 34
    .line 35
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_4
    iget-boolean v0, p0, La/pf4;->d:Z

    .line 38
    .line 39
    iget-boolean v1, p1, La/pf4;->d:Z

    .line 40
    .line 41
    if-eq v0, v1, :cond_5

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_5
    iget-boolean v0, p0, La/pf4;->e:Z

    .line 46
    .line 47
    iget-boolean v1, p1, La/pf4;->e:Z

    .line 48
    .line 49
    if-eq v0, v1, :cond_6

    .line 50
    .line 51
    goto/16 :goto_0

    .line 52
    .line 53
    :cond_6
    iget-boolean v0, p0, La/pf4;->f:Z

    .line 54
    .line 55
    iget-boolean v1, p1, La/pf4;->f:Z

    .line 56
    .line 57
    if-eq v0, v1, :cond_7

    .line 58
    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    :cond_7
    iget-boolean v0, p0, La/pf4;->g:Z

    .line 62
    .line 63
    iget-boolean v1, p1, La/pf4;->g:Z

    .line 64
    .line 65
    if-eq v0, v1, :cond_8

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_8
    iget-object v0, p0, La/pf4;->h:Ljava/util/List;

    .line 69
    .line 70
    iget-object v1, p1, La/pf4;->h:Ljava/util/List;

    .line 71
    .line 72
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_9

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_9
    iget-object v0, p0, La/pf4;->i:Ljava/util/List;

    .line 80
    .line 81
    iget-object v1, p1, La/pf4;->i:Ljava/util/List;

    .line 82
    .line 83
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_a

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_a
    iget-boolean v0, p0, La/pf4;->j:Z

    .line 91
    .line 92
    iget-boolean v1, p1, La/pf4;->j:Z

    .line 93
    .line 94
    if-eq v0, v1, :cond_b

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_b
    iget-boolean v0, p0, La/pf4;->k:Z

    .line 98
    .line 99
    iget-boolean v1, p1, La/pf4;->k:Z

    .line 100
    .line 101
    if-eq v0, v1, :cond_c

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_c
    iget-boolean v0, p0, La/pf4;->l:Z

    .line 105
    .line 106
    iget-boolean v1, p1, La/pf4;->l:Z

    .line 107
    .line 108
    if-eq v0, v1, :cond_d

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_d
    iget-object v0, p0, La/pf4;->m:Ljava/lang/String;

    .line 112
    .line 113
    iget-object v1, p1, La/pf4;->m:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-nez v0, :cond_e

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_e
    iget-object v0, p0, La/pf4;->n:Ljava/lang/String;

    .line 123
    .line 124
    iget-object v1, p1, La/pf4;->n:Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-nez v0, :cond_f

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_f
    iget-object v0, p0, La/pf4;->o:Ljava/lang/String;

    .line 134
    .line 135
    iget-object v1, p1, La/pf4;->o:Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-nez v0, :cond_10

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_10
    iget-boolean v0, p0, La/pf4;->p:Z

    .line 145
    .line 146
    iget-boolean v1, p1, La/pf4;->p:Z

    .line 147
    .line 148
    if-eq v0, v1, :cond_11

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_11
    iget-boolean p0, p0, La/pf4;->q:Z

    .line 152
    .line 153
    iget-boolean p1, p1, La/pf4;->q:Z

    .line 154
    .line 155
    if-eq p0, p1, :cond_12

    .line 156
    .line 157
    :goto_0
    const/4 p0, 0x0

    .line 158
    return p0

    .line 159
    :cond_12
    :goto_1
    const/4 p0, 0x1

    .line 160
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La/pf4;->a:Z

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
    iget-boolean v2, p0, La/pf4;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/pf4;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/pf4;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/pf4;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, La/pf4;->f:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, La/pf4;->g:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, La/pf4;->h:Ljava/util/List;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, La/pf4;->i:Ljava/util/List;

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean v2, p0, La/pf4;->j:Z

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-boolean v2, p0, La/pf4;->k:Z

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-boolean v2, p0, La/pf4;->l:Z

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-object v2, p0, La/pf4;->m:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object v2, p0, La/pf4;->n:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-object v2, p0, La/pf4;->o:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget-boolean v2, p0, La/pf4;->p:Z

    .line 95
    .line 96
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iget-boolean p0, p0, La/pf4;->q:Z

    .line 101
    .line 102
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    add-int/2addr p0, v0

    .line 107
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
    const-string v2, "AuthLoginSimpleSettings(isNewApi="

    .line 6
    .line 7
    iget-boolean v3, p0, La/pf4;->a:Z

    .line 8
    .line 9
    iget-boolean v4, p0, La/pf4;->b:Z

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
    iget-boolean v3, p0, La/pf4;->c:Z

    .line 20
    .line 21
    iget-boolean v4, p0, La/pf4;->d:Z

    .line 22
    .line 23
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", isConsultantAvailable="

    .line 27
    .line 28
    const-string v2, ", isAllowAppWithoutAuth="

    .line 29
    .line 30
    iget-boolean v3, p0, La/pf4;->e:Z

    .line 31
    .line 32
    iget-boolean v4, p0, La/pf4;->f:Z

    .line 33
    .line 34
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", restorePasswordAllowedCountries="

    .line 38
    .line 39
    const-string v2, ", restorePasswordForbiddenCountries="

    .line 40
    .line 41
    iget-object v3, p0, La/pf4;->h:Ljava/util/List;

    .line 42
    .line 43
    iget-boolean v4, p0, La/pf4;->g:Z

    .line 44
    .line 45
    invoke-static {v0, v1, v3, v2, v4}, La/vqd;->y(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v1, ", redirectToVerificationAfterLogin="

    .line 49
    .line 50
    const-string v2, ", redirectToPaymentAfterLogin="

    .line 51
    .line 52
    iget-object v3, p0, La/pf4;->i:Ljava/util/List;

    .line 53
    .line 54
    iget-boolean v4, p0, La/pf4;->j:Z

    .line 55
    .line 56
    invoke-static {v0, v1, v3, v2, v4}, La/rz4;->z(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v1, ", hasAuthenticator="

    .line 60
    .line 61
    const-string v2, ", socialAppKey="

    .line 62
    .line 63
    iget-boolean v3, p0, La/pf4;->k:Z

    .line 64
    .line 65
    iget-boolean v4, p0, La/pf4;->l:Z

    .line 66
    .line 67
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 68
    .line 69
    .line 70
    const-string v1, ", xSocialAppKey="

    .line 71
    .line 72
    const-string v2, ", appName="

    .line 73
    .line 74
    iget-object v3, p0, La/pf4;->m:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v4, p0, La/pf4;->n:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string v1, ", hasAllowedAppWithoutAuth="

    .line 82
    .line 83
    const-string v2, ", isFromStartScreen="

    .line 84
    .line 85
    iget-object v3, p0, La/pf4;->o:Ljava/lang/String;

    .line 86
    .line 87
    iget-boolean v4, p0, La/pf4;->p:Z

    .line 88
    .line 89
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 90
    .line 91
    .line 92
    const-string v1, ")"

    .line 93
    .line 94
    iget-boolean p0, p0, La/pf4;->q:Z

    .line 95
    .line 96
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0
.end method
