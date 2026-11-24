.class public final La/hnu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/gii0;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, La/tpv;

    const/4 v1, 0x5

    invoke-direct {v0, p1, v1}, La/tpv;-><init>(La/gii0;B)V

    iput-object v0, p0, La/hnu;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/iqp0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, La/hnu;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/khb0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, La/hnu;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/kpd0;)V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, La/xsu;

    invoke-direct {v0, p1}, La/xsu;-><init>(La/kpd0;)V

    iput-object v0, p0, La/hnu;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/n9s;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, La/hnu;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x19

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    new-instance v0, La/nex;

    .line 11
    .line 12
    invoke-direct {v0, p1, p2, p3}, La/nex;-><init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, La/hnu;->a:Ljava/lang/Object;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v0, La/nvu;

    .line 19
    .line 20
    const/4 v1, 0x5

    .line 21
    invoke-direct {v0, p1, p2, p3, v1}, La/nvu;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, La/hnu;->a:Ljava/lang/Object;

    .line 25
    .line 26
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 37
    iput-object p1, p0, La/hnu;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static i(La/hnu;ILa/bnn0;I)Ljava/lang/Object;
    .locals 4

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    const-wide/16 v0, 0x3e8

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    div-long/2addr v2, v0

    .line 12
    long-to-int p1, v2

    .line 13
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    div-long/2addr v2, v0

    .line 18
    long-to-int p3, v2

    .line 19
    iget-object p0, p0, La/hnu;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, La/z220;

    .line 22
    .line 23
    invoke-virtual {p0, p1, p3, p2}, La/z220;->r(IILa/zje;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public static l(La/z35;)La/n45;
    .locals 13

    .line 1
    iget-object v0, p0, La/z35;->a:La/n45;

    .line 2
    .line 3
    iget-object v1, v0, La/n45;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/b1x;

    .line 6
    .line 7
    iget-object v2, v0, La/n45;->e:Landroid/graphics/Rect;

    .line 8
    .line 9
    :try_start_0
    iget p0, p0, La/z35;->b:I

    .line 10
    .line 11
    iget v3, v0, La/n45;->f:I

    .line 12
    .line 13
    invoke-static {v1, v2, p0, v3}, La/m2x;->S(La/b1x;Landroid/graphics/Rect;II)[B

    .line 14
    .line 15
    .line 16
    move-result-object v5
    :try_end_0
    .catch La/l2x; {:try_start_0 .. :try_end_0} :catch_1

    .line 17
    const/4 p0, 0x0

    .line 18
    :try_start_1
    new-instance v1, Ljava/io/ByteArrayInputStream;

    .line 19
    .line 20
    invoke-direct {v1, v5}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 21
    .line 22
    .line 23
    new-instance v6, La/fko;

    .line 24
    .line 25
    new-instance v3, La/sko;

    .line 26
    .line 27
    invoke-direct {v3, v1}, La/sko;-><init>(Ljava/io/InputStream;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {v6, v3}, La/fko;-><init>(La/sko;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 31
    .line 32
    .line 33
    new-instance v8, Landroid/util/Size;

    .line 34
    .line 35
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    invoke-direct {v8, v1, v3}, Landroid/util/Size;-><init>(II)V

    .line 44
    .line 45
    .line 46
    new-instance v9, Landroid/graphics/Rect;

    .line 47
    .line 48
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-direct {v9, p0, p0, v1, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 57
    .line 58
    .line 59
    iget v10, v0, La/n45;->f:I

    .line 60
    .line 61
    iget-object p0, v0, La/n45;->g:Landroid/graphics/Matrix;

    .line 62
    .line 63
    sget-object v1, La/jls0;->a:Landroid/graphics/RectF;

    .line 64
    .line 65
    new-instance v11, Landroid/graphics/Matrix;

    .line 66
    .line 67
    invoke-direct {v11, p0}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 68
    .line 69
    .line 70
    iget p0, v2, Landroid/graphics/Rect;->left:I

    .line 71
    .line 72
    neg-int p0, p0

    .line 73
    int-to-float p0, p0

    .line 74
    iget v1, v2, Landroid/graphics/Rect;->top:I

    .line 75
    .line 76
    neg-int v1, v1

    .line 77
    int-to-float v1, v1

    .line 78
    invoke-virtual {v11, p0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 79
    .line 80
    .line 81
    iget-object v12, v0, La/n45;->h:La/cy9;

    .line 82
    .line 83
    new-instance v4, La/n45;

    .line 84
    .line 85
    const/16 v7, 0x100

    .line 86
    .line 87
    invoke-direct/range {v4 .. v12}, La/n45;-><init>(Ljava/lang/Object;La/fko;ILandroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;La/cy9;)V

    .line 88
    .line 89
    .line 90
    return-object v4

    .line 91
    :catch_0
    move-exception v0

    .line 92
    new-instance v1, La/ozw;

    .line 93
    .line 94
    const-string v2, "Failed to extract Exif from YUV-generated JPEG"

    .line 95
    .line 96
    invoke-direct {v1, p0, v2, v0}, La/ozw;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    throw v1

    .line 100
    :catch_1
    move-exception v0

    .line 101
    move-object p0, v0

    .line 102
    new-instance v0, La/ozw;

    .line 103
    .line 104
    const/4 v1, 0x1

    .line 105
    const-string v2, "Failed to encode the image to JPEG."

    .line 106
    .line 107
    invoke-direct {v0, v1, v2, p0}, La/ozw;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    throw v0
.end method


# virtual methods
.method public a(La/sip;La/jo20;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, La/hnu;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/tpv;

    .line 4
    .line 5
    instance-of v1, p3, La/cew;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p3

    .line 10
    check-cast v1, La/cew;

    .line 11
    .line 12
    iget v2, v1, La/cew;->k:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, La/cew;->k:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, La/cew;

    .line 25
    .line 26
    invoke-direct {v1, p0, p3}, La/cew;-><init>(La/hnu;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p0, v1, La/cew;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object p3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v2, v1, La/cew;->k:I

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x2

    .line 37
    const/4 v5, 0x1

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v5, :cond_2

    .line 41
    .line 42
    if-ne v2, v4, :cond_1

    .line 43
    .line 44
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v3

    .line 54
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_6

    .line 66
    .line 67
    if-ne p0, v5, :cond_5

    .line 68
    .line 69
    invoke-virtual {v0}, La/tpv;->invoke()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, La/aqr;

    .line 74
    .line 75
    iput v5, v1, La/cew;->k:I

    .line 76
    .line 77
    invoke-interface {p0, p2, v1}, La/aqr;->d(Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-ne p0, p3, :cond_4

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    :goto_1
    check-cast p0, La/dx5;

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 88
    .line 89
    .line 90
    return-object v3

    .line 91
    :cond_6
    invoke-virtual {v0}, La/tpv;->invoke()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, La/aqr;

    .line 96
    .line 97
    iput v4, v1, La/cew;->k:I

    .line 98
    .line 99
    invoke-interface {p0, p2, v1}, La/aqr;->e(Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    if-ne p0, p3, :cond_7

    .line 104
    .line 105
    :goto_2
    return-object p3

    .line 106
    :cond_7
    :goto_3
    check-cast p0, La/dx5;

    .line 107
    .line 108
    :goto_4
    invoke-virtual {p0}, La/dx5;->a()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0
.end method

.method public b()I
    .locals 0

    .line 1
    iget-object p0, p0, La/hnu;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/uyn;

    .line 4
    .line 5
    iget-object p0, p0, La/uyn;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/my60;

    .line 8
    .line 9
    iget p0, p0, La/my60;->c:I

    .line 10
    .line 11
    return p0
.end method

.method public c(ILa/zje;)Ljava/io/Serializable;
    .locals 4

    .line 1
    instance-of v0, p2, La/evu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/evu;

    .line 7
    .line 8
    iget v1, v0, La/evu;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/evu;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/evu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/evu;-><init>(La/hnu;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/evu;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/evu;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/hnu;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/cyu;

    .line 53
    .line 54
    new-instance p2, Ljava/lang/Integer;

    .line 55
    .line 56
    invoke-direct {p2, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 57
    .line 58
    .line 59
    iput v3, v0, La/evu;->k:I

    .line 60
    .line 61
    invoke-virtual {p0, p2, v0}, La/cyu;->p(Ljava/lang/Integer;La/zje;)Ljava/io/Serializable;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    if-ne p2, v1, :cond_3

    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Iterable;

    .line 69
    .line 70
    new-instance p0, Ljava/util/ArrayList;

    .line 71
    .line 72
    const/16 p1, 0xa

    .line 73
    .line 74
    invoke-static {p2, p1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-eqz p2, :cond_4

    .line 90
    .line 91
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    check-cast p2, La/xde0;

    .line 96
    .line 97
    new-instance v0, La/yeh0;

    .line 98
    .line 99
    iget-wide v1, p2, La/xde0;->a:J

    .line 100
    .line 101
    iget-object v3, p2, La/xde0;->c:Ljava/lang/String;

    .line 102
    .line 103
    iget-object p2, p2, La/xde0;->d:Ljava/lang/String;

    .line 104
    .line 105
    invoke-direct {v0, v1, v2, v3, p2}, La/yeh0;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_4
    return-object p0
.end method

.method public d(La/zje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v2, v0, La/l4v;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/l4v;

    .line 11
    .line 12
    iget v3, v2, La/l4v;->q:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/l4v;->q:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/l4v;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/l4v;-><init>(La/hnu;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/l4v;->o:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/l4v;->q:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v9, 0x1

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    if-eq v4, v9, :cond_3

    .line 41
    .line 42
    if-eq v4, v6, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    iget v4, v2, La/l4v;->m:I

    .line 47
    .line 48
    iget v10, v2, La/l4v;->l:I

    .line 49
    .line 50
    iget v11, v2, La/l4v;->k:I

    .line 51
    .line 52
    iget-wide v12, v2, La/l4v;->j:J

    .line 53
    .line 54
    iget-wide v14, v2, La/l4v;->i:J

    .line 55
    .line 56
    const/16 p1, 0x0

    .line 57
    .line 58
    iget-object v7, v2, La/l4v;->n:Ljava/lang/Throwable;

    .line 59
    .line 60
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move v0, v4

    .line 64
    move v4, v10

    .line 65
    move-wide/from16 v16, v14

    .line 66
    .line 67
    move-object v14, v7

    .line 68
    move v7, v11

    .line 69
    move-wide v10, v12

    .line 70
    move-wide/from16 v12, v16

    .line 71
    .line 72
    goto/16 :goto_5

    .line 73
    .line 74
    :cond_1
    const/16 p1, 0x0

    .line 75
    .line 76
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 77
    .line 78
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-object p1

    .line 82
    :cond_2
    const/16 p1, 0x0

    .line 83
    .line 84
    iget v4, v2, La/l4v;->m:I

    .line 85
    .line 86
    iget v7, v2, La/l4v;->l:I

    .line 87
    .line 88
    iget v10, v2, La/l4v;->k:I

    .line 89
    .line 90
    iget-wide v11, v2, La/l4v;->j:J

    .line 91
    .line 92
    iget-wide v13, v2, La/l4v;->i:J

    .line 93
    .line 94
    iget-object v15, v2, La/l4v;->n:Ljava/lang/Throwable;

    .line 95
    .line 96
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    move v0, v4

    .line 100
    move v4, v7

    .line 101
    move v7, v10

    .line 102
    move-wide v10, v11

    .line 103
    move-wide v12, v13

    .line 104
    move-object v14, v15

    .line 105
    goto/16 :goto_5

    .line 106
    .line 107
    :cond_3
    const/16 p1, 0x0

    .line 108
    .line 109
    iget v4, v2, La/l4v;->l:I

    .line 110
    .line 111
    iget v7, v2, La/l4v;->k:I

    .line 112
    .line 113
    iget-wide v10, v2, La/l4v;->j:J

    .line 114
    .line 115
    iget-wide v12, v2, La/l4v;->i:J

    .line 116
    .line 117
    iget-object v14, v2, La/l4v;->n:Ljava/lang/Throwable;

    .line 118
    .line 119
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :catchall_0
    move-exception v0

    .line 124
    goto :goto_3

    .line 125
    :cond_4
    const/16 p1, 0x0

    .line 126
    .line 127
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    sget-wide v10, La/cag0;->a:J

    .line 131
    .line 132
    const-wide/16 v12, 0x3

    .line 133
    .line 134
    move-object/from16 v14, p1

    .line 135
    .line 136
    move v0, v9

    .line 137
    const/4 v4, 0x0

    .line 138
    const/4 v7, 0x0

    .line 139
    :goto_1
    if-eqz v0, :cond_e

    .line 140
    .line 141
    :try_start_1
    iget-object v15, v1, La/hnu;->a:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v15, La/mii0;

    .line 144
    .line 145
    iput-object v14, v2, La/l4v;->n:Ljava/lang/Throwable;

    .line 146
    .line 147
    iput-wide v12, v2, La/l4v;->i:J

    .line 148
    .line 149
    iput-wide v10, v2, La/l4v;->j:J

    .line 150
    .line 151
    iput v7, v2, La/l4v;->k:I

    .line 152
    .line 153
    iput v4, v2, La/l4v;->l:I

    .line 154
    .line 155
    iput v0, v2, La/l4v;->m:I

    .line 156
    .line 157
    iput v9, v2, La/l4v;->q:I

    .line 158
    .line 159
    invoke-virtual {v15, v2}, La/mii0;->x(La/zje;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    if-ne v0, v3, :cond_5

    .line 164
    .line 165
    goto :goto_8

    .line 166
    :cond_5
    :goto_2
    check-cast v0, La/sqt0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 167
    .line 168
    return-object v0

    .line 169
    :goto_3
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 170
    .line 171
    .line 172
    move-result v15

    .line 173
    if-eqz v15, :cond_a

    .line 174
    .line 175
    if-nez v7, :cond_6

    .line 176
    .line 177
    new-instance v14, La/el50;

    .line 178
    .line 179
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 180
    .line 181
    .line 182
    const/4 v0, 0x0

    .line 183
    goto :goto_1

    .line 184
    :cond_6
    int-to-long v8, v4

    .line 185
    cmp-long v8, v8, v12

    .line 186
    .line 187
    if-gez v8, :cond_7

    .line 188
    .line 189
    const/4 v8, 0x1

    .line 190
    goto :goto_4

    .line 191
    :cond_7
    const/4 v8, 0x0

    .line 192
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 193
    .line 194
    if-eqz v8, :cond_8

    .line 195
    .line 196
    iput-object v14, v2, La/l4v;->n:Ljava/lang/Throwable;

    .line 197
    .line 198
    iput-wide v12, v2, La/l4v;->i:J

    .line 199
    .line 200
    iput-wide v10, v2, La/l4v;->j:J

    .line 201
    .line 202
    iput v7, v2, La/l4v;->k:I

    .line 203
    .line 204
    iput v4, v2, La/l4v;->l:I

    .line 205
    .line 206
    iput v8, v2, La/l4v;->m:I

    .line 207
    .line 208
    iput v6, v2, La/l4v;->q:I

    .line 209
    .line 210
    invoke-static {v10, v11, v2}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    if-ne v0, v3, :cond_9

    .line 215
    .line 216
    goto :goto_8

    .line 217
    :goto_5
    const/4 v9, 0x1

    .line 218
    goto :goto_1

    .line 219
    :cond_8
    new-instance v14, La/el50;

    .line 220
    .line 221
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 222
    .line 223
    .line 224
    :cond_9
    :goto_6
    move v0, v8

    .line 225
    goto :goto_5

    .line 226
    :cond_a
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 227
    .line 228
    .line 229
    move-result v8

    .line 230
    if-eqz v8, :cond_d

    .line 231
    .line 232
    int-to-long v8, v4

    .line 233
    cmp-long v8, v8, v12

    .line 234
    .line 235
    if-gez v8, :cond_b

    .line 236
    .line 237
    const/4 v8, 0x1

    .line 238
    goto :goto_7

    .line 239
    :cond_b
    const/4 v8, 0x0

    .line 240
    :goto_7
    add-int/lit8 v4, v4, 0x1

    .line 241
    .line 242
    if-eqz v8, :cond_c

    .line 243
    .line 244
    iput-object v14, v2, La/l4v;->n:Ljava/lang/Throwable;

    .line 245
    .line 246
    iput-wide v12, v2, La/l4v;->i:J

    .line 247
    .line 248
    iput-wide v10, v2, La/l4v;->j:J

    .line 249
    .line 250
    iput v7, v2, La/l4v;->k:I

    .line 251
    .line 252
    iput v4, v2, La/l4v;->l:I

    .line 253
    .line 254
    iput v8, v2, La/l4v;->m:I

    .line 255
    .line 256
    iput v5, v2, La/l4v;->q:I

    .line 257
    .line 258
    invoke-static {v10, v11, v2}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    if-ne v0, v3, :cond_9

    .line 263
    .line 264
    :goto_8
    return-object v3

    .line 265
    :cond_c
    new-instance v14, La/dag0;

    .line 266
    .line 267
    invoke-direct {v14, v0}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 268
    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_d
    invoke-static {v0}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 272
    .line 273
    .line 274
    move-object v14, v0

    .line 275
    const/4 v0, 0x0

    .line 276
    goto :goto_5

    .line 277
    :cond_e
    if-nez v14, :cond_f

    .line 278
    .line 279
    const-string v0, "Unexpected error"

    .line 280
    .line 281
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    return-object p1

    .line 285
    :cond_f
    throw v14
.end method

.method public e(Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, La/kyu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/kyu;

    .line 7
    .line 8
    iget v1, v0, La/kyu;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/kyu;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/kyu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/kyu;-><init>(La/hnu;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/kyu;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/kyu;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/hnu;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/z220;

    .line 53
    .line 54
    iput v4, v0, La/kyu;->k:I

    .line 55
    .line 56
    iget-object p2, p0, La/z220;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p2, La/mne;

    .line 59
    .line 60
    iget-object p2, p2, La/mne;->b:La/dvj;

    .line 61
    .line 62
    new-instance v2, La/oed;

    .line 63
    .line 64
    const/16 v4, 0x19

    .line 65
    .line 66
    invoke-direct {v2, p0, p1, v3, v4}, La/oed;-><init>(Ljava/lang/Object;Ljava/lang/String;La/yje;B)V

    .line 67
    .line 68
    .line 69
    invoke-static {p2, v2, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    if-ne p2, v1, :cond_3

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_3
    :goto_1
    check-cast p2, La/ahp0;

    .line 77
    .line 78
    iget-object p0, p2, La/ahp0;->c:Ljava/util/List;

    .line 79
    .line 80
    new-instance p1, La/vvt;

    .line 81
    .line 82
    const/16 v0, 0x1b

    .line 83
    .line 84
    invoke-direct {p1, v0}, La/vvt;-><init>(B)V

    .line 85
    .line 86
    .line 87
    invoke-static {p0, p1}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    iget p1, p2, La/ahp0;->a:I

    .line 92
    .line 93
    iget p2, p2, La/ahp0;->b:I

    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    new-instance v0, La/ahp0;

    .line 99
    .line 100
    invoke-direct {v0, p1, p2, p0}, La/ahp0;-><init>(IILjava/util/List;)V

    .line 101
    .line 102
    .line 103
    return-object v0
.end method

.method public f(ZLa/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, La/jzu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/jzu;

    .line 7
    .line 8
    iget v1, v0, La/jzu;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/jzu;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/jzu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/jzu;-><init>(La/hnu;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/jzu;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/jzu;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/hnu;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/w5z;

    .line 53
    .line 54
    invoke-virtual {p0, p1}, La/w5z;->t(Z)La/p6d;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    iput v3, v0, La/jzu;->k:I

    .line 59
    .line 60
    invoke-static {p0, v0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    if-ne p2, v1, :cond_3

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    :goto_1
    check-cast p2, Ljava/util/List;

    .line 68
    .line 69
    if-nez p2, :cond_4

    .line 70
    .line 71
    sget-object p0, La/iun;->a:La/iun;

    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_4
    return-object p2
.end method

.method public g(Ljava/util/List;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/hnu;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/nvu;

    .line 7
    .line 8
    iget-object p0, p0, La/nvu;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/g8n0;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance p0, La/mjf0;

    .line 16
    .line 17
    const/16 v0, 0x16

    .line 18
    .line 19
    invoke-direct {p0, v0}, La/mjf0;-><init>(B)V

    .line 20
    .line 21
    .line 22
    new-instance v0, La/mto;

    .line 23
    .line 24
    const/16 v1, 0xa

    .line 25
    .line 26
    invoke-direct {v0, p0, v1}, La/mto;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public h(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;La/f8w;Z)Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, La/hnu;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/dpi0;

    .line 10
    .line 11
    iget-object p0, p0, La/dpi0;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, La/j77;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_2

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    if-ne p2, v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, La/j77;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Ljava/util/List;

    .line 34
    .line 35
    if-nez p0, :cond_0

    .line 36
    .line 37
    invoke-static {p1, p3}, La/j77;->a(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;Z)Ljava/util/ArrayList;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    :cond_0
    return-object p0

    .line 42
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/j77;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Ljava/util/List;

    .line 57
    .line 58
    if-nez p0, :cond_3

    .line 59
    .line 60
    invoke-static {p1, p3}, La/j77;->a(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;Z)Ljava/util/ArrayList;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    :cond_3
    return-object p0
.end method

.method public j(Ljava/lang/Long;La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, La/rvu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/rvu;

    .line 7
    .line 8
    iget v1, v0, La/rvu;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/rvu;->k:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/rvu;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, La/rvu;-><init>(La/hnu;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v6, La/rvu;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v6, La/rvu;->k:I

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    if-ne v1, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    check-cast p2, La/j0g0;

    .line 43
    .line 44
    iget-object p0, p2, La/j0g0;->a:Ljava/lang/Object;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v2

    .line 53
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    if-eqz p1, :cond_5

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 59
    .line 60
    .line 61
    move-result-wide v4

    .line 62
    const-wide/16 v7, 0x0

    .line 63
    .line 64
    cmp-long p2, v4, v7

    .line 65
    .line 66
    if-gtz p2, :cond_3

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    iget-object p0, p0, La/hnu;->a:Ljava/lang/Object;

    .line 70
    .line 71
    move-object v1, p0

    .line 72
    check-cast v1, La/ouu;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 75
    .line 76
    .line 77
    move-result-wide p0

    .line 78
    iput v3, v6, La/rvu;->k:I

    .line 79
    .line 80
    const-wide/16 v4, 0xbd

    .line 81
    .line 82
    move-wide v2, p0

    .line 83
    invoke-virtual/range {v1 .. v6}, La/ouu;->w(JJLa/zje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    if-ne p0, v0, :cond_4

    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_4
    return-object p0

    .line 91
    :cond_5
    :goto_2
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 92
    .line 93
    new-instance p0, La/ff5;

    .line 94
    .line 95
    invoke-direct {p0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    new-instance p1, La/g0g0;

    .line 99
    .line 100
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    return-object p1
.end method

.method public k(La/z35;I)La/n45;
    .locals 10

    .line 1
    iget-object p1, p1, La/z35;->a:La/n45;

    .line 2
    .line 3
    iget-object p0, p0, La/hnu;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/xsu;

    .line 6
    .line 7
    iget-object v0, p1, La/n45;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/b1x;

    .line 10
    .line 11
    iget-object p0, p0, La/xsu;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Landroidx/camera/core/internal/compat/quirk/IncorrectJpegMetadataQuirk;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, La/b1x;->l0()[La/wsf0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    aget-object p0, p0, v1

    .line 23
    .line 24
    invoke-virtual {p0}, La/wsf0;->i()Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/nio/Buffer;->capacity()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    new-array v0, v0, [B

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    .line 40
    :goto_0
    move-object v2, v0

    .line 41
    goto :goto_5

    .line 42
    :cond_0
    invoke-interface {v0}, La/b1x;->l0()[La/wsf0;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    aget-object p0, p0, v1

    .line 47
    .line 48
    invoke-virtual {p0}, La/wsf0;->i()Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0}, Ljava/nio/Buffer;->capacity()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    new-array v2, v0, [B

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 62
    .line 63
    .line 64
    const/4 v3, 0x2

    .line 65
    move v4, v3

    .line 66
    :goto_1
    add-int/lit8 v5, v4, 0x4

    .line 67
    .line 68
    const/4 v6, -0x1

    .line 69
    if-gt v5, v0, :cond_3

    .line 70
    .line 71
    aget-byte v5, v2, v4

    .line 72
    .line 73
    if-eq v5, v6, :cond_1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_1
    if-ne v5, v6, :cond_2

    .line 77
    .line 78
    add-int/lit8 v5, v4, 0x1

    .line 79
    .line 80
    aget-byte v5, v2, v5

    .line 81
    .line 82
    const/16 v6, -0x26

    .line 83
    .line 84
    if-ne v5, v6, :cond_2

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_2
    add-int/lit8 v5, v4, 0x2

    .line 88
    .line 89
    aget-byte v5, v2, v5

    .line 90
    .line 91
    and-int/lit16 v5, v5, 0xff

    .line 92
    .line 93
    shl-int/lit8 v5, v5, 0x8

    .line 94
    .line 95
    add-int/lit8 v6, v4, 0x3

    .line 96
    .line 97
    aget-byte v6, v2, v6

    .line 98
    .line 99
    and-int/lit16 v6, v6, 0xff

    .line 100
    .line 101
    or-int/2addr v5, v6

    .line 102
    add-int/2addr v5, v3

    .line 103
    add-int/2addr v4, v5

    .line 104
    goto :goto_1

    .line 105
    :cond_3
    :goto_2
    add-int/lit8 v1, v3, 0x1

    .line 106
    .line 107
    if-le v1, v0, :cond_4

    .line 108
    .line 109
    move v1, v6

    .line 110
    goto :goto_3

    .line 111
    :cond_4
    aget-byte v4, v2, v3

    .line 112
    .line 113
    if-ne v4, v6, :cond_6

    .line 114
    .line 115
    aget-byte v4, v2, v1

    .line 116
    .line 117
    const/16 v5, -0x28

    .line 118
    .line 119
    if-ne v4, v5, :cond_6

    .line 120
    .line 121
    move v1, v3

    .line 122
    :goto_3
    if-eq v1, v6, :cond_5

    .line 123
    .line 124
    :goto_4
    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    invoke-static {v2, v1, p0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    goto :goto_0

    .line 133
    :cond_5
    :goto_5
    iget-object v3, p1, La/n45;->b:La/fko;

    .line 134
    .line 135
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    iget-object v5, p1, La/n45;->d:Landroid/util/Size;

    .line 139
    .line 140
    iget-object v6, p1, La/n45;->e:Landroid/graphics/Rect;

    .line 141
    .line 142
    iget v7, p1, La/n45;->f:I

    .line 143
    .line 144
    iget-object v8, p1, La/n45;->g:Landroid/graphics/Matrix;

    .line 145
    .line 146
    iget-object v9, p1, La/n45;->h:La/cy9;

    .line 147
    .line 148
    new-instance v1, La/n45;

    .line 149
    .line 150
    move v4, p2

    .line 151
    invoke-direct/range {v1 .. v9}, La/n45;-><init>(Ljava/lang/Object;La/fko;ILandroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;La/cy9;)V

    .line 152
    .line 153
    .line 154
    return-object v1

    .line 155
    :cond_6
    move v4, p2

    .line 156
    move v3, v1

    .line 157
    move p2, v4

    .line 158
    goto :goto_2
.end method
