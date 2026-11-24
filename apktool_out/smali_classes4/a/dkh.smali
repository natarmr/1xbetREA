.class public final synthetic La/dkh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/dkh;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/dkh;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/dkh;->a:La/dkh;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.cyber.section.impl.tournament_bracket.presentation.match_diaolog.model.CyberTournamentBracketMatchParams"

    .line 11
    .line 12
    const/16 v3, 0xd

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "firstTeamIcon"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "firstTeamName"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "secondTeamIcon"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "secondTeamName"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "firstTeamScore"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "secondTeamScore"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "gameStatus"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "stage"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "date"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "matchId"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    const-string v0, "buttonText"

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    const-string v0, "globalChampId"

    .line 74
    .line 75
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    const-string v0, "subSportId"

    .line 79
    .line 80
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    sput-object v1, La/dkh;->descriptor:La/ugi0;

    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 4

    .line 1
    sget-object p0, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->n:[La/a8z;

    .line 2
    .line 3
    const/16 v0, 0xd

    .line 4
    .line 5
    new-array v0, v0, [La/jiy;

    .line 6
    .line 7
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aput-object v1, v0, v2

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    aput-object v1, v0, v2

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    aput-object v1, v0, v2

    .line 17
    .line 18
    const/4 v2, 0x3

    .line 19
    aput-object v1, v0, v2

    .line 20
    .line 21
    sget-object v2, La/okx;->a:La/okx;

    .line 22
    .line 23
    const/4 v3, 0x4

    .line 24
    aput-object v2, v0, v3

    .line 25
    .line 26
    const/4 v3, 0x5

    .line 27
    aput-object v2, v0, v3

    .line 28
    .line 29
    const/4 v3, 0x6

    .line 30
    aget-object p0, p0, v3

    .line 31
    .line 32
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    aput-object p0, v0, v3

    .line 37
    .line 38
    sget-object p0, La/xjh;->a:La/xjh;

    .line 39
    .line 40
    const/4 v3, 0x7

    .line 41
    aput-object p0, v0, v3

    .line 42
    .line 43
    const/16 v3, 0x8

    .line 44
    .line 45
    aput-object p0, v0, v3

    .line 46
    .line 47
    sget-object p0, La/s710;->a:La/s710;

    .line 48
    .line 49
    const/16 v3, 0x9

    .line 50
    .line 51
    aput-object p0, v0, v3

    .line 52
    .line 53
    const/16 v3, 0xa

    .line 54
    .line 55
    aput-object v1, v0, v3

    .line 56
    .line 57
    const/16 v1, 0xb

    .line 58
    .line 59
    aput-object v2, v0, v1

    .line 60
    .line 61
    const/16 v1, 0xc

    .line 62
    .line 63
    aput-object p0, v0, v1

    .line 64
    .line 65
    return-object v0
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 25

    .line 1
    sget-object v0, La/dkh;->descriptor:La/ugi0;

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-interface {v1, v0}, La/rkj;->a(La/ugi0;)La/bld;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->n:[La/a8z;

    .line 10
    .line 11
    const-wide/16 v6, 0x0

    .line 12
    .line 13
    move-wide/from16 v19, v6

    .line 14
    .line 15
    move-wide/from16 v23, v19

    .line 16
    .line 17
    const/16 p0, 0x0

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x1

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v8, 0x0

    .line 23
    const/4 v9, 0x0

    .line 24
    const/4 v10, 0x0

    .line 25
    const/4 v11, 0x0

    .line 26
    const/4 v12, 0x0

    .line 27
    const/4 v13, 0x0

    .line 28
    const/4 v14, 0x0

    .line 29
    const/4 v15, 0x0

    .line 30
    const/16 v21, 0x0

    .line 31
    .line 32
    const/16 v22, 0x0

    .line 33
    .line 34
    :goto_0
    if-eqz v6, :cond_0

    .line 35
    .line 36
    invoke-interface {v1, v0}, La/bld;->f(La/ugi0;)I

    .line 37
    .line 38
    .line 39
    move-result v16

    .line 40
    packed-switch v16, :pswitch_data_0

    .line 41
    .line 42
    .line 43
    invoke-static/range {v16 .. v16}, La/itt0;->c(I)V

    .line 44
    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_0
    const/16 v4, 0xc

    .line 48
    .line 49
    invoke-interface {v1, v0, v4}, La/bld;->r(La/ugi0;I)J

    .line 50
    .line 51
    .line 52
    move-result-wide v23

    .line 53
    or-int/lit16 v9, v9, 0x1000

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_1
    const/16 v4, 0xb

    .line 57
    .line 58
    invoke-interface {v1, v0, v4}, La/bld;->j(La/ugi0;I)I

    .line 59
    .line 60
    .line 61
    move-result v22

    .line 62
    or-int/lit16 v9, v9, 0x800

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :pswitch_2
    const/16 v4, 0xa

    .line 66
    .line 67
    invoke-interface {v1, v0, v4}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v21

    .line 71
    or-int/lit16 v9, v9, 0x400

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :pswitch_3
    const/16 v4, 0x9

    .line 75
    .line 76
    invoke-interface {v1, v0, v4}, La/bld;->r(La/ugi0;I)J

    .line 77
    .line 78
    .line 79
    move-result-wide v19

    .line 80
    or-int/lit16 v9, v9, 0x200

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :pswitch_4
    sget-object v4, La/xjh;->a:La/xjh;

    .line 84
    .line 85
    const/16 v3, 0x8

    .line 86
    .line 87
    invoke-interface {v1, v0, v3, v4, v5}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    move-object v5, v3

    .line 92
    check-cast v5, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;

    .line 93
    .line 94
    or-int/lit16 v9, v9, 0x100

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :pswitch_5
    const/4 v3, 0x7

    .line 98
    sget-object v4, La/xjh;->a:La/xjh;

    .line 99
    .line 100
    invoke-interface {v1, v0, v3, v4, v8}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    move-object v8, v3

    .line 105
    check-cast v8, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;

    .line 106
    .line 107
    or-int/lit16 v9, v9, 0x80

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :pswitch_6
    const/4 v3, 0x6

    .line 111
    aget-object v4, v2, v3

    .line 112
    .line 113
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    check-cast v4, La/jiy;

    .line 118
    .line 119
    invoke-interface {v1, v0, v3, v4, v7}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    move-object v7, v3

    .line 124
    check-cast v7, Lorg/xplatform/cyber/section/api/tournament_bracket/domain/model/CyberTournamentBracketMatchStatusModel;

    .line 125
    .line 126
    or-int/lit8 v9, v9, 0x40

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :pswitch_7
    const/4 v3, 0x5

    .line 130
    invoke-interface {v1, v0, v3}, La/bld;->j(La/ugi0;I)I

    .line 131
    .line 132
    .line 133
    move-result v15

    .line 134
    or-int/lit8 v9, v9, 0x20

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :pswitch_8
    const/4 v3, 0x4

    .line 138
    invoke-interface {v1, v0, v3}, La/bld;->j(La/ugi0;I)I

    .line 139
    .line 140
    .line 141
    move-result v14

    .line 142
    or-int/lit8 v9, v9, 0x10

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :pswitch_9
    const/4 v3, 0x3

    .line 146
    invoke-interface {v1, v0, v3}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v13

    .line 150
    or-int/lit8 v9, v9, 0x8

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :pswitch_a
    const/4 v3, 0x2

    .line 154
    invoke-interface {v1, v0, v3}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v12

    .line 158
    or-int/lit8 v9, v9, 0x4

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :pswitch_b
    const/4 v3, 0x1

    .line 162
    invoke-interface {v1, v0, v3}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v11

    .line 166
    or-int/lit8 v9, v9, 0x2

    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :pswitch_c
    const/4 v3, 0x1

    .line 171
    const/4 v4, 0x0

    .line 172
    invoke-interface {v1, v0, v4}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v10

    .line 176
    or-int/lit8 v9, v9, 0x1

    .line 177
    .line 178
    goto/16 :goto_0

    .line 179
    .line 180
    :pswitch_d
    const/4 v3, 0x1

    .line 181
    const/4 v4, 0x0

    .line 182
    move v6, v4

    .line 183
    goto/16 :goto_0

    .line 184
    .line 185
    :cond_0
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 186
    .line 187
    .line 188
    move-object/from16 v17, v8

    .line 189
    .line 190
    new-instance v8, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;

    .line 191
    .line 192
    move-object/from16 v18, v5

    .line 193
    .line 194
    move-object/from16 v16, v7

    .line 195
    .line 196
    invoke-direct/range {v8 .. v24}, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILorg/xplatform/cyber/section/api/tournament_bracket/domain/model/CyberTournamentBracketMatchStatusModel;Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;JLjava/lang/String;IJ)V

    .line 197
    .line 198
    .line 199
    return-object v8

    .line 200
    nop

    .line 201
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/dkh;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/dkh;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->n:[La/a8z;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iget-object v2, p2, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-interface {p1, p0, v1, v2}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    iget-object v2, p2, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-interface {p1, p0, v1, v2}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    iget-object v2, p2, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->c:Ljava/lang/String;

    .line 28
    .line 29
    invoke-interface {p1, p0, v1, v2}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x3

    .line 33
    iget-object v2, p2, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->d:Ljava/lang/String;

    .line 34
    .line 35
    invoke-interface {p1, p0, v1, v2}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x4

    .line 39
    iget v2, p2, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->e:I

    .line 40
    .line 41
    invoke-interface {p1, v1, v2, p0}, La/cld;->i(IILa/ugi0;)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x5

    .line 45
    iget v2, p2, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->f:I

    .line 46
    .line 47
    invoke-interface {p1, v1, v2, p0}, La/cld;->i(IILa/ugi0;)V

    .line 48
    .line 49
    .line 50
    const/4 v1, 0x6

    .line 51
    aget-object v0, v0, v1

    .line 52
    .line 53
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, La/jiy;

    .line 58
    .line 59
    iget-object v2, p2, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->g:Lorg/xplatform/cyber/section/api/tournament_bracket/domain/model/CyberTournamentBracketMatchStatusModel;

    .line 60
    .line 61
    invoke-interface {p1, p0, v1, v0, v2}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    sget-object v0, La/xjh;->a:La/xjh;

    .line 65
    .line 66
    iget-object v1, p2, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->h:Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;

    .line 67
    .line 68
    const/4 v2, 0x7

    .line 69
    invoke-interface {p1, p0, v2, v0, v1}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    const/16 v1, 0x8

    .line 73
    .line 74
    iget-object v2, p2, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->i:Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;

    .line 75
    .line 76
    invoke-interface {p1, p0, v1, v0, v2}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    const/16 v0, 0x9

    .line 80
    .line 81
    iget-wide v1, p2, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->j:J

    .line 82
    .line 83
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 84
    .line 85
    .line 86
    const/16 v0, 0xa

    .line 87
    .line 88
    iget-object v1, p2, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->k:Ljava/lang/String;

    .line 89
    .line 90
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const/16 v0, 0xb

    .line 94
    .line 95
    iget v1, p2, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->l:I

    .line 96
    .line 97
    invoke-interface {p1, v0, v1, p0}, La/cld;->i(IILa/ugi0;)V

    .line 98
    .line 99
    .line 100
    const/16 v0, 0xc

    .line 101
    .line 102
    iget-wide v1, p2, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->m:J

    .line 103
    .line 104
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 105
    .line 106
    .line 107
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method
