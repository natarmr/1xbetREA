.class public final La/zbi0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/dci0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/swp0;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public final e:Z

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:I

.field public final i:J

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/String;

.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;La/swp0;Ljava/util/ArrayList;Ljava/util/ArrayList;ZLjava/lang/String;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    iput-object p1, p0, La/zbi0;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, La/zbi0;->b:La/swp0;

    .line 13
    .line 14
    iput-object p3, p0, La/zbi0;->c:Ljava/util/ArrayList;

    .line 15
    .line 16
    iput-object p4, p0, La/zbi0;->d:Ljava/util/ArrayList;

    .line 17
    .line 18
    iput-boolean p5, p0, La/zbi0;->e:Z

    .line 19
    .line 20
    iput-object p6, p0, La/zbi0;->f:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p7, p0, La/zbi0;->g:Ljava/lang/String;

    .line 23
    .line 24
    iput p8, p0, La/zbi0;->h:I

    .line 25
    .line 26
    iput-wide p9, p0, La/zbi0;->i:J

    .line 27
    .line 28
    iput-object p11, p0, La/zbi0;->j:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p12, p0, La/zbi0;->k:Ljava/lang/String;

    .line 31
    .line 32
    iput-object p13, p0, La/zbi0;->l:Ljava/lang/String;

    .line 33
    .line 34
    iput-object p14, p0, La/zbi0;->m:Ljava/lang/String;

    .line 35
    .line 36
    iput-object p15, p0, La/zbi0;->n:Ljava/lang/String;

    .line 37
    .line 38
    move-object/from16 p1, p16

    .line 39
    .line 40
    iput-object p1, p0, La/zbi0;->o:Ljava/lang/String;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final D()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/zbi0;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/zbi0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/zbi0;

    .line 12
    .line 13
    iget-object v0, p0, La/zbi0;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/zbi0;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, La/zbi0;->b:La/swp0;

    .line 26
    .line 27
    iget-object v1, p1, La/zbi0;->b:La/swp0;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, La/swp0;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_3
    iget-object v0, p0, La/zbi0;->c:Ljava/util/ArrayList;

    .line 38
    .line 39
    iget-object v1, p1, La/zbi0;->c:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_4

    .line 46
    .line 47
    goto/16 :goto_0

    .line 48
    .line 49
    :cond_4
    iget-object v0, p0, La/zbi0;->d:Ljava/util/ArrayList;

    .line 50
    .line 51
    iget-object v1, p1, La/zbi0;->d:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_5

    .line 58
    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    :cond_5
    iget-boolean v0, p0, La/zbi0;->e:Z

    .line 62
    .line 63
    iget-boolean v1, p1, La/zbi0;->e:Z

    .line 64
    .line 65
    if-eq v0, v1, :cond_6

    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :cond_6
    iget-object v0, p0, La/zbi0;->f:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v1, p1, La/zbi0;->f:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_7

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_7
    iget-object v0, p0, La/zbi0;->g:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v1, p1, La/zbi0;->g:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_8

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_8
    iget v0, p0, La/zbi0;->h:I

    .line 92
    .line 93
    iget v1, p1, La/zbi0;->h:I

    .line 94
    .line 95
    if-eq v0, v1, :cond_9

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_9
    iget-wide v0, p0, La/zbi0;->i:J

    .line 99
    .line 100
    iget-wide v2, p1, La/zbi0;->i:J

    .line 101
    .line 102
    cmp-long v0, v0, v2

    .line 103
    .line 104
    if-eqz v0, :cond_a

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_a
    iget-object v0, p0, La/zbi0;->j:Ljava/lang/String;

    .line 108
    .line 109
    iget-object v1, p1, La/zbi0;->j:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-nez v0, :cond_b

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_b
    iget-object v0, p0, La/zbi0;->k:Ljava/lang/String;

    .line 119
    .line 120
    iget-object v1, p1, La/zbi0;->k:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_c

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_c
    iget-object v0, p0, La/zbi0;->l:Ljava/lang/String;

    .line 130
    .line 131
    iget-object v1, p1, La/zbi0;->l:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-nez v0, :cond_d

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_d
    iget-object v0, p0, La/zbi0;->m:Ljava/lang/String;

    .line 141
    .line 142
    iget-object v1, p1, La/zbi0;->m:Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_e

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_e
    iget-object v0, p0, La/zbi0;->n:Ljava/lang/String;

    .line 152
    .line 153
    iget-object v1, p1, La/zbi0;->n:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-nez v0, :cond_f

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_f
    iget-object p0, p0, La/zbi0;->o:Ljava/lang/String;

    .line 163
    .line 164
    iget-object p1, p1, La/zbi0;->o:Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result p0

    .line 170
    if-nez p0, :cond_10

    .line 171
    .line 172
    :goto_0
    const/4 p0, 0x0

    .line 173
    return p0

    .line 174
    :cond_10
    :goto_1
    const/4 p0, 0x1

    .line 175
    return p0
.end method

.method public final getPhoneNumber()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/zbi0;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getToken()La/swp0;
    .locals 0

    .line 1
    iget-object p0, p0, La/zbi0;->b:La/swp0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/zbi0;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget-object v2, p0, La/zbi0;->b:La/swp0;

    .line 11
    .line 12
    invoke-virtual {v2}, La/swp0;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, La/zbi0;->c:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-static {v0, v2, v1}, La/twn;->g(Ljava/util/ArrayList;II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, La/zbi0;->d:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-static {v2, v0, v1}, La/twn;->g(Ljava/util/ArrayList;II)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-boolean v2, p0, La/zbi0;->e:Z

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v2, p0, La/zbi0;->f:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v2, p0, La/zbi0;->g:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget v2, p0, La/zbi0;->h:I

    .line 49
    .line 50
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-wide v2, p0, La/zbi0;->i:J

    .line 55
    .line 56
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object v2, p0, La/zbi0;->j:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-object v2, p0, La/zbi0;->k:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-object v2, p0, La/zbi0;->l:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-object v2, p0, La/zbi0;->m:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget-object v2, p0, La/zbi0;->n:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget-object p0, p0, La/zbi0;->o:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    add-int/2addr p0, v0

    .line 97
    return p0
.end method

.method public final p()I
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "PhoneActivationFromRegistrationConfirmation(phoneNumber="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/zbi0;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", token="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/zbi0;->b:La/swp0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", availableActivationTypeList="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/zbi0;->c:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", availableRepeatActivationTypeList="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/zbi0;->d:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", isRepeatFlow="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", phoneCodeDigits="

    .line 49
    .line 50
    const-string v2, ", phoneDigits="

    .line 51
    .line 52
    iget-object v3, p0, La/zbi0;->f:Ljava/lang/String;

    .line 53
    .line 54
    iget-boolean v4, p0, La/zbi0;->e:Z

    .line 55
    .line 56
    invoke-static {v1, v3, v2, v0, v4}, La/f140;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 57
    .line 58
    .line 59
    const-string v1, ", registrationTypeId="

    .line 60
    .line 61
    const-string v2, ", countryId="

    .line 62
    .line 63
    iget v3, p0, La/zbi0;->h:I

    .line 64
    .line 65
    iget-object v4, p0, La/zbi0;->g:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v3, v4, v1, v2, v0}, La/twn;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 68
    .line 69
    .line 70
    const-string v1, ", countryName="

    .line 71
    .line 72
    iget-wide v2, p0, La/zbi0;->i:J

    .line 73
    .line 74
    iget-object v4, p0, La/zbi0;->j:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v0, v2, v3, v1, v4}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const-string v1, ", currencyName="

    .line 80
    .line 81
    const-string v2, ", bonusName="

    .line 82
    .line 83
    iget-object v3, p0, La/zbi0;->k:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v4, p0, La/zbi0;->l:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v0, v1, v3, v2, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const-string v1, ", promoCode="

    .line 91
    .line 92
    const-string v2, ", countryCode="

    .line 93
    .line 94
    iget-object v3, p0, La/zbi0;->m:Ljava/lang/String;

    .line 95
    .line 96
    iget-object v4, p0, La/zbi0;->n:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {v0, v1, v3, v2, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    const-string v1, ", referralLink="

    .line 102
    .line 103
    const-string v2, ")"

    .line 104
    .line 105
    iget-object p0, p0, La/zbi0;->o:Ljava/lang/String;

    .line 106
    .line 107
    invoke-static {v0, v1, p0, v2}, La/rw2;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0
.end method

.method public final u()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/zbi0;->e:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/zbi0;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method
