.class public final La/pci;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/mne;

.field public final b:La/m1e;

.field public final c:La/gr70;

.field public final d:La/pai;


# direct methods
.method public constructor <init>(La/gr70;La/mne;La/m1e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/pci;->a:La/mne;

    .line 5
    .line 6
    iput-object p3, p0, La/pci;->b:La/m1e;

    .line 7
    .line 8
    iput-object p1, p0, La/pci;->c:La/gr70;

    .line 9
    .line 10
    new-instance p1, La/pai;

    .line 11
    .line 12
    const/16 p2, 0x15

    .line 13
    .line 14
    invoke-direct {p1, p0, p2}, La/pai;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/pci;->d:La/pai;

    .line 18
    .line 19
    return-void
.end method
