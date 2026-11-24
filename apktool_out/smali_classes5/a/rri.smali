.class public final La/rri;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pdf0;

.field public final b:La/cad;

.field public final c:La/ctf0;

.field public final d:La/n5d0;


# direct methods
.method public constructor <init>(La/pdf0;La/cad;La/ctf0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/rri;->a:La/pdf0;

    .line 5
    .line 6
    iput-object p2, p0, La/rri;->b:La/cad;

    .line 7
    .line 8
    iput-object p3, p0, La/rri;->c:La/ctf0;

    .line 9
    .line 10
    new-instance p1, La/fri;

    .line 11
    .line 12
    const/4 p2, 0x6

    .line 13
    invoke-direct {p1, p0, p2}, La/fri;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, La/rri;->d:La/n5d0;

    .line 21
    .line 22
    return-void
.end method
