.class public final Landroidx/media3/common/MediaItem;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/en30;

.field public final c:La/dn30;

.field public final d:La/jn30;

.field public final e:La/bn30;

.field public final f:La/fn30;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/mtc;

    .line 2
    .line 3
    invoke-direct {v0}, La/mtc;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/xuz;

    .line 7
    .line 8
    const/16 v2, 0xf

    .line 9
    .line 10
    invoke-direct {v1, v2}, La/xuz;-><init>(B)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 14
    .line 15
    sget-object v1, La/b4x;->b:La/v3x;

    .line 16
    .line 17
    sget-object v1, La/rcf0;->e:La/rcf0;

    .line 18
    .line 19
    new-instance v1, La/cn30;

    .line 20
    .line 21
    invoke-direct {v1}, La/cn30;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/fn30;->a:La/fn30;

    .line 25
    .line 26
    new-instance v2, La/bn30;

    .line 27
    .line 28
    invoke-direct {v2, v0}, La/an30;-><init>(La/mtc;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, La/dn30;

    .line 32
    .line 33
    invoke-direct {v0, v1}, La/dn30;-><init>(La/cn30;)V

    .line 34
    .line 35
    .line 36
    sget-object v0, La/jn30;->C:La/jn30;

    .line 37
    .line 38
    const/4 v0, 0x3

    .line 39
    const/4 v1, 0x4

    .line 40
    const/4 v2, 0x0

    .line 41
    const/4 v3, 0x1

    .line 42
    const/4 v4, 0x2

    .line 43
    invoke-static {v2, v3, v4, v0, v1}, La/hne;->s(IIIII)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x5

    .line 47
    invoke-static {v0}, La/vtt0;->H(I)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;La/bn30;La/en30;La/dn30;La/jn30;La/fn30;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/common/MediaItem;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, Landroidx/media3/common/MediaItem;->b:La/en30;

    .line 7
    .line 8
    iput-object p4, p0, Landroidx/media3/common/MediaItem;->c:La/dn30;

    .line 9
    .line 10
    iput-object p5, p0, Landroidx/media3/common/MediaItem;->d:La/jn30;

    .line 11
    .line 12
    iput-object p2, p0, Landroidx/media3/common/MediaItem;->e:La/bn30;

    .line 13
    .line 14
    iput-object p6, p0, Landroidx/media3/common/MediaItem;->f:La/fn30;

    .line 15
    .line 16
    return-void
.end method

.method public static a(Ljava/lang/String;)Landroidx/media3/common/MediaItem;
    .locals 16

    .line 1
    new-instance v0, La/mtc;

    .line 2
    .line 3
    invoke-direct {v0}, La/mtc;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/xuz;

    .line 7
    .line 8
    const/16 v2, 0xf

    .line 9
    .line 10
    invoke-direct {v1, v2}, La/xuz;-><init>(B)V

    .line 11
    .line 12
    .line 13
    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 14
    .line 15
    sget-object v1, La/b4x;->b:La/v3x;

    .line 16
    .line 17
    sget-object v8, La/rcf0;->e:La/rcf0;

    .line 18
    .line 19
    new-instance v1, La/cn30;

    .line 20
    .line 21
    invoke-direct {v1}, La/cn30;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object v15, La/fn30;->a:La/fn30;

    .line 25
    .line 26
    if-nez p0, :cond_0

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    :goto_0
    move-object v4, v2

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    invoke-static/range {p0 .. p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    goto :goto_0

    .line 36
    :goto_1
    const/4 v6, 0x0

    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    new-instance v3, La/en30;

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    invoke-direct/range {v3 .. v10}, La/en30;-><init>(Landroid/net/Uri;Ljava/lang/String;La/d9x;Ljava/util/List;La/b4x;J)V

    .line 48
    .line 49
    .line 50
    move-object v12, v3

    .line 51
    goto :goto_2

    .line 52
    :cond_1
    move-object v12, v6

    .line 53
    :goto_2
    new-instance v9, Landroidx/media3/common/MediaItem;

    .line 54
    .line 55
    new-instance v11, La/bn30;

    .line 56
    .line 57
    invoke-direct {v11, v0}, La/an30;-><init>(La/mtc;)V

    .line 58
    .line 59
    .line 60
    new-instance v13, La/dn30;

    .line 61
    .line 62
    invoke-direct {v13, v1}, La/dn30;-><init>(La/cn30;)V

    .line 63
    .line 64
    .line 65
    sget-object v14, La/jn30;->C:La/jn30;

    .line 66
    .line 67
    const-string v10, ""

    .line 68
    .line 69
    invoke-direct/range {v9 .. v15}, Landroidx/media3/common/MediaItem;-><init>(Ljava/lang/String;La/bn30;La/en30;La/dn30;La/jn30;La/fn30;)V

    .line 70
    .line 71
    .line 72
    return-object v9
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Landroidx/media3/common/MediaItem;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Landroidx/media3/common/MediaItem;

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/common/MediaItem;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, Landroidx/media3/common/MediaItem;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/media3/common/MediaItem;->e:La/bn30;

    .line 22
    .line 23
    iget-object v1, p1, Landroidx/media3/common/MediaItem;->e:La/bn30;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, La/an30;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget-object v0, p0, Landroidx/media3/common/MediaItem;->b:La/en30;

    .line 32
    .line 33
    iget-object v1, p1, Landroidx/media3/common/MediaItem;->b:La/en30;

    .line 34
    .line 35
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, Landroidx/media3/common/MediaItem;->c:La/dn30;

    .line 42
    .line 43
    iget-object v1, p1, Landroidx/media3/common/MediaItem;->c:La/dn30;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, La/dn30;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    iget-object v0, p0, Landroidx/media3/common/MediaItem;->d:La/jn30;

    .line 52
    .line 53
    iget-object v1, p1, Landroidx/media3/common/MediaItem;->d:La/jn30;

    .line 54
    .line 55
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    iget-object p0, p0, Landroidx/media3/common/MediaItem;->f:La/fn30;

    .line 62
    .line 63
    iget-object p1, p1, Landroidx/media3/common/MediaItem;->f:La/fn30;

    .line 64
    .line 65
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-eqz p0, :cond_2

    .line 70
    .line 71
    :goto_0
    const/4 p0, 0x1

    .line 72
    return p0

    .line 73
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 74
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/common/MediaItem;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/media3/common/MediaItem;->b:La/en30;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, La/en30;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    add-int/2addr v0, v1

    .line 20
    mul-int/lit8 v0, v0, 0x1f

    .line 21
    .line 22
    iget-object v1, p0, Landroidx/media3/common/MediaItem;->c:La/dn30;

    .line 23
    .line 24
    invoke-virtual {v1}, La/dn30;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    add-int/2addr v1, v0

    .line 29
    mul-int/lit8 v1, v1, 0x1f

    .line 30
    .line 31
    iget-object v0, p0, Landroidx/media3/common/MediaItem;->e:La/bn30;

    .line 32
    .line 33
    invoke-virtual {v0}, La/an30;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v0, v1

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget-object v1, p0, Landroidx/media3/common/MediaItem;->d:La/jn30;

    .line 41
    .line 42
    invoke-virtual {v1}, La/jn30;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/2addr v1, v0

    .line 47
    mul-int/lit8 v1, v1, 0x1f

    .line 48
    .line 49
    iget-object p0, p0, Landroidx/media3/common/MediaItem;->f:La/fn30;

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    return v1
.end method
