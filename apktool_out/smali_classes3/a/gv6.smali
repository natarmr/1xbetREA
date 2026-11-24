.class public final synthetic La/gv6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/gv6;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/gv6;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/gv6;->a:La/gv6;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.bet_constructor.impl.bets.data.models.BetEventRequest"

    .line 11
    .line 12
    const/4 v3, 0x6

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "Coef"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "GameId"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "Kind"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "Param"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "PlayerId"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    const-string v0, "Type"

    .line 43
    .line 44
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    sput-object v1, La/gv6;->descriptor:La/ugi0;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 4

    .line 1
    const/4 p0, 0x6

    .line 2
    new-array p0, p0, [La/jiy;

    .line 3
    .line 4
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aput-object v0, p0, v1

    .line 8
    .line 9
    sget-object v1, La/s710;->a:La/s710;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, p0, v2

    .line 13
    .line 14
    sget-object v2, La/okx;->a:La/okx;

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    aput-object v2, p0, v3

    .line 18
    .line 19
    const/4 v3, 0x3

    .line 20
    aput-object v0, p0, v3

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    aput-object v2, p0, v0

    .line 24
    .line 25
    const/4 v0, 0x5

    .line 26
    aput-object v1, p0, v0

    .line 27
    .line 28
    return-object p0
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 17

    .line 1
    sget-object v0, La/gv6;->descriptor:La/ugi0;

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
    const/4 v4, 0x0

    .line 12
    const-wide/16 v5, 0x0

    .line 13
    .line 14
    move v8, v3

    .line 15
    move v12, v8

    .line 16
    move v14, v12

    .line 17
    move-object v9, v4

    .line 18
    move-object v13, v9

    .line 19
    move-wide v10, v5

    .line 20
    move-wide v15, v10

    .line 21
    move v5, v2

    .line 22
    :goto_0
    if-eqz v5, :cond_0

    .line 23
    .line 24
    invoke-interface {v1, v0}, La/bld;->f(La/ugi0;)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    packed-switch v6, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    invoke-static {v6}, La/itt0;->c(I)V

    .line 32
    .line 33
    .line 34
    return-object v4

    .line 35
    :pswitch_0
    const/4 v6, 0x5

    .line 36
    invoke-interface {v1, v0, v6}, La/bld;->r(La/ugi0;I)J

    .line 37
    .line 38
    .line 39
    move-result-wide v15

    .line 40
    or-int/lit8 v8, v8, 0x20

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :pswitch_1
    const/4 v6, 0x4

    .line 44
    invoke-interface {v1, v0, v6}, La/bld;->j(La/ugi0;I)I

    .line 45
    .line 46
    .line 47
    move-result v14

    .line 48
    or-int/lit8 v8, v8, 0x10

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :pswitch_2
    const/4 v6, 0x3

    .line 52
    invoke-interface {v1, v0, v6}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v13

    .line 56
    or-int/lit8 v8, v8, 0x8

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :pswitch_3
    const/4 v6, 0x2

    .line 60
    invoke-interface {v1, v0, v6}, La/bld;->j(La/ugi0;I)I

    .line 61
    .line 62
    .line 63
    move-result v12

    .line 64
    or-int/lit8 v8, v8, 0x4

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :pswitch_4
    invoke-interface {v1, v0, v2}, La/bld;->r(La/ugi0;I)J

    .line 68
    .line 69
    .line 70
    move-result-wide v10

    .line 71
    or-int/lit8 v8, v8, 0x2

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :pswitch_5
    invoke-interface {v1, v0, v3}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    or-int/lit8 v8, v8, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :pswitch_6
    move v5, v3

    .line 82
    goto :goto_0

    .line 83
    :cond_0
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 84
    .line 85
    .line 86
    new-instance v7, La/iv6;

    .line 87
    .line 88
    invoke-direct/range {v7 .. v16}, La/iv6;-><init>(ILjava/lang/String;JILjava/lang/String;IJ)V

    .line 89
    .line 90
    .line 91
    return-object v7

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch -0x1
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
    sget-object p0, La/gv6;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, La/iv6;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/gv6;->descriptor:La/ugi0;

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
    iget-object v1, p2, La/iv6;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iget-wide v1, p2, La/iv6;->b:J

    .line 20
    .line 21
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    iget v1, p2, La/iv6;->c:I

    .line 26
    .line 27
    invoke-interface {p1, v0, v1, p0}, La/cld;->i(IILa/ugi0;)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x3

    .line 31
    iget-object v1, p2, La/iv6;->d:Ljava/lang/String;

    .line 32
    .line 33
    invoke-interface {p1, p0, v0, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x4

    .line 37
    iget v1, p2, La/iv6;->e:I

    .line 38
    .line 39
    invoke-interface {p1, v0, v1, p0}, La/cld;->i(IILa/ugi0;)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x5

    .line 43
    iget-wide v1, p2, La/iv6;->f:J

    .line 44
    .line 45
    invoke-interface {p1, p0, v0, v1, v2}, La/cld;->n(La/ugi0;IJ)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method
