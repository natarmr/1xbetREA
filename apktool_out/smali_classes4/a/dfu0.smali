.class public final La/dfu0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/util/List;


# instance fields
.field public a:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    sget-object v0, La/wen;->b:La/uen;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, La/wen;

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    invoke-direct {v1, v2, v3}, La/wen;-><init>(J)V

    .line 11
    .line 12
    .line 13
    sget-object v0, La/bfn;->e:La/bfn;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-static {v2, v0}, La/ibc;->v0(ILa/bfn;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    move-wide v3, v2

    .line 21
    new-instance v2, La/wen;

    .line 22
    .line 23
    invoke-direct {v2, v3, v4}, La/wen;-><init>(J)V

    .line 24
    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    invoke-static {v3, v0}, La/ibc;->v0(ILa/bfn;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    move-wide v4, v3

    .line 32
    new-instance v3, La/wen;

    .line 33
    .line 34
    invoke-direct {v3, v4, v5}, La/wen;-><init>(J)V

    .line 35
    .line 36
    .line 37
    const/4 v4, 0x4

    .line 38
    invoke-static {v4, v0}, La/ibc;->v0(ILa/bfn;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v4

    .line 42
    move-wide v5, v4

    .line 43
    new-instance v4, La/wen;

    .line 44
    .line 45
    invoke-direct {v4, v5, v6}, La/wen;-><init>(J)V

    .line 46
    .line 47
    .line 48
    const/16 v5, 0x8

    .line 49
    .line 50
    invoke-static {v5, v0}, La/ibc;->v0(ILa/bfn;)J

    .line 51
    .line 52
    .line 53
    move-result-wide v5

    .line 54
    move-wide v6, v5

    .line 55
    new-instance v5, La/wen;

    .line 56
    .line 57
    invoke-direct {v5, v6, v7}, La/wen;-><init>(J)V

    .line 58
    .line 59
    .line 60
    const/16 v6, 0xf

    .line 61
    .line 62
    invoke-static {v6, v0}, La/ibc;->v0(ILa/bfn;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v6

    .line 66
    move-wide v7, v6

    .line 67
    new-instance v6, La/wen;

    .line 68
    .line 69
    invoke-direct {v6, v7, v8}, La/wen;-><init>(J)V

    .line 70
    .line 71
    .line 72
    filled-new-array/range {v1 .. v6}, [La/wen;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    sput-object v0, La/dfu0;->b:Ljava/util/List;

    .line 81
    .line 82
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 3

    .line 1
    iget v0, p0, La/dfu0;->a:I

    .line 2
    .line 3
    sget-object v1, La/dfu0;->b:Ljava/util/List;

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v0, v2, :cond_0

    .line 12
    .line 13
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, La/wen;

    .line 23
    .line 24
    iget-wide v1, v0, La/wen;->a:J

    .line 25
    .line 26
    :goto_0
    check-cast v0, La/wen;

    .line 27
    .line 28
    iget-wide v0, v0, La/wen;->a:J

    .line 29
    .line 30
    iget v2, p0, La/dfu0;->a:I

    .line 31
    .line 32
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    iput v2, p0, La/dfu0;->a:I

    .line 35
    .line 36
    return-wide v0
.end method
