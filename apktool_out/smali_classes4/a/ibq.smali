.class public final synthetic La/ibq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/ibq;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/ibq;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/ibq;->a:La/ibq;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.feature.fin_bet.impl.data.model.FinanceBetDataRequest"

    .line 11
    .line 12
    const/16 v3, 0xa

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "Seconds"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "Expired"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "Coef"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "InstrumentId"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "Price"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "GameId"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "Type"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "Kind"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "Param"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "PlayerId"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    sput-object v1, La/ibq;->descriptor:La/ugi0;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 4

    .line 1
    const/16 p0, 0xa

    .line 2
    .line 3
    new-array p0, p0, [La/jiy;

    .line 4
    .line 5
    sget-object v0, La/s710;->a:La/s710;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    aput-object v0, p0, v1

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    aput-object v0, p0, v1

    .line 12
    .line 13
    sget-object v1, La/tbl;->a:La/tbl;

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    aput-object v1, p0, v2

    .line 17
    .line 18
    const/4 v2, 0x3

    .line 19
    aput-object v0, p0, v2

    .line 20
    .line 21
    const/4 v2, 0x4

    .line 22
    aput-object v1, p0, v2

    .line 23
    .line 24
    const/4 v2, 0x5

    .line 25
    aput-object v0, p0, v2

    .line 26
    .line 27
    sget-object v2, La/okx;->a:La/okx;

    .line 28
    .line 29
    const/4 v3, 0x6

    .line 30
    aput-object v2, p0, v3

    .line 31
    .line 32
    const/4 v3, 0x7

    .line 33
    aput-object v0, p0, v3

    .line 34
    .line 35
    const/16 v0, 0x8

    .line 36
    .line 37
    aput-object v1, p0, v0

    .line 38
    .line 39
    const/16 v0, 0x9

    .line 40
    .line 41
    aput-object v2, p0, v0

    .line 42
    .line 43
    return-object p0
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 28

    .line 1
    sget-object v0, La/ibq;->descriptor:La/ugi0;

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
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    const-wide/16 v4, 0x0

    .line 12
    .line 13
    const-wide/16 v6, 0x0

    .line 14
    .line 15
    move v9, v3

    .line 16
    move/from16 v22, v9

    .line 17
    .line 18
    move/from16 v27, v22

    .line 19
    .line 20
    move-wide v10, v4

    .line 21
    move-wide v12, v10

    .line 22
    move-wide/from16 v16, v12

    .line 23
    .line 24
    move-wide/from16 v20, v16

    .line 25
    .line 26
    move-wide/from16 v23, v20

    .line 27
    .line 28
    move-wide v14, v6

    .line 29
    move-wide/from16 v18, v14

    .line 30
    .line 31
    move-wide/from16 v25, v18

    .line 32
    .line 33
    move v4, v2

    .line 34
    :goto_0
    if-eqz v4, :cond_0

    .line 35
    .line 36
    invoke-interface {v1, v0}, La/bld;->f(La/ugi0;)I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    packed-switch v5, :pswitch_data_0

    .line 41
    .line 42
    .line 43
    invoke-static {v5}, La/itt0;->c(I)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    return-object v0

    .line 48
    :pswitch_0
    const/16 v5, 0x9

    .line 49
    .line 50
    invoke-interface {v1, v0, v5}, La/bld;->j(La/ugi0;I)I

    .line 51
    .line 52
    .line 53
    move-result v27

    .line 54
    or-int/lit16 v9, v9, 0x200

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :pswitch_1
    const/16 v5, 0x8

    .line 58
    .line 59
    invoke-interface {v1, v0, v5}, La/bld;->t(La/ugi0;I)D

    .line 60
    .line 61
    .line 62
    move-result-wide v25

    .line 63
    or-int/lit16 v9, v9, 0x100

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :pswitch_2
    const/4 v5, 0x7

    .line 67
    invoke-interface {v1, v0, v5}, La/bld;->r(La/ugi0;I)J

    .line 68
    .line 69
    .line 70
    move-result-wide v23

    .line 71
    or-int/lit16 v9, v9, 0x80

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :pswitch_3
    const/4 v5, 0x6

    .line 75
    invoke-interface {v1, v0, v5}, La/bld;->j(La/ugi0;I)I

    .line 76
    .line 77
    .line 78
    move-result v22

    .line 79
    or-int/lit8 v9, v9, 0x40

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :pswitch_4
    const/4 v5, 0x5

    .line 83
    invoke-interface {v1, v0, v5}, La/bld;->r(La/ugi0;I)J

    .line 84
    .line 85
    .line 86
    move-result-wide v20

    .line 87
    or-int/lit8 v9, v9, 0x20

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :pswitch_5
    const/4 v5, 0x4

    .line 91
    invoke-interface {v1, v0, v5}, La/bld;->t(La/ugi0;I)D

    .line 92
    .line 93
    .line 94
    move-result-wide v18

    .line 95
    or-int/lit8 v9, v9, 0x10

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :pswitch_6
    const/4 v5, 0x3

    .line 99
    invoke-interface {v1, v0, v5}, La/bld;->r(La/ugi0;I)J

    .line 100
    .line 101
    .line 102
    move-result-wide v16

    .line 103
    or-int/lit8 v9, v9, 0x8

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :pswitch_7
    const/4 v5, 0x2

    .line 107
    invoke-interface {v1, v0, v5}, La/bld;->t(La/ugi0;I)D

    .line 108
    .line 109
    .line 110
    move-result-wide v14

    .line 111
    or-int/lit8 v9, v9, 0x4

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :pswitch_8
    invoke-interface {v1, v0, v2}, La/bld;->r(La/ugi0;I)J

    .line 115
    .line 116
    .line 117
    move-result-wide v12

    .line 118
    or-int/lit8 v9, v9, 0x2

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :pswitch_9
    invoke-interface {v1, v0, v3}, La/bld;->r(La/ugi0;I)J

    .line 122
    .line 123
    .line 124
    move-result-wide v10

    .line 125
    or-int/lit8 v9, v9, 0x1

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :pswitch_a
    move v4, v3

    .line 129
    goto :goto_0

    .line 130
    :cond_0
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 131
    .line 132
    .line 133
    new-instance v8, La/kbq;

    .line 134
    .line 135
    invoke-direct/range {v8 .. v27}, La/kbq;-><init>(IJJDJDJIJDI)V

    .line 136
    .line 137
    .line 138
    return-object v8

    .line 139
    :pswitch_data_0
    .packed-switch -0x1
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
    sget-object p0, La/ibq;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, La/kbq;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/ibq;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x0

    .line 13
    iget-wide v1, p2, La/kbq;->a:J

    .line 14
    .line 15
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iget-wide v1, p2, La/kbq;->b:J

    .line 20
    .line 21
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    iget-wide v1, p2, La/kbq;->c:D

    .line 26
    .line 27
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->j(La/ugi0;ID)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x3

    .line 31
    iget-wide v1, p2, La/kbq;->d:J

    .line 32
    .line 33
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x4

    .line 37
    iget-wide v1, p2, La/kbq;->e:D

    .line 38
    .line 39
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->j(La/ugi0;ID)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x5

    .line 43
    iget-wide v1, p2, La/kbq;->f:J

    .line 44
    .line 45
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x6

    .line 49
    iget v1, p2, La/kbq;->g:I

    .line 50
    .line 51
    invoke-interface {p1, v0, v1, p0}, La/cld;->i(IILa/ugi0;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x7

    .line 55
    iget-wide v1, p2, La/kbq;->h:J

    .line 56
    .line 57
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 58
    .line 59
    .line 60
    const/16 v0, 0x8

    .line 61
    .line 62
    iget-wide v1, p2, La/kbq;->i:D

    .line 63
    .line 64
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->j(La/ugi0;ID)V

    .line 65
    .line 66
    .line 67
    const/16 v0, 0x9

    .line 68
    .line 69
    iget p2, p2, La/kbq;->j:I

    .line 70
    .line 71
    invoke-interface {p1, v0, p2, p0}, La/cld;->i(IILa/ugi0;)V

    .line 72
    .line 73
    .line 74
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method
