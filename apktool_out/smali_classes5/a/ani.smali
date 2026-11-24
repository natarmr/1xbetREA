.class public final La/ani;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/v480;

.field public final b:La/cad;

.field public final c:La/ozi;

.field public final d:La/n5d0;


# direct methods
.method public constructor <init>(La/cad;La/ozi;La/v480;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, La/ani;->a:La/v480;

    .line 5
    .line 6
    iput-object p1, p0, La/ani;->b:La/cad;

    .line 7
    .line 8
    iput-object p2, p0, La/ani;->c:La/ozi;

    .line 9
    .line 10
    new-instance p1, La/rki;

    .line 11
    .line 12
    const/16 p2, 0x1d

    .line 13
    .line 14
    invoke-direct {p1, p0, p2}, La/rki;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, La/ani;->d:La/n5d0;

    .line 22
    .line 23
    return-void
.end method
