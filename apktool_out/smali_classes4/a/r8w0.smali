.class public final synthetic La/r8w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/r8w0;

.field public static final b:La/zna0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/r8w0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/r8w0;->a:La/r8w0;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.fingerprint.impl.model.SensorData"

    .line 11
    .line 12
    const/4 v3, 0x6

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "name"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "vendor"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "version"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "power"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "maxRange"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    const-string v0, "resolution"

    .line 43
    .line 44
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    sput-object v1, La/r8w0;->b:La/zna0;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 2

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
    const/4 v1, 0x1

    .line 10
    aput-object v0, p0, v1

    .line 11
    .line 12
    sget-object v0, La/okx;->a:La/okx;

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    aput-object v0, p0, v1

    .line 16
    .line 17
    sget-object v0, La/klq;->a:La/klq;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    aput-object v0, p0, v1

    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    aput-object v0, p0, v1

    .line 24
    .line 25
    const/4 v1, 0x5

    .line 26
    aput-object v0, p0, v1

    .line 27
    .line 28
    return-object p0
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object p0, La/r8w0;->b:La/zna0;

    .line 2
    .line 3
    invoke-interface {p1, p0}, La/rkj;->a(La/ugi0;)La/bld;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    move v5, v1

    .line 12
    move v8, v5

    .line 13
    move-object v6, v2

    .line 14
    move-object v7, v6

    .line 15
    move v9, v3

    .line 16
    move v10, v9

    .line 17
    move v11, v10

    .line 18
    move v3, v0

    .line 19
    :goto_0
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-interface {p1, p0}, La/bld;->f(La/ugi0;)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    packed-switch v4, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    invoke-static {v4}, La/itt0;->c(I)V

    .line 29
    .line 30
    .line 31
    return-object v2

    .line 32
    :pswitch_0
    const/4 v4, 0x5

    .line 33
    invoke-interface {p1, p0, v4}, La/bld;->n(La/ugi0;I)F

    .line 34
    .line 35
    .line 36
    move-result v11

    .line 37
    or-int/lit8 v5, v5, 0x20

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :pswitch_1
    const/4 v4, 0x4

    .line 41
    invoke-interface {p1, p0, v4}, La/bld;->n(La/ugi0;I)F

    .line 42
    .line 43
    .line 44
    move-result v10

    .line 45
    or-int/lit8 v5, v5, 0x10

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :pswitch_2
    const/4 v4, 0x3

    .line 49
    invoke-interface {p1, p0, v4}, La/bld;->n(La/ugi0;I)F

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    or-int/lit8 v5, v5, 0x8

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_3
    const/4 v4, 0x2

    .line 57
    invoke-interface {p1, p0, v4}, La/bld;->j(La/ugi0;I)I

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    or-int/lit8 v5, v5, 0x4

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :pswitch_4
    invoke-interface {p1, p0, v0}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    or-int/lit8 v5, v5, 0x2

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :pswitch_5
    invoke-interface {p1, p0, v1}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    or-int/lit8 v5, v5, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :pswitch_6
    move v3, v1

    .line 79
    goto :goto_0

    .line 80
    :cond_0
    invoke-interface {p1, p0}, La/bld;->c(La/ugi0;)V

    .line 81
    .line 82
    .line 83
    new-instance v4, La/u8w0;

    .line 84
    .line 85
    invoke-direct/range {v4 .. v11}, La/u8w0;-><init>(ILjava/lang/String;Ljava/lang/String;IFFF)V

    .line 86
    .line 87
    .line 88
    return-object v4

    .line 89
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
    sget-object p0, La/r8w0;->b:La/zna0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p2, La/u8w0;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/r8w0;->b:La/zna0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p2, La/u8w0;->a:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-interface {p1, p0, v1, v0}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p2, La/u8w0;->b:Ljava/lang/String;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-interface {p1, p0, v1, v0}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget v0, p2, La/u8w0;->c:I

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    invoke-interface {p1, v1, v0, p0}, La/cld;->i(IILa/ugi0;)V

    .line 28
    .line 29
    .line 30
    iget v0, p2, La/u8w0;->d:F

    .line 31
    .line 32
    const/4 v1, 0x3

    .line 33
    invoke-interface {p1, p0, v1, v0}, La/cld;->o(La/ugi0;IF)V

    .line 34
    .line 35
    .line 36
    iget v0, p2, La/u8w0;->e:F

    .line 37
    .line 38
    const/4 v1, 0x4

    .line 39
    invoke-interface {p1, p0, v1, v0}, La/cld;->o(La/ugi0;IF)V

    .line 40
    .line 41
    .line 42
    iget p2, p2, La/u8w0;->f:F

    .line 43
    .line 44
    const/4 v0, 0x5

    .line 45
    invoke-interface {p1, p0, v0, p2}, La/cld;->o(La/ugi0;IF)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method
