.class public final La/dti;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;

.field public final b:La/cad;

.field public final c:La/ctf0;

.field public final d:La/n5d0;


# direct methods
.method public constructor <init>(La/cad;Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;La/ctf0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/dti;->a:Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;

    .line 5
    .line 6
    iput-object p1, p0, La/dti;->b:La/cad;

    .line 7
    .line 8
    iput-object p3, p0, La/dti;->c:La/ctf0;

    .line 9
    .line 10
    new-instance p1, La/msi;

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    const/4 p3, 0x1

    .line 14
    invoke-direct {p1, p0, p2, p3}, La/msi;-><init>(Ljava/lang/Object;IB)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, La/dti;->d:La/n5d0;

    .line 22
    .line 23
    new-instance p1, La/msi;

    .line 24
    .line 25
    invoke-direct {p1, p0, p3, p3}, La/msi;-><init>(Ljava/lang/Object;IB)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 29
    .line 30
    .line 31
    return-void
.end method
