.class public final La/h930;
.super La/bmq0;
.source "SourceFile"


# instance fields
.field public final b:Landroidx/media3/common/MediaItem;


# direct methods
.method public constructor <init>(Landroidx/media3/common/MediaItem;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/h930;->b:Landroidx/media3/common/MediaItem;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;
    .locals 18

    .line 1
    sget-object v0, Landroidx/media3/common/Timeline$Window;->p:Ljava/lang/Object;

    .line 2
    .line 3
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const-wide/16 v16, 0x0

    .line 9
    .line 10
    move-object/from16 v0, p0

    .line 11
    .line 12
    iget-object v1, v0, La/h930;->b:Landroidx/media3/common/MediaItem;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    const/4 v9, 0x0

    .line 31
    const/4 v10, 0x1

    .line 32
    const/4 v11, 0x0

    .line 33
    const-wide/16 v12, 0x0

    .line 34
    .line 35
    move-object/from16 v0, p2

    .line 36
    .line 37
    invoke-virtual/range {v0 .. v17}, Landroidx/media3/common/Timeline$Window;->b(Landroidx/media3/common/MediaItem;Ljava/lang/Object;JJJZZLa/dn30;JJJ)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    iput-boolean v1, v0, Landroidx/media3/common/Timeline$Window;->j:Z

    .line 42
    .line 43
    return-object v0
.end method
