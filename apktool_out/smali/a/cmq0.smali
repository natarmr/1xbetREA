.class public final La/cmq0;
.super La/pwq;
.source "SourceFile"


# instance fields
.field public final c:Landroidx/media3/common/MediaItem;


# direct methods
.method public constructor <init>(La/bmq0;Landroidx/media3/common/MediaItem;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, La/pwq;-><init>(La/bmq0;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/cmq0;->c:Landroidx/media3/common/MediaItem;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, La/pwq;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/cmq0;->c:Landroidx/media3/common/MediaItem;

    .line 5
    .line 6
    iput-object p0, p2, Landroidx/media3/common/Timeline$Window;->b:Landroidx/media3/common/MediaItem;

    .line 7
    .line 8
    iget-object p0, p0, Landroidx/media3/common/MediaItem;->b:La/en30;

    .line 9
    .line 10
    return-object p2
.end method
