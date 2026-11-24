.class public final La/nvi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/rti;


# direct methods
.method public constructor <init>(La/rti;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/nvi;->a:La/rti;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 9

    .line 1
    new-instance v0, La/qon0;

    .line 2
    .line 3
    iget-object p0, p0, La/nvi;->a:La/rti;

    .line 4
    .line 5
    iget-object p0, p0, La/rti;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/ovi;

    .line 8
    .line 9
    iget-object v1, p0, La/ovi;->a:La/xzp;

    .line 10
    .line 11
    iget-object v1, v1, La/xzp;->b:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v2, v1

    .line 14
    check-cast v2, La/ctf0;

    .line 15
    .line 16
    invoke-static {v2}, La/x1x;->y(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    new-instance v3, La/bsc;

    .line 20
    .line 21
    new-instance v1, La/z220;

    .line 22
    .line 23
    new-instance v4, La/afm0;

    .line 24
    .line 25
    iget-object v5, p0, La/ovi;->a:La/xzp;

    .line 26
    .line 27
    iget-object v6, v5, La/xzp;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v6, La/gii0;

    .line 30
    .line 31
    invoke-static {v6}, La/x1x;->y(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const/4 v7, 0x3

    .line 35
    invoke-direct {v4, v6, v7}, La/afm0;-><init>(La/gii0;B)V

    .line 36
    .line 37
    .line 38
    iget-object v6, v5, La/xzp;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v6, La/knf0;

    .line 41
    .line 42
    invoke-static {v6}, La/x1x;->y(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object v7, v5, La/xzp;->e:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v7, La/yvn0;

    .line 48
    .line 49
    invoke-static {v7}, La/x1x;->y(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v8, v5, La/xzp;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v8, La/mne;

    .line 55
    .line 56
    invoke-direct {v1, v4, v6, v7, v8}, La/z220;-><init>(La/afm0;La/knf0;La/yvn0;La/mne;)V

    .line 57
    .line 58
    .line 59
    invoke-direct {v3, v1}, La/bsc;-><init>(La/z220;)V

    .line 60
    .line 61
    .line 62
    iget-object v1, v5, La/xzp;->a:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v4, v1

    .line 65
    check-cast v4, La/mne;

    .line 66
    .line 67
    iget-object v1, v5, La/xzp;->f:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, La/s31;

    .line 70
    .line 71
    iget-object v5, v5, La/xzp;->g:Ljava/lang/Object;

    .line 72
    .line 73
    move-object v6, v5

    .line 74
    check-cast v6, La/e41;

    .line 75
    .line 76
    iget-object v7, p0, La/ovi;->b:Lorg/xplatform/swipex/impl/presentation/dialogs/confirmation/models/SwipeActionConfirmationParams;

    .line 77
    .line 78
    move-object v5, v1

    .line 79
    move-object v1, p1

    .line 80
    invoke-direct/range {v0 .. v7}, La/qon0;-><init>(La/vzg0;La/ctf0;La/bsc;La/mne;La/s31;La/e41;Lorg/xplatform/swipex/impl/presentation/dialogs/confirmation/models/SwipeActionConfirmationParams;)V

    .line 81
    .line 82
    .line 83
    return-object v0
.end method
