.class public final La/fti;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/mne;

.field public final b:Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectTimeRangeScreenParams;

.field public final c:La/n5d0;


# direct methods
.method public constructor <init>(Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectTimeRangeScreenParams;La/mne;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/fti;->a:La/mne;

    .line 5
    .line 6
    iput-object p1, p0, La/fti;->b:Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectTimeRangeScreenParams;

    .line 7
    .line 8
    new-instance p1, La/fri;

    .line 9
    .line 10
    const/16 p2, 0x18

    .line 11
    .line 12
    invoke-direct {p1, p0, p2}, La/fri;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, La/fti;->c:La/n5d0;

    .line 20
    .line 21
    return-void
.end method
